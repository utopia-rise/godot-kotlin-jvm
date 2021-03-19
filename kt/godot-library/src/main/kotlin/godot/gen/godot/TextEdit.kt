// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

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
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Multiline text editing control.
 * 
 * TextEdit is meant for editing large, multiline text. It also has facilities for editing code, such as syntax highlighting support and multiple levels of undo/redo.
 */
@GodotBaseType
open class TextEdit : Control() {
  /**
   * Emitted when a breakpoint is placed via the breakpoint gutter.
   */
  val breakpointToggled: Signal1<Long> by signal("row")

  /**
   * Emitted when the cursor changes.
   */
  val cursorChanged: Signal0 by signal()

  /**
   * Emitted when the info icon is clicked.
   */
  val infoClicked: Signal2<Long, String> by signal("row", "info")

  /**
   *
   */
  val requestCompletion: Signal0 by signal()

  /**
   *
   */
  val symbolLookup: Signal3<String, Long, Long> by signal("symbol", "row", "column")

  /**
   * Emitted when the text changes.
   */
  val textChanged: Signal0 by signal()

  /**
   * If `true`, the breakpoint gutter is visible.
   */
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

  /**
   * If `true`, the caret (visual cursor) blinks.
   */
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

  /**
   * Duration (in seconds) of a caret's blinking cycle.
   */
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

  /**
   * If `true`, the caret displays as a rectangle.
   *
   * If `false`, the caret displays as a bar.
   */
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

  /**
   * If `true`, a right-click moves the cursor at the mouse position before displaying the context menu.
   *
   * If `false`, the context menu disregards mouse location.
   */
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

  /**
   * If `true`, a right-click displays the context menu.
   */
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

  /**
   * If `true`, the "space" character will have a visible representation.
   */
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

  /**
   * If `true`, the "tab" character will have a visible representation.
   */
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

  /**
   * If `true`, the fold gutter is visible. This enables folding groups of indented lines.
   */
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

  /**
   * If `true`, all lines that have been set to hidden by [setLineAsHidden], will not be visible.
   */
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

  /**
   * If `true`, all occurrences of the selected text will be highlighted.
   */
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

  /**
   * If `true`, the line containing the cursor is highlighted.
   */
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

  /**
   * If `true`, a minimap is shown, providing an outline of your source code.
   */
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

  /**
   * The width, in pixels, of the minimap.
   */
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

  /**
   * If `true`, custom `font_color_selected` will be used for selected text.
   */
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

  /**
   * If `true`, read-only mode is enabled. Existing text cannot be modified and new text cannot be added.
   */
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

  /**
   * The current horizontal scroll value.
   */
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

  /**
   * The current vertical scroll value.
   */
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

  /**
   * If `true`, text can be selected.
   *
   * If `false`, text can not be selected by the user or by the [select] or [selectAll] methods.
   */
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

  /**
   * If `true`, shortcut keys for context menu items are enabled, even if the context menu is disabled.
   */
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

  /**
   * If `true`, line numbers are displayed to the left of the text.
   */
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

  /**
   * If `true`, sets the `step` of the scrollbars to `0.25` which results in smoother scrolling.
   */
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

  /**
   * If `true`, any custom color properties that have been set for this [godot.TextEdit] will be visible.
   */
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

  /**
   * String value of the [godot.TextEdit].
   */
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

  /**
   * Vertical scroll sensitivity.
   */
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

  /**
   * If `true`, enables text wrapping when it goes beyond the edge of what is visible.
   */
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

  override fun __new() {
    callConstructor(ENGINECLASS_TEXTEDIT)
  }

  open fun _clickSelectionHeld() {
  }

  open fun _cursorChangedEmit() {
  }

  override fun _guiInput(event: InputEvent) {
  }

  open fun _pushCurrentOp() {
  }

  open fun _scrollMoved(arg0: Double) {
  }

  open fun _textChangedEmit() {
  }

  open fun _toggleDrawCaret() {
  }

  open fun _updateWrapAt() {
  }

  open fun _vScrollInput() {
  }

  /**
   * Adds color region (given the delimiters) and its colors.
   */
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

  /**
   * Adds a `keyword` and its [godot.core.Color].
   */
  open fun addKeywordColor(keyword: String, color: Color) {
    TransferContext.writeArguments(STRING to keyword, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_ADD_KEYWORD_COLOR, NIL)
  }

