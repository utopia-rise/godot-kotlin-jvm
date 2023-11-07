// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

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
  public val textureChanged: Signal0 by signal()

  /**
   * The node's texture resource.
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
   * If `true`, draw the panel's center. Else, only draw the 9-slice's borders.
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

  /**
   * Rectangular region of the texture to sample from. If you're working with an atlas, use this
   * property to define the area the 9-slice should use. All other properties are relative to this one.
   * If the rect is empty, NinePatchRect will use the whole texture.
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
   * The width of the 9-slice's left column. A margin of 16 means the 9-slice's left corners and
   * side will have a width of 16 pixels. You can set all 4 margin values individually to create panels
   * with non-uniform borders.
   */
  public var patchMarginLeft: Int
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getPatchMarginPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setPatchMarginPtr, NIL)
    }

  /**
   * The height of the 9-slice's top row. A margin of 16 means the 9-slice's top corners and side
   * will have a height of 16 pixels. You can set all 4 margin values individually to create panels
   * with non-uniform borders.
   */
  public var patchMarginTop: Int
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getPatchMarginPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setPatchMarginPtr, NIL)
    }

  /**
   * The width of the 9-slice's right column. A margin of 16 means the 9-slice's right corners and
   * side will have a width of 16 pixels. You can set all 4 margin values individually to create panels
   * with non-uniform borders.
   */
  public var patchMarginRight: Int
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getPatchMarginPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setPatchMarginPtr, NIL)
    }

  /**
   * The height of the 9-slice's bottom row. A margin of 16 means the 9-slice's bottom corners and
   * side will have a height of 16 pixels. You can set all 4 margin values individually to create
   * panels with non-uniform borders.
   */
  public var patchMarginBottom: Int
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getPatchMarginPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setPatchMarginPtr, NIL)
    }

  /**
   * The stretch mode to use for horizontal stretching/tiling. See [enum
   * NinePatchRect.AxisStretchMode] for possible values.
   */
  public var axisStretchHorizontal: AxisStretchMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHAxisStretchModePtr, LONG)
      return NinePatchRect.AxisStretchMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setHAxisStretchModePtr, NIL)
    }

  /**
   * The stretch mode to use for vertical stretching/tiling. See [enum
   * NinePatchRect.AxisStretchMode] for possible values.
   */
  public var axisStretchVertical: AxisStretchMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVAxisStretchModePtr, LONG)
      return NinePatchRect.AxisStretchMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setVAxisStretchModePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NINEPATCHRECT, scriptIndex)
    return true
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
  public open fun regionRectMutate(block: Rect2.() -> Unit): Rect2 = regionRect.apply{
      block(this)
      regionRect = this
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
     * than [constant AXIS_STRETCH_MODE_STRETCH]. The texture must be seamless for this to work without
     * displaying artifacts between edges.
     */
    AXIS_STRETCH_MODE_TILE_FIT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setTexturePtr: VoidPtr = TypeManager.getMethodBindPtr("NinePatchRect", "set_texture")

    public val getTexturePtr: VoidPtr = TypeManager.getMethodBindPtr("NinePatchRect", "get_texture")

    public val setPatchMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NinePatchRect", "set_patch_margin")

    public val getPatchMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NinePatchRect", "get_patch_margin")

    public val setRegionRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NinePatchRect", "set_region_rect")

    public val getRegionRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NinePatchRect", "get_region_rect")

    public val setDrawCenterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NinePatchRect", "set_draw_center")

    public val isDrawCenterEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NinePatchRect", "is_draw_center_enabled")

    public val setHAxisStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NinePatchRect", "set_h_axis_stretch_mode")

    public val getHAxisStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NinePatchRect", "get_h_axis_stretch_mode")

    public val setVAxisStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NinePatchRect", "set_v_axis_stretch_mode")

    public val getVAxisStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NinePatchRect", "get_v_axis_stretch_mode")
  }
}
