// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
object GlobalConstants : Object() {
  /**
   * Left mouse button.
   */
  final const val BUTTON_LEFT: Long = 1

  /**
   * Left mouse button mask.
   */
  final const val BUTTON_MASK_LEFT: Long = 1

  /**
   * Middle mouse button mask.
   */
  final const val BUTTON_MASK_MIDDLE: Long = 4

  /**
   * Right mouse button mask.
   */
  final const val BUTTON_MASK_RIGHT: Long = 2

  /**
   * Extra mouse button 1 mask.
   */
  final const val BUTTON_MASK_XBUTTON1: Long = 128

  /**
   * Extra mouse button 2 mask.
   */
  final const val BUTTON_MASK_XBUTTON2: Long = 256

  /**
   * Middle mouse button.
   */
  final const val BUTTON_MIDDLE: Long = 3

  /**
   * Right mouse button.
   */
  final const val BUTTON_RIGHT: Long = 2

  /**
   * Mouse wheel down.
   */
  final const val BUTTON_WHEEL_DOWN: Long = 5

  /**
   * Mouse wheel left button (only present on some mice).
   */
  final const val BUTTON_WHEEL_LEFT: Long = 6

  /**
   * Mouse wheel right button (only present on some mice).
   */
  final const val BUTTON_WHEEL_RIGHT: Long = 7

  /**
   * Mouse wheel up.
   */
  final const val BUTTON_WHEEL_UP: Long = 4

  /**
   * Extra mouse button 1 (only present on some mice).
   */
  final const val BUTTON_XBUTTON1: Long = 8

  /**
   * Extra mouse button 2 (only present on some mice).
   */
  final const val BUTTON_XBUTTON2: Long = 9

  /**
   * Bottom-left corner.
   */
  final const val CORNER_BOTTOM_LEFT: Long = 3

  /**
   * Bottom-right corner.
   */
  final const val CORNER_BOTTOM_RIGHT: Long = 2

  /**
   * Top-left corner.
   */
  final const val CORNER_TOP_LEFT: Long = 0

  /**
   * Top-right corner.
   */
  final const val CORNER_TOP_RIGHT: Long = 1

  /**
   * Already exists error.
   */
  final const val ERR_ALREADY_EXISTS: Long = 32

  /**
   * Already in use error.
   */
  final const val ERR_ALREADY_IN_USE: Long = 22

  /**
   * Bug error.
   */
  final const val ERR_BUG: Long = 47

  /**
   * Busy error.
   */
  final const val ERR_BUSY: Long = 44

  /**
   * Can't acquire resource error.
   */
  final const val ERR_CANT_ACQUIRE_RESOURCE: Long = 28

  /**
   * Can't connect error.
   */
  final const val ERR_CANT_CONNECT: Long = 25

  /**
   * Can't create error.
   */
  final const val ERR_CANT_CREATE: Long = 20

  /**
   * Can't fork process error.
   */
  final const val ERR_CANT_FORK: Long = 29

  /**
   * Can't open error.
   */
  final const val ERR_CANT_OPEN: Long = 19

  /**
   * Can't resolve error.
   */
  final const val ERR_CANT_RESOLVE: Long = 26

  /**
   * Compilation failed error.
   */
  final const val ERR_COMPILATION_FAILED: Long = 36

  /**
   * Connection error.
   */
  final const val ERR_CONNECTION_ERROR: Long = 27

  /**
   * Cycling link (import cycle) error.
   */
  final const val ERR_CYCLIC_LINK: Long = 40

  /**
   * Database: Read error.
   */
  final const val ERR_DATABASE_CANT_READ: Long = 34

  /**
   * Database: Write error.
   */
  final const val ERR_DATABASE_CANT_WRITE: Long = 35

  /**
   * Does not exist error.
   */
  final const val ERR_DOES_NOT_EXIST: Long = 33

  /**
   * Duplicate symbol error.
   */
  final const val ERR_DUPLICATE_SYMBOL: Long = 42

  /**
   * File: Already in use error.
   */
  final const val ERR_FILE_ALREADY_IN_USE: Long = 11

  /**
   * File: Bad drive error.
   */
  final const val ERR_FILE_BAD_DRIVE: Long = 8

  /**
   * File: Bad path error.
   */
  final const val ERR_FILE_BAD_PATH: Long = 9

  /**
   * File: Can't open error.
   */
  final const val ERR_FILE_CANT_OPEN: Long = 12

  /**
   * File: Can't read error.
   */
  final const val ERR_FILE_CANT_READ: Long = 14

  /**
   * File: Can't write error.
   */
  final const val ERR_FILE_CANT_WRITE: Long = 13

  /**
   * File: Corrupt error.
   */
  final const val ERR_FILE_CORRUPT: Long = 16

  /**
   * File: End of file (EOF) error.
   */
  final const val ERR_FILE_EOF: Long = 18

  /**
   * File: Missing dependencies error.
   */
  final const val ERR_FILE_MISSING_DEPENDENCIES: Long = 17

  /**
   * File: Not found error.
   */
  final const val ERR_FILE_NOT_FOUND: Long = 7

  /**
   * File: No permission error.
   */
  final const val ERR_FILE_NO_PERMISSION: Long = 10

  /**
   * File: Unrecognized error.
   */
  final const val ERR_FILE_UNRECOGNIZED: Long = 15

  /**
   * Help error.
   */
  final const val ERR_HELP: Long = 46

  /**
   * Invalid data error.
   */
  final const val ERR_INVALID_DATA: Long = 30

  /**
   * Invalid declaration error.
   */
  final const val ERR_INVALID_DECLARATION: Long = 41

  /**
   * Invalid parameter error.
   */
  final const val ERR_INVALID_PARAMETER: Long = 31

  /**
   * Linking failed error.
   */
  final const val ERR_LINK_FAILED: Long = 38

  /**
   * Locked error.
   */
  final const val ERR_LOCKED: Long = 23

  /**
   * Method not found error.
   */
  final const val ERR_METHOD_NOT_FOUND: Long = 37

  /**
   * Out of memory (OOM) error.
   */
  final const val ERR_OUT_OF_MEMORY: Long = 6

  /**
   * Parameter range error.
   */
  final const val ERR_PARAMETER_RANGE_ERROR: Long = 5

  /**
   * Parse error.
   */
  final const val ERR_PARSE_ERROR: Long = 43

  /**
   * Printer on fire error. (This is an easter egg, no engine methods return this error code.)
   */
  final const val ERR_PRINTER_ON_FIRE: Long = 48

  /**
   * Query failed error.
   */
  final const val ERR_QUERY_FAILED: Long = 21

  /**
   * Script failed error.
   */
  final const val ERR_SCRIPT_FAILED: Long = 39

  /**
   * Skip error.
   */
  final const val ERR_SKIP: Long = 45

  /**
   * Timeout error.
   */
  final const val ERR_TIMEOUT: Long = 24

  /**
   * Unauthorized error.
   */
  final const val ERR_UNAUTHORIZED: Long = 4

