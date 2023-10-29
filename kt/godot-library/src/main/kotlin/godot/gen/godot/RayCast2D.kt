// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A ray in 2D space, used to find the first [godot.CollisionObject2D] it intersects.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/physics/ray-casting.html]($DOCS_URL/tutorials/physics/ray-casting.html)
 *
 * A raycast represents a ray from its origin to its [targetPosition] that finds the closest [godot.CollisionObject2D] along its path, if it intersects any. This is useful for a lot of things, such as
 *
 * [godot.RayCast2D] can ignore some objects by adding them to an exception list, by making its detection reporting ignore [godot.Area2D]s ([collideWithAreas]) or [godot.PhysicsBody2D]s ([collideWithBodies]), or by configuring physics layers.
 *
 * [godot.RayCast2D] calculates intersection every physics frame, and it holds the result until the next physics frame. For an immediate raycast, or if you want to configure a [godot.RayCast2D] multiple times within the same physics frame, use [forceRaycastUpdate].
 *
 * To sweep over a region of 2D space, you can approximate the region with multiple [godot.RayCast2D]s or use [godot.ShapeCast2D].
 */
@GodotBaseType
public open class RayCast2D : Node2D() {
  /**
   * If `true`, collisions will be reported.
   */
  public var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_IS_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_SET_ENABLED, NIL)
    }

  /**
   * If `true`, the parent node will be excluded from collision detection.
   */
  public var excludeParent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_GET_EXCLUDE_PARENT_BODY,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_SET_EXCLUDE_PARENT_BODY,
          NIL)
    }

  /**
   * The ray's destination point, relative to the RayCast's `position`.
   */
  @CoreTypeLocalCopy
  public var targetPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_GET_TARGET_POSITION,
          VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_SET_TARGET_POSITION,
          NIL)
    }

  /**
   * The ray's collision mask. Only objects in at least one collision layer enabled in the mask will be detected. See [godot.Collision layers and masks]($DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  public var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_GET_COLLISION_MASK,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_SET_COLLISION_MASK, NIL)
    }

  /**
   * If `true`, the ray will detect a hit when starting inside shapes. In this case the collision normal will be `Vector2(0, 0)`. Does not affect concave polygon shapes.
   */
  public var hitFromInside: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RAYCAST2D_IS_HIT_FROM_INSIDE_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_SET_HIT_FROM_INSIDE,
          NIL)
    }

  /**
   * If `true`, collisions with [godot.Area2D]s will be reported.
   */
  public var collideWithAreas: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RAYCAST2D_IS_COLLIDE_WITH_AREAS_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_SET_COLLIDE_WITH_AREAS,
          NIL)
    }

  /**
   * If `true`, collisions with [godot.PhysicsBody2D]s will be reported.
   */
  public var collideWithBodies: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RAYCAST2D_IS_COLLIDE_WITH_BODIES_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_SET_COLLIDE_WITH_BODIES,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RAYCAST2D, scriptIndex)
    return true
  }

  /**
   * The ray's destination point, relative to the RayCast's `position`.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = raycast2d.targetPosition
   * //Your changes
   * raycast2d.targetPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun targetPositionMutate(block: Vector2.() -> Unit): Vector2 = targetPosition.apply{
      block(this)
      targetPosition = this
  }


  /**
   * Returns whether any object is intersecting with the ray's vector (considering the vector length).
   */
  public fun isColliding(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_IS_COLLIDING, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Updates the collision information for the ray immediately, without waiting for the next `_physics_process` call. Use this method, for example, when the ray or its parent has changed state.
   *
   * **Note:** [enabled] does not need to be `true` for this to work.
   */
  public fun forceRaycastUpdate(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_FORCE_RAYCAST_UPDATE, NIL)
  }

  /**
   * Returns the first object that the ray intersects, or `null` if no object is intersecting the ray (i.e. [isColliding] returns `false`).
   */
  public fun getCollider(): Object? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_GET_COLLIDER, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  /**
   * Returns the [RID] of the first object that the ray intersects, or an empty [RID] if no object is intersecting the ray (i.e. [isColliding] returns `false`).
   */
  public fun getColliderRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_GET_COLLIDER_RID, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the shape ID of the first object that the ray intersects, or `0` if no object is intersecting the ray (i.e. [isColliding] returns `false`).
   */
  public fun getColliderShape(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_GET_COLLIDER_SHAPE, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the collision point at which the ray intersects the closest object.
   *
   * **Note:** This point is in the **global** coordinate system.
   */
  public fun getCollisionPoint(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_GET_COLLISION_POINT,
        VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the normal of the intersecting object's shape at the collision point, or `Vector2(0, 0)` if the ray starts inside the shape and [hitFromInside] is `true`.
   */
  public fun getCollisionNormal(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_GET_COLLISION_NORMAL,
        VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Adds a collision exception so the ray does not report collisions with the specified [RID].
   */
  public fun addExceptionRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_ADD_EXCEPTION_RID, NIL)
  }

  /**
   * Adds a collision exception so the ray does not report collisions with the specified [godot.CollisionObject2D] node.
   */
  public fun addException(node: CollisionObject2D): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_ADD_EXCEPTION, NIL)
  }

  /**
   * Removes a collision exception so the ray does report collisions with the specified [RID].
   */
  public fun removeExceptionRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_REMOVE_EXCEPTION_RID, NIL)
  }

  /**
   * Removes a collision exception so the ray does report collisions with the specified [godot.CollisionObject2D] node.
   */
  public fun removeException(node: CollisionObject2D): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_REMOVE_EXCEPTION, NIL)
  }

  /**
   * Removes all collision exceptions for this ray.
   */
  public fun clearExceptions(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_CLEAR_EXCEPTIONS, NIL)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionMask], given a [layerNumber] between 1 and 32.
   */
  public fun setCollisionMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_SET_COLLISION_MASK_VALUE,
        NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionMask] is enabled, given a [layerNumber] between 1 and 32.
   */
  public fun getCollisionMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST2D_GET_COLLISION_MASK_VALUE,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object
}
