// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Query the closest object intersecting a ray.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/physics/ray-casting.html]($DOCS_URL/tutorials/physics/ray-casting.html)
 *
 * A RayCast represents a line from its origin to its destination position, [targetPosition]. It is used to query the 2D space in order to find the closest object along the path of the ray.
 *
 * RayCast2D can ignore some objects by adding them to the exception list via [addException], by setting proper filtering with collision layers, or by filtering object types with type masks.
 *
 * RayCast2D can be configured to report collisions with [godot.Area2D]s ([collideWithAreas]) and/or [godot.PhysicsBody2D]s ([collideWithBodies]).
 *
 * Only enabled raycasts will be able to query the space and report collisions.
 *
 * RayCast2D calculates intersection every physics frame (see [godot.Node]), and the result is cached so it can be used later until the next frame. If multiple queries are required between physics frames (or during the same frame) use [forceRaycastUpdate] after adjusting the raycast.
 */
@GodotBaseType
public open class RayCast2D : Node2D() {
  /**
   * If `true`, collisions will be reported.
   */
  public open var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_GET_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_SET_ENABLED, NIL)
    }

  /**
   * If `true`, the parent node will be excluded from collision detection.
   */
  public open var excludeParent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_GET_EXCLUDE_PARENT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_SET_EXCLUDE_PARENT, NIL)
    }

  /**
   * The ray's destination point, relative to the RayCast's `position`.
   */
  public open var targetPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_GET_TARGET_POSITION,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_SET_TARGET_POSITION,
          NIL)
    }

  /**
   * The ray's collision mask. Only objects in at least one collision layer enabled in the mask will be detected. See [godot.Collision layers and masks]($DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  public open var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_GET_COLLISION_MASK,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_SET_COLLISION_MASK, NIL)
    }

  /**
   * If `true`, the ray will detect a hit when starting inside shapes. In this case the collision normal will be `Vector2(0, 0)`. Does not affect concave polygon shapes.
   */
  public open var hitFromInside: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_GET_HIT_FROM_INSIDE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_SET_HIT_FROM_INSIDE,
          NIL)
    }

  /**
   * If `true`, collision with [godot.Area2D]s will be reported.
   */
  public open var collideWithAreas: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_GET_COLLIDE_WITH_AREAS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_SET_COLLIDE_WITH_AREAS,
          NIL)
    }

  /**
   * If `true`, collision with [godot.PhysicsBody2D]s will be reported.
   */
  public open var collideWithBodies: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_GET_COLLIDE_WITH_BODIES,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_SET_COLLIDE_WITH_BODIES,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RAYCAST2D)
  }

  /**
   * Returns whether any object is intersecting with the ray's vector (considering the vector length).
   */
  public open fun isColliding(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_IS_COLLIDING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Updates the collision information for the ray. Use this method to update the collision information immediately instead of waiting for the next `_physics_process` call, for example if the ray or its parent has changed state.
   *
   * **Note:** [enabled] does not need to be `true` for this to work.
   */
  public open fun forceRaycastUpdate(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_FORCE_RAYCAST_UPDATE, NIL)
  }

  /**
   * Returns the first object that the ray intersects, or `null` if no object is intersecting the ray (i.e. [isColliding] returns `false`).
   */
  public open fun getCollider(): Object? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_GET_COLLIDER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Returns the shape ID of the first object that the ray intersects, or `0` if no object is intersecting the ray (i.e. [isColliding] returns `false`).
   */
  public open fun getColliderShape(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_GET_COLLIDER_SHAPE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the collision point at which the ray intersects the closest object.
   *
   * **Note:** This point is in the **global** coordinate system.
   */
  public open fun getCollisionPoint(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_GET_COLLISION_POINT,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the normal of the intersecting object's shape at the collision point, or `Vector2(0, 0)` if the ray starts inside the shape and [hitFromInside] is `true`.
   */
  public open fun getCollisionNormal(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_GET_COLLISION_NORMAL,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Adds a collision exception so the ray does not report collisions with the specified [RID].
   */
  public open fun addExceptionRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_ADD_EXCEPTION_RID, NIL)
  }

  /**
   * Adds a collision exception so the ray does not report collisions with the specified [godot.CollisionObject2D] node.
   */
  public open fun addException(node: CollisionObject2D): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_ADD_EXCEPTION, NIL)
  }

  /**
   * Removes a collision exception so the ray does report collisions with the specified [RID].
   */
  public open fun removeExceptionRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_REMOVE_EXCEPTION_RID, NIL)
  }

  /**
   * Removes a collision exception so the ray does report collisions with the specified [godot.CollisionObject2D] node.
   */
  public open fun removeException(node: CollisionObject2D): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_REMOVE_EXCEPTION, NIL)
  }

  /**
   * Removes all collision exceptions for this ray.
   */
  public open fun clearExceptions(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_CLEAR_EXCEPTIONS, NIL)
  }

  /**
   * Based on `value`, enables or disables the specified layer in the [collisionMask], given a `layer_number` between 1 and 32.
   */
  public open fun setCollisionMaskValue(layerNumber: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber, BOOL to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_SET_COLLISION_MASK_VALUE,
        NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionMask] is enabled, given a `layer_number` between 1 and 32.
   */
  public open fun getCollisionMaskValue(layerNumber: Long): Boolean {
    TransferContext.writeArguments(LONG to layerNumber)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_GET_COLLISION_MASK_VALUE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public companion object
}
