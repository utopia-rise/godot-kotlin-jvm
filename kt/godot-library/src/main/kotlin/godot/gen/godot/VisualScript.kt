// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.TransferContext
import godot.core.VariantType
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class VisualScript : Script() {
  public val nodePortsChanged: Signal2<String, Long> by signal("function", "id")

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSCRIPT)
  }

  public open fun _getData(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_data is not implemented for VisualScript")
  }

  public open fun _nodePortsChanged(arg0: Long): Unit {
  }

  public open fun _setData(`data`: Dictionary<Any?, Any?>): Unit {
  }

  public open fun addCustomSignal(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_ADD_CUSTOM_SIGNAL, NIL)
  }

  public open fun addFunction(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_ADD_FUNCTION, NIL)
  }

  public open fun addNode(
    func: String,
    id: Long,
    node: VisualScriptNode,
    position: Vector2 = Vector2(0.0, 0.0)
  ): Unit {
    TransferContext.writeArguments(STRING to func, LONG to id, OBJECT to node, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_ADD_NODE, NIL)
  }

  public open fun addVariable(
    name: String,
    defaultValue: Any? = null,
    export: Boolean = false
  ): Unit {
    TransferContext.writeArguments(STRING to name, ANY to defaultValue, BOOL to export)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_ADD_VARIABLE, NIL)
  }

  public open fun customSignalAddArgument(
    name: String,
    type: Long,
    argname: String,
    index: Long = -1
  ): Unit {
    TransferContext.writeArguments(STRING to name, LONG to type, STRING to argname, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_ADD_ARGUMENT, NIL)
  }

  public open fun customSignalGetArgumentCount(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_GET_ARGUMENT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public open fun customSignalGetArgumentName(name: String, argidx: Long): String {
    TransferContext.writeArguments(STRING to name, LONG to argidx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_GET_ARGUMENT_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public open fun customSignalGetArgumentType(name: String, argidx: Long): VariantType {
    TransferContext.writeArguments(STRING to name, LONG to argidx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_GET_ARGUMENT_TYPE, LONG)
    return VariantType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public open fun customSignalRemoveArgument(name: String, argidx: Long): Unit {
    TransferContext.writeArguments(STRING to name, LONG to argidx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_REMOVE_ARGUMENT, NIL)
  }

  public open fun customSignalSetArgumentName(
    name: String,
    argidx: Long,
    argname: String
  ): Unit {
    TransferContext.writeArguments(STRING to name, LONG to argidx, STRING to argname)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_SET_ARGUMENT_NAME, NIL)
  }

  public open fun customSignalSetArgumentType(
    name: String,
    argidx: Long,
    type: Long
  ): Unit {
    TransferContext.writeArguments(STRING to name, LONG to argidx, LONG to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_SET_ARGUMENT_TYPE, NIL)
  }

  public open fun customSignalSwapArgument(
    name: String,
    argidx: Long,
    withidx: Long
  ): Unit {
    TransferContext.writeArguments(STRING to name, LONG to argidx, LONG to withidx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_SWAP_ARGUMENT, NIL)
  }

  public open fun dataConnect(
    func: String,
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ): Unit {
    TransferContext.writeArguments(STRING to func, LONG to fromNode, LONG to fromPort, LONG to
        toNode, LONG to toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_DATA_CONNECT, NIL)
  }

  public open fun dataDisconnect(
    func: String,
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ): Unit {
    TransferContext.writeArguments(STRING to func, LONG to fromNode, LONG to fromPort, LONG to
        toNode, LONG to toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_DATA_DISCONNECT, NIL)
  }

  public open fun getFunctionNodeId(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_FUNCTION_NODE_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public open fun getFunctionScroll(name: String): Vector2 {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_FUNCTION_SCROLL,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  public open fun getNode(func: String, id: Long): VisualScriptNode? {
    TransferContext.writeArguments(STRING to func, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_NODE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as VisualScriptNode?
  }

  public open fun getNodePosition(func: String, id: Long): Vector2 {
    TransferContext.writeArguments(STRING to func, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_NODE_POSITION,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  public open fun getVariableDefaultValue(name: String): Any? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_VARIABLE_DEFAULT_VALUE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  public open fun getVariableExport(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_VARIABLE_EXPORT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public open fun getVariableInfo(name: String): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_VARIABLE_INFO,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  public open fun hasCustomSignal(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_HAS_CUSTOM_SIGNAL,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public open fun hasDataConnection(
    func: String,
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ): Boolean {
    TransferContext.writeArguments(STRING to func, LONG to fromNode, LONG to fromPort, LONG to
        toNode, LONG to toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_HAS_DATA_CONNECTION,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public open fun hasFunction(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_HAS_FUNCTION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public open fun hasNode(func: String, id: Long): Boolean {
    TransferContext.writeArguments(STRING to func, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_HAS_NODE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public open fun hasSequenceConnection(
    func: String,
    fromNode: Long,
    fromOutput: Long,
    toNode: Long
  ): Boolean {
    TransferContext.writeArguments(STRING to func, LONG to fromNode, LONG to fromOutput, LONG to
        toNode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_HAS_SEQUENCE_CONNECTION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public open fun hasVariable(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_HAS_VARIABLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public open fun removeCustomSignal(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_REMOVE_CUSTOM_SIGNAL,
        NIL)
  }

  public open fun removeFunction(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_REMOVE_FUNCTION, NIL)
  }

  public open fun removeNode(func: String, id: Long): Unit {
    TransferContext.writeArguments(STRING to func, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_REMOVE_NODE, NIL)
  }

  public open fun removeVariable(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_REMOVE_VARIABLE, NIL)
  }

  public open fun renameCustomSignal(name: String, newName: String): Unit {
    TransferContext.writeArguments(STRING to name, STRING to newName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_RENAME_CUSTOM_SIGNAL,
        NIL)
  }

  public open fun renameFunction(name: String, newName: String): Unit {
    TransferContext.writeArguments(STRING to name, STRING to newName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_RENAME_FUNCTION, NIL)
  }

  public open fun renameVariable(name: String, newName: String): Unit {
    TransferContext.writeArguments(STRING to name, STRING to newName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_RENAME_VARIABLE, NIL)
  }

  public open fun sequenceConnect(
    func: String,
    fromNode: Long,
    fromOutput: Long,
    toNode: Long
  ): Unit {
    TransferContext.writeArguments(STRING to func, LONG to fromNode, LONG to fromOutput, LONG to
        toNode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SEQUENCE_CONNECT, NIL)
  }

  public open fun sequenceDisconnect(
    func: String,
    fromNode: Long,
    fromOutput: Long,
    toNode: Long
  ): Unit {
    TransferContext.writeArguments(STRING to func, LONG to fromNode, LONG to fromOutput, LONG to
        toNode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SEQUENCE_DISCONNECT,
        NIL)
  }

  public open fun setFunctionScroll(name: String, ofs: Vector2): Unit {
    TransferContext.writeArguments(STRING to name, VECTOR2 to ofs)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_FUNCTION_SCROLL,
        NIL)
  }

  public open fun setInstanceBaseType(type: String): Unit {
    TransferContext.writeArguments(STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_INSTANCE_BASE_TYPE,
        NIL)
  }

  public open fun setNodePosition(
    func: String,
    id: Long,
    position: Vector2
  ): Unit {
    TransferContext.writeArguments(STRING to func, LONG to id, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_NODE_POSITION, NIL)
  }

  public open fun setVariableDefaultValue(name: String, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING to name, ANY to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_VARIABLE_DEFAULT_VALUE, NIL)
  }

  public open fun setVariableExport(name: String, enable: Boolean): Unit {
    TransferContext.writeArguments(STRING to name, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_VARIABLE_EXPORT,
        NIL)
  }

  public open fun setVariableInfo(name: String, `value`: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(STRING to name, DICTIONARY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_VARIABLE_INFO, NIL)
  }
}
