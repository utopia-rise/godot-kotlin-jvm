// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
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
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
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
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
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
    createNativeObject(578, scriptIndex)
  }

  /**
   * This is a helper function for [a] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = segmentshape2d.a
   * //Your changes
   * segmentshape2d.a = myCoreType
   * ``````
   *
   * The segment's first point position.
   */
  @CoreTypeHelper
  public final fun aMutate(block: Vector2.() -> Unit): Vector2 = a.apply {
     block(this)
     a = this
  }

  /**
   * This is a helper function for [b] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = segmentshape2d.b
   * //Your changes
   * segmentshape2d.b = myCoreType
   * ``````
   *
   * The segment's second point position.
   */
  @CoreTypeHelper
  public final fun bMutate(block: Vector2.() -> Unit): Vector2 = b.apply {
     block(this)
     b = this
  }

  public final fun setA(a: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to a)
    TransferContext.callMethod(ptr, MethodBindings.setAPtr, NIL)
  }

  public final fun getA(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setB(b: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to b)
    TransferContext.callMethod(ptr, MethodBindings.setBPtr, NIL)
  }

  public final fun getB(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public companion object

  public object MethodBindings {
    internal val setAPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SegmentShape2D", "set_a", 743155724)

    internal val getAPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SegmentShape2D", "get_a", 3341600327)

    internal val setBPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SegmentShape2D", "set_b", 743155724)

    internal val getBPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SegmentShape2D", "get_b", 3341600327)
  }
}
