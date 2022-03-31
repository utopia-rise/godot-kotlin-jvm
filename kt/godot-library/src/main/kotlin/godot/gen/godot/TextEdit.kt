// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.TextEdit
import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.Color
import godot.core.PackedStringArray
import godot.core.Rect2i
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.RECT2I
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2
import godot.core.Vector2i
import godot.signals.Signal0
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Multiline text editing control.
 *
 * TextEdit is meant for editing large, multiline text. It also has facilities for editing code, such as syntax highlighting support and multiple levels of undo/redo.
 *
 * **Note:** When holding down [kbd]Alt[/kbd], the vertical scroll wheel will scroll 5 times as fast as it would normally do. This also works in the Godot script editor.
 */
@GodotBaseType
public open class TextEdit : Control() {
  /**
   * Emitted when a gutter is removed.
   */
  public val gutterRemoved: Signal0 by signal()

  /**
   * Emitted when a gutter is added.
   */
  public val gutterAdded: Signal0 by signal()

  /**
   * Emitted immediately when the text changes.
   *
   * When text is added `from_line` will be less then `to_line`. On a remove `to_line` will be less then `from_line`.
   */
  public val linesEditedFrom: Signal2<Long, Long> by signal("fromLine", "toLine")

  /**
   * Emitted when the text changes.
   */
  public val textChanged: Signal0 by signal()

  /**
   * Emitted when the caret changes position.
   */
  public val caretChanged: Signal0 by signal()

  /**
   * Emitted when [clear] is called or [text] is set.
   */
  public val textSet: Signal0 by signal()

