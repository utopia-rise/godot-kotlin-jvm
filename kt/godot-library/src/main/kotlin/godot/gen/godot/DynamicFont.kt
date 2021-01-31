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
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class DynamicFont : Font() {
  open var extraSpacingBottom: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_EXTRA_SPACING_BOTTOM, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_SET_EXTRA_SPACING_BOTTOM, NIL)
    }

  open var extraSpacingChar: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_EXTRA_SPACING_CHAR, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_SET_EXTRA_SPACING_CHAR, NIL)
    }

  open var extraSpacingSpace: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_EXTRA_SPACING_SPACE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_SET_EXTRA_SPACING_SPACE, NIL)
    }

  open var extraSpacingTop: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_EXTRA_SPACING_TOP,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_SET_EXTRA_SPACING_TOP,
          NIL)
    }

  open var fontData: DynamicFontData?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_FONT_DATA, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as DynamicFontData?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_SET_FONT_DATA, NIL)
    }

  open var outlineColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_OUTLINE_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_SET_OUTLINE_COLOR,
          NIL)
    }

  open var outlineSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_OUTLINE_SIZE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_SET_OUTLINE_SIZE, NIL)
    }

  open var size: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_SET_SIZE, NIL)
    }

  open var useFilter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_USE_FILTER, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_SET_USE_FILTER, NIL)
    }

  open var useMipmaps: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_USE_MIPMAPS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_SET_USE_MIPMAPS, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_DYNAMICFONT)

  open fun outlineColor(schedule: Color.() -> Unit): Color = outlineColor.apply{
      schedule(this)
      outlineColor = this
  }


  open fun addFallback(data: DynamicFontData) {
    TransferContext.writeArguments(OBJECT to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_ADD_FALLBACK, NIL)
  }

  open fun getFallback(idx: Long): DynamicFontData? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_FALLBACK, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as DynamicFontData?
  }

  open fun getFallbackCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_FALLBACK_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun removeFallback(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_REMOVE_FALLBACK, NIL)
  }

  open fun setFallback(idx: Long, data: DynamicFontData) {
    TransferContext.writeArguments(LONG to idx, OBJECT to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_SET_FALLBACK, NIL)
  }

  enum class SpacingType(
    id: Long
  ) {
    SPACING_TOP(0),

    SPACING_BOTTOM(1),

    SPACING_CHAR(2),

    SPACING_SPACE(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val SPACING_BOTTOM: Long = 1

    final const val SPACING_CHAR: Long = 2

    final const val SPACING_SPACE: Long = 3

    final const val SPACING_TOP: Long = 0
  }
}
