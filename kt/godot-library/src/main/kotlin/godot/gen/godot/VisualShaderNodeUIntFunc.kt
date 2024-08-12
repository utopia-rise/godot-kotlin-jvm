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
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Accept an unsigned integer scalar (`x`) to the input port and transform it according to
 * [function].
 */
@GodotBaseType
public open class VisualShaderNodeUIntFunc : VisualShaderNode() {
  /**
   * A function to be applied to the scalar. See [Function] for options.
   */
  public var function: Function
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFunctionPtr, LONG)
      return VisualShaderNodeUIntFunc.Function.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFunctionPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEUINTFUNC, scriptIndex)
    return true
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeUIntFunc", "set_function")

    public val getFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeUIntFunc", "get_function")
  }
}
