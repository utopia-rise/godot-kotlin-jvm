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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
object Input : Object() {
  final const val CURSOR_ARROW: Long = 0

  final const val CURSOR_BDIAGSIZE: Long = 11

  final const val CURSOR_BUSY: Long = 5

  final const val CURSOR_CAN_DROP: Long = 7

  final const val CURSOR_CROSS: Long = 3

  final const val CURSOR_DRAG: Long = 6

  final const val CURSOR_FDIAGSIZE: Long = 12

  final const val CURSOR_FORBIDDEN: Long = 8

  final const val CURSOR_HELP: Long = 16

  final const val CURSOR_HSIZE: Long = 10

  final const val CURSOR_HSPLIT: Long = 15

  final const val CURSOR_IBEAM: Long = 1

  final const val CURSOR_MOVE: Long = 13

  final const val CURSOR_POINTING_HAND: Long = 2

  final const val CURSOR_VSIZE: Long = 9

  final const val CURSOR_VSPLIT: Long = 14

  final const val CURSOR_WAIT: Long = 4

  final const val MOUSE_MODE_CAPTURED: Long = 2

  final const val MOUSE_MODE_CONFINED: Long = 3

  final const val MOUSE_MODE_HIDDEN: Long = 1

  final const val MOUSE_MODE_VISIBLE: Long = 0

