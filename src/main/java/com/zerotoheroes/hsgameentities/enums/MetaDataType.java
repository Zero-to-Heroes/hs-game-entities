package com.zerotoheroes.hsgameentities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
// https://github.com/HearthSim/HearthDb
// https://github.com/HearthSim/python-hearthstone/blob/82ead4d29a53be345897e7f6b405eaf261acc4e2/hearthstone/enums.py
public enum MetaDataType {

	//@formatter:off
	// From HistoryMeta.Type
    TARGET(0),
    DAMAGE(1),
    HEALING(2),
    JOUST(3),

    CLIENT_HISTORY(4),
	SHOW_BIG_CARD(5),
	EFFECT_TIMING(6),

    // Renamed in 9786 from PowerHistoryMetaData.Type
    META_TARGET(TARGET.getIntValue()),
    META_DAMAGE(DAMAGE.getIntValue()),
    META_HEALING(HEALING.getIntValue());
	//@formatter:on

	private int intValue;

	public static int parseEnum(String tag) {
		try {
			int value = Integer.parseInt(tag);
			return value;
		}
		catch (Exception e) {
		}

		return MetaDataType.valueOf(tag).getIntValue();
	}

}