// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Base editor for editing scripts in the [godot.ScriptEditor].
 *
 * Base editor for editing scripts in the [godot.ScriptEditor], this does not include documentation items.
 */
@GodotBaseType
public open class ScriptEditorBase internal constructor() : VBoxContainer() {
  /**
   * Emitted after script validation.
   */
  public val editedScriptChanged: Signal0 by signal()

  /**
   * Emitted when the user request to find and replace text in the file system.
   */
  public val replaceInFilesRequested: Signal1<String> by signal("text")

  /**
   * Emitted when the user request to search text in the file system.
   */
  public val searchInFilesRequested: Signal1<String> by signal("text")

  /**
   * Emitted when the user requests a specific documentation page.
   */
  public val goToHelp: Signal1<String> by signal("what")

  /**
   * Emitted when the user contextual goto and the item is in the same script.
   */
  public val requestSaveHistory: Signal0 by signal()

  /**
   * Emitted when the user requests to view a specific line of a script, similar to [goToMethod].
   */
  public val requestOpenScriptAtLine: Signal2<Object, Long> by signal("script", "line")

  /**
   * Emitted when the user requests contextual help.
   */
  public val requestHelp: Signal1<String> by signal("topic")

  /**
   * Emitted after script validation or when the edited resource has changed.
   */
  public val nameChanged: Signal0 by signal()

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SCRIPTEDITORBASE)
  }

  /**
   * Returns the underlying [godot.Control] used for editing scripts. For text scripts, this is a [godot.CodeEdit].
   */
  public fun getBaseEditor(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITORBASE_GET_BASE_EDITOR,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Control?
  }

  /**
   * Adds a [godot.EditorSyntaxHighlighter] to the open script.
   */
  public fun addSyntaxHighlighter(highlighter: EditorSyntaxHighlighter): Unit {
    TransferContext.writeArguments(OBJECT to highlighter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCRIPTEDITORBASE_ADD_SYNTAX_HIGHLIGHTER, NIL)
  }

  public companion object
}
