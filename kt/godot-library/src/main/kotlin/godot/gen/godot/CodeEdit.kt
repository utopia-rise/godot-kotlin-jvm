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
import godot.core.TypeManager
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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * CodeEdit is a specialized [TextEdit] designed for editing plain text code files. It has many
 * features commonly found in code editors such as line numbers, line folding, code completion, indent
 * management, and string/comment management.
 * **Note:** Regardless of locale, [CodeEdit] will by default always use left-to-right text
 * direction to correctly display source code.
 */
@GodotBaseType
public open class CodeEdit : TextEdit() {
  /**
   * Emitted when a breakpoint is added or removed from a line. If the line is moved via backspace a
   * removed is emitted at the old line.
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
   * Emitted when the user hovers over a symbol. The symbol should be validated and responded to, by
   * calling [setSymbolLookupWordAsValid].
   */
  public val symbolValidate: Signal1<String> by signal("symbol")

  /**
   * Set when a validated word from [signal symbol_validate] is clicked, the [signal symbol_lookup]
   * should be emitted.
   */
  public var symbolLookupOnClick: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSymbolLookupOnClickEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSymbolLookupOnClickEnabledPtr, NIL)
    }

  /**
   * Sets whether line folding is allowed.
   */
  public var lineFolding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isLineFoldingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLineFoldingEnabledPtr, NIL)
    }

  /**
   * Draws vertical lines at the provided columns. The first entry is considered a main hard
   * guideline and is draw more prominently.
   */
  public var lineLengthGuidelines: VariantArray<Long>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLineLengthGuidelinesPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Long>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLineLengthGuidelinesPtr, NIL)
    }

  /**
   * Sets if breakpoints should be drawn in the gutter. This gutter is shared with bookmarks and
   * executing lines.
   */
  public var guttersDrawBreakpointsGutter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawingBreakpointsGutterPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawBreakpointsGutterPtr, NIL)
    }

  /**
   * Sets if bookmarked should be drawn in the gutter. This gutter is shared with breakpoints and
   * executing lines.
   */
  public var guttersDrawBookmarks: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawingBookmarksGutterPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawBookmarksGutterPtr, NIL)
    }

  /**
   * Sets if executing lines should be marked in the gutter. This gutter is shared with breakpoints
   * and bookmarks lines.
   */
  public var guttersDrawExecutingLines: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawingExecutingLinesGutterPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawExecutingLinesGutterPtr, NIL)
    }

  /**
   * Sets if line numbers should be drawn in the gutter.
   */
  public var guttersDrawLineNumbers: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawLineNumbersEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawLineNumbersPtr, NIL)
    }

  /**
   * Sets if line numbers drawn in the gutter are zero padded.
   */
  public var guttersZeroPadLineNumbers: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isLineNumbersZeroPaddedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLineNumbersZeroPaddedPtr, NIL)
    }

  /**
   * Sets if foldable lines icons should be drawn in the gutter.
   */
  public var guttersDrawFoldGutter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawingFoldGutterPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawFoldGutterPtr, NIL)
    }

  /**
   * Sets the string delimiters. All existing string delimiters will be removed.
   */
  public var delimiterStrings: VariantArray<String>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStringDelimitersPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<String>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStringDelimitersPtr, NIL)
    }

  /**
   * Sets the comment delimiters. All existing comment delimiters will be removed.
   */
  public var delimiterComments: VariantArray<String>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCommentDelimitersPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<String>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCommentDelimitersPtr, NIL)
    }

  /**
   * Sets whether code completion is allowed.
   */
  public var codeCompletionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCodeCompletionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCodeCompletionEnabledPtr, NIL)
    }

  /**
   * Sets prefixes that will trigger code completion.
   */
  public var codeCompletionPrefixes: VariantArray<String>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCodeCompletionPrefixesPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<String>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCodeCompletionPrefixesPtr, NIL)
    }

  /**
   * Size of the tabulation indent (one [kbd]Tab[/kbd] press) in characters. If [indentUseSpaces] is
   * enabled the number of spaces to use.
   */
  public var indentSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIndentSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setIndentSizePtr, NIL)
    }

  /**
   * Use spaces instead of tabs for indentation.
   */
  public var indentUseSpaces: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isIndentUsingSpacesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIndentUsingSpacesPtr, NIL)
    }

  /**
   * Sets whether automatic indent are enabled, this will add an extra indent if a prefix or brace
   * is found.
   */
  public var indentAutomatic: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAutoIndentEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoIndentEnabledPtr, NIL)
    }

  /**
   * Prefixes to trigger an automatic indent.
   */
  public var indentAutomaticPrefixes: VariantArray<String>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutoIndentPrefixesPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<String>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoIndentPrefixesPtr, NIL)
    }

  /**
   * Sets whether brace pairs should be autocompleted.
   */
  public var autoBraceCompletionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAutoBraceCompletionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoBraceCompletionEnabledPtr, NIL)
    }

  /**
   * Highlight mismatching brace pairs.
   */
  public var autoBraceCompletionHighlightMatching: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHighlightMatchingBracesEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHighlightMatchingBracesEnabledPtr, NIL)
    }

  /**
   * Sets the brace pairs to be autocompleted.
   */
  public var autoBraceCompletionPairs: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutoBraceCompletionPairsPtr, DICTIONARY)
      return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoBraceCompletionPairsPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_CODEEDIT, scriptIndex)
  }

  /**
   * Override this method to define how the selected entry should be inserted. If [replace] is
   * `true`, any existing text should be replaced.
   */
  public open fun _confirmCodeCompletion(replace: Boolean): Unit {
  }

  /**
   * Override this method to define what happens when the user requests code completion. If [force]
   * is `true`, any checks should be bypassed.
   */
  public open fun _requestCodeCompletion(force: Boolean): Unit {
  }

  /**
   * Override this method to define what items in [candidates] should be displayed.
   * Both [candidates] and the return is a [Array] of [Dictionary], see [getCodeCompletionOption]
   * for [Dictionary] content.
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
    TransferContext.callMethod(rawPtr, MethodBindings.doIndentPtr, NIL)
  }

  /**
   * Indents selected lines, or in the case of no selection the caret line by one.
   */
  public fun indentLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.indentLinesPtr, NIL)
  }

  /**
   * Unindents selected lines, or in the case of no selection the caret line by one. Same as
   * performing "ui_text_unindent" action.
   */
  public fun unindentLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.unindentLinesPtr, NIL)
  }

  /**
   * Converts the indents of lines between [fromLine] and [toLine] to tabs or spaces as set by
   * [indentUseSpaces].
   * Values of `-1` convert the entire text.
   */
  @JvmOverloads
  public fun convertIndent(fromLine: Int = -1, toLine: Int = -1): Unit {
    TransferContext.writeArguments(LONG to fromLine.toLong(), LONG to toLine.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.convertIndentPtr, NIL)
  }

  /**
   * Adds a brace pair.
   * Both the start and end keys must be symbols. Only the start key has to be unique.
   */
  public fun addAutoBraceCompletionPair(startKey: String, endKey: String): Unit {
    TransferContext.writeArguments(STRING to startKey, STRING to endKey)
    TransferContext.callMethod(rawPtr, MethodBindings.addAutoBraceCompletionPairPtr, NIL)
  }

  /**
   * Returns `true` if open key [openKey] exists.
   */
  public fun hasAutoBraceCompletionOpenKey(openKey: String): Boolean {
    TransferContext.writeArguments(STRING to openKey)
    TransferContext.callMethod(rawPtr, MethodBindings.hasAutoBraceCompletionOpenKeyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if close key [closeKey] exists.
   */
  public fun hasAutoBraceCompletionCloseKey(closeKey: String): Boolean {
    TransferContext.writeArguments(STRING to closeKey)
    TransferContext.callMethod(rawPtr, MethodBindings.hasAutoBraceCompletionCloseKeyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Gets the matching auto brace close key for [openKey].
   */
  public fun getAutoBraceCompletionCloseKey(openKey: String): String {
    TransferContext.writeArguments(STRING to openKey)
    TransferContext.callMethod(rawPtr, MethodBindings.getAutoBraceCompletionCloseKeyPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets the line as breakpointed.
   */
  public fun setLineAsBreakpoint(line: Int, breakpointed: Boolean): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), BOOL to breakpointed)
    TransferContext.callMethod(rawPtr, MethodBindings.setLineAsBreakpointPtr, NIL)
  }

  /**
   * Returns whether the line at the specified index is breakpointed or not.
   */
  public fun isLineBreakpointed(line: Int): Boolean {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isLineBreakpointedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Clears all breakpointed lines.
   */
  public fun clearBreakpointedLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearBreakpointedLinesPtr, NIL)
  }

  /**
   * Gets all breakpointed lines.
   */
  public fun getBreakpointedLines(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBreakpointedLinesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Sets the line as bookmarked.
   */
  public fun setLineAsBookmarked(line: Int, bookmarked: Boolean): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), BOOL to bookmarked)
    TransferContext.callMethod(rawPtr, MethodBindings.setLineAsBookmarkedPtr, NIL)
  }

  /**
   * Returns whether the line at the specified index is bookmarked or not.
   */
  public fun isLineBookmarked(line: Int): Boolean {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isLineBookmarkedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Clears all bookmarked lines.
   */
  public fun clearBookmarkedLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearBookmarkedLinesPtr, NIL)
  }

  /**
   * Gets all bookmarked lines.
   */
  public fun getBookmarkedLines(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBookmarkedLinesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Sets the line as executing.
   */
  public fun setLineAsExecuting(line: Int, executing: Boolean): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), BOOL to executing)
    TransferContext.callMethod(rawPtr, MethodBindings.setLineAsExecutingPtr, NIL)
  }

  /**
   * Returns whether the line at the specified index is marked as executing or not.
   */
  public fun isLineExecuting(line: Int): Boolean {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isLineExecutingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Clears all executed lines.
   */
  public fun clearExecutingLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearExecutingLinesPtr, NIL)
  }

  /**
   * Gets all executing lines.
   */
  public fun getExecutingLines(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getExecutingLinesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Returns if the given line is foldable, that is, it has indented lines right below it or a
   * comment / string block.
   */
  public fun canFoldLine(line: Int): Boolean {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.canFoldLinePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Folds the given line, if possible (see [canFoldLine]).
   */
  public fun foldLine(line: Int): Unit {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.foldLinePtr, NIL)
  }

  /**
   * Unfolds all lines that were previously folded.
   */
  public fun unfoldLine(line: Int): Unit {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.unfoldLinePtr, NIL)
  }

  /**
   * Folds all lines that are possible to be folded (see [canFoldLine]).
   */
  public fun foldAllLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.foldAllLinesPtr, NIL)
  }

  /**
   * Unfolds all lines, folded or not.
   */
  public fun unfoldAllLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.unfoldAllLinesPtr, NIL)
  }

  /**
   * Toggle the folding of the code block at the given line.
   */
  public fun toggleFoldableLine(line: Int): Unit {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.toggleFoldableLinePtr, NIL)
  }

  /**
   * Toggle the folding of the code block on all lines with a caret on them.
   */
  public fun toggleFoldableLinesAtCarets(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.toggleFoldableLinesAtCaretsPtr, NIL)
  }

  /**
   * Returns whether the line at the specified index is folded or not.
   */
  public fun isLineFolded(line: Int): Boolean {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isLineFoldedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns all lines that are current folded.
   */
  public fun getFoldedLines(): VariantArray<Long> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFoldedLinesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Long>)
  }

  /**
   * Creates a new code region with the selection. At least one single line comment delimiter have
   * to be defined (see [addCommentDelimiter]).
   * A code region is a part of code that is highlighted when folded and can help organize your
   * script.
   * Code region start and end tags can be customized (see [setCodeRegionTags]).
   * Code regions are delimited using start and end tags (respectively `region` and `endregion` by
   * default) preceded by one line comment delimiter. (eg. `#region` and `#endregion`)
   */
  public fun createCodeRegion(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createCodeRegionPtr, NIL)
  }

  /**
   * Returns the code region start tag (without comment delimiter).
   */
  public fun getCodeRegionStartTag(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCodeRegionStartTagPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the code region end tag (without comment delimiter).
   */
  public fun getCodeRegionEndTag(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCodeRegionEndTagPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets the code region start and end tags (without comment delimiter).
   */
  @JvmOverloads
  public fun setCodeRegionTags(start: String = "region", end: String = "endregion"): Unit {
    TransferContext.writeArguments(STRING to start, STRING to end)
    TransferContext.callMethod(rawPtr, MethodBindings.setCodeRegionTagsPtr, NIL)
  }

  /**
   * Returns whether the line at the specified index is a code region start.
   */
  public fun isLineCodeRegionStart(line: Int): Boolean {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isLineCodeRegionStartPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns whether the line at the specified index is a code region end.
   */
  public fun isLineCodeRegionEnd(line: Int): Boolean {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isLineCodeRegionEndPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Defines a string delimiter from [startKey] to [endKey]. Both keys should be symbols, and
   * [startKey] must not be shared with other delimiters.
   * If [lineOnly] is `true` or [endKey] is an empty [String], the region does not carry over to the
   * next line.
   */
  @JvmOverloads
  public fun addStringDelimiter(
    startKey: String,
    endKey: String,
    lineOnly: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(STRING to startKey, STRING to endKey, BOOL to lineOnly)
    TransferContext.callMethod(rawPtr, MethodBindings.addStringDelimiterPtr, NIL)
  }

  /**
   * Removes the string delimiter with [startKey].
   */
  public fun removeStringDelimiter(startKey: String): Unit {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(rawPtr, MethodBindings.removeStringDelimiterPtr, NIL)
  }

  /**
   * Returns `true` if string [startKey] exists.
   */
  public fun hasStringDelimiter(startKey: String): Boolean {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(rawPtr, MethodBindings.hasStringDelimiterPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Removes all string delimiters.
   */
  public fun clearStringDelimiters(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearStringDelimitersPtr, NIL)
  }

  /**
   * Returns the delimiter index if [line] [column] is in a string. If [column] is not provided,
   * will return the delimiter index if the entire [line] is a string. Otherwise `-1`.
   */
  @JvmOverloads
  public fun isInString(line: Int, column: Int = -1): Int {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isInStringPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds a comment delimiter from [startKey] to [endKey]. Both keys should be symbols, and
   * [startKey] must not be shared with other delimiters.
   * If [lineOnly] is `true` or [endKey] is an empty [String], the region does not carry over to the
   * next line.
   */
  @JvmOverloads
  public fun addCommentDelimiter(
    startKey: String,
    endKey: String,
    lineOnly: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(STRING to startKey, STRING to endKey, BOOL to lineOnly)
    TransferContext.callMethod(rawPtr, MethodBindings.addCommentDelimiterPtr, NIL)
  }

  /**
   * Removes the comment delimiter with [startKey].
   */
  public fun removeCommentDelimiter(startKey: String): Unit {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(rawPtr, MethodBindings.removeCommentDelimiterPtr, NIL)
  }

  /**
   * Returns `true` if comment [startKey] exists.
   */
  public fun hasCommentDelimiter(startKey: String): Boolean {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(rawPtr, MethodBindings.hasCommentDelimiterPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Removes all comment delimiters.
   */
  public fun clearCommentDelimiters(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearCommentDelimitersPtr, NIL)
  }

  /**
   * Returns delimiter index if [line] [column] is in a comment. If [column] is not provided, will
   * return delimiter index if the entire [line] is a comment. Otherwise `-1`.
   */
  @JvmOverloads
  public fun isInComment(line: Int, column: Int = -1): Int {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isInCommentPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Gets the start key for a string or comment region index.
   */
  public fun getDelimiterStartKey(delimiterIndex: Int): String {
    TransferContext.writeArguments(LONG to delimiterIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getDelimiterStartKeyPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Gets the end key for a string or comment region index.
   */
  public fun getDelimiterEndKey(delimiterIndex: Int): String {
    TransferContext.writeArguments(LONG to delimiterIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getDelimiterEndKeyPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * If [line] [column] is in a string or comment, returns the start position of the region. If not
   * or no start could be found, both [Vector2] values will be `-1`.
   */
  public fun getDelimiterStartPosition(line: Int, column: Int): Vector2 {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getDelimiterStartPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * If [line] [column] is in a string or comment, returns the end position of the region. If not or
   * no end could be found, both [Vector2] values will be `-1`.
   */
  public fun getDelimiterEndPosition(line: Int, column: Int): Vector2 {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getDelimiterEndPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Sets the code hint text. Pass an empty string to clear.
   */
  public fun setCodeHint(codeHint: String): Unit {
    TransferContext.writeArguments(STRING to codeHint)
    TransferContext.callMethod(rawPtr, MethodBindings.setCodeHintPtr, NIL)
  }

  /**
   * Sets if the code hint should draw below the text.
   */
  public fun setCodeHintDrawBelow(drawBelow: Boolean): Unit {
    TransferContext.writeArguments(BOOL to drawBelow)
    TransferContext.callMethod(rawPtr, MethodBindings.setCodeHintDrawBelowPtr, NIL)
  }

  /**
   * Returns the full text with char `0xFFFF` at the caret location.
   */
  public fun getTextForCodeCompletion(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextForCodeCompletionPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Emits [signal code_completion_requested], if [force] is `true` will bypass all checks.
   * Otherwise will check that the caret is in a word or in front of a prefix. Will ignore the request
   * if all current options are of type file path, node path, or signal.
   */
  @JvmOverloads
  public fun requestCodeCompletion(force: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to force)
    TransferContext.callMethod(rawPtr, MethodBindings.requestCodeCompletionPtr, NIL)
  }

  /**
   * Submits an item to the queue of potential candidates for the autocomplete menu. Call
   * [updateCodeCompletionOptions] to update the list.
   * [location] indicates location of the option relative to the location of the code completion
   * query. See [CodeEdit.CodeCompletionLocation] for how to set this value.
   * **Note:** This list will replace all current candidates.
   */
  @JvmOverloads
  public fun addCodeCompletionOption(
    type: CodeCompletionKind,
    displayText: String,
    insertText: String,
    textColor: Color = Color(Color(1, 1, 1, 1)),
    icon: Resource? = null,
    `value`: Any? = null,
    location: Int = 1024,
  ): Unit {
    TransferContext.writeArguments(LONG to type.id, STRING to displayText, STRING to insertText, COLOR to textColor, OBJECT to icon, ANY to value, LONG to location.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addCodeCompletionOptionPtr, NIL)
  }

  /**
   * Submits all completion options added with [addCodeCompletionOption]. Will try to force the
   * autocomplete menu to popup, if [force] is `true`.
   * **Note:** This will replace all current candidates.
   */
  public fun updateCodeCompletionOptions(force: Boolean): Unit {
    TransferContext.writeArguments(BOOL to force)
    TransferContext.callMethod(rawPtr, MethodBindings.updateCodeCompletionOptionsPtr, NIL)
  }

  /**
   * Gets all completion options, see [getCodeCompletionOption] for return content.
   */
  public fun getCodeCompletionOptions(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCodeCompletionOptionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Gets the completion option at [index]. The return [Dictionary] has the following key-values:
   * `kind`: [CodeCompletionKind]
   * `display_text`: Text that is shown on the autocomplete menu.
   * `insert_text`: Text that is to be inserted when this item is selected.
   * `font_color`: Color of the text on the autocomplete menu.
   * `icon`: Icon to draw on the autocomplete menu.
   * `default_value`: Value of the symbol.
   */
  public fun getCodeCompletionOption(index: Int): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCodeCompletionOptionPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Gets the index of the current selected completion option.
   */
  public fun getCodeCompletionSelectedIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCodeCompletionSelectedIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the current selected completion option.
   */
  public fun setCodeCompletionSelectedIndex(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCodeCompletionSelectedIndexPtr, NIL)
  }

  /**
   * Inserts the selected entry into the text. If [replace] is `true`, any existing text is replaced
   * rather than merged.
   */
  @JvmOverloads
  public fun confirmCodeCompletion(replace: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to replace)
    TransferContext.callMethod(rawPtr, MethodBindings.confirmCodeCompletionPtr, NIL)
  }

  /**
   * Cancels the autocomplete menu.
   */
  public fun cancelCodeCompletion(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.cancelCodeCompletionPtr, NIL)
  }

  /**
   * Returns the full text with char `0xFFFF` at the cursor location.
   */
  public fun getTextForSymbolLookup(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextForSymbolLookupPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the full text with char `0xFFFF` at the specified location.
   */
  public fun getTextWithCursorChar(line: Int, column: Int): String {
    TransferContext.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTextWithCursorCharPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets the symbol emitted by [signal symbol_validate] as a valid lookup.
   */
  public fun setSymbolLookupWordAsValid(valid: Boolean): Unit {
    TransferContext.writeArguments(BOOL to valid)
    TransferContext.callMethod(rawPtr, MethodBindings.setSymbolLookupWordAsValidPtr, NIL)
  }

  /**
   * Moves all lines up that are selected or have a caret on them.
   */
  public fun moveLinesUp(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.moveLinesUpPtr, NIL)
  }

  /**
   * Moves all lines down that are selected or have a caret on them.
   */
  public fun moveLinesDown(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.moveLinesDownPtr, NIL)
  }

  /**
   * Deletes all lines that are selected or have a caret on them.
   */
  public fun deleteLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.deleteLinesPtr, NIL)
  }

  /**
   * Duplicates all selected text and duplicates all lines with a caret on them.
   */
  public fun duplicateSelection(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.duplicateSelectionPtr, NIL)
  }

  /**
   * Duplicates all lines currently selected with any caret. Duplicates the entire line beneath the
   * current one no matter where the caret is within the line.
   */
  public fun duplicateLines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.duplicateLinesPtr, NIL)
  }

  public enum class CodeCompletionKind(
    id: Long,
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
     * Marks the option as an enum entry.
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
      public fun from(`value`: Long): CodeCompletionKind = entries.single { it.id == `value` }
    }
  }

  public enum class CodeCompletionLocation(
    id: Long,
  ) {
    /**
     * The option is local to the location of the code completion query - e.g. a local variable.
     * Subsequent value of location represent options from the outer class, the exact value represent
     * how far they are (in terms of inner classes).
     */
    LOCATION_LOCAL(0),
    /**
     * The option is from the containing class or a parent class, relative to the location of the
     * code completion query. Perform a bitwise OR with the class depth (e.g. `0` for the local class,
     * `1` for the parent, `2` for the grandparent, etc.) to store the depth of an option in the class
     * or a parent class.
     */
    LOCATION_PARENT_MASK(256),
    /**
     * The option is from user code which is not local and not in a derived class (e.g. Autoload
     * Singletons).
     */
    LOCATION_OTHER_USER_CODE(512),
    /**
     * The option is from other engine code, not covered by the other enum constants - e.g. built-in
     * classes.
     */
    LOCATION_OTHER(1024),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CodeCompletionLocation = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setIndentSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_indent_size", 1286410249)

    public val getIndentSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_indent_size", 3905245786)

    public val setIndentUsingSpacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_indent_using_spaces", 2586408642)

    public val isIndentUsingSpacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_indent_using_spaces", 36873697)

    public val setAutoIndentEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_auto_indent_enabled", 2586408642)

    public val isAutoIndentEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_auto_indent_enabled", 36873697)

    public val setAutoIndentPrefixesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_auto_indent_prefixes", 381264803)

    public val getAutoIndentPrefixesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_auto_indent_prefixes", 3995934104)

    public val doIndentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "do_indent", 3218959716)

    public val indentLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "indent_lines", 3218959716)

    public val unindentLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "unindent_lines", 3218959716)

    public val convertIndentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "convert_indent", 423910286)

    public val setAutoBraceCompletionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_auto_brace_completion_enabled", 2586408642)

    public val isAutoBraceCompletionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_auto_brace_completion_enabled", 36873697)

    public val setHighlightMatchingBracesEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_highlight_matching_braces_enabled", 2586408642)

    public val isHighlightMatchingBracesEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_highlight_matching_braces_enabled", 36873697)

    public val addAutoBraceCompletionPairPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "add_auto_brace_completion_pair", 3186203200)

    public val setAutoBraceCompletionPairsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_auto_brace_completion_pairs", 4155329257)

    public val getAutoBraceCompletionPairsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_auto_brace_completion_pairs", 3102165223)

    public val hasAutoBraceCompletionOpenKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "has_auto_brace_completion_open_key", 3927539163)

    public val hasAutoBraceCompletionCloseKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "has_auto_brace_completion_close_key", 3927539163)

    public val getAutoBraceCompletionCloseKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_auto_brace_completion_close_key", 3135753539)

    public val setDrawBreakpointsGutterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_draw_breakpoints_gutter", 2586408642)

    public val isDrawingBreakpointsGutterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_drawing_breakpoints_gutter", 36873697)

    public val setDrawBookmarksGutterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_draw_bookmarks_gutter", 2586408642)

    public val isDrawingBookmarksGutterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_drawing_bookmarks_gutter", 36873697)

    public val setDrawExecutingLinesGutterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_draw_executing_lines_gutter", 2586408642)

    public val isDrawingExecutingLinesGutterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_drawing_executing_lines_gutter", 36873697)

    public val setLineAsBreakpointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_line_as_breakpoint", 300928843)

    public val isLineBreakpointedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_line_breakpointed", 1116898809)

    public val clearBreakpointedLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "clear_breakpointed_lines", 3218959716)

    public val getBreakpointedLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_breakpointed_lines", 1930428628)

    public val setLineAsBookmarkedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_line_as_bookmarked", 300928843)

    public val isLineBookmarkedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_line_bookmarked", 1116898809)

    public val clearBookmarkedLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "clear_bookmarked_lines", 3218959716)

    public val getBookmarkedLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_bookmarked_lines", 1930428628)

    public val setLineAsExecutingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_line_as_executing", 300928843)

    public val isLineExecutingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_line_executing", 1116898809)

    public val clearExecutingLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "clear_executing_lines", 3218959716)

    public val getExecutingLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_executing_lines", 1930428628)

    public val setDrawLineNumbersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_draw_line_numbers", 2586408642)

    public val isDrawLineNumbersEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_draw_line_numbers_enabled", 36873697)

    public val setLineNumbersZeroPaddedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_line_numbers_zero_padded", 2586408642)

    public val isLineNumbersZeroPaddedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_line_numbers_zero_padded", 36873697)

    public val setDrawFoldGutterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_draw_fold_gutter", 2586408642)

    public val isDrawingFoldGutterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_drawing_fold_gutter", 36873697)

    public val setLineFoldingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_line_folding_enabled", 2586408642)

    public val isLineFoldingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_line_folding_enabled", 36873697)

    public val canFoldLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "can_fold_line", 1116898809)

    public val foldLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "fold_line", 1286410249)

    public val unfoldLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "unfold_line", 1286410249)

    public val foldAllLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "fold_all_lines", 3218959716)

    public val unfoldAllLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "unfold_all_lines", 3218959716)

    public val toggleFoldableLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "toggle_foldable_line", 1286410249)

    public val toggleFoldableLinesAtCaretsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "toggle_foldable_lines_at_carets", 3218959716)

    public val isLineFoldedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_line_folded", 1116898809)

    public val getFoldedLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_folded_lines", 3995934104)

    public val createCodeRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "create_code_region", 3218959716)

    public val getCodeRegionStartTagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_code_region_start_tag", 201670096)

    public val getCodeRegionEndTagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_code_region_end_tag", 201670096)

    public val setCodeRegionTagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_code_region_tags", 708800718)

    public val isLineCodeRegionStartPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_line_code_region_start", 1116898809)

    public val isLineCodeRegionEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_line_code_region_end", 1116898809)

    public val addStringDelimiterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "add_string_delimiter", 3146098955)

    public val removeStringDelimiterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "remove_string_delimiter", 83702148)

    public val hasStringDelimiterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "has_string_delimiter", 3927539163)

    public val setStringDelimitersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_string_delimiters", 381264803)

    public val clearStringDelimitersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "clear_string_delimiters", 3218959716)

    public val getStringDelimitersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_string_delimiters", 3995934104)

    public val isInStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_in_string", 688195400)

    public val addCommentDelimiterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "add_comment_delimiter", 3146098955)

    public val removeCommentDelimiterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "remove_comment_delimiter", 83702148)

    public val hasCommentDelimiterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "has_comment_delimiter", 3927539163)

    public val setCommentDelimitersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_comment_delimiters", 381264803)

    public val clearCommentDelimitersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "clear_comment_delimiters", 3218959716)

    public val getCommentDelimitersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_comment_delimiters", 3995934104)

    public val isInCommentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_in_comment", 688195400)

    public val getDelimiterStartKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_delimiter_start_key", 844755477)

    public val getDelimiterEndKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_delimiter_end_key", 844755477)

    public val getDelimiterStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_delimiter_start_position", 3016396712)

    public val getDelimiterEndPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_delimiter_end_position", 3016396712)

    public val setCodeHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_code_hint", 83702148)

    public val setCodeHintDrawBelowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_code_hint_draw_below", 2586408642)

    public val getTextForCodeCompletionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_text_for_code_completion", 201670096)

    public val requestCodeCompletionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "request_code_completion", 107499316)

    public val addCodeCompletionOptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "add_code_completion_option", 3944379502)

    public val updateCodeCompletionOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "update_code_completion_options", 2586408642)

    public val getCodeCompletionOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_code_completion_options", 3995934104)

    public val getCodeCompletionOptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_code_completion_option", 3485342025)

    public val getCodeCompletionSelectedIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_code_completion_selected_index", 3905245786)

    public val setCodeCompletionSelectedIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_code_completion_selected_index", 1286410249)

    public val confirmCodeCompletionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "confirm_code_completion", 107499316)

    public val cancelCodeCompletionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "cancel_code_completion", 3218959716)

    public val setCodeCompletionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_code_completion_enabled", 2586408642)

    public val isCodeCompletionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_code_completion_enabled", 36873697)

    public val setCodeCompletionPrefixesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_code_completion_prefixes", 381264803)

    public val getCodeCompletionPrefixesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_code_completion_prefixes", 3995934104)

    public val setLineLengthGuidelinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_line_length_guidelines", 381264803)

    public val getLineLengthGuidelinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_line_length_guidelines", 3995934104)

    public val setSymbolLookupOnClickEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_symbol_lookup_on_click_enabled", 2586408642)

    public val isSymbolLookupOnClickEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "is_symbol_lookup_on_click_enabled", 36873697)

    public val getTextForSymbolLookupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_text_for_symbol_lookup", 201670096)

    public val getTextWithCursorCharPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "get_text_with_cursor_char", 1391810591)

    public val setSymbolLookupWordAsValidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "set_symbol_lookup_word_as_valid", 2586408642)

    public val moveLinesUpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "move_lines_up", 3218959716)

    public val moveLinesDownPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "move_lines_down", 3218959716)

    public val deleteLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "delete_lines", 3218959716)

    public val duplicateSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "duplicate_selection", 3218959716)

    public val duplicateLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeEdit", "duplicate_lines", 3218959716)
  }
}
