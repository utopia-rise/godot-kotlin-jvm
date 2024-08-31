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
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.RECT2I
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal2
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
  public val textSet: Signal0 by signal()

  /**
   * Emitted when the text changes.
   */
  public val textChanged: Signal0 by signal()

  /**
   * Emitted immediately when the text changes.
   * When text is added [fromLine] will be less than [toLine]. On a remove [toLine] will be less
   * than [fromLine].
   */
  public val linesEditedFrom: Signal2<Long, Long> by signal("fromLine", "toLine")

  /**
   * Emitted when any caret changes position.
   */
  public val caretChanged: Signal0 by signal()

  /**
   * Emitted when a gutter is clicked.
   */
  public val gutterClicked: Signal2<Long, Long> by signal("line", "gutter")

  /**
   * Emitted when a gutter is added.
   */
  public val gutterAdded: Signal0 by signal()

  /**
   * Emitted when a gutter is removed.
   */
  public val gutterRemoved: Signal0 by signal()

  /**
   * String value of the [TextEdit].
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
   * Text shown when the [TextEdit] is empty. It is **not** the [TextEdit]'s default value (see
   * [text]).
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
   * If `true`, a right-click displays the context menu.
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
   * If `true`, shortcut keys for context menu items are enabled, even if the context menu is
   * disabled.
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
   * If `true`, text can be selected.
   * If `false`, text can not be selected by the user or by the [select] or [selectAll] methods.
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
   * If `true`, allow drag and drop of selected text. Text can still be dropped from other sources.
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
   * If `false`, using middle mouse button to paste clipboard will be disabled.
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
   * Sets the line wrapping mode to use.
   */
  public var wrapMode: LineWrappingMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLineWrappingModePtr, LONG)
      return TextEdit.LineWrappingMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setLineWrappingModePtr, NIL)
    }

  /**
   * If [wrapMode] is set to [LINE_WRAPPING_BOUNDARY], sets text wrapping mode. To see how each mode
   * behaves, see [TextServer.AutowrapMode].
   */
  public var autowrapMode: TextServer.AutowrapMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutowrapModePtr, LONG)
      return TextServer.AutowrapMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutowrapModePtr, NIL)
    }

  /**
   * If `true`, all wrapped lines are indented to the same amount as the unwrapped line.
   */
  public var indentWrappedLines: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isIndentWrappedLinesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIndentWrappedLinesPtr, NIL)
    }

  /**
   * Scroll smoothly over the text rather than jumping to the next location.
   */
  public var scrollSmooth: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSmoothScrollEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSmoothScrollEnabledPtr, NIL)
    }

  /**
   * Sets the scroll speed with the minimap or when [scrollSmooth] is enabled.
   */
  public var scrollVScrollSpeed: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVScrollSpeedPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVScrollSpeedPtr, NIL)
    }

  /**
   * Allow scrolling past the last line into "virtual" space.
   */
  public var scrollPastEndOfFile: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isScrollPastEndOfFileEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScrollPastEndOfFileEnabledPtr, NIL)
    }

  /**
   * If there is a vertical scrollbar, this determines the current vertical scroll value in line
   * numbers, starting at 0 for the top line.
   */
  public var scrollVertical: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVScrollPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVScrollPtr, NIL)
    }

  /**
   * If there is a horizontal scrollbar, this determines the current horizontal scroll value in
   * pixels.
   */
  public var scrollHorizontal: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHScrollPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setHScrollPtr, NIL)
    }

  /**
   * If `true`, [TextEdit] will disable vertical scroll and fit minimum height to the number of
   * visible lines.
   */
  public var scrollFitContentHeight: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFitContentHeightEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFitContentHeightEnabledPtr, NIL)
    }

  /**
   * If `true`, a minimap is shown, providing an outline of your source code. The minimap uses a
   * fixed-width text size.
   */
  public var minimapDraw: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawingMinimapPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawMinimapPtr, NIL)
    }

  /**
   * The width, in pixels, of the minimap.
   */
  public var minimapWidth: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinimapWidthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMinimapWidthPtr, NIL)
    }

  /**
   * Set the type of caret to draw.
   */
  public var caretType: CaretType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCaretTypePtr, LONG)
      return TextEdit.CaretType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setCaretTypePtr, NIL)
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
   * If `true`, caret will be visible when [editable] is disabled.
   */
  public var caretDrawWhenEditableDisabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawingCaretWhenEditableDisabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawCaretWhenEditableDisabledPtr, NIL)
    }

  /**
   * If `true`, a right-click moves the caret at the mouse position before displaying the context
   * menu.
   * If `false`, the context menu ignores mouse location.
   */
  public var caretMoveOnRightClick: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMoveCaretOnRightClickEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMoveCaretOnRightClickEnabledPtr, NIL)
    }

  /**
   * Allow moving caret, selecting and removing the individual composite character components.
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
   * Sets if multiple carets are allowed.
   */
  public var caretMultiple: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMultipleCaretsEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMultipleCaretsEnabledPtr, NIL)
    }

  /**
   * If `false`, using [kbd]Ctrl + Left[/kbd] or [kbd]Ctrl + Right[/kbd] ([kbd]Cmd + Left[/kbd] or
   * [kbd]Cmd + Right[/kbd] on macOS) bindings will stop moving caret only if a space or punctuation is
   * detected. If `true`, it will also stop the caret if a character is part of
   * `!"#$&#37;&'()*+,-./:;<=>?@[\]^`{|}~`, the Unicode General Punctuation table, or the Unicode CJK
   * Punctuation table. Useful for subword moving. This behavior also will be applied to the behavior
   * of text selection.
   */
  public var useDefaultWordSeparators: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDefaultWordSeparatorsEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseDefaultWordSeparatorsPtr, NIL)
    }

  /**
   * If `false`, using [kbd]Ctrl + Left[/kbd] or [kbd]Ctrl + Right[/kbd] ([kbd]Cmd + Left[/kbd] or
   * [kbd]Cmd + Right[/kbd] on macOS) bindings will use the behavior of [useDefaultWordSeparators]. If
   * `true`, it will also stop the caret if a character within [customWordSeparators] is detected.
   * Useful for subword moving. This behavior also will be applied to the behavior of text selection.
   */
  public var useCustomWordSeparators: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCustomWordSeparatorsEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseCustomWordSeparatorsPtr, NIL)
    }

  /**
   * The characters to consider as word delimiters if [useCustomWordSeparators] is `true`. The
   * characters should be defined without separation, for example `#_!`.
   */
  public var customWordSeparators: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCustomWordSeparatorsPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCustomWordSeparatorsPtr, NIL)
    }

  /**
   * Sets the [SyntaxHighlighter] to use.
   */
  public var syntaxHighlighter: SyntaxHighlighter?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSyntaxHighlighterPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as SyntaxHighlighter?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSyntaxHighlighterPtr, NIL)
    }

  /**
   * If `true`, all occurrences of the selected text will be highlighted.
   */
  public var highlightAllOccurrences: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHighlightAllOccurrencesEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHighlightAllOccurrencesPtr, NIL)
    }

  /**
   * If `true`, the line containing the cursor is highlighted.
   */
  public var highlightCurrentLine: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHighlightCurrentLineEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHighlightCurrentLinePtr, NIL)
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
   * If `true`, the "tab" character will have a visible representation.
   */
  public var drawTabs: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawingTabsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawTabsPtr, NIL)
    }

  /**
   * If `true`, the "space" character will have a visible representation.
   */
  public var drawSpaces: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawingSpacesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawSpacesPtr, NIL)
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
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale
   * is used instead.
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
  public fun hasImeText(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasImeTextPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Closes the [url=https://en.wikipedia.org/wiki/Input_method]Input Method Editor[/url] (IME) if
   * it is open. Any text in the IME will be lost.
   */
  public fun cancelIme(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.cancelImePtr, NIL)
  }

  /**
   * Applies text from the [url=https://en.wikipedia.org/wiki/Input_method]Input Method Editor[/url]
   * (IME) to each caret and closes the IME if it is open.
   */
  public fun applyIme(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.applyImePtr, NIL)
  }

  /**
   * Sets the tab size for the [TextEdit] to use.
   */
  public fun setTabSize(size: Int): Unit {
    TransferContext.writeArguments(LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setTabSizePtr, NIL)
  }

  /**
   * Returns the [TextEdit]'s' tab size.
   */
  public fun getTabSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTabSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * If `true`, sets the user into overtype mode. When the user types in this mode, it will override
   * existing text.
   */
  public fun setOvertypeModeEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setOvertypeModeEnabledPtr, NIL)
  }

  /**
   * Returns whether the user is in overtype mode.
   */
  public fun isOvertypeModeEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isOvertypeModeEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Performs a full reset of [TextEdit], including undo history.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns the number of lines in the text.
   */
  public fun getLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the text for a specific [line].
   * Carets on the line will attempt to keep their visual x position.
   */
  public fun setLine(line: Int, newText: String): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), STRING to newText)
    TransferContext.callMethod(rawPtr, MethodBindings.setLinePtr, NIL)
  }

  /**
   * Returns the text of a specific line.
   */
  public fun getLine(line: Int): String {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLinePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the width in pixels of the [wrapIndex] on [line].
   */
  @JvmOverloads
  public fun getLineWidth(line: Int, wrapIndex: Int = -1): Int {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the maximum value of the line height among all lines.
   * **Note:** The return value is influenced by [theme_item line_spacing] and [theme_item
   * font_size]. And it will not be less than `1`.
   */
  public fun getLineHeight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the number of spaces and `tab * tab_size` before the first char.
   */
  public fun getIndentLevel(line: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getIndentLevelPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the first column containing a non-whitespace character.
   */
  public fun getFirstNonWhitespaceColumn(line: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFirstNonWhitespaceColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Swaps the two lines. Carets will be swapped with the lines.
   */
  public fun swapLines(fromLine: Int, toLine: Int): Unit {
    TransferContext.writeArguments(LONG to fromLine.toLong(), LONG to toLine.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.swapLinesPtr, NIL)
  }

  /**
   * Inserts a new line with [text] at [line].
   */
  public fun insertLineAt(line: Int, text: String): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.insertLineAtPtr, NIL)
  }

  /**
   * Removes the line of text at [line]. Carets on this line will attempt to match their previous
   * visual x position.
   * If [moveCaretsDown] is `true` carets will move to the next line down, otherwise carets will
   * move up.
   */
  @JvmOverloads
  public fun removeLineAt(line: Int, moveCaretsDown: Boolean = true): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), BOOL to moveCaretsDown)
    TransferContext.callMethod(rawPtr, MethodBindings.removeLineAtPtr, NIL)
  }

  /**
   * Insert the specified text at the caret position.
   */
  @JvmOverloads
  public fun insertTextAtCaret(text: String, caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(STRING to text, LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.insertTextAtCaretPtr, NIL)
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
  public fun insertText(
    text: String,
    line: Int,
    column: Int,
    beforeSelectionBegin: Boolean = true,
    beforeSelectionEnd: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(STRING to text, LONG to line.toLong(), LONG to column.toLong(), BOOL to beforeSelectionBegin, BOOL to beforeSelectionEnd)
    TransferContext.callMethod(rawPtr, MethodBindings.insertTextPtr, NIL)
  }

  /**
   * Removes text between the given positions.
   */
  public fun removeText(
    fromLine: Int,
    fromColumn: Int,
    toLine: Int,
    toColumn: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to fromLine.toLong(), LONG to fromColumn.toLong(), LONG to toLine.toLong(), LONG to toColumn.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeTextPtr, NIL)
  }

  /**
   * Returns the last unhidden line in the entire [TextEdit].
   */
  public fun getLastUnhiddenLine(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLastUnhiddenLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the count to the next visible line from [line] to `line + visible_amount`. Can also
   * count backwards. For example if a [TextEdit] has 5 lines with lines 2 and 3 hidden, calling this
   * with `line = 1, visible_amount = 1` would return 3.
   */
  public fun getNextVisibleLineOffsetFrom(line: Int, visibleAmount: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to visibleAmount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNextVisibleLineOffsetFromPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Similar to [getNextVisibleLineOffsetFrom], but takes into account the line wrap indexes. In the
   * returned vector, `x` is the line, `y` is the wrap index.
   */
  public fun getNextVisibleLineIndexOffsetFrom(
    line: Int,
    wrapIndex: Int,
    visibleAmount: Int,
  ): Vector2i {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong(), LONG to visibleAmount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNextVisibleLineIndexOffsetFromPtr,
        VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Called when the user presses the backspace key. Can be overridden with [_backspace].
   */
  @JvmOverloads
  public fun backspace(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.backspacePtr, NIL)
  }

  /**
   * Cut's the current selection. Can be overridden with [_cut].
   */
  @JvmOverloads
  public fun cut(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.cutPtr, NIL)
  }

  /**
   * Copies the current text selection. Can be overridden with [_copy].
   */
  @JvmOverloads
  public fun copy(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.copyPtr, NIL)
  }

  /**
   * Paste at the current location. Can be overridden with [_paste].
   */
  @JvmOverloads
  public fun paste(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.pastePtr, NIL)
  }

  /**
   * Pastes the primary clipboard.
   */
  @JvmOverloads
  public fun pastePrimaryClipboard(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.pastePrimaryClipboardPtr, NIL)
  }

  /**
   * Starts an action, will end the current action if [action] is different.
   * An action will also end after a call to [endAction], after
   * [ProjectSettings.gui/timers/textEditIdleDetectSec] is triggered or a new undoable step outside the
   * [startAction] and [endAction] calls.
   */
  public fun startAction(action: EditAction): Unit {
    TransferContext.writeArguments(LONG to action.id)
    TransferContext.callMethod(rawPtr, MethodBindings.startActionPtr, NIL)
  }

  /**
   * Marks the end of steps in the current action started with [startAction].
   */
  public fun endAction(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.endActionPtr, NIL)
  }

  /**
   * Starts a multipart edit. All edits will be treated as one action until [endComplexOperation] is
   * called.
   */
  public fun beginComplexOperation(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.beginComplexOperationPtr, NIL)
  }

  /**
   * Ends a multipart edit, started with [beginComplexOperation]. If called outside a complex
   * operation, the current operation is pushed onto the undo/redo stack.
   */
  public fun endComplexOperation(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.endComplexOperationPtr, NIL)
  }

  /**
   * Returns `true` if an "undo" action is available.
   */
  public fun hasUndo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasUndoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if a "redo" action is available.
   */
  public fun hasRedo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasRedoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Perform undo operation.
   */
  public fun undo(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.undoPtr, NIL)
  }

  /**
   * Perform redo operation.
   */
  public fun redo(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.redoPtr, NIL)
  }

  /**
   * Clears the undo history.
   */
  public fun clearUndoHistory(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearUndoHistoryPtr, NIL)
  }

  /**
   * Tag the current version as saved.
   */
  public fun tagSavedVersion(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.tagSavedVersionPtr, NIL)
  }

  /**
   * Returns the current version of the [TextEdit]. The version is a count of recorded operations by
   * the undo/redo history.
   */
  public fun getVersion(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVersionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the last tagged saved version from [tagSavedVersion].
   */
  public fun getSavedVersion(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSavedVersionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets the search text. See [setSearchFlags].
   */
  public fun setSearchText(searchText: String): Unit {
    TransferContext.writeArguments(STRING to searchText)
    TransferContext.callMethod(rawPtr, MethodBindings.setSearchTextPtr, NIL)
  }

  /**
   * Sets the search [flags]. This is used with [setSearchText] to highlight occurrences of the
   * searched text. Search flags can be specified from the [SearchFlags] enum.
   */
  public fun setSearchFlags(flags: Long): Unit {
    TransferContext.writeArguments(LONG to flags)
    TransferContext.callMethod(rawPtr, MethodBindings.setSearchFlagsPtr, NIL)
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
  public fun search(
    text: String,
    flags: Long,
    fromLine: Int,
    fromColumn: Int,
  ): Vector2i {
    TransferContext.writeArguments(STRING to text, LONG to flags, LONG to fromLine.toLong(), LONG to fromColumn.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.searchPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Provide custom tooltip text. The callback method must take the following args: `hovered_word:
   * String`.
   */
  public fun setTooltipRequestFunc(callback: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.setTooltipRequestFuncPtr, NIL)
  }

  /**
   * Returns the local mouse position adjusted for the text direction.
   */
  public fun getLocalMousePos(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocalMousePosPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the word at [position].
   */
  public fun getWordAtPos(position: Vector2): String {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.getWordAtPosPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the line and column at the given position. In the returned vector, `x` is the column,
   * `y` is the line. If [allowOutOfBounds] is `false` and the position is not over the text, both
   * vector values will be set to `-1`.
   */
  @JvmOverloads
  public fun getLineColumnAtPos(position: Vector2i, allowOutOfBounds: Boolean = true): Vector2i {
    TransferContext.writeArguments(VECTOR2I to position, BOOL to allowOutOfBounds)
    TransferContext.callMethod(rawPtr, MethodBindings.getLineColumnAtPosPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Returns the local position for the given [line] and [column]. If `x` or `y` of the returned
   * vector equal `-1`, the position is outside of the viewable area of the control.
   * **Note:** The Y position corresponds to the bottom side of the line. Use [getRectAtLineColumn]
   * to get the top side position.
   */
  public fun getPosAtLineColumn(line: Int, column: Int): Vector2i {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPosAtLineColumnPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Returns the local position and size for the grapheme at the given [line] and [column]. If `x`
   * or `y` position of the returned rect equal `-1`, the position is outside of the viewable area of
   * the control.
   * **Note:** The Y position of the returned rect corresponds to the top side of the line, unlike
   * [getPosAtLineColumn] which returns the bottom side.
   */
  public fun getRectAtLineColumn(line: Int, column: Int): Rect2i {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getRectAtLineColumnPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I, false) as Rect2i)
  }

  /**
   * Returns the equivalent minimap line at [position].
   */
  public fun getMinimapLineAtPos(position: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.callMethod(rawPtr, MethodBindings.getMinimapLineAtPosPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns `true` if the user is dragging their mouse for scrolling, selecting, or text dragging.
   */
  public fun isDraggingCursor(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDraggingCursorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns whether the mouse is over selection. If [edges] is `true`, the edges are considered
   * part of the selection.
   */
  @JvmOverloads
  public fun isMouseOverSelection(edges: Boolean, caretIndex: Int = -1): Boolean {
    TransferContext.writeArguments(BOOL to edges, LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isMouseOverSelectionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds a new caret at the given location. Returns the index of the new caret, or `-1` if the
   * location is invalid.
   */
  public fun addCaret(line: Int, column: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addCaretPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Removes the given caret index.
   * **Note:** This can result in adjustment of all other caret indices.
   */
  public fun removeCaret(caret: Int): Unit {
    TransferContext.writeArguments(LONG to caret.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeCaretPtr, NIL)
  }

  /**
   * Removes all additional carets.
   */
  public fun removeSecondaryCarets(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.removeSecondaryCaretsPtr, NIL)
  }

  /**
   * Returns the number of carets in this [TextEdit].
   */
  public fun getCaretCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCaretCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds an additional caret above or below every caret. If [below] is `true` the new caret will be
   * added below and above otherwise.
   */
  public fun addCaretAtCarets(below: Boolean): Unit {
    TransferContext.writeArguments(BOOL to below)
    TransferContext.callMethod(rawPtr, MethodBindings.addCaretAtCaretsPtr, NIL)
  }

  /**
   * Returns the carets sorted by selection beginning from lowest line and column to highest (from
   * top to bottom of text).
   * If [includeIgnoredCarets] is `false`, carets from [multicaretEditIgnoreCaret] will be ignored.
   */
  @JvmOverloads
  public fun getSortedCarets(includeIgnoredCarets: Boolean = false): PackedInt32Array {
    TransferContext.writeArguments(BOOL to includeIgnoredCarets)
    TransferContext.callMethod(rawPtr, MethodBindings.getSortedCaretsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Collapse all carets in the given range to the [fromLine] and [fromColumn] position.
   * [inclusive] applies to both ends.
   * If [isInMulitcaretEdit] is `true`, carets that are collapsed will be `true` for
   * [multicaretEditIgnoreCaret].
   * [mergeOverlappingCarets] will be called if any carets were collapsed.
   */
  @JvmOverloads
  public fun collapseCarets(
    fromLine: Int,
    fromColumn: Int,
    toLine: Int,
    toColumn: Int,
    inclusive: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(LONG to fromLine.toLong(), LONG to fromColumn.toLong(), LONG to toLine.toLong(), LONG to toColumn.toLong(), BOOL to inclusive)
    TransferContext.callMethod(rawPtr, MethodBindings.collapseCaretsPtr, NIL)
  }

  /**
   * Merges any overlapping carets. Will favor the newest caret, or the caret with a selection.
   * If [isInMulitcaretEdit] is `true`, the merge will be queued to happen at the end of the
   * multicaret edit. See [beginMulticaretEdit] and [endMulticaretEdit].
   * **Note:** This is not called when a caret changes position but after certain actions, so it is
   * possible to get into a state where carets overlap.
   */
  public fun mergeOverlappingCarets(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.mergeOverlappingCaretsPtr, NIL)
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
  public fun beginMulticaretEdit(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.beginMulticaretEditPtr, NIL)
  }

  /**
   * Ends an edit for multiple carets, that was started with [beginMulticaretEdit]. If this was the
   * last [endMulticaretEdit] and [mergeOverlappingCarets] was called, carets will be merged.
   */
  public fun endMulticaretEdit(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.endMulticaretEditPtr, NIL)
  }

  /**
   * Returns `true` if a [beginMulticaretEdit] has been called and [endMulticaretEdit] has not yet
   * been called.
   */
  public fun isInMulitcaretEdit(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isInMulitcaretEditPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the given [caretIndex] should be ignored as part of a multicaret edit. See
   * [beginMulticaretEdit] and [endMulticaretEdit]. Carets that should be ignored are ones that were
   * part of removed text and will likely be merged at the end of the edit, or carets that were added
   * during the edit.
   * It is recommended to `continue` within a loop iterating on multiple carets if a caret should be
   * ignored.
   */
  public fun multicaretEditIgnoreCaret(caretIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.multicaretEditIgnoreCaretPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the caret is visible on the screen.
   */
  @JvmOverloads
  public fun isCaretVisible(caretIndex: Int = 0): Boolean {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isCaretVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the caret pixel draw position.
   */
  @JvmOverloads
  public fun getCaretDrawPos(caretIndex: Int = 0): Vector2 {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCaretDrawPosPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
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
  public fun setCaretLine(
    line: Int,
    adjustViewport: Boolean = true,
    canBeHidden: Boolean = true,
    wrapIndex: Int = 0,
    caretIndex: Int = 0,
  ): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), BOOL to adjustViewport, BOOL to canBeHidden, LONG to wrapIndex.toLong(), LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCaretLinePtr, NIL)
  }

  /**
   * Returns the line the editing caret is on.
   */
  @JvmOverloads
  public fun getCaretLine(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCaretLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Moves the caret to the specified [column] index.
   * If [adjustViewport] is `true`, the viewport will center at the caret position after the move
   * occurs.
   * **Note:** If supporting multiple carets this will not check for any overlap. See
   * [mergeOverlappingCarets].
   */
  @JvmOverloads
  public fun setCaretColumn(
    column: Int,
    adjustViewport: Boolean = true,
    caretIndex: Int = 0,
  ): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to adjustViewport, LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCaretColumnPtr, NIL)
  }

  /**
   * Returns the column the editing caret is at.
   */
  @JvmOverloads
  public fun getCaretColumn(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCaretColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the wrap index the editing caret is on.
   */
  @JvmOverloads
  public fun getCaretWrapIndex(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCaretWrapIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns a [String] text with the word under the caret's location.
   */
  @JvmOverloads
  public fun getWordUnderCaret(caretIndex: Int = -1): String {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getWordUnderCaretPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets the current selection mode.
   */
  public fun setSelectionMode(mode: SelectionMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setSelectionModePtr, NIL)
  }

  /**
   * Returns the current selection mode.
   */
  public fun getSelectionMode(): SelectionMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionModePtr, LONG)
    return TextEdit.SelectionMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Select all the text.
   * If [selectingEnabled] is `false`, no selection will occur.
   */
  public fun selectAll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.selectAllPtr, NIL)
  }

  /**
   * Selects the word under the caret.
   */
  @JvmOverloads
  public fun selectWordUnderCaret(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.selectWordUnderCaretPtr, NIL)
  }

  /**
   * Adds a selection and a caret for the next occurrence of the current selection. If there is no
   * active selection, selects word under caret.
   */
  public fun addSelectionForNextOccurrence(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.addSelectionForNextOccurrencePtr, NIL)
  }

  /**
   * Moves a selection and a caret for the next occurrence of the current selection. If there is no
   * active selection, moves to the next occurrence of the word under caret.
   */
  public fun skipSelectionForNextOccurrence(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.skipSelectionForNextOccurrencePtr, NIL)
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
  public fun select(
    originLine: Int,
    originColumn: Int,
    caretLine: Int,
    caretColumn: Int,
    caretIndex: Int = 0,
  ): Unit {
    TransferContext.writeArguments(LONG to originLine.toLong(), LONG to originColumn.toLong(), LONG to caretLine.toLong(), LONG to caretColumn.toLong(), LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.selectPtr, NIL)
  }

  /**
   * Returns `true` if the user has selected text.
   */
  @JvmOverloads
  public fun hasSelection(caretIndex: Int = -1): Boolean {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.hasSelectionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the text inside the selection of a caret, or all the carets if [caretIndex] is its
   * default value `-1`.
   */
  @JvmOverloads
  public fun getSelectedText(caretIndex: Int = -1): String {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the caret index of the selection at the given [line] and [column], or `-1` if there is
   * none.
   * If [includeEdges] is `false`, the position must be inside the selection and not at either end.
   * If [onlySelections] is `false`, carets without a selection will also be considered.
   */
  @JvmOverloads
  public fun getSelectionAtLineColumn(
    line: Int,
    column: Int,
    includeEdges: Boolean = true,
    onlySelections: Boolean = true,
  ): Int {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong(), BOOL to includeEdges, BOOL to onlySelections)
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionAtLineColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
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
  public fun getLineRangesFromCarets(onlySelections: Boolean = false, mergeAdjacent: Boolean =
      true): VariantArray<Vector2i> {
    TransferContext.writeArguments(BOOL to onlySelections, BOOL to mergeAdjacent)
    TransferContext.callMethod(rawPtr, MethodBindings.getLineRangesFromCaretsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector2i>)
  }

  /**
   * Returns the origin line of the selection. This is the opposite end from the caret.
   */
  @JvmOverloads
  public fun getSelectionOriginLine(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionOriginLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the origin column of the selection. This is the opposite end from the caret.
   */
  @JvmOverloads
  public fun getSelectionOriginColumn(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionOriginColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
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
  public fun setSelectionOriginLine(
    line: Int,
    canBeHidden: Boolean = true,
    wrapIndex: Int = -1,
    caretIndex: Int = 0,
  ): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), BOOL to canBeHidden, LONG to wrapIndex.toLong(), LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSelectionOriginLinePtr, NIL)
  }

  /**
   * Sets the selection origin column to the [column] for the given [caretIndex]. If the selection
   * origin is moved to the caret position, the selection will deselect.
   */
  @JvmOverloads
  public fun setSelectionOriginColumn(column: Int, caretIndex: Int = 0): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSelectionOriginColumnPtr, NIL)
  }

  /**
   * Returns the selection begin line. Returns the caret line if there is no selection.
   */
  @JvmOverloads
  public fun getSelectionFromLine(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionFromLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the selection begin column. Returns the caret column if there is no selection.
   */
  @JvmOverloads
  public fun getSelectionFromColumn(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionFromColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the selection end line. Returns the caret line if there is no selection.
   */
  @JvmOverloads
  public fun getSelectionToLine(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionToLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the selection end column. Returns the caret column if there is no selection.
   */
  @JvmOverloads
  public fun getSelectionToColumn(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionToColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns `true` if the caret of the selection is after the selection origin. This can be used to
   * determine the direction of the selection.
   */
  @JvmOverloads
  public fun isCaretAfterSelectionOrigin(caretIndex: Int = 0): Boolean {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isCaretAfterSelectionOriginPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Deselects the current selection.
   */
  @JvmOverloads
  public fun deselect(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.deselectPtr, NIL)
  }

  /**
   * Deletes the selected text.
   */
  @JvmOverloads
  public fun deleteSelection(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.deleteSelectionPtr, NIL)
  }

  /**
   * Returns if the given line is wrapped.
   */
  public fun isLineWrapped(line: Int): Boolean {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isLineWrappedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the number of times the given line is wrapped.
   */
  public fun getLineWrapCount(line: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineWrapCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the wrap index of the given line column.
   */
  public fun getLineWrapIndexAtColumn(line: Int, column: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineWrapIndexAtColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns an array of [String]s representing each wrapped index.
   */
  public fun getLineWrappedText(line: Int): PackedStringArray {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineWrappedTextPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns the [VScrollBar] of the [TextEdit].
   */
  public fun getVScrollBar(): VScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVScrollBarPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as VScrollBar?)
  }

  /**
   * Returns the [HScrollBar] used by [TextEdit].
   */
  public fun getHScrollBar(): HScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHScrollBarPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as HScrollBar?)
  }

  /**
   * Returns the scroll position for [wrapIndex] of [line].
   */
  @JvmOverloads
  public fun getScrollPosForLine(line: Int, wrapIndex: Int = 0): Double {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getScrollPosForLinePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Positions the [wrapIndex] of [line] at the top of the viewport.
   */
  @JvmOverloads
  public fun setLineAsFirstVisible(line: Int, wrapIndex: Int = 0): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setLineAsFirstVisiblePtr, NIL)
  }

  /**
   * Returns the first visible line.
   */
  public fun getFirstVisibleLine(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFirstVisibleLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Positions the [wrapIndex] of [line] at the center of the viewport.
   */
  @JvmOverloads
  public fun setLineAsCenterVisible(line: Int, wrapIndex: Int = 0): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setLineAsCenterVisiblePtr, NIL)
  }

  /**
   * Positions the [wrapIndex] of [line] at the bottom of the viewport.
   */
  @JvmOverloads
  public fun setLineAsLastVisible(line: Int, wrapIndex: Int = 0): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setLineAsLastVisiblePtr, NIL)
  }

  /**
   * Returns the last visible line. Use [getLastFullVisibleLineWrapIndex] for the wrap index.
   */
  public fun getLastFullVisibleLine(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLastFullVisibleLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the last visible wrap index of the last visible line.
   */
  public fun getLastFullVisibleLineWrapIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLastFullVisibleLineWrapIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the number of visible lines, including wrapped text.
   */
  public fun getVisibleLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVisibleLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the total number of visible + wrapped lines between the two lines.
   */
  public fun getVisibleLineCountInRange(fromLine: Int, toLine: Int): Int {
    TransferContext.writeArguments(LONG to fromLine.toLong(), LONG to toLine.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVisibleLineCountInRangePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the number of lines that may be drawn.
   */
  public fun getTotalVisibleLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTotalVisibleLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adjust the viewport so the caret is visible.
   */
  @JvmOverloads
  public fun adjustViewportToCaret(caretIndex: Int = 0): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.adjustViewportToCaretPtr, NIL)
  }

  /**
   * Centers the viewport on the line the editing caret is at. This also resets the
   * [scrollHorizontal] value to `0`.
   */
  @JvmOverloads
  public fun centerViewportToCaret(caretIndex: Int = 0): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.centerViewportToCaretPtr, NIL)
  }

  /**
   * Returns the number of lines that may be drawn on the minimap.
   */
  public fun getMinimapVisibleLines(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMinimapVisibleLinesPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Register a new gutter to this [TextEdit]. Use [at] to have a specific gutter order. A value of
   * `-1` appends the gutter to the right.
   */
  @JvmOverloads
  public fun addGutter(at: Int = -1): Unit {
    TransferContext.writeArguments(LONG to at.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addGutterPtr, NIL)
  }

  /**
   * Removes the gutter from this [TextEdit].
   */
  public fun removeGutter(gutter: Int): Unit {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeGutterPtr, NIL)
  }

  /**
   * Returns the number of gutters registered.
   */
  public fun getGutterCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGutterCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the name of the gutter.
   */
  public fun setGutterName(gutter: Int, name: String): Unit {
    TransferContext.writeArguments(LONG to gutter.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setGutterNamePtr, NIL)
  }

  /**
   * Returns the name of the gutter at the given index.
   */
  public fun getGutterName(gutter: Int): String {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGutterNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets the type of gutter. Gutters can contain icons, text, or custom visuals. See
   * [TextEdit.GutterType] for options.
   */
  public fun setGutterType(gutter: Int, type: GutterType): Unit {
    TransferContext.writeArguments(LONG to gutter.toLong(), LONG to type.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setGutterTypePtr, NIL)
  }

  /**
   * Returns the type of the gutter at the given index. Gutters can contain icons, text, or custom
   * visuals. See [TextEdit.GutterType] for options.
   */
  public fun getGutterType(gutter: Int): GutterType {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGutterTypePtr, LONG)
    return TextEdit.GutterType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Set the width of the gutter.
   */
  public fun setGutterWidth(gutter: Int, width: Int): Unit {
    TransferContext.writeArguments(LONG to gutter.toLong(), LONG to width.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setGutterWidthPtr, NIL)
  }

  /**
   * Returns the width of the gutter at the given index.
   */
  public fun getGutterWidth(gutter: Int): Int {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGutterWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets whether the gutter should be drawn.
   */
  public fun setGutterDraw(gutter: Int, draw: Boolean): Unit {
    TransferContext.writeArguments(LONG to gutter.toLong(), BOOL to draw)
    TransferContext.callMethod(rawPtr, MethodBindings.setGutterDrawPtr, NIL)
  }

  /**
   * Returns whether the gutter is currently drawn.
   */
  public fun isGutterDrawn(gutter: Int): Boolean {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isGutterDrawnPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the gutter as clickable. This will change the mouse cursor to a pointing hand when
   * hovering over the gutter.
   */
  public fun setGutterClickable(gutter: Int, clickable: Boolean): Unit {
    TransferContext.writeArguments(LONG to gutter.toLong(), BOOL to clickable)
    TransferContext.callMethod(rawPtr, MethodBindings.setGutterClickablePtr, NIL)
  }

  /**
   * Returns whether the gutter is clickable.
   */
  public fun isGutterClickable(gutter: Int): Boolean {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isGutterClickablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the gutter to overwritable. See [mergeGutters].
   */
  public fun setGutterOverwritable(gutter: Int, overwritable: Boolean): Unit {
    TransferContext.writeArguments(LONG to gutter.toLong(), BOOL to overwritable)
    TransferContext.callMethod(rawPtr, MethodBindings.setGutterOverwritablePtr, NIL)
  }

  /**
   * Returns whether the gutter is overwritable.
   */
  public fun isGutterOverwritable(gutter: Int): Boolean {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isGutterOverwritablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Merge the gutters from [fromLine] into [toLine]. Only overwritable gutters will be copied.
   */
  public fun mergeGutters(fromLine: Int, toLine: Int): Unit {
    TransferContext.writeArguments(LONG to fromLine.toLong(), LONG to toLine.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.mergeGuttersPtr, NIL)
  }

  /**
   * Set a custom draw method for the gutter. The callback method must take the following args:
   * `line: int, gutter: int, Area: Rect2`. This only works when the gutter type is
   * [GUTTER_TYPE_CUSTOM] (see [setGutterType]).
   */
  public fun setGutterCustomDraw(column: Int, drawCallback: Callable): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), CALLABLE to drawCallback)
    TransferContext.callMethod(rawPtr, MethodBindings.setGutterCustomDrawPtr, NIL)
  }

  /**
   * Returns the total width of all gutters and internal padding.
   */
  public fun getTotalGutterWidth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTotalGutterWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the metadata for [gutter] on [line] to [metadata].
   */
  public fun setLineGutterMetadata(
    line: Int,
    gutter: Int,
    metadata: Any?,
  ): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), ANY to metadata)
    TransferContext.callMethod(rawPtr, MethodBindings.setLineGutterMetadataPtr, NIL)
  }

  /**
   * Returns the metadata currently in [gutter] at [line].
   */
  public fun getLineGutterMetadata(line: Int, gutter: Int): Any? {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineGutterMetadataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Sets the text for [gutter] on [line] to [text]. This only works when the gutter type is
   * [GUTTER_TYPE_STRING] (see [setGutterType]).
   */
  public fun setLineGutterText(
    line: Int,
    gutter: Int,
    text: String,
  ): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.setLineGutterTextPtr, NIL)
  }

  /**
   * Returns the text currently in [gutter] at [line]. This only works when the gutter type is
   * [GUTTER_TYPE_STRING] (see [setGutterType]).
   */
  public fun getLineGutterText(line: Int, gutter: Int): String {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineGutterTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets the icon for [gutter] on [line] to [icon]. This only works when the gutter type is
   * [GUTTER_TYPE_ICON] (see [setGutterType]).
   */
  public fun setLineGutterIcon(
    line: Int,
    gutter: Int,
    icon: Texture2D,
  ): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), OBJECT to icon)
    TransferContext.callMethod(rawPtr, MethodBindings.setLineGutterIconPtr, NIL)
  }

  /**
   * Returns the icon currently in [gutter] at [line]. This only works when the gutter type is
   * [GUTTER_TYPE_ICON] (see [setGutterType]).
   */
  public fun getLineGutterIcon(line: Int, gutter: Int): Texture2D? {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineGutterIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  /**
   * Sets the color for [gutter] on [line] to [color].
   */
  public fun setLineGutterItemColor(
    line: Int,
    gutter: Int,
    color: Color,
  ): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setLineGutterItemColorPtr, NIL)
  }

  /**
   * Returns the color currently in [gutter] at [line].
   */
  public fun getLineGutterItemColor(line: Int, gutter: Int): Color {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineGutterItemColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * If [clickable] is `true`, makes the [gutter] on [line] clickable. See [signal gutter_clicked].
   */
  public fun setLineGutterClickable(
    line: Int,
    gutter: Int,
    clickable: Boolean,
  ): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), BOOL to clickable)
    TransferContext.callMethod(rawPtr, MethodBindings.setLineGutterClickablePtr, NIL)
  }

  /**
   * Returns whether the gutter on the given line is clickable.
   */
  public fun isLineGutterClickable(line: Int, gutter: Int): Boolean {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isLineGutterClickablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the current background color of the line. Set to `Color(0, 0, 0, 0)` for no color.
   */
  public fun setLineBackgroundColor(line: Int, color: Color): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setLineBackgroundColorPtr, NIL)
  }

  /**
   * Returns the current background color of the line. `Color(0, 0, 0, 0)` is returned if no color
   * is set.
   */
  public fun getLineBackgroundColor(line: Int): Color {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineBackgroundColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
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
  public fun getMenu(): PopupMenu? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMenuPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PopupMenu?)
  }

  /**
   * Returns whether the menu is visible. Use this instead of `get_menu().visible` to improve
   * performance (so the creation of the menu is avoided).
   */
  public fun isMenuVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isMenuVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Executes a given action as defined in the [MenuItems] enum.
   */
  public fun menuOption(option: Int): Unit {
    TransferContext.writeArguments(LONG to option.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.menuOptionPtr, NIL)
  }

  /**
   * This method does nothing.
   */
  public fun adjustCaretsAfterEdit(
    caret: Int,
    fromLine: Int,
    fromCol: Int,
    toLine: Int,
    toCol: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to caret.toLong(), LONG to fromLine.toLong(), LONG to fromCol.toLong(), LONG to toLine.toLong(), LONG to toCol.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.adjustCaretsAfterEditPtr, NIL)
  }

  /**
   * Returns a list of caret indexes in their edit order, this done from bottom to top. Edit order
   * refers to the way actions such as [insertTextAtCaret] are applied.
   */
  public fun getCaretIndexEditOrder(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCaretIndexEditOrderPtr,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Returns the original start line of the selection.
   */
  @JvmOverloads
  public fun getSelectionLine(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the original start column of the selection.
   */
  @JvmOverloads
  public fun getSelectionColumn(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
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
    public val _handleUnicodeInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "_handle_unicode_input")

    public val _backspacePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "_backspace")

    public val _cutPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "_cut")

    public val _copyPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "_copy")

    public val _pastePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "_paste")

    public val _pastePrimaryClipboardPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "_paste_primary_clipboard")

    public val hasImeTextPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "has_ime_text")

    public val cancelImePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "cancel_ime")

    public val applyImePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "apply_ime")

    public val setEditablePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "set_editable")

    public val isEditablePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "is_editable")

    public val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_text_direction")

    public val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_text_direction")

    public val setLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "set_language")

    public val getLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_language")

    public val setStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_structured_text_bidi_override")

    public val getStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_structured_text_bidi_override")

    public val setStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_structured_text_bidi_override_options")

    public val getStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_structured_text_bidi_override_options")

    public val setTabSizePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "set_tab_size")

    public val getTabSizePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_tab_size")

    public val setIndentWrappedLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_indent_wrapped_lines")

    public val isIndentWrappedLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_indent_wrapped_lines")

    public val setOvertypeModeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_overtype_mode_enabled")

    public val isOvertypeModeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_overtype_mode_enabled")

    public val setContextMenuEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_context_menu_enabled")

    public val isContextMenuEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_context_menu_enabled")

    public val setShortcutKeysEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_shortcut_keys_enabled")

    public val isShortcutKeysEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_shortcut_keys_enabled")

    public val setVirtualKeyboardEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_virtual_keyboard_enabled")

    public val isVirtualKeyboardEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_virtual_keyboard_enabled")

    public val setMiddleMousePasteEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_middle_mouse_paste_enabled")

    public val isMiddleMousePasteEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_middle_mouse_paste_enabled")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "clear")

    public val setTextPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "set_text")

    public val getTextPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_text")

    public val getLineCountPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_line_count")

    public val setPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_placeholder")

    public val getPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_placeholder")

    public val setLinePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "set_line")

    public val getLinePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_line")

    public val getLineWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_line_width")

    public val getLineHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_height")

    public val getIndentLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_indent_level")

    public val getFirstNonWhitespaceColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_first_non_whitespace_column")

    public val swapLinesPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "swap_lines")

    public val insertLineAtPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "insert_line_at")

    public val removeLineAtPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "remove_line_at")

    public val insertTextAtCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "insert_text_at_caret")

    public val insertTextPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "insert_text")

    public val removeTextPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "remove_text")

    public val getLastUnhiddenLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_last_unhidden_line")

    public val getNextVisibleLineOffsetFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_next_visible_line_offset_from")

    public val getNextVisibleLineIndexOffsetFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_next_visible_line_index_offset_from")

    public val backspacePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "backspace")

    public val cutPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "cut")

    public val copyPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "copy")

    public val pastePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "paste")

    public val pastePrimaryClipboardPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "paste_primary_clipboard")

    public val startActionPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "start_action")

    public val endActionPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "end_action")

    public val beginComplexOperationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "begin_complex_operation")

    public val endComplexOperationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "end_complex_operation")

    public val hasUndoPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "has_undo")

    public val hasRedoPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "has_redo")

    public val undoPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "undo")

    public val redoPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "redo")

    public val clearUndoHistoryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "clear_undo_history")

    public val tagSavedVersionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "tag_saved_version")

    public val getVersionPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_version")

    public val getSavedVersionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_saved_version")

    public val setSearchTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_search_text")

    public val setSearchFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_search_flags")

    public val searchPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "search")

    public val setTooltipRequestFuncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_tooltip_request_func")

    public val getLocalMousePosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_local_mouse_pos")

    public val getWordAtPosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_word_at_pos")

    public val getLineColumnAtPosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_column_at_pos")

    public val getPosAtLineColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_pos_at_line_column")

    public val getRectAtLineColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_rect_at_line_column")

    public val getMinimapLineAtPosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_minimap_line_at_pos")

    public val isDraggingCursorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_dragging_cursor")

    public val isMouseOverSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_mouse_over_selection")

    public val setCaretTypePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "set_caret_type")

    public val getCaretTypePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_caret_type")

    public val setCaretBlinkEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_caret_blink_enabled")

    public val isCaretBlinkEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_caret_blink_enabled")

    public val setCaretBlinkIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_caret_blink_interval")

    public val getCaretBlinkIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_caret_blink_interval")

    public val setDrawCaretWhenEditableDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_draw_caret_when_editable_disabled")

    public val isDrawingCaretWhenEditableDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_drawing_caret_when_editable_disabled")

    public val setMoveCaretOnRightClickEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_move_caret_on_right_click_enabled")

    public val isMoveCaretOnRightClickEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_move_caret_on_right_click_enabled")

    public val setCaretMidGraphemeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_caret_mid_grapheme_enabled")

    public val isCaretMidGraphemeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_caret_mid_grapheme_enabled")

    public val setMultipleCaretsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_multiple_carets_enabled")

    public val isMultipleCaretsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_multiple_carets_enabled")

    public val addCaretPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "add_caret")

    public val removeCaretPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "remove_caret")

    public val removeSecondaryCaretsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "remove_secondary_carets")

    public val getCaretCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_caret_count")

    public val addCaretAtCaretsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "add_caret_at_carets")

    public val getSortedCaretsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_sorted_carets")

    public val collapseCaretsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "collapse_carets")

    public val mergeOverlappingCaretsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "merge_overlapping_carets")

    public val beginMulticaretEditPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "begin_multicaret_edit")

    public val endMulticaretEditPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "end_multicaret_edit")

    public val isInMulitcaretEditPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_in_mulitcaret_edit")

    public val multicaretEditIgnoreCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "multicaret_edit_ignore_caret")

    public val isCaretVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_caret_visible")

    public val getCaretDrawPosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_caret_draw_pos")

    public val setCaretLinePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "set_caret_line")

    public val getCaretLinePtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_caret_line")

    public val setCaretColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_caret_column")

    public val getCaretColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_caret_column")

    public val getCaretWrapIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_caret_wrap_index")

    public val getWordUnderCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_word_under_caret")

    public val setUseDefaultWordSeparatorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_use_default_word_separators")

    public val isDefaultWordSeparatorsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_default_word_separators_enabled")

    public val setUseCustomWordSeparatorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_use_custom_word_separators")

    public val isCustomWordSeparatorsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_custom_word_separators_enabled")

    public val setCustomWordSeparatorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_custom_word_separators")

    public val getCustomWordSeparatorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_custom_word_separators")

    public val setSelectingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_selecting_enabled")

    public val isSelectingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_selecting_enabled")

    public val setDeselectOnFocusLossEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_deselect_on_focus_loss_enabled")

    public val isDeselectOnFocusLossEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_deselect_on_focus_loss_enabled")

    public val setDragAndDropSelectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_drag_and_drop_selection_enabled")

    public val isDragAndDropSelectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_drag_and_drop_selection_enabled")

    public val setSelectionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_selection_mode")

    public val getSelectionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_mode")

    public val selectAllPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "select_all")

    public val selectWordUnderCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "select_word_under_caret")

    public val addSelectionForNextOccurrencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "add_selection_for_next_occurrence")

    public val skipSelectionForNextOccurrencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "skip_selection_for_next_occurrence")

    public val selectPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "select")

    public val hasSelectionPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "has_selection")

    public val getSelectedTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selected_text")

    public val getSelectionAtLineColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_at_line_column")

    public val getLineRangesFromCaretsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_ranges_from_carets")

    public val getSelectionOriginLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_origin_line")

    public val getSelectionOriginColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_origin_column")

    public val setSelectionOriginLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_selection_origin_line")

    public val setSelectionOriginColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_selection_origin_column")

    public val getSelectionFromLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_from_line")

    public val getSelectionFromColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_from_column")

    public val getSelectionToLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_to_line")

    public val getSelectionToColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_to_column")

    public val isCaretAfterSelectionOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_caret_after_selection_origin")

    public val deselectPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "deselect")

    public val deleteSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "delete_selection")

    public val setLineWrappingModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_wrapping_mode")

    public val getLineWrappingModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_wrapping_mode")

    public val setAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_autowrap_mode")

    public val getAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_autowrap_mode")

    public val isLineWrappedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_line_wrapped")

    public val getLineWrapCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_wrap_count")

    public val getLineWrapIndexAtColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_wrap_index_at_column")

    public val getLineWrappedTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_wrapped_text")

    public val setSmoothScrollEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_smooth_scroll_enabled")

    public val isSmoothScrollEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_smooth_scroll_enabled")

    public val getVScrollBarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_v_scroll_bar")

    public val getHScrollBarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_h_scroll_bar")

    public val setVScrollPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "set_v_scroll")

    public val getVScrollPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_v_scroll")

    public val setHScrollPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "set_h_scroll")

    public val getHScrollPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_h_scroll")

    public val setScrollPastEndOfFileEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_scroll_past_end_of_file_enabled")

    public val isScrollPastEndOfFileEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_scroll_past_end_of_file_enabled")

    public val setVScrollSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_v_scroll_speed")

    public val getVScrollSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_v_scroll_speed")

    public val setFitContentHeightEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_fit_content_height_enabled")

    public val isFitContentHeightEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_fit_content_height_enabled")

    public val getScrollPosForLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_scroll_pos_for_line")

    public val setLineAsFirstVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_as_first_visible")

    public val getFirstVisibleLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_first_visible_line")

    public val setLineAsCenterVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_as_center_visible")

    public val setLineAsLastVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_as_last_visible")

    public val getLastFullVisibleLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_last_full_visible_line")

    public val getLastFullVisibleLineWrapIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_last_full_visible_line_wrap_index")

    public val getVisibleLineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_visible_line_count")

    public val getVisibleLineCountInRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_visible_line_count_in_range")

    public val getTotalVisibleLineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_total_visible_line_count")

    public val adjustViewportToCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "adjust_viewport_to_caret")

    public val centerViewportToCaretPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "center_viewport_to_caret")

    public val setDrawMinimapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_draw_minimap")

    public val isDrawingMinimapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_drawing_minimap")

    public val setMinimapWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_minimap_width")

    public val getMinimapWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_minimap_width")

    public val getMinimapVisibleLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_minimap_visible_lines")

    public val addGutterPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "add_gutter")

    public val removeGutterPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "remove_gutter")

    public val getGutterCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_gutter_count")

    public val setGutterNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_gutter_name")

    public val getGutterNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_gutter_name")

    public val setGutterTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_gutter_type")

    public val getGutterTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_gutter_type")

    public val setGutterWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_gutter_width")

    public val getGutterWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_gutter_width")

    public val setGutterDrawPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_gutter_draw")

    public val isGutterDrawnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_gutter_drawn")

    public val setGutterClickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_gutter_clickable")

    public val isGutterClickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_gutter_clickable")

    public val setGutterOverwritablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_gutter_overwritable")

    public val isGutterOverwritablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_gutter_overwritable")

    public val mergeGuttersPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "merge_gutters")

    public val setGutterCustomDrawPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_gutter_custom_draw")

    public val getTotalGutterWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_total_gutter_width")

    public val setLineGutterMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_gutter_metadata")

    public val getLineGutterMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_gutter_metadata")

    public val setLineGutterTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_gutter_text")

    public val getLineGutterTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_gutter_text")

    public val setLineGutterIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_gutter_icon")

    public val getLineGutterIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_gutter_icon")

    public val setLineGutterItemColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_gutter_item_color")

    public val getLineGutterItemColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_gutter_item_color")

    public val setLineGutterClickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_gutter_clickable")

    public val isLineGutterClickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_line_gutter_clickable")

    public val setLineBackgroundColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_line_background_color")

    public val getLineBackgroundColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_line_background_color")

    public val setSyntaxHighlighterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_syntax_highlighter")

    public val getSyntaxHighlighterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_syntax_highlighter")

    public val setHighlightCurrentLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_highlight_current_line")

    public val isHighlightCurrentLineEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_highlight_current_line_enabled")

    public val setHighlightAllOccurrencesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_highlight_all_occurrences")

    public val isHighlightAllOccurrencesEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_highlight_all_occurrences_enabled")

    public val getDrawControlCharsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_draw_control_chars")

    public val setDrawControlCharsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_draw_control_chars")

    public val setDrawTabsPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "set_draw_tabs")

    public val isDrawingTabsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_drawing_tabs")

    public val setDrawSpacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "set_draw_spaces")

    public val isDrawingSpacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_drawing_spaces")

    public val getMenuPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "get_menu")

    public val isMenuVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "is_menu_visible")

    public val menuOptionPtr: VoidPtr = TypeManager.getMethodBindPtr("TextEdit", "menu_option")

    public val adjustCaretsAfterEditPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "adjust_carets_after_edit")

    public val getCaretIndexEditOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_caret_index_edit_order")

    public val getSelectionLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_line")

    public val getSelectionColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextEdit", "get_selection_column")
  }
}
