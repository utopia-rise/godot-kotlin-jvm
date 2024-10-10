// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_SYNTAXHIGHLIGHTER_INDEX: Int = 633

/**
 * Base class for syntax highlighters. Provides syntax highlighting data to a [TextEdit]. The
 * associated [TextEdit] will call into the [SyntaxHighlighter] on an as-needed basis.
 * **Note:** A [SyntaxHighlighter] instance should not be used across multiple [TextEdit] nodes.
 */
@GodotBaseType
public open class SyntaxHighlighter : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_SYNTAXHIGHLIGHTER_INDEX, scriptIndex)
  }

  /**
   * Virtual method which can be overridden to return syntax highlighting data.
   * See [getLineSyntaxHighlighting] for more details.
   */
  public open fun _getLineSyntaxHighlighting(line: Int): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_line_syntax_highlighting is not implemented for SyntaxHighlighter")
  }

  /**
   * Virtual method which can be overridden to clear any local caches.
   */
  public open fun _clearHighlightingCache(): Unit {
  }

  /**
   * Virtual method which can be overridden to update any local caches.
   */
  public open fun _updateCache(): Unit {
  }

  /**
   * Returns syntax highlighting data for a single line. If the line is not cached, calls
   * [_getLineSyntaxHighlighting] to calculate the data.
   * The return [Dictionary] is column number to [Dictionary]. The column number notes the start of
   * a region, the region will end if another region is found, or at the end of the line. The nested
   * [Dictionary] contains the data for that region, currently only the key "color" is supported.
   * **Example return:**
   * [codeblock]
   * var color_map = {
   *     0: {
   *         "color": Color(1, 0, 0)
   *     },
   *     5: {
   *         "color": Color(0, 1, 0)
   *     }
   * }
   * [/codeblock]
   * This will color columns 0-4 red, and columns 5-eol in green.
   */
  public final fun getLineSyntaxHighlighting(line: Int): Dictionary<Any?, Any?> {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getLineSyntaxHighlightingPtr, DICTIONARY)
    return (Internals.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Clears then updates the [SyntaxHighlighter] caches. Override [_updateCache] for a callback.
   * **Note:** This is called automatically when the associated [TextEdit] node, updates its own
   * cache.
   */
  public final fun updateCache(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.updateCachePtr, NIL)
  }

  /**
   * Clears all cached syntax highlighting data.
   * Then calls overridable method [_clearHighlightingCache].
   */
  public final fun clearHighlightingCache(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearHighlightingCachePtr, NIL)
  }

  /**
   * Returns the associated [TextEdit] node.
   */
  public final fun getTextEdit(): TextEdit? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTextEditPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as TextEdit?)
  }

  public companion object

  internal object MethodBindings {
    public val getLineSyntaxHighlightingPtr: VoidPtr =
        Internals.getMethodBindPtr("SyntaxHighlighter", "get_line_syntax_highlighting", 3554694381)

    public val updateCachePtr: VoidPtr =
        Internals.getMethodBindPtr("SyntaxHighlighter", "update_cache", 3218959716)

    public val clearHighlightingCachePtr: VoidPtr =
        Internals.getMethodBindPtr("SyntaxHighlighter", "clear_highlighting_cache", 3218959716)

    public val getTextEditPtr: VoidPtr =
        Internals.getMethodBindPtr("SyntaxHighlighter", "get_text_edit", 1893027089)
  }
}
