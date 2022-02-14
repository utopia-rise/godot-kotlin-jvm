// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Slider between two PhysicsBodies in 3D.
 *
 * Slides across the X axis of the pivot object. See also [godot.Generic6DOFJoint3D].
 */
@GodotBaseType
public open class SliderJoint3D : Joint3D() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SLIDERJOINT3D)
  }

  /**
   *
   */
  public open fun setParam(`param`: SliderJoint3D.Param, `value`: Double): Unit {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SLIDERJOINT3D_SET_PARAM, NIL)
  }

  /**
   *
   */
  public open fun getParam(`param`: SliderJoint3D.Param): Double {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SLIDERJOINT3D_GET_PARAM, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
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

  public companion object
}
