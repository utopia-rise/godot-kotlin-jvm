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
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSoftnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSoftnessPtr, NIL)
    }

  /**
   * If `true`, the pin maximum and minimum rotation, defined by [angularLimitLower] and
   * [angularLimitUpper] are applied.
   */
  public var angularLimitEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAngularLimitEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAngularLimitEnabledPtr, NIL)
    }

  /**
   * The minimum rotation. Only active if [angularLimitEnabled] is `true`.
   */
  public var angularLimitLower: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAngularLimitLowerPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAngularLimitLowerPtr, NIL)
    }

  /**
   * The maximum rotation. Only active if [angularLimitEnabled] is `true`.
   */
  public var angularLimitUpper: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAngularLimitUpperPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAngularLimitUpperPtr, NIL)
    }

  /**
   * When activated, a motor turns the pin.
   */
  public var motorEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMotorEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMotorEnabledPtr, NIL)
    }

  /**
   * Target speed for the motor. In radians per second.
   */
  public var motorTargetVelocity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMotorTargetVelocityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMotorTargetVelocityPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PINJOINT2D, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setSoftnessPtr: VoidPtr = TypeManager.getMethodBindPtr("PinJoint2D", "set_softness")

    public val getSoftnessPtr: VoidPtr = TypeManager.getMethodBindPtr("PinJoint2D", "get_softness")

    public val setAngularLimitLowerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "set_angular_limit_lower")

    public val getAngularLimitLowerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "get_angular_limit_lower")

    public val setAngularLimitUpperPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "set_angular_limit_upper")

    public val getAngularLimitUpperPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "get_angular_limit_upper")

    public val setMotorTargetVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "set_motor_target_velocity")

    public val getMotorTargetVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "get_motor_target_velocity")

    public val setMotorEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "set_motor_enabled")

    public val isMotorEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "is_motor_enabled")

    public val setAngularLimitEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "set_angular_limit_enabled")

    public val isAngularLimitEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PinJoint2D", "is_angular_limit_enabled")
  }
}
