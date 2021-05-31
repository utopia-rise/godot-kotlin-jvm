// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
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
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Theme for controls.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.3/tutorials/gui/gui_skinning.html](https://docs.godotengine.org/en/3.3/tutorials/gui/gui_skinning.html)
 *
 * A theme for skinning controls. Controls can be skinned individually, but for complex applications, it's more practical to just create a global theme that defines everything. This theme can be applied to any [godot.Control]; the Control and its children will automatically use it.
 *
 * Theme resources can alternatively be loaded by writing them in a `.theme` file, see the documentation for more information.
 */
@GodotBaseType
public open class Theme : Resource() {
  /**
   * The theme's default font.
   */
  public open var defaultFont: Font?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_DEFAULT_FONT, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Font?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_DEFAULT_FONT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_THEME)
  }

  public open fun _emitThemeChanged(): Unit {
  }

  /**
   * Clears all values on the theme.
   */
  public open fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR, NIL)
  }

  /**
   * Clears the [godot.core.Color] at `name` if the theme has `node_type`.
   */
  public open fun clearColor(name: String, nodeType: String): Unit {
    TransferContext.writeArguments(STRING to name, STRING to nodeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_COLOR, NIL)
  }

  /**
   * Clears the constant at `name` if the theme has `node_type`.
   */
  public open fun clearConstant(name: String, nodeType: String): Unit {
    TransferContext.writeArguments(STRING to name, STRING to nodeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_CONSTANT, NIL)
  }

  /**
   * Clears the [godot.Font] at `name` if the theme has `node_type`.
   */
  public open fun clearFont(name: String, nodeType: String): Unit {
    TransferContext.writeArguments(STRING to name, STRING to nodeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_FONT, NIL)
  }

  /**
   * Clears the icon at `name` if the theme has `node_type`.
   */
  public open fun clearIcon(name: String, nodeType: String): Unit {
    TransferContext.writeArguments(STRING to name, STRING to nodeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_ICON, NIL)
  }

  /**
   * Clears [godot.StyleBox] at `name` if the theme has `node_type`.
   */
  public open fun clearStylebox(name: String, nodeType: String): Unit {
    TransferContext.writeArguments(STRING to name, STRING to nodeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_STYLEBOX, NIL)
  }

  /**
   * Sets the theme's values to a copy of the default theme values.
   */
  public open fun copyDefaultTheme(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_COPY_DEFAULT_THEME, NIL)
  }

  /**
   * Sets the theme's values to a copy of a given theme.
   */
  public open fun copyTheme(other: Theme): Unit {
    TransferContext.writeArguments(OBJECT to other)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_COPY_THEME, NIL)
  }

  /**
   * Returns the [godot.core.Color] at `name` if the theme has `node_type`.
   */
  public open fun getColor(name: String, nodeType: String): Color {
    TransferContext.writeArguments(STRING to name, STRING to nodeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns all the [godot.core.Color]s as a [godot.core.PoolStringArray] filled with each [godot.core.Color]'s name, for use in [getColor], if the theme has `node_type`.
   */
  public open fun getColorList(nodeType: String): PoolStringArray {
    TransferContext.writeArguments(STRING to nodeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_COLOR_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the constant at `name` if the theme has `node_type`.
   */
  public open fun getConstant(name: String, nodeType: String): Long {
    TransferContext.writeArguments(STRING to name, STRING to nodeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_CONSTANT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns all the constants as a [godot.core.PoolStringArray] filled with each constant's name, for use in [getConstant], if the theme has `node_type`.
   */
  public open fun getConstantList(nodeType: String): PoolStringArray {
    TransferContext.writeArguments(STRING to nodeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_CONSTANT_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the [godot.Font] at `name` if the theme has `node_type`.
   */
  public open fun getFont(name: String, nodeType: String): Font? {
    TransferContext.writeArguments(STRING to name, STRING to nodeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_FONT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Font?
  }

  /**
   * Returns all the [godot.Font]s as a [godot.core.PoolStringArray] filled with each [godot.Font]'s name, for use in [getFont], if the theme has `node_type`.
   */
  public open fun getFontList(nodeType: String): PoolStringArray {
    TransferContext.writeArguments(STRING to nodeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_FONT_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the icon [godot.Texture] at `name` if the theme has `node_type`.
   */
  public open fun getIcon(name: String, nodeType: String): Texture? {
    TransferContext.writeArguments(STRING to name, STRING to nodeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  /**
   * Returns all the icons as a [godot.core.PoolStringArray] filled with each [godot.Texture]'s name, for use in [getIcon], if the theme has `node_type`.
   */
  public open fun getIconList(nodeType: String): PoolStringArray {
    TransferContext.writeArguments(STRING to nodeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_ICON_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the [godot.StyleBox] at `name` if the theme has `node_type`.
   *
   * Valid `name`s may be found using [getStyleboxList]. Valid `node_type`s may be found using [getStyleboxTypes].
   */
  public open fun getStylebox(name: String, nodeType: String): StyleBox? {
    TransferContext.writeArguments(STRING to name, STRING to nodeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_STYLEBOX, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as StyleBox?
  }

  /**
   * Returns all the [godot.StyleBox]s as a [godot.core.PoolStringArray] filled with each [godot.StyleBox]'s name, for use in [getStylebox], if the theme has `node_type`.
   *
   * Valid `node_type`s may be found using [getStyleboxTypes].
   */
  public open fun getStyleboxList(nodeType: String): PoolStringArray {
    TransferContext.writeArguments(STRING to nodeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_STYLEBOX_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns all the [godot.StyleBox] types as a [godot.core.PoolStringArray] filled with each [godot.StyleBox]'s type, for use in [getStylebox] and/or [getStyleboxList], if the theme has `node_type`.
   */
  public open fun getStyleboxTypes(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_STYLEBOX_TYPES,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns all the types in `node_type` as a [godot.core.PoolStringArray] for use in any of the `get_*` functions, if the theme has `node_type`.
   */
  public open fun getTypeList(nodeType: String): PoolStringArray {
    TransferContext.writeArguments(STRING to nodeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_TYPE_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns `true` if [godot.core.Color] with `name` is in `node_type`.
   *
   * Returns `false` if the theme does not have `node_type`.
   */
  public open fun hasColor(name: String, nodeType: String): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to nodeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_COLOR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if constant with `name` is in `node_type`.
   *
   * Returns `false` if the theme does not have `node_type`.
   */
  public open fun hasConstant(name: String, nodeType: String): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to nodeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_CONSTANT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if [godot.Font] with `name` is in `node_type`.
   *
   * Returns `false` if the theme does not have `node_type`.
   */
  public open fun hasFont(name: String, nodeType: String): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to nodeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_FONT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if icon [godot.Texture] with `name` is in `node_type`.
   *
   * Returns `false` if the theme does not have `node_type`.
   */
  public open fun hasIcon(name: String, nodeType: String): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to nodeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_ICON, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if [godot.StyleBox] with `name` is in `node_type`.
   *
   * Returns `false` if the theme does not have `node_type`.
   */
  public open fun hasStylebox(name: String, nodeType: String): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to nodeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_STYLEBOX, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the theme's [godot.core.Color] to `color` at `name` in `node_type`.
   *
   * Does nothing if the theme does not have `node_type`.
   */
  public open fun setColor(
    name: String,
    nodeType: String,
    color: Color
  ): Unit {
    TransferContext.writeArguments(STRING to name, STRING to nodeType, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_COLOR, NIL)
  }

  /**
   * Sets the theme's constant to `constant` at `name` in `node_type`.
   *
   * Does nothing if the theme does not have `node_type`.
   */
  public open fun setConstant(
    name: String,
    nodeType: String,
    constant: Long
  ): Unit {
    TransferContext.writeArguments(STRING to name, STRING to nodeType, LONG to constant)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_CONSTANT, NIL)
  }

  /**
   * Sets the theme's [godot.Font] to `font` at `name` in `node_type`.
   *
   * Does nothing if the theme does not have `node_type`.
   */
  public open fun setFont(
    name: String,
    nodeType: String,
    font: Font
  ): Unit {
    TransferContext.writeArguments(STRING to name, STRING to nodeType, OBJECT to font)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_FONT, NIL)
  }

  /**
   * Sets the theme's icon [godot.Texture] to `texture` at `name` in `node_type`.
   *
   * Does nothing if the theme does not have `node_type`.
   */
  public open fun setIcon(
    name: String,
    nodeType: String,
    texture: Texture
  ): Unit {
    TransferContext.writeArguments(STRING to name, STRING to nodeType, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_ICON, NIL)
  }

  /**
   * Sets theme's [godot.StyleBox] to `stylebox` at `name` in `node_type`.
   *
   * Does nothing if the theme does not have `node_type`.
   */
  public open fun setStylebox(
    name: String,
    nodeType: String,
    texture: StyleBox
  ): Unit {
    TransferContext.writeArguments(STRING to name, STRING to nodeType, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_STYLEBOX, NIL)
  }
}
