// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * The [Generic6DOFJoint3D] (6 Degrees Of Freedom) joint allows for implementing custom types of
 * joints by locking the rotation and translation of certain axes.
 * The first 3 DOF represent the linear motion of the physics bodies and the last 3 DOF represent
 * the angular motion of the physics bodies. Each axis can be either locked, or limited.
 */
@GodotBaseType
public open class Generic6DOFJoint3D : Joint3D() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_GENERIC6DOFJOINT3D, scriptIndex)
  }

  public final fun setParamX(`param`: Param, `value`: Float): Unit {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setParamXPtr, NIL)
  }

  public final fun getParamX(`param`: Param): Float {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getParamXPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public final fun setParamY(`param`: Param, `value`: Float): Unit {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setParamYPtr, NIL)
  }

  public final fun getParamY(`param`: Param): Float {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getParamYPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public final fun setParamZ(`param`: Param, `value`: Float): Unit {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setParamZPtr, NIL)
  }

  public final fun getParamZ(`param`: Param): Float {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getParamZPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public final fun setFlagX(flag: Flag, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to flag.id, BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setFlagXPtr, NIL)
  }

  public final fun getFlagX(flag: Flag): Boolean {
    TransferContext.writeArguments(LONG to flag.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getFlagXPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public final fun setFlagY(flag: Flag, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to flag.id, BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setFlagYPtr, NIL)
  }

  public final fun getFlagY(flag: Flag): Boolean {
    TransferContext.writeArguments(LONG to flag.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getFlagYPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public final fun setFlagZ(flag: Flag, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to flag.id, BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setFlagZPtr, NIL)
  }

  public final fun getFlagZ(flag: Flag): Boolean {
    TransferContext.writeArguments(LONG to flag.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getFlagZPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class Param(
    id: Long,
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
    PARAM_LINEAR_SPRING_STIFFNESS(7),
    PARAM_LINEAR_SPRING_DAMPING(8),
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
     * The amount of rotational damping across the axes. The lower, the more damping occurs.
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
     * When rotating across the axes, this error tolerance factor defines how much the correction
     * gets slowed down. The lower, the slower.
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
    PARAM_ANGULAR_SPRING_STIFFNESS(19),
    PARAM_ANGULAR_SPRING_DAMPING(20),
    PARAM_ANGULAR_SPRING_EQUILIBRIUM_POINT(21),
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
      public fun from(`value`: Long): Param = entries.single { it.id == `value` }
    }
  }

  public enum class Flag(
    id: Long,
  ) {
    /**
     * If enabled, linear motion is possible within the given limits.
     */
    FLAG_ENABLE_LINEAR_LIMIT(0),
    /**
     * If enabled, rotational motion is possible within the given limits.
     */
    FLAG_ENABLE_ANGULAR_LIMIT(1),
    FLAG_ENABLE_LINEAR_SPRING(3),
    FLAG_ENABLE_ANGULAR_SPRING(2),
    /**
     * If enabled, there is a rotational motor across these axes.
     */
    FLAG_ENABLE_MOTOR(4),
    /**
     * If enabled, there is a linear motor across these axes.
     */
    FLAG_ENABLE_LINEAR_MOTOR(5),
    /**
     * Represents the size of the [Flag] enum.
     */
    FLAG_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Flag = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setParamXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "set_param_x", 2018184242)

    public val getParamXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "get_param_x", 2599835054)

    public val setParamYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "set_param_y", 2018184242)

    public val getParamYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "get_param_y", 2599835054)

    public val setParamZPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "set_param_z", 2018184242)

    public val getParamZPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "get_param_z", 2599835054)

    public val setFlagXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "set_flag_x", 2451594564)

    public val getFlagXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "get_flag_x", 2122427807)

    public val setFlagYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "set_flag_y", 2451594564)

    public val getFlagYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "get_flag_y", 2122427807)

    public val setFlagZPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "set_flag_z", 2451594564)

    public val getFlagZPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Generic6DOFJoint3D", "get_flag_z", 2122427807)
  }
}
