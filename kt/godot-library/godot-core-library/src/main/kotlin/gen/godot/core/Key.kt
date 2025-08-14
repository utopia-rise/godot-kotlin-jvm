// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.core

import kotlin.Long
import kotlin.Suppress

public enum class Key(
  id: Long,
) {
  /**
   * Enum value which doesn't correspond to any key. This is used to initialize [Key] properties with a generic state.
   */
  NONE(0),
  /**
   * Keycodes with this bit applied are non-printable.
   */
  SPECIAL(4_194_304),
  /**
   * Escape key.
   */
  ESCAPE(4_194_305),
  /**
   * Tab key.
   */
  TAB(4_194_306),
  /**
   * Shift + Tab key.
   */
  BACKTAB(4_194_307),
  /**
   * Backspace key.
   */
  BACKSPACE(4_194_308),
  /**
   * Return key (on the main keyboard).
   */
  ENTER(4_194_309),
  /**
   * Enter key on the numeric keypad.
   */
  KP_ENTER(4_194_310),
  /**
   * Insert key.
   */
  INSERT(4_194_311),
  /**
   * Delete key.
   */
  DELETE(4_194_312),
  /**
   * Pause key.
   */
  PAUSE(4_194_313),
  /**
   * Print Screen key.
   */
  PRINT(4_194_314),
  /**
   * System Request key.
   */
  SYSREQ(4_194_315),
  /**
   * Clear key.
   */
  CLEAR(4_194_316),
  /**
   * Home key.
   */
  HOME(4_194_317),
  /**
   * End key.
   */
  END(4_194_318),
  /**
   * Left arrow key.
   */
  LEFT(4_194_319),
  /**
   * Up arrow key.
   */
  UP(4_194_320),
  /**
   * Right arrow key.
   */
  RIGHT(4_194_321),
  /**
   * Down arrow key.
   */
  DOWN(4_194_322),
  /**
   * Page Up key.
   */
  PAGEUP(4_194_323),
  /**
   * Page Down key.
   */
  PAGEDOWN(4_194_324),
  /**
   * Shift key.
   */
  SHIFT(4_194_325),
  /**
   * Control key.
   */
  CTRL(4_194_326),
  /**
   * Meta key.
   */
  META(4_194_327),
  /**
   * Alt key.
   */
  ALT(4_194_328),
  /**
   * Caps Lock key.
   */
  CAPSLOCK(4_194_329),
  /**
   * Num Lock key.
   */
  NUMLOCK(4_194_330),
  /**
   * Scroll Lock key.
   */
  SCROLLLOCK(4_194_331),
  /**
   * F1 key.
   */
  F1(4_194_332),
  /**
   * F2 key.
   */
  F2(4_194_333),
  /**
   * F3 key.
   */
  F3(4_194_334),
  /**
   * F4 key.
   */
  F4(4_194_335),
  /**
   * F5 key.
   */
  F5(4_194_336),
  /**
   * F6 key.
   */
  F6(4_194_337),
  /**
   * F7 key.
   */
  F7(4_194_338),
  /**
   * F8 key.
   */
  F8(4_194_339),
  /**
   * F9 key.
   */
  F9(4_194_340),
  /**
   * F10 key.
   */
  F10(4_194_341),
  /**
   * F11 key.
   */
  F11(4_194_342),
  /**
   * F12 key.
   */
  F12(4_194_343),
  /**
   * F13 key.
   */
  F13(4_194_344),
  /**
   * F14 key.
   */
  F14(4_194_345),
  /**
   * F15 key.
   */
  F15(4_194_346),
  /**
   * F16 key.
   */
  F16(4_194_347),
  /**
   * F17 key.
   */
  F17(4_194_348),
  /**
   * F18 key.
   */
  F18(4_194_349),
  /**
   * F19 key.
   */
  F19(4_194_350),
  /**
   * F20 key.
   */
  F20(4_194_351),
  /**
   * F21 key.
   */
  F21(4_194_352),
  /**
   * F22 key.
   */
  F22(4_194_353),
  /**
   * F23 key.
   */
  F23(4_194_354),
  /**
   * F24 key.
   */
  F24(4_194_355),
  /**
   * F25 key. Only supported on macOS and Linux due to a Windows limitation.
   */
  F25(4_194_356),
  /**
   * F26 key. Only supported on macOS and Linux due to a Windows limitation.
   */
  F26(4_194_357),
  /**
   * F27 key. Only supported on macOS and Linux due to a Windows limitation.
   */
  F27(4_194_358),
  /**
   * F28 key. Only supported on macOS and Linux due to a Windows limitation.
   */
  F28(4_194_359),
  /**
   * F29 key. Only supported on macOS and Linux due to a Windows limitation.
   */
  F29(4_194_360),
  /**
   * F30 key. Only supported on macOS and Linux due to a Windows limitation.
   */
  F30(4_194_361),
  /**
   * F31 key. Only supported on macOS and Linux due to a Windows limitation.
   */
  F31(4_194_362),
  /**
   * F32 key. Only supported on macOS and Linux due to a Windows limitation.
   */
  F32(4_194_363),
  /**
   * F33 key. Only supported on macOS and Linux due to a Windows limitation.
   */
  F33(4_194_364),
  /**
   * F34 key. Only supported on macOS and Linux due to a Windows limitation.
   */
  F34(4_194_365),
  /**
   * F35 key. Only supported on macOS and Linux due to a Windows limitation.
   */
  F35(4_194_366),
  /**
   * Multiply (*) key on the numeric keypad.
   */
  KP_MULTIPLY(4_194_433),
  /**
   * Divide (/) key on the numeric keypad.
   */
  KP_DIVIDE(4_194_434),
  /**
   * Subtract (-) key on the numeric keypad.
   */
  KP_SUBTRACT(4_194_435),
  /**
   * Period (.) key on the numeric keypad.
   */
  KP_PERIOD(4_194_436),
  /**
   * Add (+) key on the numeric keypad.
   */
  KP_ADD(4_194_437),
  /**
   * Number 0 on the numeric keypad.
   */
  KP_0(4_194_438),
  /**
   * Number 1 on the numeric keypad.
   */
  KP_1(4_194_439),
  /**
   * Number 2 on the numeric keypad.
   */
  KP_2(4_194_440),
  /**
   * Number 3 on the numeric keypad.
   */
  KP_3(4_194_441),
  /**
   * Number 4 on the numeric keypad.
   */
  KP_4(4_194_442),
  /**
   * Number 5 on the numeric keypad.
   */
  KP_5(4_194_443),
  /**
   * Number 6 on the numeric keypad.
   */
  KP_6(4_194_444),
  /**
   * Number 7 on the numeric keypad.
   */
  KP_7(4_194_445),
  /**
   * Number 8 on the numeric keypad.
   */
  KP_8(4_194_446),
  /**
   * Number 9 on the numeric keypad.
   */
  KP_9(4_194_447),
  /**
   * Context menu key.
   */
  MENU(4_194_370),
  /**
   * Hyper key. (On Linux/X11 only).
   */
  HYPER(4_194_371),
  /**
   * Help key.
   */
  HELP(4_194_373),
  /**
   * Back key.
   */
  BACK(4_194_376),
  /**
   * Forward key.
   */
  FORWARD(4_194_377),
  /**
   * Media stop key.
   */
  STOP(4_194_378),
  /**
   * Refresh key.
   */
  REFRESH(4_194_379),
  /**
   * Volume down key.
   */
  VOLUMEDOWN(4_194_380),
  /**
   * Mute volume key.
   */
  VOLUMEMUTE(4_194_381),
  /**
   * Volume up key.
   */
  VOLUMEUP(4_194_382),
  /**
   * Media play key.
   */
  MEDIAPLAY(4_194_388),
  /**
   * Media stop key.
   */
  MEDIASTOP(4_194_389),
  /**
   * Previous song key.
   */
  MEDIAPREVIOUS(4_194_390),
  /**
   * Next song key.
   */
  MEDIANEXT(4_194_391),
  /**
   * Media record key.
   */
  MEDIARECORD(4_194_392),
  /**
   * Home page key.
   */
  HOMEPAGE(4_194_393),
  /**
   * Favorites key.
   */
  FAVORITES(4_194_394),
  /**
   * Search key.
   */
  SEARCH(4_194_395),
  /**
   * Standby key.
   */
  STANDBY(4_194_396),
  /**
   * Open URL / Launch Browser key.
   */
  OPENURL(4_194_397),
  /**
   * Launch Mail key.
   */
  LAUNCHMAIL(4_194_398),
  /**
   * Launch Media key.
   */
  LAUNCHMEDIA(4_194_399),
  /**
   * Launch Shortcut 0 key.
   */
  LAUNCH0(4_194_400),
  /**
   * Launch Shortcut 1 key.
   */
  LAUNCH1(4_194_401),
  /**
   * Launch Shortcut 2 key.
   */
  LAUNCH2(4_194_402),
  /**
   * Launch Shortcut 3 key.
   */
  LAUNCH3(4_194_403),
  /**
   * Launch Shortcut 4 key.
   */
  LAUNCH4(4_194_404),
  /**
   * Launch Shortcut 5 key.
   */
  LAUNCH5(4_194_405),
  /**
   * Launch Shortcut 6 key.
   */
  LAUNCH6(4_194_406),
  /**
   * Launch Shortcut 7 key.
   */
  LAUNCH7(4_194_407),
  /**
   * Launch Shortcut 8 key.
   */
  LAUNCH8(4_194_408),
  /**
   * Launch Shortcut 9 key.
   */
  LAUNCH9(4_194_409),
  /**
   * Launch Shortcut A key.
   */
  LAUNCHA(4_194_410),
  /**
   * Launch Shortcut B key.
   */
  LAUNCHB(4_194_411),
  /**
   * Launch Shortcut C key.
   */
  LAUNCHC(4_194_412),
  /**
   * Launch Shortcut D key.
   */
  LAUNCHD(4_194_413),
  /**
   * Launch Shortcut E key.
   */
  LAUNCHE(4_194_414),
  /**
   * Launch Shortcut F key.
   */
  LAUNCHF(4_194_415),
  /**
   * "Globe" key on Mac / iPad keyboard.
   */
  GLOBE(4_194_416),
  /**
   * "On-screen keyboard" key on iPad keyboard.
   */
  KEYBOARD(4_194_417),
  /**
   * 英数 key on Mac keyboard.
   */
  JIS_EISU(4_194_418),
  /**
   * かな key on Mac keyboard.
   */
  JIS_KANA(4_194_419),
  /**
   * Unknown key.
   */
  UNKNOWN(8_388_607),
  /**
   * Space key.
   */
  SPACE(32),
  /**
   * Exclamation mark (`!`) key.
   */
  EXCLAM(33),
  /**
   * Double quotation mark (`"`) key.
   */
  QUOTEDBL(34),
  /**
   * Number sign or *hash* (`#`) key.
   */
  NUMBERSIGN(35),
  /**
   * Dollar sign (`$`) key.
   */
  DOLLAR(36),
  /**
   * Percent sign (`&#37;`) key.
   */
  PERCENT(37),
  /**
   * Ampersand (`&`) key.
   */
  AMPERSAND(38),
  /**
   * Apostrophe (`'`) key.
   */
  APOSTROPHE(39),
  /**
   * Left parenthesis (`(`) key.
   */
  PARENLEFT(40),
  /**
   * Right parenthesis (`)`) key.
   */
  PARENRIGHT(41),
  /**
   * Asterisk (`*`) key.
   */
  ASTERISK(42),
  /**
   * Plus (`+`) key.
   */
  PLUS(43),
  /**
   * Comma (`,`) key.
   */
  COMMA(44),
  /**
   * Minus (`-`) key.
   */
  MINUS(45),
  /**
   * Period (`.`) key.
   */
  PERIOD(46),
  /**
   * Slash (`/`) key.
   */
  SLASH(47),
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
   * Colon (`:`) key.
   */
  COLON(58),
  /**
   * Semicolon (`;`) key.
   */
  SEMICOLON(59),
  /**
   * Less-than sign (`<`) key.
   */
  LESS(60),
  /**
   * Equal sign (`=`) key.
   */
  EQUAL(61),
  /**
   * Greater-than sign (`>`) key.
   */
  GREATER(62),
  /**
   * Question mark (`?`) key.
   */
  QUESTION(63),
  /**
   * At sign (`@`) key.
   */
  AT(64),
  /**
   * A key.
   */
  A(65),
  /**
   * B key.
   */
  B(66),
  /**
   * C key.
   */
  C(67),
  /**
   * D key.
   */
  D(68),
  /**
   * E key.
   */
  E(69),
  /**
   * F key.
   */
  F(70),
  /**
   * G key.
   */
  G(71),
  /**
   * H key.
   */
  H(72),
  /**
   * I key.
   */
  I(73),
  /**
   * J key.
   */
  J(74),
  /**
   * K key.
   */
  K(75),
  /**
   * L key.
   */
  L(76),
  /**
   * M key.
   */
  M(77),
  /**
   * N key.
   */
  N(78),
  /**
   * O key.
   */
  O(79),
  /**
   * P key.
   */
  P(80),
  /**
   * Q key.
   */
  Q(81),
  /**
   * R key.
   */
  R(82),
  /**
   * S key.
   */
  S(83),
  /**
   * T key.
   */
  T(84),
  /**
   * U key.
   */
  U(85),
  /**
   * V key.
   */
  V(86),
  /**
   * W key.
   */
  W(87),
  /**
   * X key.
   */
  X(88),
  /**
   * Y key.
   */
  Y(89),
  /**
   * Z key.
   */
  Z(90),
  /**
   * Left bracket (`[lb]`) key.
   */
  BRACKETLEFT(91),
  /**
   * Backslash (`\`) key.
   */
  BACKSLASH(92),
  /**
   * Right bracket (`[rb]`) key.
   */
  BRACKETRIGHT(93),
  /**
   * Caret (`^`) key.
   */
  ASCIICIRCUM(94),
  /**
   * Underscore (`_`) key.
   */
  UNDERSCORE(95),
  /**
   * Backtick (```) key.
   */
  QUOTELEFT(96),
  /**
   * Left brace (`{`) key.
   */
  BRACELEFT(123),
  /**
   * Vertical bar or *pipe* (`|`) key.
   */
  BAR(124),
  /**
   * Right brace (`}`) key.
   */
  BRACERIGHT(125),
  /**
   * Tilde (`~`) key.
   */
  ASCIITILDE(126),
  /**
   * Yen symbol (`¥`) key.
   */
  YEN(165),
  /**
   * Section sign (`§`) key.
   */
  SECTION(167),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long): Key = entries.single { it.id == `value` }
  }
}
