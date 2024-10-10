// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VISUALSHADERNODETRANSFORMOP_INDEX: Int = 707

/**
 * Applies [operator] to two transform (4×4 matrices) inputs.
 */
@GodotBaseType
public open class VisualShaderNodeTransformOp : VisualShaderNode() {
  /**
   * The type of the operation to be performed on the transforms. See [Operator] for options.
   */
  public final inline var `operator`: Operator
    @JvmName("operatorProperty")
    get() = getOperator()
    @JvmName("operatorProperty")
    set(`value`) {
      setOperator(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODETRANSFORMOP_INDEX, scriptIndex)
  }

  public final fun setOperator(op: Operator): Unit {
    Internals.writeArguments(LONG to op.id)
    Internals.callMethod(rawPtr, MethodBindings.setOperatorPtr, NIL)
  }

  public final fun getOperator(): Operator {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOperatorPtr, LONG)
    return VisualShaderNodeTransformOp.Operator.from(Internals.readReturnValue(LONG) as Long)
  }

  public enum class Operator(
    id: Long,
  ) {
    /**
     * Multiplies transform `a` by the transform `b`.
     */
    OP_AxB(0),
    /**
     * Multiplies transform `b` by the transform `a`.
     */
    OP_BxA(1),
    /**
     * Performs a component-wise multiplication of transform `a` by the transform `b`.
     */
    OP_AxB_COMP(2),
    /**
     * Performs a component-wise multiplication of transform `b` by the transform `a`.
     */
    OP_BxA_COMP(3),
    /**
     * Adds two transforms.
     */
    OP_ADD(4),
    /**
     * Subtracts the transform `a` from the transform `b`.
     */
    OP_A_MINUS_B(5),
    /**
     * Subtracts the transform `b` from the transform `a`.
     */
    OP_B_MINUS_A(6),
    /**
     * Divides the transform `a` by the transform `b`.
     */
    OP_A_DIV_B(7),
    /**
     * Divides the transform `b` by the transform `a`.
     */
    OP_B_DIV_A(8),
    /**
     * Represents the size of the [Operator] enum.
     */
    OP_MAX(9),
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

  internal object MethodBindings {
    public val setOperatorPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeTransformOp", "set_operator", 2287310733)

    public val getOperatorPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeTransformOp", "get_operator", 1238663601)
  }
}
