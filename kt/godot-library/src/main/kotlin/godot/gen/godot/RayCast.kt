// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Query the closest object intersecting a ray.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/676](https://godotengine.org/asset-library/asset/676)
 *
 * A RayCast represents a line from its origin to its destination position, `cast_to`. It is used to query the 3D space in order to find the closest object along the path of the ray.
 *
 * RayCast can ignore some objects by adding them to the exception list via `add_exception` or by setting proper filtering with collision layers and masks.
 *
 * RayCast can be configured to report collisions with [godot.Area]s ([collideWithAreas]) and/or [godot.PhysicsBody]s ([collideWithBodies]).
 *
 * Only enabled raycasts will be able to query the space and report collisions.
 *
 * RayCast calculates intersection every physics frame (see [godot.Node]), and the result is cached so it can be used later until the next frame. If multiple queries are required between physics frames (or during the same frame), use [forceRaycastUpdate] after adjusting the raycast.
 */
@GodotBaseType
public open class RayCast : Spatial() {
  /**
   * The ray's destination point, relative to the RayCast's `position`.
   */
  public open var castTo: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_GET_CAST_TO, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_SET_CAST_TO, NIL)
    }

  /**
   * If `true`, collision with [godot.Area]s will be reported.
   */
  public open var collideWithAreas: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_GET_COLLIDE_WITH_AREAS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_SET_COLLIDE_WITH_AREAS,
          NIL)
    }

  /**
   * If `true`, collision with [godot.PhysicsBody]s will be reported.
   */
  public open var collideWithBodies: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_GET_COLLIDE_WITH_BODIES,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_SET_COLLIDE_WITH_BODIES,
          NIL)
    }

  /**
   * The ray's collision mask. Only objects in at least one collision layer enabled in the mask will be detected. See [godot.Collision layers and masks](https://docs.godotengine.org/en/3.4/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  public open var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_GET_COLLISION_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_SET_COLLISION_MASK, NIL)
    }

  /**
   * The custom color to use to draw the shape in the editor and at run-time if **Visible Collision Shapes** is enabled in the **Debug** menu. This color will be highlighted at run-time if the [godot.RayCast] is colliding with something.
   *
   * If set to `Color(0.0, 0.0, 0.0)` (by default), the color set in [godot.ProjectSettings.debug/shapes/collision/shapeColor] is used.
   */
  public open var debugShapeCustomColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RAYCAST_GET_DEBUG_SHAPE_CUSTOM_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RAYCAST_SET_DEBUG_SHAPE_CUSTOM_COLOR, NIL)
    }

  /**
   * If set to `1`, a line is used as the debug shape. Otherwise, a truncated pyramid is drawn to represent the [godot.RayCast]. Requires **Visible Collision Shapes** to be enabled in the **Debug** menu for the debug shape to be visible at run-time.
   */
  public open var debugShapeThickness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_GET_DEBUG_SHAPE_THICKNESS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_SET_DEBUG_SHAPE_THICKNESS,
          NIL)
    }

  /**
   * If `true`, collisions will be reported.
   */
  public open var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_GET_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_SET_ENABLED, NIL)
    }

  /**
   * If `true`, collisions will be ignored for this RayCast's immediate parent.
   */
  public open var excludeParent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_GET_EXCLUDE_PARENT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_SET_EXCLUDE_PARENT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RAYCAST)
  }

  @CoreTypeHelper
  public open fun castTo(schedule: Vector3.() -> Unit): Vector3 = castTo.apply{
      schedule(this)
      castTo = this
  }


  @CoreTypeHelper
  public open fun debugShapeCustomColor(schedule: Color.() -> Unit): Color =
      debugShapeCustomColor.apply{
      schedule(this)
      debugShapeCustomColor = this
  }


  /**
   * Adds a collision exception so the ray does not report collisions with the specified node.
   */
  public open fun addException(node: Object): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_ADD_EXCEPTION, NIL)
  }

  /**
   * Adds a collision exception so the ray does not report collisions with the specified [RID].
   */
  public open fun addExceptionRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_ADD_EXCEPTION_RID, NIL)
  }

  /**
   * Removes all collision exceptions for this ray.
   */
  public open fun clearExceptions(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_CLEAR_EXCEPTIONS, NIL)
  }

  /**
   * Updates the collision information for the ray.
   *
   * Use this method to update the collision information immediately instead of waiting for the next `_physics_process` call, for example if the ray or its parent has changed state.
   *
   * **Note:** `enabled` is not required for this to work.
   */
  public open fun forceRaycastUpdate(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_FORCE_RAYCAST_UPDATE, NIL)
  }

  /**
   * Returns the first object that the ray intersects, or `null` if no object is intersecting the ray (i.e. [isColliding] returns `false`).
   */
  public open fun getCollider(): Object? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_GET_COLLIDER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Returns the shape ID of the first object that the ray intersects, or `0` if no object is intersecting the ray (i.e. [isColliding] returns `false`).
   */
  public open fun getColliderShape(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_GET_COLLIDER_SHAPE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if the bit index passed is turned on.
   *
   * **Note:** Bit indices range from 0-19.
   */
  public open fun getCollisionMaskBit(bit: Long): Boolean {
    TransferContext.writeArguments(LONG to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_GET_COLLISION_MASK_BIT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the normal of the intersecting object's shape at the collision point.
   */
  public open fun getCollisionNormal(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_GET_COLLISION_NORMAL,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the collision point at which the ray intersects the closest object.
   *
   * **Note:** This point is in the **global** coordinate system.
   */
  public open fun getCollisionPoint(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_GET_COLLISION_POINT,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns whether any object is intersecting with the ray's vector (considering the vector length).
   */
  public open fun isColliding(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_IS_COLLIDING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes a collision exception so the ray does report collisions with the specified node.
   */
  public open fun removeException(node: Object): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_REMOVE_EXCEPTION, NIL)
  }

  /**
   * Removes a collision exception so the ray does report collisions with the specified [RID].
   */
  public open fun removeExceptionRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_REMOVE_EXCEPTION_RID, NIL)
  }

  /**
   * Sets the bit index passed to the `value` passed.
   *
   * **Note:** Bit indexes range from 0-19.
   */
  public open fun setCollisionMaskBit(bit: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to bit, BOOL to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYCAST_SET_COLLISION_MASK_BIT, NIL)
  }
}