  /**
   * Unavailable error.
   */
  final const val ERR_UNAVAILABLE: Long = 2

  /**
   * Unconfigured error.
   */
  final const val ERR_UNCONFIGURED: Long = 3

  /**
   * Generic error.
   */
  final const val FAILED: Long = 1

  /**
   * Horizontal center alignment, usually for text-derived classes.
   */
  final const val HALIGN_CENTER: Long = 1

  /**
   * Horizontal left alignment, usually for text-derived classes.
   */
  final const val HALIGN_LEFT: Long = 0

  /**
   * Horizontal right alignment, usually for text-derived classes.
   */
  final const val HALIGN_RIGHT: Long = 2

  /**
   * General horizontal alignment, usually used for [godot.Separator], [godot.ScrollBar], [godot.Slider], etc.
   */
  final const val HORIZONTAL: Long = 0

  /**
   * Gamepad left analog trigger.
   */
  final const val JOY_ANALOG_L2: Long = 6

  /**
   * Gamepad left stick horizontal axis.
   */
  final const val JOY_ANALOG_LX: Long = 0

  /**
   * Gamepad left stick vertical axis.
   */
  final const val JOY_ANALOG_LY: Long = 1

  /**
   * Gamepad right analog trigger.
   */
  final const val JOY_ANALOG_R2: Long = 7

  /**
   * Gamepad right stick horizontal axis.
   */
  final const val JOY_ANALOG_RX: Long = 2

  /**
   * Gamepad right stick vertical axis.
   */
  final const val JOY_ANALOG_RY: Long = 3

  /**
   * Gamepad left stick horizontal axis.
   */
  final const val JOY_AXIS_0: Long = 0

  /**
   * Gamepad left stick vertical axis.
   */
  final const val JOY_AXIS_1: Long = 1

  /**
   * Gamepad right stick horizontal axis.
   */
  final const val JOY_AXIS_2: Long = 2

  /**
   * Gamepad right stick vertical axis.
   */
  final const val JOY_AXIS_3: Long = 3

  /**
   * Generic gamepad axis 4.
   */
  final const val JOY_AXIS_4: Long = 4

  /**
   * Generic gamepad axis 5.
   */
  final const val JOY_AXIS_5: Long = 5

  /**
   * Gamepad left trigger analog axis.
   */
  final const val JOY_AXIS_6: Long = 6

  /**
   * Gamepad right trigger analog axis.
   */
  final const val JOY_AXIS_7: Long = 7

  /**
   * Generic gamepad axis 8.
   */
  final const val JOY_AXIS_8: Long = 8

  /**
   * Generic gamepad axis 9.
   */
  final const val JOY_AXIS_9: Long = 9

  /**
   * Represents the maximum number of joystick axes supported.
   */
  final const val JOY_AXIS_MAX: Long = 10

  /**
   * Gamepad button 0.
   */
  final const val JOY_BUTTON_0: Long = 0

  /**
   * Gamepad button 1.
   */
  final const val JOY_BUTTON_1: Long = 1

  /**
   * Gamepad button 10.
   */
  final const val JOY_BUTTON_10: Long = 10

  /**
   * Gamepad button 11.
   */
  final const val JOY_BUTTON_11: Long = 11

  /**
   * Gamepad button 12.
   */
  final const val JOY_BUTTON_12: Long = 12

  /**
   * Gamepad button 13.
   */
  final const val JOY_BUTTON_13: Long = 13

  /**
   * Gamepad button 14.
   */
  final const val JOY_BUTTON_14: Long = 14

  /**
   * Gamepad button 15.
   */
  final const val JOY_BUTTON_15: Long = 15

  /**
   * Gamepad button 2.
   */
  final const val JOY_BUTTON_2: Long = 2

  /**
   * Gamepad button 3.
   */
  final const val JOY_BUTTON_3: Long = 3

  /**
   * Gamepad button 4.
   */
  final const val JOY_BUTTON_4: Long = 4

  /**
   * Gamepad button 5.
   */
  final const val JOY_BUTTON_5: Long = 5

  /**
   * Gamepad button 6.
   */
  final const val JOY_BUTTON_6: Long = 6

  /**
   * Gamepad button 7.
   */
  final const val JOY_BUTTON_7: Long = 7

  /**
   * Gamepad button 8.
   */
  final const val JOY_BUTTON_8: Long = 8

  /**
   * Gamepad button 9.
   */
  final const val JOY_BUTTON_9: Long = 9

  /**
   * Represents the maximum number of joystick buttons supported.
   */
  final const val JOY_BUTTON_MAX: Long = 16

  /**
   * Gamepad DPad down.
   */
  final const val JOY_DPAD_DOWN: Long = 13

  /**
   * Gamepad DPad left.
   */
  final const val JOY_DPAD_LEFT: Long = 14

  /**
   * Gamepad DPad right.
   */
  final const val JOY_DPAD_RIGHT: Long = 15

  /**
   * Gamepad DPad up.
   */
  final const val JOY_DPAD_UP: Long = 12

  /**
   * Nintendo controller A button.
   */
  final const val JOY_DS_A: Long = 1

  /**
   * Nintendo controller B button.
   */
  final const val JOY_DS_B: Long = 0

  /**
   * Nintendo controller X button.
   */
  final const val JOY_DS_X: Long = 3

  /**
   * Nintendo controller Y button.
   */
  final const val JOY_DS_Y: Long = 2

  /**
   * Gamepad left Shoulder button.
   */
  final const val JOY_L: Long = 4

  /**
   * Gamepad left trigger.
   */
  final const val JOY_L2: Long = 6

  /**
   * Gamepad left stick click.
   */
  final const val JOY_L3: Long = 8

  /**
   * A button on the right Oculus Touch controller, X button on the left controller (also when used in OpenVR).
   */
  final const val JOY_OCULUS_AX: Long = 7

  /**
   * B button on the right Oculus Touch controller, Y button on the left controller (also when used in OpenVR).
   */
  final const val JOY_OCULUS_BY: Long = 1

  /**
   * Menu button on either Oculus Touch controller.
   */
  final const val JOY_OCULUS_MENU: Long = 3

  /**
   * Menu button in OpenVR (Except when Oculus Touch controllers are used).
   */
  final const val JOY_OPENVR_MENU: Long = 1

  /**
   * OpenVR touchpad X axis (Joystick axis on Oculus Touch and Windows MR controllers).
   */
  final const val JOY_OPENVR_TOUCHPADX: Long = 0

  /**
   * OpenVR touchpad Y axis (Joystick axis on Oculus Touch and Windows MR controllers).
   */
  final const val JOY_OPENVR_TOUCHPADY: Long = 1

  /**
   * Gamepad right Shoulder button.
   */
  final const val JOY_R: Long = 5

  /**
   * Gamepad right trigger.
   */
  final const val JOY_R2: Long = 7

  /**
   * Gamepad right stick click.
   */
  final const val JOY_R3: Long = 9

  /**
   * Gamepad button Select.
   */
  final const val JOY_SELECT: Long = 10

