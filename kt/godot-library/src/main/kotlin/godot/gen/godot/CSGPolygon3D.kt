// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.PackedVector2Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class CSGPolygon3D : CSGPrimitive3D() {
  public var polygon: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_GET_POLYGON,
          PACKED_VECTOR2_ARRAY.ordinal)
      return TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_SET_POLYGON, NIL.ordinal)
    }

  public var mode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_GET_MODE, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_SET_MODE, NIL.ordinal)
    }

  public var depth: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_GET_DEPTH, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_SET_DEPTH, NIL.ordinal)
    }

  public var spinDegrees: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_GET_SPIN_DEGREES,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_SET_SPIN_DEGREES,
          NIL.ordinal)
    }

  public var spinSides: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_GET_SPIN_SIDES,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_SET_SPIN_SIDES,
          NIL.ordinal)
    }

  public var pathNode: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_GET_PATH_NODE,
          NODE_PATH.ordinal)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_SET_PATH_NODE,
          NIL.ordinal)
    }

  public var pathIntervalType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_GET_PATH_INTERVAL_TYPE,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_SET_PATH_INTERVAL_TYPE,
          NIL.ordinal)
    }

  public var pathInterval: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_GET_PATH_INTERVAL,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_SET_PATH_INTERVAL,
          NIL.ordinal)
    }

  public var pathSimplifyAngle: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_GET_PATH_SIMPLIFY_ANGLE,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_SET_PATH_SIMPLIFY_ANGLE,
          NIL.ordinal)
    }

  public var pathRotation: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_GET_PATH_ROTATION,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_SET_PATH_ROTATION,
          NIL.ordinal)
    }

  public var pathLocal: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_IS_PATH_LOCAL,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_SET_PATH_LOCAL,
          NIL.ordinal)
    }

  public var pathContinuousU: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_IS_PATH_CONTINUOUS_U,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_SET_PATH_CONTINUOUS_U,
          NIL.ordinal)
    }

  public var pathUDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_GET_PATH_U_DISTANCE,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_SET_PATH_U_DISTANCE,
          NIL.ordinal)
    }

  public var pathJoined: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_IS_PATH_JOINED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_SET_PATH_JOINED,
          NIL.ordinal)
    }

  public var smoothFaces: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_GET_SMOOTH_FACES,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_SET_SMOOTH_FACES,
          NIL.ordinal)
    }

  public var material: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_GET_MATERIAL,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Material?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGPOLYGON3D_SET_MATERIAL, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CSGPOLYGON3D)
  }

  public enum class PathIntervalType(
    id: Long
  ) {
    PATH_INTERVAL_DISTANCE(0),
    PATH_INTERVAL_SUBDIVIDE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class PathRotation(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Mode(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
