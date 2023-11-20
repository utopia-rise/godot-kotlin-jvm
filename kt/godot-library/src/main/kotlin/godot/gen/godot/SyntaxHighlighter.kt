// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.TypeManager
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for syntax highlighters. Provides syntax highlighting data to a [godot.TextEdit].
 *
 * Base class for syntax highlighters. Provides syntax highlighting data to a [godot.TextEdit]. The associated [godot.TextEdit] will call into the [godot.SyntaxHighlighter] on an as-needed basis.
 *
 * **Note:** A [godot.SyntaxHighlighter] instance should not be used across multiple [godot.TextEdit] nodes.
 */
@GodotBaseType
public open class SyntaxHighlighter : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SYNTAXHIGHLIGHTER, scriptIndex)
    return true
  }

  /**
   * Virtual method which can be overridden to return syntax highlighting data.
   *
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
   * Returns syntax highlighting data for a single line. If the line is not cached, calls [_getLineSyntaxHighlighting] to calculate the data.
   *
   * The return [godot.core.Dictionary] is column number to [godot.core.Dictionary]. The column number notes the start of a region, the region will end if another region is found, or at the end of the line. The nested [godot.core.Dictionary] contains the data for that region, currently only the key "color" is supported.
   *
   * **Example return:**
   *
   * ```
   * 				var color_map = {
   * 				    0: {
   * 				        "color": Color(1, 0, 0)
   * 				    },
   * 				    5: {
   * 				        "color": Color(0, 1, 0)
   * 				    }
   * 				}
   * 				```
   *
   * This will color columns 0-4 red, and columns 5-eol in green.
   */
  public fun getLineSyntaxHighlighting(line: Int): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineSyntaxHighlightingPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Clears then updates the [godot.SyntaxHighlighter] caches. Override [_updateCache] for a callback.
   *
   * **Note:** This is called automatically when the associated [godot.TextEdit] node, updates its own cache.
   */
  public fun updateCache(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.updateCachePtr, NIL)
  }

  /**
   * Clears all cached syntax highlighting data.
   *
   * Then calls overridable method [_clearHighlightingCache].
   */
  public fun clearHighlightingCache(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearHighlightingCachePtr, NIL)
  }

  /**
   * Returns the associated [godot.TextEdit] node.
   */
  public fun getTextEdit(): TextEdit? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextEditPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TextEdit?)
  }

  public companion object

  internal object MethodBindings {
    public val _getLineSyntaxHighlightingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SyntaxHighlighter", "_get_line_syntax_highlighting")

    public val _clearHighlightingCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SyntaxHighlighter", "_clear_highlighting_cache")

    public val _updateCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SyntaxHighlighter", "_update_cache")

    public val getLineSyntaxHighlightingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SyntaxHighlighter", "get_line_syntax_highlighting")

    public val updateCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SyntaxHighlighter", "update_cache")

    public val clearHighlightingCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SyntaxHighlighter", "clear_highlighting_cache")

    public val getTextEditPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SyntaxHighlighter", "get_text_edit")
  }
}
