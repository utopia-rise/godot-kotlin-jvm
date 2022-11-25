// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Control that provides single-line string editing.
 *
 * LineEdit provides a single-line string editor, used for text fields.
 *
 * It features many built-in shortcuts which will always be available ([kbd]Ctrl[/kbd] here maps to [kbd]Cmd[/kbd] on macOS):
 *
 * - [kbd]Ctrl + C[/kbd]: Copy
 *
 * - [kbd]Ctrl + X[/kbd]: Cut
 *
 * - [kbd]Ctrl + V[/kbd] or [kbd]Ctrl + Y[/kbd]: Paste/"yank"
 *
 * - [kbd]Ctrl + Z[/kbd]: Undo
 *
 * - [kbd]Ctrl + ~[/kbd]: Swap input direction.
 *
 * - [kbd]Ctrl + Shift + Z[/kbd]: Redo
 *
 * - [kbd]Ctrl + U[/kbd]: Delete text from the caret position to the beginning of the line
 *
 * - [kbd]Ctrl + K[/kbd]: Delete text from the caret position to the end of the line
 *
 * - [kbd]Ctrl + A[/kbd]: Select all text
 *
 * - [kbd]Up Arrow[/kbd]/[kbd]Down Arrow[/kbd]: Move the caret to the beginning/end of the line
 *
 * On macOS, some extra keyboard shortcuts are available:
 *
 * - [kbd]Ctrl + F[/kbd]: Same as [kbd]Right Arrow[/kbd], move the caret one character right
 *
 * - [kbd]Ctrl + B[/kbd]: Same as [kbd]Left Arrow[/kbd], move the caret one character left
 *
 * - [kbd]Ctrl + P[/kbd]: Same as [kbd]Up Arrow[/kbd], move the caret to the previous line
 *
 * - [kbd]Ctrl + N[/kbd]: Same as [kbd]Down Arrow[/kbd], move the caret to the next line
 *
 * - [kbd]Ctrl + D[/kbd]: Same as [kbd]Delete[/kbd], delete the character on the right side of caret
 *
 * - [kbd]Ctrl + H[/kbd]: Same as [kbd]Backspace[/kbd], delete the character on the left side of the caret
 *
 * - [kbd]Ctrl + A[/kbd]: Same as [kbd]Home[/kbd], move the caret to the beginning of the line
 *
 * - [kbd]Ctrl + E[/kbd]: Same as [kbd]End[/kbd], move the caret to the end of the line
 *
 * - [kbd]Cmd + Left Arrow[/kbd]: Same as [kbd]Home[/kbd], move the caret to the beginning of the line
 *
 * - [kbd]Cmd + Right Arrow[/kbd]: Same as [kbd]End[/kbd], move the caret to the end of the line
 */
@GodotBaseType
public open class LineEdit : Control() {
  /**
   * Emitted when the user presses [KEY_ENTER] on the [godot.LineEdit].
   */
  public val textSubmitted: Signal1<String> by signal("newText")

  /**
   * Emitted when the text changes.
   */
  public val textChanged: Signal1<String> by signal("newText")

  /**
   * Emitted when appending text that overflows the [maxLength]. The appended text is truncated to fit [maxLength], and the part that couldn't fit is passed as the `rejected_substring` argument.
   */
  public val textChangeRejected: Signal1<String> by signal("rejectedSubstring")

