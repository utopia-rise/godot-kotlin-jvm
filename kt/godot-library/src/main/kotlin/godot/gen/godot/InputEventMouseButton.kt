// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
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
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public var factor: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFactorPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFactorPtr, NIL)
    }

  /**
   * The mouse button identifier, one of the [MouseButton] button or button wheel constants.
   */
  public var buttonIndex: MouseButton
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getButtonIndexPtr, LONG)
      return MouseButton.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setButtonIndexPtr, NIL)
    }

  /**
   * If `true`, the mouse button event has been canceled.
   */
  public var canceled: Boolean
    @JvmName("isCanceled_prop")
    get() = super.isCanceled()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCanceledPtr, NIL)
    }

  /**
   * If `true`, the mouse button's state is pressed. If `false`, the mouse button's state is
   * released.
   */
  public var pressed: Boolean
    @JvmName("isPressed_prop")
    get() = super.isPressed()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPressedPtr, NIL)
    }

  /**
   * If `true`, the mouse button's state is a double-click.
   */
  public var doubleClick: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDoubleClickPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDoubleClickPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_INPUTEVENTMOUSEBUTTON, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseButton", "set_factor", 373806689)

    public val getFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseButton", "get_factor", 1740695150)

    public val setButtonIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseButton", "set_button_index", 3624991109)

    public val getButtonIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseButton", "get_button_index", 1132662608)

    public val setPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseButton", "set_pressed", 2586408642)

    public val setCanceledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseButton", "set_canceled", 2586408642)

    public val setDoubleClickPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseButton", "set_double_click", 2586408642)

    public val isDoubleClickPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseButton", "is_double_click", 36873697)
  }
}
