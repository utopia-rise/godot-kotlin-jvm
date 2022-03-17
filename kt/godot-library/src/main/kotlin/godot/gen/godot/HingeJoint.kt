// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
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
import kotlin.Unit

/**
 * A hinge between two 3D PhysicsBodies.
 *
 * A HingeJoint normally uses the Z axis of body A as the hinge axis, another axis can be specified when adding it manually though. See also [godot.Generic6DOFJoint].
 */
@GodotBaseType
public open class HingeJoint : Joint() {
  public open var angularLimit_bias: Double
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HINGEJOINT_GET_ANGULAR_LIMIT_BIAS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HINGEJOINT_SET_ANGULAR_LIMIT_BIAS,
          NIL)
    }

  public open var angularLimit_enable: Boolean
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HINGEJOINT_GET_ANGULAR_LIMIT_ENABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HINGEJOINT_SET_ANGULAR_LIMIT_ENABLE, NIL)
    }

  public open var angularLimit_relaxation: Double
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HINGEJOINT_GET_ANGULAR_LIMIT_RELAXATION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HINGEJOINT_SET_ANGULAR_LIMIT_RELAXATION, NIL)
    }

  public open var angularLimit_softness: Double
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HINGEJOINT_GET_ANGULAR_LIMIT_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HINGEJOINT_SET_ANGULAR_LIMIT_SOFTNESS, NIL)
    }

  public open var motor_enable: Boolean
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HINGEJOINT_GET_MOTOR_ENABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HINGEJOINT_SET_MOTOR_ENABLE, NIL)
    }

  public open var motor_maxImpulse: Double
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HINGEJOINT_GET_MOTOR_MAX_IMPULSE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HINGEJOINT_SET_MOTOR_MAX_IMPULSE,
          NIL)
    }

  public open var motor_targetVelocity: Double
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HINGEJOINT_GET_MOTOR_TARGET_VELOCITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HINGEJOINT_SET_MOTOR_TARGET_VELOCITY, NIL)
    }

  public open var params_bias: Double
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HINGEJOINT_GET_PARAMS_BIAS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HINGEJOINT_SET_PARAMS_BIAS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_HINGEJOINT)
  }

  public open fun _getLowerLimit(): Double {
    throw NotImplementedError("_get_lower_limit is not implemented for HingeJoint")
  }

  public open fun _getUpperLimit(): Double {
    throw NotImplementedError("_get_upper_limit is not implemented for HingeJoint")
  }

  public open fun _setLowerLimit(lowerLimit: Double): Unit {
  }

  public open fun _setUpperLimit(upperLimit: Double): Unit {
  }

  public enum class Param(
    id: Long
  ) {
    /**
     * The speed with which the two bodies get pulled together when they move in different directions.
     */
    PARAM_BIAS(0),
    /**
     * The maximum rotation. Only active if [angularLimit/enable] is `true`.
     */
    PARAM_LIMIT_UPPER(1),
    /**
     * The minimum rotation. Only active if [angularLimit/enable] is `true`.
     */
    PARAM_LIMIT_LOWER(2),
    /**
     * The speed with which the rotation across the axis perpendicular to the hinge gets corrected.
     */
    PARAM_LIMIT_BIAS(3),
    /**
     *
     */
    PARAM_LIMIT_SOFTNESS(4),
    /**
     * The lower this value, the more the rotation gets slowed down.
     */
    PARAM_LIMIT_RELAXATION(5),
    /**
     * Target speed for the motor.
     */
    PARAM_MOTOR_TARGET_VELOCITY(6),
    /**
     * Maximum acceleration for the motor.
     */
    PARAM_MOTOR_MAX_IMPULSE(7),
    /**
     * Represents the size of the [enum Param] enum.
     */
    PARAM_MAX(8),
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
     * If `true`, the hinges maximum and minimum rotation, defined by [angularLimit/lower] and [angularLimit/upper] has effects.
     */
    FLAG_USE_LIMIT(0),
    /**
     * When activated, a motor turns the hinge.
     */
    FLAG_ENABLE_MOTOR(1),
    /**
     * Represents the size of the [enum Flag] enum.
     */
    FLAG_MAX(2),
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
     * When activated, a motor turns the hinge.
     */
    public final const val FLAG_ENABLE_MOTOR: Long = 1

    /**
     * Represents the size of the [enum Flag] enum.
     */
    public final const val FLAG_MAX: Long = 2

    /**
     * If `true`, the hinges maximum and minimum rotation, defined by [angularLimit/lower] and [angularLimit/upper] has effects.
     */
    public final const val FLAG_USE_LIMIT: Long = 0

    /**
     * The speed with which the two bodies get pulled together when they move in different directions.
     */
    public final const val PARAM_BIAS: Long = 0

    /**
     * The speed with which the rotation across the axis perpendicular to the hinge gets corrected.
     */
    public final const val PARAM_LIMIT_BIAS: Long = 3

    /**
     * The minimum rotation. Only active if [angularLimit/enable] is `true`.
     */
    public final const val PARAM_LIMIT_LOWER: Long = 2

    /**
     * The lower this value, the more the rotation gets slowed down.
     */
    public final const val PARAM_LIMIT_RELAXATION: Long = 5

    /**
     *
     */
    public final const val PARAM_LIMIT_SOFTNESS: Long = 4

    /**
     * The maximum rotation. Only active if [angularLimit/enable] is `true`.
     */
    public final const val PARAM_LIMIT_UPPER: Long = 1

    /**
     * Represents the size of the [enum Param] enum.
     */
    public final const val PARAM_MAX: Long = 8

    /**
     * Maximum acceleration for the motor.
     */
    public final const val PARAM_MOTOR_MAX_IMPULSE: Long = 7

    /**
     * Target speed for the motor.
     */
    public final const val PARAM_MOTOR_TARGET_VELOCITY: Long = 6
  }
}
