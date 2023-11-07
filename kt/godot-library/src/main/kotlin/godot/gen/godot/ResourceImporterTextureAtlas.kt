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
 * This imports a collection of textures from a PNG image into an [AtlasTexture] or 2D [ArrayMesh].
 * This can be used to save memory when importing 2D animations from spritesheets. Texture atlases are
 * only supported in 2D rendering, not 3D. See also [ResourceImporterTexture] and
 * [ResourceImporterLayeredTexture].
 * **Note:** [ResourceImporterTextureAtlas] does not handle importing [TileSetAtlasSource], which is
 * created using the [TileSet] editor instead.
 */
@GodotBaseType
public open class ResourceImporterTextureAtlas internal constructor() : ResourceImporter() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RESOURCEIMPORTERTEXTUREATLAS, scriptIndex)
    return true
  }

  public companion object
}
