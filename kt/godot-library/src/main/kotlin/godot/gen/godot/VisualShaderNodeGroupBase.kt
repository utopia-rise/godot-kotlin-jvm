// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for a family of nodes with variable number of input and output ports within the visual shader graph.
 *
 * Currently, has no direct usage, use the derived classes instead.
 */
@GodotBaseType
public open class VisualShaderNodeGroupBase internal constructor() : VisualShaderNodeResizableBase()
    {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEGROUPBASE, scriptIndex)
    return true
  }

  /**
   * Defines all input ports using a [godot.String] formatted as a colon-separated list: `id,type,name;` (see [addInputPort]).
   */
  public fun setInputs(inputs: String): Unit {
    TransferContext.writeArguments(STRING to inputs)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_SET_INPUTS, NIL)
  }

  /**
   * Returns a [godot.String] description of the input ports as a colon-separated list using the format `id,type,name;` (see [addInputPort]).
   */
  public fun getInputs(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_GET_INPUTS, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Defines all output ports using a [godot.String] formatted as a colon-separated list: `id,type,name;` (see [addOutputPort]).
   */
  public fun setOutputs(outputs: String): Unit {
    TransferContext.writeArguments(STRING to outputs)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_SET_OUTPUTS, NIL)
  }

  /**
   * Returns a [godot.String] description of the output ports as a colon-separated list using the format `id,type,name;` (see [addOutputPort]).
   */
  public fun getOutputs(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_GET_OUTPUTS, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns `true` if the specified port name does not override an existed port name and is valid within the shader.
   */
  public fun isValidPortName(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_IS_VALID_PORT_NAME, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds an input port with the specified [type] (see [enum VisualShaderNode.PortType]) and [name].
   */
  public fun addInputPort(
    id: Int,
    type: Int,
    name: String,
  ): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), LONG to type.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_ADD_INPUT_PORT, NIL)
  }

  /**
   * Removes the specified input port.
   */
  public fun removeInputPort(id: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_REMOVE_INPUT_PORT, NIL)
  }

  /**
   * Returns the number of input ports in use. Alternative for [getFreeInputPortId].
   */
  public fun getInputPortCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_GET_INPUT_PORT_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns `true` if the specified input port exists.
   */
  public fun hasInputPort(id: Int): Boolean {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_HAS_INPUT_PORT, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Removes all previously specified input ports.
   */
  public fun clearInputPorts(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_CLEAR_INPUT_PORTS, NIL)
  }

  /**
   * Adds an output port with the specified [type] (see [enum VisualShaderNode.PortType]) and [name].
   */
  public fun addOutputPort(
    id: Int,
    type: Int,
    name: String,
  ): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), LONG to type.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_ADD_OUTPUT_PORT, NIL)
  }

  /**
   * Removes the specified output port.
   */
  public fun removeOutputPort(id: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_REMOVE_OUTPUT_PORT, NIL)
  }

  /**
   * Returns the number of output ports in use. Alternative for [getFreeOutputPortId].
   */
  public fun getOutputPortCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_GET_OUTPUT_PORT_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns `true` if the specified output port exists.
   */
  public fun hasOutputPort(id: Int): Boolean {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_HAS_OUTPUT_PORT, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Removes all previously specified output ports.
   */
  public fun clearOutputPorts(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_CLEAR_OUTPUT_PORTS, NIL)
  }

  /**
   * Renames the specified input port.
   */
  public fun setInputPortName(id: Int, name: String): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_SET_INPUT_PORT_NAME, NIL)
  }

  /**
   * Sets the specified input port's type (see [enum VisualShaderNode.PortType]).
   */
  public fun setInputPortType(id: Int, type: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), LONG to type.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_SET_INPUT_PORT_TYPE, NIL)
  }

  /**
   * Renames the specified output port.
   */
  public fun setOutputPortName(id: Int, name: String): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_SET_OUTPUT_PORT_NAME, NIL)
  }

  /**
   * Sets the specified output port's type (see [enum VisualShaderNode.PortType]).
   */
  public fun setOutputPortType(id: Int, type: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), LONG to type.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_SET_OUTPUT_PORT_TYPE, NIL)
  }

  /**
   * Returns a free input port ID which can be used in [addInputPort].
   */
  public fun getFreeInputPortId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_GET_FREE_INPUT_PORT_ID, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns a free output port ID which can be used in [addOutputPort].
   */
  public fun getFreeOutputPortId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEGROUPBASE_GET_FREE_OUTPUT_PORT_ID, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object
}
