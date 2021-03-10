// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Any
import kotlin.Suppress

/**
 * Manages the SceneTree selection in the editor.
 *
 * This object manages the SceneTree selection in the editor.
 *
 * **Note:** This class shouldn't be instantiated directly. Instead, access the singleton using [godot.EditorInterface.getSelection].
 */
@GodotBaseType
open class EditorSelection : Object() {
  /**
   * Emitted when the selection changes.
   */
  val selectionChanged: Signal0 by signal()

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_EDITORSELECTION)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun _emitChange() {
  }

  open fun _nodeRemoved(arg0: Node) {
  }

  /**
   * Adds a node to the selection.
   */
  open fun addNode(node: Node) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSELECTION_ADD_NODE, NIL)
  }

  /**
   * Clear the selection.
   */
  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSELECTION_CLEAR, NIL)
  }

  /**
   * Gets the list of selected nodes.
   */
  open fun getSelectedNodes(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSELECTION_GET_SELECTED_NODES,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Gets the list of selected nodes, optimized for transform operations (i.e. moving them, rotating, etc). This list avoids situations where a node is selected and also child/grandchild.
   */
  open fun getTransformableSelectedNodes(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSELECTION_GET_TRANSFORMABLE_SELECTED_NODES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Removes a node from the selection.
   */
  open fun removeNode(node: Node) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSELECTION_REMOVE_NODE, NIL)
  }
}
