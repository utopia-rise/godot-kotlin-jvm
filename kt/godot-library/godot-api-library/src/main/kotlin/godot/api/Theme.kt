// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A resource used for styling/skinning [Control] and [Window] nodes. While individual controls can
 * be styled using their local theme overrides (see [Control.addThemeColorOverride]), theme resources
 * allow you to store and apply the same settings across all controls sharing the same type (e.g. style
 * all [Button]s the same). One theme resource can be used for the entire project, but you can also set
 * a separate theme resource to a branch of control nodes. A theme resource assigned to a control
 * applies to the control itself, as well as all of its direct and indirect children (as long as a
 * chain of controls is uninterrupted).
 * Use [ProjectSettings.gui/theme/custom] to set up a project-scope theme that will be available to
 * every control in your project.
 * Use [Control.theme] of any control node to set up a theme that will be available to that control
 * and all of its direct and indirect children.
 */
@GodotBaseType
public open class Theme : Resource() {
  /**
   * The default base scale factor of this theme resource. Used by some controls to scale their
   * visual properties based on the global scale factor. If this value is set to `0.0`, the global
   * scale factor is used (see [ThemeDB.fallbackBaseScale]).
   * Use [hasDefaultBaseScale] to check if this value is valid.
   */
  public final inline var defaultBaseScale: Float
    @JvmName("defaultBaseScaleProperty")
    get() = getDefaultBaseScale()
    @JvmName("defaultBaseScaleProperty")
    set(`value`) {
      setDefaultBaseScale(value)
    }

  /**
   * The default font of this theme resource. Used as the default value when trying to fetch a font
   * resource that doesn't exist in this theme or is in invalid state. If the default font is also
   * missing or invalid, the engine fallback value is used (see [ThemeDB.fallbackFont]).
   * Use [hasDefaultFont] to check if this value is valid.
   */
  public final inline var defaultFont: Font?
    @JvmName("defaultFontProperty")
    get() = getDefaultFont()
    @JvmName("defaultFontProperty")
    set(`value`) {
      setDefaultFont(value)
    }

  /**
   * The default font size of this theme resource. Used as the default value when trying to fetch a
   * font size value that doesn't exist in this theme or is in invalid state. If the default font size
   * is also missing or invalid, the engine fallback value is used (see [ThemeDB.fallbackFontSize]).
   * Values below `1` are invalid and can be used to unset the property. Use [hasDefaultFontSize] to
   * check if this value is valid.
   */
  public final inline var defaultFontSize: Int
    @JvmName("defaultFontSizeProperty")
    get() = getDefaultFontSize()
    @JvmName("defaultFontSizeProperty")
    set(`value`) {
      setDefaultFontSize(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(686, scriptIndex)
  }

  /**
   * Creates or changes the value of the icon property defined by [name] and [themeType]. Use
   * [clearIcon] to remove the property.
   */
  public final fun setIcon(
    name: StringName,
    themeType: StringName,
    texture: Texture2D?,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.setIconPtr, NIL)
  }

  /**
   * Returns the icon property defined by [name] and [themeType], if it exists.
   * Returns the engine fallback icon value if the property doesn't exist (see
   * [ThemeDB.fallbackIcon]). Use [hasIcon] to check for existence.
   */
  public final fun getIcon(name: StringName, themeType: StringName): Texture2D? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.getIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Returns `true` if the icon property defined by [name] and [themeType] exists.
   * Returns `false` if it doesn't exist. Use [setIcon] to define it.
   */
  public final fun hasIcon(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.hasIconPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Renames the icon property defined by [oldName] and [themeType] to [name], if it exists.
   * Fails if it doesn't exist, or if a similar property with the new name already exists. Use
   * [hasIcon] to check for existence, and [clearIcon] to remove the existing property.
   */
  public final fun renameIcon(
    oldName: StringName,
    name: StringName,
    themeType: StringName,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.renameIconPtr, NIL)
  }

