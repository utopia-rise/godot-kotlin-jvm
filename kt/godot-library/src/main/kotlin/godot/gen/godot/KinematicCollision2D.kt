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
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

/**
 * Holds collision data from the movement of a [godot.PhysicsBody2D].
 *
 * Holds collision data from the movement of a [godot.PhysicsBody2D], usually from [godot.PhysicsBody2D.moveAndCollide]. When a [godot.PhysicsBody2D] is moved, it stops if it detects a collision with another body. If a collision is detected, a [godot.KinematicCollision2D] object is returned.
 *
 * The collision data includes the colliding object, the remaining motion, and the collision position. This data can be used to determine a custom response to the collision.
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
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the colliding body's shape's normal at the point of collision.
   */
  public fun getNormal(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_NORMAL,
        VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the moving object's travel before collision.
   */
  public fun getTravel(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_TRAVEL,
        VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the moving object's remaining movement vector.
   */
  public fun getRemainder(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_REMAINDER,
        VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the collision angle according to [upDirection], which is [godot.Vector2.UP] by default. This value is always positive.
   */
  @JvmOverloads
  public fun getAngle(upDirection: Vector2 = Vector2(0, -1)): Float {
    TransferContext.writeArguments(VECTOR2 to upDirection)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_ANGLE,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the colliding body's length of overlap along the collision normal.
   */
  public fun getDepth(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_DEPTH,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the moving object's colliding shape.
   */
  public fun getLocalShape(): Object? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_LOCAL_SHAPE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  /**
   * Returns the colliding body's attached [godot.Object].
   */
  public fun getCollider(): Object? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_COLLIDER,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  /**
   * Returns the unique instance ID of the colliding body's attached [godot.Object]. See [godot.Object.getInstanceId].
   */
  public fun getColliderId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_COLLIDER_ID, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the colliding body's [RID] used by the [godot.PhysicsServer2D].
   */
  public fun getColliderRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_COLLIDER_RID, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the colliding body's shape.
   */
  public fun getColliderShape(): Object? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_COLLIDER_SHAPE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  /**
   * Returns the colliding body's shape index. See [godot.CollisionObject2D].
   */
  public fun getColliderShapeIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_COLLIDER_SHAPE_INDEX, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the colliding body's velocity.
   */
  public fun getColliderVelocity(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_COLLIDER_VELOCITY, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public companion object
}
