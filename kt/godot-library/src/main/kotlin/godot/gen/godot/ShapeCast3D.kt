// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.RID
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A 3D shape that sweeps a region of space to detect [godot.CollisionObject3D]s.
 *
 * Shape casting allows to detect collision objects by sweeping its [shape] along the cast direction determined by [targetPosition]. This is similar to [godot.RayCast3D], but it allows for sweeping a region of space, rather than just a straight line. [godot.ShapeCast3D] can detect multiple collision objects. It is useful for things like wide laser beams or snapping a simple shape to a floor.
 *
 * Immediate collision overlaps can be done with the [targetPosition] set to `Vector3(0, 0, 0)` and by calling [forceShapecastUpdate] within the same physics frame. This helps to overcome some limitations of [godot.Area3D] when used as an instantaneous detection area, as collision information isn't immediately available to it.
 *
 * **Note:** Shape casting is more computationally expensive than ray casting.
 */
@GodotBaseType
public open class ShapeCast3D : Node3D() {
  /**
   * If `true`, collisions will be reported.
   */
  public var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_IS_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_SET_ENABLED, NIL)
    }

  /**
   * The [godot.Shape3D]-derived shape to be used for collision queries.
   */
  public var shape: Shape3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_GET_SHAPE, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Shape3D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_SET_SHAPE, NIL)
    }

  /**
   * If `true`, the parent node will be excluded from collision detection.
   */
  public var excludeParent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_GET_EXCLUDE_PARENT_BODY, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_SET_EXCLUDE_PARENT_BODY, NIL)
    }

  /**
   * The shape's destination point, relative to this node's `position`.
   */
  public var targetPosition: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_GET_TARGET_POSITION,
          VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_SET_TARGET_POSITION,
          NIL)
    }

  /**
   * The collision margin for the shape. A larger margin helps detecting collisions more consistently, at the cost of precision.
   */
  public var margin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_GET_MARGIN, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_SET_MARGIN, NIL)
    }

  /**
   * The number of intersections can be limited with this parameter, to reduce the processing time.
   */
  public var maxResults: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_GET_MAX_RESULTS, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_SET_MAX_RESULTS, NIL)
    }

  /**
   * The shape's collision mask. Only objects in at least one collision layer enabled in the mask will be detected. See [godot.Collision layers and masks]($DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  public var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_GET_COLLISION_MASK,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_SET_COLLISION_MASK,
          NIL)
    }

  /**
   * If `true`, collision with [godot.Area3D]s will be reported.
   */
  public var collideWithAreas: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_IS_COLLIDE_WITH_AREAS_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_SET_COLLIDE_WITH_AREAS, NIL)
    }

  /**
   * If `true`, collision with [godot.PhysicsBody3D]s will be reported.
   */
  public var collideWithBodies: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_IS_COLLIDE_WITH_BODIES_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_SET_COLLIDE_WITH_BODIES, NIL)
    }

  /**
   * The custom color to use to draw the shape in the editor and at run-time if **Visible Collision Shapes** is enabled in the **Debug** menu. This color will be highlighted at run-time if the [godot.ShapeCast3D] is colliding with something.
   *
   * If set to `Color(0.0, 0.0, 0.0)` (by default), the color set in [godot.ProjectSettings.debug/shapes/collision/shapeColor] is used.
   */
  public var debugShapeCustomColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_GET_DEBUG_SHAPE_CUSTOM_COLOR, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_SET_DEBUG_SHAPE_CUSTOM_COLOR, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SHAPECAST3D, scriptIndex)
    return true
  }

  /**
   * The shape's destination point, relative to this node's `position`.
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
   * val myCoreType = shapecast3d.targetPosition
   * //Your changes
   * shapecast3d.targetPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun targetPosition(block: Vector3.() -> Unit): Vector3 = targetPosition.apply{
      block(this)
      targetPosition = this
  }


  /**
   * The custom color to use to draw the shape in the editor and at run-time if **Visible Collision Shapes** is enabled in the **Debug** menu. This color will be highlighted at run-time if the [godot.ShapeCast3D] is colliding with something.
   *
   * If set to `Color(0.0, 0.0, 0.0)` (by default), the color set in [godot.ProjectSettings.debug/shapes/collision/shapeColor] is used.
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
   * val myCoreType = shapecast3d.debugShapeCustomColor
   * //Your changes
   * shapecast3d.debugShapeCustomColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun debugShapeCustomColor(block: Color.() -> Unit): Color =
      debugShapeCustomColor.apply{
      block(this)
      debugShapeCustomColor = this
  }


  /**
   * This method is used internally to update the debug gizmo in the editor. Any code placed in this function will be called whenever the [shape] resource is modified.
   */
  public fun resourceChanged(resource: Resource): Unit {
    TransferContext.writeArguments(OBJECT to resource)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_RESOURCE_CHANGED, NIL)
  }

  /**
   * Returns whether any object is intersecting with the shape's vector (considering the vector length).
   */
  public fun isColliding(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_IS_COLLIDING, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * The number of collisions detected at the point of impact. Use this to iterate over multiple collisions as provided by [getCollider], [getColliderShape], [getCollisionPoint], and [getCollisionNormal] methods.
   */
  public fun getCollisionCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_GET_COLLISION_COUNT,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Updates the collision information for the shape. Use this method to update the collision information immediately instead of waiting for the next `_physics_process` call, for example if the shape or its parent has changed state.
   *
   * **Note:** `enabled == true` is not required for this to work.
   */
  public fun forceShapecastUpdate(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_FORCE_SHAPECAST_UPDATE,
        NIL)
  }

  /**
   * Returns the collided [godot.Object] of one of the multiple collisions at [index], or `null` if no object is intersecting the shape (i.e. [isColliding] returns `false`).
   */
  public fun getCollider(index: Int): Object? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_GET_COLLIDER, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  /**
   * Returns the [RID] of the collided object of one of the multiple collisions at [index].
   */
  public fun getColliderRid(index: Int): RID {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_GET_COLLIDER_RID, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the shape ID of the colliding shape of one of the multiple collisions at [index], or `0` if no object is intersecting the shape (i.e. [isColliding] returns `false`).
   */
  public fun getColliderShape(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_GET_COLLIDER_SHAPE,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the collision point of one of the multiple collisions at [index] where the shape intersects the colliding object.
   *
   * **Note:** this point is in the **global** coordinate system.
   */
  public fun getCollisionPoint(index: Int): Vector3 {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_GET_COLLISION_POINT,
        VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the normal of one of the multiple collisions at [index] of the intersecting object.
   */
  public fun getCollisionNormal(index: Int): Vector3 {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_GET_COLLISION_NORMAL,
        VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * The fraction from the [godot.ShapeCast3D]'s origin to its [targetPosition] (between 0 and 1) of how far the shape can move without triggering a collision.
   */
  public fun getClosestCollisionSafeFraction(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_GET_CLOSEST_COLLISION_SAFE_FRACTION, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * The fraction from the [godot.ShapeCast3D]'s origin to its [targetPosition] (between 0 and 1) of how far the shape must move to trigger a collision.
   */
  public fun getClosestCollisionUnsafeFraction(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_GET_CLOSEST_COLLISION_UNSAFE_FRACTION, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Adds a collision exception so the shape does not report collisions with the specified [RID].
   */
  public fun addExceptionRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_ADD_EXCEPTION_RID, NIL)
  }

  /**
   * Adds a collision exception so the shape does not report collisions with the specified [godot.CollisionObject3D] node.
   */
  public fun addException(node: CollisionObject3D): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_ADD_EXCEPTION, NIL)
  }

  /**
   * Removes a collision exception so the shape does report collisions with the specified [RID].
   */
  public fun removeExceptionRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_REMOVE_EXCEPTION_RID,
        NIL)
  }

  /**
   * Removes a collision exception so the shape does report collisions with the specified [godot.CollisionObject3D] node.
   */
  public fun removeException(node: CollisionObject3D): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_REMOVE_EXCEPTION, NIL)
  }

  /**
   * Removes all collision exceptions for this [godot.ShapeCast3D].
   */
  public fun clearExceptions(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_CLEAR_EXCEPTIONS, NIL)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionMask], given a [layerNumber] between 1 and 32.
   */
  public fun setCollisionMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_SET_COLLISION_MASK_VALUE, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionMask] is enabled, given a [layerNumber] between 1 and 32.
   */
  public fun getCollisionMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SHAPECAST3D_GET_COLLISION_MASK_VALUE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object
}
