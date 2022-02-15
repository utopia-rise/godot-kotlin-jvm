// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.TransferContext
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Any
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Base Syntax highlighter resource for [godot.TextEdit].
 *
 * Base syntax highlighter resource all syntax highlighters extend from, provides syntax highlighting data to [godot.TextEdit].
 *
 * The associated [godot.TextEdit] node will call into the [godot.SyntaxHighlighter] on a as needed basis.
 *
 * **Note:** Each Syntax highlighter instance should not be shared across multiple [godot.TextEdit] nodes.
 */
@GodotBaseType
public open class SyntaxHighlighter : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SYNTAXHIGHLIGHTER)
  }

  /**
   * Virtual method which can be overridden to return syntax highlighting data.
   *
   * See [getLineSyntaxHighlighting] for more details.
   */
  public open fun _getLineSyntaxHighlighting(line: Long): Dictionary<Any?, Any?> {
    throw
        NotImplementedError("_get_line_syntax_highlighting is not implemented for SyntaxHighlighter")
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
  public open fun getLineSyntaxHighlighting(line: Long): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SYNTAXHIGHLIGHTER_GET_LINE_SYNTAX_HIGHLIGHTING, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Clears then updates the [godot.SyntaxHighlighter] caches. Override [_updateCache] for a callback.
   *
   * **Note:** This is called automatically when the associated [godot.TextEdit] node, updates its own cache.
   */
  public open fun updateCache(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SYNTAXHIGHLIGHTER_UPDATE_CACHE, NIL)
  }

  /**
   * Clears all cached syntax highlighting data.
   *
   * Then calls overridable method [_clearHighlightingCache].
   */
  public open fun clearHighlightingCache(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SYNTAXHIGHLIGHTER_CLEAR_HIGHLIGHTING_CACHE, NIL)
  }

  /**
   * Returns the associated [godot.TextEdit] node.
   */
  public open fun getTextEdit(): TextEdit? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SYNTAXHIGHLIGHTER_GET_TEXT_EDIT,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TextEdit?
  }

  public companion object
}
