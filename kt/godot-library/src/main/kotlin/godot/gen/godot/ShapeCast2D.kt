// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Node for physics collision sweep and immediate overlap queries. Similar to the [godot.RayCast2D] node.
 *
 * Shape casting allows to detect collision objects by sweeping the [shape] along the cast direction determined by [targetPosition] (useful for things like beam weapons).
 *
 * Immediate collision overlaps can be done with the [targetPosition] set to `Vector2(0, 0)` and by calling [forceShapecastUpdate] within the same **physics_frame**. This also helps to overcome some limitations of [godot.Area2D] when used as a continuous detection area, often requiring waiting a couple of frames before collision information is available to [godot.Area2D] nodes, and when using the signals creates unnecessary complexity.
 *
 * The node can detect multiple collision objects, but usually the first detected collision
 *
 * **Note:** shape casting is more computationally expensive compared to ray casting.
 */
@GodotBaseType
public open class ShapeCast2D : Node2D() {
  /**
   * If `true`, collisions will be reported.
   */
  public open var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_GET_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_SET_ENABLED, NIL)
    }

  /**
   * Any [godot.Shape2D] derived shape used for collision queries.
   */
  public open var shape: Shape2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_GET_SHAPE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Shape2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_SET_SHAPE, NIL)
    }

  /**
   * If `true`, the parent node will be excluded from collision detection.
   */
  public open var excludeParent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_GET_EXCLUDE_PARENT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_SET_EXCLUDE_PARENT,
          NIL)
    }

  /**
   * The shape's destination point, relative to this node's `position`.
   */
  public open var targetPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_GET_TARGET_POSITION,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_SET_TARGET_POSITION,
          NIL)
    }

  /**
   * The collision margin for the shape. A larger margin helps detecting collisions more consistently, at the cost of precision.
   */
  public open var margin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_GET_MARGIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_SET_MARGIN, NIL)
    }

  /**
   * The number of intersections can be limited with this parameter, to reduce the processing time.
   */
  public open var maxResults: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_GET_MAX_RESULTS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_SET_MAX_RESULTS, NIL)
    }

  /**
   * The shape's collision mask. Only objects in at least one collision layer enabled in the mask will be detected.
   */
  public open var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_GET_COLLISION_MASK,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_SET_COLLISION_MASK,
          NIL)
    }

  /**
   * If `true`, collision with [godot.Area2D]s will be reported.
   */
  public open var collideWithAreas: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_GET_COLLIDE_WITH_AREAS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_SET_COLLIDE_WITH_AREAS, NIL)
    }

  /**
   * If `true`, collision with [godot.PhysicsBody2D]s will be reported.
   */
  public open var collideWithBodies: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_GET_COLLIDE_WITH_BODIES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_SET_COLLIDE_WITH_BODIES, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SHAPECAST2D)
  }

  /**
   * Returns whether any object is intersecting with the shape's vector (considering the vector length).
   */
  public open fun isColliding(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_IS_COLLIDING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * The number of collisions detected at the point of impact. Use this to iterate over multiple collisions as provided by [getCollider], [getColliderShape], [getCollisionPoint], and [getCollisionNormal] methods.
   */
  public open fun getCollisionCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_GET_COLLISION_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Updates the collision information for the shape. Use this method to update the collision information immediately instead of waiting for the next `_physics_process` call, for example if the shape or its parent has changed state.
   *
   * **Note:** `enabled == true` is not required for this to work.
   */
  public open fun forceShapecastUpdate(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_FORCE_SHAPECAST_UPDATE,
        NIL)
  }

  /**
   * Returns the [godot.Object] of one of the multiple collisions at `index`, or `null` if no object is intersecting the shape (i.e. [isColliding] returns `false`).
   */
  public open fun getCollider(index: Long): Object? {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_GET_COLLIDER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Returns the shape ID of one of the multiple collisions at `index` that the shape intersects, or `0` if no object is intersecting the shape (i.e. [isColliding] returns `false`).
   */
  public open fun getColliderShape(index: Long): Long {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_GET_COLLIDER_SHAPE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the collision point containing one of the multiple collisions at `index` at which the shape intersects the object.
   *
   * **Note:** this point is in the **global** coordinate system.
   */
  public open fun getCollisionPoint(index: Long): Vector2 {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_GET_COLLISION_POINT,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the normal containing one of the multiple collisions at `index` of the intersecting object.
   */
  public open fun getCollisionNormal(index: Long): Vector2 {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_GET_COLLISION_NORMAL,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * The fraction of the motion (between 0 and 1) of how far the shape can move without triggering a collision. The motion is determined by [targetPosition].
   */
  public open fun getClosestCollisionSafeFraction(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_GET_CLOSEST_COLLISION_SAFE_FRACTION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * The fraction of the motion (between 0 and 1) when the shape triggers a collision. The motion is determined by [targetPosition].
   */
  public open fun getClosestCollisionUnsafeFraction(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_GET_CLOSEST_COLLISION_UNSAFE_FRACTION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Adds a collision exception so the shape does not report collisions with the specified [RID].
   */
  public open fun addExceptionRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_ADD_EXCEPTION_RID, NIL)
  }

  /**
   * Adds a collision exception so the shape does not report collisions with the specified [godot.CollisionObject2D] node.
   */
  public open fun addException(node: CollisionObject2D): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_ADD_EXCEPTION, NIL)
  }

  /**
   * Removes a collision exception so the shape does report collisions with the specified [RID].
   */
  public open fun removeExceptionRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_REMOVE_EXCEPTION_RID,
        NIL)
  }

  /**
   * Removes a collision exception so the shape does report collisions with the specified [godot.CollisionObject2D] node.
   */
  public open fun removeException(node: CollisionObject2D): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_REMOVE_EXCEPTION, NIL)
  }

  /**
   * Removes all collision exceptions for this shape.
   */
  public open fun clearExceptions(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_CLEAR_EXCEPTIONS, NIL)
  }

  /**
   * Based on `value`, enables or disables the specified layer in the [collisionMask], given a `layer_number` between 1 and 32.
   */
  public open fun setCollisionMaskValue(layerNumber: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber, BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_SET_COLLISION_MASK_VALUE, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionMask] is enabled, given a `layer_number` between 1 and 32.
   */
  public open fun getCollisionMaskValue(layerNumber: Long): Boolean {
    TransferContext.writeArguments(LONG to layerNumber)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SHAPECAST2D_GET_COLLISION_MASK_VALUE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public companion object
}
