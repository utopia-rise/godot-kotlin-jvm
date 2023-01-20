// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * An unsigned integer scalar operator to be used within the visual shader graph.
 *
 * Applies [operator] to two unsigned integer inputs: `a` and `b`.
 */
@GodotBaseType
public open class VisualShaderNodeUIntOp : VisualShaderNode() {
  /**
   * An operator to be applied to the inputs. See [enum Operator] for options.
   */
  public var `operator`: Operator
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEUINTOP_GET_OPERATOR, LONG)
      return VisualShaderNodeUIntOp.Operator.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEUINTOP_SET_OPERATOR, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEUINTOP, scriptIndex)
    return true
  }

  public enum class Operator(
    id: Long
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
     * Calculates the remainder of two numbers using `a % b`.
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
     * Returns the result of bitwise `AND` operation on the integer. Translates to `a & b` in the Godot Shader Language.
     */
    OP_BITWISE_AND(7),
    /**
     * Returns the result of bitwise `OR` operation for two integers. Translates to `a | b` in the Godot Shader Language.
     */
    OP_BITWISE_OR(8),
    /**
     * Returns the result of bitwise `XOR` operation for two integers. Translates to `a ^ b` in the Godot Shader Language.
     */
    OP_BITWISE_XOR(9),
    /**
     * Returns the result of bitwise left shift operation on the integer. Translates to `a << b` in the Godot Shader Language.
     */
    OP_BITWISE_LEFT_SHIFT(10),
    /**
     * Returns the result of bitwise right shift operation on the integer. Translates to `a >> b` in the Godot Shader Language.
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
