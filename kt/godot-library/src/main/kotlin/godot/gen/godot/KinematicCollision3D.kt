// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Holds collision data from the movement of a [godot.PhysicsBody3D].
 *
 * Holds collision data from the movement of a [godot.PhysicsBody3D], usually from [godot.PhysicsBody3D.moveAndCollide]. When a [godot.PhysicsBody3D] is moved, it stops if it detects a collision with another body. If a collision is detected, a [godot.KinematicCollision3D] object is returned.
 *
 * The collision data includes the colliding object, the remaining motion, and the collision position. This data can be used to determine a custom response to the collision.
 */
@GodotBaseType
public open class KinematicCollision3D : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_KINEMATICCOLLISION3D, scriptIndex)
    return true
  }

  /**
   * Returns the moving object's travel before collision.
   */
  public fun getTravel(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION3D_GET_TRAVEL,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the moving object's remaining movement vector.
   */
  public fun getRemainder(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION3D_GET_REMAINDER,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the colliding body's length of overlap along the collision normal.
   */
  public fun getDepth(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION3D_GET_DEPTH,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the number of detected collisions.
   */
  public fun getCollisionCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION3D_GET_COLLISION_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the point of collision in global coordinates given a collision index (the deepest collision by default).
   */
  public fun getPosition(collisionIndex: Long = 0): Vector3 {
    TransferContext.writeArguments(LONG to collisionIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION3D_GET_POSITION,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the colliding body's shape's normal at the point of collision given a collision index (the deepest collision by default).
   */
  public fun getNormal(collisionIndex: Long = 0): Vector3 {
    TransferContext.writeArguments(LONG to collisionIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION3D_GET_NORMAL,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the collision angle according to [upDirection], which is [godot.Vector3.UP] by default. This value is always positive.
   */
  public fun getAngle(collisionIndex: Long = 0, upDirection: Vector3 = Vector3(0, 1, 0)): Double {
    TransferContext.writeArguments(LONG to collisionIndex, VECTOR3 to upDirection)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION3D_GET_ANGLE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the moving object's colliding shape given a collision index (the deepest collision by default).
   */
  public fun getLocalShape(collisionIndex: Long = 0): Object? {
    TransferContext.writeArguments(LONG to collisionIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION3D_GET_LOCAL_SHAPE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Returns the colliding body's attached [godot.Object] given a collision index (the deepest collision by default).
   */
  public fun getCollider(collisionIndex: Long = 0): Object? {
    TransferContext.writeArguments(LONG to collisionIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION3D_GET_COLLIDER,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Returns the unique instance ID of the colliding body's attached [godot.Object] given a collision index (the deepest collision by default). See [godot.Object.getInstanceId].
   */
  public fun getColliderId(collisionIndex: Long = 0): Long {
    TransferContext.writeArguments(LONG to collisionIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION3D_GET_COLLIDER_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the colliding body's [RID] used by the [godot.PhysicsServer3D] given a collision index (the deepest collision by default).
   */
  public fun getColliderRid(collisionIndex: Long = 0): RID {
    TransferContext.writeArguments(LONG to collisionIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION3D_GET_COLLIDER_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the colliding body's shape given a collision index (the deepest collision by default).
   */
  public fun getColliderShape(collisionIndex: Long = 0): Object? {
    TransferContext.writeArguments(LONG to collisionIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION3D_GET_COLLIDER_SHAPE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Returns the colliding body's shape index given a collision index (the deepest collision by default). See [godot.CollisionObject3D].
   */
  public fun getColliderShapeIndex(collisionIndex: Long = 0): Long {
    TransferContext.writeArguments(LONG to collisionIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION3D_GET_COLLIDER_SHAPE_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the colliding body's velocity given a collision index (the deepest collision by default).
   */
  public fun getColliderVelocity(collisionIndex: Long = 0): Vector3 {
    TransferContext.writeArguments(LONG to collisionIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION3D_GET_COLLIDER_VELOCITY, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  public companion object
}
