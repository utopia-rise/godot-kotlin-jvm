// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for a family of nodes with variable amount of input and output ports within the visual shader graph.
 * 
 * Currently, has no direct usage, use the derived classes instead.
 */
@GodotBaseType
open class VisualShaderNodeGroupBase : VisualShaderNode() {
  /**
   * The size of the node in the visual shader graph.
   */
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

  override fun __new() {
    callConstructor(ENGINECLASS_VISUALSHADERNODEGROUPBASE)
  }

  open fun size(schedule: Vector2.() -> Unit): Vector2 = size.apply{
      schedule(this)
      size = this
  }


  /**
   * Adds an input port with the specified `type` (see [enum VisualShaderNode.PortType]) and `name`.
   */
  open fun addInputPort(
    id: Long,
    type: Long,
    name: String
  ) {
    TransferContext.writeArguments(LONG to id, LONG to type, STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_ADD_INPUT_PORT, NIL)
  }

  /**
   * Adds an output port with the specified `type` (see [enum VisualShaderNode.PortType]) and `name`.
   */
  open fun addOutputPort(
    id: Long,
    type: Long,
    name: String
  ) {
    TransferContext.writeArguments(LONG to id, LONG to type, STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_ADD_OUTPUT_PORT, NIL)
  }

  /**
   * Removes all previously specified input ports.
   */
  open fun clearInputPorts() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_CLEAR_INPUT_PORTS, NIL)
  }

  /**
   * Removes all previously specified output ports.
   */
  open fun clearOutputPorts() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_CLEAR_OUTPUT_PORTS, NIL)
  }

  /**
   * Returns a free input port ID which can be used in [addInputPort].
   */
  open fun getFreeInputPortId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_GET_FREE_INPUT_PORT_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a free output port ID which can be used in [addOutputPort].
   */
  open fun getFreeOutputPortId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_GET_FREE_OUTPUT_PORT_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of input ports in use. Alternative for [getFreeInputPortId].
   */
  open fun getInputPortCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_GET_INPUT_PORT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a [godot.String] description of the input ports as as colon-separated list using the format `id,type,name;` (see [addInputPort]).
   */
  open fun getInputs(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_GET_INPUTS, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the number of output ports in use. Alternative for [getFreeOutputPortId].
   */
  open fun getOutputPortCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_GET_OUTPUT_PORT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a [godot.String] description of the output ports as as colon-separated list using the format `id,type,name;` (see [addOutputPort]).
   */
  open fun getOutputs(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_GET_OUTPUTS, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if the specified input port exists.
   */
  open fun hasInputPort(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_HAS_INPUT_PORT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the specified output port exists.
   */
  open fun hasOutputPort(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_HAS_OUTPUT_PORT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the specified port name does not override an existed port name and is valid within the shader.
   */
  open fun isValidPortName(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_IS_VALID_PORT_NAME, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes the specified input port.
   */
  open fun removeInputPort(id: Long) {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_REMOVE_INPUT_PORT, NIL)
  }

  /**
   * Removes the specified output port.
   */
  open fun removeOutputPort(id: Long) {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_REMOVE_OUTPUT_PORT, NIL)
  }

  /**
   * Renames the specified input port.
   */
  open fun setInputPortName(id: Long, name: String) {
    TransferContext.writeArguments(LONG to id, STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_SET_INPUT_PORT_NAME, NIL)
  }

  /**
   * Sets the specified input port's type (see [enum VisualShaderNode.PortType]).
   */
  open fun setInputPortType(id: Long, type: Long) {
    TransferContext.writeArguments(LONG to id, LONG to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_SET_INPUT_PORT_TYPE, NIL)
  }

  /**
   * Defines all input ports using a [godot.String] formatted as a colon-separated list: `id,type,name;` (see [addInputPort]).
   */
  open fun setInputs(inputs: String) {
    TransferContext.writeArguments(STRING to inputs)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_SET_INPUTS, NIL)
  }

  /**
   * Renames the specified output port.
   */
  open fun setOutputPortName(id: Long, name: String) {
    TransferContext.writeArguments(LONG to id, STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_SET_OUTPUT_PORT_NAME, NIL)
  }

  /**
   * Sets the specified output port's type (see [enum VisualShaderNode.PortType]).
   */
  open fun setOutputPortType(id: Long, type: Long) {
    TransferContext.writeArguments(LONG to id, LONG to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_SET_OUTPUT_PORT_TYPE, NIL)
  }

  /**
   * Defines all output ports using a [godot.String] formatted as a colon-separated list: `id,type,name;` (see [addOutputPort]).
   */
  open fun setOutputs(outputs: String) {
    TransferContext.writeArguments(STRING to outputs)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_SET_OUTPUTS, NIL)
  }
}
