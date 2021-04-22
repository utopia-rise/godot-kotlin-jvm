// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * Crops out one part of a texture, such as a texture from a texture atlas.
 *
 * [godot.Texture] resource that crops out one part of the [atlas] texture, defined by [region]. The main use case is cropping out textures from a texture atlas, which is a big texture file that packs multiple smaller textures. Consists of a [godot.Texture] for the [atlas], a [region] that defines the area of [atlas] to use, and a [margin] that defines the border width.
 *
 * [godot.AtlasTexture] cannot be used in an [godot.AnimatedTexture], cannot be tiled in nodes such as [godot.TextureRect], and does not work properly if used inside of other [godot.AtlasTexture] resources. Multiple [godot.AtlasTexture] resources can be used to crop multiple textures from the atlas. Using a texture atlas helps to optimize video memory costs and render calls compared to using multiple small files.
 *
 * **Note:** AtlasTextures don't support repetition. The [godot.Texture.FLAG_REPEAT] and [godot.Texture.FLAG_MIRRORED_REPEAT] flags are ignored when using an AtlasTexture.
 */
@GodotBaseType
open class AtlasTexture : Texture() {
  /**
   * The texture that contains the atlas. Can be any [godot.Texture] subtype.
   */
  open var atlas: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ATLASTEXTURE_GET_ATLAS, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ATLASTEXTURE_SET_ATLAS, NIL)
    }

  /**
   * If `true`, clips the area outside of the region to avoid bleeding of the surrounding texture pixels.
   */
  open var filterClip: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ATLASTEXTURE_GET_FILTER_CLIP,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ATLASTEXTURE_SET_FILTER_CLIP, NIL)
    }

  /**
   * The margin around the region. The [godot.core.Rect2]'s [godot.Rect2.size] parameter ("w" and "h" in the editor) resizes the texture so it fits within the margin.
   */
  open var margin: Rect2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ATLASTEXTURE_GET_MARGIN, RECT2)
      return TransferContext.readReturnValue(RECT2, false) as Rect2
    }
    set(value) {
      TransferContext.writeArguments(RECT2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ATLASTEXTURE_SET_MARGIN, NIL)
    }

  /**
   * The AtlasTexture's used region.
   */
  open var region: Rect2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ATLASTEXTURE_GET_REGION, RECT2)
      return TransferContext.readReturnValue(RECT2, false) as Rect2
    }
    set(value) {
      TransferContext.writeArguments(RECT2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ATLASTEXTURE_SET_REGION, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_ATLASTEXTURE)
  }

  open fun margin(schedule: Rect2.() -> Unit): Rect2 = margin.apply{
      schedule(this)
      margin = this
  }


  open fun region(schedule: Rect2.() -> Unit): Rect2 = region.apply{
      schedule(this)
      region = this
  }

}
