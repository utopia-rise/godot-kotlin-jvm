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
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal3
import godot.core.VariantArray
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_CODEEDIT_INDEX: Int = 184

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
  public val breakpointToggled: Signal1<Long> by Signal1

  /**
   * Emitted when the user requests code completion.
   */
  public val codeCompletionRequested: Signal0 by Signal0

  /**
   * Emitted when the user has clicked on a valid symbol.
   */
  public val symbolLookup: Signal3<String, Long, Long> by Signal3

  /**
   * Emitted when the user hovers over a symbol. The symbol should be validated and responded to, by
   * calling [setSymbolLookupWordAsValid].
   */
  public val symbolValidate: Signal1<String> by Signal1

  /**
   * Set when a validated word from [signal symbol_validate] is clicked, the [signal symbol_lookup]
   * should be emitted.
   */
  public final inline var symbolLookupOnClick: Boolean
    @JvmName("symbolLookupOnClickProperty")
    get() = isSymbolLookupOnClickEnabled()
    @JvmName("symbolLookupOnClickProperty")
    set(`value`) {
      setSymbolLookupOnClickEnabled(value)
    }

  /**
   * Sets whether line folding is allowed.
   */
  public final inline var lineFolding: Boolean
    @JvmName("lineFoldingProperty")
    get() = isLineFoldingEnabled()
    @JvmName("lineFoldingProperty")
    set(`value`) {
      setLineFoldingEnabled(value)
    }

  /**
   * Draws vertical lines at the provided columns. The first entry is considered a main hard
   * guideline and is draw more prominently.
   */
  public final inline var lineLengthGuidelines: VariantArray<Long>
    @JvmName("lineLengthGuidelinesProperty")
    get() = getLineLengthGuidelines()
    @JvmName("lineLengthGuidelinesProperty")
    set(`value`) {
      setLineLengthGuidelines(value)
    }

  /**
   * Sets if breakpoints should be drawn in the gutter. This gutter is shared with bookmarks and
   * executing lines.
   */
  public final inline var guttersDrawBreakpointsGutter: Boolean
    @JvmName("guttersDrawBreakpointsGutterProperty")
    get() = isDrawingBreakpointsGutter()
    @JvmName("guttersDrawBreakpointsGutterProperty")
    set(`value`) {
      setDrawBreakpointsGutter(value)
    }

  /**
   * Sets if bookmarked should be drawn in the gutter. This gutter is shared with breakpoints and
   * executing lines.
   */
  public final inline var guttersDrawBookmarks: Boolean
    @JvmName("guttersDrawBookmarksProperty")
    get() = isDrawingBookmarksGutter()
    @JvmName("guttersDrawBookmarksProperty")
    set(`value`) {
      setDrawBookmarksGutter(value)
    }

  /**
   * Sets if executing lines should be marked in the gutter. This gutter is shared with breakpoints
   * and bookmarks lines.
   */
  public final inline var guttersDrawExecutingLines: Boolean
    @JvmName("guttersDrawExecutingLinesProperty")
    get() = isDrawingExecutingLinesGutter()
    @JvmName("guttersDrawExecutingLinesProperty")
    set(`value`) {
      setDrawExecutingLinesGutter(value)
    }

  /**
   * Sets if line numbers should be drawn in the gutter.
   */
  public final inline var guttersDrawLineNumbers: Boolean
    @JvmName("guttersDrawLineNumbersProperty")
    get() = isDrawLineNumbersEnabled()
    @JvmName("guttersDrawLineNumbersProperty")
    set(`value`) {
      setDrawLineNumbers(value)
    }

  /**
   * Sets if line numbers drawn in the gutter are zero padded.
   */
  public final inline var guttersZeroPadLineNumbers: Boolean
    @JvmName("guttersZeroPadLineNumbersProperty")
    get() = isLineNumbersZeroPadded()
    @JvmName("guttersZeroPadLineNumbersProperty")
    set(`value`) {
      setLineNumbersZeroPadded(value)
    }

  /**
   * Sets if foldable lines icons should be drawn in the gutter.
   */
  public final inline var guttersDrawFoldGutter: Boolean
    @JvmName("guttersDrawFoldGutterProperty")
    get() = isDrawingFoldGutter()
    @JvmName("guttersDrawFoldGutterProperty")
    set(`value`) {
      setDrawFoldGutter(value)
    }

  /**
   * Sets the string delimiters. All existing string delimiters will be removed.
   */
  public final inline var delimiterStrings: VariantArray<String>
    @JvmName("delimiterStringsProperty")
    get() = getStringDelimiters()
    @JvmName("delimiterStringsProperty")
    set(`value`) {
      setStringDelimiters(value)
    }

  /**
   * Sets the comment delimiters. All existing comment delimiters will be removed.
   */
  public final inline var delimiterComments: VariantArray<String>
    @JvmName("delimiterCommentsProperty")
    get() = getCommentDelimiters()
    @JvmName("delimiterCommentsProperty")
    set(`value`) {
      setCommentDelimiters(value)
    }

  /**
   * Sets whether code completion is allowed.
   */
  public final inline var codeCompletionEnabled: Boolean
    @JvmName("codeCompletionEnabledProperty")
    get() = isCodeCompletionEnabled()
    @JvmName("codeCompletionEnabledProperty")
    set(`value`) {
      setCodeCompletionEnabled(value)
    }

  /**
   * Sets prefixes that will trigger code completion.
   */
  public final inline var codeCompletionPrefixes: VariantArray<String>
    @JvmName("codeCompletionPrefixesProperty")
    get() = getCodeCompletionPrefixes()
    @JvmName("codeCompletionPrefixesProperty")
    set(`value`) {
      setCodeCompletionPrefixes(value)
    }

  /**
   * Size of the tabulation indent (one [kbd]Tab[/kbd] press) in characters. If [indentUseSpaces] is
   * enabled the number of spaces to use.
   */
  public final inline var indentSize: Int
    @JvmName("indentSizeProperty")
    get() = getIndentSize()
    @JvmName("indentSizeProperty")
    set(`value`) {
      setIndentSize(value)
    }

  /**
   * Use spaces instead of tabs for indentation.
   */
  public final inline var indentUseSpaces: Boolean
    @JvmName("indentUseSpacesProperty")
    get() = isIndentUsingSpaces()
    @JvmName("indentUseSpacesProperty")
    set(`value`) {
      setIndentUsingSpaces(value)
    }

  /**
   * Sets whether automatic indent are enabled, this will add an extra indent if a prefix or brace
   * is found.
   */
  public final inline var indentAutomatic: Boolean
    @JvmName("indentAutomaticProperty")
    get() = isAutoIndentEnabled()
    @JvmName("indentAutomaticProperty")
    set(`value`) {
      setAutoIndentEnabled(value)
    }

  /**
   * Prefixes to trigger an automatic indent.
   */
  public final inline var indentAutomaticPrefixes: VariantArray<String>
    @JvmName("indentAutomaticPrefixesProperty")
    get() = getAutoIndentPrefixes()
    @JvmName("indentAutomaticPrefixesProperty")
    set(`value`) {
      setAutoIndentPrefixes(value)
    }

  /**
   * Sets whether brace pairs should be autocompleted.
   */
  public final inline var autoBraceCompletionEnabled: Boolean
    @JvmName("autoBraceCompletionEnabledProperty")
    get() = isAutoBraceCompletionEnabled()
    @JvmName("autoBraceCompletionEnabledProperty")
    set(`value`) {
      setAutoBraceCompletionEnabled(value)
    }

  /**
   * Highlight mismatching brace pairs.
   */
  public final inline var autoBraceCompletionHighlightMatching: Boolean
    @JvmName("autoBraceCompletionHighlightMatchingProperty")
    get() = isHighlightMatchingBracesEnabled()
    @JvmName("autoBraceCompletionHighlightMatchingProperty")
    set(`value`) {
      setHighlightMatchingBracesEnabled(value)
    }

  /**
   * Sets the brace pairs to be autocompleted.
   */
  public final inline var autoBraceCompletionPairs: Dictionary<Any?, Any?>
    @JvmName("autoBraceCompletionPairsProperty")
    get() = getAutoBraceCompletionPairs()
    @JvmName("autoBraceCompletionPairsProperty")
    set(`value`) {
      setAutoBraceCompletionPairs(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_CODEEDIT_INDEX, scriptIndex)
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

  public final fun setIndentSize(size: Int): Unit {
    Internals.writeArguments(LONG to size.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setIndentSizePtr, NIL)
  }

  public final fun getIndentSize(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getIndentSizePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setIndentUsingSpaces(useSpaces: Boolean): Unit {
    Internals.writeArguments(BOOL to useSpaces)
    Internals.callMethod(rawPtr, MethodBindings.setIndentUsingSpacesPtr, NIL)
  }

  public final fun isIndentUsingSpaces(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isIndentUsingSpacesPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAutoIndentEnabled(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setAutoIndentEnabledPtr, NIL)
  }

  public final fun isAutoIndentEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isAutoIndentEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAutoIndentPrefixes(prefixes: VariantArray<String>): Unit {
    Internals.writeArguments(ARRAY to prefixes)
    Internals.callMethod(rawPtr, MethodBindings.setAutoIndentPrefixesPtr, NIL)
  }

  public final fun getAutoIndentPrefixes(): VariantArray<String> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAutoIndentPrefixesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<String>)
  }

  /**
   * Perform an indent as if the user activated the "ui_text_indent" action.
   */
  public final fun doIndent(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.doIndentPtr, NIL)
  }

  /**
   * Indents selected lines, or in the case of no selection the caret line by one.
   */
  public final fun indentLines(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.indentLinesPtr, NIL)
  }

  /**
   * Unindents selected lines, or in the case of no selection the caret line by one. Same as
   * performing "ui_text_unindent" action.
   */
  public final fun unindentLines(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.unindentLinesPtr, NIL)
  }

  /**
   * Converts the indents of lines between [fromLine] and [toLine] to tabs or spaces as set by
   * [indentUseSpaces].
   * Values of `-1` convert the entire text.
   */
  @JvmOverloads
  public final fun convertIndent(fromLine: Int = -1, toLine: Int = -1): Unit {
    Internals.writeArguments(LONG to fromLine.toLong(), LONG to toLine.toLong())
    Internals.callMethod(rawPtr, MethodBindings.convertIndentPtr, NIL)
  }

  public final fun setAutoBraceCompletionEnabled(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setAutoBraceCompletionEnabledPtr, NIL)
  }

  public final fun isAutoBraceCompletionEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isAutoBraceCompletionEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setHighlightMatchingBracesEnabled(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setHighlightMatchingBracesEnabledPtr, NIL)
  }

  public final fun isHighlightMatchingBracesEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isHighlightMatchingBracesEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds a brace pair.
   * Both the start and end keys must be symbols. Only the start key has to be unique.
   */
  public final fun addAutoBraceCompletionPair(startKey: String, endKey: String): Unit {
    Internals.writeArguments(STRING to startKey, STRING to endKey)
    Internals.callMethod(rawPtr, MethodBindings.addAutoBraceCompletionPairPtr, NIL)
  }

  public final fun setAutoBraceCompletionPairs(pairs: Dictionary<Any?, Any?>): Unit {
    Internals.writeArguments(DICTIONARY to pairs)
    Internals.callMethod(rawPtr, MethodBindings.setAutoBraceCompletionPairsPtr, NIL)
  }

  public final fun getAutoBraceCompletionPairs(): Dictionary<Any?, Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAutoBraceCompletionPairsPtr, DICTIONARY)
    return (Internals.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns `true` if open key [openKey] exists.
   */
  public final fun hasAutoBraceCompletionOpenKey(openKey: String): Boolean {
    Internals.writeArguments(STRING to openKey)
    Internals.callMethod(rawPtr, MethodBindings.hasAutoBraceCompletionOpenKeyPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if close key [closeKey] exists.
   */
  public final fun hasAutoBraceCompletionCloseKey(closeKey: String): Boolean {
    Internals.writeArguments(STRING to closeKey)
    Internals.callMethod(rawPtr, MethodBindings.hasAutoBraceCompletionCloseKeyPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Gets the matching auto brace close key for [openKey].
   */
  public final fun getAutoBraceCompletionCloseKey(openKey: String): String {
    Internals.writeArguments(STRING to openKey)
    Internals.callMethod(rawPtr, MethodBindings.getAutoBraceCompletionCloseKeyPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setDrawBreakpointsGutter(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setDrawBreakpointsGutterPtr, NIL)
  }

  public final fun isDrawingBreakpointsGutter(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isDrawingBreakpointsGutterPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDrawBookmarksGutter(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setDrawBookmarksGutterPtr, NIL)
  }

  public final fun isDrawingBookmarksGutter(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isDrawingBookmarksGutterPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDrawExecutingLinesGutter(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setDrawExecutingLinesGutterPtr, NIL)
  }

  public final fun isDrawingExecutingLinesGutter(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isDrawingExecutingLinesGutterPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the line as breakpointed.
   */
  public final fun setLineAsBreakpoint(line: Int, breakpointed: Boolean): Unit {
    Internals.writeArguments(LONG to line.toLong(), BOOL to breakpointed)
    Internals.callMethod(rawPtr, MethodBindings.setLineAsBreakpointPtr, NIL)
  }

  /**
   * Returns whether the line at the specified index is breakpointed or not.
   */
  public final fun isLineBreakpointed(line: Int): Boolean {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isLineBreakpointedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Clears all breakpointed lines.
   */
  public final fun clearBreakpointedLines(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearBreakpointedLinesPtr, NIL)
  }

  /**
   * Gets all breakpointed lines.
   */
  public final fun getBreakpointedLines(): PackedInt32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBreakpointedLinesPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Sets the line as bookmarked.
   */
  public final fun setLineAsBookmarked(line: Int, bookmarked: Boolean): Unit {
    Internals.writeArguments(LONG to line.toLong(), BOOL to bookmarked)
    Internals.callMethod(rawPtr, MethodBindings.setLineAsBookmarkedPtr, NIL)
  }

  /**
   * Returns whether the line at the specified index is bookmarked or not.
   */
  public final fun isLineBookmarked(line: Int): Boolean {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isLineBookmarkedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Clears all bookmarked lines.
   */
  public final fun clearBookmarkedLines(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearBookmarkedLinesPtr, NIL)
  }

  /**
   * Gets all bookmarked lines.
   */
  public final fun getBookmarkedLines(): PackedInt32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBookmarkedLinesPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Sets the line as executing.
   */
  public final fun setLineAsExecuting(line: Int, executing: Boolean): Unit {
    Internals.writeArguments(LONG to line.toLong(), BOOL to executing)
    Internals.callMethod(rawPtr, MethodBindings.setLineAsExecutingPtr, NIL)
  }

  /**
   * Returns whether the line at the specified index is marked as executing or not.
   */
  public final fun isLineExecuting(line: Int): Boolean {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isLineExecutingPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Clears all executed lines.
   */
  public final fun clearExecutingLines(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearExecutingLinesPtr, NIL)
  }

  /**
   * Gets all executing lines.
   */
  public final fun getExecutingLines(): PackedInt32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getExecutingLinesPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setDrawLineNumbers(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setDrawLineNumbersPtr, NIL)
  }

  public final fun isDrawLineNumbersEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isDrawLineNumbersEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setLineNumbersZeroPadded(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setLineNumbersZeroPaddedPtr, NIL)
  }

  public final fun isLineNumbersZeroPadded(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isLineNumbersZeroPaddedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDrawFoldGutter(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setDrawFoldGutterPtr, NIL)
  }

  public final fun isDrawingFoldGutter(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isDrawingFoldGutterPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setLineFoldingEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setLineFoldingEnabledPtr, NIL)
  }

  public final fun isLineFoldingEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isLineFoldingEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns if the given line is foldable, that is, it has indented lines right below it or a
   * comment / string block.
   */
  public final fun canFoldLine(line: Int): Boolean {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.canFoldLinePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Folds the given line, if possible (see [canFoldLine]).
   */
  public final fun foldLine(line: Int): Unit {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.foldLinePtr, NIL)
  }

  /**
   * Unfolds all lines that were previously folded.
   */
  public final fun unfoldLine(line: Int): Unit {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.unfoldLinePtr, NIL)
  }

  /**
   * Folds all lines that are possible to be folded (see [canFoldLine]).
   */
  public final fun foldAllLines(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.foldAllLinesPtr, NIL)
  }

  /**
   * Unfolds all lines, folded or not.
   */
  public final fun unfoldAllLines(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.unfoldAllLinesPtr, NIL)
  }

  /**
   * Toggle the folding of the code block at the given line.
   */
  public final fun toggleFoldableLine(line: Int): Unit {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.toggleFoldableLinePtr, NIL)
  }

  /**
   * Toggle the folding of the code block on all lines with a caret on them.
   */
  public final fun toggleFoldableLinesAtCarets(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.toggleFoldableLinesAtCaretsPtr, NIL)
  }

  /**
   * Returns whether the line at the specified index is folded or not.
   */
  public final fun isLineFolded(line: Int): Boolean {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isLineFoldedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns all lines that are current folded.
   */
  public final fun getFoldedLines(): VariantArray<Long> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFoldedLinesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Long>)
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
  public final fun createCodeRegion(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.createCodeRegionPtr, NIL)
  }

  /**
   * Returns the code region start tag (without comment delimiter).
   */
  public final fun getCodeRegionStartTag(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCodeRegionStartTagPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the code region end tag (without comment delimiter).
   */
  public final fun getCodeRegionEndTag(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCodeRegionEndTagPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Sets the code region start and end tags (without comment delimiter).
   */
  @JvmOverloads
  public final fun setCodeRegionTags(start: String = "region", end: String = "endregion"): Unit {
    Internals.writeArguments(STRING to start, STRING to end)
    Internals.callMethod(rawPtr, MethodBindings.setCodeRegionTagsPtr, NIL)
  }

  /**
   * Returns whether the line at the specified index is a code region start.
   */
  public final fun isLineCodeRegionStart(line: Int): Boolean {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isLineCodeRegionStartPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns whether the line at the specified index is a code region end.
   */
  public final fun isLineCodeRegionEnd(line: Int): Boolean {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isLineCodeRegionEndPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Defines a string delimiter from [startKey] to [endKey]. Both keys should be symbols, and
   * [startKey] must not be shared with other delimiters.
   * If [lineOnly] is `true` or [endKey] is an empty [String], the region does not carry over to the
   * next line.
   */
  @JvmOverloads
  public final fun addStringDelimiter(
    startKey: String,
    endKey: String,
    lineOnly: Boolean = false,
  ): Unit {
    Internals.writeArguments(STRING to startKey, STRING to endKey, BOOL to lineOnly)
    Internals.callMethod(rawPtr, MethodBindings.addStringDelimiterPtr, NIL)
  }

  /**
   * Removes the string delimiter with [startKey].
   */
  public final fun removeStringDelimiter(startKey: String): Unit {
    Internals.writeArguments(STRING to startKey)
    Internals.callMethod(rawPtr, MethodBindings.removeStringDelimiterPtr, NIL)
  }

  /**
   * Returns `true` if string [startKey] exists.
   */
  public final fun hasStringDelimiter(startKey: String): Boolean {
    Internals.writeArguments(STRING to startKey)
    Internals.callMethod(rawPtr, MethodBindings.hasStringDelimiterPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setStringDelimiters(stringDelimiters: VariantArray<String>): Unit {
    Internals.writeArguments(ARRAY to stringDelimiters)
    Internals.callMethod(rawPtr, MethodBindings.setStringDelimitersPtr, NIL)
  }

  /**
   * Removes all string delimiters.
   */
  public final fun clearStringDelimiters(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearStringDelimitersPtr, NIL)
  }

  public final fun getStringDelimiters(): VariantArray<String> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getStringDelimitersPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<String>)
  }

  /**
   * Returns the delimiter index if [line] [column] is in a string. If [column] is not provided,
   * will return the delimiter index if the entire [line] is a string. Otherwise `-1`.
   */
  @JvmOverloads
  public final fun isInString(line: Int, column: Int = -1): Int {
    Internals.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isInStringPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adds a comment delimiter from [startKey] to [endKey]. Both keys should be symbols, and
   * [startKey] must not be shared with other delimiters.
   * If [lineOnly] is `true` or [endKey] is an empty [String], the region does not carry over to the
   * next line.
   */
  @JvmOverloads
  public final fun addCommentDelimiter(
    startKey: String,
    endKey: String,
    lineOnly: Boolean = false,
  ): Unit {
    Internals.writeArguments(STRING to startKey, STRING to endKey, BOOL to lineOnly)
    Internals.callMethod(rawPtr, MethodBindings.addCommentDelimiterPtr, NIL)
  }

  /**
   * Removes the comment delimiter with [startKey].
   */
  public final fun removeCommentDelimiter(startKey: String): Unit {
    Internals.writeArguments(STRING to startKey)
    Internals.callMethod(rawPtr, MethodBindings.removeCommentDelimiterPtr, NIL)
  }

  /**
   * Returns `true` if comment [startKey] exists.
   */
  public final fun hasCommentDelimiter(startKey: String): Boolean {
    Internals.writeArguments(STRING to startKey)
    Internals.callMethod(rawPtr, MethodBindings.hasCommentDelimiterPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCommentDelimiters(commentDelimiters: VariantArray<String>): Unit {
    Internals.writeArguments(ARRAY to commentDelimiters)
    Internals.callMethod(rawPtr, MethodBindings.setCommentDelimitersPtr, NIL)
  }

  /**
   * Removes all comment delimiters.
   */
  public final fun clearCommentDelimiters(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearCommentDelimitersPtr, NIL)
  }

  public final fun getCommentDelimiters(): VariantArray<String> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCommentDelimitersPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<String>)
  }

  /**
   * Returns delimiter index if [line] [column] is in a comment. If [column] is not provided, will
   * return delimiter index if the entire [line] is a comment. Otherwise `-1`.
   */
  @JvmOverloads
  public final fun isInComment(line: Int, column: Int = -1): Int {
    Internals.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isInCommentPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Gets the start key for a string or comment region index.
   */
  public final fun getDelimiterStartKey(delimiterIndex: Int): String {
    Internals.writeArguments(LONG to delimiterIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getDelimiterStartKeyPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Gets the end key for a string or comment region index.
   */
  public final fun getDelimiterEndKey(delimiterIndex: Int): String {
    Internals.writeArguments(LONG to delimiterIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getDelimiterEndKeyPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * If [line] [column] is in a string or comment, returns the start position of the region. If not
   * or no start could be found, both [Vector2] values will be `-1`.
   */
  public final fun getDelimiterStartPosition(line: Int, column: Int): Vector2 {
    Internals.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getDelimiterStartPositionPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * If [line] [column] is in a string or comment, returns the end position of the region. If not or
   * no end could be found, both [Vector2] values will be `-1`.
   */
  public final fun getDelimiterEndPosition(line: Int, column: Int): Vector2 {
    Internals.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getDelimiterEndPositionPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets the code hint text. Pass an empty string to clear.
   */
  public final fun setCodeHint(codeHint: String): Unit {
    Internals.writeArguments(STRING to codeHint)
    Internals.callMethod(rawPtr, MethodBindings.setCodeHintPtr, NIL)
  }

  /**
   * Sets if the code hint should draw below the text.
   */
  public final fun setCodeHintDrawBelow(drawBelow: Boolean): Unit {
    Internals.writeArguments(BOOL to drawBelow)
    Internals.callMethod(rawPtr, MethodBindings.setCodeHintDrawBelowPtr, NIL)
  }

  /**
   * Returns the full text with char `0xFFFF` at the caret location.
   */
  public final fun getTextForCodeCompletion(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTextForCodeCompletionPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Emits [signal code_completion_requested], if [force] is `true` will bypass all checks.
   * Otherwise will check that the caret is in a word or in front of a prefix. Will ignore the request
   * if all current options are of type file path, node path, or signal.
   */
  @JvmOverloads
  public final fun requestCodeCompletion(force: Boolean = false): Unit {
    Internals.writeArguments(BOOL to force)
    Internals.callMethod(rawPtr, MethodBindings.requestCodeCompletionPtr, NIL)
  }

  /**
   * Submits an item to the queue of potential candidates for the autocomplete menu. Call
   * [updateCodeCompletionOptions] to update the list.
   * [location] indicates location of the option relative to the location of the code completion
   * query. See [CodeEdit.CodeCompletionLocation] for how to set this value.
   * **Note:** This list will replace all current candidates.
   */
  @JvmOverloads
  public final fun addCodeCompletionOption(
    type: CodeCompletionKind,
    displayText: String,
    insertText: String,
    textColor: Color = Color(Color(1, 1, 1, 1)),
    icon: Resource? = null,
    `value`: Any? = null,
    location: Int = 1024,
  ): Unit {
    Internals.writeArguments(LONG to type.id, STRING to displayText, STRING to insertText, COLOR to textColor, OBJECT to icon, ANY to value, LONG to location.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addCodeCompletionOptionPtr, NIL)
  }

  /**
   * Submits all completion options added with [addCodeCompletionOption]. Will try to force the
   * autocomplete menu to popup, if [force] is `true`.
   * **Note:** This will replace all current candidates.
   */
  public final fun updateCodeCompletionOptions(force: Boolean): Unit {
    Internals.writeArguments(BOOL to force)
    Internals.callMethod(rawPtr, MethodBindings.updateCodeCompletionOptionsPtr, NIL)
  }

  /**
   * Gets all completion options, see [getCodeCompletionOption] for return content.
   */
  public final fun getCodeCompletionOptions(): VariantArray<Dictionary<Any?, Any?>> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCodeCompletionOptionsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
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
  public final fun getCodeCompletionOption(index: Int): Dictionary<Any?, Any?> {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getCodeCompletionOptionPtr, DICTIONARY)
    return (Internals.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Gets the index of the current selected completion option.
   */
  public final fun getCodeCompletionSelectedIndex(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCodeCompletionSelectedIndexPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the current selected completion option.
   */
  public final fun setCodeCompletionSelectedIndex(index: Int): Unit {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setCodeCompletionSelectedIndexPtr, NIL)
  }

  /**
   * Inserts the selected entry into the text. If [replace] is `true`, any existing text is replaced
   * rather than merged.
   */
  @JvmOverloads
  public final fun confirmCodeCompletion(replace: Boolean = false): Unit {
    Internals.writeArguments(BOOL to replace)
    Internals.callMethod(rawPtr, MethodBindings.confirmCodeCompletionPtr, NIL)
  }

  /**
   * Cancels the autocomplete menu.
   */
  public final fun cancelCodeCompletion(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.cancelCodeCompletionPtr, NIL)
  }

  public final fun setCodeCompletionEnabled(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setCodeCompletionEnabledPtr, NIL)
  }

  public final fun isCodeCompletionEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isCodeCompletionEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCodeCompletionPrefixes(prefixes: VariantArray<String>): Unit {
    Internals.writeArguments(ARRAY to prefixes)
    Internals.callMethod(rawPtr, MethodBindings.setCodeCompletionPrefixesPtr, NIL)
  }

  public final fun getCodeCompletionPrefixes(): VariantArray<String> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCodeCompletionPrefixesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<String>)
  }

  public final fun setLineLengthGuidelines(guidelineColumns: VariantArray<Long>): Unit {
    Internals.writeArguments(ARRAY to guidelineColumns)
    Internals.callMethod(rawPtr, MethodBindings.setLineLengthGuidelinesPtr, NIL)
  }

  public final fun getLineLengthGuidelines(): VariantArray<Long> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLineLengthGuidelinesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Long>)
  }

  public final fun setSymbolLookupOnClickEnabled(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setSymbolLookupOnClickEnabledPtr, NIL)
  }

  public final fun isSymbolLookupOnClickEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isSymbolLookupOnClickEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the full text with char `0xFFFF` at the cursor location.
   */
  public final fun getTextForSymbolLookup(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTextForSymbolLookupPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the full text with char `0xFFFF` at the specified location.
   */
  public final fun getTextWithCursorChar(line: Int, column: Int): String {
    Internals.writeArguments(LONG to line.toLong(), LONG to column.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getTextWithCursorCharPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Sets the symbol emitted by [signal symbol_validate] as a valid lookup.
   */
  public final fun setSymbolLookupWordAsValid(valid: Boolean): Unit {
    Internals.writeArguments(BOOL to valid)
    Internals.callMethod(rawPtr, MethodBindings.setSymbolLookupWordAsValidPtr, NIL)
  }

  /**
   * Moves all lines up that are selected or have a caret on them.
   */
  public final fun moveLinesUp(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.moveLinesUpPtr, NIL)
  }

  /**
   * Moves all lines down that are selected or have a caret on them.
   */
  public final fun moveLinesDown(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.moveLinesDownPtr, NIL)
  }

  /**
   * Deletes all lines that are selected or have a caret on them.
   */
  public final fun deleteLines(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.deleteLinesPtr, NIL)
  }

  /**
   * Duplicates all selected text and duplicates all lines with a caret on them.
   */
  public final fun duplicateSelection(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.duplicateSelectionPtr, NIL)
  }

  /**
   * Duplicates all lines currently selected with any caret. Duplicates the entire line beneath the
   * current one no matter where the caret is within the line.
   */
  public final fun duplicateLines(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.duplicateLinesPtr, NIL)
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
        Internals.getMethodBindPtr("CodeEdit", "set_indent_size", 1286410249)

    public val getIndentSizePtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_indent_size", 3905245786)

    public val setIndentUsingSpacesPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_indent_using_spaces", 2586408642)

    public val isIndentUsingSpacesPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "is_indent_using_spaces", 36873697)

    public val setAutoIndentEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_auto_indent_enabled", 2586408642)

    public val isAutoIndentEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "is_auto_indent_enabled", 36873697)

    public val setAutoIndentPrefixesPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_auto_indent_prefixes", 381264803)

    public val getAutoIndentPrefixesPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_auto_indent_prefixes", 3995934104)

    public val doIndentPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "do_indent", 3218959716)

    public val indentLinesPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "indent_lines", 3218959716)

    public val unindentLinesPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "unindent_lines", 3218959716)

    public val convertIndentPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "convert_indent", 423910286)

    public val setAutoBraceCompletionEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_auto_brace_completion_enabled", 2586408642)

    public val isAutoBraceCompletionEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "is_auto_brace_completion_enabled", 36873697)

    public val setHighlightMatchingBracesEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_highlight_matching_braces_enabled", 2586408642)

    public val isHighlightMatchingBracesEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "is_highlight_matching_braces_enabled", 36873697)

    public val addAutoBraceCompletionPairPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "add_auto_brace_completion_pair", 3186203200)

    public val setAutoBraceCompletionPairsPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_auto_brace_completion_pairs", 4155329257)

    public val getAutoBraceCompletionPairsPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_auto_brace_completion_pairs", 3102165223)

    public val hasAutoBraceCompletionOpenKeyPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "has_auto_brace_completion_open_key", 3927539163)

    public val hasAutoBraceCompletionCloseKeyPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "has_auto_brace_completion_close_key", 3927539163)

    public val getAutoBraceCompletionCloseKeyPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_auto_brace_completion_close_key", 3135753539)

    public val setDrawBreakpointsGutterPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_draw_breakpoints_gutter", 2586408642)

    public val isDrawingBreakpointsGutterPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "is_drawing_breakpoints_gutter", 36873697)

    public val setDrawBookmarksGutterPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_draw_bookmarks_gutter", 2586408642)

    public val isDrawingBookmarksGutterPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "is_drawing_bookmarks_gutter", 36873697)

    public val setDrawExecutingLinesGutterPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_draw_executing_lines_gutter", 2586408642)

    public val isDrawingExecutingLinesGutterPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "is_drawing_executing_lines_gutter", 36873697)

    public val setLineAsBreakpointPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_line_as_breakpoint", 300928843)

    public val isLineBreakpointedPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "is_line_breakpointed", 1116898809)

    public val clearBreakpointedLinesPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "clear_breakpointed_lines", 3218959716)

    public val getBreakpointedLinesPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_breakpointed_lines", 1930428628)

    public val setLineAsBookmarkedPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_line_as_bookmarked", 300928843)

    public val isLineBookmarkedPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "is_line_bookmarked", 1116898809)

    public val clearBookmarkedLinesPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "clear_bookmarked_lines", 3218959716)

    public val getBookmarkedLinesPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_bookmarked_lines", 1930428628)

    public val setLineAsExecutingPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_line_as_executing", 300928843)

    public val isLineExecutingPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "is_line_executing", 1116898809)

    public val clearExecutingLinesPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "clear_executing_lines", 3218959716)

    public val getExecutingLinesPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_executing_lines", 1930428628)

    public val setDrawLineNumbersPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_draw_line_numbers", 2586408642)

    public val isDrawLineNumbersEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "is_draw_line_numbers_enabled", 36873697)

    public val setLineNumbersZeroPaddedPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_line_numbers_zero_padded", 2586408642)

    public val isLineNumbersZeroPaddedPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "is_line_numbers_zero_padded", 36873697)

    public val setDrawFoldGutterPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_draw_fold_gutter", 2586408642)

    public val isDrawingFoldGutterPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "is_drawing_fold_gutter", 36873697)

    public val setLineFoldingEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_line_folding_enabled", 2586408642)

    public val isLineFoldingEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "is_line_folding_enabled", 36873697)

    public val canFoldLinePtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "can_fold_line", 1116898809)

    public val foldLinePtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "fold_line", 1286410249)

    public val unfoldLinePtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "unfold_line", 1286410249)

    public val foldAllLinesPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "fold_all_lines", 3218959716)

    public val unfoldAllLinesPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "unfold_all_lines", 3218959716)

    public val toggleFoldableLinePtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "toggle_foldable_line", 1286410249)

    public val toggleFoldableLinesAtCaretsPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "toggle_foldable_lines_at_carets", 3218959716)

    public val isLineFoldedPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "is_line_folded", 1116898809)

    public val getFoldedLinesPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_folded_lines", 3995934104)

    public val createCodeRegionPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "create_code_region", 3218959716)

    public val getCodeRegionStartTagPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_code_region_start_tag", 201670096)

    public val getCodeRegionEndTagPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_code_region_end_tag", 201670096)

    public val setCodeRegionTagsPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_code_region_tags", 708800718)

    public val isLineCodeRegionStartPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "is_line_code_region_start", 1116898809)

    public val isLineCodeRegionEndPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "is_line_code_region_end", 1116898809)

    public val addStringDelimiterPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "add_string_delimiter", 3146098955)

    public val removeStringDelimiterPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "remove_string_delimiter", 83702148)

    public val hasStringDelimiterPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "has_string_delimiter", 3927539163)

    public val setStringDelimitersPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_string_delimiters", 381264803)

    public val clearStringDelimitersPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "clear_string_delimiters", 3218959716)

    public val getStringDelimitersPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_string_delimiters", 3995934104)

    public val isInStringPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "is_in_string", 688195400)

    public val addCommentDelimiterPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "add_comment_delimiter", 3146098955)

    public val removeCommentDelimiterPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "remove_comment_delimiter", 83702148)

    public val hasCommentDelimiterPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "has_comment_delimiter", 3927539163)

    public val setCommentDelimitersPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_comment_delimiters", 381264803)

    public val clearCommentDelimitersPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "clear_comment_delimiters", 3218959716)

    public val getCommentDelimitersPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_comment_delimiters", 3995934104)

    public val isInCommentPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "is_in_comment", 688195400)

    public val getDelimiterStartKeyPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_delimiter_start_key", 844755477)

    public val getDelimiterEndKeyPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_delimiter_end_key", 844755477)

    public val getDelimiterStartPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_delimiter_start_position", 3016396712)

    public val getDelimiterEndPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_delimiter_end_position", 3016396712)

    public val setCodeHintPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_code_hint", 83702148)

    public val setCodeHintDrawBelowPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_code_hint_draw_below", 2586408642)

    public val getTextForCodeCompletionPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_text_for_code_completion", 201670096)

    public val requestCodeCompletionPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "request_code_completion", 107499316)

    public val addCodeCompletionOptionPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "add_code_completion_option", 3944379502)

    public val updateCodeCompletionOptionsPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "update_code_completion_options", 2586408642)

    public val getCodeCompletionOptionsPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_code_completion_options", 3995934104)

    public val getCodeCompletionOptionPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_code_completion_option", 3485342025)

    public val getCodeCompletionSelectedIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_code_completion_selected_index", 3905245786)

    public val setCodeCompletionSelectedIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_code_completion_selected_index", 1286410249)

    public val confirmCodeCompletionPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "confirm_code_completion", 107499316)

    public val cancelCodeCompletionPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "cancel_code_completion", 3218959716)

    public val setCodeCompletionEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_code_completion_enabled", 2586408642)

    public val isCodeCompletionEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "is_code_completion_enabled", 36873697)

    public val setCodeCompletionPrefixesPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_code_completion_prefixes", 381264803)

    public val getCodeCompletionPrefixesPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_code_completion_prefixes", 3995934104)

    public val setLineLengthGuidelinesPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_line_length_guidelines", 381264803)

    public val getLineLengthGuidelinesPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_line_length_guidelines", 3995934104)

    public val setSymbolLookupOnClickEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_symbol_lookup_on_click_enabled", 2586408642)

    public val isSymbolLookupOnClickEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "is_symbol_lookup_on_click_enabled", 36873697)

    public val getTextForSymbolLookupPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_text_for_symbol_lookup", 201670096)

    public val getTextWithCursorCharPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "get_text_with_cursor_char", 1391810591)

    public val setSymbolLookupWordAsValidPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "set_symbol_lookup_word_as_valid", 2586408642)

    public val moveLinesUpPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "move_lines_up", 3218959716)

    public val moveLinesDownPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "move_lines_down", 3218959716)

    public val deleteLinesPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "delete_lines", 3218959716)

    public val duplicateSelectionPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "duplicate_selection", 3218959716)

    public val duplicateLinesPtr: VoidPtr =
        Internals.getMethodBindPtr("CodeEdit", "duplicate_lines", 3218959716)
  }
}
