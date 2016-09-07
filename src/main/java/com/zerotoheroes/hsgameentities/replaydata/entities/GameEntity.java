package com.zerotoheroes.hsgameentities.replaydata.entities;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.zerotoheroes.hsgameentities.replaydata.gameactions.Tag;

import lombok.NoArgsConstructor;
import lombok.ToString;

@XmlRootElement(name = "GameEntity")
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@ToString
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class GameEntity extends BaseEntity {

	public GameEntity(int id, List<Tag> tags) {
		super(id, tags);
	}

}
