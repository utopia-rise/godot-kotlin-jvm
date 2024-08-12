// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.MouseButtonMaskValue
import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * The [Input] singleton handles key presses, mouse buttons and movement, gamepads, and input
 * actions. Actions and their events can be set in the **Input Map** tab in **Project > Project
 * Settings**, or with the [InputMap] class.
 * **Note:** [Input]'s methods reflect the global input state and are not affected by
 * [Control.acceptEvent] or [Viewport.setInputAsHandled], as those methods only deal with the way input
 * is propagated in the [SceneTree].
 */
@GodotBaseType
public object Input : Object() {
  /**
   * Emitted when a joypad device has been connected or disconnected.
   */
  public val joyConnectionChanged: Signal2<Long, Boolean> by signal("device", "connected")

  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_INPUT)
    return false
  }

  /**
   * Returns `true` if any action, key, joypad button, or mouse button is being pressed. This will
   * also return `true` if any action is simulated via code by calling [actionPress].
   */
  public fun isAnythingPressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isAnythingPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if you are pressing the Latin key in the current keyboard layout. You can pass a
   * [Key] constant.
   * [isKeyPressed] is only recommended over [isPhysicalKeyPressed] in non-game applications. This
   * ensures that shortcut keys behave as expected depending on the user's keyboard layout, as keyboard
   * shortcuts are generally dependent on the keyboard layout in non-game applications. If in doubt,
   * use [isPhysicalKeyPressed].
   * **Note:** Due to keyboard ghosting, [isKeyPressed] may return `false` even if one of the
   * action's keys is pressed. See
   * [url=$DOCS_URL/tutorials/inputs/input_examples.html#keyboard-events]Input examples[/url] in the
   * documentation for more information.
   */
  public fun isKeyPressed(keycode: Key): Boolean {
    TransferContext.writeArguments(LONG to keycode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.isKeyPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if you are pressing the key in the physical location on the 101/102-key US
   * QWERTY keyboard. You can pass a [Key] constant.
   * [isPhysicalKeyPressed] is recommended over [isKeyPressed] for in-game actions, as it will make
   * [kbd]W[/kbd]/[kbd]A[/kbd]/[kbd]S[/kbd]/[kbd]D[/kbd] layouts work regardless of the user's keyboard
   * layout. [isPhysicalKeyPressed] will also ensure that the top row number keys work on any keyboard
   * layout. If in doubt, use [isPhysicalKeyPressed].
   * **Note:** Due to keyboard ghosting, [isPhysicalKeyPressed] may return `false` even if one of
   * the action's keys is pressed. See
   * [url=$DOCS_URL/tutorials/inputs/input_examples.html#keyboard-events]Input examples[/url] in the
   * documentation for more information.
   */
  public fun isPhysicalKeyPressed(keycode: Key): Boolean {
    TransferContext.writeArguments(LONG to keycode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.isPhysicalKeyPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if you are pressing the key with the [keycode] printed on it. You can pass a
   * [Key] constant or any Unicode character code.
   */
  public fun isKeyLabelPressed(keycode: Key): Boolean {
    TransferContext.writeArguments(LONG to keycode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.isKeyLabelPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if you are pressing the mouse button specified with [MouseButton].
   */
  public fun isMouseButtonPressed(button: MouseButton): Boolean {
    TransferContext.writeArguments(LONG to button.id)
    TransferContext.callMethod(rawPtr, MethodBindings.isMouseButtonPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if you are pressing the joypad button (see [JoyButton]).
   */
  public fun isJoyButtonPressed(device: Int, button: JoyButton): Boolean {
    TransferContext.writeArguments(LONG to device.toLong(), LONG to button.id)
    TransferContext.callMethod(rawPtr, MethodBindings.isJoyButtonPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if you are pressing the action event.
   * If [exactMatch] is `false`, it ignores additional input modifiers for [InputEventKey] and
   * [InputEventMouseButton] events, and the direction for [InputEventJoypadMotion] events.
   * **Note:** Due to keyboard ghosting, [isActionPressed] may return `false` even if one of the
   * action's keys is pressed. See
   * [url=$DOCS_URL/tutorials/inputs/input_examples.html#keyboard-events]Input examples[/url] in the
   * documentation for more information.
   */
  @JvmOverloads
  public fun isActionPressed(action: StringName, exactMatch: Boolean = false): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, MethodBindings.isActionPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` when the user has *started* pressing the action event in the current frame or
   * physics tick. It will only return `true` on the frame or tick that the user pressed down the
   * button.
   * This is useful for code that needs to run only once when an action is pressed, instead of every
   * frame while it's pressed.
   * If [exactMatch] is `false`, it ignores additional input modifiers for [InputEventKey] and
   * [InputEventMouseButton] events, and the direction for [InputEventJoypadMotion] events.
   * **Note:** Returning `true` does not imply that the action is *still* pressed. An action can be
   * pressed and released again rapidly, and `true` will still be returned so as not to miss input.
   * **Note:** Due to keyboard ghosting, [isActionJustPressed] may return `false` even if one of the
   * action's keys is pressed. See
   * [url=$DOCS_URL/tutorials/inputs/input_examples.html#keyboard-events]Input examples[/url] in the
   * documentation for more information.
   * **Note:** During input handling (e.g. [Node.Input]), use [InputEvent.isActionPressed] instead
   * to query the action state of the current event.
   */
  @JvmOverloads
  public fun isActionJustPressed(action: StringName, exactMatch: Boolean = false): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, MethodBindings.isActionJustPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` when the user *stops* pressing the action event in the current frame or physics
   * tick. It will only return `true` on the frame or tick that the user releases the button.
   * **Note:** Returning `true` does not imply that the action is *still* not pressed. An action can
   * be released and pressed again rapidly, and `true` will still be returned so as not to miss input.
   * If [exactMatch] is `false`, it ignores additional input modifiers for [InputEventKey] and
   * [InputEventMouseButton] events, and the direction for [InputEventJoypadMotion] events.
   * **Note:** During input handling (e.g. [Node.Input]), use [InputEvent.isActionReleased] instead
   * to query the action state of the current event.
   */
  @JvmOverloads
  public fun isActionJustReleased(action: StringName, exactMatch: Boolean = false): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, MethodBindings.isActionJustReleasedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns a value between 0 and 1 representing the intensity of the given action. In a joypad,
   * for example, the further away the axis (analog sticks or L2, R2 triggers) is from the dead zone,
   * the closer the value will be to 1. If the action is mapped to a control that has no axis such as
   * the keyboard, the value returned will be 0 or 1.
   * If [exactMatch] is `false`, it ignores additional input modifiers for [InputEventKey] and
   * [InputEventMouseButton] events, and the direction for [InputEventJoypadMotion] events.
   */
  @JvmOverloads
  public fun getActionStrength(action: StringName, exactMatch: Boolean = false): Float {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, MethodBindings.getActionStrengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns a value between 0 and 1 representing the raw intensity of the given action, ignoring
   * the action's deadzone. In most cases, you should use [getActionStrength] instead.
   * If [exactMatch] is `false`, it ignores additional input modifiers for [InputEventKey] and
   * [InputEventMouseButton] events, and the direction for [InputEventJoypadMotion] events.
   */
  @JvmOverloads
  public fun getActionRawStrength(action: StringName, exactMatch: Boolean = false): Float {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, MethodBindings.getActionRawStrengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Get axis input by specifying two actions, one negative and one positive.
   * This is a shorthand for writing `Input.get_action_strength("positive_action") -
   * Input.get_action_strength("negative_action")`.
   */
  public fun getAxis(negativeAction: StringName, positiveAction: StringName): Float {
    TransferContext.writeArguments(STRING_NAME to negativeAction, STRING_NAME to positiveAction)
    TransferContext.callMethod(rawPtr, MethodBindings.getAxisPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Gets an input vector by specifying four actions for the positive and negative X and Y axes.
   * This method is useful when getting vector input, such as from a joystick, directional pad,
   * arrows, or WASD. The vector has its length limited to 1 and has a circular deadzone, which is
   * useful for using vector input as movement.
   * By default, the deadzone is automatically calculated from the average of the action deadzones.
   * However, you can override the deadzone to be whatever you want (on the range of 0 to 1).
   */
  @JvmOverloads
  public fun getVector(
    negativeX: StringName,
    positiveX: StringName,
    negativeY: StringName,
    positiveY: StringName,
    deadzone: Float = -1.0f,
  ): Vector2 {
    TransferContext.writeArguments(STRING_NAME to negativeX, STRING_NAME to positiveX, STRING_NAME to negativeY, STRING_NAME to positiveY, DOUBLE to deadzone.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.getVectorPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Adds a new mapping entry (in SDL2 format) to the mapping database. Optionally update already
   * connected devices.
   */
  @JvmOverloads
  public fun addJoyMapping(mapping: String, updateExisting: Boolean = false): Unit {
    TransferContext.writeArguments(STRING to mapping, BOOL to updateExisting)
    TransferContext.callMethod(rawPtr, MethodBindings.addJoyMappingPtr, NIL)
  }

  /**
   * Removes all mappings from the internal database that match the given GUID.
   */
  public fun removeJoyMapping(guid: String): Unit {
    TransferContext.writeArguments(STRING to guid)
    TransferContext.callMethod(rawPtr, MethodBindings.removeJoyMappingPtr, NIL)
  }

  /**
   * Returns `true` if the system knows the specified device. This means that it sets all button and
   * axis indices. Unknown joypads are not expected to match these constants, but you can still
   * retrieve events from them.
   */
  public fun isJoyKnown(device: Int): Boolean {
    TransferContext.writeArguments(LONG to device.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isJoyKnownPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the current value of the joypad axis at given index (see [JoyAxis]).
   */
  public fun getJoyAxis(device: Int, axis: JoyAxis): Float {
    TransferContext.writeArguments(LONG to device.toLong(), LONG to axis.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getJoyAxisPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the name of the joypad at the specified device index, e.g. `PS4 Controller`. Godot uses
   * the [url=https://github.com/gabomdq/SDL_GameControllerDB]SDL2 game controller database[/url] to
   * determine gamepad names.
   */
  public fun getJoyName(device: Int): String {
    TransferContext.writeArguments(LONG to device.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getJoyNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns a SDL2-compatible device GUID on platforms that use gamepad remapping, e.g.
   * `030000004c050000c405000000010000`. Returns `"Default Gamepad"` otherwise. Godot uses the
   * [url=https://github.com/gabomdq/SDL_GameControllerDB]SDL2 game controller database[/url] to
   * determine gamepad names and mappings based on this GUID.
   */
  public fun getJoyGuid(device: Int): String {
    TransferContext.writeArguments(LONG to device.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getJoyGuidPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns a dictionary with extra platform-specific information about the device, e.g. the raw
   * gamepad name from the OS or the Steam Input index.
   * On Windows the dictionary contains the following fields:
   * `xinput_index`: The index of the controller in the XInput system.
   * On Linux:
   * `raw_name`: The name of the controller as it came from the OS, before getting renamed by the
   * godot controller database.
   * `vendor_id`: The USB vendor ID of the device.
   * `product_id`: The USB product ID of the device.
   * `steam_input_index`: The Steam Input gamepad index, if the device is not a Steam Input device
   * this key won't be present.
   */
  public fun getJoyInfo(device: Int): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to device.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getJoyInfoPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Queries whether an input device should be ignored or not. Devices can be ignored by setting the
   * environment variable `SDL_GAMECONTROLLER_IGNORE_DEVICES`. Read the
   * [url=https://wiki.libsdl.org/SDL2]SDL documentation[/url] for more information.
   * **Note:** Some 3rd party tools can contribute to the list of ignored devices. For example,
   * *SteamInput* creates virtual devices from physical devices for remapping purposes. To avoid
   * handling the same input device twice, the original device is added to the ignore list.
   */
  public fun shouldIgnoreDevice(vendorId: Int, productId: Int): Boolean {
    TransferContext.writeArguments(LONG to vendorId.toLong(), LONG to productId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.shouldIgnoreDevicePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns an [Array] containing the device IDs of all currently connected joypads.
   */
  public fun getConnectedJoypads(): VariantArray<Long> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectedJoypadsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Long>)
  }

  /**
   * Returns the strength of the joypad vibration: x is the strength of the weak motor, and y is the
   * strength of the strong motor.
   */
  public fun getJoyVibrationStrength(device: Int): Vector2 {
    TransferContext.writeArguments(LONG to device.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getJoyVibrationStrengthPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the duration of the current vibration effect in seconds.
   */
  public fun getJoyVibrationDuration(device: Int): Float {
    TransferContext.writeArguments(LONG to device.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getJoyVibrationDurationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Starts to vibrate the joypad. Joypads usually come with two rumble motors, a strong and a weak
   * one. [weakMagnitude] is the strength of the weak motor (between 0 and 1) and [strongMagnitude] is
   * the strength of the strong motor (between 0 and 1). [duration] is the duration of the effect in
   * seconds (a duration of 0 will try to play the vibration indefinitely). The vibration can be
   * stopped early by calling [stopJoyVibration].
   * **Note:** Not every hardware is compatible with long effect durations; it is recommended to
   * restart an effect if it has to be played for more than a few seconds.
   */
  @JvmOverloads
  public fun startJoyVibration(
    device: Int,
    weakMagnitude: Float,
    strongMagnitude: Float,
    duration: Float = 0.0f,
  ): Unit {
    TransferContext.writeArguments(LONG to device.toLong(), DOUBLE to weakMagnitude.toDouble(), DOUBLE to strongMagnitude.toDouble(), DOUBLE to duration.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.startJoyVibrationPtr, NIL)
  }

  /**
   * Stops the vibration of the joypad started with [startJoyVibration].
   */
  public fun stopJoyVibration(device: Int): Unit {
    TransferContext.writeArguments(LONG to device.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.stopJoyVibrationPtr, NIL)
  }

  /**
   * Vibrate the handheld device for the specified duration in milliseconds.
   * **Note:** This method is implemented on Android, iOS, and Web. It has no effect on other
   * platforms.
   * **Note:** For Android, [vibrateHandheld] requires enabling the `VIBRATE` permission in the
   * export preset. Otherwise, [vibrateHandheld] will have no effect.
   * **Note:** For iOS, specifying the duration is only supported in iOS 13 and later.
   * **Note:** Some web browsers such as Safari and Firefox for Android do not support
   * [vibrateHandheld].
   */
  @JvmOverloads
  public fun vibrateHandheld(durationMs: Int = 500): Unit {
    TransferContext.writeArguments(LONG to durationMs.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.vibrateHandheldPtr, NIL)
  }

  /**
   * Returns the gravity in m/s² of the device's accelerometer sensor, if the device has one.
   * Otherwise, the method returns [Vector3.ZERO].
   * **Note:** This method only works on Android and iOS. On other platforms, it always returns
   * [Vector3.ZERO].
   */
  public fun getGravity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGravityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the acceleration in m/s² of the device's accelerometer sensor, if the device has one.
   * Otherwise, the method returns [Vector3.ZERO].
   * Note this method returns an empty [Vector3] when running from the editor even when your device
   * has an accelerometer. You must export your project to a supported device to read values from the
   * accelerometer.
   * **Note:** This method only works on Android and iOS. On other platforms, it always returns
   * [Vector3.ZERO].
   */
  public fun getAccelerometer(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAccelerometerPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the magnetic field strength in micro-Tesla for all axes of the device's magnetometer
   * sensor, if the device has one. Otherwise, the method returns [Vector3.ZERO].
   * **Note:** This method only works on Android and iOS. On other platforms, it always returns
   * [Vector3.ZERO].
   */
  public fun getMagnetometer(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMagnetometerPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the rotation rate in rad/s around a device's X, Y, and Z axes of the gyroscope sensor,
   * if the device has one. Otherwise, the method returns [Vector3.ZERO].
   * **Note:** This method only works on Android and iOS. On other platforms, it always returns
   * [Vector3.ZERO].
   */
  public fun getGyroscope(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGyroscopePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Sets the gravity value of the accelerometer sensor. Can be used for debugging on devices
   * without a hardware sensor, for example in an editor on a PC.
   * **Note:** This value can be immediately overwritten by the hardware sensor value on Android and
   * iOS.
   */
  public fun setGravity(`value`: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setGravityPtr, NIL)
  }

  /**
   * Sets the acceleration value of the accelerometer sensor. Can be used for debugging on devices
   * without a hardware sensor, for example in an editor on a PC.
   * **Note:** This value can be immediately overwritten by the hardware sensor value on Android and
   * iOS.
   */
  public fun setAccelerometer(`value`: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setAccelerometerPtr, NIL)
  }

  /**
   * Sets the value of the magnetic field of the magnetometer sensor. Can be used for debugging on
   * devices without a hardware sensor, for example in an editor on a PC.
   * **Note:** This value can be immediately overwritten by the hardware sensor value on Android and
   * iOS.
   */
  public fun setMagnetometer(`value`: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setMagnetometerPtr, NIL)
  }

  /**
   * Sets the value of the rotation rate of the gyroscope sensor. Can be used for debugging on
   * devices without a hardware sensor, for example in an editor on a PC.
   * **Note:** This value can be immediately overwritten by the hardware sensor value on Android and
   * iOS.
   */
  public fun setGyroscope(`value`: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setGyroscopePtr, NIL)
  }

  /**
   * Returns the last mouse velocity. To provide a precise and jitter-free velocity, mouse velocity
   * is only calculated every 0.1s. Therefore, mouse velocity will lag mouse movements.
   */
  public fun getLastMouseVelocity(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLastMouseVelocityPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns mouse buttons as a bitmask. If multiple mouse buttons are pressed at the same time, the
   * bits are added together. Equivalent to [DisplayServer.mouseGetButtonState].
   */
  public fun getMouseButtonMask(): MouseButtonMask {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMouseButtonMaskPtr, LONG)
    return MouseButtonMaskValue(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setMouseMode(mode: MouseMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setMouseModePtr, NIL)
  }

  public fun getMouseMode(): MouseMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMouseModePtr, LONG)
    return Input.MouseMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the mouse position to the specified vector, provided in pixels and relative to an origin
   * at the upper left corner of the currently focused Window Manager game window.
   * Mouse position is clipped to the limits of the screen resolution, or to the limits of the game
   * window if [MouseMode] is set to [MOUSE_MODE_CONFINED] or [MOUSE_MODE_CONFINED_HIDDEN].
   * **Note:** [warpMouse] is only supported on Windows, macOS and Linux. It has no effect on
   * Android, iOS and Web.
   */
  public fun warpMouse(position: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.warpMousePtr, NIL)
  }

  /**
   * This will simulate pressing the specified action.
   * The strength can be used for non-boolean actions, it's ranged between 0 and 1 representing the
   * intensity of the given action.
   * **Note:** This method will not cause any [Node.Input] calls. It is intended to be used with
   * [isActionPressed] and [isActionJustPressed]. If you want to simulate `_input`, use
   * [parseInputEvent] instead.
   */
  @JvmOverloads
  public fun actionPress(action: StringName, strength: Float = 1.0f): Unit {
    TransferContext.writeArguments(STRING_NAME to action, DOUBLE to strength.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.actionPressPtr, NIL)
  }

  /**
   * If the specified action is already pressed, this will release it.
   */
  public fun actionRelease(action: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(rawPtr, MethodBindings.actionReleasePtr, NIL)
  }

  /**
   * Sets the default cursor shape to be used in the viewport instead of [CURSOR_ARROW].
   * **Note:** If you want to change the default cursor shape for [Control]'s nodes, use
   * [Control.mouseDefaultCursorShape] instead.
   * **Note:** This method generates an [InputEventMouseMotion] to update cursor immediately.
   */
  @JvmOverloads
  public fun setDefaultCursorShape(shape: CursorShape = Input.CursorShape.CURSOR_ARROW): Unit {
    TransferContext.writeArguments(LONG to shape.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setDefaultCursorShapePtr, NIL)
  }

  /**
   * Returns the currently assigned cursor shape (see [CursorShape]).
   */
  public fun getCurrentCursorShape(): CursorShape {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentCursorShapePtr, LONG)
    return Input.CursorShape.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets a custom mouse cursor image, which is only visible inside the game window. The hotspot can
   * also be specified. Passing `null` to the image parameter resets to the system cursor. See
   * [CursorShape] for the list of shapes.
   * [image]'s size must be lower than or equal to 256×256. To avoid rendering issues, sizes lower
   * than or equal to 128×128 are recommended.
   * [hotspot] must be within [image]'s size.
   * **Note:** [AnimatedTexture]s aren't supported as custom mouse cursors. If using an
   * [AnimatedTexture], only the first frame will be displayed.
   * **Note:** The **Lossless**, **Lossy** or **Uncompressed** compression modes are recommended.
   * The **Video RAM** compression mode can be used, but it will be decompressed on the CPU, which
   * means loading times are slowed down and no memory is saved compared to lossless modes.
   * **Note:** On the web platform, the maximum allowed cursor image size is 128×128. Cursor images
   * larger than 32×32 will also only be displayed if the mouse cursor image is entirely located within
   * the page for [url=https://chromestatus.com/feature/5825971391299584]security reasons[/url].
   */
  @JvmOverloads
  public fun setCustomMouseCursor(
    image: Resource,
    shape: CursorShape = Input.CursorShape.CURSOR_ARROW,
    hotspot: Vector2 = Vector2(0, 0),
  ): Unit {
    TransferContext.writeArguments(OBJECT to image, LONG to shape.id, VECTOR2 to hotspot)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomMouseCursorPtr, NIL)
  }

  /**
   * Feeds an [InputEvent] to the game. Can be used to artificially trigger input events from code.
   * Also generates [Node.Input] calls.
   * **Example:**
   *
   * gdscript:
   * ```gdscript
   * var cancel_event = InputEventAction.new()
   * cancel_event.action = "ui_cancel"
   * cancel_event.pressed = true
   * Input.parse_input_event(cancel_event)
   * ```
   * csharp:
   * ```csharp
   * var cancelEvent = new InputEventAction();
   * cancelEvent.Action = "ui_cancel";
   * cancelEvent.Pressed = true;
   * Input.ParseInputEvent(cancelEvent);
   * ```
   *
   * **Note:** Calling this function has no influence on the operating system. So for example
   * sending an [InputEventMouseMotion] will not move the OS mouse cursor to the specified position
   * (use [warpMouse] instead) and sending [kbd]Alt/Cmd + Tab[/kbd] as [InputEventKey] won't toggle
   * between active windows.
   */
  public fun parseInputEvent(event: InputEvent): Unit {
    TransferContext.writeArguments(OBJECT to event)
    TransferContext.callMethod(rawPtr, MethodBindings.parseInputEventPtr, NIL)
  }

  public fun setUseAccumulatedInput(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setUseAccumulatedInputPtr, NIL)
  }

  public fun isUsingAccumulatedInput(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isUsingAccumulatedInputPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sends all input events which are in the current buffer to the game loop. These events may have
   * been buffered as a result of accumulated input ([useAccumulatedInput]) or agile input flushing
   * ([ProjectSettings.inputDevices/buffering/agileEventFlushing]).
   * The engine will already do this itself at key execution points (at least once per frame).
   * However, this can be useful in advanced cases where you want precise control over the timing of
   * event handling.
   */
  public fun flushBufferedEvents(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.flushBufferedEventsPtr, NIL)
  }

  public enum class MouseMode(
    id: Long,
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
     * Captures the mouse. The mouse will be hidden and its position locked at the center of the
     * window manager's window.
     * **Note:** If you want to process the mouse's movement in this mode, you need to use
     * [InputEventMouseMotion.relative].
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class CursorShape(
    id: Long,
  ) {
    /**
     * Arrow cursor. Standard, default pointing cursor.
     */
    CURSOR_ARROW(0),
    /**
     * I-beam cursor. Usually used to show where the text cursor will appear when the mouse is
     * clicked.
     */
    CURSOR_IBEAM(1),
    /**
     * Pointing hand cursor. Usually used to indicate the pointer is over a link or other
     * interactable item.
     */
    CURSOR_POINTING_HAND(2),
    /**
     * Cross cursor. Typically appears over regions in which a drawing operation can be performed or
     * for selections.
     */
    CURSOR_CROSS(3),
    /**
     * Wait cursor. Indicates that the application is busy performing an operation. This cursor
     * shape denotes that the application isn't usable during the operation (e.g. something is blocking
     * its main thread).
     */
    CURSOR_WAIT(4),
    /**
     * Busy cursor. Indicates that the application is busy performing an operation. This cursor
     * shape denotes that the application is still usable during the operation.
     */
    CURSOR_BUSY(5),
    /**
     * Drag cursor. Usually displayed when dragging something.
     * **Note:** Windows lacks a dragging cursor, so [CURSOR_DRAG] is the same as [CURSOR_MOVE] for
     * this platform.
     */
    CURSOR_DRAG(6),
    /**
     * Can drop cursor. Usually displayed when dragging something to indicate that it can be dropped
     * at the current position.
     */
    CURSOR_CAN_DROP(7),
    /**
     * Forbidden cursor. Indicates that the current action is forbidden (for example, when dragging
     * something) or that the control at a position is disabled.
     */
    CURSOR_FORBIDDEN(8),
    /**
     * Vertical resize mouse cursor. A double-headed vertical arrow. It tells the user they can
     * resize the window or the panel vertically.
     */
    CURSOR_VSIZE(9),
    /**
     * Horizontal resize mouse cursor. A double-headed horizontal arrow. It tells the user they can
     * resize the window or the panel horizontally.
     */
    CURSOR_HSIZE(10),
    /**
     * Window resize mouse cursor. The cursor is a double-headed arrow that goes from the bottom
     * left to the top right. It tells the user they can resize the window or the panel both
     * horizontally and vertically.
     */
    CURSOR_BDIAGSIZE(11),
    /**
     * Window resize mouse cursor. The cursor is a double-headed arrow that goes from the top left
     * to the bottom right, the opposite of [CURSOR_BDIAGSIZE]. It tells the user they can resize the
     * window or the panel both horizontally and vertically.
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  internal object MethodBindings {
    public val isAnythingPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "is_anything_pressed")

    public val isKeyPressedPtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "is_key_pressed")

    public val isPhysicalKeyPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "is_physical_key_pressed")

    public val isKeyLabelPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "is_key_label_pressed")

    public val isMouseButtonPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "is_mouse_button_pressed")

    public val isJoyButtonPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "is_joy_button_pressed")

    public val isActionPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "is_action_pressed")

    public val isActionJustPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "is_action_just_pressed")

    public val isActionJustReleasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "is_action_just_released")

    public val getActionStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "get_action_strength")

    public val getActionRawStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "get_action_raw_strength")

    public val getAxisPtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "get_axis")

    public val getVectorPtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "get_vector")

    public val addJoyMappingPtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "add_joy_mapping")

    public val removeJoyMappingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "remove_joy_mapping")

    public val isJoyKnownPtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "is_joy_known")

    public val getJoyAxisPtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "get_joy_axis")

    public val getJoyNamePtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "get_joy_name")

    public val getJoyGuidPtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "get_joy_guid")

    public val getJoyInfoPtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "get_joy_info")

    public val shouldIgnoreDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "should_ignore_device")

    public val getConnectedJoypadsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "get_connected_joypads")

    public val getJoyVibrationStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "get_joy_vibration_strength")

    public val getJoyVibrationDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "get_joy_vibration_duration")

    public val startJoyVibrationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "start_joy_vibration")

    public val stopJoyVibrationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "stop_joy_vibration")

    public val vibrateHandheldPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "vibrate_handheld")

    public val getGravityPtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "get_gravity")

    public val getAccelerometerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "get_accelerometer")

    public val getMagnetometerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "get_magnetometer")

    public val getGyroscopePtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "get_gyroscope")

    public val setGravityPtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "set_gravity")

    public val setAccelerometerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "set_accelerometer")

    public val setMagnetometerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "set_magnetometer")

    public val setGyroscopePtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "set_gyroscope")

    public val getLastMouseVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "get_last_mouse_velocity")

    public val getMouseButtonMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "get_mouse_button_mask")

    public val setMouseModePtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "set_mouse_mode")

    public val getMouseModePtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "get_mouse_mode")

    public val warpMousePtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "warp_mouse")

    public val actionPressPtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "action_press")

    public val actionReleasePtr: VoidPtr = TypeManager.getMethodBindPtr("Input", "action_release")

    public val setDefaultCursorShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "set_default_cursor_shape")

    public val getCurrentCursorShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "get_current_cursor_shape")

    public val setCustomMouseCursorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "set_custom_mouse_cursor")

    public val parseInputEventPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "parse_input_event")

    public val setUseAccumulatedInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "set_use_accumulated_input")

    public val isUsingAccumulatedInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "is_using_accumulated_input")

    public val flushBufferedEventsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Input", "flush_buffered_events")
  }
}
