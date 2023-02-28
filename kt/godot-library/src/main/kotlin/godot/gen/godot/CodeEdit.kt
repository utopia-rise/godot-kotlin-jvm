// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.PackedInt32Array
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
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal3
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Multiline text control intended for editing code.
 *
 * CodeEdit is a specialized [godot.TextEdit] designed for editing plain text code files. It contains a bunch of features commonly found in code editors such as line numbers, line folding, code completion, indent management and string / comment management.
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
   * Emitted when the user has clicked on a valid symbol.
   */
  public val symbolLookup: Signal3<String, Long, Long> by signal("symbol", "line", "column")

  /**
   * Emitted when the user hovers over a symbol. The symbol should be validated and responded to, by calling [setSymbolLookupWordAsValid].
   */
  public val symbolValidate: Signal1<String> by signal("symbol")

  /**
   * Set when a validated word from [symbolValidate] is clicked, the [symbolLookup] should be emitted.
   */
  public var symbolLookupOnClick: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_SYMBOL_LOOKUP_ON_CLICK_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_SYMBOL_LOOKUP_ON_CLICK_ENABLED, NIL)
    }

  /**
   * Sets whether line folding is allowed.
   */
  public var lineFolding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_LINE_FOLDING_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_LINE_FOLDING_ENABLED,
          NIL)
    }

  /**
   * Draws vertical lines at the provided columns. The first entry is considered a main hard guideline and is draw more prominently.
   */
  public var lineLengthGuidelines: VariantArray<Long>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_LINE_LENGTH_GUIDELINES, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Long>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_LINE_LENGTH_GUIDELINES, NIL)
    }

  /**
   * Sets if breakpoints should be drawn in the gutter. This gutter is shared with bookmarks and executing lines.
   */
  public var guttersDrawBreakpointsGutter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_DRAWING_BREAKPOINTS_GUTTER, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_DRAW_BREAKPOINTS_GUTTER, NIL)
    }

  /**
   * Sets if bookmarked should be drawn in the gutter. This gutter is shared with breakpoints and executing lines.
   */
  public var guttersDrawBookmarks: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_DRAWING_BOOKMARKS_GUTTER, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_DRAW_BOOKMARKS_GUTTER, NIL)
    }

  /**
   * Sets if executing lines should be marked in the gutter. This gutter is shared with breakpoints and bookmarks lines.
   */
  public var guttersDrawExecutingLines: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_DRAWING_EXECUTING_LINES_GUTTER, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_DRAW_EXECUTING_LINES_GUTTER, NIL)
    }

  /**
   * Sets if line numbers should be drawn in the gutter.
   */
  public var guttersDrawLineNumbers: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_DRAW_LINE_NUMBERS_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_DRAW_LINE_NUMBERS,
          NIL)
    }

  /**
   * Sets if line numbers drawn in the gutter are zero padded.
   */
  public var guttersZeroPadLineNumbers: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_LINE_NUMBERS_ZERO_PADDED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_LINE_NUMBERS_ZERO_PADDED, NIL)
    }

  /**
   * Sets if foldable lines icons should be drawn in the gutter.
   */
  public var guttersDrawFoldGutter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_DRAWING_FOLD_GUTTER,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_DRAW_FOLD_GUTTER,
          NIL)
    }

  /**
   * Sets the string delimiters. All existing string delimiters will be removed.
   */
  public var delimiterStrings: VariantArray<String>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_STRING_DELIMITERS,
          ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<String>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_STRING_DELIMITERS,
          NIL)
    }

  /**
   * Sets the comment delimiters. All existing comment delimiters will be removed.
   */
  public var delimiterComments: VariantArray<String>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_COMMENT_DELIMITERS,
          ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<String>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_COMMENT_DELIMITERS,
          NIL)
    }

  /**
   * Sets whether code completion is allowed.
   */
  public var codeCompletionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_CODE_COMPLETION_ENABLED, BOOL)
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
  public var codeCompletionPrefixes: VariantArray<String>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_CODE_COMPLETION_PREFIXES, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<String>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_CODE_COMPLETION_PREFIXES, NIL)
    }

  /**
   * Size of tabs, if `indent_use_spaces` is enabled the number of spaces to use.
   */
  public var indentSize: Long
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
  public var indentUseSpaces: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_INDENT_USING_SPACES,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_INDENT_USING_SPACES,
          NIL)
    }

  /**
   * Sets whether automatic indent are enabled, this will add an extra indent if a prefix or brace is found.
   */
  public var indentAutomatic: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_AUTO_INDENT_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_AUTO_INDENT_ENABLED,
          NIL)
    }

  /**
   * Prefixes to trigger an automatic indent.
   */
  public var indentAutomaticPrefixes: VariantArray<String>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_AUTO_INDENT_PREFIXES,
          ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<String>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_AUTO_INDENT_PREFIXES,
          NIL)
    }

  /**
   * Sets whether brace pairs should be autocompleted.
   */
  public var autoBraceCompletionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_AUTO_BRACE_COMPLETION_ENABLED, BOOL)
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
  public var autoBraceCompletionHighlightMatching: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_HIGHLIGHT_MATCHING_BRACES_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_HIGHLIGHT_MATCHING_BRACES_ENABLED, NIL)
    }

  /**
   * Sets the brace pairs to be autocompleted.
   */
  public var autoBraceCompletionPairs: Dictionary<Any?, Any?>
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

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CODEEDIT, scriptIndex)
    return true
  }

  /**
   * Override this method to define how the selected entry should be inserted. If [replace] is true, any existing text should be replaced.
   */
  public open fun _confirmCodeCompletion(replace: Boolean): Unit {
  }

  /**
   * Override this method to define what happens when the user requests code completion. If [force] is true, any checks should be bypassed.
   */
  public open fun _requestCodeCompletion(force: Boolean): Unit {
  }

  /**
   * Override this method to define what items in [candidates] should be displayed.
   *
   * Both [candidates] and the return is a [godot.Array] of [godot.core.Dictionary], see [getCodeCompletionOption] for [godot.core.Dictionary] content.
   */
  public open fun _filterCodeCompletionCandidates(candidates: VariantArray<Dictionary<Any?, Any?>>):
      VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_filter_code_completion_candidates is not implemented for CodeEdit")
  }

  /**
   * Perform an indent as if the user activated the "ui_text_indent" action.
   */
  public fun doIndent(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_DO_INDENT, NIL)
  }

  /**
   * Indents selected lines, or in the case of no selection the caret line by one.
   */
  public fun indentLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_INDENT_LINES, NIL)
  }

  /**
   * Unindents selected lines, or in the case of no selection the caret line by one. Same as performing "ui_text_unindent" action.
   */
  public fun unindentLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_UNINDENT_LINES, NIL)
  }

  /**
   * Adds a brace pair.
   *
   * Both the start and end keys must be symbols. Only the start key has to be unique.
   */
  public fun addAutoBraceCompletionPair(startKey: String, endKey: String): Unit {
    TransferContext.writeArguments(STRING to startKey, STRING to endKey)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEEDIT_ADD_AUTO_BRACE_COMPLETION_PAIR, NIL)
  }

  /**
   * Returns `true` if open key [openKey] exists.
   */
  public fun hasAutoBraceCompletionOpenKey(openKey: String): Boolean {
    TransferContext.writeArguments(STRING to openKey)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEEDIT_HAS_AUTO_BRACE_COMPLETION_OPEN_KEY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if close key [closeKey] exists.
   */
  public fun hasAutoBraceCompletionCloseKey(closeKey: String): Boolean {
    TransferContext.writeArguments(STRING to closeKey)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEEDIT_HAS_AUTO_BRACE_COMPLETION_CLOSE_KEY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Gets the matching auto brace close key for [openKey].
   */
  public fun getAutoBraceCompletionCloseKey(openKey: String): String {
    TransferContext.writeArguments(STRING to openKey)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_AUTO_BRACE_COMPLETION_CLOSE_KEY, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets the line as breakpointed.
   */
  public fun setLineAsBreakpoint(line: Long, breakpointed: Boolean): Unit {
    TransferContext.writeArguments(LONG to line, BOOL to breakpointed)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_LINE_AS_BREAKPOINT,
        NIL)
  }

  /**
   * Returns whether the line at the specified index is breakpointed or not.
   */
  public fun isLineBreakpointed(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_LINE_BREAKPOINTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Clears all breakpointed lines.
   */
  public fun clearBreakpointedLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_CLEAR_BREAKPOINTED_LINES,
        NIL)
  }

  /**
   * Gets all breakpointed lines.
   */
  public fun getBreakpointedLines(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_BREAKPOINTED_LINES,
        PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   * Sets the line as bookmarked.
   */
  public fun setLineAsBookmarked(line: Long, bookmarked: Boolean): Unit {
    TransferContext.writeArguments(LONG to line, BOOL to bookmarked)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_LINE_AS_BOOKMARKED,
        NIL)
  }

  /**
   * Returns whether the line at the specified index is bookmarked or not.
   */
  public fun isLineBookmarked(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_LINE_BOOKMARKED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Clears all bookmarked lines.
   */
  public fun clearBookmarkedLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_CLEAR_BOOKMARKED_LINES,
        NIL)
  }

  /**
   * Gets all bookmarked lines.
   */
  public fun getBookmarkedLines(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_BOOKMARKED_LINES,
        PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   * Sets the line as executing.
   */
  public fun setLineAsExecuting(line: Long, executing: Boolean): Unit {
    TransferContext.writeArguments(LONG to line, BOOL to executing)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_LINE_AS_EXECUTING, NIL)
  }

  /**
   * Returns whether the line at the specified index is marked as executing or not.
   */
  public fun isLineExecuting(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_LINE_EXECUTING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Clears all executed lines.
   */
  public fun clearExecutingLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_CLEAR_EXECUTING_LINES, NIL)
  }

  /**
   * Gets all executing lines.
   */
  public fun getExecutingLines(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_EXECUTING_LINES,
        PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   * Returns if the given line is foldable, that is, it has indented lines right below it or a comment / string block.
   */
  public fun canFoldLine(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_CAN_FOLD_LINE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Folds the given line, if possible (see [canFoldLine]).
   */
  public fun foldLine(line: Long): Unit {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_FOLD_LINE, NIL)
  }

  /**
   * Unfolds all lines that were previously folded.
   */
  public fun unfoldLine(line: Long): Unit {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_UNFOLD_LINE, NIL)
  }

  /**
   * Folds all lines that are possible to be folded (see [canFoldLine]).
   */
  public fun foldAllLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_FOLD_ALL_LINES, NIL)
  }

  /**
   * Unfolds all lines, folded or not.
   */
  public fun unfoldAllLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_UNFOLD_ALL_LINES, NIL)
  }

  /**
   * Toggle the folding of the code block at the given line.
   */
  public fun toggleFoldableLine(line: Long): Unit {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_TOGGLE_FOLDABLE_LINE, NIL)
  }

  /**
   * Returns whether the line at the specified index is folded or not.
   */
  public fun isLineFolded(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_LINE_FOLDED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns all lines that are current folded.
   */
  public fun getFoldedLines(): VariantArray<Long> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_FOLDED_LINES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Long>
  }

  /**
   * Adds a string delimiter.
   *
   * Both the start and end keys must be symbols. Only the start key has to be unique.
   *
   * [lineOnly] denotes if the region should continue until the end of the line or carry over on to the next line. If the end key is blank this is automatically set to `true`.
   */
  public fun addStringDelimiter(
    startKey: String,
    endKey: String,
    lineOnly: Boolean = false
  ): Unit {
    TransferContext.writeArguments(STRING to startKey, STRING to endKey, BOOL to lineOnly)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_ADD_STRING_DELIMITER, NIL)
  }

  /**
   * Removes the string delimiter with [startKey].
   */
  public fun removeStringDelimiter(startKey: String): Unit {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_REMOVE_STRING_DELIMITER,
        NIL)
  }

  /**
   * Returns `true` if string [startKey] exists.
   */
  public fun hasStringDelimiter(startKey: String): Boolean {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_HAS_STRING_DELIMITER, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes all string delimiters.
   */
  public fun clearStringDelimiters(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_CLEAR_STRING_DELIMITERS,
        NIL)
  }

  /**
   * Returns the delimiter index if [line] [column] is in a string. If [column] is not provided, will return the delimiter index if the entire [line] is a string. Otherwise `-1`.
   */
  public fun isInString(line: Long, column: Long = -1): Long {
    TransferContext.writeArguments(LONG to line, LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_IN_STRING, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a comment delimiter.
   *
   * Both the start and end keys must be symbols. Only the start key has to be unique.
   *
   * [lineOnly] denotes if the region should continue until the end of the line or carry over on to the next line. If the end key is blank this is automatically set to `true`.
   */
  public fun addCommentDelimiter(
    startKey: String,
    endKey: String,
    lineOnly: Boolean = false
  ): Unit {
    TransferContext.writeArguments(STRING to startKey, STRING to endKey, BOOL to lineOnly)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_ADD_COMMENT_DELIMITER, NIL)
  }

  /**
   * Removes the comment delimiter with [startKey].
   */
  public fun removeCommentDelimiter(startKey: String): Unit {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_REMOVE_COMMENT_DELIMITER,
        NIL)
  }

  /**
   * Returns `true` if comment [startKey] exists.
   */
  public fun hasCommentDelimiter(startKey: String): Boolean {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_HAS_COMMENT_DELIMITER,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes all comment delimiters.
   */
  public fun clearCommentDelimiters(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_CLEAR_COMMENT_DELIMITERS,
        NIL)
  }

  /**
   * Returns delimiter index if [line] [column] is in a comment. If [column] is not provided, will return delimiter index if the entire [line] is a comment. Otherwise `-1`.
   */
  public fun isInComment(line: Long, column: Long = -1): Long {
    TransferContext.writeArguments(LONG to line, LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_IS_IN_COMMENT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets the start key for a string or comment region index.
   */
  public fun getDelimiterStartKey(delimiterIndex: Long): String {
    TransferContext.writeArguments(LONG to delimiterIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_DELIMITER_START_KEY,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Gets the end key for a string or comment region index.
   */
  public fun getDelimiterEndKey(delimiterIndex: Long): String {
    TransferContext.writeArguments(LONG to delimiterIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_DELIMITER_END_KEY,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * If [line] [column] is in a string or comment, returns the start position of the region. If not or no start could be found, both [godot.core.Vector2] values will be `-1`.
   */
  public fun getDelimiterStartPosition(line: Long, column: Long): Vector2 {
    TransferContext.writeArguments(LONG to line, LONG to column)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_DELIMITER_START_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * If [line] [column] is in a string or comment, returns the end position of the region. If not or no end could be found, both [godot.core.Vector2] values will be `-1`.
   */
  public fun getDelimiterEndPosition(line: Long, column: Long): Vector2 {
    TransferContext.writeArguments(LONG to line, LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_DELIMITER_END_POSITION,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Sets the code hint text. Pass an empty string to clear.
   */
  public fun setCodeHint(codeHint: String): Unit {
    TransferContext.writeArguments(STRING to codeHint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_CODE_HINT, NIL)
  }

  /**
   * Sets if the code hint should draw below the text.
   */
  public fun setCodeHintDrawBelow(drawBelow: Boolean): Unit {
    TransferContext.writeArguments(BOOL to drawBelow)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_CODE_HINT_DRAW_BELOW,
        NIL)
  }

  /**
   * Returns the full text with char `0xFFFF` at the caret location.
   */
  public fun getTextForCodeCompletion(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_TEXT_FOR_CODE_COMPLETION, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Emits [codeCompletionRequested], if [force] is true will bypass all checks. Otherwise will check that the caret is in a word or in front of a prefix. Will ignore the request if all current options are of type file path, node path or signal.
   */
  public fun requestCodeCompletion(force: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to force)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_REQUEST_CODE_COMPLETION,
        NIL)
  }

  /**
   * Submits an item to the queue of potential candidates for the autocomplete menu. Call [updateCodeCompletionOptions] to update the list.
   *
   * **Note:** This list will replace all current candidates.
   */
  public fun addCodeCompletionOption(
    type: CodeCompletionKind,
    displayText: String,
    insertText: String,
    textColor: Color = Color(Color(1, 1, 1, 1)),
    icon: Resource? = null,
    `value`: Any = 0
  ): Unit {
    TransferContext.writeArguments(LONG to type.id, STRING to displayText, STRING to insertText, COLOR to textColor, OBJECT to icon, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_ADD_CODE_COMPLETION_OPTION,
        NIL)
  }

  /**
   * Submits all completion options added with [addCodeCompletionOption]. Will try to force the autoccomplete menu to popup, if [force] is `true`.
   *
   * **Note:** This will replace all current candidates.
   */
  public fun updateCodeCompletionOptions(force: Boolean): Unit {
    TransferContext.writeArguments(BOOL to force)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEEDIT_UPDATE_CODE_COMPLETION_OPTIONS, NIL)
  }

  /**
   * Gets all completion options, see [getCodeCompletionOption] for return content.
   */
  public fun getCodeCompletionOptions(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_CODE_COMPLETION_OPTIONS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>
  }

  /**
   * Gets the completion option at [index]. The return [godot.core.Dictionary] has the following key-values:
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
  public fun getCodeCompletionOption(index: Long): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_CODE_COMPLETION_OPTION,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Gets the index of the current selected completion option.
   */
  public fun getCodeCompletionSelectedIndex(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_CODE_COMPLETION_SELECTED_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the current selected completion option.
   */
  public fun setCodeCompletionSelectedIndex(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEEDIT_SET_CODE_COMPLETION_SELECTED_INDEX, NIL)
  }

  /**
   * Inserts the selected entry into the text. If [replace] is true, any existing text is replaced rather then merged.
   */
  public fun confirmCodeCompletion(replace: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to replace)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_CONFIRM_CODE_COMPLETION,
        NIL)
  }

  /**
   * Cancels the autocomplete menu.
   */
  public fun cancelCodeCompletion(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_CANCEL_CODE_COMPLETION,
        NIL)
  }

  /**
   * Returns the full text with char `0xFFFF` at the cursor location.
   */
  public fun getTextForSymbolLookup(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEEDIT_GET_TEXT_FOR_SYMBOL_LOOKUP,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets the symbol emitted by [symbolValidate] as a valid lookup.
   */
  public fun setSymbolLookupWordAsValid(valid: Boolean): Unit {
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
