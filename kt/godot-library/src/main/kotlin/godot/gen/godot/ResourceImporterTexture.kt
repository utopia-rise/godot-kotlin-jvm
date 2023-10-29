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
 * Imports an image for use in 2D or 3D rendering.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/assets_pipeline/importing_images.html]($DOCS_URL/tutorials/assets_pipeline/importing_images.html)
 *
 * This importer imports [godot.CompressedTexture2D] resources. If you need to process the image in scripts in a more convenient way, use [godot.ResourceImporterImage] instead. See also [godot.ResourceImporterLayeredTexture].
 */
@GodotBaseType
public open class ResourceImporterTexture internal constructor() : ResourceImporter() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RESOURCEIMPORTERTEXTURE, scriptIndex)
    return true
  }

  public companion object
}
