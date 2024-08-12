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
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A 2D line segment shape, intended for use in physics. Usually used to provide a shape for a
 * [CollisionShape2D].
 */
@GodotBaseType
public open class SegmentShape2D : Shape2D() {
  /**
   * The segment's first point position.
   */
  @CoreTypeLocalCopy
  public var a: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAPtr, NIL)
    }

  /**
   * The segment's second point position.
   */
  @CoreTypeLocalCopy
  public var b: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SEGMENTSHAPE2D, scriptIndex)
    return true
  }

  /**
   * The segment's first point position.
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
   * val myCoreType = segmentshape2d.a
   * //Your changes
   * segmentshape2d.a = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun aMutate(block: Vector2.() -> Unit): Vector2 = a.apply{
      block(this)
      a = this
  }


  /**
   * The segment's second point position.
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
   * val myCoreType = segmentshape2d.b
   * //Your changes
   * segmentshape2d.b = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun bMutate(block: Vector2.() -> Unit): Vector2 = b.apply{
      block(this)
      b = this
  }


  public companion object

  internal object MethodBindings {
    public val setAPtr: VoidPtr = TypeManager.getMethodBindPtr("SegmentShape2D", "set_a")

    public val getAPtr: VoidPtr = TypeManager.getMethodBindPtr("SegmentShape2D", "get_a")

    public val setBPtr: VoidPtr = TypeManager.getMethodBindPtr("SegmentShape2D", "set_b")

    public val getBPtr: VoidPtr = TypeManager.getMethodBindPtr("SegmentShape2D", "get_b")
  }
}
