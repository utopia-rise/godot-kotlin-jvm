// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 * Post-processes scenes after import.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/assets_pipeline/importing_scenes.html#custom-script]($DOCS_URL/tutorials/assets_pipeline/importing_scenes.html#custom-script)
 *
 * Imported scenes can be automatically modified right after import by setting their **Custom Script** Import property to a `tool` script that inherits from this class.
 *
 * The [_postImport] callback receives the imported scene's root node and returns the modified version of the scene. Usage example:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * @tool # Needed so it runs in editor.
 *
 * extends EditorScenePostImport
 *
 * # This sample changes all node names.
 *
 * # Called right after the scene is imported and gets the root node.
 *
 * func _post_import(scene):
 *
 *     # Change all node names to "modified_[oldnodename]"
 *
 *     iterate(scene)
 *
 *     return scene # Remember to return the imported scene
 *
 * func iterate(node):
 *
 *     if node != null:
 *
 *         node.name = "modified_" + node.name
 *
 *         for child in node.get_children():
 *
 *             iterate(child)
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * using Godot;
 *
 *
 *
 * // This sample changes all node names.
 *
 * // Called right after the scene is imported and gets the root node.
 *
 * [godot.Tool]
 *
 * public class NodeRenamer : EditorScenePostImport
 *
 * {
 *
 *     public override Object PostImport(Object scene)
 *
 *     {
 *
 *         // Change all node names to "modified_[oldnodename]"
 *
 *         Iterate(scene as Node);
 *
 *         return scene; // Remember to return the imported scene
 *
 *     }
 *
 *     public void Iterate(Node node)
 *
 *     {
 *
 *         if (node != null)
 *
 *         {
 *
 *             node.Name = "modified_" + node.Name;
 *
 *             foreach (Node child in node.GetChildren())
 *
 *             {
 *
 *                 Iterate(child);
 *
 *             }
 *
 *         }
 *
 *     }
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class EditorScenePostImport internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORSCENEPOSTIMPORT, scriptIndex)
    return true
  }

  /**
   * Called after the scene was imported. This method must return the modified version of the scene.
   */
  public open fun _postImport(scene: Node): Object? {
    throw NotImplementedError("_post_import is not implemented for EditorScenePostImport")
  }

  /**
   * Returns the source file path which got imported (e.g. `res://scene.dae`).
   */
  public fun getSourceFile(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSCENEPOSTIMPORT_GET_SOURCE_FILE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public companion object
}
