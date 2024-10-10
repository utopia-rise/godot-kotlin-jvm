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

private const val ENGINE_CLASS_INPUTEVENTMOUSEBUTTON_INDEX: Int = 297

/**
 * Stores information about mouse click events. See [Node.Input].
 * **Note:** On Wear OS devices, rotary input is mapped to [MOUSE_BUTTON_WHEEL_UP] and
 * [MOUSE_BUTTON_WHEEL_DOWN]. This can be changed to [MOUSE_BUTTON_WHEEL_LEFT] and
 * [MOUSE_BUTTON_WHEEL_RIGHT] with the
 * [ProjectSettings.inputDevices/pointing/android/rotaryInputScrollAxis] setting.
 */
@GodotBaseType
public open class InputEventMouseButton : InputEventMouse() {
  /**
   * The amount (or delta) of the event. When used for high-precision scroll events, this indicates
   * the scroll amount (vertical or horizontal). This is only supported on some platforms; the reported
   * sensitivity varies depending on the platform. May be `0` if not supported.
   */
  public final inline var factor: Float
    @JvmName("factorProperty")
    get() = getFactor()
    @JvmName("factorProperty")
    set(`value`) {
      setFactor(value)
    }

  /**
   * The mouse button identifier, one of the [MouseButton] button or button wheel constants.
   */
  public final inline var buttonIndex: MouseButton
    @JvmName("buttonIndexProperty")
    get() = getButtonIndex()
    @JvmName("buttonIndexProperty")
    set(`value`) {
      setButtonIndex(value)
    }

  /**
   * If `true`, the mouse button event has been canceled.
   */
  public final inline var canceled: Boolean
    @JvmName("canceledProperty")
    get() = isCanceled()
    @JvmName("canceledProperty")
    set(`value`) {
      setCanceled(value)
    }

  /**
   * If `true`, the mouse button's state is pressed. If `false`, the mouse button's state is
   * released.
   */
  public final inline var pressed: Boolean
    @JvmName("pressedProperty")
    get() = isPressed()
    @JvmName("pressedProperty")
    set(`value`) {
      setPressed(value)
    }

  /**
   * If `true`, the mouse button's state is a double-click.
   */
  public final inline var doubleClick: Boolean
    @JvmName("doubleClickProperty")
    get() = isDoubleClick()
    @JvmName("doubleClickProperty")
    set(`value`) {
      setDoubleClick(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_INPUTEVENTMOUSEBUTTON_INDEX, scriptIndex)
  }

  public final fun setFactor(factor: Float): Unit {
    Internals.writeArguments(DOUBLE to factor.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setFactorPtr, NIL)
  }

  public final fun getFactor(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFactorPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setButtonIndex(buttonIndex: MouseButton): Unit {
    Internals.writeArguments(LONG to buttonIndex.id)
    Internals.callMethod(rawPtr, MethodBindings.setButtonIndexPtr, NIL)
  }

  public final fun getButtonIndex(): MouseButton {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getButtonIndexPtr, LONG)
    return MouseButton.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setPressed(pressed: Boolean): Unit {
    Internals.writeArguments(BOOL to pressed)
    Internals.callMethod(rawPtr, MethodBindings.setPressedPtr, NIL)
  }

  public final fun setCanceled(canceled: Boolean): Unit {
    Internals.writeArguments(BOOL to canceled)
    Internals.callMethod(rawPtr, MethodBindings.setCanceledPtr, NIL)
  }

  public final fun setDoubleClick(doubleClick: Boolean): Unit {
    Internals.writeArguments(BOOL to doubleClick)
    Internals.callMethod(rawPtr, MethodBindings.setDoubleClickPtr, NIL)
  }

  public final fun isDoubleClick(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isDoubleClickPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setFactorPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventMouseButton", "set_factor", 373806689)

    public val getFactorPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventMouseButton", "get_factor", 1740695150)

    public val setButtonIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventMouseButton", "set_button_index", 3624991109)

    public val getButtonIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventMouseButton", "get_button_index", 1132662608)

    public val setPressedPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventMouseButton", "set_pressed", 2586408642)

    public val setCanceledPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventMouseButton", "set_canceled", 2586408642)

    public val setDoubleClickPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventMouseButton", "set_double_click", 2586408642)

    public val isDoubleClickPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventMouseButton", "is_double_click", 36873697)
  }
}
