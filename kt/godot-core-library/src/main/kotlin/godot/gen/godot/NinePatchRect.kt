// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Rect2
import godot.core.Signal0
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.RECT2
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Also known as 9-slice panels, [NinePatchRect] produces clean panels of any size based on a small
 * texture. To do so, it splits the texture in a 3×3 grid. When you scale the node, it tiles the
 * texture's edges horizontally or vertically, tiles the center on both axes, and leaves the corners
 * unchanged.
 */
@GodotBaseType
public open class NinePatchRect : Control() {
  /**
   * Emitted when the node's texture changes.
   */
  public val textureChanged: Signal0 by Signal0

  /**
   * The node's texture resource.
   */
  public final inline var texture: Texture2D?
    @JvmName("textureProperty")
    get() = getTexture()
    @JvmName("textureProperty")
    set(`value`) {
      setTexture(value)
    }

  /**
   * If `true`, draw the panel's center. Else, only draw the 9-slice's borders.
   */
  public final inline var drawCenter: Boolean
    @JvmName("drawCenterProperty")
    get() = isDrawCenterEnabled()
    @JvmName("drawCenterProperty")
    set(`value`) {
      setDrawCenter(value)
    }

  /**
   * Rectangular region of the texture to sample from. If you're working with an atlas, use this
   * property to define the area the 9-slice should use. All other properties are relative to this one.
   * If the rect is empty, NinePatchRect will use the whole texture.
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
   * The width of the 9-slice's left column. A margin of 16 means the 9-slice's left corners and
   * side will have a width of 16 pixels. You can set all 4 margin values individually to create panels
   * with non-uniform borders.
   */
  public final inline var patchMarginLeft: Int
    @JvmName("patchMarginLeftProperty")
    get() = getPatchMargin(Side.SIDE_LEFT)
    @JvmName("patchMarginLeftProperty")
    set(`value`) {
      setPatchMargin(Side.SIDE_LEFT, value)
    }

  /**
   * The height of the 9-slice's top row. A margin of 16 means the 9-slice's top corners and side
   * will have a height of 16 pixels. You can set all 4 margin values individually to create panels
   * with non-uniform borders.
   */
  public final inline var patchMarginTop: Int
    @JvmName("patchMarginTopProperty")
    get() = getPatchMargin(Side.SIDE_TOP)
    @JvmName("patchMarginTopProperty")
    set(`value`) {
      setPatchMargin(Side.SIDE_TOP, value)
    }

  /**
   * The width of the 9-slice's right column. A margin of 16 means the 9-slice's right corners and
   * side will have a width of 16 pixels. You can set all 4 margin values individually to create panels
   * with non-uniform borders.
   */
  public final inline var patchMarginRight: Int
    @JvmName("patchMarginRightProperty")
    get() = getPatchMargin(Side.SIDE_RIGHT)
    @JvmName("patchMarginRightProperty")
    set(`value`) {
      setPatchMargin(Side.SIDE_RIGHT, value)
    }

  /**
   * The height of the 9-slice's bottom row. A margin of 16 means the 9-slice's bottom corners and
   * side will have a height of 16 pixels. You can set all 4 margin values individually to create
   * panels with non-uniform borders.
   */
  public final inline var patchMarginBottom: Int
    @JvmName("patchMarginBottomProperty")
    get() = getPatchMargin(Side.SIDE_BOTTOM)
    @JvmName("patchMarginBottomProperty")
    set(`value`) {
      setPatchMargin(Side.SIDE_BOTTOM, value)
    }

  /**
   * The stretch mode to use for horizontal stretching/tiling. See [NinePatchRect.AxisStretchMode]
   * for possible values.
   */
  public final inline var axisStretchHorizontal: AxisStretchMode
    @JvmName("axisStretchHorizontalProperty")
    get() = getHAxisStretchMode()
    @JvmName("axisStretchHorizontalProperty")
    set(`value`) {
      setHAxisStretchMode(value)
    }