  /**
   * DualShock circle button.
   */
  final const val JOY_SONY_CIRCLE: Long = 1

  /**
   * DualShock square button.
   */
  final const val JOY_SONY_SQUARE: Long = 2

  /**
   * DualShock triangle button.
   */
  final const val JOY_SONY_TRIANGLE: Long = 3

  /**
   * DualShock X button.
   */
  final const val JOY_SONY_X: Long = 0

  /**
   * Gamepad button Start.
   */
  final const val JOY_START: Long = 11

  /**
   * VR Controller analog grip (side buttons).
   */
  final const val JOY_VR_ANALOG_GRIP: Long = 4

  /**
   * VR Controller analog trigger.
   */
  final const val JOY_VR_ANALOG_TRIGGER: Long = 2

  /**
   * Grip (side) buttons on a VR controller.
   */
  final const val JOY_VR_GRIP: Long = 2

  /**
   * Push down on the touchpad or main joystick on a VR controller.
   */
  final const val JOY_VR_PAD: Long = 14

  /**
   * Trigger on a VR controller.
   */
  final const val JOY_VR_TRIGGER: Long = 15

  /**
   * Xbox controller A button.
   */
  final const val JOY_XBOX_A: Long = 0

  /**
   * Xbox controller B button.
   */
  final const val JOY_XBOX_B: Long = 1

  /**
   * Xbox controller X button.
   */
  final const val JOY_XBOX_X: Long = 2

  /**
   * Xbox controller Y button.
   */
  final const val JOY_XBOX_Y: Long = 3

  /**
   * Number 0.
   */
  final const val KEY_0: Long = 48

  /**
   * Number 1.
   */
  final const val KEY_1: Long = 49

  /**
   * Number 2.
   */
  final const val KEY_2: Long = 50

  /**
   * Number 3.
   */
  final const val KEY_3: Long = 51

  /**
   * Number 4.
   */
  final const val KEY_4: Long = 52

  /**
   * Number 5.
   */
  final const val KEY_5: Long = 53

  /**
   * Number 6.
   */
  final const val KEY_6: Long = 54

  /**
   * Number 7.
   */
  final const val KEY_7: Long = 55

  /**
   * Number 8.
   */
  final const val KEY_8: Long = 56

  /**
   * Number 9.
   */
  final const val KEY_9: Long = 57

  /**
   * A key.
   */
  final const val KEY_A: Long = 65

  /**
   * Á key.
   */
  final const val KEY_AACUTE: Long = 193

  /**
   * Â key.
   */
  final const val KEY_ACIRCUMFLEX: Long = 194

  /**
   * ´ key.
   */
  final const val KEY_ACUTE: Long = 180

  /**
   * Ä key.
   */
  final const val KEY_ADIAERESIS: Long = 196

  /**
   * Æ key.
   */
  final const val KEY_AE: Long = 198

  /**
   * À key.
   */
  final const val KEY_AGRAVE: Long = 192

  /**
   * Alt key.
   */
  final const val KEY_ALT: Long = 16777240

  /**
   * & key.
   */
  final const val KEY_AMPERSAND: Long = 38

  /**
   * ' key.
   */
  final const val KEY_APOSTROPHE: Long = 39

  /**
   * Å key.
   */
  final const val KEY_ARING: Long = 197

  /**
   * ^ key.
   */
  final const val KEY_ASCIICIRCUM: Long = 94

  /**
   * ~ key.
   */
  final const val KEY_ASCIITILDE: Long = 126

  /**
   * * key.
   */
  final const val KEY_ASTERISK: Long = 42

  /**
   * @ key.
   */
  final const val KEY_AT: Long = 64

  /**
   * Ã key.
   */
  final const val KEY_ATILDE: Long = 195

  /**
   * B key.
   */
  final const val KEY_B: Long = 66

  /**
   * Media back key. Not to be confused with the Back button on an Android device.
   */
  final const val KEY_BACK: Long = 16777280

  /**
   * \ key.
   */
  final const val KEY_BACKSLASH: Long = 92

  /**
   * Backspace key.
   */
  final const val KEY_BACKSPACE: Long = 16777220

  /**
   * Shift+Tab key.
   */
  final const val KEY_BACKTAB: Long = 16777219

  /**
   * | key.
   */
  final const val KEY_BAR: Long = 124

  /**
   * Bass Boost key.
   */
  final const val KEY_BASSBOOST: Long = 16777287

  /**
   * Bass down key.
   */
  final const val KEY_BASSDOWN: Long = 16777289

  /**
   * Bass up key.
   */
  final const val KEY_BASSUP: Long = 16777288

  /**
   * { key.
   */
  final const val KEY_BRACELEFT: Long = 123

  /**
   * } key.
   */
  final const val KEY_BRACERIGHT: Long = 125

  /**
   * [ key.
   */
  final const val KEY_BRACKETLEFT: Long = 91

  /**
   * ] key.
   */
  final const val KEY_BRACKETRIGHT: Long = 93

  /**
   * ¦ key.
   */
  final const val KEY_BROKENBAR: Long = 166

  /**
   * C key.
   */
  final const val KEY_C: Long = 67

  /**
   * Caps Lock key.
   */
  final const val KEY_CAPSLOCK: Long = 16777241

  /**
   * Ç key.
   */
  final const val KEY_CCEDILLA: Long = 199

  /**
   * ¸ key.
   */
  final const val KEY_CEDILLA: Long = 184

  /**
   * ¢ key.
   */
  final const val KEY_CENT: Long = 162

  /**
   * Clear key.
   */
  final const val KEY_CLEAR: Long = 16777228

  /**
   * Key Code mask.
   */
  final const val KEY_CODE_MASK: Long = 33554431

  /**
   * : key.
   */
  final const val KEY_COLON: Long = 58

  /**
   * , key.
   */
  final const val KEY_COMMA: Long = 44

  /**
   * Control key.
   */
  final const val KEY_CONTROL: Long = 16777238

  /**
   * © key.
   */
  final const val KEY_COPYRIGHT: Long = 169

  /**
   * ¤ key.
   */
  final const val KEY_CURRENCY: Long = 164

  /**
   * D key.
   */
  final const val KEY_D: Long = 68

  /**
   * ° key.
   */
  final const val KEY_DEGREE: Long = 176

  /**
   * Delete key.
   */
  final const val KEY_DELETE: Long = 16777224

  /**
   * ¨ key.
   */
  final const val KEY_DIAERESIS: Long = 168

  /**
   * Left Direction key.
   */
  final const val KEY_DIRECTION_L: Long = 16777266

  /**
   * Right Direction key.
   */
  final const val KEY_DIRECTION_R: Long = 16777267

  /**
   * ÷ key.
   */
  final const val KEY_DIVISION: Long = 247

  /**
   * $ key.
   */
  final const val KEY_DOLLAR: Long = 36

  /**
   * Down arrow key.
   */
  final const val KEY_DOWN: Long = 16777234

  /**
   * E key.
   */
  final const val KEY_E: Long = 69