  /**
   * Returns if the given line is foldable, that is, it has indented lines right below it.
   */
  open fun canFold(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CAN_FOLD, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Centers the viewport on the line the editing cursor is at. This also resets the [scrollHorizontal] value to `0`.
   */
  open fun centerViewportToCursor() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CENTER_VIEWPORT_TO_CURSOR,
        NIL)
  }

  /**
   * Clears all custom syntax coloring information previously added with [addColorRegion] or [addKeywordColor].
   */
  open fun clearColors() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CLEAR_COLORS, NIL)
  }

  /**
   * Clears the undo history.
   */
  open fun clearUndoHistory() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CLEAR_UNDO_HISTORY, NIL)
  }

  /**
   * Copy's the current text selection.
   */
  open fun copy() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_COPY, NIL)
  }

  /**
   * Returns the column the editing cursor is at.
   */
  open fun cursorGetColumn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CURSOR_GET_COLUMN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the line the editing cursor is at.
   */
  open fun cursorGetLine(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CURSOR_GET_LINE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Moves the cursor at the specified `column` index.
   *
   * If `adjust_viewport` is set to `true`, the viewport will center at the cursor position after the move occurs.
   */
  open fun cursorSetColumn(column: Long, adjustViewport: Boolean = true) {
    TransferContext.writeArguments(LONG to column, BOOL to adjustViewport)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CURSOR_SET_COLUMN, NIL)
  }

  /**
   * Moves the cursor at the specified `line` index.
   *
   * If `adjust_viewport` is set to `true`, the viewport will center at the cursor position after the move occurs.
   *
   * If `can_be_hidden` is set to `true`, the specified `line` can be hidden using [setLineAsHidden].
   */
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

  /**
   * Cut's the current selection.
   */
  open fun cut() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CUT, NIL)
  }

  /**
   * Deselects the current selection.
   */
  open fun deselect() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_DESELECT, NIL)
  }

  /**
   * Folds all lines that are possible to be folded (see [canFold]).
   */
  open fun foldAllLines() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_FOLD_ALL_LINES, NIL)
  }

  /**
   * Folds the given line, if possible (see [canFold]).
   */
  open fun foldLine(line: Long) {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_FOLD_LINE, NIL)
  }

  /**
   * Returns an array containing the line number of each breakpoint.
   */
  open fun getBreakpoints(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_BREAKPOINTS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the [godot.core.Color] of the specified `keyword`.
   */
  open fun getKeywordColor(keyword: String): Color {
    TransferContext.writeArguments(STRING to keyword)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_KEYWORD_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the text of a specific line.
   */
  open fun getLine(line: Long): String {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the amount of total lines in the text.
   */
  open fun getLineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [godot.PopupMenu] of this [godot.TextEdit]. By default, this menu is displayed when right-clicking on the [godot.TextEdit].
   */
  open fun getMenu(): PopupMenu? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_MENU, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PopupMenu?
  }

  /**
   * Returns the selection begin column.
   */
  open fun getSelectionFromColumn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_FROM_COLUMN,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the selection begin line.
   */
  open fun getSelectionFromLine(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_FROM_LINE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the text inside the selection.
   */
  open fun getSelectionText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the selection end column.
   */
  open fun getSelectionToColumn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_TO_COLUMN,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the selection end line.
   */
  open fun getSelectionToLine(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_TO_LINE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a [godot.String] text with the word under the mouse cursor location.
   */
  open fun getWordUnderCursor(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_WORD_UNDER_CURSOR,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns whether the specified `keyword` has a color set to it or not.
   */
  open fun hasKeywordColor(keyword: String): Boolean {
    TransferContext.writeArguments(STRING to keyword)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_HAS_KEYWORD_COLOR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Insert the specified text at the cursor position.
   */
  open fun insertTextAtCursor(text: String) {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_INSERT_TEXT_AT_CURSOR, NIL)
  }

  /**
   * Returns whether the line at the specified index is folded or not.
   */
  open fun isFolded(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_FOLDED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether the line at the specified index is hidden or not.
   */
  open fun isLineHidden(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_LINE_HIDDEN, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the selection is active.
   */
  open fun isSelectionActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_SELECTION_ACTIVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Triggers a right-click menu action by the specified index. See [enum MenuItems] for a list of available indexes.
   */
  open fun menuOption(option: Long) {
    TransferContext.writeArguments(LONG to option)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_MENU_OPTION, NIL)
  }

  /**
   * Paste the current selection.
   */
  open fun paste() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_PASTE, NIL)
  }

  /**
   * Perform redo operation.
   */
  open fun redo() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_REDO, NIL)
  }

  /**
   * Removes all the breakpoints. This will not fire the [breakpointToggled] signal.
   */
  open fun removeBreakpoints() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_REMOVE_BREAKPOINTS, NIL)
  }

  /**
   * Perform a search inside the text. Search flags can be specified in the [enum SearchFlags] enum.
   *
   * Returns an empty `PoolIntArray` if no result was found. Otherwise, the result line and column can be accessed at indices specified in the [enum SearchResult] enum, e.g:
   *
   * ```
   * 				var result = search(key, flags, line, column)
   * 				if result.size() > 0:
   * 				    # Result found.
   * 				    var res_line = result[godot.TextEdit.SEARCH_RESULT_LINE]
   * 				    var res_column = result[godot.TextEdit.SEARCH_RESULT_COLUMN]
   * 				```
   */
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

  /**
   * Perform selection, from line/column to line/column.
   *
   * If [selectingEnabled] is `false`, no selection will occur.
   */
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

  /**
   * Select all the text.
   *
   * If [selectingEnabled] is `false`, no selection will occur.
   */
  open fun selectAll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SELECT_ALL, NIL)
  }

  /**
   * Sets the text for a specific line.
   */
  open fun setLine(line: Long, newText: String) {
    TransferContext.writeArguments(LONG to line, STRING to newText)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE, NIL)
  }

  /**
   * If `true`, hides the line of the specified index.
   */
  open fun setLineAsHidden(line: Long, enable: Boolean) {
    TransferContext.writeArguments(LONG to line, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_AS_HIDDEN, NIL)
  }

  /**
   * Toggle the folding of the code block at the given line.
   */
  open fun toggleFoldLine(line: Long) {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_TOGGLE_FOLD_LINE, NIL)
  }

  /**
   * Perform undo operation.
   */
  open fun undo() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_UNDO, NIL)
  }

  /**
   * Unfolds the given line, if folded.
   */
  open fun unfoldLine(line: Long) {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_UNFOLD_LINE, NIL)
  }

  /**
   * Unhide all lines that were previously set to hidden by [setLineAsHidden].
   */
  open fun unhideAllLines() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_UNHIDE_ALL_LINES, NIL)
  }

  enum class SearchFlags(
    id: Long
  ) {
    /**
     * Match case when searching.
     */
    SEARCH_MATCH_CASE(1),

    /**
     * Match whole words when searching.
     */
    SEARCH_WHOLE_WORDS(2),

    /**
     * Search from end to beginning.
     */
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
    /**
     * Used to access the result column from [search].
     */
    SEARCH_RESULT_COLUMN(0),

    /**
     * Used to access the result line from [search].
     */
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
    /**
     * Cuts (copies and clears) the selected text.
     */
    MENU_CUT(0),

    /**
     * Copies the selected text.
     */
    MENU_COPY(1),

    /**
     * Pastes the clipboard text over the selected text (or at the cursor's position).
     */
    MENU_PASTE(2),

    /**
     * Erases the whole [godot.TextEdit] text.
     */
    MENU_CLEAR(3),

    /**
     * Selects the whole [godot.TextEdit] text.
     */
    MENU_SELECT_ALL(4),

    /**
     * Undoes the previous action.
     */
    MENU_UNDO(5),

    /**
     * Redoes the previous action.
     */
    MENU_REDO(6),

    /**
     * Represents the size of the [enum MenuItems] enum.
     */
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
    /**
     * Erases the whole [godot.TextEdit] text.
     */
    final const val MENU_CLEAR: Long = 3

    /**
     * Copies the selected text.
     */
    final const val MENU_COPY: Long = 1

    /**
     * Cuts (copies and clears) the selected text.
     */
    final const val MENU_CUT: Long = 0

    /**
     * Represents the size of the [enum MenuItems] enum.
     */
    final const val MENU_MAX: Long = 7

    /**
     * Pastes the clipboard text over the selected text (or at the cursor's position).
     */
    final const val MENU_PASTE: Long = 2

    /**
     * Redoes the previous action.
     */
    final const val MENU_REDO: Long = 6

    /**
     * Selects the whole [godot.TextEdit] text.
     */
    final const val MENU_SELECT_ALL: Long = 4

    /**
     * Undoes the previous action.
     */
    final const val MENU_UNDO: Long = 5

    /**
     * Search from end to beginning.
     */
    final const val SEARCH_BACKWARDS: Long = 4

    /**
     * Match case when searching.
     */
    final const val SEARCH_MATCH_CASE: Long = 1

    /**
     * Used to access the result column from [search].
     */
    final const val SEARCH_RESULT_COLUMN: Long = 0

    /**
     * Used to access the result line from [search].
     */
    final const val SEARCH_RESULT_LINE: Long = 1

    /**
     * Match whole words when searching.
     */
    final const val SEARCH_WHOLE_WORDS: Long = 2
  }
}
