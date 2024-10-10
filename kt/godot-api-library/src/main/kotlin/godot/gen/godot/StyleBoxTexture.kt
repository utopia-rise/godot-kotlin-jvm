// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.RECT2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_STYLEBOXTEXTURE_INDEX: Int = 562

/**
 * A texture-based nine-patch [StyleBox], in a way similar to [NinePatchRect]. This stylebox
 * performs a 3×3 scaling of a texture, where only the center cell is fully stretched. This makes it
 * possible to design bordered styles regardless of the stylebox's size.
 */
@GodotBaseType
public open class StyleBoxTexture : StyleBox() {
  /**
   * The texture to use when drawing this style box.
   */
  public final inline var texture: Texture2D?
    @JvmName("textureProperty")
    get() = getTexture()
    @JvmName("textureProperty")
    set(`value`) {
      setTexture(value)
    }

  /**
   * Increases the left margin of the 3×3 texture box.
   * A higher value means more of the source texture is considered to be part of the left border of
   * the 3×3 box.
   * This is also the value used as fallback for [StyleBox.contentMarginLeft] if it is negative.
   */
  public final inline var textureMarginLeft: Float
    @JvmName("textureMarginLeftProperty")
    get() = getTextureMargin(Side.SIDE_LEFT)
    @JvmName("textureMarginLeftProperty")
    set(`value`) {
      setTextureMargin(Side.SIDE_LEFT, value)
    }

  /**
   * Increases the top margin of the 3×3 texture box.
   * A higher value means more of the source texture is considered to be part of the top border of
   * the 3×3 box.
   * This is also the value used as fallback for [StyleBox.contentMarginTop] if it is negative.
   */
  public final inline var textureMarginTop: Float
    @JvmName("textureMarginTopProperty")
    get() = getTextureMargin(Side.SIDE_TOP)
    @JvmName("textureMarginTopProperty")
    set(`value`) {
      setTextureMargin(Side.SIDE_TOP, value)
    }

  /**
   * Increases the right margin of the 3×3 texture box.
   * A higher value means more of the source texture is considered to be part of the right border of
   * the 3×3 box.
   * This is also the value used as fallback for [StyleBox.contentMarginRight] if it is negative.
   */
  public final inline var textureMarginRight: Float
    @JvmName("textureMarginRightProperty")
    get() = getTextureMargin(Side.SIDE_RIGHT)
    @JvmName("textureMarginRightProperty")
    set(`value`) {
      setTextureMargin(Side.SIDE_RIGHT, value)
    }

  /**
   * Increases the bottom margin of the 3×3 texture box.
   * A higher value means more of the source texture is considered to be part of the bottom border
   * of the 3×3 box.
   * This is also the value used as fallback for [StyleBox.contentMarginBottom] if it is negative.
   */
  public final inline var textureMarginBottom: Float
    @JvmName("textureMarginBottomProperty")
    get() = getTextureMargin(Side.SIDE_BOTTOM)
    @JvmName("textureMarginBottomProperty")
    set(`value`) {
      setTextureMargin(Side.SIDE_BOTTOM, value)
    }

  /**
   * Expands the left margin of this style box when drawing, causing it to be drawn larger than
   * requested.
   */
  public final inline var expandMarginLeft: Float
    @JvmName("expandMarginLeftProperty")
    get() = getExpandMargin(Side.SIDE_LEFT)
    @JvmName("expandMarginLeftProperty")
    set(`value`) {
      setExpandMargin(Side.SIDE_LEFT, value)
    }

  /**
   * Expands the top margin of this style box when drawing, causing it to be drawn larger than
   * requested.
   */
  public final inline var expandMarginTop: Float
    @JvmName("expandMarginTopProperty")
    get() = getExpandMargin(Side.SIDE_TOP)
    @JvmName("expandMarginTopProperty")
    set(`value`) {
      setExpandMargin(Side.SIDE_TOP, value)
    }

