// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
open class HingeJoint : Joint() {
  open var angularLimit_bias: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HINGEJOINT_GET_ANGULAR_LIMIT_BIAS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HINGEJOINT_SET_ANGULAR_LIMIT_BIAS,
          NIL)
    }

  open var angularLimit_enable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HINGEJOINT_GET_ANGULAR_LIMIT_ENABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HINGEJOINT_SET_ANGULAR_LIMIT_ENABLE, NIL)
    }

  open var angularLimit_relaxation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HINGEJOINT_GET_ANGULAR_LIMIT_RELAXATION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HINGEJOINT_SET_ANGULAR_LIMIT_RELAXATION, NIL)
    }

  open var angularLimit_softness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HINGEJOINT_GET_ANGULAR_LIMIT_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HINGEJOINT_SET_ANGULAR_LIMIT_SOFTNESS, NIL)
    }

  open var motor_enable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HINGEJOINT_GET_MOTOR_ENABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HINGEJOINT_SET_MOTOR_ENABLE, NIL)
    }

  open var motor_maxImpulse: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HINGEJOINT_GET_MOTOR_MAX_IMPULSE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HINGEJOINT_SET_MOTOR_MAX_IMPULSE,
          NIL)
    }

  open var motor_targetVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HINGEJOINT_GET_MOTOR_TARGET_VELOCITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HINGEJOINT_SET_MOTOR_TARGET_VELOCITY, NIL)
    }

  open var params_bias: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HINGEJOINT_GET_PARAMS_BIAS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HINGEJOINT_SET_PARAMS_BIAS, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_HINGEJOINT)

  open fun _get_lower_limit(): Double {
    throw NotImplementedError("_get_lower_limit is not implemented for HingeJoint")
  }

  open fun _get_upper_limit(): Double {
    throw NotImplementedError("_get_upper_limit is not implemented for HingeJoint")
  }

  open fun _set_lower_limit(lowerLimit: Double) {
  }

  open fun _set_upper_limit(upperLimit: Double) {
  }

  enum class Param(
    id: Long
  ) {
    PARAM_BIAS(0),

    PARAM_LIMIT_UPPER(1),

    PARAM_LIMIT_LOWER(2),

    PARAM_LIMIT_BIAS(3),

    PARAM_LIMIT_SOFTNESS(4),

    PARAM_LIMIT_RELAXATION(5),

    PARAM_MOTOR_TARGET_VELOCITY(6),

    PARAM_MOTOR_MAX_IMPULSE(7),

    PARAM_MAX(8);

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
    FLAG_USE_LIMIT(0),

    FLAG_ENABLE_MOTOR(1),

    FLAG_MAX(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val FLAG_ENABLE_MOTOR: Long = 1

    final const val FLAG_MAX: Long = 2

    final const val FLAG_USE_LIMIT: Long = 0

    final const val PARAM_BIAS: Long = 0

    final const val PARAM_LIMIT_BIAS: Long = 3

    final const val PARAM_LIMIT_LOWER: Long = 2

    final const val PARAM_LIMIT_RELAXATION: Long = 5

    final const val PARAM_LIMIT_SOFTNESS: Long = 4

    final const val PARAM_LIMIT_UPPER: Long = 1

    final const val PARAM_MAX: Long = 8

    final const val PARAM_MOTOR_MAX_IMPULSE: Long = 7

    final const val PARAM_MOTOR_TARGET_VELOCITY: Long = 6
  }
}