  val joyConnectionChanged: Signal2<Long, Boolean> by signal("device", "connected")

  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINECLASS_INPUT)

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  fun actionPress(action: String, strength: Double = 1.0) {
    TransferContext.writeArguments(STRING to action, DOUBLE to strength)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_ACTION_PRESS, NIL)
  }

  fun actionRelease(action: String) {
    TransferContext.writeArguments(STRING to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_ACTION_RELEASE, NIL)
  }

  fun addJoyMapping(mapping: String, updateExisting: Boolean = false) {
    TransferContext.writeArguments(STRING to mapping, BOOL to updateExisting)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_ADD_JOY_MAPPING, NIL)
  }

  fun getAccelerometer(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_ACCELEROMETER, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  fun getActionStrength(action: String): Double {
    TransferContext.writeArguments(STRING to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_ACTION_STRENGTH, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun getConnectedJoypads(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_CONNECTED_JOYPADS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun getCurrentCursorShape(): Input.CursorShape {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_CURRENT_CURSOR_SHAPE,
        LONG)
    return Input.CursorShape.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun getGravity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_GRAVITY, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  fun getGyroscope(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_GYROSCOPE, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  fun getJoyAxis(device: Long, axis: Long): Double {
    TransferContext.writeArguments(LONG to device, LONG to axis)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_JOY_AXIS, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun getJoyAxisIndexFromString(axis: String): Long {
    TransferContext.writeArguments(STRING to axis)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INPUT_GET_JOY_AXIS_INDEX_FROM_STRING, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getJoyAxisString(axisIndex: Long): String {
    TransferContext.writeArguments(LONG to axisIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_JOY_AXIS_STRING, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun getJoyButtonIndexFromString(button: String): Long {
    TransferContext.writeArguments(STRING to button)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INPUT_GET_JOY_BUTTON_INDEX_FROM_STRING, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getJoyButtonString(buttonIndex: Long): String {
    TransferContext.writeArguments(LONG to buttonIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_JOY_BUTTON_STRING, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun getJoyGuid(device: Long): String {
    TransferContext.writeArguments(LONG to device)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_JOY_GUID, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun getJoyName(device: Long): String {
    TransferContext.writeArguments(LONG to device)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_JOY_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun getJoyVibrationDuration(device: Long): Double {
    TransferContext.writeArguments(LONG to device)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_JOY_VIBRATION_DURATION,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun getJoyVibrationStrength(device: Long): Vector2 {
    TransferContext.writeArguments(LONG to device)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_JOY_VIBRATION_STRENGTH,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  fun getLastMouseSpeed(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_LAST_MOUSE_SPEED, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  fun getMagnetometer(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_MAGNETOMETER, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  fun getMouseButtonMask(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_MOUSE_BUTTON_MASK, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getMouseMode(): Input.MouseMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_GET_MOUSE_MODE, LONG)
    return Input.MouseMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun isActionJustPressed(action: String): Boolean {
    TransferContext.writeArguments(STRING to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_IS_ACTION_JUST_PRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun isActionJustReleased(action: String): Boolean {
    TransferContext.writeArguments(STRING to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_IS_ACTION_JUST_RELEASED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun isActionPressed(action: String): Boolean {
    TransferContext.writeArguments(STRING to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_IS_ACTION_PRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun isJoyButtonPressed(device: Long, button: Long): Boolean {
    TransferContext.writeArguments(LONG to device, LONG to button)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_IS_JOY_BUTTON_PRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun isJoyKnown(device: Long): Boolean {
    TransferContext.writeArguments(LONG to device)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_IS_JOY_KNOWN, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun isKeyPressed(scancode: Long): Boolean {
    TransferContext.writeArguments(LONG to scancode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_IS_KEY_PRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun isMouseButtonPressed(button: Long): Boolean {
    TransferContext.writeArguments(LONG to button)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_IS_MOUSE_BUTTON_PRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

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

  fun parseInputEvent(event: InputEvent) {
    TransferContext.writeArguments(OBJECT to event)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_PARSE_INPUT_EVENT, NIL)
  }

  fun removeJoyMapping(guid: String) {
    TransferContext.writeArguments(STRING to guid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_REMOVE_JOY_MAPPING, NIL)
  }

  fun setCustomMouseCursor(
    image: Resource,
    shape: Long = 0,
    hotspot: Vector2 = Vector2(0.0, 0.0)
  ) {
    TransferContext.writeArguments(OBJECT to image, LONG to shape, VECTOR2 to hotspot)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_SET_CUSTOM_MOUSE_CURSOR, NIL)
  }

  fun setDefaultCursorShape(shape: Long = 0) {
    TransferContext.writeArguments(LONG to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_SET_DEFAULT_CURSOR_SHAPE, NIL)
  }

  fun setMouseMode(mode: Long) {
    TransferContext.writeArguments(LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_SET_MOUSE_MODE, NIL)
  }

  fun setUseAccumulatedInput(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_SET_USE_ACCUMULATED_INPUT,
        NIL)
  }

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

  fun stopJoyVibration(device: Long) {
    TransferContext.writeArguments(LONG to device)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_STOP_JOY_VIBRATION, NIL)
  }

  fun vibrateHandheld(durationMs: Long = 500) {
    TransferContext.writeArguments(LONG to durationMs)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_VIBRATE_HANDHELD, NIL)
  }

  fun warpMousePosition(to: Vector2) {
    TransferContext.writeArguments(VECTOR2 to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUT_WARP_MOUSE_POSITION, NIL)
  }

  enum class MouseMode(
    id: Long
  ) {
    MOUSE_MODE_VISIBLE(0),

    MOUSE_MODE_HIDDEN(1),

    MOUSE_MODE_CAPTURED(2),

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
    CURSOR_ARROW(0),

    CURSOR_IBEAM(1),

    CURSOR_POINTING_HAND(2),

    CURSOR_CROSS(3),

    CURSOR_WAIT(4),

    CURSOR_BUSY(5),

    CURSOR_DRAG(6),

    CURSOR_CAN_DROP(7),

    CURSOR_FORBIDDEN(8),

    CURSOR_VSIZE(9),

    CURSOR_HSIZE(10),

    CURSOR_BDIAGSIZE(11),

    CURSOR_FDIAGSIZE(12),

    CURSOR_MOVE(13),

    CURSOR_VSPLIT(14),

    CURSOR_HSPLIT(15),

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
