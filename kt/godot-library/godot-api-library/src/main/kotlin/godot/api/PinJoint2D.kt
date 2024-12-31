// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_PINJOINT2D: Int = 482

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
    createNativeObject(ENGINECLASS_PINJOINT2D, scriptIndex)
  }

  public final fun setSoftness(softness: Float): Unit {
    TransferContext.writeArguments(DOUBLE to softness.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSoftnessPtr, NIL)
  }

  public final fun getSoftness(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSoftnessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAngularLimitLower(angularLimitLower: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angularLimitLower.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAngularLimitLowerPtr, NIL)
  }

  public final fun getAngularLimitLower(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAngularLimitLowerPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAngularLimitUpper(angularLimitUpper: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angularLimitUpper.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAngularLimitUpperPtr, NIL)
  }

  public final fun getAngularLimitUpper(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAngularLimitUpperPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMotorTargetVelocity(motorTargetVelocity: Float): Unit {
    TransferContext.writeArguments(DOUBLE to motorTargetVelocity.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMotorTargetVelocityPtr, NIL)
  }

  public final fun getMotorTargetVelocity(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMotorTargetVelocityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMotorEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setMotorEnabledPtr, NIL)
  }

  public final fun isMotorEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isMotorEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAngularLimitEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setAngularLimitEnabledPtr, NIL)
  }

  public final fun isAngularLimitEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isAngularLimitEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setSoftnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "set_softness", 373806689)

    internal val getSoftnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "get_softness", 1740695150)

    internal val setAngularLimitLowerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "set_angular_limit_lower", 373806689)

    internal val getAngularLimitLowerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "get_angular_limit_lower", 1740695150)

    internal val setAngularLimitUpperPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "set_angular_limit_upper", 373806689)

    internal val getAngularLimitUpperPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "get_angular_limit_upper", 1740695150)

    internal val setMotorTargetVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "set_motor_target_velocity", 373806689)

    internal val getMotorTargetVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "get_motor_target_velocity", 1740695150)

    internal val setMotorEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "set_motor_enabled", 2586408642)

    internal val isMotorEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "is_motor_enabled", 36873697)

    internal val setAngularLimitEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "set_angular_limit_enabled", 2586408642)

    internal val isAngularLimitEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "is_angular_limit_enabled", 36873697)
  }
}
