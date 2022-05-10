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
 * Slider between two PhysicsBodies in 3D.
 *
 * Slides across the X axis of the pivot object. See also [godot.Generic6DOFJoint].
 */
@GodotBaseType
public open class SliderJoint : Joint() {
  public open var angularLimit_damping: Double
    get() {
      TransferContext.writeArguments(LONG to 15L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_ANGULAR_LIMIT_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 15L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_ANGULAR_LIMIT_DAMPING, NIL)
    }

  public open var angularLimit_restitution: Double
    get() {
      TransferContext.writeArguments(LONG to 14L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_ANGULAR_LIMIT_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 14L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_ANGULAR_LIMIT_RESTITUTION, NIL)
    }

  public open var angularLimit_softness: Double
    get() {
      TransferContext.writeArguments(LONG to 13L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_ANGULAR_LIMIT_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 13L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_ANGULAR_LIMIT_SOFTNESS, NIL)
    }

  public open var angularMotion_damping: Double
    get() {
      TransferContext.writeArguments(LONG to 18L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_ANGULAR_MOTION_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 18L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_ANGULAR_MOTION_DAMPING, NIL)
    }

  public open var angularMotion_restitution: Double
    get() {
      TransferContext.writeArguments(LONG to 17L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_ANGULAR_MOTION_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 17L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_ANGULAR_MOTION_RESTITUTION, NIL)
    }

  public open var angularMotion_softness: Double
    get() {
      TransferContext.writeArguments(LONG to 16L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_ANGULAR_MOTION_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 16L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_ANGULAR_MOTION_SOFTNESS, NIL)
    }

  public open var angularOrtho_damping: Double
    get() {
      TransferContext.writeArguments(LONG to 21L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_ANGULAR_ORTHO_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 21L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_ANGULAR_ORTHO_DAMPING, NIL)
    }

  public open var angularOrtho_restitution: Double
    get() {
      TransferContext.writeArguments(LONG to 20L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_ANGULAR_ORTHO_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 20L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_ANGULAR_ORTHO_RESTITUTION, NIL)
    }

  public open var angularOrtho_softness: Double
    get() {
      TransferContext.writeArguments(LONG to 19L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_ANGULAR_ORTHO_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 19L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_ANGULAR_ORTHO_SOFTNESS, NIL)
    }

