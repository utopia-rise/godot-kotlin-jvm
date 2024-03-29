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
 * Contains functions to modify texture coordinates (`uv`) to be used within the visual shader graph.
 *
 * UV functions are similar to [godot.core.Vector2] functions, but the input port of this node uses the shader's UV value by default.
 */
@GodotBaseType
public open class VisualShaderNodeUVFunc : VisualShaderNode() {
  /**
   * A function to be applied to the texture coordinates. See [enum Function] for options.
   */
  public var function: Function
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFunctionPtr, LONG)
      return VisualShaderNodeUVFunc.Function.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFunctionPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEUVFUNC, scriptIndex)
    return true
  }

  public enum class Function(
    id: Long,
  ) {
    /**
     * Translates `uv` by using `scale` and `offset` values using the following formula: `uv = uv + offset * scale`. `uv` port is connected to `UV` built-in by default.
     */
    FUNC_PANNING(0),
    /**
     * Scales `uv` by using `scale` and `pivot` values using the following formula: `uv = (uv - pivot) * scale + pivot`. `uv` port is connected to `UV` built-in by default.
     */
    FUNC_SCALING(1),
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
        TypeManager.getMethodBindPtr("VisualShaderNodeUVFunc", "set_function")

    public val getFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeUVFunc", "get_function")
  }
}
