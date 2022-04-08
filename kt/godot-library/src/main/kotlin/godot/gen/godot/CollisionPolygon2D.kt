// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Defines a 2D collision polygon.
 *
 * Provides a concave or convex 2D collision polygon to a [godot.CollisionObject2D] parent. Polygons can be drawn in the editor or specified by a list of vertices. See also [godot.ConvexPolygonShape2D].
 *
 * In the editor, a [godot.CollisionPolygon2D] can be generated from a [godot.Sprite2D]'s outline by selecting a [godot.Sprite2D] node, going to the **Sprite2D** menu at the top of the 2D editor viewport then choosing **Create CollisionPolygon2D Sibling**.
 */
@GodotBaseType
public open class CollisionPolygon2D : Node2D() {
  /**
   * Collision build mode. Use one of the [enum BuildMode] constants.
   */
  public var buildMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON2D_GET_BUILD_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON2D_SET_BUILD_MODE,
          NIL)
    }

  /**
   * The polygon's list of vertices. The final point will be connected to the first. The returned value is a clone of the [godot.PackedVector2Array], not a reference.
   */
  public var polygon: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON2D_GET_POLYGON,
          PACKED_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON2D_SET_POLYGON,
          NIL)
    }

  /**
   * If `true`, no collisions will be detected.
   */
  public var disabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON2D_IS_DISABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON2D_SET_DISABLED,
          NIL)
    }

  /**
   * If `true`, only edges that face up, relative to [godot.CollisionPolygon2D]'s rotation, will collide with other objects.
   */
  public var oneWayCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON2D_IS_ONE_WAY_COLLISION_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON2D_SET_ONE_WAY_COLLISION, NIL)
    }

  /**
   * The margin used for one-way collision (in pixels). Higher values will make the shape thicker, and work better for colliders that enter the polygon at a high velocity.
   */
  public var oneWayCollisionMargin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON2D_GET_ONE_WAY_COLLISION_MARGIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON2D_SET_ONE_WAY_COLLISION_MARGIN, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_COLLISIONPOLYGON2D)
  }

  public enum class BuildMode(
    id: Long
  ) {
    /**
     * Collisions will include the polygon and its contained area.
     */
    BUILD_SOLIDS(0),
    /**
     * Collisions will only include the polygon edges.
     */
    BUILD_SEGMENTS(1),
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
