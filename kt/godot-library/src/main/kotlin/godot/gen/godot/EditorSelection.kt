// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Any
import kotlin.Suppress
import kotlin.Unit

/**
 * Manages the SceneTree selection in the editor.
 *
 * This object manages the SceneTree selection in the editor.
 *
 * **Note:** This class shouldn't be instantiated directly. Instead, access the singleton using [godot.EditorInterface.getSelection].
 */
@GodotBaseType
public open class EditorSelection : Object() {
  /**
   * Emitted when the selection changes.
   */
  public val selectionChanged: Signal0 by signal()

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORSELECTION)
  }

  /**
   * Clear the selection.
   */
  public open fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSELECTION_CLEAR, NIL)
  }

  /**
   * Adds a node to the selection.
   *
   * **Note:** The newly selected node will not be automatically edited in the inspector. If you want to edit a node, use [godot.EditorInterface.editNode].
   */
  public open fun addNode(node: Node): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSELECTION_ADD_NODE, NIL)
  }

  /**
   * Removes a node from the selection.
   */
  public open fun removeNode(node: Node): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSELECTION_REMOVE_NODE, NIL)
  }

  /**
   * Gets the list of selected nodes.
   */
  public open fun getSelectedNodes(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSELECTION_GET_SELECTED_NODES,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Gets the list of selected nodes, optimized for transform operations (i.e. moving them, rotating, etc). This list avoids situations where a node is selected and also child/grandchild.
   */
  public open fun getTransformableSelectedNodes(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSELECTION_GET_TRANSFORMABLE_SELECTED_NODES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public companion object
}
