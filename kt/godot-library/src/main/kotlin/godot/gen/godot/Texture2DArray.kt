// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * A single texture resource which consists of multiple, separate images. Each image has the same dimensions and number of mipmap levels.
 *
 * A Texture2DArray is different from a Texture3D: The Texture2DArray does not support trilinear interpolation between the [godot.Image]s, i.e. no blending. See also [godot.Cubemap] and [godot.CubemapArray], which are texture arrays with specialized cubemap functions.
 *
 * A Texture2DArray is also different from an [godot.AtlasTexture]: In a Texture2DArray, all images are treated separately. In an atlas, the regions (i.e. the single images) can be of different sizes. Furthermore, you usually need to add a padding around the regions, to prevent accidental UV mapping to more than one region. The same goes for mipmapping: Mipmap chains are handled separately for each layer. In an atlas, the slicing has to be done manually in the fragment shader.
 *
 * To create such a texture file yourself, reimport your image files using the Godot Editor import presets.
 */
@GodotBaseType
public open class Texture2DArray : ImageTextureLayered() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TEXTURE2DARRAY)
  }

  public companion object
}
