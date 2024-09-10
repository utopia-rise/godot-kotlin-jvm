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
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A node that displays a 2D texture. The texture displayed can be a region from a larger atlas
 * texture, or a frame from a sprite sheet animation.
 */
@GodotBaseType
public open class Sprite2D : Node2D() {
  /**
   * Emitted when the [frame] changes.
   */
  public val frameChanged: Signal0 by signal()

  /**
   * Emitted when the [texture] changes.
   */
  public val textureChanged: Signal0 by signal()

  /**
   * [Texture2D] object to draw.
   */
  public var texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  /**
   * If `true`, texture is centered.
   * **Note:** For games with a pixel art aesthetic, textures may appear deformed when centered.
   * This is caused by their position being between pixels. To prevent this, set this property to
   * `false`, or consider enabling [ProjectSettings.rendering/2d/snap/snap2dVerticesToPixel] and
   * [ProjectSettings.rendering/2d/snap/snap2dTransformsToPixel].
   */
  public var centered: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCenteredPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCenteredPtr, NIL)
    }

  /**
   * The texture's drawing offset.
   */
  @CoreTypeLocalCopy
  public var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
    }

  /**
   * If `true`, texture is flipped horizontally.
   */
  public var flipH: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFlippedHPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlipHPtr, NIL)
    }

  /**
   * If `true`, texture is flipped vertically.
   */
  public var flipV: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFlippedVPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlipVPtr, NIL)
    }

  /**
   * The number of columns in the sprite sheet. When this property is changed, [frame] is adjusted
   * so that the same visual frame is maintained (same row and column). If that's impossible, [frame]
   * is reset to `0`.
   */
  public var hframes: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHframesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setHframesPtr, NIL)
    }

  /**
   * The number of rows in the sprite sheet. When this property is changed, [frame] is adjusted so
   * that the same visual frame is maintained (same row and column). If that's impossible, [frame] is
   * reset to `0`.
   */
  public var vframes: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVframesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setVframesPtr, NIL)
    }

  /**
   * Current frame to display from sprite sheet. [hframes] or [vframes] must be greater than 1. This
   * property is automatically adjusted when [hframes] or [vframes] are changed to keep pointing to the
   * same visual frame (same column and row). If that's impossible, this value is reset to `0`.
   */
  public var frame: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFramePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFramePtr, NIL)
    }

  /**
   * Coordinates of the frame to display from sprite sheet. This is as an alias for the [frame]
   * property. [hframes] or [vframes] must be greater than 1.
   */
  @CoreTypeLocalCopy
  public var frameCoords: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFrameCoordsPtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFrameCoordsPtr, NIL)
    }

  /**
   * If `true`, texture is cut from a larger atlas texture. See [regionRect].
   */
  public var regionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRegionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRegionEnabledPtr, NIL)
    }

  /**
   * The region of the atlas texture to display. [regionEnabled] must be `true`.
   */
  @CoreTypeLocalCopy
  public var regionRect: Rect2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRegionRectPtr, RECT2)
      return (TransferContext.readReturnValue(RECT2, false) as Rect2)
    }
    set(`value`) {
      TransferContext.writeArguments(RECT2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRegionRectPtr, NIL)
    }

  /**
   * If `true`, the outermost pixels get blurred out. [regionEnabled] must be `true`.
   */
  public var regionFilterClipEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRegionFilterClipEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRegionFilterClipEnabledPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SPRITE2D, scriptIndex)
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
  public open fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply{
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
  public open fun frameCoordsMutate(block: Vector2i.() -> Unit): Vector2i = frameCoords.apply{
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
  public open fun regionRectMutate(block: Rect2.() -> Unit): Rect2 = regionRect.apply{
      block(this)
      regionRect = this
  }


  /**
   * Returns `true`, if the pixel at the given position is opaque and `false` in other case. The
   * position is in local coordinates.
   * **Note:** It also returns `false`, if the sprite's texture is `null` or if the given position
   * is invalid.
   */
  public fun isPixelOpaque(pos: Vector2): Boolean {
    TransferContext.writeArguments(VECTOR2 to pos)
    TransferContext.callMethod(rawPtr, MethodBindings.isPixelOpaquePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
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
  public fun getRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  public companion object

  internal object MethodBindings {
    public val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "set_texture", 4051416890)

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "get_texture", 3635182373)

    public val setCenteredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "set_centered", 2586408642)

    public val isCenteredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "is_centered", 36873697)

    public val setOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "set_offset", 743155724)

    public val getOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "get_offset", 3341600327)

    public val setFlipHPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "set_flip_h", 2586408642)

    public val isFlippedHPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "is_flipped_h", 36873697)

    public val setFlipVPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "set_flip_v", 2586408642)

    public val isFlippedVPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "is_flipped_v", 36873697)

    public val setRegionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "set_region_enabled", 2586408642)

    public val isRegionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "is_region_enabled", 36873697)

    public val isPixelOpaquePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "is_pixel_opaque", 556197845)

    public val setRegionRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "set_region_rect", 2046264180)

    public val getRegionRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "get_region_rect", 1639390495)

    public val setRegionFilterClipEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "set_region_filter_clip_enabled", 2586408642)

    public val isRegionFilterClipEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "is_region_filter_clip_enabled", 36873697)

    public val setFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "set_frame", 1286410249)

    public val getFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "get_frame", 3905245786)

    public val setFrameCoordsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "set_frame_coords", 1130785943)

    public val getFrameCoordsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "get_frame_coords", 3690982128)

    public val setVframesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "set_vframes", 1286410249)

    public val getVframesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "get_vframes", 3905245786)

    public val setHframesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "set_hframes", 1286410249)

    public val getHframesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "get_hframes", 3905245786)

    public val getRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite2D", "get_rect", 1639390495)
  }
}
