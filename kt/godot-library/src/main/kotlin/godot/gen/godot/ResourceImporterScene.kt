// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Imports a glTF, FBX, Collada or Blender 3D scene.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/assets_pipeline/importing_3d_scenes/index.html]($DOCS_URL/tutorials/assets_pipeline/importing_3d_scenes/index.html)
 *
 * See also [godot.ResourceImporterOBJ], which is used for OBJ models that can be imported as a standalone [godot.Mesh] or a scene.
 *
 * Additional options (such as extracting individual meshes or materials to files) are available in the **Advanced Import Settings** dialog. This dialog can be accessed by double-clicking a 3D scene in the FileSystem dock or by selecting a 3D scene in the FileSystem dock, going to the Import dock and choosing **Advanced**.
 *
 * **Note:** [godot.ResourceImporterScene] is *not* used for [godot.PackedScene]s, such as `.tscn` and `.scn` files.
 */
@GodotBaseType
public open class ResourceImporterScene internal constructor() : ResourceImporter() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RESOURCEIMPORTERSCENE, scriptIndex)
    return true
  }

  public companion object
}
