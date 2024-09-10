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
 * A control that displays a texture, for example an icon inside a GUI. The texture's placement can
 * be controlled with the [stretchMode] property. It can scale, tile, or stay centered inside its
 * bounding rectangle.
 */
@GodotBaseType
public open class TextureRect : Control() {
  /**
   * The node's [Texture2D] resource.
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
   * Defines how minimum size is determined based on the texture's size. See [ExpandMode] for
   * options.
   */
  public var expandMode: ExpandMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExpandModePtr, LONG)
      return TextureRect.ExpandMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setExpandModePtr, NIL)
    }

  /**
   * Controls the texture's behavior when resizing the node's bounding rectangle. See [StretchMode].
   */
  public var stretchMode: StretchMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStretchModePtr, LONG)
      return TextureRect.StretchMode.from(TransferContext.readReturnValue(LONG) as Long)
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
    callConstructor(ENGINECLASS_TEXTURERECT, scriptIndex)
  }

  public enum class ExpandMode(
    id: Long,
  ) {
    /**
     * The minimum size will be equal to texture size, i.e. [TextureRect] can't be smaller than the
     * texture.
     */
    EXPAND_KEEP_SIZE(0),
    /**
     * The size of the texture won't be considered for minimum size calculation, so the
     * [TextureRect] can be shrunk down past the texture size.
     */
    EXPAND_IGNORE_SIZE(1),
    /**
     * The height of the texture will be ignored. Minimum width will be equal to the current height.
     * Useful for horizontal layouts, e.g. inside [HBoxContainer].
     */
    EXPAND_FIT_WIDTH(2),
    /**
     * Same as [EXPAND_FIT_WIDTH], but keeps texture's aspect ratio.
     */
    EXPAND_FIT_WIDTH_PROPORTIONAL(3),
    /**
     * The width of the texture will be ignored. Minimum height will be equal to the current width.
     * Useful for vertical layouts, e.g. inside [VBoxContainer].
     */
    EXPAND_FIT_HEIGHT(4),
    /**
     * Same as [EXPAND_FIT_HEIGHT], but keeps texture's aspect ratio.
     */
    EXPAND_FIT_HEIGHT_PROPORTIONAL(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ExpandMode = entries.single { it.id == `value` }
    }
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
     * Scale the texture to fit the node's bounding rectangle, center it and maintain its aspect
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
    public val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "set_texture", 4051416890)

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "get_texture", 3635182373)

    public val setExpandModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "set_expand_mode", 1870766882)

    public val getExpandModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "get_expand_mode", 3863824733)

    public val setFlipHPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "set_flip_h", 2586408642)

    public val isFlippedHPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "is_flipped_h", 36873697)

    public val setFlipVPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "set_flip_v", 2586408642)

    public val isFlippedVPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "is_flipped_v", 36873697)

    public val setStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "set_stretch_mode", 58788729)

    public val getStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "get_stretch_mode", 346396079)
  }
}
