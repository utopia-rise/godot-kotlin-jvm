// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.TreeItem
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.ANY
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
public open class TreeItem : Object() {
  /**
   * If `true`, the TreeItem is collapsed.
   */
  public open var collapsed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_COLLAPSED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_COLLAPSED, NIL)
    }

  /**
   * The custom minimum height.
   */
  public open var customMinimumHeight: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CUSTOM_MINIMUM_HEIGHT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_MINIMUM_HEIGHT, NIL)
    }

  /**
   * If `true`, folding is disabled for this TreeItem.
   */
  public open var disableFolding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_DISABLE_FOLDING,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_DISABLE_FOLDING, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TREEITEM)
  }

  /**
   * Adds a button with [godot.Texture] `button` at column `column`. The `button_idx` index is used to identify the button when calling other methods. If not specified, the next available index is used, which may be retrieved by calling [getButtonCount] immediately after this method. Optionally, the button can be `disabled` and have a `tooltip`.
   */
  public open fun addButton(
    column: Long,
    button: Texture,
    buttonIdx: Long = -1,
    disabled: Boolean = false,
    tooltip: String = ""
  ): Unit {
    TransferContext.writeArguments(LONG to column, OBJECT to button, LONG to buttonIdx, BOOL to
        disabled, STRING to tooltip)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_ADD_BUTTON, NIL)
  }

  /**
   * Calls the `method` on the actual TreeItem and its children recursively. Pass parameters as a comma separated list.
   */
  public open fun callRecursive(method: String, vararg __var_args: Any?): Any? {
    TransferContext.writeArguments(STRING to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_CALL_RECURSIVE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Resets the background color for the given column to default.
   */
  public open fun clearCustomBgColor(column: Long): Unit {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_CLEAR_CUSTOM_BG_COLOR, NIL)
  }

  /**
   * Resets the color for the given column to default.
   */
  public open fun clearCustomColor(column: Long): Unit {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_CLEAR_CUSTOM_COLOR, NIL)
  }

  /**
   * Deselects the given column.
   */
  public open fun deselect(column: Long): Unit {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_DESELECT, NIL)
  }

  /**
   * Removes the button at index `button_idx` in column `column`.
   */
  public open fun eraseButton(column: Long, buttonIdx: Long): Unit {
    TransferContext.writeArguments(LONG to column, LONG to buttonIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_ERASE_BUTTON, NIL)
  }

  /**
   * Returns the [godot.Texture] of the button at index `button_idx` in column `column`.
   */
  public open fun getButton(column: Long, buttonIdx: Long): Texture? {
    TransferContext.writeArguments(LONG to column, LONG to buttonIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_BUTTON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  /**
   * Returns the number of buttons in column `column`. May be used to get the most recently added button's index, if no index was specified.
   */
  public open fun getButtonCount(column: Long): Long {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_BUTTON_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the tooltip string for the button at index `button_idx` in column `column`.
   */
  public open fun getButtonTooltip(column: Long, buttonIdx: Long): String {
    TransferContext.writeArguments(LONG to column, LONG to buttonIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_BUTTON_TOOLTIP, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the column's cell mode.
   */
  public open fun getCellMode(column: Long): TreeItem.TreeCellMode {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CELL_MODE, LONG)
    return TreeItem.TreeCellMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the TreeItem's first child item or a null object if there is none.
   */
  public open fun getChildren(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CHILDREN, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Returns the custom background color of column `column`.
   */
  public open fun getCustomBgColor(column: Long): Color {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CUSTOM_BG_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the custom color of column `column`.
   */
  public open fun getCustomColor(column: Long): Color {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CUSTOM_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns `true` if `expand_right` is set.
   */
  public open fun getExpandRight(column: Long): Boolean {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_EXPAND_RIGHT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the given column's icon [godot.Texture]. Error if no icon is set.
   */
  public open fun getIcon(column: Long): Texture? {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  /**
   * Returns the column's icon's maximum width.
   */
  public open fun getIconMaxWidth(column: Long): Long {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_ICON_MAX_WIDTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [godot.core.Color] modulating the column's icon.
   */
  public open fun getIconModulate(column: Long): Color {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_ICON_MODULATE, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the icon [godot.Texture] region as [godot.core.Rect2].
   */
  public open fun getIconRegion(column: Long): Rect2 {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_ICON_REGION, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Returns the metadata value that was set for the given column using [setMetadata].
   */
  public open fun getMetadata(column: Long): Any? {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_METADATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the next TreeItem in the tree or a null object if there is none.
   */
  public open fun getNext(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_NEXT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Returns the next visible TreeItem in the tree or a null object if there is none.
   *
   * If `wrap` is enabled, the method will wrap around to the first visible element in the tree when called on the last visible element, otherwise it returns `null`.
   */
  public open fun getNextVisible(wrap: Boolean = false): TreeItem? {
    TransferContext.writeArguments(BOOL to wrap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_NEXT_VISIBLE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Returns the parent TreeItem or a null object if there is none.
   */
  public open fun getParent(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_PARENT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Returns the previous TreeItem in the tree or a null object if there is none.
   */
  public open fun getPrev(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_PREV, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Returns the previous visible TreeItem in the tree or a null object if there is none.
   *
   * If `wrap` is enabled, the method will wrap around to the last visible element in the tree when called on the first visible element, otherwise it returns `null`.
   */
  public open fun getPrevVisible(wrap: Boolean = false): TreeItem? {
    TransferContext.writeArguments(BOOL to wrap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_PREV_VISIBLE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Returns the value of a [CELL_MODE_RANGE] column.
   */
  public open fun getRange(column: Long): Double {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_RANGE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns a dictionary containing the range parameters for a given column. The keys are "min", "max", "step", and "expr".
   */
  public open fun getRangeConfig(column: Long): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_RANGE_CONFIG,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Gets the suffix string shown after the column value.
   */
  public open fun getSuffix(column: Long): String {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_SUFFIX, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the given column's text.
   */
  public open fun getText(column: Long): String {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the given column's text alignment.
   */
  public open fun getTextAlign(column: Long): TreeItem.TextAlign {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_TEXT_ALIGN, LONG)
    return TreeItem.TextAlign.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the given column's tooltip.
   */
  public open fun getTooltip(column: Long): String {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_TOOLTIP, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if the button at index `button_idx` for the given column is disabled.
   */
  public open fun isButtonDisabled(column: Long, buttonIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to column, LONG to buttonIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_BUTTON_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the given column is checked.
   */
  public open fun isChecked(column: Long): Boolean {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_CHECKED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun isCustomSetAsButton(column: Long): Boolean {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_CUSTOM_SET_AS_BUTTON,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if column `column` is editable.
   */
  public open fun isEditable(column: Long): Boolean {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_EDITABLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if column `column` is selectable.
   */
  public open fun isSelectable(column: Long): Boolean {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_SELECTABLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if column `column` is selected.
   */
  public open fun isSelected(column: Long): Boolean {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_SELECTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Moves this TreeItem to the bottom in the [godot.Tree] hierarchy.
   */
  public open fun moveToBottom(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_MOVE_TO_BOTTOM, NIL)
  }

  /**
   * Moves this TreeItem to the top in the [godot.Tree] hierarchy.
   */
  public open fun moveToTop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_MOVE_TO_TOP, NIL)
  }

  /**
   * Removes the given child [godot.TreeItem] and all its children from the [godot.Tree]. Note that it doesn't free the item from memory, so it can be reused later. To completely remove a [godot.TreeItem] use [godot.Object.free].
   */
  public open fun removeChild(child: Object): Unit {
    TransferContext.writeArguments(OBJECT to child)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_REMOVE_CHILD, NIL)
  }

  /**
   * Selects the column `column`.
   */
  public open fun select(column: Long): Unit {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SELECT, NIL)
  }

  /**
   * Sets the given column's button [godot.Texture] at index `button_idx` to `button`.
   */
  public open fun setButton(
    column: Long,
    buttonIdx: Long,
    button: Texture
  ): Unit {
    TransferContext.writeArguments(LONG to column, LONG to buttonIdx, OBJECT to button)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_BUTTON, NIL)
  }

  /**
   * If `true`, disables the button at index `button_idx` in column `column`.
   */
  public open fun setButtonDisabled(
    column: Long,
    buttonIdx: Long,
    disabled: Boolean
  ): Unit {
    TransferContext.writeArguments(LONG to column, LONG to buttonIdx, BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_BUTTON_DISABLED, NIL)
  }

  /**
   * Sets the given column's cell mode to `mode`. See [enum TreeCellMode] constants.
   */
  public open fun setCellMode(column: Long, mode: Long): Unit {
    TransferContext.writeArguments(LONG to column, LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CELL_MODE, NIL)
  }

  /**
   * If `true`, the column `column` is checked.
   */
  public open fun setChecked(column: Long, checked: Boolean): Unit {
    TransferContext.writeArguments(LONG to column, BOOL to checked)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CHECKED, NIL)
  }

  /**
   *
   */
  public open fun setCustomAsButton(column: Long, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to column, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_AS_BUTTON, NIL)
  }

  /**
   * Sets the given column's custom background color and whether to just use it as an outline.
   */
  public open fun setCustomBgColor(
    column: Long,
    color: Color,
    justOutline: Boolean = false
  ): Unit {
    TransferContext.writeArguments(LONG to column, COLOR to color, BOOL to justOutline)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_BG_COLOR, NIL)
  }

  /**
   * Sets the given column's custom color.
   */
  public open fun setCustomColor(column: Long, color: Color): Unit {
    TransferContext.writeArguments(LONG to column, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_COLOR, NIL)
  }

  /**
   * Sets the given column's custom draw callback to `callback` method on `object`.
   *
   * The `callback` should accept two arguments: the [godot.TreeItem] that is drawn and its position and size as a [godot.core.Rect2].
   */
  public open fun setCustomDraw(
    column: Long,
    _object: Object,
    callback: String
  ): Unit {
    TransferContext.writeArguments(LONG to column, OBJECT to _object, STRING to callback)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_DRAW, NIL)
  }

  /**
   * If `true`, column `column` is editable.
   */
  public open fun setEditable(column: Long, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to column, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_EDITABLE, NIL)
  }

  /**
   * If `true`, column `column` is expanded to the right.
   */
  public open fun setExpandRight(column: Long, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to column, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_EXPAND_RIGHT, NIL)
  }

  /**
   * Sets the given column's icon [godot.Texture].
   */
  public open fun setIcon(column: Long, texture: Texture): Unit {
    TransferContext.writeArguments(LONG to column, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_ICON, NIL)
  }

  /**
   * Sets the given column's icon's maximum width.
   */
  public open fun setIconMaxWidth(column: Long, width: Long): Unit {
    TransferContext.writeArguments(LONG to column, LONG to width)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_ICON_MAX_WIDTH, NIL)
  }

  /**
   * Modulates the given column's icon with `modulate`.
   */
  public open fun setIconModulate(column: Long, modulate: Color): Unit {
    TransferContext.writeArguments(LONG to column, COLOR to modulate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_ICON_MODULATE, NIL)
  }

  /**
   * Sets the given column's icon's texture region.
   */
  public open fun setIconRegion(column: Long, region: Rect2): Unit {
    TransferContext.writeArguments(LONG to column, RECT2 to region)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_ICON_REGION, NIL)
  }

  /**
   * Sets the metadata value for the given column, which can be retrieved later using [getMetadata]. This can be used, for example, to store a reference to the original data.
   */
  public open fun setMetadata(column: Long, meta: Any?): Unit {
    TransferContext.writeArguments(LONG to column, ANY to meta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_METADATA, NIL)
  }

  /**
   * Sets the value of a [CELL_MODE_RANGE] column.
   */
  public open fun setRange(column: Long, `value`: Double): Unit {
    TransferContext.writeArguments(LONG to column, DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_RANGE, NIL)
  }

  /**
   * Sets the range of accepted values for a column. The column must be in the [CELL_MODE_RANGE] mode.
   *
   * If `expr` is `true`, the edit mode slider will use an exponential scale as with [godot.Range.expEdit].
   */
  public open fun setRangeConfig(
    column: Long,
    min: Double,
    max: Double,
    step: Double,
    expr: Boolean = false
  ): Unit {
    TransferContext.writeArguments(LONG to column, DOUBLE to min, DOUBLE to max, DOUBLE to step,
        BOOL to expr)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_RANGE_CONFIG, NIL)
  }

  /**
   * If `true`, the given column is selectable.
   */
  public open fun setSelectable(column: Long, selectable: Boolean): Unit {
    TransferContext.writeArguments(LONG to column, BOOL to selectable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_SELECTABLE, NIL)
  }

  /**
   * Sets a string to be shown after a column's value (for example, a unit abbreviation).
   */
  public open fun setSuffix(column: Long, text: String): Unit {
    TransferContext.writeArguments(LONG to column, STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_SUFFIX, NIL)
  }

  /**
   * Sets the given column's text value.
   */
  public open fun setText(column: Long, text: String): Unit {
    TransferContext.writeArguments(LONG to column, STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_TEXT, NIL)
  }

  /**
   * Sets the given column's text alignment. See [enum TextAlign] for possible values.
   */
  public open fun setTextAlign(column: Long, textAlign: Long): Unit {
    TransferContext.writeArguments(LONG to column, LONG to textAlign)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_TEXT_ALIGN, NIL)
  }

  /**
   * Sets the given column's tooltip text.
   */
  public open fun setTooltip(column: Long, tooltip: String): Unit {
    TransferContext.writeArguments(LONG to column, STRING to tooltip)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_TOOLTIP, NIL)
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

  public enum class TextAlign(
    id: Long
  ) {
    /**
     * Align text to the left. See `set_text_align()`.
     */
    ALIGN_LEFT(0),
    /**
     * Center text. See `set_text_align()`.
     */
    ALIGN_CENTER(1),
    /**
     * Align text to the right. See `set_text_align()`.
     */
    ALIGN_RIGHT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Center text. See `set_text_align()`.
     */
    public final const val ALIGN_CENTER: Long = 1

    /**
     * Align text to the left. See `set_text_align()`.
     */
    public final const val ALIGN_LEFT: Long = 0

    /**
     * Align text to the right. See `set_text_align()`.
     */
    public final const val ALIGN_RIGHT: Long = 2

    /**
     * Cell contains a checkbox.
     */
    public final const val CELL_MODE_CHECK: Long = 1

    /**
     *
     */
    public final const val CELL_MODE_CUSTOM: Long = 4

    /**
     * Cell contains an icon.
     */
    public final const val CELL_MODE_ICON: Long = 3

    /**
     * Cell contains a range.
     */
    public final const val CELL_MODE_RANGE: Long = 2

    /**
     * Cell contains a string.
     */
    public final const val CELL_MODE_STRING: Long = 0
  }
}
