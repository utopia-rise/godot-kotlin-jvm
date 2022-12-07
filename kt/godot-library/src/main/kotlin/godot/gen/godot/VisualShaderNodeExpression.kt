// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A custom visual shader graph expression written in Godot Shading Language.
 *
 * Custom Godot Shading Language expression, with a custom number of input and output ports.
 *
 * The provided code is directly injected into the graph's matching shader function (`vertex`, `fragment`, or `light`), so it cannot be used to declare functions, varyings, uniforms, or global constants. See [godot.VisualShaderNodeGlobalExpression] for such global definitions.
 */
@GodotBaseType
public open class VisualShaderNodeExpression : VisualShaderNodeGroupBase() {
  /**
   * An expression in Godot Shading Language, which will be injected at the start of the graph's matching shader function (`vertex`, `fragment`, or `light`), and thus cannot be used to declare functions, varyings, uniforms, or global constants.
   */
  public var expression: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEEXPRESSION_GET_EXPRESSION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEEXPRESSION_SET_EXPRESSION, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEEXPRESSION)
  }

  public companion object
}
