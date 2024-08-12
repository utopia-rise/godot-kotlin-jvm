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
import godot.core.TypeManager
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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A texture works by registering an image in the video hardware, which then can be used in 3D
 * models or 2D [Sprite2D] or GUI [Control].
 * Textures are often created by loading them from a file. See [@GDScript.load].
 * [Texture2D] is a base for other resources. It cannot be used directly.
 * **Note:** The maximum texture size is 16384×16384 pixels due to graphics hardware limitations.
 * Larger textures may fail to import.
 */
@GodotBaseType
public open class Texture2D : Texture() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TEXTURE2D, scriptIndex)
    return true
  }

  /**
   * Called when the [Texture2D]'s width is queried.
   */
  public open fun _getWidth(): Int {
    throw NotImplementedError("_get_width is not implemented for Texture2D")
  }

  /**
   * Called when the [Texture2D]'s height is queried.
   */
  public open fun _getHeight(): Int {
    throw NotImplementedError("_get_height is not implemented for Texture2D")
  }

  /**
   * Called when a pixel's opaque state in the [Texture2D] is queried at the specified `(x, y)`
   * position.
   */
  public open fun _isPixelOpaque(x: Int, y: Int): Boolean {
    throw NotImplementedError("_is_pixel_opaque is not implemented for Texture2D")
  }

  /**
   * Called when the presence of an alpha channel in the [Texture2D] is queried.
   */
  public open fun _hasAlpha(): Boolean {
    throw NotImplementedError("_has_alpha is not implemented for Texture2D")
  }

  /**
   * Called when the entire [Texture2D] is requested to be drawn over a [CanvasItem], with the
   * top-left offset specified in [pos]. [modulate] specifies a multiplier for the colors being drawn,
   * while [transpose] specifies whether drawing should be performed in column-major order instead of
   * row-major order (resulting in 90-degree clockwise rotation).
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
   * Called when the [Texture2D] is requested to be drawn onto [CanvasItem]'s specified [rect].
   * [modulate] specifies a multiplier for the colors being drawn, while [transpose] specifies whether
   * drawing should be performed in column-major order instead of row-major order (resulting in
   * 90-degree clockwise rotation).
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
   * Called when a part of the [Texture2D] specified by [srcRect]'s coordinates is requested to be
   * drawn onto [CanvasItem]'s specified [rect]. [modulate] specifies a multiplier for the colors being
   * drawn, while [transpose] specifies whether drawing should be performed in column-major order
   * instead of row-major order (resulting in 90-degree clockwise rotation).
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
  public fun getWidth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the texture height in pixels.
   */
  public fun getHeight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the texture size in pixels.
   */
  public fun getSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns `true` if this [Texture2D] has an alpha channel.
   */
  public fun hasAlpha(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasAlphaPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Draws the texture using a [CanvasItem] with the [RenderingServer] API at the specified
   * [position].
   */
  @JvmOverloads
  public fun draw(
    canvasItem: RID,
    position: Vector2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to position, COLOR to modulate, BOOL to transpose)
    TransferContext.callMethod(rawPtr, MethodBindings.drawPtr, NIL)
  }

  /**
   * Draws the texture using a [CanvasItem] with the [RenderingServer] API.
   */
  @JvmOverloads
  public fun drawRect(
    canvasItem: RID,
    rect: Rect2,
    tile: Boolean,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, RECT2 to rect, BOOL to tile, COLOR to modulate, BOOL to transpose)
    TransferContext.callMethod(rawPtr, MethodBindings.drawRectPtr, NIL)
  }

  /**
   * Draws a part of the texture using a [CanvasItem] with the [RenderingServer] API.
   */
  @JvmOverloads
  public fun drawRectRegion(
    canvasItem: RID,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false,
    clipUv: Boolean = true,
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, RECT2 to rect, RECT2 to srcRect, COLOR to modulate, BOOL to transpose, BOOL to clipUv)
    TransferContext.callMethod(rawPtr, MethodBindings.drawRectRegionPtr, NIL)
  }

  /**
   * Returns an [Image] that is a copy of data from this [Texture2D] (a new [Image] is created each
   * time). [Image]s can be accessed and manipulated directly.
   * **Note:** This will return `null` if this [Texture2D] is invalid.
   * **Note:** This will fetch the texture data from the GPU, which might cause performance problems
   * when overused.
   */
  public fun getImage(): Image? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getImagePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  /**
   * Creates a placeholder version of this resource ([PlaceholderTexture2D]).
   */
  public fun createPlaceholder(): Resource? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createPlaceholderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
  }

  public companion object

  internal object MethodBindings {
    public val _getWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "_get_width")

    public val _getHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "_get_height")

    public val _isPixelOpaquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Texture2D", "_is_pixel_opaque")

    public val _hasAlphaPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "_has_alpha")

    public val _drawPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "_draw")

    public val _drawRectPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "_draw_rect")

    public val _drawRectRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Texture2D", "_draw_rect_region")

    public val getWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "get_width")

    public val getHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "get_height")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "get_size")

    public val hasAlphaPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "has_alpha")

    public val drawPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "draw")

    public val drawRectPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "draw_rect")

    public val drawRectRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Texture2D", "draw_rect_region")

    public val getImagePtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "get_image")

    public val createPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Texture2D", "create_placeholder")
  }
}
