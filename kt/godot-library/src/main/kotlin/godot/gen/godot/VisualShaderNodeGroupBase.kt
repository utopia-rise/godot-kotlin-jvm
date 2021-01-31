// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class VisualShaderNodeGroupBase : VisualShaderNode() {
  open var size: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_GET_SIZE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_SET_SIZE, NIL)
    }

  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODEGROUPBASE)

  open fun size(schedule: Vector2.() -> Unit): Vector2 = size.apply{
      schedule(this)
      size = this
  }


  open fun addInputPort(
    id: Long,
    type: Long,
    name: String
  ) {
    TransferContext.writeArguments(LONG to id, LONG to type, STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_ADD_INPUT_PORT, NIL)
  }

  open fun addOutputPort(
    id: Long,
    type: Long,
    name: String
  ) {
    TransferContext.writeArguments(LONG to id, LONG to type, STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_ADD_OUTPUT_PORT, NIL)
  }

  open fun clearInputPorts() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_CLEAR_INPUT_PORTS, NIL)
  }

  open fun clearOutputPorts() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_CLEAR_OUTPUT_PORTS, NIL)
  }

  open fun getFreeInputPortId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_GET_FREE_INPUT_PORT_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getFreeOutputPortId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_GET_FREE_OUTPUT_PORT_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getInputPortCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_GET_INPUT_PORT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getInputs(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_GET_INPUTS, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getOutputPortCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_GET_OUTPUT_PORT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getOutputs(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_GET_OUTPUTS, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun hasInputPort(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_HAS_INPUT_PORT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasOutputPort(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_HAS_OUTPUT_PORT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isValidPortName(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_IS_VALID_PORT_NAME, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun removeInputPort(id: Long) {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_REMOVE_INPUT_PORT, NIL)
  }

  open fun removeOutputPort(id: Long) {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_REMOVE_OUTPUT_PORT, NIL)
  }

  open fun setInputPortName(id: Long, name: String) {
    TransferContext.writeArguments(LONG to id, STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_SET_INPUT_PORT_NAME, NIL)
  }

  open fun setInputPortType(id: Long, type: Long) {
    TransferContext.writeArguments(LONG to id, LONG to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_SET_INPUT_PORT_TYPE, NIL)
  }

  open fun setInputs(inputs: String) {
    TransferContext.writeArguments(STRING to inputs)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_SET_INPUTS, NIL)
  }

  open fun setOutputPortName(id: Long, name: String) {
    TransferContext.writeArguments(LONG to id, STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_SET_OUTPUT_PORT_NAME, NIL)
  }

  open fun setOutputPortType(id: Long, type: Long) {
    TransferContext.writeArguments(LONG to id, LONG to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_SET_OUTPUT_PORT_TYPE, NIL)
  }

  open fun setOutputs(outputs: String) {
    TransferContext.writeArguments(STRING to outputs)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_SET_OUTPUTS, NIL)
  }
}
