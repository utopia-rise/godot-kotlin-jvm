// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.TreeItem
import godot.annotation.GodotBaseType
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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class TreeItem : Object() {
  open var collapsed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_COLLAPSED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_COLLAPSED, NIL)
    }

  open var customMinimumHeight: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CUSTOM_MINIMUM_HEIGHT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_MINIMUM_HEIGHT, NIL)
    }

  open var disableFolding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_DISABLE_FOLDING,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_DISABLE_FOLDING, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_TREEITEM)

  open fun addButton(
    column: Long,
    button: Texture,
    buttonIdx: Long = -1,
    disabled: Boolean = false,
    tooltip: String = ""
  ) {
    TransferContext.writeArguments(LONG to column, OBJECT to button, LONG to buttonIdx, BOOL to
        disabled, STRING to tooltip)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_ADD_BUTTON, NIL)
  }

  open fun callRecursive(method: String, vararg __var_args: Any?): Any? {
    TransferContext.writeArguments(STRING to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_CALL_RECURSIVE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun clearCustomBgColor(column: Long) {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_CLEAR_CUSTOM_BG_COLOR, NIL)
  }

  open fun clearCustomColor(column: Long) {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_CLEAR_CUSTOM_COLOR, NIL)
  }

  open fun deselect(column: Long) {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_DESELECT, NIL)
  }

  open fun eraseButton(column: Long, buttonIdx: Long) {
    TransferContext.writeArguments(LONG to column, LONG to buttonIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_ERASE_BUTTON, NIL)
  }

  open fun getButton(column: Long, buttonIdx: Long): Texture? {
    TransferContext.writeArguments(LONG to column, LONG to buttonIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_BUTTON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  open fun getButtonCount(column: Long): Long {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_BUTTON_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getButtonTooltip(column: Long, buttonIdx: Long): String {
    TransferContext.writeArguments(LONG to column, LONG to buttonIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_BUTTON_TOOLTIP, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getCellMode(column: Long): TreeItem.TreeCellMode {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CELL_MODE, LONG)
    return TreeItem.TreeCellMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun getChildren(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CHILDREN, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  open fun getCustomBgColor(column: Long): Color {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CUSTOM_BG_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  open fun getCustomColor(column: Long): Color {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_CUSTOM_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  open fun getExpandRight(column: Long): Boolean {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_EXPAND_RIGHT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun getIcon(column: Long): Texture? {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  open fun getIconMaxWidth(column: Long): Long {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_ICON_MAX_WIDTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getIconModulate(column: Long): Color {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_ICON_MODULATE, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  open fun getIconRegion(column: Long): Rect2 {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_ICON_REGION, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  open fun getMetadata(column: Long): Any? {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_METADATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun getNext(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_NEXT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  open fun getNextVisible(wrap: Boolean = false): TreeItem? {
    TransferContext.writeArguments(BOOL to wrap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_NEXT_VISIBLE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  open fun getParent(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_PARENT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  open fun getPrev(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_PREV, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  open fun getPrevVisible(wrap: Boolean = false): TreeItem? {
    TransferContext.writeArguments(BOOL to wrap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_PREV_VISIBLE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  open fun getRange(column: Long): Double {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_RANGE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun getRangeConfig(column: Long): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_RANGE_CONFIG,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  open fun getSuffix(column: Long): String {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_SUFFIX, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getText(column: Long): String {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getTextAlign(column: Long): TreeItem.TextAlign {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_TEXT_ALIGN, LONG)
    return TreeItem.TextAlign.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun getTooltip(column: Long): String {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_GET_TOOLTIP, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun isButtonDisabled(column: Long, buttonIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to column, LONG to buttonIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_BUTTON_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isChecked(column: Long): Boolean {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_CHECKED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isCustomSetAsButton(column: Long): Boolean {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_CUSTOM_SET_AS_BUTTON,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isEditable(column: Long): Boolean {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_EDITABLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isSelectable(column: Long): Boolean {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_SELECTABLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isSelected(column: Long): Boolean {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_IS_SELECTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun moveToBottom() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_MOVE_TO_BOTTOM, NIL)
  }

  open fun moveToTop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_MOVE_TO_TOP, NIL)
  }

  open fun removeChild(child: Object) {
    TransferContext.writeArguments(OBJECT to child)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_REMOVE_CHILD, NIL)
  }

  open fun select(column: Long) {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SELECT, NIL)
  }

  open fun setButton(
    column: Long,
    buttonIdx: Long,
    button: Texture
  ) {
    TransferContext.writeArguments(LONG to column, LONG to buttonIdx, OBJECT to button)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_BUTTON, NIL)
  }

  open fun setButtonDisabled(
    column: Long,
    buttonIdx: Long,
    disabled: Boolean
  ) {
    TransferContext.writeArguments(LONG to column, LONG to buttonIdx, BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_BUTTON_DISABLED, NIL)
  }

  open fun setCellMode(column: Long, mode: Long) {
    TransferContext.writeArguments(LONG to column, LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CELL_MODE, NIL)
  }

  open fun setChecked(column: Long, checked: Boolean) {
    TransferContext.writeArguments(LONG to column, BOOL to checked)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CHECKED, NIL)
  }

  open fun setCustomAsButton(column: Long, enable: Boolean) {
    TransferContext.writeArguments(LONG to column, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_AS_BUTTON, NIL)
  }

  open fun setCustomBgColor(
    column: Long,
    color: Color,
    justOutline: Boolean = false
  ) {
    TransferContext.writeArguments(LONG to column, COLOR to color, BOOL to justOutline)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_BG_COLOR, NIL)
  }

  open fun setCustomColor(column: Long, color: Color) {
    TransferContext.writeArguments(LONG to column, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_COLOR, NIL)
  }

  open fun setCustomDraw(
    column: Long,
    _object: Object,
    callback: String
  ) {
    TransferContext.writeArguments(LONG to column, OBJECT to _object, STRING to callback)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_CUSTOM_DRAW, NIL)
  }

  open fun setEditable(column: Long, enabled: Boolean) {
    TransferContext.writeArguments(LONG to column, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_EDITABLE, NIL)
  }

  open fun setExpandRight(column: Long, enable: Boolean) {
    TransferContext.writeArguments(LONG to column, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_EXPAND_RIGHT, NIL)
  }

  open fun setIcon(column: Long, texture: Texture) {
    TransferContext.writeArguments(LONG to column, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_ICON, NIL)
  }

  open fun setIconMaxWidth(column: Long, width: Long) {
    TransferContext.writeArguments(LONG to column, LONG to width)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_ICON_MAX_WIDTH, NIL)
  }

  open fun setIconModulate(column: Long, modulate: Color) {
    TransferContext.writeArguments(LONG to column, COLOR to modulate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_ICON_MODULATE, NIL)
  }

  open fun setIconRegion(column: Long, region: Rect2) {
    TransferContext.writeArguments(LONG to column, RECT2 to region)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_ICON_REGION, NIL)
  }

  open fun setMetadata(column: Long, meta: Any) {
    TransferContext.writeArguments(LONG to column, ANY to meta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_METADATA, NIL)
  }

  open fun setRange(column: Long, value: Double) {
    TransferContext.writeArguments(LONG to column, DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_RANGE, NIL)
  }

  open fun setRangeConfig(
    column: Long,
    min: Double,
    max: Double,
    step: Double,
    expr: Boolean = false
  ) {
    TransferContext.writeArguments(LONG to column, DOUBLE to min, DOUBLE to max, DOUBLE to step,
        BOOL to expr)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_RANGE_CONFIG, NIL)
  }

  open fun setSelectable(column: Long, selectable: Boolean) {
    TransferContext.writeArguments(LONG to column, BOOL to selectable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_SELECTABLE, NIL)
  }

  open fun setSuffix(column: Long, text: String) {
    TransferContext.writeArguments(LONG to column, STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_SUFFIX, NIL)
  }

  open fun setText(column: Long, text: String) {
    TransferContext.writeArguments(LONG to column, STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_TEXT, NIL)
  }

  open fun setTextAlign(column: Long, textAlign: Long) {
    TransferContext.writeArguments(LONG to column, LONG to textAlign)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_TEXT_ALIGN, NIL)
  }

  open fun setTooltip(column: Long, tooltip: String) {
    TransferContext.writeArguments(LONG to column, STRING to tooltip)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREEITEM_SET_TOOLTIP, NIL)
  }

  enum class TreeCellMode(
    id: Long
  ) {
    CELL_MODE_STRING(0),

    CELL_MODE_CHECK(1),

    CELL_MODE_RANGE(2),

    CELL_MODE_ICON(3),

    CELL_MODE_CUSTOM(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class TextAlign(
    id: Long
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val ALIGN_CENTER: Long = 1

    final const val ALIGN_LEFT: Long = 0

    final const val ALIGN_RIGHT: Long = 2

    final const val CELL_MODE_CHECK: Long = 1

    final const val CELL_MODE_CUSTOM: Long = 4

    final const val CELL_MODE_ICON: Long = 3

    final const val CELL_MODE_RANGE: Long = 2

    final const val CELL_MODE_STRING: Long = 0
  }
}
