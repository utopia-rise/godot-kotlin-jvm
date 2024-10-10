// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_INPUTEVENTJOYPADBUTTON_INDEX: Int = 292

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
    Internals.callConstructor(this, ENGINE_CLASS_INPUTEVENTJOYPADBUTTON_INDEX, scriptIndex)
  }

  public final fun setButtonIndex(buttonIndex: JoyButton): Unit {
    Internals.writeArguments(LONG to buttonIndex.id)
    Internals.callMethod(rawPtr, MethodBindings.setButtonIndexPtr, NIL)
  }

  public final fun getButtonIndex(): JoyButton {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getButtonIndexPtr, LONG)
    return JoyButton.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setPressure(pressure: Float): Unit {
    Internals.writeArguments(DOUBLE to pressure.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setPressurePtr, NIL)
  }

  public final fun getPressure(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPressurePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPressed(pressed: Boolean): Unit {
    Internals.writeArguments(BOOL to pressed)
    Internals.callMethod(rawPtr, MethodBindings.setPressedPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setButtonIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventJoypadButton", "set_button_index", 1466368136)

    public val getButtonIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventJoypadButton", "get_button_index", 595588182)

    public val setPressurePtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventJoypadButton", "set_pressure", 373806689)

    public val getPressurePtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventJoypadButton", "get_pressure", 1740695150)

    public val setPressedPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventJoypadButton", "set_pressed", 2586408642)
  }
}
