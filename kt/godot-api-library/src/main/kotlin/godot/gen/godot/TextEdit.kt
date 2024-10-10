// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.Color
import godot.core.PackedInt32Array
import godot.core.PackedStringArray
import godot.core.Rect2i
import godot.core.Signal0
import godot.core.Signal2
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
import godot.util.Internals
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
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_TEXTEDIT_INDEX: Int = 571

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
    Internals.callConstructor(this, ENGINE_CLASS_TEXTEDIT_INDEX, scriptIndex)
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
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.hasImeTextPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Closes the [url=https://en.wikipedia.org/wiki/Input_method]Input Method Editor[/url] (IME) if
   * it is open. Any text in the IME will be lost.
   */
  public final fun cancelIme(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.cancelImePtr, NIL)
  }

  /**
   * Applies text from the [url=https://en.wikipedia.org/wiki/Input_method]Input Method Editor[/url]
   * (IME) to each caret and closes the IME if it is open.
   */
  public final fun applyIme(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.applyImePtr, NIL)
  }

  public final fun setEditable(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setEditablePtr, NIL)
  }

  public final fun isEditable(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isEditablePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTextDirection(direction: Control.TextDirection): Unit {
    Internals.writeArguments(LONG to direction.id)
    Internals.callMethod(rawPtr, MethodBindings.setTextDirectionPtr, NIL)
  }

  public final fun getTextDirection(): Control.TextDirection {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTextDirectionPtr, LONG)
    return Control.TextDirection.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setLanguage(language: String): Unit {
    Internals.writeArguments(STRING to language)
    Internals.callMethod(rawPtr, MethodBindings.setLanguagePtr, NIL)
  }

  public final fun getLanguage(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLanguagePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setStructuredTextBidiOverride(parser: TextServer.StructuredTextParser): Unit {
    Internals.writeArguments(LONG to parser.id)
    Internals.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverridePtr, NIL)
  }

  public final fun getStructuredTextBidiOverride(): TextServer.StructuredTextParser {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverridePtr, LONG)
    return TextServer.StructuredTextParser.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setStructuredTextBidiOverrideOptions(args: VariantArray<Any?>): Unit {
    Internals.writeArguments(ARRAY to args)
    Internals.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverrideOptionsPtr, NIL)
  }

  public final fun getStructuredTextBidiOverrideOptions(): VariantArray<Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverrideOptionsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Sets the tab size for the [TextEdit] to use.
   */
  public final fun setTabSize(size: Int): Unit {
    Internals.writeArguments(LONG to size.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setTabSizePtr, NIL)
  }

  /**
   * Returns the [TextEdit]'s' tab size.
   */
  public final fun getTabSize(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTabSizePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setIndentWrappedLines(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setIndentWrappedLinesPtr, NIL)
  }

  public final fun isIndentWrappedLines(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isIndentWrappedLinesPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If `true`, sets the user into overtype mode. When the user types in this mode, it will override
   * existing text.
   */
  public final fun setOvertypeModeEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setOvertypeModeEnabledPtr, NIL)
  }

  /**
   * Returns whether the user is in overtype mode.
   */
  public final fun isOvertypeModeEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isOvertypeModeEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setContextMenuEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setContextMenuEnabledPtr, NIL)
  }

  public final fun isContextMenuEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isContextMenuEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setShortcutKeysEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setShortcutKeysEnabledPtr, NIL)
  }

  public final fun isShortcutKeysEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isShortcutKeysEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setVirtualKeyboardEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setVirtualKeyboardEnabledPtr, NIL)
  }

  public final fun isVirtualKeyboardEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isVirtualKeyboardEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMiddleMousePasteEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setMiddleMousePasteEnabledPtr, NIL)
  }

  public final fun isMiddleMousePasteEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isMiddleMousePasteEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Performs a full reset of [TextEdit], including undo history.
   */
  public final fun clear(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public final fun setText(text: String): Unit {
    Internals.writeArguments(STRING to text)
    Internals.callMethod(rawPtr, MethodBindings.setTextPtr, NIL)
  }

  public final fun getText(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTextPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the number of lines in the text.
   */
  public final fun getLineCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLineCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setPlaceholder(text: String): Unit {
    Internals.writeArguments(STRING to text)
    Internals.callMethod(rawPtr, MethodBindings.setPlaceholderPtr, NIL)
  }

  public final fun getPlaceholder(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPlaceholderPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Sets the text for a specific [line].
   * Carets on the line will attempt to keep their visual x position.
   */
  public final fun setLine(line: Int, newText: String): Unit {
    Internals.writeArguments(LONG to line.toLong(), STRING to newText)
    Internals.callMethod(rawPtr, MethodBindings.setLinePtr, NIL)
  }

  /**
   * Returns the text of a specific line.
   */
  public final fun getLine(line: Int): String {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getLinePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the width in pixels of the [wrapIndex] on [line].
   */
  @JvmOverloads
  public final fun getLineWidth(line: Int, wrapIndex: Int = -1): Int {
    Internals.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getLineWidthPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the maximum value of the line height among all lines.
   * **Note:** The return value is influenced by [theme_item line_spacing] and [theme_item
   * font_size]. And it will not be less than `1`.
   */
  public final fun getLineHeight(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLineHeightPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of spaces and `tab * tab_size` before the first char.
   */
  public final fun getIndentLevel(line: Int): Int {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getIndentLevelPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the first column containing a non-whitespace character.
   */
  public final fun getFirstNonWhitespaceColumn(line: Int): Int {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getFirstNonWhitespaceColumnPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Swaps the two lines. Carets will be swapped with the lines.
   */
  public final fun swapLines(fromLine: Int, toLine: Int): Unit {
    Internals.writeArguments(LONG to fromLine.toLong(), LONG to toLine.toLong())
    Internals.callMethod(rawPtr, MethodBindings.swapLinesPtr, NIL)
  }

  /**
   * Inserts a new line with [text] at [line].
   */
  public final fun insertLineAt(line: Int, text: String): Unit {
    Internals.writeArguments(LONG to line.toLong(), STRING to text)
    Internals.callMethod(rawPtr, MethodBindings.insertLineAtPtr, NIL)
  }

  /**
   * Removes the line of text at [line]. Carets on this line will attempt to match their previous
   * visual x position.
   * If [moveCaretsDown] is `true` carets will move to the next line down, otherwise carets will
   * move up.
   */
  @JvmOverloads
  public final fun removeLineAt(line: Int, moveCaretsDown: Boolean = true): Unit {
    Internals.writeArguments(LONG to line.toLong(), BOOL to moveCaretsDown)
    Internals.callMethod(rawPtr, MethodBindings.removeLineAtPtr, NIL)
  }

  /**
   * Insert the specified text at the caret position.
   */
  @JvmOverloads
  public final fun insertTextAtCaret(text: String, caretIndex: Int = -1): Unit {
    Internals.writeArguments(STRING to text, LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.insertTextAtCaretPtr, NIL)
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
    Internals.writeArguments(STRING to text, LONG to line.toLong(), LONG to column.toLong(), BOOL to beforeSelectionBegin, BOOL to beforeSelectionEnd)
    Internals.callMethod(rawPtr, MethodBindings.insertTextPtr, NIL)
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
    Internals.writeArguments(LONG to fromLine.toLong(), LONG to fromColumn.toLong(), LONG to toLine.toLong(), LONG to toColumn.toLong())
    Internals.callMethod(rawPtr, MethodBindings.removeTextPtr, NIL)
  }

  /**
   * Returns the last unhidden line in the entire [TextEdit].
   */
  public final fun getLastUnhiddenLine(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLastUnhiddenLinePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the count to the next visible line from [line] to `line + visible_amount`. Can also
   * count backwards. For example if a [TextEdit] has 5 lines with lines 2 and 3 hidden, calling this
   * with `line = 1, visible_amount = 1` would return 3.
   */
  public final fun getNextVisibleLineOffsetFrom(line: Int, visibleAmount: Int): Int {
    Internals.writeArguments(LONG to line.toLong(), LONG to visibleAmount.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getNextVisibleLineOffsetFromPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
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
    Internals.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong(), LONG to visibleAmount.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getNextVisibleLineIndexOffsetFromPtr, VECTOR2I)
    return (Internals.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Called when the user presses the backspace key. Can be overridden with [_backspace].
   */
  @JvmOverloads
  public final fun backspace(caretIndex: Int = -1): Unit {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.backspacePtr, NIL)
  }

  /**
   * Cut's the current selection. Can be overridden with [_cut].
   */
  @JvmOverloads
  public final fun cut(caretIndex: Int = -1): Unit {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.cutPtr, NIL)
  }

  /**
   * Copies the current text selection. Can be overridden with [_copy].
   */
  @JvmOverloads
  public final fun copy(caretIndex: Int = -1): Unit {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.copyPtr, NIL)
  }

  /**
   * Paste at the current location. Can be overridden with [_paste].
   */
  @JvmOverloads
  public final fun paste(caretIndex: Int = -1): Unit {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.pastePtr, NIL)
  }

  /**
   * Pastes the primary clipboard.
   */
  @JvmOverloads
  public final fun pastePrimaryClipboard(caretIndex: Int = -1): Unit {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.pastePrimaryClipboardPtr, NIL)
  }

  /**
   * Starts an action, will end the current action if [action] is different.
   * An action will also end after a call to [endAction], after
   * [ProjectSettings.gui/timers/textEditIdleDetectSec] is triggered or a new undoable step outside the
   * [startAction] and [endAction] calls.
   */
  public final fun startAction(action: EditAction): Unit {
    Internals.writeArguments(LONG to action.id)
    Internals.callMethod(rawPtr, MethodBindings.startActionPtr, NIL)
  }

  /**
   * Marks the end of steps in the current action started with [startAction].
   */
  public final fun endAction(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.endActionPtr, NIL)
  }

  /**
   * Starts a multipart edit. All edits will be treated as one action until [endComplexOperation] is
   * called.
   */
  public final fun beginComplexOperation(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.beginComplexOperationPtr, NIL)
  }

  /**
   * Ends a multipart edit, started with [beginComplexOperation]. If called outside a complex
   * operation, the current operation is pushed onto the undo/redo stack.
   */
  public final fun endComplexOperation(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.endComplexOperationPtr, NIL)
  }

  /**
   * Returns `true` if an "undo" action is available.
   */
  public final fun hasUndo(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.hasUndoPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if a "redo" action is available.
   */
  public final fun hasRedo(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.hasRedoPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Perform undo operation.
   */
  public final fun undo(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.undoPtr, NIL)
  }

  /**
   * Perform redo operation.
   */
  public final fun redo(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.redoPtr, NIL)
  }

  /**
   * Clears the undo history.
   */
  public final fun clearUndoHistory(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearUndoHistoryPtr, NIL)
  }

  /**
   * Tag the current version as saved.
   */
  public final fun tagSavedVersion(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.tagSavedVersionPtr, NIL)
  }

  /**
   * Returns the current version of the [TextEdit]. The version is a count of recorded operations by
   * the undo/redo history.
   */
  public final fun getVersion(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVersionPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the last tagged saved version from [tagSavedVersion].
   */
  public final fun getSavedVersion(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSavedVersionPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the search text. See [setSearchFlags].
   */
  public final fun setSearchText(searchText: String): Unit {
    Internals.writeArguments(STRING to searchText)
    Internals.callMethod(rawPtr, MethodBindings.setSearchTextPtr, NIL)
  }

  /**
   * Sets the search [flags]. This is used with [setSearchText] to highlight occurrences of the
   * searched text. Search flags can be specified from the [SearchFlags] enum.
   */
  public final fun setSearchFlags(flags: Long): Unit {
    Internals.writeArguments(LONG to flags)
    Internals.callMethod(rawPtr, MethodBindings.setSearchFlagsPtr, NIL)
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
    Internals.writeArguments(STRING to text, LONG to flags, LONG to fromLine.toLong(), LONG to fromColumn.toLong())
    Internals.callMethod(rawPtr, MethodBindings.searchPtr, VECTOR2I)
    return (Internals.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Provide custom tooltip text. The callback method must take the following args: `hovered_word:
   * String`.
   */
  public final fun setTooltipRequestFunc(callback: Callable): Unit {
    Internals.writeArguments(CALLABLE to callback)
    Internals.callMethod(rawPtr, MethodBindings.setTooltipRequestFuncPtr, NIL)
  }

  /**
   * Returns the local mouse position adjusted for the text direction.
   */
  public final fun getLocalMousePos(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLocalMousePosPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the word at [position].
   */
  public final fun getWordAtPos(position: Vector2): String {
    Internals.writeArguments(VECTOR2 to position)
    Internals.callMethod(rawPtr, MethodBindings.getWordAtPosPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the line and column at the given position. In the returned vector, `x` is the column,
   * `y` is the line. If [allowOutOfBounds] is `false` and the position is not over the text, both
   * vector values will be set to `-1`.
   */
  @JvmOverloads
  public final fun getLineColumnAtPos(position: Vector2i, allowOutOfBounds: Boolean = true):
      Vector2i {
    Internals.writeArguments(VECTOR2I to position, BOOL to allowOutOfBounds)
    Internals.callMethod(rawPtr, MethodBindings.getLineColumnAtPosPtr, VECTOR2I)
    return (Internals.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the local position for the given [line] and [column]. If `x` or `y` of the returned
   * vector equal `-1`, the position is outside of the viewable area of the control.
   * **Note:** The Y position corresponds to the bottom side of the line. Use [getRectAtLineColumn]
   * to get the top side position.
   */
  public final fun getPosAtLineColumn(line: Int, column: Int): Vector2i {
    Internals.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getPosAtLineColumnPtr, VECTOR2I)
    return (Internals.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the local position and size for the grapheme at the given [line] and [column]. If `x`
   * or `y` position of the returned rect equal `-1`, the position is outside of the viewable area of
   * the control.
   * **Note:** The Y position of the returned rect corresponds to the top side of the line, unlike
   * [getPosAtLineColumn] which returns the bottom side.
   */
  public final fun getRectAtLineColumn(line: Int, column: Int): Rect2i {
    Internals.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getRectAtLineColumnPtr, RECT2I)
    return (Internals.readReturnValue(RECT2I) as Rect2i)
  }

  /**
   * Returns the equivalent minimap line at [position].
   */
  public final fun getMinimapLineAtPos(position: Vector2i): Int {
    Internals.writeArguments(VECTOR2I to position)
    Internals.callMethod(rawPtr, MethodBindings.getMinimapLineAtPosPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the user is dragging their mouse for scrolling, selecting, or text dragging.
   */
  public final fun isDraggingCursor(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isDraggingCursorPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns whether the mouse is over selection. If [edges] is `true`, the edges are considered
   * part of the selection.
   */
  @JvmOverloads
  public final fun isMouseOverSelection(edges: Boolean, caretIndex: Int = -1): Boolean {
    Internals.writeArguments(BOOL to edges, LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isMouseOverSelectionPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCaretType(type: CaretType): Unit {
    Internals.writeArguments(LONG to type.id)
    Internals.callMethod(rawPtr, MethodBindings.setCaretTypePtr, NIL)
  }

  public final fun getCaretType(): CaretType {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCaretTypePtr, LONG)
    return TextEdit.CaretType.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setCaretBlinkEnabled(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setCaretBlinkEnabledPtr, NIL)
  }

  public final fun isCaretBlinkEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isCaretBlinkEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCaretBlinkInterval(interval: Float): Unit {
    Internals.writeArguments(DOUBLE to interval.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setCaretBlinkIntervalPtr, NIL)
  }

  public final fun getCaretBlinkInterval(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCaretBlinkIntervalPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDrawCaretWhenEditableDisabled(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setDrawCaretWhenEditableDisabledPtr, NIL)
  }

  public final fun isDrawingCaretWhenEditableDisabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isDrawingCaretWhenEditableDisabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMoveCaretOnRightClickEnabled(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setMoveCaretOnRightClickEnabledPtr, NIL)
  }

  public final fun isMoveCaretOnRightClickEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isMoveCaretOnRightClickEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCaretMidGraphemeEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setCaretMidGraphemeEnabledPtr, NIL)
  }

  public final fun isCaretMidGraphemeEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isCaretMidGraphemeEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMultipleCaretsEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setMultipleCaretsEnabledPtr, NIL)
  }

  public final fun isMultipleCaretsEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isMultipleCaretsEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds a new caret at the given location. Returns the index of the new caret, or `-1` if the
   * location is invalid.
   */
  public final fun addCaret(line: Int, column: Int): Int {
    Internals.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addCaretPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Removes the given caret index.
   * **Note:** This can result in adjustment of all other caret indices.
   */
  public final fun removeCaret(caret: Int): Unit {
    Internals.writeArguments(LONG to caret.toLong())
    Internals.callMethod(rawPtr, MethodBindings.removeCaretPtr, NIL)
  }

  /**
   * Removes all additional carets.
   */
  public final fun removeSecondaryCarets(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.removeSecondaryCaretsPtr, NIL)
  }

  /**
   * Returns the number of carets in this [TextEdit].
   */
  public final fun getCaretCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCaretCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adds an additional caret above or below every caret. If [below] is `true` the new caret will be
   * added below and above otherwise.
   */
  public final fun addCaretAtCarets(below: Boolean): Unit {
    Internals.writeArguments(BOOL to below)
    Internals.callMethod(rawPtr, MethodBindings.addCaretAtCaretsPtr, NIL)
  }

  /**
   * Returns the carets sorted by selection beginning from lowest line and column to highest (from
   * top to bottom of text).
   * If [includeIgnoredCarets] is `false`, carets from [multicaretEditIgnoreCaret] will be ignored.
   */
  @JvmOverloads
  public final fun getSortedCarets(includeIgnoredCarets: Boolean = false): PackedInt32Array {
    Internals.writeArguments(BOOL to includeIgnoredCarets)
    Internals.callMethod(rawPtr, MethodBindings.getSortedCaretsPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
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
    Internals.writeArguments(LONG to fromLine.toLong(), LONG to fromColumn.toLong(), LONG to toLine.toLong(), LONG to toColumn.toLong(), BOOL to inclusive)
    Internals.callMethod(rawPtr, MethodBindings.collapseCaretsPtr, NIL)
  }

  /**
   * Merges any overlapping carets. Will favor the newest caret, or the caret with a selection.
   * If [isInMulitcaretEdit] is `true`, the merge will be queued to happen at the end of the
   * multicaret edit. See [beginMulticaretEdit] and [endMulticaretEdit].
   * **Note:** This is not called when a caret changes position but after certain actions, so it is
   * possible to get into a state where carets overlap.
   */
  public final fun mergeOverlappingCarets(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.mergeOverlappingCaretsPtr, NIL)
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
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.beginMulticaretEditPtr, NIL)
  }

  /**
   * Ends an edit for multiple carets, that was started with [beginMulticaretEdit]. If this was the
   * last [endMulticaretEdit] and [mergeOverlappingCarets] was called, carets will be merged.
   */
  public final fun endMulticaretEdit(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.endMulticaretEditPtr, NIL)
  }

  /**
   * Returns `true` if a [beginMulticaretEdit] has been called and [endMulticaretEdit] has not yet
   * been called.
   */
  public final fun isInMulitcaretEdit(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isInMulitcaretEditPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
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
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.multicaretEditIgnoreCaretPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the caret is visible on the screen.
   */
  @JvmOverloads
  public final fun isCaretVisible(caretIndex: Int = 0): Boolean {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isCaretVisiblePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the caret pixel draw position.
   */
  @JvmOverloads
  public final fun getCaretDrawPos(caretIndex: Int = 0): Vector2 {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getCaretDrawPosPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
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
    Internals.writeArguments(LONG to line.toLong(), BOOL to adjustViewport, BOOL to canBeHidden, LONG to wrapIndex.toLong(), LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setCaretLinePtr, NIL)
  }

  /**
   * Returns the line the editing caret is on.
   */
  @JvmOverloads
  public final fun getCaretLine(caretIndex: Int = 0): Int {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getCaretLinePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
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
    Internals.writeArguments(LONG to column.toLong(), BOOL to adjustViewport, LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setCaretColumnPtr, NIL)
  }

  /**
   * Returns the column the editing caret is at.
   */
  @JvmOverloads
  public final fun getCaretColumn(caretIndex: Int = 0): Int {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getCaretColumnPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the wrap index the editing caret is on.
   */
  @JvmOverloads
  public final fun getCaretWrapIndex(caretIndex: Int = 0): Int {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getCaretWrapIndexPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns a [String] text with the word under the caret's location.
   */
  @JvmOverloads
  public final fun getWordUnderCaret(caretIndex: Int = -1): String {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getWordUnderCaretPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setUseDefaultWordSeparators(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setUseDefaultWordSeparatorsPtr, NIL)
  }

  public final fun isDefaultWordSeparatorsEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isDefaultWordSeparatorsEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUseCustomWordSeparators(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setUseCustomWordSeparatorsPtr, NIL)
  }

  public final fun isCustomWordSeparatorsEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isCustomWordSeparatorsEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCustomWordSeparators(customWordSeparators: String): Unit {
    Internals.writeArguments(STRING to customWordSeparators)
    Internals.callMethod(rawPtr, MethodBindings.setCustomWordSeparatorsPtr, NIL)
  }

  public final fun getCustomWordSeparators(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCustomWordSeparatorsPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setSelectingEnabled(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setSelectingEnabledPtr, NIL)
  }

  public final fun isSelectingEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isSelectingEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDeselectOnFocusLossEnabled(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setDeselectOnFocusLossEnabledPtr, NIL)
  }

  public final fun isDeselectOnFocusLossEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isDeselectOnFocusLossEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDragAndDropSelectionEnabled(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setDragAndDropSelectionEnabledPtr, NIL)
  }

  public final fun isDragAndDropSelectionEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isDragAndDropSelectionEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the current selection mode.
   */
  public final fun setSelectionMode(mode: SelectionMode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setSelectionModePtr, NIL)
  }

  /**
   * Returns the current selection mode.
   */
  public final fun getSelectionMode(): SelectionMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSelectionModePtr, LONG)
    return TextEdit.SelectionMode.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Select all the text.
   * If [selectingEnabled] is `false`, no selection will occur.
   */
  public final fun selectAll(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.selectAllPtr, NIL)
  }

  /**
   * Selects the word under the caret.
   */
  @JvmOverloads
  public final fun selectWordUnderCaret(caretIndex: Int = -1): Unit {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.selectWordUnderCaretPtr, NIL)
  }

  /**
   * Adds a selection and a caret for the next occurrence of the current selection. If there is no
   * active selection, selects word under caret.
   */
  public final fun addSelectionForNextOccurrence(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.addSelectionForNextOccurrencePtr, NIL)
  }

  /**
   * Moves a selection and a caret for the next occurrence of the current selection. If there is no
   * active selection, moves to the next occurrence of the word under caret.
   */
  public final fun skipSelectionForNextOccurrence(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.skipSelectionForNextOccurrencePtr, NIL)
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
    Internals.writeArguments(LONG to originLine.toLong(), LONG to originColumn.toLong(), LONG to caretLine.toLong(), LONG to caretColumn.toLong(), LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.selectPtr, NIL)
  }

  /**
   * Returns `true` if the user has selected text.
   */
  @JvmOverloads
  public final fun hasSelection(caretIndex: Int = -1): Boolean {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.hasSelectionPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the text inside the selection of a caret, or all the carets if [caretIndex] is its
   * default value `-1`.
   */
  @JvmOverloads
  public final fun getSelectedText(caretIndex: Int = -1): String {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getSelectedTextPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
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
    Internals.writeArguments(LONG to line.toLong(), LONG to column.toLong(), BOOL to includeEdges, BOOL to onlySelections)
    Internals.callMethod(rawPtr, MethodBindings.getSelectionAtLineColumnPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
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
    Internals.writeArguments(BOOL to onlySelections, BOOL to mergeAdjacent)
    Internals.callMethod(rawPtr, MethodBindings.getLineRangesFromCaretsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Vector2i>)
  }

  /**
   * Returns the origin line of the selection. This is the opposite end from the caret.
   */
  @JvmOverloads
  public final fun getSelectionOriginLine(caretIndex: Int = 0): Int {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getSelectionOriginLinePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the origin column of the selection. This is the opposite end from the caret.
   */
  @JvmOverloads
  public final fun getSelectionOriginColumn(caretIndex: Int = 0): Int {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getSelectionOriginColumnPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
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
    Internals.writeArguments(LONG to line.toLong(), BOOL to canBeHidden, LONG to wrapIndex.toLong(), LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setSelectionOriginLinePtr, NIL)
  }

  /**
   * Sets the selection origin column to the [column] for the given [caretIndex]. If the selection
   * origin is moved to the caret position, the selection will deselect.
   */
  @JvmOverloads
  public final fun setSelectionOriginColumn(column: Int, caretIndex: Int = 0): Unit {
    Internals.writeArguments(LONG to column.toLong(), LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setSelectionOriginColumnPtr, NIL)
  }

  /**
   * Returns the selection begin line. Returns the caret line if there is no selection.
   */
  @JvmOverloads
  public final fun getSelectionFromLine(caretIndex: Int = 0): Int {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getSelectionFromLinePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the selection begin column. Returns the caret column if there is no selection.
   */
  @JvmOverloads
  public final fun getSelectionFromColumn(caretIndex: Int = 0): Int {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getSelectionFromColumnPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the selection end line. Returns the caret line if there is no selection.
   */
  @JvmOverloads
  public final fun getSelectionToLine(caretIndex: Int = 0): Int {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getSelectionToLinePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the selection end column. Returns the caret column if there is no selection.
   */
  @JvmOverloads
  public final fun getSelectionToColumn(caretIndex: Int = 0): Int {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getSelectionToColumnPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the caret of the selection is after the selection origin. This can be used to
   * determine the direction of the selection.
   */
  @JvmOverloads
  public final fun isCaretAfterSelectionOrigin(caretIndex: Int = 0): Boolean {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isCaretAfterSelectionOriginPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Deselects the current selection.
   */
  @JvmOverloads
  public final fun deselect(caretIndex: Int = -1): Unit {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.deselectPtr, NIL)
  }

  /**
   * Deletes the selected text.
   */
  @JvmOverloads
  public final fun deleteSelection(caretIndex: Int = -1): Unit {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.deleteSelectionPtr, NIL)
  }

  public final fun setLineWrappingMode(mode: LineWrappingMode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setLineWrappingModePtr, NIL)
  }

  public final fun getLineWrappingMode(): LineWrappingMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLineWrappingModePtr, LONG)
    return TextEdit.LineWrappingMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setAutowrapMode(autowrapMode: TextServer.AutowrapMode): Unit {
    Internals.writeArguments(LONG to autowrapMode.id)
    Internals.callMethod(rawPtr, MethodBindings.setAutowrapModePtr, NIL)
  }

  public final fun getAutowrapMode(): TextServer.AutowrapMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAutowrapModePtr, LONG)
    return TextServer.AutowrapMode.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns if the given line is wrapped.
   */
  public final fun isLineWrapped(line: Int): Boolean {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isLineWrappedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the number of times the given line is wrapped.
   */
  public final fun getLineWrapCount(line: Int): Int {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getLineWrapCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the wrap index of the given line column.
   */
  public final fun getLineWrapIndexAtColumn(line: Int, column: Int): Int {
    Internals.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getLineWrapIndexAtColumnPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns an array of [String]s representing each wrapped index.
   */
  public final fun getLineWrappedText(line: Int): PackedStringArray {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getLineWrappedTextPtr, PACKED_STRING_ARRAY)
    return (Internals.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  public final fun setSmoothScrollEnabled(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setSmoothScrollEnabledPtr, NIL)
  }

  public final fun isSmoothScrollEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isSmoothScrollEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the [VScrollBar] of the [TextEdit].
   */
  public final fun getVScrollBar(): VScrollBar? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVScrollBarPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as VScrollBar?)
  }

  /**
   * Returns the [HScrollBar] used by [TextEdit].
   */
  public final fun getHScrollBar(): HScrollBar? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHScrollBarPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as HScrollBar?)
  }

  public final fun setVScroll(`value`: Double): Unit {
    Internals.writeArguments(DOUBLE to value)
    Internals.callMethod(rawPtr, MethodBindings.setVScrollPtr, NIL)
  }

  public final fun getVScroll(): Double {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVScrollPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double)
  }

  public final fun setHScroll(`value`: Int): Unit {
    Internals.writeArguments(LONG to value.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setHScrollPtr, NIL)
  }

  public final fun getHScroll(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHScrollPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setScrollPastEndOfFileEnabled(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setScrollPastEndOfFileEnabledPtr, NIL)
  }

  public final fun isScrollPastEndOfFileEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isScrollPastEndOfFileEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setVScrollSpeed(speed: Float): Unit {
    Internals.writeArguments(DOUBLE to speed.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setVScrollSpeedPtr, NIL)
  }

  public final fun getVScrollSpeed(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVScrollSpeedPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFitContentHeightEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setFitContentHeightEnabledPtr, NIL)
  }

  public final fun isFitContentHeightEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isFitContentHeightEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the scroll position for [wrapIndex] of [line].
   */
  @JvmOverloads
  public final fun getScrollPosForLine(line: Int, wrapIndex: Int = 0): Double {
    Internals.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getScrollPosForLinePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Positions the [wrapIndex] of [line] at the top of the viewport.
   */
  @JvmOverloads
  public final fun setLineAsFirstVisible(line: Int, wrapIndex: Int = 0): Unit {
    Internals.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setLineAsFirstVisiblePtr, NIL)
  }

  /**
   * Returns the first visible line.
   */
  public final fun getFirstVisibleLine(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFirstVisibleLinePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Positions the [wrapIndex] of [line] at the center of the viewport.
   */
  @JvmOverloads
  public final fun setLineAsCenterVisible(line: Int, wrapIndex: Int = 0): Unit {
    Internals.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setLineAsCenterVisiblePtr, NIL)
  }

  /**
   * Positions the [wrapIndex] of [line] at the bottom of the viewport.
   */
  @JvmOverloads
  public final fun setLineAsLastVisible(line: Int, wrapIndex: Int = 0): Unit {
    Internals.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setLineAsLastVisiblePtr, NIL)
  }

  /**
   * Returns the last visible line. Use [getLastFullVisibleLineWrapIndex] for the wrap index.
   */
  public final fun getLastFullVisibleLine(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLastFullVisibleLinePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the last visible wrap index of the last visible line.
   */
  public final fun getLastFullVisibleLineWrapIndex(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLastFullVisibleLineWrapIndexPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of visible lines, including wrapped text.
   */
  public final fun getVisibleLineCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVisibleLineCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the total number of visible + wrapped lines between the two lines.
   */
  public final fun getVisibleLineCountInRange(fromLine: Int, toLine: Int): Int {
    Internals.writeArguments(LONG to fromLine.toLong(), LONG to toLine.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getVisibleLineCountInRangePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of lines that may be drawn.
   */
  public final fun getTotalVisibleLineCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTotalVisibleLineCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adjust the viewport so the caret is visible.
   */
  @JvmOverloads
  public final fun adjustViewportToCaret(caretIndex: Int = 0): Unit {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.adjustViewportToCaretPtr, NIL)
  }

  /**
   * Centers the viewport on the line the editing caret is at. This also resets the
   * [scrollHorizontal] value to `0`.
   */
  @JvmOverloads
  public final fun centerViewportToCaret(caretIndex: Int = 0): Unit {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.centerViewportToCaretPtr, NIL)
  }

  public final fun setDrawMinimap(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setDrawMinimapPtr, NIL)
  }

  public final fun isDrawingMinimap(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isDrawingMinimapPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMinimapWidth(width: Int): Unit {
    Internals.writeArguments(LONG to width.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setMinimapWidthPtr, NIL)
  }

  public final fun getMinimapWidth(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMinimapWidthPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of lines that may be drawn on the minimap.
   */
  public final fun getMinimapVisibleLines(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMinimapVisibleLinesPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Register a new gutter to this [TextEdit]. Use [at] to have a specific gutter order. A value of
   * `-1` appends the gutter to the right.
   */
  @JvmOverloads
  public final fun addGutter(at: Int = -1): Unit {
    Internals.writeArguments(LONG to at.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addGutterPtr, NIL)
  }

  /**
   * Removes the gutter from this [TextEdit].
   */
  public final fun removeGutter(gutter: Int): Unit {
    Internals.writeArguments(LONG to gutter.toLong())
    Internals.callMethod(rawPtr, MethodBindings.removeGutterPtr, NIL)
  }

  /**
   * Returns the number of gutters registered.
   */
  public final fun getGutterCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGutterCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the name of the gutter.
   */
  public final fun setGutterName(gutter: Int, name: String): Unit {
    Internals.writeArguments(LONG to gutter.toLong(), STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.setGutterNamePtr, NIL)
  }

  /**
   * Returns the name of the gutter at the given index.
   */
  public final fun getGutterName(gutter: Int): String {
    Internals.writeArguments(LONG to gutter.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getGutterNamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Sets the type of gutter. Gutters can contain icons, text, or custom visuals. See
   * [TextEdit.GutterType] for options.
   */
  public final fun setGutterType(gutter: Int, type: GutterType): Unit {
    Internals.writeArguments(LONG to gutter.toLong(), LONG to type.id)
    Internals.callMethod(rawPtr, MethodBindings.setGutterTypePtr, NIL)
  }

  /**
   * Returns the type of the gutter at the given index. Gutters can contain icons, text, or custom
   * visuals. See [TextEdit.GutterType] for options.
   */
  public final fun getGutterType(gutter: Int): GutterType {
    Internals.writeArguments(LONG to gutter.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getGutterTypePtr, LONG)
    return TextEdit.GutterType.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Set the width of the gutter.
   */
  public final fun setGutterWidth(gutter: Int, width: Int): Unit {
    Internals.writeArguments(LONG to gutter.toLong(), LONG to width.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setGutterWidthPtr, NIL)
  }

  /**
   * Returns the width of the gutter at the given index.
   */
  public final fun getGutterWidth(gutter: Int): Int {
    Internals.writeArguments(LONG to gutter.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getGutterWidthPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets whether the gutter should be drawn.
   */
  public final fun setGutterDraw(gutter: Int, draw: Boolean): Unit {
    Internals.writeArguments(LONG to gutter.toLong(), BOOL to draw)
    Internals.callMethod(rawPtr, MethodBindings.setGutterDrawPtr, NIL)
  }

  /**
   * Returns whether the gutter is currently drawn.
   */
  public final fun isGutterDrawn(gutter: Int): Boolean {
    Internals.writeArguments(LONG to gutter.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isGutterDrawnPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the gutter as clickable. This will change the mouse cursor to a pointing hand when
   * hovering over the gutter.
   */
  public final fun setGutterClickable(gutter: Int, clickable: Boolean): Unit {
    Internals.writeArguments(LONG to gutter.toLong(), BOOL to clickable)
    Internals.callMethod(rawPtr, MethodBindings.setGutterClickablePtr, NIL)
  }

  /**
   * Returns whether the gutter is clickable.
   */
  public final fun isGutterClickable(gutter: Int): Boolean {
    Internals.writeArguments(LONG to gutter.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isGutterClickablePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the gutter to overwritable. See [mergeGutters].
   */
  public final fun setGutterOverwritable(gutter: Int, overwritable: Boolean): Unit {
    Internals.writeArguments(LONG to gutter.toLong(), BOOL to overwritable)
    Internals.callMethod(rawPtr, MethodBindings.setGutterOverwritablePtr, NIL)
  }

  /**
   * Returns whether the gutter is overwritable.
   */
  public final fun isGutterOverwritable(gutter: Int): Boolean {
    Internals.writeArguments(LONG to gutter.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isGutterOverwritablePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Merge the gutters from [fromLine] into [toLine]. Only overwritable gutters will be copied.
   */
  public final fun mergeGutters(fromLine: Int, toLine: Int): Unit {
    Internals.writeArguments(LONG to fromLine.toLong(), LONG to toLine.toLong())
    Internals.callMethod(rawPtr, MethodBindings.mergeGuttersPtr, NIL)
  }

  /**
   * Set a custom draw method for the gutter. The callback method must take the following args:
   * `line: int, gutter: int, Area: Rect2`. This only works when the gutter type is
   * [GUTTER_TYPE_CUSTOM] (see [setGutterType]).
   */
  public final fun setGutterCustomDraw(column: Int, drawCallback: Callable): Unit {
    Internals.writeArguments(LONG to column.toLong(), CALLABLE to drawCallback)
    Internals.callMethod(rawPtr, MethodBindings.setGutterCustomDrawPtr, NIL)
  }

  /**
   * Returns the total width of all gutters and internal padding.
   */
  public final fun getTotalGutterWidth(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTotalGutterWidthPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the metadata for [gutter] on [line] to [metadata].
   */
  public final fun setLineGutterMetadata(
    line: Int,
    gutter: Int,
    metadata: Any?,
  ): Unit {
    Internals.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), ANY to metadata)
    Internals.callMethod(rawPtr, MethodBindings.setLineGutterMetadataPtr, NIL)
  }

  /**
   * Returns the metadata currently in [gutter] at [line].
   */
  public final fun getLineGutterMetadata(line: Int, gutter: Int): Any? {
    Internals.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getLineGutterMetadataPtr, ANY)
    return (Internals.readReturnValue(ANY) as Any?)
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
    Internals.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), STRING to text)
    Internals.callMethod(rawPtr, MethodBindings.setLineGutterTextPtr, NIL)
  }

  /**
   * Returns the text currently in [gutter] at [line]. This only works when the gutter type is
   * [GUTTER_TYPE_STRING] (see [setGutterType]).
   */
  public final fun getLineGutterText(line: Int, gutter: Int): String {
    Internals.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getLineGutterTextPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
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
    Internals.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), OBJECT to icon)
    Internals.callMethod(rawPtr, MethodBindings.setLineGutterIconPtr, NIL)
  }

  /**
   * Returns the icon currently in [gutter] at [line]. This only works when the gutter type is
   * [GUTTER_TYPE_ICON] (see [setGutterType]).
   */
  public final fun getLineGutterIcon(line: Int, gutter: Int): Texture2D? {
    Internals.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getLineGutterIconPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Sets the color for [gutter] on [line] to [color].
   */
  public final fun setLineGutterItemColor(
    line: Int,
    gutter: Int,
    color: Color,
  ): Unit {
    Internals.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.setLineGutterItemColorPtr, NIL)
  }

  /**
   * Returns the color currently in [gutter] at [line].
   */
  public final fun getLineGutterItemColor(line: Int, gutter: Int): Color {
    Internals.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getLineGutterItemColorPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  /**
   * If [clickable] is `true`, makes the [gutter] on [line] clickable. See [signal gutter_clicked].
   */
  public final fun setLineGutterClickable(
    line: Int,
    gutter: Int,
    clickable: Boolean,
  ): Unit {
    Internals.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), BOOL to clickable)
    Internals.callMethod(rawPtr, MethodBindings.setLineGutterClickablePtr, NIL)
  }

  /**
   * Returns whether the gutter on the given line is clickable.
   */
  public final fun isLineGutterClickable(line: Int, gutter: Int): Boolean {
    Internals.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isLineGutterClickablePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the current background color of the line. Set to `Color(0, 0, 0, 0)` for no color.
   */
  public final fun setLineBackgroundColor(line: Int, color: Color): Unit {
    Internals.writeArguments(LONG to line.toLong(), COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.setLineBackgroundColorPtr, NIL)
  }

  /**
   * Returns the current background color of the line. `Color(0, 0, 0, 0)` is returned if no color
   * is set.
   */
  public final fun getLineBackgroundColor(line: Int): Color {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getLineBackgroundColorPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setSyntaxHighlighter(syntaxHighlighter: SyntaxHighlighter?): Unit {
    Internals.writeArguments(OBJECT to syntaxHighlighter)
    Internals.callMethod(rawPtr, MethodBindings.setSyntaxHighlighterPtr, NIL)
  }

  public final fun getSyntaxHighlighter(): SyntaxHighlighter? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSyntaxHighlighterPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as SyntaxHighlighter?)
  }

  public final fun setHighlightCurrentLine(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setHighlightCurrentLinePtr, NIL)
  }

  public final fun isHighlightCurrentLineEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isHighlightCurrentLineEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setHighlightAllOccurrences(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setHighlightAllOccurrencesPtr, NIL)
  }

  public final fun isHighlightAllOccurrencesEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isHighlightAllOccurrencesEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun getDrawControlChars(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDrawControlCharsPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDrawControlChars(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setDrawControlCharsPtr, NIL)
  }

  public final fun setDrawTabs(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setDrawTabsPtr, NIL)
  }

  public final fun isDrawingTabs(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isDrawingTabsPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDrawSpaces(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setDrawSpacesPtr, NIL)
  }

  public final fun isDrawingSpaces(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isDrawingSpacesPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
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
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMenuPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as PopupMenu?)
  }

  /**
   * Returns whether the menu is visible. Use this instead of `get_menu().visible` to improve
   * performance (so the creation of the menu is avoided).
   */
  public final fun isMenuVisible(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isMenuVisiblePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Executes a given action as defined in the [MenuItems] enum.
   */
  public final fun menuOption(option: Int): Unit {
    Internals.writeArguments(LONG to option.toLong())
    Internals.callMethod(rawPtr, MethodBindings.menuOptionPtr, NIL)
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
    Internals.writeArguments(LONG to caret.toLong(), LONG to fromLine.toLong(), LONG to fromCol.toLong(), LONG to toLine.toLong(), LONG to toCol.toLong())
    Internals.callMethod(rawPtr, MethodBindings.adjustCaretsAfterEditPtr, NIL)
  }

  /**
   * Returns a list of caret indexes in their edit order, this done from bottom to top. Edit order
   * refers to the way actions such as [insertTextAtCaret] are applied.
   */
  public final fun getCaretIndexEditOrder(): PackedInt32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCaretIndexEditOrderPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Returns the original start line of the selection.
   */
  @JvmOverloads
  public final fun getSelectionLine(caretIndex: Int = 0): Int {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getSelectionLinePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the original start column of the selection.
   */
  @JvmOverloads
  public final fun getSelectionColumn(caretIndex: Int = 0): Int {
    Internals.writeArguments(LONG to caretIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getSelectionColumnPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
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
        Internals.getMethodBindPtr("TextEdit", "has_ime_text", 36873697)

    public val cancelImePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "cancel_ime", 3218959716)

    public val applyImePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "apply_ime", 3218959716)

    public val setEditablePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_editable", 2586408642)

    public val isEditablePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_editable", 36873697)

    public val setTextDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_text_direction", 119160795)

    public val getTextDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_text_direction", 797257663)

    public val setLanguagePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_language", 83702148)

    public val getLanguagePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_language", 201670096)

    public val setStructuredTextBidiOverridePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_structured_text_bidi_override", 55961453)

    public val getStructuredTextBidiOverridePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_structured_text_bidi_override", 3385126229)

    public val setStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_structured_text_bidi_override_options", 381264803)

    public val getStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_structured_text_bidi_override_options", 3995934104)

    public val setTabSizePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_tab_size", 1286410249)

    public val getTabSizePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_tab_size", 3905245786)

    public val setIndentWrappedLinesPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_indent_wrapped_lines", 2586408642)

    public val isIndentWrappedLinesPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_indent_wrapped_lines", 36873697)

    public val setOvertypeModeEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_overtype_mode_enabled", 2586408642)

    public val isOvertypeModeEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_overtype_mode_enabled", 36873697)

    public val setContextMenuEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_context_menu_enabled", 2586408642)

    public val isContextMenuEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_context_menu_enabled", 36873697)

    public val setShortcutKeysEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_shortcut_keys_enabled", 2586408642)

    public val isShortcutKeysEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_shortcut_keys_enabled", 36873697)

    public val setVirtualKeyboardEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_virtual_keyboard_enabled", 2586408642)

    public val isVirtualKeyboardEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_virtual_keyboard_enabled", 36873697)

    public val setMiddleMousePasteEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_middle_mouse_paste_enabled", 2586408642)

    public val isMiddleMousePasteEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_middle_mouse_paste_enabled", 36873697)

    public val clearPtr: VoidPtr = Internals.getMethodBindPtr("TextEdit", "clear", 3218959716)

    public val setTextPtr: VoidPtr = Internals.getMethodBindPtr("TextEdit", "set_text", 83702148)

    public val getTextPtr: VoidPtr = Internals.getMethodBindPtr("TextEdit", "get_text", 201670096)

    public val getLineCountPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_line_count", 3905245786)

    public val setPlaceholderPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_placeholder", 83702148)

    public val getPlaceholderPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_placeholder", 201670096)

    public val setLinePtr: VoidPtr = Internals.getMethodBindPtr("TextEdit", "set_line", 501894301)

    public val getLinePtr: VoidPtr = Internals.getMethodBindPtr("TextEdit", "get_line", 844755477)

    public val getLineWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_line_width", 688195400)

    public val getLineHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_line_height", 3905245786)

    public val getIndentLevelPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_indent_level", 923996154)

    public val getFirstNonWhitespaceColumnPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_first_non_whitespace_column", 923996154)

    public val swapLinesPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "swap_lines", 3937882851)

    public val insertLineAtPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "insert_line_at", 501894301)

    public val removeLineAtPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "remove_line_at", 972357352)

    public val insertTextAtCaretPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "insert_text_at_caret", 2697778442)

    public val insertTextPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "insert_text", 1881564334)

    public val removeTextPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "remove_text", 4275841770)

    public val getLastUnhiddenLinePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_last_unhidden_line", 3905245786)

    public val getNextVisibleLineOffsetFromPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_next_visible_line_offset_from", 3175239445)

    public val getNextVisibleLineIndexOffsetFromPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_next_visible_line_index_offset_from", 3386475622)

    public val backspacePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "backspace", 1025054187)

    public val cutPtr: VoidPtr = Internals.getMethodBindPtr("TextEdit", "cut", 1025054187)

    public val copyPtr: VoidPtr = Internals.getMethodBindPtr("TextEdit", "copy", 1025054187)

    public val pastePtr: VoidPtr = Internals.getMethodBindPtr("TextEdit", "paste", 1025054187)

    public val pastePrimaryClipboardPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "paste_primary_clipboard", 1025054187)

    public val startActionPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "start_action", 2834827583)

    public val endActionPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "end_action", 3218959716)

    public val beginComplexOperationPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "begin_complex_operation", 3218959716)

    public val endComplexOperationPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "end_complex_operation", 3218959716)

    public val hasUndoPtr: VoidPtr = Internals.getMethodBindPtr("TextEdit", "has_undo", 36873697)

    public val hasRedoPtr: VoidPtr = Internals.getMethodBindPtr("TextEdit", "has_redo", 36873697)

    public val undoPtr: VoidPtr = Internals.getMethodBindPtr("TextEdit", "undo", 3218959716)

    public val redoPtr: VoidPtr = Internals.getMethodBindPtr("TextEdit", "redo", 3218959716)

    public val clearUndoHistoryPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "clear_undo_history", 3218959716)

    public val tagSavedVersionPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "tag_saved_version", 3218959716)

    public val getVersionPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_version", 3905245786)

    public val getSavedVersionPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_saved_version", 3905245786)

    public val setSearchTextPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_search_text", 83702148)

    public val setSearchFlagsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_search_flags", 1286410249)

    public val searchPtr: VoidPtr = Internals.getMethodBindPtr("TextEdit", "search", 1203739136)

    public val setTooltipRequestFuncPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_tooltip_request_func", 1611583062)

    public val getLocalMousePosPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_local_mouse_pos", 3341600327)

    public val getWordAtPosPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_word_at_pos", 3674420000)

    public val getLineColumnAtPosPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_line_column_at_pos", 239517838)

    public val getPosAtLineColumnPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_pos_at_line_column", 410388347)

    public val getRectAtLineColumnPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_rect_at_line_column", 3256618057)

    public val getMinimapLineAtPosPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_minimap_line_at_pos", 2485466453)

    public val isDraggingCursorPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_dragging_cursor", 36873697)

    public val isMouseOverSelectionPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_mouse_over_selection", 1840282309)

    public val setCaretTypePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_caret_type", 1211596914)

    public val getCaretTypePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_caret_type", 2830252959)

    public val setCaretBlinkEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_caret_blink_enabled", 2586408642)

    public val isCaretBlinkEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_caret_blink_enabled", 36873697)

    public val setCaretBlinkIntervalPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_caret_blink_interval", 373806689)

    public val getCaretBlinkIntervalPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_caret_blink_interval", 1740695150)

    public val setDrawCaretWhenEditableDisabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_draw_caret_when_editable_disabled", 2586408642)

    public val isDrawingCaretWhenEditableDisabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_drawing_caret_when_editable_disabled", 36873697)

    public val setMoveCaretOnRightClickEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_move_caret_on_right_click_enabled", 2586408642)

    public val isMoveCaretOnRightClickEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_move_caret_on_right_click_enabled", 36873697)

    public val setCaretMidGraphemeEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_caret_mid_grapheme_enabled", 2586408642)

    public val isCaretMidGraphemeEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_caret_mid_grapheme_enabled", 36873697)

    public val setMultipleCaretsEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_multiple_carets_enabled", 2586408642)

    public val isMultipleCaretsEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_multiple_carets_enabled", 36873697)

    public val addCaretPtr: VoidPtr = Internals.getMethodBindPtr("TextEdit", "add_caret", 50157827)

    public val removeCaretPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "remove_caret", 1286410249)

    public val removeSecondaryCaretsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "remove_secondary_carets", 3218959716)

    public val getCaretCountPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_caret_count", 3905245786)

    public val addCaretAtCaretsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "add_caret_at_carets", 2586408642)

    public val getSortedCaretsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_sorted_carets", 2131714034)

    public val collapseCaretsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "collapse_carets", 228654177)

    public val mergeOverlappingCaretsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "merge_overlapping_carets", 3218959716)

    public val beginMulticaretEditPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "begin_multicaret_edit", 3218959716)

    public val endMulticaretEditPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "end_multicaret_edit", 3218959716)

    public val isInMulitcaretEditPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_in_mulitcaret_edit", 36873697)

    public val multicaretEditIgnoreCaretPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "multicaret_edit_ignore_caret", 1116898809)

    public val isCaretVisiblePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_caret_visible", 1051549951)

    public val getCaretDrawPosPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_caret_draw_pos", 478253731)

    public val setCaretLinePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_caret_line", 1302582944)

    public val getCaretLinePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_caret_line", 1591665591)

    public val setCaretColumnPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_caret_column", 3796796178)

    public val getCaretColumnPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_caret_column", 1591665591)

    public val getCaretWrapIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_caret_wrap_index", 1591665591)

    public val getWordUnderCaretPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_word_under_caret", 3929349208)

    public val setUseDefaultWordSeparatorsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_use_default_word_separators", 2586408642)

    public val isDefaultWordSeparatorsEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_default_word_separators_enabled", 36873697)

    public val setUseCustomWordSeparatorsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_use_custom_word_separators", 2586408642)

    public val isCustomWordSeparatorsEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_custom_word_separators_enabled", 36873697)

    public val setCustomWordSeparatorsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_custom_word_separators", 83702148)

    public val getCustomWordSeparatorsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_custom_word_separators", 201670096)

    public val setSelectingEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_selecting_enabled", 2586408642)

    public val isSelectingEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_selecting_enabled", 36873697)

    public val setDeselectOnFocusLossEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_deselect_on_focus_loss_enabled", 2586408642)

    public val isDeselectOnFocusLossEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_deselect_on_focus_loss_enabled", 36873697)

    public val setDragAndDropSelectionEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_drag_and_drop_selection_enabled", 2586408642)

    public val isDragAndDropSelectionEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_drag_and_drop_selection_enabled", 36873697)

    public val setSelectionModePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_selection_mode", 1658801786)

    public val getSelectionModePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_selection_mode", 3750106938)

    public val selectAllPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "select_all", 3218959716)

    public val selectWordUnderCaretPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "select_word_under_caret", 1025054187)

    public val addSelectionForNextOccurrencePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "add_selection_for_next_occurrence", 3218959716)

    public val skipSelectionForNextOccurrencePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "skip_selection_for_next_occurrence", 3218959716)

    public val selectPtr: VoidPtr = Internals.getMethodBindPtr("TextEdit", "select", 2560984452)

    public val hasSelectionPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "has_selection", 2824505868)

    public val getSelectedTextPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_selected_text", 2309358862)

    public val getSelectionAtLineColumnPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_selection_at_line_column", 1810224333)

    public val getLineRangesFromCaretsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_line_ranges_from_carets", 2393089247)

    public val getSelectionOriginLinePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_selection_origin_line", 1591665591)

    public val getSelectionOriginColumnPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_selection_origin_column", 1591665591)

    public val setSelectionOriginLinePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_selection_origin_line", 195434140)

    public val setSelectionOriginColumnPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_selection_origin_column", 2230941749)

    public val getSelectionFromLinePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_selection_from_line", 1591665591)

    public val getSelectionFromColumnPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_selection_from_column", 1591665591)

    public val getSelectionToLinePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_selection_to_line", 1591665591)

    public val getSelectionToColumnPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_selection_to_column", 1591665591)

    public val isCaretAfterSelectionOriginPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_caret_after_selection_origin", 1051549951)

    public val deselectPtr: VoidPtr = Internals.getMethodBindPtr("TextEdit", "deselect", 1025054187)

    public val deleteSelectionPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "delete_selection", 1025054187)

    public val setLineWrappingModePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_line_wrapping_mode", 2525115309)

    public val getLineWrappingModePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_line_wrapping_mode", 3562716114)

    public val setAutowrapModePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_autowrap_mode", 3289138044)

    public val getAutowrapModePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_autowrap_mode", 1549071663)

    public val isLineWrappedPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_line_wrapped", 1116898809)

    public val getLineWrapCountPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_line_wrap_count", 923996154)

    public val getLineWrapIndexAtColumnPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_line_wrap_index_at_column", 3175239445)

    public val getLineWrappedTextPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_line_wrapped_text", 647634434)

    public val setSmoothScrollEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_smooth_scroll_enabled", 2586408642)

    public val isSmoothScrollEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_smooth_scroll_enabled", 36873697)

    public val getVScrollBarPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_v_scroll_bar", 3226026593)

    public val getHScrollBarPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_h_scroll_bar", 3774687988)

    public val setVScrollPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_v_scroll", 373806689)

    public val getVScrollPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_v_scroll", 1740695150)

    public val setHScrollPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_h_scroll", 1286410249)

    public val getHScrollPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_h_scroll", 3905245786)

    public val setScrollPastEndOfFileEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_scroll_past_end_of_file_enabled", 2586408642)

    public val isScrollPastEndOfFileEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_scroll_past_end_of_file_enabled", 36873697)

    public val setVScrollSpeedPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_v_scroll_speed", 373806689)

    public val getVScrollSpeedPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_v_scroll_speed", 1740695150)

    public val setFitContentHeightEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_fit_content_height_enabled", 2586408642)

    public val isFitContentHeightEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_fit_content_height_enabled", 36873697)

    public val getScrollPosForLinePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_scroll_pos_for_line", 3929084198)

    public val setLineAsFirstVisiblePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_line_as_first_visible", 2230941749)

    public val getFirstVisibleLinePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_first_visible_line", 3905245786)

    public val setLineAsCenterVisiblePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_line_as_center_visible", 2230941749)

    public val setLineAsLastVisiblePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_line_as_last_visible", 2230941749)

    public val getLastFullVisibleLinePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_last_full_visible_line", 3905245786)

    public val getLastFullVisibleLineWrapIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_last_full_visible_line_wrap_index", 3905245786)

    public val getVisibleLineCountPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_visible_line_count", 3905245786)

    public val getVisibleLineCountInRangePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_visible_line_count_in_range", 3175239445)

    public val getTotalVisibleLineCountPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_total_visible_line_count", 3905245786)

    public val adjustViewportToCaretPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "adjust_viewport_to_caret", 1995695955)

    public val centerViewportToCaretPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "center_viewport_to_caret", 1995695955)

    public val setDrawMinimapPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_draw_minimap", 2586408642)

    public val isDrawingMinimapPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_drawing_minimap", 36873697)

    public val setMinimapWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_minimap_width", 1286410249)

    public val getMinimapWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_minimap_width", 3905245786)

    public val getMinimapVisibleLinesPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_minimap_visible_lines", 3905245786)

    public val addGutterPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "add_gutter", 1025054187)

    public val removeGutterPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "remove_gutter", 1286410249)

    public val getGutterCountPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_gutter_count", 3905245786)

    public val setGutterNamePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_gutter_name", 501894301)

    public val getGutterNamePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_gutter_name", 844755477)

    public val setGutterTypePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_gutter_type", 1088959071)

    public val getGutterTypePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_gutter_type", 1159699127)

    public val setGutterWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_gutter_width", 3937882851)

    public val getGutterWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_gutter_width", 923996154)

    public val setGutterDrawPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_gutter_draw", 300928843)

    public val isGutterDrawnPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_gutter_drawn", 1116898809)

    public val setGutterClickablePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_gutter_clickable", 300928843)

    public val isGutterClickablePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_gutter_clickable", 1116898809)

    public val setGutterOverwritablePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_gutter_overwritable", 300928843)

    public val isGutterOverwritablePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_gutter_overwritable", 1116898809)

    public val mergeGuttersPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "merge_gutters", 3937882851)

    public val setGutterCustomDrawPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_gutter_custom_draw", 957362965)

    public val getTotalGutterWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_total_gutter_width", 3905245786)

    public val setLineGutterMetadataPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_line_gutter_metadata", 2060538656)

    public val getLineGutterMetadataPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_line_gutter_metadata", 678354945)

    public val setLineGutterTextPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_line_gutter_text", 2285447957)

    public val getLineGutterTextPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_line_gutter_text", 1391810591)

    public val setLineGutterIconPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_line_gutter_icon", 176101966)

    public val getLineGutterIconPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_line_gutter_icon", 2584904275)

    public val setLineGutterItemColorPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_line_gutter_item_color", 3733378741)

    public val getLineGutterItemColorPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_line_gutter_item_color", 2165839948)

    public val setLineGutterClickablePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_line_gutter_clickable", 1383440665)

    public val isLineGutterClickablePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_line_gutter_clickable", 2522259332)

    public val setLineBackgroundColorPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_line_background_color", 2878471219)

    public val getLineBackgroundColorPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_line_background_color", 3457211756)

    public val setSyntaxHighlighterPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_syntax_highlighter", 2765644541)

    public val getSyntaxHighlighterPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_syntax_highlighter", 2721131626)

    public val setHighlightCurrentLinePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_highlight_current_line", 2586408642)

    public val isHighlightCurrentLineEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_highlight_current_line_enabled", 36873697)

    public val setHighlightAllOccurrencesPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_highlight_all_occurrences", 2586408642)

    public val isHighlightAllOccurrencesEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_highlight_all_occurrences_enabled", 36873697)

    public val getDrawControlCharsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_draw_control_chars", 36873697)

    public val setDrawControlCharsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_draw_control_chars", 2586408642)

    public val setDrawTabsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_draw_tabs", 2586408642)

    public val isDrawingTabsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_drawing_tabs", 36873697)

    public val setDrawSpacesPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "set_draw_spaces", 2586408642)

    public val isDrawingSpacesPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_drawing_spaces", 36873697)

    public val getMenuPtr: VoidPtr = Internals.getMethodBindPtr("TextEdit", "get_menu", 229722558)

    public val isMenuVisiblePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "is_menu_visible", 36873697)

    public val menuOptionPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "menu_option", 1286410249)

    public val adjustCaretsAfterEditPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "adjust_carets_after_edit", 1770277138)

    public val getCaretIndexEditOrderPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_caret_index_edit_order", 969006518)

    public val getSelectionLinePtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_selection_line", 1591665591)

    public val getSelectionColumnPtr: VoidPtr =
        Internals.getMethodBindPtr("TextEdit", "get_selection_column", 1591665591)
  }
}
