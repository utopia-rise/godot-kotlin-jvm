// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class Key(
  id: Long,
) {
  /**
   * Enum value which doesn't correspond to any key. This is used to initialize [Key] properties
   * with a generic state.
   */
  KEY_NONE(0),
  /**
   * Keycodes with this bit applied are non-printable.
   */
  KEY_SPECIAL(4194304),
  /**
   * Escape key.
   */
  KEY_ESCAPE(4194305),
  /**
   * Tab key.
   */
  KEY_TAB(4194306),
  /**
   * Shift + Tab key.
   */
  KEY_BACKTAB(4194307),
  /**
   * Backspace key.
   */
  KEY_BACKSPACE(4194308),
  /**
   * Return key (on the main keyboard).
   */
  KEY_ENTER(4194309),
  /**
   * Enter key on the numeric keypad.
   */
  KEY_KP_ENTER(4194310),
  /**
   * Insert key.
   */
  KEY_INSERT(4194311),
  /**
   * Delete key.
   */
  KEY_DELETE(4194312),
  /**
   * Pause key.
   */
  KEY_PAUSE(4194313),
  /**
   * Print Screen key.
   */
  KEY_PRINT(4194314),
  /**
   * System Request key.
   */
  KEY_SYSREQ(4194315),
  /**
   * Clear key.
   */
  KEY_CLEAR(4194316),
  /**
   * Home key.
   */
  KEY_HOME(4194317),
  /**
   * End key.
   */
  KEY_END(4194318),
  /**
   * Left arrow key.
   */
  KEY_LEFT(4194319),
  /**
   * Up arrow key.
   */
  KEY_UP(4194320),
  /**
   * Right arrow key.
   */
  KEY_RIGHT(4194321),
  /**
   * Down arrow key.
   */
  KEY_DOWN(4194322),
  /**
   * Page Up key.
   */
  KEY_PAGEUP(4194323),
  /**
   * Page Down key.
   */
  KEY_PAGEDOWN(4194324),
  /**
   * Shift key.
   */
  KEY_SHIFT(4194325),
  /**
   * Control key.
   */
  KEY_CTRL(4194326),
  /**
   * Meta key.
   */
  KEY_META(4194327),
  /**
   * Alt key.
   */
  KEY_ALT(4194328),
  /**
   * Caps Lock key.
   */
  KEY_CAPSLOCK(4194329),
  /**
   * Num Lock key.
   */
  KEY_NUMLOCK(4194330),
  /**
   * Scroll Lock key.
   */
  KEY_SCROLLLOCK(4194331),
  /**
   * F1 key.
   */
  KEY_F1(4194332),
  /**
   * F2 key.
   */
  KEY_F2(4194333),
  /**
   * F3 key.
   */
  KEY_F3(4194334),
  /**
   * F4 key.
   */
  KEY_F4(4194335),
  /**
   * F5 key.
   */
  KEY_F5(4194336),
  /**
   * F6 key.
   */
  KEY_F6(4194337),
  /**
   * F7 key.
   */
  KEY_F7(4194338),
  /**
   * F8 key.
   */
  KEY_F8(4194339),
  /**
   * F9 key.
   */
  KEY_F9(4194340),
  /**
   * F10 key.
   */
  KEY_F10(4194341),
  /**
   * F11 key.
   */
  KEY_F11(4194342),
  /**
   * F12 key.
   */
  KEY_F12(4194343),
  /**
   * F13 key.
   */
  KEY_F13(4194344),
  /**
   * F14 key.
   */
  KEY_F14(4194345),
  /**
   * F15 key.
   */
  KEY_F15(4194346),
  /**
   * F16 key.
   */
  KEY_F16(4194347),
  /**
   * F17 key.
   */
  KEY_F17(4194348),
  /**
   * F18 key.
   */
  KEY_F18(4194349),
  /**
   * F19 key.
   */
  KEY_F19(4194350),
  /**
   * F20 key.
   */
  KEY_F20(4194351),
  /**
   * F21 key.
   */
  KEY_F21(4194352),
  /**
   * F22 key.
   */
  KEY_F22(4194353),
  /**
   * F23 key.
   */
  KEY_F23(4194354),
  /**
   * F24 key.
   */
  KEY_F24(4194355),
  /**
   * F25 key. Only supported on macOS and Linux due to a Windows limitation.
   */
  KEY_F25(4194356),
  /**
   * F26 key. Only supported on macOS and Linux due to a Windows limitation.
   */
  KEY_F26(4194357),
  /**
   * F27 key. Only supported on macOS and Linux due to a Windows limitation.
   */
  KEY_F27(4194358),
  /**
   * F28 key. Only supported on macOS and Linux due to a Windows limitation.
   */
  KEY_F28(4194359),
  /**
   * F29 key. Only supported on macOS and Linux due to a Windows limitation.
   */
  KEY_F29(4194360),
  /**
   * F30 key. Only supported on macOS and Linux due to a Windows limitation.
   */
  KEY_F30(4194361),
  /**
   * F31 key. Only supported on macOS and Linux due to a Windows limitation.
   */
  KEY_F31(4194362),
  /**
   * F32 key. Only supported on macOS and Linux due to a Windows limitation.
   */
  KEY_F32(4194363),
  /**
   * F33 key. Only supported on macOS and Linux due to a Windows limitation.
   */
  KEY_F33(4194364),
  /**
   * F34 key. Only supported on macOS and Linux due to a Windows limitation.
   */
  KEY_F34(4194365),
  /**
   * F35 key. Only supported on macOS and Linux due to a Windows limitation.
   */
  KEY_F35(4194366),
  /**
   * Multiply (*) key on the numeric keypad.
   */
  KEY_KP_MULTIPLY(4194433),
  /**
   * Divide (/) key on the numeric keypad.
   */
  KEY_KP_DIVIDE(4194434),
  /**
   * Subtract (-) key on the numeric keypad.
   */
  KEY_KP_SUBTRACT(4194435),
  /**
   * Period (.) key on the numeric keypad.
   */
  KEY_KP_PERIOD(4194436),
  /**
   * Add (+) key on the numeric keypad.
   */
  KEY_KP_ADD(4194437),
  /**
   * Number 0 on the numeric keypad.
   */
  KEY_KP_0(4194438),
  /**
   * Number 1 on the numeric keypad.
   */
  KEY_KP_1(4194439),
  /**
   * Number 2 on the numeric keypad.
   */
  KEY_KP_2(4194440),
  /**
   * Number 3 on the numeric keypad.
   */
  KEY_KP_3(4194441),
  /**
   * Number 4 on the numeric keypad.
   */
  KEY_KP_4(4194442),
  /**
   * Number 5 on the numeric keypad.
   */
  KEY_KP_5(4194443),
  /**
   * Number 6 on the numeric keypad.
   */
  KEY_KP_6(4194444),
  /**
   * Number 7 on the numeric keypad.
   */
  KEY_KP_7(4194445),
  /**
   * Number 8 on the numeric keypad.
   */
  KEY_KP_8(4194446),
  /**
   * Number 9 on the numeric keypad.
   */
  KEY_KP_9(4194447),
  /**
   * Context menu key.
   */
  KEY_MENU(4194370),
  /**
   * Hyper key. (On Linux/X11 only).
   */
  KEY_HYPER(4194371),
  /**
   * Help key.
   */
  KEY_HELP(4194373),
  /**
   * Media back key. Not to be confused with the Back button on an Android device.
   */
  KEY_BACK(4194376),
  /**
   * Media forward key.
   */
  KEY_FORWARD(4194377),
  /**
   * Media stop key.
   */
  KEY_STOP(4194378),
  /**
   * Media refresh key.
   */
  KEY_REFRESH(4194379),
  /**
   * Volume down key.
   */
  KEY_VOLUMEDOWN(4194380),
  /**
   * Mute volume key.
   */
  KEY_VOLUMEMUTE(4194381),
  /**
   * Volume up key.
   */
  KEY_VOLUMEUP(4194382),
  /**
   * Media play key.
   */
  KEY_MEDIAPLAY(4194388),
  /**
   * Media stop key.
   */
  KEY_MEDIASTOP(4194389),
  /**
   * Previous song key.
   */
  KEY_MEDIAPREVIOUS(4194390),
  /**
   * Next song key.
   */
  KEY_MEDIANEXT(4194391),
  /**
   * Media record key.
   */
  KEY_MEDIARECORD(4194392),
  /**
   * Home page key.
   */
  KEY_HOMEPAGE(4194393),
  /**
   * Favorites key.
   */
  KEY_FAVORITES(4194394),
  /**
   * Search key.
   */
  KEY_SEARCH(4194395),
  /**
   * Standby key.
   */
  KEY_STANDBY(4194396),
  /**
   * Open URL / Launch Browser key.
   */
  KEY_OPENURL(4194397),
  /**
   * Launch Mail key.
   */
  KEY_LAUNCHMAIL(4194398),
  /**
   * Launch Media key.
   */
  KEY_LAUNCHMEDIA(4194399),
  /**
   * Launch Shortcut 0 key.
   */
  KEY_LAUNCH0(4194400),
  /**
   * Launch Shortcut 1 key.
   */
  KEY_LAUNCH1(4194401),
  /**
   * Launch Shortcut 2 key.
   */
  KEY_LAUNCH2(4194402),
  /**
   * Launch Shortcut 3 key.
   */
  KEY_LAUNCH3(4194403),
  /**
   * Launch Shortcut 4 key.
   */
  KEY_LAUNCH4(4194404),
  /**
   * Launch Shortcut 5 key.
   */
  KEY_LAUNCH5(4194405),
  /**
   * Launch Shortcut 6 key.
   */
  KEY_LAUNCH6(4194406),
  /**
   * Launch Shortcut 7 key.
   */
  KEY_LAUNCH7(4194407),
  /**
   * Launch Shortcut 8 key.
   */
  KEY_LAUNCH8(4194408),
  /**
   * Launch Shortcut 9 key.
   */
  KEY_LAUNCH9(4194409),
  /**
   * Launch Shortcut A key.
   */
  KEY_LAUNCHA(4194410),
  /**
   * Launch Shortcut B key.
   */
  KEY_LAUNCHB(4194411),
  /**
   * Launch Shortcut C key.
   */
  KEY_LAUNCHC(4194412),
  /**
   * Launch Shortcut D key.
   */
  KEY_LAUNCHD(4194413),
  /**
   * Launch Shortcut E key.
   */
  KEY_LAUNCHE(4194414),
  /**
   * Launch Shortcut F key.
   */
  KEY_LAUNCHF(4194415),
  /**
   * "Globe" key on Mac / iPad keyboard.
   */
  KEY_GLOBE(4194416),
  /**
   * "On-screen keyboard" key on iPad keyboard.
   */
  KEY_KEYBOARD(4194417),
  /**
   * 英数 key on Mac keyboard.
   */
  KEY_JIS_EISU(4194418),
  /**
   * かな key on Mac keyboard.
   */
  KEY_JIS_KANA(4194419),
  /**
   * Unknown key.
   */
  KEY_UNKNOWN(8388607),
  /**
   * Space key.
   */
  KEY_SPACE(32),
  /**
   * ! key.
   */
  KEY_EXCLAM(33),
  /**
   * " key.
   */
  KEY_QUOTEDBL(34),
  /**
   * # key.
   */
  KEY_NUMBERSIGN(35),
  /**
   * $ key.
   */
  KEY_DOLLAR(36),
  /**
   * &#37; key.
   */
  KEY_PERCENT(37),
  /**
   * & key.
   */
  KEY_AMPERSAND(38),
  /**
   * ' key.
   */
  KEY_APOSTROPHE(39),
  /**
   * ( key.
   */
  KEY_PARENLEFT(40),
  /**
   * ) key.
   */
  KEY_PARENRIGHT(41),
  /**
   * * key.
   */
  KEY_ASTERISK(42),
  /**
   * + key.
   */
  KEY_PLUS(43),
  /**
   * , key.
   */
  KEY_COMMA(44),
  /**
   * - key.
   */
  KEY_MINUS(45),
  /**
   * . key.
   */
  KEY_PERIOD(46),
  /**
   * / key.
   */
  KEY_SLASH(47),
  /**
   * Number 0 key.
   */
  KEY_0(48),
  /**
   * Number 1 key.
   */
  KEY_1(49),
  /**
   * Number 2 key.
   */
  KEY_2(50),
  /**
   * Number 3 key.
   */
  KEY_3(51),
  /**
   * Number 4 key.
   */
  KEY_4(52),
  /**
   * Number 5 key.
   */
  KEY_5(53),
  /**
   * Number 6 key.
   */
  KEY_6(54),
  /**
   * Number 7 key.
   */
  KEY_7(55),
  /**
   * Number 8 key.
   */
  KEY_8(56),
  /**
   * Number 9 key.
   */
  KEY_9(57),
  /**
   * : key.
   */
  KEY_COLON(58),
  /**
   * ; key.
   */
  KEY_SEMICOLON(59),
  /**
   * < key.
   */
  KEY_LESS(60),
  /**
   * = key.
   */
  KEY_EQUAL(61),
  /**
   * > key.
   */
  KEY_GREATER(62),
  /**
   * ? key.
   */
  KEY_QUESTION(63),
  /**
   * @ key.
   */
  KEY_AT(64),
  /**
   * A key.
   */
  KEY_A(65),
  /**
   * B key.
   */
  KEY_B(66),
  /**
   * C key.
   */
  KEY_C(67),
  /**
   * D key.
   */
  KEY_D(68),
  /**
   * E key.
   */
  KEY_E(69),
  /**
   * F key.
   */
  KEY_F(70),
  /**
   * G key.
   */
  KEY_G(71),
  /**
   * H key.
   */
  KEY_H(72),
  /**
   * I key.
   */
  KEY_I(73),
  /**
   * J key.
   */
  KEY_J(74),
  /**
   * K key.
   */
  KEY_K(75),
  /**
   * L key.
   */
  KEY_L(76),
  /**
   * M key.
   */
  KEY_M(77),
  /**
   * N key.
   */
  KEY_N(78),
  /**
   * O key.
   */
  KEY_O(79),
  /**
   * P key.
   */
  KEY_P(80),
  /**
   * Q key.
   */
  KEY_Q(81),
  /**
   * R key.
   */
  KEY_R(82),
  /**
   * S key.
   */
  KEY_S(83),
  /**
   * T key.
   */
  KEY_T(84),
  /**
   * U key.
   */
  KEY_U(85),
  /**
   * V key.
   */
  KEY_V(86),
  /**
   * W key.
   */
  KEY_W(87),
  /**
   * X key.
   */
  KEY_X(88),
  /**
   * Y key.
   */
  KEY_Y(89),
  /**
   * Z key.
   */
  KEY_Z(90),
  /**
   * [ key.
   */
  KEY_BRACKETLEFT(91),
  /**
   * \ key.
   */
  KEY_BACKSLASH(92),
  /**
   * ] key.
   */
  KEY_BRACKETRIGHT(93),
  /**
   * ^ key.
   */
  KEY_ASCIICIRCUM(94),
  /**
   * _ key.
   */
  KEY_UNDERSCORE(95),
  /**
   * ` key.
   */
  KEY_QUOTELEFT(96),
  /**
   * { key.
   */
  KEY_BRACELEFT(123),
  /**
   * | key.
   */
  KEY_BAR(124),
  /**
   * } key.
   */
  KEY_BRACERIGHT(125),
  /**
   * ~ key.
   */
  KEY_ASCIITILDE(126),
  /**
   * ¥ key.
   */
  KEY_YEN(165),
  /**
   * § key.
   */
  KEY_SECTION(167),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long): Key = entries.single { it.id == `value` }
  }
}
