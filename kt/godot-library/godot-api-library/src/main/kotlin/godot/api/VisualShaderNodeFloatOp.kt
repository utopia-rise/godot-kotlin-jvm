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
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Applies [operator] to two floating-point inputs: `a` and `b`.
 */
@GodotBaseType
public open class VisualShaderNodeFloatOp : VisualShaderNode() {
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
    createNativeObject(752, scriptIndex)
  }

  public final fun setOperator(op: Operator): Unit {
    TransferContext.writeArguments(LONG to op.id)
    TransferContext.callMethod(ptr, MethodBindings.setOperatorPtr, NIL)
  }

  public final fun getOperator(): Operator {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOperatorPtr, LONG)
    return Operator.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class Operator(
    id: Long,
  ) {
    /**
     * Sums two numbers using `a + b`.
     */
    ADD(0),
    /**
     * Subtracts two numbers using `a - b`.
     */
    SUB(1),
    /**
     * Multiplies two numbers using `a * b`.
     */
    MUL(2),
    /**
     * Divides two numbers using `a / b`.
     */
    DIV(3),
    /**
     * Calculates the remainder of two numbers. Translates to `mod(a, b)` in the Godot Shader
     * Language.
     */
    MOD(4),
    /**
     * Raises the `a` to the power of `b`. Translates to `pow(a, b)` in the Godot Shader Language.
     */
    POW(5),
    /**
     * Returns the greater of two numbers. Translates to `max(a, b)` in the Godot Shader Language.
     */
    MAX(6),
    /**
     * Returns the lesser of two numbers. Translates to `min(a, b)` in the Godot Shader Language.
     */
    MIN(7),
    /**
     * Returns the arc-tangent of the parameters. Translates to `atan(a, b)` in the Godot Shader
     * Language.
     */
    ATAN2(8),
    /**
     * Generates a step function by comparing `b`(x) to `a`(edge). Returns 0.0 if `x` is smaller
     * than `edge` and otherwise 1.0. Translates to `step(a, b)` in the Godot Shader Language.
     */
    STEP(9),
    /**
     * Represents the size of the [Operator] enum.
     */
    ENUM_SIZE(10),
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
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatOp", "set_operator", 2488468047)

    internal val getOperatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatOp", "get_operator", 1867979390)
  }
}
