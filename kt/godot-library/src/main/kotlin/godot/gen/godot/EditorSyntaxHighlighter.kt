// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import kotlin.Any
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Base Syntax highlighter resource for the [godot.ScriptEditor].
 *
 * Base syntax highlighter resource all editor syntax highlighters extend from, it is used in the [godot.ScriptEditor].
 *
 * Add a syntax highlighter to an individual script by calling [godot.ScriptEditorBase.addSyntaxHighlighter]. To apply to all scripts on open, call [godot.ScriptEditor.registerSyntaxHighlighter]
 */
@GodotBaseType
public open class EditorSyntaxHighlighter internal constructor() : SyntaxHighlighter() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORSYNTAXHIGHLIGHTER)
  }

  /**
   * Virtual method which can be overridden to return the syntax highlighter name.
   */
  public open fun _getName(): String {
    throw NotImplementedError("_get_name·is·not·implemented·for·EditorSyntaxHighlighter")
  }

  /**
   * Virtual method which can be overridden to return the supported language names.
   */
  public open fun _getSupportedLanguages(): VariantArray<Any?> {
    throw NotImplementedError("_get_supported_languages·is·not·implemented·for·EditorSyntaxHighlighter")
  }

  public companion object
}
