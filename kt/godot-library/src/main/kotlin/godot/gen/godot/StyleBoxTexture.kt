// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Texture-based nine-patch [godot.StyleBox].
 *
 * Texture-based nine-patch [godot.StyleBox], in a way similar to [godot.NinePatchRect]. This stylebox performs a 3×3 scaling of a texture, where only the center cell is fully stretched. This makes it possible to design bordered styles regardless of the stylebox's size.
 */
@GodotBaseType
public open class StyleBoxTexture : StyleBox() {
  /**
   * The texture to use when drawing this style box.
   */
  public var texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_GET_TEXTURE,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_TEXTURE,
          NIL.ordinal)
    }

  /**
   * Species a sub-region of the texture to use.
   *
   * This is equivalent to first wrapping the texture in an [godot.AtlasTexture] with the same region.
   */
  public var regionRect: Rect2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_GET_REGION_RECT,
          RECT2.ordinal)
      return TransferContext.readReturnValue(RECT2, false) as Rect2
    }
    set(`value`) {
      TransferContext.writeArguments(RECT2 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_REGION_RECT,
          NIL.ordinal)
    }

  /**
   * Controls how the stylebox's texture will be stretched or tiled horizontally. See [enum AxisStretchMode] for possible values.
   */
  public var axisStretchHorizontal: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_GET_H_AXIS_STRETCH_MODE, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_H_AXIS_STRETCH_MODE, NIL.ordinal)
    }

  /**
   * Controls how the stylebox's texture will be stretched or tiled vertically. See [enum AxisStretchMode] for possible values.
   */
  public var axisStretchVertical: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_GET_V_AXIS_STRETCH_MODE, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_V_AXIS_STRETCH_MODE, NIL.ordinal)
    }

  /**
   * Modulates the color of the texture when this style box is drawn.
   */
  public var modulateColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_GET_MODULATE,
          COLOR.ordinal)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_MODULATE,
          NIL.ordinal)
    }

  /**
   * If `true`, the nine-patch texture's center tile will be drawn.
   */
  public var drawCenter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_IS_DRAW_CENTER_ENABLED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_DRAW_CENTER,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_STYLEBOXTEXTURE)
  }

  /**
   * Sets the margin to `size` pixels for the specified [enum Side].
   */
  public fun setMarginSize(margin: Side, size: Double): Unit {
    TransferContext.writeArguments(LONG to margin.id, DOUBLE to size)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_MARGIN_SIZE,
        NIL.ordinal)
  }

  /**
   * Returns the margin size of the specified [enum Side].
   */
  public fun getMarginSize(margin: Side): Double {
    TransferContext.writeArguments(LONG to margin.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_GET_MARGIN_SIZE,
        DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the expand margin to `size` pixels for the specified [enum Side].
   */
  public fun setExpandMarginSize(margin: Side, size: Double): Unit {
    TransferContext.writeArguments(LONG to margin.id, DOUBLE to size)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_EXPAND_MARGIN_SIZE,
        NIL.ordinal)
  }

  /**
   * Sets the expand margin to `size` pixels for all margins.
   */
  public fun setExpandMarginAll(size: Double): Unit {
    TransferContext.writeArguments(DOUBLE to size)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_EXPAND_MARGIN_ALL,
        NIL.ordinal)
  }

  /**
   * Sets the expand margin for each margin to `size_left`, `size_top`, `size_right`, and `size_bottom` pixels.
   */
  public fun setExpandMarginIndividual(
    sizeLeft: Double,
    sizeTop: Double,
    sizeRight: Double,
    sizeBottom: Double
  ): Unit {
    TransferContext.writeArguments(DOUBLE to sizeLeft, DOUBLE to sizeTop, DOUBLE to sizeRight, DOUBLE to sizeBottom)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_EXPAND_MARGIN_INDIVIDUAL, NIL.ordinal)
  }

  /**
   * Returns the expand margin size of the specified [enum Side].
   */
  public fun getExpandMarginSize(margin: Side): Double {
    TransferContext.writeArguments(LONG to margin.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_GET_EXPAND_MARGIN_SIZE,
        DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public enum class AxisStretchMode(
    id: Long
  ) {
    /**
     * Stretch the stylebox's texture. This results in visible distortion unless the texture size matches the stylebox's size perfectly.
     */
    AXIS_STRETCH_MODE_STRETCH(0),
    /**
     * Repeats the stylebox's texture to match the stylebox's size according to the nine-patch system.
     */
    AXIS_STRETCH_MODE_TILE(1),
    /**
     * Repeats the stylebox's texture to match the stylebox's size according to the nine-patch system. Unlike [AXIS_STRETCH_MODE_TILE], the texture may be slightly stretched to make the nine-patch texture tile seamlessly.
     */
    AXIS_STRETCH_MODE_TILE_FIT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
