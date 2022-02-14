// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING_NAME
import kotlin.Suppress
import kotlin.Unit

/**
 * A reference to an existing [godot.VisualShaderNodeUniform].
 *
 * Creating a reference to a [godot.VisualShaderNodeUniform] allows you to reuse this uniform in different shaders or shader stages easily.
 */
@GodotBaseType
public open class VisualShaderNodeUniformRef : VisualShaderNode() {
  /**
   * The name of the uniform which this reference points to.
   */
  public open var uniformName: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEUNIFORMREF_GET_UNIFORM_NAME, STRING_NAME)
      return TransferContext.readReturnValue(STRING_NAME, false) as StringName
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEUNIFORMREF_SET_UNIFORM_NAME, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEUNIFORMREF)
  }

  public companion object
}
