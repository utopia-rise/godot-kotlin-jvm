// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.UninitializedPropertyAccessException
import kotlin.Unit

/**
 * Input event type for screen touch events.
 *
 * (only available on mobile devices)
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/inputs/inputevent.html](https://docs.godotengine.org/en/latest/tutorials/inputs/inputevent.html)
 *
 * Stores multi-touch press/release information. Supports touch press, touch release and [index] for multi-touch count and order.
 */
@GodotBaseType
open class InputEventScreenTouch : InputEvent() {
  /**
   * The touch index in the case of a multi-touch event. One index = one finger.
   */
  open var index: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTSCREENTOUCH_GET_INDEX,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTSCREENTOUCH_SET_INDEX,
          NIL)
    }

  /**
   * The touch position.
   */
  open var position: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTSCREENTOUCH_GET_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTSCREENTOUCH_SET_POSITION, NIL)
    }

  /**
   * If `true`, the touch's state is pressed. If `false`, the touch's state is released.
   */
  open var pressed: Boolean
    get() {
      throw UninitializedPropertyAccessException("Cannot access property pressed: has no getter")
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTSCREENTOUCH_SET_PRESSED,
          NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_INPUTEVENTSCREENTOUCH)
  }

  open fun position(schedule: Vector2.() -> Unit): Vector2 = position.apply{
      schedule(this)
      position = this
  }

}
