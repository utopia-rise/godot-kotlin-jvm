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

private const val ENGINE_CLASS_MESHCONVEXDECOMPOSITIONSETTINGS_INDEX: Int = 367

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
    Internals.callConstructor(this, ENGINE_CLASS_MESHCONVEXDECOMPOSITIONSETTINGS_INDEX, scriptIndex)
  }

  public final fun setMaxConcavity(maxConcavity: Float): Unit {
    Internals.writeArguments(DOUBLE to maxConcavity.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setMaxConcavityPtr, NIL)
  }

  public final fun getMaxConcavity(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaxConcavityPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSymmetryPlanesClippingBias(symmetryPlanesClippingBias: Float): Unit {
    Internals.writeArguments(DOUBLE to symmetryPlanesClippingBias.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setSymmetryPlanesClippingBiasPtr, NIL)
  }

  public final fun getSymmetryPlanesClippingBias(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSymmetryPlanesClippingBiasPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRevolutionAxesClippingBias(revolutionAxesClippingBias: Float): Unit {
    Internals.writeArguments(DOUBLE to revolutionAxesClippingBias.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setRevolutionAxesClippingBiasPtr, NIL)
  }

  public final fun getRevolutionAxesClippingBias(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRevolutionAxesClippingBiasPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMinVolumePerConvexHull(minVolumePerConvexHull: Float): Unit {
    Internals.writeArguments(DOUBLE to minVolumePerConvexHull.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setMinVolumePerConvexHullPtr, NIL)
  }

  public final fun getMinVolumePerConvexHull(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMinVolumePerConvexHullPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setResolution(minVolumePerConvexHull: Long): Unit {
    Internals.writeArguments(LONG to minVolumePerConvexHull)
    Internals.callMethod(rawPtr, MethodBindings.setResolutionPtr, NIL)
  }

  public final fun getResolution(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getResolutionPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setMaxNumVerticesPerConvexHull(maxNumVerticesPerConvexHull: Long): Unit {
    Internals.writeArguments(LONG to maxNumVerticesPerConvexHull)
    Internals.callMethod(rawPtr, MethodBindings.setMaxNumVerticesPerConvexHullPtr, NIL)
  }

  public final fun getMaxNumVerticesPerConvexHull(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaxNumVerticesPerConvexHullPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setPlaneDownsampling(planeDownsampling: Long): Unit {
    Internals.writeArguments(LONG to planeDownsampling)
    Internals.callMethod(rawPtr, MethodBindings.setPlaneDownsamplingPtr, NIL)
  }

  public final fun getPlaneDownsampling(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPlaneDownsamplingPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setConvexHullDownsampling(convexHullDownsampling: Long): Unit {
    Internals.writeArguments(LONG to convexHullDownsampling)
    Internals.callMethod(rawPtr, MethodBindings.setConvexHullDownsamplingPtr, NIL)
  }

  public final fun getConvexHullDownsampling(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getConvexHullDownsamplingPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setNormalizeMesh(normalizeMesh: Boolean): Unit {
    Internals.writeArguments(BOOL to normalizeMesh)
    Internals.callMethod(rawPtr, MethodBindings.setNormalizeMeshPtr, NIL)
  }

  public final fun getNormalizeMesh(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNormalizeMeshPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMode(mode: Mode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setModePtr, NIL)
  }

  public final fun getMode(): Mode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getModePtr, LONG)
    return MeshConvexDecompositionSettings.Mode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setConvexHullApproximation(convexHullApproximation: Boolean): Unit {
    Internals.writeArguments(BOOL to convexHullApproximation)
    Internals.callMethod(rawPtr, MethodBindings.setConvexHullApproximationPtr, NIL)
  }

  public final fun getConvexHullApproximation(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getConvexHullApproximationPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMaxConvexHulls(maxConvexHulls: Long): Unit {
    Internals.writeArguments(LONG to maxConvexHulls)
    Internals.callMethod(rawPtr, MethodBindings.setMaxConvexHullsPtr, NIL)
  }

  public final fun getMaxConvexHulls(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaxConvexHullsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setProjectHullVertices(projectHullVertices: Boolean): Unit {
    Internals.writeArguments(BOOL to projectHullVertices)
    Internals.callMethod(rawPtr, MethodBindings.setProjectHullVerticesPtr, NIL)
  }

  public final fun getProjectHullVertices(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getProjectHullVerticesPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
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

  public object MethodBindings {
    internal val setMaxConcavityPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "set_max_concavity", 373806689)

    internal val getMaxConcavityPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "get_max_concavity", 1740695150)

    internal val setSymmetryPlanesClippingBiasPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "set_symmetry_planes_clipping_bias", 373806689)

    internal val getSymmetryPlanesClippingBiasPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "get_symmetry_planes_clipping_bias", 1740695150)

    internal val setRevolutionAxesClippingBiasPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "set_revolution_axes_clipping_bias", 373806689)

    internal val getRevolutionAxesClippingBiasPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "get_revolution_axes_clipping_bias", 1740695150)

    internal val setMinVolumePerConvexHullPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "set_min_volume_per_convex_hull", 373806689)

    internal val getMinVolumePerConvexHullPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "get_min_volume_per_convex_hull", 1740695150)

    internal val setResolutionPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "set_resolution", 1286410249)

    internal val getResolutionPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "get_resolution", 3905245786)

    internal val setMaxNumVerticesPerConvexHullPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "set_max_num_vertices_per_convex_hull", 1286410249)

    internal val getMaxNumVerticesPerConvexHullPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "get_max_num_vertices_per_convex_hull", 3905245786)

    internal val setPlaneDownsamplingPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "set_plane_downsampling", 1286410249)

    internal val getPlaneDownsamplingPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "get_plane_downsampling", 3905245786)

    internal val setConvexHullDownsamplingPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "set_convex_hull_downsampling", 1286410249)

    internal val getConvexHullDownsamplingPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "get_convex_hull_downsampling", 3905245786)

    internal val setNormalizeMeshPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "set_normalize_mesh", 2586408642)

    internal val getNormalizeMeshPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "get_normalize_mesh", 36873697)

    internal val setModePtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "set_mode", 1668072869)

    internal val getModePtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "get_mode", 23479454)

    internal val setConvexHullApproximationPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "set_convex_hull_approximation", 2586408642)

    internal val getConvexHullApproximationPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "get_convex_hull_approximation", 36873697)

    internal val setMaxConvexHullsPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "set_max_convex_hulls", 1286410249)

    internal val getMaxConvexHullsPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "get_max_convex_hulls", 3905245786)

    internal val setProjectHullVerticesPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "set_project_hull_vertices", 2586408642)

    internal val getProjectHullVerticesPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshConvexDecompositionSettings", "get_project_hull_vertices", 36873697)
  }
}
