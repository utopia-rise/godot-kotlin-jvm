// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Rect2
import godot.core.Signal0
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.RECT2
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser.VECTOR2I
import godot.core.Vector2
import godot.core.Vector2i
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_SPRITE2D_INDEX: Int = 546

/**
 * A node that displays a 2D texture. The texture displayed can be a region from a larger atlas
 * texture, or a frame from a sprite sheet animation.
 */
@GodotBaseType
public open class Sprite2D : Node2D() {
  /**
   * Emitted when the [frame] changes.
   */
  public val frameChanged: Signal0 by Signal0

  /**
   * Emitted when the [texture] changes.
   */
  public val textureChanged: Signal0 by Signal0

  /**
   * [Texture2D] object to draw.
   */
  public final inline var texture: Texture2D?
    @JvmName("textureProperty")
    get() = getTexture()
    @JvmName("textureProperty")
    set(`value`) {
      setTexture(value)
    }

  /**
   * If `true`, texture is centered.
   * **Note:** For games with a pixel art aesthetic, textures may appear deformed when centered.
   * This is caused by their position being between pixels. To prevent this, set this property to
   * `false`, or consider enabling [ProjectSettings.rendering/2d/snap/snap2dVerticesToPixel] and
   * [ProjectSettings.rendering/2d/snap/snap2dTransformsToPixel].
   */
  public final inline var centered: Boolean
    @JvmName("centeredProperty")
    get() = isCentered()
    @JvmName("centeredProperty")
    set(`value`) {
      setCentered(value)
    }

  /**
   * The texture's drawing offset.
   */
  @CoreTypeLocalCopy
  public final inline var offset: Vector2
    @JvmName("offsetProperty")
    get() = getOffset()
    @JvmName("offsetProperty")
    set(`value`) {
      setOffset(value)
    }

  /**
   * If `true`, texture is flipped horizontally.
   */
  public final inline var flipH: Boolean
    @JvmName("flipHProperty")
    get() = isFlippedH()
    @JvmName("flipHProperty")
    set(`value`) {
      setFlipH(value)
    }

  /**
   * If `true`, texture is flipped vertically.
   */
  public final inline var flipV: Boolean
    @JvmName("flipVProperty")
    get() = isFlippedV()
    @JvmName("flipVProperty")
    set(`value`) {
      setFlipV(value)
    }

  /**
   * The number of columns in the sprite sheet. When this property is changed, [frame] is adjusted
   * so that the same visual frame is maintained (same row and column). If that's impossible, [frame]
   * is reset to `0`.
   */
  public final inline var hframes: Int
    @JvmName("hframesProperty")
    get() = getHframes()
    @JvmName("hframesProperty")
    set(`value`) {
      setHframes(value)
    }

  /**
   * The number of rows in the sprite sheet. When this property is changed, [frame] is adjusted so
   * that the same visual frame is maintained (same row and column). If that's impossible, [frame] is
   * reset to `0`.
   */
  public final inline var vframes: Int
    @JvmName("vframesProperty")
    get() = getVframes()
    @JvmName("vframesProperty")
    set(`value`) {
      setVframes(value)
    }

  /**
   * Current frame to display from sprite sheet. [hframes] or [vframes] must be greater than 1. This
   * property is automatically adjusted when [hframes] or [vframes] are changed to keep pointing to the
   * same visual frame (same column and row). If that's impossible, this value is reset to `0`.
   */
  public final inline var frame: Int
    @JvmName("frameProperty")
    get() = getFrame()
    @JvmName("frameProperty")
    set(`value`) {
      setFrame(value)
    }

  /**
   * Coordinates of the frame to display from sprite sheet. This is as an alias for the [frame]
   * property. [hframes] or [vframes] must be greater than 1.
   */
  @CoreTypeLocalCopy
  public final inline var frameCoords: Vector2i
    @JvmName("frameCoordsProperty")
    get() = getFrameCoords()
    @JvmName("frameCoordsProperty")
    set(`value`) {
      setFrameCoords(value)
    }

