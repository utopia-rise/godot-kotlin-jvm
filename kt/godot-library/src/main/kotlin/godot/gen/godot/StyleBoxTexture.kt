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
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

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
   * Increases the left margin of the 3×3 texture box.
   * A higher value means more of the source texture is considered to be part of the left border of
   * the 3×3 box.
   * This is also the value used as fallback for [StyleBox.contentMarginLeft] if it is negative.
   */
  public var textureMarginLeft: Float
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureMarginPtr, NIL)
    }

  /**
   * Increases the top margin of the 3×3 texture box.
   * A higher value means more of the source texture is considered to be part of the top border of
   * the 3×3 box.
   * This is also the value used as fallback for [StyleBox.contentMarginTop] if it is negative.
   */
  public var textureMarginTop: Float
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureMarginPtr, NIL)
    }

  /**
   * Increases the right margin of the 3×3 texture box.
   * A higher value means more of the source texture is considered to be part of the right border of
   * the 3×3 box.
   * This is also the value used as fallback for [StyleBox.contentMarginRight] if it is negative.
   */
  public var textureMarginRight: Float
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureMarginPtr, NIL)
    }

  /**
   * Increases the bottom margin of the 3×3 texture box.
   * A higher value means more of the source texture is considered to be part of the bottom border
   * of the 3×3 box.
   * This is also the value used as fallback for [StyleBox.contentMarginBottom] if it is negative.
   */
  public var textureMarginBottom: Float
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureMarginPtr, NIL)
    }

  /**
   * Expands the left margin of this style box when drawing, causing it to be drawn larger than
   * requested.
   */
  public var expandMarginLeft: Float
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getExpandMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setExpandMarginPtr, NIL)
    }

  /**
   * Expands the top margin of this style box when drawing, causing it to be drawn larger than
   * requested.
   */
  public var expandMarginTop: Float
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getExpandMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setExpandMarginPtr, NIL)
    }

  /**
   * Expands the right margin of this style box when drawing, causing it to be drawn larger than
   * requested.
   */
  public var expandMarginRight: Float
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getExpandMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setExpandMarginPtr, NIL)
    }

  /**
   * Expands the bottom margin of this style box when drawing, causing it to be drawn larger than
   * requested.
   */
  public var expandMarginBottom: Float
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getExpandMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setExpandMarginPtr, NIL)
    }

  /**
   * Controls how the stylebox's texture will be stretched or tiled horizontally. See
   * [AxisStretchMode] for possible values.
   */
  public var axisStretchHorizontal: AxisStretchMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHAxisStretchModePtr, LONG)
      return StyleBoxTexture.AxisStretchMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setHAxisStretchModePtr, NIL)
    }

  /**
   * Controls how the stylebox's texture will be stretched or tiled vertically. See
   * [AxisStretchMode] for possible values.
   */
  public var axisStretchVertical: AxisStretchMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVAxisStretchModePtr, LONG)
      return StyleBoxTexture.AxisStretchMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setVAxisStretchModePtr, NIL)
    }

  /**
   * Species a sub-region of the texture to use.
   * This is equivalent to first wrapping the texture in an [AtlasTexture] with the same region.
   * If empty (`Rect2(0, 0, 0, 0)`), the whole texture will be used.
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
   * Modulates the color of the texture when this style box is drawn.
   */
  @CoreTypeLocalCopy
  public var modulateColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getModulatePtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setModulatePtr, NIL)
    }

  /**
   * If `true`, the nine-patch texture's center tile will be drawn.
   */
  public var drawCenter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawCenterEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawCenterPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STYLEBOXTEXTURE, scriptIndex)
    return true
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
  public open fun regionRectMutate(block: Rect2.() -> Unit): Rect2 = regionRect.apply{
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
  public open fun modulateColorMutate(block: Color.() -> Unit): Color = modulateColor.apply{
      block(this)
      modulateColor = this
  }


  /**
   * Sets the margin to [size] pixels for all sides.
   */
  public fun setTextureMarginAll(size: Float): Unit {
    TransferContext.writeArguments(DOUBLE to size.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setTextureMarginAllPtr, NIL)
  }

  /**
   * Sets the expand margin to [size] pixels for all sides.
   */
  public fun setExpandMarginAll(size: Float): Unit {
    TransferContext.writeArguments(DOUBLE to size.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setExpandMarginAllPtr, NIL)
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
        TypeManager.getMethodBindPtr("StyleBoxTexture", "set_texture")

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "get_texture")

    public val setTextureMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "set_texture_margin")

    public val setTextureMarginAllPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "set_texture_margin_all")

    public val getTextureMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "get_texture_margin")

    public val setExpandMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "set_expand_margin")

    public val setExpandMarginAllPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "set_expand_margin_all")

    public val getExpandMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "get_expand_margin")

    public val setRegionRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "set_region_rect")

    public val getRegionRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "get_region_rect")

    public val setDrawCenterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "set_draw_center")

    public val isDrawCenterEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "is_draw_center_enabled")

    public val setModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "set_modulate")

    public val getModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "get_modulate")

    public val setHAxisStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "set_h_axis_stretch_mode")

    public val getHAxisStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "get_h_axis_stretch_mode")

    public val setVAxisStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "set_v_axis_stretch_mode")

    public val getVAxisStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxTexture", "get_v_axis_stretch_mode")
  }
}
