// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.PackedInt32Array
import godot.core.PackedStringArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal3
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Multiline text control intended for editing code.
 *
 * CodeEdit is a specialised [godot.TextEdit] designed for editing plain text code files. It contains a bunch of features commonly found in code editors such as line numbers, line folding, code completion, indent management and string / comment management.
 *
 * **Note:** By default [godot.CodeEdit] always use left-to-right text direction to correctly display source code.
 */
@GodotBaseType
public open class CodeEdit : TextEdit() {
  /**
   * Emitted when a breakpoint is added or removed from a line. If the line is moved via backspace a removed is emitted at the old line.
   */
  public val breakpointToggled: Signal1<Long> by signal("line")

  /**
   * Emitted when the user requests code completion.
   */
  public val codeCompletionRequested: Signal0 by signal()

  /**
   * Emitted when the user hovers over a symbol. The symbol should be validated and responded to, by calling [setSymbolLookupWordAsValid].
   */
  public val symbolValidate: Signal1<String> by signal("symbol")

  /**
   * Emitted when the user has clicked on a valid symbol.
   */
  public val symbolLookup: Signal3<String, Long, Long> by signal("symbol", "line", "column")

  /**
   * Set when a validated word from [symbolValidate] is clicked, the [symbolLookup] should be emitted.
   */
  public open var symbolLookupOnClick: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_SYMBOL_LOOKUP_ON_CLICK, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_SYMBOL_LOOKUP_ON_CLICK, NIL)
    }

  /**
   * Sets whether line folding is allowed.
   */
  public open var lineFolding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_LINE_FOLDING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_LINE_FOLDING, NIL)
    }

  /**
   * Draws vertical lines at the provided columns. The first entry is considered a main hard guideline and is draw more prominently
   */
  public open var lineLengthGuidelines: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_LINE_LENGTH_GUIDELINES, PACKED_INT_32_ARRAY)
      return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_LINE_LENGTH_GUIDELINES, NIL)
    }

  /**
   * Sets if breakpoints should be drawn in the gutter. This gutter is shared with bookmarks and executing lines.
   */
  public open var guttersDrawBreakpointsGutter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_GUTTERS_DRAW_BREAKPOINTS_GUTTER, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_GUTTERS_DRAW_BREAKPOINTS_GUTTER, NIL)
    }

  /**
   * Sets if bookmarked should be drawn in the gutter. This gutter is shared with breakpoints and executing lines.
   */
  public open var guttersDrawBookmarks: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_GUTTERS_DRAW_BOOKMARKS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_GUTTERS_DRAW_BOOKMARKS, NIL)
    }

  /**
   * Sets if executing lines should be marked in the gutter. This gutter is shared with breakpoints and bookmarks lines.
   */
  public open var guttersDrawExecutingLines: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_GUTTERS_DRAW_EXECUTING_LINES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_GUTTERS_DRAW_EXECUTING_LINES, NIL)
    }

  /**
   * Sets if line numbers should be drawn in the gutter.
   */
  public open var guttersDrawLineNumbers: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_GUTTERS_DRAW_LINE_NUMBERS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_GUTTERS_DRAW_LINE_NUMBERS, NIL)
    }

  /**
   * Sets if line numbers drawn in the gutter are zero padded.
   */
  public open var guttersZeroPadLineNumbers: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_GUTTERS_ZERO_PAD_LINE_NUMBERS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_GUTTERS_ZERO_PAD_LINE_NUMBERS, NIL)
    }

  /**
   * Sets if foldable lines icons should be drawn in the gutter.
   */
  public open var guttersDrawFoldGutter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_GUTTERS_DRAW_FOLD_GUTTER, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_GUTTERS_DRAW_FOLD_GUTTER, NIL)
    }

  /**
   * Sets the string delimiters. All existing string delimiters will be removed.
   */
  public open var delimiterStrings: PackedStringArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_DELIMITER_STRINGS,
          PACKED_STRING_ARRAY)
      return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_STRING_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_DELIMITER_STRINGS,
          NIL)
    }

  /**
   * Sets the comment delimiters. All existing comment delimiters will be removed.
   */
  public open var delimiterComments: PackedStringArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_DELIMITER_COMMENTS,
          PACKED_STRING_ARRAY)
      return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_STRING_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_DELIMITER_COMMENTS,
          NIL)
    }

  /**
   * Sets whether code completion is allowed.
   */
  public open var codeCompletionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_CODE_COMPLETION_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_CODE_COMPLETION_ENABLED, NIL)
    }

  /**
   * Sets prefixes that will trigger code completion.
   */
  public open var codeCompletionPrefixes: PackedStringArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_CODE_COMPLETION_PREFIXES, PACKED_STRING_ARRAY)
      return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_STRING_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_CODE_COMPLETION_PREFIXES, NIL)
    }

  /**
   * Size of tabs, if `indent_use_spaces` is enabled the amount of spaces to use.
   */
  public open var indentSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_INDENT_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_INDENT_SIZE, NIL)
    }

  /**
   * Use spaces instead of tabs for indentation.
   */
  public open var indentUseSpaces: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_INDENT_USE_SPACES,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_INDENT_USE_SPACES,
          NIL)
    }

  /**
   * Sets whether automatic indent are enabled, this will add an extra indent if a prefix or brace is found.
   */
  public open var indentAutomatic: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_INDENT_AUTOMATIC,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_INDENT_AUTOMATIC,
          NIL)
    }

  /**
   * Prefixes to trigger an automatic indent.
   */
  public open var indentAutomaticPrefixes: PackedStringArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_INDENT_AUTOMATIC_PREFIXES, PACKED_STRING_ARRAY)
      return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_STRING_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_INDENT_AUTOMATIC_PREFIXES, NIL)
    }

  /**
   * Sets whether brace pairs should be autocompleted.
   */
  public open var autoBraceCompletionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_AUTO_BRACE_COMPLETION_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_AUTO_BRACE_COMPLETION_ENABLED, NIL)
    }

  /**
   * Highlight mismatching brace pairs.
   */
  public open var autoBraceCompletionHighlightMatching: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_AUTO_BRACE_COMPLETION_HIGHLIGHT_MATCHING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_AUTO_BRACE_COMPLETION_HIGHLIGHT_MATCHING, NIL)
    }

  /**
   * Sets the brace pairs to be autocompleted.
   */
  public open var autoBraceCompletionPairs: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_AUTO_BRACE_COMPLETION_PAIRS, DICTIONARY)
      return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_AUTO_BRACE_COMPLETION_PAIRS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CODEEDIT)
  }

  /**
   * Override this method to define how the selected entry should be inserted. If `replace` is true, any existing text should be replaced.
   */
  public open fun _confirmCodeCompletion(replace: Boolean): Unit {
  }

  /**
   * Override this method to define what happens when the user requests code completion. If `force` is true, any checks should be bypassed.
   */
  public open fun _requestCodeCompletion(force: Boolean): Unit {
  }

  /**
   * Override this method to define what items in `candidates` should be displayed.
   *
   * Both `candidates` and the return is a [godot.Array] of [godot.core.Dictionary], see [getCodeCompletionOption] for [godot.core.Dictionary] content.
   */
  public open fun _filterCodeCompletionCandidates(candidates: VariantArray<Any?>):
      VariantArray<Any?> {
    throw NotImplementedError("_filter_code_completion_candidates is not implemented for CodeEdit")
  }

  /**
   * Perform an indent as if the user activated the "ui_text_indent" action.
   */
  public open fun doIndent(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_DO_INDENT, NIL)
  }

  /**
   * Perform an unindent as if the user activated the "ui_text_unindent" action.
   */
  public open fun doUnindent(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_DO_UNINDENT, NIL)
  }

  /**
   * Indents selected lines, or in the case of no selection the caret line by one.
   */
  public open fun indentLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_INDENT_LINES, NIL)
  }

  /**
   * Unindents selected lines, or in the case of no selection the caret line by one.
   */
  public open fun unindentLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_UNINDENT_LINES, NIL)
  }

  /**
   * Adds a brace pair.
   *
   * Both the start and end keys must be symbols. Only the start key has to be unique.
   */
  public open fun addAutoBraceCompletionPair(startKey: String, endKey: String): Unit {
    TransferContext.writeArguments(STRING to startKey, STRING to endKey)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEEDIT_ADD_AUTO_BRACE_COMPLETION_PAIR, NIL)
  }

  /**
   * Returns `true` if open key `open_key` exists.
   */
  public open fun hasAutoBraceCompletionOpenKey(openKey: String): Boolean {
    TransferContext.writeArguments(STRING to openKey)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEEDIT_HAS_AUTO_BRACE_COMPLETION_OPEN_KEY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if close key `close_key` exists.
   */
  public open fun hasAutoBraceCompletionCloseKey(closeKey: String): Boolean {
    TransferContext.writeArguments(STRING to closeKey)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEEDIT_HAS_AUTO_BRACE_COMPLETION_CLOSE_KEY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Gets the matching auto brace close key for `open_key`.
   */
  public open fun getAutoBraceCompletionCloseKey(openKey: String): String {
    TransferContext.writeArguments(STRING to openKey)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_AUTO_BRACE_COMPLETION_CLOSE_KEY, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets the line as breakpointed.
   */
  public open fun setLineAsBreakpoint(line: Long, breakpointed: Boolean): Unit {
    TransferContext.writeArguments(LONG to line, BOOL to breakpointed)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_LINE_AS_BREAKPOINT,
        NIL)
  }

  /**
   * Returns whether the line at the specified index is breakpointed or not.
   */
  public open fun isLineBreakpointed(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_LINE_BREAKPOINTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Clears all breakpointed lines.
   */
  public open fun clearBreakpointedLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_CLEAR_BREAKPOINTED_LINES,
        NIL)
  }

  /**
   * Gets all breakpointed lines.
   */
  public open fun getBreakpointedLines(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_BREAKPOINTED_LINES,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Sets the line as bookmarked.
   */
  public open fun setLineAsBookmarked(line: Long, bookmarked: Boolean): Unit {
    TransferContext.writeArguments(LONG to line, BOOL to bookmarked)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_LINE_AS_BOOKMARKED,
        NIL)
  }

  /**
   * Returns whether the line at the specified index is bookmarked or not.
   */
  public open fun isLineBookmarked(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_LINE_BOOKMARKED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Clears all bookmarked lines.
   */
  public open fun clearBookmarkedLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_CLEAR_BOOKMARKED_LINES,
        NIL)
  }

  /**
   * Gets all bookmarked lines.
   */
  public open fun getBookmarkedLines(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_BOOKMARKED_LINES,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Sets the line as executing.
   */
  public open fun setLineAsExecuting(line: Long, executing: Boolean): Unit {
    TransferContext.writeArguments(LONG to line, BOOL to executing)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_LINE_AS_EXECUTING, NIL)
  }

  /**
   * Returns whether the line at the specified index is marked as executing or not.
   */
  public open fun isLineExecuting(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_LINE_EXECUTING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Clears all executed lines.
   */
  public open fun clearExecutingLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_CLEAR_EXECUTING_LINES, NIL)
  }

  /**
   * Gets all executing lines.
   */
  public open fun getExecutingLines(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_EXECUTING_LINES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns if the given line is foldable, that is, it has indented lines right below it or a comment / string block.
   */
  public open fun canFoldLine(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_CAN_FOLD_LINE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Folds the given line, if possible (see [canFoldLine]).
   */
  public open fun foldLine(line: Long): Unit {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_FOLD_LINE, NIL)
  }

  /**
   * Unfolds all lines that were previously folded.
   */
  public open fun unfoldLine(line: Long): Unit {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_UNFOLD_LINE, NIL)
  }

  /**
   * Folds all lines that are possible to be folded (see [canFoldLine]).
   */
  public open fun foldAllLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_FOLD_ALL_LINES, NIL)
  }

  /**
   * Unfolds all lines, folded or not.
   */
  public open fun unfoldAllLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_UNFOLD_ALL_LINES, NIL)
  }

  /**
   * Toggle the folding of the code block at the given line.
   */
  public open fun toggleFoldableLine(line: Long): Unit {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_TOGGLE_FOLDABLE_LINE, NIL)
  }

  /**
   * Returns whether the line at the specified index is folded or not.
   */
  public open fun isLineFolded(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_LINE_FOLDED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns all lines that are current folded.
   */
  public open fun getFoldedLines(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_FOLDED_LINES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Adds a string delimiter.
   *
   * Both the start and end keys must be symbols. Only the start key has to be unique.
   *
   * Line only denotes if the region should continue until the end of the line or carry over on to the next line. If the end key is blank this is automatically set to `true`.
   */
  public open fun addStringDelimiter(
    startKey: String,
    endKey: String,
    lineOnly: Boolean = false
  ): Unit {
    TransferContext.writeArguments(STRING to startKey, STRING to endKey, BOOL to lineOnly)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_ADD_STRING_DELIMITER, NIL)
  }

  /**
   * Removes the string delimiter with `start_key`.
   */
  public open fun removeStringDelimiter(startKey: String): Unit {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_REMOVE_STRING_DELIMITER,
        NIL)
  }

  /**
   * Returns `true` if string `start_key` exists.
   */
  public open fun hasStringDelimiter(startKey: String): Boolean {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_HAS_STRING_DELIMITER, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes all string delimiters.
   */
  public open fun clearStringDelimiters(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_CLEAR_STRING_DELIMITERS,
        NIL)
  }

  /**
   * Returns the delimiter index if `line` `column` is in a string. If `column` is not provided, will return the delimiter index if the entire `line` is a string. Otherwise `-1`.
   */
  public open fun isInString(line: Long, column: Long = -1): Long {
    TransferContext.writeArguments(LONG to line, LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_IN_STRING, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a comment delimiter.
   *
   * Both the start and end keys must be symbols. Only the start key has to be unique.
   *
   * Line only denotes if the region should continue until the end of the line or carry over on to the next line. If the end key is blank this is automatically set to `true`.
   */
  public open fun addCommentDelimiter(
    startKey: String,
    endKey: String,
    lineOnly: Boolean = false
  ): Unit {
    TransferContext.writeArguments(STRING to startKey, STRING to endKey, BOOL to lineOnly)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_ADD_COMMENT_DELIMITER, NIL)
  }

  /**
   * Removes the comment delimiter with `start_key`.
   */
  public open fun removeCommentDelimiter(startKey: String): Unit {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_REMOVE_COMMENT_DELIMITER,
        NIL)
  }

  /**
   * Returns `true` if comment `start_key` exists.
   */
  public open fun hasCommentDelimiter(startKey: String): Boolean {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_HAS_COMMENT_DELIMITER,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes all comment delimiters.
   */
  public open fun clearCommentDelimiters(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_CLEAR_COMMENT_DELIMITERS,
        NIL)
  }

  /**
   * Returns delimiter index if `line` `column` is in a comment. If `column` is not provided, will return delimiter index if the entire `line` is a comment. Otherwise `-1`.
   */
  public open fun isInComment(line: Long, column: Long = -1): Long {
    TransferContext.writeArguments(LONG to line, LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_IN_COMMENT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets the start key for a string or comment region index.
   */
  public open fun getDelimiterStartKey(delimiterIndex: Long): String {
    TransferContext.writeArguments(LONG to delimiterIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_DELIMITER_START_KEY,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Gets the end key for a string or comment region index.
   */
  public open fun getDelimiterEndKey(delimiterIndex: Long): String {
    TransferContext.writeArguments(LONG to delimiterIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_DELIMITER_END_KEY,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * If `line` `column` is in a string or comment, returns the start position of the region. If not or no start could be found, both [godot.core.Vector2] values will be `-1`.
   */
  public open fun getDelimiterStartPosition(line: Long, column: Long): Vector2 {
    TransferContext.writeArguments(LONG to line, LONG to column)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_DELIMITER_START_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * If `line` `column` is in a string or comment, returns the end position of the region. If not or no end could be found, both [godot.core.Vector2] values will be `-1`.
   */
  public open fun getDelimiterEndPosition(line: Long, column: Long): Vector2 {
    TransferContext.writeArguments(LONG to line, LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_DELIMITER_END_POSITION,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Sets the code hint text. Pass an empty string to clear.
   */
  public open fun setCodeHint(codeHint: String): Unit {
    TransferContext.writeArguments(STRING to codeHint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_CODE_HINT, NIL)
  }

  /**
   * Sets if the code hint should draw below the text.
   */
  public open fun setCodeHintDrawBelow(drawBelow: Boolean): Unit {
    TransferContext.writeArguments(BOOL to drawBelow)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_CODE_HINT_DRAW_BELOW,
        NIL)
  }

  /**
   * Returns the full text with char `0xFFFF` at the caret location.
   */
  public open fun getTextForCodeCompletion(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_TEXT_FOR_CODE_COMPLETION, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Emits [codeCompletionRequested], if `force` is true will bypass all checks. Otherwise will check that the caret is in a word or in front of a prefix. Will ignore the request if all current options are of type file path, node path or signal.
   */
  public open fun requestCodeCompletion(force: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to force)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_REQUEST_CODE_COMPLETION,
        NIL)
  }

  /**
   * Submits an item to the queue of potential candidates for the autocomplete menu. Call [updateCodeCompletionOptions] to update the list.
   *
   * **Note:** This list will replace all current candidates.
   */
  public open fun addCodeCompletionOption(
    type: CodeEdit.CodeCompletionKind,
    displayText: String,
    insertText: String,
    textColor: Color = Color(Color(1, 1, 1, 1)),
    icon: Resource? = null,
    `value`: Any = Any(0)
  ): Unit {
    TransferContext.writeArguments(LONG to type.id, STRING to displayText, STRING to insertText,
        COLOR to textColor, OBJECT to icon, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_ADD_CODE_COMPLETION_OPTION,
        NIL)
  }

  /**
   * Submits all completion options added with [addCodeCompletionOption]. Will try to force the autoccomplete menu to popup, if `force` is `true`.
   *
   * **Note:** This will replace all current candidates.
   */
  public open fun updateCodeCompletionOptions(force: Boolean): Unit {
    TransferContext.writeArguments(BOOL to force)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEEDIT_UPDATE_CODE_COMPLETION_OPTIONS, NIL)
  }

  /**
   * Gets all completion options, see [getCodeCompletionOption] for return content.
   */
  public open fun getCodeCompletionOptions(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_CODE_COMPLETION_OPTIONS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Gets the completion option at `index`. The return [godot.core.Dictionary] has the following key-values:
   *
   * `kind`: [enum CodeCompletionKind]
   *
   * `display_text`: Text that is shown on the autocomplete menu.
   *
   * `insert_text`: Text that is to be inserted when this item is selected.
   *
   * `font_color`: Color of the text on the autocomplete menu.
   *
   * `icon`: Icon to draw on the autocomplete menu.
   *
   * `default_value`: Value of the symbol.
   */
  public open fun getCodeCompletionOption(index: Long): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_CODE_COMPLETION_OPTION,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Gets the index of the current selected completion option.
   */
  public open fun getCodeCompletionSelectedIndex(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_CODE_COMPLETION_SELECTED_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the current selected completion option.
   */
  public open fun setCodeCompletionSelectedIndex(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_CODE_COMPLETION_SELECTED_INDEX, NIL)
  }

  /**
   * Inserts the selected entry into the text. If `replace` is true, any existing text is replaced rather then merged.
   */
  public open fun confirmCodeCompletion(replace: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to replace)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_CONFIRM_CODE_COMPLETION,
        NIL)
  }

  /**
   * Cancels the autocomplete menu.
   */
  public open fun cancelCodeCompletion(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_CANCEL_CODE_COMPLETION,
        NIL)
  }

  /**
   * Returns the full text with char `0xFFFF` at the cursor location.
   */
  public open fun getTextForSymbolLookup(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_TEXT_FOR_SYMBOL_LOOKUP,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets the symbol emitted by [symbolValidate] as a valid lookup.
   */
  public open fun setSymbolLookupWordAsValid(valid: Boolean): Unit {
    TransferContext.writeArguments(BOOL to valid)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_SYMBOL_LOOKUP_WORD_AS_VALID, NIL)
  }

  public enum class CodeCompletionKind(
    id: Long
  ) {
    /**
     * Marks the option as a class.
     */
    KIND_CLASS(0),
    /**
     * Marks the option as a function.
     */
    KIND_FUNCTION(1),
    /**
     * Marks the option as a Godot signal.
     */
    KIND_SIGNAL(2),
    /**
     * Marks the option as a variable.
     */
    KIND_VARIABLE(3),
    /**
     * Marks the option as a member.
     */
    KIND_MEMBER(4),
    /**
     * Marks the option as a enum entry.
     */
    KIND_ENUM(5),
    /**
     * Marks the option as a constant.
     */
    KIND_CONSTANT(6),
    /**
     * Marks the option as a Godot node path.
     */
    KIND_NODE_PATH(7),
    /**
     * Marks the option as a file path.
     */
    KIND_FILE_PATH(8),
    /**
     * Marks the option as unclassified or plain text.
     */
    KIND_PLAIN_TEXT(9),
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
