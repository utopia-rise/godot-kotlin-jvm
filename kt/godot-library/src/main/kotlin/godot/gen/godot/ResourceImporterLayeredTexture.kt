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
 * Imports a 3-dimensional texture ([godot.Texture3D]), a [godot.Texture2DArray], a [godot.Cubemap] or a [godot.CubemapArray].
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/assets_pipeline/importing_images.html]($DOCS_URL/tutorials/assets_pipeline/importing_images.html)
 *
 * This imports a 3-dimensional texture, which can then be used in custom shaders, as a [godot.FogMaterial] density map or as a [godot.GPUParticlesAttractorVectorField3D]. See also [godot.ResourceImporterTexture] and [godot.ResourceImporterTextureAtlas].
 */
@GodotBaseType
public open class ResourceImporterLayeredTexture internal constructor() : ResourceImporter() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RESOURCEIMPORTERLAYEREDTEXTURE, scriptIndex)
    return true
  }

  public companion object
}
