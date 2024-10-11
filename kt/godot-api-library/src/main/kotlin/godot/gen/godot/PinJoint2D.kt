// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_PINJOINT2D_INDEX: Int = 482

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
  public final inline var softness: Float
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
  public final inline var angularLimitEnabled: Boolean
    @JvmName("angularLimitEnabledProperty")
    get() = isAngularLimitEnabled()
    @JvmName("angularLimitEnabledProperty")
    set(`value`) {
      setAngularLimitEnabled(value)
    }

  /**
   * The minimum rotation. Only active if [angularLimitEnabled] is `true`.
   */
  public final inline var angularLimitLower: Float
    @JvmName("angularLimitLowerProperty")
    get() = getAngularLimitLower()
    @JvmName("angularLimitLowerProperty")
    set(`value`) {
      setAngularLimitLower(value)
    }

  /**
   * The maximum rotation. Only active if [angularLimitEnabled] is `true`.
   */
  public final inline var angularLimitUpper: Float
    @JvmName("angularLimitUpperProperty")
    get() = getAngularLimitUpper()
    @JvmName("angularLimitUpperProperty")
    set(`value`) {
      setAngularLimitUpper(value)
    }

  /**
   * When activated, a motor turns the pin.
   */
  public final inline var motorEnabled: Boolean
    @JvmName("motorEnabledProperty")
    get() = isMotorEnabled()
    @JvmName("motorEnabledProperty")
    set(`value`) {
      setMotorEnabled(value)
    }

  /**
   * Target speed for the motor. In radians per second.
   */
  public final inline var motorTargetVelocity: Float
    @JvmName("motorTargetVelocityProperty")
    get() = getMotorTargetVelocity()
    @JvmName("motorTargetVelocityProperty")
    set(`value`) {
      setMotorTargetVelocity(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_PINJOINT2D_INDEX, scriptIndex)
  }

  public final fun setSoftness(softness: Float): Unit {
    Internals.writeArguments(DOUBLE to softness.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setSoftnessPtr, NIL)
  }

  public final fun getSoftness(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSoftnessPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAngularLimitLower(angularLimitLower: Float): Unit {
    Internals.writeArguments(DOUBLE to angularLimitLower.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setAngularLimitLowerPtr, NIL)
  }

  public final fun getAngularLimitLower(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAngularLimitLowerPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAngularLimitUpper(angularLimitUpper: Float): Unit {
    Internals.writeArguments(DOUBLE to angularLimitUpper.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setAngularLimitUpperPtr, NIL)
  }

  public final fun getAngularLimitUpper(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAngularLimitUpperPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMotorTargetVelocity(motorTargetVelocity: Float): Unit {
    Internals.writeArguments(DOUBLE to motorTargetVelocity.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setMotorTargetVelocityPtr, NIL)
  }

  public final fun getMotorTargetVelocity(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMotorTargetVelocityPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMotorEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setMotorEnabledPtr, NIL)
  }

  public final fun isMotorEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isMotorEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAngularLimitEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setAngularLimitEnabledPtr, NIL)
  }

  public final fun isAngularLimitEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isAngularLimitEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setSoftnessPtr: VoidPtr =
        Internals.getMethodBindPtr("PinJoint2D", "set_softness", 373806689)

    internal val getSoftnessPtr: VoidPtr =
        Internals.getMethodBindPtr("PinJoint2D", "get_softness", 1740695150)

    internal val setAngularLimitLowerPtr: VoidPtr =
        Internals.getMethodBindPtr("PinJoint2D", "set_angular_limit_lower", 373806689)

    internal val getAngularLimitLowerPtr: VoidPtr =
        Internals.getMethodBindPtr("PinJoint2D", "get_angular_limit_lower", 1740695150)

    internal val setAngularLimitUpperPtr: VoidPtr =
        Internals.getMethodBindPtr("PinJoint2D", "set_angular_limit_upper", 373806689)

    internal val getAngularLimitUpperPtr: VoidPtr =
        Internals.getMethodBindPtr("PinJoint2D", "get_angular_limit_upper", 1740695150)

    internal val setMotorTargetVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("PinJoint2D", "set_motor_target_velocity", 373806689)

    internal val getMotorTargetVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("PinJoint2D", "get_motor_target_velocity", 1740695150)

    internal val setMotorEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PinJoint2D", "set_motor_enabled", 2586408642)

    internal val isMotorEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PinJoint2D", "is_motor_enabled", 36873697)

    internal val setAngularLimitEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PinJoint2D", "set_angular_limit_enabled", 2586408642)

    internal val isAngularLimitEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PinJoint2D", "is_angular_limit_enabled", 36873697)
  }
}
