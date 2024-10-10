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

private const val ENGINE_CLASS_VISUALSHADERNODEUINTFUNC_INDEX: Int = 794

/**
 * Accept an unsigned integer scalar (`x`) to the input port and transform it according to
 * [function].
 */
@GodotBaseType
public open class VisualShaderNodeUIntFunc : VisualShaderNode() {
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
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEUINTFUNC_INDEX, scriptIndex)
  }

  public final fun setFunction(func: Function): Unit {
    Internals.writeArguments(LONG to func.id)
    Internals.callMethod(rawPtr, MethodBindings.setFunctionPtr, NIL)
  }

  public final fun getFunction(): Function {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFunctionPtr, LONG)
    return VisualShaderNodeUIntFunc.Function.from(Internals.readReturnValue(LONG) as Long)
  }

  public enum class Function(
    id: Long,
  ) {
    /**
     * Negates the `x` using `-(x)`.
     */
    FUNC_NEGATE(0),
    /**
     * Returns the result of bitwise `NOT` operation on the integer. Translates to `~a` in the Godot
     * Shader Language.
     */
    FUNC_BITWISE_NOT(1),
    /**
     * Represents the size of the [Function] enum.
     */
    FUNC_MAX(2),
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
        Internals.getMethodBindPtr("VisualShaderNodeUIntFunc", "set_function", 2273148961)

    public val getFunctionPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeUIntFunc", "get_function", 4187123296)
  }
}
