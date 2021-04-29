// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.String
import kotlin.Suppress

/**
 * A custom visual shader graph expression written in Godot Shading Language.
 *
 * Custom Godot Shading Language expression, with a custom amount of input and output ports.
 *
 * The provided code is directly injected into the graph's matching shader function (`vertex`, `fragment`, or `light`), so it cannot be used to declare functions, varyings, uniforms, or global constants. See [godot.VisualShaderNodeGlobalExpression] for such global definitions.
 */
@GodotBaseType
open class VisualShaderNodeExpression : VisualShaderNodeGroupBase() {
  /**
   * An expression in Godot Shading Language, which will be injected at the start of the graph's matching shader function (`vertex`, `fragment`, or `light`), and thus cannot be used to declare functions, varyings, uniforms, or global constants.
   */
  open var expression: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEEXPRESSION_GET_EXPRESSION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEEXPRESSION_SET_EXPRESSION, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_VISUALSHADERNODEEXPRESSION)
  }
}
