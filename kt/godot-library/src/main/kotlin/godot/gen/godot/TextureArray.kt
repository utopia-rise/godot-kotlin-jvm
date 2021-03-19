// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import kotlin.Suppress

/**
 * Array of textures stored in a single primitive.
 * 
 * [godot.TextureArray]s store an array of images in a single [godot.Texture] primitive. Each layer of the texture array has its own mipmap chain. This makes it is a good alternative to texture atlases.
 */
@GodotBaseType
open class TextureArray : TextureLayered() {
  override fun __new() {
    callConstructor(ENGINECLASS_TEXTUREARRAY)
  }
}