  /**
   * The stretch mode to use for vertical stretching/tiling. See [NinePatchRect.AxisStretchMode] for
   * possible values.
   */
  public final inline var axisStretchVertical: AxisStretchMode
    @JvmName("axisStretchVerticalProperty")
    get() = getVAxisStretchMode()
    @JvmName("axisStretchVerticalProperty")
    set(`value`) {
      setVAxisStretchMode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_NINEPATCHRECT, scriptIndex)
  }

  /**
   * Rectangular region of the texture to sample from. If you're working with an atlas, use this
   * property to define the area the 9-slice should use. All other properties are relative to this one.
   * If the rect is empty, NinePatchRect will use the whole texture.
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
   * val myCoreType = ninepatchrect.regionRect
   * //Your changes
   * ninepatchrect.regionRect = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun regionRectMutate(block: Rect2.() -> Unit): Rect2 = regionRect.apply{
      block(this)
      regionRect = this
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

  /**
   * Sets the size of the margin on the specified [Side] to [value] pixels.
   */
  public final fun setPatchMargin(margin: Side, `value`: Int): Unit {
    TransferContext.writeArguments(LONG to margin.id, LONG to value.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setPatchMarginPtr, NIL)
  }

  /**
   * Returns the size of the margin on the specified [Side].
   */
  public final fun getPatchMargin(margin: Side): Int {
    TransferContext.writeArguments(LONG to margin.id)
    TransferContext.callMethod(ptr, MethodBindings.getPatchMarginPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setRegionRect(rect: Rect2): Unit {
    TransferContext.writeArguments(RECT2 to rect)
    TransferContext.callMethod(ptr, MethodBindings.setRegionRectPtr, NIL)
  }

  public final fun getRegionRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRegionRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  public final fun setDrawCenter(drawCenter: Boolean): Unit {
    TransferContext.writeArguments(BOOL to drawCenter)
    TransferContext.callMethod(ptr, MethodBindings.setDrawCenterPtr, NIL)
  }

  public final fun isDrawCenterEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDrawCenterEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setHAxisStretchMode(mode: AxisStretchMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setHAxisStretchModePtr, NIL)
  }

  public final fun getHAxisStretchMode(): AxisStretchMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHAxisStretchModePtr, LONG)
    return NinePatchRect.AxisStretchMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setVAxisStretchMode(mode: AxisStretchMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setVAxisStretchModePtr, NIL)
  }

  public final fun getVAxisStretchMode(): AxisStretchMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVAxisStretchModePtr, LONG)
    return NinePatchRect.AxisStretchMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class AxisStretchMode(
    id: Long,
  ) {
    /**
     * Stretches the center texture across the NinePatchRect. This may cause the texture to be
     * distorted.
     */
    AXIS_STRETCH_MODE_STRETCH(0),
    /**
     * Repeats the center texture across the NinePatchRect. This won't cause any visible distortion.
     * The texture must be seamless for this to work without displaying artifacts between edges.
     */
    AXIS_STRETCH_MODE_TILE(1),
    /**
     * Repeats the center texture across the NinePatchRect, but will also stretch the texture to
     * make sure each tile is visible in full. This may cause the texture to be distorted, but less
     * than [AXIS_STRETCH_MODE_STRETCH]. The texture must be seamless for this to work without
     * displaying artifacts between edges.
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
        TypeManager.getMethodBindPtr("NinePatchRect", "set_texture", 4051416890)

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NinePatchRect", "get_texture", 3635182373)

    public val setPatchMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NinePatchRect", "set_patch_margin", 437707142)

    public val getPatchMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NinePatchRect", "get_patch_margin", 1983885014)

    public val setRegionRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NinePatchRect", "set_region_rect", 2046264180)

    public val getRegionRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NinePatchRect", "get_region_rect", 1639390495)

    public val setDrawCenterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NinePatchRect", "set_draw_center", 2586408642)

    public val isDrawCenterEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NinePatchRect", "is_draw_center_enabled", 36873697)

    public val setHAxisStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NinePatchRect", "set_h_axis_stretch_mode", 3219608417)

    public val getHAxisStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NinePatchRect", "get_h_axis_stretch_mode", 3317113799)

    public val setVAxisStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NinePatchRect", "set_v_axis_stretch_mode", 3219608417)

    public val getVAxisStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NinePatchRect", "get_v_axis_stretch_mode", 3317113799)
  }
}
