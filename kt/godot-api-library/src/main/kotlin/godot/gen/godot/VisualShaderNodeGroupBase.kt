// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
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
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEGROUPBASE_INDEX, scriptIndex)
  }

  /**
   * Defines all input ports using a [String] formatted as a colon-separated list: `id,type,name;`
   * (see [addInputPort]).
   */
  public final fun setInputs(inputs: String): Unit {
    Internals.writeArguments(STRING to inputs)
    Internals.callMethod(rawPtr, MethodBindings.setInputsPtr, NIL)
  }

  /**
   * Returns a [String] description of the input ports as a colon-separated list using the format
   * `id,type,name;` (see [addInputPort]).
   */
  public final fun getInputs(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getInputsPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Defines all output ports using a [String] formatted as a colon-separated list: `id,type,name;`
   * (see [addOutputPort]).
   */
  public final fun setOutputs(outputs: String): Unit {
    Internals.writeArguments(STRING to outputs)
    Internals.callMethod(rawPtr, MethodBindings.setOutputsPtr, NIL)
  }

  /**
   * Returns a [String] description of the output ports as a colon-separated list using the format
   * `id,type,name;` (see [addOutputPort]).
   */
  public final fun getOutputs(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOutputsPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if the specified port name does not override an existed port name and is valid
   * within the shader.
   */
  public final fun isValidPortName(name: String): Boolean {
    Internals.writeArguments(STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.isValidPortNamePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds an input port with the specified [type] (see [VisualShaderNode.PortType]) and [name].
   */
  public final fun addInputPort(
    id: Int,
    type: Int,
    name: String,
  ): Unit {
    Internals.writeArguments(LONG to id.toLong(), LONG to type.toLong(), STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.addInputPortPtr, NIL)
  }

  /**
   * Removes the specified input port.
   */
  public final fun removeInputPort(id: Int): Unit {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.removeInputPortPtr, NIL)
  }

  /**
   * Returns the number of input ports in use. Alternative for [getFreeInputPortId].
   */
  public final fun getInputPortCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getInputPortCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the specified input port exists.
   */
  public final fun hasInputPort(id: Int): Boolean {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.hasInputPortPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Removes all previously specified input ports.
   */
  public final fun clearInputPorts(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearInputPortsPtr, NIL)
  }

  /**
   * Adds an output port with the specified [type] (see [VisualShaderNode.PortType]) and [name].
   */
  public final fun addOutputPort(
    id: Int,
    type: Int,
    name: String,
  ): Unit {
    Internals.writeArguments(LONG to id.toLong(), LONG to type.toLong(), STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.addOutputPortPtr, NIL)
  }

  /**
   * Removes the specified output port.
   */
  public final fun removeOutputPort(id: Int): Unit {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.removeOutputPortPtr, NIL)
  }

  /**
   * Returns the number of output ports in use. Alternative for [getFreeOutputPortId].
   */
  public final fun getOutputPortCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOutputPortCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the specified output port exists.
   */
  public final fun hasOutputPort(id: Int): Boolean {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.hasOutputPortPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Removes all previously specified output ports.
   */
  public final fun clearOutputPorts(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearOutputPortsPtr, NIL)
  }

  /**
   * Renames the specified input port.
   */
  public final fun setInputPortName(id: Int, name: String): Unit {
    Internals.writeArguments(LONG to id.toLong(), STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.setInputPortNamePtr, NIL)
  }

  /**
   * Sets the specified input port's type (see [VisualShaderNode.PortType]).
   */
  public final fun setInputPortType(id: Int, type: Int): Unit {
    Internals.writeArguments(LONG to id.toLong(), LONG to type.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setInputPortTypePtr, NIL)
  }

  /**
   * Renames the specified output port.
   */
  public final fun setOutputPortName(id: Int, name: String): Unit {
    Internals.writeArguments(LONG to id.toLong(), STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.setOutputPortNamePtr, NIL)
  }

  /**
   * Sets the specified output port's type (see [VisualShaderNode.PortType]).
   */
  public final fun setOutputPortType(id: Int, type: Int): Unit {
    Internals.writeArguments(LONG to id.toLong(), LONG to type.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setOutputPortTypePtr, NIL)
  }

  /**
   * Returns a free input port ID which can be used in [addInputPort].
   */
  public final fun getFreeInputPortId(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFreeInputPortIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns a free output port ID which can be used in [addOutputPort].
   */
  public final fun getFreeOutputPortId(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFreeOutputPortIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val setInputsPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeGroupBase", "set_inputs", 83702148)

    public val getInputsPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeGroupBase", "get_inputs", 201670096)

    public val setOutputsPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeGroupBase", "set_outputs", 83702148)

    public val getOutputsPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeGroupBase", "get_outputs", 201670096)

    public val isValidPortNamePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeGroupBase", "is_valid_port_name", 3927539163)

    public val addInputPortPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeGroupBase", "add_input_port", 2285447957)

    public val removeInputPortPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeGroupBase", "remove_input_port", 1286410249)

    public val getInputPortCountPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeGroupBase", "get_input_port_count", 3905245786)

    public val hasInputPortPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeGroupBase", "has_input_port", 1116898809)

    public val clearInputPortsPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeGroupBase", "clear_input_ports", 3218959716)

    public val addOutputPortPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeGroupBase", "add_output_port", 2285447957)

    public val removeOutputPortPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeGroupBase", "remove_output_port", 1286410249)

    public val getOutputPortCountPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeGroupBase", "get_output_port_count", 3905245786)

    public val hasOutputPortPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeGroupBase", "has_output_port", 1116898809)

    public val clearOutputPortsPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeGroupBase", "clear_output_ports", 3218959716)

    public val setInputPortNamePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeGroupBase", "set_input_port_name", 501894301)

    public val setInputPortTypePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeGroupBase", "set_input_port_type", 3937882851)

    public val setOutputPortNamePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeGroupBase", "set_output_port_name", 501894301)

    public val setOutputPortTypePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeGroupBase", "set_output_port_type", 3937882851)

    public val getFreeInputPortIdPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeGroupBase", "get_free_input_port_id", 3905245786)

    public val getFreeOutputPortIdPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeGroupBase", "get_free_output_port_id", 3905245786)
  }
}