  /**
   * If `true`, texture is cut from a larger atlas texture. See [regionRect].
   */
  public final inline var regionEnabled: Boolean
    @JvmName("regionEnabledProperty")
    get() = isRegionEnabled()
    @JvmName("regionEnabledProperty")
    set(`value`) {
      setRegionEnabled(value)
    }

  /**
   * The region of the atlas texture to display. [regionEnabled] must be `true`.
   */
  @CoreTypeLocalCopy
  public final inline var regionRect: Rect2
    @JvmName("regionRectProperty")
    get() = getRegionRect()
    @JvmName("regionRectProperty")
    set(`value`) {
      setRegionRect(value)
    }

  /**
   * If `true`, the outermost pixels get blurred out. [regionEnabled] must be `true`.
   */
  public final inline var regionFilterClipEnabled: Boolean
    @JvmName("regionFilterClipEnabledProperty")
    get() = isRegionFilterClipEnabled()
    @JvmName("regionFilterClipEnabledProperty")
    set(`value`) {
      setRegionFilterClipEnabled(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_SPRITE2D_INDEX, scriptIndex)
  }

  /**
   * The texture's drawing offset.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = sprite2d.offset
   * //Your changes
   * sprite2d.offset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply{
      block(this)
      offset = this
  }


  /**
   * Coordinates of the frame to display from sprite sheet. This is as an alias for the [frame]
   * property. [hframes] or [vframes] must be greater than 1.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = sprite2d.frameCoords
   * //Your changes
   * sprite2d.frameCoords = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun frameCoordsMutate(block: Vector2i.() -> Unit): Vector2i = frameCoords.apply{
      block(this)
      frameCoords = this
  }


  /**
   * The region of the atlas texture to display. [regionEnabled] must be `true`.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = sprite2d.regionRect
   * //Your changes
   * sprite2d.regionRect = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun regionRectMutate(block: Rect2.() -> Unit): Rect2 = regionRect.apply{
      block(this)
      regionRect = this
  }


  public final fun setTexture(texture: Texture2D?): Unit {
    Internals.writeArguments(OBJECT to texture)
    Internals.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
  }

  public final fun getTexture(): Texture2D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setCentered(centered: Boolean): Unit {
    Internals.writeArguments(BOOL to centered)
    Internals.callMethod(rawPtr, MethodBindings.setCenteredPtr, NIL)
  }

  public final fun isCentered(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isCenteredPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setOffset(offset: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to offset)
    Internals.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
  }

  public final fun getOffset(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOffsetPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setFlipH(flipH: Boolean): Unit {
    Internals.writeArguments(BOOL to flipH)
    Internals.callMethod(rawPtr, MethodBindings.setFlipHPtr, NIL)
  }

  public final fun isFlippedH(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isFlippedHPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFlipV(flipV: Boolean): Unit {
    Internals.writeArguments(BOOL to flipV)
    Internals.callMethod(rawPtr, MethodBindings.setFlipVPtr, NIL)
  }

  public final fun isFlippedV(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isFlippedVPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setRegionEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setRegionEnabledPtr, NIL)
  }

  public final fun isRegionEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isRegionEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true`, if the pixel at the given position is opaque and `false` in other case. The
   * position is in local coordinates.
   * **Note:** It also returns `false`, if the sprite's texture is `null` or if the given position
   * is invalid.
   */
  public final fun isPixelOpaque(pos: Vector2): Boolean {
    Internals.writeArguments(VECTOR2 to pos)
    Internals.callMethod(rawPtr, MethodBindings.isPixelOpaquePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setRegionRect(rect: Rect2): Unit {
    Internals.writeArguments(RECT2 to rect)
    Internals.callMethod(rawPtr, MethodBindings.setRegionRectPtr, NIL)
  }

  public final fun getRegionRect(): Rect2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRegionRectPtr, RECT2)
    return (Internals.readReturnValue(RECT2) as Rect2)
  }

