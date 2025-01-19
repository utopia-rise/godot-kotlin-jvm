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
import godot.core.JoyButton
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Input event type for gamepad buttons. For gamepad analog sticks and joysticks, see
 * [InputEventJoypadMotion].
 */
@GodotBaseType
public open class InputEventJoypadButton : InputEvent() {
  /**
   * Button identifier. One of the [JoyButton] button constants.
   */
  public final inline var buttonIndex: JoyButton
    @JvmName("buttonIndexProperty")
    get() = getButtonIndex()
    @JvmName("buttonIndexProperty")
    set(`value`) {
      setButtonIndex(value)
    }

  public final inline var pressure: Float
    @JvmName("pressureProperty")
    get() = getPressure()
    @JvmName("pressureProperty")
    set(`value`) {
      setPressure(value)
    }

  /**
   * If `true`, the button's state is pressed. If `false`, the button's state is released.
   */
  public final inline var pressed: Boolean
    @JvmName("pressedProperty")
    get() = isPressed()
    @JvmName("pressedProperty")
    set(`value`) {
      setPressed(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(317, scriptIndex)
  }

  public final fun setButtonIndex(buttonIndex: JoyButton): Unit {
    TransferContext.writeArguments(LONG to buttonIndex.id)
    TransferContext.callMethod(ptr, MethodBindings.setButtonIndexPtr, NIL)
  }

  public final fun getButtonIndex(): JoyButton {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getButtonIndexPtr, LONG)
    return JoyButton.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setPressure(pressure: Float): Unit {
    TransferContext.writeArguments(DOUBLE to pressure.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPressurePtr, NIL)
  }

  public final fun getPressure(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPressurePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPressed(pressed: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pressed)
    TransferContext.callMethod(ptr, MethodBindings.setPressedPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val setButtonIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventJoypadButton", "set_button_index", 1466368136)

    internal val getButtonIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventJoypadButton", "get_button_index", 595588182)

    internal val setPressurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventJoypadButton", "set_pressure", 373806689)

    internal val getPressurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventJoypadButton", "get_pressure", 1740695150)

    internal val setPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventJoypadButton", "set_pressed", 2586408642)
  }
}
