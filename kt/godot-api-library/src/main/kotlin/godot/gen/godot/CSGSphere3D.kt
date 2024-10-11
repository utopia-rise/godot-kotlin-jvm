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
import godot.core.VariantParser.OBJECT
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

private const val ENGINE_CLASS_CSGSPHERE3D_INDEX: Int = 158

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
    Internals.callConstructor(this, ENGINE_CLASS_CSGSPHERE3D_INDEX, scriptIndex)
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

  public final fun setSmoothFaces(smoothFaces: Boolean): Unit {
    Internals.writeArguments(BOOL to smoothFaces)
    Internals.callMethod(rawPtr, MethodBindings.setSmoothFacesPtr, NIL)
  }

  public final fun getSmoothFaces(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSmoothFacesPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMaterial(material: Material?): Unit {
    Internals.writeArguments(OBJECT to material)
    Internals.callMethod(rawPtr, MethodBindings.setMaterialPtr, NIL)
  }

  public final fun getMaterial(): Material? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaterialPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Material?)
  }

  public companion object

  public object MethodBindings {
    internal val setRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGSphere3D", "set_radius", 373806689)

    internal val getRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGSphere3D", "get_radius", 1740695150)

    internal val setRadialSegmentsPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGSphere3D", "set_radial_segments", 1286410249)

    internal val getRadialSegmentsPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGSphere3D", "get_radial_segments", 3905245786)

    internal val setRingsPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGSphere3D", "set_rings", 1286410249)

    internal val getRingsPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGSphere3D", "get_rings", 3905245786)

    internal val setSmoothFacesPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGSphere3D", "set_smooth_faces", 2586408642)

    internal val getSmoothFacesPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGSphere3D", "get_smooth_faces", 36873697)

    internal val setMaterialPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGSphere3D", "set_material", 2757459619)

    internal val getMaterialPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGSphere3D", "get_material", 5934680)
  }
}
