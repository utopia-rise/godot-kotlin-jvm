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

@GodotBaseType
open class VisualShaderNodeUniform : VisualShaderNode() {
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
