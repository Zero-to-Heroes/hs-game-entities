package com.zerotoheroes.hsgameentities.enums;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GameTag {

	// https://github.com/HearthSim/python-hearthstone/blob/master/hearthstone/enums.py
	//@formatter:off
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
	 IGNORE_HIDE_STATS_FOR_BIG_CARD(857),
	 REAL_TIME_TRANSFORM(859),
	 WAIT_FOR_PLAYER_RECONNECT_PERIOD(860),
	 PHASED_RESTART(888),
	DISCARD_CARDS(890),
     HEALTH_DISPLAY(917),
     ENABLE_HEALTH_DISPLAY(920),
	 VOODOO_LINK(921),
	 ATTACKABLE_BY_RUSH(930),
     SHIFTING_SPELL(936),
     USE_ALTERNATE_CARD_TEXT(955),
	 SUPPRESS_DEATH_SOUND(959),
	 ECHOING_OOZE_SPELL(963),
	 ZOMBEAST_DEBUG_CURRENT_BEAST_DATABASE_ID(964),
	 COLLECTIONMANAGER_FILTER_MANA_EVEN(956),
	 COLLECTIONMANAGER_FILTER_MANA_ODD(957),
	 ZOMBEAST_DEBUG_CURRENT_ITERATION(965),
	 ZOMBEAST_DEBUG_MAX_ITERATIONS(966),
	 START_OF_GAME(968),
	 ENCHANTMENT_INVISIBLE(976),
	WILD(991),
	HALL_OF_FAME(992),
	FAST_BATTLECRY(998),
	TREAT_AS_PLAYED_HERO_CARD(1016),

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
	OVERKILL(380),
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