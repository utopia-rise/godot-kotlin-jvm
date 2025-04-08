// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Currently, has no direct usage, use the derived classes instead.
 */
@GodotBaseType
public open class VisualShaderNodeGroupBase internal constructor() : VisualShaderNodeResizableBase()
    {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(757, scriptIndex)
  }

  /**
   * Defines all input ports using a [String] formatted as a colon-separated list: `id,type,name;`
   * (see [addInputPort]).
   */
  public final fun setInputs(inputs: String): Unit {
    TransferContext.writeArguments(STRING to inputs)
    TransferContext.callMethod(ptr, MethodBindings.setInputsPtr, NIL)
  }

  /**
   * Returns a [String] description of the input ports as a colon-separated list using the format
   * `id,type,name;` (see [addInputPort]).
   */
  public final fun getInputs(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInputsPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Defines all output ports using a [String] formatted as a colon-separated list: `id,type,name;`
   * (see [addOutputPort]).
   */
  public final fun setOutputs(outputs: String): Unit {
    TransferContext.writeArguments(STRING to outputs)
    TransferContext.callMethod(ptr, MethodBindings.setOutputsPtr, NIL)
  }

  /**
   * Returns a [String] description of the output ports as a colon-separated list using the format
   * `id,type,name;` (see [addOutputPort]).
   */
  public final fun getOutputs(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOutputsPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if the specified port name does not override an existed port name and is valid
   * within the shader.
   */
  public final fun isValidPortName(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.isValidPortNamePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds an input port with the specified [type] (see [VisualShaderNode.PortType]) and [name].
   */
  public final fun addInputPort(
    id: Int,
    type: Int,
    name: String,
  ): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), LONG to type.toLong(), STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.addInputPortPtr, NIL)
  }

  /**
   * Removes the specified input port.
   */
  public final fun removeInputPort(id: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeInputPortPtr, NIL)
  }

  /**
   * Returns the number of input ports in use. Alternative for [getFreeInputPortId].
   */
  public final fun getInputPortCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInputPortCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the specified input port exists.
   */
  public final fun hasInputPort(id: Int): Boolean {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.hasInputPortPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Removes all previously specified input ports.
   */
  public final fun clearInputPorts(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearInputPortsPtr, NIL)
  }

  /**
   * Adds an output port with the specified [type] (see [VisualShaderNode.PortType]) and [name].
   */
  public final fun addOutputPort(
    id: Int,
    type: Int,
    name: String,
  ): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), LONG to type.toLong(), STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.addOutputPortPtr, NIL)
  }

  /**
   * Removes the specified output port.
   */
  public final fun removeOutputPort(id: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeOutputPortPtr, NIL)
  }

  /**
   * Returns the number of output ports in use. Alternative for [getFreeOutputPortId].
   */
  public final fun getOutputPortCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOutputPortCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the specified output port exists.
   */
  public final fun hasOutputPort(id: Int): Boolean {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.hasOutputPortPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Removes all previously specified output ports.
   */
  public final fun clearOutputPorts(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearOutputPortsPtr, NIL)
  }

  /**
   * Renames the specified input port.
   */
  public final fun setInputPortName(id: Int, name: String): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.setInputPortNamePtr, NIL)
  }

  /**
   * Sets the specified input port's type (see [VisualShaderNode.PortType]).
   */
  public final fun setInputPortType(id: Int, type: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), LONG to type.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setInputPortTypePtr, NIL)
  }

  /**
   * Renames the specified output port.
   */
  public final fun setOutputPortName(id: Int, name: String): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.setOutputPortNamePtr, NIL)
  }

  /**
   * Sets the specified output port's type (see [VisualShaderNode.PortType]).
   */
  public final fun setOutputPortType(id: Int, type: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), LONG to type.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setOutputPortTypePtr, NIL)
  }

  /**
   * Returns a free input port ID which can be used in [addInputPort].
   */
  public final fun getFreeInputPortId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFreeInputPortIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns a free output port ID which can be used in [addOutputPort].
   */
  public final fun getFreeOutputPortId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFreeOutputPortIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  public object MethodBindings {
    internal val setInputsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "set_inputs", 83702148)

    internal val getInputsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "get_inputs", 201670096)

    internal val setOutputsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "set_outputs", 83702148)

    internal val getOutputsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "get_outputs", 201670096)

    internal val isValidPortNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "is_valid_port_name", 3927539163)

    internal val addInputPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "add_input_port", 2285447957)

    internal val removeInputPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "remove_input_port", 1286410249)

    internal val getInputPortCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "get_input_port_count", 3905245786)

    internal val hasInputPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "has_input_port", 1116898809)

    internal val clearInputPortsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "clear_input_ports", 3218959716)

    internal val addOutputPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "add_output_port", 2285447957)

    internal val removeOutputPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "remove_output_port", 1286410249)

    internal val getOutputPortCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "get_output_port_count", 3905245786)

    internal val hasOutputPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "has_output_port", 1116898809)

    internal val clearOutputPortsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "clear_output_ports", 3218959716)

    internal val setInputPortNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "set_input_port_name", 501894301)

    internal val setInputPortTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "set_input_port_type", 3937882851)

    internal val setOutputPortNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "set_output_port_name", 501894301)

    internal val setOutputPortTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "set_output_port_type", 3937882851)

    internal val getFreeInputPortIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "get_free_input_port_id", 3905245786)

    internal val getFreeOutputPortIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeGroupBase", "get_free_output_port_id", 3905245786)
  }
}
