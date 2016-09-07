package com.zerotoheroes.hsgameentities.replaydata.gameactions;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

import com.zerotoheroes.hsgameentities.replaydata.GameData;

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
public class HideEntity extends GameData {

	@XmlAttribute(name = "entity")
	private int entity;

	@XmlAttribute(name = "zone")
	private int zone;

	public HideEntity(String timestamp, int entity, int zone) {
		super(timestamp);
		this.entity = entity;
		this.zone = zone;
	}

}
