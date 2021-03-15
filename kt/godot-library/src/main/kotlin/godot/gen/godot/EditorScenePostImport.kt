// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.STRING
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 * Post-processes scenes after import.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/getting_started/workflow/assets/importing_scenes.html#custom-script](https://docs.godotengine.org/en/latest/getting_started/workflow/assets/importing_scenes.html#custom-script)
 *
 * Imported scenes can be automatically modified right after import by setting their **Custom Script** Import property to a `tool` script that inherits from this class.
 *
 * The [postImport] callback receives the imported scene's root node and returns the modified version of the scene. Usage example:
 *
 * ```
 * 		tool # Needed so it runs in editor
 * 		extends EditorScenePostImport
 *
 * 		# This sample changes all node names
 *
 * 		# Called right after the scene is imported and gets the root node
 * 		func post_import(scene):
 * 		    # Change all node names to "modified_[oldnodename]"
 * 		    iterate(scene)
 * 		    return scene # Remember to return the imported scene
 *
 * 		func iterate(node):
 * 		    if node != null:
 * 		        node.name = "modified_" + node.name
 * 		        for child in node.get_children():
 * 		            iterate(child)
 * 		```
 */
@GodotBaseType
open class EditorScenePostImport : Reference() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_EDITORSCENEPOSTIMPORT,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Returns the source file path which got imported (e.g. `res://scene.dae`).
   */
  open fun getSourceFile(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSCENEPOSTIMPORT_GET_SOURCE_FILE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the resource folder the imported scene file is located in.
   */
  open fun getSourceFolder(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSCENEPOSTIMPORT_GET_SOURCE_FOLDER, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Called after the scene was imported. This method must return the modified version of the scene.
   */
  open fun _postImport(scene: Object): Object? {
    throw NotImplementedError("post_import is not implemented for EditorScenePostImport")
  }
}
