// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public final inline var texture: Texture2D?
    @JvmName("textureProperty")
    get() = getTexture()
    @JvmName("textureProperty")
    set(`value`) {
      setTexture(value)
    }

  /**
   * Defines how minimum size is determined based on the texture's size. See [ExpandMode] for
   * options.
   */
  public final inline var expandMode: ExpandMode
    @JvmName("expandModeProperty")
    get() = getExpandMode()
    @JvmName("expandModeProperty")
    set(`value`) {
      setExpandMode(value)
    }

  /**
   * Controls the texture's behavior when resizing the node's bounding rectangle. See [StretchMode].
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
    createNativeObject(678, scriptIndex)
  }

  public final fun setTexture(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.setTexturePtr, NIL)
  }

  public final fun getTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setExpandMode(expandMode: ExpandMode): Unit {
    TransferContext.writeArguments(LONG to expandMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setExpandModePtr, NIL)
  }

  public final fun getExpandMode(): ExpandMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getExpandModePtr, LONG)
    return ExpandMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setFlipH(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setFlipHPtr, NIL)
  }

  public final fun isFlippedH(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isFlippedHPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFlipV(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setFlipVPtr, NIL)
  }

  public final fun isFlippedV(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isFlippedVPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setStretchMode(stretchMode: StretchMode): Unit {
    TransferContext.writeArguments(LONG to stretchMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setStretchModePtr, NIL)
  }

  public final fun getStretchMode(): StretchMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStretchModePtr, LONG)
    return StretchMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class ExpandMode(
    id: Long,
  ) {
    /**
     * The minimum size will be equal to texture size, i.e. [TextureRect] can't be smaller than the
     * texture.
     */
    KEEP_SIZE(0),
    /**
     * The size of the texture won't be considered for minimum size calculation, so the
     * [TextureRect] can be shrunk down past the texture size.
     */
    IGNORE_SIZE(1),
    /**
     * The height of the texture will be ignored. Minimum width will be equal to the current height.
     * Useful for horizontal layouts, e.g. inside [HBoxContainer].
     */
    FIT_WIDTH(2),
    /**
     * Same as [EXPAND_FIT_WIDTH], but keeps texture's aspect ratio.
     */
    FIT_WIDTH_PROPORTIONAL(3),
    /**
     * The width of the texture will be ignored. Minimum height will be equal to the current width.
     * Useful for vertical layouts, e.g. inside [VBoxContainer].
     */
    FIT_HEIGHT(4),
    /**
     * Same as [EXPAND_FIT_HEIGHT], but keeps texture's aspect ratio.
     */
    FIT_HEIGHT_PROPORTIONAL(5),
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
    SCALE(0),
    /**
     * Tile inside the node's bounding rectangle.
     */
    TILE(1),
    /**
     * The texture keeps its original size and stays in the bounding rectangle's top-left corner.
     */
    KEEP(2),
    /**
     * The texture keeps its original size and stays centered in the node's bounding rectangle.
     */
    KEEP_CENTERED(3),
    /**
     * Scale the texture to fit the node's bounding rectangle, but maintain the texture's aspect
     * ratio.
     */
    KEEP_ASPECT(4),
    /**
     * Scale the texture to fit the node's bounding rectangle, center it and maintain its aspect
     * ratio.
     */
    KEEP_ASPECT_CENTERED(5),
    /**
     * Scale the texture so that the shorter side fits the bounding rectangle. The other side clips
     * to the node's limits.
     */
    KEEP_ASPECT_COVERED(6),
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

  public object MethodBindings {
    internal val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "set_texture", 4051416890)

    internal val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "get_texture", 3635182373)

    internal val setExpandModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "set_expand_mode", 1870766882)

    internal val getExpandModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "get_expand_mode", 3863824733)

    internal val setFlipHPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "set_flip_h", 2586408642)

    internal val isFlippedHPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "is_flipped_h", 36873697)

    internal val setFlipVPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "set_flip_v", 2586408642)

    internal val isFlippedVPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "is_flipped_v", 36873697)

    internal val setStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "set_stretch_mode", 58788729)

    internal val getStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureRect", "get_stretch_mode", 346396079)
  }
}