  /**
   * É key.
   */
  final const val KEY_EACUTE: Long = 201

  /**
   * Ê key.
   */
  final const val KEY_ECIRCUMFLEX: Long = 202

  /**
   * Ë key.
   */
  final const val KEY_EDIAERESIS: Long = 203

  /**
   * È key.
   */
  final const val KEY_EGRAVE: Long = 200

  /**
   * End key.
   */
  final const val KEY_END: Long = 16777230

  /**
   * Return key (on the main keyboard).
   */
  final const val KEY_ENTER: Long = 16777221

  /**
   * = key.
   */
  final const val KEY_EQUAL: Long = 61

  /**
   * Escape key.
   */
  final const val KEY_ESCAPE: Long = 16777217

  /**
   * Ð key.
   */
  final const val KEY_ETH: Long = 208

  /**
   * ! key.
   */
  final const val KEY_EXCLAM: Long = 33

  /**
   * ¡ key.
   */
  final const val KEY_EXCLAMDOWN: Long = 161

  /**
   * F key.
   */
  final const val KEY_F: Long = 70

  /**
   * F1 key.
   */
  final const val KEY_F1: Long = 16777244

  /**
   * F10 key.
   */
  final const val KEY_F10: Long = 16777253

  /**
   * F11 key.
   */
  final const val KEY_F11: Long = 16777254

  /**
   * F12 key.
   */
  final const val KEY_F12: Long = 16777255

  /**
   * F13 key.
   */
  final const val KEY_F13: Long = 16777256

  /**
   * F14 key.
   */
  final const val KEY_F14: Long = 16777257

  /**
   * F15 key.
   */
  final const val KEY_F15: Long = 16777258

  /**
   * F16 key.
   */
  final const val KEY_F16: Long = 16777259

  /**
   * F2 key.
   */
  final const val KEY_F2: Long = 16777245

  /**
   * F3 key.
   */
  final const val KEY_F3: Long = 16777246

  /**
   * F4 key.
   */
  final const val KEY_F4: Long = 16777247

  /**
   * F5 key.
   */
  final const val KEY_F5: Long = 16777248

  /**
   * F6 key.
   */
  final const val KEY_F6: Long = 16777249

  /**
   * F7 key.
   */
  final const val KEY_F7: Long = 16777250

  /**
   * F8 key.
   */
  final const val KEY_F8: Long = 16777251

  /**
   * F9 key.
   */
  final const val KEY_F9: Long = 16777252

  /**
   * Favorites key.
   */
  final const val KEY_FAVORITES: Long = 16777298

  /**
   * Media forward key.
   */
  final const val KEY_FORWARD: Long = 16777281

  /**
   * G key.
   */
  final const val KEY_G: Long = 71

  /**
   * > key.
   */
  final const val KEY_GREATER: Long = 62

  /**
   * « key.
   */
  final const val KEY_GUILLEMOTLEFT: Long = 171

  /**
   * » key.
   */
  final const val KEY_GUILLEMOTRIGHT: Long = 187

  /**
   * H key.
   */
  final const val KEY_H: Long = 72

  /**
   * Help key.
   */
  final const val KEY_HELP: Long = 16777265

  /**
   * Home key.
   */
  final const val KEY_HOME: Long = 16777229

  /**
   * Home page key.
   */
  final const val KEY_HOMEPAGE: Long = 16777297

  /**
   * Left Hyper key.
   */
  final const val KEY_HYPER_L: Long = 16777263

  /**
   * Right Hyper key.
   */
  final const val KEY_HYPER_R: Long = 16777264

  /**
   * Soft hyphen key.
   */
  final const val KEY_HYPHEN: Long = 173

  /**
   * I key.
   */
  final const val KEY_I: Long = 73

  /**
   * Í key.
   */
  final const val KEY_IACUTE: Long = 205

  /**
   * Î key.
   */
  final const val KEY_ICIRCUMFLEX: Long = 206

  /**
   * Ï key.
   */
  final const val KEY_IDIAERESIS: Long = 207

  /**
   * Ì key.
   */
  final const val KEY_IGRAVE: Long = 204

  /**
   * Insert key.
   */
  final const val KEY_INSERT: Long = 16777223

  /**
   * J key.
   */
  final const val KEY_J: Long = 74

  /**
   * K key.
   */
  final const val KEY_K: Long = 75

  /**
   * Number 0 on the numeric keypad.
   */
  final const val KEY_KP_0: Long = 16777350

  /**
   * Number 1 on the numeric keypad.
   */
  final const val KEY_KP_1: Long = 16777351

  /**
   * Number 2 on the numeric keypad.
   */
  final const val KEY_KP_2: Long = 16777352

  /**
   * Number 3 on the numeric keypad.
   */
  final const val KEY_KP_3: Long = 16777353

  /**
   * Number 4 on the numeric keypad.
   */
  final const val KEY_KP_4: Long = 16777354

  /**
   * Number 5 on the numeric keypad.
   */
  final const val KEY_KP_5: Long = 16777355

  /**
   * Number 6 on the numeric keypad.
   */
  final const val KEY_KP_6: Long = 16777356

  /**
   * Number 7 on the numeric keypad.
   */
  final const val KEY_KP_7: Long = 16777357

  /**
   * Number 8 on the numeric keypad.
   */
  final const val KEY_KP_8: Long = 16777358

  /**
   * Number 9 on the numeric keypad.
   */
  final const val KEY_KP_9: Long = 16777359

  /**
   * Add (+) key on the numeric keypad.
   */
  final const val KEY_KP_ADD: Long = 16777349

  /**
   * Divide (/) key on the numeric keypad.
   */
  final const val KEY_KP_DIVIDE: Long = 16777346

  /**
   * Enter key on the numeric keypad.
   */
  final const val KEY_KP_ENTER: Long = 16777222

  /**
   * Multiply (*) key on the numeric keypad.
   */
  final const val KEY_KP_MULTIPLY: Long = 16777345

  /**
   * Period (.) key on the numeric keypad.
   */
  final const val KEY_KP_PERIOD: Long = 16777348

  /**
   * Subtract (-) key on the numeric keypad.
   */
  final const val KEY_KP_SUBTRACT: Long = 16777347

  /**
   * L key.
   */
  final const val KEY_L: Long = 76

  /**
   * Launch Shortcut 0 key.
   */
  final const val KEY_LAUNCH0: Long = 16777304

  /**
   * Launch Shortcut 1 key.
   */
  final const val KEY_LAUNCH1: Long = 16777305

  /**
   * Launch Shortcut 2 key.
   */
  final const val KEY_LAUNCH2: Long = 16777306

  /**
   * Launch Shortcut 3 key.
   */
  final const val KEY_LAUNCH3: Long = 16777307

  /**
   * Launch Shortcut 4 key.
   */
  final const val KEY_LAUNCH4: Long = 16777308

  /**
   * Launch Shortcut 5 key.
   */
  final const val KEY_LAUNCH5: Long = 16777309

