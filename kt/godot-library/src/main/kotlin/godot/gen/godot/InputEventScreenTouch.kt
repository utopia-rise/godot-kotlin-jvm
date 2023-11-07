// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Stores information about multi-touch press/release input events. Supports touch press, touch
 * release and [index] for multi-touch count and order.
 */
@GodotBaseType
public open class InputEventScreenTouch : InputEventFromWindow() {
  /**
   * The touch index in the case of a multi-touch event. One index = one finger.
   */
  public var index: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIndexPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setIndexPtr, NIL)
    }

  /**
   * The touch position in the viewport the node is in, using the coordinate system of this viewport.
   */
  @CoreTypeLocalCopy
  public var position: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionPtr, NIL)
    }

  /**
   * If `true`, the touch event has been canceled.
   */
  public var canceled: Boolean
    @JvmName("isCanceled_prop")
    get() = super.isCanceled()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCanceledPtr, NIL)
    }

  /**
   * If `true`, the touch's state is pressed. If `false`, the touch's state is released.
   */
  public var pressed: Boolean
    @JvmName("isPressed_prop")
    get() = super.isPressed()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPressedPtr, NIL)
    }

  /**
   * If `true`, the touch's state is a double tap.
   */
  public var doubleTap: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDoubleTapPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDoubleTapPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_INPUTEVENTSCREENTOUCH, scriptIndex)
    return true
  }

  /**
   * The touch position in the viewport the node is in, using the coordinate system of this viewport.
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
  public open fun positionMutate(block: Vector2.() -> Unit): Vector2 = position.apply{
      block(this)
      position = this
  }


  public companion object

  internal object MethodBindings {
    public val setIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "set_index")

    public val getIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "get_index")

    public val setPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "set_position")

    public val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "get_position")

    public val setPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "set_pressed")

    public val setCanceledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "set_canceled")

    public val setDoubleTapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "set_double_tap")

    public val isDoubleTapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "is_double_tap")
  }
}
