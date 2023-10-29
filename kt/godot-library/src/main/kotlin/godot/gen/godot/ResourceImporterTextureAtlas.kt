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
 * Imports a collection of textures from a PNG image into an optimized [godot.AtlasTexture] for 2D rendering.
 *
 * This imports a collection of textures from a PNG image into an [godot.AtlasTexture] or 2D [godot.ArrayMesh]. This can be used to save memory when importing 2D animations from spritesheets. Texture atlases are only supported in 2D rendering, not 3D. See also [godot.ResourceImporterTexture] and [godot.ResourceImporterLayeredTexture].
 *
 * **Note:** [godot.ResourceImporterTextureAtlas] does not handle importing [godot.TileSetAtlasSource], which is created using the [godot.TileSet] editor instead.
 */
@GodotBaseType
public open class ResourceImporterTextureAtlas internal constructor() : ResourceImporter() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RESOURCEIMPORTERTEXTUREATLAS, scriptIndex)
    return true
  }

  public companion object
}
