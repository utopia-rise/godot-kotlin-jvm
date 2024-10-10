// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_DAMPEDSPRINGJOINT2D_INDEX: Int = 210

/**
 * A physics joint that connects two 2D physics bodies with a spring-like force. This resembles a
 * spring that always wants to stretch to a given length.
 */
@GodotBaseType
public open class DampedSpringJoint2D : Joint2D() {
  /**
   * The spring joint's maximum length. The two attached bodies cannot stretch it past this value.
   */
  public final inline var length: Float
    @JvmName("lengthProperty")
    get() = getLength()
    @JvmName("lengthProperty")
    set(`value`) {
      setLength(value)
    }

  /**
   * When the bodies attached to the spring joint move they stretch or squash it. The joint always
   * tries to resize towards this length.
   */
  public final inline var restLength: Float
    @JvmName("restLengthProperty")
    get() = getRestLength()
    @JvmName("restLengthProperty")
    set(`value`) {
      setRestLength(value)
    }

  /**
   * The higher the value, the less the bodies attached to the joint will deform it. The joint
   * applies an opposing force to the bodies, the product of the stiffness multiplied by the size
   * difference from its resting length.
   */
  public final inline var stiffness: Float
    @JvmName("stiffnessProperty")
    get() = getStiffness()
    @JvmName("stiffnessProperty")
    set(`value`) {
      setStiffness(value)
    }

  /**
   * The spring joint's damping ratio. A value between `0` and `1`. When the two bodies move into
   * different directions the system tries to align them to the spring axis again. A high [damping]
   * value forces the attached bodies to align faster.
   */
  public final inline var damping: Float
    @JvmName("dampingProperty")
    get() = getDamping()
    @JvmName("dampingProperty")
    set(`value`) {
      setDamping(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_DAMPEDSPRINGJOINT2D_INDEX, scriptIndex)
  }

  public final fun setLength(length: Float): Unit {
    Internals.writeArguments(DOUBLE to length.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setLengthPtr, NIL)
  }

  public final fun getLength(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLengthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRestLength(restLength: Float): Unit {
    Internals.writeArguments(DOUBLE to restLength.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setRestLengthPtr, NIL)
  }

  public final fun getRestLength(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRestLengthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setStiffness(stiffness: Float): Unit {
    Internals.writeArguments(DOUBLE to stiffness.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setStiffnessPtr, NIL)
  }

  public final fun getStiffness(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getStiffnessPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDamping(damping: Float): Unit {
    Internals.writeArguments(DOUBLE to damping.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setDampingPtr, NIL)
  }

  public final fun getDamping(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDampingPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("DampedSpringJoint2D", "set_length", 373806689)

    public val getLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("DampedSpringJoint2D", "get_length", 1740695150)

    public val setRestLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("DampedSpringJoint2D", "set_rest_length", 373806689)

    public val getRestLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("DampedSpringJoint2D", "get_rest_length", 1740695150)

    public val setStiffnessPtr: VoidPtr =
        Internals.getMethodBindPtr("DampedSpringJoint2D", "set_stiffness", 373806689)

    public val getStiffnessPtr: VoidPtr =
        Internals.getMethodBindPtr("DampedSpringJoint2D", "get_stiffness", 1740695150)

    public val setDampingPtr: VoidPtr =
        Internals.getMethodBindPtr("DampedSpringJoint2D", "set_damping", 373806689)

    public val getDampingPtr: VoidPtr =
        Internals.getMethodBindPtr("DampedSpringJoint2D", "get_damping", 1740695150)
  }
}
