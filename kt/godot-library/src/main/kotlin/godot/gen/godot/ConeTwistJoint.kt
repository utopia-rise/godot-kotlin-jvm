// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * A twist joint between two 3D PhysicsBodies.
 *
 * The joint can rotate the bodies across an axis defined by the local x-axes of the [godot.Joint].
 *
 * The twist axis is initiated as the X axis of the [godot.Joint].
 *
 * Once the Bodies swing, the twist axis is calculated as the middle of the x-axes of the Joint in the local space of the two Bodies. See also [godot.Generic6DOFJoint].
 */
@GodotBaseType
public open class ConeTwistJoint : Joint() {
  /**
   * The speed with which the swing or twist will take place.
   *
   * The higher, the faster.
   */
  public open var bias: Double
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONETWISTJOINT_GET_BIAS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONETWISTJOINT_SET_BIAS, NIL)
    }

  /**
   * Defines, how fast the swing- and twist-speed-difference on both sides gets synced.
   */
  public open var relaxation: Double
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONETWISTJOINT_GET_RELAXATION,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONETWISTJOINT_SET_RELAXATION,
          NIL)
    }

  /**
   * The ease with which the joint starts to twist. If it's too low, it takes more force to start twisting the joint.
   */
  public open var softness: Double
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONETWISTJOINT_GET_SOFTNESS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONETWISTJOINT_SET_SOFTNESS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CONETWISTJOINT)
  }

  public open fun _getSwingSpan(): Double {
    throw NotImplementedError("_get_swing_span is not implemented for ConeTwistJoint")
  }

  public open fun _getTwistSpan(): Double {
    throw NotImplementedError("_get_twist_span is not implemented for ConeTwistJoint")
  }

  public open fun _setSwingSpan(swingSpan: Double): Unit {
  }

  public open fun _setTwistSpan(twistSpan: Double): Unit {
  }

  public enum class Param(
    id: Long
  ) {
    /**
     * Swing is rotation from side to side, around the axis perpendicular to the twist axis.
     *
     * The swing span defines, how much rotation will not get corrected along the swing axis.
     *
     * Could be defined as looseness in the [godot.ConeTwistJoint].
     *
     * If below 0.05, this behavior is locked.
     */
    PARAM_SWING_SPAN(0),
    /**
     * Twist is the rotation around the twist axis, this value defined how far the joint can twist.
     *
     * Twist is locked if below 0.05.
     */
    PARAM_TWIST_SPAN(1),
    /**
     * The speed with which the swing or twist will take place.
     *
     * The higher, the faster.
     */
    PARAM_BIAS(2),
    /**
     * The ease with which the joint starts to twist. If it's too low, it takes more force to start twisting the joint.
     */
    PARAM_SOFTNESS(3),
    /**
     * Defines, how fast the swing- and twist-speed-difference on both sides gets synced.
     */
    PARAM_RELAXATION(4),
    /**
     * Represents the size of the [enum Param] enum.
     */
    PARAM_MAX(5),
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
     * The speed with which the swing or twist will take place.
     *
     * The higher, the faster.
     */
    public final const val PARAM_BIAS: Long = 2

    /**
     * Represents the size of the [enum Param] enum.
     */
    public final const val PARAM_MAX: Long = 5

    /**
     * Defines, how fast the swing- and twist-speed-difference on both sides gets synced.
     */
    public final const val PARAM_RELAXATION: Long = 4

    /**
     * The ease with which the joint starts to twist. If it's too low, it takes more force to start twisting the joint.
     */
    public final const val PARAM_SOFTNESS: Long = 3

    /**
     * Swing is rotation from side to side, around the axis perpendicular to the twist axis.
     *
     * The swing span defines, how much rotation will not get corrected along the swing axis.
     *
     * Could be defined as looseness in the [godot.ConeTwistJoint].
     *
     * If below 0.05, this behavior is locked.
     */
    public final const val PARAM_SWING_SPAN: Long = 0

    /**
     * Twist is the rotation around the twist axis, this value defined how far the joint can twist.
     *
     * Twist is locked if below 0.05.
     */
    public final const val PARAM_TWIST_SPAN: Long = 1
  }
}
