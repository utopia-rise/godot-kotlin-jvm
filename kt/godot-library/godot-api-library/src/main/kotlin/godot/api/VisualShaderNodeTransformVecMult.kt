// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
import kotlin.jvm.JvmName

/**
 * A multiplication operation on a transform (4×4 matrix) and a vector, with support for different multiplication operators.
 */
@GodotBaseType
public open class VisualShaderNodeTransformVecMult : VisualShaderNode() {
  /**
   * The multiplication type to be performed. See [Operator] for options.
   */
  public final inline var `operator`: Operator
    @JvmName("operatorProperty")
    get() = getOperator()
    @JvmName("operatorProperty")
    set(`value`) {
      setOperator(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(813, scriptIndex)
  }

  public final fun setOperator(op: Operator) {
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
     * Multiplies transform `a` by the vector `b`.
     */
    AxB(0),
    /**
     * Multiplies vector `b` by the transform `a`.
     */
    BxA(1),
    /**
     * Multiplies transform `a` by the vector `b`, skipping the last row and column of the transform.
     */
    OP_3x3_AxB(2),
    /**
     * Multiplies vector `b` by the transform `a`, skipping the last row and column of the transform.
     */
    OP_3x3_BxA(3),
    /**
     * Represents the size of the [Operator] enum.
     */
    MAX(4),
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
        TypeManager.getMethodBindPtr("VisualShaderNodeTransformVecMult", "set_operator", 1_785_665_912)

    internal val getOperatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTransformVecMult", "get_operator", 1_622_088_722)
  }
}
