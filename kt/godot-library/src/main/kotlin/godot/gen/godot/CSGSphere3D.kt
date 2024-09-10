// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This node allows you to create a sphere for use with the CSG system.
 * **Note:** CSG nodes are intended to be used for level prototyping. Creating CSG nodes has a
 * significant CPU cost compared to creating a [MeshInstance3D] with a [PrimitiveMesh]. Moving a CSG
 * node within another CSG node also has a significant CPU cost, so it should be avoided during
 * gameplay.
 */
@GodotBaseType
public open class CSGSphere3D : CSGPrimitive3D() {
  /**
   * Radius of the sphere.
   */
  public final inline var radius: Float
    @JvmName("radiusProperty")
    get() = getRadius()
    @JvmName("radiusProperty")
    set(`value`) {
      setRadius(value)
    }

  /**
   * Number of vertical slices for the sphere.
   */
  public final inline var radialSegments: Int
    @JvmName("radialSegmentsProperty")
    get() = getRadialSegments()
    @JvmName("radialSegmentsProperty")
    set(`value`) {
      setRadialSegments(value)
    }

  /**
   * Number of horizontal slices for the sphere.
   */
  public final inline var rings: Int
    @JvmName("ringsProperty")
    get() = getRings()
    @JvmName("ringsProperty")
    set(`value`) {
      setRings(value)
    }

  /**
   * If `true` the normals of the sphere are set to give a smooth effect making the sphere seem
   * rounded. If `false` the sphere will have a flat shaded look.
   */
  public final inline var smoothFaces: Boolean
    @JvmName("smoothFacesProperty")
    get() = getSmoothFaces()
    @JvmName("smoothFacesProperty")
    set(`value`) {
      setSmoothFaces(value)
    }

  /**
   * The material used to render the sphere.
   */
  public final inline var material: Material?
    @JvmName("materialProperty")
    get() = getMaterial()
    @JvmName("materialProperty")
    set(`value`) {
      setMaterial(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_CSGSPHERE3D, scriptIndex)
  }

  public final fun setRadius(radius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setRadiusPtr, NIL)
  }

  public final fun getRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public final fun setRadialSegments(radialSegments: Int): Unit {
    TransferContext.writeArguments(LONG to radialSegments.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setRadialSegmentsPtr, NIL)
  }

  public final fun getRadialSegments(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRadialSegmentsPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public final fun setRings(rings: Int): Unit {
    TransferContext.writeArguments(LONG to rings.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setRingsPtr, NIL)
  }

  public final fun getRings(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRingsPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public final fun setSmoothFaces(smoothFaces: Boolean): Unit {
    TransferContext.writeArguments(BOOL to smoothFaces)
    TransferContext.callMethod(rawPtr, MethodBindings.setSmoothFacesPtr, NIL)
  }

  public final fun getSmoothFaces(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSmoothFacesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public final fun setMaterial(material: Material?): Unit {
    TransferContext.writeArguments(OBJECT to material)
    TransferContext.callMethod(rawPtr, MethodBindings.setMaterialPtr, NIL)
  }

  public final fun getMaterial(): Material? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMaterialPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Material?)
  }

  public companion object

  internal object MethodBindings {
    public val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGSphere3D", "set_radius", 373806689)

    public val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGSphere3D", "get_radius", 1740695150)

    public val setRadialSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGSphere3D", "set_radial_segments", 1286410249)

    public val getRadialSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGSphere3D", "get_radial_segments", 3905245786)

    public val setRingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGSphere3D", "set_rings", 1286410249)

    public val getRingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGSphere3D", "get_rings", 3905245786)

    public val setSmoothFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGSphere3D", "set_smooth_faces", 2586408642)

    public val getSmoothFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGSphere3D", "get_smooth_faces", 36873697)

    public val setMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGSphere3D", "set_material", 2757459619)

    public val getMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGSphere3D", "get_material", 5934680)
  }
}
