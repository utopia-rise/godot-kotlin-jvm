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
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A physics joint that attaches two 2D physics bodies at a single point, allowing them to freely
 * rotate. For example, a [RigidBody2D] can be attached to a [StaticBody2D] to create a pendulum or a
 * seesaw.
 */
@GodotBaseType
public open class PinJoint2D : Joint2D() {
  /**
   * The higher this value, the more the bond to the pinned partner can flex.
   */
  public var softness: Float
    @JvmName("softnessProperty")
    get() = getSoftness()
    @JvmName("softnessProperty")
    set(`value`) {
      setSoftness(value)
    }

  /**
   * If `true`, the pin maximum and minimum rotation, defined by [angularLimitLower] and
   * [angularLimitUpper] are applied.
   */
  public var angularLimitEnabled: Boolean
    @JvmName("angularLimitEnabledProperty")
    get() = isAngularLimitEnabled()
    @JvmName("angularLimitEnabledProperty")
    set(`value`) {
      setAngularLimitEnabled(value)
    }

  /**
   * The minimum rotation. Only active if [angularLimitEnabled] is `true`.
   */
  public var angularLimitLower: Float
    @JvmName("angularLimitLowerProperty")
    get() = getAngularLimitLower()
    @JvmName("angularLimitLowerProperty")
    set(`value`) {
      setAngularLimitLower(value)
    }

  /**
   * The maximum rotation. Only active if [angularLimitEnabled] is `true`.
   */
  public var angularLimitUpper: Float
    @JvmName("angularLimitUpperProperty")
    get() = getAngularLimitUpper()
    @JvmName("angularLimitUpperProperty")
    set(`value`) {
      setAngularLimitUpper(value)
    }

  /**
   * When activated, a motor turns the pin.
   */
  public var motorEnabled: Boolean
    @JvmName("motorEnabledProperty")
    get() = isMotorEnabled()
    @JvmName("motorEnabledProperty")
    set(`value`) {
      setMotorEnabled(value)
    }

  /**
   * Target speed for the motor. In radians per second.
   */
  public var motorTargetVelocity: Float
    @JvmName("motorTargetVelocityProperty")
    get() = getMotorTargetVelocity()
    @JvmName("motorTargetVelocityProperty")
    set(`value`) {
      setMotorTargetVelocity(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PINJOINT2D, scriptIndex)
  }

  public fun setSoftness(softness: Float): Unit {
    TransferContext.writeArguments(DOUBLE to softness.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setSoftnessPtr, NIL)
  }

  public fun getSoftness(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSoftnessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setAngularLimitLower(angularLimitLower: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angularLimitLower.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setAngularLimitLowerPtr, NIL)
  }

  public fun getAngularLimitLower(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAngularLimitLowerPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setAngularLimitUpper(angularLimitUpper: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angularLimitUpper.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setAngularLimitUpperPtr, NIL)
  }

  public fun getAngularLimitUpper(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAngularLimitUpperPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setMotorTargetVelocity(motorTargetVelocity: Float): Unit {
    TransferContext.writeArguments(DOUBLE to motorTargetVelocity.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setMotorTargetVelocityPtr, NIL)
  }

  public fun getMotorTargetVelocity(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMotorTargetVelocityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setMotorEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setMotorEnabledPtr, NIL)
  }

  public fun isMotorEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isMotorEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setAngularLimitEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setAngularLimitEnabledPtr, NIL)
  }

  public fun isAngularLimitEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isAngularLimitEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setSoftnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "set_softness", 373806689)

    public val getSoftnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "get_softness", 1740695150)

    public val setAngularLimitLowerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "set_angular_limit_lower", 373806689)

    public val getAngularLimitLowerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "get_angular_limit_lower", 1740695150)

    public val setAngularLimitUpperPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "set_angular_limit_upper", 373806689)

    public val getAngularLimitUpperPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "get_angular_limit_upper", 1740695150)

    public val setMotorTargetVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "set_motor_target_velocity", 373806689)

    public val getMotorTargetVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "get_motor_target_velocity", 1740695150)

    public val setMotorEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "set_motor_enabled", 2586408642)

    public val isMotorEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "is_motor_enabled", 36873697)

    public val setAngularLimitEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "set_angular_limit_enabled", 2586408642)

    public val isAngularLimitEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "is_angular_limit_enabled", 36873697)
  }
}
