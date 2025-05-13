// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.MethodStringName0
import godot.core.MethodStringName1
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
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmStatic

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

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(614, scriptIndex)
  }

  public final fun setRadius(radius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRadiusPtr, NIL)
  }

  public final fun getRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setHeight(height: Float): Unit {
    TransferContext.writeArguments(DOUBLE to height.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setHeightPtr, NIL)
  }

  public final fun getHeight(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRadialSegments(radialSegments: Int): Unit {
    TransferContext.writeArguments(LONG to radialSegments.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setRadialSegmentsPtr, NIL)
  }

  public final fun getRadialSegments(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRadialSegmentsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setRings(rings: Int): Unit {
    TransferContext.writeArguments(LONG to rings.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setRingsPtr, NIL)
  }

  public final fun getRings(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRingsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setIsHemisphere(isHemisphere: Boolean): Unit {
    TransferContext.writeArguments(BOOL to isHemisphere)
    TransferContext.callMethod(ptr, MethodBindings.setIsHemispherePtr, NIL)
  }

  public final fun getIsHemisphere(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getIsHemispherePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object {
    @JvmStatic
    public val setRadiusName: MethodStringName1<SphereMesh, Unit, Float> =
        MethodStringName1<SphereMesh, Unit, Float>("set_radius")

    @JvmStatic
    public val getRadiusName: MethodStringName0<SphereMesh, Float> =
        MethodStringName0<SphereMesh, Float>("get_radius")

    @JvmStatic
    public val setHeightName: MethodStringName1<SphereMesh, Unit, Float> =
        MethodStringName1<SphereMesh, Unit, Float>("set_height")

    @JvmStatic
    public val getHeightName: MethodStringName0<SphereMesh, Float> =
        MethodStringName0<SphereMesh, Float>("get_height")

    @JvmStatic
    public val setRadialSegmentsName: MethodStringName1<SphereMesh, Unit, Int> =
        MethodStringName1<SphereMesh, Unit, Int>("set_radial_segments")

    @JvmStatic
    public val getRadialSegmentsName: MethodStringName0<SphereMesh, Int> =
        MethodStringName0<SphereMesh, Int>("get_radial_segments")

    @JvmStatic
    public val setRingsName: MethodStringName1<SphereMesh, Unit, Int> =
        MethodStringName1<SphereMesh, Unit, Int>("set_rings")

    @JvmStatic
    public val getRingsName: MethodStringName0<SphereMesh, Int> =
        MethodStringName0<SphereMesh, Int>("get_rings")

    @JvmStatic
    public val setIsHemisphereName: MethodStringName1<SphereMesh, Unit, Boolean> =
        MethodStringName1<SphereMesh, Unit, Boolean>("set_is_hemisphere")

    @JvmStatic
    public val getIsHemisphereName: MethodStringName0<SphereMesh, Boolean> =
        MethodStringName0<SphereMesh, Boolean>("get_is_hemisphere")
  }

  public object MethodBindings {
    internal val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "set_radius", 373806689)

    internal val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "get_radius", 1740695150)

    internal val setHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "set_height", 373806689)

    internal val getHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "get_height", 1740695150)

    internal val setRadialSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "set_radial_segments", 1286410249)

    internal val getRadialSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "get_radial_segments", 3905245786)

    internal val setRingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "set_rings", 1286410249)

    internal val getRingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "get_rings", 3905245786)

    internal val setIsHemispherePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "set_is_hemisphere", 2586408642)

    internal val getIsHemispherePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "get_is_hemisphere", 36873697)
  }
}
