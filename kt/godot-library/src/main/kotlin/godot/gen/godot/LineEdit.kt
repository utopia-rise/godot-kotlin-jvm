// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * An input field for single-line text.
 *
 * [godot.LineEdit] provides an input field for editing a single line of text. It features many built-in shortcuts that are always available ([kbd]Ctrl[/kbd] here maps to [kbd]Cmd[/kbd] on macOS):
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
 * - [kbd]Cmd + F[/kbd]: Same as [kbd]Right Arrow[/kbd], move the caret one character right
 *
 * - [kbd]Cmd + B[/kbd]: Same as [kbd]Left Arrow[/kbd], move the caret one character left
 *
 * - [kbd]Cmd + P[/kbd]: Same as [kbd]Up Arrow[/kbd], move the caret to the previous line
 *
 * - [kbd]Cmd + N[/kbd]: Same as [kbd]Down Arrow[/kbd], move the caret to the next line
 *
 * - [kbd]Cmd + D[/kbd]: Same as [kbd]Delete[/kbd], delete the character on the right side of caret
 *
 * - [kbd]Cmd + H[/kbd]: Same as [kbd]Backspace[/kbd], delete the character on the left side of the caret
 *
 * - [kbd]Cmd + A[/kbd]: Same as [kbd]Home[/kbd], move the caret to the beginning of the line
 *
 * - [kbd]Cmd + E[/kbd]: Same as [kbd]End[/kbd], move the caret to the end of the line
 *
 * - [kbd]Cmd + Left Arrow[/kbd]: Same as [kbd]Home[/kbd], move the caret to the beginning of the line
 *
 * - [kbd]Cmd + Right Arrow[/kbd]: Same as [kbd]End[/kbd], move the caret to the end of the line
 */
@GodotBaseType
public open class LineEdit : Control() {
  /**
   * Emitted when the text changes.
   */
  public val textChanged: Signal1<String> by signal("newText")

  /**
   * Emitted when appending text that overflows the [maxLength]. The appended text is truncated to fit [maxLength], and the part that couldn't fit is passed as the [rejectedSubstring] argument.
   */
  public val textChangeRejected: Signal1<String> by signal("rejectedSubstring")

  /**
   * Emitted when the user presses [KEY_ENTER] on the [godot.LineEdit].
   */
  public val textSubmitted: Signal1<String> by signal("newText")

