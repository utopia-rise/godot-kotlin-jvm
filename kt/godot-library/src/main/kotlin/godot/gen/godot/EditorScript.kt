// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Suppress

/**
 * Base script that can be used to add extension functions to the editor.
 * 
 * Scripts extending this class and implementing its [_run] method can be executed from the Script Editor's **File > Run** menu option (or by pressing `Ctrl+Shift+X`) while the editor is running. This is useful for adding custom in-editor functionality to Godot. For more complex additions, consider using [godot.EditorPlugin]s instead.
 *
 * **Note:** Extending scripts need to have `tool` mode enabled.
 *
 * **Example script:**
 *
 * ```
 * 		tool
 * 		extends EditorScript
 *
 * 		func _run():
 * 		    print("Hello from the Godot Editor!")
 * 		```
 *
 * **Note:** The script is run in the Editor context, which means the output is visible in the console window started with the Editor (stdout) instead of the usual Godot **Output** dock.
 */
@GodotBaseType
open class EditorScript : Reference() {
  override fun __new() {
    callConstructor(ENGINECLASS_EDITORSCRIPT)
  }

  /**
   * This method is executed by the Editor when **File > Run** is used.
   */
  open fun _run() {
  }

  /**
   * Adds `node` as a child of the root node in the editor context.
   *
   * **Warning:** The implementation of this method is currently disabled.
   */
  open fun addRootNode(node: Node) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSCRIPT_ADD_ROOT_NODE, NIL)
  }

  /**
   * Returns the [godot.EditorInterface] singleton instance.
   */
  open fun getEditorInterface(): EditorInterface? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSCRIPT_GET_EDITOR_INTERFACE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorInterface?
  }

  /**
   * Returns the Editor's currently active scene.
   */
  open fun getScene(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSCRIPT_GET_SCENE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }
}
