// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Any
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Collision data for [godot.KinematicBody] collisions.
 *
 * Contains collision data for [godot.KinematicBody] collisions. When a [godot.KinematicBody] is moved using [godot.KinematicBody.moveAndCollide], it stops if it detects a collision with another body. If a collision is detected, a KinematicCollision object is returned.
 *
 * This object contains information about the collision, including the colliding object, the remaining motion, and the collision position. This information can be used to calculate a collision response.
 */
@GodotBaseType
public open class KinematicCollision : Reference() {
  /**
   * The colliding body.
   */
  public open val collider: Object?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_COLLIDER,
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
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_COLLIDER_ID, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }

  /**
   * The colliding body's metadata. See [godot.Object].
   */
  public open val colliderMetadata: Any?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_COLLIDER_METADATA, ANY)
      return TransferContext.readReturnValue(ANY, true) as Any?
    }

  /**
   * The colliding body's shape.
   */
  public open val colliderShape: Object?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_COLLIDER_SHAPE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Object?
    }

  /**
   * The colliding shape's index. See [godot.CollisionObject].
   */
  public open val colliderShapeIndex: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_COLLIDER_SHAPE_INDEX, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }

  /**
   * The colliding object's velocity.
   */
  public open val colliderVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_COLLIDER_VELOCITY, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  /**
   * The moving object's colliding shape.
   */
  public open val localShape: Object?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_LOCAL_SHAPE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Object?
    }

  /**
   * The colliding body's shape's normal at the point of collision.
   */
  public open val normal: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_NORMAL,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  /**
   * The point of collision, in global coordinates.
   */
  public open val position: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_POSITION,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  /**
   * The moving object's remaining movement vector.
   */
  public open val remainder: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_REMAINDER,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  /**
   * The distance the moving object traveled before collision.
   */
  public open val travel: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_TRAVEL,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_KINEMATICCOLLISION)
  }
}
