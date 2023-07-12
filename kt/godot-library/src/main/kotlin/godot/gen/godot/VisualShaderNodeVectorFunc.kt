// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * A vector function to be used within the visual shader graph.
 *
 * A visual shader node able to perform different functions using vectors.
 */
@GodotBaseType
public open class VisualShaderNodeVectorFunc : VisualShaderNodeVectorBase() {
  /**
   * The function to be performed. See [enum Function] for options.
   */
  public var function: Function
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEVECTORFUNC_GET_FUNCTION, LONG)
      return VisualShaderNodeVectorFunc.Function.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEVECTORFUNC_SET_FUNCTION, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEVECTORFUNC, scriptIndex)
    return true
  }

  public enum class Function(
    id: Long,
  ) {
    /**
     * Normalizes the vector so that it has a length of `1` but points in the same direction.
     */
    FUNC_NORMALIZE(0),
    /**
     * Clamps the value between `0.0` and `1.0`.
     */
    FUNC_SATURATE(1),
    /**
     * Returns the opposite value of the parameter.
     */
    FUNC_NEGATE(2),
    /**
     * Returns `1/vector`.
     */
    FUNC_RECIPROCAL(3),
    /**
     * Returns the absolute value of the parameter.
     */
    FUNC_ABS(4),
    /**
     * Returns the arc-cosine of the parameter.
     */
    FUNC_ACOS(5),
    /**
     * Returns the inverse hyperbolic cosine of the parameter.
     */
    FUNC_ACOSH(6),
    /**
     * Returns the arc-sine of the parameter.
     */
    FUNC_ASIN(7),
    /**
     * Returns the inverse hyperbolic sine of the parameter.
     */
    FUNC_ASINH(8),
    /**
     * Returns the arc-tangent of the parameter.
     */
    FUNC_ATAN(9),
    /**
     * Returns the inverse hyperbolic tangent of the parameter.
     */
    FUNC_ATANH(10),
    /**
     * Finds the nearest integer that is greater than or equal to the parameter.
     */
    FUNC_CEIL(11),
    /**
     * Returns the cosine of the parameter.
     */
    FUNC_COS(12),
    /**
     * Returns the hyperbolic cosine of the parameter.
     */
    FUNC_COSH(13),
    /**
     * Converts a quantity in radians to degrees.
     */
    FUNC_DEGREES(14),
    /**
     * Base-e Exponential.
     */
    FUNC_EXP(15),
    /**
     * Base-2 Exponential.
     */
    FUNC_EXP2(16),
    /**
     * Finds the nearest integer less than or equal to the parameter.
     */
    FUNC_FLOOR(17),
    /**
     * Computes the fractional part of the argument.
     */
    FUNC_FRACT(18),
    /**
     * Returns the inverse of the square root of the parameter.
     */
    FUNC_INVERSE_SQRT(19),
    /**
     * Natural logarithm.
     */
    FUNC_LOG(20),
    /**
     * Base-2 logarithm.
     */
    FUNC_LOG2(21),
    /**
     * Converts a quantity in degrees to radians.
     */
    FUNC_RADIANS(22),
    /**
     * Finds the nearest integer to the parameter.
     */
    FUNC_ROUND(23),
    /**
     * Finds the nearest even integer to the parameter.
     */
    FUNC_ROUNDEVEN(24),
    /**
     * Extracts the sign of the parameter, i.e. returns `-1` if the parameter is negative, `1` if it's positive and `0` otherwise.
     */
    FUNC_SIGN(25),
    /**
     * Returns the sine of the parameter.
     */
    FUNC_SIN(26),
    /**
     * Returns the hyperbolic sine of the parameter.
     */
    FUNC_SINH(27),
    /**
     * Returns the square root of the parameter.
     */
    FUNC_SQRT(28),
    /**
     * Returns the tangent of the parameter.
     */
    FUNC_TAN(29),
    /**
     * Returns the hyperbolic tangent of the parameter.
     */
    FUNC_TANH(30),
    /**
     * Returns a value equal to the nearest integer to the parameter whose absolute value is not larger than the absolute value of the parameter.
     */
    FUNC_TRUNC(31),
    /**
     * Returns `1.0 - vector`.
     */
    FUNC_ONEMINUS(32),
    /**
     * Represents the size of the [enum Function] enum.
     */
    FUNC_MAX(33),
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
