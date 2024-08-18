// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A physics joint that restricts the movement of a 3D physics body along an axis relative to
 * another physics body. For example, Body A could be a [StaticBody3D] representing a piston base,
 * while Body B could be a [RigidBody3D] representing the piston head, moving up and down.
 */
@GodotBaseType
public open class SliderJoint3D : Joint3D() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SLIDERJOINT3D, scriptIndex)
  }

  /**
   * Assigns [value] to the given parameter (see [Param] constants).
   */
  public fun setParam(`param`: Param, `value`: Float): Unit {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
  }

  /**
   * Returns the value of the given parameter (see [Param] constants).
   */
  public fun getParam(`param`: Param): Float {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public enum class Param(
    id: Long,
  ) {
    /**
     * Constant for accessing [linearLimit/upperDistance]. The maximum difference between the pivot
     * points on their X axis before damping happens.
     */
    PARAM_LINEAR_LIMIT_UPPER(0),
    /**
     * Constant for accessing [linearLimit/lowerDistance]. The minimum difference between the pivot
     * points on their X axis before damping happens.
     */
    PARAM_LINEAR_LIMIT_LOWER(1),
    /**
     * Constant for accessing [linearLimit/softness]. A factor applied to the movement across the
     * slider axis once the limits get surpassed. The lower, the slower the movement.
     */
    PARAM_LINEAR_LIMIT_SOFTNESS(2),
    /**
     * Constant for accessing [linearLimit/restitution]. The amount of restitution once the limits
     * are surpassed. The lower, the more velocity-energy gets lost.
     */
    PARAM_LINEAR_LIMIT_RESTITUTION(3),
    /**
     * Constant for accessing [linearLimit/damping]. The amount of damping once the slider limits
     * are surpassed.
     */
    PARAM_LINEAR_LIMIT_DAMPING(4),
    /**
     * Constant for accessing [linearMotion/softness]. A factor applied to the movement across the
     * slider axis as long as the slider is in the limits. The lower, the slower the movement.
     */
    PARAM_LINEAR_MOTION_SOFTNESS(5),
    /**
     * Constant for accessing [linearMotion/restitution]. The amount of restitution inside the
     * slider limits.
     */
    PARAM_LINEAR_MOTION_RESTITUTION(6),
    /**
     * Constant for accessing [linearMotion/damping]. The amount of damping inside the slider
     * limits.
     */
    PARAM_LINEAR_MOTION_DAMPING(7),
    /**
     * Constant for accessing [linearOrtho/softness]. A factor applied to the movement across axes
     * orthogonal to the slider.
     */
    PARAM_LINEAR_ORTHOGONAL_SOFTNESS(8),
    /**
     * Constant for accessing [linearMotion/restitution]. The amount of restitution when movement is
     * across axes orthogonal to the slider.
     */
    PARAM_LINEAR_ORTHOGONAL_RESTITUTION(9),
    /**
     * Constant for accessing [linearMotion/damping]. The amount of damping when movement is across
     * axes orthogonal to the slider.
     */
    PARAM_LINEAR_ORTHOGONAL_DAMPING(10),
    /**
     * Constant for accessing [angularLimit/upperAngle]. The upper limit of rotation in the slider.
     */
    PARAM_ANGULAR_LIMIT_UPPER(11),
    /**
     * Constant for accessing [angularLimit/lowerAngle]. The lower limit of rotation in the slider.
     */
    PARAM_ANGULAR_LIMIT_LOWER(12),
    /**
     * Constant for accessing [angularLimit/softness]. A factor applied to the all rotation once the
     * limit is surpassed.
     */
    PARAM_ANGULAR_LIMIT_SOFTNESS(13),
    /**
     * Constant for accessing [angularLimit/restitution]. The amount of restitution of the rotation
     * when the limit is surpassed.
     */
    PARAM_ANGULAR_LIMIT_RESTITUTION(14),
    /**
     * Constant for accessing [angularLimit/damping]. The amount of damping of the rotation when the
     * limit is surpassed.
     */
    PARAM_ANGULAR_LIMIT_DAMPING(15),
    /**
     * Constant for accessing [angularMotion/softness]. A factor applied to the all rotation in the
     * limits.
     */
    PARAM_ANGULAR_MOTION_SOFTNESS(16),
    /**
     * Constant for accessing [angularMotion/restitution]. The amount of restitution of the rotation
     * in the limits.
     */
    PARAM_ANGULAR_MOTION_RESTITUTION(17),
    /**
     * Constant for accessing [angularMotion/damping]. The amount of damping of the rotation in the
     * limits.
     */
    PARAM_ANGULAR_MOTION_DAMPING(18),
    /**
     * Constant for accessing [angularOrtho/softness]. A factor applied to the all rotation across
     * axes orthogonal to the slider.
     */
    PARAM_ANGULAR_ORTHOGONAL_SOFTNESS(19),
    /**
     * Constant for accessing [angularOrtho/restitution]. The amount of restitution of the rotation
     * across axes orthogonal to the slider.
     */
    PARAM_ANGULAR_ORTHOGONAL_RESTITUTION(20),
    /**
     * Constant for accessing [angularOrtho/damping]. The amount of damping of the rotation across
     * axes orthogonal to the slider.
     */
    PARAM_ANGULAR_ORTHOGONAL_DAMPING(21),
    /**
     * Represents the size of the [Param] enum.
     */
    PARAM_MAX(22),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setParamPtr: VoidPtr = TypeManager.getMethodBindPtr("SliderJoint3D", "set_param")

    public val getParamPtr: VoidPtr = TypeManager.getMethodBindPtr("SliderJoint3D", "get_param")
  }
}
