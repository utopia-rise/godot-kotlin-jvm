// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.Rect2
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * An internal control for a single item inside [godot.Tree].
 *
 * A single item of a [godot.Tree] control. It can contain other [godot.TreeItem]s as children, which allows it to create a hierarchy. It can also contain text and buttons. [godot.TreeItem] is not a [godot.Node], it is internal to the [godot.Tree].
 *
 * To create a [godot.TreeItem], use [godot.Tree.createItem] or [godot.TreeItem.createChild]. To remove a [godot.TreeItem], use [godot.Object.free].
 *
 * **Note:** The ID values used for buttons are 32-bit, unlike [int] which is always 64-bit. They go from `-2147483648` to `2147483647`.
 */
@GodotBaseType
public open class TreeItem internal constructor() : Object() {
  /**
   * If `true`, the TreeItem is collapsed.
   */
  public var collapsed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_COLLAPSED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_COLLAPSED, NIL)
    }

  /**
   * If `true`, the [godot.TreeItem] is visible (default).
   *
   * Note that if a [godot.TreeItem] is set to not be visible, none of its children will be visible either.
   */
  public var visible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_VISIBLE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_VISIBLE, NIL)
    }

  /**
   * If `true`, folding is disabled for this TreeItem.
   */
  public var disableFolding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_FOLDING_DISABLED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_DISABLE_FOLDING, NIL)
    }

  /**
   * The custom minimum height.
   */
  public var customMinimumHeight: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CUSTOM_MINIMUM_HEIGHT, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_MINIMUM_HEIGHT, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TREEITEM, scriptIndex)
    return true
  }

  /**
   * Sets the given column's cell mode to [mode]. See [enum TreeCellMode] constants.
   */
  public fun setCellMode(column: Int, mode: TreeCellMode): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to mode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CELL_MODE, NIL)
  }

  /**
   * Returns the column's cell mode.
   */
  public fun getCellMode(column: Int): TreeCellMode {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CELL_MODE, LONG)
    return TreeItem.TreeCellMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If [multiline] is `true`, the given [column] is multiline editable.
   *
   * **Note:** This option only affects the type of control ([godot.LineEdit] or [godot.TextEdit]) that appears when editing the column. You can set multiline values with [setText] even if the column is not multiline editable.
   */
  public fun setEditMultiline(column: Int, multiline: Boolean): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to multiline)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_EDIT_MULTILINE, NIL)
  }

  /**
   * Returns `true` if the given [column] is multiline editable.
   */
  public fun isEditMultiline(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_EDIT_MULTILINE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * If [checked] is `true`, the given [column] is checked. Clears column's indeterminate status.
   */
  public fun setChecked(column: Int, checked: Boolean): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to checked)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CHECKED, NIL)
  }

  /**
   * If [indeterminate] is `true`, the given [column] is marked indeterminate.
   *
   * **Note:** If set `true` from `false`, then column is cleared of checked status.
   */
  public fun setIndeterminate(column: Int, indeterminate: Boolean): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to indeterminate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_INDETERMINATE, NIL)
  }

  /**
   * Returns `true` if the given [column] is checked.
   */
  public fun isChecked(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_CHECKED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the given [column] is indeterminate.
   */
  public fun isIndeterminate(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_INDETERMINATE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Propagates this item's checked status to its children and parents for the given [column]. It is possible to process the items affected by this method call by connecting to [godot.Tree.checkPropagatedToItem]. The order that the items affected will be processed is as follows: the item invoking this method, children of that item, and finally parents of that item. If [emitSignal] is `false`, then [godot.Tree.checkPropagatedToItem] will not be emitted.
   */
  @JvmOverloads
  public fun propagateCheck(column: Int, emitSignal: Boolean = true): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to emitSignal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_PROPAGATE_CHECK, NIL)
  }

  /**
   * Sets the given column's text value.
   */
  public fun setText(column: Int, text: String): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_TEXT, NIL)
  }

  /**
   * Returns the given column's text.
   */
  public fun getText(column: Int): String {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_TEXT, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets item's text base writing direction.
   */
  public fun setTextDirection(column: Int, direction: Control.TextDirection): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to direction.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_TEXT_DIRECTION, NIL)
  }

  /**
   * Returns item's text base writing direction.
   */
  public fun getTextDirection(column: Int): Control.TextDirection {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_TEXT_DIRECTION, LONG)
    return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the autowrap mode in the given [column]. If set to something other than [godot.TextServer.AUTOWRAP_OFF], the text gets wrapped inside the cell's bounding rectangle.
   */
  public fun setAutowrapMode(column: Int, autowrapMode: TextServer.AutowrapMode): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to autowrapMode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_AUTOWRAP_MODE, NIL)
  }

  /**
   * Returns the text autowrap mode in the given [column]. By default it is [godot.TextServer.AUTOWRAP_OFF].
   */
  public fun getAutowrapMode(column: Int): TextServer.AutowrapMode {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_AUTOWRAP_MODE, LONG)
    return TextServer.AutowrapMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   *
   */
  public fun setStructuredTextBidiOverride(column: Int, parser: TextServer.StructuredTextParser):
      Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to parser.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_STRUCTURED_TEXT_BIDI_OVERRIDE, NIL)
  }

  /**
   *
   */
  public fun getStructuredTextBidiOverride(column: Int): TextServer.StructuredTextParser {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_STRUCTURED_TEXT_BIDI_OVERRIDE, LONG)
    return TextServer.StructuredTextParser.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   *
   */
  public fun setStructuredTextBidiOverrideOptions(column: Int, args: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), ARRAY to args)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_STRUCTURED_TEXT_BIDI_OVERRIDE_OPTIONS, NIL)
  }

  /**
   *
   */
  public fun getStructuredTextBidiOverrideOptions(column: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_STRUCTURED_TEXT_BIDI_OVERRIDE_OPTIONS, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Sets language code of item's text used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public fun setLanguage(column: Int, language: String): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), STRING to language)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_LANGUAGE, NIL)
  }

  /**
   * Returns item's text language code.
   */
  public fun getLanguage(column: Int): String {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_LANGUAGE, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets a string to be shown after a column's value (for example, a unit abbreviation).
   */
  public fun setSuffix(column: Int, text: String): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_SUFFIX, NIL)
  }

  /**
   * Gets the suffix string shown after the column value.
   */
  public fun getSuffix(column: Int): String {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_SUFFIX, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets the given column's icon [godot.Texture2D].
   */
  public fun setIcon(column: Int, texture: Texture2D): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_ICON, NIL)
  }

  /**
   * Returns the given column's icon [godot.Texture2D]. Error if no icon is set.
   */
  public fun getIcon(column: Int): Texture2D? {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_ICON, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  /**
   * Sets the given column's icon's texture region.
   */
  public fun setIconRegion(column: Int, region: Rect2): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), RECT2 to region)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_ICON_REGION, NIL)
  }

  /**
   * Returns the icon [godot.Texture2D] region as [godot.core.Rect2].
   */
  public fun getIconRegion(column: Int): Rect2 {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_ICON_REGION, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Sets the maximum allowed width of the icon in the given [column]. This limit is applied on top of the default size of the icon and on top of [theme_item Tree.icon_max_width]. The height is adjusted according to the icon's ratio.
   */
  public fun setIconMaxWidth(column: Int, width: Int): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to width.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_ICON_MAX_WIDTH, NIL)
  }

  /**
   * Returns the maximum allowed width of the icon in the given [column].
   */
  public fun getIconMaxWidth(column: Int): Int {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_ICON_MAX_WIDTH, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Modulates the given column's icon with [modulate].
   */
  public fun setIconModulate(column: Int, modulate: Color): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), COLOR to modulate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_ICON_MODULATE, NIL)
  }

  /**
   * Returns the [godot.core.Color] modulating the column's icon.
   */
  public fun getIconModulate(column: Int): Color {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_ICON_MODULATE, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Sets the value of a [CELL_MODE_RANGE] column.
   */
  public fun setRange(column: Int, `value`: Double): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_RANGE, NIL)
  }

  /**
   * Returns the value of a [CELL_MODE_RANGE] column.
   */
  public fun getRange(column: Int): Double {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_RANGE, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Sets the range of accepted values for a column. The column must be in the [CELL_MODE_RANGE] mode.
   *
   * If [expr] is `true`, the edit mode slider will use an exponential scale as with [godot.Range.expEdit].
   */
  @JvmOverloads
  public fun setRangeConfig(
    column: Int,
    min: Double,
    max: Double,
    step: Double,
    expr: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), DOUBLE to min, DOUBLE to max, DOUBLE to step, BOOL to expr)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_RANGE_CONFIG, NIL)
  }

  /**
   * Returns a dictionary containing the range parameters for a given column. The keys are "min", "max", "step", and "expr".
   */
  public fun getRangeConfig(column: Int): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_RANGE_CONFIG,
        DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Sets the metadata value for the given column, which can be retrieved later using [getMetadata]. This can be used, for example, to store a reference to the original data.
   */
  public fun setMetadata(column: Int, meta: Any): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), ANY to meta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_METADATA, NIL)
  }

  /**
   * Returns the metadata value that was set for the given column using [setMetadata].
   */
  public fun getMetadata(column: Int): Any? {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_METADATA, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Sets the given column's custom draw callback to [callback] method on [object].
   *
   * The [callback] should accept two arguments: the [godot.TreeItem] that is drawn and its position and size as a [godot.core.Rect2].
   */
  public fun setCustomDraw(
    column: Int,
    _object: Object,
    callback: StringName,
  ): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), OBJECT to _object, STRING_NAME to callback)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_DRAW, NIL)
  }

  /**
   * Collapses or uncollapses this [godot.TreeItem] and all the descendants of this item.
   */
  public fun setCollapsedRecursive(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_COLLAPSED_RECURSIVE,
        NIL)
  }

  /**
   * Returns `true` if this [godot.TreeItem], or any of its descendants, is collapsed.
   *
   * If [onlyVisible] is `true` it ignores non-visible [godot.TreeItem]s.
   */
  @JvmOverloads
  public fun isAnyCollapsed(onlyVisible: Boolean = false): Boolean {
    TransferContext.writeArguments(BOOL to onlyVisible)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_ANY_COLLAPSED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   *
   */
  public fun uncollapseTree(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_UNCOLLAPSE_TREE, NIL)
  }

  /**
   * If [selectable] is `true`, the given [column] is selectable.
   */
  public fun setSelectable(column: Int, selectable: Boolean): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to selectable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_SELECTABLE, NIL)
  }

  /**
   * Returns `true` if the given [column] is selectable.
   */
  public fun isSelectable(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_SELECTABLE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the given [column] is selected.
   */
  public fun isSelected(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_SELECTED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Selects the given [column].
   */
  public fun select(column: Int): Unit {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SELECT, NIL)
  }

  /**
   * Deselects the given column.
   */
  public fun deselect(column: Int): Unit {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_DESELECT, NIL)
  }

  /**
   * If [enabled] is `true`, the given [column] is editable.
   */
  public fun setEditable(column: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_EDITABLE, NIL)
  }

  /**
   * Returns `true` if the given [column] is editable.
   */
  public fun isEditable(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_EDITABLE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the given column's custom color.
   */
  public fun setCustomColor(column: Int, color: Color): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_COLOR, NIL)
  }

  /**
   * Returns the custom color of column [column].
   */
  public fun getCustomColor(column: Int): Color {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CUSTOM_COLOR, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Resets the color for the given column to default.
   */
  public fun clearCustomColor(column: Int): Unit {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_CLEAR_CUSTOM_COLOR, NIL)
  }

  /**
   * Sets custom font used to draw text in the given [column].
   */
  public fun setCustomFont(column: Int, font: Font): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), OBJECT to font)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_FONT, NIL)
  }

  /**
   * Returns custom font used to draw text in the column [column].
   */
  public fun getCustomFont(column: Int): Font? {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CUSTOM_FONT, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Font?)
  }

  /**
   * Sets custom font size used to draw text in the given [column].
   */
  public fun setCustomFontSize(column: Int, fontSize: Int): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_FONT_SIZE, NIL)
  }

  /**
   * Returns custom font size used to draw text in the column [column].
   */
  public fun getCustomFontSize(column: Int): Int {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CUSTOM_FONT_SIZE, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the given column's custom background color and whether to just use it as an outline.
   */
  @JvmOverloads
  public fun setCustomBgColor(
    column: Int,
    color: Color,
    justOutline: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), COLOR to color, BOOL to justOutline)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_BG_COLOR, NIL)
  }

  /**
   * Resets the background color for the given column to default.
   */
  public fun clearCustomBgColor(column: Int): Unit {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_CLEAR_CUSTOM_BG_COLOR, NIL)
  }

  /**
   * Returns the custom background color of column [column].
   */
  public fun getCustomBgColor(column: Int): Color {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CUSTOM_BG_COLOR, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   *
   */
  public fun setCustomAsButton(column: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_AS_BUTTON, NIL)
  }

  /**
   *
   */
  public fun isCustomSetAsButton(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_CUSTOM_SET_AS_BUTTON,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds a button with [godot.Texture2D] [button] at column [column]. The [id] is used to identify the button in the according [godot.Tree.buttonClicked] signal and can be different from the buttons index. If not specified, the next available index is used, which may be retrieved by calling [getButtonCount] immediately before this method. Optionally, the button can be [disabled] and have a [tooltipText].
   */
  @JvmOverloads
  public fun addButton(
    column: Int,
    button: Texture2D,
    id: Int = -1,
    disabled: Boolean = false,
    tooltipText: String = "",
  ): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), OBJECT to button, LONG to id.toLong(), BOOL to disabled, STRING to tooltipText)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_ADD_BUTTON, NIL)
  }

  /**
   * Returns the number of buttons in column [column].
   */
  public fun getButtonCount(column: Int): Int {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_BUTTON_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the tooltip text for the button at index [buttonIndex] in column [column].
   */
  public fun getButtonTooltipText(column: Int, buttonIndex: Int): String {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to buttonIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_BUTTON_TOOLTIP_TEXT,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the ID for the button at index [buttonIndex] in column [column].
   */
  public fun getButtonId(column: Int, buttonIndex: Int): Int {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to buttonIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_BUTTON_ID, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the button index if there is a button with ID [id] in column [column], otherwise returns -1.
   */
  public fun getButtonById(column: Int, id: Int): Int {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to id.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_BUTTON_BY_ID, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the [godot.Texture2D] of the button at index [buttonIndex] in column [column].
   */
  public fun getButton(column: Int, buttonIndex: Int): Texture2D? {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to buttonIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_BUTTON, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  /**
   * Sets the given column's button [godot.Texture2D] at index [buttonIndex] to [button].
   */
  public fun setButton(
    column: Int,
    buttonIndex: Int,
    button: Texture2D,
  ): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to buttonIndex.toLong(), OBJECT to button)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_BUTTON, NIL)
  }

  /**
   * Removes the button at index [buttonIndex] in column [column].
   */
  public fun eraseButton(column: Int, buttonIndex: Int): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to buttonIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_ERASE_BUTTON, NIL)
  }

  /**
   * If `true`, disables the button at index [buttonIndex] in the given [column].
   */
  public fun setButtonDisabled(
    column: Int,
    buttonIndex: Int,
    disabled: Boolean,
  ): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to buttonIndex.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_BUTTON_DISABLED, NIL)
  }

  /**
   * Sets the given column's button color at index [buttonIndex] to [color].
   */
  public fun setButtonColor(
    column: Int,
    buttonIndex: Int,
    color: Color,
  ): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to buttonIndex.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_BUTTON_COLOR, NIL)
  }

  /**
   * Returns `true` if the button at index [buttonIndex] for the given [column] is disabled.
   */
  public fun isButtonDisabled(column: Int, buttonIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to buttonIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_BUTTON_DISABLED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the given column's tooltip text.
   */
  public fun setTooltipText(column: Int, tooltip: String): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), STRING to tooltip)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_TOOLTIP_TEXT, NIL)
  }

  /**
   * Returns the given column's tooltip text.
   */
  public fun getTooltipText(column: Int): String {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_TOOLTIP_TEXT, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets the given column's text alignment. See [enum HorizontalAlignment] for possible values.
   */
  public fun setTextAlignment(column: Int, textAlignment: HorizontalAlignment): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to textAlignment.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_TEXT_ALIGNMENT, NIL)
  }

  /**
   * Returns the given column's text alignment.
   */
  public fun getTextAlignment(column: Int): HorizontalAlignment {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_TEXT_ALIGNMENT, LONG)
    return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If [enable] is `true`, the given [column] is expanded to the right.
   */
  public fun setExpandRight(column: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_EXPAND_RIGHT, NIL)
  }

  /**
   * Returns `true` if `expand_right` is set.
   */
  public fun getExpandRight(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_EXPAND_RIGHT, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Creates an item and adds it as a child.
   *
   * The new item will be inserted as position [index] (the default value `-1` means the last position), or it will be the last child if [index] is higher than the child count.
   */
  @JvmOverloads
  public fun createChild(index: Int = -1): TreeItem? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_CREATE_CHILD, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Adds a previously unparented [godot.TreeItem] as a direct child of this one. The [child] item must not be a part of any [godot.Tree] or parented to any [godot.TreeItem]. See also [removeChild].
   */
  public fun addChild(child: TreeItem): Unit {
    TransferContext.writeArguments(OBJECT to child)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_ADD_CHILD, NIL)
  }

  /**
   * Removes the given child [godot.TreeItem] and all its children from the [godot.Tree]. Note that it doesn't free the item from memory, so it can be reused later (see [addChild]). To completely remove a [godot.TreeItem] use [godot.Object.free].
   *
   * **Note:** If you want to move a child from one [godot.Tree] to another, then instead of removing and adding it manually you can use [moveBefore] or [moveAfter].
   */
  public fun removeChild(child: TreeItem): Unit {
    TransferContext.writeArguments(OBJECT to child)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_REMOVE_CHILD, NIL)
  }

  /**
   * Returns the [godot.Tree] that owns this TreeItem.
   */
  public fun getTree(): Tree? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_TREE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tree?)
  }

  /**
   * Returns the next sibling TreeItem in the tree or a null object if there is none.
   */
  public fun getNext(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_NEXT, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Returns the previous sibling TreeItem in the tree or a null object if there is none.
   */
  public fun getPrev(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_PREV, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Returns the parent TreeItem or a null object if there is none.
   */
  public fun getParent(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_PARENT, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Returns the TreeItem's first child.
   */
  public fun getFirstChild(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_FIRST_CHILD, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Returns the next TreeItem in the tree (in the context of a depth-first search) or a `null` object if there is none.
   *
   * If [wrap] is enabled, the method will wrap around to the first element in the tree when called on the last element, otherwise it returns `null`.
   */
  @JvmOverloads
  public fun getNextInTree(wrap: Boolean = false): TreeItem? {
    TransferContext.writeArguments(BOOL to wrap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_NEXT_IN_TREE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Returns the previous TreeItem in the tree (in the context of a depth-first search) or a `null` object if there is none.
   *
   * If [wrap] is enabled, the method will wrap around to the last element in the tree when called on the first visible element, otherwise it returns `null`.
   */
  @JvmOverloads
  public fun getPrevInTree(wrap: Boolean = false): TreeItem? {
    TransferContext.writeArguments(BOOL to wrap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_PREV_IN_TREE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Returns the next visible TreeItem in the tree (in the context of a depth-first search) or a `null` object if there is none.
   *
   * If [wrap] is enabled, the method will wrap around to the first visible element in the tree when called on the last visible element, otherwise it returns `null`.
   */
  @JvmOverloads
  public fun getNextVisible(wrap: Boolean = false): TreeItem? {
    TransferContext.writeArguments(BOOL to wrap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_NEXT_VISIBLE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Returns the previous visible sibling TreeItem in the tree (in the context of a depth-first search) or a `null` object if there is none.
   *
   * If [wrap] is enabled, the method will wrap around to the last visible element in the tree when called on the first visible element, otherwise it returns `null`.
   */
  @JvmOverloads
  public fun getPrevVisible(wrap: Boolean = false): TreeItem? {
    TransferContext.writeArguments(BOOL to wrap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_PREV_VISIBLE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Returns a child item by its [index] (see [getChildCount]). This method is often used for iterating all children of an item.
   *
   * Negative indices access the children from the last one.
   */
  public fun getChild(index: Int): TreeItem? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CHILD, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Returns the number of child items.
   */
  public fun getChildCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CHILD_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns an array of references to the item's children.
   */
  public fun getChildren(): VariantArray<TreeItem> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CHILDREN, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<TreeItem>)
  }

  /**
   * Returns the node's order in the tree. For example, if called on the first child item the position is `0`.
   */
  public fun getIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_INDEX, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Moves this TreeItem right before the given [item].
   *
   * **Note:** You can't move to the root or move the root.
   */
  public fun moveBefore(item: TreeItem): Unit {
    TransferContext.writeArguments(OBJECT to item)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_MOVE_BEFORE, NIL)
  }

  /**
   * Moves this TreeItem right after the given [item].
   *
   * **Note:** You can't move to the root or move the root.
   */
  public fun moveAfter(item: TreeItem): Unit {
    TransferContext.writeArguments(OBJECT to item)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_MOVE_AFTER, NIL)
  }

  /**
   * Calls the [method] on the actual TreeItem and its children recursively. Pass parameters as a comma separated list.
   */
  public fun callRecursive(method: StringName, vararg __var_args: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_CALL_RECURSIVE, NIL)
  }

  public enum class TreeCellMode(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object
}
