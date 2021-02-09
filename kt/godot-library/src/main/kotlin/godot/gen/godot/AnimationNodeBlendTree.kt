// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class AnimationNodeBlendTree : AnimationRootNode() {
  open var graphOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_GET_GRAPH_OFFSET, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_SET_GRAPH_OFFSET, NIL)
    }

  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_ANIMATIONNODEBLENDTREE)

  open fun graphOffset(schedule: Vector2.() -> Unit): Vector2 = graphOffset.apply{
      schedule(this)
      graphOffset = this
  }


  open fun _nodeChanged(node: String) {
  }

  open fun _treeChanged() {
  }

  open fun addNode(
    name: String,
    node: AnimationNode,
    position: Vector2 = Vector2(0.0, 0.0)
  ) {
    TransferContext.writeArguments(STRING to name, OBJECT to node, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_ADD_NODE,
        NIL)
  }

  open fun connectNode(
    inputNode: String,
    inputIndex: Long,
    outputNode: String
  ) {
    TransferContext.writeArguments(STRING to inputNode, LONG to inputIndex, STRING to outputNode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_CONNECT_NODE,
        NIL)
  }

  open fun disconnectNode(inputNode: String, inputIndex: Long) {
    TransferContext.writeArguments(STRING to inputNode, LONG to inputIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_DISCONNECT_NODE, NIL)
  }

  open fun getNode(name: String): AnimationNode? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_GET_NODE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as AnimationNode?
  }

  open fun getNodePosition(name: String): Vector2 {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_GET_NODE_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun hasNode(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_HAS_NODE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun removeNode(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_REMOVE_NODE,
        NIL)
  }

  open fun renameNode(name: String, newName: String) {
    TransferContext.writeArguments(STRING to name, STRING to newName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_RENAME_NODE,
        NIL)
  }

  open fun setNodePosition(name: String, position: Vector2) {
    TransferContext.writeArguments(STRING to name, VECTOR2 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_SET_NODE_POSITION, NIL)
  }

  companion object {
    final const val CONNECTION_ERROR_CONNECTION_EXISTS: Long = 5

    final const val CONNECTION_ERROR_NO_INPUT: Long = 1

    final const val CONNECTION_ERROR_NO_INPUT_INDEX: Long = 2

    final const val CONNECTION_ERROR_NO_OUTPUT: Long = 3

    final const val CONNECTION_ERROR_SAME_NODE: Long = 4

    final const val CONNECTION_OK: Long = 0
  }
}
