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
 * Imports an OBJ 3D model as a standalone [godot.Mesh] or scene.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/assets_pipeline/importing_3d_scenes/index.html]($DOCS_URL/tutorials/assets_pipeline/importing_3d_scenes/index.html)
 *
 * Unlike [godot.ResourceImporterScene], [godot.ResourceImporterOBJ] will import a single [godot.Mesh] resource by default instead of importing a [godot.PackedScene]. This makes it easier to use the [godot.Mesh] resource in nodes that expect direct [godot.Mesh] resources, such as [godot.GridMap], [godot.GPUParticles3D] or [godot.CPUParticles3D]. Note that it is still possible to save mesh resources from 3D scenes using the **Advanced Import Settings** dialog, regardless of the source format.
 *
 * See also [godot.ResourceImporterScene], which is used for more advanced 3D formats such as glTF.
 */
@GodotBaseType
public open class ResourceImporterOBJ internal constructor() : ResourceImporter() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RESOURCEIMPORTEROBJ, scriptIndex)
    return true
  }

  public companion object
}
