package com.zerotoheroes.hsgameentities.replaydata.meta;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zerotoheroes.hsgameentities.replaydata.GameData;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@XmlRootElement(name = "Choices")
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@ToString
public class Choices extends GameData {

	@XmlAttribute(name = "entity")
	private int entity;

	@XmlAttribute(name = "max")
	private int max;

	@XmlAttribute(name = "min")
	private int min;

	@XmlAttribute(name = "playerID")
	private int playerId;

	@XmlAttribute(name = "source")
	private int source;

	@XmlAttribute(name = "taskList")
	private int taskList;

	@XmlAttribute(name = "type")
	private int type;

	@XmlElement(name = "Choice")
	private List<Choice> choiceList = new ArrayList<>();

}
