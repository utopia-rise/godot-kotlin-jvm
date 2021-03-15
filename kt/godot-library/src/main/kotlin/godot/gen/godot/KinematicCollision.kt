// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Any
import kotlin.Long
import kotlin.Suppress

/**
 * Collision data for [godot.KinematicBody] collisions.
 *
 * Contains collision data for [godot.KinematicBody] collisions. When a [godot.KinematicBody] is moved using [godot.KinematicBody.moveAndCollide], it stops if it detects a collision with another body. If a collision is detected, a KinematicCollision object is returned.
 *
 * This object contains information about the collision, including the colliding object, the remaining motion, and the collision position. This information can be used to calculate a collision response.
 */
@GodotBaseType
open class KinematicCollision : Reference() {
  /**
   * The colliding body.
   */
  open val collider: Object?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_COLLIDER,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Object?
    }

  /**
   * The colliding body's unique instance ID. See [godot.Object.getInstanceId].
   */
  open val colliderId: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_COLLIDER_ID, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }

  /**
   * The colliding body's metadata. See [godot.Object].
   */
  open val colliderMetadata: Any?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_COLLIDER_METADATA, ANY)
      return TransferContext.readReturnValue(ANY, true) as Any?
    }

  /**
   * The colliding body's shape.
   */
  open val colliderShape: Object?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_COLLIDER_SHAPE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Object?
    }

  /**
   * The colliding shape's index. See [godot.CollisionObject].
   */
  open val colliderShapeIndex: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_COLLIDER_SHAPE_INDEX, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }

  /**
   * The colliding object's velocity.
   */
  open val colliderVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_COLLIDER_VELOCITY, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  /**
   * The moving object's colliding shape.
   */
  open val localShape: Object?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_LOCAL_SHAPE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Object?
    }

  /**
   * The colliding body's shape's normal at the point of collision.
   */
  open val normal: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_NORMAL,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  /**
   * The point of collision, in global coordinates.
   */
  open val position: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_POSITION,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  /**
   * The moving object's remaining movement vector.
   */
  open val remainder: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_REMAINDER,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  /**
   * The distance the moving object traveled before collision.
   */
  open val travel: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_TRAVEL,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_KINEMATICCOLLISION,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }
}
