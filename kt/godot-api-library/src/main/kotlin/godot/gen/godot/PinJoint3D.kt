// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_PINJOINT3D_INDEX: Int = 483

/**
 * A physics joint that attaches two 3D physics bodies at a single point, allowing them to freely
 * rotate. For example, a [RigidBody3D] can be attached to a [StaticBody3D] to create a pendulum or a
 * seesaw.
 */
@GodotBaseType
public open class PinJoint3D : Joint3D() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_PINJOINT3D_INDEX, scriptIndex)
  }

  /**
   * Sets the value of the specified parameter.
   */
  public final fun setParam(`param`: Param, `value`: Float): Unit {
    Internals.writeArguments(LONG to param.id, DOUBLE to value.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setParamPtr, NIL)
  }

  /**
   * Returns the value of the specified parameter.
   */
  public final fun getParam(`param`: Param): Float {
    Internals.writeArguments(LONG to param.id)
    Internals.callMethod(rawPtr, MethodBindings.getParamPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public enum class Param(
    id: Long,
  ) {
    /**
     * The force with which the pinned objects stay in positional relation to each other. The
     * higher, the stronger.
     */
    PARAM_BIAS(0),
    /**
     * The force with which the pinned objects stay in velocity relation to each other. The higher,
     * the stronger.
     */
    PARAM_DAMPING(1),
    /**
     * If above 0, this value is the maximum value for an impulse that this Joint3D produces.
     */
    PARAM_IMPULSE_CLAMP(2),
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
        Internals.getMethodBindPtr("PinJoint3D", "set_param", 2059913726)

    public val getParamPtr: VoidPtr =
        Internals.getMethodBindPtr("PinJoint3D", "get_param", 1758438771)
  }
}
