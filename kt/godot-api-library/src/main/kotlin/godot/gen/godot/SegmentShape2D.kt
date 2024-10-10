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
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public final inline var a: Vector2
    @JvmName("aProperty")
    get() = getA()
    @JvmName("aProperty")
    set(`value`) {
      setA(value)
    }

  /**
   * The segment's second point position.
   */
  @CoreTypeLocalCopy
  public final inline var b: Vector2
    @JvmName("bProperty")
    get() = getB()
    @JvmName("bProperty")
    set(`value`) {
      setB(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SEGMENTSHAPE2D, scriptIndex)
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
  public final fun aMutate(block: Vector2.() -> Unit): Vector2 = a.apply{
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
  public final fun bMutate(block: Vector2.() -> Unit): Vector2 = b.apply{
      block(this)
      b = this
  }


  public final fun setA(a: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to a)
    TransferContext.callMethod(rawPtr, MethodBindings.setAPtr, NIL)
  }

  public final fun getA(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setB(b: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to b)
    TransferContext.callMethod(rawPtr, MethodBindings.setBPtr, NIL)
  }

  public final fun getB(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public companion object

  internal object MethodBindings {
    public val setAPtr: VoidPtr = TypeManager.getMethodBindPtr("SegmentShape2D", "set_a", 743155724)

    public val getAPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SegmentShape2D", "get_a", 3341600327)

    public val setBPtr: VoidPtr = TypeManager.getMethodBindPtr("SegmentShape2D", "set_b", 743155724)

    public val getBPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SegmentShape2D", "get_b", 3341600327)
  }
}
