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

private const val ENGINE_CLASS_VISUALSHADERNODEIS_INDEX: Int = 666

/**
 * Returns the boolean result of the comparison between `INF` or `NaN` and a scalar parameter.
 */
@GodotBaseType
public open class VisualShaderNodeIs : VisualShaderNode() {
  /**
   * The comparison function. See [Function] for options.
   */
  public final inline var function: Function
    @JvmName("functionProperty")
    get() = getFunction()
    @JvmName("functionProperty")
    set(`value`) {
      setFunction(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEIS_INDEX, scriptIndex)
  }

  public final fun setFunction(func: Function): Unit {
    Internals.writeArguments(LONG to func.id)
    Internals.callMethod(rawPtr, MethodBindings.setFunctionPtr, NIL)
  }

  public final fun getFunction(): Function {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFunctionPtr, LONG)
    return VisualShaderNodeIs.Function.from(Internals.readReturnValue(LONG) as Long)
  }

  public enum class Function(
    id: Long,
  ) {
    /**
     * Comparison with `INF` (Infinity).
     */
    FUNC_IS_INF(0),
    /**
     * Comparison with `NaN` (Not a Number; indicates invalid numeric results, such as division by
     * zero).
     */
    FUNC_IS_NAN(1),
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
        Internals.getMethodBindPtr("VisualShaderNodeIs", "set_function", 1438374690)

    public val getFunctionPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeIs", "get_function", 580678557)
  }
}
