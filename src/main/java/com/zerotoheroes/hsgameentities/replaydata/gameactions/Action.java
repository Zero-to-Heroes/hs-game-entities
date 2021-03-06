package com.zerotoheroes.hsgameentities.replaydata.gameactions;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;

import com.zerotoheroes.hsgameentities.replaydata.GameData;
import com.zerotoheroes.hsgameentities.replaydata.entities.FullEntity;
import com.zerotoheroes.hsgameentities.replaydata.entities.GameEntity;
import com.zerotoheroes.hsgameentities.replaydata.entities.PlayerEntity;
import com.zerotoheroes.hsgameentities.replaydata.meta.Choices;
import com.zerotoheroes.hsgameentities.replaydata.meta.MetaData;
import com.zerotoheroes.hsgameentities.replaydata.meta.SendChoices;
import com.zerotoheroes.hsgameentities.replaydata.meta.options.Options;
import com.zerotoheroes.hsgameentities.replaydata.meta.options.SendOption;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@ToString
public class Action extends GameAction {

	@XmlAttribute(name = "index")
	private int index = -1;

	// @XmlAttribute(name = "effectId")
	// private int effectId = -1;

	@XmlAttribute(name = "effectIndex")
	private int effectIndex = -1;

	@XmlAttribute(name = "target")
	private int target = 0;

	@XmlAttribute(name = "type")
	private int type;

	@XmlAttribute(name = "subOption")
	private int subOption = -1;

	@XmlAttribute(name = "triggerKeyword")
	private int triggerKeyword = -1;

	//@formatter:off
	@XmlElements({
			@XmlElement(name = "Block", type = Action.class),
			@XmlElement(name = "Choices", type = Choices.class),
			@XmlElement(name = "FullEntity", type = FullEntity.class),
			@XmlElement(name = "GameEntity", type = GameEntity.class),
			@XmlElement(name = "ShowEntity", type = ShowEntity.class),
			@XmlElement(name = "ChangeEntity", type = ChangeEntity.class),
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

	@Builder
	public Action(int index, int target, int type, List<GameData> data, int entity, int effectIndex,
			String timestamp, int subOption, int triggerKeyword) {

		super();
		this.index = index;
		this.target = target;
		this.type = type;
		this.data = data;
		this.entity = entity;
		this.timestamp = timestamp;
		this.subOption = subOption;
		this.triggerKeyword = triggerKeyword;
	}

}
