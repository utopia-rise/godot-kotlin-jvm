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

private const val ENGINE_CLASS_VISUALSHADERNODEINTFUNC_INDEX: Int = 740

/**
 * Accept an integer scalar (`x`) to the input port and transform it according to [function].
 */
@GodotBaseType
public open class VisualShaderNodeIntFunc : VisualShaderNode() {
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
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEINTFUNC_INDEX, scriptIndex)
  }

  public final fun setFunction(func: Function): Unit {
    Internals.writeArguments(LONG to func.id)
    Internals.callMethod(rawPtr, MethodBindings.setFunctionPtr, NIL)
  }

  public final fun getFunction(): Function {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFunctionPtr, LONG)
    return VisualShaderNodeIntFunc.Function.from(Internals.readReturnValue(LONG) as Long)
  }

  public enum class Function(
    id: Long,
  ) {
    /**
     * Returns the absolute value of the parameter. Translates to `abs(x)` in the Godot Shader
     * Language.
     */
    FUNC_ABS(0),
    /**
     * Negates the `x` using `-(x)`.
     */
    FUNC_NEGATE(1),
    /**
     * Extracts the sign of the parameter. Translates to `sign(x)` in the Godot Shader Language.
     */
    FUNC_SIGN(2),
    /**
     * Returns the result of bitwise `NOT` operation on the integer. Translates to `~a` in the Godot
     * Shader Language.
     */
    FUNC_BITWISE_NOT(3),
    /**
     * Represents the size of the [Function] enum.
     */
    FUNC_MAX(4),
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

  public object MethodBindings {
    internal val setFunctionPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeIntFunc", "set_function", 424195284)

    internal val getFunctionPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeIntFunc", "get_function", 2753496911)
  }
}
