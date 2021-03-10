// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

/**
 * Input event type for gamepad joysticks and other motions. For buttons, see `InputEventJoypadButton`.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/inputs/inputevent.html](https://docs.godotengine.org/en/latest/tutorials/inputs/inputevent.html)
 *
 * Stores information about joystick motions. One [godot.InputEventJoypadMotion] represents one axis at a time.
 */
@GodotBaseType
open class InputEventJoypadMotion : InputEvent() {
  /**
   * Axis identifier. Use one of the [enum JoystickList] axis constants.
   */
  open var axis: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTJOYPADMOTION_GET_AXIS,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTJOYPADMOTION_SET_AXIS,
          NIL)
    }

  /**
   * Current position of the joystick on the given axis. The value ranges from `-1.0` to `1.0`. A value of `0` means the axis is in its resting position.
   */
  open var axisValue: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTJOYPADMOTION_GET_AXIS_VALUE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTJOYPADMOTION_SET_AXIS_VALUE, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_INPUTEVENTJOYPADMOTION)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}
