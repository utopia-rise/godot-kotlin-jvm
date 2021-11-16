// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

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
 *
 */
@GodotBaseType
public open class PhysicsTestMotionResult : Reference() {
  /**
   *
   */
  public open val collider: Object?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT_GET_COLLIDER, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Object?
    }

  /**
   *
   */
  public open val colliderId: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT_GET_COLLIDER_ID, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }

  /**
   *
   */
  public open val colliderRid: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT_GET_COLLIDER_RID, _RID)
      return TransferContext.readReturnValue(_RID, false) as RID
    }

  /**
   *
   */
  public open val colliderShape: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT_GET_COLLIDER_SHAPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }

  /**
   *
   */
  public open val colliderVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT_GET_COLLIDER_VELOCITY, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  /**
   *
   */
  public open val collisionDepth: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT_GET_COLLISION_DEPTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   *
   */
  public open val collisionNormal: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT_GET_COLLISION_NORMAL, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  /**
   *
   */
  public open val collisionPoint: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT_GET_COLLISION_POINT, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  /**
   *
   */
  public open val collisionSafeFraction: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT_GET_COLLISION_SAFE_FRACTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   *
   */
  public open val collisionUnsafeFraction: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT_GET_COLLISION_UNSAFE_FRACTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   *
   */
  public open val motion: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT_GET_MOTION, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  /**
   *
   */
  public open val motionRemainder: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT_GET_MOTION_REMAINDER, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PHYSICSTESTMOTIONRESULT)
  }
}
