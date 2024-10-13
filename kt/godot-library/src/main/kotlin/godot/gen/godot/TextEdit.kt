// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.Callable
import godot.core.Color
import godot.core.PackedInt32Array
import godot.core.PackedStringArray
import godot.core.Rect2i
import godot.core.Signal0
import godot.core.Signal2
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.CALLABLE
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.RECT2I
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser.VECTOR2I
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.memory.TransferContext
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
 * A multiline text editor. It also has limited facilities for editing code, such as syntax
 * highlighting support. For more advanced facilities for editing code, see [CodeEdit].
 * **Note:** Most viewport, caret, and edit methods contain a `caret_index` argument for
 * [caretMultiple] support. The argument should be one of the following: `-1` for all carets, `0` for
 * the main caret, or greater than `0` for secondary carets in the order they were created.
 * **Note:** When holding down [kbd]Alt[/kbd], the vertical scroll wheel will scroll 5 times as fast
 * as it would normally do. This also works in the Godot script editor.
 */
@GodotBaseType
public open class TextEdit : Control() {
  /**
   * Emitted when [clear] is called or [text] is set.
   */
  public val textSet: Signal0 by Signal0

  /**
   * Emitted when the text changes.
   */
  public val textChanged: Signal0 by Signal0

  /**
   * Emitted immediately when the text changes.
   * When text is added [fromLine] will be less than [toLine]. On a remove [toLine] will be less
   * than [fromLine].
   */
  public val linesEditedFrom: Signal2<Long, Long> by Signal2

  /**
   * Emitted when any caret changes position.
   */
  public val caretChanged: Signal0 by Signal0

  /**
   * Emitted when a gutter is clicked.
   */
  public val gutterClicked: Signal2<Long, Long> by Signal2

  /**
   * Emitted when a gutter is added.
   */
  public val gutterAdded: Signal0 by Signal0

  /**
   * Emitted when a gutter is removed.
   */
  public val gutterRemoved: Signal0 by Signal0

  /**
   * String value of the [TextEdit].
   */
  public final inline var text: String
    @JvmName("textProperty")
    get() = getText()
    @JvmName("textProperty")
    set(`value`) {
      setText(value)
    }

