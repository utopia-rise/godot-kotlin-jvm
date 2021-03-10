// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress

/**
 * Control for drawing textures.
 *
 * Used to draw icons and sprites in a user interface. The texture's placement can be controlled with the [stretchMode] property. It can scale, tile, or stay centered inside its bounding rectangle.
 *
 * **Note:** You should enable [flipV] when using a TextureRect to display a [godot.ViewportTexture]. Alternatively, you can enable [godot.Viewport.renderTargetVFlip] on the Viewport. Otherwise, the image will appear upside down.
 */
@GodotBaseType
open class TextureRect : Control() {
  /**
   * If `true`, the texture scales to fit its bounding rectangle.
   */
  open var expand: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURERECT_GET_EXPAND, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURERECT_SET_EXPAND, NIL)
    }

  /**
   * If `true`, texture is flipped horizontally.
   */
  open var flipH: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURERECT_GET_FLIP_H, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURERECT_SET_FLIP_H, NIL)
    }

  /**
   * If `true`, texture is flipped vertically.
   */
  open var flipV: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURERECT_GET_FLIP_V, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURERECT_SET_FLIP_V, NIL)
    }

  /**
   * Controls the texture's behavior when resizing the node's bounding rectangle. See [enum StretchMode].
   */
  open var stretchMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURERECT_GET_STRETCH_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURERECT_SET_STRETCH_MODE, NIL)
    }

  /**
   * The node's [godot.Texture] resource.
   */
  open var texture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURERECT_GET_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURERECT_SET_TEXTURE, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_TEXTURERECT)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun _textureChanged() {
  }

  enum class StretchMode(
    id: Long
  ) {
    /**
     * Scale to fit the node's bounding rectangle, only if `expand` is `true`. Default `stretch_mode`, for backwards compatibility. Until you set `expand` to `true`, the texture will behave like [STRETCH_KEEP].
     */
    STRETCH_SCALE_ON_EXPAND(0),

    /**
     * Scale to fit the node's bounding rectangle.
     */
    STRETCH_SCALE(1),

    /**
     * Tile inside the node's bounding rectangle.
     */
    STRETCH_TILE(2),

    /**
     * The texture keeps its original size and stays in the bounding rectangle's top-left corner.
     */
    STRETCH_KEEP(3),

    /**
     * The texture keeps its original size and stays centered in the node's bounding rectangle.
     */
    STRETCH_KEEP_CENTERED(4),

    /**
     * Scale the texture to fit the node's bounding rectangle, but maintain the texture's aspect ratio.
     */
    STRETCH_KEEP_ASPECT(5),

    /**
     * Scale the texture to fit the node's bounding rectangle, center it and maintain its aspect ratio.
     */
    STRETCH_KEEP_ASPECT_CENTERED(6),

    /**
     * Scale the texture so that the shorter side fits the bounding rectangle. The other side clips to the node's limits.
     */
    STRETCH_KEEP_ASPECT_COVERED(7);

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
     * The texture keeps its original size and stays in the bounding rectangle's top-left corner.
     */
    final const val STRETCH_KEEP: Long = 3

    /**
     * Scale the texture to fit the node's bounding rectangle, but maintain the texture's aspect ratio.
     */
    final const val STRETCH_KEEP_ASPECT: Long = 5

    /**
     * Scale the texture to fit the node's bounding rectangle, center it and maintain its aspect ratio.
     */
    final const val STRETCH_KEEP_ASPECT_CENTERED: Long = 6

    /**
     * Scale the texture so that the shorter side fits the bounding rectangle. The other side clips to the node's limits.
     */
    final const val STRETCH_KEEP_ASPECT_COVERED: Long = 7

    /**
     * The texture keeps its original size and stays centered in the node's bounding rectangle.
     */
    final const val STRETCH_KEEP_CENTERED: Long = 4

    /**
     * Scale to fit the node's bounding rectangle.
     */
    final const val STRETCH_SCALE: Long = 1

    /**
     * Scale to fit the node's bounding rectangle, only if `expand` is `true`. Default `stretch_mode`, for backwards compatibility. Until you set `expand` to `true`, the texture will behave like [STRETCH_KEEP].
     */
    final const val STRETCH_SCALE_ON_EXPAND: Long = 0

    /**
     * Tile inside the node's bounding rectangle.
     */
    final const val STRETCH_TILE: Long = 2
  }
}
