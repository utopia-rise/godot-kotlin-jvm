// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PoolIntArray
import godot.core.PoolStringArray
import godot.core.Rect2
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
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
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
import kotlin.Unit

/**
 * Multiline text editing control.
 *
 * TextEdit is meant for editing large, multiline text. It also has facilities for editing code, such as syntax highlighting support and multiple levels of undo/redo.
 *
 * **Note:** When holding down `Alt`, the vertical scroll wheel will scroll 5 times as fast as it would normally do. This also works in the Godot script editor.
 */
@GodotBaseType
public open class TextEdit : Control() {
  /**
   * Emitted when a breakpoint is placed via the breakpoint gutter.
   */
  public val breakpointToggled: Signal1<Long> by signal("row")

  /**
   * Emitted when the cursor changes.
   */
  public val cursorChanged: Signal0 by signal()

  /**
   * Emitted when the info icon is clicked.
   */
  public val infoClicked: Signal2<Long, String> by signal("row", "info")

  /**
   *
   */
  public val requestCompletion: Signal0 by signal()

  /**
   *
   */
  public val symbolLookup: Signal3<String, Long, Long> by signal("symbol", "row", "column")

  /**
   * Emitted when the text changes.
   */
  public val textChanged: Signal0 by signal()

  /**
   * If `true`, the bookmark gutter is visible.
   */
  public open var bookmarkGutter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_BOOKMARK_GUTTER,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_BOOKMARK_GUTTER, NIL)
    }

  /**
   * If `true`, the breakpoint gutter is visible.
   */
  public open var breakpointGutter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_BREAKPOINT_GUTTER,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_BREAKPOINT_GUTTER,
          NIL)
    }

  /**
   * If `true`, the caret (visual cursor) blinks.
   */
  public open var caretBlink: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_CARET_BLINK, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_CARET_BLINK, NIL)
    }

  /**
   * Duration (in seconds) of a caret's blinking cycle.
   */
  public open var caretBlinkSpeed: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_CARET_BLINK_SPEED,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_CARET_BLINK_SPEED,
          NIL)
    }

  /**
   * If `true`, the caret displays as a rectangle.
   *
   * If `false`, the caret displays as a bar.
   */
  public open var caretBlockMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_CARET_BLOCK_MODE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_CARET_BLOCK_MODE,
          NIL)
    }

  /**
   * If `true`, a right-click moves the cursor at the mouse position before displaying the context menu.
   *
   * If `false`, the context menu disregards mouse location.
   */
  public open var caretMovingByRightClick: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_CARET_MOVING_BY_RIGHT_CLICK, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_CARET_MOVING_BY_RIGHT_CLICK, NIL)
    }

  /**
   * If `true`, a right-click displays the context menu.
   */
  public open var contextMenuEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_CONTEXT_MENU_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_CONTEXT_MENU_ENABLED,
          NIL)
    }

  /**
   * If `true`, the selected text will be deselected when focus is lost.
   */
  public open var deselectOnFocusLossEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_DESELECT_ON_FOCUS_LOSS_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_DESELECT_ON_FOCUS_LOSS_ENABLED, NIL)
    }

  /**
   * If `true`, allow drag and drop of selected text.
   */
  public open var dragAndDropSelectionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_DRAG_AND_DROP_SELECTION_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_DRAG_AND_DROP_SELECTION_ENABLED, NIL)
    }

  /**
   * If `true`, the "space" character will have a visible representation.
   */
  public open var drawSpaces: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_DRAW_SPACES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_DRAW_SPACES, NIL)
    }

  /**
   * If `true`, the "tab" character will have a visible representation.
   */
  public open var drawTabs: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_DRAW_TABS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_DRAW_TABS, NIL)
    }

  /**
   * If `true`, the fold gutter is visible. This enables folding groups of indented lines.
   */
  public open var foldGutter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_FOLD_GUTTER, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_FOLD_GUTTER, NIL)
    }

  /**
   * If `true`, all lines that have been set to hidden by [setLineAsHidden], will not be visible.
   */
  public open var hidingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_HIDING_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_HIDING_ENABLED, NIL)
    }

  /**
   * If `true`, all occurrences of the selected text will be highlighted.
   */
  public open var highlightAllOccurrences: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_HIGHLIGHT_ALL_OCCURRENCES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_HIGHLIGHT_ALL_OCCURRENCES, NIL)
    }

  /**
   * If `true`, the line containing the cursor is highlighted.
   */
  public open var highlightCurrentLine: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_HIGHLIGHT_CURRENT_LINE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_HIGHLIGHT_CURRENT_LINE, NIL)
    }

  /**
   * If `false`, using middle mouse button to paste clipboard will be disabled.
   *
   * **Note:** This method is only implemented on Linux.
   */
  public open var middleMousePasteEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_MIDDLE_MOUSE_PASTE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_MIDDLE_MOUSE_PASTE_ENABLED, NIL)
    }

  /**
   * If `true`, a minimap is shown, providing an outline of your source code.
   */
  public open var minimapDraw: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_MINIMAP_DRAW, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_MINIMAP_DRAW, NIL)
    }

  /**
   * The width, in pixels, of the minimap.
   */
  public open var minimapWidth: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_MINIMAP_WIDTH, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_MINIMAP_WIDTH, NIL)
    }

  /**
   * If `true`, custom `font_color_selected` will be used for selected text.
   */
  public open var overrideSelectedFontColor: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_OVERRIDE_SELECTED_FONT_COLOR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_OVERRIDE_SELECTED_FONT_COLOR, NIL)
    }

  /**
   * If `true`, read-only mode is enabled. Existing text cannot be modified and new text cannot be added.
   */
  public open var readonly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_READONLY, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_READONLY, NIL)
    }

  /**
   * If there is a horizontal scrollbar, this determines the current horizontal scroll value in pixels.
   */
  public open var scrollHorizontal: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SCROLL_HORIZONTAL,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SCROLL_HORIZONTAL,
          NIL)
    }

  /**
   * If there is a vertical scrollbar, this determines the current vertical scroll value in line numbers, starting at 0 for the top line.
   */
  public open var scrollVertical: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SCROLL_VERTICAL,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SCROLL_VERTICAL, NIL)
    }

  /**
   * If `true`, text can be selected.
   *
   * If `false`, text can not be selected by the user or by the [select] or [selectAll] methods.
   */
  public open var selectingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTING_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SELECTING_ENABLED,
          NIL)
    }

  /**
   * If `true`, shortcut keys for context menu items are enabled, even if the context menu is disabled.
   */
  public open var shortcutKeysEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SHORTCUT_KEYS_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SHORTCUT_KEYS_ENABLED, NIL)
    }

  /**
   * If `true`, line numbers are displayed to the left of the text.
   */
  public open var showLineNumbers: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SHOW_LINE_NUMBERS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SHOW_LINE_NUMBERS,
          NIL)
    }

  /**
   * If `true`, sets the `step` of the scrollbars to `0.25` which results in smoother scrolling.
   */
  public open var smoothScrolling: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SMOOTH_SCROLLING,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SMOOTH_SCROLLING,
          NIL)
    }

  /**
   * If `true`, any custom color properties that have been set for this [godot.TextEdit] will be visible.
   */
  public open var syntaxHighlighting: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SYNTAX_HIGHLIGHTING,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SYNTAX_HIGHLIGHTING,
          NIL)
    }

  /**
   * String value of the [godot.TextEdit].
   */
  public open var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_TEXT, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_TEXT, NIL)
    }

  /**
   * Vertical scroll sensitivity.
   */
  public open var vScrollSpeed: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_V_SCROLL_SPEED,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_V_SCROLL_SPEED, NIL)
    }

  /**
   * If `true`, the native virtual keyboard is shown when focused on platforms that support it.
   */
  public open var virtualKeyboardEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_VIRTUAL_KEYBOARD_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_VIRTUAL_KEYBOARD_ENABLED, NIL)
    }

  /**
   * If `true`, enables text wrapping when it goes beyond the edge of what is visible.
   */
  public open var wrapEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_WRAP_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_WRAP_ENABLED, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TEXTEDIT)
  }

  public open fun _clickSelectionHeld(): Unit {
  }

  public open fun _cursorChangedEmit(): Unit {
  }

  public override fun _guiInput(event: InputEvent): Unit {
  }

  public open fun _pushCurrentOp(): Unit {
  }

  public open fun _scrollMoved(arg0: Double): Unit {
  }

  public open fun _textChangedEmit(): Unit {
  }

  public open fun _toggleDrawCaret(): Unit {
  }

  public open fun _updateWrapAt(): Unit {
  }

  public open fun _vScrollInput(): Unit {
  }

  /**
   * Adds color region (given the delimiters) and its colors.
   */
  public open fun addColorRegion(
    beginKey: String,
    endKey: String,
    color: Color,
    lineOnly: Boolean = false
  ): Unit {
    TransferContext.writeArguments(STRING to beginKey, STRING to endKey, COLOR to color, BOOL to
        lineOnly)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_ADD_COLOR_REGION, NIL)
  }

  /**
   * Adds a `keyword` and its [godot.core.Color].
   */
  public open fun addKeywordColor(keyword: String, color: Color): Unit {
    TransferContext.writeArguments(STRING to keyword, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_ADD_KEYWORD_COLOR, NIL)
  }

  /**
   * Returns if the given line is foldable, that is, it has indented lines right below it.
   */
  public open fun canFold(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CAN_FOLD, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Centers the viewport on the line the editing cursor is at. This also resets the [scrollHorizontal] value to `0`.
   */
  public open fun centerViewportToCursor(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CENTER_VIEWPORT_TO_CURSOR,
        NIL)
  }

  /**
   * Clears all custom syntax coloring information previously added with [addColorRegion] or [addKeywordColor].
   */
  public open fun clearColors(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CLEAR_COLORS, NIL)
  }

  /**
   * Clears the undo history.
   */
  public open fun clearUndoHistory(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CLEAR_UNDO_HISTORY, NIL)
  }

  /**
   * Copy's the current text selection.
   */
  public open fun copy(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_COPY, NIL)
  }

  /**
   * Returns the column the editing cursor is at.
   */
  public open fun cursorGetColumn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CURSOR_GET_COLUMN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the line the editing cursor is at.
   */
  public open fun cursorGetLine(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CURSOR_GET_LINE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Moves the cursor at the specified `column` index.
   *
   * If `adjust_viewport` is set to `true`, the viewport will center at the cursor position after the move occurs.
   */
  public open fun cursorSetColumn(column: Long, adjustViewport: Boolean = true): Unit {
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
  public open fun cursorSetLine(
    line: Long,
    adjustViewport: Boolean = true,
    canBeHidden: Boolean = true,
    wrapIndex: Long = 0
  ): Unit {
    TransferContext.writeArguments(LONG to line, BOOL to adjustViewport, BOOL to canBeHidden, LONG
        to wrapIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CURSOR_SET_LINE, NIL)
  }

  /**
   * Cut's the current selection.
   */
  public open fun cut(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CUT, NIL)
  }

  /**
   * Deselects the current selection.
   */
  public open fun deselect(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_DESELECT, NIL)
  }

  /**
   * Folds all lines that are possible to be folded (see [canFold]).
   */
  public open fun foldAllLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_FOLD_ALL_LINES, NIL)
  }

  /**
   * Folds the given line, if possible (see [canFold]).
   */
  public open fun foldLine(line: Long): Unit {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_FOLD_LINE, NIL)
  }

  /**
   * Returns an array containing the line number of each breakpoint.
   */
  public open fun getBreakpoints(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_BREAKPOINTS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the [godot.core.Color] of the specified `keyword`.
   */
  public open fun getKeywordColor(keyword: String): Color {
    TransferContext.writeArguments(STRING to keyword)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_KEYWORD_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the text of a specific line.
   */
  public open fun getLine(line: Long): String {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the line and column at the given position. In the returned vector, `x` is the column, `y` is the line.
   */
  public open fun getLineColumnAtPos(position: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_COLUMN_AT_POS,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the amount of total lines in the text.
   */
  public open fun getLineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the height of a largest line.
   */
  public open fun getLineHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_HEIGHT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the width in pixels of the `wrap_index` on `line`.
   */
  public open fun getLineWidth(line: Long, wrapIndex: Long = -1): Long {
    TransferContext.writeArguments(LONG to line, LONG to wrapIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_WIDTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of times the given line is wrapped.
   */
  public open fun getLineWrapCount(line: Long): Long {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_WRAP_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns an array of [godot.String]s representing each wrapped index.
   */
  public open fun getLineWrappedText(line: Long): PoolStringArray {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_WRAPPED_TEXT,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the [godot.PopupMenu] of this [godot.TextEdit]. By default, this menu is displayed when right-clicking on the [godot.TextEdit].
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public open fun getMenu(): PopupMenu? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_MENU, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PopupMenu?
  }

  /**
   * Returns the local position for the given `line` and `column`. If `x` or `y` of the returned vector equal `-1`, the position is outside of the viewable area of the control.
   *
   * **Note:** The Y position corresponds to the bottom side of the line. Use [getRectAtLineColumn] to get the top side position.
   */
  public open fun getPosAtLineColumn(line: Long, column: Long): Vector2 {
    TransferContext.writeArguments(LONG to line, LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_POS_AT_LINE_COLUMN,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the local position and size for the grapheme at the given `line` and `column`. If `x` or `y` position of the returned rect equal `-1`, the position is outside of the viewable area of the control.
   *
   * **Note:** The Y position of the returned rect corresponds to the top side of the line, unlike [getPosAtLineColumn] which returns the bottom side.
   */
  public open fun getRectAtLineColumn(line: Long, column: Long): Rect2 {
    TransferContext.writeArguments(LONG to line, LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_RECT_AT_LINE_COLUMN,
        RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Returns the selection begin column.
   */
  public open fun getSelectionFromColumn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_FROM_COLUMN,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the selection begin line.
   */
  public open fun getSelectionFromLine(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_FROM_LINE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the text inside the selection.
   */
  public open fun getSelectionText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the selection end column.
   */
  public open fun getSelectionToColumn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_TO_COLUMN,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the selection end line.
   */
  public open fun getSelectionToLine(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_TO_LINE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the total width of all gutters and internal padding.
   */
  public open fun getTotalGutterWidth(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_TOTAL_GUTTER_WIDTH,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the total amount of lines that could be drawn.
   */
  public open fun getTotalVisibleRows(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_TOTAL_VISIBLE_ROWS,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of visible lines, including wrapped text.
   */
  public open fun getVisibleRows(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_VISIBLE_ROWS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a [godot.String] text with the word under the caret (text cursor) location.
   */
  public open fun getWordUnderCursor(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_WORD_UNDER_CURSOR,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns whether the specified `keyword` has a color set to it or not.
   */
  public open fun hasKeywordColor(keyword: String): Boolean {
    TransferContext.writeArguments(STRING to keyword)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_HAS_KEYWORD_COLOR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if a "redo" action is available.
   */
  public open fun hasRedo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_HAS_REDO, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if an "undo" action is available.
   */
  public open fun hasUndo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_HAS_UNDO, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Insert the specified text at the cursor position.
   */
  public open fun insertTextAtCursor(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_INSERT_TEXT_AT_CURSOR, NIL)
  }

  /**
   * Returns whether the line at the specified index is folded or not.
   */
  public open fun isFolded(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_FOLDED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether the line at the specified index is hidden or not.
   */
  public open fun isLineHidden(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_LINE_HIDDEN, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` when the specified `line` is bookmarked.
   */
  public open fun isLineSetAsBookmark(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_LINE_SET_AS_BOOKMARK,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` when the specified `line` has a breakpoint.
   */
  public open fun isLineSetAsBreakpoint(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_LINE_SET_AS_BREAKPOINT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` when the specified `line` is marked as safe.
   */
  public open fun isLineSetAsSafe(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_LINE_SET_AS_SAFE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns if the given line is wrapped.
   */
  public open fun isLineWrapped(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_LINE_WRAPPED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether the mouse is over selection. If `edges` is `true`, the edges are considered part of the selection.
   */
  public open fun isMouseOverSelection(edges: Boolean): Boolean {
    TransferContext.writeArguments(BOOL to edges)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_MOUSE_OVER_SELECTION,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the selection is active.
   */
  public open fun isSelectionActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_SELECTION_ACTIVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Triggers a right-click menu action by the specified index. See [enum MenuItems] for a list of available indexes.
   */
  public open fun menuOption(option: Long): Unit {
    TransferContext.writeArguments(LONG to option)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_MENU_OPTION, NIL)
  }

  /**
   * Paste the current selection.
   */
  public open fun paste(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_PASTE, NIL)
  }

  /**
   * Perform redo operation.
   */
  public open fun redo(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_REDO, NIL)
  }

  /**
   * Removes all the breakpoints. This will not fire the [breakpointToggled] signal.
   */
  public open fun removeBreakpoints(): Unit {
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
  public open fun search(
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
  public open fun select(
    fromLine: Long,
    fromColumn: Long,
    toLine: Long,
    toColumn: Long
  ): Unit {
    TransferContext.writeArguments(LONG to fromLine, LONG to fromColumn, LONG to toLine, LONG to
        toColumn)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SELECT, NIL)
  }

  /**
   * Select all the text.
   *
   * If [selectingEnabled] is `false`, no selection will occur.
   */
  public open fun selectAll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SELECT_ALL, NIL)
  }

  /**
   * Sets the text for a specific line.
   */
  public open fun setLine(line: Long, newText: String): Unit {
    TransferContext.writeArguments(LONG to line, STRING to newText)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE, NIL)
  }

  /**
   * Bookmarks the `line` if `bookmark` is true. Deletes the bookmark if `bookmark` is false.
   *
   * Bookmarks are shown in the [breakpointGutter].
   */
  public open fun setLineAsBookmark(line: Long, bookmark: Boolean): Unit {
    TransferContext.writeArguments(LONG to line, BOOL to bookmark)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_AS_BOOKMARK, NIL)
  }

  /**
   * Adds or removes the breakpoint in `line`. Breakpoints are shown in the [breakpointGutter].
   */
  public open fun setLineAsBreakpoint(line: Long, breakpoint: Boolean): Unit {
    TransferContext.writeArguments(LONG to line, BOOL to breakpoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_AS_BREAKPOINT,
        NIL)
  }

  /**
   * If `true`, hides the line of the specified index.
   */
  public open fun setLineAsHidden(line: Long, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to line, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_AS_HIDDEN, NIL)
  }

  /**
   * If `true`, marks the `line` as safe.
   *
   * This will show the line number with the color provided in the `safe_line_number_color` theme property.
   */
  public open fun setLineAsSafe(line: Long, safe: Boolean): Unit {
    TransferContext.writeArguments(LONG to line, BOOL to safe)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_AS_SAFE, NIL)
  }

  /**
   * Toggle the folding of the code block at the given line.
   */
  public open fun toggleFoldLine(line: Long): Unit {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_TOGGLE_FOLD_LINE, NIL)
  }

  /**
   * Perform undo operation.
   */
  public open fun undo(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_UNDO, NIL)
  }

  /**
   * Unfolds the given line, if folded.
   */
  public open fun unfoldLine(line: Long): Unit {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_UNFOLD_LINE, NIL)
  }

  /**
   * Unhide all lines that were previously set to hidden by [setLineAsHidden].
   */
  public open fun unhideAllLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_UNHIDE_ALL_LINES, NIL)
  }

  public enum class SearchFlags(
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
    SEARCH_BACKWARDS(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class SearchResult(
    id: Long
  ) {
    /**
     * Used to access the result column from [search].
     */
    SEARCH_RESULT_COLUMN(0),
    /**
     * Used to access the result line from [search].
     */
    SEARCH_RESULT_LINE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class MenuItems(
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
    MENU_MAX(7),
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
     * Erases the whole [godot.TextEdit] text.
     */
    public final const val MENU_CLEAR: Long = 3

    /**
     * Copies the selected text.
     */
    public final const val MENU_COPY: Long = 1

    /**
     * Cuts (copies and clears) the selected text.
     */
    public final const val MENU_CUT: Long = 0

    /**
     * Represents the size of the [enum MenuItems] enum.
     */
    public final const val MENU_MAX: Long = 7

    /**
     * Pastes the clipboard text over the selected text (or at the cursor's position).
     */
    public final const val MENU_PASTE: Long = 2

    /**
     * Redoes the previous action.
     */
    public final const val MENU_REDO: Long = 6

    /**
     * Selects the whole [godot.TextEdit] text.
     */
    public final const val MENU_SELECT_ALL: Long = 4

    /**
     * Undoes the previous action.
     */
    public final const val MENU_UNDO: Long = 5

    /**
     * Search from end to beginning.
     */
    public final const val SEARCH_BACKWARDS: Long = 4

    /**
     * Match case when searching.
     */
    public final const val SEARCH_MATCH_CASE: Long = 1

    /**
     * Used to access the result column from [search].
     */
    public final const val SEARCH_RESULT_COLUMN: Long = 0

    /**
     * Used to access the result line from [search].
     */
    public final const val SEARCH_RESULT_LINE: Long = 1

    /**
     * Match whole words when searching.
     */
    public final const val SEARCH_WHOLE_WORDS: Long = 2
  }
}
