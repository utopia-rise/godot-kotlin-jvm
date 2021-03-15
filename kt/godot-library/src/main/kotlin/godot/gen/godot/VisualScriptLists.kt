// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class VisualScriptLists : VisualScriptNode() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VISUALSCRIPTLISTS,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun addInputDataPort(
    type: Long,
    name: String,
    index: Long
  ) {
    TransferContext.writeArguments(LONG to type, STRING to name, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_ADD_INPUT_DATA_PORT, NIL)
  }

  open fun addOutputDataPort(
    type: Long,
    name: String,
    index: Long
  ) {
    TransferContext.writeArguments(LONG to type, STRING to name, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_ADD_OUTPUT_DATA_PORT, NIL)
  }

  open fun removeInputDataPort(index: Long) {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_REMOVE_INPUT_DATA_PORT, NIL)
  }

  open fun removeOutputDataPort(index: Long) {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_REMOVE_OUTPUT_DATA_PORT, NIL)
  }

  open fun setInputDataPortName(index: Long, name: String) {
    TransferContext.writeArguments(LONG to index, STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_SET_INPUT_DATA_PORT_NAME, NIL)
  }

  open fun setInputDataPortType(index: Long, type: Long) {
    TransferContext.writeArguments(LONG to index, LONG to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_SET_INPUT_DATA_PORT_TYPE, NIL)
  }

  open fun setOutputDataPortName(index: Long, name: String) {
    TransferContext.writeArguments(LONG to index, STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_SET_OUTPUT_DATA_PORT_NAME, NIL)
  }

  open fun setOutputDataPortType(index: Long, type: Long) {
    TransferContext.writeArguments(LONG to index, LONG to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_SET_OUTPUT_DATA_PORT_TYPE, NIL)
  }
}
