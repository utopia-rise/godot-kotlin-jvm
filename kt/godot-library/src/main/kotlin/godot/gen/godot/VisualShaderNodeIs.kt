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
 * Returns the boolean result of the comparison between `INF` or `NaN` and a scalar parameter.
 */
@GodotBaseType
public open class VisualShaderNodeIs : VisualShaderNode() {
  /**
   * The comparison function. See [enum Function] for options.
   */
  public var function: Function
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFunctionPtr, LONG)
      return VisualShaderNodeIs.Function.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFunctionPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEIS, scriptIndex)
    return true
  }

  public enum class Function(
    id: Long,
  ) {
    /**
     * Comparison with `INF` (Infinity).
     */
    FUNC_IS_INF(0),
    /**
     * Comparison with `NaN` (Not a Number; denotes invalid numeric results, e.g. division by zero).
     */
    FUNC_IS_NAN(1),
    /**
     * Represents the size of the [enum Function] enum.
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
        TypeManager.getMethodBindPtr("VisualShaderNodeIs", "set_function")

    public val getFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeIs", "get_function")
  }
}
