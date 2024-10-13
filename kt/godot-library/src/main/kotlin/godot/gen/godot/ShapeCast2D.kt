// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser._RID
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public final inline var enabled: Boolean
    @JvmName("enabledProperty")
    get() = isEnabled()
    @JvmName("enabledProperty")
    set(`value`) {
      setEnabled(value)
    }

  /**
   * The [Shape2D]-derived shape to be used for collision queries.
   */
  public final inline var shape: Shape2D?
    @JvmName("shapeProperty")
    get() = getShape()
    @JvmName("shapeProperty")
    set(`value`) {
      setShape(value)
    }

  /**
   * If `true`, the parent node will be excluded from collision detection.
   */
  public final inline var excludeParent: Boolean
    @JvmName("excludeParentProperty")
    get() = getExcludeParentBody()
    @JvmName("excludeParentProperty")
    set(`value`) {
      setExcludeParentBody(value)
    }

  /**
   * The shape's destination point, relative to this node's `position`.
   */
  @CoreTypeLocalCopy
  public final inline var targetPosition: Vector2
    @JvmName("targetPositionProperty")
    get() = getTargetPosition()
    @JvmName("targetPositionProperty")
    set(`value`) {
      setTargetPosition(value)
    }

  /**
   * The collision margin for the shape. A larger margin helps detecting collisions more
   * consistently, at the cost of precision.
   */
  public final inline var margin: Float
    @JvmName("marginProperty")
    get() = getMargin()
    @JvmName("marginProperty")
    set(`value`) {
      setMargin(value)
    }

  /**
   * The number of intersections can be limited with this parameter, to reduce the processing time.
   */
  public final inline var maxResults: Int
    @JvmName("maxResultsProperty")
    get() = getMaxResults()
    @JvmName("maxResultsProperty")
    set(`value`) {
      setMaxResults(value)
    }

  /**
   * The shape's collision mask. Only objects in at least one collision layer enabled in the mask
   * will be detected.
   */
  public final inline var collisionMask: Long
    @JvmName("collisionMaskProperty")
    get() = getCollisionMask()
    @JvmName("collisionMaskProperty")
    set(`value`) {
      setCollisionMask(value)
    }

  /**
   * If `true`, collisions with [Area2D]s will be reported.
   */
  public final inline var collideWithAreas: Boolean
    @JvmName("collideWithAreasProperty")
    get() = isCollideWithAreasEnabled()
    @JvmName("collideWithAreasProperty")
    set(`value`) {
      setCollideWithAreas(value)
    }

  /**
   * If `true`, collisions with [PhysicsBody2D]s will be reported.
   */
  public final inline var collideWithBodies: Boolean
    @JvmName("collideWithBodiesProperty")
    get() = isCollideWithBodiesEnabled()
    @JvmName("collideWithBodiesProperty")
    set(`value`) {
      setCollideWithBodies(value)
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
  public final fun targetPositionMutate(block: Vector2.() -> Unit): Vector2 = targetPosition.apply{
      block(this)
      targetPosition = this
  }


  public final fun setEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setEnabledPtr, NIL)
  }

  public final fun isEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setShape(shape: Shape2D?): Unit {
    TransferContext.writeArguments(OBJECT to shape)
    TransferContext.callMethod(ptr, MethodBindings.setShapePtr, NIL)
  }

  public final fun getShape(): Shape2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getShapePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Shape2D?)
  }

  public final fun setTargetPosition(localPoint: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to localPoint)
    TransferContext.callMethod(ptr, MethodBindings.setTargetPositionPtr, NIL)
  }

  public final fun getTargetPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTargetPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setMargin(margin: Float): Unit {
    TransferContext.writeArguments(DOUBLE to margin.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMarginPtr, NIL)
  }

  public final fun getMargin(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMarginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMaxResults(maxResults: Int): Unit {
    TransferContext.writeArguments(LONG to maxResults.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMaxResultsPtr, NIL)
  }

  public final fun getMaxResults(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxResultsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns whether any object is intersecting with the shape's vector (considering the vector
   * length).
   */
  public final fun isColliding(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCollidingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * The number of collisions detected at the point of impact. Use this to iterate over multiple
   * collisions as provided by [getCollider], [getColliderShape], [getCollisionPoint], and
   * [getCollisionNormal] methods.
   */
  public final fun getCollisionCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Updates the collision information for the shape immediately, without waiting for the next
   * `_physics_process` call. Use this method, for example, when the shape or its parent has changed
   * state.
   * **Note:** `enabled == true` is not required for this to work.
   */
  public final fun forceShapecastUpdate(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.forceShapecastUpdatePtr, NIL)
  }

  /**
   * Returns the collided [Object] of one of the multiple collisions at [index], or `null` if no
   * object is intersecting the shape (i.e. [isColliding] returns `false`).
   */
  public final fun getCollider(index: Int): Object? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColliderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Object?)
  }

  /**
   * Returns the [RID] of the collided object of one of the multiple collisions at [index].
   */
  public final fun getColliderRid(index: Int): RID {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColliderRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the shape ID of the colliding shape of one of the multiple collisions at [index], or
   * `0` if no object is intersecting the shape (i.e. [isColliding] returns `false`).
   */
  public final fun getColliderShape(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColliderShapePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the collision point of one of the multiple collisions at [index] where the shape
   * intersects the colliding object.
   * **Note:** this point is in the **global** coordinate system.
   */
  public final fun getCollisionPoint(index: Int): Vector2 {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCollisionPointPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the normal of one of the multiple collisions at [index] of the intersecting object.
   */
  public final fun getCollisionNormal(index: Int): Vector2 {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCollisionNormalPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * The fraction from the [ShapeCast2D]'s origin to its [targetPosition] (between 0 and 1) of how
   * far the shape can move without triggering a collision.
   */
  public final fun getClosestCollisionSafeFraction(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getClosestCollisionSafeFractionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * The fraction from the [ShapeCast2D]'s origin to its [targetPosition] (between 0 and 1) of how
   * far the shape must move to trigger a collision.
   * In ideal conditions this would be the same as [getClosestCollisionSafeFraction], however shape
   * casting is calculated in discrete steps, so the precise point of collision can occur between two
   * calculated positions.
   */
  public final fun getClosestCollisionUnsafeFraction(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getClosestCollisionUnsafeFractionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Adds a collision exception so the shape does not report collisions with the specified [RID].
   */
  public final fun addExceptionRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(ptr, MethodBindings.addExceptionRidPtr, NIL)
  }

  /**
   * Adds a collision exception so the shape does not report collisions with the specified
   * [CollisionObject2D] node.
   */
  public final fun addException(node: CollisionObject2D?): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(ptr, MethodBindings.addExceptionPtr, NIL)
  }

  /**
   * Removes a collision exception so the shape does report collisions with the specified [RID].
   */
  public final fun removeExceptionRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(ptr, MethodBindings.removeExceptionRidPtr, NIL)
  }

  /**
   * Removes a collision exception so the shape does report collisions with the specified
   * [CollisionObject2D] node.
   */
  public final fun removeException(node: CollisionObject2D?): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(ptr, MethodBindings.removeExceptionPtr, NIL)
  }

  /**
   * Removes all collision exceptions for this shape.
   */
  public final fun clearExceptions(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearExceptionsPtr, NIL)
  }

  public final fun setCollisionMask(mask: Long): Unit {
    TransferContext.writeArguments(LONG to mask)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionMaskPtr, NIL)
  }

  public final fun getCollisionMask(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionMask], given a
   * [layerNumber] between 1 and 32.
   */
  public final fun setCollisionMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionMask] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public final fun getCollisionMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCollisionMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setExcludeParentBody(mask: Boolean): Unit {
    TransferContext.writeArguments(BOOL to mask)
    TransferContext.callMethod(ptr, MethodBindings.setExcludeParentBodyPtr, NIL)
  }

  public final fun getExcludeParentBody(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getExcludeParentBodyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCollideWithAreas(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setCollideWithAreasPtr, NIL)
  }

  public final fun isCollideWithAreasEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCollideWithAreasEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCollideWithBodies(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setCollideWithBodiesPtr, NIL)
  }

  public final fun isCollideWithBodiesEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCollideWithBodiesEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
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
