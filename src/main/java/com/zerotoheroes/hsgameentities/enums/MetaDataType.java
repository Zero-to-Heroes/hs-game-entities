package com.zerotoheroes.hsgameentities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Getter
@AllArgsConstructor
@Slf4j
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
	HISTORY_TARGET(7),
	OVERRIDE_HISTORY(8),
	HISTORY_TARGET_DONT_DUPLICATE_UNTIL_END(9),
	BEGIN_ARTIFICIAL_HISTORY_TILE(10),
	BEGIN_ARTIFICIAL_HISTORY_TRIGGER_TILE(11),
	END_ARTIFICIAL_HISTORY_TILE(12),
	START_DRAW(13),
	BURNED_CARD(14),
	EFFECT_SELECTION(15),
	BEGIN_LISTENING_FOR_TURN_EVENTS(16),
	HOLD_DRAWN_CARD(17),
	CONTROLLER_AND_ZONE_CHANGE(18),
	ARTIFICIAL_PAUSE_STUBBED_FOR_14_2(19),

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

		int returnValue = -1;
		try {
			returnValue = MetaDataType.valueOf(tag).getIntValue();
		}
		catch (Exception e) {
			log.error("Unkown MetaDataType: " + tag, e);
		}
		return returnValue;
	}

}