  public open var linearLimit_damping: Double
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_LINEAR_LIMIT_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_LINEAR_LIMIT_DAMPING, NIL)
    }

  public open var linearLimit_lowerDistance: Double
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_LINEAR_LIMIT_LOWER_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_LINEAR_LIMIT_LOWER_DISTANCE, NIL)
    }

  public open var linearLimit_restitution: Double
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_LINEAR_LIMIT_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_LINEAR_LIMIT_RESTITUTION, NIL)
    }

  public open var linearLimit_softness: Double
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_LINEAR_LIMIT_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_LINEAR_LIMIT_SOFTNESS, NIL)
    }

  public open var linearLimit_upperDistance: Double
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_LINEAR_LIMIT_UPPER_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_LINEAR_LIMIT_UPPER_DISTANCE, NIL)
    }

  public open var linearMotion_damping: Double
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_LINEAR_MOTION_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_LINEAR_MOTION_DAMPING, NIL)
    }

  public open var linearMotion_restitution: Double
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_LINEAR_MOTION_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_LINEAR_MOTION_RESTITUTION, NIL)
    }

  public open var linearMotion_softness: Double
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_LINEAR_MOTION_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_LINEAR_MOTION_SOFTNESS, NIL)
    }

  public open var linearOrtho_damping: Double
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_LINEAR_ORTHO_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 10L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_LINEAR_ORTHO_DAMPING, NIL)
    }

  public open var linearOrtho_restitution: Double
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_LINEAR_ORTHO_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 9L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_LINEAR_ORTHO_RESTITUTION, NIL)
    }

  public open var linearOrtho_softness: Double
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_LINEAR_ORTHO_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_LINEAR_ORTHO_SOFTNESS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SLIDERJOINT)
  }

  public open fun _getLowerLimitAngular(): Double {
    throw NotImplementedError("_get_lower_limit_angular is not implemented for SliderJoint")
  }

  public open fun _getUpperLimitAngular(): Double {
    throw NotImplementedError("_get_upper_limit_angular is not implemented for SliderJoint")
  }

  public open fun _setLowerLimitAngular(lowerLimitAngular: Double): Unit {
  }

  public open fun _setUpperLimitAngular(upperLimitAngular: Double): Unit {
  }

  public enum class Param(
    id: Long
  ) {
    /**
     * The maximum difference between the pivot points on their X axis before damping happens.
     */
    PARAM_LINEAR_LIMIT_UPPER(0),
    /**
     * The minimum difference between the pivot points on their X axis before damping happens.
     */
    PARAM_LINEAR_LIMIT_LOWER(1),
    /**
     * A factor applied to the movement across the slider axis once the limits get surpassed. The lower, the slower the movement.
     */
    PARAM_LINEAR_LIMIT_SOFTNESS(2),
    /**
     * The amount of restitution once the limits are surpassed. The lower, the more velocityenergy gets lost.
     */
    PARAM_LINEAR_LIMIT_RESTITUTION(3),
    /**
     * The amount of damping once the slider limits are surpassed.
     */
    PARAM_LINEAR_LIMIT_DAMPING(4),
    /**
     * A factor applied to the movement across the slider axis as long as the slider is in the limits. The lower, the slower the movement.
     */
    PARAM_LINEAR_MOTION_SOFTNESS(5),
    /**
     * The amount of restitution inside the slider limits.
     */
    PARAM_LINEAR_MOTION_RESTITUTION(6),
    /**
     * The amount of damping inside the slider limits.
     */
    PARAM_LINEAR_MOTION_DAMPING(7),
    /**
     * A factor applied to the movement across axes orthogonal to the slider.
     */
    PARAM_LINEAR_ORTHOGONAL_SOFTNESS(8),
    /**
     * The amount of restitution when movement is across axes orthogonal to the slider.
     */
    PARAM_LINEAR_ORTHOGONAL_RESTITUTION(9),
    /**
     * The amount of damping when movement is across axes orthogonal to the slider.
     */
    PARAM_LINEAR_ORTHOGONAL_DAMPING(10),
    /**
     * The upper limit of rotation in the slider.
     */
    PARAM_ANGULAR_LIMIT_UPPER(11),
    /**
     * The lower limit of rotation in the slider.
     */
    PARAM_ANGULAR_LIMIT_LOWER(12),
    /**
     * A factor applied to the all rotation once the limit is surpassed.
     */
    PARAM_ANGULAR_LIMIT_SOFTNESS(13),
    /**
     * The amount of restitution of the rotation when the limit is surpassed.
     */
    PARAM_ANGULAR_LIMIT_RESTITUTION(14),
    /**
     * The amount of damping of the rotation when the limit is surpassed.
     */
    PARAM_ANGULAR_LIMIT_DAMPING(15),
    /**
     * A factor applied to the all rotation in the limits.
     */
    PARAM_ANGULAR_MOTION_SOFTNESS(16),
    /**
     * The amount of restitution of the rotation in the limits.
     */
    PARAM_ANGULAR_MOTION_RESTITUTION(17),
    /**
     * The amount of damping of the rotation in the limits.
     */
    PARAM_ANGULAR_MOTION_DAMPING(18),
    /**
     * A factor applied to the all rotation across axes orthogonal to the slider.
     */
    PARAM_ANGULAR_ORTHOGONAL_SOFTNESS(19),
    /**
     * The amount of restitution of the rotation across axes orthogonal to the slider.
     */
    PARAM_ANGULAR_ORTHOGONAL_RESTITUTION(20),
    /**
     * The amount of damping of the rotation across axes orthogonal to the slider.
     */
    PARAM_ANGULAR_ORTHOGONAL_DAMPING(21),
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

  public companion object {
    /**
     * The amount of damping of the rotation when the limit is surpassed.
     */
    public final const val PARAM_ANGULAR_LIMIT_DAMPING: Long = 15

    /**
     * The lower limit of rotation in the slider.
     */
    public final const val PARAM_ANGULAR_LIMIT_LOWER: Long = 12

    /**
     * The amount of restitution of the rotation when the limit is surpassed.
     */
    public final const val PARAM_ANGULAR_LIMIT_RESTITUTION: Long = 14

    /**
     * A factor applied to the all rotation once the limit is surpassed.
     */
    public final const val PARAM_ANGULAR_LIMIT_SOFTNESS: Long = 13

    /**
     * The upper limit of rotation in the slider.
     */
    public final const val PARAM_ANGULAR_LIMIT_UPPER: Long = 11

    /**
     * The amount of damping of the rotation in the limits.
     */
    public final const val PARAM_ANGULAR_MOTION_DAMPING: Long = 18

    /**
     * The amount of restitution of the rotation in the limits.
     */
    public final const val PARAM_ANGULAR_MOTION_RESTITUTION: Long = 17

    /**
     * A factor applied to the all rotation in the limits.
     */
    public final const val PARAM_ANGULAR_MOTION_SOFTNESS: Long = 16

    /**
     * The amount of damping of the rotation across axes orthogonal to the slider.
     */
    public final const val PARAM_ANGULAR_ORTHOGONAL_DAMPING: Long = 21

    /**
     * The amount of restitution of the rotation across axes orthogonal to the slider.
     */
    public final const val PARAM_ANGULAR_ORTHOGONAL_RESTITUTION: Long = 20

    /**
     * A factor applied to the all rotation across axes orthogonal to the slider.
     */
    public final const val PARAM_ANGULAR_ORTHOGONAL_SOFTNESS: Long = 19

    /**
     * The amount of damping once the slider limits are surpassed.
     */
    public final const val PARAM_LINEAR_LIMIT_DAMPING: Long = 4

    /**
     * The minimum difference between the pivot points on their X axis before damping happens.
     */
    public final const val PARAM_LINEAR_LIMIT_LOWER: Long = 1

    /**
     * The amount of restitution once the limits are surpassed. The lower, the more velocityenergy gets lost.
     */
    public final const val PARAM_LINEAR_LIMIT_RESTITUTION: Long = 3

    /**
     * A factor applied to the movement across the slider axis once the limits get surpassed. The lower, the slower the movement.
     */
    public final const val PARAM_LINEAR_LIMIT_SOFTNESS: Long = 2

    /**
     * The maximum difference between the pivot points on their X axis before damping happens.
     */
    public final const val PARAM_LINEAR_LIMIT_UPPER: Long = 0

    /**
     * The amount of damping inside the slider limits.
     */
    public final const val PARAM_LINEAR_MOTION_DAMPING: Long = 7

    /**
     * The amount of restitution inside the slider limits.
     */
    public final const val PARAM_LINEAR_MOTION_RESTITUTION: Long = 6

    /**
     * A factor applied to the movement across the slider axis as long as the slider is in the limits. The lower, the slower the movement.
     */
    public final const val PARAM_LINEAR_MOTION_SOFTNESS: Long = 5

    /**
     * The amount of damping when movement is across axes orthogonal to the slider.
     */
    public final const val PARAM_LINEAR_ORTHOGONAL_DAMPING: Long = 10

    /**
     * The amount of restitution when movement is across axes orthogonal to the slider.
     */
    public final const val PARAM_LINEAR_ORTHOGONAL_RESTITUTION: Long = 9

    /**
     * A factor applied to the movement across axes orthogonal to the slider.
     */
    public final const val PARAM_LINEAR_ORTHOGONAL_SOFTNESS: Long = 8

    /**
     * Represents the size of the [enum Param] enum.
     */
    public final const val PARAM_MAX: Long = 22
  }
}
