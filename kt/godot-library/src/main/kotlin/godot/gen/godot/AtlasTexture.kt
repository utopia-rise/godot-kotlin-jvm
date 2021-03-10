// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

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
 * Packs multiple small textures in a single, bigger one. Helps to optimize video memory costs and render calls.
 *
 * [godot.Texture] resource aimed at managing big textures files that pack multiple smaller textures. Consists of a [godot.Texture], a margin that defines the border width, and a region that defines the actual area of the AtlasTexture.
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
    TransferContext.invokeConstructor(ENGINECLASS_ATLASTEXTURE)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
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