  /**
   * Launch Shortcut 6 key.
   */
  final const val KEY_LAUNCH6: Long = 16777310

  /**
   * Launch Shortcut 7 key.
   */
  final const val KEY_LAUNCH7: Long = 16777311

  /**
   * Launch Shortcut 8 key.
   */
  final const val KEY_LAUNCH8: Long = 16777312

  /**
   * Launch Shortcut 9 key.
   */
  final const val KEY_LAUNCH9: Long = 16777313

  /**
   * Launch Shortcut A key.
   */
  final const val KEY_LAUNCHA: Long = 16777314

  /**
   * Launch Shortcut B key.
   */
  final const val KEY_LAUNCHB: Long = 16777315

  /**
   * Launch Shortcut C key.
   */
  final const val KEY_LAUNCHC: Long = 16777316

  /**
   * Launch Shortcut D key.
   */
  final const val KEY_LAUNCHD: Long = 16777317

  /**
   * Launch Shortcut E key.
   */
  final const val KEY_LAUNCHE: Long = 16777318

  /**
   * Launch Shortcut F key.
   */
  final const val KEY_LAUNCHF: Long = 16777319

  /**
   * Launch Mail key.
   */
  final const val KEY_LAUNCHMAIL: Long = 16777302

  /**
   * Launch Media key.
   */
  final const val KEY_LAUNCHMEDIA: Long = 16777303

  /**
   * Left arrow key.
   */
  final const val KEY_LEFT: Long = 16777231

  /**
   * < key.
   */
  final const val KEY_LESS: Long = 60

  /**
   * M key.
   */
  final const val KEY_M: Long = 77

  /**
   * ¯ key.
   */
  final const val KEY_MACRON: Long = 175

  /**
   * º key.
   */
  final const val KEY_MASCULINE: Long = 186

  /**
   * Alt key mask.
   */
  final const val KEY_MASK_ALT: Long = 67108864

  /**
   * Command key mask. On macOS, this is equivalent to [KEY_MASK_META]. On other platforms, this is equivalent to [KEY_MASK_CTRL]. This mask should be preferred to [KEY_MASK_META] or [KEY_MASK_CTRL] for system shortcuts as it handles all platforms correctly.
   */
  final const val KEY_MASK_CMD: Long = 268435456

  /**
   * Ctrl key mask.
   */
  final const val KEY_MASK_CTRL: Long = 268435456

  /**
   * Group Switch key mask.
   */
  final const val KEY_MASK_GROUP_SWITCH: Long = 1073741824

  /**
   * Keypad key mask.
   */
  final const val KEY_MASK_KPAD: Long = 536870912

  /**
   * Meta key mask.
   */
  final const val KEY_MASK_META: Long = 134217728

  /**
   * Shift key mask.
   */
  final const val KEY_MASK_SHIFT: Long = 33554432

  /**
   * Next song key.
   */
  final const val KEY_MEDIANEXT: Long = 16777295

  /**
   * Media play key.
   */
  final const val KEY_MEDIAPLAY: Long = 16777292

  /**
   * Previous song key.
   */
  final const val KEY_MEDIAPREVIOUS: Long = 16777294

  /**
   * Media record key.
   */
  final const val KEY_MEDIARECORD: Long = 16777296

  /**
   * Media stop key.
   */
  final const val KEY_MEDIASTOP: Long = 16777293

  /**
   * Context menu key.
   */
  final const val KEY_MENU: Long = 16777262

  /**
   * Meta key.
   */
  final const val KEY_META: Long = 16777239

  /**
   * - key.
   */
  final const val KEY_MINUS: Long = 45

  /**
   * Modifier key mask.
   */
  final const val KEY_MODIFIER_MASK: Long = -16777216

  /**
   * µ key.
   */
  final const val KEY_MU: Long = 181

  /**
   * × key.
   */
  final const val KEY_MULTIPLY: Long = 215

  /**
   * N key.
   */
  final const val KEY_N: Long = 78

  /**
   * Non-breakable space key.
   */
  final const val KEY_NOBREAKSPACE: Long = 160

  /**
   * ¬ key.
   */
  final const val KEY_NOTSIGN: Long = 172

  /**
   * Ñ key.
   */
  final const val KEY_NTILDE: Long = 209

  /**
   * # key.
   */
  final const val KEY_NUMBERSIGN: Long = 35

  /**
   * Num Lock key.
   */
  final const val KEY_NUMLOCK: Long = 16777242

  /**
   * O key.
   */
  final const val KEY_O: Long = 79

  /**
   * Ó key.
   */
  final const val KEY_OACUTE: Long = 211

  /**
   * Ô key.
   */
  final const val KEY_OCIRCUMFLEX: Long = 212

  /**
   * Ö key.
   */
  final const val KEY_ODIAERESIS: Long = 214

  /**
   * Ò key.
   */
  final const val KEY_OGRAVE: Long = 210

  /**
   * ½ key.
   */
  final const val KEY_ONEHALF: Long = 189

  /**
   * ¼ key.
   */
  final const val KEY_ONEQUARTER: Long = 188

  /**
   * ¹ key.
   */
  final const val KEY_ONESUPERIOR: Long = 185

  /**
   * Ø key.
   */
  final const val KEY_OOBLIQUE: Long = 216

  /**
   * Open URL / Launch Browser key.
   */
  final const val KEY_OPENURL: Long = 16777301

  /**
   * ª key.
   */
  final const val KEY_ORDFEMININE: Long = 170

  /**
   * Õ key.
   */
  final const val KEY_OTILDE: Long = 213

  /**
   * P key.
   */
  final const val KEY_P: Long = 80

  /**
   * Page Down key.
   */
  final const val KEY_PAGEDOWN: Long = 16777236

  /**
   * Page Up key.
   */
  final const val KEY_PAGEUP: Long = 16777235

  /**
   * ¶ key.
   */
  final const val KEY_PARAGRAPH: Long = 182

  /**
   * ( key.
   */
  final const val KEY_PARENLEFT: Long = 40

  /**
   * ) key.
   */
  final const val KEY_PARENRIGHT: Long = 41

  /**
   * Pause key.
   */
  final const val KEY_PAUSE: Long = 16777225

  /**
   * % key.
   */
  final const val KEY_PERCENT: Long = 37

  /**
   * . key.
   */
  final const val KEY_PERIOD: Long = 46

  /**
   *   key.
   */
  final const val KEY_PERIODCENTERED: Long = 183

  /**
   * + key.
   */
  final const val KEY_PLUS: Long = 43

  /**
   * ± key.
   */
  final const val KEY_PLUSMINUS: Long = 177

  /**
   * Print Screen key.
   */
  final const val KEY_PRINT: Long = 16777226

  /**
   * Q key.
   */
  final const val KEY_Q: Long = 81

  /**
   * ? key.
   */
  final const val KEY_QUESTION: Long = 63

  /**
   * ¿ key.
   */
  final const val KEY_QUESTIONDOWN: Long = 191

  /**
   * " key.
   */
  final const val KEY_QUOTEDBL: Long = 34