  /**
   * Expands the right margin of this style box when drawing, causing it to be drawn larger than
   * requested.
   */
  public final inline var expandMarginRight: Float
    @JvmName("expandMarginRightProperty")
    get() = getExpandMargin(Side.SIDE_RIGHT)
    @JvmName("expandMarginRightProperty")
    set(`value`) {
      setExpandMargin(Side.SIDE_RIGHT, value)
    }

  /**
   * Expands the bottom margin of this style box when drawing, causing it to be drawn larger than
   * requested.
   */
  public final inline var expandMarginBottom: Float
    @JvmName("expandMarginBottomProperty")
    get() = getExpandMargin(Side.SIDE_BOTTOM)
    @JvmName("expandMarginBottomProperty")
    set(`value`) {
      setExpandMargin(Side.SIDE_BOTTOM, value)
    }

  /**
   * Controls how the stylebox's texture will be stretched or tiled horizontally. See
   * [AxisStretchMode] for possible values.
   */
  public final inline var axisStretchHorizontal: AxisStretchMode
    @JvmName("axisStretchHorizontalProperty")
    get() = getHAxisStretchMode()
    @JvmName("axisStretchHorizontalProperty")
    set(`value`) {
      setHAxisStretchMode(value)
    }

  /**
   * Controls how the stylebox's texture will be stretched or tiled vertically. See
   * [AxisStretchMode] for possible values.
   */
  public final inline var axisStretchVertical: AxisStretchMode
    @JvmName("axisStretchVerticalProperty")
    get() = getVAxisStretchMode()
    @JvmName("axisStretchVerticalProperty")
    set(`value`) {
      setVAxisStretchMode(value)
    }

  /**
   * Species a sub-region of the texture to use.
   * This is equivalent to first wrapping the texture in an [AtlasTexture] with the same region.
   * If empty (`Rect2(0, 0, 0, 0)`), the whole texture will be used.
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
   * Modulates the color of the texture when this style box is drawn.
   */
  @CoreTypeLocalCopy
  public final inline var modulateColor: Color
    @JvmName("modulateColorProperty")
    get() = getModulate()
    @JvmName("modulateColorProperty")
    set(`value`) {
      setModulate(value)
    }

  /**
   * If `true`, the nine-patch texture's center tile will be drawn.
   */
  public final inline var drawCenter: Boolean
    @JvmName("drawCenterProperty")
    get() = isDrawCenterEnabled()
    @JvmName("drawCenterProperty")
    set(`value`) {
      setDrawCenter(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_STYLEBOXTEXTURE_INDEX, scriptIndex)
  }

  /**
   * Species a sub-region of the texture to use.
   * This is equivalent to first wrapping the texture in an [AtlasTexture] with the same region.
   * If empty (`Rect2(0, 0, 0, 0)`), the whole texture will be used.
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
   * val myCoreType = styleboxtexture.regionRect
   * //Your changes
   * styleboxtexture.regionRect = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun regionRectMutate(block: Rect2.() -> Unit): Rect2 = regionRect.apply{
      block(this)
      regionRect = this
  }


  /**
   * Modulates the color of the texture when this style box is drawn.
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
   * val myCoreType = styleboxtexture.modulateColor
   * //Your changes
   * styleboxtexture.modulateColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun modulateColorMutate(block: Color.() -> Unit): Color = modulateColor.apply{
      block(this)
      modulateColor = this
  }


  public final fun setTexture(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
  }

  public final fun getTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Sets the margin to [size] pixels for the specified [Side].
   */
  public final fun setTextureMargin(margin: Side, size: Float): Unit {
    TransferContext.writeArguments(LONG to margin.id, DOUBLE to size.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setTextureMarginPtr, NIL)
  }

  /**
   * Sets the margin to [size] pixels for all sides.
   */
  public final fun setTextureMarginAll(size: Float): Unit {
    TransferContext.writeArguments(DOUBLE to size.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setTextureMarginAllPtr, NIL)
  }

