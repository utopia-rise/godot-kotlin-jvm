// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.internal.reflection.TypeManager
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.internal.memory.TransferContext
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A physics joint that connects two 3D physics bodies in a way that simulates a ball-and-socket
 * joint. The twist axis is initiated as the X axis of the [ConeTwistJoint3D]. Once the physics bodies
 * swing, the twist axis is calculated as the middle of the X axes of the joint in the local space of
 * the two physics bodies. Useful for limbs like shoulders and hips, lamps hanging off a ceiling, etc.
 */
@GodotBaseType
public open class ConeTwistJoint3D : Joint3D() {
  /**
   * Swing is rotation from side to side, around the axis perpendicular to the twist axis.
   * The swing span defines, how much rotation will not get corrected along the swing axis.
   * Could be defined as looseness in the [ConeTwistJoint3D].
   * If below 0.05, this behavior is locked.
   */
  public final inline var swingSpan: Float
    @JvmName("swingSpanProperty")
    get() = getParam(ConeTwistJoint3D.Param.PARAM_SWING_SPAN)
    @JvmName("swingSpanProperty")
    set(`value`) {
      setParam(ConeTwistJoint3D.Param.PARAM_SWING_SPAN, value)
    }

  /**
   * Twist is the rotation around the twist axis, this value defined how far the joint can twist.
   * Twist is locked if below 0.05.
   */
  public final inline var twistSpan: Float
    @JvmName("twistSpanProperty")
    get() = getParam(ConeTwistJoint3D.Param.PARAM_TWIST_SPAN)
    @JvmName("twistSpanProperty")
    set(`value`) {
      setParam(ConeTwistJoint3D.Param.PARAM_TWIST_SPAN, value)
    }

  /**
   * The speed with which the swing or twist will take place.
   * The higher, the faster.
   */
  public final inline var bias: Float
    @JvmName("biasProperty")
    get() = getParam(ConeTwistJoint3D.Param.PARAM_BIAS)
    @JvmName("biasProperty")
    set(`value`) {
      setParam(ConeTwistJoint3D.Param.PARAM_BIAS, value)
    }

  /**
   * The ease with which the joint starts to twist. If it's too low, it takes more force to start
   * twisting the joint.
   */
  public final inline var softness: Float
    @JvmName("softnessProperty")
    get() = getParam(ConeTwistJoint3D.Param.PARAM_SOFTNESS)
    @JvmName("softnessProperty")
    set(`value`) {
      setParam(ConeTwistJoint3D.Param.PARAM_SOFTNESS, value)
    }

  /**
   * Defines, how fast the swing- and twist-speed-difference on both sides gets synced.
   */
  public final inline var relaxation: Float
    @JvmName("relaxationProperty")
    get() = getParam(ConeTwistJoint3D.Param.PARAM_RELAXATION)
    @JvmName("relaxationProperty")
    set(`value`) {
      setParam(ConeTwistJoint3D.Param.PARAM_RELAXATION, value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_CONETWISTJOINT3D, scriptIndex)
  }

  /**
   * Sets the value of the specified parameter.
   */
  public final fun setParam(`param`: Param, `value`: Float): Unit {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setParamPtr, NIL)
  }

  /**
   * Returns the value of the specified parameter.
   */
  public final fun getParam(`param`: Param): Float {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(ptr, MethodBindings.getParamPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public enum class Param(
    id: Long,
  ) {
    /**
     * Swing is rotation from side to side, around the axis perpendicular to the twist axis.
     * The swing span defines, how much rotation will not get corrected along the swing axis.
     * Could be defined as looseness in the [ConeTwistJoint3D].
     * If below 0.05, this behavior is locked.
     */
    PARAM_SWING_SPAN(0),
    /**
     * Twist is the rotation around the twist axis, this value defined how far the joint can twist.
     * Twist is locked if below 0.05.
     */
    PARAM_TWIST_SPAN(1),
    /**
     * The speed with which the swing or twist will take place.
     * The higher, the faster.
     */
    PARAM_BIAS(2),
    /**
     * The ease with which the joint starts to twist. If it's too low, it takes more force to start
     * twisting the joint.
     */
    PARAM_SOFTNESS(3),
    /**
     * Defines, how fast the swing- and twist-speed-difference on both sides gets synced.
     */
    PARAM_RELAXATION(4),
    /**
     * Represents the size of the [Param] enum.
     */
    PARAM_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Param = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConeTwistJoint3D", "set_param", 1062470226)

    public val getParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConeTwistJoint3D", "get_param", 2928790850)
  }
}
