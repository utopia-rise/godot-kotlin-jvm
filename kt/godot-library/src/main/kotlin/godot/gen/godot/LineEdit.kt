// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Control that provides single-line string editing.
 *
 * LineEdit provides a single-line string editor, used for text fields.
 *
 * It features many built-in shortcuts which will always be available (`Ctrl` here maps to `Command` on macOS):
 *
 * - Ctrl + C: Copy
 *
 * - Ctrl + X: Cut
 *
 * - Ctrl + V or Ctrl + Y: Paste/"yank"
 *
 * - Ctrl + Z: Undo
 *
 * - Ctrl + Shift + Z: Redo
 *
 * - Ctrl + U: Delete text from the cursor position to the beginning of the line
 *
 * - Ctrl + K: Delete text from the cursor position to the end of the line
 *
 * - Ctrl + A: Select all text
 *
 * - Up/Down arrow: Move the cursor to the beginning/end of the line
 *
 * On macOS, some extra keyboard shortcuts are available:
 *
 * - Ctrl + F: Like the right arrow key, move the cursor one character right
 *
 * - Ctrl + B: Like the left arrow key, move the cursor one character left
 *
 * - Ctrl + P: Like the up arrow key, move the cursor to the previous line
 *
 * - Ctrl + N: Like the down arrow key, move the cursor to the next line
 *
 * - Ctrl + D: Like the Delete key, delete the character on the right side of cursor
 *
 * - Ctrl + H: Like the Backspace key, delete the character on the left side of the cursor
 *
 * - Command + Left arrow: Like the Home key, move the cursor to the beginning of the line
 *
 * - Command + Right arrow: Like the End key, move the cursor to the end of the line
 */
@GodotBaseType
open class LineEdit : Control() {
  /**
   * Emitted when trying to append text that would overflow the [maxLength].
   */
  val textChangeRejected: Signal0 by signal()

  /**
   * Emitted when the text changes.
   */
  val textChanged: Signal1<String> by signal("new_text")

  /**
   * Emitted when the user presses [KEY_ENTER] on the [godot.LineEdit].
   */
  val textEntered: Signal1<String> by signal("new_text")

