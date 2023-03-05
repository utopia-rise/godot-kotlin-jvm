// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.RID
import godot.core.Rect2
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Texture for 2D and 3D.
 *
 * A texture works by registering an image in the video hardware, which then can be used in 3D models or 2D [godot.Sprite2D] or GUI [godot.Control].
 *
 * Textures are often created by loading them from a file. See [@GDScript.load].
 *
 * [godot.Texture2D] is a base for other resources. It cannot be used directly.
 *
 * **Note:** The maximum texture size is 16384×16384 pixels due to graphics hardware limitations. Larger textures may fail to import.
 */
@GodotBaseType
public open class Texture2D : Texture() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TEXTURE2D, scriptIndex)
    return true
  }

  /**
   * Called when the [godot.Texture2D]'s width is queried.
   */
  public open fun _getWidth(): Long {
    throw NotImplementedError("_get_width is not implemented for Texture2D")
  }

  /**
   * Called when the [godot.Texture2D]'s height is queried.
   */
  public open fun _getHeight(): Long {
    throw NotImplementedError("_get_height is not implemented for Texture2D")
  }

  /**
   * Called when a pixel's opaque state in the [godot.Texture2D] is queried at the specified `(x, y)` position.
   */
  public open fun _isPixelOpaque(x: Long, y: Long): Boolean {
    throw NotImplementedError("_is_pixel_opaque is not implemented for Texture2D")
  }

  /**
   * Called when the presence of an alpha channel in the [godot.Texture2D] is queried.
   */
  public open fun _hasAlpha(): Boolean {
    throw NotImplementedError("_has_alpha is not implemented for Texture2D")
  }

  /**
   * Called when the entire [godot.Texture2D] is requested to be drawn over a [godot.CanvasItem], with the top-left offset specified in [pos]. [modulate] specifies a multiplier for the colors being drawn, while [transpose] specifies whether drawing should be performed in column-major order instead of row-major order (resulting in 90-degree clockwise rotation).
   *
   * **Note:** This is only used in 2D rendering, not 3D.
   */
  public open fun _draw(
    toCanvasItem: RID,
    pos: Vector2,
    modulate: Color,
    transpose: Boolean,
  ): Unit {
  }

  /**
   * Called when the [godot.Texture2D] is requested to be drawn onto [godot.CanvasItem]'s specified [rect]. [modulate] specifies a multiplier for the colors being drawn, while [transpose] specifies whether drawing should be performed in column-major order instead of row-major order (resulting in 90-degree clockwise rotation).
   *
   * **Note:** This is only used in 2D rendering, not 3D.
   */
  public open fun _drawRect(
    toCanvasItem: RID,
    rect: Rect2,
    tile: Boolean,
    modulate: Color,
    transpose: Boolean,
  ): Unit {
  }

  /**
   * Called when a part of the [godot.Texture2D] specified by [srcRect]'s coordinates is requested to be drawn onto [godot.CanvasItem]'s specified [rect]. [modulate] specifies a multiplier for the colors being drawn, while [transpose] specifies whether drawing should be performed in column-major order instead of row-major order (resulting in 90-degree clockwise rotation).
   *
   * **Note:** This is only used in 2D rendering, not 3D.
   */
  public open fun _drawRectRegion(
    toCanvasItem: RID,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color,
    transpose: Boolean,
    clipUv: Boolean,
  ): Unit {
  }

  /**
   * Returns the texture width in pixels.
   */
  public fun getWidth(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE2D_GET_WIDTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the texture height in pixels.
   */
  public fun getHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE2D_GET_HEIGHT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the texture size in pixels.
   */
  public fun getSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE2D_GET_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns `true` if this [godot.Texture2D] has an alpha channel.
   */
  public fun hasAlpha(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE2D_HAS_ALPHA, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Draws the texture using a [godot.CanvasItem] with the [godot.RenderingServer] API at the specified [position].
   */
  public fun draw(
    canvasItem: RID,
    position: Vector2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to position, COLOR to modulate, BOOL to transpose)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE2D_DRAW, NIL)
  }

  /**
   * Draws the texture using a [godot.CanvasItem] with the [godot.RenderingServer] API.
   */
  public fun drawRect(
    canvasItem: RID,
    rect: Rect2,
    tile: Boolean,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, RECT2 to rect, BOOL to tile, COLOR to modulate, BOOL to transpose)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE2D_DRAW_RECT, NIL)
  }

  /**
   * Draws a part of the texture using a [godot.CanvasItem] with the [godot.RenderingServer] API.
   */
  public fun drawRectRegion(
    canvasItem: RID,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false,
    clipUv: Boolean = true,
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, RECT2 to rect, RECT2 to srcRect, COLOR to modulate, BOOL to transpose, BOOL to clipUv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE2D_DRAW_RECT_REGION, NIL)
  }

  /**
   * Returns an [godot.Image] that is a copy of data from this [godot.Texture2D] (a new [godot.Image] is created each time). [godot.Image]s can be accessed and manipulated directly.
   *
   * **Note:** This will fetch the texture data from the GPU, which might cause performance problems when overused.
   */
  public fun getImage(): Image? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE2D_GET_IMAGE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  /**
   * Creates a placeholder version of this resource ([godot.PlaceholderTexture2D]).
   */
  public fun createPlaceholder(): Resource? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE2D_CREATE_PLACEHOLDER,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Resource?
  }

  public companion object
}
