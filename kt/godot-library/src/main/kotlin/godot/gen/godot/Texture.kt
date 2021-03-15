// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.RID
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress

/**
 * Texture for 2D and 3D.
 *
 * A texture works by registering an image in the video hardware, which then can be used in 3D models or 2D [godot.Sprite] or GUI [godot.Control].
 *
 * Textures are often created by loading them from a file. See [@GDScript.load].
 *
 * [godot.Texture] is a base for other resources. It cannot be used directly.
 */
@GodotBaseType
open class Texture : Resource() {
  /**
   * The texture's [enum Flags]. [enum Flags] are used to set various properties of the [godot.Texture].
   */
  open var flags: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE_GET_FLAGS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE_SET_FLAGS, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_TEXTURE, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Draws the texture using a [godot.CanvasItem] with the [godot.VisualServer] API at the specified `position`. Equivalent to [godot.VisualServer.canvasItemAddTextureRect] with a rect at `position` and the size of this [godot.Texture].
   */
  open fun draw(
    canvasItem: RID,
    position: Vector2,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture? = null
  ) {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to position, COLOR to modulate, BOOL
        to transpose, OBJECT to normalMap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE_DRAW, NIL)
  }

  /**
   * Draws the texture using a [godot.CanvasItem] with the [godot.VisualServer] API. Equivalent to [godot.VisualServer.canvasItemAddTextureRect].
   */
  open fun drawRect(
    canvasItem: RID,
    rect: Rect2,
    tile: Boolean,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture? = null
  ) {
    TransferContext.writeArguments(_RID to canvasItem, RECT2 to rect, BOOL to tile, COLOR to
        modulate, BOOL to transpose, OBJECT to normalMap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE_DRAW_RECT, NIL)
  }

  /**
   * Draws a part of the texture using a [godot.CanvasItem] with the [godot.VisualServer] API. Equivalent to [godot.VisualServer.canvasItemAddTextureRectRegion].
   */
  open fun drawRectRegion(
    canvasItem: RID,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture? = null,
    clipUv: Boolean = true
  ) {
    TransferContext.writeArguments(_RID to canvasItem, RECT2 to rect, RECT2 to srcRect, COLOR to
        modulate, BOOL to transpose, OBJECT to normalMap, BOOL to clipUv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE_DRAW_RECT_REGION, NIL)
  }

  /**
   * Returns an [godot.Image] that is a copy of data from this [godot.Texture]. [godot.Image]s can be accessed and manipulated directly.
   */
  open fun getData(): Image? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE_GET_DATA, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  /**
   * Returns the texture height.
   */
  open fun getTextureHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE_GET_HEIGHT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the texture size.
   */
  open fun getTextureSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE_GET_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the texture width.
   */
  open fun getTextureWidth(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE_GET_WIDTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if this [godot.Texture] has an alpha channel.
   */
  open fun hasAlpha(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE_HAS_ALPHA, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  enum class Flags(
    id: Long
  ) {
    /**
     * Generates mipmaps, which are smaller versions of the same texture to use when zoomed out, keeping the aspect ratio.
     */
    FLAG_MIPMAPS(1),

    /**
     * Repeats the texture (instead of clamp to edge).
     */
    FLAG_REPEAT(2),

    /**
     * Uses a magnifying filter, to enable smooth zooming in of the texture.
     */
    FLAG_FILTER(4),

    /**
     * Default flags. [FLAG_MIPMAPS], [FLAG_REPEAT] and [FLAG_FILTER] are enabled.
     */
    FLAGS_DEFAULT(7),

    /**
     * Uses anisotropic mipmap filtering. Generates smaller versions of the same texture with different aspect ratios.
     *
     * This results in better-looking textures when viewed from oblique angles.
     */
    FLAG_ANISOTROPIC_FILTER(8),

    /**
     * Converts the texture to the sRGB color space.
     */
    FLAG_CONVERT_TO_LINEAR(16),

    /**
     * Repeats the texture with alternate sections mirrored.
     */
    FLAG_MIRRORED_REPEAT(32),

    /**
     * Texture is a video surface.
     */
    FLAG_VIDEO_SURFACE(2048);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Default flags. [FLAG_MIPMAPS], [FLAG_REPEAT] and [FLAG_FILTER] are enabled.
     */
    final const val FLAGS_DEFAULT: Long = 7

    /**
     * Uses anisotropic mipmap filtering. Generates smaller versions of the same texture with different aspect ratios.
     *
     * This results in better-looking textures when viewed from oblique angles.
     */
    final const val FLAG_ANISOTROPIC_FILTER: Long = 8

    /**
     * Converts the texture to the sRGB color space.
     */
    final const val FLAG_CONVERT_TO_LINEAR: Long = 16

    /**
     * Uses a magnifying filter, to enable smooth zooming in of the texture.
     */
    final const val FLAG_FILTER: Long = 4

    /**
     * Generates mipmaps, which are smaller versions of the same texture to use when zoomed out, keeping the aspect ratio.
     */
    final const val FLAG_MIPMAPS: Long = 1

    /**
     * Repeats the texture with alternate sections mirrored.
     */
    final const val FLAG_MIRRORED_REPEAT: Long = 32

    /**
     * Repeats the texture (instead of clamp to edge).
     */
    final const val FLAG_REPEAT: Long = 2

    /**
     * Texture is a video surface.
     */
    final const val FLAG_VIDEO_SURFACE: Long = 2048
  }
}
