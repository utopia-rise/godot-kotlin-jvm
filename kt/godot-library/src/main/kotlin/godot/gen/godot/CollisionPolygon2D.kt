// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
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
 * A node that provides a polygon shape to a [CollisionObject2D] parent and allows to edit it. The
 * polygon can be concave or convex. This can give a detection shape to an [Area2D], turn
 * [PhysicsBody2D] into a solid object, or give a hollow shape to a [StaticBody2D].
 * **Warning:** A non-uniformly scaled [CollisionShape2D] will likely not behave as expected. Make
 * sure to keep its scale the same on all axes and adjust its shape resource instead.
 */
@GodotBaseType
public open class CollisionPolygon2D : Node2D() {
  /**
   * Collision build mode. Use one of the [BuildMode] constants.
   */
  public var buildMode: BuildMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBuildModePtr, LONG)
      return CollisionPolygon2D.BuildMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBuildModePtr, NIL)
    }

  /**
   * The polygon's list of vertices. Each point will be connected to the next, and the final point
   * will be connected to the first.
   * **Note:** The returned vertices are in the local coordinate space of the given
   * [CollisionPolygon2D].
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
   * If `true`, no collisions will be detected.
   */
  public var disabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDisabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDisabledPtr, NIL)
    }

  /**
   * If `true`, only edges that face up, relative to [CollisionPolygon2D]'s rotation, will collide
   * with other objects.
   * **Note:** This property has no effect if this [CollisionPolygon2D] is a child of an [Area2D]
   * node.
   */
  public var oneWayCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isOneWayCollisionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOneWayCollisionPtr, NIL)
    }

  /**
   * The margin used for one-way collision (in pixels). Higher values will make the shape thicker,
   * and work better for colliders that enter the polygon at a high velocity.
   */
  public var oneWayCollisionMargin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOneWayCollisionMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setOneWayCollisionMarginPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_COLLISIONPOLYGON2D, scriptIndex)
    return true
  }

  public enum class BuildMode(
    id: Long,
  ) {
    /**
     * Collisions will include the polygon and its contained area. In this mode the node has the
     * same effect as several [ConvexPolygonShape2D] nodes, one for each convex shape in the convex
     * decomposition of the polygon (but without the overhead of multiple nodes).
     */
    BUILD_SOLIDS(0),
    /**
     * Collisions will only include the polygon edges. In this mode the node has the same effect as
     * a single [ConcavePolygonShape2D] made of segments, with the restriction that each segment (after
     * the first one) starts where the previous one ends, and the last one ends where the first one
     * starts (forming a closed but hollow polygon).
     */
    BUILD_SEGMENTS(1),
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
    public val setPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon2D", "set_polygon")

    public val getPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon2D", "get_polygon")

    public val setBuildModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon2D", "set_build_mode")

    public val getBuildModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon2D", "get_build_mode")

    public val setDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon2D", "set_disabled")

    public val isDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon2D", "is_disabled")

    public val setOneWayCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon2D", "set_one_way_collision")

    public val isOneWayCollisionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon2D", "is_one_way_collision_enabled")

    public val setOneWayCollisionMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon2D", "set_one_way_collision_margin")

    public val getOneWayCollisionMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon2D", "get_one_way_collision_margin")
  }
}
