// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class StyleBoxFlat : StyleBox() {
  open var antiAliasing: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_ANTI_ALIASING,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_ANTI_ALIASING,
          NIL)
    }

  open var antiAliasingSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_ANTI_ALIASING_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_ANTI_ALIASING_SIZE, NIL)
    }

  open var bgColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_BG_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_BG_COLOR, NIL)
    }

  open var borderBlend: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_BORDER_BLEND,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_BORDER_BLEND,
          NIL)
    }

  open var borderColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_BORDER_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_BORDER_COLOR,
          NIL)
    }

  open var borderWidthBottom: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_BORDER_WIDTH_BOTTOM, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_BORDER_WIDTH_BOTTOM, NIL)
    }

  open var borderWidthLeft: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_BORDER_WIDTH_LEFT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_BORDER_WIDTH_LEFT, NIL)
    }

  open var borderWidthRight: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_BORDER_WIDTH_RIGHT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_BORDER_WIDTH_RIGHT, NIL)
    }

  open var borderWidthTop: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_BORDER_WIDTH_TOP,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_BORDER_WIDTH_TOP,
          NIL)
    }

  open var cornerDetail: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_CORNER_DETAIL,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_CORNER_DETAIL,
          NIL)
    }

  open var cornerRadiusBottomLeft: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_CORNER_RADIUS_BOTTOM_LEFT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_CORNER_RADIUS_BOTTOM_LEFT, NIL)
    }

  open var cornerRadiusBottomRight: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_CORNER_RADIUS_BOTTOM_RIGHT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_CORNER_RADIUS_BOTTOM_RIGHT, NIL)
    }

  open var cornerRadiusTopLeft: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_CORNER_RADIUS_TOP_LEFT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_CORNER_RADIUS_TOP_LEFT, NIL)
    }

  open var cornerRadiusTopRight: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_CORNER_RADIUS_TOP_RIGHT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_CORNER_RADIUS_TOP_RIGHT, NIL)
    }

  open var drawCenter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_DRAW_CENTER,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_DRAW_CENTER, NIL)
    }

  open var expandMarginBottom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_EXPAND_MARGIN_BOTTOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_EXPAND_MARGIN_BOTTOM, NIL)
    }

  open var expandMarginLeft: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_EXPAND_MARGIN_LEFT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_EXPAND_MARGIN_LEFT, NIL)
    }

  open var expandMarginRight: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_EXPAND_MARGIN_RIGHT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_EXPAND_MARGIN_RIGHT, NIL)
    }

  open var expandMarginTop: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_EXPAND_MARGIN_TOP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_EXPAND_MARGIN_TOP, NIL)
    }

  open var shadowColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_SHADOW_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_SHADOW_COLOR,
          NIL)
    }

  open var shadowOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_SHADOW_OFFSET,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_SHADOW_OFFSET,
          NIL)
    }

  open var shadowSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_SHADOW_SIZE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_SHADOW_SIZE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_STYLEBOXFLAT)

  open fun bgColor(schedule: Color.() -> Unit): Color = bgColor.apply{
      schedule(this)
      bgColor = this
  }


  open fun borderColor(schedule: Color.() -> Unit): Color = borderColor.apply{
      schedule(this)
      borderColor = this
  }


  open fun shadowColor(schedule: Color.() -> Unit): Color = shadowColor.apply{
      schedule(this)
      shadowColor = this
  }


  open fun shadowOffset(schedule: Vector2.() -> Unit): Vector2 = shadowOffset.apply{
      schedule(this)
      shadowOffset = this
  }


  open fun getBorderWidthMin(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_BORDER_WIDTH_MIN,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun setBorderWidthAll(width: Long) {
    TransferContext.writeArguments(LONG to width)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_BORDER_WIDTH_ALL,
        NIL)
  }

  open fun setCornerRadiusAll(radius: Long) {
    TransferContext.writeArguments(LONG to radius)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_CORNER_RADIUS_ALL,
        NIL)
  }

  open fun setCornerRadiusIndividual(
    radiusTopLeft: Long,
    radiusTopRight: Long,
    radiusBottomRight: Long,
    radiusBottomLeft: Long
  ) {
    TransferContext.writeArguments(LONG to radiusTopLeft, LONG to radiusTopRight, LONG to
        radiusBottomRight, LONG to radiusBottomLeft)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_CORNER_RADIUS_INDIVIDUAL, NIL)
  }

  open fun setExpandMarginAll(size: Double) {
    TransferContext.writeArguments(DOUBLE to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_EXPAND_MARGIN_ALL,
        NIL)
  }

  open fun setExpandMarginIndividual(
    sizeLeft: Double,
    sizeTop: Double,
    sizeRight: Double,
    sizeBottom: Double
  ) {
    TransferContext.writeArguments(DOUBLE to sizeLeft, DOUBLE to sizeTop, DOUBLE to sizeRight,
        DOUBLE to sizeBottom)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_EXPAND_MARGIN_INDIVIDUAL, NIL)
  }
}
