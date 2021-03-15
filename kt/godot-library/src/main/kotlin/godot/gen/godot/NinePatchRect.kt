// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Scalable texture-based frame that tiles the texture's centers and sides, but keeps the corners' original size. Perfect for panels and dialog boxes.
 *
 * Also known as 9-slice panels, NinePatchRect produces clean panels of any size, based on a small texture. To do so, it splits the texture in a 3×3 grid. When you scale the node, it tiles the texture's sides horizontally or vertically, the center on both axes but it doesn't scale or tile the corners.
 */
@GodotBaseType
open class NinePatchRect : Control() {
  /**
   * Emitted when the node's texture changes.
   */
  val textureChanged: Signal0 by signal()

  /**
   * Doesn't do anything at the time of writing.
   */
  open var axisStretchHorizontal: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_GET_AXIS_STRETCH_HORIZONTAL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_SET_AXIS_STRETCH_HORIZONTAL, NIL)
    }

  /**
   * Doesn't do anything at the time of writing.
   */
  open var axisStretchVertical: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_GET_AXIS_STRETCH_VERTICAL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_SET_AXIS_STRETCH_VERTICAL, NIL)
    }

  /**
   * If `true`, draw the panel's center. Else, only draw the 9-slice's borders.
   */
  open var drawCenter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_GET_DRAW_CENTER,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_SET_DRAW_CENTER,
          NIL)
    }

  /**
   * The height of the 9-slice's bottom row. A margin of 16 means the 9-slice's bottom corners and side will have a height of 16 pixels. You can set all 4 margin values individually to create panels with non-uniform borders.
   */
  open var patchMarginBottom: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_GET_PATCH_MARGIN_BOTTOM, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_SET_PATCH_MARGIN_BOTTOM, NIL)
    }

  /**
   * The height of the 9-slice's left column.
   */
  open var patchMarginLeft: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_GET_PATCH_MARGIN_LEFT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_SET_PATCH_MARGIN_LEFT, NIL)
    }

  /**
   * The height of the 9-slice's right column.
   */
  open var patchMarginRight: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_GET_PATCH_MARGIN_RIGHT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_SET_PATCH_MARGIN_RIGHT, NIL)
    }

  /**
   * The height of the 9-slice's top row.
   */
  open var patchMarginTop: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_GET_PATCH_MARGIN_TOP, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_SET_PATCH_MARGIN_TOP, NIL)
    }

  /**
   * Rectangular region of the texture to sample from. If you're working with an atlas, use this property to define the area the 9-slice should use. All other properties are relative to this one. If the rect is empty, NinePatchRect will use the whole texture.
   */
  open var regionRect: Rect2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_GET_REGION_RECT,
          RECT2)
      return TransferContext.readReturnValue(RECT2, false) as Rect2
    }
    set(value) {
      TransferContext.writeArguments(RECT2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_SET_REGION_RECT,
          NIL)
    }

  /**
   * The node's texture resource.
   */
  open var texture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_GET_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NINEPATCHRECT_SET_TEXTURE, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_NINEPATCHRECT, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun regionRect(schedule: Rect2.() -> Unit): Rect2 = regionRect.apply{
      schedule(this)
      regionRect = this
  }


  enum class AxisStretchMode(
    id: Long
  ) {
    /**
     * Doesn't do anything at the time of writing.
     */
    AXIS_STRETCH_MODE_STRETCH(0),

    /**
     * Doesn't do anything at the time of writing.
     */
    AXIS_STRETCH_MODE_TILE(1),

    /**
     * Doesn't do anything at the time of writing.
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
     * Doesn't do anything at the time of writing.
     */
    final const val AXIS_STRETCH_MODE_STRETCH: Long = 0

    /**
     * Doesn't do anything at the time of writing.
     */
    final const val AXIS_STRETCH_MODE_TILE: Long = 1

    /**
     * Doesn't do anything at the time of writing.
     */
    final const val AXIS_STRETCH_MODE_TILE_FIT: Long = 2
  }
}