  /**
   * Emitted when a gutter is clicked.
   */
  public val gutterClicked: Signal2<Long, Long> by signal("line", "gutter")

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
   * Text shown when the [godot.TextEdit] is empty. It is **not** the [godot.TextEdit]'s default value (see [text]).
   */
  public open var placeholderText: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_PLACEHOLDER, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_PLACEHOLDER, NIL)
    }

  /**
   * Base text writing direction.
   */
  public open var textDirection: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_TEXT_DIRECTION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_TEXT_DIRECTION, NIL)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public open var language: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LANGUAGE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LANGUAGE, NIL)
    }

  /**
   * If `false`, existing text cannot be modified and new text cannot be added.
   */
  public open var editable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_EDITABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_EDITABLE, NIL)
    }

  /**
   * If `true`, a right-click displays the context menu.
   */
  public open var contextMenuEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_CONTEXT_MENU_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_CONTEXT_MENU_ENABLED,
          NIL)
    }

  /**
   * If `true`, shortcut keys for context menu items are enabled, even if the context menu is disabled.
   */
  public open var shortcutKeysEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_SHORTCUT_KEYS_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
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
  public open var selectingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_SELECTING_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SELECTING_ENABLED,
          NIL)
    }

  /**
   * If `true`, the selected text will be deselected when focus is lost.
   */
  public open var deselectOnFocusLossEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_DESELECT_ON_FOCUS_LOSS_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_DESELECT_ON_FOCUS_LOSS_ENABLED, NIL)
    }

  /**
   * If `true`, the native virtual keyboard is shown when focused on platforms that support it.
   */
  public open var virtualKeyboardEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_VIRTUAL_KEYBOARD_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
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
  public open var middleMousePasteEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_MIDDLE_MOUSE_PASTE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_MIDDLE_MOUSE_PASTE_ENABLED, NIL)
    }

  /**
   * Sets the line wrapping mode to use.
   */
  public open var wrapMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_WRAPPING_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_WRAPPING_MODE,
          NIL)
    }

  /**
   * If `true`, custom `font_selected_color` will be used for selected text.
   */
  public open var overrideSelectedFontColor: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_OVERRIDING_SELECTED_FONT_COLOR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_OVERRIDE_SELECTED_FONT_COLOR, NIL)
    }

  /**
   * If `true`, all occurrences of the selected text will be highlighted.
   */
  public open var highlightAllOccurrences: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_HIGHLIGHT_ALL_OCCURRENCES_ENABLED, BOOL)
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
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_HIGHLIGHT_CURRENT_LINE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_HIGHLIGHT_CURRENT_LINE, NIL)
    }

  /**
   * If `true`, control characters are displayed.
   */
  public open var drawControlChars: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_DRAW_CONTROL_CHARS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_DRAW_CONTROL_CHARS,
          NIL)
    }

  /**
   * If `true`, the "tab" character will have a visible representation.
   */
  public open var drawTabs: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_DRAWING_TABS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_DRAW_TABS, NIL)
    }

  /**
   * If `true`, the "space" character will have a visible representation.
   */
  public open var drawSpaces: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_DRAWING_SPACES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_DRAW_SPACES, NIL)
    }

  /**
   * Sets the [godot.SyntaxHighlighter] to use.
   */
  public open var syntaxHighlighter: SyntaxHighlighter?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SYNTAX_HIGHLIGHTER,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as SyntaxHighlighter?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SYNTAX_HIGHLIGHTER,
          NIL)
    }

  /**
   * Scroll smoothly over the text rather then jumping to the next location.
   */
  public open var scrollSmooth: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_SMOOTH_SCROLL_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SMOOTH_SCROLL_ENABLE,
          NIL)
    }

  /**
   * Sets the scroll speed with the minimap or when [scrollSmooth] is enabled.
   */
  public open var scrollVScrollSpeed: Double
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
   * Allow scrolling past the last line into "virtual" space.
   */
  public open var scrollPastEndOfFile: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_SCROLL_PAST_END_OF_FILE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SCROLL_PAST_END_OF_FILE_ENABLED, NIL)
    }

  /**
   * If there is a vertical scrollbar, this determines the current vertical scroll value in line numbers, starting at 0 for the top line.
   */
  public open var scrollVertical: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_V_SCROLL, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_V_SCROLL, NIL)
    }

  /**
   * If there is a horizontal scrollbar, this determines the current horizontal scroll value in pixels.
   */
  public open var scrollHorizontal: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_H_SCROLL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_H_SCROLL, NIL)
    }

  /**
   * If `true`, a minimap is shown, providing an outline of your source code.
   */
  public open var minimapDraw: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_DRAWING_MINIMAP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_DRAW_MINIMAP, NIL)
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
   * Set the type of caret to draw.
   */
  public open var caretType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_CARET_TYPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_CARET_TYPE, NIL)
    }

  /**
   * Sets if the caret should blink.
   */
  public open var caretBlink: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_CARET_BLINK_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_CARET_BLINK_ENABLED,
          NIL)
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
   * If `true`, a right-click moves the caret at the mouse position before displaying the context menu.
   *
   * If `false`, the context menu disregards mouse location.
   */
  public open var caretMoveOnRightClick: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_MOVE_CARET_ON_RIGHT_CLICK_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
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
  public open var caretMidGrapheme: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_CARET_MID_GRAPHEME_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_CARET_MID_GRAPHEME_ENABLED, NIL)
    }

  /**
   * Set BiDi algorithm override for the structured text.
   */
  public open var structuredTextBidiOverride: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_STRUCTURED_TEXT_BIDI_OVERRIDE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_STRUCTURED_TEXT_BIDI_OVERRIDE, NIL)
    }

  /**
   * Set additional options for BiDi override.
   */
  public open var structuredTextBidiOverrideOptions: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_STRUCTURED_TEXT_BIDI_OVERRIDE_OPTIONS, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_STRUCTURED_TEXT_BIDI_OVERRIDE_OPTIONS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TEXTEDIT)
  }

  /**
   * Override this method to define what happens when the types in the provided key `unicode`.
   */
  public open fun _handleUnicodeInput(unicodeChar: Long): Unit {
  }

  /**
   * Override this method to define what happens when the user presses the backspace key.
   */
  public open fun _backspace(): Unit {
  }

  /**
   * Override this method to define what happens when the user performs a cut operation.
   */
  public open fun _cut(): Unit {
  }

  /**
   * Override this method to define what happens when the user performs a copy operation.
   */
  public open fun _copy(): Unit {
  }

  /**
   * Override this method to define what happens when the user performs a paste operation.
   */
  public open fun _paste(): Unit {
  }

  /**
   * Override this method to define what happens when the user performs a paste operation with middle mouse button.
   *
   * **Note:** This method is only implemented on Linux.
   */
  public open fun _pastePrimaryClipboard(): Unit {
  }

  /**
   * Returns if the user has IME text.
   */
  public open fun hasImeText(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_HAS_IME_TEXT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets OpenType feature `tag`. More info: [godot.OpenType feature tags](https://docs.microsoft.com/en-us/typography/opentype/spec/featuretags).
   */
  public open fun setOpentypeFeature(tag: String, `value`: Long): Unit {
    TransferContext.writeArguments(STRING to tag, LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_OPENTYPE_FEATURE, NIL)
  }

  /**
   * Returns OpenType feature `tag`.
   */
  public open fun getOpentypeFeature(tag: String): Long {
    TransferContext.writeArguments(STRING to tag)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_OPENTYPE_FEATURE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes all OpenType features.
   */
  public open fun clearOpentypeFeatures(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CLEAR_OPENTYPE_FEATURES,
        NIL)
  }

  /**
   * Sets the tab size for the [godot.TextEdit] to use.
   */
  public open fun setTabSize(size: Long): Unit {
    TransferContext.writeArguments(LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_TAB_SIZE, NIL)
  }

  /**
   * Returns the [godot.TextEdit]'s' tab size.
   */
  public open fun getTabSize(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_TAB_SIZE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * If `true`, sets the user into overtype mode. When the user types in this mode, it will override existing text.
   */
  public open fun setOvertypeModeEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_OVERTYPE_MODE_ENABLED,
        NIL)
  }

  /**
   * Returns whether the user is in overtype mode.
   */
  public open fun isOvertypeModeEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_OVERTYPE_MODE_ENABLED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Performs a full reset of [godot.TextEdit], including undo history.
   */
  public open fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CLEAR, NIL)
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
   * Sets the text for a specific line.
   */
  public open fun setLine(line: Long, newText: String): Unit {
    TransferContext.writeArguments(LONG to line, STRING to newText)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE, NIL)
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
   * Returns the width in pixels of the `wrap_index` on `line`.
   */
  public open fun getLineWidth(line: Long, wrapIndex: Long = -1): Long {
    TransferContext.writeArguments(LONG to line, LONG to wrapIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_WIDTH, LONG)
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
   * Returns the amount of spaces and `tab * tab_size` before the first char.
   */
  public open fun getIndentLevel(line: Long): Long {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_INDENT_LEVEL, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the first column containing a non-whitespace character.
   */
  public open fun getFirstNonWhitespaceColumn(line: Long): Long {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_FIRST_NON_WHITESPACE_COLUMN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Swaps the two lines.
   */
  public open fun swapLines(fromLine: Long, toLine: Long): Unit {
    TransferContext.writeArguments(LONG to fromLine, LONG to toLine)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SWAP_LINES, NIL)
  }

  /**
   * Inserts a new line with `text` at `line`.
   */
  public open fun insertLineAt(line: Long, text: String): Unit {
    TransferContext.writeArguments(LONG to line, STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_INSERT_LINE_AT, NIL)
  }

  /**
   * Insert the specified text at the caret position.
   */
  public open fun insertTextAtCaret(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_INSERT_TEXT_AT_CARET, NIL)
  }

  /**
   * Removes text between the given positions.
   *
   * **Note:** This does not adjust the caret or selection, which as a result it can end up in an invalid position.
   */
  public open fun removeText(
    fromLine: Long,
    fromColumn: Long,
    toLine: Long,
    toColumn: Long
  ): Unit {
    TransferContext.writeArguments(LONG to fromLine, LONG to fromColumn, LONG to toLine, LONG to
        toColumn)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_REMOVE_TEXT, NIL)
  }

  /**
   * Returns the last unhidden line in the entire [godot.TextEdit].
   */
  public open fun getLastUnhiddenLine(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LAST_UNHIDDEN_LINE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the count to the next visible line from `line` to `line + visible_amount`. Can also count backwards. For example if a [godot.TextEdit] has 5 lines with lines 2 and 3 hidden, calling this with `line = 1, visible_amount = 1` would return 3.
   */
  public open fun getNextVisibleLineOffsetFrom(line: Long, visibleAmount: Long): Long {
    TransferContext.writeArguments(LONG to line, LONG to visibleAmount)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_NEXT_VISIBLE_LINE_OFFSET_FROM, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Similar to [getNextVisibleLineOffsetFrom], but takes into account the line wrap indexes. In the returned vector, `x` is the line, `y` is the wrap index.
   */
  public open fun getNextVisibleLineIndexOffsetFrom(
    line: Long,
    wrapIndex: Long,
    visibleAmount: Long
  ): Vector2i {
    TransferContext.writeArguments(LONG to line, LONG to wrapIndex, LONG to visibleAmount)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_NEXT_VISIBLE_LINE_INDEX_OFFSET_FROM, VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Called when the user presses the backspace key. Can be overridden with [_backspace].
   */
  public open fun backspace(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_BACKSPACE, NIL)
  }

  /**
   * Cut's the current selection. Can be overridden with [_cut].
   */
  public open fun cut(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CUT, NIL)
  }

  /**
   * Copies the current text selection. Can be overridden with [_copy].
   */
  public open fun copy(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_COPY, NIL)
  }

  /**
   * Paste at the current location. Can be overridden with [_paste].
   */
  public open fun paste(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_PASTE, NIL)
  }

  /**
   * Starts a multipart edit. All edits will be treated as one action until [endComplexOperation] is called.
   */
  public open fun beginComplexOperation(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_BEGIN_COMPLEX_OPERATION,
        NIL)
  }

  /**
   * Ends a multipart edit, started with [beginComplexOperation]. If called outside a complex operation, the current operation is pushed onto the undo/redo stack.
   */
  public open fun endComplexOperation(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_END_COMPLEX_OPERATION, NIL)
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
   * Returns `true` if a "redo" action is available.
   */
  public open fun hasRedo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_HAS_REDO, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Perform undo operation.
   */
  public open fun undo(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_UNDO, NIL)
  }

  /**
   * Perform redo operation.
   */
  public open fun redo(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_REDO, NIL)
  }

  /**
   * Clears the undo history.
   */
  public open fun clearUndoHistory(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CLEAR_UNDO_HISTORY, NIL)
  }

  /**
   * Tag the current version as saved.
   */
  public open fun tagSavedVersion(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_TAG_SAVED_VERSION, NIL)
  }

  /**
   * Returns the current version of the [godot.TextEdit]. The version is a count of recorded operations by the undo/redo history.
   */
  public open fun getVersion(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_VERSION, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the last tagged saved version from [tagSavedVersion]
   */
  public open fun getSavedVersion(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SAVED_VERSION, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the search text. See [setSearchFlags].
   */
  public open fun setSearchText(searchText: String): Unit {
    TransferContext.writeArguments(STRING to searchText)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SEARCH_TEXT, NIL)
  }

  /**
   * Sets the search flags. This is used with [setSearchText] to highlight occurrences of the searched text. Search flags can be specified from the [enum SearchFlags] enum.
   */
  public open fun setSearchFlags(flags: Long): Unit {
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
   * if  result.x != -1:
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
   * Vector2i result = Search("print", (uint)TextEdit.SearchFlags.WholeWords, 0, 0);
   *
   * if (result.Length > 0)
   *
   * {
   *
   *     // Result found.
   *
   *     int lineNumber = result.y;
   *
   *     int columnNumber = result.x;
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public open fun search(
    text: String,
    flags: Long,
    fromLine: Long,
    fromColum: Long
  ): Vector2i {
    TransferContext.writeArguments(STRING to text, LONG to flags, LONG to fromLine, LONG to
        fromColum)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SEARCH, VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Provide custom tooltip text. The callback method must take the following args: `hovered_word: String`
   */
  public open fun setTooltipRequestFunc(callback: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to callback)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_TOOLTIP_REQUEST_FUNC,
        NIL)
  }

  /**
   * Returns the local mouse position adjusted for the text direction.
   */
  public open fun getLocalMousePos(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LOCAL_MOUSE_POS,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the word at `position`.
   */
  public open fun getWordAtPos(position: Vector2): String {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_WORD_AT_POS, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the line and column at the given position. In the returned vector, `x` is the column, `y` is the line. If `allow_out_of_bounds` is `false` and the position is not over the text, both vector values will be set to `-1`.
   */
  public open fun getLineColumnAtPos(position: Vector2i, allowOutOfBounds: Boolean = true):
      Vector2i {
    TransferContext.writeArguments(VECTOR2I to position, BOOL to allowOutOfBounds)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_COLUMN_AT_POS,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Returns the local position for the given `line` and `column`. If `x` or `y` of the returned vector equal `-1`, the position is outside of the viewable area of the control.
   *
   * **Note:** The Y position corresponds to the bottom side of the line. Use [getRectAtLineColumn] to get the top side position.
   */
  public open fun getPosAtLineColumn(line: Long, column: Long): Vector2i {
    TransferContext.writeArguments(LONG to line, LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_POS_AT_LINE_COLUMN,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Returns the local position and size for the grapheme at the given `line` and `column`. If `x` or `y` position of the returned rect equal `-1`, the position is outside of the viewable area of the control.
   *
   * **Note:** The Y position of the returned rect corresponds to the top side of the line, unlike [getPosAtLineColumn] which returns the bottom side.
   */
  public open fun getRectAtLineColumn(line: Long, column: Long): Rect2i {
    TransferContext.writeArguments(LONG to line, LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_RECT_AT_LINE_COLUMN,
        RECT2I)
    return TransferContext.readReturnValue(RECT2I, false) as Rect2i
  }

  /**
   * Returns the equivalent minimap line at `position`
   */
  public open fun getMinimapLineAtPos(position: Vector2i): Long {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_MINIMAP_LINE_AT_POS,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if the user is dragging their mouse for scrolling or selecting.
   */
  public open fun isDraggingCursor(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_DRAGGING_CURSOR, BOOL)
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
   * Returns `true` if the caret is visible on the screen.
   */
  public open fun isCaretVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_CARET_VISIBLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the caret pixel draw position.
   */
  public open fun getCaretDrawPos(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_CARET_DRAW_POS,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Moves the caret to the specified `line` index.
   *
   * If `adjust_viewport` is `true`, the viewport will center at the caret position after the move occurs.
   *
   * If `can_be_hidden` is `true`, the specified `line` can be hidden.
   */
  public open fun setCaretLine(
    line: Long,
    adjustViewport: Boolean = true,
    canBeHidden: Boolean = true,
    wrapIndex: Long = 0
  ): Unit {
    TransferContext.writeArguments(LONG to line, BOOL to adjustViewport, BOOL to canBeHidden, LONG
        to wrapIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_CARET_LINE, NIL)
  }

  /**
   * Returns the line the editing caret is on.
   */
  public open fun getCaretLine(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_CARET_LINE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Moves the caret to the specified `column` index.
   *
   * If `adjust_viewport` is `true`, the viewport will center at the caret position after the move occurs.
   */
  public open fun setCaretColumn(column: Long, adjustViewport: Boolean = true): Unit {
    TransferContext.writeArguments(LONG to column, BOOL to adjustViewport)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_CARET_COLUMN, NIL)
  }

  /**
   * Returns the column the editing caret is at.
   */
  public open fun getCaretColumn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_CARET_COLUMN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the wrap index the editing caret is on.
   */
  public open fun getCaretWrapIndex(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_CARET_WRAP_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a [godot.String] text with the word under the caret's location.
   */
  public open fun getWordUnderCaret(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_WORD_UNDER_CARET,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets the current selection mode.
   */
  public open fun setSelectionMode(
    mode: TextEdit.SelectionMode,
    line: Long = -1,
    column: Long = -1
  ): Unit {
    TransferContext.writeArguments(LONG to mode.id, LONG to line, LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_SELECTION_MODE, NIL)
  }

  /**
   * Returns the current selection mode.
   */
  public open fun getSelectionMode(): TextEdit.SelectionMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_MODE, LONG)
    return TextEdit.SelectionMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
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
   * Selects the word under the caret.
   */
  public open fun selectWordUnderCaret(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SELECT_WORD_UNDER_CARET,
        NIL)
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
   * Returns `true` if the user has selected text.
   */
  public open fun hasSelection(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_HAS_SELECTION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the text inside the selection.
   */
  public open fun getSelectedText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTED_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the original start line of the selection.
   */
  public open fun getSelectionLine(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_LINE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the original start column of the selection.
   */
  public open fun getSelectionColumn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_COLUMN, LONG)
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
   * Returns the selection begin column.
   */
  public open fun getSelectionFromColumn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_FROM_COLUMN,
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
   * Returns the selection end column.
   */
  public open fun getSelectionToColumn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SELECTION_TO_COLUMN,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Deselects the current selection.
   */
  public open fun deselect(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_DESELECT, NIL)
  }

  /**
   * Deletes the selected text.
   */
  public open fun deleteSelection(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_DELETE_SELECTION, NIL)
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
   * Returns the number of times the given line is wrapped.
   */
  public open fun getLineWrapCount(line: Long): Long {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_WRAP_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the wrap index of the given line column.
   */
  public open fun getLineWrapIndexAtColumn(line: Long, column: Long): Long {
    TransferContext.writeArguments(LONG to line, LONG to column)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_WRAP_INDEX_AT_COLUMN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns an array of [godot.String]s representing each wrapped index.
   */
  public open fun getLineWrappedText(line: Long): PackedStringArray {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_WRAPPED_TEXT,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns the scroll position for `wrap_index` of `line`.
   */
  public open fun getScrollPosForLine(line: Long, wrapIndex: Long = 0): Double {
    TransferContext.writeArguments(LONG to line, LONG to wrapIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_SCROLL_POS_FOR_LINE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Positions the `wrap_index` of `line` at the top of the viewport.
   */
  public open fun setLineAsFirstVisible(line: Long, wrapIndex: Long = 0): Unit {
    TransferContext.writeArguments(LONG to line, LONG to wrapIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_AS_FIRST_VISIBLE,
        NIL)
  }

  /**
   * Returns the first visible line.
   */
  public open fun getFirstVisibleLine(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_FIRST_VISIBLE_LINE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Positions the `wrap_index` of `line` at the center of the viewport.
   */
  public open fun setLineAsCenterVisible(line: Long, wrapIndex: Long = 0): Unit {
    TransferContext.writeArguments(LONG to line, LONG to wrapIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_AS_CENTER_VISIBLE,
        NIL)
  }

  /**
   * Positions the `wrap_index` of `line` at the bottom of the viewport.
   */
  public open fun setLineAsLastVisible(line: Long, wrapIndex: Long = 0): Unit {
    TransferContext.writeArguments(LONG to line, LONG to wrapIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_AS_LAST_VISIBLE,
        NIL)
  }

  /**
   * Returns the last visible line. Use [getLastFullVisibleLineWrapIndex] for the wrap index.
   */
  public open fun getLastFullVisibleLine(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LAST_FULL_VISIBLE_LINE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the last visible wrap index of the last visible line.
   */
  public open fun getLastFullVisibleLineWrapIndex(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LAST_FULL_VISIBLE_LINE_WRAP_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of visible lines, including wrapped text.
   */
  public open fun getVisibleLineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_VISIBLE_LINE_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the total number of visible + wrapped lines between the two lines.
   */
  public open fun getVisibleLineCountInRange(fromLine: Long, toLine: Long): Long {
    TransferContext.writeArguments(LONG to fromLine, LONG to toLine)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_VISIBLE_LINE_COUNT_IN_RANGE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the total amount of lines that could be draw.
   */
  public open fun getTotalVisibleLineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_TOTAL_VISIBLE_LINE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adjust the viewport so the caret is visible.
   */
  public open fun adjustViewportToCaret(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_ADJUST_VIEWPORT_TO_CARET,
        NIL)
  }

  /**
   * Centers the viewport on the line the editing caret is at. This also resets the [scrollHorizontal] value to `0`.
   */
  public open fun centerViewportToCaret(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_CENTER_VIEWPORT_TO_CARET,
        NIL)
  }

  /**
   * Returns the total amount of lines that can be draw on the minimap.
   */
  public open fun getMinimapVisibleLines(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_MINIMAP_VISIBLE_LINES,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Register a new gutter to this [godot.TextEdit]. Use `at` to have a specific gutter order. A value of `-1` appends the gutter to the right.
   */
  public open fun addGutter(at: Long = -1): Unit {
    TransferContext.writeArguments(LONG to at)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_ADD_GUTTER, NIL)
  }

  /**
   * Removes the gutter from this [godot.TextEdit].
   */
  public open fun removeGutter(gutter: Long): Unit {
    TransferContext.writeArguments(LONG to gutter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_REMOVE_GUTTER, NIL)
  }

  /**
   * Returns the total amount of gutters registered.
   */
  public open fun getGutterCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_GUTTER_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the name of the gutter.
   */
  public open fun setGutterName(gutter: Long, name: String): Unit {
    TransferContext.writeArguments(LONG to gutter, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_GUTTER_NAME, NIL)
  }

  /**
   * Returns the name of the gutter at the given index.
   */
  public open fun getGutterName(gutter: Long): String {
    TransferContext.writeArguments(LONG to gutter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_GUTTER_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets the type of gutter.
   */
  public open fun setGutterType(gutter: Long, type: TextEdit.GutterType): Unit {
    TransferContext.writeArguments(LONG to gutter, LONG to type.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_GUTTER_TYPE, NIL)
  }

  /**
   * Returns the type of the gutter at the given index.
   */
  public open fun getGutterType(gutter: Long): TextEdit.GutterType {
    TransferContext.writeArguments(LONG to gutter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_GUTTER_TYPE, LONG)
    return TextEdit.GutterType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Set the width of the gutter.
   */
  public open fun setGutterWidth(gutter: Long, width: Long): Unit {
    TransferContext.writeArguments(LONG to gutter, LONG to width)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_GUTTER_WIDTH, NIL)
  }

  /**
   * Returns the width of the gutter at the given index.
   */
  public open fun getGutterWidth(gutter: Long): Long {
    TransferContext.writeArguments(LONG to gutter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_GUTTER_WIDTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets whether the gutter should be drawn.
   */
  public open fun setGutterDraw(gutter: Long, draw: Boolean): Unit {
    TransferContext.writeArguments(LONG to gutter, BOOL to draw)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_GUTTER_DRAW, NIL)
  }

  /**
   * Returns whether the gutter is currently drawn.
   */
  public open fun isGutterDrawn(gutter: Long): Boolean {
    TransferContext.writeArguments(LONG to gutter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_GUTTER_DRAWN, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the gutter as clickable. This will change the mouse cursor to a pointing hand when hovering over the gutter.
   */
  public open fun setGutterClickable(gutter: Long, clickable: Boolean): Unit {
    TransferContext.writeArguments(LONG to gutter, BOOL to clickable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_GUTTER_CLICKABLE, NIL)
  }

  /**
   * Returns whether the gutter is clickable.
   */
  public open fun isGutterClickable(gutter: Long): Boolean {
    TransferContext.writeArguments(LONG to gutter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_GUTTER_CLICKABLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the gutter to overwritable. See [mergeGutters].
   */
  public open fun setGutterOverwritable(gutter: Long, overwritable: Boolean): Unit {
    TransferContext.writeArguments(LONG to gutter, BOOL to overwritable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_GUTTER_OVERWRITABLE,
        NIL)
  }

  /**
   * Returns whether the gutter is overwritable.
   */
  public open fun isGutterOverwritable(gutter: Long): Boolean {
    TransferContext.writeArguments(LONG to gutter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_GUTTER_OVERWRITABLE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Merge the gutters from `from_line` into `to_line`. Only overwritable gutters will be copied.
   */
  public open fun mergeGutters(fromLine: Long, toLine: Long): Unit {
    TransferContext.writeArguments(LONG to fromLine, LONG to toLine)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_MERGE_GUTTERS, NIL)
  }

  /**
   * Set a custom draw method for the gutter. The callback method must take the following args: `line: int, gutter: int, Area: Rect2`.
   */
  public open fun setGutterCustomDraw(column: Long, drawCallback: Callable): Unit {
    TransferContext.writeArguments(LONG to column, CALLABLE to drawCallback)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_GUTTER_CUSTOM_DRAW,
        NIL)
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
   * Sets the metadata for `gutter` on `line`.
   */
  public open fun setLineGutterMetadata(
    line: Long,
    gutter: Long,
    metadata: Any
  ): Unit {
    TransferContext.writeArguments(LONG to line, LONG to gutter, ANY to metadata)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_GUTTER_METADATA,
        NIL)
  }

  /**
   * Returns the metadata currently in `gutter` at `line`.
   */
  public open fun getLineGutterMetadata(line: Long, gutter: Long): Any? {
    TransferContext.writeArguments(LONG to line, LONG to gutter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_GUTTER_METADATA,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Sets the text for `gutter` on `line`.
   */
  public open fun setLineGutterText(
    line: Long,
    gutter: Long,
    text: String
  ): Unit {
    TransferContext.writeArguments(LONG to line, LONG to gutter, STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_GUTTER_TEXT, NIL)
  }

  /**
   * Returns the text currently in `gutter` at `line`.
   */
  public open fun getLineGutterText(line: Long, gutter: Long): String {
    TransferContext.writeArguments(LONG to line, LONG to gutter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_GUTTER_TEXT,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets the icon for `gutter` on `line`.
   */
  public open fun setLineGutterIcon(
    line: Long,
    gutter: Long,
    icon: Texture2D
  ): Unit {
    TransferContext.writeArguments(LONG to line, LONG to gutter, OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_GUTTER_ICON, NIL)
  }

  /**
   * Returns the icon currently in `gutter` at `line`.
   */
  public open fun getLineGutterIcon(line: Long, gutter: Long): Texture2D? {
    TransferContext.writeArguments(LONG to line, LONG to gutter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_GUTTER_ICON,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  /**
   * Sets the color for `gutter` on `line`.
   */
  public open fun setLineGutterItemColor(
    line: Long,
    gutter: Long,
    color: Color
  ): Unit {
    TransferContext.writeArguments(LONG to line, LONG to gutter, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_GUTTER_ITEM_COLOR,
        NIL)
  }

  /**
   * Returns the color currently in `gutter` at `line`.
   */
  public open fun getLineGutterItemColor(line: Long, gutter: Long): Color {
    TransferContext.writeArguments(LONG to line, LONG to gutter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_GUTTER_ITEM_COLOR,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Sets the `gutter` on `line` as clickable.
   */
  public open fun setLineGutterClickable(
    line: Long,
    gutter: Long,
    clickable: Boolean
  ): Unit {
    TransferContext.writeArguments(LONG to line, LONG to gutter, BOOL to clickable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_GUTTER_CLICKABLE,
        NIL)
  }

  /**
   * Returns whether the gutter on the given line is clickable.
   */
  public open fun isLineGutterClickable(line: Long, gutter: Long): Boolean {
    TransferContext.writeArguments(LONG to line, LONG to gutter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_LINE_GUTTER_CLICKABLE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the current background color of the line. Set to `Color(0, 0, 0, 0)` for no color.
   */
  public open fun setLineBackgroundColor(line: Long, color: Color): Unit {
    TransferContext.writeArguments(LONG to line, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_SET_LINE_BACKGROUND_COLOR,
        NIL)
  }

  /**
   * Returns the current background color of the line. `Color(0, 0, 0, 0)` is returned if no color is set.
   */
  public open fun getLineBackgroundColor(line: Long): Color {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_LINE_BACKGROUND_COLOR,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the [godot.PopupMenu] of this [godot.TextEdit]. By default, this menu is displayed when right-clicking on the [godot.TextEdit].
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.Window.visible] property.
   */
  public open fun getMenu(): PopupMenu? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_GET_MENU, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PopupMenu?
  }

  /**
   * Returns whether the menu is visible. Use this instead of `get_menu().visible` to improve performance (so the creation of the menu is avoided).
   */
  public open fun isMenuVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_IS_MENU_VISIBLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Triggers a right-click menu action by the specified index. See [enum MenuItems] for a list of available indexes.
   */
  public open fun menuOption(option: Long): Unit {
    TransferContext.writeArguments(LONG to option)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTEDIT_MENU_OPTION, NIL)
  }

  public enum class SelectionMode(
    id: Long
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
     * Select whole lines as if the user tripped clicked.
     */
    SELECTION_MODE_LINE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
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

  public enum class GutterType(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class LineWrappingMode(
    id: Long
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

  public enum class CaretType(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
