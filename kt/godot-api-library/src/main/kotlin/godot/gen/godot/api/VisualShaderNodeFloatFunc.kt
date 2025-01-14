// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

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
 * Accept a floating-point scalar (`x`) to the input port and transform it according to [function].
 */
@GodotBaseType
public open class VisualShaderNodeFloatFunc : VisualShaderNode() {
  /**
   * A function to be applied to the scalar. See [Function] for options.
   */
  public final inline var function: Function
    @JvmName("functionProperty")
    get() = getFunction()
    @JvmName("functionProperty")
    set(`value`) {
      setFunction(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_VISUALSHADERNODEFLOATFUNC, scriptIndex)
  }

  public final fun setFunction(func: Function): Unit {
    TransferContext.writeArguments(LONG to func.id)
    TransferContext.callMethod(ptr, MethodBindings.setFunctionPtr, NIL)
  }

  public final fun getFunction(): Function {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFunctionPtr, LONG)
    return VisualShaderNodeFloatFunc.Function.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class Function(
    id: Long,
  ) {
    /**
     * Returns the sine of the parameter. Translates to `sin(x)` in the Godot Shader Language.
     */
    FUNC_SIN(0),
    /**
     * Returns the cosine of the parameter. Translates to `cos(x)` in the Godot Shader Language.
     */
    FUNC_COS(1),
    /**
     * Returns the tangent of the parameter. Translates to `tan(x)` in the Godot Shader Language.
     */
    FUNC_TAN(2),
    /**
     * Returns the arc-sine of the parameter. Translates to `asin(x)` in the Godot Shader Language.
     */
    FUNC_ASIN(3),
    /**
     * Returns the arc-cosine of the parameter. Translates to `acos(x)` in the Godot Shader
     * Language.
     */
    FUNC_ACOS(4),
    /**
     * Returns the arc-tangent of the parameter. Translates to `atan(x)` in the Godot Shader
     * Language.
     */
    FUNC_ATAN(5),
    /**
     * Returns the hyperbolic sine of the parameter. Translates to `sinh(x)` in the Godot Shader
     * Language.
     */
    FUNC_SINH(6),
    /**
     * Returns the hyperbolic cosine of the parameter. Translates to `cosh(x)` in the Godot Shader
     * Language.
     */
    FUNC_COSH(7),
    /**
     * Returns the hyperbolic tangent of the parameter. Translates to `tanh(x)` in the Godot Shader
     * Language.
     */
    FUNC_TANH(8),
    /**
     * Returns the natural logarithm of the parameter. Translates to `log(x)` in the Godot Shader
     * Language.
     */
    FUNC_LOG(9),
    /**
     * Returns the natural exponentiation of the parameter. Translates to `exp(x)` in the Godot
     * Shader Language.
     */
    FUNC_EXP(10),
    /**
     * Returns the square root of the parameter. Translates to `sqrt(x)` in the Godot Shader
     * Language.
     */
    FUNC_SQRT(11),
    /**
     * Returns the absolute value of the parameter. Translates to `abs(x)` in the Godot Shader
     * Language.
     */
    FUNC_ABS(12),
    /**
     * Extracts the sign of the parameter. Translates to `sign(x)` in the Godot Shader Language.
     */
    FUNC_SIGN(13),
    /**
     * Finds the nearest integer less than or equal to the parameter. Translates to `floor(x)` in
     * the Godot Shader Language.
     */
    FUNC_FLOOR(14),
    /**
     * Finds the nearest integer to the parameter. Translates to `round(x)` in the Godot Shader
     * Language.
     */
    FUNC_ROUND(15),
    /**
     * Finds the nearest integer that is greater than or equal to the parameter. Translates to
     * `ceil(x)` in the Godot Shader Language.
     */
    FUNC_CEIL(16),
    /**
     * Computes the fractional part of the argument. Translates to `fract(x)` in the Godot Shader
     * Language.
     */
    FUNC_FRACT(17),
    /**
     * Clamps the value between `0.0` and `1.0` using `min(max(x, 0.0), 1.0)`.
     */
    FUNC_SATURATE(18),
    /**
     * Negates the `x` using `-(x)`.
     */
    FUNC_NEGATE(19),
    /**
     * Returns the arc-hyperbolic-cosine of the parameter. Translates to `acosh(x)` in the Godot
     * Shader Language.
     */
    FUNC_ACOSH(20),
    /**
     * Returns the arc-hyperbolic-sine of the parameter. Translates to `asinh(x)` in the Godot
     * Shader Language.
     */
    FUNC_ASINH(21),
    /**
     * Returns the arc-hyperbolic-tangent of the parameter. Translates to `atanh(x)` in the Godot
     * Shader Language.
     */
    FUNC_ATANH(22),
    /**
     * Convert a quantity in radians to degrees. Translates to `degrees(x)` in the Godot Shader
     * Language.
     */
    FUNC_DEGREES(23),
    /**
     * Returns 2 raised by the power of the parameter. Translates to `exp2(x)` in the Godot Shader
     * Language.
     */
    FUNC_EXP2(24),
    /**
     * Returns the inverse of the square root of the parameter. Translates to `inversesqrt(x)` in
     * the Godot Shader Language.
     */
    FUNC_INVERSE_SQRT(25),
    /**
     * Returns the base 2 logarithm of the parameter. Translates to `log2(x)` in the Godot Shader
     * Language.
     */
    FUNC_LOG2(26),
    /**
     * Convert a quantity in degrees to radians. Translates to `radians(x)` in the Godot Shader
     * Language.
     */
    FUNC_RADIANS(27),
    /**
     * Finds reciprocal value of dividing 1 by `x` (i.e. `1 / x`).
     */
    FUNC_RECIPROCAL(28),
    /**
     * Finds the nearest even integer to the parameter. Translates to `roundEven(x)` in the Godot
     * Shader Language.
     */
    FUNC_ROUNDEVEN(29),
    /**
     * Returns a value equal to the nearest integer to `x` whose absolute value is not larger than
     * the absolute value of `x`. Translates to `trunc(x)` in the Godot Shader Language.
     */
    FUNC_TRUNC(30),
    /**
     * Subtracts scalar `x` from 1 (i.e. `1 - x`).
     */
    FUNC_ONEMINUS(31),
    /**
     * Represents the size of the [Function] enum.
     */
    FUNC_MAX(32),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Function = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatFunc", "set_function", 536026177)

    public val getFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFloatFunc", "get_function", 2033948868)
  }
}
