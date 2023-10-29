// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

/**
 * A physics joint that attaches two 2D physics bodies at a single point, allowing them to freely rotate.
 *
 * A physics joint that attaches two 2D physics bodies at a single point, allowing them to freely rotate. For example, a [godot.RigidBody2D] can be attached to a [godot.StaticBody2D] to create a pendulum or a seesaw.
 */
@GodotBaseType
public open class PinJoint2D : Joint2D() {
  /**
   * The higher this value, the more the bond to the pinned partner can flex.
   */
  public var softness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PINJOINT2D_GET_SOFTNESS, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PINJOINT2D_SET_SOFTNESS, NIL)
    }

  /**
   * If `true`, the pin maximum and minimum rotation, defined by [angularLimitLower] and [angularLimitUpper] are applied.
   */
  public var angularLimitEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PINJOINT2D_IS_ANGULAR_LIMIT_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PINJOINT2D_SET_ANGULAR_LIMIT_ENABLED, NIL)
    }

  /**
   * The minimum rotation. Only active if [angularLimitEnabled] is `true`.
   */
  public var angularLimitLower: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PINJOINT2D_GET_ANGULAR_LIMIT_LOWER, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PINJOINT2D_SET_ANGULAR_LIMIT_LOWER, NIL)
    }

  /**
   * The maximum rotation. Only active if [angularLimitEnabled] is `true`.
   */
  public var angularLimitUpper: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PINJOINT2D_GET_ANGULAR_LIMIT_UPPER, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PINJOINT2D_SET_ANGULAR_LIMIT_UPPER, NIL)
    }

  /**
   * When activated, a motor turns the pin.
   */
  public var motorEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PINJOINT2D_IS_MOTOR_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PINJOINT2D_SET_MOTOR_ENABLED, NIL)
    }

  /**
   * Target speed for the motor. In radians per second.
   */
  public var motorTargetVelocity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PINJOINT2D_GET_MOTOR_TARGET_VELOCITY, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PINJOINT2D_SET_MOTOR_TARGET_VELOCITY, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PINJOINT2D, scriptIndex)
    return true
  }

  public companion object
}
