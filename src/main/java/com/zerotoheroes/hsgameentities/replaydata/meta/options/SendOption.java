package com.zerotoheroes.hsgameentities.replaydata.meta.options;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

import com.zerotoheroes.hsgameentities.replaydata.GameData;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@ToString
public class SendOption extends GameData {

	@XmlAttribute(name = "option")
	private int optionIndex;

	@XmlAttribute(name = "position")
	private int position;

	@XmlAttribute(name = "suboption")
	private int subOption = -1;

	@XmlAttribute(name = "target")
	private int target;
}
