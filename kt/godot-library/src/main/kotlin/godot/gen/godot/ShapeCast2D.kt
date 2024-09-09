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
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Shape casting allows to detect collision objects by sweeping its [shape] along the cast direction
 * determined by [targetPosition]. This is similar to [RayCast2D], but it allows for sweeping a region
 * of space, rather than just a straight line. [ShapeCast2D] can detect multiple collision objects. It
 * is useful for things like wide laser beams or snapping a simple shape to a floor.
 * Immediate collision overlaps can be done with the [targetPosition] set to `Vector2(0, 0)` and by
 * calling [forceShapecastUpdate] within the same physics frame. This helps to overcome some
 * limitations of [Area2D] when used as an instantaneous detection area, as collision information isn't
 * immediately available to it.
 * **Note:** Shape casting is more computationally expensive than ray casting.
 */
@GodotBaseType
public open class ShapeCast2D : Node2D() {
  /**
   * If `true`, collisions will be reported.
   */
  public var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnabledPtr, NIL)
    }

  /**
   * The [Shape2D]-derived shape to be used for collision queries.
   */
  public var shape: Shape2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShapePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Shape2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShapePtr, NIL)
    }

  /**
   * If `true`, the parent node will be excluded from collision detection.
   */
  public var excludeParent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExcludeParentBodyPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setExcludeParentBodyPtr, NIL)
    }

  /**
   * The shape's destination point, relative to this node's `position`.
   */
  @CoreTypeLocalCopy
  public var targetPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTargetPositionPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTargetPositionPtr, NIL)
    }

  /**
   * The collision margin for the shape. A larger margin helps detecting collisions more
   * consistently, at the cost of precision.
   */
  public var margin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMarginPtr, NIL)
    }

  /**
   * The number of intersections can be limited with this parameter, to reduce the processing time.
   */
  public var maxResults: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxResultsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxResultsPtr, NIL)
    }

  /**
   * The shape's collision mask. Only objects in at least one collision layer enabled in the mask
   * will be detected.
   */
  public var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskPtr, NIL)
    }

  /**
   * If `true`, collisions with [Area2D]s will be reported.
   */
  public var collideWithAreas: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCollideWithAreasEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollideWithAreasPtr, NIL)
    }

  /**
   * If `true`, collisions with [PhysicsBody2D]s will be reported.
   */
  public var collideWithBodies: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCollideWithBodiesEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollideWithBodiesPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SHAPECAST2D, scriptIndex)
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
   * val myCoreType = shapecast2d.targetPosition
   * //Your changes
   * shapecast2d.targetPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun targetPositionMutate(block: Vector2.() -> Unit): Vector2 = targetPosition.apply{
      block(this)
      targetPosition = this
  }


  /**
   * Returns whether any object is intersecting with the shape's vector (considering the vector
   * length).
   */
  public fun isColliding(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCollidingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * The number of collisions detected at the point of impact. Use this to iterate over multiple
   * collisions as provided by [getCollider], [getColliderShape], [getCollisionPoint], and
   * [getCollisionNormal] methods.
   */
  public fun getCollisionCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Updates the collision information for the shape immediately, without waiting for the next
   * `_physics_process` call. Use this method, for example, when the shape or its parent has changed
   * state.
   * **Note:** `enabled == true` is not required for this to work.
   */
  public fun forceShapecastUpdate(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.forceShapecastUpdatePtr, NIL)
  }

  /**
   * Returns the collided [Object] of one of the multiple collisions at [index], or `null` if no
   * object is intersecting the shape (i.e. [isColliding] returns `false`).
   */
  public fun getCollider(index: Int): Object? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  /**
   * Returns the [RID] of the collided object of one of the multiple collisions at [index].
   */
  public fun getColliderRid(index: Int): RID {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the shape ID of the colliding shape of one of the multiple collisions at [index], or
   * `0` if no object is intersecting the shape (i.e. [isColliding] returns `false`).
   */
  public fun getColliderShape(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderShapePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the collision point of one of the multiple collisions at [index] where the shape
   * intersects the colliding object.
   * **Note:** this point is in the **global** coordinate system.
   */
  public fun getCollisionPoint(index: Int): Vector2 {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionPointPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the normal of one of the multiple collisions at [index] of the intersecting object.
   */
  public fun getCollisionNormal(index: Int): Vector2 {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionNormalPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * The fraction from the [ShapeCast2D]'s origin to its [targetPosition] (between 0 and 1) of how
   * far the shape can move without triggering a collision.
   */
  public fun getClosestCollisionSafeFraction(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestCollisionSafeFractionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * The fraction from the [ShapeCast2D]'s origin to its [targetPosition] (between 0 and 1) of how
   * far the shape must move to trigger a collision.
   * In ideal conditions this would be the same as [getClosestCollisionSafeFraction], however shape
   * casting is calculated in discrete steps, so the precise point of collision can occur between two
   * calculated positions.
   */
  public fun getClosestCollisionUnsafeFraction(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestCollisionUnsafeFractionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Adds a collision exception so the shape does not report collisions with the specified [RID].
   */
  public fun addExceptionRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.addExceptionRidPtr, NIL)
  }

  /**
   * Adds a collision exception so the shape does not report collisions with the specified
   * [CollisionObject2D] node.
   */
  public fun addException(node: CollisionObject2D): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.addExceptionPtr, NIL)
  }

  /**
   * Removes a collision exception so the shape does report collisions with the specified [RID].
   */
  public fun removeExceptionRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.removeExceptionRidPtr, NIL)
  }

  /**
   * Removes a collision exception so the shape does report collisions with the specified
   * [CollisionObject2D] node.
   */
  public fun removeException(node: CollisionObject2D): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.removeExceptionPtr, NIL)
  }

  /**
   * Removes all collision exceptions for this shape.
   */
  public fun clearExceptions(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearExceptionsPtr, NIL)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionMask], given a
   * [layerNumber] between 1 and 32.
   */
  public fun setCollisionMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionMask] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public fun getCollisionMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "set_enabled", 2586408642)

    public val isEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "is_enabled", 36873697)

    public val setShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "set_shape", 771364740)

    public val getShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_shape", 522005891)

    public val setTargetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "set_target_position", 743155724)

    public val getTargetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_target_position", 3341600327)

    public val setMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "set_margin", 373806689)

    public val getMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_margin", 1740695150)

    public val setMaxResultsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "set_max_results", 1286410249)

    public val getMaxResultsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_max_results", 3905245786)

    public val isCollidingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "is_colliding", 36873697)

    public val getCollisionCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_collision_count", 3905245786)

    public val forceShapecastUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "force_shapecast_update", 3218959716)

    public val getColliderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_collider", 3332903315)

    public val getColliderRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_collider_rid", 495598643)

    public val getColliderShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_collider_shape", 923996154)

    public val getCollisionPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_collision_point", 2299179447)

    public val getCollisionNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_collision_normal", 2299179447)

    public val getClosestCollisionSafeFractionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_closest_collision_safe_fraction", 1740695150)

    public val getClosestCollisionUnsafeFractionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_closest_collision_unsafe_fraction", 1740695150)

    public val addExceptionRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "add_exception_rid", 2722037293)

    public val addExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "add_exception", 3090941106)

    public val removeExceptionRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "remove_exception_rid", 2722037293)

    public val removeExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "remove_exception", 3090941106)

    public val clearExceptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "clear_exceptions", 3218959716)

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "set_collision_mask", 1286410249)

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_collision_mask", 3905245786)

    public val setCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "set_collision_mask_value", 300928843)

    public val getCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_collision_mask_value", 1116898809)

    public val setExcludeParentBodyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "set_exclude_parent_body", 2586408642)

    public val getExcludeParentBodyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "get_exclude_parent_body", 36873697)

    public val setCollideWithAreasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "set_collide_with_areas", 2586408642)

    public val isCollideWithAreasEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "is_collide_with_areas_enabled", 36873697)

    public val setCollideWithBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "set_collide_with_bodies", 2586408642)

    public val isCollideWithBodiesEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShapeCast2D", "is_collide_with_bodies_enabled", 36873697)
  }
}
