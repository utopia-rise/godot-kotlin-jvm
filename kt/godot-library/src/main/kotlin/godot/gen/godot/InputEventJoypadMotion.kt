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
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
    @JvmName("axisProperty")
    get() = getAxis()
    @JvmName("axisProperty")
    set(`value`) {
      setAxis(value)
    }

  /**
   * Current position of the joystick on the given axis. The value ranges from `-1.0` to `1.0`. A
   * value of `0` means the axis is in its resting position.
   */
  public var axisValue: Float
    @JvmName("axisValueProperty")
    get() = getAxisValue()
    @JvmName("axisValueProperty")
    set(`value`) {
      setAxisValue(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_INPUTEVENTJOYPADMOTION, scriptIndex)
  }

  public fun setAxis(axis: JoyAxis): Unit {
    TransferContext.writeArguments(LONG to axis.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setAxisPtr, NIL)
  }

  public fun getAxis(): JoyAxis {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAxisPtr, LONG)
    return JoyAxis.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setAxisValue(axisValue: Float): Unit {
    TransferContext.writeArguments(DOUBLE to axisValue.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setAxisValuePtr, NIL)
  }

  public fun getAxisValue(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAxisValuePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventJoypadMotion", "set_axis", 1332685170)

    public val getAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventJoypadMotion", "get_axis", 4019121683)

    public val setAxisValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventJoypadMotion", "set_axis_value", 373806689)

    public val getAxisValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventJoypadMotion", "get_axis_value", 1740695150)
  }
}
