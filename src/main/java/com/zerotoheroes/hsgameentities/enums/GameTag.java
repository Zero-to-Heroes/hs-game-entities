package com.zerotoheroes.hsgameentities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum GameTag {

	// https://github.com/HearthSim/python-hearthstone/blob/master/hearthstone/enums.py
	IGNORE_DAMAGE(1),
	TAG_SCRIPT_DATA_NUM_1(2),
	TAG_SCRIPT_DATA_NUM_2(3),
	TAG_SCRIPT_DATA_ENT_1(4),
	TAG_SCRIPT_DATA_ENT_2(5),
	MISSION_EVENT(6),
	TIMEOUT(7),
	TURN_START(8),
	TURN_TIMER_SLUSH(9),
	PREMIUM(12),
	GOLD_REWARD_STATE(13),
	PLAYSTATE(17),
	LAST_AFFECTED_BY(18),
	STEP(19),
	TURN(20),
	FATIGUE(22),
	CURRENT_PLAYER(23),
	FIRST_PLAYER(24),
	RESOURCES_USED(25),
	RESOURCES(26),
	HERO_ENTITY(27),
	MAXHANDSIZE(28),
	STARTHANDSIZE(29),
	PLAYER_ID(30),
	TEAM_ID(31),
	TRIGGER_VISUAL(32),
	RECENTLY_ARRIVED(33),
	PROTECTED(34),
	PROTECTING(35),
	DEFENDING(36),
	PROPOSED_DEFENDER(37),
	ATTACKING(38),
	PROPOSED_ATTACKER(39),
	ATTACHED(40),
	EXHAUSTED(43),
	DAMAGE(44),
	HEALTH(45),
	ATK(47),
	COST(48),
	ZONE(49),
	CONTROLLER(50),
	OWNER(51),
	DEFINITION(52),
	ENTITY_ID(53),
	HISTORY_PROXY(54),
//	COPY_DEATHRATTLE(55),
	ELITE(114),
	MAXRESOURCES(176),
	CARD_SET(183),
	CARDTEXT(184),
//	CARD_ID(186),
	DURABILITY(187),
	SILENCED(188),
	WINDFURY(189),
	TAUNT(190),
	STEALTH(191),
	SPELLPOWER(192),
	DIVINE_SHIELD(194),
	CHARGE(197),
	NEXT_STEP(198),
	CLASS(199),
	CARDRACE(200),
	FACTION(201),
	CARDTYPE(202),
	RARITY(203),
	STATE(204),
	SUMMONED(205),
	FREEZE(208),
	ENRAGED(212),
	OVERLOAD(215),
	LOYALTY(216),
	DEATHRATTLE(217),
	BATTLECRY(218),

	SECRET(219),
	COMBO(220),
	CANT_HEAL(221),
	CANT_DAMAGE(222),
	CANT_SET_ASIDE(223),
	CANT_REMOVE_FROM_GAME(224),
	CANT_READY(225),
//	CANT_EXHAUST(226),
	CANT_ATTACK(227),
//	CANT_TARGET(228),
//	CANT_DESTROY(229),
	CANT_DISCARD(230),
	CANT_PLAY(231),
	CANT_DRAW(232),
	INCOMING_HEALING_MULTIPLIER(233),
	INCOMING_HEALING_ADJUSTMENT(234),
	INCOMING_HEALING_CAP(235),
	INCOMING_DAMAGE_MULTIPLIER(236),
	INCOMING_DAMAGE_ADJUSTMENT(237),
	INCOMING_DAMAGE_CAP(238),
	CANT_BE_HEALED(239),
	IMMUNE(240),
	CANT_BE_SET_ASIDE(241),
	CANT_BE_REMOVED_FROM_GAME(242),
	CANT_BE_READIED(243),
//	CANT_BE_EXHAUSTED(244),
	CANT_BE_ATTACKED(245),
	CANT_BE_TARGETED(246),
	CANT_BE_DESTROYED(247),
	CANT_BE_SUMMONING_SICK(253),
	FROZEN(260),
	JUST_PLAYED(261),
	LINKED_ENTITY(262),
	ZONE_POSITION(263),
	CANT_BE_FROZEN(264),
	COMBO_ACTIVE(266),
	CARD_TARGET(267),
	NUM_CARDS_PLAYED_THIS_TURN(269),
	CANT_BE_TARGETED_BY_OPPONENTS(270),
	NUM_TURNS_IN_PLAY(271),
//	NUM_TURNS_LEFT(272),
//	OUTGOING_DAMAGE_CAP(273),
//	OUTGOING_DAMAGE_ADJUSTMENT(274),
//	OUTGOING_DAMAGE_MULTIPLIER(275),
//	OUTGOING_HEALING_CAP(276),
//	OUTGOING_HEALING_ADJUSTMENT(277),
//	OUTGOING_HEALING_MULTIPLIER(278),
//	INCOMING_ABILITY_DAMAGE_ADJUSTMENT(279),
//	INCOMING_COMBAT_DAMAGE_ADJUSTMENT(280),
//	OUTGOING_ABILITY_DAMAGE_ADJUSTMENT(281),
//	OUTGOING_COMBAT_DAMAGE_ADJUSTMENT(282),
//	OUTGOING_ABILITY_DAMAGE_MULTIPLIER(283),
//	OUTGOING_ABILITY_DAMAGE_CAP(284),
//	INCOMING_ABILITY_DAMAGE_MULTIPLIER(285),
//	INCOMING_ABILITY_DAMAGE_CAP(286),
//	OUTGOING_COMBAT_DAMAGE_MULTIPLIER(287),
//	OUTGOING_COMBAT_DAMAGE_CAP(288),
//	INCOMING_COMBAT_DAMAGE_MULTIPLIER(289),
//	INCOMING_COMBAT_DAMAGE_CAP(290),
	NUM_TURNS_LEFT(272),
	CURRENT_SPELLPOWER(291),
	ARMOR(292),
	MORPH(293),
	IS_MORPHED(294),
	TEMP_RESOURCES(295),
	OVERLOAD_OWED(296),
	NUM_ATTACKS_THIS_TURN(297),
	NEXT_ALLY_BUFF(302),
	MAGNET(303),
	FIRST_CARD_PLAYED_THIS_TURN(304),
	MULLIGAN_STATE(305),
	TAUNT_READY(306),
	STEALTH_READY(307),
	CHARGE_READY(308),
	CANT_BE_TARGETED_BY_SPELLS(311),
	SHOULDEXITCOMBAT(312),
	CREATOR(313),
	CANT_BE_SILENCED(314),
	PARENT_CARD(316),
	NUM_MINIONS_PLAYED_THIS_TURN(317),
	PREDAMAGE(318),
	COLLECTIBLE(321),
	HEALING_DOES_DAMAGE(326),
	DATABASE_ID(327),
	ENCHANTMENT_BIRTH_VISUAL(330),
	ENCHANTMENT_IDLE_VISUAL(331),
	CANT_BE_TARGETED_BY_HERO_POWERS(332),
	HEALTH_MINIMUM(337),
	TAG_ONE_TURN_EFFECT(338),
	SILENCE(339),
	COUNTER(340),
	HAND_REVEALED(348),
	ADJACENT_BUFF(350),
	FORCED_PLAY(352),
	LOW_HEALTH_THRESHOLD(353),
	IGNORE_DAMAGE_OFF(354),
	SPELLPOWER_DOUBLE(356),
	SPELL_HEALING_DOUBLE(357),
	HEALING_DOUBLE(357),
	NUM_OPTIONS_PLAYED_THIS_TURN(358),
	TO_BE_DESTROYED(360),
	AURA(362),
	POISONOUS(363),
	HERO_POWER_DOUBLE(366),
	AI_MUST_PLAY(367),
	NUM_MINIONS_PLAYER_KILLED_THIS_TURN(368),
	NUM_MINIONS_KILLED_THIS_TURN(369),
	AFFECTED_BY_SPELL_POWER(370),
	EXTRA_DEATHRATTLES(371),
	EXTRA_MINION_DEATHRATTLES_BASE(371),
	START_WITH_1_HEALTH(372),
	IMMUNE_WHILE_ATTACKING(373),
	MULTIPLY_HERO_DAMAGE(374),
	MULTIPLY_BUFF_VALUE(375),
	CUSTOM_KEYWORD_EFFECT(376),
	TOPDECK(377),
	CANT_BE_TARGETED_BY_BATTLECRIES(379),
	HERO_POWER(380),
	DEATHRATTLE_RETURN_ZONE(382),
	STEADY_SHOT_CAN_TARGET(383),
	DISPLAYED_CREATOR(385),
	POWERED_UP(386),
	SPARE_PART(388),
	FORGETFUL(389),
	CAN_SUMMON_MAXPLUSONE_MINION(390),
	OBFUSCATED(391),
	BURNING(392),
	OVERLOAD_LOCKED(393),
	NUM_TIMES_HERO_POWER_USED_THIS_GAME(394),
	CURRENT_HEROPOWER_DAMAGE_BONUS(395),
	HEROPOWER_DAMAGE(396),
	LAST_CARD_PLAYED(397),
	NUM_FRIENDLY_MINIONS_THAT_DIED_THIS_TURN(398),
	NUM_CARDS_DRAWN_THIS_TURN(399),
	AI_ONE_SHOT_KILL(400),
	EVIL_GLOW(401),
	HIDE_STATS(402),
	INSPIRE(403),
	RECEIVES_DOUBLE_SPELLDAMAGE_BONUS(404),
	HEROPOWER_ADDITIONAL_ACTIVATIONS(405),
	HEROPOWER_ACTIVATIONS_THIS_TURN(406),
	REVEALED(410),
	EXTRA_BATTLECRIES_BASE(411),
	NUM_FRIENDLY_MINIONS_THAT_DIED_THIS_GAME(412),
	CANNOT_ATTACK_HEROES(413),
	LOCK_AND_LOAD(414),
	DISCOVER(415),
	SHADOWFORM(416),
	NUM_FRIENDLY_MINIONS_THAT_ATTACKED_THIS_TURN(417),
	NUM_RESOURCES_SPENT_THIS_GAME(418),
	CHOOSE_BOTH(419),
	ELECTRIC_CHARGE_LEVEL(420),
	HEAVILY_ARMORED(421),
	DONT_SHOW_IMMUNE(422),
	RITUAL(424),
	PREHEALING(425),
	APPEAR_FUNCTIONALLY_DEAD(426),
	OVERLOAD_THIS_GAME(427),
	SPELLS_COST_HEALTH(431),
	HISTORY_PROXY_NO_BIG_CARD(432),
	PROXY_CTHUN(434),
	TRANSFORMED_FROM_CARD(435),
	CTHUN(436),
	CAST_RANDOM_SPELLS(437),
	SHIFTING(438),
	JADE_GOLEM(441),
	EMBRACE_THE_SHADOW(442),
	CHOOSE_ONE(443),
	EXTRA_ATTACKS_THIS_TURN(444),
	SEEN_CTHUN(445),
	MINION_TYPE_REFERENCE(447),
	UNTOUCHABLE(448),
	RED_MANA_CRYSTALS(449),
	SCORE_LABELID_1(450),
	SCORE_VALUE_1(451),
	SCORE_LABELID_2(452),
	SCORE_VALUE_2(453),
	SCORE_LABELID_3(454),
	SCORE_VALUE_3(455),
	CANT_BE_FATIGUED(456),
	AUTOATTACK(457),
	ARMS_DEALING(458),
	PENDING_EVOLUTIONS(461),
	QUEST(462),
	TAG_LAST_KNOWN_COST_IN_HAND(466),
	DEFINING_ENCHANTMENT(469),
	FINISH_ATTACK_SPELL_ON_DAMAGE(470),
	MODULAR_ENTITY_PART_1(471),
	MODULAR_ENTITY_PART_2(472),
	MODIFY_DEFINITION_ATTACK(473),
	MODIFY_DEFINITION_HEALTH(474),
	MODIFY_DEFINITION_COST(475),
	MULTIPLE_CLASSES(476),
	ALL_TARGETS_RANDOM(477),
	MULTI_CLASS_GROUP(480),
	CARD_COSTS_HEALTH(481),
	GRIMY_GOONS(482),
	JADE_LOTUS(483),
	KABAL(484),
	ADDITIONAL_PLAY_REQS_1(515),
	ADDITIONAL_PLAY_REQS_2(516),
	ELEMENTAL_POWERED_UP(532),
	 QUEST_PROGRESS(534),
	 QUEST_PROGRESS_TOTAL(535),
	 QUEST_CONTRIBUTOR(541),
	 ADAPT(546),
	 IS_CURRENT_TURN_AN_EXTRA_TURN(547),
	 EXTRA_TURNS_TAKEN_THIS_GAME(548),
	 SHIFTING_MINION(549),
	 SHIFTING_WEAPON(550),
	 DEATH_KNIGHT(554),
	 BOSS(556),
	 TREASURE(557),
	 TREASURE_DEFINTIONAL_ATTACK(558),
	 TREASURE_DEFINTIONAL_COST(559),
	 TREASURE_DEFINTIONAL_HEALTH(560),
	 ACTS_LIKE_A_SPELL(561),
	 STAMPEDE(564),
	 EMPOWERED_TREASURE(646),
	 ONE_SIDED_GHOSTLY(648),
	 CURRENT_NEGATIVE_SPELLPOWER(651),
	 IS_VAMPIRE(680),
	 CORRUPTED(681),
	 HIDE_HEALTH(682),
	 HIDE_ATTACK(683),
	 HIDE_COST(684),
	 LIFESTEAL(685),
	 OVERRIDE_EMOTE_0(740),
	 OVERRIDE_EMOTE_1(741),
	 OVERRIDE_EMOTE_2(742),
	 OVERRIDE_EMOTE_3(743),
	 OVERRIDE_EMOTE_4(744),
	 OVERRIDE_EMOTE_5(745),
	 SCORE_FOOTERID(751),
	 RECRUIT(763),
	 LOOT_CARD_1(764),
	 LOOT_CARD_2(765),
	 LOOT_CARD_3(766),
	 HERO_POWER_DISABLED(777),
	 VALEERASHADOW(779),
	 OVERRIDECARDNAME(781),
	 OVERRIDECARDTEXTBUILDER(782),
	 DUNGEON_PASSIVE_BUFF(783),
	 GHOSTLY(785),
	 DISGUISED_TWIN(788),
	 SECRET_DEATHRATTLE(789),
	 RUSH(791),
	 REVEAL_CHOICES(792),
	HERO_DECK_ID(793),
	 HIDDEN_CHOICE(813),
	 ZOMBEAST(823),
	 MINION_IN_HAND_BUFF(845),
	 ECHO(846),
	MODULAR(849),
	 IGNORE_HIDE_STATS_FOR_BIG_CARD(857),
	 REAL_TIME_TRANSFORM(859),
	 WAIT_FOR_PLAYER_RECONNECT_PERIOD(860),
	ETHEREAL(880),
	EXTRA_DEATHRATTLES_BASE(882),
	 PHASED_RESTART(888),
	DISCARD_CARDS(890),
     HEALTH_DISPLAY(917),
     ENABLE_HEALTH_DISPLAY(920),
	 VOODOO_LINK(921),
	OVERKILL(923),
	PROPHECY(924),
	 ATTACKABLE_BY_RUSH(930),
     SHIFTING_SPELL(936),
     USE_ALTERNATE_CARD_TEXT(955),
	AMOUNT_HEALED_THIS_GAME(958),
	 SUPPRESS_DEATH_SOUND(959),
	 ECHOING_OOZE_SPELL(963),
	 ZOMBEAST_DEBUG_CURRENT_BEAST_DATABASE_ID(964),
	 COLLECTIONMANAGER_FILTER_MANA_EVEN(956),
	 COLLECTIONMANAGER_FILTER_MANA_ODD(957),
	 ZOMBEAST_DEBUG_CURRENT_ITERATION(965),
	 ZOMBEAST_DEBUG_MAX_ITERATIONS(966),
	 START_OF_GAME(968),
	 ENCHANTMENT_INVISIBLE(976),
	PUZZLE(979),
	PUZZLE_PROGRESS(980),
	PUZZLE_PROGRESS_TOTAL(981),
	PUZZLE_TYPE(982),
	PUZZLE_COMPLETED(984),
	CONCEDE_BUTTON_ALTERNATIVE_TEXT(985),
	HIDE_RESTART_BUTTON(990),
	WILD(991),
	HALL_OF_FAME(992),
	MARK_OF_EVIL(994),
	EVILZUG(994),
	DECK_RULE_MOD_DECK_SIZE(997),
	FAST_BATTLECRY(998),
	END_TURN_BUTTON_ALTERNATIVE_APPEARANCE(1000),
	WEATHER(1002),
	WEATHERSNOWSTORM(1012),
	WEATHERTHUNDERSTORM(1013),
	WEATHERFIRESTORM(1014),
	WAND(1015),
	TREAT_AS_PLAYED_HERO_CARD(1016),
	NUM_HERO_POWER_DAMAGE_THIS_GAME(1025),
	PUZZLE_NAME(1026),
	TURN_INDICATOR_ALTERNATIVE_APPEARANCE(1027),
	PREVIOUS_PUZZLE_COMPLETED(1042),
	GLORIOUSGLOOP(1044),
	HEALTH_DISPLAY_COLOR(1046),
	HEALTH_DISPLAY_NEGATIVE(1047),
	WHIZBANG_DECK_ID(1048),
	HIDE_OUT_OF_CARDS_WARNING(1050),
	GEARS(1052),
	LUNAHIGHLIGHTHINT(1054),
	SUPPRESS_JOBS_DONE_VO(1055),
	SHRINE(1057),
	ALL_HEALING_DOUBLE(1058),
	BLOCK_ALL_INPUT(1071),
	PUZZLE_MODE(1073),
	CARD_DOES_NOTHING(1075),
	CASTSWHENDRAWN(1077),
	DISPLAY_CARD_ON_MOUSEOVER(1078),
	DECK_POWER_UP(1080),
	SIDEKICK(1081),
	SIDEKICK_HERO_POWER(1082),
	REBORN(1085),
	SQUELCH_NON_GAME_TRIGGERS_AND_MODIFIERS(1087),
	QUEST_REWARD_DATABASE_ID(1089),
	DORMANT(1090),
	CUSTOMTEXT1(1093),
	CUSTOMTEXT2(1094),
	CUSTOMTEXT3(1095),
	FLOOPY(1097),
	PLAYER_BASE_SHRINE_DECK_ID(1099),
	HIDE_WATERMARK(1107),
	EXTRA_MINION_BATTLECRIES_BASE(1112),
	RUN_PROGRESS(1113),
	NON_KEYWORD_ECHO(1114),
	PLAYER_TAG_THRESHOLD_TAG_ID(1115),
	PLAYER_TAG_THRESHOLD_VALUE(1116),
	HEALING_DOES_DAMAGE_HINT(1117),
	AFFECTED_BY_HEALING_DOES_DAMAGE(1118),
	DECK_LIST_SORT_ORDER(1125),
	EXTRA_BATTLECRIES_ADDITIONAL(1126),
	EXTRA_DEATHRATTLES_ADDITIONAL(1131),
	ALTERNATE_MOUSE_OVER_CARD(1132),
	ENCHANTMENT_BANNER_TEXT(1135),
	EXTRA_SPELL_CASTS_BASE(1140),
	MOUSE_OVER_CARD_APPEARANCE(1142),
	IS_ADVENTURE_SCENARIO(1172),
	TWINSPELL_COPY(1186),
	PROXY_GALAKROND(1190),
	SIDEQUEST(1192),
	TWINSPELL(1193),
	GALAKROND_IN_PLAY(1194),
	COIN_MANA_GEM(1199),
	MEGA_WINDFURY(1207),
	EMPOWER(1263),
	EMPOWER_PRIEST(1264),
	EMPOWER_ROGUE(1265),
	EMPOWER_SHAMAN(1266),
	EMPOWER_WARLOCK(1267),
	EMPOWER_WARRIOR(1268),
	TWINSPELLPENDING(1269),
	EXTRA_OVERLOAD_SPELL_CASTS_BASE(1272),
	DRUSTVAR_HORROR_DEBUG_CURRENT_SPELL_DATABASE_ID(1280),
	DRUSTVAR_HORROR_DEBUG_CURRENT_ITERATION(1281),
	HEROIC_HERO_POWER(1282),
	DRUSTVAR_HORROR_DEBUG_MAX_ITERATIONS(1283),
	CREATOR_DBID(1284),
	FATIGUEREFERENCE(1290),
	HERO_FLYING(1293),
	UI_BUFF_HEALTH_UP(1294),
	UI_BUFF_SET_COST_ZERO(1295),
	UI_BUFF_COST_DOWN(1296),
	UI_BUFF_ATK_UP(1297),
	UI_BUFF_COST_UP(1298),
	DEBUG_DISPLAY_TAG_BOTTOM_RIGHT(1313),
	DEBUG_DISPLAY_TAG_TOP_RIGHT(1314),
	SMART_DISCOVER_DEBUG_ENTITY_1(1318),
	SMART_DISCOVER_DEBUG_ENTITY_2(1319),
	SMART_DISCOVER_DEBUG_ENTITY_3(1320),
	SMART_DISCOVER_DEBUG_TEST_COMPLETE(1324),
	COPIED_BY_KHADGAR(1326),
	SMART_DISCOVER_DEBUG_PASSIVE_EVAL_RESULT_1(1328),
	SMART_DISCOVER_DEBUG_PASSIVE_EVAL_RESULT_2(1329),
	SMART_DISCOVER_DEBUG_PASSIVE_EVAL_RESULT_3(1330),
	ALTERNATE_CHAPTER_VO(1334),
	AI_MAKES_DECISIONS_FOR_PLAYER(1335),
	HAS_BEEN_REBORN(1336),
	USE_DISCOVER_VISUALS(1342),
	DOUBLE_FATIGUE_DAMAGE(1346),
	BOARD_VISUAL_STATE(1347),
	EXTRA_SPELL_CASTS_ADDITIONAL(1348),
	BACON_DUMMY_PLAYER(1349),
	SQUELCH_LIFETIME_EFFECTS(1350),
	ALLOW_MOVE_MINION(1356),
	TAG_TB_RANDOM_DECK_TIME_ID(1358),
	NEXT_OPPONENT_PLAYER_ID(1360),
	MAIN_GALAKROND(1361),
	GOOD_OL_GENERIC_FRIENDLY_DRAGON_DISCOVER_VISUALS(1364),
	GALAKROND_HERO_CARD(1365),
	INVOKE_COUNTER(1366),
	PLAYER_LEADERBOARD_PLACE(1373),
	PLAYER_TECH_LEVEL(1377),
	BACON_USE_FAST_ANIMATIONS(1402),
	DECK_RULE_COUNT_AS_COPY_OF_CARD_ID(1413),
	BACON_ODD_PLAYER_OUT(1415),
	BACON_IS_KEL_THUZAD(1423),
	BACON_HIGHLIGHT_ATTACKING_MINION_DURING_COMBAT(1424),
	RULEBOOK(1430),
	FX_DATANUM_1(1436),
	BACON_ACTION_CARD(1437),
	GAME_MODE_BUTTON_SLOT(1438),
	TECH_LEVEL(1440),
	TECH_LEVEL_MANA_GEM(1442),
	UI_BUFF_DURABILITY_UP(1443),
	PLAYER_TRIPLES(1447),
	DISABLE_TURN_INDICATORS(1448),
	COLLECTION_RELATED_CARD_DATABASE_ID(1452),
	IS_BACON_POOL_MINION(1456),
	SUPPRESS_ALL_SUMMON_VO(1458),
	BACON_TRIPLE_CANDIDATE(1460),
	BATTLEGROUNDS_PREMIUM_EMOTES(1463),
	MOVE_MINION_HOVER_TARGET_SLOT(1464),
	BACON_COIN_ON_ENEMY_MINIONS(1467),
	ALWAYS_USE_FAST_ACTOR_TRIGGERS(1473),
	BACON_HERO_CAN_BE_DRAFTED(1491),

	// Only in card definitions
//	Collectible(321),
	InvisibleDeathrattle(335),
	OneTurnEffect(338),
	ImmuneToSpellpower(349),
	AttackVisualType(251),
	DevState(268),
	GrantCharge(355),
	HealTarget(361),

	// strings
	CARDTEXT_INHAND(CARDTEXT.getIntValue()),
	CARDNAME(185),
	CardTextInPlay(252),
	TARGETING_ARROW_TEXT(325),
	ARTISTNAME(342),
	LocalizationNotes(344),
	FLAVORTEXT(351),
	HOW_TO_EARN(364),
	HOW_TO_EARN_GOLDEN(365),

	// Renamed
	CANT_BE_DAMAGED(IMMUNE.getIntValue()),
	CANT_BE_DISPELLED(CANT_BE_SILENCED.getIntValue()),
	CANT_BE_TARGETED_BY_ABILITIES(CANT_BE_TARGETED_BY_SPELLS.getIntValue()),
	DEATH_RATTLE(DEATHRATTLE.getIntValue()),
	DEATHRATTLE_SENDS_BACK_TO_DECK(DEATHRATTLE_RETURN_ZONE.getIntValue()),
//	HIDE_COST(HIDE_STATS.getIntValue()),
	LINKEDCARD(LINKED_ENTITY.getIntValue()),
	RECALL(OVERLOAD.getIntValue()),
	RECALL_OWED(OVERLOAD_OWED.getIntValue()),
	TAG_HERO_POWER_DOUBLE(HERO_POWER_DOUBLE.getIntValue()),
	TAG_AI_MUST_PLAY(AI_MUST_PLAY.getIntValue()),
//	TREASURE(DISCOVER.getIntValue()),
	SHOWN_HERO_POWER(HERO_POWER.getIntValue()),

	KAZAKUS_POTION_POWER_1(MODULAR_ENTITY_PART_1.getIntValue()),
	KAZAKUS_POTION_POWER_2(MODULAR_ENTITY_PART_2.getIntValue()),


	// Deleted
	COPY_DEATHRATTLE(55),
	COPY_DEATHRATTLE_INDEX(56),
	DIVINE_SHIELD_READY(314),
	NUM_OPTIONS(359),

	// Missing), only present in logs
	WEAPON(334),
	CANT_BE_EXHAUSTED(244),
	CANT_EXHAUST(226),
	CANT_TARGET(228),
	CANT_DESTROY(229);
	//@formatter:on

	private int intValue;

	public static int parseEnum(String tag) {
		try {
			int value = Integer.parseInt(tag);
			return value;
		}
		catch (Exception e) {
		}

		return GameTag.valueOf(tag).getIntValue();
	}

	public static GameTag fromInt(final int value) {
		return Arrays.asList(GameTag.values()).stream().filter(t -> (t.intValue == value)).findFirst().get();
	}

}
