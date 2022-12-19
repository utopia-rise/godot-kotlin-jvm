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
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Collision data for [godot.PhysicsBody2D.moveAndCollide] collisions.
 *
 * Contains collision data for [godot.PhysicsBody2D.moveAndCollide] collisions. When a [godot.PhysicsBody2D] is moved using [godot.PhysicsBody2D.moveAndCollide], it stops if it detects a collision with another body. If a collision is detected, a [godot.KinematicCollision2D] object is returned.
 *
 * This object contains information about the collision, including the colliding object, the remaining motion, and the collision position. This information can be used to calculate a collision response.
 */
@GodotBaseType
public open class KinematicCollision2D : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_KINEMATICCOLLISION2D, scriptIndex)
    return true
  }

  /**
   * Returns the point of collision in global coordinates.
   */
  public fun getPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_POSITION,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the colliding body's shape's normal at the point of collision.
   */
  public fun getNormal(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_NORMAL,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the moving object's travel before collision.
   */
  public fun getTravel(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_TRAVEL,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the moving object's remaining movement vector.
   */
  public fun getRemainder(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_REMAINDER,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the collision angle according to [upDirection], which is [godot.Vector2.UP] by default. This value is always positive.
   */
  public fun getAngle(upDirection: Vector2 = Vector2(0, -1)): Double {
    TransferContext.writeArguments(VECTOR2 to upDirection)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_ANGLE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the moving object's colliding shape.
   */
  public fun getLocalShape(): Object? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_LOCAL_SHAPE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Returns the colliding body's attached [godot.Object].
   */
  public fun getCollider(): Object? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_COLLIDER,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Returns the unique instance ID of the colliding body's attached [godot.Object]. See [godot.Object.getInstanceId].
   */
  public fun getColliderId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_COLLIDER_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the colliding body's [RID] used by the [godot.PhysicsServer2D].
   */
  public fun getColliderRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_COLLIDER_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the colliding body's shape.
   */
  public fun getColliderShape(): Object? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_COLLIDER_SHAPE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Returns the colliding body's shape index. See [godot.CollisionObject2D].
   */
  public fun getColliderShapeIndex(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_COLLIDER_SHAPE_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the colliding body's velocity.
   */
  public fun getColliderVelocity(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_COLLIDER_VELOCITY, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  public companion object
}
