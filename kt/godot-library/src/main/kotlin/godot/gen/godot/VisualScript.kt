// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class VisualScript : Script() {
  val nodePortsChanged: Signal2<String, Long> by signal("function", "id")

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_VISUALSCRIPT)

  open fun _get_data(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_data is not implemented for VisualScript")
  }

  open fun _node_ports_changed(arg0: Long) {
  }

  open fun _set_data(data: Dictionary<Any?, Any?>) {
  }

  open fun addCustomSignal(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_ADD_CUSTOM_SIGNAL, NIL)
  }

  open fun addFunction(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_ADD_FUNCTION, NIL)
  }

  open fun addNode(
    func: String,
    id: Long,
    node: VisualScriptNode,
    position: Vector2 = Vector2(0.0, 0.0)
  ) {
    TransferContext.writeArguments(STRING to func, LONG to id, OBJECT to node, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_ADD_NODE, NIL)
  }

  open fun addVariable(
    name: String,
    defaultValue: Any? = null,
    export: Boolean = false
  ) {
    TransferContext.writeArguments(STRING to name, ANY to defaultValue, BOOL to export)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_ADD_VARIABLE, NIL)
  }

  open fun customSignalAddArgument(
    name: String,
    type: Long,
    argname: String,
    index: Long = -1
  ) {
    TransferContext.writeArguments(STRING to name, LONG to type, STRING to argname, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_ADD_ARGUMENT, NIL)
  }

  open fun customSignalGetArgumentCount(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_GET_ARGUMENT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun customSignalGetArgumentName(name: String, argidx: Long): String {
    TransferContext.writeArguments(STRING to name, LONG to argidx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_GET_ARGUMENT_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun customSignalGetArgumentType(name: String, argidx: Long): VariantType {
    TransferContext.writeArguments(STRING to name, LONG to argidx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_GET_ARGUMENT_TYPE, LONG)
    return VariantType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun customSignalRemoveArgument(name: String, argidx: Long) {
    TransferContext.writeArguments(STRING to name, LONG to argidx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_REMOVE_ARGUMENT, NIL)
  }

  open fun customSignalSetArgumentName(
    name: String,
    argidx: Long,
    argname: String
  ) {
    TransferContext.writeArguments(STRING to name, LONG to argidx, STRING to argname)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_SET_ARGUMENT_NAME, NIL)
  }

  open fun customSignalSetArgumentType(
    name: String,
    argidx: Long,
    type: Long
  ) {
    TransferContext.writeArguments(STRING to name, LONG to argidx, LONG to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_SET_ARGUMENT_TYPE, NIL)
  }

  open fun customSignalSwapArgument(
    name: String,
    argidx: Long,
    withidx: Long
  ) {
    TransferContext.writeArguments(STRING to name, LONG to argidx, LONG to withidx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_SWAP_ARGUMENT, NIL)
  }

  open fun dataConnect(
    func: String,
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ) {
    TransferContext.writeArguments(STRING to func, LONG to fromNode, LONG to fromPort, LONG to
        toNode, LONG to toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_DATA_CONNECT, NIL)
  }

  open fun dataDisconnect(
    func: String,
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ) {
    TransferContext.writeArguments(STRING to func, LONG to fromNode, LONG to fromPort, LONG to
        toNode, LONG to toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_DATA_DISCONNECT, NIL)
  }

  open fun getFunctionNodeId(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_FUNCTION_NODE_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getFunctionScroll(name: String): Vector2 {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_FUNCTION_SCROLL,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getNode(func: String, id: Long): VisualScriptNode? {
    TransferContext.writeArguments(STRING to func, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_NODE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as VisualScriptNode?
  }

  open fun getNodePosition(func: String, id: Long): Vector2 {
    TransferContext.writeArguments(STRING to func, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_NODE_POSITION,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getVariableDefaultValue(name: String): Any? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_VARIABLE_DEFAULT_VALUE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun getVariableExport(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_VARIABLE_EXPORT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun getVariableInfo(name: String): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_VARIABLE_INFO,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  open fun hasCustomSignal(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_HAS_CUSTOM_SIGNAL,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasDataConnection(
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

  open fun hasFunction(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_HAS_FUNCTION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasNode(func: String, id: Long): Boolean {
    TransferContext.writeArguments(STRING to func, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_HAS_NODE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasSequenceConnection(
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

  open fun hasVariable(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_HAS_VARIABLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun removeCustomSignal(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_REMOVE_CUSTOM_SIGNAL,
        NIL)
  }

  open fun removeFunction(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_REMOVE_FUNCTION, NIL)
  }

  open fun removeNode(func: String, id: Long) {
    TransferContext.writeArguments(STRING to func, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_REMOVE_NODE, NIL)
  }

  open fun removeVariable(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_REMOVE_VARIABLE, NIL)
  }

  open fun renameCustomSignal(name: String, newName: String) {
    TransferContext.writeArguments(STRING to name, STRING to newName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_RENAME_CUSTOM_SIGNAL,
        NIL)
  }

  open fun renameFunction(name: String, newName: String) {
    TransferContext.writeArguments(STRING to name, STRING to newName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_RENAME_FUNCTION, NIL)
  }

  open fun renameVariable(name: String, newName: String) {
    TransferContext.writeArguments(STRING to name, STRING to newName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_RENAME_VARIABLE, NIL)
  }

  open fun sequenceConnect(
    func: String,
    fromNode: Long,
    fromOutput: Long,
    toNode: Long
  ) {
    TransferContext.writeArguments(STRING to func, LONG to fromNode, LONG to fromOutput, LONG to
        toNode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SEQUENCE_CONNECT, NIL)
  }

  open fun sequenceDisconnect(
    func: String,
    fromNode: Long,
    fromOutput: Long,
    toNode: Long
  ) {
    TransferContext.writeArguments(STRING to func, LONG to fromNode, LONG to fromOutput, LONG to
        toNode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SEQUENCE_DISCONNECT,
        NIL)
  }

  open fun setFunctionScroll(name: String, ofs: Vector2) {
    TransferContext.writeArguments(STRING to name, VECTOR2 to ofs)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_FUNCTION_SCROLL,
        NIL)
  }

  open fun setInstanceBaseType(type: String) {
    TransferContext.writeArguments(STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_INSTANCE_BASE_TYPE,
        NIL)
  }

  open fun setNodePosition(
    func: String,
    id: Long,
    position: Vector2
  ) {
    TransferContext.writeArguments(STRING to func, LONG to id, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_NODE_POSITION, NIL)
  }

  open fun setVariableDefaultValue(name: String, value: Any) {
    TransferContext.writeArguments(STRING to name, ANY to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_VARIABLE_DEFAULT_VALUE, NIL)
  }

  open fun setVariableExport(name: String, enable: Boolean) {
    TransferContext.writeArguments(STRING to name, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_VARIABLE_EXPORT,
        NIL)
  }

  open fun setVariableInfo(name: String, value: Dictionary<Any?, Any?>) {
    TransferContext.writeArguments(STRING to name, DICTIONARY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_VARIABLE_INFO, NIL)
  }
}
