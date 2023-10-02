// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents a screen touch event.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/inputs/inputevent.html]($DOCS_URL/tutorials/inputs/inputevent.html)
 *
 * Stores information about multi-touch press/release input events. Supports touch press, touch release and [index] for multi-touch count and order.
 */
@GodotBaseType
public open class InputEventScreenTouch : InputEventFromWindow() {
  /**
   * The touch index in the case of a multi-touch event. One index = one finger.
   */
  public var index: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTSCREENTOUCH_GET_INDEX,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTSCREENTOUCH_SET_INDEX,
          NIL)
    }

  /**
   * The touch position, in screen (global) coordinates.
   */
  public var position: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTSCREENTOUCH_GET_POSITION, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTSCREENTOUCH_SET_POSITION, NIL)
    }

  /**
   * If `true`, the touch event has been canceled.
   */
  public var canceled: Boolean
    @JvmName("isCanceled_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.isCanceled()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTSCREENTOUCH_SET_CANCELED, NIL)
    }

  /**
   * If `true`, the touch's state is pressed. If `false`, the touch's state is released.
   */
  public var pressed: Boolean
    @JvmName("isPressed_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.isPressed()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTSCREENTOUCH_SET_PRESSED,
          NIL)
    }

  /**
   * If `true`, the touch's state is a double tap.
   */
  public var doubleTap: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTSCREENTOUCH_IS_DOUBLE_TAP, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTSCREENTOUCH_SET_DOUBLE_TAP, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_INPUTEVENTSCREENTOUCH, scriptIndex)
    return true
  }

  /**
   * The touch position, in screen (global) coordinates.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = inputeventscreentouch.position
   * //Your changes
   * inputeventscreentouch.position = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun position(block: Vector2.() -> Unit): Vector2 = position.apply{
      block(this)
      position = this
  }


  public companion object
}