  /**
   * Text alignment as defined in the [enum Align] enum.
   */
  open var align: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_ALIGN, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_ALIGN, NIL)
    }

  /**
   * If `true`, the caret (visual cursor) blinks.
   */
  open var caretBlink: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_CARET_BLINK, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_CARET_BLINK, NIL)
    }

  /**
   * Duration (in seconds) of a caret's blinking cycle.
   */
  open var caretBlinkSpeed: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_CARET_BLINK_SPEED,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_CARET_BLINK_SPEED,
          NIL)
    }

  /**
   * The cursor's position inside the [godot.LineEdit]. When set, the text may scroll to accommodate it.
   */
  open var caretPosition: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_CARET_POSITION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_CARET_POSITION, NIL)
    }

  /**
   * If `true`, the [godot.LineEdit] will show a clear button if `text` is not empty, which can be used to clear the text quickly.
   */
  open var clearButtonEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_CLEAR_BUTTON_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_CLEAR_BUTTON_ENABLED,
          NIL)
    }

  /**
   * If `true`, the context menu will appear when right-clicked.
   */
  open var contextMenuEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_CONTEXT_MENU_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_CONTEXT_MENU_ENABLED,
          NIL)
    }

  /**
   * If `false`, existing text cannot be modified and new text cannot be added.
   */
  open var editable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_EDITABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_EDITABLE, NIL)
    }

  /**
   * If `true`, the [godot.LineEdit] width will increase to stay longer than the [text]. It will **not** compress if the [text] is shortened.
   */
  open var expandToTextLength: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_EXPAND_TO_TEXT_LENGTH, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_EXPAND_TO_TEXT_LENGTH, NIL)
    }

  /**
   * Maximum amount of characters that can be entered inside the [godot.LineEdit]. If `0`, there is no limit.
   */
  open var maxLength: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_MAX_LENGTH, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_MAX_LENGTH, NIL)
    }

  /**
   * Opacity of the [placeholderText]. From `0` to `1`.
   */
  open var placeholderAlpha: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_PLACEHOLDER_ALPHA,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_PLACEHOLDER_ALPHA,
          NIL)
    }

  /**
   * Text shown when the [godot.LineEdit] is empty. It is **not** the [godot.LineEdit]'s default value (see [text]).
   */
  open var placeholderText: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_PLACEHOLDER_TEXT,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_PLACEHOLDER_TEXT,
          NIL)
    }

  /**
   * Sets the icon that will appear in the right end of the [godot.LineEdit] if there's no [text], or always, if [clearButtonEnabled] is set to `false`.
   */
  open var rightIcon: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_RIGHT_ICON, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_RIGHT_ICON, NIL)
    }

  /**
   * If `true`, every character is replaced with the secret character (see [secretCharacter]).
   */
  open var secret: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_SECRET, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_SECRET, NIL)
    }

  /**
   * The character to use to mask secret input (defaults to "*"). Only a single character can be used as the secret character.
   */
  open var secretCharacter: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_SECRET_CHARACTER,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_SECRET_CHARACTER,
          NIL)
    }

  /**
   * If `false`, it's impossible to select the text using mouse nor keyboard.
   */
  open var selectingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_SELECTING_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_SELECTING_ENABLED,
          NIL)
    }

  /**
   * If `false`, using shortcuts will be disabled.
   */
  open var shortcutKeysEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_SHORTCUT_KEYS_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_SHORTCUT_KEYS_ENABLED, NIL)
    }

  /**
   * String value of the [godot.LineEdit].
   *
   * **Note:** Changing text using this property won't emit the [textChanged] signal.
   */
  open var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_TEXT, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_TEXT, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_LINEEDIT)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _editorSettingsChanged() {
  }

  override fun _guiInput(event: InputEvent) {
  }

  open fun _textChanged() {
  }

  open fun _toggleDrawCaret() {
  }

  /**
   * Adds `text` after the cursor. If the resulting value is longer than [maxLength], nothing happens.
   */
  open fun appendAtCursor(text: String) {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_APPEND_AT_CURSOR, NIL)
  }

  /**
   * Erases the [godot.LineEdit]'s [text].
   */
  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_CLEAR, NIL)
  }

  /**
   * Clears the current selection.
   */
  open fun deselect() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_DESELECT, NIL)
  }

  /**
   * Returns the [godot.PopupMenu] of this [godot.LineEdit]. By default, this menu is displayed when right-clicking on the [godot.LineEdit].
   */
  open fun getMenu(): PopupMenu? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_MENU, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PopupMenu?
  }

  /**
   * Executes a given action as defined in the [enum MenuItems] enum.
   */
  open fun menuOption(option: Long) {
    TransferContext.writeArguments(LONG to option)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_MENU_OPTION, NIL)
  }

  /**
   * Selects characters inside [godot.LineEdit] between `from` and `to`. By default, `from` is at the beginning and `to` at the end.
   *
   * ```
   * 				text = "Welcome"
   * 				select() # Will select "Welcome".
   * 				select(4) # Will select "ome".
   * 				select(2, 5) # Will select "lco".
   * 				```
   */
  open fun select(from: Long = 0, to: Long = -1) {
    TransferContext.writeArguments(LONG to from, LONG to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SELECT, NIL)
  }

  /**
   * Selects the whole [godot.String].
   */
  open fun selectAll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SELECT_ALL, NIL)
  }

  enum class Align(
    id: Long
  ) {
    /**
     * Aligns the text on the left-hand side of the [godot.LineEdit].
     */
    ALIGN_LEFT(0),

    /**
     * Centers the text in the middle of the [godot.LineEdit].
     */
    ALIGN_CENTER(1),

    /**
     * Aligns the text on the right-hand side of the [godot.LineEdit].
     */
    ALIGN_RIGHT(2),

    /**
     * Stretches whitespaces to fit the [godot.LineEdit]'s width.
     */
    ALIGN_FILL(3);

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
     *
     * Non-printable escape characters are automatically stripped from the OS clipboard via [godot.String.stripEscapes].
     */
    MENU_PASTE(2),

    /**
     * Erases the whole [godot.LineEdit] text.
     */
    MENU_CLEAR(3),

    /**
     * Selects the whole [godot.LineEdit] text.
     */
    MENU_SELECT_ALL(4),

    /**
     * Undoes the previous action.
     */
    MENU_UNDO(5),

    /**
     * Reverse the last undo action.
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
     * Centers the text in the middle of the [godot.LineEdit].
     */
    final const val ALIGN_CENTER: Long = 1

    /**
     * Stretches whitespaces to fit the [godot.LineEdit]'s width.
     */
    final const val ALIGN_FILL: Long = 3

    /**
     * Aligns the text on the left-hand side of the [godot.LineEdit].
     */
    final const val ALIGN_LEFT: Long = 0

    /**
     * Aligns the text on the right-hand side of the [godot.LineEdit].
     */
    final const val ALIGN_RIGHT: Long = 2

    /**
     * Erases the whole [godot.LineEdit] text.
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
     *
     * Non-printable escape characters are automatically stripped from the OS clipboard via [godot.String.stripEscapes].
     */
    final const val MENU_PASTE: Long = 2

    /**
     * Reverse the last undo action.
     */
    final const val MENU_REDO: Long = 6

    /**
     * Selects the whole [godot.LineEdit] text.
     */
    final const val MENU_SELECT_ALL: Long = 4

    /**
     * Undoes the previous action.
     */
    final const val MENU_UNDO: Long = 5
  }
}
