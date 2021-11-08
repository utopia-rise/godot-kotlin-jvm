// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Input event type for mouse button events.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.4/tutorials/inputs/mouse_and_input_coordinates.html](https://docs.godotengine.org/en/3.4/tutorials/inputs/mouse_and_input_coordinates.html)
 *
 * Contains mouse click information. See [godot.Node.Input].
 */
@GodotBaseType
public open class InputEventMouseButton : InputEventMouse() {
  /**
   * The mouse button identifier, one of the [enum ButtonList] button or button wheel constants.
   */
  public open var buttonIndex: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEBUTTON_GET_BUTTON_INDEX, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEBUTTON_SET_BUTTON_INDEX, NIL)
    }

  /**
   * If `true`, the mouse button's state is a double-click.
   */
  public open var doubleclick: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEBUTTON_GET_DOUBLECLICK, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEBUTTON_SET_DOUBLECLICK, NIL)
    }

  /**
   * The amount (or delta) of the event. When used for high-precision scroll events, this indicates the scroll amount (vertical or horizontal). This is only supported on some platforms; the reported sensitivity varies depending on the platform. May be `0` if not supported.
   */
  public open var factor: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEBUTTON_GET_FACTOR,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEBUTTON_SET_FACTOR,
          NIL)
    }

  /**
   * If `true`, the mouse button's state is pressed. If `false`, the mouse button's state is released.
   */
  public open var pressed: Boolean
    @JvmName("isPressed_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.isPressed()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEBUTTON_SET_PRESSED,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_INPUTEVENTMOUSEBUTTON)
  }
}
