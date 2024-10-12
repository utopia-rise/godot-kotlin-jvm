// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_SPHEREMESH_INDEX: Int = 604

/**
 * Class representing a spherical [PrimitiveMesh].
 */
@GodotBaseType
public open class SphereMesh : PrimitiveMesh() {
  /**
   * Radius of sphere.
   */
  public final inline var radius: Float
    @JvmName("radiusProperty")
    get() = getRadius()
    @JvmName("radiusProperty")
    set(`value`) {
      setRadius(value)
    }

  /**
   * Full height of the sphere.
   */
  public final inline var height: Float
    @JvmName("heightProperty")
    get() = getHeight()
    @JvmName("heightProperty")
    set(`value`) {
      setHeight(value)
    }

  /**
   * Number of radial segments on the sphere.
   */
  public final inline var radialSegments: Int
    @JvmName("radialSegmentsProperty")
    get() = getRadialSegments()
    @JvmName("radialSegmentsProperty")
    set(`value`) {
      setRadialSegments(value)
    }

  /**
   * Number of segments along the height of the sphere.
   */
  public final inline var rings: Int
    @JvmName("ringsProperty")
    get() = getRings()
    @JvmName("ringsProperty")
    set(`value`) {
      setRings(value)
    }

  /**
   * If `true`, a hemisphere is created rather than a full sphere.
   * **Note:** To get a regular hemisphere, the height and radius of the sphere must be equal.
   */
  public final inline var isHemisphere: Boolean
    @JvmName("isHemisphereProperty")
    get() = getIsHemisphere()
    @JvmName("isHemisphereProperty")
    set(`value`) {
      setIsHemisphere(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_SPHEREMESH_INDEX, scriptIndex)
  }

  public final fun setRadius(radius: Float): Unit {
    Internals.writeArguments(DOUBLE to radius.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setRadiusPtr, NIL)
  }

  public final fun getRadius(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRadiusPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setHeight(height: Float): Unit {
    Internals.writeArguments(DOUBLE to height.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setHeightPtr, NIL)
  }

  public final fun getHeight(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHeightPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRadialSegments(radialSegments: Int): Unit {
    Internals.writeArguments(LONG to radialSegments.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setRadialSegmentsPtr, NIL)
  }

  public final fun getRadialSegments(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRadialSegmentsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setRings(rings: Int): Unit {
    Internals.writeArguments(LONG to rings.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setRingsPtr, NIL)
  }

  public final fun getRings(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRingsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setIsHemisphere(isHemisphere: Boolean): Unit {
    Internals.writeArguments(BOOL to isHemisphere)
    Internals.callMethod(rawPtr, MethodBindings.setIsHemispherePtr, NIL)
  }

  public final fun getIsHemisphere(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getIsHemispherePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("SphereMesh", "set_radius", 373806689)

    internal val getRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("SphereMesh", "get_radius", 1740695150)

    internal val setHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("SphereMesh", "set_height", 373806689)

    internal val getHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("SphereMesh", "get_height", 1740695150)

    internal val setRadialSegmentsPtr: VoidPtr =
        Internals.getMethodBindPtr("SphereMesh", "set_radial_segments", 1286410249)

    internal val getRadialSegmentsPtr: VoidPtr =
        Internals.getMethodBindPtr("SphereMesh", "get_radial_segments", 3905245786)

    internal val setRingsPtr: VoidPtr =
        Internals.getMethodBindPtr("SphereMesh", "set_rings", 1286410249)

    internal val getRingsPtr: VoidPtr =
        Internals.getMethodBindPtr("SphereMesh", "get_rings", 3905245786)

    internal val setIsHemispherePtr: VoidPtr =
        Internals.getMethodBindPtr("SphereMesh", "set_is_hemisphere", 2586408642)

    internal val getIsHemispherePtr: VoidPtr =
        Internals.getMethodBindPtr("SphereMesh", "get_is_hemisphere", 36873697)
  }
}
