// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
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
    TransferContext.callMethod(rawPtr, MethodBindings.setInputsPtr, NIL)
  }

  /**
   * Returns a [godot.String] description of the input ports as a colon-separated list using the format `id,type,name;` (see [addInputPort]).
   */
  public fun getInputs(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInputsPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Defines all output ports using a [godot.String] formatted as a colon-separated list: `id,type,name;` (see [addOutputPort]).
   */
  public fun setOutputs(outputs: String): Unit {
    TransferContext.writeArguments(STRING to outputs)
    TransferContext.callMethod(rawPtr, MethodBindings.setOutputsPtr, NIL)
  }

  /**
   * Returns a [godot.String] description of the output ports as a colon-separated list using the format `id,type,name;` (see [addOutputPort]).
   */
  public fun getOutputs(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOutputsPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns `true` if the specified port name does not override an existed port name and is valid within the shader.
   */
  public fun isValidPortName(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.isValidPortNamePtr, BOOL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.addInputPortPtr, NIL)
  }

  /**
   * Removes the specified input port.
   */
  public fun removeInputPort(id: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeInputPortPtr, NIL)
  }

  /**
   * Returns the number of input ports in use. Alternative for [getFreeInputPortId].
   */
  public fun getInputPortCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInputPortCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns `true` if the specified input port exists.
   */
  public fun hasInputPort(id: Int): Boolean {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.hasInputPortPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Removes all previously specified input ports.
   */
  public fun clearInputPorts(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearInputPortsPtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.addOutputPortPtr, NIL)
  }

  /**
   * Removes the specified output port.
   */
  public fun removeOutputPort(id: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeOutputPortPtr, NIL)
  }

  /**
   * Returns the number of output ports in use. Alternative for [getFreeOutputPortId].
   */
  public fun getOutputPortCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOutputPortCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns `true` if the specified output port exists.
   */
  public fun hasOutputPort(id: Int): Boolean {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.hasOutputPortPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Removes all previously specified output ports.
   */
  public fun clearOutputPorts(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearOutputPortsPtr, NIL)
  }

  /**
   * Renames the specified input port.
   */
  public fun setInputPortName(id: Int, name: String): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setInputPortNamePtr, NIL)
  }

  /**
   * Sets the specified input port's type (see [enum VisualShaderNode.PortType]).
   */
  public fun setInputPortType(id: Int, type: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), LONG to type.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setInputPortTypePtr, NIL)
  }

  /**
   * Renames the specified output port.
   */
  public fun setOutputPortName(id: Int, name: String): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setOutputPortNamePtr, NIL)
  }

  /**
   * Sets the specified output port's type (see [enum VisualShaderNode.PortType]).
   */
  public fun setOutputPortType(id: Int, type: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), LONG to type.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setOutputPortTypePtr, NIL)
  }

  /**
   * Returns a free input port ID which can be used in [addInputPort].
   */
  public fun getFreeInputPortId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFreeInputPortIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns a free output port ID which can be used in [addOutputPort].
   */
  public fun getFreeOutputPortId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFreeOutputPortIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val setInputsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "set_inputs")

    public val getInputsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "get_inputs")

    public val setOutputsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "set_outputs")

    public val getOutputsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "get_outputs")

    public val isValidPortNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "is_valid_port_name")

    public val addInputPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "add_input_port")

    public val removeInputPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "remove_input_port")

    public val getInputPortCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "get_input_port_count")

    public val hasInputPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "has_input_port")

    public val clearInputPortsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "clear_input_ports")

    public val addOutputPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "add_output_port")

    public val removeOutputPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "remove_output_port")

    public val getOutputPortCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "get_output_port_count")

    public val hasOutputPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "has_output_port")

    public val clearOutputPortsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "clear_output_ports")

    public val setInputPortNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "set_input_port_name")

    public val setInputPortTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "set_input_port_type")

    public val setOutputPortNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "set_output_port_name")

    public val setOutputPortTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "set_output_port_type")

    public val getFreeInputPortIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "get_free_input_port_id")

    public val getFreeOutputPortIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "get_free_output_port_id")
  }
}
