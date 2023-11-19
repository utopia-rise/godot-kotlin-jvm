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

@GodotBaseType
public open class CSGPolygon3D : CSGPrimitive3D() {
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
    MODE_DEPTH(0),
    MODE_SPIN(1),
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
    PATH_ROTATION_POLYGON(0),
    PATH_ROTATION_PATH(1),
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
    PATH_INTERVAL_DISTANCE(0),
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
