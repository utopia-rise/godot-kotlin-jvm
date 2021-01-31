// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.PoolIntArray
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_INT_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class ItemList : Control() {
  val itemActivated: Signal1<Long> by signal("index")

  val itemRmbSelected: Signal2<Long, Vector2> by signal("index", "at_position")

  val itemSelected: Signal1<Long> by signal("index")

  val multiSelected: Signal2<Long, Boolean> by signal("index", "selected")

  val nothingSelected: Signal0 by signal()

  val rmbClicked: Signal1<Vector2> by signal("at_position")

  open var allowReselect: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ALLOW_RESELECT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ALLOW_RESELECT, NIL)
    }

  open var allowRmbSelect: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ALLOW_RMB_SELECT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ALLOW_RMB_SELECT,
          NIL)
    }

  open var autoHeight: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_AUTO_HEIGHT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_AUTO_HEIGHT, NIL)
    }

  open var fixedColumnWidth: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_FIXED_COLUMN_WIDTH,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_FIXED_COLUMN_WIDTH,
          NIL)
    }

  open var fixedIconSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_FIXED_ICON_SIZE,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_FIXED_ICON_SIZE, NIL)
    }

  open var iconMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ICON_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ICON_MODE, NIL)
    }

  open var iconScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ICON_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ICON_SCALE, NIL)
    }

  open var maxColumns: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_MAX_COLUMNS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_MAX_COLUMNS, NIL)
    }

  open var maxTextLines: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_MAX_TEXT_LINES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_MAX_TEXT_LINES, NIL)
    }

  open var sameColumnWidth: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_SAME_COLUMN_WIDTH,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_SAME_COLUMN_WIDTH,
          NIL)
    }

  open var selectMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_SELECT_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_SELECT_MODE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_ITEMLIST)

  open fun fixedIconSize(schedule: Vector2.() -> Unit): Vector2 = fixedIconSize.apply{
      schedule(this)
      fixedIconSize = this
  }


  open fun _get_items(): VariantArray<Any?> {
    throw NotImplementedError("_get_items is not implemented for ItemList")
  }

  override fun _gui_input(event: InputEvent) {
  }

  open fun _scroll_changed(arg0: Double) {
  }

  open fun _set_items(arg0: VariantArray<Any?>) {
  }

  open fun addIconItem(icon: Texture, selectable: Boolean = true) {
    TransferContext.writeArguments(OBJECT to icon, BOOL to selectable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_ADD_ICON_ITEM, NIL)
  }

  open fun addItem(
    text: String,
    icon: Texture? = null,
    selectable: Boolean = true
  ) {
    TransferContext.writeArguments(STRING to text, OBJECT to icon, BOOL to selectable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_ADD_ITEM, NIL)
  }

  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_CLEAR, NIL)
  }

  open fun ensureCurrentIsVisible() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_ENSURE_CURRENT_IS_VISIBLE,
        NIL)
  }

  open fun getItemAtPosition(position: Vector2, exact: Boolean = false): Long {
    TransferContext.writeArguments(VECTOR2 to position, BOOL to exact)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_AT_POSITION, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getItemCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getItemCustomBgColor(idx: Long): Color {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_CUSTOM_BG_COLOR,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  open fun getItemCustomFgColor(idx: Long): Color {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_CUSTOM_FG_COLOR,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  open fun getItemIcon(idx: Long): Texture? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  open fun getItemIconModulate(idx: Long): Color {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_ICON_MODULATE,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  open fun getItemIconRegion(idx: Long): Rect2 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_ICON_REGION,
        RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  open fun getItemMetadata(idx: Long): Any? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_METADATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun getItemText(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getItemTooltip(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_TOOLTIP, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getSelectedItems(): PoolIntArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_SELECTED_ITEMS,
        POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  open fun getVScroll(): VScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_V_SCROLL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as VScrollBar?
  }

  open fun isAnythingSelected(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_ANYTHING_SELECTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isItemDisabled(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_ITEM_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isItemIconTransposed(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_ITEM_ICON_TRANSPOSED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isItemSelectable(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_ITEM_SELECTABLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isItemTooltipEnabled(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_ITEM_TOOLTIP_ENABLED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isSelected(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_SELECTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun moveItem(fromIdx: Long, toIdx: Long) {
    TransferContext.writeArguments(LONG to fromIdx, LONG to toIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_MOVE_ITEM, NIL)
  }

  open fun removeItem(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_REMOVE_ITEM, NIL)
  }

  open fun select(idx: Long, single: Boolean = true) {
    TransferContext.writeArguments(LONG to idx, BOOL to single)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SELECT, NIL)
  }

  open fun setItemCustomBgColor(idx: Long, customBgColor: Color) {
    TransferContext.writeArguments(LONG to idx, COLOR to customBgColor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_CUSTOM_BG_COLOR,
        NIL)
  }

  open fun setItemCustomFgColor(idx: Long, customFgColor: Color) {
    TransferContext.writeArguments(LONG to idx, COLOR to customFgColor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_CUSTOM_FG_COLOR,
        NIL)
  }

  open fun setItemDisabled(idx: Long, disabled: Boolean) {
    TransferContext.writeArguments(LONG to idx, BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_DISABLED, NIL)
  }

  open fun setItemIcon(idx: Long, icon: Texture) {
    TransferContext.writeArguments(LONG to idx, OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_ICON, NIL)
  }

  open fun setItemIconModulate(idx: Long, modulate: Color) {
    TransferContext.writeArguments(LONG to idx, COLOR to modulate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_ICON_MODULATE,
        NIL)
  }

  open fun setItemIconRegion(idx: Long, rect: Rect2) {
    TransferContext.writeArguments(LONG to idx, RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_ICON_REGION, NIL)
  }

  open fun setItemIconTransposed(idx: Long, transposed: Boolean) {
    TransferContext.writeArguments(LONG to idx, BOOL to transposed)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_ICON_TRANSPOSED,
        NIL)
  }

  open fun setItemMetadata(idx: Long, metadata: Any) {
    TransferContext.writeArguments(LONG to idx, ANY to metadata)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_METADATA, NIL)
  }

  open fun setItemSelectable(idx: Long, selectable: Boolean) {
    TransferContext.writeArguments(LONG to idx, BOOL to selectable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_SELECTABLE, NIL)
  }

  open fun setItemText(idx: Long, text: String) {
    TransferContext.writeArguments(LONG to idx, STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_TEXT, NIL)
  }

  open fun setItemTooltip(idx: Long, tooltip: String) {
    TransferContext.writeArguments(LONG to idx, STRING to tooltip)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_TOOLTIP, NIL)
  }

  open fun setItemTooltipEnabled(idx: Long, enable: Boolean) {
    TransferContext.writeArguments(LONG to idx, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_TOOLTIP_ENABLED,
        NIL)
  }

  open fun sortItemsByText() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SORT_ITEMS_BY_TEXT, NIL)
  }

  open fun unselect(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_UNSELECT, NIL)
  }

  open fun unselectAll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_UNSELECT_ALL, NIL)
  }

  enum class SelectMode(
    id: Long
  ) {
    SELECT_SINGLE(0),

    SELECT_MULTI(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class IconMode(
    id: Long
  ) {
    ICON_MODE_TOP(0),

    ICON_MODE_LEFT(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val ICON_MODE_LEFT: Long = 1

    final const val ICON_MODE_TOP: Long = 0

    final const val SELECT_MULTI: Long = 1

    final const val SELECT_SINGLE: Long = 0
  }
}
