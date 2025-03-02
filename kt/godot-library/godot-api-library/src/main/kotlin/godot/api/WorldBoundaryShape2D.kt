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
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public final inline var normal: Vector2
    @JvmName("normalProperty")
    get() = getNormal()
    @JvmName("normalProperty")
    set(`value`) {
      setNormal(value)
    }

  /**
   * The distance from the origin to the line, expressed in terms of [normal] (according to its
   * direction and magnitude). Actual absolute distance from the origin to the line can be calculated
   * as `abs(distance) / normal.length()`.
   * In the scalar equation of the line `ax + by = d`, this is `d`, while the `(a, b)` coordinates
   * are represented by the [normal] property.
   */
  public final inline var distance: Float
    @JvmName("distanceProperty")
    get() = getDistance()
    @JvmName("distanceProperty")
    set(`value`) {
      setDistance(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(857, scriptIndex)
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
  public final fun normalMutate(block: Vector2.() -> Unit): Vector2 = normal.apply{
      block(this)
      normal = this
  }


  public final fun setNormal(normal: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to normal)
    TransferContext.callMethod(ptr, MethodBindings.setNormalPtr, NIL)
  }

  public final fun getNormal(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNormalPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setDistance(distance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to distance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDistancePtr, NIL)
  }

  public final fun getDistance(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDistancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  public object MethodBindings {
    internal val setNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorldBoundaryShape2D", "set_normal", 743155724)

    internal val getNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorldBoundaryShape2D", "get_normal", 3341600327)

    internal val setDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorldBoundaryShape2D", "set_distance", 373806689)

    internal val getDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorldBoundaryShape2D", "get_distance", 1740695150)
  }
}
