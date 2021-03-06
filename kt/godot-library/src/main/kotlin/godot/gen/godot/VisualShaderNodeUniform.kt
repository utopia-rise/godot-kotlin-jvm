// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.String
import kotlin.Suppress

/**
 * A base type for the uniforms within the visual shader graph.
 *
 * A uniform represents a variable in the shader which is set externally, i.e. from the [godot.ShaderMaterial]. Uniforms are exposed as properties in the [godot.ShaderMaterial] and can be assigned from the inspector or from a script.
 */
@GodotBaseType
open class VisualShaderNodeUniform : VisualShaderNode() {
  /**
   * Name of the uniform, by which it can be accessed through the [godot.ShaderMaterial] properties.
   */
  open var uniformName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEUNIFORM_GET_UNIFORM_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEUNIFORM_SET_UNIFORM_NAME, NIL)
    }

  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODEUNIFORM)
}
