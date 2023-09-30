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
 * A scalar integer function to be used within the visual shader graph.
 *
 * Accept an integer scalar (`x`) to the input port and transform it according to [function].
 */
@GodotBaseType
public open class VisualShaderNodeIntFunc : VisualShaderNode() {
  /**
   * A function to be applied to the scalar. See [enum Function] for options.
   */
  public var function: Function
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEINTFUNC_GET_FUNCTION, LONG)
      return VisualShaderNodeIntFunc.Function.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEINTFUNC_SET_FUNCTION, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEINTFUNC, scriptIndex)
    return true
  }

  public enum class Function(
    id: Long,
  ) {
    /**
     * Returns the absolute value of the parameter. Translates to `abs(x)` in the Godot Shader Language.
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
     * Returns the result of bitwise `NOT` operation on the integer. Translates to `~a` in the Godot Shader Language.
     */
    FUNC_BITWISE_NOT(3),
    /**
     * Represents the size of the [enum Function] enum.
     */
    FUNC_MAX(4),
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
}
