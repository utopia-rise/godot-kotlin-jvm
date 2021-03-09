// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 * The generic 6-degrees-of-freedom joint can implement a variety of joint types by locking certain axes' rotation or translation.
 *
 * The first 3 DOF axes are linear axes, which represent translation of Bodies, and the latter 3 DOF axes represent the angular motion. Each axis can be either locked, or limited.
 */
@GodotBaseType
open class Generic6DOFJoint : Joint() {
  open var angularLimitX_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_X_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_X_DAMPING, NIL)
    }

  open var angularLimitX_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_X_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_X_ENABLED, NIL)
    }

  open var angularLimitX_erp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_X_ERP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_X_ERP, NIL)
    }

  open var angularLimitX_forceLimit: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_X_FORCE_LIMIT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_X_FORCE_LIMIT, NIL)
    }

  open var angularLimitX_restitution: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_X_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_X_RESTITUTION, NIL)
    }

  open var angularLimitX_softness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_X_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_X_SOFTNESS, NIL)
    }

  open var angularLimitY_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Y_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Y_DAMPING, NIL)
    }

  open var angularLimitY_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Y_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Y_ENABLED, NIL)
    }

  open var angularLimitY_erp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Y_ERP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Y_ERP, NIL)
    }

  open var angularLimitY_forceLimit: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Y_FORCE_LIMIT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Y_FORCE_LIMIT, NIL)
    }

  open var angularLimitY_restitution: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Y_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Y_RESTITUTION, NIL)
    }

  open var angularLimitY_softness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Y_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Y_SOFTNESS, NIL)
    }

  open var angularLimitZ_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Z_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Z_DAMPING, NIL)
    }

  open var angularLimitZ_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Z_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Z_ENABLED, NIL)
    }

  open var angularLimitZ_erp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Z_ERP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Z_ERP, NIL)
    }

  open var angularLimitZ_forceLimit: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Z_FORCE_LIMIT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Z_FORCE_LIMIT, NIL)
    }

  open var angularLimitZ_restitution: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Z_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Z_RESTITUTION, NIL)
    }

  open var angularLimitZ_softness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_LIMIT_Z_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_LIMIT_Z_SOFTNESS, NIL)
    }

  open var angularMotorX_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_MOTOR_X_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_MOTOR_X_ENABLED, NIL)
    }

  open var angularMotorX_forceLimit: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_MOTOR_X_FORCE_LIMIT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_MOTOR_X_FORCE_LIMIT, NIL)
    }

  open var angularMotorX_targetVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_MOTOR_X_TARGET_VELOCITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_MOTOR_X_TARGET_VELOCITY, NIL)
    }

  open var angularMotorY_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_MOTOR_Y_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_MOTOR_Y_ENABLED, NIL)
    }

  open var angularMotorY_forceLimit: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_MOTOR_Y_FORCE_LIMIT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_MOTOR_Y_FORCE_LIMIT, NIL)
    }

  open var angularMotorY_targetVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_MOTOR_Y_TARGET_VELOCITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_MOTOR_Y_TARGET_VELOCITY, NIL)
    }

  open var angularMotorZ_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_MOTOR_Z_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_MOTOR_Z_ENABLED, NIL)
    }

  open var angularMotorZ_forceLimit: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_MOTOR_Z_FORCE_LIMIT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_MOTOR_Z_FORCE_LIMIT, NIL)
    }

  open var angularMotorZ_targetVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_MOTOR_Z_TARGET_VELOCITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_MOTOR_Z_TARGET_VELOCITY, NIL)
    }

  open var angularSpringX_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_X_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_X_DAMPING, NIL)
    }

  open var angularSpringX_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_X_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_X_ENABLED, NIL)
    }

  open var angularSpringX_equilibriumPoint: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_X_EQUILIBRIUM_POINT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_X_EQUILIBRIUM_POINT, NIL)
    }

  open var angularSpringX_stiffness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_X_STIFFNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_X_STIFFNESS, NIL)
    }

  open var angularSpringY_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_Y_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_Y_DAMPING, NIL)
    }

  open var angularSpringY_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_Y_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_Y_ENABLED, NIL)
    }

  open var angularSpringY_equilibriumPoint: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_Y_EQUILIBRIUM_POINT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_Y_EQUILIBRIUM_POINT, NIL)
    }

  open var angularSpringY_stiffness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_Y_STIFFNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_Y_STIFFNESS, NIL)
    }

  open var angularSpringZ_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_Z_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_Z_DAMPING, NIL)
    }

  open var angularSpringZ_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_Z_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_Z_ENABLED, NIL)
    }

  open var angularSpringZ_equilibriumPoint: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_Z_EQUILIBRIUM_POINT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_Z_EQUILIBRIUM_POINT, NIL)
    }

  open var angularSpringZ_stiffness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_ANGULAR_SPRING_Z_STIFFNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_ANGULAR_SPRING_Z_STIFFNESS, NIL)
    }

  open var linearLimitX_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_X_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_X_DAMPING, NIL)
    }

  open var linearLimitX_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_X_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_X_ENABLED, NIL)
    }

  open var linearLimitX_lowerDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_X_LOWER_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_X_LOWER_DISTANCE, NIL)
    }

  open var linearLimitX_restitution: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_X_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_X_RESTITUTION, NIL)
    }

  open var linearLimitX_softness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_X_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_X_SOFTNESS, NIL)
    }

  open var linearLimitX_upperDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_X_UPPER_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_X_UPPER_DISTANCE, NIL)
    }

  open var linearLimitY_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Y_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Y_DAMPING, NIL)
    }

  open var linearLimitY_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Y_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Y_ENABLED, NIL)
    }

  open var linearLimitY_lowerDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Y_LOWER_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Y_LOWER_DISTANCE, NIL)
    }

  open var linearLimitY_restitution: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Y_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Y_RESTITUTION, NIL)
    }

  open var linearLimitY_softness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Y_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Y_SOFTNESS, NIL)
    }

  open var linearLimitY_upperDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Y_UPPER_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Y_UPPER_DISTANCE, NIL)
    }

  open var linearLimitZ_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Z_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Z_DAMPING, NIL)
    }

  open var linearLimitZ_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Z_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Z_ENABLED, NIL)
    }

  open var linearLimitZ_lowerDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Z_LOWER_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Z_LOWER_DISTANCE, NIL)
    }

  open var linearLimitZ_restitution: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Z_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Z_RESTITUTION, NIL)
    }

  open var linearLimitZ_softness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Z_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Z_SOFTNESS, NIL)
    }

  open var linearLimitZ_upperDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_LIMIT_Z_UPPER_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_LIMIT_Z_UPPER_DISTANCE, NIL)
    }

  open var linearMotorX_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_MOTOR_X_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_MOTOR_X_ENABLED, NIL)
    }

  open var linearMotorX_forceLimit: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_MOTOR_X_FORCE_LIMIT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_MOTOR_X_FORCE_LIMIT, NIL)
    }

  open var linearMotorX_targetVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_MOTOR_X_TARGET_VELOCITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_MOTOR_X_TARGET_VELOCITY, NIL)
    }

  open var linearMotorY_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_MOTOR_Y_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_MOTOR_Y_ENABLED, NIL)
    }

  open var linearMotorY_forceLimit: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_MOTOR_Y_FORCE_LIMIT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_MOTOR_Y_FORCE_LIMIT, NIL)
    }

  open var linearMotorY_targetVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_MOTOR_Y_TARGET_VELOCITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_MOTOR_Y_TARGET_VELOCITY, NIL)
    }

  open var linearMotorZ_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_MOTOR_Z_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_MOTOR_Z_ENABLED, NIL)
    }

  open var linearMotorZ_forceLimit: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_MOTOR_Z_FORCE_LIMIT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_MOTOR_Z_FORCE_LIMIT, NIL)
    }

  open var linearMotorZ_targetVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_MOTOR_Z_TARGET_VELOCITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_MOTOR_Z_TARGET_VELOCITY, NIL)
    }

  open var linearSpringX_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_X_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_X_DAMPING, NIL)
    }

  open var linearSpringX_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_X_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_X_ENABLED, NIL)
    }

  open var linearSpringX_equilibriumPoint: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_X_EQUILIBRIUM_POINT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_X_EQUILIBRIUM_POINT, NIL)
    }

  open var linearSpringX_stiffness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_X_STIFFNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_X_STIFFNESS, NIL)
    }

  open var linearSpringY_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_Y_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_Y_DAMPING, NIL)
    }

  open var linearSpringY_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_Y_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_Y_ENABLED, NIL)
    }

  open var linearSpringY_equilibriumPoint: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_Y_EQUILIBRIUM_POINT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_Y_EQUILIBRIUM_POINT, NIL)
    }

  open var linearSpringY_stiffness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_Y_STIFFNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_Y_STIFFNESS, NIL)
    }

  open var linearSpringZ_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_Z_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_Z_DAMPING, NIL)
    }

  open var linearSpringZ_enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_Z_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_Z_ENABLED, NIL)
    }

  open var linearSpringZ_equilibriumPoint: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_Z_EQUILIBRIUM_POINT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_Z_EQUILIBRIUM_POINT, NIL)
    }

  open var linearSpringZ_stiffness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_LINEAR_SPRING_Z_STIFFNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_LINEAR_SPRING_Z_STIFFNESS, NIL)
    }

  /**
   *
   */
  open var precision: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_GET_PRECISION,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GENERIC6DOFJOINT_SET_PRECISION,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_GENERIC6DOFJOINT)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _getAngularHiLimitX(): Double {
    throw NotImplementedError("_get_angular_hi_limit_x is not implemented for Generic6DOFJoint")
  }

  open fun _getAngularHiLimitY(): Double {
    throw NotImplementedError("_get_angular_hi_limit_y is not implemented for Generic6DOFJoint")
  }

  open fun _getAngularHiLimitZ(): Double {
    throw NotImplementedError("_get_angular_hi_limit_z is not implemented for Generic6DOFJoint")
  }

  open fun _getAngularLoLimitX(): Double {
    throw NotImplementedError("_get_angular_lo_limit_x is not implemented for Generic6DOFJoint")
  }

  open fun _getAngularLoLimitY(): Double {
    throw NotImplementedError("_get_angular_lo_limit_y is not implemented for Generic6DOFJoint")
  }

  open fun _getAngularLoLimitZ(): Double {
    throw NotImplementedError("_get_angular_lo_limit_z is not implemented for Generic6DOFJoint")
  }

  open fun _setAngularHiLimitX(angle: Double) {
  }

  open fun _setAngularHiLimitY(angle: Double) {
  }

  open fun _setAngularHiLimitZ(angle: Double) {
  }

  open fun _setAngularLoLimitX(angle: Double) {
  }

  open fun _setAngularLoLimitY(angle: Double) {
  }

  open fun _setAngularLoLimitZ(angle: Double) {
  }

  enum class Param(
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
    PARAM_MAX(22);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Flag(
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
    FLAG_MAX(6);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * If enabled, rotational motion is possible within the given limits.
     */
    final const val FLAG_ENABLE_ANGULAR_LIMIT: Long = 1

    /**
     *
     */
    final const val FLAG_ENABLE_ANGULAR_SPRING: Long = 2

    /**
     * If enabled, linear motion is possible within the given limits.
     */
    final const val FLAG_ENABLE_LINEAR_LIMIT: Long = 0

    /**
     * If enabled, there is a linear motor across these axes.
     */
    final const val FLAG_ENABLE_LINEAR_MOTOR: Long = 5

    /**
     *
     */
    final const val FLAG_ENABLE_LINEAR_SPRING: Long = 3

    /**
     * If enabled, there is a rotational motor across these axes.
     */
    final const val FLAG_ENABLE_MOTOR: Long = 4

    /**
     * Represents the size of the [enum Flag] enum.
     */
    final const val FLAG_MAX: Long = 6

    /**
     * The amount of rotational damping across the axes. The lower, the more dampening occurs.
     */
    final const val PARAM_ANGULAR_DAMPING: Long = 13

    /**
     * When rotating across the axes, this error tolerance factor defines how much the correction gets slowed down. The lower, the slower.
     */
    final const val PARAM_ANGULAR_ERP: Long = 16

    /**
     * The maximum amount of force that can occur, when rotating around the axes.
     */
    final const val PARAM_ANGULAR_FORCE_LIMIT: Long = 15

    /**
     * The speed of all rotations across the axes.
     */
    final const val PARAM_ANGULAR_LIMIT_SOFTNESS: Long = 12

    /**
     * The minimum rotation in negative direction to break loose and rotate around the axes.
     */
    final const val PARAM_ANGULAR_LOWER_LIMIT: Long = 10

    /**
     * Maximum acceleration for the motor at the axes.
     */
    final const val PARAM_ANGULAR_MOTOR_FORCE_LIMIT: Long = 18

    /**
     * Target speed for the motor at the axes.
     */
    final const val PARAM_ANGULAR_MOTOR_TARGET_VELOCITY: Long = 17

    /**
     * The amount of rotational restitution across the axes. The lower, the more restitution occurs.
     */
    final const val PARAM_ANGULAR_RESTITUTION: Long = 14

    /**
     *
     */
    final const val PARAM_ANGULAR_SPRING_DAMPING: Long = 20

    /**
     *
     */
    final const val PARAM_ANGULAR_SPRING_EQUILIBRIUM_POINT: Long = 21

    /**
     *
     */
    final const val PARAM_ANGULAR_SPRING_STIFFNESS: Long = 19

    /**
     * The minimum rotation in positive direction to break loose and rotate around the axes.
     */
    final const val PARAM_ANGULAR_UPPER_LIMIT: Long = 11

    /**
     * The amount of damping that happens at the linear motion across the axes.
     */
    final const val PARAM_LINEAR_DAMPING: Long = 4

    /**
     * A factor applied to the movement across the axes. The lower, the slower the movement.
     */
    final const val PARAM_LINEAR_LIMIT_SOFTNESS: Long = 2

    /**
     * The minimum difference between the pivot points' axes.
     */
    final const val PARAM_LINEAR_LOWER_LIMIT: Long = 0

    /**
     * The maximum force the linear motor will apply while trying to reach the velocity target.
     */
    final const val PARAM_LINEAR_MOTOR_FORCE_LIMIT: Long = 6

    /**
     * The velocity the linear motor will try to reach.
     */
    final const val PARAM_LINEAR_MOTOR_TARGET_VELOCITY: Long = 5

    /**
     * The amount of restitution on the axes' movement. The lower, the more momentum gets lost.
     */
    final const val PARAM_LINEAR_RESTITUTION: Long = 3

    /**
     *
     */
    final const val PARAM_LINEAR_SPRING_DAMPING: Long = 8

    /**
     *
     */
    final const val PARAM_LINEAR_SPRING_EQUILIBRIUM_POINT: Long = 9

    /**
     *
     */
    final const val PARAM_LINEAR_SPRING_STIFFNESS: Long = 7

    /**
     * The maximum difference between the pivot points' axes.
     */
    final const val PARAM_LINEAR_UPPER_LIMIT: Long = 1

    /**
     * Represents the size of the [enum Param] enum.
     */
    final const val PARAM_MAX: Long = 22
  }
}
