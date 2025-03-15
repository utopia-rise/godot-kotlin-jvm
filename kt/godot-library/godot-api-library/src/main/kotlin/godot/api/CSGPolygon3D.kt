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
import godot.core.NodePath
import godot.core.PackedVector2Array
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public final inline var polygon: PackedVector2Array
    @JvmName("polygonProperty")
    get() = getPolygon()
    @JvmName("polygonProperty")
    set(`value`) {
      setPolygon(value)
    }

  /**
   * The [mode] used to extrude the [polygon].
   */
  public final inline var mode: Mode
    @JvmName("modeProperty")
    get() = getMode()
    @JvmName("modeProperty")
    set(`value`) {
      setMode(value)
    }

  /**
   * When [mode] is [MODE_DEPTH], the depth of the extrusion.
   */
  public final inline var depth: Float
    @JvmName("depthProperty")
    get() = getDepth()
    @JvmName("depthProperty")
    set(`value`) {
      setDepth(value)
    }

  /**
   * When [mode] is [MODE_SPIN], the total number of degrees the [polygon] is rotated when
   * extruding.
   */
  public final inline var spinDegrees: Float
    @JvmName("spinDegreesProperty")
    get() = getSpinDegrees()
    @JvmName("spinDegreesProperty")
    set(`value`) {
      setSpinDegrees(value)
    }

  /**
   * When [mode] is [MODE_SPIN], the number of extrusions made.
   */
  public final inline var spinSides: Int
    @JvmName("spinSidesProperty")
    get() = getSpinSides()
    @JvmName("spinSidesProperty")
    set(`value`) {
      setSpinSides(value)
    }

  /**
   * When [mode] is [MODE_PATH], the location of the [Path3D] object used to extrude the [polygon].
   */
  public final inline var pathNode: NodePath
    @JvmName("pathNodeProperty")
    get() = getPathNode()
    @JvmName("pathNodeProperty")
    set(`value`) {
      setPathNode(value)
    }

  /**
   * When [mode] is [MODE_PATH], this will determine if the interval should be by distance
   * ([PATH_INTERVAL_DISTANCE]) or subdivision fractions ([PATH_INTERVAL_SUBDIVIDE]).
   */
  public final inline var pathIntervalType: PathIntervalType
    @JvmName("pathIntervalTypeProperty")
    get() = getPathIntervalType()
    @JvmName("pathIntervalTypeProperty")
    set(`value`) {
      setPathIntervalType(value)
    }

  /**
   * When [mode] is [MODE_PATH], the path interval or ratio of path points to extrusions.
   */
  public final inline var pathInterval: Float
    @JvmName("pathIntervalProperty")
    get() = getPathInterval()
    @JvmName("pathIntervalProperty")
    set(`value`) {
      setPathInterval(value)
    }

  /**
   * When [mode] is [MODE_PATH], extrusions that are less than this angle, will be merged together
   * to reduce polygon count.
   */
  public final inline var pathSimplifyAngle: Float
    @JvmName("pathSimplifyAngleProperty")
    get() = getPathSimplifyAngle()
    @JvmName("pathSimplifyAngleProperty")
    set(`value`) {
      setPathSimplifyAngle(value)
    }

  /**
   * When [mode] is [MODE_PATH], the path rotation method used to rotate the [polygon] as it is
   * extruded.
   */
  public final inline var pathRotation: PathRotation
    @JvmName("pathRotationProperty")
    get() = getPathRotation()
    @JvmName("pathRotationProperty")
    set(`value`) {
      setPathRotation(value)
    }

  /**
   * When [mode] is [MODE_PATH], if `true` the polygon will be rotated according to the proper
   * tangent of the path at the sampled points. If `false` an approximation is used, which decreases in
   * accuracy as the number of subdivisions decreases.
   */
  public final inline var pathRotationAccurate: Boolean
    @JvmName("pathRotationAccurateProperty")
    get() = getPathRotationAccurate()
    @JvmName("pathRotationAccurateProperty")
    set(`value`) {
      setPathRotationAccurate(value)
    }

  /**
   * When [mode] is [MODE_PATH], if `true` the [Transform3D] of the [CSGPolygon3D] is used as the
   * starting point for the extrusions, not the [Transform3D] of the [pathNode].
   */
  public final inline var pathLocal: Boolean
    @JvmName("pathLocalProperty")
    get() = isPathLocal()
    @JvmName("pathLocalProperty")
    set(`value`) {
      setPathLocal(value)
    }

  /**
   * When [mode] is [MODE_PATH], by default, the top half of the [material] is stretched along the
   * entire length of the extruded shape. If `false` the top half of the material is repeated every
   * step of the extrusion.
   */
  public final inline var pathContinuousU: Boolean
    @JvmName("pathContinuousUProperty")
    get() = isPathContinuousU()
    @JvmName("pathContinuousUProperty")
    set(`value`) {
      setPathContinuousU(value)
    }

  /**
   * When [mode] is [MODE_PATH], this is the distance along the path, in meters, the texture
   * coordinates will tile. When set to 0, texture coordinates will match geometry exactly with no
   * tiling.
   */
  public final inline var pathUDistance: Float
    @JvmName("pathUDistanceProperty")
    get() = getPathUDistance()
    @JvmName("pathUDistanceProperty")
    set(`value`) {
      setPathUDistance(value)
    }

  /**
   * When [mode] is [MODE_PATH], if `true` the ends of the path are joined, by adding an extrusion
   * between the last and first points of the path.
   */
  public final inline var pathJoined: Boolean
    @JvmName("pathJoinedProperty")
    get() = isPathJoined()
    @JvmName("pathJoinedProperty")
    set(`value`) {
      setPathJoined(value)
    }

  /**
   * If `true`, applies smooth shading to the extrusions.
   */
  public final inline var smoothFaces: Boolean
    @JvmName("smoothFacesProperty")
    get() = getSmoothFaces()
    @JvmName("smoothFacesProperty")
    set(`value`) {
      setSmoothFaces(value)
    }

  /**
   * Material to use for the resulting mesh. The UV maps the top half of the material to the
   * extruded shape (U along the length of the extrusions and V around the outline of the [polygon]),
   * the bottom-left quarter to the front end face, and the bottom-right quarter to the back end face.
   */
  public final inline var material: Material?
    @JvmName("materialProperty")
    get() = getMaterial()
    @JvmName("materialProperty")
    set(`value`) {
      setMaterial(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(121, scriptIndex)
  }

  public final fun setPolygon(polygon: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(ptr, MethodBindings.setPolygonPtr, NIL)
  }

  public final fun getPolygon(): PackedVector2Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPolygonPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  public final fun setMode(mode: Mode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setModePtr, NIL)
  }

  public final fun getMode(): Mode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getModePtr, LONG)
    return CSGPolygon3D.Mode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setDepth(depth: Float): Unit {
    TransferContext.writeArguments(DOUBLE to depth.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDepthPtr, NIL)
  }

  public final fun getDepth(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDepthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSpinDegrees(degrees: Float): Unit {
    TransferContext.writeArguments(DOUBLE to degrees.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSpinDegreesPtr, NIL)
  }

  public final fun getSpinDegrees(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSpinDegreesPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSpinSides(spinSides: Int): Unit {
    TransferContext.writeArguments(LONG to spinSides.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSpinSidesPtr, NIL)
  }

  public final fun getSpinSides(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSpinSidesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setPathNode(path: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(ptr, MethodBindings.setPathNodePtr, NIL)
  }

  public final fun getPathNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPathNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setPathIntervalType(intervalType: PathIntervalType): Unit {
    TransferContext.writeArguments(LONG to intervalType.id)
    TransferContext.callMethod(ptr, MethodBindings.setPathIntervalTypePtr, NIL)
  }

  public final fun getPathIntervalType(): PathIntervalType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPathIntervalTypePtr, LONG)
    return CSGPolygon3D.PathIntervalType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setPathInterval(interval: Float): Unit {
    TransferContext.writeArguments(DOUBLE to interval.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPathIntervalPtr, NIL)
  }

  public final fun getPathInterval(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPathIntervalPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPathSimplifyAngle(degrees: Float): Unit {
    TransferContext.writeArguments(DOUBLE to degrees.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPathSimplifyAnglePtr, NIL)
  }

  public final fun getPathSimplifyAngle(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPathSimplifyAnglePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPathRotation(pathRotation: PathRotation): Unit {
    TransferContext.writeArguments(LONG to pathRotation.id)
    TransferContext.callMethod(ptr, MethodBindings.setPathRotationPtr, NIL)
  }

  public final fun getPathRotation(): PathRotation {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPathRotationPtr, LONG)
    return CSGPolygon3D.PathRotation.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setPathRotationAccurate(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setPathRotationAccuratePtr, NIL)
  }

  public final fun getPathRotationAccurate(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPathRotationAccuratePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPathLocal(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setPathLocalPtr, NIL)
  }

  public final fun isPathLocal(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPathLocalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPathContinuousU(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setPathContinuousUPtr, NIL)
  }

  public final fun isPathContinuousU(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPathContinuousUPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPathUDistance(distance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to distance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPathUDistancePtr, NIL)
  }

  public final fun getPathUDistance(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPathUDistancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPathJoined(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setPathJoinedPtr, NIL)
  }

  public final fun isPathJoined(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPathJoinedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMaterial(material: Material?): Unit {
    TransferContext.writeArguments(OBJECT to material)
    TransferContext.callMethod(ptr, MethodBindings.setMaterialPtr, NIL)
  }

  public final fun getMaterial(): Material? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaterialPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Material?)
  }

  public final fun setSmoothFaces(smoothFaces: Boolean): Unit {
    TransferContext.writeArguments(BOOL to smoothFaces)
    TransferContext.callMethod(ptr, MethodBindings.setSmoothFacesPtr, NIL)
  }

  public final fun getSmoothFaces(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSmoothFacesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public enum class Mode(
    id: Long,
  ) {
    /**
     * The [polygon] shape is extruded along the negative Z axis.
     */
    DEPTH(0),
    /**
     * The [polygon] shape is extruded by rotating it around the Y axis.
     */
    SPIN(1),
    /**
     * The [polygon] shape is extruded along the [Path3D] specified in [pathNode].
     */
    PATH(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Mode = entries.single { it.id == `value` }
    }
  }

  public enum class PathRotation(
    id: Long,
  ) {
    /**
     * The [polygon] shape is not rotated.
     * **Note:** Requires the path Z coordinates to continually decrease to ensure viable shapes.
     */
    POLYGON(0),
    /**
     * The [polygon] shape is rotated along the path, but it is not rotated around the path axis.
     * **Note:** Requires the path Z coordinates to continually decrease to ensure viable shapes.
     */
    PATH(1),
    /**
     * The [polygon] shape follows the path and its rotations around the path axis.
     */
    PATH_FOLLOW(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PathRotation = entries.single { it.id == `value` }
    }
  }

  public enum class PathIntervalType(
    id: Long,
  ) {
    /**
     * When [mode] is set to [MODE_PATH], [pathInterval] will determine the distance, in meters,
     * each interval of the path will extrude.
     */
    DISTANCE(0),
    /**
     * When [mode] is set to [MODE_PATH], [pathInterval] will subdivide the polygons along the path.
     */
    SUBDIVIDE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PathIntervalType = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_polygon", 1509147220)

    internal val getPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_polygon", 2961356807)

    internal val setModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_mode", 3158377035)

    internal val getModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_mode", 1201612222)

    internal val setDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_depth", 373806689)

    internal val getDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_depth", 1740695150)

    internal val setSpinDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_spin_degrees", 373806689)

    internal val getSpinDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_spin_degrees", 1740695150)

    internal val setSpinSidesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_spin_sides", 1286410249)

    internal val getSpinSidesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_spin_sides", 3905245786)

    internal val setPathNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_path_node", 1348162250)

    internal val getPathNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_path_node", 4075236667)

    internal val setPathIntervalTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_path_interval_type", 3744240707)

    internal val getPathIntervalTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_path_interval_type", 3434618397)

    internal val setPathIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_path_interval", 373806689)

    internal val getPathIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_path_interval", 1740695150)

    internal val setPathSimplifyAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_path_simplify_angle", 373806689)

    internal val getPathSimplifyAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_path_simplify_angle", 1740695150)

    internal val setPathRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_path_rotation", 1412947288)

    internal val getPathRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_path_rotation", 647219346)

    internal val setPathRotationAccuratePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_path_rotation_accurate", 2586408642)

    internal val getPathRotationAccuratePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_path_rotation_accurate", 36873697)

    internal val setPathLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_path_local", 2586408642)

    internal val isPathLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "is_path_local", 36873697)

    internal val setPathContinuousUPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_path_continuous_u", 2586408642)

    internal val isPathContinuousUPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "is_path_continuous_u", 36873697)

    internal val setPathUDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_path_u_distance", 373806689)

    internal val getPathUDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_path_u_distance", 1740695150)

    internal val setPathJoinedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_path_joined", 2586408642)

    internal val isPathJoinedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "is_path_joined", 36873697)

    internal val setMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_material", 2757459619)

    internal val getMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_material", 5934680)

    internal val setSmoothFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "set_smooth_faces", 2586408642)

    internal val getSmoothFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPolygon3D", "get_smooth_faces", 36873697)
  }
}
