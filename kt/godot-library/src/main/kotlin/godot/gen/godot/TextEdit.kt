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
 * A multiline text editor.
 *
 * A multiline text editor. It also has limited facilities for editing code, such as syntax highlighting support. For more advanced facilities for editing code, see [godot.CodeEdit].
 *
 * **Note:** Most viewport, caret and edit methods contain a `caret_index` argument for [caretMultiple] support. The argument should be one of the following: `-1` for all carets, `0` for the main caret, or greater than `0` for secondary carets.
 *
 * **Note:** When holding down [kbd]Alt[/kbd], the vertical scroll wheel will scroll 5 times as fast as it would normally do. This also works in the Godot script editor.
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
   *
   * When text is added [fromLine] will be less then [toLine]. On a remove [toLine] will be less then [fromLine].
   */
  public val linesEditedFrom: Signal2<Long, Long> by signal("fromLine", "toLine")

  /**
   * Emitted when the caret changes position.
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
   * String value of the [godot.TextEdit].
   */
  public var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_TEXT, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_TEXT, NIL)
    }

  /**
   * Text shown when the [godot.TextEdit] is empty. It is **not** the [godot.TextEdit]'s default value (see [text]).
   */
  public var placeholderText: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_PLACEHOLDER, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_PLACEHOLDER, NIL)
    }

  /**
   * If `false`, existing text cannot be modified and new text cannot be added.
   */
  public var editable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_EDITABLE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_EDITABLE, NIL)
    }

  /**
   * If `true`, a right-click displays the context menu.
   */
  public var contextMenuEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_CONTEXT_MENU_ENABLED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_CONTEXT_MENU_ENABLED,
          NIL)
    }

  /**
   * If `true`, shortcut keys for context menu items are enabled, even if the context menu is disabled.
   */
  public var shortcutKeysEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_SHORTCUT_KEYS_ENABLED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SHORTCUT_KEYS_ENABLED, NIL)
    }

  /**
   * If `true`, text can be selected.
   *
   * If `false`, text can not be selected by the user or by the [select] or [selectAll] methods.
   */
  public var selectingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_SELECTING_ENABLED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SELECTING_ENABLED,
          NIL)
    }

  /**
   * If `true`, the selected text will be deselected when focus is lost.
   */
  public var deselectOnFocusLossEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_DESELECT_ON_FOCUS_LOSS_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_DESELECT_ON_FOCUS_LOSS_ENABLED, NIL)
    }

  /**
   * If `true`, allow drag and drop of selected text.
   */
  public var dragAndDropSelectionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_DRAG_AND_DROP_SELECTION_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_DRAG_AND_DROP_SELECTION_ENABLED, NIL)
    }

  /**
   * If `true`, the native virtual keyboard is shown when focused on platforms that support it.
   */
  public var virtualKeyboardEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_VIRTUAL_KEYBOARD_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_VIRTUAL_KEYBOARD_ENABLED, NIL)
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
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_MIDDLE_MOUSE_PASTE_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_MIDDLE_MOUSE_PASTE_ENABLED, NIL)
    }

  /**
   * Sets the line wrapping mode to use.
   */
  public var wrapMode: LineWrappingMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_WRAPPING_MODE,
          LONG)
      return TextEdit.LineWrappingMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_WRAPPING_MODE,
          NIL)
    }

  /**
   * If [wrapMode] is set to [LINE_WRAPPING_BOUNDARY], sets text wrapping mode. To see how each mode behaves, see [enum TextServer.AutowrapMode].
   */
  public var autowrapMode: TextServer.AutowrapMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_AUTOWRAP_MODE, LONG)
      return TextServer.AutowrapMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_AUTOWRAP_MODE, NIL)
    }

  /**
   * If `true`, all occurrences of the selected text will be highlighted.
   */
  public var highlightAllOccurrences: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_HIGHLIGHT_ALL_OCCURRENCES_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_HIGHLIGHT_ALL_OCCURRENCES, NIL)
    }

  /**
   * If `true`, the line containing the cursor is highlighted.
   */
  public var highlightCurrentLine: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_HIGHLIGHT_CURRENT_LINE_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_HIGHLIGHT_CURRENT_LINE, NIL)
    }

  /**
   * If `true`, control characters are displayed.
   */
  public var drawControlChars: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_DRAW_CONTROL_CHARS,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_DRAW_CONTROL_CHARS,
          NIL)
    }

  /**
   * If `true`, the "tab" character will have a visible representation.
   */
  public var drawTabs: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_DRAWING_TABS, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_DRAW_TABS, NIL)
    }

  /**
   * If `true`, the "space" character will have a visible representation.
   */
  public var drawSpaces: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_DRAWING_SPACES, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_DRAW_SPACES, NIL)
    }

  /**
   * Sets the [godot.SyntaxHighlighter] to use.
   */
  public var syntaxHighlighter: SyntaxHighlighter?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SYNTAX_HIGHLIGHTER,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as SyntaxHighlighter?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SYNTAX_HIGHLIGHTER,
          NIL)
    }

  /**
   * Scroll smoothly over the text rather then jumping to the next location.
   */
  public var scrollSmooth: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_SMOOTH_SCROLL_ENABLED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SMOOTH_SCROLL_ENABLED, NIL)
    }

  /**
   * Sets the scroll speed with the minimap or when [scrollSmooth] is enabled.
   */
  public var scrollVScrollSpeed: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_V_SCROLL_SPEED,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_V_SCROLL_SPEED, NIL)
    }

  /**
   * Allow scrolling past the last line into "virtual" space.
   */
  public var scrollPastEndOfFile: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_SCROLL_PAST_END_OF_FILE_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SCROLL_PAST_END_OF_FILE_ENABLED, NIL)
    }

  /**
   * If there is a vertical scrollbar, this determines the current vertical scroll value in line numbers, starting at 0 for the top line.
   */
  public var scrollVertical: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_V_SCROLL, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_V_SCROLL, NIL)
    }

  /**
   * If there is a horizontal scrollbar, this determines the current horizontal scroll value in pixels.
   */
  public var scrollHorizontal: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_H_SCROLL, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_H_SCROLL, NIL)
    }

  /**
   * If `true`, [godot.TextEdit] will disable vertical scroll and fit minimum height to the number of visible lines.
   */
  public var scrollFitContentHeight: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_FIT_CONTENT_HEIGHT_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_FIT_CONTENT_HEIGHT_ENABLED, NIL)
    }

  /**
   * If `true`, a minimap is shown, providing an outline of your source code.
   */
  public var minimapDraw: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_DRAWING_MINIMAP, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_DRAW_MINIMAP, NIL)
    }

  /**
   * The width, in pixels, of the minimap.
   */
  public var minimapWidth: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_MINIMAP_WIDTH, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_MINIMAP_WIDTH, NIL)
    }

  /**
   * Set the type of caret to draw.
   */
  public var caretType: CaretType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_CARET_TYPE, LONG)
      return TextEdit.CaretType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_CARET_TYPE, NIL)
    }

  /**
   * If `true`, makes the caret blink.
   */
  public var caretBlink: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_CARET_BLINK_ENABLED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_CARET_BLINK_ENABLED,
          NIL)
    }

  /**
   * The interval at which the caret blinks (in seconds).
   */
  public var caretBlinkInterval: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_CARET_BLINK_INTERVAL,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_CARET_BLINK_INTERVAL,
          NIL)
    }

  /**
   * If `true`, caret will be visible when [editable] is disabled.
   */
  public var caretDrawWhenEditableDisabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_DRAWING_CARET_WHEN_EDITABLE_DISABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_DRAW_CARET_WHEN_EDITABLE_DISABLED, NIL)
    }

  /**
   * If `true`, a right-click moves the caret at the mouse position before displaying the context menu.
   *
   * If `false`, the context menu disregards mouse location.
   */
  public var caretMoveOnRightClick: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_MOVE_CARET_ON_RIGHT_CLICK_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_MOVE_CARET_ON_RIGHT_CLICK_ENABLED, NIL)
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
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_CARET_MID_GRAPHEME_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_CARET_MID_GRAPHEME_ENABLED, NIL)
    }

  /**
   * Sets if multiple carets are allowed.
   */
  public var caretMultiple: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_MULTIPLE_CARETS_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_MULTIPLE_CARETS_ENABLED, NIL)
    }

  /**
   * Base text writing direction.
   */
  public var textDirection: Control.TextDirection
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_TEXT_DIRECTION, LONG)
      return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_TEXT_DIRECTION, NIL)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public var language: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LANGUAGE, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LANGUAGE, NIL)
    }

  /**
   * Set BiDi algorithm override for the structured text.
   */
  public var structuredTextBidiOverride: TextServer.StructuredTextParser
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_STRUCTURED_TEXT_BIDI_OVERRIDE, LONG)
      return TextServer.StructuredTextParser.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_STRUCTURED_TEXT_BIDI_OVERRIDE, NIL)
    }

  /**
   * Set additional options for BiDi override.
   */
  public var structuredTextBidiOverrideOptions: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_STRUCTURED_TEXT_BIDI_OVERRIDE_OPTIONS, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_STRUCTURED_TEXT_BIDI_OVERRIDE_OPTIONS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TEXTEDIT, scriptIndex)
    return true
  }

  /**
   * Override this method to define what happens when the user types in the provided key [unicodeChar].
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
   * Override this method to define what happens when the user performs a paste operation with middle mouse button.
   *
   * **Note:** This method is only implemented on Linux.
   */
  public open fun _pastePrimaryClipboard(caretIndex: Int): Unit {
  }

  /**
   * Returns if the user has IME text.
   */
  public fun hasImeText(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_HAS_IME_TEXT, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the tab size for the [godot.TextEdit] to use.
   */
  public fun setTabSize(size: Int): Unit {
    TransferContext.writeArguments(LONG to size.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_TAB_SIZE, NIL)
  }

  /**
   * Returns the [godot.TextEdit]'s' tab size.
   */
  public fun getTabSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_TAB_SIZE, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * If `true`, sets the user into overtype mode. When the user types in this mode, it will override existing text.
   */
  public fun setOvertypeModeEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_OVERTYPE_MODE_ENABLED,
        NIL)
  }

  /**
   * Returns whether the user is in overtype mode.
   */
  public fun isOvertypeModeEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_OVERTYPE_MODE_ENABLED,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Performs a full reset of [godot.TextEdit], including undo history.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CLEAR, NIL)
  }

  /**
   * Returns the number of lines in the text.
   */
  public fun getLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the text for a specific line.
   */
  public fun setLine(line: Int, newText: String): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), STRING to newText)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE, NIL)
  }

  /**
   * Returns the text of a specific line.
   */
  public fun getLine(line: Int): String {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the width in pixels of the [wrapIndex] on [line].
   */
  @JvmOverloads
  public fun getLineWidth(line: Int, wrapIndex: Int = -1): Int {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_WIDTH, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the maximum value of the line height among all lines.
   *
   * **Note:** The return value is influenced by [theme_item line_spacing] and [theme_item font_size]. And it will not be less than `1`.
   */
  public fun getLineHeight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_HEIGHT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the number of spaces and `tab * tab_size` before the first char.
   */
  public fun getIndentLevel(line: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_INDENT_LEVEL, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the first column containing a non-whitespace character.
   */
  public fun getFirstNonWhitespaceColumn(line: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_FIRST_NON_WHITESPACE_COLUMN, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Swaps the two lines.
   */
  public fun swapLines(fromLine: Int, toLine: Int): Unit {
    TransferContext.writeArguments(LONG to fromLine.toLong(), LONG to toLine.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SWAP_LINES, NIL)
  }

  /**
   * Inserts a new line with [text] at [line].
   */
  public fun insertLineAt(line: Int, text: String): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_INSERT_LINE_AT, NIL)
  }

  /**
   * Insert the specified text at the caret position.
   */
  @JvmOverloads
  public fun insertTextAtCaret(text: String, caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(STRING to text, LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_INSERT_TEXT_AT_CARET, NIL)
  }

  /**
   * Removes text between the given positions.
   *
   * **Note:** This does not adjust the caret or selection, which as a result it can end up in an invalid position.
   */
  public fun removeText(
    fromLine: Int,
    fromColumn: Int,
    toLine: Int,
    toColumn: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to fromLine.toLong(), LONG to fromColumn.toLong(), LONG to toLine.toLong(), LONG to toColumn.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_REMOVE_TEXT, NIL)
  }

  /**
   * Returns the last unhidden line in the entire [godot.TextEdit].
   */
  public fun getLastUnhiddenLine(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LAST_UNHIDDEN_LINE,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the count to the next visible line from [line] to `line + visible_amount`. Can also count backwards. For example if a [godot.TextEdit] has 5 lines with lines 2 and 3 hidden, calling this with `line = 1, visible_amount = 1` would return 3.
   */
  public fun getNextVisibleLineOffsetFrom(line: Int, visibleAmount: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to visibleAmount.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_NEXT_VISIBLE_LINE_OFFSET_FROM, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Similar to [getNextVisibleLineOffsetFrom], but takes into account the line wrap indexes. In the returned vector, `x` is the line, `y` is the wrap index.
   */
  public fun getNextVisibleLineIndexOffsetFrom(
    line: Int,
    wrapIndex: Int,
    visibleAmount: Int,
  ): Vector2i {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong(), LONG to visibleAmount.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_NEXT_VISIBLE_LINE_INDEX_OFFSET_FROM, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Called when the user presses the backspace key. Can be overridden with [_backspace].
   */
  @JvmOverloads
  public fun backspace(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_BACKSPACE, NIL)
  }

  /**
   * Cut's the current selection. Can be overridden with [_cut].
   */
  @JvmOverloads
  public fun cut(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CUT, NIL)
  }

  /**
   * Copies the current text selection. Can be overridden with [_copy].
   */
  @JvmOverloads
  public fun copy(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_COPY, NIL)
  }

  /**
   * Paste at the current location. Can be overridden with [_paste].
   */
  @JvmOverloads
  public fun paste(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_PASTE, NIL)
  }

  /**
   * Pastes the primary clipboard.
   */
  @JvmOverloads
  public fun pastePrimaryClipboard(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_PASTE_PRIMARY_CLIPBOARD,
        NIL)
  }

  /**
   * Starts an action, will end the current action if [action] is different.
   *
   * An action will also end after a call to [endAction], after [godot.ProjectSettings.gui/timers/textEditIdleDetectSec] is triggered or a new undoable step outside the [startAction] and [endAction] calls.
   */
  public fun startAction(action: EditAction): Unit {
    TransferContext.writeArguments(LONG to action.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_START_ACTION, NIL)
  }

  /**
   * Marks the end of steps in the current action started with [startAction].
   */
  public fun endAction(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_END_ACTION, NIL)
  }

  /**
   * Starts a multipart edit. All edits will be treated as one action until [endComplexOperation] is called.
   */
  public fun beginComplexOperation(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_BEGIN_COMPLEX_OPERATION,
        NIL)
  }

  /**
   * Ends a multipart edit, started with [beginComplexOperation]. If called outside a complex operation, the current operation is pushed onto the undo/redo stack.
   */
  public fun endComplexOperation(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_END_COMPLEX_OPERATION, NIL)
  }

  /**
   * Returns `true` if an "undo" action is available.
   */
  public fun hasUndo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_HAS_UNDO, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if a "redo" action is available.
   */
  public fun hasRedo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_HAS_REDO, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Perform undo operation.
   */
  public fun undo(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_UNDO, NIL)
  }

  /**
   * Perform redo operation.
   */
  public fun redo(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_REDO, NIL)
  }

  /**
   * Clears the undo history.
   */
  public fun clearUndoHistory(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CLEAR_UNDO_HISTORY, NIL)
  }

  /**
   * Tag the current version as saved.
   */
  public fun tagSavedVersion(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_TAG_SAVED_VERSION, NIL)
  }

  /**
   * Returns the current version of the [godot.TextEdit]. The version is a count of recorded operations by the undo/redo history.
   */
  public fun getVersion(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_VERSION, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the last tagged saved version from [tagSavedVersion].
   */
  public fun getSavedVersion(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SAVED_VERSION, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets the search text. See [setSearchFlags].
   */
  public fun setSearchText(searchText: String): Unit {
    TransferContext.writeArguments(STRING to searchText)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SEARCH_TEXT, NIL)
  }

  /**
   * Sets the search [flags]. This is used with [setSearchText] to highlight occurrences of the searched text. Search flags can be specified from the [enum SearchFlags] enum.
   */
  public fun setSearchFlags(flags: Long): Unit {
    TransferContext.writeArguments(LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SEARCH_FLAGS, NIL)
  }

  /**
   * Perform a search inside the text. Search flags can be specified in the [enum SearchFlags] enum.
   *
   * In the returned vector, `x` is the column, `y` is the line. If no results are found, both are equal to `-1`.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var result = search("print", SEARCH_WHOLE_WORDS, 0, 0)
   *
   * if result.x != -1:
   *
   *     # Result found.
   *
   *     var line_number = result.y
   *
   *     var column_number = result.x
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * Vector2I result = Search("print", (uint)TextEdit.SearchFlags.WholeWords, 0, 0);
   *
   * if (result.X != -1)
   *
   * {
   *
   *     // Result found.
   *
   *     int lineNumber = result.Y;
   *
   *     int columnNumber = result.X;
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun search(
    text: String,
    flags: Long,
    fromLine: Int,
    fromColum: Int,
  ): Vector2i {
    TransferContext.writeArguments(STRING to text, LONG to flags, LONG to fromLine.toLong(), LONG to fromColum.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SEARCH, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Provide custom tooltip text. The callback method must take the following args: `hovered_word: String`.
   */
  public fun setTooltipRequestFunc(callback: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to callback)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_TOOLTIP_REQUEST_FUNC,
        NIL)
  }

  /**
   * Returns the local mouse position adjusted for the text direction.
   */
  public fun getLocalMousePos(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LOCAL_MOUSE_POS,
        VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the word at [position].
   */
  public fun getWordAtPos(position: Vector2): String {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_WORD_AT_POS, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the line and column at the given position. In the returned vector, `x` is the column, `y` is the line. If [allowOutOfBounds] is `false` and the position is not over the text, both vector values will be set to `-1`.
   */
  @JvmOverloads
  public fun getLineColumnAtPos(position: Vector2i, allowOutOfBounds: Boolean = true): Vector2i {
    TransferContext.writeArguments(VECTOR2I to position, BOOL to allowOutOfBounds)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_COLUMN_AT_POS,
        VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Returns the local position for the given [line] and [column]. If `x` or `y` of the returned vector equal `-1`, the position is outside of the viewable area of the control.
   *
   * **Note:** The Y position corresponds to the bottom side of the line. Use [getRectAtLineColumn] to get the top side position.
   */
  public fun getPosAtLineColumn(line: Int, column: Int): Vector2i {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_POS_AT_LINE_COLUMN,
        VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Returns the local position and size for the grapheme at the given [line] and [column]. If `x` or `y` position of the returned rect equal `-1`, the position is outside of the viewable area of the control.
   *
   * **Note:** The Y position of the returned rect corresponds to the top side of the line, unlike [getPosAtLineColumn] which returns the bottom side.
   */
  public fun getRectAtLineColumn(line: Int, column: Int): Rect2i {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_RECT_AT_LINE_COLUMN,
        RECT2I)
    return (TransferContext.readReturnValue(RECT2I, false) as Rect2i)
  }

  /**
   * Returns the equivalent minimap line at [position].
   */
  public fun getMinimapLineAtPos(position: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_MINIMAP_LINE_AT_POS,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns `true` if the user is dragging their mouse for scrolling or selecting.
   */
  public fun isDraggingCursor(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_DRAGGING_CURSOR, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns whether the mouse is over selection. If [edges] is `true`, the edges are considered part of the selection.
   */
  @JvmOverloads
  public fun isMouseOverSelection(edges: Boolean, caretIndex: Int = -1): Boolean {
    TransferContext.writeArguments(BOOL to edges, LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_MOUSE_OVER_SELECTION,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds a new caret at the given location. Returns the index of the new caret, or `-1` if the location is invalid.
   */
  public fun addCaret(line: Int, col: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to col.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_ADD_CARET, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Removes the given caret index.
   *
   * **Note:** This can result in adjustment of all other caret indices.
   */
  public fun removeCaret(caret: Int): Unit {
    TransferContext.writeArguments(LONG to caret.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_REMOVE_CARET, NIL)
  }

  /**
   * Removes all additional carets.
   */
  public fun removeSecondaryCarets(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_REMOVE_SECONDARY_CARETS,
        NIL)
  }

  /**
   * Merges any overlapping carets. Will favor the newest caret, or the caret with a selection.
   *
   * **Note:** This is not called when a caret changes position but after certain actions, so it is possible to get into a state where carets overlap.
   */
  public fun mergeOverlappingCarets(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_MERGE_OVERLAPPING_CARETS,
        NIL)
  }

  /**
   * Returns the number of carets in this [godot.TextEdit].
   */
  public fun getCaretCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_CARET_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds an additional caret above or below every caret. If [below] is true the new caret will be added below and above otherwise.
   */
  public fun addCaretAtCarets(below: Boolean): Unit {
    TransferContext.writeArguments(BOOL to below)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_ADD_CARET_AT_CARETS, NIL)
  }

  /**
   * Returns a list of caret indexes in their edit order, this done from bottom to top. Edit order refers to the way actions such as [insertTextAtCaret] are applied.
   */
  public fun getCaretIndexEditOrder(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_CARET_INDEX_EDIT_ORDER,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Reposition the carets affected by the edit. This assumes edits are applied in edit order, see [getCaretIndexEditOrder].
   */
  public fun adjustCaretsAfterEdit(
    caret: Int,
    fromLine: Int,
    fromCol: Int,
    toLine: Int,
    toCol: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to caret.toLong(), LONG to fromLine.toLong(), LONG to fromCol.toLong(), LONG to toLine.toLong(), LONG to toCol.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_ADJUST_CARETS_AFTER_EDIT,
        NIL)
  }

  /**
   * Returns `true` if the caret is visible on the screen.
   */
  @JvmOverloads
  public fun isCaretVisible(caretIndex: Int = 0): Boolean {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_CARET_VISIBLE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the caret pixel draw position.
   */
  @JvmOverloads
  public fun getCaretDrawPos(caretIndex: Int = 0): Vector2 {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_CARET_DRAW_POS,
        VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Moves the caret to the specified [line] index.
   *
   * If [adjustViewport] is `true`, the viewport will center at the caret position after the move occurs.
   *
   * If [canBeHidden] is `true`, the specified [line] can be hidden.
   *
   * **Note:** If supporting multiple carets this will not check for any overlap. See [mergeOverlappingCarets].
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_CARET_LINE, NIL)
  }

  /**
   * Returns the line the editing caret is on.
   */
  @JvmOverloads
  public fun getCaretLine(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_CARET_LINE, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Moves the caret to the specified [column] index.
   *
   * If [adjustViewport] is `true`, the viewport will center at the caret position after the move occurs.
   *
   * **Note:** If supporting multiple carets this will not check for any overlap. See [mergeOverlappingCarets].
   */
  @JvmOverloads
  public fun setCaretColumn(
    column: Int,
    adjustViewport: Boolean = true,
    caretIndex: Int = 0,
  ): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to adjustViewport, LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_CARET_COLUMN, NIL)
  }

  /**
   * Returns the column the editing caret is at.
   */
  @JvmOverloads
  public fun getCaretColumn(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_CARET_COLUMN, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the wrap index the editing caret is on.
   */
  @JvmOverloads
  public fun getCaretWrapIndex(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_CARET_WRAP_INDEX, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns a [godot.String] text with the word under the caret's location.
   */
  @JvmOverloads
  public fun getWordUnderCaret(caretIndex: Int = -1): String {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_WORD_UNDER_CARET,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets the current selection mode.
   */
  @JvmOverloads
  public fun setSelectionMode(
    mode: SelectionMode,
    line: Int = -1,
    column: Int = -1,
    caretIndex: Int = 0,
  ): Unit {
    TransferContext.writeArguments(LONG to mode.id, LONG to line.toLong(), LONG to column.toLong(), LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SELECTION_MODE, NIL)
  }

  /**
   * Returns the current selection mode.
   */
  public fun getSelectionMode(): SelectionMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_MODE, LONG)
    return TextEdit.SelectionMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Select all the text.
   *
   * If [selectingEnabled] is `false`, no selection will occur.
   */
  public fun selectAll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SELECT_ALL, NIL)
  }

  /**
   * Selects the word under the caret.
   */
  @JvmOverloads
  public fun selectWordUnderCaret(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SELECT_WORD_UNDER_CARET,
        NIL)
  }

  /**
   * Adds a selection and a caret for the next occurrence of the current selection. If there is no active selection, selects word under caret.
   */
  public fun addSelectionForNextOccurrence(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTEDIT_ADD_SELECTION_FOR_NEXT_OCCURRENCE, NIL)
  }

  /**
   * Perform selection, from line/column to line/column.
   *
   * If [selectingEnabled] is `false`, no selection will occur.
   */
  @JvmOverloads
  public fun select(
    fromLine: Int,
    fromColumn: Int,
    toLine: Int,
    toColumn: Int,
    caretIndex: Int = 0,
  ): Unit {
    TransferContext.writeArguments(LONG to fromLine.toLong(), LONG to fromColumn.toLong(), LONG to toLine.toLong(), LONG to toColumn.toLong(), LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SELECT, NIL)
  }

  /**
   * Returns `true` if the user has selected text.
   */
  @JvmOverloads
  public fun hasSelection(caretIndex: Int = -1): Boolean {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_HAS_SELECTION, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the text inside the selection of a caret, or all the carets if [caretIndex] is its default value `-1`.
   */
  @JvmOverloads
  public fun getSelectedText(caretIndex: Int = -1): String {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTED_TEXT, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the original start line of the selection.
   */
  @JvmOverloads
  public fun getSelectionLine(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_LINE, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the original start column of the selection.
   */
  @JvmOverloads
  public fun getSelectionColumn(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_COLUMN, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the selection begin line.
   */
  @JvmOverloads
  public fun getSelectionFromLine(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_FROM_LINE,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the selection begin column.
   */
  @JvmOverloads
  public fun getSelectionFromColumn(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_FROM_COLUMN,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the selection end line.
   */
  @JvmOverloads
  public fun getSelectionToLine(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_TO_LINE,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the selection end column.
   */
  @JvmOverloads
  public fun getSelectionToColumn(caretIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_TO_COLUMN,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Deselects the current selection.
   */
  @JvmOverloads
  public fun deselect(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_DESELECT, NIL)
  }

  /**
   * Deletes the selected text.
   */
  @JvmOverloads
  public fun deleteSelection(caretIndex: Int = -1): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_DELETE_SELECTION, NIL)
  }

  /**
   * Returns if the given line is wrapped.
   */
  public fun isLineWrapped(line: Int): Boolean {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_LINE_WRAPPED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the number of times the given line is wrapped.
   */
  public fun getLineWrapCount(line: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_WRAP_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the wrap index of the given line column.
   */
  public fun getLineWrapIndexAtColumn(line: Int, column: Int): Int {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_WRAP_INDEX_AT_COLUMN, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns an array of [godot.String]s representing each wrapped index.
   */
  public fun getLineWrappedText(line: Int): PackedStringArray {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_WRAPPED_TEXT,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns the [godot.VScrollBar] of the [godot.TextEdit].
   */
  public fun getVScrollBar(): VScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_V_SCROLL_BAR, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as VScrollBar?)
  }

  /**
   * Returns the [godot.HScrollBar] used by [godot.TextEdit].
   */
  public fun getHScrollBar(): HScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_H_SCROLL_BAR, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as HScrollBar?)
  }

  /**
   * Returns the scroll position for [wrapIndex] of [line].
   */
  @JvmOverloads
  public fun getScrollPosForLine(line: Int, wrapIndex: Int = 0): Double {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SCROLL_POS_FOR_LINE,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Positions the [wrapIndex] of [line] at the top of the viewport.
   */
  @JvmOverloads
  public fun setLineAsFirstVisible(line: Int, wrapIndex: Int = 0): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_AS_FIRST_VISIBLE,
        NIL)
  }

  /**
   * Returns the first visible line.
   */
  public fun getFirstVisibleLine(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_FIRST_VISIBLE_LINE,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Positions the [wrapIndex] of [line] at the center of the viewport.
   */
  @JvmOverloads
  public fun setLineAsCenterVisible(line: Int, wrapIndex: Int = 0): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_AS_CENTER_VISIBLE,
        NIL)
  }

  /**
   * Positions the [wrapIndex] of [line] at the bottom of the viewport.
   */
  @JvmOverloads
  public fun setLineAsLastVisible(line: Int, wrapIndex: Int = 0): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to wrapIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_AS_LAST_VISIBLE,
        NIL)
  }

  /**
   * Returns the last visible line. Use [getLastFullVisibleLineWrapIndex] for the wrap index.
   */
  public fun getLastFullVisibleLine(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LAST_FULL_VISIBLE_LINE,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the last visible wrap index of the last visible line.
   */
  public fun getLastFullVisibleLineWrapIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LAST_FULL_VISIBLE_LINE_WRAP_INDEX, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the number of visible lines, including wrapped text.
   */
  public fun getVisibleLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_VISIBLE_LINE_COUNT,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the total number of visible + wrapped lines between the two lines.
   */
  public fun getVisibleLineCountInRange(fromLine: Int, toLine: Int): Int {
    TransferContext.writeArguments(LONG to fromLine.toLong(), LONG to toLine.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_VISIBLE_LINE_COUNT_IN_RANGE, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the number of lines that may be drawn.
   */
  public fun getTotalVisibleLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_TOTAL_VISIBLE_LINE_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adjust the viewport so the caret is visible.
   */
  @JvmOverloads
  public fun adjustViewportToCaret(caretIndex: Int = 0): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_ADJUST_VIEWPORT_TO_CARET,
        NIL)
  }

  /**
   * Centers the viewport on the line the editing caret is at. This also resets the [scrollHorizontal] value to `0`.
   */
  @JvmOverloads
  public fun centerViewportToCaret(caretIndex: Int = 0): Unit {
    TransferContext.writeArguments(LONG to caretIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CENTER_VIEWPORT_TO_CARET,
        NIL)
  }

  /**
   * Returns the number of lines that may be drawn on the minimap.
   */
  public fun getMinimapVisibleLines(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_MINIMAP_VISIBLE_LINES,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Register a new gutter to this [godot.TextEdit]. Use [at] to have a specific gutter order. A value of `-1` appends the gutter to the right.
   */
  @JvmOverloads
  public fun addGutter(at: Int = -1): Unit {
    TransferContext.writeArguments(LONG to at.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_ADD_GUTTER, NIL)
  }

  /**
   * Removes the gutter from this [godot.TextEdit].
   */
  public fun removeGutter(gutter: Int): Unit {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_REMOVE_GUTTER, NIL)
  }

  /**
   * Returns the number of gutters registered.
   */
  public fun getGutterCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_GUTTER_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the name of the gutter.
   */
  public fun setGutterName(gutter: Int, name: String): Unit {
    TransferContext.writeArguments(LONG to gutter.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_GUTTER_NAME, NIL)
  }

  /**
   * Returns the name of the gutter at the given index.
   */
  public fun getGutterName(gutter: Int): String {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_GUTTER_NAME, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets the type of gutter.
   */
  public fun setGutterType(gutter: Int, type: GutterType): Unit {
    TransferContext.writeArguments(LONG to gutter.toLong(), LONG to type.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_GUTTER_TYPE, NIL)
  }

  /**
   * Returns the type of the gutter at the given index.
   */
  public fun getGutterType(gutter: Int): GutterType {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_GUTTER_TYPE, LONG)
    return TextEdit.GutterType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Set the width of the gutter.
   */
  public fun setGutterWidth(gutter: Int, width: Int): Unit {
    TransferContext.writeArguments(LONG to gutter.toLong(), LONG to width.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_GUTTER_WIDTH, NIL)
  }

  /**
   * Returns the width of the gutter at the given index.
   */
  public fun getGutterWidth(gutter: Int): Int {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_GUTTER_WIDTH, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets whether the gutter should be drawn.
   */
  public fun setGutterDraw(gutter: Int, draw: Boolean): Unit {
    TransferContext.writeArguments(LONG to gutter.toLong(), BOOL to draw)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_GUTTER_DRAW, NIL)
  }

  /**
   * Returns whether the gutter is currently drawn.
   */
  public fun isGutterDrawn(gutter: Int): Boolean {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_GUTTER_DRAWN, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the gutter as clickable. This will change the mouse cursor to a pointing hand when hovering over the gutter.
   */
  public fun setGutterClickable(gutter: Int, clickable: Boolean): Unit {
    TransferContext.writeArguments(LONG to gutter.toLong(), BOOL to clickable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_GUTTER_CLICKABLE, NIL)
  }

  /**
   * Returns whether the gutter is clickable.
   */
  public fun isGutterClickable(gutter: Int): Boolean {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_GUTTER_CLICKABLE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the gutter to overwritable. See [mergeGutters].
   */
  public fun setGutterOverwritable(gutter: Int, overwritable: Boolean): Unit {
    TransferContext.writeArguments(LONG to gutter.toLong(), BOOL to overwritable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_GUTTER_OVERWRITABLE,
        NIL)
  }

  /**
   * Returns whether the gutter is overwritable.
   */
  public fun isGutterOverwritable(gutter: Int): Boolean {
    TransferContext.writeArguments(LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_GUTTER_OVERWRITABLE,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Merge the gutters from [fromLine] into [toLine]. Only overwritable gutters will be copied.
   */
  public fun mergeGutters(fromLine: Int, toLine: Int): Unit {
    TransferContext.writeArguments(LONG to fromLine.toLong(), LONG to toLine.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_MERGE_GUTTERS, NIL)
  }

  /**
   * Set a custom draw method for the gutter. The callback method must take the following args: `line: int, gutter: int, Area: Rect2`.
   */
  public fun setGutterCustomDraw(column: Int, drawCallback: Callable): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), CALLABLE to drawCallback)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_GUTTER_CUSTOM_DRAW,
        NIL)
  }

  /**
   * Returns the total width of all gutters and internal padding.
   */
  public fun getTotalGutterWidth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_TOTAL_GUTTER_WIDTH,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the metadata for [gutter] on [line] to [metadata].
   */
  public fun setLineGutterMetadata(
    line: Int,
    gutter: Int,
    metadata: Any,
  ): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), ANY to metadata)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_GUTTER_METADATA,
        NIL)
  }

  /**
   * Returns the metadata currently in [gutter] at [line].
   */
  public fun getLineGutterMetadata(line: Int, gutter: Int): Any? {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_GUTTER_METADATA,
        ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Sets the text for [gutter] on [line] to [text].
   */
  public fun setLineGutterText(
    line: Int,
    gutter: Int,
    text: String,
  ): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_GUTTER_TEXT, NIL)
  }

  /**
   * Returns the text currently in [gutter] at [line].
   */
  public fun getLineGutterText(line: Int, gutter: Int): String {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_GUTTER_TEXT,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets the icon for [gutter] on [line] to [icon].
   */
  public fun setLineGutterIcon(
    line: Int,
    gutter: Int,
    icon: Texture2D,
  ): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_GUTTER_ICON, NIL)
  }

  /**
   * Returns the icon currently in [gutter] at [line].
   */
  public fun getLineGutterIcon(line: Int, gutter: Int): Texture2D? {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_GUTTER_ICON,
        OBJECT)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_GUTTER_ITEM_COLOR,
        NIL)
  }

  /**
   * Returns the color currently in [gutter] at [line].
   */
  public fun getLineGutterItemColor(line: Int, gutter: Int): Color {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_GUTTER_ITEM_COLOR,
        COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * If [clickable] is `true`, makes the [gutter] on [line] clickable. See [gutterClicked].
   */
  public fun setLineGutterClickable(
    line: Int,
    gutter: Int,
    clickable: Boolean,
  ): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong(), BOOL to clickable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_GUTTER_CLICKABLE,
        NIL)
  }

  /**
   * Returns whether the gutter on the given line is clickable.
   */
  public fun isLineGutterClickable(line: Int, gutter: Int): Boolean {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to gutter.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_LINE_GUTTER_CLICKABLE,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the current background color of the line. Set to `Color(0, 0, 0, 0)` for no color.
   */
  public fun setLineBackgroundColor(line: Int, color: Color): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_BACKGROUND_COLOR,
        NIL)
  }

  /**
   * Returns the current background color of the line. `Color(0, 0, 0, 0)` is returned if no color is set.
   */
  public fun getLineBackgroundColor(line: Int): Color {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_BACKGROUND_COLOR,
        COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Returns the [godot.PopupMenu] of this [godot.TextEdit]. By default, this menu is displayed when right-clicking on the [godot.TextEdit].
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
   *     menu.ItemCount = menu.GetItemIndex(TextEdit.MenuItems.Redo) + 1;
   *
   *     // Add custom items.
   *
   *     menu.AddSeparator();
   *
   *     menu.AddItem("Insert Date", TextEdit.MenuItems.Max + 1);
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
   *     if (id == TextEdit.MenuItems.Max + 1)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_MENU, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PopupMenu?)
  }

  /**
   * Returns whether the menu is visible. Use this instead of `get_menu().visible` to improve performance (so the creation of the menu is avoided).
   */
  public fun isMenuVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_MENU_VISIBLE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Executes a given action as defined in the [enum MenuItems] enum.
   */
  public fun menuOption(option: Int): Unit {
    TransferContext.writeArguments(LONG to option.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_MENU_OPTION, NIL)
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class GutterType(
    id: Long,
  ) {
    /**
     * Draw a string.
     */
    GUTTER_TYPE_STRING(0),
    /**
     * Draw an icon.
     */
    GUTTER_TYPE_ICON(1),
    /**
     * Custom draw.
     */
    GUTTER_TYPE_CUSTOM(2),
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
}
