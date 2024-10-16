// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
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
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Parameters to be used with a [Mesh] convex decomposition operation.
 */
@GodotBaseType
public open class MeshConvexDecompositionSettings : RefCounted() {
  /**
   * Maximum concavity. Ranges from `0.0` to `1.0`.
   */
  public final inline var maxConcavity: Float
    @JvmName("maxConcavityProperty")
    get() = getMaxConcavity()
    @JvmName("maxConcavityProperty")
    set(`value`) {
      setMaxConcavity(value)
    }

  /**
   * Controls the bias toward clipping along symmetry planes. Ranges from `0.0` to `1.0`.
   */
  public final inline var symmetryPlanesClippingBias: Float
    @JvmName("symmetryPlanesClippingBiasProperty")
    get() = getSymmetryPlanesClippingBias()
    @JvmName("symmetryPlanesClippingBiasProperty")
    set(`value`) {
      setSymmetryPlanesClippingBias(value)
    }

  /**
   * Controls the bias toward clipping along revolution axes. Ranges from `0.0` to `1.0`.
   */
  public final inline var revolutionAxesClippingBias: Float
    @JvmName("revolutionAxesClippingBiasProperty")
    get() = getRevolutionAxesClippingBias()
    @JvmName("revolutionAxesClippingBiasProperty")
    set(`value`) {
      setRevolutionAxesClippingBias(value)
    }

  /**
   * Controls the adaptive sampling of the generated convex-hulls. Ranges from `0.0` to `0.01`.
   */
  public final inline var minVolumePerConvexHull: Float
    @JvmName("minVolumePerConvexHullProperty")
    get() = getMinVolumePerConvexHull()
    @JvmName("minVolumePerConvexHullProperty")
    set(`value`) {
      setMinVolumePerConvexHull(value)
    }

  /**
   * Maximum number of voxels generated during the voxelization stage.
   */
  public final inline var resolution: Long
    @JvmName("resolutionProperty")
    get() = getResolution()
    @JvmName("resolutionProperty")
    set(`value`) {
      setResolution(value)
    }

  /**
   * Controls the maximum number of triangles per convex-hull. Ranges from `4` to `1024`.
   */
  public final inline var maxNumVerticesPerConvexHull: Long
    @JvmName("maxNumVerticesPerConvexHullProperty")
    get() = getMaxNumVerticesPerConvexHull()
    @JvmName("maxNumVerticesPerConvexHullProperty")
    set(`value`) {
      setMaxNumVerticesPerConvexHull(value)
    }

  /**
   * Controls the granularity of the search for the "best" clipping plane. Ranges from `1` to `16`.
   */
  public final inline var planeDownsampling: Long
    @JvmName("planeDownsamplingProperty")
    get() = getPlaneDownsampling()
    @JvmName("planeDownsamplingProperty")
    set(`value`) {
      setPlaneDownsampling(value)
    }

  /**
   * Controls the precision of the convex-hull generation process during the clipping plane
   * selection stage. Ranges from `1` to `16`.
   */
  public final inline var convexHullDownsampling: Long
    @JvmName("convexHullDownsamplingProperty")
    get() = getConvexHullDownsampling()
    @JvmName("convexHullDownsamplingProperty")
    set(`value`) {
      setConvexHullDownsampling(value)
    }

  /**
   * If `true`, normalizes the mesh before applying the convex decomposition.
   */
  public final inline var normalizeMesh: Boolean
    @JvmName("normalizeMeshProperty")
    get() = getNormalizeMesh()
    @JvmName("normalizeMeshProperty")
    set(`value`) {
      setNormalizeMesh(value)
    }

  /**
   * Mode for the approximate convex decomposition.
   */
  public final inline var mode: Mode
    @JvmName("modeProperty")
    get() = getMode()
    @JvmName("modeProperty")
    set(`value`) {
      setMode(value)
    }

  /**
   * If `true`, uses approximation for computing convex hulls.
   */
  public final inline var convexHullApproximation: Boolean
    @JvmName("convexHullApproximationProperty")
    get() = getConvexHullApproximation()
    @JvmName("convexHullApproximationProperty")
    set(`value`) {
      setConvexHullApproximation(value)
    }

  /**
   * The maximum number of convex hulls to produce from the merge operation.
   */
  public final inline var maxConvexHulls: Long
    @JvmName("maxConvexHullsProperty")
    get() = getMaxConvexHulls()
    @JvmName("maxConvexHullsProperty")
    set(`value`) {
      setMaxConvexHulls(value)
    }

  /**
   * If `true`, projects output convex hull vertices onto the original source mesh to increase
   * floating-point accuracy of the results.
   */
  public final inline var projectHullVertices: Boolean
    @JvmName("projectHullVerticesProperty")
    get() = getProjectHullVertices()
    @JvmName("projectHullVerticesProperty")
    set(`value`) {
      setProjectHullVertices(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS, this, scriptIndex)
  }

  public final fun setMaxConcavity(maxConcavity: Float): Unit {
    TransferContext.writeArguments(DOUBLE to maxConcavity.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMaxConcavityPtr, NIL)
  }

