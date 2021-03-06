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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress

/**
 * Texture-based button. Supports Pressed, Hover, Disabled and Focused states.
 *
 * [godot.TextureButton] has the same functionality as [godot.Button], except it uses sprites instead of Godot's [godot.Theme] resource. It is faster to create, but it doesn't support localization like more complex [godot.Control]s.
 *
 * The "normal" state must contain a texture ([textureNormal]); other textures are optional.
 */
@GodotBaseType
open class TextureButton : BaseButton() {
  /**
   * If `true`, the texture stretches to the edges of the node's bounding rectangle using the [stretchMode]. If `false`, the texture will not scale with the node.
   */
  open var expand: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_GET_EXPAND, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_SET_EXPAND, NIL)
    }

  /**
   * Controls the texture's behavior when you resize the node's bounding rectangle, **only if** [expand] is `true`. Set it to one of the [enum StretchMode] constants. See the constants to learn more.
   */
  open var stretchMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_GET_STRETCH_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_SET_STRETCH_MODE,
          NIL)
    }

  /**
   * Pure black and white [godot.BitMap] image to use for click detection. On the mask, white pixels represent the button's clickable area. Use it to create buttons with curved shapes.
   */
  open var textureClickMask: BitMap?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_GET_TEXTURE_CLICK_MASK, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as BitMap?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_SET_TEXTURE_CLICK_MASK, NIL)
    }

  /**
   * Texture to display when the node is disabled. See [godot.BaseButton.disabled].
   */
  open var textureDisabled: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_GET_TEXTURE_DISABLED, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_SET_TEXTURE_DISABLED, NIL)
    }

  /**
   * Texture to display when the node has mouse or keyboard focus.
   */
  open var textureFocused: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_GET_TEXTURE_FOCUSED,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_SET_TEXTURE_FOCUSED,
          NIL)
    }

  /**
   * Texture to display when the mouse hovers the node.
   */
  open var textureHover: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_GET_TEXTURE_HOVER,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_SET_TEXTURE_HOVER,
          NIL)
    }

  /**
   * Texture to display by default, when the node is **not** in the disabled, focused, hover or pressed state.
   */
  open var textureNormal: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_GET_TEXTURE_NORMAL,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_SET_TEXTURE_NORMAL,
          NIL)
    }

  /**
   * Texture to display on mouse down over the node, if the node has keyboard focus and the player presses the Enter key or if the player presses the [godot.BaseButton.shortcut] key.
   */
  open var texturePressed: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_GET_TEXTURE_PRESSED,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_SET_TEXTURE_PRESSED,
          NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_TEXTUREBUTTON)

  enum class StretchMode(
    id: Long
  ) {
    /**
     * Scale to fit the node's bounding rectangle.
     */
    STRETCH_SCALE(0),

    /**
     * Tile inside the node's bounding rectangle.
     */
    STRETCH_TILE(1),

    /**
     * The texture keeps its original size and stays in the bounding rectangle's top-left corner.
     */
    STRETCH_KEEP(2),

    /**
     * The texture keeps its original size and stays centered in the node's bounding rectangle.
     */
    STRETCH_KEEP_CENTERED(3),

    /**
     * Scale the texture to fit the node's bounding rectangle, but maintain the texture's aspect ratio.
     */
    STRETCH_KEEP_ASPECT(4),

    /**
     * Scale the texture to fit the node's bounding rectangle, center it, and maintain its aspect ratio.
     */
    STRETCH_KEEP_ASPECT_CENTERED(5),

    /**
     * Scale the texture so that the shorter side fits the bounding rectangle. The other side clips to the node's limits.
     */
    STRETCH_KEEP_ASPECT_COVERED(6);

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
    final const val STRETCH_KEEP: Long = 2

    /**
     * Scale the texture to fit the node's bounding rectangle, but maintain the texture's aspect ratio.
     */
    final const val STRETCH_KEEP_ASPECT: Long = 4

    /**
     * Scale the texture to fit the node's bounding rectangle, center it, and maintain its aspect ratio.
     */
    final const val STRETCH_KEEP_ASPECT_CENTERED: Long = 5

    /**
     * Scale the texture so that the shorter side fits the bounding rectangle. The other side clips to the node's limits.
     */
    final const val STRETCH_KEEP_ASPECT_COVERED: Long = 6

    /**
     * The texture keeps its original size and stays centered in the node's bounding rectangle.
     */
    final const val STRETCH_KEEP_CENTERED: Long = 3

    /**
     * Scale to fit the node's bounding rectangle.
     */
    final const val STRETCH_SCALE: Long = 0

    /**
     * Tile inside the node's bounding rectangle.
     */
    final const val STRETCH_TILE: Long = 1
  }
}
