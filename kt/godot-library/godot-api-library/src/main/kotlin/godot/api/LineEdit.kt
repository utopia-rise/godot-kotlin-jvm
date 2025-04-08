// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.HorizontalAlignment
import godot.core.Signal1
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * [LineEdit] provides an input field for editing a single line of text.
 *
 * - When the [LineEdit] control is focused using the keyboard arrow keys, it will only gain focus
 * and not enter edit mode.
 *
 * - To enter edit mode, click on the control with the mouse, see also [keepEditingOnTextSubmit].
 *
 * - To exit edit mode, press `ui_text_submit` or `ui_cancel` (by default [kbd]Escape[/kbd])
 * actions.
 *
 * - Check [edit], [unedit], [isEditing], and [signal editing_toggled] for more information.
 *
 * **Important:**
 *
 * - Focusing the [LineEdit] with `ui_focus_next` (by default [kbd]Tab[/kbd]) or `ui_focus_prev` (by
 * default [kbd]Shift + Tab[/kbd]) or [Control.grabFocus] still enters edit mode (for compatibility).
 *
 * [LineEdit] features many built-in shortcuts that are always available ([kbd]Ctrl[/kbd] here maps
 * to [kbd]Cmd[/kbd] on macOS):
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
 * - [kbd]Cmd + H[/kbd]: Same as [kbd]Backspace[/kbd], delete the character on the left side of the
 * caret
 *
 * - [kbd]Cmd + A[/kbd]: Same as [kbd]Home[/kbd], move the caret to the beginning of the line
 *
 * - [kbd]Cmd + E[/kbd]: Same as [kbd]End[/kbd], move the caret to the end of the line
 *
 * - [kbd]Cmd + Left Arrow[/kbd]: Same as [kbd]Home[/kbd], move the caret to the beginning of the
 * line
 *
 * - [kbd]Cmd + Right Arrow[/kbd]: Same as [kbd]End[/kbd], move the caret to the end of the line
 *
 * **Note:** Caret movement shortcuts listed above are not affected by [shortcutKeysEnabled].
 */
@GodotBaseType
public open class LineEdit : Control() {
  /**
   * Emitted when the text changes.
   */
  public val textChanged: Signal1<String> by Signal1

  /**
   * Emitted when appending text that overflows the [maxLength]. The appended text is truncated to
   * fit [maxLength], and the part that couldn't fit is passed as the [rejectedSubstring] argument.
   */
  public val textChangeRejected: Signal1<String> by Signal1

  /**
   * Emitted when the user presses the `ui_text_submit` action (by default: [kbd]Enter[/kbd] or
   * [kbd]Kp Enter[/kbd]) while the [LineEdit] has focus.
   */
  public val textSubmitted: Signal1<String> by Signal1

  /**
   * Emitted when the [LineEdit] switches in or out of edit mode.
   */
  public val editingToggled: Signal1<Boolean> by Signal1

  /**
   * String value of the [LineEdit].
   *
   * **Note:** Changing text using this property won't emit the [signal text_changed] signal.
   */
  public final inline var text: String
    @JvmName("textProperty")
    get() = getText()
    @JvmName("textProperty")
    set(`value`) {
      setText(value)
    }

  /**
   * Text shown when the [LineEdit] is empty. It is **not** the [LineEdit]'s default value (see
   * [text]).
   */
  public final inline var placeholderText: String
    @JvmName("placeholderTextProperty")
    get() = getPlaceholder()
    @JvmName("placeholderTextProperty")
    set(`value`) {
      setPlaceholder(value)
    }

  /**
   * Text alignment as defined in the [HorizontalAlignment] enum.
   */
  public final inline var alignment: HorizontalAlignment
    @JvmName("alignmentProperty")
    get() = getHorizontalAlignment()
    @JvmName("alignmentProperty")
    set(`value`) {
      setHorizontalAlignment(value)
    }

  /**
   * Maximum number of characters that can be entered inside the [LineEdit]. If `0`, there is no
   * limit.
   *
   * When a limit is defined, characters that would exceed [maxLength] are truncated. This happens
   * both for existing [text] contents when setting the max length, or for new text inserted in the
   * [LineEdit], including pasting.
   *
   * If any input text is truncated, the [signal text_change_rejected] signal is emitted with the
   * truncated substring as parameter:
   *
   * ```gdscript
   * //gdscript
   * text = "Hello world"
   * max_length = 5
   * # `text` becomes "Hello".
   * max_length = 10
   * text += " goodbye"
   * # `text` becomes "Hello good".
   * # `text_change_rejected` is emitted with "bye" as parameter.
   * ```
   *
   * ```csharp
   * //csharp
   * Text = "Hello world";
   * MaxLength = 5;
   * // `Text` becomes "Hello".
   * MaxLength = 10;
   * Text += " goodbye";
   * // `Text` becomes "Hello good".
   * // `text_change_rejected` is emitted with "bye" as parameter.
   * ```
   */
  public final inline var maxLength: Int
    @JvmName("maxLengthProperty")
    get() = getMaxLength()
    @JvmName("maxLengthProperty")
    set(`value`) {
      setMaxLength(value)
    }