  /**
   * Text shown when the [TextEdit] is empty. It is **not** the [TextEdit]'s default value (see
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
   * If `true`, a right-click displays the context menu.
   */
  public final inline var contextMenuEnabled: Boolean
    @JvmName("contextMenuEnabledProperty")
    get() = isContextMenuEnabled()
    @JvmName("contextMenuEnabledProperty")
    set(`value`) {
      setContextMenuEnabled(value)
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
   * If `true`, text can be selected.
   * If `false`, text can not be selected by the user or by the [select] or [selectAll] methods.
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
   * If `true`, allow drag and drop of selected text. Text can still be dropped from other sources.
   */
  public final inline var dragAndDropSelectionEnabled: Boolean
    @JvmName("dragAndDropSelectionEnabledProperty")
    get() = isDragAndDropSelectionEnabled()
    @JvmName("dragAndDropSelectionEnabledProperty")
    set(`value`) {
      setDragAndDropSelectionEnabled(value)
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
   * If `false`, using middle mouse button to paste clipboard will be disabled.
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
   * Sets the line wrapping mode to use.
   */
  public final inline var wrapMode: LineWrappingMode
    @JvmName("wrapModeProperty")
    get() = getLineWrappingMode()
    @JvmName("wrapModeProperty")
    set(`value`) {
      setLineWrappingMode(value)
    }

  /**
   * If [wrapMode] is set to [LINE_WRAPPING_BOUNDARY], sets text wrapping mode. To see how each mode
   * behaves, see [TextServer.AutowrapMode].
   */
  public final inline var autowrapMode: TextServer.AutowrapMode
    @JvmName("autowrapModeProperty")
    get() = getAutowrapMode()
    @JvmName("autowrapModeProperty")
    set(`value`) {
      setAutowrapMode(value)
    }

  /**
   * If `true`, all wrapped lines are indented to the same amount as the unwrapped line.
   */
  public final inline var indentWrappedLines: Boolean
    @JvmName("indentWrappedLinesProperty")
    get() = isIndentWrappedLines()
    @JvmName("indentWrappedLinesProperty")
    set(`value`) {
      setIndentWrappedLines(value)
    }

  /**
   * Scroll smoothly over the text rather than jumping to the next location.
   */
  public final inline var scrollSmooth: Boolean
    @JvmName("scrollSmoothProperty")
    get() = isSmoothScrollEnabled()
    @JvmName("scrollSmoothProperty")
    set(`value`) {
      setSmoothScrollEnabled(value)
    }

  /**
   * Sets the scroll speed with the minimap or when [scrollSmooth] is enabled.
   */
  public final inline var scrollVScrollSpeed: Float
    @JvmName("scrollVScrollSpeedProperty")
    get() = getVScrollSpeed()
    @JvmName("scrollVScrollSpeedProperty")
    set(`value`) {
      setVScrollSpeed(value)
    }

  /**
   * Allow scrolling past the last line into "virtual" space.
   */
  public final inline var scrollPastEndOfFile: Boolean
    @JvmName("scrollPastEndOfFileProperty")
    get() = isScrollPastEndOfFileEnabled()
    @JvmName("scrollPastEndOfFileProperty")
    set(`value`) {
      setScrollPastEndOfFileEnabled(value)
    }

  /**
   * If there is a vertical scrollbar, this determines the current vertical scroll value in line
   * numbers, starting at 0 for the top line.
   */
  public final inline var scrollVertical: Double
    @JvmName("scrollVerticalProperty")
    get() = getVScroll()
    @JvmName("scrollVerticalProperty")
    set(`value`) {
      setVScroll(value)
    }

  /**
   * If there is a horizontal scrollbar, this determines the current horizontal scroll value in
   * pixels.
   */
  public final inline var scrollHorizontal: Int
    @JvmName("scrollHorizontalProperty")
    get() = getHScroll()
    @JvmName("scrollHorizontalProperty")
    set(`value`) {
      setHScroll(value)
    }

  /**
   * If `true`, [TextEdit] will disable vertical scroll and fit minimum height to the number of
   * visible lines.
   */
  public final inline var scrollFitContentHeight: Boolean
    @JvmName("scrollFitContentHeightProperty")
    get() = isFitContentHeightEnabled()
    @JvmName("scrollFitContentHeightProperty")
    set(`value`) {
      setFitContentHeightEnabled(value)
    }

  /**
   * If `true`, a minimap is shown, providing an outline of your source code. The minimap uses a
   * fixed-width text size.
   */
  public final inline var minimapDraw: Boolean
    @JvmName("minimapDrawProperty")
    get() = isDrawingMinimap()
    @JvmName("minimapDrawProperty")
    set(`value`) {
      setDrawMinimap(value)
    }

  /**
   * The width, in pixels, of the minimap.
   */
  public final inline var minimapWidth: Int
    @JvmName("minimapWidthProperty")
    get() = getMinimapWidth()
    @JvmName("minimapWidthProperty")
    set(`value`) {
      setMinimapWidth(value)
    }

  /**
   * Set the type of caret to draw.
   */
  public final inline var caretType: CaretType
    @JvmName("caretTypeProperty")
    get() = getCaretType()
    @JvmName("caretTypeProperty")
    set(`value`) {
      setCaretType(value)
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
   * If `true`, caret will be visible when [editable] is disabled.
   */
  public final inline var caretDrawWhenEditableDisabled: Boolean
    @JvmName("caretDrawWhenEditableDisabledProperty")
    get() = isDrawingCaretWhenEditableDisabled()
    @JvmName("caretDrawWhenEditableDisabledProperty")
    set(`value`) {
      setDrawCaretWhenEditableDisabled(value)
    }

  /**
   * If `true`, a right-click moves the caret at the mouse position before displaying the context
   * menu.
   * If `false`, the context menu ignores mouse location.
   */
  public final inline var caretMoveOnRightClick: Boolean
    @JvmName("caretMoveOnRightClickProperty")
    get() = isMoveCaretOnRightClickEnabled()
    @JvmName("caretMoveOnRightClickProperty")
    set(`value`) {
      setMoveCaretOnRightClickEnabled(value)
    }

  /**
   * Allow moving caret, selecting and removing the individual composite character components.
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
   * Sets if multiple carets are allowed.
   */
  public final inline var caretMultiple: Boolean
    @JvmName("caretMultipleProperty")
    get() = isMultipleCaretsEnabled()
    @JvmName("caretMultipleProperty")
    set(`value`) {
      setMultipleCaretsEnabled(value)
    }

  /**
   * If `false`, using [kbd]Ctrl + Left[/kbd] or [kbd]Ctrl + Right[/kbd] ([kbd]Cmd + Left[/kbd] or
   * [kbd]Cmd + Right[/kbd] on macOS) bindings will stop moving caret only if a space or punctuation is
   * detected. If `true`, it will also stop the caret if a character is part of
   * `!"#$&#37;&'()*+,-./:;<=>?@[\]^`{|}~`, the Unicode General Punctuation table, or the Unicode CJK
   * Punctuation table. Useful for subword moving. This behavior also will be applied to the behavior
   * of text selection.
   */
  public final inline var useDefaultWordSeparators: Boolean
    @JvmName("useDefaultWordSeparatorsProperty")
    get() = isDefaultWordSeparatorsEnabled()
    @JvmName("useDefaultWordSeparatorsProperty")
    set(`value`) {
      setUseDefaultWordSeparators(value)
    }

  /**
   * If `false`, using [kbd]Ctrl + Left[/kbd] or [kbd]Ctrl + Right[/kbd] ([kbd]Cmd + Left[/kbd] or
   * [kbd]Cmd + Right[/kbd] on macOS) bindings will use the behavior of [useDefaultWordSeparators]. If
   * `true`, it will also stop the caret if a character within [customWordSeparators] is detected.
   * Useful for subword moving. This behavior also will be applied to the behavior of text selection.
   */
  public final inline var useCustomWordSeparators: Boolean
    @JvmName("useCustomWordSeparatorsProperty")
    get() = isCustomWordSeparatorsEnabled()
    @JvmName("useCustomWordSeparatorsProperty")
    set(`value`) {
      setUseCustomWordSeparators(value)
    }

  /**
   * The characters to consider as word delimiters if [useCustomWordSeparators] is `true`. The
   * characters should be defined without separation, for example `#_!`.
   */
  public final inline var customWordSeparators: String
    @JvmName("customWordSeparatorsProperty")
    get() = getCustomWordSeparators()
    @JvmName("customWordSeparatorsProperty")
    set(`value`) {
      setCustomWordSeparators(value)
    }

  /**
   * Sets the [SyntaxHighlighter] to use.
   */
  public final inline var syntaxHighlighter: SyntaxHighlighter?
    @JvmName("syntaxHighlighterProperty")
    get() = getSyntaxHighlighter()
    @JvmName("syntaxHighlighterProperty")
    set(`value`) {
      setSyntaxHighlighter(value)
    }

  /**
   * If `true`, all occurrences of the selected text will be highlighted.
   */
  public final inline var highlightAllOccurrences: Boolean
    @JvmName("highlightAllOccurrencesProperty")
    get() = isHighlightAllOccurrencesEnabled()
    @JvmName("highlightAllOccurrencesProperty")
    set(`value`) {
      setHighlightAllOccurrences(value)
    }

  /**
   * If `true`, the line containing the cursor is highlighted.
   */
  public final inline var highlightCurrentLine: Boolean
    @JvmName("highlightCurrentLineProperty")
    get() = isHighlightCurrentLineEnabled()
    @JvmName("highlightCurrentLineProperty")
    set(`value`) {
      setHighlightCurrentLine(value)
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
   * If `true`, the "tab" character will have a visible representation.
   */
  public final inline var drawTabs: Boolean
    @JvmName("drawTabsProperty")
    get() = isDrawingTabs()
    @JvmName("drawTabsProperty")
    set(`value`) {
      setDrawTabs(value)
    }

  /**
   * If `true`, the "space" character will have a visible representation.
   */
  public final inline var drawSpaces: Boolean
    @JvmName("drawSpacesProperty")
    get() = isDrawingSpaces()
    @JvmName("drawSpacesProperty")
    set(`value`) {
      setDrawSpaces(value)
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
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale
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
    callConstructor(ENGINECLASS_TEXTEDIT, scriptIndex)
  }

  /**
   * Override this method to define what happens when the user types in the provided key
   * [unicodeChar].
   */
  public open fun _handleUnicodeInput(unicodeChar: Int, caretIndex: Int): Unit {
  }

  /**
   * Override this method to define what happens when the user presses the backspace key.
   */
  public open fun _backspace(caretIndex: Int): Unit {
  }

  /**
   * Override this method to define what happens when the user performs a cut operation.
   */
  public open fun _cut(caretIndex: Int): Unit {
  }

  /**
   * Override this method to define what happens when the user performs a copy operation.
   */
  public open fun _copy(caretIndex: Int): Unit {
  }

  /**
   * Override this method to define what happens when the user performs a paste operation.
   */
  public open fun _paste(caretIndex: Int): Unit {
  }

  /**
   * Override this method to define what happens when the user performs a paste operation with
   * middle mouse button.
   * **Note:** This method is only implemented on Linux.
   */
  public open fun _pastePrimaryClipboard(caretIndex: Int): Unit {
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
   * (IME) to each caret and closes the IME if it is open.
   */
  public final fun applyIme(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.applyImePtr, NIL)
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

  /**
   * Sets the tab size for the [TextEdit] to use.
   */
  public final fun setTabSize(size: Int): Unit {
    TransferContext.writeArguments(LONG to size.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setTabSizePtr, NIL)
  }

  /**
   * Returns the [TextEdit]'s' tab size.
   */
  public final fun getTabSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTabSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setIndentWrappedLines(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setIndentWrappedLinesPtr, NIL)
  }

  public final fun isIndentWrappedLines(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isIndentWrappedLinesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If `true`, sets the user into overtype mode. When the user types in this mode, it will override
   * existing text.
   */
  public final fun setOvertypeModeEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setOvertypeModeEnabledPtr, NIL)
  }

  /**
   * Returns whether the user is in overtype mode.
   */
  public final fun isOvertypeModeEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isOvertypeModeEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setContextMenuEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setContextMenuEnabledPtr, NIL)
  }

  public final fun isContextMenuEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isContextMenuEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setShortcutKeysEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setShortcutKeysEnabledPtr, NIL)
  }

  public final fun isShortcutKeysEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isShortcutKeysEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setVirtualKeyboardEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setVirtualKeyboardEnabledPtr, NIL)
  }

  public final fun isVirtualKeyboardEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isVirtualKeyboardEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMiddleMousePasteEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setMiddleMousePasteEnabledPtr, NIL)
  }

  public final fun isMiddleMousePasteEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isMiddleMousePasteEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Performs a full reset of [TextEdit], including undo history.
   */
  public final fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearPtr, NIL)
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

  /**
   * Returns the number of lines in the text.
   */
  public final fun getLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
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

  /**
   * Sets the text for a specific [line].
   * Carets on the line will attempt to keep their visual x position.
   */
  public final fun setLine(line: Int, newText: String): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), STRING to newText)
    TransferContext.callMethod(ptr, MethodBindings.setLinePtr, NIL)
  }

  /**
   * Returns the text of a specific line.
   */
  public final fun getLine(line: Int): String {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLinePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the width in pixels of the [wrapIndex] on [line].
   */
  @JvmOverloads
  public final fun getLineWidth(line: Int, wrapIndex: Int = -1): Int {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLineWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the maximum value of the line height among all lines.
   * **Note:** The return value is influenced by [theme_item line_spacing] and [theme_item
   * font_size]. And it will not be less than `1`.
   */
  public final fun getLineHeight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLineHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of spaces and `tab * tab_size` before the first char.
   */
  public final fun getIndentLevel(line: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getIndentLevelPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the first column containing a non-whitespace character.
   */
  public final fun getFirstNonWhitespaceColumn(line: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getFirstNonWhitespaceColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Swaps the two lines. Carets will be swapped with the lines.
   */
  public final fun swapLines(fromLine: Int, toLine: Int): Unit {
    TransferContext.writeArguments(LONG to fromLine.toLong(), LONG to toLine.toLong())
    TransferContext.callMethod(ptr, MethodBindings.swapLinesPtr, NIL)
  }

  /**
   * Inserts a new line with [text] at [line].
   */
  public final fun insertLineAt(line: Int, text: String): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), STRING to text)
    TransferContext.callMethod(ptr, MethodBindings.insertLineAtPtr, NIL)
  }

  /**
   * Removes the line of text at [line]. Carets on this line will attempt to match their previous
   * visual x position.
   * If [moveCaretsDown] is `true` carets will move to the next line down, otherwise carets will
   * move up.
   */
  @JvmOverloads
  public final fun removeLineAt(line: Int, moveCaretsDown: Boolean = true): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), BOOL to moveCaretsDown)
    TransferContext.callMethod(ptr, MethodBindings.removeLineAtPtr, NIL)
  }

  /**
   * Insert the specified text at the caret position.
   */
  @JvmOverloads
  public final fun insertTextAtCaret(text: String, caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(STRING to text, LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.insertTextAtCaretPtr, NIL)
  }

  /**
   * Inserts the [text] at [line] and [column].
   * If [beforeSelectionBegin] is `true`, carets and selections that begin at [line] and [column]
   * will moved to the end of the inserted text, along with all carets after it.
   * If [beforeSelectionEnd] is `true`, selections that end at [line] and [column] will be extended
   * to the end of the inserted text. These parameters can be used to insert text inside of or outside
   * of selections.
   */
  @JvmOverloads
  public final fun insertText(
    text: String,
    line: Int,
    column: Int,
    beforeSelectionBegin: Boolean = true,
    beforeSelectionEnd: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(STRING to text, LONG to line.toLong(), LONG to column.toLong(), BOOL to beforeSelectionBegin, BOOL to beforeSelectionEnd)
    TransferContext.callMethod(ptr, MethodBindings.insertTextPtr, NIL)
  }

  /**
   * Removes text between the given positions.
   */
  public final fun removeText(
    fromLine: Int,
    fromColumn: Int,
    toLine: Int,
    toColumn: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to fromLine.toLong(), LONG to fromColumn.toLong(), LONG to toLine.toLong(), LONG to toColumn.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeTextPtr, NIL)
  }

  /**
   * Returns the last unhidden line in the entire [TextEdit].
   */
  public final fun getLastUnhiddenLine(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLastUnhiddenLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the count to the next visible line from [line] to `line + visible_amount`. Can also
   * count backwards. For example if a [TextEdit] has 5 lines with lines 2 and 3 hidden, calling this
   * with `line = 1, visible_amount = 1` would return 3.
   */
  public final fun getNextVisibleLineOffsetFrom(line: Int, visibleAmount: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to visibleAmount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getNextVisibleLineOffsetFromPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Similar to [getNextVisibleLineOffsetFrom], but takes into account the line wrap indexes. In the
   * returned vector, `x` is the line, `y` is the wrap index.
   */
  public final fun getNextVisibleLineIndexOffsetFrom(
    line: Int,
    wrapIndex: Int,
    visibleAmount: Int,
  ): Vector2i {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong(), LONG to visibleAmount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getNextVisibleLineIndexOffsetFromPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Called when the user presses the backspace key. Can be overridden with [_backspace].
   */
  @JvmOverloads
  public final fun backspace(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.backspacePtr, NIL)
  }

  /**
   * Cut's the current selection. Can be overridden with [_cut].
   */
  @JvmOverloads
  public final fun cut(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.cutPtr, NIL)
  }

  /**
   * Copies the current text selection. Can be overridden with [_copy].
   */
  @JvmOverloads
  public final fun copy(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.copyPtr, NIL)
  }

  /**
   * Paste at the current location. Can be overridden with [_paste].
   */
  @JvmOverloads
  public final fun paste(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.pastePtr, NIL)
  }

  /**
   * Pastes the primary clipboard.
   */
  @JvmOverloads
  public final fun pastePrimaryClipboard(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.pastePrimaryClipboardPtr, NIL)
  }

  /**
   * Starts an action, will end the current action if [action] is different.
   * An action will also end after a call to [endAction], after
   * [ProjectSettings.gui/timers/textEditIdleDetectSec] is triggered or a new undoable step outside the
   * [startAction] and [endAction] calls.
   */
  public final fun startAction(action: EditAction): Unit {
    TransferContext.writeArguments(LONG to action.id)
    TransferContext.callMethod(ptr, MethodBindings.startActionPtr, NIL)
  }

  /**
   * Marks the end of steps in the current action started with [startAction].
   */
  public final fun endAction(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.endActionPtr, NIL)
  }

  /**
   * Starts a multipart edit. All edits will be treated as one action until [endComplexOperation] is
   * called.
   */
  public final fun beginComplexOperation(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.beginComplexOperationPtr, NIL)
  }

  /**
   * Ends a multipart edit, started with [beginComplexOperation]. If called outside a complex
   * operation, the current operation is pushed onto the undo/redo stack.
   */
  public final fun endComplexOperation(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.endComplexOperationPtr, NIL)
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
   * Perform undo operation.
   */
  public final fun undo(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.undoPtr, NIL)
  }

  /**
   * Perform redo operation.
   */
  public final fun redo(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.redoPtr, NIL)
  }

  /**
   * Clears the undo history.
   */
  public final fun clearUndoHistory(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearUndoHistoryPtr, NIL)
  }

  /**
   * Tag the current version as saved.
   */
  public final fun tagSavedVersion(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.tagSavedVersionPtr, NIL)
  }

  /**
   * Returns the current version of the [TextEdit]. The version is a count of recorded operations by
   * the undo/redo history.
   */
  public final fun getVersion(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVersionPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the last tagged saved version from [tagSavedVersion].
   */
  public final fun getSavedVersion(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSavedVersionPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the search text. See [setSearchFlags].
   */
  public final fun setSearchText(searchText: String): Unit {
    TransferContext.writeArguments(STRING to searchText)
    TransferContext.callMethod(ptr, MethodBindings.setSearchTextPtr, NIL)
  }

  /**
   * Sets the search [flags]. This is used with [setSearchText] to highlight occurrences of the
   * searched text. Search flags can be specified from the [SearchFlags] enum.
   */
  public final fun setSearchFlags(flags: Long): Unit {
    TransferContext.writeArguments(LONG to flags)
    TransferContext.callMethod(ptr, MethodBindings.setSearchFlagsPtr, NIL)
  }

  /**
   * Perform a search inside the text. Search flags can be specified in the [SearchFlags] enum.
   * In the returned vector, `x` is the column, `y` is the line. If no results are found, both are
   * equal to `-1`.
   *
   * gdscript:
   * ```gdscript
   * var result = search("print", SEARCH_WHOLE_WORDS, 0, 0)
   * if result.x != -1:
   *     # Result found.
   *     var line_number = result.y
   *     var column_number = result.x
   * ```
   * csharp:
   * ```csharp
   * Vector2I result = Search("print", (uint)TextEdit.SearchFlags.WholeWords, 0, 0);
   * if (result.X != -1)
   * {
   *     // Result found.
   *     int lineNumber = result.Y;
   *     int columnNumber = result.X;
   * }
   * ```
   */
  public final fun search(
    text: String,
    flags: Long,
    fromLine: Int,
    fromColumn: Int,
  ): Vector2i {
    TransferContext.writeArguments(STRING to text, LONG to flags, LONG to fromLine.toLong(), LONG to fromColumn.toLong())
    TransferContext.callMethod(ptr, MethodBindings.searchPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Provide custom tooltip text. The callback method must take the following args: `hovered_word:
   * String`.
   */
  public final fun setTooltipRequestFunc(callback: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to callback)
    TransferContext.callMethod(ptr, MethodBindings.setTooltipRequestFuncPtr, NIL)
  }

  /**
   * Returns the local mouse position adjusted for the text direction.
   */
  public final fun getLocalMousePos(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLocalMousePosPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the word at [position].
   */
  public final fun getWordAtPos(position: Vector2): String {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(ptr, MethodBindings.getWordAtPosPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the line and column at the given position. In the returned vector, `x` is the column,
   * `y` is the line. If [allowOutOfBounds] is `false` and the position is not over the text, both
   * vector values will be set to `-1`.
   */
  @JvmOverloads
  public final fun getLineColumnAtPos(position: Vector2i, allowOutOfBounds: Boolean = true):
      Vector2i {
    TransferContext.writeArguments(VECTOR2I to position, BOOL to allowOutOfBounds)
    TransferContext.callMethod(ptr, MethodBindings.getLineColumnAtPosPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the local position for the given [line] and [column]. If `x` or `y` of the returned
   * vector equal `-1`, the position is outside of the viewable area of the control.
   * **Note:** The Y position corresponds to the bottom side of the line. Use [getRectAtLineColumn]
   * to get the top side position.
   */
  public final fun getPosAtLineColumn(line: Int, column: Int): Vector2i {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getPosAtLineColumnPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the local position and size for the grapheme at the given [line] and [column]. If `x`
   * or `y` position of the returned rect equal `-1`, the position is outside of the viewable area of
   * the control.
   * **Note:** The Y position of the returned rect corresponds to the top side of the line, unlike
   * [getPosAtLineColumn] which returns the bottom side.
   */
  public final fun getRectAtLineColumn(line: Int, column: Int): Rect2i {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getRectAtLineColumnPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I) as Rect2i)
  }

  /**
   * Returns the equivalent minimap line at [position].
   */
  public final fun getMinimapLineAtPos(position: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.callMethod(ptr, MethodBindings.getMinimapLineAtPosPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the user is dragging their mouse for scrolling, selecting, or text dragging.
   */
  public final fun isDraggingCursor(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDraggingCursorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns whether the mouse is over selection. If [edges] is `true`, the edges are considered
   * part of the selection.
   */
  @JvmOverloads
  public final fun isMouseOverSelection(edges: Boolean, caretIndex: Int = -1): Boolean {
    TransferContext.writeArguments(BOOL to edges, LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isMouseOverSelectionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCaretType(type: CaretType): Unit {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(ptr, MethodBindings.setCaretTypePtr, NIL)
  }

  public final fun getCaretType(): CaretType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCaretTypePtr, LONG)
    return TextEdit.CaretType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setCaretBlinkEnabled(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setCaretBlinkEnabledPtr, NIL)
  }

  public final fun isCaretBlinkEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCaretBlinkEnabledPtr, BOOL)
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

  public final fun setDrawCaretWhenEditableDisabled(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setDrawCaretWhenEditableDisabledPtr, NIL)
  }

  public final fun isDrawingCaretWhenEditableDisabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDrawingCaretWhenEditableDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMoveCaretOnRightClickEnabled(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setMoveCaretOnRightClickEnabledPtr, NIL)
  }

  public final fun isMoveCaretOnRightClickEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isMoveCaretOnRightClickEnabledPtr, BOOL)
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

  public final fun setMultipleCaretsEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setMultipleCaretsEnabledPtr, NIL)
  }

  public final fun isMultipleCaretsEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isMultipleCaretsEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds a new caret at the given location. Returns the index of the new caret, or `-1` if the
   * location is invalid.
   */
  public final fun addCaret(line: Int, column: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addCaretPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Removes the given caret index.
   * **Note:** This can result in adjustment of all other caret indices.
   */
  public final fun removeCaret(caret: Int): Unit {
    TransferContext.writeArguments(LONG to caret.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeCaretPtr, NIL)
  }

  /**
   * Removes all additional carets.
   */
  public final fun removeSecondaryCarets(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.removeSecondaryCaretsPtr, NIL)
  }

  /**
   * Returns the number of carets in this [TextEdit].
   */
  public final fun getCaretCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCaretCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adds an additional caret above or below every caret. If [below] is `true` the new caret will be
   * added below and above otherwise.
   */
  public final fun addCaretAtCarets(below: Boolean): Unit {
    TransferContext.writeArguments(BOOL to below)
    TransferContext.callMethod(ptr, MethodBindings.addCaretAtCaretsPtr, NIL)
  }

  /**
   * Returns the carets sorted by selection beginning from lowest line and column to highest (from
   * top to bottom of text).
   * If [includeIgnoredCarets] is `false`, carets from [multicaretEditIgnoreCaret] will be ignored.
   */
  @JvmOverloads
  public final fun getSortedCarets(includeIgnoredCarets: Boolean = false): PackedInt32Array {
    TransferContext.writeArguments(BOOL to includeIgnoredCarets)
    TransferContext.callMethod(ptr, MethodBindings.getSortedCaretsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Collapse all carets in the given range to the [fromLine] and [fromColumn] position.
   * [inclusive] applies to both ends.
   * If [isInMulitcaretEdit] is `true`, carets that are collapsed will be `true` for
   * [multicaretEditIgnoreCaret].
   * [mergeOverlappingCarets] will be called if any carets were collapsed.
   */
  @JvmOverloads
  public final fun collapseCarets(
    fromLine: Int,
    fromColumn: Int,
    toLine: Int,
    toColumn: Int,
    inclusive: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(LONG to fromLine.toLong(), LONG to fromColumn.toLong(), LONG to toLine.toLong(), LONG to toColumn.toLong(), BOOL to inclusive)
    TransferContext.callMethod(ptr, MethodBindings.collapseCaretsPtr, NIL)
  }

  /**
   * Merges any overlapping carets. Will favor the newest caret, or the caret with a selection.
   * If [isInMulitcaretEdit] is `true`, the merge will be queued to happen at the end of the
   * multicaret edit. See [beginMulticaretEdit] and [endMulticaretEdit].
   * **Note:** This is not called when a caret changes position but after certain actions, so it is
   * possible to get into a state where carets overlap.
   */
  public final fun mergeOverlappingCarets(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.mergeOverlappingCaretsPtr, NIL)
  }

  /**
   * Starts an edit for multiple carets. The edit must be ended with [endMulticaretEdit]. Multicaret
   * edits can be used to edit text at multiple carets and delay merging the carets until the end, so
   * the caret indexes aren't affected immediately. [beginMulticaretEdit] and [endMulticaretEdit] can
   * be nested, and the merge will happen at the last [endMulticaretEdit].
   * Example usage:
   * [codeblock]
   * begin_complex_operation()
   * begin_multicaret_edit()
   * for i in range(get_caret_count()):
   *     if multicaret_edit_ignore_caret(i):
   *         continue
   *     # Logic here.
   * end_multicaret_edit()
   * end_complex_operation()
   * [/codeblock]
   */
  public final fun beginMulticaretEdit(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.beginMulticaretEditPtr, NIL)
  }

  /**
   * Ends an edit for multiple carets, that was started with [beginMulticaretEdit]. If this was the
   * last [endMulticaretEdit] and [mergeOverlappingCarets] was called, carets will be merged.
   */
  public final fun endMulticaretEdit(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.endMulticaretEditPtr, NIL)
  }

  /**
   * Returns `true` if a [beginMulticaretEdit] has been called and [endMulticaretEdit] has not yet
   * been called.
   */
  public final fun isInMulitcaretEdit(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isInMulitcaretEditPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the given [caretIndex] should be ignored as part of a multicaret edit. See
   * [beginMulticaretEdit] and [endMulticaretEdit]. Carets that should be ignored are ones that were
   * part of removed text and will likely be merged at the end of the edit, or carets that were added
   * during the edit.
   * It is recommended to `continue` within a loop iterating on multiple carets if a caret should be
   * ignored.
   */
  public final fun multicaretEditIgnoreCaret(caretIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.multicaretEditIgnoreCaretPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the caret is visible on the screen.
   */
  @JvmOverloads
  public final fun isCaretVisible(caretIndex: Int = 0): Boolean {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isCaretVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the caret pixel draw position.
   */
  @JvmOverloads
  public final fun getCaretDrawPos(caretIndex: Int = 0): Vector2 {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCaretDrawPosPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Moves the caret to the specified [line] index. The caret column will be moved to the same
   * visual position it was at the last time [setCaretColumn] was called, or clamped to the end of the
   * line.
   * If [adjustViewport] is `true`, the viewport will center at the caret position after the move
   * occurs.
   * If [canBeHidden] is `true`, the specified [line] can be hidden.
   * If [wrapIndex] is `-1`, the caret column will be clamped to the [line]'s length. If [wrapIndex]
   * is greater than `-1`, the column will be moved to attempt to match the visual x position on the
   * line's [wrapIndex] to the position from the last time [setCaretColumn] was called.
   * **Note:** If supporting multiple carets this will not check for any overlap. See
   * [mergeOverlappingCarets].
   */
  @JvmOverloads
  public final fun setCaretLine(
    line: Int,
    adjustViewport: Boolean = true,
    canBeHidden: Boolean = true,
    wrapIndex: Int = 0,
    caretIndex: Int = 0,
  ): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), BOOL to adjustViewport, BOOL to canBeHidden, LONG to wrapIndex.toLong(), LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setCaretLinePtr, NIL)
  }

  /**
   * Returns the line the editing caret is on.
   */
  @JvmOverloads
  public final fun getCaretLine(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCaretLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Moves the caret to the specified [column] index.
   * If [adjustViewport] is `true`, the viewport will center at the caret position after the move
   * occurs.
   * **Note:** If supporting multiple carets this will not check for any overlap. See
   * [mergeOverlappingCarets].
   */
  @JvmOverloads
  public final fun setCaretColumn(
    column: Int,
    adjustViewport: Boolean = true,
    caretIndex: Int = 0,
  ): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to adjustViewport, LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setCaretColumnPtr, NIL)
  }

  /**
   * Returns the column the editing caret is at.
   */
  @JvmOverloads
  public final fun getCaretColumn(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCaretColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the wrap index the editing caret is on.
   */
  @JvmOverloads
  public final fun getCaretWrapIndex(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCaretWrapIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns a [String] text with the word under the caret's location.
   */
  @JvmOverloads
  public final fun getWordUnderCaret(caretIndex: Int = -1): String {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getWordUnderCaretPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setUseDefaultWordSeparators(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setUseDefaultWordSeparatorsPtr, NIL)
  }

  public final fun isDefaultWordSeparatorsEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDefaultWordSeparatorsEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUseCustomWordSeparators(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setUseCustomWordSeparatorsPtr, NIL)
  }

  public final fun isCustomWordSeparatorsEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCustomWordSeparatorsEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCustomWordSeparators(customWordSeparators: String): Unit {
    TransferContext.writeArguments(STRING to customWordSeparators)
    TransferContext.callMethod(ptr, MethodBindings.setCustomWordSeparatorsPtr, NIL)
  }

  public final fun getCustomWordSeparators(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCustomWordSeparatorsPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
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

  /**
   * Sets the current selection mode.
   */
  public final fun setSelectionMode(mode: SelectionMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setSelectionModePtr, NIL)
  }

  /**
   * Returns the current selection mode.
   */
  public final fun getSelectionMode(): SelectionMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSelectionModePtr, LONG)
    return TextEdit.SelectionMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Select all the text.
   * If [selectingEnabled] is `false`, no selection will occur.
   */
  public final fun selectAll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.selectAllPtr, NIL)
  }

  /**
   * Selects the word under the caret.
   */
  @JvmOverloads
  public final fun selectWordUnderCaret(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.selectWordUnderCaretPtr, NIL)
  }

  /**
   * Adds a selection and a caret for the next occurrence of the current selection. If there is no
   * active selection, selects word under caret.
   */
  public final fun addSelectionForNextOccurrence(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.addSelectionForNextOccurrencePtr, NIL)
  }

  /**
   * Moves a selection and a caret for the next occurrence of the current selection. If there is no
   * active selection, moves to the next occurrence of the word under caret.
   */
  public final fun skipSelectionForNextOccurrence(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.skipSelectionForNextOccurrencePtr, NIL)
  }

  /**
   * Selects text from [originLine] and [originColumn] to [caretLine] and [caretColumn] for the
   * given [caretIndex]. This moves the selection origin and the caret. If the positions are the same,
   * the selection will be deselected.
   * If [selectingEnabled] is `false`, no selection will occur.
   * **Note:** If supporting multiple carets this will not check for any overlap. See
   * [mergeOverlappingCarets].
   */
  @JvmOverloads
  public final fun select(
    originLine: Int,
    originColumn: Int,
    caretLine: Int,
    caretColumn: Int,
    caretIndex: Int = 0,
  ): Unit {
    TransferContext.writeArguments(LONG to originLine.toLong(), LONG to originColumn.toLong(), LONG to caretLine.toLong(), LONG to caretColumn.toLong(), LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.selectPtr, NIL)
  }

  /**
   * Returns `true` if the user has selected text.
   */
  @JvmOverloads
  public final fun hasSelection(caretIndex: Int = -1): Boolean {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.hasSelectionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the text inside the selection of a caret, or all the carets if [caretIndex] is its
   * default value `-1`.
   */
  @JvmOverloads
  public final fun getSelectedText(caretIndex: Int = -1): String {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getSelectedTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the caret index of the selection at the given [line] and [column], or `-1` if there is
   * none.
   * If [includeEdges] is `false`, the position must be inside the selection and not at either end.
   * If [onlySelections] is `false`, carets without a selection will also be considered.
   */
  @JvmOverloads
  public final fun getSelectionAtLineColumn(
    line: Int,
    column: Int,
    includeEdges: Boolean = true,
    onlySelections: Boolean = true,
  ): Int {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong(), BOOL to includeEdges, BOOL to onlySelections)
    TransferContext.callMethod(ptr, MethodBindings.getSelectionAtLineColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns an [Array] of line ranges where `x` is the first line and `y` is the last line. All
   * lines within these ranges will have a caret on them or be part of a selection. Each line will only
   * be part of one line range, even if it has multiple carets on it.
   * If a selection's end column ([getSelectionToColumn]) is at column `0`, that line will not be
   * included. If a selection begins on the line after another selection ends and [mergeAdjacent] is
   * `true`, or they begin and end on the same line, one line range will include both selections.
   */
  @JvmOverloads
  public final fun getLineRangesFromCarets(onlySelections: Boolean = false, mergeAdjacent: Boolean =
      true): VariantArray<Vector2i> {
    TransferContext.writeArguments(BOOL to onlySelections, BOOL to mergeAdjacent)
    TransferContext.callMethod(ptr, MethodBindings.getLineRangesFromCaretsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Vector2i>)
  }

  /**
   * Returns the origin line of the selection. This is the opposite end from the caret.
   */
  @JvmOverloads
  public final fun getSelectionOriginLine(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getSelectionOriginLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the origin column of the selection. This is the opposite end from the caret.
   */
  @JvmOverloads
  public final fun getSelectionOriginColumn(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getSelectionOriginColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the selection origin line to the [line] for the given [caretIndex]. If the selection
   * origin is moved to the caret position, the selection will deselect.
   * If [canBeHidden] is `false`, The line will be set to the nearest unhidden line below or above.
   * If [wrapIndex] is `-1`, the selection origin column will be clamped to the [line]'s length. If
   * [wrapIndex] is greater than `-1`, the column will be moved to attempt to match the visual x
   * position on the line's [wrapIndex] to the position from the last time [setSelectionOriginColumn]
   * or [select] was called.
   */
  @JvmOverloads
  public final fun setSelectionOriginLine(
    line: Int,
    canBeHidden: Boolean = true,
    wrapIndex: Int = -1,
    caretIndex: Int = 0,
  ): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), BOOL to canBeHidden, LONG to wrapIndex.toLong(), LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSelectionOriginLinePtr, NIL)
  }

  /**
   * Sets the selection origin column to the [column] for the given [caretIndex]. If the selection
   * origin is moved to the caret position, the selection will deselect.
   */
  @JvmOverloads
  public final fun setSelectionOriginColumn(column: Int, caretIndex: Int = 0): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSelectionOriginColumnPtr, NIL)
  }

  /**
   * Returns the selection begin line. Returns the caret line if there is no selection.
   */
  @JvmOverloads
  public final fun getSelectionFromLine(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getSelectionFromLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the selection begin column. Returns the caret column if there is no selection.
   */
  @JvmOverloads
  public final fun getSelectionFromColumn(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getSelectionFromColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the selection end line. Returns the caret line if there is no selection.
   */
  @JvmOverloads
  public final fun getSelectionToLine(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getSelectionToLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the selection end column. Returns the caret column if there is no selection.
   */
  @JvmOverloads
  public final fun getSelectionToColumn(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getSelectionToColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the caret of the selection is after the selection origin. This can be used to
   * determine the direction of the selection.
   */
  @JvmOverloads
  public final fun isCaretAfterSelectionOrigin(caretIndex: Int = 0): Boolean {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isCaretAfterSelectionOriginPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Deselects the current selection.
   */
  @JvmOverloads
  public final fun deselect(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.deselectPtr, NIL)
  }

  /**
   * Deletes the selected text.
   */
  @JvmOverloads
  public final fun deleteSelection(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.deleteSelectionPtr, NIL)
  }

  public final fun setLineWrappingMode(mode: LineWrappingMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setLineWrappingModePtr, NIL)
  }

  public final fun getLineWrappingMode(): LineWrappingMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLineWrappingModePtr, LONG)
    return TextEdit.LineWrappingMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAutowrapMode(autowrapMode: TextServer.AutowrapMode): Unit {
    TransferContext.writeArguments(LONG to autowrapMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setAutowrapModePtr, NIL)
  }

  public final fun getAutowrapMode(): TextServer.AutowrapMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAutowrapModePtr, LONG)
    return TextServer.AutowrapMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns if the given line is wrapped.
   */
  public final fun isLineWrapped(line: Int): Boolean {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isLineWrappedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the number of times the given line is wrapped.
   */
  public final fun getLineWrapCount(line: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLineWrapCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the wrap index of the given line column.
   */
  public final fun getLineWrapIndexAtColumn(line: Int, column: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLineWrapIndexAtColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns an array of [String]s representing each wrapped index.
   */
  public final fun getLineWrappedText(line: Int): PackedStringArray {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLineWrappedTextPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  public final fun setSmoothScrollEnabled(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setSmoothScrollEnabledPtr, NIL)
  }

  public final fun isSmoothScrollEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSmoothScrollEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the [VScrollBar] of the [TextEdit].
   */
  public final fun getVScrollBar(): VScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVScrollBarPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as VScrollBar?)
  }

  /**
   * Returns the [HScrollBar] used by [TextEdit].
   */
  public final fun getHScrollBar(): HScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHScrollBarPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as HScrollBar?)
  }

  public final fun setVScroll(`value`: Double): Unit {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(ptr, MethodBindings.setVScrollPtr, NIL)
  }

  public final fun getVScroll(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVScrollPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setHScroll(`value`: Int): Unit {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setHScrollPtr, NIL)
  }

  public final fun getHScroll(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHScrollPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setScrollPastEndOfFileEnabled(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setScrollPastEndOfFileEnabledPtr, NIL)
  }

  public final fun isScrollPastEndOfFileEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isScrollPastEndOfFileEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setVScrollSpeed(speed: Float): Unit {
    TransferContext.writeArguments(DOUBLE to speed.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVScrollSpeedPtr, NIL)
  }

  public final fun getVScrollSpeed(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVScrollSpeedPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFitContentHeightEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setFitContentHeightEnabledPtr, NIL)
  }

  public final fun isFitContentHeightEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isFitContentHeightEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the scroll position for [wrapIndex] of [line].
   */
  @JvmOverloads
  public final fun getScrollPosForLine(line: Int, wrapIndex: Int = 0): Double {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getScrollPosForLinePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Positions the [wrapIndex] of [line] at the top of the viewport.
   */
  @JvmOverloads
  public final fun setLineAsFirstVisible(line: Int, wrapIndex: Int = 0): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setLineAsFirstVisiblePtr, NIL)
  }

  /**
   * Returns the first visible line.
   */
  public final fun getFirstVisibleLine(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFirstVisibleLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Positions the [wrapIndex] of [line] at the center of the viewport.
   */
  @JvmOverloads
  public final fun setLineAsCenterVisible(line: Int, wrapIndex: Int = 0): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setLineAsCenterVisiblePtr, NIL)
  }

  /**
   * Positions the [wrapIndex] of [line] at the bottom of the viewport.
   */
  @JvmOverloads
  public final fun setLineAsLastVisible(line: Int, wrapIndex: Int = 0): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setLineAsLastVisiblePtr, NIL)
  }

  /**
   * Returns the last visible line. Use [getLastFullVisibleLineWrapIndex] for the wrap index.
   */
  public final fun getLastFullVisibleLine(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLastFullVisibleLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the last visible wrap index of the last visible line.
   */
  public final fun getLastFullVisibleLineWrapIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLastFullVisibleLineWrapIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of visible lines, including wrapped text.
   */
  public final fun getVisibleLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVisibleLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the total number of visible + wrapped lines between the two lines.
   */
  public final fun getVisibleLineCountInRange(fromLine: Int, toLine: Int): Int {
    TransferContext.writeArguments(LONG to fromLine.toLong(), LONG to toLine.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getVisibleLineCountInRangePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of lines that may be drawn.
   */
  public final fun getTotalVisibleLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTotalVisibleLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adjust the viewport so the caret is visible.
   */
  @JvmOverloads
  public final fun adjustViewportToCaret(caretIndex: Int = 0): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.adjustViewportToCaretPtr, NIL)
  }

  /**
   * Centers the viewport on the line the editing caret is at. This also resets the
   * [scrollHorizontal] value to `0`.
   */
  @JvmOverloads
  public final fun centerViewportToCaret(caretIndex: Int = 0): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.centerViewportToCaretPtr, NIL)
  }

  public final fun setDrawMinimap(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setDrawMinimapPtr, NIL)
  }

  public final fun isDrawingMinimap(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDrawingMinimapPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMinimapWidth(width: Int): Unit {
    TransferContext.writeArguments(LONG to width.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMinimapWidthPtr, NIL)
  }

  public final fun getMinimapWidth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMinimapWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of lines that may be drawn on the minimap.
   */
  public final fun getMinimapVisibleLines(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMinimapVisibleLinesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Register a new gutter to this [TextEdit]. Use [at] to have a specific gutter order. A value of
   * `-1` appends the gutter to the right.
   */
  @JvmOverloads
  public final fun addGutter(at: Int = -1): Unit {
    TransferContext.writeArguments(LONG to at.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addGutterPtr, NIL)
  }

  /**
   * Removes the gutter from this [TextEdit].
   */
  public final fun removeGutter(gutter: Int): Unit {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeGutterPtr, NIL)
  }

  /**
   * Returns the number of gutters registered.
   */
  public final fun getGutterCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGutterCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the name of the gutter.
   */
  public final fun setGutterName(gutter: Int, name: String): Unit {
    TransferContext.writeArguments(LONG to gutter.toLong(), STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.setGutterNamePtr, NIL)
  }

  /**
   * Returns the name of the gutter at the given index.
   */
  public final fun getGutterName(gutter: Int): String {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getGutterNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets the type of gutter. Gutters can contain icons, text, or custom visuals. See
   * [TextEdit.GutterType] for options.
   */
  public final fun setGutterType(gutter: Int, type: GutterType): Unit {
    TransferContext.writeArguments(LONG to gutter.toLong(), LONG to type.id)
    TransferContext.callMethod(ptr, MethodBindings.setGutterTypePtr, NIL)
  }

  /**
   * Returns the type of the gutter at the given index. Gutters can contain icons, text, or custom
   * visuals. See [TextEdit.GutterType] for options.
   */
  public final fun getGutterType(gutter: Int): GutterType {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getGutterTypePtr, LONG)
    return TextEdit.GutterType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Set the width of the gutter.
   */
  public final fun setGutterWidth(gutter: Int, width: Int): Unit {
    TransferContext.writeArguments(LONG to gutter.toLong(), LONG to width.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setGutterWidthPtr, NIL)
  }

  /**
   * Returns the width of the gutter at the given index.
   */
  public final fun getGutterWidth(gutter: Int): Int {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getGutterWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets whether the gutter should be drawn.
   */
  public final fun setGutterDraw(gutter: Int, draw: Boolean): Unit {
    TransferContext.writeArguments(LONG to gutter.toLong(), BOOL to draw)
    TransferContext.callMethod(ptr, MethodBindings.setGutterDrawPtr, NIL)
  }

  /**
   * Returns whether the gutter is currently drawn.
   */
  public final fun isGutterDrawn(gutter: Int): Boolean {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isGutterDrawnPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the gutter as clickable. This will change the mouse cursor to a pointing hand when
   * hovering over the gutter.
   */
  public final fun setGutterClickable(gutter: Int, clickable: Boolean): Unit {
    TransferContext.writeArguments(LONG to gutter.toLong(), BOOL to clickable)
    TransferContext.callMethod(ptr, MethodBindings.setGutterClickablePtr, NIL)
  }

  /**
   * Returns whether the gutter is clickable.
   */
  public final fun isGutterClickable(gutter: Int): Boolean {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isGutterClickablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the gutter to overwritable. See [mergeGutters].
   */
  public final fun setGutterOverwritable(gutter: Int, overwritable: Boolean): Unit {
    TransferContext.writeArguments(LONG to gutter.toLong(), BOOL to overwritable)
    TransferContext.callMethod(ptr, MethodBindings.setGutterOverwritablePtr, NIL)
  }

  /**
   * Returns whether the gutter is overwritable.
   */
  public final fun isGutterOverwritable(gutter: Int): Boolean {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isGutterOverwritablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Merge the gutters from [fromLine] into [toLine]. Only overwritable gutters will be copied.
   */
  public final fun mergeGutters(fromLine: Int, toLine: Int): Unit {
    TransferContext.writeArguments(LONG to fromLine.toLong(), LONG to toLine.toLong())
    TransferContext.callMethod(ptr, MethodBindings.mergeGuttersPtr, NIL)
  }

  /**
   * Set a custom draw method for the gutter. The callback method must take the following args:
   * `line: int, gutter: int, Area: Rect2`. This only works when the gutter type is
   * [GUTTER_TYPE_CUSTOM] (see [setGutterType]).
   */
  public final fun setGutterCustomDraw(column: Int, drawCallback: Callable): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), CALLABLE to drawCallback)
    TransferContext.callMethod(ptr, MethodBindings.setGutterCustomDrawPtr, NIL)
  }

  /**
   * Returns the total width of all gutters and internal padding.
   */
  public final fun getTotalGutterWidth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTotalGutterWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the metadata for [gutter] on [line] to [metadata].
   */
  public final fun setLineGutterMetadata(
    line: Int,
    gutter: Int,
    metadata: Any?,
  ): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), ANY to metadata)
    TransferContext.callMethod(ptr, MethodBindings.setLineGutterMetadataPtr, NIL)
  }

  /**
   * Returns the metadata currently in [gutter] at [line].
   */
  public final fun getLineGutterMetadata(line: Int, gutter: Int): Any? {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLineGutterMetadataPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Sets the text for [gutter] on [line] to [text]. This only works when the gutter type is
   * [GUTTER_TYPE_STRING] (see [setGutterType]).
   */
  public final fun setLineGutterText(
    line: Int,
    gutter: Int,
    text: String,
  ): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), STRING to text)
    TransferContext.callMethod(ptr, MethodBindings.setLineGutterTextPtr, NIL)
  }

  /**
   * Returns the text currently in [gutter] at [line]. This only works when the gutter type is
   * [GUTTER_TYPE_STRING] (see [setGutterType]).
   */
  public final fun getLineGutterText(line: Int, gutter: Int): String {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLineGutterTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets the icon for [gutter] on [line] to [icon]. This only works when the gutter type is
   * [GUTTER_TYPE_ICON] (see [setGutterType]).
   */
  public final fun setLineGutterIcon(
    line: Int,
    gutter: Int,
    icon: Texture2D?,
  ): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), OBJECT to icon)
    TransferContext.callMethod(ptr, MethodBindings.setLineGutterIconPtr, NIL)
  }

  /**
   * Returns the icon currently in [gutter] at [line]. This only works when the gutter type is
   * [GUTTER_TYPE_ICON] (see [setGutterType]).
   */
  public final fun getLineGutterIcon(line: Int, gutter: Int): Texture2D? {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLineGutterIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Sets the color for [gutter] on [line] to [color].
   */
  public final fun setLineGutterItemColor(
    line: Int,
    gutter: Int,
    color: Color,
  ): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setLineGutterItemColorPtr, NIL)
  }

  /**
   * Returns the color currently in [gutter] at [line].
   */
  public final fun getLineGutterItemColor(line: Int, gutter: Int): Color {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLineGutterItemColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  /**
   * If [clickable] is `true`, makes the [gutter] on [line] clickable. See [signal gutter_clicked].
   */
  public final fun setLineGutterClickable(
    line: Int,
    gutter: Int,
    clickable: Boolean,
  ): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), BOOL to clickable)
    TransferContext.callMethod(ptr, MethodBindings.setLineGutterClickablePtr, NIL)
  }

  /**
   * Returns whether the gutter on the given line is clickable.
   */
  public final fun isLineGutterClickable(line: Int, gutter: Int): Boolean {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isLineGutterClickablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the current background color of the line. Set to `Color(0, 0, 0, 0)` for no color.
   */
  public final fun setLineBackgroundColor(line: Int, color: Color): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setLineBackgroundColorPtr, NIL)
  }

  /**
   * Returns the current background color of the line. `Color(0, 0, 0, 0)` is returned if no color
   * is set.
   */
  public final fun getLineBackgroundColor(line: Int): Color {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLineBackgroundColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setSyntaxHighlighter(syntaxHighlighter: SyntaxHighlighter?): Unit {
    TransferContext.writeArguments(OBJECT to syntaxHighlighter)
    TransferContext.callMethod(ptr, MethodBindings.setSyntaxHighlighterPtr, NIL)
  }

  public final fun getSyntaxHighlighter(): SyntaxHighlighter? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSyntaxHighlighterPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as SyntaxHighlighter?)
  }

  public final fun setHighlightCurrentLine(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setHighlightCurrentLinePtr, NIL)
  }

  public final fun isHighlightCurrentLineEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isHighlightCurrentLineEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setHighlightAllOccurrences(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setHighlightAllOccurrencesPtr, NIL)
  }

  public final fun isHighlightAllOccurrencesEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isHighlightAllOccurrencesEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getDrawControlChars(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDrawControlCharsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDrawControlChars(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setDrawControlCharsPtr, NIL)
  }

  public final fun setDrawTabs(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setDrawTabsPtr, NIL)
  }

  public final fun isDrawingTabs(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDrawingTabsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDrawSpaces(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setDrawSpacesPtr, NIL)
  }

  public final fun isDrawingSpaces(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDrawingSpacesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the [PopupMenu] of this [TextEdit]. By default, this menu is displayed when
   * right-clicking on the [TextEdit].
   * You can add custom menu items or remove standard ones. Make sure your IDs don't conflict with
   * the standard ones (see [MenuItems]). For example:
   *
   * gdscript:
   * ```gdscript
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
   * csharp:
   * ```csharp
   * public override void _Ready()
   * {
   *     var menu = GetMenu();
   *     // Remove all items after "Redo".
   *     menu.ItemCount = menu.GetItemIndex(TextEdit.MenuItems.Redo) + 1;
   *     // Add custom items.
   *     menu.AddSeparator();
   *     menu.AddItem("Insert Date", TextEdit.MenuItems.Max + 1);
   *     // Add event handler.
   *     menu.IdPressed += OnItemPressed;
   * }
   *
   * public void OnItemPressed(int id)
   * {
   *     if (id == TextEdit.MenuItems.Max + 1)
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

  /**
   * Executes a given action as defined in the [MenuItems] enum.
   */
  public final fun menuOption(option: Int): Unit {
    TransferContext.writeArguments(LONG to option.toLong())
    TransferContext.callMethod(ptr, MethodBindings.menuOptionPtr, NIL)
  }

  /**
   * This method does nothing.
   */
  public final fun adjustCaretsAfterEdit(
    caret: Int,
    fromLine: Int,
    fromCol: Int,
    toLine: Int,
    toCol: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to caret.toLong(), LONG to fromLine.toLong(), LONG to fromCol.toLong(), LONG to toLine.toLong(), LONG to toCol.toLong())
    TransferContext.callMethod(ptr, MethodBindings.adjustCaretsAfterEditPtr, NIL)
  }

  /**
   * Returns a list of caret indexes in their edit order, this done from bottom to top. Edit order
   * refers to the way actions such as [insertTextAtCaret] are applied.
   */
  public final fun getCaretIndexEditOrder(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCaretIndexEditOrderPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Returns the original start line of the selection.
   */
  @JvmOverloads
  public final fun getSelectionLine(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getSelectionLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the original start column of the selection.
   */
  @JvmOverloads
  public final fun getSelectionColumn(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getSelectionColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
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
     * Pastes the clipboard text over the selected text (or at the cursor's position).
     */
    MENU_PASTE(2),
    /**
     * Erases the whole [TextEdit] text.
     */
    MENU_CLEAR(3),
    /**
     * Selects the whole [TextEdit] text.
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
     * Represents the size of the [MenuItems] enum.
     */
    MENU_MAX(30),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): MenuItems = entries.single { it.id == `value` }
    }
  }

  public enum class EditAction(
    id: Long,
  ) {
    /**
     * No current action.
     */
    ACTION_NONE(0),
    /**
     * A typing action.
     */
    ACTION_TYPING(1),
    /**
     * A backwards delete action.
     */
    ACTION_BACKSPACE(2),
    /**
     * A forward delete action.
     */
    ACTION_DELETE(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EditAction = entries.single { it.id == `value` }
    }
  }

  public enum class SearchFlags(
    id: Long,
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
      public fun from(`value`: Long): SearchFlags = entries.single { it.id == `value` }
    }
  }

  public enum class CaretType(
    id: Long,
  ) {
    /**
     * Vertical line caret.
     */
    CARET_TYPE_LINE(0),
    /**
     * Block caret.
     */
    CARET_TYPE_BLOCK(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CaretType = entries.single { it.id == `value` }
    }
  }

  public enum class SelectionMode(
    id: Long,
  ) {
    /**
     * Not selecting.
     */
    SELECTION_MODE_NONE(0),
    /**
     * Select as if `shift` is pressed.
     */
    SELECTION_MODE_SHIFT(1),
    /**
     * Select single characters as if the user single clicked.
     */
    SELECTION_MODE_POINTER(2),
    /**
     * Select whole words as if the user double clicked.
     */
    SELECTION_MODE_WORD(3),
    /**
     * Select whole lines as if the user triple clicked.
     */
    SELECTION_MODE_LINE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SelectionMode = entries.single { it.id == `value` }
    }
  }

  public enum class LineWrappingMode(
    id: Long,
  ) {
    /**
     * Line wrapping is disabled.
     */
    LINE_WRAPPING_NONE(0),
    /**
     * Line wrapping occurs at the control boundary, beyond what would normally be visible.
     */
    LINE_WRAPPING_BOUNDARY(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LineWrappingMode = entries.single { it.id == `value` }
    }
  }

  public enum class GutterType(
    id: Long,
  ) {
    /**
     * When a gutter is set to string using [setGutterType], it is used to contain text set via the
     * [setLineGutterText] method.
     */
    GUTTER_TYPE_STRING(0),
    /**
     * When a gutter is set to icon using [setGutterType], it is used to contain an icon set via the
     * [setLineGutterIcon] method.
     */
    GUTTER_TYPE_ICON(1),
    /**
     * When a gutter is set to custom using [setGutterType], it is used to contain custom visuals
     * controlled by a callback method set via the [setGutterCustomDraw] method.
     */
    GUTTER_TYPE_CUSTOM(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): GutterType = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val hasImeTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "has_ime_text", 36873697)

    public val cancelImePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "cancel_ime", 3218959716)

    public val applyImePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "apply_ime", 3218959716)

    public val setEditablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_editable", 2586408642)

    public val isEditablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_editable", 36873697)

    public val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_text_direction", 119160795)

    public val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_text_direction", 797257663)

    public val setLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_language", 83702148)

    public val getLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_language", 201670096)

    public val setStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_structured_text_bidi_override", 55961453)

    public val getStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_structured_text_bidi_override", 3385126229)

    public val setStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_structured_text_bidi_override_options", 381264803)

    public val getStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_structured_text_bidi_override_options", 3995934104)

    public val setTabSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_tab_size", 1286410249)

    public val getTabSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_tab_size", 3905245786)

    public val setIndentWrappedLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_indent_wrapped_lines", 2586408642)

    public val isIndentWrappedLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_indent_wrapped_lines", 36873697)

    public val setOvertypeModeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_overtype_mode_enabled", 2586408642)

    public val isOvertypeModeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_overtype_mode_enabled", 36873697)

    public val setContextMenuEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_context_menu_enabled", 2586408642)

    public val isContextMenuEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_context_menu_enabled", 36873697)

    public val setShortcutKeysEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_shortcut_keys_enabled", 2586408642)

    public val isShortcutKeysEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_shortcut_keys_enabled", 36873697)

    public val setVirtualKeyboardEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_virtual_keyboard_enabled", 2586408642)

    public val isVirtualKeyboardEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_virtual_keyboard_enabled", 36873697)

    public val setMiddleMousePasteEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_middle_mouse_paste_enabled", 2586408642)

    public val isMiddleMousePasteEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_middle_mouse_paste_enabled", 36873697)

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "clear", 3218959716)

    public val setTextPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "set_text", 83702148)

    public val getTextPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_text", 201670096)

    public val getLineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_count", 3905245786)

    public val setPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_placeholder", 83702148)

    public val getPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_placeholder", 201670096)

    public val setLinePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "set_line", 501894301)

    public val getLinePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_line", 844755477)

    public val getLineWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_width", 688195400)

    public val getLineHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_height", 3905245786)

    public val getIndentLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_indent_level", 923996154)

    public val getFirstNonWhitespaceColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_first_non_whitespace_column", 923996154)

    public val swapLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "swap_lines", 3937882851)

    public val insertLineAtPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "insert_line_at", 501894301)

    public val removeLineAtPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "remove_line_at", 972357352)

    public val insertTextAtCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "insert_text_at_caret", 2697778442)

    public val insertTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "insert_text", 1881564334)

    public val removeTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "remove_text", 4275841770)

    public val getLastUnhiddenLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_last_unhidden_line", 3905245786)

    public val getNextVisibleLineOffsetFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_next_visible_line_offset_from", 3175239445)

    public val getNextVisibleLineIndexOffsetFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_next_visible_line_index_offset_from", 3386475622)

    public val backspacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "backspace", 1025054187)

    public val cutPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "cut", 1025054187)

    public val copyPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "copy", 1025054187)

    public val pastePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "paste", 1025054187)

    public val pastePrimaryClipboardPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "paste_primary_clipboard", 1025054187)

    public val startActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "start_action", 2834827583)

    public val endActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "end_action", 3218959716)

    public val beginComplexOperationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "begin_complex_operation", 3218959716)

    public val endComplexOperationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "end_complex_operation", 3218959716)

    public val hasUndoPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "has_undo", 36873697)

    public val hasRedoPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "has_redo", 36873697)

    public val undoPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "undo", 3218959716)

    public val redoPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "redo", 3218959716)

    public val clearUndoHistoryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "clear_undo_history", 3218959716)

    public val tagSavedVersionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "tag_saved_version", 3218959716)

    public val getVersionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_version", 3905245786)

    public val getSavedVersionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_saved_version", 3905245786)

    public val setSearchTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_search_text", 83702148)

    public val setSearchFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_search_flags", 1286410249)

    public val searchPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "search", 1203739136)

    public val setTooltipRequestFuncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_tooltip_request_func", 1611583062)

    public val getLocalMousePosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_local_mouse_pos", 3341600327)

    public val getWordAtPosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_word_at_pos", 3674420000)

    public val getLineColumnAtPosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_column_at_pos", 239517838)

    public val getPosAtLineColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_pos_at_line_column", 410388347)

    public val getRectAtLineColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_rect_at_line_column", 3256618057)

    public val getMinimapLineAtPosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_minimap_line_at_pos", 2485466453)

    public val isDraggingCursorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_dragging_cursor", 36873697)

    public val isMouseOverSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_mouse_over_selection", 1840282309)

    public val setCaretTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_caret_type", 1211596914)

    public val getCaretTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_caret_type", 2830252959)

    public val setCaretBlinkEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_caret_blink_enabled", 2586408642)

    public val isCaretBlinkEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_caret_blink_enabled", 36873697)

    public val setCaretBlinkIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_caret_blink_interval", 373806689)

    public val getCaretBlinkIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_caret_blink_interval", 1740695150)

    public val setDrawCaretWhenEditableDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_draw_caret_when_editable_disabled", 2586408642)

    public val isDrawingCaretWhenEditableDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_drawing_caret_when_editable_disabled", 36873697)

    public val setMoveCaretOnRightClickEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_move_caret_on_right_click_enabled", 2586408642)

    public val isMoveCaretOnRightClickEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_move_caret_on_right_click_enabled", 36873697)

    public val setCaretMidGraphemeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_caret_mid_grapheme_enabled", 2586408642)

    public val isCaretMidGraphemeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_caret_mid_grapheme_enabled", 36873697)

    public val setMultipleCaretsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_multiple_carets_enabled", 2586408642)

    public val isMultipleCaretsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_multiple_carets_enabled", 36873697)

    public val addCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "add_caret", 50157827)

    public val removeCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "remove_caret", 1286410249)

    public val removeSecondaryCaretsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "remove_secondary_carets", 3218959716)

    public val getCaretCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_caret_count", 3905245786)

    public val addCaretAtCaretsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "add_caret_at_carets", 2586408642)

    public val getSortedCaretsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_sorted_carets", 2131714034)

    public val collapseCaretsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "collapse_carets", 228654177)

    public val mergeOverlappingCaretsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "merge_overlapping_carets", 3218959716)

    public val beginMulticaretEditPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "begin_multicaret_edit", 3218959716)

    public val endMulticaretEditPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "end_multicaret_edit", 3218959716)

    public val isInMulitcaretEditPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_in_mulitcaret_edit", 36873697)

    public val multicaretEditIgnoreCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "multicaret_edit_ignore_caret", 1116898809)

    public val isCaretVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_caret_visible", 1051549951)

    public val getCaretDrawPosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_caret_draw_pos", 478253731)

    public val setCaretLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_caret_line", 1302582944)

    public val getCaretLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_caret_line", 1591665591)

    public val setCaretColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_caret_column", 3796796178)

    public val getCaretColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_caret_column", 1591665591)

    public val getCaretWrapIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_caret_wrap_index", 1591665591)

    public val getWordUnderCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_word_under_caret", 3929349208)

    public val setUseDefaultWordSeparatorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_use_default_word_separators", 2586408642)

    public val isDefaultWordSeparatorsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_default_word_separators_enabled", 36873697)

    public val setUseCustomWordSeparatorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_use_custom_word_separators", 2586408642)

    public val isCustomWordSeparatorsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_custom_word_separators_enabled", 36873697)

    public val setCustomWordSeparatorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_custom_word_separators", 83702148)

    public val getCustomWordSeparatorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_custom_word_separators", 201670096)

    public val setSelectingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_selecting_enabled", 2586408642)

    public val isSelectingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_selecting_enabled", 36873697)

    public val setDeselectOnFocusLossEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_deselect_on_focus_loss_enabled", 2586408642)

    public val isDeselectOnFocusLossEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_deselect_on_focus_loss_enabled", 36873697)

    public val setDragAndDropSelectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_drag_and_drop_selection_enabled", 2586408642)

    public val isDragAndDropSelectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_drag_and_drop_selection_enabled", 36873697)

    public val setSelectionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_selection_mode", 1658801786)

    public val getSelectionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_mode", 3750106938)

    public val selectAllPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "select_all", 3218959716)

    public val selectWordUnderCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "select_word_under_caret", 1025054187)

    public val addSelectionForNextOccurrencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "add_selection_for_next_occurrence", 3218959716)

    public val skipSelectionForNextOccurrencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "skip_selection_for_next_occurrence", 3218959716)

    public val selectPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "select", 2560984452)

    public val hasSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "has_selection", 2824505868)

    public val getSelectedTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selected_text", 2309358862)

    public val getSelectionAtLineColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_at_line_column", 1810224333)

    public val getLineRangesFromCaretsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_ranges_from_carets", 2393089247)

    public val getSelectionOriginLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_origin_line", 1591665591)

    public val getSelectionOriginColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_origin_column", 1591665591)

    public val setSelectionOriginLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_selection_origin_line", 195434140)

    public val setSelectionOriginColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_selection_origin_column", 2230941749)

    public val getSelectionFromLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_from_line", 1591665591)

    public val getSelectionFromColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_from_column", 1591665591)

    public val getSelectionToLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_to_line", 1591665591)

    public val getSelectionToColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_to_column", 1591665591)

    public val isCaretAfterSelectionOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_caret_after_selection_origin", 1051549951)

    public val deselectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "deselect", 1025054187)

    public val deleteSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "delete_selection", 1025054187)

    public val setLineWrappingModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_wrapping_mode", 2525115309)

    public val getLineWrappingModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_wrapping_mode", 3562716114)

    public val setAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_autowrap_mode", 3289138044)

    public val getAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_autowrap_mode", 1549071663)

    public val isLineWrappedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_line_wrapped", 1116898809)

    public val getLineWrapCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_wrap_count", 923996154)

    public val getLineWrapIndexAtColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_wrap_index_at_column", 3175239445)

    public val getLineWrappedTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_wrapped_text", 647634434)

    public val setSmoothScrollEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_smooth_scroll_enabled", 2586408642)

    public val isSmoothScrollEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_smooth_scroll_enabled", 36873697)

    public val getVScrollBarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_v_scroll_bar", 3226026593)

    public val getHScrollBarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_h_scroll_bar", 3774687988)

    public val setVScrollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_v_scroll", 373806689)

    public val getVScrollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_v_scroll", 1740695150)

    public val setHScrollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_h_scroll", 1286410249)

    public val getHScrollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_h_scroll", 3905245786)

    public val setScrollPastEndOfFileEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_scroll_past_end_of_file_enabled", 2586408642)

    public val isScrollPastEndOfFileEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_scroll_past_end_of_file_enabled", 36873697)

    public val setVScrollSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_v_scroll_speed", 373806689)

    public val getVScrollSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_v_scroll_speed", 1740695150)

    public val setFitContentHeightEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_fit_content_height_enabled", 2586408642)

    public val isFitContentHeightEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_fit_content_height_enabled", 36873697)

    public val getScrollPosForLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_scroll_pos_for_line", 3929084198)

    public val setLineAsFirstVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_as_first_visible", 2230941749)

    public val getFirstVisibleLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_first_visible_line", 3905245786)

    public val setLineAsCenterVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_as_center_visible", 2230941749)

    public val setLineAsLastVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_as_last_visible", 2230941749)

    public val getLastFullVisibleLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_last_full_visible_line", 3905245786)

    public val getLastFullVisibleLineWrapIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_last_full_visible_line_wrap_index", 3905245786)

    public val getVisibleLineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_visible_line_count", 3905245786)

    public val getVisibleLineCountInRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_visible_line_count_in_range", 3175239445)

    public val getTotalVisibleLineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_total_visible_line_count", 3905245786)

    public val adjustViewportToCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "adjust_viewport_to_caret", 1995695955)

    public val centerViewportToCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "center_viewport_to_caret", 1995695955)

    public val setDrawMinimapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_draw_minimap", 2586408642)

    public val isDrawingMinimapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_drawing_minimap", 36873697)

    public val setMinimapWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_minimap_width", 1286410249)

    public val getMinimapWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_minimap_width", 3905245786)

    public val getMinimapVisibleLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_minimap_visible_lines", 3905245786)

    public val addGutterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "add_gutter", 1025054187)

    public val removeGutterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "remove_gutter", 1286410249)

    public val getGutterCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_gutter_count", 3905245786)

    public val setGutterNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_gutter_name", 501894301)

    public val getGutterNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_gutter_name", 844755477)

    public val setGutterTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_gutter_type", 1088959071)

    public val getGutterTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_gutter_type", 1159699127)

    public val setGutterWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_gutter_width", 3937882851)

    public val getGutterWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_gutter_width", 923996154)

    public val setGutterDrawPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_gutter_draw", 300928843)

    public val isGutterDrawnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_gutter_drawn", 1116898809)

    public val setGutterClickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_gutter_clickable", 300928843)

    public val isGutterClickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_gutter_clickable", 1116898809)

    public val setGutterOverwritablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_gutter_overwritable", 300928843)

    public val isGutterOverwritablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_gutter_overwritable", 1116898809)

    public val mergeGuttersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "merge_gutters", 3937882851)

    public val setGutterCustomDrawPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_gutter_custom_draw", 957362965)

    public val getTotalGutterWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_total_gutter_width", 3905245786)

    public val setLineGutterMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_gutter_metadata", 2060538656)

    public val getLineGutterMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_gutter_metadata", 678354945)

    public val setLineGutterTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_gutter_text", 2285447957)

    public val getLineGutterTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_gutter_text", 1391810591)

    public val setLineGutterIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_gutter_icon", 176101966)

    public val getLineGutterIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_gutter_icon", 2584904275)

    public val setLineGutterItemColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_gutter_item_color", 3733378741)

    public val getLineGutterItemColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_gutter_item_color", 2165839948)

    public val setLineGutterClickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_gutter_clickable", 1383440665)

    public val isLineGutterClickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_line_gutter_clickable", 2522259332)

    public val setLineBackgroundColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_background_color", 2878471219)

    public val getLineBackgroundColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_background_color", 3457211756)

    public val setSyntaxHighlighterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_syntax_highlighter", 2765644541)

    public val getSyntaxHighlighterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_syntax_highlighter", 2721131626)

    public val setHighlightCurrentLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_highlight_current_line", 2586408642)

    public val isHighlightCurrentLineEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_highlight_current_line_enabled", 36873697)

    public val setHighlightAllOccurrencesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_highlight_all_occurrences", 2586408642)

    public val isHighlightAllOccurrencesEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_highlight_all_occurrences_enabled", 36873697)

    public val getDrawControlCharsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_draw_control_chars", 36873697)

    public val setDrawControlCharsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_draw_control_chars", 2586408642)

    public val setDrawTabsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_draw_tabs", 2586408642)

    public val isDrawingTabsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_drawing_tabs", 36873697)

    public val setDrawSpacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_draw_spaces", 2586408642)

    public val isDrawingSpacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_drawing_spaces", 36873697)

    public val getMenuPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_menu", 229722558)

    public val isMenuVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_menu_visible", 36873697)

    public val menuOptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "menu_option", 1286410249)

    public val adjustCaretsAfterEditPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "adjust_carets_after_edit", 1770277138)

    public val getCaretIndexEditOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_caret_index_edit_order", 969006518)

    public val getSelectionLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_line", 1591665591)

    public val getSelectionColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_column", 1591665591)
  }
}
