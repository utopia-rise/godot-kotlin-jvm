// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmName

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
   *
   * **Note:** To get a regular hemisphere, the height and radius of the sphere must be equal.
   */
  public final inline var isHemisphere: Boolean
    @JvmName("isHemisphereProperty")
    get() = getIsHemisphere()
    @JvmName("isHemisphereProperty")
    set(`value`) {
      setIsHemisphere(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(614, scriptIndex)
  }

  public final fun setRadius(radius: Float) {
    TransferContext.writeArguments(DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRadiusPtr, NIL)
  }

  public final fun getRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setHeight(height: Float) {
    TransferContext.writeArguments(DOUBLE to height.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setHeightPtr, NIL)
  }

  public final fun getHeight(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRadialSegments(radialSegments: Int) {
    TransferContext.writeArguments(LONG to radialSegments.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setRadialSegmentsPtr, NIL)
  }

  public final fun getRadialSegments(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRadialSegmentsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setRings(rings: Int) {
    TransferContext.writeArguments(LONG to rings.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setRingsPtr, NIL)
  }

  public final fun getRings(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRingsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setIsHemisphere(isHemisphere: Boolean) {
    TransferContext.writeArguments(BOOL to isHemisphere)
    TransferContext.callMethod(ptr, MethodBindings.setIsHemispherePtr, NIL)
  }

  public final fun getIsHemisphere(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getIsHemispherePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "set_radius", 373_806_689)

    internal val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "get_radius", 1_740_695_150)

    internal val setHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "set_height", 373_806_689)

    internal val getHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "get_height", 1_740_695_150)

    internal val setRadialSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "set_radial_segments", 1_286_410_249)

    internal val getRadialSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "get_radial_segments", 3_905_245_786)

    internal val setRingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "set_rings", 1_286_410_249)

    internal val getRingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "get_rings", 3_905_245_786)

    internal val setIsHemispherePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "set_is_hemisphere", 2_586_408_642)

    internal val getIsHemispherePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "get_is_hemisphere", 36_873_697)
  }
}
