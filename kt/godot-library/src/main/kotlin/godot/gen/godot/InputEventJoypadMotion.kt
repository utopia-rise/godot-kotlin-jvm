// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Stores information about joystick motions. One [InputEventJoypadMotion] represents one axis at a
 * time. For gamepad buttons, see [InputEventJoypadButton].
 */
@GodotBaseType
public open class InputEventJoypadMotion : InputEvent() {
  /**
   * Axis identifier. Use one of the [JoyAxis] axis constants.
   */
  public var axis: JoyAxis
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAxisPtr, LONG)
      return JoyAxis.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAxisPtr, NIL)
    }

  /**
   * Current position of the joystick on the given axis. The value ranges from `-1.0` to `1.0`. A
   * value of `0` means the axis is in its resting position.
   */
  public var axisValue: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAxisValuePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAxisValuePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_INPUTEVENTJOYPADMOTION, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventJoypadMotion", "set_axis")

    public val getAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventJoypadMotion", "get_axis")

    public val setAxisValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventJoypadMotion", "set_axis_value")

    public val getAxisValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventJoypadMotion", "get_axis_value")
  }
}