  /**
   * String value of the [godot.LineEdit].
   *
   * **Note:** Changing text using this property won't emit the [textChanged] signal.
   */
  public var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_TEXT, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_TEXT, NIL)
    }

  /**
   * Text shown when the [godot.LineEdit] is empty. It is **not** the [godot.LineEdit]'s default value (see [text]).
   */
  public var placeholderText: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_PLACEHOLDER, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_PLACEHOLDER, NIL)
    }

  /**
   * Text alignment as defined in the [enum HorizontalAlignment] enum.
   */
  public var alignment: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_HORIZONTAL_ALIGNMENT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_HORIZONTAL_ALIGNMENT,
          NIL)
    }

  /**
   * Maximum number of characters that can be entered inside the [godot.LineEdit]. If `0`, there is no limit.
   *
   * When a limit is defined, characters that would exceed [maxLength] are truncated. This happens both for existing [text] contents when setting the max length, or for new text inserted in the [godot.LineEdit], including pasting. If any input text is truncated, the [textChangeRejected] signal is emitted with the truncated substring as parameter.
   *
   * **Example:**
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * text = "Hello world"
   *
   * max_length = 5
   *
   * # `text` becomes "Hello".
   *
   * max_length = 10
   *
   * text += " goodbye"
   *
   * # `text` becomes "Hello good".
   *
   * # `text_change_rejected` is emitted with "bye" as parameter.
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * Text = "Hello world";
   *
   * MaxLength = 5;
   *
   * // `Text` becomes "Hello".
   *
   * MaxLength = 10;
   *
   * Text += " goodbye";
   *
   * // `Text` becomes "Hello good".
   *
   * // `text_change_rejected` is emitted with "bye" as parameter.
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public var maxLength: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_MAX_LENGTH, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_MAX_LENGTH, NIL)
    }

  /**
   * If `false`, existing text cannot be modified and new text cannot be added.
   */
  public var editable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_IS_EDITABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_EDITABLE, NIL)
    }

  /**
   * If `true`, every character is replaced with the secret character (see [secretCharacter]).
   */
  public var secret: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_IS_SECRET, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_SECRET, NIL)
    }

  /**
   * The character to use to mask secret input (defaults to "•"). Only a single character can be used as the secret character.
   */
  public var secretCharacter: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_SECRET_CHARACTER,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_SECRET_CHARACTER,
          NIL)
    }

  /**
   * If `true`, the [godot.LineEdit] width will increase to stay longer than the [text]. It will **not** compress if the [text] is shortened.
   */
  public var expandToTextLength: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_IS_EXPAND_TO_TEXT_LENGTH_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_EXPAND_TO_TEXT_LENGTH_ENABLED, NIL)
    }

  /**
   * If `true`, the context menu will appear when right-clicked.
   */
  public var contextMenuEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_IS_CONTEXT_MENU_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_CONTEXT_MENU_ENABLED,
          NIL)
    }

  /**
   * If `true`, the native virtual keyboard is shown when focused on platforms that support it.
   */
  public var virtualKeyboardEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_IS_VIRTUAL_KEYBOARD_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_VIRTUAL_KEYBOARD_ENABLED, NIL)
    }

  /**
   * If `true`, the [godot.LineEdit] will show a clear button if `text` is not empty, which can be used to clear the text quickly.
   */
  public var clearButtonEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_IS_CLEAR_BUTTON_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_CLEAR_BUTTON_ENABLED,
          NIL)
    }

  /**
   * If `false`, using shortcuts will be disabled.
   */
  public var shortcutKeysEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_IS_SHORTCUT_KEYS_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_SHORTCUT_KEYS_ENABLED, NIL)
    }

  /**
   * If `false`, using middle mouse button to paste clipboard will be disabled.
   *
   * **Note:** This method is only implemented on Linux.
   */
  public var middleMousePasteEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_IS_MIDDLE_MOUSE_PASTE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_MIDDLE_MOUSE_PASTE_ENABLED, NIL)
    }

  /**
   * If `false`, it's impossible to select the text using mouse nor keyboard.
   */
  public var selectingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_IS_SELECTING_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_SELECTING_ENABLED,
          NIL)
    }

  /**
   * If `true`, the selected text will be deselected when focus is lost.
   */
  public var deselectOnFocusLossEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_IS_DESELECT_ON_FOCUS_LOSS_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_DESELECT_ON_FOCUS_LOSS_ENABLED, NIL)
    }

  /**
   * Sets the icon that will appear in the right end of the [godot.LineEdit] if there's no [text], or always, if [clearButtonEnabled] is set to `false`.
   */
  public var rightIcon: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_RIGHT_ICON, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_RIGHT_ICON, NIL)
    }

  /**
   * If `true`, the [godot.LineEdit] don't display decoration.
   */
  public var flat: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_IS_FLAT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_FLAT, NIL)
    }

  /**
   * Base text writing direction.
   */
  public var textDirection: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_TEXT_DIRECTION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_TEXT_DIRECTION, NIL)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public var language: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_LANGUAGE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_LANGUAGE, NIL)
    }

  /**
   * If `true`, control characters are displayed.
   */
  public var drawControlChars: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_DRAW_CONTROL_CHARS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_DRAW_CONTROL_CHARS,
          NIL)
    }

  /**
   * Set BiDi algorithm override for the structured text.
   */
  public var structuredTextBidiOverride: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_STRUCTURED_TEXT_BIDI_OVERRIDE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_STRUCTURED_TEXT_BIDI_OVERRIDE, NIL)
    }

  /**
   * Set additional options for BiDi override.
   */
  public var structuredTextBidiOverrideOptions: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_STRUCTURED_TEXT_BIDI_OVERRIDE_OPTIONS, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_STRUCTURED_TEXT_BIDI_OVERRIDE_OPTIONS, NIL)
    }

  /**
   * If `true`, the caret (text cursor) blinks.
   */
  public var caretBlink: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_IS_CARET_BLINK_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_CARET_BLINK_ENABLED,
          NIL)
    }

  public var caretBlinkSpeed: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_CARET_BLINK_SPEED,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_CARET_BLINK_SPEED,
          NIL)
    }

  /**
   * The caret's column position inside the [godot.LineEdit]. When set, the text may scroll to accommodate it.
   */
  public var caretColumn: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_CARET_COLUMN, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_CARET_COLUMN, NIL)
    }

  /**
   * If `true`, the [godot.LineEdit] will always show the caret, even if focus is lost.
   */
  public var caretForceDisplayed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_IS_CARET_FORCE_DISPLAYED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_CARET_FORCE_DISPLAYED, NIL)
    }

  /**
   * Allow moving caret, selecting and removing the individual composite character components.
   *
   * **Note:** [kbd]Backspace[/kbd] is always removing individual composite character components.
   */
  public var caretMidGrapheme: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_IS_CARET_MID_GRAPHEME_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_CARET_MID_GRAPHEME_ENABLED, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_LINEEDIT)
  }

  /**
   * Erases the [godot.LineEdit]'s [text].
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_CLEAR, NIL)
  }

  /**
   * Selects characters inside [godot.LineEdit] between [from] and [to]. By default, [from] is at the beginning and [to] at the end.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * text = "Welcome"
   *
   * select() # Will select "Welcome".
   *
   * select(4) # Will select "ome".
   *
   * select(2, 5) # Will select "lco".
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * Text = "Welcome";
   *
   * Select(); // Will select "Welcome".
   *
   * Select(4); // Will select "ome".
   *
   * Select(2, 5); // Will select "lco".
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun select(from: Long = 0, to: Long = -1): Unit {
    TransferContext.writeArguments(LONG to from, LONG to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SELECT, NIL)
  }

  /**
   * Selects the whole [godot.String].
   */
  public fun selectAll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SELECT_ALL, NIL)
  }

  /**
   * Clears the current selection.
   */
  public fun deselect(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_DESELECT, NIL)
  }

  /**
   * Returns `true` if the user has selected text.
   */
  public fun hasSelection(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_HAS_SELECTION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the selection begin column.
   */
  public fun getSelectionFromColumn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_SELECTION_FROM_COLUMN,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the selection end column.
   */
  public fun getSelectionToColumn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_SELECTION_TO_COLUMN,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun setOpentypeFeature(tag: String, `value`: Long): Unit {
    TransferContext.writeArguments(STRING to tag, LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_OPENTYPE_FEATURE, NIL)
  }

  public fun getOpentypeFeature(tag: String): Long {
    TransferContext.writeArguments(STRING to tag)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_OPENTYPE_FEATURE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun clearOpentypeFeatures(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_CLEAR_OPENTYPE_FEATURES,
        NIL)
  }

  /**
   * Returns the scroll offset due to [caretColumn], as a number of characters.
   */
  public fun getScrollOffset(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_SCROLL_OFFSET, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Inserts [text] at the caret. If the resulting value is longer than [maxLength], nothing happens.
   */
  public fun insertTextAtCaret(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_INSERT_TEXT_AT_CARET, NIL)
  }

  /**
   * Deletes one character at the caret's current position (equivalent to pressing [kbd]Delete[/kbd]).
   */
  public fun deleteCharAtCaret(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_DELETE_CHAR_AT_CARET, NIL)
  }

  /**
   * Deletes a section of the [text] going from position [fromColumn] to [toColumn]. Both parameters should be within the text's length.
   */
  public fun deleteText(fromColumn: Long, toColumn: Long): Unit {
    TransferContext.writeArguments(LONG to fromColumn, LONG to toColumn)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_DELETE_TEXT, NIL)
  }

  /**
   * Executes a given action as defined in the [enum MenuItems] enum.
   */
  public fun menuOption(option: Long): Unit {
    TransferContext.writeArguments(LONG to option)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_MENU_OPTION, NIL)
  }

  /**
   * Returns the [godot.PopupMenu] of this [godot.LineEdit]. By default, this menu is displayed when right-clicking on the [godot.LineEdit].
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.Window.visible] property.
   */
  public fun getMenu(): PopupMenu? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_MENU, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PopupMenu?
  }

  /**
   * Returns whether the menu is visible. Use this instead of `get_menu().visible` to improve performance (so the creation of the menu is avoided).
   */
  public fun isMenuVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_IS_MENU_VISIBLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
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
     * Pastes the clipboard text over the selected text (or at the caret's position).
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
     * Sets text direction to inherited.
     */
    MENU_DIR_INHERITED(7),
    /**
     * Sets text direction to automatic.
     */
    MENU_DIR_AUTO(8),
    /**
     * Sets text direction to left-to-right.
     */
    MENU_DIR_LTR(9),
    /**
     * Sets text direction to right-to-left.
     */
    MENU_DIR_RTL(10),
    /**
     * Toggles control character display.
     */
    MENU_DISPLAY_UCC(11),
    /**
     * Inserts left-to-right mark (LRM) character.
     */
    MENU_INSERT_LRM(12),
    /**
     * Inserts right-to-left mark (RLM) character.
     */
    MENU_INSERT_RLM(13),
    /**
     * Inserts start of left-to-right embedding (LRE) character.
     */
    MENU_INSERT_LRE(14),
    /**
     * Inserts start of right-to-left embedding (RLE) character.
     */
    MENU_INSERT_RLE(15),
    /**
     * Inserts start of left-to-right override (LRO) character.
     */
    MENU_INSERT_LRO(16),
    /**
     * Inserts start of right-to-left override (RLO) character.
     */
    MENU_INSERT_RLO(17),
    /**
     * Inserts pop direction formatting (PDF) character.
     */
    MENU_INSERT_PDF(18),
    /**
     * Inserts Arabic letter mark (ALM) character.
     */
    MENU_INSERT_ALM(19),
    /**
     * Inserts left-to-right isolate (LRI) character.
     */
    MENU_INSERT_LRI(20),
    /**
     * Inserts right-to-left isolate (RLI) character.
     */
    MENU_INSERT_RLI(21),
    /**
     * Inserts first strong isolate (FSI) character.
     */
    MENU_INSERT_FSI(22),
    /**
     * Inserts pop direction isolate (PDI) character.
     */
    MENU_INSERT_PDI(23),
    /**
     * Inserts zero width joiner (ZWJ) character.
     */
    MENU_INSERT_ZWJ(24),
    /**
     * Inserts zero width non-joiner (ZWNJ) character.
     */
    MENU_INSERT_ZWNJ(25),
    /**
     * Inserts word joiner (WJ) character.
     */
    MENU_INSERT_WJ(26),
    /**
     * Inserts soft hyphen (SHY) character.
     */
    MENU_INSERT_SHY(27),
    /**
     * Represents the size of the [enum MenuItems] enum.
     */
    MENU_MAX(28),
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
