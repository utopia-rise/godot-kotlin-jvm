// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.Input
import godot.`annotation`.GodotBaseType
import godot.core.StringName
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
import godot.core.VariantType.STRING_NAME
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
import kotlin.Unit

/**
 * A singleton that deals with inputs.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/676](https://godotengine.org/asset-library/asset/676)
 *
 * A singleton that deals with inputs. This includes key presses, mouse buttons and movement, joypads, and input actions. Actions and their events can be set in the **Input Map** tab in the **Project > Project Settings**, or with the [godot.InputMap] class.
 */
@GodotBaseType
public object Input : Object() {
  /**
   * Emitted when a joypad device has been connected or disconnected.
   */
  public val joyConnectionChanged: Signal2<Long, Boolean> by signal("device", "connected")

  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINECLASS_INPUT)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Returns `true` if any action, key, joypad button, or mouse button is being pressed. This will also return `true` if any action is simulated via code by calling [actionPress].
   */
  public fun isAnythingPressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_IS_ANYTHING_PRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if you are pressing the key in the current keyboard layout. You can pass a [enum Key] constant.
   *
   * [isKeyPressed] is only recommended over [isPhysicalKeyPressed] in non-game applications. This ensures that shortcut keys behave as expected depending on the user's keyboard layout, as keyboard shortcuts are generally dependent on the keyboard layout in non-game applications. If in doubt, use [isPhysicalKeyPressed].
   *
   * **Note:** Due to keyboard ghosting, [isKeyPressed] may return `false` even if one of the action's keys is pressed. See [godot.Input examples]($DOCS_URL/tutorials/inputs/input_examples.html#keyboard-events) in the documentation for more information.
   */
  public fun isKeyPressed(keycode: Key): Boolean {
    TransferContext.writeArguments(LONG to keycode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_IS_KEY_PRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if you are pressing the key in the physical location on the 101/102-key US QWERTY keyboard. You can pass a [enum Key] constant.
   *
   * [isPhysicalKeyPressed] is recommended over [isKeyPressed] for in-game actions, as it will make [kbd]W[/kbd]/[kbd]A[/kbd]/[kbd]S[/kbd]/[kbd]D[/kbd] layouts work regardless of the user's keyboard layout. [isPhysicalKeyPressed] will also ensure that the top row number keys work on any keyboard layout. If in doubt, use [isPhysicalKeyPressed].
   *
   * **Note:** Due to keyboard ghosting, [isPhysicalKeyPressed] may return `false` even if one of the action's keys is pressed. See [godot.Input examples]($DOCS_URL/tutorials/inputs/input_examples.html#keyboard-events) in the documentation for more information.
   */
  public fun isPhysicalKeyPressed(keycode: Key): Boolean {
    TransferContext.writeArguments(LONG to keycode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_IS_PHYSICAL_KEY_PRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if you are pressing the mouse button specified with [enum MouseButton].
   */
  public fun isMouseButtonPressed(button: MouseButton): Boolean {
    TransferContext.writeArguments(LONG to button.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_IS_MOUSE_BUTTON_PRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if you are pressing the joypad button (see [enum JoyButton]).
   */
  public fun isJoyButtonPressed(device: Long, button: JoyButton): Boolean {
    TransferContext.writeArguments(LONG to device, LONG to button.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_IS_JOY_BUTTON_PRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if you are pressing the action event. Note that if an action has multiple buttons assigned and more than one of them is pressed, releasing one button will release the action, even if some other button assigned to this action is still pressed.
   *
   * If `exact_match` is `false`, it ignores additional input modifiers for [godot.InputEventKey] and [godot.InputEventMouseButton] events, and the direction for [godot.InputEventJoypadMotion] events.
   *
   * **Note:** Due to keyboard ghosting, [isActionPressed] may return `false` even if one of the action's keys is pressed. See [godot.Input examples]($DOCS_URL/tutorials/inputs/input_examples.html#keyboard-events) in the documentation for more information.
   */
  public fun isActionPressed(action: StringName, exactMatch: Boolean = false): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_IS_ACTION_PRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` when the user starts pressing the action event, meaning it's `true` only on the frame that the user pressed down the button.
   *
   * This is useful for code that needs to run only once when an action is pressed, instead of every frame while it's pressed.
   *
   * If `exact_match` is `false`, it ignores additional input modifiers for [godot.InputEventKey] and [godot.InputEventMouseButton] events, and the direction for [godot.InputEventJoypadMotion] events.
   *
   * **Note:** Due to keyboard ghosting, [isActionJustPressed] may return `false` even if one of the action's keys is pressed. See [godot.Input examples]($DOCS_URL/tutorials/inputs/input_examples.html#keyboard-events) in the documentation for more information.
   */
  public fun isActionJustPressed(action: StringName, exactMatch: Boolean = false): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_IS_ACTION_JUST_PRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` when the user stops pressing the action event, meaning it's `true` only on the frame that the user released the button.
   *
   * If `exact_match` is `false`, it ignores additional input modifiers for [godot.InputEventKey] and [godot.InputEventMouseButton] events, and the direction for [godot.InputEventJoypadMotion] events.
   */
  public fun isActionJustReleased(action: StringName, exactMatch: Boolean = false): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_IS_ACTION_JUST_RELEASED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns a value between 0 and 1 representing the intensity of the given action. In a joypad, for example, the further away the axis (analog sticks or L2, R2 triggers) is from the dead zone, the closer the value will be to 1. If the action is mapped to a control that has no axis as the keyboard, the value returned will be 0 or 1.
   *
   * If `exact_match` is `false`, it ignores additional input modifiers for [godot.InputEventKey] and [godot.InputEventMouseButton] events, and the direction for [godot.InputEventJoypadMotion] events.
   */
  public fun getActionStrength(action: StringName, exactMatch: Boolean = false): Double {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_ACTION_STRENGTH, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns a value between 0 and 1 representing the raw intensity of the given action, ignoring the action's deadzone. In most cases, you should use [getActionStrength] instead.
   *
   * If `exact_match` is `false`, it ignores additional input modifiers for [godot.InputEventKey] and [godot.InputEventMouseButton] events, and the direction for [godot.InputEventJoypadMotion] events.
   */
  public fun getActionRawStrength(action: StringName, exactMatch: Boolean = false): Double {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_ACTION_RAW_STRENGTH,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Get axis input by specifying two actions, one negative and one positive.
   *
   * This is a shorthand for writing `Input.get_action_strength("positive_action") - Input.get_action_strength("negative_action")`.
   */
  public fun getAxis(negativeAction: StringName, positiveAction: StringName): Double {
    TransferContext.writeArguments(STRING_NAME to negativeAction, STRING_NAME to positiveAction)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_AXIS, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Gets an input vector by specifying four actions for the positive and negative X and Y axes.
   *
   * This method is useful when getting vector input, such as from a joystick, directional pad, arrows, or WASD. The vector has its length limited to 1 and has a circular deadzone, which is useful for using vector input as movement.
   *
   * By default, the deadzone is automatically calculated from the average of the action deadzones. However, you can override the deadzone to be whatever you want (on the range of 0 to 1).
   */
  public fun getVector(
    negativeX: StringName,
    positiveX: StringName,
    negativeY: StringName,
    positiveY: StringName,
    deadzone: Double = -1.0
  ): Vector2 {
    TransferContext.writeArguments(STRING_NAME to negativeX, STRING_NAME to positiveX, STRING_NAME to negativeY, STRING_NAME to positiveY, DOUBLE to deadzone)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_VECTOR, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Adds a new mapping entry (in SDL2 format) to the mapping database. Optionally update already connected devices.
   */
  public fun addJoyMapping(mapping: String, updateExisting: Boolean = false): Unit {
    TransferContext.writeArguments(STRING to mapping, BOOL to updateExisting)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_ADD_JOY_MAPPING, NIL)
  }

  /**
   * Removes all mappings from the internal database that match the given GUID.
   */
  public fun removeJoyMapping(guid: String): Unit {
    TransferContext.writeArguments(STRING to guid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_REMOVE_JOY_MAPPING, NIL)
  }

  /**
   * Returns `true` if the system knows the specified device. This means that it sets all button and axis indices. Unknown joypads are not expected to match these constants, but you can still retrieve events from them.
   */
  public fun isJoyKnown(device: Long): Boolean {
    TransferContext.writeArguments(LONG to device)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_IS_JOY_KNOWN, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the current value of the joypad axis at given index (see [enum JoyAxis]).
   */
  public fun getJoyAxis(device: Long, axis: JoyAxis): Double {
    TransferContext.writeArguments(LONG to device, LONG to axis.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_JOY_AXIS, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the name of the joypad at the specified device index.
   */
  public fun getJoyName(device: Long): String {
    TransferContext.writeArguments(LONG to device)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_JOY_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns a SDL2-compatible device GUID on platforms that use gamepad remapping. Returns `"Default Gamepad"` otherwise.
   */
  public fun getJoyGuid(device: Long): String {
    TransferContext.writeArguments(LONG to device)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_JOY_GUID, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns an [godot.Array] containing the device IDs of all currently connected joypads.
   */
  public fun getConnectedJoypads(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_CONNECTED_JOYPADS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the strength of the joypad vibration: x is the strength of the weak motor, and y is the strength of the strong motor.
   */
  public fun getJoyVibrationStrength(device: Long): Vector2 {
    TransferContext.writeArguments(LONG to device)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_JOY_VIBRATION_STRENGTH,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the duration of the current vibration effect in seconds.
   */
  public fun getJoyVibrationDuration(device: Long): Double {
    TransferContext.writeArguments(LONG to device)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_JOY_VIBRATION_DURATION,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Starts to vibrate the joypad. Joypads usually come with two rumble motors, a strong and a weak one. `weak_magnitude` is the strength of the weak motor (between 0 and 1) and `strong_magnitude` is the strength of the strong motor (between 0 and 1). `duration` is the duration of the effect in seconds (a duration of 0 will try to play the vibration indefinitely).
   *
   * **Note:** Not every hardware is compatible with long effect durations; it is recommended to restart an effect if it has to be played for more than a few seconds.
   */
  public fun startJoyVibration(
    device: Long,
    weakMagnitude: Double,
    strongMagnitude: Double,
    duration: Double = 0.0
  ): Unit {
    TransferContext.writeArguments(LONG to device, DOUBLE to weakMagnitude, DOUBLE to strongMagnitude, DOUBLE to duration)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_START_JOY_VIBRATION, NIL)
  }

  /**
   * Stops the vibration of the joypad.
   */
  public fun stopJoyVibration(device: Long): Unit {
    TransferContext.writeArguments(LONG to device)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_STOP_JOY_VIBRATION, NIL)
  }

  /**
   * Vibrate Android and iOS devices.
   *
   * **Note:** For Android, it requires enabling the `VIBRATE` permission in the export preset.
   *
   * **Note:** For iOS, specifying the duration is supported in iOS 13 and later.
   */
  public fun vibrateHandheld(durationMs: Long = 500): Unit {
    TransferContext.writeArguments(LONG to durationMs)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_VIBRATE_HANDHELD, NIL)
  }

  /**
   * Returns the gravity in m/s² of the device's accelerometer sensor, if the device has one. Otherwise, the method returns [godot.Vector3.ZERO].
   *
   * **Note:** This method only works on Android and iOS. On other platforms, it always returns [godot.Vector3.ZERO].
   */
  public fun getGravity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_GRAVITY, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the acceleration in m/s² of the device's accelerometer sensor, if the device has one. Otherwise, the method returns [godot.Vector3.ZERO].
   *
   * Note this method returns an empty [godot.core.Vector3] when running from the editor even when your device has an accelerometer. You must export your project to a supported device to read values from the accelerometer.
   *
   * **Note:** This method only works on iOS, Android, and UWP. On other platforms, it always returns [godot.Vector3.ZERO].
   */
  public fun getAccelerometer(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_ACCELEROMETER, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the magnetic field strength in micro-Tesla for all axes of the device's magnetometer sensor, if the device has one. Otherwise, the method returns [godot.Vector3.ZERO].
   *
   * **Note:** This method only works on Android, iOS and UWP. On other platforms, it always returns [godot.Vector3.ZERO].
   */
  public fun getMagnetometer(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_MAGNETOMETER, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the rotation rate in rad/s around a device's X, Y, and Z axes of the gyroscope sensor, if the device has one. Otherwise, the method returns [godot.Vector3.ZERO].
   *
   * **Note:** This method only works on Android and iOS. On other platforms, it always returns [godot.Vector3.ZERO].
   */
  public fun getGyroscope(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_GYROSCOPE, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Sets the gravity value of the accelerometer sensor. Can be used for debugging on devices without a hardware sensor, for example in an editor on a PC.
   *
   * **Note:** This value can be immediately overwritten by the hardware sensor value on Android and iOS.
   */
  public fun setGravity(`value`: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_SET_GRAVITY, NIL)
  }

  /**
   * Sets the acceleration value of the accelerometer sensor. Can be used for debugging on devices without a hardware sensor, for example in an editor on a PC.
   *
   * **Note:** This value can be immediately overwritten by the hardware sensor value on Android and iOS.
   */
  public fun setAccelerometer(`value`: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_SET_ACCELEROMETER, NIL)
  }

  /**
   * Sets the value of the magnetic field of the magnetometer sensor. Can be used for debugging on devices without a hardware sensor, for example in an editor on a PC.
   *
   * **Note:** This value can be immediately overwritten by the hardware sensor value on Android and iOS.
   */
  public fun setMagnetometer(`value`: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_SET_MAGNETOMETER, NIL)
  }

  /**
   * Sets the value of the rotation rate of the gyroscope sensor. Can be used for debugging on devices without a hardware sensor, for example in an editor on a PC.
   *
   * **Note:** This value can be immediately overwritten by the hardware sensor value on Android and iOS.
   */
  public fun setGyroscope(`value`: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_SET_GYROSCOPE, NIL)
  }

  /**
   * Returns the last mouse velocity. To provide a precise and jitter-free velocity, mouse velocity is only calculated every 0.1s. Therefore, mouse velocity will lag mouse movements.
   */
  public fun getLastMouseVelocity(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_LAST_MOUSE_VELOCITY,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns mouse buttons as a bitmask. If multiple mouse buttons are pressed at the same time, the bits are added together.
   */
  public fun getMouseButtonMask(): MouseButton {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_MOUSE_BUTTON_MASK, LONG)
    return MouseButton.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets the mouse mode. See the constants for more information.
   */
  public fun setMouseMode(mode: Input.MouseMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_SET_MOUSE_MODE, NIL)
  }

  /**
   * Returns the mouse mode. See the constants for more information.
   */
  public fun getMouseMode(): Input.MouseMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_MOUSE_MODE, LONG)
    return Input.MouseMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets the mouse position to the specified vector, provided in pixels and relative to an origin at the upper left corner of the currently focused Window Manager game window.
   *
   * Mouse position is clipped to the limits of the screen resolution, or to the limits of the game window if [enum MouseMode] is set to `MOUSE_MODE_CONFINED` or `MOUSE_MODE_CONFINED_HIDDEN`.
   */
  public fun warpMouse(position: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_WARP_MOUSE, NIL)
  }

  /**
   * This will simulate pressing the specified action.
   *
   * The strength can be used for non-boolean actions, it's ranged between 0 and 1 representing the intensity of the given action.
   *
   * **Note:** This method will not cause any [godot.Node.Input] calls. It is intended to be used with [isActionPressed] and [isActionJustPressed]. If you want to simulate `_input`, use [parseInputEvent] instead.
   */
  public fun actionPress(action: StringName, strength: Double = 1.0): Unit {
    TransferContext.writeArguments(STRING_NAME to action, DOUBLE to strength)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_ACTION_PRESS, NIL)
  }

  /**
   * If the specified action is already pressed, this will release it.
   */
  public fun actionRelease(action: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_ACTION_RELEASE, NIL)
  }

  /**
   * Sets the default cursor shape to be used in the viewport instead of [CURSOR_ARROW].
   *
   * **Note:** If you want to change the default cursor shape for [godot.Control]'s nodes, use [godot.Control.mouseDefaultCursorShape] instead.
   *
   * **Note:** This method generates an [godot.InputEventMouseMotion] to update cursor immediately.
   */
  public fun setDefaultCursorShape(shape: Input.CursorShape = Input.CursorShape.CURSOR_ARROW):
      Unit {
    TransferContext.writeArguments(LONG to shape.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_SET_DEFAULT_CURSOR_SHAPE, NIL)
  }

  /**
   * Returns the currently assigned cursor shape (see [enum CursorShape]).
   */
  public fun getCurrentCursorShape(): Input.CursorShape {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_CURRENT_CURSOR_SHAPE,
        LONG)
    return Input.CursorShape.values()[TransferContext.readReturnValue(JVM_INT) as Int]
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
  public fun setCustomMouseCursor(
    image: Resource,
    shape: Input.CursorShape = Input.CursorShape.CURSOR_ARROW,
    hotspot: Vector2 = Vector2(0.0, 0.0)
  ): Unit {
    TransferContext.writeArguments(OBJECT to image, LONG to shape.id, VECTOR2 to hotspot)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_SET_CUSTOM_MOUSE_CURSOR, NIL)
  }

  /**
   * Feeds an [godot.InputEvent] to the game. Can be used to artificially trigger input events from code. Also generates [godot.Node.Input] calls.
   *
   * Example:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var cancel_event = InputEventAction.new()
   *
   * cancel_event.action = "ui_cancel"
   *
   * cancel_event.pressed = true
   *
   * Input.parse_input_event(cancel_event)
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var cancelEvent = new InputEventAction();
   *
   * cancelEvent.Action = "ui_cancel";
   *
   * cancelEvent.Pressed = true;
   *
   * Input.ParseInputEvent(cancelEvent);
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun parseInputEvent(event: InputEvent): Unit {
    TransferContext.writeArguments(OBJECT to event)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_PARSE_INPUT_EVENT, NIL)
  }

  /**
   * Enables or disables the accumulation of similar input events sent by the operating system. When input accumulation is enabled, all input events generated during a frame will be merged and emitted when the frame is done rendering. Therefore, this limits the number of input method calls per second to the rendering FPS.
   *
   * Input accumulation is enabled by default. It can be disabled to get slightly more precise/reactive input at the cost of increased CPU usage. In applications where drawing freehand lines is required, input accumulation should generally be disabled while the user is drawing the line to get results that closely follow the actual input.
   */
  public fun setUseAccumulatedInput(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_SET_USE_ACCUMULATED_INPUT,
        NIL)
  }

  /**
   * Sends all input events which are in the current buffer to the game loop. These events may have been buffered as a result of accumulated input ([setUseAccumulatedInput]) or agile input flushing ([godot.ProjectSettings.inputDevices/buffering/agileEventFlushing]).
   *
   * The engine will already do this itself at key execution points (at least once per frame). However, this can be useful in advanced cases where you want precise control over the timing of event handling.
   */
  public fun flushBufferedEvents(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_FLUSH_BUFFERED_EVENTS, NIL)
  }

  public enum class MouseMode(
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
     * Confines the mouse cursor to the game window, and make it visible.
     */
    MOUSE_MODE_CONFINED(3),
    /**
     * Confines the mouse cursor to the game window, and make it hidden.
     */
    MOUSE_MODE_CONFINED_HIDDEN(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CursorShape(
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
     *
     * **Note:** Windows lacks a dragging cursor, so [CURSOR_DRAG] is the same as [CURSOR_MOVE] for this platform.
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
    CURSOR_HELP(16),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }
}
