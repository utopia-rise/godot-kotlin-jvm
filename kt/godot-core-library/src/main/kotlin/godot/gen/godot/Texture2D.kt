// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.RID
import godot.core.Rect2
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.RECT2
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser._RID
import godot.core.Vector2
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
  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_TEXTURE2D, this, scriptIndex)
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
  public final fun getWidth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the texture height in pixels.
   */
  public final fun getHeight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the texture size in pixels.
   */
  public final fun getSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns `true` if this [Texture2D] has an alpha channel.
   */
  public final fun hasAlpha(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasAlphaPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Draws the texture using a [CanvasItem] with the [RenderingServer] API at the specified
   * [position].
   */
  @JvmOverloads
  public final fun draw(
    canvasItem: RID,
    position: Vector2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to position, COLOR to modulate, BOOL to transpose)
    TransferContext.callMethod(ptr, MethodBindings.drawPtr, NIL)
  }

  /**
   * Draws the texture using a [CanvasItem] with the [RenderingServer] API.
   */
  @JvmOverloads
  public final fun drawRect(
    canvasItem: RID,
    rect: Rect2,
    tile: Boolean,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, RECT2 to rect, BOOL to tile, COLOR to modulate, BOOL to transpose)
    TransferContext.callMethod(ptr, MethodBindings.drawRectPtr, NIL)
  }

  /**
   * Draws a part of the texture using a [CanvasItem] with the [RenderingServer] API.
   */
  @JvmOverloads
  public final fun drawRectRegion(
    canvasItem: RID,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false,
    clipUv: Boolean = true,
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, RECT2 to rect, RECT2 to srcRect, COLOR to modulate, BOOL to transpose, BOOL to clipUv)
    TransferContext.callMethod(ptr, MethodBindings.drawRectRegionPtr, NIL)
  }

  /**
   * Returns an [Image] that is a copy of data from this [Texture2D] (a new [Image] is created each
   * time). [Image]s can be accessed and manipulated directly.
   * **Note:** This will return `null` if this [Texture2D] is invalid.
   * **Note:** This will fetch the texture data from the GPU, which might cause performance problems
   * when overused.
   */
  public final fun getImage(): Image? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getImagePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Image?)
  }

  /**
   * Creates a placeholder version of this resource ([PlaceholderTexture2D]).
   */
  public final fun createPlaceholder(): Resource? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.createPlaceholderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Resource?)
  }

  public companion object

  internal object MethodBindings {
    public val getWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Texture2D", "get_width", 3905245786)

    public val getHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Texture2D", "get_height", 3905245786)

    public val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Texture2D", "get_size", 3341600327)

    public val hasAlphaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Texture2D", "has_alpha", 36873697)

    public val drawPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture2D", "draw", 2729649137)

    public val drawRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Texture2D", "draw_rect", 3499451691)

    public val drawRectRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Texture2D", "draw_rect_region", 2963678660)

    public val getImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Texture2D", "get_image", 4190603485)

    public val createPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Texture2D", "create_placeholder", 121922552)
  }
}
