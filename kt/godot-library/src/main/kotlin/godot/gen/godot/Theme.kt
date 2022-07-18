// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Theme resource for styling/skinning [godot.Control]s and [godot.Window]s.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/ui/gui_using_theme_editor.html]($DOCS_URL/tutorials/ui/gui_using_theme_editor.html)
 *
 * A theme resource is used for styling/skinning [godot.Control] and [godot.Window] nodes. While individual controls can be styled using their local theme overrides (see [godot.Control.addThemeColorOverride]), theme resources allow you to store and apply the same settings between all controls sharing the same type (e.g. style all [godot.Button]s the same). One theme resource can be used for the entire project, but you can also set a separate theme resource to a branch of control nodes. A theme resources assigned to a control node applies to the control itself, as well as all of its direct and indirect children (as long as a chain of controls is uninterrupted).
 *
 * Use [godot.ProjectSettings.gui/theme/custom] to set up a project-scope theme that will be available to every control in your project.
 *
 * Use [godot.Control.theme] of any control node to set up a theme that will be available to that control and all of its direct and indirect children.
 */
@GodotBaseType
public open class Theme : Resource() {
  /**
   * The default base scale factor of this theme resource. Used by some controls to scale their visual properties based on the global scale factor. If this value is set to `0.0`, the global scale factor is used.
   *
   * Use [hasDefaultBaseScale] to check if this value is valid.
   */
  public var defaultBaseScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_DEFAULT_BASE_SCALE,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_DEFAULT_BASE_SCALE,
          NIL.ordinal)
    }

  /**
   * The default font of this theme resource. Used as the default value when trying to fetch a font resource that doesn't exist in this theme or is in invalid state. If the default font is also missing or invalid, the engine fallback value is used.
   *
   * Use [hasDefaultFont] to check if this value is valid.
   */
  public var defaultFont: Font?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_DEFAULT_FONT, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Font?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_DEFAULT_FONT, NIL.ordinal)
    }

  /**
   * The default font size of this theme resource. Used as the default value when trying to fetch a font size value that doesn't exist in this theme or is in invalid state. If the default font size is also missing or invalid, the engine fallback value is used.
   *
   * Values below `0` are invalid and can be used to unset the property. Use [hasDefaultFontSize] to check if this value is valid.
   */
  public var defaultFontSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_DEFAULT_FONT_SIZE,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_DEFAULT_FONT_SIZE,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_THEME)
  }

  /**
   * Creates or changes the value of the icon property defined by `name` and `theme_type`. Use [clearIcon] to remove the property.
   */
  public fun setIcon(
    name: StringName,
    themeType: StringName,
    texture: Texture2D
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, OBJECT to texture)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_ICON, NIL.ordinal)
  }

  /**
   * Returns the icon property defined by `name` and `theme_type`, if it exists.
   *
   * Returns the engine fallback icon value if the property doesn't exist. Use [hasIcon] to check for existence.
   */
  public fun getIcon(name: StringName, themeType: StringName): Texture2D? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_ICON, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  /**
   * Returns `true` if the icon property defined by `name` and `theme_type` exists.
   *
   * Returns `false` if it doesn't exist. Use [setIcon] to define it.
   */
  public fun hasIcon(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_ICON, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Renames the icon property defined by `old_name` and `theme_type` to `name`, if it exists.
   *
   * Fails if it doesn't exist, or if a similar property with the new name already exists. Use [hasIcon] to check for existence, and [clearIcon] to remove the existing property.
   */
  public fun renameIcon(
    oldName: StringName,
    name: StringName,
    themeType: StringName
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_RENAME_ICON, NIL.ordinal)
  }

  /**
   * Removes the icon property defined by `name` and `theme_type`, if it exists.
   *
   * Fails if it doesn't exist. Use [hasIcon] to check for existence.
   */
  public fun clearIcon(name: StringName, themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_ICON, NIL.ordinal)
  }

  /**
   * Returns a list of names for icon properties defined with `theme_type`. Use [getIconTypeList] to get a list of possible theme type names.
   */
  public fun getIconList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_ICON_LIST,
        PACKED_STRING_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns a list of all unique theme type names for icon properties. Use [getTypeList] to get a list of all unique theme types.
   */
  public fun getIconTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_ICON_TYPE_LIST,
        PACKED_STRING_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Creates or changes the value of the [godot.StyleBox] property defined by `name` and `theme_type`. Use [clearStylebox] to remove the property.
   */
  public fun setStylebox(
    name: StringName,
    themeType: StringName,
    texture: StyleBox
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, OBJECT to texture)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_STYLEBOX, NIL.ordinal)
  }

  /**
   * Returns the [godot.StyleBox] property defined by `name` and `theme_type`, if it exists.
   *
   * Returns the engine fallback stylebox value if the property doesn't exist. Use [hasStylebox] to check for existence.
   */
  public fun getStylebox(name: StringName, themeType: StringName): StyleBox? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_STYLEBOX, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as StyleBox?
  }

  /**
   * Returns `true` if the [godot.StyleBox] property defined by `name` and `theme_type` exists.
   *
   * Returns `false` if it doesn't exist. Use [setStylebox] to define it.
   */
  public fun hasStylebox(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_STYLEBOX, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Renames the [godot.StyleBox] property defined by `old_name` and `theme_type` to `name`, if it exists.
   *
   * Fails if it doesn't exist, or if a similar property with the new name already exists. Use [hasStylebox] to check for existence, and [clearStylebox] to remove the existing property.
   */
  public fun renameStylebox(
    oldName: StringName,
    name: StringName,
    themeType: StringName
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_RENAME_STYLEBOX, NIL.ordinal)
  }

  /**
   * Removes the [godot.StyleBox] property defined by `name` and `theme_type`, if it exists.
   *
   * Fails if it doesn't exist. Use [hasStylebox] to check for existence.
   */
  public fun clearStylebox(name: StringName, themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_STYLEBOX, NIL.ordinal)
  }

  /**
   * Returns a list of names for [godot.StyleBox] properties defined with `theme_type`. Use [getStyleboxTypeList] to get a list of possible theme type names.
   */
  public fun getStyleboxList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_STYLEBOX_LIST,
        PACKED_STRING_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns a list of all unique theme type names for [godot.StyleBox] properties. Use [getTypeList] to get a list of all unique theme types.
   */
  public fun getStyleboxTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_STYLEBOX_TYPE_LIST,
        PACKED_STRING_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Creates or changes the value of the [godot.Font] property defined by `name` and `theme_type`. Use [clearFont] to remove the property.
   */
  public fun setFont(
    name: StringName,
    themeType: StringName,
    font: Font
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, OBJECT to font)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_FONT, NIL.ordinal)
  }

  /**
   * Returns the [godot.Font] property defined by `name` and `theme_type`, if it exists.
   *
   * Returns the default theme font if the property doesn't exist and the default theme font is set up (see [defaultFont]). Use [hasFont] to check for existence of the property and [hasDefaultFont] to check for existence of the default theme font.
   *
   * Returns the engine fallback font value, if neither exist.
   */
  public fun getFont(name: StringName, themeType: StringName): Font? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_FONT, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Font?
  }

  /**
   * Returns `true` if the [godot.Font] property defined by `name` and `theme_type` exists, or if the default theme font is set up (see [hasDefaultFont]).
   *
   * Returns `false` if neither exist. Use [setFont] to define the property.
   */
  public fun hasFont(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_FONT, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Renames the [godot.Font] property defined by `old_name` and `theme_type` to `name`, if it exists.
   *
   * Fails if it doesn't exist, or if a similar property with the new name already exists. Use [hasFont] to check for existence, and [clearFont] to remove the existing property.
   */
  public fun renameFont(
    oldName: StringName,
    name: StringName,
    themeType: StringName
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_RENAME_FONT, NIL.ordinal)
  }

  /**
   * Removes the [godot.Font] property defined by `name` and `theme_type`, if it exists.
   *
   * Fails if it doesn't exist. Use [hasFont] to check for existence.
   */
  public fun clearFont(name: StringName, themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_FONT, NIL.ordinal)
  }

  /**
   * Returns a list of names for [godot.Font] properties defined with `theme_type`. Use [getFontTypeList] to get a list of possible theme type names.
   */
  public fun getFontList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_FONT_LIST,
        PACKED_STRING_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns a list of all unique theme type names for [godot.Font] properties. Use [getTypeList] to get a list of all unique theme types.
   */
  public fun getFontTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_FONT_TYPE_LIST,
        PACKED_STRING_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Renames the font size property defined by `old_name` and `theme_type` to `name`, if it exists.
   *
   * Fails if it doesn't exist, or if a similar property with the new name already exists. Use [hasFontSize] to check for existence, and [clearFontSize] to remove the existing property.
   */
  public fun setFontSize(
    name: StringName,
    themeType: StringName,
    fontSize: Long
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, LONG to fontSize)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_FONT_SIZE, NIL.ordinal)
  }

  /**
   * Returns the font size property defined by `name` and `theme_type`, if it exists.
   *
   * Returns the default theme font size if the property doesn't exist and the default theme font size is set up (see [defaultFontSize]). Use [hasFontSize] to check for existence of the property and [hasDefaultFontSize] to check for existence of the default theme font.
   *
   * Returns the engine fallback font size value, if neither exist.
   */
  public fun getFontSize(name: StringName, themeType: StringName): Long {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_FONT_SIZE, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if [defaultFontSize] has a valid value.
   *
   * Returns `false` if it doesn't. The value must be greater than `0` to be considered valid.
   */
  public fun hasFontSize(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_FONT_SIZE, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the font size property defined by `name` and `theme_type` exists, or if the default theme font size is set up (see [hasDefaultFontSize]).
   *
   * Returns `false` if neither exist. Use [setFontSize] to define the property.
   */
  public fun renameFontSize(
    oldName: StringName,
    name: StringName,
    themeType: StringName
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_RENAME_FONT_SIZE, NIL.ordinal)
  }

  /**
   * Removes the font size property defined by `name` and `theme_type`, if it exists.
   *
   * Fails if it doesn't exist. Use [hasFontSize] to check for existence.
   */
  public fun clearFontSize(name: StringName, themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_FONT_SIZE, NIL.ordinal)
  }

  /**
   * Returns a list of names for font size properties defined with `theme_type`. Use [getFontSizeTypeList] to get a list of possible theme type names.
   */
  public fun getFontSizeList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_FONT_SIZE_LIST,
        PACKED_STRING_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns a list of all unique theme type names for font size properties. Use [getTypeList] to get a list of all unique theme types.
   */
  public fun getFontSizeTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_FONT_SIZE_TYPE_LIST,
        PACKED_STRING_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Creates or changes the value of the [godot.core.Color] property defined by `name` and `theme_type`. Use [clearColor] to remove the property.
   */
  public fun setColor(
    name: StringName,
    themeType: StringName,
    color: Color
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, COLOR to color)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_COLOR, NIL.ordinal)
  }

  /**
   * Returns the [godot.core.Color] property defined by `name` and `theme_type`, if it exists.
   *
   * Returns the default color value if the property doesn't exist. Use [hasColor] to check for existence.
   */
  public fun getColor(name: StringName, themeType: StringName): Color {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_COLOR, COLOR.ordinal)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns `true` if the [godot.core.Color] property defined by `name` and `theme_type` exists.
   *
   * Returns `false` if it doesn't exist. Use [setColor] to define it.
   */
  public fun hasColor(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_COLOR, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Renames the [godot.core.Color] property defined by `old_name` and `theme_type` to `name`, if it exists.
   *
   * Fails if it doesn't exist, or if a similar property with the new name already exists. Use [hasColor] to check for existence, and [clearColor] to remove the existing property.
   */
  public fun renameColor(
    oldName: StringName,
    name: StringName,
    themeType: StringName
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_RENAME_COLOR, NIL.ordinal)
  }

  /**
   * Removes the [godot.core.Color] property defined by `name` and `theme_type`, if it exists.
   *
   * Fails if it doesn't exist. Use [hasColor] to check for existence.
   */
  public fun clearColor(name: StringName, themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_COLOR, NIL.ordinal)
  }

  /**
   * Returns a list of names for [godot.core.Color] properties defined with `theme_type`. Use [getColorTypeList] to get a list of possible theme type names.
   */
  public fun getColorList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_COLOR_LIST,
        PACKED_STRING_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns a list of all unique theme type names for [godot.core.Color] properties. Use [getTypeList] to get a list of all unique theme types.
   */
  public fun getColorTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_COLOR_TYPE_LIST,
        PACKED_STRING_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Creates or changes the value of the constant property defined by `name` and `theme_type`. Use [clearConstant] to remove the property.
   */
  public fun setConstant(
    name: StringName,
    themeType: StringName,
    constant: Long
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, LONG to constant)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_CONSTANT, NIL.ordinal)
  }

  /**
   * Returns the constant property defined by `name` and `theme_type`, if it exists.
   *
   * Returns `0` if the property doesn't exist. Use [hasConstant] to check for existence.
   */
  public fun getConstant(name: StringName, themeType: StringName): Long {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_CONSTANT, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if the constant property defined by `name` and `theme_type` exists.
   *
   * Returns `false` if it doesn't exist. Use [setConstant] to define it.
   */
  public fun hasConstant(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_CONSTANT, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Renames the constant property defined by `old_name` and `theme_type` to `name`, if it exists.
   *
   * Fails if it doesn't exist, or if a similar property with the new name already exists. Use [hasConstant] to check for existence, and [clearConstant] to remove the existing property.
   */
  public fun renameConstant(
    oldName: StringName,
    name: StringName,
    themeType: StringName
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_RENAME_CONSTANT, NIL.ordinal)
  }

  /**
   * Removes the constant property defined by `name` and `theme_type`, if it exists.
   *
   * Fails if it doesn't exist. Use [hasConstant] to check for existence.
   */
  public fun clearConstant(name: StringName, themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_CONSTANT, NIL.ordinal)
  }

  /**
   * Returns a list of names for constant properties defined with `theme_type`. Use [getConstantTypeList] to get a list of possible theme type names.
   */
  public fun getConstantList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_CONSTANT_LIST,
        PACKED_STRING_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns a list of all unique theme type names for constant properties. Use [getTypeList] to get a list of all unique theme types.
   */
  public fun getConstantTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_CONSTANT_TYPE_LIST,
        PACKED_STRING_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns `true` if [defaultBaseScale] has a valid value.
   *
   * Returns `false` if it doesn't. The value must be greater than `0.0` to be considered valid.
   */
  public fun hasDefaultBaseScale(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_DEFAULT_BASE_SCALE,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if [defaultFont] has a valid value.
   *
   * Returns `false` if it doesn't.
   */
  public fun hasDefaultFont(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_DEFAULT_FONT, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if [defaultFontSize] has a valid value.
   *
   * Returns `false` if it doesn't. The value must be greater than `0` to be considered valid.
   */
  public fun hasDefaultFontSize(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_DEFAULT_FONT_SIZE,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Creates or changes the value of the theme property of `data_type` defined by `name` and `theme_type`. Use [clearThemeItem] to remove the property.
   *
   * Fails if the `value` type is not accepted by `data_type`.
   *
   * **Note:** This method is analogous to calling the corresponding data type specific method, but can be used for more generalized logic.
   */
  public fun setThemeItem(
    dataType: Theme.DataType,
    name: StringName,
    themeType: StringName,
    `value`: Any
  ): Unit {
    TransferContext.writeArguments(LONG to dataType.id, STRING_NAME to name, STRING_NAME to themeType, ANY to value)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_THEME_ITEM, NIL.ordinal)
  }

  /**
   * Returns the theme property of `data_type` defined by `name` and `theme_type`, if it exists.
   *
   * Returns the engine fallback icon value if the property doesn't exist. Use [hasThemeItem] to check for existence.
   *
   * **Note:** This method is analogous to calling the corresponding data type specific method, but can be used for more generalized logic.
   */
  public fun getThemeItem(
    dataType: Theme.DataType,
    name: StringName,
    themeType: StringName
  ): Any? {
    TransferContext.writeArguments(LONG to dataType.id, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_THEME_ITEM, ANY.ordinal)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns `true` if the theme property of `data_type` defined by `name` and `theme_type` exists.
   *
   * Returns `false` if it doesn't exist. Use [setThemeItem] to define it.
   *
   * **Note:** This method is analogous to calling the corresponding data type specific method, but can be used for more generalized logic.
   */
  public fun hasThemeItem(
    dataType: Theme.DataType,
    name: StringName,
    themeType: StringName
  ): Boolean {
    TransferContext.writeArguments(LONG to dataType.id, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_THEME_ITEM, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Renames the theme property of `data_type` defined by `old_name` and `theme_type` to `name`, if it exists.
   *
   * Fails if it doesn't exist, or if a similar property with the new name already exists. Use [hasThemeItem] to check for existence, and [clearThemeItem] to remove the existing property.
   *
   * **Note:** This method is analogous to calling the corresponding data type specific method, but can be used for more generalized logic.
   */
  public fun renameThemeItem(
    dataType: Theme.DataType,
    oldName: StringName,
    name: StringName,
    themeType: StringName
  ): Unit {
    TransferContext.writeArguments(LONG to dataType.id, STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_RENAME_THEME_ITEM, NIL.ordinal)
  }

  /**
   * Removes the theme property of `data_type` defined by `name` and `theme_type`, if it exists.
   *
   * Fails if it doesn't exist. Use [hasThemeItem] to check for existence.
   *
   * **Note:** This method is analogous to calling the corresponding data type specific method, but can be used for more generalized logic.
   */
  public fun clearThemeItem(
    dataType: Theme.DataType,
    name: StringName,
    themeType: StringName
  ): Unit {
    TransferContext.writeArguments(LONG to dataType.id, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_THEME_ITEM, NIL.ordinal)
  }

  /**
   * Returns a list of names for properties of `data_type` defined with `theme_type`. Use [getThemeItemTypeList] to get a list of possible theme type names.
   *
   * **Note:** This method is analogous to calling the corresponding data type specific method, but can be used for more generalized logic.
   */
  public fun getThemeItemList(dataType: Theme.DataType, themeType: String): PackedStringArray {
    TransferContext.writeArguments(LONG to dataType.id, STRING to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_THEME_ITEM_LIST,
        PACKED_STRING_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns a list of all unique theme type names for `data_type` properties. Use [getTypeList] to get a list of all unique theme types.
   *
   * **Note:** This method is analogous to calling the corresponding data type specific method, but can be used for more generalized logic.
   */
  public fun getThemeItemTypeList(dataType: Theme.DataType): PackedStringArray {
    TransferContext.writeArguments(LONG to dataType.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_THEME_ITEM_TYPE_LIST,
        PACKED_STRING_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Marks `theme_type` as a variation of `base_type`.
   *
   * This adds `theme_type` as a suggested option for [godot.Control.themeTypeVariation] on a [godot.Control] that is of the `base_type` class.
   *
   * Variations can also be nested, i.e. `base_type` can be another variation. If a chain of variations ends with a `base_type` matching the class of the [godot.Control], the whole chain is going to be suggested as options.
   *
   * **Note:** Suggestions only show up if this theme resource is set as the project default theme. See [godot.ProjectSettings.gui/theme/custom].
   */
  public fun setTypeVariation(themeType: StringName, baseType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to themeType, STRING_NAME to baseType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_TYPE_VARIATION, NIL.ordinal)
  }

  /**
   * Returns `true` if `theme_type` is marked as a variation of `base_type`.
   */
  public fun isTypeVariation(themeType: StringName, baseType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to themeType, STRING_NAME to baseType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_IS_TYPE_VARIATION, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Unmarks `theme_type` as being a variation of another theme type. See [setTypeVariation].
   */
  public fun clearTypeVariation(themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_TYPE_VARIATION, NIL.ordinal)
  }

  /**
   * Returns the name of the base theme type if `theme_type` is a valid variation type. Returns an empty string otherwise.
   */
  public fun getTypeVariationBase(themeType: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_TYPE_VARIATION_BASE,
        STRING_NAME.ordinal)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Returns a list of all type variations for the given `base_type`.
   */
  public fun getTypeVariationList(baseType: StringName): PackedStringArray {
    TransferContext.writeArguments(STRING_NAME to baseType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_TYPE_VARIATION_LIST,
        PACKED_STRING_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Adds an empty theme type for every valid data type.
   *
   * **Note:** Empty types are not saved with the theme. This method only exists to perform in-memory changes to the resource. Use available `set_*` methods to add theme items.
   */
  public fun addType(themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_ADD_TYPE, NIL.ordinal)
  }

  /**
   * Removes the theme type, gracefully discarding defined theme items. If the type is a variation, this information is also erased. If the type is a base for type variations, those variations lose their base.
   */
  public fun removeType(themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_REMOVE_TYPE, NIL.ordinal)
  }

  /**
   * Returns a list of all unique theme type names. Use the appropriate `get_*_type_list` method to get a list of unique theme types for a single data type.
   */
  public fun getTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_TYPE_LIST,
        PACKED_STRING_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Adds missing and overrides existing definitions with values from the `other` theme resource.
   *
   * **Note:** This modifies the current theme. If you want to merge two themes together without modifying either one, create a new empty theme and merge the other two into it one after another.
   */
  public fun mergeWith(other: Theme): Unit {
    TransferContext.writeArguments(OBJECT to other)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_MERGE_WITH, NIL.ordinal)
  }

  /**
   * Removes all the theme properties defined on the theme resource.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR, NIL.ordinal)
  }

  public enum class DataType(
    id: Long
  ) {
    /**
     * Theme's [godot.core.Color] item type.
     */
    DATA_TYPE_COLOR(0),
    /**
     * Theme's constant item type.
     */
    DATA_TYPE_CONSTANT(1),
    /**
     * Theme's [godot.Font] item type.
     */
    DATA_TYPE_FONT(2),
    /**
     * Theme's font size item type.
     */
    DATA_TYPE_FONT_SIZE(3),
    /**
     * Theme's icon [godot.Texture2D] item type.
     */
    DATA_TYPE_ICON(4),
    /**
     * Theme's [godot.StyleBox] item type.
     */
    DATA_TYPE_STYLEBOX(5),
    /**
     * Maximum value for the DataType enum.
     */
    DATA_TYPE_MAX(6),
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
