// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * General-purpose sprite node.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/148](https://godotengine.org/asset-library/asset/148)
 *
 * A node that displays a 2D texture. The texture displayed can be a region from a larger atlas texture, or a frame from a sprite sheet animation.
 */
@GodotBaseType
public open class Sprite : Node2D() {
  /**
   * Emitted when the [frame] changes.
   */
  public val frameChanged: Signal0 by signal()

  /**
   * Emitted when the [texture] changes.
   */
  public val textureChanged: Signal0 by signal()

  /**
   * If `true`, texture is centered.
   */
  public open var centered: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_CENTERED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_CENTERED, NIL)
    }

  /**
   * If `true`, texture is flipped horizontally.
   */
  public open var flipH: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_FLIP_H, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_FLIP_H, NIL)
    }

  /**
   * If `true`, texture is flipped vertically.
   */
  public open var flipV: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_FLIP_V, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_FLIP_V, NIL)
    }

  /**
   * Current frame to display from sprite sheet. [hframes] or [vframes] must be greater than 1.
   */
  public open var frame: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_FRAME, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_FRAME, NIL)
    }

  /**
   * Coordinates of the frame to display from sprite sheet. This is as an alias for the [frame] property. [hframes] or [vframes] must be greater than 1.
   */
  public open var frameCoords: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_FRAME_COORDS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_FRAME_COORDS, NIL)
    }

  /**
   * The number of columns in the sprite sheet.
   */
  public open var hframes: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_HFRAMES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_HFRAMES, NIL)
    }

  /**
   * The normal map gives depth to the Sprite.
   *
   * **Note:** Godot expects the normal map to use X+, Y-, and Z+ coordinates. See [this page](http://wiki.polycount.com/wiki/Normal_Map_Technical_Details#Common_Swizzle_Coordinates) for a comparison of normal map coordinates expected by popular engines.
   */
  public open var normalMap: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_NORMAL_MAP, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_NORMAL_MAP, NIL)
    }

  /**
   * The texture's drawing offset.
   */
  public open var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_OFFSET, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_OFFSET, NIL)
    }

  /**
   * If `true`, texture is cut from a larger atlas texture. See [regionRect].
   */
  public open var regionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_REGION_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_REGION_ENABLED, NIL)
    }

  /**
   * If `true`, the outermost pixels get blurred out.
   */
  public open var regionFilterClip: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_REGION_FILTER_CLIP,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_REGION_FILTER_CLIP,
          NIL)
    }

  /**
   * The region of the atlas texture to display. [regionEnabled] must be `true`.
   */
  public open var regionRect: Rect2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_REGION_RECT, RECT2)
      return TransferContext.readReturnValue(RECT2, false) as Rect2
    }
    set(`value`) {
      TransferContext.writeArguments(RECT2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_REGION_RECT, NIL)
    }

  /**
   * [godot.Texture] object to draw.
   */
  public open var texture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_TEXTURE, NIL)
    }

  /**
   * The number of rows in the sprite sheet.
   */
  public open var vframes: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_VFRAMES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_VFRAMES, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SPRITE)
  }

  @CoreTypeHelper
  public open fun frameCoords(schedule: Vector2.() -> Unit): Vector2 = frameCoords.apply{
      schedule(this)
      frameCoords = this
  }


  @CoreTypeHelper
  public open fun offset(schedule: Vector2.() -> Unit): Vector2 = offset.apply{
      schedule(this)
      offset = this
  }


  @CoreTypeHelper
  public open fun regionRect(schedule: Rect2.() -> Unit): Rect2 = regionRect.apply{
      schedule(this)
      regionRect = this
  }


  public open fun _textureChanged(): Unit {
  }

  /**
   * Returns a [godot.core.Rect2] representing the Sprite's boundary in local coordinates. Can be used to detect if the Sprite was clicked. Example:
   *
   * ```
   * 				func _input(event):
   * 				    if event is InputEventMouseButton and event.pressed and event.button_index == BUTTON_LEFT:
   * 				        if get_rect().has_point(to_local(event.position)):
   * 				            print("A click!")
   * 				```
   */
  public open fun getRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Returns `true`, if the pixel at the given position is opaque and `false` in other case.
   *
   * **Note:** It also returns `false`, if the sprite's texture is `null` or if the given position is invalid.
   */
  public open fun isPixelOpaque(pos: Vector2): Boolean {
    TransferContext.writeArguments(VECTOR2 to pos)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_IS_PIXEL_OPAQUE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }
}