  public final fun setRegionFilterClipEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setRegionFilterClipEnabledPtr, NIL)
  }

  public final fun isRegionFilterClipEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isRegionFilterClipEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFrame(frame: Int): Unit {
    Internals.writeArguments(LONG to frame.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setFramePtr, NIL)
  }

  public final fun getFrame(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFramePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setFrameCoords(coords: Vector2i): Unit {
    Internals.writeArguments(VECTOR2I to coords)
    Internals.callMethod(rawPtr, MethodBindings.setFrameCoordsPtr, NIL)
  }

  public final fun getFrameCoords(): Vector2i {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFrameCoordsPtr, VECTOR2I)
    return (Internals.readReturnValue(VECTOR2I) as Vector2i)
  }

  public final fun setVframes(vframes: Int): Unit {
    Internals.writeArguments(LONG to vframes.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setVframesPtr, NIL)
  }

  public final fun getVframes(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVframesPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setHframes(hframes: Int): Unit {
    Internals.writeArguments(LONG to hframes.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setHframesPtr, NIL)
  }

  public final fun getHframes(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHframesPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns a [Rect2] representing the Sprite2D's boundary in local coordinates. Can be used to
   * detect if the Sprite2D was clicked.
   * **Example:**
   *
   * gdscript:
   * ```gdscript
   * func _input(event):
   *     if event is InputEventMouseButton and event.pressed and event.button_index ==
   * MOUSE_BUTTON_LEFT:
   *         if get_rect().has_point(to_local(event.position)):
   *             print("A click!")
   * ```
   * csharp:
   * ```csharp
   * public override void _Input(InputEvent @event)
   * {
   *     if (@event is InputEventMouseButton inputEventMouse)
   *     {
   *         if (inputEventMouse.Pressed && inputEventMouse.ButtonIndex == MouseButton.Left)
   *         {
   *             if (GetRect().HasPoint(ToLocal(inputEventMouse.Position)))
   *             {
   *                 GD.Print("A click!");
   *             }
   *         }
   *     }
   * }
   * ```
   */
  public final fun getRect(): Rect2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRectPtr, RECT2)
    return (Internals.readReturnValue(RECT2) as Rect2)
  }

  public companion object

  internal object MethodBindings {
    public val setTexturePtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "set_texture", 4051416890)

    public val getTexturePtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "get_texture", 3635182373)

    public val setCenteredPtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "set_centered", 2586408642)

    public val isCenteredPtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "is_centered", 36873697)

    public val setOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "set_offset", 743155724)

    public val getOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "get_offset", 3341600327)

    public val setFlipHPtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "set_flip_h", 2586408642)

    public val isFlippedHPtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "is_flipped_h", 36873697)

    public val setFlipVPtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "set_flip_v", 2586408642)

    public val isFlippedVPtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "is_flipped_v", 36873697)

    public val setRegionEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "set_region_enabled", 2586408642)

    public val isRegionEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "is_region_enabled", 36873697)

    public val isPixelOpaquePtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "is_pixel_opaque", 556197845)

    public val setRegionRectPtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "set_region_rect", 2046264180)

    public val getRegionRectPtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "get_region_rect", 1639390495)

    public val setRegionFilterClipEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "set_region_filter_clip_enabled", 2586408642)

    public val isRegionFilterClipEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "is_region_filter_clip_enabled", 36873697)

    public val setFramePtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "set_frame", 1286410249)

    public val getFramePtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "get_frame", 3905245786)

    public val setFrameCoordsPtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "set_frame_coords", 1130785943)

    public val getFrameCoordsPtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "get_frame_coords", 3690982128)

    public val setVframesPtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "set_vframes", 1286410249)

    public val getVframesPtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "get_vframes", 3905245786)

    public val setHframesPtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "set_hframes", 1286410249)

    public val getHframesPtr: VoidPtr =
        Internals.getMethodBindPtr("Sprite2D", "get_hframes", 3905245786)

    public val getRectPtr: VoidPtr = Internals.getMethodBindPtr("Sprite2D", "get_rect", 1639390495)
  }
}
