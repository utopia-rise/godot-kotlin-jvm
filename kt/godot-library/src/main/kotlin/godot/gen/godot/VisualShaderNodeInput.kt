// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.signal
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class VisualShaderNodeInput : VisualShaderNode() {
  val inputTypeChanged: Signal0 by signal()

  open var inputName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEINPUT_GET_INPUT_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEINPUT_SET_INPUT_NAME, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODEINPUT)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun getInputRealName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEINPUT_GET_INPUT_REAL_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }
}
