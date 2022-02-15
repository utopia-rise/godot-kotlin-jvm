// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Result from a 3D body motion test.
 *
 * This class contains the motion and collision result from [godot.PhysicsServer3D.bodyTestMotion].
 */
@GodotBaseType
public open class PhysicsTestMotionResult3D : RefCounted() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PHYSICSTESTMOTIONRESULT3D)
  }

  /**
   * Returns the moving object's travel before collision.
   */
  public open fun getTravel(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT3D_GET_TRAVEL, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the moving object's remaining movement vector.
   */
  public open fun getRemainder(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT3D_GET_REMAINDER, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the maximum fraction of the motion that can occur without a collision, between `0` and `1`.
   */
  public open fun getCollisionSafeFraction(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT3D_GET_COLLISION_SAFE_FRACTION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the minimum fraction of the motion needed to collide, if a collision occurred, between `0` and `1`.
   */
  public open fun getCollisionUnsafeFraction(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT3D_GET_COLLISION_UNSAFE_FRACTION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the number of detected collisions.
   */
  public open fun getCollisionCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT3D_GET_COLLISION_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the point of collision in global coordinates given a collision index (the deepest collision by default), if a collision occurred.
   */
  public open fun getCollisionPoint(collisionIndex: Long = 0): Vector3 {
    TransferContext.writeArguments(LONG to collisionIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT3D_GET_COLLISION_POINT, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the colliding body's shape's normal at the point of collision given a collision index (the deepest collision by default), if a collision occurred.
   */
  public open fun getCollisionNormal(collisionIndex: Long = 0): Vector3 {
    TransferContext.writeArguments(LONG to collisionIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT3D_GET_COLLISION_NORMAL, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the colliding body's velocity given a collision index (the deepest collision by default), if a collision occurred.
   */
  public open fun getColliderVelocity(collisionIndex: Long = 0): Vector3 {
    TransferContext.writeArguments(LONG to collisionIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT3D_GET_COLLIDER_VELOCITY, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the unique instance ID of the colliding body's attached [godot.Object] given a collision index (the deepest collision by default), if a collision occurred. See [godot.Object.getInstanceId].
   */
  public open fun getColliderId(collisionIndex: Long = 0): Long {
    TransferContext.writeArguments(LONG to collisionIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT3D_GET_COLLIDER_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the colliding body's [RID] used by the [godot.PhysicsServer3D] given a collision index (the deepest collision by default), if a collision occurred.
   */
  public open fun getColliderRid(collisionIndex: Long = 0): RID {
    TransferContext.writeArguments(LONG to collisionIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT3D_GET_COLLIDER_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the colliding body's attached [godot.Object] given a collision index (the deepest collision by default), if a collision occurred.
   */
  public open fun getCollider(collisionIndex: Long = 0): Object? {
    TransferContext.writeArguments(LONG to collisionIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT3D_GET_COLLIDER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Returns the colliding body's shape index given a collision index (the deepest collision by default), if a collision occurred. See [godot.CollisionObject3D].
   */
  public open fun getColliderShape(collisionIndex: Long = 0): Long {
    TransferContext.writeArguments(LONG to collisionIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT3D_GET_COLLIDER_SHAPE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the moving object's colliding shape given a collision index (the deepest collision by default), if a collision occurred.
   */
  public open fun getCollisionLocalShape(collisionIndex: Long = 0): Long {
    TransferContext.writeArguments(LONG to collisionIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT3D_GET_COLLISION_LOCAL_SHAPE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the length of overlap along the collision normal given a collision index (the deepest collision by default), if a collision occurred.
   */
  public open fun getCollisionDepth(collisionIndex: Long = 0): Double {
    TransferContext.writeArguments(LONG to collisionIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT3D_GET_COLLISION_DEPTH, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public companion object
}
