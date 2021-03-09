// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolVector2Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

/**
 * Defines a 2D collision polygon.
 *
 * Provides a 2D collision polygon to a [godot.CollisionObject2D] parent. Polygons can be drawn in the editor or specified by a list of vertices.
 */
@GodotBaseType
open class CollisionPolygon2D : Node2D() {
  /**
   * Collision build mode. Use one of the [enum BuildMode] constants.
   */
  open var buildMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON2D_GET_BUILD_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON2D_SET_BUILD_MODE,
          NIL)
    }

  /**
   * If `true`, no collisions will be detected.
   */
  open var disabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON2D_GET_DISABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON2D_SET_DISABLED,
          NIL)
    }

  /**
   * If `true`, only edges that face up, relative to [godot.CollisionPolygon2D]'s rotation, will collide with other objects.
   */
  open var oneWayCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON2D_GET_ONE_WAY_COLLISION, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON2D_SET_ONE_WAY_COLLISION, NIL)
    }

  /**
   * The margin used for one-way collision (in pixels). Higher values will make the shape thicker, and work better for colliders that enter the polygon at a high velocity.
   */
  open var oneWayCollisionMargin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON2D_GET_ONE_WAY_COLLISION_MARGIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON2D_SET_ONE_WAY_COLLISION_MARGIN, NIL)
    }

  /**
   * The polygon's list of vertices. The final point will be connected to the first. The returned value is a clone of the [godot.core.PoolVector2Array], not a reference.
   */
  open var polygon: PoolVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON2D_GET_POLYGON,
          POOL_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
    }
    set(value) {
      TransferContext.writeArguments(POOL_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON2D_SET_POLYGON,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_COLLISIONPOLYGON2D)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  enum class BuildMode(
    id: Long
  ) {
    /**
     * Collisions will include the polygon and its contained area.
     */
    BUILD_SOLIDS(0),

    /**
     * Collisions will only include the polygon edges.
     */
    BUILD_SEGMENTS(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Collisions will only include the polygon edges.
     */
    final const val BUILD_SEGMENTS: Long = 1

    /**
     * Collisions will include the polygon and its contained area.
     */
    final const val BUILD_SOLIDS: Long = 0
  }
}
