// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
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
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
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
open class StyleBoxTexture : StyleBox() {
  /**
   * Emitted when the stylebox's texture is changed.
   */
  val textureChanged: Signal0 by signal()

  /**
   * Controls how the stylebox's texture will be stretched or tiled horizontally. See [enum AxisStretchMode] for possible values.
   */
  open var axisStretchHorizontal: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_GET_AXIS_STRETCH_HORIZONTAL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_AXIS_STRETCH_HORIZONTAL, NIL)
    }

  /**
   * Controls how the stylebox's texture will be stretched or tiled vertically. See [enum AxisStretchMode] for possible values.
   */
  open var axisStretchVertical: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_GET_AXIS_STRETCH_VERTICAL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_AXIS_STRETCH_VERTICAL, NIL)
    }

  /**
   * If `true`, the nine-patch texture's center tile will be drawn.
   */
  open var drawCenter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_GET_DRAW_CENTER,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_DRAW_CENTER,
          NIL)
    }

  /**
   * Expands the bottom margin of this style box when drawing, causing it to be drawn larger than requested.
   */
  open var expandMarginBottom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_GET_EXPAND_MARGIN_BOTTOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_EXPAND_MARGIN_BOTTOM, NIL)
    }

  /**
   * Expands the left margin of this style box when drawing, causing it to be drawn larger than requested.
   */
  open var expandMarginLeft: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_GET_EXPAND_MARGIN_LEFT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_EXPAND_MARGIN_LEFT, NIL)
    }

  /**
   * Expands the right margin of this style box when drawing, causing it to be drawn larger than requested.
   */
  open var expandMarginRight: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_GET_EXPAND_MARGIN_RIGHT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_EXPAND_MARGIN_RIGHT, NIL)
    }

  /**
   * Expands the top margin of this style box when drawing, causing it to be drawn larger than requested.
   */
  open var expandMarginTop: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_GET_EXPAND_MARGIN_TOP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_EXPAND_MARGIN_TOP, NIL)
    }

  /**
   * Increases the bottom margin of the 3×3 texture box.
   *
   * A higher value means more of the source texture is considered to be part of the bottom border of the 3×3 box.
   *
   * This is also the value used as fallback for [godot.StyleBox.contentMarginBottom] if it is negative.
   */
  open var marginBottom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_GET_MARGIN_BOTTOM,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_MARGIN_BOTTOM,
          NIL)
    }

  /**
   * Increases the left margin of the 3×3 texture box.
   *
   * A higher value means more of the source texture is considered to be part of the left border of the 3×3 box.
   *
   * This is also the value used as fallback for [godot.StyleBox.contentMarginLeft] if it is negative.
   */
  open var marginLeft: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_GET_MARGIN_LEFT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_MARGIN_LEFT,
          NIL)
    }

  /**
   * Increases the right margin of the 3×3 texture box.
   *
   * A higher value means more of the source texture is considered to be part of the right border of the 3×3 box.
   *
   * This is also the value used as fallback for [godot.StyleBox.contentMarginRight] if it is negative.
   */
  open var marginRight: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_GET_MARGIN_RIGHT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_MARGIN_RIGHT,
          NIL)
    }

  /**
   * Increases the top margin of the 3×3 texture box.
   *
   * A higher value means more of the source texture is considered to be part of the top border of the 3×3 box.
   *
   * This is also the value used as fallback for [godot.StyleBox.contentMarginTop] if it is negative.
   */
  open var marginTop: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_GET_MARGIN_TOP,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_MARGIN_TOP,
          NIL)
    }

  /**
   * Modulates the color of the texture when this style box is drawn.
   */
  open var modulateColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_GET_MODULATE_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_MODULATE_COLOR, NIL)
    }

  /**
   * The normal map to use when drawing this style box.
   *
   * **Note:** Godot expects the normal map to use X+, Y-, and Z+ coordinates. See [this page](http://wiki.polycount.com/wiki/Normal_Map_Technical_Details#Common_Swizzle_Coordinates) for a comparison of normal map coordinates expected by popular engines.
   */
  open var normalMap: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_GET_NORMAL_MAP,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_NORMAL_MAP,
          NIL)
    }

  /**
   * Species a sub-region of the texture to use.
   *
   * This is equivalent to first wrapping the texture in an [godot.AtlasTexture] with the same region.
   */
  open var regionRect: Rect2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_GET_REGION_RECT,
          RECT2)
      return TransferContext.readReturnValue(RECT2, false) as Rect2
    }
    set(value) {
      TransferContext.writeArguments(RECT2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_REGION_RECT,
          NIL)
    }

  /**
   * The texture to use when drawing this style box.
   */
  open var texture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_GET_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_TEXTURE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_STYLEBOXTEXTURE)

  open fun modulateColor(schedule: Color.() -> Unit): Color = modulateColor.apply{
      schedule(this)
      modulateColor = this
  }


  open fun regionRect(schedule: Rect2.() -> Unit): Rect2 = regionRect.apply{
      schedule(this)
      regionRect = this
  }


  /**
   * Sets the expand margin to `size` pixels for all margins.
   */
  open fun setExpandMarginAll(size: Double) {
    TransferContext.writeArguments(DOUBLE to size)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_EXPAND_MARGIN_ALL, NIL)
  }

  /**
   * Sets the expand margin for each margin to `size_left`, `size_top`, `size_right`, and `size_bottom` pixels.
   */
  open fun setExpandMarginIndividual(
    sizeLeft: Double,
    sizeTop: Double,
    sizeRight: Double,
    sizeBottom: Double
  ) {
    TransferContext.writeArguments(DOUBLE to sizeLeft, DOUBLE to sizeTop, DOUBLE to sizeRight,
        DOUBLE to sizeBottom)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_STYLEBOXTEXTURE_SET_EXPAND_MARGIN_INDIVIDUAL, NIL)
  }

  enum class AxisStretchMode(
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
    AXIS_STRETCH_MODE_TILE_FIT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Stretch the stylebox's texture. This results in visible distortion unless the texture size matches the stylebox's size perfectly.
     */
    final const val AXIS_STRETCH_MODE_STRETCH: Long = 0

    /**
     * Repeats the stylebox's texture to match the stylebox's size according to the nine-patch system.
     */
    final const val AXIS_STRETCH_MODE_TILE: Long = 1

    /**
     * Repeats the stylebox's texture to match the stylebox's size according to the nine-patch system. Unlike [AXIS_STRETCH_MODE_TILE], the texture may be slightly stretched to make the nine-patch texture tile seamlessly.
     */
    final const val AXIS_STRETCH_MODE_TILE_FIT: Long = 2
  }
}