  /**
   * ` key.
   */
  final const val KEY_QUOTELEFT: Long = 96

  /**
   * R key.
   */
  final const val KEY_R: Long = 82

  /**
   * Media refresh key.
   */
  final const val KEY_REFRESH: Long = 16777283

  /**
   * ® key.
   */
  final const val KEY_REGISTERED: Long = 174

  /**
   * Right arrow key.
   */
  final const val KEY_RIGHT: Long = 16777233

  /**
   * S key.
   */
  final const val KEY_S: Long = 83

  /**
   * Scroll Lock key.
   */
  final const val KEY_SCROLLLOCK: Long = 16777243

  /**
   * Search key.
   */
  final const val KEY_SEARCH: Long = 16777299

  /**
   * § key.
   */
  final const val KEY_SECTION: Long = 167

  /**
   * ; key.
   */
  final const val KEY_SEMICOLON: Long = 59

  /**
   * Shift key.
   */
  final const val KEY_SHIFT: Long = 16777237

  /**
   * / key.
   */
  final const val KEY_SLASH: Long = 47

  /**
   * Space key.
   */
  final const val KEY_SPACE: Long = 32

  /**
   * ß key.
   */
  final const val KEY_SSHARP: Long = 223

  /**
   * Standby key.
   */
  final const val KEY_STANDBY: Long = 16777300

  /**
   * £ key.
   */
  final const val KEY_STERLING: Long = 163

  /**
   * Media stop key.
   */
  final const val KEY_STOP: Long = 16777282

  /**
   * Left Super key (Windows key).
   */
  final const val KEY_SUPER_L: Long = 16777260

  /**
   * Right Super key (Windows key).
   */
  final const val KEY_SUPER_R: Long = 16777261

  /**
   * System Request key.
   */
  final const val KEY_SYSREQ: Long = 16777227

  /**
   * T key.
   */
  final const val KEY_T: Long = 84

  /**
   * Tab key.
   */
  final const val KEY_TAB: Long = 16777218

  /**
   * Þ key.
   */
  final const val KEY_THORN: Long = 222

  /**
   * ¾ key.
   */
  final const val KEY_THREEQUARTERS: Long = 190

  /**
   * ³ key.
   */
  final const val KEY_THREESUPERIOR: Long = 179

  /**
   * Treble down key.
   */
  final const val KEY_TREBLEDOWN: Long = 16777291

  /**
   * Treble up key.
   */
  final const val KEY_TREBLEUP: Long = 16777290

  /**
   * ² key.
   */
  final const val KEY_TWOSUPERIOR: Long = 178

  /**
   * U key.
   */
  final const val KEY_U: Long = 85

  /**
   * Ú key.
   */
  final const val KEY_UACUTE: Long = 218

  /**
   * Û key.
   */
  final const val KEY_UCIRCUMFLEX: Long = 219

  /**
   * Ü key.
   */
  final const val KEY_UDIAERESIS: Long = 220

  /**
   * Ù key.
   */
  final const val KEY_UGRAVE: Long = 217

  /**
   * _ key.
   */
  final const val KEY_UNDERSCORE: Long = 95

  /**
   * Unknown key.
   */
  final const val KEY_UNKNOWN: Long = 33554431

  /**
   * Up arrow key.
   */
  final const val KEY_UP: Long = 16777232

  /**
   * V key.
   */
  final const val KEY_V: Long = 86

  /**
   * Volume down key.
   */
  final const val KEY_VOLUMEDOWN: Long = 16777284

  /**
   * Mute volume key.
   */
  final const val KEY_VOLUMEMUTE: Long = 16777285

  /**
   * Volume up key.
   */
  final const val KEY_VOLUMEUP: Long = 16777286

  /**
   * W key.
   */
  final const val KEY_W: Long = 87

  /**
   * X key.
   */
  final const val KEY_X: Long = 88

  /**
   * Y key.
   */
  final const val KEY_Y: Long = 89

  /**
   * Ý key.
   */
  final const val KEY_YACUTE: Long = 221

  /**
   * ÿ key.
   */
  final const val KEY_YDIAERESIS: Long = 255

  /**
   * ¥ key.
   */
  final const val KEY_YEN: Long = 165

  /**
   * Z key.
   */
  final const val KEY_Z: Long = 90

  /**
   * Bottom margin, usually used for [godot.Control] or [godot.StyleBox]-derived classes.
   */
  final const val MARGIN_BOTTOM: Long = 3

  /**
   * Left margin, usually used for [godot.Control] or [godot.StyleBox]-derived classes.
   */
  final const val MARGIN_LEFT: Long = 0

  /**
   * Right margin, usually used for [godot.Control] or [godot.StyleBox]-derived classes.
   */
  final const val MARGIN_RIGHT: Long = 2

  /**
   * Top margin, usually used for [godot.Control] or [godot.StyleBox]-derived classes.
   */
  final const val MARGIN_TOP: Long = 1

  /**
   * Default method flags.
   */
  final const val METHOD_FLAGS_DEFAULT: Long = 1

  /**
   * Flag for a constant method.
   */
  final const val METHOD_FLAG_CONST: Long = 8

  /**
   * Flag for an editor method.
   */
  final const val METHOD_FLAG_EDITOR: Long = 2

  /**
   * Deprecated method flag, unused.
   */
  final const val METHOD_FLAG_FROM_SCRIPT: Long = 64

  /**
   * Flag for a normal method.
   */
  final const val METHOD_FLAG_NORMAL: Long = 1

  /**
   * Deprecated method flag, unused.
   */
  final const val METHOD_FLAG_NOSCRIPT: Long = 4

  /**
   * Deprecated method flag, unused.
   */
  final const val METHOD_FLAG_REVERSE: Long = 16

  /**
   * Flag for a virtual method.
   */
  final const val METHOD_FLAG_VIRTUAL: Long = 32

  /**
   * MIDI aftertouch message.
   */
  final const val MIDI_MESSAGE_AFTERTOUCH: Long = 10

  /**
   * MIDI channel pressure message.
   */
  final const val MIDI_MESSAGE_CHANNEL_PRESSURE: Long = 13

  /**
   * MIDI control change message.
   */
  final const val MIDI_MESSAGE_CONTROL_CHANGE: Long = 11

  /**
   * MIDI note OFF message.
   */
  final const val MIDI_MESSAGE_NOTE_OFF: Long = 8

  /**
   * MIDI note ON message.
   */
  final const val MIDI_MESSAGE_NOTE_ON: Long = 9

  /**
   * MIDI pitch bend message.
   */
  final const val MIDI_MESSAGE_PITCH_BEND: Long = 14

  /**
   * MIDI program change message.
   */
  final const val MIDI_MESSAGE_PROGRAM_CHANGE: Long = 12

