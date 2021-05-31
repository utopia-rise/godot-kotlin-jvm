// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * The generic 6-degrees-of-freedom joint can implement a variety of joint types by locking certain axes' rotation or translation.
 *
 * The first 3 DOF axes are linear axes, which represent translation of Bodies, and the latter 3 DOF axes represent the angular motion. Each axis can be either locked, or limited.
 */
@GodotBaseType
public open class Generic6DOFJoint : Joint() {
  public open var angularLimitX_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_X_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_X_DAMPING, NIL)
    }

  public open var angularLimitX_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_X_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_X_ENABLED, NIL)
    }

  public open var angularLimitX_erp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_X_ERP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_X_ERP, NIL)
    }

  public open var angularLimitX_forceLimit: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_X_FORCE_LIMIT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_X_FORCE_LIMIT, NIL)
    }

  public open var angularLimitX_restitution: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_X_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_X_RESTITUTION, NIL)
    }

  public open var angularLimitX_softness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_X_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_X_SOFTNESS, NIL)
    }

  public open var angularLimitY_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Y_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Y_DAMPING, NIL)
    }

  public open var angularLimitY_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Y_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Y_ENABLED, NIL)
    }

  public open var angularLimitY_erp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Y_ERP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Y_ERP, NIL)
    }

  public open var angularLimitY_forceLimit: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Y_FORCE_LIMIT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Y_FORCE_LIMIT, NIL)
    }

  public open var angularLimitY_restitution: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Y_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Y_RESTITUTION, NIL)
    }

  public open var angularLimitY_softness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Y_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Y_SOFTNESS, NIL)
    }

  public open var angularLimitZ_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Z_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Z_DAMPING, NIL)
    }

  public open var angularLimitZ_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Z_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Z_ENABLED, NIL)
    }

  public open var angularLimitZ_erp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Z_ERP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Z_ERP, NIL)
    }

  public open var angularLimitZ_forceLimit: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Z_FORCE_LIMIT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Z_FORCE_LIMIT, NIL)
    }

  public open var angularLimitZ_restitution: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Z_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Z_RESTITUTION, NIL)
    }

  public open var angularLimitZ_softness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Z_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Z_SOFTNESS, NIL)
    }

  public open var angularMotorX_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_MOTOR_X_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_MOTOR_X_ENABLED, NIL)
    }

  public open var angularMotorX_forceLimit: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_MOTOR_X_FORCE_LIMIT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_MOTOR_X_FORCE_LIMIT, NIL)
    }

  public open var angularMotorX_targetVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_MOTOR_X_TARGET_VELOCITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_MOTOR_X_TARGET_VELOCITY, NIL)
    }

  public open var angularMotorY_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_MOTOR_Y_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_MOTOR_Y_ENABLED, NIL)
    }

  public open var angularMotorY_forceLimit: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_MOTOR_Y_FORCE_LIMIT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_MOTOR_Y_FORCE_LIMIT, NIL)
    }

  public open var angularMotorY_targetVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_MOTOR_Y_TARGET_VELOCITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_MOTOR_Y_TARGET_VELOCITY, NIL)
    }

  public open var angularMotorZ_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_MOTOR_Z_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_MOTOR_Z_ENABLED, NIL)
    }

  public open var angularMotorZ_forceLimit: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_MOTOR_Z_FORCE_LIMIT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_MOTOR_Z_FORCE_LIMIT, NIL)
    }

  public open var angularMotorZ_targetVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_MOTOR_Z_TARGET_VELOCITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_MOTOR_Z_TARGET_VELOCITY, NIL)
    }

  public open var angularSpringX_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_X_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_X_DAMPING, NIL)
    }

  public open var angularSpringX_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_X_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_X_ENABLED, NIL)
    }

  public open var angularSpringX_equilibriumPoint: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_X_EQUILIBRIUM_POINT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_X_EQUILIBRIUM_POINT, NIL)
    }

  public open var angularSpringX_stiffness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_X_STIFFNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_X_STIFFNESS, NIL)
    }

  public open var angularSpringY_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_Y_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_Y_DAMPING, NIL)
    }

  public open var angularSpringY_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_Y_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_Y_ENABLED, NIL)
    }

  public open var angularSpringY_equilibriumPoint: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_Y_EQUILIBRIUM_POINT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_Y_EQUILIBRIUM_POINT, NIL)
    }

  public open var angularSpringY_stiffness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_Y_STIFFNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_Y_STIFFNESS, NIL)
    }

  public open var angularSpringZ_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_Z_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_Z_DAMPING, NIL)
    }

  public open var angularSpringZ_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_Z_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_Z_ENABLED, NIL)
    }

  public open var angularSpringZ_equilibriumPoint: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_Z_EQUILIBRIUM_POINT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_Z_EQUILIBRIUM_POINT, NIL)
    }

  public open var angularSpringZ_stiffness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_Z_STIFFNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_Z_STIFFNESS, NIL)
    }

  public open var linearLimitX_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_X_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_X_DAMPING, NIL)
    }

  public open var linearLimitX_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_X_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_X_ENABLED, NIL)
    }

  public open var linearLimitX_lowerDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_X_LOWER_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_X_LOWER_DISTANCE, NIL)
    }

  public open var linearLimitX_restitution: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_X_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_X_RESTITUTION, NIL)
    }

  public open var linearLimitX_softness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_X_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_X_SOFTNESS, NIL)
    }

  public open var linearLimitX_upperDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_X_UPPER_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_X_UPPER_DISTANCE, NIL)
    }

  public open var linearLimitY_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Y_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Y_DAMPING, NIL)
    }

  public open var linearLimitY_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Y_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Y_ENABLED, NIL)
    }

  public open var linearLimitY_lowerDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Y_LOWER_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Y_LOWER_DISTANCE, NIL)
    }

  public open var linearLimitY_restitution: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Y_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Y_RESTITUTION, NIL)
    }

  public open var linearLimitY_softness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Y_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Y_SOFTNESS, NIL)
    }

  public open var linearLimitY_upperDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Y_UPPER_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Y_UPPER_DISTANCE, NIL)
    }

  public open var linearLimitZ_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Z_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Z_DAMPING, NIL)
    }

  public open var linearLimitZ_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Z_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Z_ENABLED, NIL)
    }

  public open var linearLimitZ_lowerDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Z_LOWER_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Z_LOWER_DISTANCE, NIL)
    }

  public open var linearLimitZ_restitution: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Z_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Z_RESTITUTION, NIL)
    }

  public open var linearLimitZ_softness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Z_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Z_SOFTNESS, NIL)
    }

  public open var linearLimitZ_upperDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Z_UPPER_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Z_UPPER_DISTANCE, NIL)
    }

  public open var linearMotorX_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_MOTOR_X_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_MOTOR_X_ENABLED, NIL)
    }

  public open var linearMotorX_forceLimit: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_MOTOR_X_FORCE_LIMIT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_MOTOR_X_FORCE_LIMIT, NIL)
    }

  public open var linearMotorX_targetVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_MOTOR_X_TARGET_VELOCITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_MOTOR_X_TARGET_VELOCITY, NIL)
    }

  public open var linearMotorY_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_MOTOR_Y_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_MOTOR_Y_ENABLED, NIL)
    }

  public open var linearMotorY_forceLimit: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_MOTOR_Y_FORCE_LIMIT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_MOTOR_Y_FORCE_LIMIT, NIL)
    }

  public open var linearMotorY_targetVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_MOTOR_Y_TARGET_VELOCITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_MOTOR_Y_TARGET_VELOCITY, NIL)
    }

  public open var linearMotorZ_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_MOTOR_Z_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_MOTOR_Z_ENABLED, NIL)
    }

  public open var linearMotorZ_forceLimit: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_MOTOR_Z_FORCE_LIMIT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_MOTOR_Z_FORCE_LIMIT, NIL)
    }

  public open var linearMotorZ_targetVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_MOTOR_Z_TARGET_VELOCITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_MOTOR_Z_TARGET_VELOCITY, NIL)
    }

  public open var linearSpringX_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_X_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_X_DAMPING, NIL)
    }

  public open var linearSpringX_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_X_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_X_ENABLED, NIL)
    }

  public open var linearSpringX_equilibriumPoint: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_X_EQUILIBRIUM_POINT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_X_EQUILIBRIUM_POINT, NIL)
    }

  public open var linearSpringX_stiffness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_X_STIFFNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_X_STIFFNESS, NIL)
    }

  public open var linearSpringY_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_Y_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_Y_DAMPING, NIL)
    }

  public open var linearSpringY_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_Y_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_Y_ENABLED, NIL)
    }

  public open var linearSpringY_equilibriumPoint: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_Y_EQUILIBRIUM_POINT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_Y_EQUILIBRIUM_POINT, NIL)
    }

  public open var linearSpringY_stiffness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_Y_STIFFNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_Y_STIFFNESS, NIL)
    }

  public open var linearSpringZ_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_Z_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_Z_DAMPING, NIL)
    }

  public open var linearSpringZ_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_Z_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_Z_ENABLED, NIL)
    }

  public open var linearSpringZ_equilibriumPoint: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_Z_EQUILIBRIUM_POINT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_Z_EQUILIBRIUM_POINT, NIL)
    }

  public open var linearSpringZ_stiffness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_Z_STIFFNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_Z_STIFFNESS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GENERIC6DOFJOINT)
  }

  public open fun _getAngularHiLimitX(): Double {
    throw NotImplementedError("_get_angular_hi_limit_x is not implemented for Generic6DOFJoint")
  }

  public open fun _getAngularHiLimitY(): Double {
    throw NotImplementedError("_get_angular_hi_limit_y is not implemented for Generic6DOFJoint")
  }

  public open fun _getAngularHiLimitZ(): Double {
    throw NotImplementedError("_get_angular_hi_limit_z is not implemented for Generic6DOFJoint")
  }

  public open fun _getAngularLoLimitX(): Double {
    throw NotImplementedError("_get_angular_lo_limit_x is not implemented for Generic6DOFJoint")
  }

  public open fun _getAngularLoLimitY(): Double {
    throw NotImplementedError("_get_angular_lo_limit_y is not implemented for Generic6DOFJoint")
  }

  public open fun _getAngularLoLimitZ(): Double {
    throw NotImplementedError("_get_angular_lo_limit_z is not implemented for Generic6DOFJoint")
  }

  public open fun _setAngularHiLimitX(angle: Double): Unit {
  }

  public open fun _setAngularHiLimitY(angle: Double): Unit {
  }

  public open fun _setAngularHiLimitZ(angle: Double): Unit {
  }

  public open fun _setAngularLoLimitX(angle: Double): Unit {
  }

  public open fun _setAngularLoLimitY(angle: Double): Unit {
  }

  public open fun _setAngularLoLimitZ(angle: Double): Unit {
  }

  public enum class Param(
    id: Long
  ) {
    /**
     * The minimum difference between the pivot points' axes.
     */
    PARAM_LINEAR_LOWER_LIMIT(0),
    /**
     * The maximum difference between the pivot points' axes.
     */
    PARAM_LINEAR_UPPER_LIMIT(1),
    /**
     * A factor applied to the movement across the axes. The lower, the slower the movement.
     */
    PARAM_LINEAR_LIMIT_SOFTNESS(2),
    /**
     * The amount of restitution on the axes' movement. The lower, the more momentum gets lost.
     */
    PARAM_LINEAR_RESTITUTION(3),
    /**
     * The amount of damping that happens at the linear motion across the axes.
     */
    PARAM_LINEAR_DAMPING(4),
    /**
     * The velocity the linear motor will try to reach.
     */
    PARAM_LINEAR_MOTOR_TARGET_VELOCITY(5),
    /**
     * The maximum force the linear motor will apply while trying to reach the velocity target.
     */
    PARAM_LINEAR_MOTOR_FORCE_LIMIT(6),
    /**
     *
     */
    PARAM_LINEAR_SPRING_STIFFNESS(7),
    /**
     *
     */
    PARAM_LINEAR_SPRING_DAMPING(8),
    /**
     *
     */
    PARAM_LINEAR_SPRING_EQUILIBRIUM_POINT(9),
    /**
     * The minimum rotation in negative direction to break loose and rotate around the axes.
     */
    PARAM_ANGULAR_LOWER_LIMIT(10),
    /**
     * The minimum rotation in positive direction to break loose and rotate around the axes.
     */
    PARAM_ANGULAR_UPPER_LIMIT(11),
    /**
     * The speed of all rotations across the axes.
     */
    PARAM_ANGULAR_LIMIT_SOFTNESS(12),
    /**
     * The amount of rotational damping across the axes. The lower, the more dampening occurs.
     */
    PARAM_ANGULAR_DAMPING(13),
    /**
     * The amount of rotational restitution across the axes. The lower, the more restitution occurs.
     */
    PARAM_ANGULAR_RESTITUTION(14),
    /**
     * The maximum amount of force that can occur, when rotating around the axes.
     */
    PARAM_ANGULAR_FORCE_LIMIT(15),
    /**
     * When rotating across the axes, this error tolerance factor defines how much the correction gets slowed down. The lower, the slower.
     */
    PARAM_ANGULAR_ERP(16),
    /**
     * Target speed for the motor at the axes.
     */
    PARAM_ANGULAR_MOTOR_TARGET_VELOCITY(17),
    /**
     * Maximum acceleration for the motor at the axes.
     */
    PARAM_ANGULAR_MOTOR_FORCE_LIMIT(18),
    /**
     *
     */
    PARAM_ANGULAR_SPRING_STIFFNESS(19),
    /**
     *
     */
    PARAM_ANGULAR_SPRING_DAMPING(20),
    /**
     *
     */
    PARAM_ANGULAR_SPRING_EQUILIBRIUM_POINT(21),
    /**
     * Represents the size of the [enum Param] enum.
     */
    PARAM_MAX(22),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Flag(
    id: Long
  ) {
    /**
     * If enabled, linear motion is possible within the given limits.
     */
    FLAG_ENABLE_LINEAR_LIMIT(0),
    /**
     * If enabled, rotational motion is possible within the given limits.
     */
    FLAG_ENABLE_ANGULAR_LIMIT(1),
    /**
     *
     */
    FLAG_ENABLE_ANGULAR_SPRING(2),
    /**
     *
     */
    FLAG_ENABLE_LINEAR_SPRING(3),
    /**
     * If enabled, there is a rotational motor across these axes.
     */
    FLAG_ENABLE_MOTOR(4),
    /**
     * If enabled, there is a linear motor across these axes.
     */
    FLAG_ENABLE_LINEAR_MOTOR(5),
    /**
     * Represents the size of the [enum Flag] enum.
     */
    FLAG_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * If enabled, rotational motion is possible within the given limits.
     */
    public final const val FLAG_ENABLE_ANGULAR_LIMIT: Long = 1

    /**
     *
     */
    public final const val FLAG_ENABLE_ANGULAR_SPRING: Long = 2

    /**
     * If enabled, linear motion is possible within the given limits.
     */
    public final const val FLAG_ENABLE_LINEAR_LIMIT: Long = 0

    /**
     * If enabled, there is a linear motor across these axes.
     */
    public final const val FLAG_ENABLE_LINEAR_MOTOR: Long = 5

    /**
     *
     */
    public final const val FLAG_ENABLE_LINEAR_SPRING: Long = 3

    /**
     * If enabled, there is a rotational motor across these axes.
     */
    public final const val FLAG_ENABLE_MOTOR: Long = 4

    /**
     * Represents the size of the [enum Flag] enum.
     */
    public final const val FLAG_MAX: Long = 6

    /**
     * The amount of rotational damping across the axes. The lower, the more dampening occurs.
     */
    public final const val PARAM_ANGULAR_DAMPING: Long = 13

    /**
     * When rotating across the axes, this error tolerance factor defines how much the correction gets slowed down. The lower, the slower.
     */
    public final const val PARAM_ANGULAR_ERP: Long = 16

    /**
     * The maximum amount of force that can occur, when rotating around the axes.
     */
    public final const val PARAM_ANGULAR_FORCE_LIMIT: Long = 15

    /**
     * The speed of all rotations across the axes.
     */
    public final const val PARAM_ANGULAR_LIMIT_SOFTNESS: Long = 12

    /**
     * The minimum rotation in negative direction to break loose and rotate around the axes.
     */
    public final const val PARAM_ANGULAR_LOWER_LIMIT: Long = 10

    /**
     * Maximum acceleration for the motor at the axes.
     */
    public final const val PARAM_ANGULAR_MOTOR_FORCE_LIMIT: Long = 18

    /**
     * Target speed for the motor at the axes.
     */
    public final const val PARAM_ANGULAR_MOTOR_TARGET_VELOCITY: Long = 17

    /**
     * The amount of rotational restitution across the axes. The lower, the more restitution occurs.
     */
    public final const val PARAM_ANGULAR_RESTITUTION: Long = 14

    /**
     *
     */
    public final const val PARAM_ANGULAR_SPRING_DAMPING: Long = 20

    /**
     *
     */
    public final const val PARAM_ANGULAR_SPRING_EQUILIBRIUM_POINT: Long = 21

    /**
     *
     */
    public final const val PARAM_ANGULAR_SPRING_STIFFNESS: Long = 19

    /**
     * The minimum rotation in positive direction to break loose and rotate around the axes.
     */
    public final const val PARAM_ANGULAR_UPPER_LIMIT: Long = 11

    /**
     * The amount of damping that happens at the linear motion across the axes.
     */
    public final const val PARAM_LINEAR_DAMPING: Long = 4

    /**
     * A factor applied to the movement across the axes. The lower, the slower the movement.
     */
    public final const val PARAM_LINEAR_LIMIT_SOFTNESS: Long = 2

    /**
     * The minimum difference between the pivot points' axes.
     */
    public final const val PARAM_LINEAR_LOWER_LIMIT: Long = 0

    /**
     * The maximum force the linear motor will apply while trying to reach the velocity target.
     */
    public final const val PARAM_LINEAR_MOTOR_FORCE_LIMIT: Long = 6

    /**
     * The velocity the linear motor will try to reach.
     */
    public final const val PARAM_LINEAR_MOTOR_TARGET_VELOCITY: Long = 5

    /**
     * The amount of restitution on the axes' movement. The lower, the more momentum gets lost.
     */
    public final const val PARAM_LINEAR_RESTITUTION: Long = 3

    /**
     *
     */
    public final const val PARAM_LINEAR_SPRING_DAMPING: Long = 8

    /**
     *
     */
    public final const val PARAM_LINEAR_SPRING_EQUILIBRIUM_POINT: Long = 9

    /**
     *
     */
    public final const val PARAM_LINEAR_SPRING_STIFFNESS: Long = 7

    /**
     * The maximum difference between the pivot points' axes.
     */
    public final const val PARAM_LINEAR_UPPER_LIMIT: Long = 1

    /**
     * Represents the size of the [enum Param] enum.
     */
    public final const val PARAM_MAX: Long = 22
  }
}