  public final fun getMaxConcavity(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxConcavityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSymmetryPlanesClippingBias(symmetryPlanesClippingBias: Float): Unit {
    TransferContext.writeArguments(DOUBLE to symmetryPlanesClippingBias.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSymmetryPlanesClippingBiasPtr, NIL)
  }

  public final fun getSymmetryPlanesClippingBias(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSymmetryPlanesClippingBiasPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRevolutionAxesClippingBias(revolutionAxesClippingBias: Float): Unit {
    TransferContext.writeArguments(DOUBLE to revolutionAxesClippingBias.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRevolutionAxesClippingBiasPtr, NIL)
  }

  public final fun getRevolutionAxesClippingBias(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRevolutionAxesClippingBiasPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMinVolumePerConvexHull(minVolumePerConvexHull: Float): Unit {
    TransferContext.writeArguments(DOUBLE to minVolumePerConvexHull.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMinVolumePerConvexHullPtr, NIL)
  }

  public final fun getMinVolumePerConvexHull(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMinVolumePerConvexHullPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setResolution(minVolumePerConvexHull: Long): Unit {
    TransferContext.writeArguments(LONG to minVolumePerConvexHull)
    TransferContext.callMethod(ptr, MethodBindings.setResolutionPtr, NIL)
  }

  public final fun getResolution(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getResolutionPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setMaxNumVerticesPerConvexHull(maxNumVerticesPerConvexHull: Long): Unit {
    TransferContext.writeArguments(LONG to maxNumVerticesPerConvexHull)
    TransferContext.callMethod(ptr, MethodBindings.setMaxNumVerticesPerConvexHullPtr, NIL)
  }

  public final fun getMaxNumVerticesPerConvexHull(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxNumVerticesPerConvexHullPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setPlaneDownsampling(planeDownsampling: Long): Unit {
    TransferContext.writeArguments(LONG to planeDownsampling)
    TransferContext.callMethod(ptr, MethodBindings.setPlaneDownsamplingPtr, NIL)
  }

  public final fun getPlaneDownsampling(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPlaneDownsamplingPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setConvexHullDownsampling(convexHullDownsampling: Long): Unit {
    TransferContext.writeArguments(LONG to convexHullDownsampling)
    TransferContext.callMethod(ptr, MethodBindings.setConvexHullDownsamplingPtr, NIL)
  }

  public final fun getConvexHullDownsampling(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConvexHullDownsamplingPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setNormalizeMesh(normalizeMesh: Boolean): Unit {
    TransferContext.writeArguments(BOOL to normalizeMesh)
    TransferContext.callMethod(ptr, MethodBindings.setNormalizeMeshPtr, NIL)
  }

  public final fun getNormalizeMesh(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNormalizeMeshPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMode(mode: Mode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setModePtr, NIL)
  }

  public final fun getMode(): Mode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getModePtr, LONG)
    return MeshConvexDecompositionSettings.Mode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setConvexHullApproximation(convexHullApproximation: Boolean): Unit {
    TransferContext.writeArguments(BOOL to convexHullApproximation)
    TransferContext.callMethod(ptr, MethodBindings.setConvexHullApproximationPtr, NIL)
  }

  public final fun getConvexHullApproximation(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConvexHullApproximationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMaxConvexHulls(maxConvexHulls: Long): Unit {
    TransferContext.writeArguments(LONG to maxConvexHulls)
    TransferContext.callMethod(ptr, MethodBindings.setMaxConvexHullsPtr, NIL)
  }

  public final fun getMaxConvexHulls(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxConvexHullsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setProjectHullVertices(projectHullVertices: Boolean): Unit {
    TransferContext.writeArguments(BOOL to projectHullVertices)
    TransferContext.callMethod(ptr, MethodBindings.setProjectHullVerticesPtr, NIL)
  }

  public final fun getProjectHullVertices(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getProjectHullVerticesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public enum class Mode(
    id: Long,
  ) {
    /**
     * Constant for voxel-based approximate convex decomposition.
     */
    CONVEX_DECOMPOSITION_MODE_VOXEL(0),
    /**
     * Constant for tetrahedron-based approximate convex decomposition.
     */
    CONVEX_DECOMPOSITION_MODE_TETRAHEDRON(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Mode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setMaxConcavityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_max_concavity", 373806689)

    public val getMaxConcavityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_max_concavity", 1740695150)

    public val setSymmetryPlanesClippingBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_symmetry_planes_clipping_bias", 373806689)

    public val getSymmetryPlanesClippingBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_symmetry_planes_clipping_bias", 1740695150)

    public val setRevolutionAxesClippingBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_revolution_axes_clipping_bias", 373806689)

    public val getRevolutionAxesClippingBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_revolution_axes_clipping_bias", 1740695150)

    public val setMinVolumePerConvexHullPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_min_volume_per_convex_hull", 373806689)

    public val getMinVolumePerConvexHullPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_min_volume_per_convex_hull", 1740695150)

    public val setResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_resolution", 1286410249)

    public val getResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_resolution", 3905245786)

    public val setMaxNumVerticesPerConvexHullPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_max_num_vertices_per_convex_hull", 1286410249)

    public val getMaxNumVerticesPerConvexHullPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_max_num_vertices_per_convex_hull", 3905245786)

    public val setPlaneDownsamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_plane_downsampling", 1286410249)

    public val getPlaneDownsamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_plane_downsampling", 3905245786)

    public val setConvexHullDownsamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_convex_hull_downsampling", 1286410249)

    public val getConvexHullDownsamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_convex_hull_downsampling", 3905245786)

    public val setNormalizeMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_normalize_mesh", 2586408642)

    public val getNormalizeMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_normalize_mesh", 36873697)

    public val setModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_mode", 1668072869)

    public val getModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_mode", 23479454)

    public val setConvexHullApproximationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_convex_hull_approximation", 2586408642)

    public val getConvexHullApproximationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_convex_hull_approximation", 36873697)

    public val setMaxConvexHullsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_max_convex_hulls", 1286410249)

    public val getMaxConvexHullsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_max_convex_hulls", 3905245786)

    public val setProjectHullVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "set_project_hull_vertices", 2586408642)

    public val getProjectHullVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshConvexDecompositionSettings", "get_project_hull_vertices", 36873697)
  }
}