  /**
   * If `false`, existing text cannot be modified and new text cannot be added.
   */
  public final inline var editable: Boolean
    @JvmName("editableProperty")
    get() = isEditable()
    @JvmName("editableProperty")
    set(`value`) {
      setEditable(value)
    }

  /**
   * If `true`, the [LineEdit] will not exit edit mode when text is submitted by pressing
   * `ui_text_submit` action (by default: [kbd]Enter[/kbd] or [kbd]Kp Enter[/kbd]).
   */
  public final inline var keepEditingOnTextSubmit: Boolean
    @JvmName("keepEditingOnTextSubmitProperty")
    get() = isEditingKeptOnTextSubmit()
    @JvmName("keepEditingOnTextSubmitProperty")
    set(`value`) {
      setKeepEditingOnTextSubmit(value)
    }

  /**
   * If `true`, the [LineEdit] width will increase to stay longer than the [text]. It will **not**
   * compress if the [text] is shortened.
   */
  public final inline var expandToTextLength: Boolean
    @JvmName("expandToTextLengthProperty")
    get() = isExpandToTextLengthEnabled()
    @JvmName("expandToTextLengthProperty")
    set(`value`) {
      setExpandToTextLengthEnabled(value)
    }

  /**
   * If `true`, the context menu will appear when right-clicked.
   */
  public final inline var contextMenuEnabled: Boolean
    @JvmName("contextMenuEnabledProperty")
    get() = isContextMenuEnabled()
    @JvmName("contextMenuEnabledProperty")
    set(`value`) {
      setContextMenuEnabled(value)
    }

  /**
   * If `true`, "Emoji and Symbols" menu is enabled.
   */
  public final inline var emojiMenuEnabled: Boolean
    @JvmName("emojiMenuEnabledProperty")
    get() = isEmojiMenuEnabled()
    @JvmName("emojiMenuEnabledProperty")
    set(`value`) {
      setEmojiMenuEnabled(value)
    }

  /**
   * If `true`, the native virtual keyboard is shown when focused on platforms that support it.
   */
  public final inline var virtualKeyboardEnabled: Boolean
    @JvmName("virtualKeyboardEnabledProperty")
    get() = isVirtualKeyboardEnabled()
    @JvmName("virtualKeyboardEnabledProperty")
    set(`value`) {
      setVirtualKeyboardEnabled(value)
    }

  /**
   * Specifies the type of virtual keyboard to show.
   */
  public final inline var virtualKeyboardType: VirtualKeyboardType
    @JvmName("virtualKeyboardTypeProperty")
    get() = getVirtualKeyboardType()
    @JvmName("virtualKeyboardTypeProperty")
    set(`value`) {
      setVirtualKeyboardType(value)
    }

  /**
   * If `true`, the [LineEdit] will show a clear button if [text] is not empty, which can be used to
   * clear the text quickly.
   */
  public final inline var clearButtonEnabled: Boolean
    @JvmName("clearButtonEnabledProperty")
    get() = isClearButtonEnabled()
    @JvmName("clearButtonEnabledProperty")
    set(`value`) {
      setClearButtonEnabled(value)
    }

  /**
   * If `true`, shortcut keys for context menu items are enabled, even if the context menu is
   * disabled.
   */
  public final inline var shortcutKeysEnabled: Boolean
    @JvmName("shortcutKeysEnabledProperty")
    get() = isShortcutKeysEnabled()
    @JvmName("shortcutKeysEnabledProperty")
    set(`value`) {
      setShortcutKeysEnabled(value)
    }

  /**
   * If `false`, using middle mouse button to paste clipboard will be disabled.
   *
   * **Note:** This method is only implemented on Linux.
   */
  public final inline var middleMousePasteEnabled: Boolean
    @JvmName("middleMousePasteEnabledProperty")
    get() = isMiddleMousePasteEnabled()
    @JvmName("middleMousePasteEnabledProperty")
    set(`value`) {
      setMiddleMousePasteEnabled(value)
    }

  /**
   * If `false`, it's impossible to select the text using mouse nor keyboard.
   */
  public final inline var selectingEnabled: Boolean
    @JvmName("selectingEnabledProperty")
    get() = isSelectingEnabled()
    @JvmName("selectingEnabledProperty")
    set(`value`) {
      setSelectingEnabled(value)
    }

