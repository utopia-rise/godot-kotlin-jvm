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

private const val ENGINE_CLASS_VISUALSHADERNODETRANSFORMVECMULT_INDEX: Int = 792

/**
 * A multiplication operation on a transform (4×4 matrix) and a vector, with support for different
 * multiplication operators.
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

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODETRANSFORMVECMULT_INDEX,
        scriptIndex)
  }

  public final fun setOperator(op: Operator): Unit {
    Internals.writeArguments(LONG to op.id)
    Internals.callMethod(rawPtr, MethodBindings.setOperatorPtr, NIL)
  }

  public final fun getOperator(): Operator {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOperatorPtr, LONG)
    return VisualShaderNodeTransformVecMult.Operator.from(Internals.readReturnValue(LONG) as Long)
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
      public fun from(`value`: Long): Operator = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setOperatorPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeTransformVecMult", "set_operator", 1785665912)

    public val getOperatorPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeTransformVecMult", "get_operator", 1622088722)
  }
}
