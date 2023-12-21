// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.PackedVector2Array
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * An array of 2D points is extruded to quickly and easily create a variety of 3D meshes. See also
 * [CSGMesh3D] for using 3D meshes as CSG nodes.
 * **Note:** CSG nodes are intended to be used for level prototyping. Creating CSG nodes has a
 * significant CPU cost compared to creating a [MeshInstance3D] with a [PrimitiveMesh]. Moving a CSG
 * node within another CSG node also has a significant CPU cost, so it should be avoided during
 * gameplay.
 */
@GodotBaseType
public open class CSGPolygon3D : CSGPrimitive3D() {
  /**
   * The point array that defines the 2D polygon that is extruded. This can be a convex or concave
   * polygon with 3 or more points. The polygon must *not* have any intersecting edges. Otherwise,
   * triangulation will fail and no mesh will be generated.
   * **Note:** If only 1 or 2 points are defined in [polygon], no mesh will be generated.
   */
  public var polygon: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPolygonPtr, PACKED_VECTOR2_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPolygonPtr, NIL)
    }

  /**
   * The [mode] used to extrude the [polygon].
   */
  public var mode: Mode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getModePtr, LONG)
      return CSGPolygon3D.Mode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setModePtr, NIL)
    }

  /**
   * When [mode] is [MODEDEPTH], the depth of the extrusion.
   */
  public var depth: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDepthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDepthPtr, NIL)
    }

  /**
   * When [mode] is [MODESPIN], the total number of degrees the [polygon] is rotated when extruding.
   */
  public var spinDegrees: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpinDegreesPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSpinDegreesPtr, NIL)
    }

  /**
   * When [mode] is [MODESPIN], the number of extrusions made.
   */
  public var spinSides: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpinSidesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSpinSidesPtr, NIL)
    }

  /**
   * When [mode] is [MODEPATH], the location of the [Path3D] object used to extrude the [polygon].
   */
  public var pathNode: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathNodePtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathNodePtr, NIL)
    }

  /**
   * When [mode] is [MODEPATH], this will determine if the interval should be by distance
   * ([PATHINTERVALDISTANCE]) or subdivision fractions ([PATHINTERVALSUBDIVIDE]).
   */
  public var pathIntervalType: PathIntervalType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathIntervalTypePtr, LONG)
      return CSGPolygon3D.PathIntervalType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathIntervalTypePtr, NIL)
    }

  /**
   * When [mode] is [MODEPATH], the path interval or ratio of path points to extrusions.
   */
  public var pathInterval: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathIntervalPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPathIntervalPtr, NIL)
    }

  /**
   * When [mode] is [MODEPATH], extrusions that are less than this angle, will be merged together to
   * reduce polygon count.
   */
  public var pathSimplifyAngle: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathSimplifyAnglePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPathSimplifyAnglePtr, NIL)
    }

  /**
   * When [mode] is [MODEPATH], the [PathRotation] method used to rotate the [polygon] as it is
   * extruded.
   */
  public var pathRotation: PathRotation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathRotationPtr, LONG)
      return CSGPolygon3D.PathRotation.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathRotationPtr, NIL)
    }

  /**
   * When [mode] is [MODEPATH], if `true` the [Transform3D] of the [CSGPolygon3D] is used as the
   * starting point for the extrusions, not the [Transform3D] of the [pathNode].
   */
  public var pathLocal: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isPathLocalPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathLocalPtr, NIL)
    }

  /**
   * When [mode] is [MODEPATH], by default, the top half of the [material] is stretched along the
   * entire length of the extruded shape. If `false` the top half of the material is repeated every
   * step of the extrusion.
   */
  public var pathContinuousU: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isPathContinuousUPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathContinuousUPtr, NIL)
    }

  /**
   * When [mode] is [MODEPATH], this is the distance along the path, in meters, the texture
   * coordinates will tile. When set to 0, texture coordinates will match geometry exactly with no
   * tiling.
   */
  public var pathUDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathUDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPathUDistancePtr, NIL)
    }

  /**
   * When [mode] is [MODEPATH], if `true` the ends of the path are joined, by adding an extrusion
   * between the last and first points of the path.
   */
  public var pathJoined: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isPathJoinedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathJoinedPtr, NIL)
    }

  /**
   * If `true`, applies smooth shading to the extrusions.
   */
  public var smoothFaces: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSmoothFacesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSmoothFacesPtr, NIL)
    }

  /**
   * Material to use for the resulting mesh. The UV maps the top half of the material to the
   * extruded shape (U along the length of the extrusions and V around the outline of the [polygon]),
   * the bottom-left quarter to the front end face, and the bottom-right quarter to the back end face.
   */
  public var material: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaterialPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMaterialPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CSGPOLYGON3D, scriptIndex)
    return true
  }

  public enum class Mode(
    id: Long,
  ) {
    /**
     * The [polygon] shape is extruded along the negative Z axis.
     */
    MODE_DEPTH(0),
    /**
     * The [polygon] shape is extruded by rotating it around the Y axis.
     */
    MODE_SPIN(1),
    /**
     * The [polygon] shape is extruded along the [Path3D] specified in [pathNode].
     */
    MODE_PATH(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class PathRotation(
    id: Long,
  ) {
    /**
     * The [polygon] shape is not rotated.
     * **Note:** Requires the path Z coordinates to continually decrease to ensure viable shapes.
     */
    PATH_ROTATION_POLYGON(0),
    /**
     * The [polygon] shape is rotated along the path, but it is not rotated around the path axis.
     * **Note:** Requires the path Z coordinates to continually decrease to ensure viable shapes.
     */
    PATH_ROTATION_PATH(1),
    /**
     * The [polygon] shape follows the path and its rotations around the path axis.
     */
    PATH_ROTATION_PATH_FOLLOW(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class PathIntervalType(
    id: Long,
  ) {
    /**
     * When [mode] is set to [MODEPATH], [pathInterval] will determine the distance, in meters, each
     * interval of the path will extrude.
     */
    PATH_INTERVAL_DISTANCE(0),
    /**
     * When [mode] is set to [MODEPATH], [pathInterval] will subdivide the polygons along the path.
     */
    PATH_INTERVAL_SUBDIVIDE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setPolygonPtr: VoidPtr = TypeManager.getMethodBindPtr("CSGPolygon3D", "set_polygon")

    public val getPolygonPtr: VoidPtr = TypeManager.getMethodBindPtr("CSGPolygon3D", "get_polygon")

    public val setModePtr: VoidPtr = TypeManager.getMethodBindPtr("CSGPolygon3D", "set_mode")

    public val getModePtr: VoidPtr = TypeManager.getMethodBindPtr("CSGPolygon3D", "get_mode")

    public val setDepthPtr: VoidPtr = TypeManager.getMethodBindPtr("CSGPolygon3D", "set_depth")

    public val getDepthPtr: VoidPtr = TypeManager.getMethodBindPtr("CSGPolygon3D", "get_depth")

    public val setSpinDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_spin_degrees")

    public val getSpinDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_spin_degrees")

    public val setSpinSidesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_spin_sides")

    public val getSpinSidesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_spin_sides")

    public val setPathNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_path_node")

    public val getPathNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_path_node")

    public val setPathIntervalTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_path_interval_type")

    public val getPathIntervalTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_path_interval_type")

    public val setPathIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_path_interval")

    public val getPathIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_path_interval")

    public val setPathSimplifyAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_path_simplify_angle")

    public val getPathSimplifyAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_path_simplify_angle")

    public val setPathRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_path_rotation")

    public val getPathRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_path_rotation")

    public val setPathLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_path_local")

    public val isPathLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "is_path_local")

    public val setPathContinuousUPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_path_continuous_u")

    public val isPathContinuousUPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "is_path_continuous_u")

    public val setPathUDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_path_u_distance")

    public val getPathUDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_path_u_distance")

    public val setPathJoinedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_path_joined")

    public val isPathJoinedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "is_path_joined")

    public val setMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_material")

    public val getMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_material")

    public val setSmoothFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_smooth_faces")

    public val getSmoothFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_smooth_faces")
  }
}
