// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * [TextureButton] has the same functionality as [Button], except it uses sprites instead of Godot's
 * [Theme] resource. It is faster to create, but it doesn't support localization like more complex
 * [Control]s.
 * The "normal" state must contain a texture ([textureNormal]); other textures are optional.
 * See also [BaseButton] which contains common properties and methods associated with this node.
 */
@GodotBaseType
public open class TextureButton : BaseButton() {
  /**
   * Texture to display by default, when the node is **not** in the disabled, hover or pressed
   * state. This texture is still displayed in the focused state, with [textureFocused] drawn on top.
   */
  public var textureNormal: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureNormalPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureNormalPtr, NIL)
    }

  /**
   * Texture to display on mouse down over the node, if the node has keyboard focus and the player
   * presses the Enter key or if the player presses the [BaseButton.shortcut] key.
   */
  public var texturePressed: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePressedPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePressedPtr, NIL)
    }

  /**
   * Texture to display when the mouse hovers the node.
   */
  public var textureHover: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureHoverPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureHoverPtr, NIL)
    }

  /**
   * Texture to display when the node is disabled. See [BaseButton.disabled].
   */
  public var textureDisabled: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureDisabledPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureDisabledPtr, NIL)
    }

  /**
   * Texture to display when the node has mouse or keyboard focus. [textureFocused] is displayed
   * *over* the base texture, so a partially transparent texture should be used to ensure the base
   * texture remains visible. A texture that represents an outline or an underline works well for this
   * purpose. To disable the focus visual effect, assign a fully transparent texture of any size. Note
   * that disabling the focus visual effect will harm keyboard/controller navigation usability, so this
   * is not recommended for accessibility reasons.
   */
  public var textureFocused: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureFocusedPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureFocusedPtr, NIL)
    }

  /**
   * Pure black and white [BitMap] image to use for click detection. On the mask, white pixels
   * represent the button's clickable area. Use it to create buttons with curved shapes.
   */
  public var textureClickMask: BitMap?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getClickMaskPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as BitMap?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setClickMaskPtr, NIL)
    }

  /**
   * If `true`, the size of the texture won't be considered for minimum size calculation, so the
   * [TextureButton] can be shrunk down past the texture size.
   */
  public var ignoreTextureSize: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIgnoreTextureSizePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIgnoreTextureSizePtr, NIL)
    }

  /**
   * Controls the texture's behavior when you resize the node's bounding rectangle. See the
   * [StretchMode] constants for available options.
   */
  public var stretchMode: StretchMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStretchModePtr, LONG)
      return TextureButton.StretchMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setStretchModePtr, NIL)
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

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_TEXTUREBUTTON, scriptIndex)
  }

  public enum class StretchMode(
    id: Long,
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
     * Scale the texture to fit the node's bounding rectangle, but maintain the texture's aspect
     * ratio.
     */
    STRETCH_KEEP_ASPECT(4),
    /**
     * Scale the texture to fit the node's bounding rectangle, center it, and maintain its aspect
     * ratio.
     */
    STRETCH_KEEP_ASPECT_CENTERED(5),
    /**
     * Scale the texture so that the shorter side fits the bounding rectangle. The other side clips
     * to the node's limits.
     */
    STRETCH_KEEP_ASPECT_COVERED(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): StretchMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setTextureNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_texture_normal")

    public val setTexturePressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_texture_pressed")

    public val setTextureHoverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_texture_hover")

    public val setTextureDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_texture_disabled")

    public val setTextureFocusedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_texture_focused")

    public val setClickMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_click_mask")

    public val setIgnoreTextureSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_ignore_texture_size")

    public val setStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_stretch_mode")

    public val setFlipHPtr: VoidPtr = TypeManager.getMethodBindPtr("TextureButton", "set_flip_h")

    public val isFlippedHPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "is_flipped_h")

    public val setFlipVPtr: VoidPtr = TypeManager.getMethodBindPtr("TextureButton", "set_flip_v")

    public val isFlippedVPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "is_flipped_v")

    public val getTextureNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_texture_normal")

    public val getTexturePressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_texture_pressed")

    public val getTextureHoverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_texture_hover")

    public val getTextureDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_texture_disabled")

    public val getTextureFocusedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_texture_focused")

    public val getClickMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_click_mask")

    public val getIgnoreTextureSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_ignore_texture_size")

    public val getStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_stretch_mode")
  }
}
