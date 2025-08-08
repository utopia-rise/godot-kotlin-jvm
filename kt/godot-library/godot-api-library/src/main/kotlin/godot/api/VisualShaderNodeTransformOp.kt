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
import godot.core.GodotEnum
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
    createNativeObject(811, scriptIndex)
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
  ) : GodotEnum {
    /**
     * Multiplies transform `a` by the transform `b`.
     */
    AxB(0),
    /**
     * Multiplies transform `b` by the transform `a`.
     */
    BxA(1),
    /**
     * Performs a component-wise multiplication of transform `a` by the transform `b`.
     */
    AxB_COMP(2),
    /**
     * Performs a component-wise multiplication of transform `b` by the transform `a`.
     */
    BxA_COMP(3),
    /**
     * Adds two transforms.
     */
    ADD(4),
    /**
     * Subtracts the transform `a` from the transform `b`.
     */
    A_MINUS_B(5),
    /**
     * Subtracts the transform `b` from the transform `a`.
     */
    B_MINUS_A(6),
    /**
     * Divides the transform `a` by the transform `b`.
     */
    A_DIV_B(7),
    /**
     * Divides the transform `b` by the transform `a`.
     */
    B_DIV_A(8),
    /**
     * Represents the size of the [Operator] enum.
     */
    MAX(9),
    ;

    public override val id: Long
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
        TypeManager.getMethodBindPtr("VisualShaderNodeTransformOp", "set_operator", 2287310733)

    internal val getOperatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTransformOp", "get_operator", 1238663601)
  }
}
