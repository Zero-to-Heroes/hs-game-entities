package com.zerotoheroes.hsgameentities.replaydata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.zerotoheroes.hsgameentities.replaydata.entities.BaseEntity;
import com.zerotoheroes.hsgameentities.replaydata.entities.FullEntity;
import com.zerotoheroes.hsgameentities.replaydata.entities.PlayerEntity;
import com.zerotoheroes.hsgameentities.replaydata.gameactions.Action;

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
		flatData.addAll(game.getData());
		for (GameData data : game.getData()) {
			extractData(data);
		}
	}

	private void extractData(GameData data) {
		if (data instanceof Action) {
			flatData.addAll(((Action) data).getData());
			for (GameData gameData : ((Action) data).getData()) {
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

	@SuppressWarnings("unchecked")
	public <T extends GameData> List<T> filterGameData(Class... specificClasses) {
		return (List<T>) flatData.stream().filter(e -> Arrays.asList(specificClasses).contains(e.getClass()))
				.collect(Collectors.toList());
	}

	public List<PlayerEntity> getPlayers() {
		return flatData.stream().filter(d -> (d instanceof PlayerEntity)).map(p -> (PlayerEntity) p)
				.collect(Collectors.toList());
	}

}
