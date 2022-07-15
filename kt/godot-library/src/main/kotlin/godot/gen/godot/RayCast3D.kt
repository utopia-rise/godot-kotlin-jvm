// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Query the closest object intersecting a ray.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/676](https://godotengine.org/asset-library/asset/676)
 *
 * A RayCast represents a line from its origin to its destination position, [targetPosition]. It is used to query the 3D space in order to find the closest object along the path of the ray.
 *
 * RayCast3D can ignore some objects by adding them to the exception list via [addException] or by setting proper filtering with collision layers and masks.
 *
 * RayCast3D can be configured to report collisions with [godot.Area3D]s ([collideWithAreas]) and/or [godot.PhysicsBody3D]s ([collideWithBodies]).
 *
 * Only enabled raycasts will be able to query the space and report collisions.
 *
 * RayCast3D calculates intersection every physics frame (see [godot.Node]), and the result is cached so it can be used later until the next frame. If multiple queries are required between physics frames (or during the same frame), use [forceRaycastUpdate] after adjusting the raycast.
 */
@GodotBaseType
public open class RayCast3D : Node3D() {
  /**
   * If `true`, collisions will be reported.
   */
  public var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_IS_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_SET_ENABLED, NIL)
    }

  /**
   * If `true`, collisions will be ignored for this RayCast3D's immediate parent.
   */
  public var excludeParent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_GET_EXCLUDE_PARENT_BODY,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_SET_EXCLUDE_PARENT_BODY,
          NIL)
    }

  /**
   * The ray's destination point, relative to the RayCast's `position`.
   */
  public var targetPosition: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_GET_TARGET_POSITION,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_SET_TARGET_POSITION,
          NIL)
    }

  /**
   * The ray's collision mask. Only objects in at least one collision layer enabled in the mask will be detected. See [godot.Collision layers and masks]($DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  public var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_GET_COLLISION_MASK,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_SET_COLLISION_MASK, NIL)
    }

  /**
   * If `true`, the ray will detect a hit when starting inside shapes. In this case the collision normal will be `Vector3(0, 0, 0)`. Does not affect shapes with no volume like concave polygon or heightmap.
   */
  public var hitFromInside: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RAYCAST3D_IS_HIT_FROM_INSIDE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_SET_HIT_FROM_INSIDE,
          NIL)
    }

  /**
   * If `true`, collision with [godot.Area3D]s will be reported.
   */
  public var collideWithAreas: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RAYCAST3D_IS_COLLIDE_WITH_AREAS_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_SET_COLLIDE_WITH_AREAS,
          NIL)
    }

  /**
   * If `true`, collision with [godot.PhysicsBody3D]s will be reported.
   */
  public var collideWithBodies: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RAYCAST3D_IS_COLLIDE_WITH_BODIES_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_SET_COLLIDE_WITH_BODIES,
          NIL)
    }

  /**
   * The custom color to use to draw the shape in the editor and at run-time if **Visible Collision Shapes** is enabled in the **Debug** menu. This color will be highlighted at run-time if the [godot.RayCast3D] is colliding with something.
   *
   * If set to `Color(0.0, 0.0, 0.0)` (by default), the color set in [godot.ProjectSettings.debug/shapes/collision/shapeColor] is used.
   */
  public var debugShapeCustomColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RAYCAST3D_GET_DEBUG_SHAPE_CUSTOM_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RAYCAST3D_SET_DEBUG_SHAPE_CUSTOM_COLOR, NIL)
    }

  /**
   * If set to `1`, a line is used as the debug shape. Otherwise, a truncated pyramid is drawn to represent the [godot.RayCast3D]. Requires **Visible Collision Shapes** to be enabled in the **Debug** menu for the debug shape to be visible at run-time.
   */
  public var debugShapeThickness: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RAYCAST3D_GET_DEBUG_SHAPE_THICKNESS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RAYCAST3D_SET_DEBUG_SHAPE_THICKNESS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RAYCAST3D)
  }

  /**
   * Returns whether any object is intersecting with the ray's vector (considering the vector length).
   */
  public fun isColliding(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_IS_COLLIDING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Updates the collision information for the ray. Use this method to update the collision information immediately instead of waiting for the next `_physics_process` call, for example if the ray or its parent has changed state.
   *
   * **Note:** [enabled] does not need to be `true` for this to work.
   */
  public fun forceRaycastUpdate(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_FORCE_RAYCAST_UPDATE, NIL)
  }

  /**
   * Returns the first object that the ray intersects, or `null` if no object is intersecting the ray (i.e. [isColliding] returns `false`).
   */
  public fun getCollider(): Object? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_GET_COLLIDER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Returns the shape ID of the first object that the ray intersects, or `0` if no object is intersecting the ray (i.e. [isColliding] returns `false`).
   */
  public fun getColliderShape(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_GET_COLLIDER_SHAPE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the collision point at which the ray intersects the closest object.
   *
   * **Note:** This point is in the **global** coordinate system.
   */
  public fun getCollisionPoint(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_GET_COLLISION_POINT,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the normal of the intersecting object's shape at the collision point, or `Vector3(0, 0, 0)` if the ray starts inside the shape and [hitFromInside] is `true`.
   */
  public fun getCollisionNormal(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_GET_COLLISION_NORMAL,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Adds a collision exception so the ray does not report collisions with the specified [RID].
   */
  public fun addExceptionRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_ADD_EXCEPTION_RID, NIL)
  }

  /**
   * Adds a collision exception so the ray does not report collisions with the specified [godot.CollisionObject3D] node.
   */
  public fun addException(node: CollisionObject3D): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_ADD_EXCEPTION, NIL)
  }

  /**
   * Removes a collision exception so the ray does report collisions with the specified [RID].
   */
  public fun removeExceptionRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_REMOVE_EXCEPTION_RID, NIL)
  }

  /**
   * Removes a collision exception so the ray does report collisions with the specified [godot.CollisionObject3D] node.
   */
  public fun removeException(node: CollisionObject3D): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_REMOVE_EXCEPTION, NIL)
  }

  /**
   * Removes all collision exceptions for this ray.
   */
  public fun clearExceptions(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_CLEAR_EXCEPTIONS, NIL)
  }

  /**
   * Based on `value`, enables or disables the specified layer in the [collisionMask], given a `layer_number` between 1 and 32.
   */
  public fun setCollisionMaskValue(layerNumber: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber, BOOL to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_SET_COLLISION_MASK_VALUE,
        NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionMask] is enabled, given a `layer_number` between 1 and 32.
   */
  public fun getCollisionMaskValue(layerNumber: Long): Boolean {
    TransferContext.writeArguments(LONG to layerNumber)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST3D_GET_COLLISION_MASK_VALUE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public companion object
}