  /**
   * If `true`, the selected text will be deselected when focus is lost.
   */
  public final inline var deselectOnFocusLossEnabled: Boolean
    @JvmName("deselectOnFocusLossEnabledProperty")
    get() = isDeselectOnFocusLossEnabled()
    @JvmName("deselectOnFocusLossEnabledProperty")
    set(`value`) {
      setDeselectOnFocusLossEnabled(value)
    }

  /**
   * If `true`, allow drag and drop of selected text.
   */
  public final inline var dragAndDropSelectionEnabled: Boolean
    @JvmName("dragAndDropSelectionEnabledProperty")
    get() = isDragAndDropSelectionEnabled()
    @JvmName("dragAndDropSelectionEnabledProperty")
    set(`value`) {
      setDragAndDropSelectionEnabled(value)
    }

  /**
   * Sets the icon that will appear in the right end of the [LineEdit] if there's no [text], or
   * always, if [clearButtonEnabled] is set to `false`.
   */
  public final inline var rightIcon: Texture2D?
    @JvmName("rightIconProperty")
    get() = getRightIcon()
    @JvmName("rightIconProperty")
    set(`value`) {
      setRightIcon(value)
    }

  /**
   * If `true`, the [LineEdit] doesn't display decoration.
   */
  public final inline var flat: Boolean
    @JvmName("flatProperty")
    get() = isFlat()
    @JvmName("flatProperty")
    set(`value`) {
      setFlat(value)
    }

  /**
   * If `true`, control characters are displayed.
   */
  public final inline var drawControlChars: Boolean
    @JvmName("drawControlCharsProperty")
    get() = getDrawControlChars()
    @JvmName("drawControlCharsProperty")
    set(`value`) {
      setDrawControlChars(value)
    }

  /**
   * If `true`, the [LineEdit] will select the whole text when it gains focus.
   */
  public final inline var selectAllOnFocus: Boolean
    @JvmName("selectAllOnFocusProperty")
    get() = isSelectAllOnFocus()
    @JvmName("selectAllOnFocusProperty")
    set(`value`) {
      setSelectAllOnFocus(value)
    }

  /**
   * If `true`, makes the caret blink.
   */
  public final inline var caretBlink: Boolean
    @JvmName("caretBlinkProperty")
    get() = isCaretBlinkEnabled()
    @JvmName("caretBlinkProperty")
    set(`value`) {
      setCaretBlinkEnabled(value)
    }

  /**
   * The interval at which the caret blinks (in seconds).
   */
  public final inline var caretBlinkInterval: Float
    @JvmName("caretBlinkIntervalProperty")
    get() = getCaretBlinkInterval()
    @JvmName("caretBlinkIntervalProperty")
    set(`value`) {
      setCaretBlinkInterval(value)
    }

  /**
   * The caret's column position inside the [LineEdit]. When set, the text may scroll to accommodate
   * it.
   */
  public final inline var caretColumn: Int
    @JvmName("caretColumnProperty")
    get() = getCaretColumn()
    @JvmName("caretColumnProperty")
    set(`value`) {
      setCaretColumn(value)
    }

  /**
   * If `true`, the [LineEdit] will always show the caret, even if not editing or focus is lost.
   */
  public final inline var caretForceDisplayed: Boolean
    @JvmName("caretForceDisplayedProperty")
    get() = isCaretForceDisplayed()
    @JvmName("caretForceDisplayedProperty")
    set(`value`) {
      setCaretForceDisplayed(value)
    }

  /**
   * Allow moving caret, selecting and removing the individual composite character components.
   *
   * **Note:** [kbd]Backspace[/kbd] is always removing individual composite character components.
   */
  public final inline var caretMidGrapheme: Boolean
    @JvmName("caretMidGraphemeProperty")
    get() = isCaretMidGraphemeEnabled()
    @JvmName("caretMidGraphemeProperty")
    set(`value`) {
      setCaretMidGraphemeEnabled(value)
    }

  /**
   * If `true`, every character is replaced with the secret character (see [secretCharacter]).
   */
  public final inline var secret: Boolean
    @JvmName("secretProperty")
    get() = isSecret()
    @JvmName("secretProperty")
    set(`value`) {
      setSecret(value)
    }

  /**
   * The character to use to mask secret input. Only a single character can be used as the secret
   * character. If it is longer than one character, only the first one will be used. If it is empty, a
   * space will be used instead.
   */
  public final inline var secretCharacter: String
    @JvmName("secretCharacterProperty")
    get() = getSecretCharacter()
    @JvmName("secretCharacterProperty")
    set(`value`) {
      setSecretCharacter(value)
    }

