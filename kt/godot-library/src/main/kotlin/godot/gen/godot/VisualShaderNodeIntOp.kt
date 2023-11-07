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
 * Applies [operator] to two integer inputs: `a` and `b`.
 */
@GodotBaseType
public open class VisualShaderNodeIntOp : VisualShaderNode() {
  /**
   * An operator to be applied to the inputs. See [enum Operator] for options.
   */
  public var `operator`: Operator
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOperatorPtr, LONG)
      return VisualShaderNodeIntOp.Operator.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setOperatorPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEINTOP, scriptIndex)
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
     * Calculates the remainder of two numbers using `a &#37; b`.
     */
    OP_MOD(4),
    /**
     * Returns the greater of two numbers. Translates to `max(a, b)` in the Godot Shader Language.
     */
    OP_MAX(5),
    /**
     * Returns the lesser of two numbers. Translates to `max(a, b)` in the Godot Shader Language.
     */
    OP_MIN(6),
    /**
     * Returns the result of bitwise `AND` operation on the integer. Translates to `a & b` in the
     * Godot Shader Language.
     */
    OP_BITWISE_AND(7),
    /**
     * Returns the result of bitwise `OR` operation for two integers. Translates to `a | b` in the
     * Godot Shader Language.
     */
    OP_BITWISE_OR(8),
    /**
     * Returns the result of bitwise `XOR` operation for two integers. Translates to `a ^ b` in the
     * Godot Shader Language.
     */
    OP_BITWISE_XOR(9),
    /**
     * Returns the result of bitwise left shift operation on the integer. Translates to `a << b` in
     * the Godot Shader Language.
     */
    OP_BITWISE_LEFT_SHIFT(10),
    /**
     * Returns the result of bitwise right shift operation on the integer. Translates to `a >> b` in
     * the Godot Shader Language.
     */
    OP_BITWISE_RIGHT_SHIFT(11),
    /**
     * Represents the size of the [enum Operator] enum.
     */
    OP_ENUM_SIZE(12),
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
        TypeManager.getMethodBindPtr("VisualShaderNodeIntOp", "set_operator")

    public val getOperatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeIntOp", "get_operator")
  }
}
