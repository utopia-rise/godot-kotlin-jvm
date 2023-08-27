// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Parameters to be used with a [godot.Mesh] convex decomposition operation.
 *
 * Parameters to be used with a [godot.Mesh] convex decomposition operation.
 */
@GodotBaseType
public open class MeshConvexDecompositionSettings : RefCounted() {
  /**
   * Maximum concavity. Ranges from `0.0` to `1.0`.
   */
  public var maxConcavity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_MAX_CONCAVITY, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_MAX_CONCAVITY, NIL)
    }

  /**
   * Controls the bias toward clipping along symmetry planes. Ranges from `0.0` to `1.0`.
   */
  public var symmetryPlanesClippingBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_SYMMETRY_PLANES_CLIPPING_BIAS,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_SYMMETRY_PLANES_CLIPPING_BIAS,
          NIL)
    }

  /**
   * Controls the bias toward clipping along revolution axes. Ranges from `0.0` to `1.0`.
   */
  public var revolutionAxesClippingBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_REVOLUTION_AXES_CLIPPING_BIAS,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_REVOLUTION_AXES_CLIPPING_BIAS,
          NIL)
    }

  /**
   * Controls the adaptive sampling of the generated convex-hulls. Ranges from `0.0` to `0.01`.
   */
  public var minVolumePerConvexHull: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_MIN_VOLUME_PER_CONVEX_HULL,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_MIN_VOLUME_PER_CONVEX_HULL,
          NIL)
    }

  /**
   * Maximum number of voxels generated during the voxelization stage.
   */
  public var resolution: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_RESOLUTION, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_RESOLUTION, NIL)
    }

  /**
   * Controls the maximum number of triangles per convex-hull. Ranges from `4` to `1024`.
   */
  public var maxNumVerticesPerConvexHull: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_MAX_NUM_VERTICES_PER_CONVEX_HULL,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_MAX_NUM_VERTICES_PER_CONVEX_HULL,
          NIL)
    }

  /**
   * Controls the granularity of the search for the "best" clipping plane. Ranges from `1` to `16`.
   */
  public var planeDownsampling: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_PLANE_DOWNSAMPLING, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_PLANE_DOWNSAMPLING, NIL)
    }

  /**
   * Controls the precision of the convex-hull generation process during the clipping plane selection stage. Ranges from `1` to `16`.
   */
  public var convexHullDownsampling: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_CONVEX_HULL_DOWNSAMPLING,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_CONVEX_HULL_DOWNSAMPLING,
          NIL)
    }

  /**
   * If enabled normalizes the mesh before applying the convex decomposition.
   */
  public var normalizeMesh: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_NORMALIZE_MESH, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_NORMALIZE_MESH, NIL)
    }

  /**
   * Mode for the approximate convex decomposition.
   */
  public var mode: Mode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_MODE, LONG)
      return MeshConvexDecompositionSettings.Mode.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_MODE, NIL)
    }

  /**
   * If enabled uses approximation for computing convex hulls.
   */
  public var convexHullApproximation: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_CONVEX_HULL_APPROXIMATION,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_CONVEX_HULL_APPROXIMATION,
          NIL)
    }

  /**
   * The maximum number of convex hulls to produce from the merge operation.
   */
  public var maxConvexHulls: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_MAX_CONVEX_HULLS, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_MAX_CONVEX_HULLS, NIL)
    }

  /**
   * If enabled projects output convex hull vertices onto original source mesh to increase floating point accuracy of the results.
   */
  public var projectHullVertices: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_PROJECT_HULL_VERTICES, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_PROJECT_HULL_VERTICES, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS, scriptIndex)
    return true
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
