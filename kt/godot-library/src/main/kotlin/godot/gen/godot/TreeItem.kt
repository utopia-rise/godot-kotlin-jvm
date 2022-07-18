// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.Control
import godot.TreeItem
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.Rect2
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Control for a single item inside a [godot.Tree].
 *
 * Control for a single item inside a [godot.Tree]. May have child [godot.TreeItem]s and be styled as well as contain buttons.
 *
 * You can remove a [godot.TreeItem] by using [godot.Object.free].
 */
@GodotBaseType
public open class TreeItem internal constructor() : Object() {
  /**
   * If `true`, the TreeItem is collapsed.
   */
  public var collapsed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_COLLAPSED, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_COLLAPSED, NIL.ordinal)
    }

  /**
   * If `true`, folding is disabled for this TreeItem.
   */
  public var disableFolding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_FOLDING_DISABLED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_DISABLE_FOLDING,
          NIL.ordinal)
    }

  /**
   * The custom minimum height.
   */
  public var customMinimumHeight: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CUSTOM_MINIMUM_HEIGHT,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_MINIMUM_HEIGHT,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TREEITEM)
  }

  /**
   * Sets the given column's cell mode to `mode`. See [enum TreeCellMode] constants.
   */
  public fun setCellMode(column: Long, mode: TreeItem.TreeCellMode): Unit {
    TransferContext.writeArguments(LONG to column, LONG to mode.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CELL_MODE, NIL.ordinal)
  }

  /**
   * Returns the column's cell mode.
   */
  public fun getCellMode(column: Long): TreeItem.TreeCellMode {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CELL_MODE, LONG.ordinal)
    return TreeItem.TreeCellMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * If `true`, the column `column` is checked. Clears column's indeterminate status.
   */
  public fun setChecked(column: Long, checked: Boolean): Unit {
    TransferContext.writeArguments(LONG to column, BOOL to checked)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CHECKED, NIL.ordinal)
  }

  /**
   * If `true`, the column `column` is marked indeterminate.
   *
   * **Note:** If set `true` from `false`, then column is cleared of checked status.
   */
  public fun setIndeterminate(column: Long, indeterminate: Boolean): Unit {
    TransferContext.writeArguments(LONG to column, BOOL to indeterminate)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_INDETERMINATE, NIL.ordinal)
  }

  /**
   * Returns `true` if the given column is checked.
   */
  public fun isChecked(column: Long): Boolean {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_CHECKED, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the given column is indeterminate.
   */
  public fun isIndeterminate(column: Long): Boolean {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_INDETERMINATE, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Propagates this item's checked status to its children and parents for the given `column`. It is possible to process the items affected by this method call by connecting to [godot.Tree.checkPropagatedToItem]. The order that the items affected will be processed is as follows: the item invoking this method, children of that item, and finally parents of that item. If `emit_signal` is `false`, then [godot.Tree.checkPropagatedToItem] will not be emitted.
   */
  public fun propagateCheck(column: Long, emitSignal: Boolean = true): Unit {
    TransferContext.writeArguments(LONG to column, BOOL to emitSignal)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_PROPAGATE_CHECK, NIL.ordinal)
  }

  /**
   * Sets the given column's text value.
   */
  public fun setText(column: Long, text: String): Unit {
    TransferContext.writeArguments(LONG to column, STRING to text)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_TEXT, NIL.ordinal)
  }

  /**
   * Returns the given column's text.
   */
  public fun getText(column: Long): String {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_TEXT, STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets item's text base writing direction.
   */
  public fun setTextDirection(column: Long, direction: Control.TextDirection): Unit {
    TransferContext.writeArguments(LONG to column, LONG to direction.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_TEXT_DIRECTION, NIL.ordinal)
  }

  /**
   * Returns item's text base writing direction.
   */
  public fun getTextDirection(column: Long): Control.TextDirection {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_TEXT_DIRECTION,
        LONG.ordinal)
    return Control.TextDirection.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun setOpentypeFeature(
    column: Long,
    tag: String,
    `value`: Long
  ): Unit {
    TransferContext.writeArguments(LONG to column, STRING to tag, LONG to value)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_OPENTYPE_FEATURE,
        NIL.ordinal)
  }

  public fun getOpentypeFeature(column: Long, tag: String): Long {
    TransferContext.writeArguments(LONG to column, STRING to tag)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_OPENTYPE_FEATURE,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun clearOpentypeFeatures(column: Long): Unit {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_CLEAR_OPENTYPE_FEATURES,
        NIL.ordinal)
  }

  /**
   *
   */
  public fun setStructuredTextBidiOverride(column: Long, parser: Control.StructuredTextParser):
      Unit {
    TransferContext.writeArguments(LONG to column, LONG to parser.id)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_STRUCTURED_TEXT_BIDI_OVERRIDE, NIL.ordinal)
  }

  /**
   *
   */
  public fun getStructuredTextBidiOverride(column: Long): Control.StructuredTextParser {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_STRUCTURED_TEXT_BIDI_OVERRIDE, LONG.ordinal)
    return Control.StructuredTextParser.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public fun setStructuredTextBidiOverrideOptions(column: Long, args: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(LONG to column, ARRAY to args)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_STRUCTURED_TEXT_BIDI_OVERRIDE_OPTIONS, NIL.ordinal)
  }

  /**
   *
   */
  public fun getStructuredTextBidiOverrideOptions(column: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_STRUCTURED_TEXT_BIDI_OVERRIDE_OPTIONS, ARRAY.ordinal)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Sets language code of item's text used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public fun setLanguage(column: Long, language: String): Unit {
    TransferContext.writeArguments(LONG to column, STRING to language)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_LANGUAGE, NIL.ordinal)
  }

  /**
   * Returns item's text language code.
   */
  public fun getLanguage(column: Long): String {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_LANGUAGE, STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets a string to be shown after a column's value (for example, a unit abbreviation).
   */
  public fun setSuffix(column: Long, text: String): Unit {
    TransferContext.writeArguments(LONG to column, STRING to text)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_SUFFIX, NIL.ordinal)
  }

  /**
   * Gets the suffix string shown after the column value.
   */
  public fun getSuffix(column: Long): String {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_SUFFIX, STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets the given column's icon [godot.Texture2D].
   */
  public fun setIcon(column: Long, texture: Texture2D): Unit {
    TransferContext.writeArguments(LONG to column, OBJECT to texture)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_ICON, NIL.ordinal)
  }

  /**
   * Returns the given column's icon [godot.Texture2D]. Error if no icon is set.
   */
  public fun getIcon(column: Long): Texture2D? {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_ICON, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  /**
   * Sets the given column's icon's texture region.
   */
  public fun setIconRegion(column: Long, region: Rect2): Unit {
    TransferContext.writeArguments(LONG to column, RECT2 to region)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_ICON_REGION, NIL.ordinal)
  }

  /**
   * Returns the icon [godot.Texture2D] region as [godot.core.Rect2].
   */
  public fun getIconRegion(column: Long): Rect2 {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_ICON_REGION, RECT2.ordinal)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Sets the given column's icon's maximum width.
   */
  public fun setIconMaxWidth(column: Long, width: Long): Unit {
    TransferContext.writeArguments(LONG to column, LONG to width)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_ICON_MAX_WIDTH, NIL.ordinal)
  }

  /**
   * Returns the column's icon's maximum width.
   */
  public fun getIconMaxWidth(column: Long): Long {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_ICON_MAX_WIDTH,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Modulates the given column's icon with `modulate`.
   */
  public fun setIconModulate(column: Long, modulate: Color): Unit {
    TransferContext.writeArguments(LONG to column, COLOR to modulate)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_ICON_MODULATE, NIL.ordinal)
  }

  /**
   * Returns the [godot.core.Color] modulating the column's icon.
   */
  public fun getIconModulate(column: Long): Color {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_ICON_MODULATE,
        COLOR.ordinal)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Sets the value of a [CELL_MODE_RANGE] column.
   */
  public fun setRange(column: Long, `value`: Double): Unit {
    TransferContext.writeArguments(LONG to column, DOUBLE to value)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_RANGE, NIL.ordinal)
  }

  /**
   * Returns the value of a [CELL_MODE_RANGE] column.
   */
  public fun getRange(column: Long): Double {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_RANGE, DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the range of accepted values for a column. The column must be in the [CELL_MODE_RANGE] mode.
   *
   * If `expr` is `true`, the edit mode slider will use an exponential scale as with [godot.Range.expEdit].
   */
  public fun setRangeConfig(
    column: Long,
    min: Double,
    max: Double,
    step: Double,
    expr: Boolean = false
  ): Unit {
    TransferContext.writeArguments(LONG to column, DOUBLE to min, DOUBLE to max, DOUBLE to step, BOOL to expr)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_RANGE_CONFIG, NIL.ordinal)
  }

  /**
   * Returns a dictionary containing the range parameters for a given column. The keys are "min", "max", "step", and "expr".
   */
  public fun getRangeConfig(column: Long): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_RANGE_CONFIG,
        DICTIONARY.ordinal)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Sets the metadata value for the given column, which can be retrieved later using [getMetadata]. This can be used, for example, to store a reference to the original data.
   */
  public fun setMetadata(column: Long, meta: Any): Unit {
    TransferContext.writeArguments(LONG to column, ANY to meta)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_METADATA, NIL.ordinal)
  }

  /**
   * Returns the metadata value that was set for the given column using [setMetadata].
   */
  public fun getMetadata(column: Long): Any? {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_METADATA, ANY.ordinal)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Sets the given column's custom draw callback to `callback` method on `object`.
   *
   * The `callback` should accept two arguments: the [godot.TreeItem] that is drawn and its position and size as a [godot.core.Rect2].
   */
  public fun setCustomDraw(
    column: Long,
    _object: Object,
    callback: StringName
  ): Unit {
    TransferContext.writeArguments(LONG to column, OBJECT to _object, STRING_NAME to callback)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_DRAW, NIL.ordinal)
  }

  /**
   *
   */
  public fun uncollapseTree(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_UNCOLLAPSE_TREE, NIL.ordinal)
  }

  /**
   * If `true`, the given column is selectable.
   */
  public fun setSelectable(column: Long, selectable: Boolean): Unit {
    TransferContext.writeArguments(LONG to column, BOOL to selectable)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_SELECTABLE, NIL.ordinal)
  }

  /**
   * Returns `true` if column `column` is selectable.
   */
  public fun isSelectable(column: Long): Boolean {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_SELECTABLE, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if column `column` is selected.
   */
  public fun isSelected(column: Long): Boolean {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_SELECTED, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Selects the column `column`.
   */
  public fun select(column: Long): Unit {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SELECT, NIL.ordinal)
  }

  /**
   * Deselects the given column.
   */
  public fun deselect(column: Long): Unit {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_DESELECT, NIL.ordinal)
  }

  /**
   * If `true`, column `column` is editable.
   */
  public fun setEditable(column: Long, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to column, BOOL to enabled)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_EDITABLE, NIL.ordinal)
  }

  /**
   * Returns `true` if column `column` is editable.
   */
  public fun isEditable(column: Long): Boolean {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_EDITABLE, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the given column's custom color.
   */
  public fun setCustomColor(column: Long, color: Color): Unit {
    TransferContext.writeArguments(LONG to column, COLOR to color)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_COLOR, NIL.ordinal)
  }

  /**
   * Returns the custom color of column `column`.
   */
  public fun getCustomColor(column: Long): Color {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CUSTOM_COLOR, COLOR.ordinal)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Resets the color for the given column to default.
   */
  public fun clearCustomColor(column: Long): Unit {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_CLEAR_CUSTOM_COLOR, NIL.ordinal)
  }

  /**
   * Sets custom font used to draw text in the column `column`.
   */
  public fun setCustomFont(column: Long, font: Font): Unit {
    TransferContext.writeArguments(LONG to column, OBJECT to font)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_FONT, NIL.ordinal)
  }

  /**
   * Returns custom font used to draw text in the column `column`.
   */
  public fun getCustomFont(column: Long): Font? {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CUSTOM_FONT, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Font?
  }

  /**
   * Sets custom font size used to draw text in the column `column`.
   */
  public fun setCustomFontSize(column: Long, fontSize: Long): Unit {
    TransferContext.writeArguments(LONG to column, LONG to fontSize)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_FONT_SIZE,
        NIL.ordinal)
  }

  /**
   * Returns custom font size used to draw text in the column `column`.
   */
  public fun getCustomFontSize(column: Long): Long {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CUSTOM_FONT_SIZE,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the given column's custom background color and whether to just use it as an outline.
   */
  public fun setCustomBgColor(
    column: Long,
    color: Color,
    justOutline: Boolean = false
  ): Unit {
    TransferContext.writeArguments(LONG to column, COLOR to color, BOOL to justOutline)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_BG_COLOR,
        NIL.ordinal)
  }

  /**
   * Resets the background color for the given column to default.
   */
  public fun clearCustomBgColor(column: Long): Unit {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_CLEAR_CUSTOM_BG_COLOR,
        NIL.ordinal)
  }

  /**
   * Returns the custom background color of column `column`.
   */
  public fun getCustomBgColor(column: Long): Color {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CUSTOM_BG_COLOR,
        COLOR.ordinal)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   *
   */
  public fun setCustomAsButton(column: Long, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to column, BOOL to enable)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_AS_BUTTON,
        NIL.ordinal)
  }

  /**
   *
   */
  public fun isCustomSetAsButton(column: Long): Boolean {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_CUSTOM_SET_AS_BUTTON,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Adds a button with [godot.Texture2D] `button` at column `column`. The `id` is used to identify the button. If not specified, the next available index is used, which may be retrieved by calling [getButtonCount] immediately before this method. Optionally, the button can be `disabled` and have a `tooltip`.
   */
  public fun addButton(
    column: Long,
    button: Texture2D,
    id: Long = -1,
    disabled: Boolean = false,
    tooltip: String = ""
  ): Unit {
    TransferContext.writeArguments(LONG to column, OBJECT to button, LONG to id, BOOL to disabled, STRING to tooltip)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_ADD_BUTTON, NIL.ordinal)
  }

  /**
   * Returns the number of buttons in column `column`.
   */
  public fun getButtonCount(column: Long): Long {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_BUTTON_COUNT, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the tooltip string for the button at index `button_idx` in column `column`.
   */
  public fun getButtonTooltip(column: Long, buttonIdx: Long): String {
    TransferContext.writeArguments(LONG to column, LONG to buttonIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_BUTTON_TOOLTIP,
        STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the id for the button at index `button_idx` in column `column`.
   */
  public fun getButtonId(column: Long, buttonIdx: Long): Long {
    TransferContext.writeArguments(LONG to column, LONG to buttonIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_BUTTON_ID, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the button index if there is a button with id `id` in column `column`, otherwise returns -1.
   */
  public fun getButtonById(column: Long, id: Long): Long {
    TransferContext.writeArguments(LONG to column, LONG to id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_BUTTON_BY_ID, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [godot.Texture2D] of the button at index `button_idx` in column `column`.
   */
  public fun getButton(column: Long, buttonIdx: Long): Texture2D? {
    TransferContext.writeArguments(LONG to column, LONG to buttonIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_BUTTON, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  /**
   * Sets the given column's button [godot.Texture2D] at index `button_idx` to `button`.
   */
  public fun setButton(
    column: Long,
    buttonIdx: Long,
    button: Texture2D
  ): Unit {
    TransferContext.writeArguments(LONG to column, LONG to buttonIdx, OBJECT to button)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_BUTTON, NIL.ordinal)
  }

  /**
   * Removes the button at index `button_idx` in column `column`.
   */
  public fun eraseButton(column: Long, buttonIdx: Long): Unit {
    TransferContext.writeArguments(LONG to column, LONG to buttonIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_ERASE_BUTTON, NIL.ordinal)
  }

  /**
   * If `true`, disables the button at index `button_idx` in column `column`.
   */
  public fun setButtonDisabled(
    column: Long,
    buttonIdx: Long,
    disabled: Boolean
  ): Unit {
    TransferContext.writeArguments(LONG to column, LONG to buttonIdx, BOOL to disabled)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_BUTTON_DISABLED,
        NIL.ordinal)
  }

  /**
   * Returns `true` if the button at index `button_idx` for the given column is disabled.
   */
  public fun isButtonDisabled(column: Long, buttonIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to column, LONG to buttonIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_BUTTON_DISABLED,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the given column's tooltip text.
   */
  public fun setTooltip(column: Long, tooltip: String): Unit {
    TransferContext.writeArguments(LONG to column, STRING to tooltip)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_TOOLTIP, NIL.ordinal)
  }

  /**
   * Returns the given column's tooltip.
   */
  public fun getTooltip(column: Long): String {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_TOOLTIP, STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets the given column's text alignment. See [enum HorizontalAlignment] for possible values.
   */
  public fun setTextAlignment(column: Long, textAlignment: HorizontalAlignment): Unit {
    TransferContext.writeArguments(LONG to column, LONG to textAlignment.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_TEXT_ALIGNMENT, NIL.ordinal)
  }

  /**
   * Returns the given column's text alignment.
   */
  public fun getTextAlignment(column: Long): HorizontalAlignment {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_TEXT_ALIGNMENT,
        LONG.ordinal)
    return HorizontalAlignment.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * If `true`, column `column` is expanded to the right.
   */
  public fun setExpandRight(column: Long, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to column, BOOL to enable)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_EXPAND_RIGHT, NIL.ordinal)
  }

  /**
   * Returns `true` if `expand_right` is set.
   */
  public fun getExpandRight(column: Long): Boolean {
    TransferContext.writeArguments(LONG to column)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_EXPAND_RIGHT, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Creates an item and adds it as a child.
   *
   * The new item will be inserted as position `idx` (the default value `-1` means the last position), or it will be the last child if `idx` is higher than the child count.
   */
  public fun createChild(idx: Long = -1): TreeItem? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_CREATE_CHILD, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Returns the [godot.Tree] that owns this TreeItem.
   */
  public fun getTree(): Tree? {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_TREE, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Tree?
  }

  /**
   * Returns the next sibling TreeItem in the tree or a null object if there is none.
   */
  public fun getNext(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_NEXT, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Returns the previous sibling TreeItem in the tree or a null object if there is none.
   */
  public fun getPrev(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_PREV, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Returns the parent TreeItem or a null object if there is none.
   */
  public fun getParent(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_PARENT, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Returns the TreeItem's first child.
   */
  public fun getFirstChild(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_FIRST_CHILD, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Returns the next visible sibling TreeItem in the tree or a null object if there is none.
   *
   * If `wrap` is enabled, the method will wrap around to the first visible element in the tree when called on the last visible element, otherwise it returns `null`.
   */
  public fun getNextVisible(wrap: Boolean = false): TreeItem? {
    TransferContext.writeArguments(BOOL to wrap)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_NEXT_VISIBLE,
        OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Returns the previous visible sibling TreeItem in the tree or a null object if there is none.
   *
   * If `wrap` is enabled, the method will wrap around to the last visible element in the tree when called on the first visible element, otherwise it returns `null`.
   */
  public fun getPrevVisible(wrap: Boolean = false): TreeItem? {
    TransferContext.writeArguments(BOOL to wrap)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_PREV_VISIBLE,
        OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Returns a child item by its index (see [getChildCount]). This method is often used for iterating all children of an item.
   *
   * Negative indices access the children from the last one.
   */
  public fun getChild(idx: Long): TreeItem? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CHILD, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Returns the number of child items.
   */
  public fun getChildCount(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CHILD_COUNT, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns an array of references to the item's children.
   */
  public fun getChildren(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CHILDREN, ARRAY.ordinal)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the node's order in the tree. For example, if called on the first child item the position is `0`.
   */
  public fun getIndex(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_INDEX, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Moves this TreeItem right before the given `item`.
   *
   * **Note:** You can't move to the root or move the root.
   */
  public fun moveBefore(item: TreeItem): Unit {
    TransferContext.writeArguments(OBJECT to item)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_MOVE_BEFORE, NIL.ordinal)
  }

  /**
   * Moves this TreeItem right after the given `item`.
   *
   * **Note:** You can't move to the root or move the root.
   */
  public fun moveAfter(item: TreeItem): Unit {
    TransferContext.writeArguments(OBJECT to item)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_MOVE_AFTER, NIL.ordinal)
  }

  /**
   * Removes the given child [godot.TreeItem] and all its children from the [godot.Tree]. Note that it doesn't free the item from memory, so it can be reused later. To completely remove a [godot.TreeItem] use [godot.Object.free].
   */
  public fun removeChild(child: TreeItem): Unit {
    TransferContext.writeArguments(OBJECT to child)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_REMOVE_CHILD, NIL.ordinal)
  }

  /**
   * Calls the `method` on the actual TreeItem and its children recursively. Pass parameters as a comma separated list.
   */
  public fun callRecursive(method: StringName, vararg __var_args: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_CALL_RECURSIVE, NIL.ordinal)
  }

  public enum class TreeCellMode(
    id: Long
  ) {
    /**
     * Cell contains a string.
     */
    CELL_MODE_STRING(0),
    /**
     * Cell contains a checkbox.
     */
    CELL_MODE_CHECK(1),
    /**
     * Cell contains a range.
     */
    CELL_MODE_RANGE(2),
    /**
     * Cell contains an icon.
     */
    CELL_MODE_ICON(3),
    /**
     *
     */
    CELL_MODE_CUSTOM(4),
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
