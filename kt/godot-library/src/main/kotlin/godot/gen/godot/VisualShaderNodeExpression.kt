// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

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
  public var expression: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExpressionPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setExpressionPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEEXPRESSION, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setExpressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeExpression", "set_expression")

    public val getExpressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeExpression", "get_expression")
  }
}
