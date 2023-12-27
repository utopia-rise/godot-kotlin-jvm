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
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A 2D world boundary shape, intended for use in physics. [WorldBoundaryShape2D] works like an
 * infinite straight line that forces all physics bodies to stay above it. The line's normal determines
 * which direction is considered as "above" and in the editor, the smaller line over it represents this
 * direction. It can for example be used for endless flat floors.
 */
@GodotBaseType
public open class WorldBoundaryShape2D : Shape2D() {
  /**
   * The line's normal, typically a unit vector. Its direction indicates the non-colliding
   * half-plane. Can be of any length but zero. Defaults to [Vector2.UP].
   */
  @CoreTypeLocalCopy
  public var normal: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNormalPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNormalPtr, NIL)
    }

  /**
   * The distance from the origin to the line, expressed in terms of [normal] (according to its
   * direction and magnitude). Actual absolute distance from the origin to the line can be calculated
   * as `abs(distance) / normal.length()`.
   * In the scalar equation of the line `ax + by = d`, this is `d`, while the `(a, b)` coordinates
   * are represented by the [normal] property.
   */
  public var distance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDistancePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WORLDBOUNDARYSHAPE2D, scriptIndex)
    return true
  }

  /**
   * The line's normal, typically a unit vector. Its direction indicates the non-colliding
   * half-plane. Can be of any length but zero. Defaults to [Vector2.UP].
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
   * val myCoreType = worldboundaryshape2d.normal
   * //Your changes
   * worldboundaryshape2d.normal = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun normalMutate(block: Vector2.() -> Unit): Vector2 = normal.apply{
      block(this)
      normal = this
  }


  public companion object

  internal object MethodBindings {
    public val setNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorldBoundaryShape2D", "set_normal")

    public val getNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorldBoundaryShape2D", "get_normal")

    public val setDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorldBoundaryShape2D", "set_distance")

    public val getDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorldBoundaryShape2D", "get_distance")
  }
}
