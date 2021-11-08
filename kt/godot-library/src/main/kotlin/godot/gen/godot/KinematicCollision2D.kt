// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import kotlin.Any
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Collision data for [godot.KinematicBody2D] collisions.
 *
 * Contains collision data for [godot.KinematicBody2D] collisions. When a [godot.KinematicBody2D] is moved using [godot.KinematicBody2D.moveAndCollide], it stops if it detects a collision with another body. If a collision is detected, a KinematicCollision2D object is returned.
 *
 * This object contains information about the collision, including the colliding object, the remaining motion, and the collision position. This information can be used to calculate a collision response.
 */
@GodotBaseType
public open class KinematicCollision2D : Reference() {
  /**
   * The colliding body.
   */
  public open val collider: Object?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_COLLIDER,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Object?
    }

  /**
   * The colliding body's unique instance ID. See [godot.Object.getInstanceId].
   */
  public open val colliderId: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_COLLIDER_ID, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }

  /**
   * The colliding body's metadata. See [godot.Object].
   */
  public open val colliderMetadata: Any?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_COLLIDER_METADATA, ANY)
      return TransferContext.readReturnValue(ANY, true) as Any?
    }

  /**
   * The colliding body's [RID] used by the [godot.Physics2DServer].
   */
  public open val colliderRid: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_COLLIDER_RID, _RID)
      return TransferContext.readReturnValue(_RID, false) as RID
    }

  /**
   * The colliding body's shape.
   */
  public open val colliderShape: Object?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_COLLIDER_SHAPE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Object?
    }

  /**
   * The colliding shape's index. See [godot.CollisionObject2D].
   */
  public open val colliderShapeIndex: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_COLLIDER_SHAPE_INDEX, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }

  /**
   * The colliding object's velocity.
   */
  public open val colliderVelocity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_COLLIDER_VELOCITY, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  /**
   * The moving object's colliding shape.
   */
  public open val localShape: Object?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_LOCAL_SHAPE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Object?
    }

  /**
   * The colliding body's shape's normal at the point of collision.
   */
  public open val normal: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_NORMAL,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  /**
   * The point of collision, in global coordinates.
   */
  public open val position: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_POSITION,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  /**
   * The moving object's remaining movement vector.
   */
  public open val remainder: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_REMAINDER, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  /**
   * The distance the moving object traveled before collision.
   */
  public open val travel: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_TRAVEL,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_KINEMATICCOLLISION2D)
  }

  /**
   * The collision angle according to `up_direction`, which is `Vector2.UP` by default. This value is always positive.
   */
  public open fun getAngle(upDirection: Vector2 = Vector2(0.0, -1.0)): Double {
    TransferContext.writeArguments(VECTOR2 to upDirection)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION2D_GET_ANGLE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }
}
