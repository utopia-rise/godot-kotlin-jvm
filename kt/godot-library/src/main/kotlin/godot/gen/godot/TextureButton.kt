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
import kotlin.jvm.JvmName

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
  public final inline var textureNormal: Texture2D?
    @JvmName("textureNormalProperty")
    get() = getTextureNormal()
    @JvmName("textureNormalProperty")
    set(`value`) {
      setTextureNormal(value)
    }

  /**
   * Texture to display on mouse down over the node, if the node has keyboard focus and the player
   * presses the Enter key or if the player presses the [BaseButton.shortcut] key.
   */
  public final inline var texturePressed: Texture2D?
    @JvmName("texturePressedProperty")
    get() = getTexturePressed()
    @JvmName("texturePressedProperty")
    set(`value`) {
      setTexturePressed(value)
    }

  /**
   * Texture to display when the mouse hovers the node.
   */
  public final inline var textureHover: Texture2D?
    @JvmName("textureHoverProperty")
    get() = getTextureHover()
    @JvmName("textureHoverProperty")
    set(`value`) {
      setTextureHover(value)
    }

  /**
   * Texture to display when the node is disabled. See [BaseButton.disabled].
   */
  public final inline var textureDisabled: Texture2D?
    @JvmName("textureDisabledProperty")
    get() = getTextureDisabled()
    @JvmName("textureDisabledProperty")
    set(`value`) {
      setTextureDisabled(value)
    }

  /**
   * Texture to display when the node has mouse or keyboard focus. [textureFocused] is displayed
   * *over* the base texture, so a partially transparent texture should be used to ensure the base
   * texture remains visible. A texture that represents an outline or an underline works well for this
   * purpose. To disable the focus visual effect, assign a fully transparent texture of any size. Note
   * that disabling the focus visual effect will harm keyboard/controller navigation usability, so this
   * is not recommended for accessibility reasons.
   */
  public final inline var textureFocused: Texture2D?
    @JvmName("textureFocusedProperty")
    get() = getTextureFocused()
    @JvmName("textureFocusedProperty")
    set(`value`) {
      setTextureFocused(value)
    }

  /**
   * Pure black and white [BitMap] image to use for click detection. On the mask, white pixels
   * represent the button's clickable area. Use it to create buttons with curved shapes.
   */
  public final inline var textureClickMask: BitMap?
    @JvmName("textureClickMaskProperty")
    get() = getClickMask()
    @JvmName("textureClickMaskProperty")
    set(`value`) {
      setClickMask(value)
    }

  /**
   * If `true`, the size of the texture won't be considered for minimum size calculation, so the
   * [TextureButton] can be shrunk down past the texture size.
   */
  public final inline var ignoreTextureSize: Boolean
    @JvmName("ignoreTextureSizeProperty")
    get() = getIgnoreTextureSize()
    @JvmName("ignoreTextureSizeProperty")
    set(`value`) {
      setIgnoreTextureSize(value)
    }

  /**
   * Controls the texture's behavior when you resize the node's bounding rectangle. See the
   * [StretchMode] constants for available options.
   */
  public final inline var stretchMode: StretchMode
    @JvmName("stretchModeProperty")
    get() = getStretchMode()
    @JvmName("stretchModeProperty")
    set(`value`) {
      setStretchMode(value)
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

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_TEXTUREBUTTON, scriptIndex)
  }

  public final fun setTextureNormal(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextureNormalPtr, NIL)
  }

  public final fun setTexturePressed(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setTexturePressedPtr, NIL)
  }

  public final fun setTextureHover(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextureHoverPtr, NIL)
  }

  public final fun setTextureDisabled(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextureDisabledPtr, NIL)
  }

  public final fun setTextureFocused(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextureFocusedPtr, NIL)
  }

  public final fun setClickMask(mask: BitMap?): Unit {
    TransferContext.writeArguments(OBJECT to mask)
    TransferContext.callMethod(rawPtr, MethodBindings.setClickMaskPtr, NIL)
  }

  public final fun setIgnoreTextureSize(ignore: Boolean): Unit {
    TransferContext.writeArguments(BOOL to ignore)
    TransferContext.callMethod(rawPtr, MethodBindings.setIgnoreTextureSizePtr, NIL)
  }

  public final fun setStretchMode(mode: StretchMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setStretchModePtr, NIL)
  }

  public final fun setFlipH(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setFlipHPtr, NIL)
  }

  public final fun isFlippedH(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isFlippedHPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFlipV(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setFlipVPtr, NIL)
  }

  public final fun isFlippedV(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isFlippedVPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getTextureNormal(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureNormalPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun getTexturePressed(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTexturePressedPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun getTextureHover(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureHoverPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun getTextureDisabled(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureDisabledPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun getTextureFocused(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureFocusedPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun getClickMask(): BitMap? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getClickMaskPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as BitMap?)
  }

  public final fun getIgnoreTextureSize(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIgnoreTextureSizePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getStretchMode(): StretchMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStretchModePtr, LONG)
    return TextureButton.StretchMode.from(TransferContext.readReturnValue(LONG) as Long)
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
        TypeManager.getMethodBindPtr("TextureButton", "set_texture_normal", 4051416890)

    public val setTexturePressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_texture_pressed", 4051416890)

    public val setTextureHoverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_texture_hover", 4051416890)

    public val setTextureDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_texture_disabled", 4051416890)

    public val setTextureFocusedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_texture_focused", 4051416890)

    public val setClickMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_click_mask", 698588216)

    public val setIgnoreTextureSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_ignore_texture_size", 2586408642)

    public val setStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_stretch_mode", 252530840)

    public val setFlipHPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_flip_h", 2586408642)

    public val isFlippedHPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "is_flipped_h", 36873697)

    public val setFlipVPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "set_flip_v", 2586408642)

    public val isFlippedVPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "is_flipped_v", 36873697)

    public val getTextureNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_texture_normal", 3635182373)

    public val getTexturePressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_texture_pressed", 3635182373)

    public val getTextureHoverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_texture_hover", 3635182373)

    public val getTextureDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_texture_disabled", 3635182373)

    public val getTextureFocusedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_texture_focused", 3635182373)

    public val getClickMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_click_mask", 2459671998)

    public val getIgnoreTextureSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_ignore_texture_size", 36873697)

    public val getStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureButton", "get_stretch_mode", 33815122)
  }
}