  /**
   * Methods that return [enum Error] return [OK] when no error occurred. Note that many functions don't return an error code but will print error messages to standard output.
   *
   * Since [OK] has value 0, and all other failure codes are positive integers, it can also be used in boolean checks, e.g.:
   *
   * ```
   * 			var err = method_that_returns_error()
   * 			if err != OK:
   * 			    print("Failure!)
   * 			# Or, equivalent:
   * 			if err:
   * 			    print("Still failing!)
   * 			```
   */
  final const val OK: Long = 0

  /**
   * Addition operator (`+`).
   */
  final const val OP_ADD: Long = 6

  /**
   * Logical AND operator (`and` or `&&`).
   */
  final const val OP_AND: Long = 20

  /**
   * Bitwise AND operator (`&`).
   */
  final const val OP_BIT_AND: Long = 16

  /**
   * Bitwise NOT operator (`~`).
   */
  final const val OP_BIT_NEGATE: Long = 19

  /**
   * Bitwise OR operator (`|`).
   */
  final const val OP_BIT_OR: Long = 17

  /**
   * Bitwise XOR operator (`^`).
   */
  final const val OP_BIT_XOR: Long = 18

  /**
   * Division operator (`/`).
   */
  final const val OP_DIVIDE: Long = 9

  /**
   * Equality operator (`==`).
   */
  final const val OP_EQUAL: Long = 0

  /**
   * Greater than operator (`>`).
   */
  final const val OP_GREATER: Long = 4

  /**
   * Greater than or equal operator (`>=`).
   */
  final const val OP_GREATER_EQUAL: Long = 5

  /**
   * Logical IN operator (`in`).
   */
  final const val OP_IN: Long = 24

  /**
   * Less than operator (`<`).
   */
  final const val OP_LESS: Long = 2

  /**
   * Less than or equal operator (`<=`).
   */
  final const val OP_LESS_EQUAL: Long = 3

  /**
   * Represents the size of the [enum Variant.Operator] enum.
   */
  final const val OP_MAX: Long = 25

  /**
   * Remainder/modulo operator (`%`).
   */
  final const val OP_MODULE: Long = 12

  /**
   * Multiplication operator (`*`).
   */
  final const val OP_MULTIPLY: Long = 8

  /**
   * Unary negation operator (`-`).
   */
  final const val OP_NEGATE: Long = 10

  /**
   * Logical NOT operator (`not` or `!`).
   */
  final const val OP_NOT: Long = 23

  /**
   * Inequality operator (`!=`).
   */
  final const val OP_NOT_EQUAL: Long = 1

  /**
   * Logical OR operator (`or` or `||`).
   */
  final const val OP_OR: Long = 21

  /**
   * Unary plus operator (`+`).
   */
  final const val OP_POSITIVE: Long = 11

  /**
   * Left shift operator (`<<`).
   */
  final const val OP_SHIFT_LEFT: Long = 14

  /**
   * Right shift operator (`>>`).
   */
  final const val OP_SHIFT_RIGHT: Long = 15

  /**
   * String concatenation operator (`+`).
   */
  final const val OP_STRING_CONCAT: Long = 13

  /**
   * Subtraction operator (`-`).
   */
  final const val OP_SUBTRACT: Long = 7

  /**
   * Logical XOR operator (not implemented in GDScript).
   */
  final const val OP_XOR: Long = 22

  /**
   * Hints that a color property should be edited without changing its alpha component, i.e. only R, G and B channels are edited.
   */
  final const val PROPERTY_HINT_COLOR_NO_ALPHA: Long = 20

  /**
   * Hints that a string property is a path to a directory. Editing it will show a file dialog for picking the path.
   */
  final const val PROPERTY_HINT_DIR: Long = 14

  /**
   * Hints that an integer, float or string property is an enumerated value to pick in a list specified via a hint string such as `"Hello,Something,Else"`.
   */
  final const val PROPERTY_HINT_ENUM: Long = 3

  /**
   * Hints that a float property should be edited via an exponential easing function. The hint string can include `"attenuation"` to flip the curve horizontally and/or `"inout"` to also include in/out easing.
   */
  final const val PROPERTY_HINT_EXP_EASING: Long = 4

  /**
   * Hints that an integer or float property should be within an exponential range specified via the hint string `"min,max"` or `"min,max,step"`. The hint string can optionally include `"or_greater"` and/or `"or_lesser"` to allow manual input going respectively above the max or below the min values. Example: `"0.01,100,0.01,or_greater"`.
   */
  final const val PROPERTY_HINT_EXP_RANGE: Long = 2

  /**
   * Hints that a string property is a path to a file. Editing it will show a file dialog for picking the path. The hint string can be a set of filters with wildcards like `"*.png,*.jpg"`.
   */
  final const val PROPERTY_HINT_FILE: Long = 13

  /**
   * Hints that an integer property is a bitmask with named bit flags. For example, to allow toggling bits 0, 1, 2 and 4, the hint could be something like `"Bit0,Bit1,Bit2,,Bit4"`.
   */
  final const val PROPERTY_HINT_FLAGS: Long = 8

  /**
   * Hints that a string property is an absolute path to a directory outside the project folder. Editing it will show a file dialog for picking the path.
   */
  final const val PROPERTY_HINT_GLOBAL_DIR: Long = 16

  /**
   * Hints that a string property is an absolute path to a file outside the project folder. Editing it will show a file dialog for picking the path. The hint string can be a set of filters with wildcards like `"*.png,*.jpg"`.
   */
  final const val PROPERTY_HINT_GLOBAL_FILE: Long = 15

  /**
   * Hints that an image is compressed using lossless compression.
   */
  final const val PROPERTY_HINT_IMAGE_COMPRESS_LOSSLESS: Long = 22

  /**
   * Hints that an image is compressed using lossy compression.
   */
  final const val PROPERTY_HINT_IMAGE_COMPRESS_LOSSY: Long = 21

  /**
   * Deprecated hint, unused.
   */
  final const val PROPERTY_HINT_KEY_ACCEL: Long = 7

  /**
   * Hints that an integer property is a bitmask using the optionally named 2D physics layers.
   */
  final const val PROPERTY_HINT_LAYERS_2D_PHYSICS: Long = 10

  /**
   * Hints that an integer property is a bitmask using the optionally named 2D render layers.
   */
  final const val PROPERTY_HINT_LAYERS_2D_RENDER: Long = 9

  /**
   * Hints that an integer property is a bitmask using the optionally named 3D physics layers.
   */
  final const val PROPERTY_HINT_LAYERS_3D_PHYSICS: Long = 12

  /**
   * Hints that an integer property is a bitmask using the optionally named 3D render layers.
   */
  final const val PROPERTY_HINT_LAYERS_3D_RENDER: Long = 11

  /**
   * Deprecated hint, unused.
   */
  final const val PROPERTY_HINT_LENGTH: Long = 5

  /**
   * Hints that a string property is text with line breaks. Editing it will show a text input field where line breaks can be typed.
   */
  final const val PROPERTY_HINT_MULTILINE_TEXT: Long = 18

  /**
   * No hint for the edited property.
   */
  final const val PROPERTY_HINT_NONE: Long = 0

