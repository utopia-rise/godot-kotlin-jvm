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
import godot.core.TypeManager
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
import godot.util.VoidPtr
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
 * A single item of a [Tree] control. It can contain other [TreeItem]s as children, which allows it
 * to create a hierarchy. It can also contain text and buttons. [TreeItem] is not a [Node], it is
 * internal to the [Tree].
 * To create a [TreeItem], use [Tree.createItem] or [TreeItem.createChild]. To remove a [TreeItem],
 * use [Object.free].
 * **Note:** The ID values used for buttons are 32-bit, unlike [int] which is always 64-bit. They go
 * from `-2147483648` to `2147483647`.
 */
@GodotBaseType
public open class TreeItem internal constructor() : Object() {
  /**
   * If `true`, the TreeItem is collapsed.
   */
  public var collapsed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCollapsedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollapsedPtr, NIL)
    }

  /**
   * If `true`, the [TreeItem] is visible (default).
   * Note that if a [TreeItem] is set to not be visible, none of its children will be visible
   * either.
   */
  public var visible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVisiblePtr, NIL)
    }

  /**
   * If `true`, folding is disabled for this TreeItem.
   */
  public var disableFolding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFoldingDisabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDisableFoldingPtr, NIL)
    }

  /**
   * The custom minimum height.
   */
  public var customMinimumHeight: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCustomMinimumHeightPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCustomMinimumHeightPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TREEITEM, scriptIndex)
    return true
  }

  /**
   * Sets the given column's cell mode to [mode]. See [TreeCellMode] constants.
   */
  public fun setCellMode(column: Int, mode: TreeCellMode): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setCellModePtr, NIL)
  }

  /**
   * Returns the column's cell mode.
   */
  public fun getCellMode(column: Int): TreeCellMode {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCellModePtr, LONG)
    return TreeItem.TreeCellMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If [multiline] is `true`, the given [column] is multiline editable.
   * **Note:** This option only affects the type of control ([LineEdit] or [TextEdit]) that appears
   * when editing the column. You can set multiline values with [setText] even if the column is not
   * multiline editable.
   */
  public fun setEditMultiline(column: Int, multiline: Boolean): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to multiline)
    TransferContext.callMethod(rawPtr, MethodBindings.setEditMultilinePtr, NIL)
  }

  /**
   * Returns `true` if the given [column] is multiline editable.
   */
  public fun isEditMultiline(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isEditMultilinePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * If [checked] is `true`, the given [column] is checked. Clears column's indeterminate status.
   */
  public fun setChecked(column: Int, checked: Boolean): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to checked)
    TransferContext.callMethod(rawPtr, MethodBindings.setCheckedPtr, NIL)
  }

  /**
   * If [indeterminate] is `true`, the given [column] is marked indeterminate.
   * **Note:** If set `true` from `false`, then column is cleared of checked status.
   */
  public fun setIndeterminate(column: Int, indeterminate: Boolean): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to indeterminate)
    TransferContext.callMethod(rawPtr, MethodBindings.setIndeterminatePtr, NIL)
  }

  /**
   * Returns `true` if the given [column] is checked.
   */
  public fun isChecked(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isCheckedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the given [column] is indeterminate.
   */
  public fun isIndeterminate(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isIndeterminatePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Propagates this item's checked status to its children and parents for the given [column]. It is
   * possible to process the items affected by this method call by connecting to [signal
   * Tree.check_propagated_to_item]. The order that the items affected will be processed is as follows:
   * the item invoking this method, children of that item, and finally parents of that item. If
   * [emitSignal] is `false`, then [signal Tree.check_propagated_to_item] will not be emitted.
   */
  @JvmOverloads
  public fun propagateCheck(column: Int, emitSignal: Boolean = true): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to emitSignal)
    TransferContext.callMethod(rawPtr, MethodBindings.propagateCheckPtr, NIL)
  }

  /**
   * Sets the given column's text value.
   */
  public fun setText(column: Int, text: String): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextPtr, NIL)
  }

  /**
   * Returns the given column's text.
   */
  public fun getText(column: Int): String {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets item's text base writing direction.
   */
  public fun setTextDirection(column: Int, direction: Control.TextDirection): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to direction.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextDirectionPtr, NIL)
  }

  /**
   * Returns item's text base writing direction.
   */
  public fun getTextDirection(column: Int): Control.TextDirection {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTextDirectionPtr, LONG)
    return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the autowrap mode in the given [column]. If set to something other than
   * [TextServer.AUTOWRAPOFF], the text gets wrapped inside the cell's bounding rectangle.
   */
  public fun setAutowrapMode(column: Int, autowrapMode: TextServer.AutowrapMode): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to autowrapMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setAutowrapModePtr, NIL)
  }

  /**
   * Returns the text autowrap mode in the given [column]. By default it is
   * [TextServer.AUTOWRAPOFF].
   */
  public fun getAutowrapMode(column: Int): TextServer.AutowrapMode {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getAutowrapModePtr, LONG)
    return TextServer.AutowrapMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the clipping behavior when the text exceeds the item's bounding rectangle in the given
   * [column].
   */
  public fun setTextOverrunBehavior(column: Int, overrunBehavior: TextServer.OverrunBehavior):
      Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to overrunBehavior.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextOverrunBehaviorPtr, NIL)
  }

  /**
   * Returns the clipping behavior when the text exceeds the item's bounding rectangle in the given
   * [column]. By default it is [TextServer.OVERRUNTRIMELLIPSIS].
   */
  public fun getTextOverrunBehavior(column: Int): TextServer.OverrunBehavior {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTextOverrunBehaviorPtr, LONG)
    return TextServer.OverrunBehavior.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setStructuredTextBidiOverride(column: Int, parser: TextServer.StructuredTextParser):
      Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to parser.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverridePtr, NIL)
  }

  public fun getStructuredTextBidiOverride(column: Int): TextServer.StructuredTextParser {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverridePtr, LONG)
    return TextServer.StructuredTextParser.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setStructuredTextBidiOverrideOptions(column: Int, args: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), ARRAY to args)
    TransferContext.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverrideOptionsPtr, NIL)
  }

  public fun getStructuredTextBidiOverrideOptions(column: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverrideOptionsPtr,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Sets language code of item's text used for line-breaking and text shaping algorithms, if left
   * empty current locale is used instead.
   */
  public fun setLanguage(column: Int, language: String): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.setLanguagePtr, NIL)
  }

  /**
   * Returns item's text language code.
   */
  public fun getLanguage(column: Int): String {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets a string to be shown after a column's value (for example, a unit abbreviation).
   */
  public fun setSuffix(column: Int, text: String): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.setSuffixPtr, NIL)
  }

  /**
   * Gets the suffix string shown after the column value.
   */
  public fun getSuffix(column: Int): String {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSuffixPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets the given column's icon [Texture2D].
   */
  public fun setIcon(column: Int, texture: Texture2D): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setIconPtr, NIL)
  }

  /**
   * Returns the given column's icon [Texture2D]. Error if no icon is set.
   */
  public fun getIcon(column: Int): Texture2D? {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  /**
   * Sets the given column's icon's texture region.
   */
  public fun setIconRegion(column: Int, region: Rect2): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), RECT2 to region)
    TransferContext.callMethod(rawPtr, MethodBindings.setIconRegionPtr, NIL)
  }

  /**
   * Returns the icon [Texture2D] region as [Rect2].
   */
  public fun getIconRegion(column: Int): Rect2 {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getIconRegionPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Sets the maximum allowed width of the icon in the given [column]. This limit is applied on top
   * of the default size of the icon and on top of [theme_item Tree.icon_max_width]. The height is
   * adjusted according to the icon's ratio.
   */
  public fun setIconMaxWidth(column: Int, width: Int): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to width.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setIconMaxWidthPtr, NIL)
  }

  /**
   * Returns the maximum allowed width of the icon in the given [column].
   */
  public fun getIconMaxWidth(column: Int): Int {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getIconMaxWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Modulates the given column's icon with [modulate].
   */
  public fun setIconModulate(column: Int, modulate: Color): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.setIconModulatePtr, NIL)
  }

  /**
   * Returns the [Color] modulating the column's icon.
   */
  public fun getIconModulate(column: Int): Color {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getIconModulatePtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Sets the value of a [CELLMODERANGE] column.
   */
  public fun setRange(column: Int, `value`: Double): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), DOUBLE to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setRangePtr, NIL)
  }

  /**
   * Returns the value of a [CELLMODERANGE] column.
   */
  public fun getRange(column: Int): Double {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getRangePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Sets the range of accepted values for a column. The column must be in the [CELLMODERANGE] mode.
   * If [expr] is `true`, the edit mode slider will use an exponential scale as with
   * [Range.expEdit].
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
    TransferContext.callMethod(rawPtr, MethodBindings.setRangeConfigPtr, NIL)
  }

  /**
   * Returns a dictionary containing the range parameters for a given column. The keys are "min",
   * "max", "step", and "expr".
   */
  public fun getRangeConfig(column: Int): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getRangeConfigPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Sets the metadata value for the given column, which can be retrieved later using [getMetadata].
   * This can be used, for example, to store a reference to the original data.
   */
  public fun setMetadata(column: Int, meta: Any?): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), ANY to meta)
    TransferContext.callMethod(rawPtr, MethodBindings.setMetadataPtr, NIL)
  }

  /**
   * Returns the metadata value that was set for the given column using [setMetadata].
   */
  public fun getMetadata(column: Int): Any? {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getMetadataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Sets the given column's custom draw callback to [callback] method on [object].
   * The [callback] should accept two arguments: the [TreeItem] that is drawn and its position and
   * size as a [Rect2].
   */
  public fun setCustomDraw(
    column: Int,
    _object: Object,
    callback: StringName,
  ): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), OBJECT to _object, STRING_NAME to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomDrawPtr, NIL)
  }

  /**
   * Collapses or uncollapses this [TreeItem] and all the descendants of this item.
   */
  public fun setCollapsedRecursive(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setCollapsedRecursivePtr, NIL)
  }

  /**
   * Returns `true` if this [TreeItem], or any of its descendants, is collapsed.
   * If [onlyVisible] is `true` it ignores non-visible [TreeItem]s.
   */
  @JvmOverloads
  public fun isAnyCollapsed(onlyVisible: Boolean = false): Boolean {
    TransferContext.writeArguments(BOOL to onlyVisible)
    TransferContext.callMethod(rawPtr, MethodBindings.isAnyCollapsedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun uncollapseTree(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.uncollapseTreePtr, NIL)
  }

  /**
   * If [selectable] is `true`, the given [column] is selectable.
   */
  public fun setSelectable(column: Int, selectable: Boolean): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to selectable)
    TransferContext.callMethod(rawPtr, MethodBindings.setSelectablePtr, NIL)
  }

  /**
   * Returns `true` if the given [column] is selectable.
   */
  public fun isSelectable(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isSelectablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the given [column] is selected.
   */
  public fun isSelected(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isSelectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Selects the given [column].
   */
  public fun select(column: Int): Unit {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.selectPtr, NIL)
  }

  /**
   * Deselects the given column.
   */
  public fun deselect(column: Int): Unit {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.deselectPtr, NIL)
  }

  /**
   * If [enabled] is `true`, the given [column] is editable.
   */
  public fun setEditable(column: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setEditablePtr, NIL)
  }

  /**
   * Returns `true` if the given [column] is editable.
   */
  public fun isEditable(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isEditablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the given column's custom color.
   */
  public fun setCustomColor(column: Int, color: Color): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomColorPtr, NIL)
  }

  /**
   * Returns the custom color of column [column].
   */
  public fun getCustomColor(column: Int): Color {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Resets the color for the given column to default.
   */
  public fun clearCustomColor(column: Int): Unit {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.clearCustomColorPtr, NIL)
  }

  /**
   * Sets custom font used to draw text in the given [column].
   */
  public fun setCustomFont(column: Int, font: Font): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), OBJECT to font)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomFontPtr, NIL)
  }

  /**
   * Returns custom font used to draw text in the column [column].
   */
  public fun getCustomFont(column: Int): Font? {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomFontPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Font?)
  }

  /**
   * Sets custom font size used to draw text in the given [column].
   */
  public fun setCustomFontSize(column: Int, fontSize: Int): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomFontSizePtr, NIL)
  }

  /**
   * Returns custom font size used to draw text in the column [column].
   */
  public fun getCustomFontSize(column: Int): Int {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomFontSizePtr, LONG)
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
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomBgColorPtr, NIL)
  }

  /**
   * Resets the background color for the given column to default.
   */
  public fun clearCustomBgColor(column: Int): Unit {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.clearCustomBgColorPtr, NIL)
  }

  /**
   * Returns the custom background color of column [column].
   */
  public fun getCustomBgColor(column: Int): Color {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomBgColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  public fun setCustomAsButton(column: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomAsButtonPtr, NIL)
  }

  public fun isCustomSetAsButton(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isCustomSetAsButtonPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds a button with [Texture2D] [button] at column [column]. The [id] is used to identify the
   * button in the according [signal Tree.button_clicked] signal and can be different from the buttons
   * index. If not specified, the next available index is used, which may be retrieved by calling
   * [getButtonCount] immediately before this method. Optionally, the button can be [disabled] and have
   * a [tooltipText].
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
    TransferContext.callMethod(rawPtr, MethodBindings.addButtonPtr, NIL)
  }

  /**
   * Returns the number of buttons in column [column].
   */
  public fun getButtonCount(column: Int): Int {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getButtonCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the tooltip text for the button at index [buttonIndex] in column [column].
   */
  public fun getButtonTooltipText(column: Int, buttonIndex: Int): String {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to buttonIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getButtonTooltipTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the ID for the button at index [buttonIndex] in column [column].
   */
  public fun getButtonId(column: Int, buttonIndex: Int): Int {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to buttonIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getButtonIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the button index if there is a button with ID [id] in column [column], otherwise
   * returns -1.
   */
  public fun getButtonById(column: Int, id: Int): Int {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getButtonByIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the [Texture2D] of the button at index [buttonIndex] in column [column].
   */
  public fun getButton(column: Int, buttonIndex: Int): Texture2D? {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to buttonIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getButtonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  /**
   * Sets the tooltip text for the button at index [buttonIndex] in the given [column].
   */
  public fun setButtonTooltipText(
    column: Int,
    buttonIndex: Int,
    tooltip: String,
  ): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to buttonIndex.toLong(), STRING to tooltip)
    TransferContext.callMethod(rawPtr, MethodBindings.setButtonTooltipTextPtr, NIL)
  }

  /**
   * Sets the given column's button [Texture2D] at index [buttonIndex] to [button].
   */
  public fun setButton(
    column: Int,
    buttonIndex: Int,
    button: Texture2D,
  ): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to buttonIndex.toLong(), OBJECT to button)
    TransferContext.callMethod(rawPtr, MethodBindings.setButtonPtr, NIL)
  }

  /**
   * Removes the button at index [buttonIndex] in column [column].
   */
  public fun eraseButton(column: Int, buttonIndex: Int): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to buttonIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.eraseButtonPtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.setButtonDisabledPtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.setButtonColorPtr, NIL)
  }

  /**
   * Returns `true` if the button at index [buttonIndex] for the given [column] is disabled.
   */
  public fun isButtonDisabled(column: Int, buttonIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to buttonIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isButtonDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the given column's tooltip text.
   */
  public fun setTooltipText(column: Int, tooltip: String): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), STRING to tooltip)
    TransferContext.callMethod(rawPtr, MethodBindings.setTooltipTextPtr, NIL)
  }

  /**
   * Returns the given column's tooltip text.
   */
  public fun getTooltipText(column: Int): String {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTooltipTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets the given column's text alignment. See [HorizontalAlignment] for possible values.
   */
  public fun setTextAlignment(column: Int, textAlignment: HorizontalAlignment): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to textAlignment.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextAlignmentPtr, NIL)
  }

  /**
   * Returns the given column's text alignment.
   */
  public fun getTextAlignment(column: Int): HorizontalAlignment {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTextAlignmentPtr, LONG)
    return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If [enable] is `true`, the given [column] is expanded to the right.
   */
  public fun setExpandRight(column: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setExpandRightPtr, NIL)
  }

  /**
   * Returns `true` if `expand_right` is set.
   */
  public fun getExpandRight(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getExpandRightPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Creates an item and adds it as a child.
   * The new item will be inserted as position [index] (the default value `-1` means the last
   * position), or it will be the last child if [index] is higher than the child count.
   */
  @JvmOverloads
  public fun createChild(index: Int = -1): TreeItem? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.createChildPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Adds a previously unparented [TreeItem] as a direct child of this one. The [child] item must
   * not be a part of any [Tree] or parented to any [TreeItem]. See also [removeChild].
   */
  public fun addChild(child: TreeItem): Unit {
    TransferContext.writeArguments(OBJECT to child)
    TransferContext.callMethod(rawPtr, MethodBindings.addChildPtr, NIL)
  }

  /**
   * Removes the given child [TreeItem] and all its children from the [Tree]. Note that it doesn't
   * free the item from memory, so it can be reused later (see [addChild]). To completely remove a
   * [TreeItem] use [Object.free].
   * **Note:** If you want to move a child from one [Tree] to another, then instead of removing and
   * adding it manually you can use [moveBefore] or [moveAfter].
   */
  public fun removeChild(child: TreeItem): Unit {
    TransferContext.writeArguments(OBJECT to child)
    TransferContext.callMethod(rawPtr, MethodBindings.removeChildPtr, NIL)
  }

  /**
   * Returns the [Tree] that owns this TreeItem.
   */
  public fun getTree(): Tree? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTreePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tree?)
  }

  /**
   * Returns the next sibling TreeItem in the tree or a null object if there is none.
   */
  public fun getNext(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNextPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Returns the previous sibling TreeItem in the tree or a null object if there is none.
   */
  public fun getPrev(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPrevPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Returns the parent TreeItem or a null object if there is none.
   */
  public fun getParent(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParentPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Returns the TreeItem's first child.
   */
  public fun getFirstChild(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFirstChildPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Returns the next TreeItem in the tree (in the context of a depth-first search) or a `null`
   * object if there is none.
   * If [wrap] is enabled, the method will wrap around to the first element in the tree when called
   * on the last element, otherwise it returns `null`.
   */
  @JvmOverloads
  public fun getNextInTree(wrap: Boolean = false): TreeItem? {
    TransferContext.writeArguments(BOOL to wrap)
    TransferContext.callMethod(rawPtr, MethodBindings.getNextInTreePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Returns the previous TreeItem in the tree (in the context of a depth-first search) or a `null`
   * object if there is none.
   * If [wrap] is enabled, the method will wrap around to the last element in the tree when called
   * on the first visible element, otherwise it returns `null`.
   */
  @JvmOverloads
  public fun getPrevInTree(wrap: Boolean = false): TreeItem? {
    TransferContext.writeArguments(BOOL to wrap)
    TransferContext.callMethod(rawPtr, MethodBindings.getPrevInTreePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Returns the next visible TreeItem in the tree (in the context of a depth-first search) or a
   * `null` object if there is none.
   * If [wrap] is enabled, the method will wrap around to the first visible element in the tree when
   * called on the last visible element, otherwise it returns `null`.
   */
  @JvmOverloads
  public fun getNextVisible(wrap: Boolean = false): TreeItem? {
    TransferContext.writeArguments(BOOL to wrap)
    TransferContext.callMethod(rawPtr, MethodBindings.getNextVisiblePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Returns the previous visible sibling TreeItem in the tree (in the context of a depth-first
   * search) or a `null` object if there is none.
   * If [wrap] is enabled, the method will wrap around to the last visible element in the tree when
   * called on the first visible element, otherwise it returns `null`.
   */
  @JvmOverloads
  public fun getPrevVisible(wrap: Boolean = false): TreeItem? {
    TransferContext.writeArguments(BOOL to wrap)
    TransferContext.callMethod(rawPtr, MethodBindings.getPrevVisiblePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Returns a child item by its [index] (see [getChildCount]). This method is often used for
   * iterating all children of an item.
   * Negative indices access the children from the last one.
   */
  public fun getChild(index: Int): TreeItem? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getChildPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Returns the number of child items.
   */
  public fun getChildCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getChildCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns an array of references to the item's children.
   */
  public fun getChildren(): VariantArray<TreeItem> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getChildrenPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<TreeItem>)
  }

  /**
   * Returns the node's order in the tree. For example, if called on the first child item the
   * position is `0`.
   */
  public fun getIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Moves this TreeItem right before the given [item].
   * **Note:** You can't move to the root or move the root.
   */
  public fun moveBefore(item: TreeItem): Unit {
    TransferContext.writeArguments(OBJECT to item)
    TransferContext.callMethod(rawPtr, MethodBindings.moveBeforePtr, NIL)
  }

  /**
   * Moves this TreeItem right after the given [item].
   * **Note:** You can't move to the root or move the root.
   */
  public fun moveAfter(item: TreeItem): Unit {
    TransferContext.writeArguments(OBJECT to item)
    TransferContext.callMethod(rawPtr, MethodBindings.moveAfterPtr, NIL)
  }

  /**
   * Calls the [method] on the actual TreeItem and its children recursively. Pass parameters as a
   * comma separated list.
   */
  public fun callRecursive(method: StringName, vararg __var_args: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, MethodBindings.callRecursivePtr, NIL)
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

  internal object MethodBindings {
    public val setCellModePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_cell_mode")

    public val getCellModePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_cell_mode")

    public val setEditMultilinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_edit_multiline")

    public val isEditMultilinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "is_edit_multiline")

    public val setCheckedPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_checked")

    public val setIndeterminatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_indeterminate")

    public val isCheckedPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "is_checked")

    public val isIndeterminatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "is_indeterminate")

    public val propagateCheckPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "propagate_check")

    public val setTextPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_text")

    public val getTextPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_text")

    public val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_text_direction")

    public val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_text_direction")

    public val setAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_autowrap_mode")

    public val getAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_autowrap_mode")

    public val setTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_text_overrun_behavior")

    public val getTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_text_overrun_behavior")

    public val setStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_structured_text_bidi_override")

    public val getStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_structured_text_bidi_override")

    public val setStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_structured_text_bidi_override_options")

    public val getStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_structured_text_bidi_override_options")

    public val setLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_language")

    public val getLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_language")

    public val setSuffixPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_suffix")

    public val getSuffixPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_suffix")

    public val setIconPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_icon")

    public val getIconPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_icon")

    public val setIconRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_icon_region")

    public val getIconRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_icon_region")

    public val setIconMaxWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_icon_max_width")

    public val getIconMaxWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_icon_max_width")

    public val setIconModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_icon_modulate")

    public val getIconModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_icon_modulate")

    public val setRangePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_range")

    public val getRangePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_range")

    public val setRangeConfigPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_range_config")

    public val getRangeConfigPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_range_config")

    public val setMetadataPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_metadata")

    public val getMetadataPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_metadata")

    public val setCustomDrawPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_custom_draw")

    public val setCollapsedPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_collapsed")

    public val isCollapsedPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "is_collapsed")

    public val setCollapsedRecursivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_collapsed_recursive")

    public val isAnyCollapsedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "is_any_collapsed")

    public val setVisiblePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_visible")

    public val isVisiblePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "is_visible")

    public val uncollapseTreePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "uncollapse_tree")

    public val setCustomMinimumHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_custom_minimum_height")

    public val getCustomMinimumHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_custom_minimum_height")

    public val setSelectablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_selectable")

    public val isSelectablePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "is_selectable")

    public val isSelectedPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "is_selected")

    public val selectPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "select")

    public val deselectPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "deselect")

    public val setEditablePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_editable")

    public val isEditablePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "is_editable")

    public val setCustomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_custom_color")

    public val getCustomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_custom_color")

    public val clearCustomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "clear_custom_color")

    public val setCustomFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_custom_font")

    public val getCustomFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_custom_font")

    public val setCustomFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_custom_font_size")

    public val getCustomFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_custom_font_size")

    public val setCustomBgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_custom_bg_color")

    public val clearCustomBgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "clear_custom_bg_color")

    public val getCustomBgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_custom_bg_color")

    public val setCustomAsButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_custom_as_button")

    public val isCustomSetAsButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "is_custom_set_as_button")

    public val addButtonPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "add_button")

    public val getButtonCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_button_count")

    public val getButtonTooltipTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_button_tooltip_text")

    public val getButtonIdPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_button_id")

    public val getButtonByIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_button_by_id")

    public val getButtonPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_button")

    public val setButtonTooltipTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_button_tooltip_text")

    public val setButtonPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "set_button")

    public val eraseButtonPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "erase_button")

    public val setButtonDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_button_disabled")

    public val setButtonColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_button_color")

    public val isButtonDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "is_button_disabled")

    public val setTooltipTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_tooltip_text")

    public val getTooltipTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_tooltip_text")

    public val setTextAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_text_alignment")

    public val getTextAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_text_alignment")

    public val setExpandRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_expand_right")

    public val getExpandRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_expand_right")

    public val setDisableFoldingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "set_disable_folding")

    public val isFoldingDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "is_folding_disabled")

    public val createChildPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "create_child")

    public val addChildPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "add_child")

    public val removeChildPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "remove_child")

    public val getTreePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_tree")

    public val getNextPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_next")

    public val getPrevPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_prev")

    public val getParentPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_parent")

    public val getFirstChildPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_first_child")

    public val getNextInTreePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_next_in_tree")

    public val getPrevInTreePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_prev_in_tree")

    public val getNextVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_next_visible")

    public val getPrevVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_prev_visible")

    public val getChildPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_child")

    public val getChildCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "get_child_count")

    public val getChildrenPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_children")

    public val getIndexPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "get_index")

    public val moveBeforePtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "move_before")

    public val moveAfterPtr: VoidPtr = TypeManager.getMethodBindPtr("TreeItem", "move_after")

    public val callRecursivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TreeItem", "call_recursive")
  }
}