  /**
   * Base text writing direction.
   */
  public final inline var textDirection: Control.TextDirection
    @JvmName("textDirectionProperty")
    get() = getTextDirection()
    @JvmName("textDirectionProperty")
    set(`value`) {
      setTextDirection(value)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms. If left empty, current locale
   * is used instead.
   */
  public final inline var language: String
    @JvmName("languageProperty")
    get() = getLanguage()
    @JvmName("languageProperty")
    set(`value`) {
      setLanguage(value)
    }

  /**
   * Set BiDi algorithm override for the structured text.
   */
  public final inline var structuredTextBidiOverride: TextServer.StructuredTextParser
    @JvmName("structuredTextBidiOverrideProperty")
    get() = getStructuredTextBidiOverride()
    @JvmName("structuredTextBidiOverrideProperty")
    set(`value`) {
      setStructuredTextBidiOverride(value)
    }

  /**
   * Set additional options for BiDi override.
   */
  public final inline var structuredTextBidiOverrideOptions: VariantArray<Any?>
    @JvmName("structuredTextBidiOverrideOptionsProperty")
    get() = getStructuredTextBidiOverrideOptions()
    @JvmName("structuredTextBidiOverrideOptionsProperty")
    set(`value`) {
      setStructuredTextBidiOverrideOptions(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(340, scriptIndex)
  }

  /**
   * Returns `true` if the user has text in the
   * [url=https://en.wikipedia.org/wiki/Input_method]Input Method Editor[/url] (IME).
   */
  public final fun hasImeText(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasImeTextPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Closes the [url=https://en.wikipedia.org/wiki/Input_method]Input Method Editor[/url] (IME) if
   * it is open. Any text in the IME will be lost.
   */
  public final fun cancelIme(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.cancelImePtr, NIL)
  }

  /**
   * Applies text from the [url=https://en.wikipedia.org/wiki/Input_method]Input Method Editor[/url]
   * (IME) and closes the IME if it is open.
   */
  public final fun applyIme(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.applyImePtr, NIL)
  }

  public final fun setHorizontalAlignment(alignment: HorizontalAlignment): Unit {
    TransferContext.writeArguments(LONG to alignment.id)
    TransferContext.callMethod(ptr, MethodBindings.setHorizontalAlignmentPtr, NIL)
  }

  public final fun getHorizontalAlignment(): HorizontalAlignment {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHorizontalAlignmentPtr, LONG)
    return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Allows entering edit mode whether the [LineEdit] is focused or not.
   *
   * See also [keepEditingOnTextSubmit].
   */
  public final fun edit(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.editPtr, NIL)
  }

  /**
   * Allows exiting edit mode while preserving focus.
   */
  public final fun unedit(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.uneditPtr, NIL)
  }

  /**
   * Returns whether the [LineEdit] is being edited.
   */
  public final fun isEditing(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEditingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setKeepEditingOnTextSubmit(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setKeepEditingOnTextSubmitPtr, NIL)
  }

