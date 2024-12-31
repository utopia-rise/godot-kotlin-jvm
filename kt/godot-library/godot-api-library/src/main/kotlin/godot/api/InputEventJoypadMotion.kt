// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.JoyAxis
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_INPUTEVENTJOYPADMOTION: Int = 318

/**
 * Stores information about joystick motions. One [InputEventJoypadMotion] represents one axis at a
 * time. For gamepad buttons, see [InputEventJoypadButton].
 */
@GodotBaseType
public open class InputEventJoypadMotion : InputEvent() {
  /**
   * Axis identifier. Use one of the [JoyAxis] axis constants.
   */
  public final inline var axis: JoyAxis
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
  public final inline var axisValue: Float
    @JvmName("axisValueProperty")
    get() = getAxisValue()
    @JvmName("axisValueProperty")
    set(`value`) {
      setAxisValue(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_INPUTEVENTJOYPADMOTION, scriptIndex)
  }

  public final fun setAxis(axis: JoyAxis): Unit {
    TransferContext.writeArguments(LONG to axis.id)
    TransferContext.callMethod(ptr, MethodBindings.setAxisPtr, NIL)
  }

  public final fun getAxis(): JoyAxis {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAxisPtr, LONG)
    return JoyAxis.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAxisValue(axisValue: Float): Unit {
    TransferContext.writeArguments(DOUBLE to axisValue.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAxisValuePtr, NIL)
  }

  public final fun getAxisValue(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAxisValuePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  public object MethodBindings {
    internal val setAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventJoypadMotion", "set_axis", 1332685170)

    internal val getAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventJoypadMotion", "get_axis", 4019121683)

    internal val setAxisValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventJoypadMotion", "set_axis_value", 373806689)

    internal val getAxisValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventJoypadMotion", "get_axis_value", 1740695150)
  }
}