  /**
   * Removes the icon property defined by [name] and [themeType], if it exists.
   * Fails if it doesn't exist. Use [hasIcon] to check for existence.
   */
  public final fun clearIcon(name: StringName, themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.clearIconPtr, NIL)
  }

  /**
   * Returns a list of names for icon properties defined with [themeType]. Use [getIconTypeList] to
   * get a list of possible theme type names.
   */
  public final fun getIconList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(ptr, MethodBindings.getIconListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns a list of all unique theme type names for icon properties. Use [getTypeList] to get a
   * list of all unique theme types.
   */
  public final fun getIconTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getIconTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Creates or changes the value of the [StyleBox] property defined by [name] and [themeType]. Use
   * [clearStylebox] to remove the property.
   */
  public final fun setStylebox(
    name: StringName,
    themeType: StringName,
    texture: StyleBox?,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.setStyleboxPtr, NIL)
  }

  /**
   * Returns the [StyleBox] property defined by [name] and [themeType], if it exists.
   * Returns the engine fallback stylebox value if the property doesn't exist (see
   * [ThemeDB.fallbackStylebox]). Use [hasStylebox] to check for existence.
   */
  public final fun getStylebox(name: StringName, themeType: StringName): StyleBox? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.getStyleboxPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as StyleBox?)
  }

  /**
   * Returns `true` if the [StyleBox] property defined by [name] and [themeType] exists.
   * Returns `false` if it doesn't exist. Use [setStylebox] to define it.
   */
  public final fun hasStylebox(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.hasStyleboxPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Renames the [StyleBox] property defined by [oldName] and [themeType] to [name], if it exists.
   * Fails if it doesn't exist, or if a similar property with the new name already exists. Use
   * [hasStylebox] to check for existence, and [clearStylebox] to remove the existing property.
   */
  public final fun renameStylebox(
    oldName: StringName,
    name: StringName,
    themeType: StringName,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.renameStyleboxPtr, NIL)
  }

  /**
   * Removes the [StyleBox] property defined by [name] and [themeType], if it exists.
   * Fails if it doesn't exist. Use [hasStylebox] to check for existence.
   */
  public final fun clearStylebox(name: StringName, themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.clearStyleboxPtr, NIL)
  }

  /**
   * Returns a list of names for [StyleBox] properties defined with [themeType]. Use
   * [getStyleboxTypeList] to get a list of possible theme type names.
   */
  public final fun getStyleboxList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(ptr, MethodBindings.getStyleboxListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns a list of all unique theme type names for [StyleBox] properties. Use [getTypeList] to
   * get a list of all unique theme types.
   */
  public final fun getStyleboxTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStyleboxTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Creates or changes the value of the [Font] property defined by [name] and [themeType]. Use
   * [clearFont] to remove the property.
   */
  public final fun setFont(
    name: StringName,
    themeType: StringName,
    font: Font?,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, OBJECT to font)
    TransferContext.callMethod(ptr, MethodBindings.setFontPtr, NIL)
  }

  /**
   * Returns the [Font] property defined by [name] and [themeType], if it exists.
   * Returns the default theme font if the property doesn't exist and the default theme font is set
   * up (see [defaultFont]). Use [hasFont] to check for existence of the property and [hasDefaultFont]
   * to check for existence of the default theme font.
   * Returns the engine fallback font value, if neither exist (see [ThemeDB.fallbackFont]).
   */
  public final fun getFont(name: StringName, themeType: StringName): Font? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.getFontPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Font?)
  }

  /**
   * Returns `true` if the [Font] property defined by [name] and [themeType] exists, or if the
   * default theme font is set up (see [hasDefaultFont]).
   * Returns `false` if neither exist. Use [setFont] to define the property.
   */
  public final fun hasFont(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.hasFontPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Renames the [Font] property defined by [oldName] and [themeType] to [name], if it exists.
   * Fails if it doesn't exist, or if a similar property with the new name already exists. Use
   * [hasFont] to check for existence, and [clearFont] to remove the existing property.
   */
  public final fun renameFont(
    oldName: StringName,
    name: StringName,
    themeType: StringName,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.renameFontPtr, NIL)
  }

  /**
   * Removes the [Font] property defined by [name] and [themeType], if it exists.
   * Fails if it doesn't exist. Use [hasFont] to check for existence.
   */
  public final fun clearFont(name: StringName, themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.clearFontPtr, NIL)
  }

  /**
   * Returns a list of names for [Font] properties defined with [themeType]. Use [getFontTypeList]
   * to get a list of possible theme type names.
   */
  public final fun getFontList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(ptr, MethodBindings.getFontListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns a list of all unique theme type names for [Font] properties. Use [getTypeList] to get a
   * list of all unique theme types.
   */
  public final fun getFontTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFontTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Creates or changes the value of the font size property defined by [name] and [themeType]. Use
   * [clearFontSize] to remove the property.
   */
  public final fun setFontSize(
    name: StringName,
    themeType: StringName,
    fontSize: Int,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, LONG to fontSize.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setFontSizePtr, NIL)
  }

  /**
   * Returns the font size property defined by [name] and [themeType], if it exists.
   * Returns the default theme font size if the property doesn't exist and the default theme font
   * size is set up (see [defaultFontSize]). Use [hasFontSize] to check for existence of the property
   * and [hasDefaultFontSize] to check for existence of the default theme font.
   * Returns the engine fallback font size value, if neither exist (see [ThemeDB.fallbackFontSize]).
   */
  public final fun getFontSize(name: StringName, themeType: StringName): Int {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.getFontSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the font size property defined by [name] and [themeType] exists, or if the
   * default theme font size is set up (see [hasDefaultFontSize]).
   * Returns `false` if neither exist. Use [setFontSize] to define the property.
   */
  public final fun hasFontSize(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.hasFontSizePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Renames the font size property defined by [oldName] and [themeType] to [name], if it exists.
   * Fails if it doesn't exist, or if a similar property with the new name already exists. Use
   * [hasFontSize] to check for existence, and [clearFontSize] to remove the existing property.
   */
  public final fun renameFontSize(
    oldName: StringName,
    name: StringName,
    themeType: StringName,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.renameFontSizePtr, NIL)
  }

  /**
   * Removes the font size property defined by [name] and [themeType], if it exists.
   * Fails if it doesn't exist. Use [hasFontSize] to check for existence.
   */
  public final fun clearFontSize(name: StringName, themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.clearFontSizePtr, NIL)
  }

  /**
   * Returns a list of names for font size properties defined with [themeType]. Use
   * [getFontSizeTypeList] to get a list of possible theme type names.
   */
  public final fun getFontSizeList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(ptr, MethodBindings.getFontSizeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns a list of all unique theme type names for font size properties. Use [getTypeList] to
   * get a list of all unique theme types.
   */
  public final fun getFontSizeTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFontSizeTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Creates or changes the value of the [Color] property defined by [name] and [themeType]. Use
   * [clearColor] to remove the property.
   */
  public final fun setColor(
    name: StringName,
    themeType: StringName,
    color: Color,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setColorPtr, NIL)
  }

  /**
   * Returns the [Color] property defined by [name] and [themeType], if it exists.
   * Returns the default color value if the property doesn't exist. Use [hasColor] to check for
   * existence.
   */
  public final fun getColor(name: StringName, themeType: StringName): Color {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.getColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  /**
   * Returns `true` if the [Color] property defined by [name] and [themeType] exists.
   * Returns `false` if it doesn't exist. Use [setColor] to define it.
   */
  public final fun hasColor(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.hasColorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Renames the [Color] property defined by [oldName] and [themeType] to [name], if it exists.
   * Fails if it doesn't exist, or if a similar property with the new name already exists. Use
   * [hasColor] to check for existence, and [clearColor] to remove the existing property.
   */
  public final fun renameColor(
    oldName: StringName,
    name: StringName,
    themeType: StringName,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.renameColorPtr, NIL)
  }

  /**
   * Removes the [Color] property defined by [name] and [themeType], if it exists.
   * Fails if it doesn't exist. Use [hasColor] to check for existence.
   */
  public final fun clearColor(name: StringName, themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.clearColorPtr, NIL)
  }

  /**
   * Returns a list of names for [Color] properties defined with [themeType]. Use [getColorTypeList]
   * to get a list of possible theme type names.
   */
  public final fun getColorList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(ptr, MethodBindings.getColorListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns a list of all unique theme type names for [Color] properties. Use [getTypeList] to get
   * a list of all unique theme types.
   */
  public final fun getColorTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColorTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Creates or changes the value of the constant property defined by [name] and [themeType]. Use
   * [clearConstant] to remove the property.
   */
  public final fun setConstant(
    name: StringName,
    themeType: StringName,
    constant: Int,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, LONG to constant.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setConstantPtr, NIL)
  }

  /**
   * Returns the constant property defined by [name] and [themeType], if it exists.
   * Returns `0` if the property doesn't exist. Use [hasConstant] to check for existence.
   */
  public final fun getConstant(name: StringName, themeType: StringName): Int {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.getConstantPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the constant property defined by [name] and [themeType] exists.
   * Returns `false` if it doesn't exist. Use [setConstant] to define it.
   */
  public final fun hasConstant(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.hasConstantPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Renames the constant property defined by [oldName] and [themeType] to [name], if it exists.
   * Fails if it doesn't exist, or if a similar property with the new name already exists. Use
   * [hasConstant] to check for existence, and [clearConstant] to remove the existing property.
   */
  public final fun renameConstant(
    oldName: StringName,
    name: StringName,
    themeType: StringName,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.renameConstantPtr, NIL)
  }

  /**
   * Removes the constant property defined by [name] and [themeType], if it exists.
   * Fails if it doesn't exist. Use [hasConstant] to check for existence.
   */
  public final fun clearConstant(name: StringName, themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.clearConstantPtr, NIL)
  }

  /**
   * Returns a list of names for constant properties defined with [themeType]. Use
   * [getConstantTypeList] to get a list of possible theme type names.
   */
  public final fun getConstantList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(ptr, MethodBindings.getConstantListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns a list of all unique theme type names for constant properties. Use [getTypeList] to get
   * a list of all unique theme types.
   */
  public final fun getConstantTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConstantTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  public final fun setDefaultBaseScale(baseScale: Float): Unit {
    TransferContext.writeArguments(DOUBLE to baseScale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDefaultBaseScalePtr, NIL)
  }

  public final fun getDefaultBaseScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDefaultBaseScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns `true` if [defaultBaseScale] has a valid value.
   * Returns `false` if it doesn't. The value must be greater than `0.0` to be considered valid.
   */
  public final fun hasDefaultBaseScale(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasDefaultBaseScalePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDefaultFont(font: Font?): Unit {
    TransferContext.writeArguments(OBJECT to font)
    TransferContext.callMethod(ptr, MethodBindings.setDefaultFontPtr, NIL)
  }

  public final fun getDefaultFont(): Font? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDefaultFontPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Font?)
  }

  /**
   * Returns `true` if [defaultFont] has a valid value.
   * Returns `false` if it doesn't.
   */
  public final fun hasDefaultFont(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasDefaultFontPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDefaultFontSize(fontSize: Int): Unit {
    TransferContext.writeArguments(LONG to fontSize.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setDefaultFontSizePtr, NIL)
  }

  public final fun getDefaultFontSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDefaultFontSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if [defaultFontSize] has a valid value.
   * Returns `false` if it doesn't. The value must be greater than `0` to be considered valid.
   */
  public final fun hasDefaultFontSize(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasDefaultFontSizePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Creates or changes the value of the theme property of [dataType] defined by [name] and
   * [themeType]. Use [clearThemeItem] to remove the property.
   * Fails if the [value] type is not accepted by [dataType].
   * **Note:** This method is analogous to calling the corresponding data type specific method, but
   * can be used for more generalized logic.
   */
  public final fun setThemeItem(
    dataType: DataType,
    name: StringName,
    themeType: StringName,
    `value`: Any?,
  ): Unit {
    TransferContext.writeArguments(LONG to dataType.id, STRING_NAME to name, STRING_NAME to themeType, ANY to value)
    TransferContext.callMethod(ptr, MethodBindings.setThemeItemPtr, NIL)
  }

  /**
   * Returns the theme property of [dataType] defined by [name] and [themeType], if it exists.
   * Returns the engine fallback value if the property doesn't exist (see [ThemeDB]). Use
   * [hasThemeItem] to check for existence.
   * **Note:** This method is analogous to calling the corresponding data type specific method, but
   * can be used for more generalized logic.
   */
  public final fun getThemeItem(
    dataType: DataType,
    name: StringName,
    themeType: StringName,
  ): Any? {
    TransferContext.writeArguments(LONG to dataType.id, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.getThemeItemPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns `true` if the theme property of [dataType] defined by [name] and [themeType] exists.
   * Returns `false` if it doesn't exist. Use [setThemeItem] to define it.
   * **Note:** This method is analogous to calling the corresponding data type specific method, but
   * can be used for more generalized logic.
   */
  public final fun hasThemeItem(
    dataType: DataType,
    name: StringName,
    themeType: StringName,
  ): Boolean {
    TransferContext.writeArguments(LONG to dataType.id, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.hasThemeItemPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Renames the theme property of [dataType] defined by [oldName] and [themeType] to [name], if it
   * exists.
   * Fails if it doesn't exist, or if a similar property with the new name already exists. Use
   * [hasThemeItem] to check for existence, and [clearThemeItem] to remove the existing property.
   * **Note:** This method is analogous to calling the corresponding data type specific method, but
   * can be used for more generalized logic.
   */
  public final fun renameThemeItem(
    dataType: DataType,
    oldName: StringName,
    name: StringName,
    themeType: StringName,
  ): Unit {
    TransferContext.writeArguments(LONG to dataType.id, STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.renameThemeItemPtr, NIL)
  }

  /**
   * Removes the theme property of [dataType] defined by [name] and [themeType], if it exists.
   * Fails if it doesn't exist. Use [hasThemeItem] to check for existence.
   * **Note:** This method is analogous to calling the corresponding data type specific method, but
   * can be used for more generalized logic.
   */
  public final fun clearThemeItem(
    dataType: DataType,
    name: StringName,
    themeType: StringName,
  ): Unit {
    TransferContext.writeArguments(LONG to dataType.id, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.clearThemeItemPtr, NIL)
  }

  /**
   * Returns a list of names for properties of [dataType] defined with [themeType]. Use
   * [getThemeItemTypeList] to get a list of possible theme type names.
   * **Note:** This method is analogous to calling the corresponding data type specific method, but
   * can be used for more generalized logic.
   */
  public final fun getThemeItemList(dataType: DataType, themeType: String): PackedStringArray {
    TransferContext.writeArguments(LONG to dataType.id, STRING to themeType)
    TransferContext.callMethod(ptr, MethodBindings.getThemeItemListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns a list of all unique theme type names for [dataType] properties. Use [getTypeList] to
   * get a list of all unique theme types.
   * **Note:** This method is analogous to calling the corresponding data type specific method, but
   * can be used for more generalized logic.
   */
  public final fun getThemeItemTypeList(dataType: DataType): PackedStringArray {
    TransferContext.writeArguments(LONG to dataType.id)
    TransferContext.callMethod(ptr, MethodBindings.getThemeItemTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Marks [themeType] as a variation of [baseType].
   * This adds [themeType] as a suggested option for [Control.themeTypeVariation] on a [Control]
   * that is of the [baseType] class.
   * Variations can also be nested, i.e. [baseType] can be another variation. If a chain of
   * variations ends with a [baseType] matching the class of the [Control], the whole chain is going to
   * be suggested as options.
   * **Note:** Suggestions only show up if this theme resource is set as the project default theme.
   * See [ProjectSettings.gui/theme/custom].
   */
  public final fun setTypeVariation(themeType: StringName, baseType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to themeType, STRING_NAME to baseType)
    TransferContext.callMethod(ptr, MethodBindings.setTypeVariationPtr, NIL)
  }

  /**
   * Returns `true` if [themeType] is marked as a variation of [baseType].
   */
  public final fun isTypeVariation(themeType: StringName, baseType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to themeType, STRING_NAME to baseType)
    TransferContext.callMethod(ptr, MethodBindings.isTypeVariationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Unmarks [themeType] as being a variation of another theme type. See [setTypeVariation].
   */
  public final fun clearTypeVariation(themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.clearTypeVariationPtr, NIL)
  }

  /**
   * Returns the name of the base theme type if [themeType] is a valid variation type. Returns an
   * empty string otherwise.
   */
  public final fun getTypeVariationBase(themeType: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.getTypeVariationBasePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Returns a list of all type variations for the given [baseType].
   */
  public final fun getTypeVariationList(baseType: StringName): PackedStringArray {
    TransferContext.writeArguments(STRING_NAME to baseType)
    TransferContext.callMethod(ptr, MethodBindings.getTypeVariationListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Adds an empty theme type for every valid data type.
   * **Note:** Empty types are not saved with the theme. This method only exists to perform
   * in-memory changes to the resource. Use available `set_*` methods to add theme items.
   */
  public final fun addType(themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.addTypePtr, NIL)
  }

  /**
   * Removes the theme type, gracefully discarding defined theme items. If the type is a variation,
   * this information is also erased. If the type is a base for type variations, those variations lose
   * their base.
   */
  public final fun removeType(themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.removeTypePtr, NIL)
  }

  /**
   * Returns a list of all unique theme type names. Use the appropriate `get_*_type_list` method to
   * get a list of unique theme types for a single data type.
   */
  public final fun getTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Adds missing and overrides existing definitions with values from the [other] theme resource.
   * **Note:** This modifies the current theme. If you want to merge two themes together without
   * modifying either one, create a new empty theme and merge the other two into it one after another.
   */
  public final fun mergeWith(other: Theme?): Unit {
    TransferContext.writeArguments(OBJECT to other)
    TransferContext.callMethod(ptr, MethodBindings.mergeWithPtr, NIL)
  }

  /**
   * Removes all the theme properties defined on the theme resource.
   */
  public final fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearPtr, NIL)
  }

  public enum class DataType(
    id: Long,
  ) {
    /**
     * Theme's [Color] item type.
     */
    DATA_TYPE_COLOR(0),
    /**
     * Theme's constant item type.
     */
    DATA_TYPE_CONSTANT(1),
    /**
     * Theme's [Font] item type.
     */
    DATA_TYPE_FONT(2),
    /**
     * Theme's font size item type.
     */
    DATA_TYPE_FONT_SIZE(3),
    /**
     * Theme's icon [Texture2D] item type.
     */
    DATA_TYPE_ICON(4),
    /**
     * Theme's [StyleBox] item type.
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
      public fun from(`value`: Long): DataType = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "set_icon", 2188371082)

    internal val getIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_icon", 934555193)

    internal val hasIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "has_icon", 471820014)

    internal val renameIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "rename_icon", 642128662)

    internal val clearIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "clear_icon", 3740211285)

    internal val getIconListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_icon_list", 4291131558)

    internal val getIconTypeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_icon_type_list", 1139954409)

    internal val setStyleboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "set_stylebox", 2075907568)

    internal val getStyleboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_stylebox", 3405608165)

    internal val hasStyleboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "has_stylebox", 471820014)

    internal val renameStyleboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "rename_stylebox", 642128662)

    internal val clearStyleboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "clear_stylebox", 3740211285)

    internal val getStyleboxListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_stylebox_list", 4291131558)

    internal val getStyleboxTypeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_stylebox_type_list", 1139954409)

    internal val setFontPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "set_font", 177292320)

    internal val getFontPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_font", 3445063586)

    internal val hasFontPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "has_font", 471820014)

    internal val renameFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "rename_font", 642128662)

    internal val clearFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "clear_font", 3740211285)

    internal val getFontListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_font_list", 4291131558)

    internal val getFontTypeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_font_type_list", 1139954409)

    internal val setFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "set_font_size", 281601298)

    internal val getFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_font_size", 2419549490)

    internal val hasFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "has_font_size", 471820014)

    internal val renameFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "rename_font_size", 642128662)

    internal val clearFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "clear_font_size", 3740211285)

    internal val getFontSizeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_font_size_list", 4291131558)

    internal val getFontSizeTypeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_font_size_type_list", 1139954409)

    internal val setColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "set_color", 4111215154)

    internal val getColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_color", 2015923404)

    internal val hasColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "has_color", 471820014)

    internal val renameColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "rename_color", 642128662)

    internal val clearColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "clear_color", 3740211285)

    internal val getColorListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_color_list", 4291131558)

    internal val getColorTypeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_color_type_list", 1139954409)

    internal val setConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "set_constant", 281601298)

    internal val getConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_constant", 2419549490)

    internal val hasConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "has_constant", 471820014)

    internal val renameConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "rename_constant", 642128662)

    internal val clearConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "clear_constant", 3740211285)

    internal val getConstantListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_constant_list", 4291131558)

    internal val getConstantTypeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_constant_type_list", 1139954409)

    internal val setDefaultBaseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "set_default_base_scale", 373806689)

    internal val getDefaultBaseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_default_base_scale", 1740695150)

    internal val hasDefaultBaseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "has_default_base_scale", 36873697)

    internal val setDefaultFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "set_default_font", 1262170328)

    internal val getDefaultFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_default_font", 3229501585)

    internal val hasDefaultFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "has_default_font", 36873697)

    internal val setDefaultFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "set_default_font_size", 1286410249)

    internal val getDefaultFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_default_font_size", 3905245786)

    internal val hasDefaultFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "has_default_font_size", 36873697)

    internal val setThemeItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "set_theme_item", 2492983623)

    internal val getThemeItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_theme_item", 2191024021)

    internal val hasThemeItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "has_theme_item", 1739311056)

    internal val renameThemeItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "rename_theme_item", 3900867553)

    internal val clearThemeItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "clear_theme_item", 2965505587)

    internal val getThemeItemListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_theme_item_list", 3726716710)

    internal val getThemeItemTypeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_theme_item_type_list", 1316004935)

    internal val setTypeVariationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "set_type_variation", 3740211285)

    internal val isTypeVariationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "is_type_variation", 471820014)

    internal val clearTypeVariationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "clear_type_variation", 3304788590)

    internal val getTypeVariationBasePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_type_variation_base", 1965194235)

    internal val getTypeVariationListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_type_variation_list", 1761182771)

    internal val addTypePtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "add_type", 3304788590)

    internal val removeTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "remove_type", 3304788590)

    internal val getTypeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_type_list", 1139954409)

    internal val mergeWithPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "merge_with", 2326690814)

    internal val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "clear", 3218959716)
  }
}
