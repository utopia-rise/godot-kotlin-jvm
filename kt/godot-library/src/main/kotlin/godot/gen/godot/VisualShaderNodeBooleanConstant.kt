// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Suppress

/**
 * A boolean constant to be used within the visual shader graph.
 *
 * Has only one output port and no inputs.
 *
 * Translated to `bool` in the shader language.
 */
@GodotBaseType
open class VisualShaderNodeBooleanConstant : VisualShaderNode() {
  /**
   * A boolean constant which represents a state of this node.
   */
  open var constant: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEBOOLEANCONSTANT_GET_CONSTANT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEBOOLEANCONSTANT_SET_CONSTANT, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODEBOOLEANCONSTANT)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}
