// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.Input
import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * A singleton that deals with inputs.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/inputs/index.html](https://docs.godotengine.org/en/latest/tutorials/inputs/index.html)
 *
 * A singleton that deals with inputs. This includes key presses, mouse buttons and movement, joypads, and input actions. Actions and their events can be set in the **Input Map** tab in the **Project > Project Settings**, or with the [godot.InputMap] class.
 */
@GodotBaseType
object Input : Object() {
  /**
   * Arrow cursor. Standard, default pointing cursor.
   */
  final const val CURSOR_ARROW: Long = 0

  /**
   * Window resize mouse cursor. The cursor is a double-headed arrow that goes from the bottom left to the top right. It tells the user they can resize the window or the panel both horizontally and vertically.
   */
  final const val CURSOR_BDIAGSIZE: Long = 11

  /**
   * Busy cursor. Indicates that the application is busy performing an operation. This cursor shape denotes that the application isn't usable during the operation (e.g. something is blocking its main thread).
   */
  final const val CURSOR_BUSY: Long = 5

  /**
   * Can drop cursor. Usually displayed when dragging something to indicate that it can be dropped at the current position.
   */
  final const val CURSOR_CAN_DROP: Long = 7

  /**
   * Cross cursor. Typically appears over regions in which a drawing operation can be performed or for selections.
   */
  final const val CURSOR_CROSS: Long = 3

  /**
   * Drag cursor. Usually displayed when dragging something.
   */
  final const val CURSOR_DRAG: Long = 6

  /**
   * Window resize mouse cursor. The cursor is a double-headed arrow that goes from the top left to the bottom right, the opposite of [CURSOR_BDIAGSIZE]. It tells the user they can resize the window or the panel both horizontally and vertically.
   */
  final const val CURSOR_FDIAGSIZE: Long = 12

  /**
   * Forbidden cursor. Indicates that the current action is forbidden (for example, when dragging something) or that the control at a position is disabled.
   */
  final const val CURSOR_FORBIDDEN: Long = 8

  /**
   * Help cursor. Usually a question mark.
   */
  final const val CURSOR_HELP: Long = 16

  /**
   * Horizontal resize mouse cursor. A double-headed horizontal arrow. It tells the user they can resize the window or the panel horizontally.
   */
  final const val CURSOR_HSIZE: Long = 10

  /**
   * Horizontal split mouse cursor. On Windows, it's the same as [CURSOR_HSIZE].
   */
  final const val CURSOR_HSPLIT: Long = 15

  /**
   * I-beam cursor. Usually used to show where the text cursor will appear when the mouse is clicked.
   */
  final const val CURSOR_IBEAM: Long = 1

  /**
   * Move cursor. Indicates that something can be moved.
   */
  final const val CURSOR_MOVE: Long = 13

  /**
   * Pointing hand cursor. Usually used to indicate the pointer is over a link or other interactable item.
   */
  final const val CURSOR_POINTING_HAND: Long = 2

  /**
   * Vertical resize mouse cursor. A double-headed vertical arrow. It tells the user they can resize the window or the panel vertically.
   */
  final const val CURSOR_VSIZE: Long = 9

  /**
   * Vertical split mouse cursor. On Windows, it's the same as [CURSOR_VSIZE].
   */
  final const val CURSOR_VSPLIT: Long = 14

  /**
   * Wait cursor. Indicates that the application is busy performing an operation. This cursor shape denotes that the application is still usable during the operation.
   */
  final const val CURSOR_WAIT: Long = 4

  /**
   * Captures the mouse. The mouse will be hidden and its position locked at the center of the screen.
   *
   * **Note:** If you want to process the mouse's movement in this mode, you need to use [godot.InputEventMouseMotion.relative].
   */
  final const val MOUSE_MODE_CAPTURED: Long = 2

  /**
   * Makes the mouse cursor visible but confines it to the game window.
   */
  final const val MOUSE_MODE_CONFINED: Long = 3

  /**
   * Makes the mouse cursor hidden if it is visible.
   */
  final const val MOUSE_MODE_HIDDEN: Long = 1

  /**
   * Makes the mouse cursor visible if it is hidden.
   */
  final const val MOUSE_MODE_VISIBLE: Long = 0

  /**
   * Emitted when a joypad device has been connected or disconnected.
   */
  val joyConnectionChanged: Signal2<Long, Boolean> by signal("device", "connected")

  override fun __new() {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_INPUT)
  }

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * This will simulate pressing the specified action.
   *
   * The strength can be used for non-boolean actions, it's ranged between 0 and 1 representing the intensity of the given action.
   *
   * **Note:** This method will not cause any [godot.Node.Input] calls. It is intended to be used with [isActionPressed] and [isActionJustPressed]. If you want to simulate `_input`, use [parseInputEvent] instead.
   */
  fun actionPress(action: String, strength: Double = 1.0) {
    TransferContext.writeArguments(STRING to action, DOUBLE to strength)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_ACTION_PRESS, NIL)
  }

  /**
   * If the specified action is already pressed, this will release it.
   */
  fun actionRelease(action: String) {
    TransferContext.writeArguments(STRING to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_ACTION_RELEASE, NIL)
  }

  /**
   * Adds a new mapping entry (in SDL2 format) to the mapping database. Optionally update already connected devices.
   */
  fun addJoyMapping(mapping: String, updateExisting: Boolean = false) {
    TransferContext.writeArguments(STRING to mapping, BOOL to updateExisting)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_ADD_JOY_MAPPING, NIL)
  }

  /**
   * Returns the acceleration of the device's accelerometer, if the device has one. Otherwise, the method returns [godot.Vector3.ZERO].
   *
   * Note this method returns an empty [godot.core.Vector3] when running from the editor even when your device has an accelerometer. You must export your project to a supported device to read values from the accelerometer.
   *
   * **Note:** This method only works on iOS, Android, and UWP. On other platforms, it always returns [godot.Vector3.ZERO].
   */
  fun getAccelerometer(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_ACCELEROMETER, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns a value between 0 and 1 representing the intensity of the given action. In a joypad, for example, the further away the axis (analog sticks or L2, R2 triggers) is from the dead zone, the closer the value will be to 1. If the action is mapped to a control that has no axis as the keyboard, the value returned will be 0 or 1.
   */
  fun getActionStrength(action: String): Double {
    TransferContext.writeArguments(STRING to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_ACTION_STRENGTH, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns an [godot.Array] containing the device IDs of all currently connected joypads.
   */
  fun getConnectedJoypads(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_CONNECTED_JOYPADS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the currently assigned cursor shape (see [enum CursorShape]).
   */
  fun getCurrentCursorShape(): Input.CursorShape {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_CURRENT_CURSOR_SHAPE,
        LONG)
    return Input.CursorShape.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the gravity of the device's accelerometer, if the device has one. Otherwise, the method returns [godot.Vector3.ZERO].
   *
   * **Note:** This method only works on Android and iOS. On other platforms, it always returns [godot.Vector3.ZERO].
   */
  fun getGravity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_GRAVITY, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the rotation rate in rad/s around a device's X, Y, and Z axes of the gyroscope, if the device has one. Otherwise, the method returns [godot.Vector3.ZERO].
   *
   * **Note:** This method only works on Android. On other platforms, it always returns [godot.Vector3.ZERO].
   */
  fun getGyroscope(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_GYROSCOPE, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the current value of the joypad axis at given index (see [enum JoystickList]).
   */
  fun getJoyAxis(device: Long, axis: Long): Double {
    TransferContext.writeArguments(LONG to device, LONG to axis)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_JOY_AXIS, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the index of the provided axis name.
   */
  fun getJoyAxisIndexFromString(axis: String): Long {
    TransferContext.writeArguments(STRING to axis)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INPUT_GET_JOY_AXIS_INDEX_FROM_STRING, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Receives a [enum JoystickList] axis and returns its equivalent name as a string.
   */
  fun getJoyAxisString(axisIndex: Long): String {
    TransferContext.writeArguments(LONG to axisIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_JOY_AXIS_STRING, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the index of the provided button name.
   */
  fun getJoyButtonIndexFromString(button: String): Long {
    TransferContext.writeArguments(STRING to button)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INPUT_GET_JOY_BUTTON_INDEX_FROM_STRING, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Receives a gamepad button from [enum JoystickList] and returns its equivalent name as a string.
   */
  fun getJoyButtonString(buttonIndex: Long): String {
    TransferContext.writeArguments(LONG to buttonIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_JOY_BUTTON_STRING, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns a SDL2-compatible device GUID on platforms that use gamepad remapping. Returns `"Default Gamepad"` otherwise.
   */
  fun getJoyGuid(device: Long): String {
    TransferContext.writeArguments(LONG to device)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_JOY_GUID, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the name of the joypad at the specified device index.
   */
  fun getJoyName(device: Long): String {
    TransferContext.writeArguments(LONG to device)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_JOY_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the duration of the current vibration effect in seconds.
   */
  fun getJoyVibrationDuration(device: Long): Double {
    TransferContext.writeArguments(LONG to device)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_JOY_VIBRATION_DURATION,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the strength of the joypad vibration: x is the strength of the weak motor, and y is the strength of the strong motor.
   */
  fun getJoyVibrationStrength(device: Long): Vector2 {
    TransferContext.writeArguments(LONG to device)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_JOY_VIBRATION_STRENGTH,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the mouse speed for the last time the cursor was moved, and this until the next frame where the mouse moves. This means that even if the mouse is not moving, this function will still return the value of the last motion.
   */
  fun getLastMouseSpeed(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_LAST_MOUSE_SPEED, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the the magnetic field strength in micro-Tesla for all axes of the device's magnetometer, if the device has one. Otherwise, the method returns [godot.Vector3.ZERO].
   *
   * **Note:** This method only works on Android and UWP. On other platforms, it always returns [godot.Vector3.ZERO].
   */
  fun getMagnetometer(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_MAGNETOMETER, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns mouse buttons as a bitmask. If multiple mouse buttons are pressed at the same time, the bits are added together.
   */
  fun getMouseButtonMask(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_MOUSE_BUTTON_MASK, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the mouse mode. See the constants for more information.
   */
  fun getMouseMode(): Input.MouseMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_MOUSE_MODE, LONG)
    return Input.MouseMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns `true` when the user starts pressing the action event, meaning it's `true` only on the frame that the user pressed down the button.
   *
   * This is useful for code that needs to run only once when an action is pressed, instead of every frame while it's pressed.
   */
  fun isActionJustPressed(action: String): Boolean {
    TransferContext.writeArguments(STRING to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_IS_ACTION_JUST_PRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` when the user stops pressing the action event, meaning it's `true` only on the frame that the user released the button.
   */
  fun isActionJustReleased(action: String): Boolean {
    TransferContext.writeArguments(STRING to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_IS_ACTION_JUST_RELEASED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if you are pressing the action event. Note that if an action has multiple buttons assigned and more than one of them is pressed, releasing one button will release the action, even if some other button assigned to this action is still pressed.
   */
  fun isActionPressed(action: String): Boolean {
    TransferContext.writeArguments(STRING to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_IS_ACTION_PRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if you are pressing the joypad button (see [enum JoystickList]).
   */
  fun isJoyButtonPressed(device: Long, button: Long): Boolean {
    TransferContext.writeArguments(LONG to device, LONG to button)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_IS_JOY_BUTTON_PRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the system knows the specified device. This means that it sets all button and axis indices exactly as defined in [enum JoystickList]. Unknown joypads are not expected to match these constants, but you can still retrieve events from them.
   */
  fun isJoyKnown(device: Long): Boolean {
    TransferContext.writeArguments(LONG to device)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_IS_JOY_KNOWN, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if you are pressing the key. You can pass a [enum KeyList] constant.
   */
  fun isKeyPressed(scancode: Long): Boolean {
    TransferContext.writeArguments(LONG to scancode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_IS_KEY_PRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if you are pressing the mouse button specified with [enum ButtonList].
   */
  fun isMouseButtonPressed(button: Long): Boolean {
    TransferContext.writeArguments(LONG to button)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_IS_MOUSE_BUTTON_PRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Notifies the [godot.Input] singleton that a connection has changed, to update the state for the `device` index.
   *
   * This is used internally and should not have to be called from user scripts. See [joyConnectionChanged] for the signal emitted when this is triggered internally.
   */
  fun joyConnectionChanged(
    device: Long,
    connected: Boolean,
    name: String,
    guid: String
  ) {
    TransferContext.writeArguments(LONG to device, BOOL to connected, STRING to name, STRING to
        guid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_JOY_CONNECTION_CHANGED, NIL)
  }

  /**
   * Feeds an [godot.InputEvent] to the game. Can be used to artificially trigger input events from code. Also generates [godot.Node.Input] calls.
   *
   * Example:
   *
   * ```
   * 				var a = InputEventAction.new()
   * 				a.action = "ui_cancel"
   * 				a.pressed = true
   * 				Input.parse_input_event(a)
   * 				```
   */
  fun parseInputEvent(event: InputEvent) {
    TransferContext.writeArguments(OBJECT to event)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_PARSE_INPUT_EVENT, NIL)
  }

  /**
   * Removes all mappings from the internal database that match the given GUID.
   */
  fun removeJoyMapping(guid: String) {
    TransferContext.writeArguments(STRING to guid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_REMOVE_JOY_MAPPING, NIL)
  }

  /**
   * Sets a custom mouse cursor image, which is only visible inside the game window. The hotspot can also be specified. Passing `null` to the image parameter resets to the system cursor. See [enum CursorShape] for the list of shapes.
   *
   * `image`'s size must be lower than 256×256.
   *
   * `hotspot` must be within `image`'s size.
   *
   * **Note:** [godot.AnimatedTexture]s aren't supported as custom mouse cursors. If using an [godot.AnimatedTexture], only the first frame will be displayed.
   *
   * **Note:** Only images imported with the **Lossless**, **Lossy** or **Uncompressed** compression modes are supported. The **Video RAM** compression mode can't be used for custom cursors.
   */
  fun setCustomMouseCursor(
    image: Resource,
    shape: Long = 0,
    hotspot: Vector2 = Vector2(0.0, 0.0)
  ) {
    TransferContext.writeArguments(OBJECT to image, LONG to shape, VECTOR2 to hotspot)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_SET_CUSTOM_MOUSE_CURSOR, NIL)
  }

  /**
   * Sets the default cursor shape to be used in the viewport instead of [CURSOR_ARROW].
   *
   * **Note:** If you want to change the default cursor shape for [godot.Control]'s nodes, use [godot.Control.mouseDefaultCursorShape] instead.
   *
   * **Note:** This method generates an [godot.InputEventMouseMotion] to update cursor immediately.
   */
  fun setDefaultCursorShape(shape: Long = 0) {
    TransferContext.writeArguments(LONG to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_SET_DEFAULT_CURSOR_SHAPE, NIL)
  }

  /**
   * Sets the mouse mode. See the constants for more information.
   */
  fun setMouseMode(mode: Long) {
    TransferContext.writeArguments(LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_SET_MOUSE_MODE, NIL)
  }

  /**
   * Enables or disables the accumulation of similar input events sent by the operating system. When input accumulation is enabled, all input events generated during a frame will be merged and emitted when the frame is done rendering. Therefore, this limits the number of input method calls per second to the rendering FPS.
   *
   * Input accumulation is enabled by default. It can be disabled to get slightly more precise/reactive input at the cost of increased CPU usage. In applications where drawing freehand lines is required, input accumulation should generally be disabled while the user is drawing the line to get results that closely follow the actual input.
   */
  fun setUseAccumulatedInput(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_SET_USE_ACCUMULATED_INPUT,
        NIL)
  }

  /**
   * Starts to vibrate the joypad. Joypads usually come with two rumble motors, a strong and a weak one. `weak_magnitude` is the strength of the weak motor (between 0 and 1) and `strong_magnitude` is the strength of the strong motor (between 0 and 1). `duration` is the duration of the effect in seconds (a duration of 0 will try to play the vibration indefinitely).
   *
   * **Note:** Not every hardware is compatible with long effect durations; it is recommended to restart an effect if it has to be played for more than a few seconds.
   */
  fun startJoyVibration(
    device: Long,
    weakMagnitude: Double,
    strongMagnitude: Double,
    duration: Double = 0.0
  ) {
    TransferContext.writeArguments(LONG to device, DOUBLE to weakMagnitude, DOUBLE to
        strongMagnitude, DOUBLE to duration)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_START_JOY_VIBRATION, NIL)
  }

  /**
   * Stops the vibration of the joypad.
   */
  fun stopJoyVibration(device: Long) {
    TransferContext.writeArguments(LONG to device)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_STOP_JOY_VIBRATION, NIL)
  }

  /**
   * Vibrate Android and iOS devices.
   *
   * **Note:** It needs VIBRATE permission for Android at export settings. iOS does not support duration.
   */
  fun vibrateHandheld(durationMs: Long = 500) {
    TransferContext.writeArguments(LONG to durationMs)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_VIBRATE_HANDHELD, NIL)
  }

  /**
   * Sets the mouse position to the specified vector.
   */
  fun warpMousePosition(to: Vector2) {
    TransferContext.writeArguments(VECTOR2 to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_WARP_MOUSE_POSITION, NIL)
  }

  enum class MouseMode(
    id: Long
  ) {
    /**
     * Makes the mouse cursor visible if it is hidden.
     */
    MOUSE_MODE_VISIBLE(0),

    /**
     * Makes the mouse cursor hidden if it is visible.
     */
    MOUSE_MODE_HIDDEN(1),

    /**
     * Captures the mouse. The mouse will be hidden and its position locked at the center of the screen.
     *
     * **Note:** If you want to process the mouse's movement in this mode, you need to use [godot.InputEventMouseMotion.relative].
     */
    MOUSE_MODE_CAPTURED(2),

    /**
     * Makes the mouse cursor visible but confines it to the game window.
     */
    MOUSE_MODE_CONFINED(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CursorShape(
    id: Long
  ) {
    /**
     * Arrow cursor. Standard, default pointing cursor.
     */
    CURSOR_ARROW(0),

    /**
     * I-beam cursor. Usually used to show where the text cursor will appear when the mouse is clicked.
     */
    CURSOR_IBEAM(1),

    /**
     * Pointing hand cursor. Usually used to indicate the pointer is over a link or other interactable item.
     */
    CURSOR_POINTING_HAND(2),

    /**
     * Cross cursor. Typically appears over regions in which a drawing operation can be performed or for selections.
     */
    CURSOR_CROSS(3),

    /**
     * Wait cursor. Indicates that the application is busy performing an operation. This cursor shape denotes that the application is still usable during the operation.
     */
    CURSOR_WAIT(4),

    /**
     * Busy cursor. Indicates that the application is busy performing an operation. This cursor shape denotes that the application isn't usable during the operation (e.g. something is blocking its main thread).
     */
    CURSOR_BUSY(5),

    /**
     * Drag cursor. Usually displayed when dragging something.
     */
    CURSOR_DRAG(6),

    /**
     * Can drop cursor. Usually displayed when dragging something to indicate that it can be dropped at the current position.
     */
    CURSOR_CAN_DROP(7),

    /**
     * Forbidden cursor. Indicates that the current action is forbidden (for example, when dragging something) or that the control at a position is disabled.
     */
    CURSOR_FORBIDDEN(8),

    /**
     * Vertical resize mouse cursor. A double-headed vertical arrow. It tells the user they can resize the window or the panel vertically.
     */
    CURSOR_VSIZE(9),

    /**
     * Horizontal resize mouse cursor. A double-headed horizontal arrow. It tells the user they can resize the window or the panel horizontally.
     */
    CURSOR_HSIZE(10),

    /**
     * Window resize mouse cursor. The cursor is a double-headed arrow that goes from the bottom left to the top right. It tells the user they can resize the window or the panel both horizontally and vertically.
     */
    CURSOR_BDIAGSIZE(11),

    /**
     * Window resize mouse cursor. The cursor is a double-headed arrow that goes from the top left to the bottom right, the opposite of [CURSOR_BDIAGSIZE]. It tells the user they can resize the window or the panel both horizontally and vertically.
     */
    CURSOR_FDIAGSIZE(12),

    /**
     * Move cursor. Indicates that something can be moved.
     */
    CURSOR_MOVE(13),

    /**
     * Vertical split mouse cursor. On Windows, it's the same as [CURSOR_VSIZE].
     */
    CURSOR_VSPLIT(14),

    /**
     * Horizontal split mouse cursor. On Windows, it's the same as [CURSOR_HSIZE].
     */
    CURSOR_HSPLIT(15),

    /**
     * Help cursor. Usually a question mark.
     */
    CURSOR_HELP(16);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }
}
