// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.NodePath
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class SceneState : Reference() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_SCENESTATE)

  open fun getConnectionBinds(idx: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_CONNECTION_BINDS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun getConnectionCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_CONNECTION_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getConnectionFlags(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_CONNECTION_FLAGS,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getConnectionMethod(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_CONNECTION_METHOD,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getConnectionSignal(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_CONNECTION_SIGNAL,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getConnectionSource(idx: Long): NodePath {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_CONNECTION_SOURCE,
        NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  open fun getConnectionTarget(idx: Long): NodePath {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_CONNECTION_TARGET,
        NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  open fun getNodeCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getNodeGroups(idx: Long): PoolStringArray {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_GROUPS,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  open fun getNodeIndex(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getNodeInstance(idx: Long): PackedScene? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_INSTANCE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PackedScene?
  }

  open fun getNodeInstancePlaceholder(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_INSTANCE_PLACEHOLDER, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getNodeName(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getNodeOwnerPath(idx: Long): NodePath {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_OWNER_PATH,
        NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  open fun getNodePath(idx: Long, forParent: Boolean = false): NodePath {
    TransferContext.writeArguments(LONG to idx, BOOL to forParent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_PATH, NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  open fun getNodePropertyCount(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_PROPERTY_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getNodePropertyName(idx: Long, propIdx: Long): String {
    TransferContext.writeArguments(LONG to idx, LONG to propIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_PROPERTY_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getNodePropertyValue(idx: Long, propIdx: Long): Any? {
    TransferContext.writeArguments(LONG to idx, LONG to propIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_PROPERTY_VALUE,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun getNodeType(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_TYPE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun isNodeInstancePlaceholder(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCENESTATE_IS_NODE_INSTANCE_PLACEHOLDER, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  enum class GenEditState(
    id: Long
  ) {
    GEN_EDIT_STATE_DISABLED(0),

    GEN_EDIT_STATE_INSTANCE(1),

    GEN_EDIT_STATE_MAIN(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val GEN_EDIT_STATE_DISABLED: Long = 0

    final const val GEN_EDIT_STATE_INSTANCE: Long = 1

    final const val GEN_EDIT_STATE_MAIN: Long = 2
  }
}
