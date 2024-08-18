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
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A multiplication operation on a transform (4×4 matrix) and a vector, with support for different
 * multiplication operators.
 */
@GodotBaseType
public open class VisualShaderNodeTransformVecMult : VisualShaderNode() {
  /**
   * The multiplication type to be performed. See [Operator] for options.
   */
  public var `operator`: Operator
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOperatorPtr, LONG)
      return VisualShaderNodeTransformVecMult.Operator.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setOperatorPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODETRANSFORMVECMULT, scriptIndex)
  }

  public enum class Operator(
    id: Long,
  ) {
    /**
     * Multiplies transform `a` by the vector `b`.
     */
    OP_AxB(0),
    /**
     * Multiplies vector `b` by the transform `a`.
     */
    OP_BxA(1),
    /**
     * Multiplies transform `a` by the vector `b`, skipping the last row and column of the
     * transform.
     */
    OP_3x3_AxB(2),
    /**
     * Multiplies vector `b` by the transform `a`, skipping the last row and column of the
     * transform.
     */
    OP_3x3_BxA(3),
    /**
     * Represents the size of the [Operator] enum.
     */
    OP_MAX(4),
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
        TypeManager.getMethodBindPtr("VisualShaderNodeTransformVecMult", "set_operator")

    public val getOperatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTransformVecMult", "get_operator")
  }
}