  public final fun isEditingKeptOnTextSubmit(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEditingKeptOnTextSubmitPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Erases the [LineEdit]'s [text].
   */
  public final fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Selects characters inside [LineEdit] between [from] and [to]. By default, [from] is at the
   * beginning and [to] at the end.
   *
   * ```gdscript
   * //gdscript
   * text = "Welcome"
   * select() # Will select "Welcome".
   * select(4) # Will select "ome".
   * select(2, 5) # Will select "lco".
   * ```
   *
   * ```csharp
   * //csharp
   * Text = "Welcome";
   * Select(); // Will select "Welcome".
   * Select(4); // Will select "ome".
   * Select(2, 5); // Will select "lco".
   * ```
   */
  @JvmOverloads
  public final fun select(from: Int = 0, to: Int = -1): Unit {
    TransferContext.writeArguments(LONG to from.toLong(), LONG to to.toLong())
    TransferContext.callMethod(ptr, MethodBindings.selectPtr, NIL)
  }

  /**
   * Selects the whole [String].
   */
  public final fun selectAll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.selectAllPtr, NIL)
  }

  /**
   * Clears the current selection.
   */
  public final fun deselect(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.deselectPtr, NIL)
  }

  /**
   * Returns `true` if an "undo" action is available.
   */
  public final fun hasUndo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasUndoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if a "redo" action is available.
   */
  public final fun hasRedo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasRedoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the user has selected text.
   */
  public final fun hasSelection(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasSelectionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the text inside the selection.
   */
  public final fun getSelectedText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSelectedTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the selection begin column.
   */
  public final fun getSelectionFromColumn(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSelectionFromColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the selection end column.
   */
  public final fun getSelectionToColumn(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSelectionToColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setText(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(ptr, MethodBindings.setTextPtr, NIL)
  }

  public final fun getText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun getDrawControlChars(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDrawControlCharsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDrawControlChars(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setDrawControlCharsPtr, NIL)
  }

  public final fun setTextDirection(direction: Control.TextDirection): Unit {
    TransferContext.writeArguments(LONG to direction.id)
    TransferContext.callMethod(ptr, MethodBindings.setTextDirectionPtr, NIL)
  }

  public final fun getTextDirection(): Control.TextDirection {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextDirectionPtr, LONG)
    return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setLanguage(language: String): Unit {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(ptr, MethodBindings.setLanguagePtr, NIL)
  }

  public final fun getLanguage(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setStructuredTextBidiOverride(parser: TextServer.StructuredTextParser): Unit {
    TransferContext.writeArguments(LONG to parser.id)
    TransferContext.callMethod(ptr, MethodBindings.setStructuredTextBidiOverridePtr, NIL)
  }

  public final fun getStructuredTextBidiOverride(): TextServer.StructuredTextParser {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStructuredTextBidiOverridePtr, LONG)
    return TextServer.StructuredTextParser.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setStructuredTextBidiOverrideOptions(args: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to args)
    TransferContext.callMethod(ptr, MethodBindings.setStructuredTextBidiOverrideOptionsPtr, NIL)
  }

  public final fun getStructuredTextBidiOverrideOptions(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStructuredTextBidiOverrideOptionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  public final fun setPlaceholder(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(ptr, MethodBindings.setPlaceholderPtr, NIL)
  }

  public final fun getPlaceholder(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPlaceholderPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setCaretColumn(position: Int): Unit {
    TransferContext.writeArguments(LONG to position.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setCaretColumnPtr, NIL)
  }

  public final fun getCaretColumn(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCaretColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the scroll offset due to [caretColumn], as a number of characters.
   */
  public final fun getScrollOffset(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getScrollOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setExpandToTextLengthEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setExpandToTextLengthEnabledPtr, NIL)
  }

  public final fun isExpandToTextLengthEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isExpandToTextLengthEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCaretBlinkEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setCaretBlinkEnabledPtr, NIL)
  }

  public final fun isCaretBlinkEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCaretBlinkEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCaretMidGraphemeEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setCaretMidGraphemeEnabledPtr, NIL)
  }

  public final fun isCaretMidGraphemeEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCaretMidGraphemeEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCaretForceDisplayed(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setCaretForceDisplayedPtr, NIL)
  }

  public final fun isCaretForceDisplayed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCaretForceDisplayedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCaretBlinkInterval(interval: Float): Unit {
    TransferContext.writeArguments(DOUBLE to interval.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setCaretBlinkIntervalPtr, NIL)
  }

  public final fun getCaretBlinkInterval(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCaretBlinkIntervalPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMaxLength(chars: Int): Unit {
    TransferContext.writeArguments(LONG to chars.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMaxLengthPtr, NIL)
  }

  public final fun getMaxLength(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxLengthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Inserts [text] at the caret. If the resulting value is longer than [maxLength], nothing
   * happens.
   */
  public final fun insertTextAtCaret(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(ptr, MethodBindings.insertTextAtCaretPtr, NIL)
  }

  /**
   * Deletes one character at the caret's current position (equivalent to pressing
   * [kbd]Delete[/kbd]).
   */
  public final fun deleteCharAtCaret(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.deleteCharAtCaretPtr, NIL)
  }

  /**
   * Deletes a section of the [text] going from position [fromColumn] to [toColumn]. Both parameters
   * should be within the text's length.
   */
  public final fun deleteText(fromColumn: Int, toColumn: Int): Unit {
    TransferContext.writeArguments(LONG to fromColumn.toLong(), LONG to toColumn.toLong())
    TransferContext.callMethod(ptr, MethodBindings.deleteTextPtr, NIL)
  }

  public final fun setEditable(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setEditablePtr, NIL)
  }

  public final fun isEditable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEditablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSecret(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setSecretPtr, NIL)
  }

  public final fun isSecret(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSecretPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSecretCharacter(character: String): Unit {
    TransferContext.writeArguments(STRING to character)
    TransferContext.callMethod(ptr, MethodBindings.setSecretCharacterPtr, NIL)
  }

  public final fun getSecretCharacter(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSecretCharacterPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Executes a given action as defined in the [MenuItems] enum.
   */
  public final fun menuOption(option: Int): Unit {
    TransferContext.writeArguments(LONG to option.toLong())
    TransferContext.callMethod(ptr, MethodBindings.menuOptionPtr, NIL)
  }

  /**
   * Returns the [PopupMenu] of this [LineEdit]. By default, this menu is displayed when
   * right-clicking on the [LineEdit].
   *
   * You can add custom menu items or remove standard ones. Make sure your IDs don't conflict with
   * the standard ones (see [MenuItems]). For example:
   *
   * ```gdscript
   * //gdscript
   * func _ready():
   *     var menu = get_menu()
   *     # Remove all items after "Redo".
   *     menu.item_count = menu.get_item_index(MENU_REDO) + 1
   *     # Add custom items.
   *     menu.add_separator()
   *     menu.add_item("Insert Date", MENU_MAX + 1)
   *     # Connect callback.
   *     menu.id_pressed.connect(_on_item_pressed)
   *
   * func _on_item_pressed(id):
   *     if id == MENU_MAX + 1:
   *         insert_text_at_caret(Time.get_date_string_from_system())
   * ```
   *
   * ```csharp
   * //csharp
   * public override void _Ready()
   * {
   *     var menu = GetMenu();
   *     // Remove all items after "Redo".
   *     menu.ItemCount = menu.GetItemIndex(LineEdit.MenuItems.Redo) + 1;
   *     // Add custom items.
   *     menu.AddSeparator();
   *     menu.AddItem("Insert Date", LineEdit.MenuItems.Max + 1);
   *     // Add event handler.
   *     menu.IdPressed += OnItemPressed;
   * }
   *
   * public void OnItemPressed(int id)
   * {
   *     if (id == LineEdit.MenuItems.Max + 1)
   *     {
   *         InsertTextAtCaret(Time.GetDateStringFromSystem());
   *     }
   * }
   * ```
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [Window.visible] property.
   */
  public final fun getMenu(): PopupMenu? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMenuPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as PopupMenu?)
  }

  /**
   * Returns whether the menu is visible. Use this instead of `get_menu().visible` to improve
   * performance (so the creation of the menu is avoided).
   */
  public final fun isMenuVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isMenuVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setContextMenuEnabled(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setContextMenuEnabledPtr, NIL)
  }

  public final fun isContextMenuEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isContextMenuEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setEmojiMenuEnabled(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setEmojiMenuEnabledPtr, NIL)
  }

  public final fun isEmojiMenuEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEmojiMenuEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setVirtualKeyboardEnabled(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setVirtualKeyboardEnabledPtr, NIL)
  }

  public final fun isVirtualKeyboardEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isVirtualKeyboardEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setVirtualKeyboardType(type: VirtualKeyboardType): Unit {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(ptr, MethodBindings.setVirtualKeyboardTypePtr, NIL)
  }

  public final fun getVirtualKeyboardType(): VirtualKeyboardType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVirtualKeyboardTypePtr, LONG)
    return VirtualKeyboardType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setClearButtonEnabled(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setClearButtonEnabledPtr, NIL)
  }

  public final fun isClearButtonEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isClearButtonEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setShortcutKeysEnabled(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setShortcutKeysEnabledPtr, NIL)
  }

  public final fun isShortcutKeysEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isShortcutKeysEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMiddleMousePasteEnabled(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setMiddleMousePasteEnabledPtr, NIL)
  }

  public final fun isMiddleMousePasteEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isMiddleMousePasteEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSelectingEnabled(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setSelectingEnabledPtr, NIL)
  }

  public final fun isSelectingEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSelectingEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDeselectOnFocusLossEnabled(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setDeselectOnFocusLossEnabledPtr, NIL)
  }

  public final fun isDeselectOnFocusLossEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDeselectOnFocusLossEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDragAndDropSelectionEnabled(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setDragAndDropSelectionEnabledPtr, NIL)
  }

  public final fun isDragAndDropSelectionEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDragAndDropSelectionEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setRightIcon(icon: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to icon)
    TransferContext.callMethod(ptr, MethodBindings.setRightIconPtr, NIL)
  }

  public final fun getRightIcon(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRightIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setFlat(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setFlatPtr, NIL)
  }

  public final fun isFlat(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isFlatPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSelectAllOnFocus(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setSelectAllOnFocusPtr, NIL)
  }

  public final fun isSelectAllOnFocus(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSelectAllOnFocusPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public enum class MenuItems(
    id: Long,
  ) {
    /**
     * Cuts (copies and clears) the selected text.
     */
    CUT(0),
    /**
     * Copies the selected text.
     */
    COPY(1),
    /**
     * Pastes the clipboard text over the selected text (or at the caret's position).
     *
     * Non-printable escape characters are automatically stripped from the OS clipboard via
     * [String.stripEscapes].
     */
    PASTE(2),
    /**
     * Erases the whole [LineEdit] text.
     */
    CLEAR(3),
    /**
     * Selects the whole [LineEdit] text.
     */
    SELECT_ALL(4),
    /**
     * Undoes the previous action.
     */
    UNDO(5),
    /**
     * Reverse the last undo action.
     */
    REDO(6),
    /**
     * ID of "Text Writing Direction" submenu.
     */
    SUBMENU_TEXT_DIR(7),
    /**
     * Sets text direction to inherited.
     */
    DIR_INHERITED(8),
    /**
     * Sets text direction to automatic.
     */
    DIR_AUTO(9),
    /**
     * Sets text direction to left-to-right.
     */
    DIR_LTR(10),
    /**
     * Sets text direction to right-to-left.
     */
    DIR_RTL(11),
    /**
     * Toggles control character display.
     */
    DISPLAY_UCC(12),
    /**
     * ID of "Insert Control Character" submenu.
     */
    SUBMENU_INSERT_UCC(13),
    /**
     * Inserts left-to-right mark (LRM) character.
     */
    INSERT_LRM(14),
    /**
     * Inserts right-to-left mark (RLM) character.
     */
    INSERT_RLM(15),
    /**
     * Inserts start of left-to-right embedding (LRE) character.
     */
    INSERT_LRE(16),
    /**
     * Inserts start of right-to-left embedding (RLE) character.
     */
    INSERT_RLE(17),
    /**
     * Inserts start of left-to-right override (LRO) character.
     */
    INSERT_LRO(18),
    /**
     * Inserts start of right-to-left override (RLO) character.
     */
    INSERT_RLO(19),
    /**
     * Inserts pop direction formatting (PDF) character.
     */
    INSERT_PDF(20),
    /**
     * Inserts Arabic letter mark (ALM) character.
     */
    INSERT_ALM(21),
    /**
     * Inserts left-to-right isolate (LRI) character.
     */
    INSERT_LRI(22),
    /**
     * Inserts right-to-left isolate (RLI) character.
     */
    INSERT_RLI(23),
    /**
     * Inserts first strong isolate (FSI) character.
     */
    INSERT_FSI(24),
    /**
     * Inserts pop direction isolate (PDI) character.
     */
    INSERT_PDI(25),
    /**
     * Inserts zero width joiner (ZWJ) character.
     */
    INSERT_ZWJ(26),
    /**
     * Inserts zero width non-joiner (ZWNJ) character.
     */
    INSERT_ZWNJ(27),
    /**
     * Inserts word joiner (WJ) character.
     */
    INSERT_WJ(28),
    /**
     * Inserts soft hyphen (SHY) character.
     */
    INSERT_SHY(29),
    /**
     * Opens system emoji and symbol picker.
     */
    EMOJI_AND_SYMBOL(30),
    /**
     * Represents the size of the [MenuItems] enum.
     */
    MAX(31),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): MenuItems = entries.single { it.id == `value` }
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
     * Virtual keyboard for entering a password. On most platforms, this should disable autocomplete
     * and autocapitalization.
     *
     * **Note:** This is not supported on Web. Instead, this behaves identically to
     * [KEYBOARD_TYPE_DEFAULT].
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
      public fun from(`value`: Long): VirtualKeyboardType = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val hasImeTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "has_ime_text", 36873697)

    internal val cancelImePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "cancel_ime", 3218959716)

    internal val applyImePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "apply_ime", 3218959716)

    internal val setHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_horizontal_alignment", 2312603777)

    internal val getHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_horizontal_alignment", 341400642)

    internal val editPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "edit", 3218959716)

    internal val uneditPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "unedit", 3218959716)

    internal val isEditingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_editing", 36873697)

    internal val setKeepEditingOnTextSubmitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_keep_editing_on_text_submit", 2586408642)

    internal val isEditingKeptOnTextSubmitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_editing_kept_on_text_submit", 36873697)

    internal val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "clear", 3218959716)

    internal val selectPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "select", 1328111411)

    internal val selectAllPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "select_all", 3218959716)

    internal val deselectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "deselect", 3218959716)

    internal val hasUndoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "has_undo", 36873697)

    internal val hasRedoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "has_redo", 36873697)

    internal val hasSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "has_selection", 36873697)

    internal val getSelectedTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_selected_text", 2841200299)

    internal val getSelectionFromColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_selection_from_column", 3905245786)

    internal val getSelectionToColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_selection_to_column", 3905245786)

    internal val setTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_text", 83702148)

    internal val getTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_text", 201670096)

    internal val getDrawControlCharsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_draw_control_chars", 36873697)

    internal val setDrawControlCharsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_draw_control_chars", 2586408642)

    internal val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_text_direction", 119160795)

    internal val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_text_direction", 797257663)

    internal val setLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_language", 83702148)

    internal val getLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_language", 201670096)

    internal val setStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_structured_text_bidi_override", 55961453)

    internal val getStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_structured_text_bidi_override", 3385126229)

    internal val setStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_structured_text_bidi_override_options", 381264803)

    internal val getStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_structured_text_bidi_override_options", 3995934104)

    internal val setPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_placeholder", 83702148)

    internal val getPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_placeholder", 201670096)

    internal val setCaretColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_caret_column", 1286410249)

    internal val getCaretColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_caret_column", 3905245786)

    internal val getScrollOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_scroll_offset", 1740695150)

    internal val setExpandToTextLengthEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_expand_to_text_length_enabled", 2586408642)

    internal val isExpandToTextLengthEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_expand_to_text_length_enabled", 36873697)

    internal val setCaretBlinkEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_caret_blink_enabled", 2586408642)

    internal val isCaretBlinkEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_caret_blink_enabled", 36873697)

    internal val setCaretMidGraphemeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_caret_mid_grapheme_enabled", 2586408642)

    internal val isCaretMidGraphemeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_caret_mid_grapheme_enabled", 36873697)

    internal val setCaretForceDisplayedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_caret_force_displayed", 2586408642)

    internal val isCaretForceDisplayedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_caret_force_displayed", 36873697)

    internal val setCaretBlinkIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_caret_blink_interval", 373806689)

    internal val getCaretBlinkIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_caret_blink_interval", 1740695150)

    internal val setMaxLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_max_length", 1286410249)

    internal val getMaxLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_max_length", 3905245786)

    internal val insertTextAtCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "insert_text_at_caret", 83702148)

    internal val deleteCharAtCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "delete_char_at_caret", 3218959716)

    internal val deleteTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "delete_text", 3937882851)

    internal val setEditablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_editable", 2586408642)

    internal val isEditablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_editable", 36873697)

    internal val setSecretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_secret", 2586408642)

    internal val isSecretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_secret", 36873697)

    internal val setSecretCharacterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_secret_character", 83702148)

    internal val getSecretCharacterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_secret_character", 201670096)

    internal val menuOptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "menu_option", 1286410249)

    internal val getMenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_menu", 229722558)

    internal val isMenuVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_menu_visible", 36873697)

    internal val setContextMenuEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_context_menu_enabled", 2586408642)

    internal val isContextMenuEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_context_menu_enabled", 2240911060)

    internal val setEmojiMenuEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_emoji_menu_enabled", 2586408642)

    internal val isEmojiMenuEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_emoji_menu_enabled", 36873697)

    internal val setVirtualKeyboardEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_virtual_keyboard_enabled", 2586408642)

    internal val isVirtualKeyboardEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_virtual_keyboard_enabled", 36873697)

    internal val setVirtualKeyboardTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_virtual_keyboard_type", 2696893573)

    internal val getVirtualKeyboardTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_virtual_keyboard_type", 1928699316)

    internal val setClearButtonEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_clear_button_enabled", 2586408642)

    internal val isClearButtonEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_clear_button_enabled", 36873697)

    internal val setShortcutKeysEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_shortcut_keys_enabled", 2586408642)

    internal val isShortcutKeysEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_shortcut_keys_enabled", 36873697)

    internal val setMiddleMousePasteEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_middle_mouse_paste_enabled", 2586408642)

    internal val isMiddleMousePasteEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_middle_mouse_paste_enabled", 36873697)

    internal val setSelectingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_selecting_enabled", 2586408642)

    internal val isSelectingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_selecting_enabled", 36873697)

    internal val setDeselectOnFocusLossEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_deselect_on_focus_loss_enabled", 2586408642)

    internal val isDeselectOnFocusLossEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_deselect_on_focus_loss_enabled", 36873697)

    internal val setDragAndDropSelectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_drag_and_drop_selection_enabled", 2586408642)

    internal val isDragAndDropSelectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_drag_and_drop_selection_enabled", 36873697)

    internal val setRightIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_right_icon", 4051416890)

    internal val getRightIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "get_right_icon", 255860311)

    internal val setFlatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_flat", 2586408642)

    internal val isFlatPtr: VoidPtr = TypeManager.getMethodBindPtr("LineEdit", "is_flat", 36873697)

    internal val setSelectAllOnFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "set_select_all_on_focus", 2586408642)

    internal val isSelectAllOnFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LineEdit", "is_select_all_on_focus", 36873697)
  }
}
