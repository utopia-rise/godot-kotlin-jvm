// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Long
import kotlin.Suppress

/**
 * A vector operator to be used within the visual shader graph.
 *
 * A visual shader node for use of vector operators. Operates on vector `a` and vector `b`.
 */
@GodotBaseType
open class VisualShaderNodeVectorOp : VisualShaderNode() {
  /**
   * The operator to be used. See [enum Operator] for options.
   */
  open var operator: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEVECTOROP_GET_OPERATOR, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEVECTOROP_SET_OPERATOR, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODEVECTOROP)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  enum class Operator(
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
    OP_STEP(11);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Adds two vectors.
     */
    final const val OP_ADD: Long = 0

    /**
     * Returns the arc-tangent of the parameters.
     */
    final const val OP_ATAN2: Long = 9

    /**
     * Calculates the cross product of two vectors.
     */
    final const val OP_CROSS: Long = 8

    /**
     * Divides vector by vector.
     */
    final const val OP_DIV: Long = 3

    /**
     * Returns the greater of two values, for each component of the vectors.
     */
    final const val OP_MAX: Long = 6

    /**
     * Returns the lesser of two values, for each component of the vectors.
     */
    final const val OP_MIN: Long = 7

    /**
     * Returns the remainder of the two vectors.
     */
    final const val OP_MOD: Long = 4

    /**
     * Multiplies two vectors.
     */
    final const val OP_MUL: Long = 2

    /**
     * Returns the value of the first parameter raised to the power of the second, for each component of the vectors.
     */
    final const val OP_POW: Long = 5

    /**
     * Returns the vector that points in the direction of reflection. `a` is incident vector and `b` is the normal vector.
     */
    final const val OP_REFLECT: Long = 10

    /**
     * Vector step operator. Returns `0.0` if `a` is smaller than `b` and `1.0` otherwise.
     */
    final const val OP_STEP: Long = 11

    /**
     * Subtracts a vector from a vector.
     */
    final const val OP_SUB: Long = 1
  }
}
