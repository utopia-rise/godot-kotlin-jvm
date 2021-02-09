// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class Theme : Resource() {
  open var defaultFont: Font?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_DEFAULT_FONT, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Font?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_DEFAULT_FONT, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_THEME)

  open fun _emit_theme_changed() {
  }

  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR, NIL)
  }

  open fun clearColor(name: String, type: String) {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_COLOR, NIL)
  }

  open fun clearConstant(name: String, type: String) {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_CONSTANT, NIL)
  }

  open fun clearFont(name: String, type: String) {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_FONT, NIL)
  }

  open fun clearIcon(name: String, type: String) {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_ICON, NIL)
  }

  open fun clearStylebox(name: String, type: String) {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_STYLEBOX, NIL)
  }

  open fun copyDefaultTheme() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_COPY_DEFAULT_THEME, NIL)
  }

  open fun copyTheme(other: Theme) {
    TransferContext.writeArguments(OBJECT to other)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_COPY_THEME, NIL)
  }

  open fun getColor(name: String, type: String): Color {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  open fun getColorList(type: String): PoolStringArray {
    TransferContext.writeArguments(STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_COLOR_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  open fun getConstant(name: String, type: String): Long {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_CONSTANT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getConstantList(type: String): PoolStringArray {
    TransferContext.writeArguments(STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_CONSTANT_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  open fun getFont(name: String, type: String): Font? {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_FONT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Font?
  }

  open fun getFontList(type: String): PoolStringArray {
    TransferContext.writeArguments(STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_FONT_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  open fun getIcon(name: String, type: String): Texture? {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  open fun getIconList(type: String): PoolStringArray {
    TransferContext.writeArguments(STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_ICON_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  open fun getStylebox(name: String, type: String): StyleBox? {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_STYLEBOX, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as StyleBox?
  }

  open fun getStyleboxList(type: String): PoolStringArray {
    TransferContext.writeArguments(STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_STYLEBOX_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  open fun getStyleboxTypes(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_STYLEBOX_TYPES,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  open fun getTypeList(type: String): PoolStringArray {
    TransferContext.writeArguments(STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_TYPE_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  open fun hasColor(name: String, type: String): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_COLOR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasConstant(name: String, type: String): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_CONSTANT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasFont(name: String, type: String): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_FONT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasIcon(name: String, type: String): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_ICON, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasStylebox(name: String, type: String): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_STYLEBOX, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun setColor(
    name: String,
    type: String,
    color: Color
  ) {
    TransferContext.writeArguments(STRING to name, STRING to type, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_COLOR, NIL)
  }

  open fun setConstant(
    name: String,
    type: String,
    constant: Long
  ) {
    TransferContext.writeArguments(STRING to name, STRING to type, LONG to constant)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_CONSTANT, NIL)
  }

  open fun setFont(
    name: String,
    type: String,
    font: Font
  ) {
    TransferContext.writeArguments(STRING to name, STRING to type, OBJECT to font)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_FONT, NIL)
  }

  open fun setIcon(
    name: String,
    type: String,
    texture: Texture
  ) {
    TransferContext.writeArguments(STRING to name, STRING to type, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_ICON, NIL)
  }

  open fun setStylebox(
    name: String,
    type: String,
    texture: StyleBox
  ) {
    TransferContext.writeArguments(STRING to name, STRING to type, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_STYLEBOX, NIL)
  }
}
