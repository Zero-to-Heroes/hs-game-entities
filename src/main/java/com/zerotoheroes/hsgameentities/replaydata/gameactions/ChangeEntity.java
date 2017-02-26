package com.zerotoheroes.hsgameentities.replaydata.gameactions;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.zerotoheroes.hsgameentities.replaydata.GameData;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@ToString
public class ChangeEntity extends GameData {

	@XmlAttribute(name = "cardID")
	private String cardId;

	@XmlAttribute(name = "entity")
	private int entity;

	@XmlElement(name = "Tag")
	private List<Tag> tags = new ArrayList<>();

	public ChangeEntity(String timestamp, String cardId, int entity, List<Tag> tags) {
		super(timestamp);
		this.cardId = cardId;
		this.entity = entity;
		this.tags = tags;
	}
}
