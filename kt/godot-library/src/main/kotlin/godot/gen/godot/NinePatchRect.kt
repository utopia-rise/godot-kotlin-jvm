// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Rect2
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A control that displays a texture by keeping its corners intact, but tiling its edges and center.
 *
 * Also known as 9-slice panels, [godot.NinePatchRect] produces clean panels of any size based on a small texture. To do so, it splits the texture in a 3×3 grid. When you scale the node, it tiles the texture's edges horizontally or vertically, tiles the center on both axes, and leaves the corners unchanged.
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
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_GET_TEXTURE, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_SET_TEXTURE, NIL)
    }

  /**
   * If `true`, draw the panel's center. Else, only draw the 9-slice's borders.
   */
  public var drawCenter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_IS_DRAW_CENTER_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_SET_DRAW_CENTER,
          NIL)
    }

  /**
   * Rectangular region of the texture to sample from. If you're working with an atlas, use this property to define the area the 9-slice should use. All other properties are relative to this one. If the rect is empty, NinePatchRect will use the whole texture.
   */
  public var regionRect: Rect2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_GET_REGION_RECT,
          RECT2)
      return (TransferContext.readReturnValue(RECT2, false) as Rect2)
    }
    set(`value`) {
      TransferContext.writeArguments(RECT2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_SET_REGION_RECT,
          NIL)
    }

  /**
   * The stretch mode to use for horizontal stretching/tiling. See [enum NinePatchRect.AxisStretchMode] for possible values.
   */
  public var axisStretchHorizontal: AxisStretchMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_GET_H_AXIS_STRETCH_MODE, LONG)
      return NinePatchRect.AxisStretchMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_SET_H_AXIS_STRETCH_MODE, NIL)
    }

  /**
   * The stretch mode to use for vertical stretching/tiling. See [enum NinePatchRect.AxisStretchMode] for possible values.
   */
  public var axisStretchVertical: AxisStretchMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_GET_V_AXIS_STRETCH_MODE, LONG)
      return NinePatchRect.AxisStretchMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_SET_V_AXIS_STRETCH_MODE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NINEPATCHRECT, scriptIndex)
    return true
  }

  /**
   * Sets the size of the margin on the specified [enum Side] to [value] pixels.
   */
  public fun setPatchMargin(margin: Side, `value`: Int): Unit {
    TransferContext.writeArguments(LONG to margin.id, LONG to value.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_SET_PATCH_MARGIN, NIL)
  }

  /**
   * Returns the size of the margin on the specified [enum Side].
   */
  public fun getPatchMargin(margin: Side): Int {
    TransferContext.writeArguments(LONG to margin.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_GET_PATCH_MARGIN,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public enum class AxisStretchMode(
    id: Long,
  ) {
    /**
     * Stretches the center texture across the NinePatchRect. This may cause the texture to be distorted.
     */
    AXIS_STRETCH_MODE_STRETCH(0),
    /**
     * Repeats the center texture across the NinePatchRect. This won't cause any visible distortion. The texture must be seamless for this to work without displaying artifacts between edges.
     */
    AXIS_STRETCH_MODE_TILE(1),
    /**
     * Repeats the center texture across the NinePatchRect, but will also stretch the texture to make sure each tile is visible in full. This may cause the texture to be distorted, but less than [AXIS_STRETCH_MODE_STRETCH]. The texture must be seamless for this to work without displaying artifacts between edges.
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
}
