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
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.getOperatorPtr
import godot.setOperatorPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_VISUALSHADERNODEINTOP: Int = 741

/**
 * Applies [operator] to two integer inputs: `a` and `b`.
 */
@GodotBaseType
public open class VisualShaderNodeIntOp : VisualShaderNode() {
  /**
   * An operator to be applied to the inputs. See [Operator] for options.
   */
  public final inline var `operator`: Operator
    @JvmName("operatorProperty")
    get() = getOperator()
    @JvmName("operatorProperty")
    set(`value`) {
      setOperator(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_VISUALSHADERNODEINTOP, scriptIndex)
  }

  public final fun setOperator(op: Operator): Unit {
    TransferContext.writeArguments(LONG to op.id)
    TransferContext.callMethod(ptr, MethodBindings.setOperatorPtr, NIL)
  }

  public final fun getOperator(): Operator {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOperatorPtr, LONG)
    return VisualShaderNodeIntOp.Operator.from(TransferContext.readReturnValue(LONG) as Long)
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
     * Represents the size of the [Operator] enum.
     */
    OP_ENUM_SIZE(12),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Operator = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setOperatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeIntOp", "set_operator", 1677909323)

    internal val getOperatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeIntOp", "get_operator", 1236987913)
  }
}
