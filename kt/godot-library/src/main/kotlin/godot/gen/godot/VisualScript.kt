// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.Variant
import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class VisualScript : Script() {
  public val nodePortsChanged: Signal1<Long> by signal("id")

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSCRIPT)
  }

  public open fun addFunction(name: StringName, funcNodeId: Long): Unit {
    TransferContext.writeArguments(STRING_NAME to name, LONG to funcNodeId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_ADD_FUNCTION, NIL)
  }

  public open fun hasFunction(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_HAS_FUNCTION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public open fun removeFunction(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_REMOVE_FUNCTION, NIL)
  }

  public open fun renameFunction(name: StringName, newName: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to newName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_RENAME_FUNCTION, NIL)
  }

  public open fun setScroll(ofs: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to ofs)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_SCROLL, NIL)
  }

  public open fun getScroll(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_SCROLL, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  public open fun addNode(
    id: Long,
    node: VisualScriptNode,
    position: Vector2 = Vector2Vector2(0.0, 0.0)
  ): Unit {
    TransferContext.writeArguments(LONG to id, OBJECT to node, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_ADD_NODE, NIL)
  }

  public open fun removeNode(id: Long): Unit {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_REMOVE_NODE, NIL)
  }

  public open fun getFunctionNodeId(name: StringName): Long {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_FUNCTION_NODE_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public open fun getNode(id: Long): VisualScriptNode? {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_NODE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as VisualScriptNode?
  }

  public open fun hasNode(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_HAS_NODE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public open fun setNodePosition(id: Long, position: Vector2): Unit {
    TransferContext.writeArguments(LONG to id, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_NODE_POSITION, NIL)
  }

  public open fun getNodePosition(id: Long): Vector2 {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_NODE_POSITION,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  public open fun sequenceConnect(
    fromNode: Long,
    fromOutput: Long,
    toNode: Long
  ): Unit {
    TransferContext.writeArguments(LONG to fromNode, LONG to fromOutput, LONG to toNode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SEQUENCE_CONNECT, NIL)
  }

  public open fun sequenceDisconnect(
    fromNode: Long,
    fromOutput: Long,
    toNode: Long
  ): Unit {
    TransferContext.writeArguments(LONG to fromNode, LONG to fromOutput, LONG to toNode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SEQUENCE_DISCONNECT,
        NIL)
  }

  public open fun hasSequenceConnection(
    fromNode: Long,
    fromOutput: Long,
    toNode: Long
  ): Boolean {
    TransferContext.writeArguments(LONG to fromNode, LONG to fromOutput, LONG to toNode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_HAS_SEQUENCE_CONNECTION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public open fun dataConnect(
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ): Unit {
    TransferContext.writeArguments(LONG to fromNode, LONG to fromPort, LONG to toNode, LONG to
        toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_DATA_CONNECT, NIL)
  }

  public open fun dataDisconnect(
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ): Unit {
    TransferContext.writeArguments(LONG to fromNode, LONG to fromPort, LONG to toNode, LONG to
        toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_DATA_DISCONNECT, NIL)
  }

  public open fun hasDataConnection(
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ): Boolean {
    TransferContext.writeArguments(LONG to fromNode, LONG to fromPort, LONG to toNode, LONG to
        toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_HAS_DATA_CONNECTION,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public open fun addVariable(
    name: StringName,
    defaultValue: Any? = null,
    export: Boolean = false
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ANY to defaultValue, BOOL to export)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_ADD_VARIABLE, NIL)
  }

  public open fun hasVariable(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_HAS_VARIABLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public open fun removeVariable(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_REMOVE_VARIABLE, NIL)
  }

  public open fun setVariableDefaultValue(name: StringName, `value`: Any): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_VARIABLE_DEFAULT_VALUE, NIL)
  }

  public open fun getVariableDefaultValue(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_VARIABLE_DEFAULT_VALUE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  public open fun setVariableInfo(name: StringName, `value`: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(STRING_NAME to name, DICTIONARY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_VARIABLE_INFO, NIL)
  }

  public open fun getVariableInfo(name: StringName): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_VARIABLE_INFO,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  public open fun setVariableExport(name: StringName, enable: Boolean): Unit {
    TransferContext.writeArguments(STRING_NAME to name, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_VARIABLE_EXPORT,
        NIL)
  }

  public open fun getVariableExport(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_VARIABLE_EXPORT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public open fun renameVariable(name: StringName, newName: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to newName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_RENAME_VARIABLE, NIL)
  }

  public open fun addCustomSignal(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_ADD_CUSTOM_SIGNAL, NIL)
  }

  public open fun hasCustomSignal(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_HAS_CUSTOM_SIGNAL,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public open fun customSignalAddArgument(
    name: StringName,
    type: Variant.Type,
    argname: String,
    index: Long = -1
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, LONG to type.id, STRING to argname, LONG to
        index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_ADD_ARGUMENT, NIL)
  }

  public open fun customSignalSetArgumentType(
    name: StringName,
    argidx: Long,
    type: Variant.Type
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, LONG to argidx, LONG to type.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_SET_ARGUMENT_TYPE, NIL)
  }

  public open fun customSignalGetArgumentType(name: StringName, argidx: Long): Variant.Type {
    TransferContext.writeArguments(STRING_NAME to name, LONG to argidx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_GET_ARGUMENT_TYPE, LONG)
    return Variant.Type.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public open fun customSignalSetArgumentName(
    name: StringName,
    argidx: Long,
    argname: String
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, LONG to argidx, STRING to argname)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_SET_ARGUMENT_NAME, NIL)
  }

  public open fun customSignalGetArgumentName(name: StringName, argidx: Long): String {
    TransferContext.writeArguments(STRING_NAME to name, LONG to argidx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_GET_ARGUMENT_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public open fun customSignalRemoveArgument(name: StringName, argidx: Long): Unit {
    TransferContext.writeArguments(STRING_NAME to name, LONG to argidx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_REMOVE_ARGUMENT, NIL)
  }

  public open fun customSignalGetArgumentCount(name: StringName): Long {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_GET_ARGUMENT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public open fun customSignalSwapArgument(
    name: StringName,
    argidx: Long,
    withidx: Long
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, LONG to argidx, LONG to withidx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_SWAP_ARGUMENT, NIL)
  }

  public open fun removeCustomSignal(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_REMOVE_CUSTOM_SIGNAL,
        NIL)
  }

  public open fun renameCustomSignal(name: StringName, newName: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to newName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_RENAME_CUSTOM_SIGNAL,
        NIL)
  }

  public open fun setInstanceBaseType(type: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_INSTANCE_BASE_TYPE,
        NIL)
  }

  public companion object
}
