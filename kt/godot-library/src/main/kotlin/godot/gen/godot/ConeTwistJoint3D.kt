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
  public var swingSpan: Float
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  /**
   * Twist is the rotation around the twist axis, this value defined how far the joint can twist.
   * Twist is locked if below 0.05.
   */
  public var twistSpan: Float
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  /**
   * The speed with which the swing or twist will take place.
   * The higher, the faster.
   */
  public var bias: Float
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  /**
   * The ease with which the joint starts to twist. If it's too low, it takes more force to start
   * twisting the joint.
   */
  public var softness: Float
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  /**
   * Defines, how fast the swing- and twist-speed-difference on both sides gets synced.
   */
  public var relaxation: Float
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_CONETWISTJOINT3D, scriptIndex)
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
    public val setParamPtr: VoidPtr = TypeManager.getMethodBindPtr("ConeTwistJoint3D", "set_param")

    public val getParamPtr: VoidPtr = TypeManager.getMethodBindPtr("ConeTwistJoint3D", "get_param")
  }
}
