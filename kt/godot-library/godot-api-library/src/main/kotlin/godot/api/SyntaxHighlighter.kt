// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Dictionary
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Any
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for syntax highlighters. Provides syntax highlighting data to a [TextEdit]. The
 * associated [TextEdit] will call into the [SyntaxHighlighter] on an as-needed basis.
 * **Note:** A [SyntaxHighlighter] instance should not be used across multiple [TextEdit] nodes.
 */
@GodotBaseType
public open class SyntaxHighlighter : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(655, scriptIndex)
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
    throw NotImplementedError("_clearHighlightingCache is not implemented for SyntaxHighlighter")
  }

  /**
   * Virtual method which can be overridden to update any local caches.
   */
  public open fun _updateCache(): Unit {
    throw NotImplementedError("_updateCache is not implemented for SyntaxHighlighter")
  }

  /**
   * Returns the syntax highlighting data for the line at index [line]. If the line is not cached,
   * calls [_getLineSyntaxHighlighting] first to calculate the data.
   * Each entry is a column number containing a nested [Dictionary]. The column number denotes the
   * start of a region, the region will end if another region is found, or at the end of the line. The
   * nested [Dictionary] contains the data for that region. Currently only the key `"color"` is
   * supported.
   * **Example:** Possible return value. This means columns `0` to `4` should be red, and columns
   * `5` to the end of the line should be green:
   * [codeblock]
   * {
   *     0: {
   *         "color": Color(1, 0, 0)
   *     },
   *     5: {
   *         "color": Color(0, 1, 0)
   *     }
   * }
   * [/codeblock]
   */
  public final fun getLineSyntaxHighlighting(line: Int): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLineSyntaxHighlightingPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Clears then updates the [SyntaxHighlighter] caches. Override [_updateCache] for a callback.
   * **Note:** This is called automatically when the associated [TextEdit] node, updates its own
   * cache.
   */
  public final fun updateCache(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.updateCachePtr, NIL)
  }

  /**
   * Clears all cached syntax highlighting data.
   * Then calls overridable method [_clearHighlightingCache].
   */
  public final fun clearHighlightingCache(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearHighlightingCachePtr, NIL)
  }

  /**
   * Returns the associated [TextEdit] node.
   */
  public final fun getTextEdit(): TextEdit? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextEditPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as TextEdit?)
  }

  public companion object

  public object MethodBindings {
    internal val getLineSyntaxHighlightingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SyntaxHighlighter", "get_line_syntax_highlighting", 3554694381)

    internal val updateCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SyntaxHighlighter", "update_cache", 3218959716)

    internal val clearHighlightingCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SyntaxHighlighter", "clear_highlighting_cache", 3218959716)

    internal val getTextEditPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SyntaxHighlighter", "get_text_edit", 1893027089)
  }
}
