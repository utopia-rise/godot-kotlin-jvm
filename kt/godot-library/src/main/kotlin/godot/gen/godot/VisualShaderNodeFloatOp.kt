// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Applies [operator] to two floating-point inputs: `a` and `b`.
 */
@GodotBaseType
public open class VisualShaderNodeFloatOp : VisualShaderNode() {
  /**
   * An operator to be applied to the inputs. See [enum Operator] for options.
   */
  public var `operator`: Operator
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOperatorPtr, LONG)
      return VisualShaderNodeFloatOp.Operator.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setOperatorPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEFLOATOP, scriptIndex)
    return true
  }

  public enum class Operator(
    id: Long,
  ) {
    /**
     * Sums two numbers using `a + b`.
     */
    OP_ADD(0),
    /**
     * Subtracts two numbers using `a - b`.
     */
    OP_SUB(1),
    /**
     * Multiplies two numbers using `a * b`.
     */
    OP_MUL(2),
    /**
     * Divides two numbers using `a / b`.
     */
    OP_DIV(3),
    /**
     * Calculates the remainder of two numbers. Translates to `mod(a, b)` in the Godot Shader
     * Language.
     */
    OP_MOD(4),
    /**
     * Raises the `a` to the power of `b`. Translates to `pow(a, b)` in the Godot Shader Language.
     */
    OP_POW(5),
    /**
     * Returns the greater of two numbers. Translates to `max(a, b)` in the Godot Shader Language.
     */
    OP_MAX(6),
    /**
     * Returns the lesser of two numbers. Translates to `min(a, b)` in the Godot Shader Language.
     */
    OP_MIN(7),
    /**
     * Returns the arc-tangent of the parameters. Translates to `atan(a, b)` in the Godot Shader
     * Language.
     */
    OP_ATAN2(8),
    /**
     * Generates a step function by comparing `b`(x) to `a`(edge). Returns 0.0 if `x` is smaller
     * than `edge` and otherwise 1.0. Translates to `step(a, b)` in the Godot Shader Language.
     */
    OP_STEP(9),
    /**
     * Represents the size of the [enum Operator] enum.
     */
    OP_ENUM_SIZE(10),
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

  internal object MethodBindings {
    public val setOperatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatOp", "set_operator")

    public val getOperatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatOp", "get_operator")
  }
}
