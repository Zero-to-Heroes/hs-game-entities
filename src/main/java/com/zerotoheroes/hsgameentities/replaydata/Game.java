package com.zerotoheroes.hsgameentities.replaydata;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;

import com.zerotoheroes.hsgameentities.replaydata.entities.FullEntity;
import com.zerotoheroes.hsgameentities.replaydata.entities.GameEntity;
import com.zerotoheroes.hsgameentities.replaydata.entities.PlayerEntity;
import com.zerotoheroes.hsgameentities.replaydata.gameactions.Action;
import com.zerotoheroes.hsgameentities.replaydata.gameactions.ChosenEntities;
import com.zerotoheroes.hsgameentities.replaydata.gameactions.HideEntity;
import com.zerotoheroes.hsgameentities.replaydata.gameactions.ShowEntity;
import com.zerotoheroes.hsgameentities.replaydata.gameactions.TagChange;
import com.zerotoheroes.hsgameentities.replaydata.meta.Choices;
import com.zerotoheroes.hsgameentities.replaydata.meta.MetaData;
import com.zerotoheroes.hsgameentities.replaydata.meta.SendChoices;
import com.zerotoheroes.hsgameentities.replaydata.meta.options.Options;
import com.zerotoheroes.hsgameentities.replaydata.meta.options.SendOption;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@ToString
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class Game {

	@XmlAttribute(name = "ts")
	private String timestamp;

	@XmlAttribute(name = "type")
	private int type;

	//@formatter:off
	@XmlElements({
			@XmlElement(name = "Block", type = Action.class),
			@XmlElement(name = "Choices", type = Choices.class),
			@XmlElement(name = "FullEntity", type = FullEntity.class),
			@XmlElement(name = "GameEntity", type = GameEntity.class),
			@XmlElement(name = "ShowEntity", type = ShowEntity.class),
			@XmlElement(name = "HideEntity", type = HideEntity.class),
			@XmlElement(name = "Options", type = Options.class),
			@XmlElement(name = "Player", type = PlayerEntity.class),
			@XmlElement(name = "SendChoices", type = SendChoices.class),
			@XmlElement(name = "SendOption", type = SendOption.class),
			@XmlElement(name = "TagChange", type = TagChange.class),
			@XmlElement(name = "MetaData", type = MetaData.class),
			@XmlElement(name = "ChosenEntities", type = ChosenEntities.class)
	})
	//@formatter:on
	private List<GameData> data = new ArrayList<>();
}