  /**
   * Hints that a string property should have a placeholder text visible on its input field, whenever the property is empty. The hint string is the placeholder text to use.
   */
  final const val PROPERTY_HINT_PLACEHOLDER_TEXT: Long = 19

  /**
   * Hints that an integer or float property should be within a range specified via the hint string `"min,max"` or `"min,max,step"`. The hint string can optionally include `"or_greater"` and/or `"or_lesser"` to allow manual input going respectively above the max or below the min values. Example: `"-360,360,1,or_greater,or_lesser"`.
   */
  final const val PROPERTY_HINT_RANGE: Long = 1

  /**
   * Hints that a property is an instance of a [godot.Resource]-derived type, optionally specified via the hint string (e.g. `"Texture"`). Editing it will show a popup menu of valid resource types to instantiate.
   */
  final const val PROPERTY_HINT_RESOURCE_TYPE: Long = 17

  /**
   * Used to categorize properties together in the editor.
   */
  final const val PROPERTY_USAGE_CATEGORY: Long = 256

  /**
   * The property can be checked in the editor inspector.
   */
  final const val PROPERTY_USAGE_CHECKABLE: Long = 16

  /**
   * The property is checked in the editor inspector.
   */
  final const val PROPERTY_USAGE_CHECKED: Long = 32

  /**
   * Default usage (storage, editor and network).
   */
  final const val PROPERTY_USAGE_DEFAULT: Long = 7

  /**
   * Default usage for translatable strings (storage, editor, network and internationalized).
   */
  final const val PROPERTY_USAGE_DEFAULT_INTL: Long = 71

  /**
   * The property is shown in the editor inspector (default).
   */
  final const val PROPERTY_USAGE_EDITOR: Long = 2

  /**
   * Deprecated usage flag, unused.
   */
  final const val PROPERTY_USAGE_EDITOR_HELPER: Long = 8

  /**
   * Used to group properties together in the editor.
   */
  final const val PROPERTY_USAGE_GROUP: Long = 128

  /**
   * The property is a translatable string.
   */
  final const val PROPERTY_USAGE_INTERNATIONALIZED: Long = 64

  /**
   * Deprecated usage flag, unused.
   */
  final const val PROPERTY_USAGE_NETWORK: Long = 4

  /**
   * Default usage but without showing the property in the editor (storage, network).
   */
  final const val PROPERTY_USAGE_NOEDITOR: Long = 5

  /**
   * The property does not save its state in [godot.PackedScene].
   */
  final const val PROPERTY_USAGE_NO_INSTANCE_STATE: Long = 2048

  /**
   * Editing the property prompts the user for restarting the editor.
   */
  final const val PROPERTY_USAGE_RESTART_IF_CHANGED: Long = 4096

  /**
   * The property is a script variable which should be serialized and saved in the scene file.
   */
  final const val PROPERTY_USAGE_SCRIPT_VARIABLE: Long = 8192

  /**
   * The property is serialized and saved in the scene file (default).
   */
  final const val PROPERTY_USAGE_STORAGE: Long = 1

  /**
   * Scancodes with this bit applied are non-printable.
   */
  final const val SPKEY: Long = 16777216

  /**
   * Variable is of type [AABB].
   */
  final const val TYPE_AABB: Long = 11

  /**
   * Variable is of type [godot.Array].
   */
  final const val TYPE_ARRAY: Long = 19

  /**
   * Variable is of type [godot.core.Basis].
   */
  final const val TYPE_BASIS: Long = 12

  /**
   * Variable is of type [bool].
   */
  final const val TYPE_BOOL: Long = 1

  /**
   * Variable is of type [godot.core.Color].
   */
  final const val TYPE_COLOR: Long = 14

  /**
   * Variable is of type [godot.core.PoolColorArray].
   */
  final const val TYPE_COLOR_ARRAY: Long = 26

  /**
   * Variable is of type [godot.core.Dictionary].
   */
  final const val TYPE_DICTIONARY: Long = 18

  /**
   * Variable is of type [int].
   */
  final const val TYPE_INT: Long = 2

  /**
   * Variable is of type [godot.core.PoolIntArray].
   */
  final const val TYPE_INT_ARRAY: Long = 21

  /**
   * Represents the size of the [enum Variant.Type] enum.
   */
  final const val TYPE_MAX: Long = 27

  /**
   * Variable is `null`.
   */
  final const val TYPE_NIL: Long = 0

  /**
   * Variable is of type [godot.core.NodePath].
   */
  final const val TYPE_NODE_PATH: Long = 15

  /**
   * Variable is of type [godot.Object].
   */
  final const val TYPE_OBJECT: Long = 17

  /**
   * Variable is of type [godot.core.Plane].
   */
  final const val TYPE_PLANE: Long = 9

  /**
   * Variable is of type [godot.core.Quat].
   */
  final const val TYPE_QUAT: Long = 10

  /**
   * Variable is of type [godot.core.PoolByteArray].
   */
  final const val TYPE_RAW_ARRAY: Long = 20

  /**
   * Variable is of type [float] (real).
   */
  final const val TYPE_REAL: Long = 3

  /**
   * Variable is of type [godot.core.PoolRealArray].
   */
  final const val TYPE_REAL_ARRAY: Long = 22

  /**
   * Variable is of type [godot.core.Rect2].
   */
  final const val TYPE_RECT2: Long = 6

  /**
   * Variable is of type [RID].
   */
  final const val TYPE_RID: Long = 16

  /**
   * Variable is of type [godot.String].
   */
  final const val TYPE_STRING: Long = 4

  /**
   * Variable is of type [godot.core.PoolStringArray].
   */
  final const val TYPE_STRING_ARRAY: Long = 23

  /**
   * Variable is of type [godot.core.Transform].
   */
  final const val TYPE_TRANSFORM: Long = 13

  /**
   * Variable is of type [godot.core.Transform2D].
   */
  final const val TYPE_TRANSFORM2D: Long = 8

  /**
   * Variable is of type [godot.core.Vector2].
   */
  final const val TYPE_VECTOR2: Long = 5

  /**
   * Variable is of type [godot.core.PoolVector2Array].
   */
  final const val TYPE_VECTOR2_ARRAY: Long = 24

  /**
   * Variable is of type [godot.core.Vector3].
   */
  final const val TYPE_VECTOR3: Long = 7

  /**
   * Variable is of type [godot.core.PoolVector3Array].
   */
  final const val TYPE_VECTOR3_ARRAY: Long = 25

  /**
   * Vertical bottom alignment, usually for text-derived classes.
   */
  final const val VALIGN_BOTTOM: Long = 2

  /**
   * Vertical center alignment, usually for text-derived classes.
   */
  final const val VALIGN_CENTER: Long = 1

  /**
   * Vertical top alignment, usually for text-derived classes.
   */
  final const val VALIGN_TOP: Long = 0

  /**
   * General vertical alignment, usually used for [godot.Separator], [godot.ScrollBar], [godot.Slider], etc.
   */
  final const val VERTICAL: Long = 1

  override fun __new() {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_GLOBALCONSTANTS)
  }

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true
}
