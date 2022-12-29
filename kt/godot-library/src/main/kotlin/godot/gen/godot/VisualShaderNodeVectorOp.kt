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
 * A vector operator to be used within the visual shader graph.
 *
 * A visual shader node for use of vector operators. Operates on vector `a` and vector `b`.
 */
@GodotBaseType
public open class VisualShaderNodeVectorOp : VisualShaderNodeVectorBase() {
  /**
   * The operator to be used. See [enum Operator] for options.
   */
  public var `operator`: Operator
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEVECTOROP_GET_OPERATOR, LONG)
      return VisualShaderNodeVectorOp.Operator.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEVECTOROP_SET_OPERATOR, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEVECTOROP, scriptIndex)
    return true
  }

  public enum class Operator(
    id: Long
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
     * Returns the value of the first parameter raised to the power of the second, for each component of the vectors.
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
     * Returns the vector that points in the direction of reflection. `a` is incident vector and `b` is the normal vector.
     */
    OP_REFLECT(10),
    /**
     * Vector step operator. Returns `0.0` if `a` is smaller than `b` and `1.0` otherwise.
     */
    OP_STEP(11),
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
