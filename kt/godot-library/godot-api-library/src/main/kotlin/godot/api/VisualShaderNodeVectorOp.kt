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
 * A visual shader node for use of vector operators. Operates on vector `a` and vector `b`.
 */
@GodotBaseType
public open class VisualShaderNodeVectorOp : VisualShaderNodeVectorBase() {
  /**
   * The operator to be used. See [Operator] for options.
   */
  public final inline var `operator`: Operator
    @JvmName("operatorProperty")
    get() = getOperator()
    @JvmName("operatorProperty")
    set(`value`) {
      setOperator(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(838, scriptIndex)
  }

  public final fun setOperator(op: Operator): Unit {
    TransferContext.writeArguments(LONG to op.id)
    TransferContext.callMethod(ptr, MethodBindings.setOperatorPtr, NIL)
  }

  public final fun getOperator(): Operator {
    TransferContext.callMethod(ptr, MethodBindings.getOperatorPtr, LONG)
    return VisualShaderNodeVectorOp.Operator.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class Operator(
    id: Long,
  ) {
    /**
     * Adds two vectors.
     */
    OP_ADD(0),
    /**
     * Subtracts a vector from a vector.
     */
    OP_SUB(1),
    /**
     * Multiplies two vectors.
     */
    OP_MUL(2),
    /**
     * Divides vector by vector.
     */
    OP_DIV(3),
    /**
     * Returns the remainder of the two vectors.
     */
    OP_MOD(4),
    /**
     * Returns the value of the first parameter raised to the power of the second, for each
     * component of the vectors.
     */
    OP_POW(5),
    /**
     * Returns the greater of two values, for each component of the vectors.
     */
    OP_MAX(6),
    /**
     * Returns the lesser of two values, for each component of the vectors.
     */
    OP_MIN(7),
    /**
     * Calculates the cross product of two vectors.
     */
    OP_CROSS(8),
    /**
     * Returns the arc-tangent of the parameters.
     */
    OP_ATAN2(9),
    /**
     * Returns the vector that points in the direction of reflection. `a` is incident vector and `b`
     * is the normal vector.
     */
    OP_REFLECT(10),
    /**
     * Vector step operator. Returns `0.0` if `a` is smaller than `b` and `1.0` otherwise.
     */
    OP_STEP(11),
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
        TypeManager.getMethodBindPtr("VisualShaderNodeVectorOp", "set_operator", 3371507302)

    internal val getOperatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeVectorOp", "get_operator", 11793929)
  }
}
