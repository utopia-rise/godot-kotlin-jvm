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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_INPUTEVENTSCREENTOUCH_INDEX: Int = 301

/**
 * Stores information about multi-touch press/release input events. Supports touch press, touch
 * release and [index] for multi-touch count and order.
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
   * The touch position in the viewport the node is in, using the coordinate system of this
   * viewport.
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

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_INPUTEVENTSCREENTOUCH_INDEX, scriptIndex)
  }

  /**
   * The touch position in the viewport the node is in, using the coordinate system of this
   * viewport.
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
  public final fun positionMutate(block: Vector2.() -> Unit): Vector2 = position.apply{
      block(this)
      position = this
  }


  public final fun setIndex(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setIndexPtr, NIL)
  }

  public final fun getIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setPosition(position: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setPositionPtr, NIL)
  }

  public final fun getPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setPressed(pressed: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pressed)
    TransferContext.callMethod(rawPtr, MethodBindings.setPressedPtr, NIL)
  }

  public final fun setCanceled(canceled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to canceled)
    TransferContext.callMethod(rawPtr, MethodBindings.setCanceledPtr, NIL)
  }

  public final fun setDoubleTap(doubleTap: Boolean): Unit {
    TransferContext.writeArguments(BOOL to doubleTap)
    TransferContext.callMethod(rawPtr, MethodBindings.setDoubleTapPtr, NIL)
  }

  public final fun isDoubleTap(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDoubleTapPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "set_index", 1286410249)

    public val getIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "get_index", 3905245786)

    public val setPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "set_position", 743155724)

    public val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "get_position", 3341600327)

    public val setPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "set_pressed", 2586408642)

    public val setCanceledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "set_canceled", 2586408642)

    public val setDoubleTapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "set_double_tap", 2586408642)

    public val isDoubleTapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenTouch", "is_double_tap", 36873697)
  }
}
