// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A physics joint that connects two 2D physics bodies with a spring-like force. This resembles a
 * spring that always wants to stretch to a given length.
 */
@GodotBaseType
public open class DampedSpringJoint2D : Joint2D() {
  /**
   * The spring joint's maximum length. The two attached bodies cannot stretch it past this value.
   */
  public var length: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLengthPtr, NIL)
    }

  /**
   * When the bodies attached to the spring joint move they stretch or squash it. The joint always
   * tries to resize towards this length.
   */
  public var restLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRestLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRestLengthPtr, NIL)
    }

  /**
   * The higher the value, the less the bodies attached to the joint will deform it. The joint
   * applies an opposing force to the bodies, the product of the stiffness multiplied by the size
   * difference from its resting length.
   */
  public var stiffness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStiffnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setStiffnessPtr, NIL)
    }

  /**
   * The spring joint's damping ratio. A value between `0` and `1`. When the two bodies move into
   * different directions the system tries to align them to the spring axis again. A high [damping]
   * value forces the attached bodies to align faster.
   */
  public var damping: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDampingPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDampingPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_DAMPEDSPRINGJOINT2D, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DampedSpringJoint2D", "set_length", 373806689)

    public val getLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DampedSpringJoint2D", "get_length", 1740695150)

    public val setRestLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DampedSpringJoint2D", "set_rest_length", 373806689)

    public val getRestLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DampedSpringJoint2D", "get_rest_length", 1740695150)

    public val setStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DampedSpringJoint2D", "set_stiffness", 373806689)

    public val getStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DampedSpringJoint2D", "get_stiffness", 1740695150)

    public val setDampingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DampedSpringJoint2D", "set_damping", 373806689)

    public val getDampingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DampedSpringJoint2D", "get_damping", 1740695150)
  }
}
