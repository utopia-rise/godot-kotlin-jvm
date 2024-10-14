// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.TypeManager
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.core.memory.TransferContext
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Custom Godot Shading Language expression, with a custom number of input and output ports.
 * The provided code is directly injected into the graph's matching shader function (`vertex`,
 * `fragment`, or `light`), so it cannot be used to declare functions, varyings, uniforms, or global
 * constants. See [VisualShaderNodeGlobalExpression] for such global definitions.
 */
@GodotBaseType
public open class VisualShaderNodeExpression : VisualShaderNodeGroupBase() {
  /**
   * An expression in Godot Shading Language, which will be injected at the start of the graph's
   * matching shader function (`vertex`, `fragment`, or `light`), and thus cannot be used to declare
   * functions, varyings, uniforms, or global constants.
   */
  public final inline var expression: String
    @JvmName("expressionProperty")
    get() = getExpression()
    @JvmName("expressionProperty")
    set(`value`) {
      setExpression(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEEXPRESSION, scriptIndex)
  }

  public final fun setExpression(expression: String): Unit {
    TransferContext.writeArguments(STRING to expression)
    TransferContext.callMethod(ptr, MethodBindings.setExpressionPtr, NIL)
  }

  public final fun getExpression(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getExpressionPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public companion object

  internal object MethodBindings {
    public val setExpressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeExpression", "set_expression", 83702148)

    public val getExpressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeExpression", "get_expression", 201670096)
  }
}
