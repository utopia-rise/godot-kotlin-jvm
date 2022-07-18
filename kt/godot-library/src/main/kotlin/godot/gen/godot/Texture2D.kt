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
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TEXTURE2D)
  }

  /**
   *
   */
  public open fun _getWidth(): Long {
    throw NotImplementedError("_get_width is not implemented for Texture2D")
  }

  /**
   *
   */
  public open fun _getHeight(): Long {
    throw NotImplementedError("_get_height is not implemented for Texture2D")
  }

  /**
   *
   */
  public open fun _isPixelOpaque(x: Long, y: Long): Boolean {
    throw NotImplementedError("_is_pixel_opaque is not implemented for Texture2D")
  }

  /**
   *
   */
  public open fun _hasAlpha(): Boolean {
    throw NotImplementedError("_has_alpha is not implemented for Texture2D")
  }

  /**
   *
   */
  public open fun _draw(
    toCanvasItem: RID,
    pos: Vector2,
    modulate: Color,
    transpose: Boolean
  ): Unit {
  }

  /**
   *
   */
  public open fun _drawRect(
    toCanvasItem: RID,
    rect: Rect2,
    tile: Boolean,
    modulate: Color,
    transpose: Boolean
  ): Unit {
  }

  /**
   *
   */
  public open fun _drawRectRegion(
    tpCanvasItem: RID,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color,
    transpose: Boolean,
    clipUv: Boolean
  ): Unit {
  }

  /**
   * Returns the texture width.
   */
  public fun getWidth(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE2D_GET_WIDTH, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the texture height.
   */
  public fun getHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE2D_GET_HEIGHT, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the texture size.
   */
  public fun getSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE2D_GET_SIZE, VECTOR2.ordinal)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns `true` if this [godot.Texture2D] has an alpha channel.
   */
  public fun hasAlpha(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE2D_HAS_ALPHA, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Draws the texture using a [godot.CanvasItem] with the [godot.RenderingServer] API at the specified `position`.
   */
  public fun draw(
    canvasItem: RID,
    position: Vector2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to position, COLOR to modulate, BOOL to transpose)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE2D_DRAW, NIL.ordinal)
  }

  /**
   * Draws the texture using a [godot.CanvasItem] with the [godot.RenderingServer] API.
   */
  public fun drawRect(
    canvasItem: RID,
    rect: Rect2,
    tile: Boolean,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, RECT2 to rect, BOOL to tile, COLOR to modulate, BOOL to transpose)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE2D_DRAW_RECT, NIL.ordinal)
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
    clipUv: Boolean = true
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, RECT2 to rect, RECT2 to srcRect, COLOR to modulate, BOOL to transpose, BOOL to clipUv)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE2D_DRAW_RECT_REGION, NIL.ordinal)
  }

  /**
   * Returns an [godot.Image] that is a copy of data from this [godot.Texture2D] (a new [godot.Image] is created each time). [godot.Image]s can be accessed and manipulated directly.
   *
   * **Note:** This will fetch the texture data from the GPU, which might cause performance problems when overused.
   */
  public fun getImage(): Image? {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE2D_GET_IMAGE, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  public companion object
}
