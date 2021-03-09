// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.UninitializedPropertyAccessException

/**
 * Input event type for mouse button events.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/inputs/mouse_and_input_coordinates.html](https://docs.godotengine.org/en/latest/tutorials/inputs/mouse_and_input_coordinates.html)
 *
 * Contains mouse click information. See [godot.Node.Input].
 */
@GodotBaseType
open class InputEventMouseButton : InputEventMouse() {
  /**
   * The mouse button identifier, one of the [enum ButtonList] button or button wheel constants.
   */
  open var buttonIndex: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEBUTTON_GET_BUTTON_INDEX, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEBUTTON_SET_BUTTON_INDEX, NIL)
    }

  /**
   * If `true`, the mouse button's state is a double-click.
   */
  open var doubleclick: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEBUTTON_GET_DOUBLECLICK, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEBUTTON_SET_DOUBLECLICK, NIL)
    }

  /**
   * The amount (or delta) of the event. When used for high-precision scroll events, this indicates the scroll amount (vertical or horizontal). This is only supported on some platforms; the reported sensitivity varies depending on the platform. May be `0` if not supported.
   */
  open var factor: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEBUTTON_GET_FACTOR,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEBUTTON_SET_FACTOR,
          NIL)
    }

  /**
   * If `true`, the mouse button's state is pressed. If `false`, the mouse button's state is released.
   */
  open var pressed: Boolean
    get() {
      throw UninitializedPropertyAccessException("Cannot access property pressed: has no getter")
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEBUTTON_SET_PRESSED,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_INPUTEVENTMOUSEBUTTON)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }
}
