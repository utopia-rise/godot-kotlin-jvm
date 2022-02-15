// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

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
import kotlin.Suppress
import kotlin.Unit

/**
 * A hinge between two 3D PhysicsBodies.
 *
 * A HingeJoint3D normally uses the Z axis of body A as the hinge axis, another axis can be specified when adding it manually though. See also [godot.Generic6DOFJoint3D].
 */
@GodotBaseType
public open class HingeJoint3D : Joint3D() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_HINGEJOINT3D)
  }

  /**
   * Sets the value of the specified parameter.
   */
  public open fun setParam(`param`: HingeJoint3D.Param, `value`: Double): Unit {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HINGEJOINT3D_SET_PARAM, NIL)
  }

  /**
   * Returns the value of the specified parameter.
   */
  public open fun getParam(`param`: HingeJoint3D.Param): Double {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HINGEJOINT3D_GET_PARAM, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * If `true`, enables the specified flag.
   */
  public open fun setFlag(flag: HingeJoint3D.Flag, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to flag.id, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HINGEJOINT3D_SET_FLAG, NIL)
  }

  /**
   * Returns the value of the specified flag.
   */
  public open fun getFlag(flag: HingeJoint3D.Flag): Boolean {
    TransferContext.writeArguments(LONG to flag.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HINGEJOINT3D_GET_FLAG, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
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

  public companion object
}