  /**
   * String value of the [godot.LineEdit].
   *
   * **Note:** Changing text using this property won't emit the [textChanged] signal.
   */
  public var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextPtr, NIL)
    }

  /**
   * Text shown when the [godot.LineEdit] is empty. It is **not** the [godot.LineEdit]'s default value (see [text]).
   */
  public var placeholderText: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPlaceholderPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPlaceholderPtr, NIL)
    }

  /**
   * Text alignment as defined in the [enum HorizontalAlignment] enum.
   */
  public var alignment: HorizontalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHorizontalAlignmentPtr, LONG)
      return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setHorizontalAlignmentPtr, NIL)
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
  public var maxLength: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxLengthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxLengthPtr, NIL)
    }

  /**
   * If `false`, existing text cannot be modified and new text cannot be added.
   */
  public var editable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEditablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEditablePtr, NIL)
    }

  /**
   * If `true`, the [godot.LineEdit] width will increase to stay longer than the [text]. It will **not** compress if the [text] is shortened.
   */
  public var expandToTextLength: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isExpandToTextLengthEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setExpandToTextLengthEnabledPtr, NIL)
    }

  /**
   * If `true`, the context menu will appear when right-clicked.
   */
  public var contextMenuEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isContextMenuEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setContextMenuEnabledPtr, NIL)
    }

  /**
   * If `true`, the native virtual keyboard is shown when focused on platforms that support it.
   */
  public var virtualKeyboardEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isVirtualKeyboardEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVirtualKeyboardEnabledPtr, NIL)
    }

  /**
   * Specifies the type of virtual keyboard to show.
   */
  public var virtualKeyboardType: VirtualKeyboardType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVirtualKeyboardTypePtr, LONG)
      return LineEdit.VirtualKeyboardType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setVirtualKeyboardTypePtr, NIL)
    }

  /**
   * If `true`, the [godot.LineEdit] will show a clear button if [text] is not empty, which can be used to clear the text quickly.
   */
  public var clearButtonEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isClearButtonEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setClearButtonEnabledPtr, NIL)
    }

  /**
   * If `false`, using shortcuts will be disabled.
   */
  public var shortcutKeysEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isShortcutKeysEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShortcutKeysEnabledPtr, NIL)
    }

  /**
   * If `false`, using middle mouse button to paste clipboard will be disabled.
   *
   * **Note:** This method is only implemented on Linux.
   */
  public var middleMousePasteEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMiddleMousePasteEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMiddleMousePasteEnabledPtr, NIL)
    }

  /**
   * If `false`, it's impossible to select the text using mouse nor keyboard.
   */
  public var selectingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSelectingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSelectingEnabledPtr, NIL)
    }

  /**
   * If `true`, the selected text will be deselected when focus is lost.
   */
  public var deselectOnFocusLossEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDeselectOnFocusLossEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDeselectOnFocusLossEnabledPtr, NIL)
    }

  /**
   * If `true`, allow drag and drop of selected text.
   */
  public var dragAndDropSelectionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDragAndDropSelectionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDragAndDropSelectionEnabledPtr, NIL)
    }

  /**
   * Sets the icon that will appear in the right end of the [godot.LineEdit] if there's no [text], or always, if [clearButtonEnabled] is set to `false`.
   */
  public var rightIcon: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRightIconPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRightIconPtr, NIL)
    }

  /**
   * If `true`, the [godot.LineEdit] doesn't display decoration.
   */
  public var flat: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFlatPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlatPtr, NIL)
    }

  /**
   * If `true`, control characters are displayed.
   */
  public var drawControlChars: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDrawControlCharsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawControlCharsPtr, NIL)
    }

  /**
   * If `true`, the [godot.LineEdit] will select the whole text when it gains focus.
   */
  public var selectAllOnFocus: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSelectAllOnFocusPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSelectAllOnFocusPtr, NIL)
    }

  /**
   * If `true`, makes the caret blink.
   */
  public var caretBlink: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCaretBlinkEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCaretBlinkEnabledPtr, NIL)
    }

  /**
   * The interval at which the caret blinks (in seconds).
   */
  public var caretBlinkInterval: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCaretBlinkIntervalPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCaretBlinkIntervalPtr, NIL)
    }

  /**
   * The caret's column position inside the [godot.LineEdit]. When set, the text may scroll to accommodate it.
   */
  public var caretColumn: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCaretColumnPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCaretColumnPtr, NIL)
    }

  /**
   * If `true`, the [godot.LineEdit] will always show the caret, even if focus is lost.
   */
  public var caretForceDisplayed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCaretForceDisplayedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCaretForceDisplayedPtr, NIL)
    }

  /**
   * Allow moving caret, selecting and removing the individual composite character components.
   *
   * **Note:** [kbd]Backspace[/kbd] is always removing individual composite character components.
   */
  public var caretMidGrapheme: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCaretMidGraphemeEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCaretMidGraphemeEnabledPtr, NIL)
    }

  /**
   * If `true`, every character is replaced with the secret character (see [secretCharacter]).
   */
  public var secret: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSecretPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSecretPtr, NIL)
    }

  /**
   * The character to use to mask secret input. Only a single character can be used as the secret character. If it is longer than one character, only the first one will be used. If it is empty, a space will be used instead.
   */
  public var secretCharacter: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSecretCharacterPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSecretCharacterPtr, NIL)
    }

  /**
   * Base text writing direction.
   */
  public var textDirection: Control.TextDirection
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextDirectionPtr, LONG)
      return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextDirectionPtr, NIL)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms. If left empty, current locale is used instead.
   */
  public var language: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLanguagePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLanguagePtr, NIL)
    }

  /**
   * Set BiDi algorithm override for the structured text.
   */
  public var structuredTextBidiOverride: TextServer.StructuredTextParser
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverridePtr, LONG)
      return TextServer.StructuredTextParser.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverridePtr, NIL)
    }

  /**
   * Set additional options for BiDi override.
   */
  public var structuredTextBidiOverrideOptions: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverrideOptionsPtr,
          ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverrideOptionsPtr,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_LINEEDIT, scriptIndex)
    return true
  }

  /**
   * Erases the [godot.LineEdit]'s [text].
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
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
  @JvmOverloads
  public fun select(from: Int = 0, to: Int = -1): Unit {
    TransferContext.writeArguments(LONG to from.toLong(), LONG to to.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.selectPtr, NIL)
  }

  /**
   * Selects the whole [godot.String].
   */
  public fun selectAll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.selectAllPtr, NIL)
  }

  /**
   * Clears the current selection.
   */
  public fun deselect(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.deselectPtr, NIL)
  }

  /**
   * Returns `true` if the user has selected text.
   */
  public fun hasSelection(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasSelectionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the text inside the selection.
   */
  public fun getSelectedText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the selection begin column.
   */
  public fun getSelectionFromColumn(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionFromColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the selection end column.
   */
  public fun getSelectionToColumn(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionToColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the scroll offset due to [caretColumn], as a number of characters.
   */
  public fun getScrollOffset(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScrollOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Inserts [text] at the caret. If the resulting value is longer than [maxLength], nothing happens.
   */
  public fun insertTextAtCaret(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.insertTextAtCaretPtr, NIL)
  }

  /**
   * Deletes one character at the caret's current position (equivalent to pressing [kbd]Delete[/kbd]).
   */
  public fun deleteCharAtCaret(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.deleteCharAtCaretPtr, NIL)
  }

  /**
   * Deletes a section of the [text] going from position [fromColumn] to [toColumn]. Both parameters should be within the text's length.
   */
  public fun deleteText(fromColumn: Int, toColumn: Int): Unit {
    TransferContext.writeArguments(LONG to fromColumn.toLong(), LONG to toColumn.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.deleteTextPtr, NIL)
  }

  /**
   * Executes a given action as defined in the [enum MenuItems] enum.
   */
  public fun menuOption(option: Int): Unit {
    TransferContext.writeArguments(LONG to option.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.menuOptionPtr, NIL)
  }

  /**
   * Returns the [godot.PopupMenu] of this [godot.LineEdit]. By default, this menu is displayed when right-clicking on the [godot.LineEdit].
   *
   * You can add custom menu items or remove standard ones. Make sure your IDs don't conflict with the standard ones (see [enum MenuItems]). For example:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * func _ready():
   *
   *     var menu = get_menu()
   *
   *     # Remove all items after "Redo".
   *
   *     menu.item_count = menu.get_item_index(MENU_REDO) + 1
   *
   *     # Add custom items.
   *
   *     menu.add_separator()
   *
   *     menu.add_item("Insert Date", MENU_MAX + 1)
   *
   *     # Connect callback.
   *
   *     menu.id_pressed.connect(_on_item_pressed)
   *
   *
   *
   * func _on_item_pressed(id):
   *
   *     if id == MENU_MAX + 1:
   *
   *         insert_text_at_caret(Time.get_date_string_from_system())
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * public override void _Ready()
   *
   * {
   *
   *     var menu = GetMenu();
   *
   *     // Remove all items after "Redo".
   *
   *     menu.ItemCount = menu.GetItemIndex(LineEdit.MenuItems.Redo) + 1;
   *
   *     // Add custom items.
   *
   *     menu.AddSeparator();
   *
   *     menu.AddItem("Insert Date", LineEdit.MenuItems.Max + 1);
   *
   *     // Add event handler.
   *
   *     menu.IdPressed += OnItemPressed;
   *
   * }
   *
   *
   *
   * public void OnItemPressed(int id)
   *
   * {
   *
   *     if (id == LineEdit.MenuItems.Max + 1)
   *
   *     {
   *
   *         InsertTextAtCaret(Time.GetDateStringFromSystem());
   *
   *     }
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.Window.visible] property.
   */
  public fun getMenu(): PopupMenu? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMenuPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PopupMenu?)
  }

  /**
   * Returns whether the menu is visible. Use this instead of `get_menu().visible` to improve performance (so the creation of the menu is avoided).
   */
  public fun isMenuVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isMenuVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class MenuItems(
    id: Long,
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
     * ID of "Text Writing Direction" submenu.
     */
    MENU_SUBMENU_TEXT_DIR(7),
    /**
     * Sets text direction to inherited.
     */
    MENU_DIR_INHERITED(8),
    /**
     * Sets text direction to automatic.
     */
    MENU_DIR_AUTO(9),
    /**
     * Sets text direction to left-to-right.
     */
    MENU_DIR_LTR(10),
    /**
     * Sets text direction to right-to-left.
     */
    MENU_DIR_RTL(11),
    /**
     * Toggles control character display.
     */
    MENU_DISPLAY_UCC(12),
    /**
     * ID of "Insert Control Character" submenu.
     */
    MENU_SUBMENU_INSERT_UCC(13),
    /**
     * Inserts left-to-right mark (LRM) character.
     */
    MENU_INSERT_LRM(14),
    /**
     * Inserts right-to-left mark (RLM) character.
     */
    MENU_INSERT_RLM(15),
    /**
     * Inserts start of left-to-right embedding (LRE) character.
     */
    MENU_INSERT_LRE(16),
    /**
     * Inserts start of right-to-left embedding (RLE) character.
     */
    MENU_INSERT_RLE(17),
    /**
     * Inserts start of left-to-right override (LRO) character.
     */
    MENU_INSERT_LRO(18),
    /**
     * Inserts start of right-to-left override (RLO) character.
     */
    MENU_INSERT_RLO(19),
    /**
     * Inserts pop direction formatting (PDF) character.
     */
    MENU_INSERT_PDF(20),
    /**
     * Inserts Arabic letter mark (ALM) character.
     */
    MENU_INSERT_ALM(21),
    /**
     * Inserts left-to-right isolate (LRI) character.
     */
    MENU_INSERT_LRI(22),
    /**
     * Inserts right-to-left isolate (RLI) character.
     */
    MENU_INSERT_RLI(23),
    /**
     * Inserts first strong isolate (FSI) character.
     */
    MENU_INSERT_FSI(24),
    /**
     * Inserts pop direction isolate (PDI) character.
     */
    MENU_INSERT_PDI(25),
    /**
     * Inserts zero width joiner (ZWJ) character.
     */
    MENU_INSERT_ZWJ(26),
    /**
     * Inserts zero width non-joiner (ZWNJ) character.
     */
    MENU_INSERT_ZWNJ(27),
    /**
     * Inserts word joiner (WJ) character.
     */
    MENU_INSERT_WJ(28),
    /**
     * Inserts soft hyphen (SHY) character.
     */
    MENU_INSERT_SHY(29),
    /**
     * Represents the size of the [enum MenuItems] enum.
     */
    MENU_MAX(30),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class VirtualKeyboardType(
    id: Long,
  ) {
    /**
     * Default text virtual keyboard.
     */
    KEYBOARD_TYPE_DEFAULT(0),
    /**
     * Multiline virtual keyboard.
     */
    KEYBOARD_TYPE_MULTILINE(1),
    /**
     * Virtual number keypad, useful for PIN entry.
     */
    KEYBOARD_TYPE_NUMBER(2),
    /**
     * Virtual number keypad, useful for entering fractional numbers.
     */
    KEYBOARD_TYPE_NUMBER_DECIMAL(3),
    /**
     * Virtual phone number keypad.
     */
    KEYBOARD_TYPE_PHONE(4),
    /**
     * Virtual keyboard with additional keys to assist with typing email addresses.
     */
    KEYBOARD_TYPE_EMAIL_ADDRESS(5),
    /**
     * Virtual keyboard for entering a password. On most platforms, this should disable autocomplete and autocapitalization.
     *
     * **Note:** This is not supported on Web. Instead, this behaves identically to [KEYBOARD_TYPE_DEFAULT].
     */
    KEYBOARD_TYPE_PASSWORD(6),
    /**
     * Virtual keyboard with additional keys to assist with typing URLs.
     */
    KEYBOARD_TYPE_URL(7),
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
    public val setHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_horizontal_alignment")

    public val getHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_horizontal_alignment")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "clear")

    public val selectPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "select")

    public val selectAllPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "select_all")

    public val deselectPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "deselect")

    public val hasSelectionPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "has_selection")

    public val getSelectedTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_selected_text")

    public val getSelectionFromColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_selection_from_column")

    public val getSelectionToColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_selection_to_column")

    public val setTextPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "set_text")

    public val getTextPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "get_text")

    public val getDrawControlCharsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_draw_control_chars")

    public val setDrawControlCharsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_draw_control_chars")

    public val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_text_direction")

    public val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_text_direction")

    public val setLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "set_language")

    public val getLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "get_language")

    public val setStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_structured_text_bidi_override")

    public val getStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_structured_text_bidi_override")

    public val setStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_structured_text_bidi_override_options")

    public val getStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_structured_text_bidi_override_options")

    public val setPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_placeholder")

    public val getPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_placeholder")

    public val setCaretColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_caret_column")

    public val getCaretColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_caret_column")

    public val getScrollOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_scroll_offset")

    public val setExpandToTextLengthEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_expand_to_text_length_enabled")

    public val isExpandToTextLengthEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_expand_to_text_length_enabled")

    public val setCaretBlinkEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_caret_blink_enabled")

    public val isCaretBlinkEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_caret_blink_enabled")

    public val setCaretMidGraphemeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_caret_mid_grapheme_enabled")

    public val isCaretMidGraphemeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_caret_mid_grapheme_enabled")

    public val setCaretForceDisplayedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_caret_force_displayed")

    public val isCaretForceDisplayedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_caret_force_displayed")

    public val setCaretBlinkIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_caret_blink_interval")

    public val getCaretBlinkIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_caret_blink_interval")

    public val setMaxLengthPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "set_max_length")

    public val getMaxLengthPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "get_max_length")

    public val insertTextAtCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "insert_text_at_caret")

    public val deleteCharAtCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "delete_char_at_caret")

    public val deleteTextPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "delete_text")

    public val setEditablePtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "set_editable")

    public val isEditablePtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "is_editable")

    public val setSecretPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "set_secret")

    public val isSecretPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "is_secret")

    public val setSecretCharacterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_secret_character")

    public val getSecretCharacterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_secret_character")

    public val menuOptionPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "menu_option")

    public val getMenuPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "get_menu")

    public val isMenuVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_menu_visible")

    public val setContextMenuEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_context_menu_enabled")

    public val isContextMenuEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_context_menu_enabled")

    public val setVirtualKeyboardEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_virtual_keyboard_enabled")

    public val isVirtualKeyboardEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_virtual_keyboard_enabled")

    public val setVirtualKeyboardTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_virtual_keyboard_type")

    public val getVirtualKeyboardTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_virtual_keyboard_type")

    public val setClearButtonEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_clear_button_enabled")

    public val isClearButtonEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_clear_button_enabled")

    public val setShortcutKeysEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_shortcut_keys_enabled")

    public val isShortcutKeysEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_shortcut_keys_enabled")

    public val setMiddleMousePasteEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_middle_mouse_paste_enabled")

    public val isMiddleMousePasteEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_middle_mouse_paste_enabled")

    public val setSelectingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_selecting_enabled")

    public val isSelectingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_selecting_enabled")

    public val setDeselectOnFocusLossEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_deselect_on_focus_loss_enabled")

    public val isDeselectOnFocusLossEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_deselect_on_focus_loss_enabled")

    public val setDragAndDropSelectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_drag_and_drop_selection_enabled")

    public val isDragAndDropSelectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_drag_and_drop_selection_enabled")

    public val setRightIconPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "set_right_icon")

    public val getRightIconPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "get_right_icon")

    public val setFlatPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "set_flat")

    public val isFlatPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "is_flat")

    public val setSelectAllOnFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_select_all_on_focus")

    public val isSelectAllOnFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_select_all_on_focus")
  }
}
