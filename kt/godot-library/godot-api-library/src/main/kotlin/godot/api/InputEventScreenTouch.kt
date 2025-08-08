// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Stores information about multi-touch press/release input events. Supports touch press, touch release and [index] for multi-touch count and order.
 */
@GodotBaseType
public open class InputEventScreenTouch : InputEventFromWindow() {
  /**
   * The touch index in the case of a multi-touch event. One index = one finger.
   */
  public final inline var index: Int
    @JvmName("indexProperty")
    get() = getIndex()
    @JvmName("indexProperty")
    set(`value`) {
      setIndex(value)
    }

  /**
   * The touch position in the viewport the node is in, using the coordinate system of this viewport.
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
  public final inline var position: Vector2
    @JvmName("positionProperty")
    get() = getPosition()
    @JvmName("positionProperty")
    set(`value`) {
      setPosition(value)
    }

  /**
   * If `true`, the touch event has been canceled.
   */
  public final inline var canceled: Boolean
    @JvmName("canceledProperty")
    get() = isCanceled()
    @JvmName("canceledProperty")
    set(`value`) {
      setCanceled(value)
    }

  /**
   * If `true`, the touch's state is pressed. If `false`, the touch's state is released.
   */
  public final inline var pressed: Boolean
    @JvmName("pressedProperty")
    get() = isPressed()
    @JvmName("pressedProperty")
    set(`value`) {
      setPressed(value)
    }

  /**
   * If `true`, the touch's state is a double tap.
   */
  public final inline var doubleTap: Boolean
    @JvmName("doubleTapProperty")
    get() = isDoubleTap()
    @JvmName("doubleTapProperty")
    set(`value`) {
      setDoubleTap(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(306, scriptIndex)
  }

  /**
   * This is a helper function for [position] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = inputeventscreentouch.position
   * //Your changes
   * inputeventscreentouch.position = myCoreType
   * ``````
   *
   * The touch position in the viewport the node is in, using the coordinate system of this viewport.
   */
  @CoreTypeHelper
  public final fun positionMutate(block: Vector2.() -> Unit): Vector2 = position.apply {
     block(this)
     position = this
  }

  public final fun setIndex(index: Int) {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setIndexPtr, NIL)
  }

  public final fun getIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setPosition(position: Vector2) {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(ptr, MethodBindings.setPositionPtr, NIL)
  }

  public final fun getPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setPressed(pressed: Boolean) {
    TransferContext.writeArguments(BOOL to pressed)
    TransferContext.callMethod(ptr, MethodBindings.setPressedPtr, NIL)
  }

  public final fun setCanceled(canceled: Boolean) {
    TransferContext.writeArguments(BOOL to canceled)
    TransferContext.callMethod(ptr, MethodBindings.setCanceledPtr, NIL)
  }

  public final fun setDoubleTap(doubleTap: Boolean) {
    TransferContext.writeArguments(BOOL to doubleTap)
    TransferContext.callMethod(ptr, MethodBindings.setDoubleTapPtr, NIL)
  }

  public final fun isDoubleTap(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDoubleTapPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "set_index", 1_286_410_249)

    internal val getIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "get_index", 3_905_245_786)

    internal val setPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "set_position", 743_155_724)

    internal val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "get_position", 3_341_600_327)

    internal val setPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "set_pressed", 2_586_408_642)

    internal val setCanceledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "set_canceled", 2_586_408_642)

    internal val setDoubleTapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "set_double_tap", 2_586_408_642)

    internal val isDoubleTapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "is_double_tap", 36_873_697)
  }
}
