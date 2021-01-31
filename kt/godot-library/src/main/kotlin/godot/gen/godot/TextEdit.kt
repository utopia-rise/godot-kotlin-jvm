// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.PoolIntArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_INT_ARRAY
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.Signal3
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class TextEdit : Control() {
  val breakpointToggled: Signal1<Long> by signal("row")

  val cursorChanged: Signal0 by signal()

  val infoClicked: Signal2<Long, String> by signal("row", "info")

  val requestCompletion: Signal0 by signal()

  val symbolLookup: Signal3<String, Long, Long> by signal("symbol", "row", "column")

  val textChanged: Signal0 by signal()

  open var breakpointGutter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_BREAKPOINT_GUTTER,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_BREAKPOINT_GUTTER,
          NIL)
    }

  open var caretBlink: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_CARET_BLINK, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_CARET_BLINK, NIL)
    }

  open var caretBlinkSpeed: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_CARET_BLINK_SPEED,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_CARET_BLINK_SPEED,
          NIL)
    }

  open var caretBlockMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_CARET_BLOCK_MODE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_CARET_BLOCK_MODE,
          NIL)
    }

  open var caretMovingByRightClick: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_CARET_MOVING_BY_RIGHT_CLICK, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_CARET_MOVING_BY_RIGHT_CLICK, NIL)
    }

  open var contextMenuEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_CONTEXT_MENU_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_CONTEXT_MENU_ENABLED,
          NIL)
    }

  open var drawSpaces: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_DRAW_SPACES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_DRAW_SPACES, NIL)
    }

  open var drawTabs: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_DRAW_TABS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_DRAW_TABS, NIL)
    }

  open var foldGutter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_FOLD_GUTTER, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_FOLD_GUTTER, NIL)
    }

  open var hidingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_HIDING_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_HIDING_ENABLED, NIL)
    }

  open var highlightAllOccurrences: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_HIGHLIGHT_ALL_OCCURRENCES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_HIGHLIGHT_ALL_OCCURRENCES, NIL)
    }

  open var highlightCurrentLine: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_HIGHLIGHT_CURRENT_LINE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_HIGHLIGHT_CURRENT_LINE, NIL)
    }

  open var minimapDraw: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_MINIMAP_DRAW, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_MINIMAP_DRAW, NIL)
    }

  open var minimapWidth: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_MINIMAP_WIDTH, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_MINIMAP_WIDTH, NIL)
    }

  open var overrideSelectedFontColor: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_OVERRIDE_SELECTED_FONT_COLOR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_OVERRIDE_SELECTED_FONT_COLOR, NIL)
    }

  open var readonly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_READONLY, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_READONLY, NIL)
    }

  open var scrollHorizontal: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SCROLL_HORIZONTAL,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SCROLL_HORIZONTAL,
          NIL)
    }

  open var scrollVertical: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SCROLL_VERTICAL,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SCROLL_VERTICAL, NIL)
    }

  open var selectingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTING_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SELECTING_ENABLED,
          NIL)
    }

  open var shortcutKeysEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SHORTCUT_KEYS_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SHORTCUT_KEYS_ENABLED, NIL)
    }

  open var showLineNumbers: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SHOW_LINE_NUMBERS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SHOW_LINE_NUMBERS,
          NIL)
    }

  open var smoothScrolling: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SMOOTH_SCROLLING,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SMOOTH_SCROLLING,
          NIL)
    }

  open var syntaxHighlighting: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SYNTAX_HIGHLIGHTING,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SYNTAX_HIGHLIGHTING,
          NIL)
    }

  open var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_TEXT, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_TEXT, NIL)
    }

  open var vScrollSpeed: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_V_SCROLL_SPEED,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_V_SCROLL_SPEED, NIL)
    }

  open var wrapEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_WRAP_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_WRAP_ENABLED, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_TEXTEDIT)

  open fun _click_selection_held() {
  }

  open fun _cursor_changed_emit() {
  }

  override fun _gui_input(event: InputEvent) {
  }

  open fun _push_current_op() {
  }

  open fun _scroll_moved(arg0: Double) {
  }

  open fun _text_changed_emit() {
  }

  open fun _toggle_draw_caret() {
  }

  open fun _update_wrap_at() {
  }

  open fun _v_scroll_input() {
  }

  open fun addColorRegion(
    beginKey: String,
    endKey: String,
    color: Color,
    lineOnly: Boolean = false
  ) {
    TransferContext.writeArguments(STRING to beginKey, STRING to endKey, COLOR to color, BOOL to
        lineOnly)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_ADD_COLOR_REGION, NIL)
  }

  open fun addKeywordColor(keyword: String, color: Color) {
    TransferContext.writeArguments(STRING to keyword, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_ADD_KEYWORD_COLOR, NIL)
  }

  open fun canFold(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CAN_FOLD, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun centerViewportToCursor() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CENTER_VIEWPORT_TO_CURSOR,
        NIL)
  }

  open fun clearColors() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CLEAR_COLORS, NIL)
  }

  open fun clearUndoHistory() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CLEAR_UNDO_HISTORY, NIL)
  }

  open fun copy() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_COPY, NIL)
  }

  open fun cursorGetColumn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CURSOR_GET_COLUMN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun cursorGetLine(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CURSOR_GET_LINE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun cursorSetColumn(column: Long, adjustViewport: Boolean = true) {
    TransferContext.writeArguments(LONG to column, BOOL to adjustViewport)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CURSOR_SET_COLUMN, NIL)
  }

  open fun cursorSetLine(
    line: Long,
    adjustViewport: Boolean = true,
    canBeHidden: Boolean = true,
    wrapIndex: Long = 0
  ) {
    TransferContext.writeArguments(LONG to line, BOOL to adjustViewport, BOOL to canBeHidden, LONG
        to wrapIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CURSOR_SET_LINE, NIL)
  }

  open fun cut() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CUT, NIL)
  }

  open fun deselect() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_DESELECT, NIL)
  }

  open fun foldAllLines() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_FOLD_ALL_LINES, NIL)
  }

  open fun foldLine(line: Long) {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_FOLD_LINE, NIL)
  }

  open fun getBreakpoints(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_BREAKPOINTS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun getKeywordColor(keyword: String): Color {
    TransferContext.writeArguments(STRING to keyword)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_KEYWORD_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  open fun getLine(line: Long): String {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getLineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getMenu(): PopupMenu? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_MENU, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PopupMenu?
  }

  open fun getSelectionFromColumn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_FROM_COLUMN,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getSelectionFromLine(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_FROM_LINE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getSelectionText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getSelectionToColumn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_TO_COLUMN,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getSelectionToLine(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_TO_LINE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getWordUnderCursor(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_WORD_UNDER_CURSOR,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun hasKeywordColor(keyword: String): Boolean {
    TransferContext.writeArguments(STRING to keyword)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_HAS_KEYWORD_COLOR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun insertTextAtCursor(text: String) {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_INSERT_TEXT_AT_CURSOR, NIL)
  }

  open fun isFolded(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_FOLDED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isLineHidden(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_LINE_HIDDEN, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isSelectionActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_SELECTION_ACTIVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun menuOption(option: Long) {
    TransferContext.writeArguments(LONG to option)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_MENU_OPTION, NIL)
  }

  open fun paste() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_PASTE, NIL)
  }

  open fun redo() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_REDO, NIL)
  }

  open fun removeBreakpoints() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_REMOVE_BREAKPOINTS, NIL)
  }

  open fun search(
    key: String,
    flags: Long,
    fromLine: Long,
    fromColumn: Long
  ): PoolIntArray {
    TransferContext.writeArguments(STRING to key, LONG to flags, LONG to fromLine, LONG to
        fromColumn)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SEARCH, POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  open fun select(
    fromLine: Long,
    fromColumn: Long,
    toLine: Long,
    toColumn: Long
  ) {
    TransferContext.writeArguments(LONG to fromLine, LONG to fromColumn, LONG to toLine, LONG to
        toColumn)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SELECT, NIL)
  }

  open fun selectAll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SELECT_ALL, NIL)
  }

  open fun setLine(line: Long, newText: String) {
    TransferContext.writeArguments(LONG to line, STRING to newText)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE, NIL)
  }

  open fun setLineAsHidden(line: Long, enable: Boolean) {
    TransferContext.writeArguments(LONG to line, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_AS_HIDDEN, NIL)
  }

  open fun toggleFoldLine(line: Long) {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_TOGGLE_FOLD_LINE, NIL)
  }

  open fun undo() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_UNDO, NIL)
  }

  open fun unfoldLine(line: Long) {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_UNFOLD_LINE, NIL)
  }

  open fun unhideAllLines() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_UNHIDE_ALL_LINES, NIL)
  }

  enum class SearchFlags(
    id: Long
  ) {
    SEARCH_MATCH_CASE(1),

    SEARCH_WHOLE_WORDS(2),

    SEARCH_BACKWARDS(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class SearchResult(
    id: Long
  ) {
    SEARCH_RESULT_COLUMN(0),

    SEARCH_RESULT_LINE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class MenuItems(
    id: Long
  ) {
    MENU_CUT(0),

    MENU_COPY(1),

    MENU_PASTE(2),

    MENU_CLEAR(3),

    MENU_SELECT_ALL(4),

    MENU_UNDO(5),

    MENU_REDO(6),

    MENU_MAX(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val MENU_CLEAR: Long = 3

    final const val MENU_COPY: Long = 1

    final const val MENU_CUT: Long = 0

    final const val MENU_MAX: Long = 7

    final const val MENU_PASTE: Long = 2

    final const val MENU_REDO: Long = 6

    final const val MENU_SELECT_ALL: Long = 4

    final const val MENU_UNDO: Long = 5

    final const val SEARCH_BACKWARDS: Long = 4

    final const val SEARCH_MATCH_CASE: Long = 1

    final const val SEARCH_RESULT_COLUMN: Long = 0

    final const val SEARCH_RESULT_LINE: Long = 1

    final const val SEARCH_WHOLE_WORDS: Long = 2
  }
}
