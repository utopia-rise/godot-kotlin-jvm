// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.StringName
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

  public fun addFunction(name: StringName, funcNodeId: Long): Unit {
    TransferContext.writeArguments(STRING_NAME to name, LONG to funcNodeId)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_ADD_FUNCTION, NIL.ordinal)
  }

  public fun hasFunction(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_HAS_FUNCTION, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun removeFunction(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_REMOVE_FUNCTION,
        NIL.ordinal)
  }

  public fun renameFunction(name: StringName, newName: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to newName)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_RENAME_FUNCTION,
        NIL.ordinal)
  }

  public fun setScroll(ofs: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to ofs)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_SCROLL, NIL.ordinal)
  }

  public fun getScroll(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_SCROLL, VECTOR2.ordinal)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  public fun addNode(
    id: Long,
    node: VisualScriptNode,
    position: Vector2 = Vector2(0, 0)
  ): Unit {
    TransferContext.writeArguments(LONG to id, OBJECT to node, VECTOR2 to position)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_ADD_NODE, NIL.ordinal)
  }

  public fun removeNode(id: Long): Unit {
    TransferContext.writeArguments(LONG to id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_REMOVE_NODE, NIL.ordinal)
  }

  public fun getFunctionNodeId(name: StringName): Long {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_FUNCTION_NODE_ID,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun getNode(id: Long): VisualScriptNode? {
    TransferContext.writeArguments(LONG to id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_NODE, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as VisualScriptNode?
  }

  public fun hasNode(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_HAS_NODE, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun setNodePosition(id: Long, position: Vector2): Unit {
    TransferContext.writeArguments(LONG to id, VECTOR2 to position)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_NODE_POSITION,
        NIL.ordinal)
  }

  public fun getNodePosition(id: Long): Vector2 {
    TransferContext.writeArguments(LONG to id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_NODE_POSITION,
        VECTOR2.ordinal)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  public fun sequenceConnect(
    fromNode: Long,
    fromOutput: Long,
    toNode: Long
  ): Unit {
    TransferContext.writeArguments(LONG to fromNode, LONG to fromOutput, LONG to toNode)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SEQUENCE_CONNECT,
        NIL.ordinal)
  }

  public fun sequenceDisconnect(
    fromNode: Long,
    fromOutput: Long,
    toNode: Long
  ): Unit {
    TransferContext.writeArguments(LONG to fromNode, LONG to fromOutput, LONG to toNode)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SEQUENCE_DISCONNECT,
        NIL.ordinal)
  }

  public fun hasSequenceConnection(
    fromNode: Long,
    fromOutput: Long,
    toNode: Long
  ): Boolean {
    TransferContext.writeArguments(LONG to fromNode, LONG to fromOutput, LONG to toNode)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_HAS_SEQUENCE_CONNECTION,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun dataConnect(
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ): Unit {
    TransferContext.writeArguments(LONG to fromNode, LONG to fromPort, LONG to toNode, LONG to toPort)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_DATA_CONNECT, NIL.ordinal)
  }

  public fun dataDisconnect(
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ): Unit {
    TransferContext.writeArguments(LONG to fromNode, LONG to fromPort, LONG to toNode, LONG to toPort)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_DATA_DISCONNECT,
        NIL.ordinal)
  }

  public fun hasDataConnection(
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ): Boolean {
    TransferContext.writeArguments(LONG to fromNode, LONG to fromPort, LONG to toNode, LONG to toPort)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_HAS_DATA_CONNECTION,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun addVariable(
    name: StringName,
    defaultValue: Any? = null,
    export: Boolean = false
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ANY to defaultValue, BOOL to export)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_ADD_VARIABLE, NIL.ordinal)
  }

  public fun hasVariable(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_HAS_VARIABLE, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun removeVariable(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_REMOVE_VARIABLE,
        NIL.ordinal)
  }

  public fun setVariableDefaultValue(name: StringName, `value`: Any): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_VARIABLE_DEFAULT_VALUE,
        NIL.ordinal)
  }

  public fun getVariableDefaultValue(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_VARIABLE_DEFAULT_VALUE,
        ANY.ordinal)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  public fun setVariableInfo(name: StringName, `value`: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(STRING_NAME to name, DICTIONARY to value)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_VARIABLE_INFO,
        NIL.ordinal)
  }

  public fun getVariableInfo(name: StringName): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_VARIABLE_INFO,
        DICTIONARY.ordinal)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  public fun setVariableExport(name: StringName, enable: Boolean): Unit {
    TransferContext.writeArguments(STRING_NAME to name, BOOL to enable)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_VARIABLE_EXPORT,
        NIL.ordinal)
  }

  public fun getVariableExport(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_GET_VARIABLE_EXPORT,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun renameVariable(name: StringName, newName: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to newName)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_RENAME_VARIABLE,
        NIL.ordinal)
  }

  public fun addCustomSignal(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_ADD_CUSTOM_SIGNAL,
        NIL.ordinal)
  }

  public fun hasCustomSignal(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_HAS_CUSTOM_SIGNAL,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun customSignalAddArgument(
    name: StringName,
    type: VariantType,
    argname: String,
    index: Long = -1
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, LONG to type.id, STRING to argname, LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_ADD_ARGUMENT,
        NIL.ordinal)
  }

  public fun customSignalSetArgumentType(
    name: StringName,
    argidx: Long,
    type: VariantType
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, LONG to argidx, LONG to type.id)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_SET_ARGUMENT_TYPE, NIL.ordinal)
  }

  public fun customSignalGetArgumentType(name: StringName, argidx: Long): VariantType {
    TransferContext.writeArguments(STRING_NAME to name, LONG to argidx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_GET_ARGUMENT_TYPE, LONG.ordinal)
    return VariantType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun customSignalSetArgumentName(
    name: StringName,
    argidx: Long,
    argname: String
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, LONG to argidx, STRING to argname)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_SET_ARGUMENT_NAME, NIL.ordinal)
  }

  public fun customSignalGetArgumentName(name: StringName, argidx: Long): String {
    TransferContext.writeArguments(STRING_NAME to name, LONG to argidx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_GET_ARGUMENT_NAME, STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public fun customSignalRemoveArgument(name: StringName, argidx: Long): Unit {
    TransferContext.writeArguments(STRING_NAME to name, LONG to argidx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_REMOVE_ARGUMENT, NIL.ordinal)
  }

  public fun customSignalGetArgumentCount(name: StringName): Long {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_GET_ARGUMENT_COUNT, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun customSignalSwapArgument(
    name: StringName,
    argidx: Long,
    withidx: Long
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, LONG to argidx, LONG to withidx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_CUSTOM_SIGNAL_SWAP_ARGUMENT,
        NIL.ordinal)
  }

  public fun removeCustomSignal(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_REMOVE_CUSTOM_SIGNAL,
        NIL.ordinal)
  }

  public fun renameCustomSignal(name: StringName, newName: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to newName)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_RENAME_CUSTOM_SIGNAL,
        NIL.ordinal)
  }

  public fun setInstanceBaseType(type: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to type)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPT_SET_INSTANCE_BASE_TYPE,
        NIL.ordinal)
  }

  public companion object
}