  /**
   * Returns the margin size of the specified [Side].
   */
  public final fun getTextureMargin(margin: Side): Float {
    TransferContext.writeArguments(LONG to margin.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureMarginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the expand margin to [size] pixels for the specified [Side].
   */
  public final fun setExpandMargin(margin: Side, size: Float): Unit {
    TransferContext.writeArguments(LONG to margin.id, DOUBLE to size.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setExpandMarginPtr, NIL)
  }

  /**
   * Sets the expand margin to [size] pixels for all sides.
   */
  public final fun setExpandMarginAll(size: Float): Unit {
    TransferContext.writeArguments(DOUBLE to size.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setExpandMarginAllPtr, NIL)
  }

  /**
   * Returns the expand margin size of the specified [Side].
   */
  public final fun getExpandMargin(margin: Side): Float {
    TransferContext.writeArguments(LONG to margin.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getExpandMarginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRegionRect(region: Rect2): Unit {
    TransferContext.writeArguments(RECT2 to region)
    TransferContext.callMethod(rawPtr, MethodBindings.setRegionRectPtr, NIL)
  }

  public final fun getRegionRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRegionRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  public final fun setDrawCenter(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setDrawCenterPtr, NIL)
  }

  public final fun isDrawCenterEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDrawCenterEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setModulate(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setModulatePtr, NIL)
  }

  public final fun getModulate(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getModulatePtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setHAxisStretchMode(mode: AxisStretchMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setHAxisStretchModePtr, NIL)
  }

  public final fun getHAxisStretchMode(): AxisStretchMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHAxisStretchModePtr, LONG)
    return StyleBoxTexture.AxisStretchMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setVAxisStretchMode(mode: AxisStretchMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setVAxisStretchModePtr, NIL)
  }

  public final fun getVAxisStretchMode(): AxisStretchMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVAxisStretchModePtr, LONG)
    return StyleBoxTexture.AxisStretchMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class AxisStretchMode(
    id: Long,
  ) {
    /**
     * Stretch the stylebox's texture. This results in visible distortion unless the texture size
     * matches the stylebox's size perfectly.
     */
    AXIS_STRETCH_MODE_STRETCH(0),
    /**
     * Repeats the stylebox's texture to match the stylebox's size according to the nine-patch
     * system.
     */
    AXIS_STRETCH_MODE_TILE(1),
    /**
     * Repeats the stylebox's texture to match the stylebox's size according to the nine-patch
     * system. Unlike [AXIS_STRETCH_MODE_TILE], the texture may be slightly stretched to make the
     * nine-patch texture tile seamlessly.
     */
    AXIS_STRETCH_MODE_TILE_FIT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AxisStretchMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "set_texture", 4051416890)

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "get_texture", 3635182373)

    public val setTextureMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "set_texture_margin", 4290182280)

    public val setTextureMarginAllPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "set_texture_margin_all", 373806689)

    public val getTextureMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "get_texture_margin", 2869120046)

    public val setExpandMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "set_expand_margin", 4290182280)

    public val setExpandMarginAllPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "set_expand_margin_all", 373806689)

    public val getExpandMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "get_expand_margin", 2869120046)

    public val setRegionRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "set_region_rect", 2046264180)

    public val getRegionRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "get_region_rect", 1639390495)

    public val setDrawCenterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "set_draw_center", 2586408642)

    public val isDrawCenterEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "is_draw_center_enabled", 36873697)

    public val setModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "set_modulate", 2920490490)

    public val getModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "get_modulate", 3444240500)

    public val setHAxisStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "set_h_axis_stretch_mode", 2965538783)

    public val getHAxisStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "get_h_axis_stretch_mode", 3807744063)

    public val setVAxisStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "set_v_axis_stretch_mode", 2965538783)

    public val getVAxisStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "get_v_axis_stretch_mode", 3807744063)
  }
}
