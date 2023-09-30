// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A physics joint that attaches two 3D physics bodies at a single point, allowing them to freely rotate.
 *
 * A physics joint that attaches two 2D physics bodies at a single point, allowing them to freely rotate. For example, a [godot.RigidBody3D] can be attached to a [godot.StaticBody3D] to create a pendulum or a seesaw.
 */
@GodotBaseType
public open class PinJoint3D : Joint3D() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PINJOINT3D, scriptIndex)
    return true
  }

  /**
   * Sets the value of the specified parameter.
   */
  public fun setParam(`param`: Param, `value`: Float): Unit {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PINJOINT3D_SET_PARAM, NIL)
  }

  /**
   * Returns the value of the specified parameter.
   */
  public fun getParam(`param`: Param): Float {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PINJOINT3D_GET_PARAM, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public enum class Param(
    id: Long,
  ) {
    /**
     * The force with which the pinned objects stay in positional relation to each other. The higher, the stronger.
     */
    PARAM_BIAS(0),
    /**
     * The force with which the pinned objects stay in velocity relation to each other. The higher, the stronger.
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object
}
