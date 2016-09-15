package com.zerotoheroes.hsgameentities.replaydata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;

import com.zerotoheroes.hsgameentities.enums.CardType;
import com.zerotoheroes.hsgameentities.enums.GameTag;
import com.zerotoheroes.hsgameentities.replaydata.entities.BaseEntity;
import com.zerotoheroes.hsgameentities.replaydata.entities.FullEntity;
import com.zerotoheroes.hsgameentities.replaydata.entities.PlayerEntity;
import com.zerotoheroes.hsgameentities.replaydata.gameactions.Action;
import com.zerotoheroes.hsgameentities.replaydata.gameactions.ShowEntity;
import com.zerotoheroes.hsgameentities.replaydata.gameactions.Tag;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class GameHelper {

	private Game game;

	private List<GameData> flatData = new ArrayList<>();

	public void setGame(Game game) {
		this.game = game;
		buildFullEntityList();
		log.debug("Flattened " + flatData.size() + " data entities");
	}

	private void buildFullEntityList() {
		// flatData.addAll(game.getData());
		// Keep the chronological ordering
		for (GameData data : game.getData()) {
			flatData.add(data);
			extractData(data);
		}
	}

	private void extractData(GameData data) {
		if (data instanceof Action) {
			// flatData.addAll(((Action) data).getData());
			for (GameData gameData : ((Action) data).getData()) {
				flatData.add(gameData);
				extractData(gameData);
			}
		}
	}

	public BaseEntity getEntity(int id) {
		// The Full Entities
		List<? extends BaseEntity> entities = filterGameData(FullEntity.class, PlayerEntity.class);
		BaseEntity entity = null;
		Optional<? extends BaseEntity> optional = entities.stream().filter(e -> e.getId() == id).findFirst();
		if (optional.isPresent()) {
			entity = optional.get();
		}

		return entity;
	}

	public <T extends GameData> List<T> filterGameData(Class... specificClasses) {
		return (List<T>) flatData.stream().filter(e -> Arrays.asList(specificClasses).contains(e.getClass()))
				.collect(Collectors.toList());
	}

	public List<PlayerEntity> getPlayers() {
		return flatData.stream().filter(d -> (d instanceof PlayerEntity)).map(p -> (PlayerEntity) p)
				.collect(Collectors.toList());
	}

	public PlayerEntity getMainPlayer() {
		// Since patch 5.2.0.13619, the first showEntity with a cardID (and that
		// is not an enchantment, cf tavern brawl conditions) always comes from
		// the current player
		List<ShowEntity> showEntities = filterGameData(ShowEntity.class);
		for (ShowEntity entity : showEntities) {
			if (StringUtils.isNotEmpty(entity.getCardId())
					&& getTag(entity.getTags(), GameTag.CARDTYPE) != CardType.ENCHANTMENT.getIntValue()) {
				int entityId = entity.getEntity();
				// The full entity
				BaseEntity fullEntity = getEntity(entityId);
				// Now check the CONTROLLER tag
				int controllerId = getTag(fullEntity.getTags(), GameTag.CONTROLLER);
				for (PlayerEntity player : getPlayers()) {
					if (getTag(player.getTags(), GameTag.CONTROLLER) == controllerId) { return player; }
				}
			}
		}
		return null;
	}

	private int getTag(List<Tag> tags, GameTag tag) {
		Tag ret = tags.stream().filter(t -> t.getName() == tag.getIntValue()).findFirst().orElse(null);
		return ret == null ? -1 : ret.getValue();
	}

}
