// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Godot editor's script editor.
 *
 * **Note:** This class shouldn't be instantiated directly. Instead, access the singleton using [godot.EditorInterface.getScriptEditor].
 */
@GodotBaseType
public open class ScriptEditor internal constructor() : PanelContainer() {
  /**
   * Emitted when user changed active script. Argument is a freshly activated [godot.Script].
   */
  public val editorScriptChanged: Signal1<Script> by signal("script")

  /**
   * Emitted when editor is about to close the active script. Argument is a [godot.Script] that is going to be closed.
   */
  public val scriptClose: Signal1<Script> by signal("script")

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SCRIPTEDITOR, scriptIndex)
    return true
  }

  /**
   * Returns the [godot.ScriptEditorBase] object that the user is currently editing.
   */
  public fun getCurrentEditor(): ScriptEditorBase? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_GET_CURRENT_EDITOR,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ScriptEditorBase?)
  }

  /**
   * Returns an array with all [godot.ScriptEditorBase] objects which are currently open in editor.
   */
  public fun getOpenScriptEditors(): VariantArray<ScriptEditorBase> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_GET_OPEN_SCRIPT_EDITORS, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<ScriptEditorBase>)
  }

  /**
   * Registers the [godot.EditorSyntaxHighlighter] to the editor, the [godot.EditorSyntaxHighlighter] will be available on all open scripts.
   *
   * **Note:** Does not apply to scripts that are already opened.
   */
  public fun registerSyntaxHighlighter(syntaxHighlighter: EditorSyntaxHighlighter): Unit {
    TransferContext.writeArguments(OBJECT to syntaxHighlighter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_REGISTER_SYNTAX_HIGHLIGHTER, NIL)
  }

  /**
   * Unregisters the [godot.EditorSyntaxHighlighter] from the editor.
   *
   * **Note:** The [godot.EditorSyntaxHighlighter] will still be applied to scripts that are already opened.
   */
  public fun unregisterSyntaxHighlighter(syntaxHighlighter: EditorSyntaxHighlighter): Unit {
    TransferContext.writeArguments(OBJECT to syntaxHighlighter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_UNREGISTER_SYNTAX_HIGHLIGHTER, NIL)
  }

  /**
   * Goes to the specified line in the current script.
   */
  public fun gotoLine(lineNumber: Int): Unit {
    TransferContext.writeArguments(LONG to lineNumber.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_GOTO_LINE, NIL)
  }

  /**
   * Returns a [godot.Script] that is currently active in editor.
   */
  public fun getCurrentScript(): Script? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_GET_CURRENT_SCRIPT,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Script?)
  }

  /**
   * Returns an array with all [godot.Script] objects which are currently open in editor.
   */
  public fun getOpenScripts(): VariantArray<Script> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_GET_OPEN_SCRIPTS,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Script>)
  }

  /**
   * Opens the script create dialog. The script will extend [baseName]. The file extension can be omitted from [basePath]. It will be added based on the selected scripting language.
   */
  public fun openScriptCreateDialog(baseName: String, basePath: String): Unit {
    TransferContext.writeArguments(STRING to baseName, STRING to basePath)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_OPEN_SCRIPT_CREATE_DIALOG, NIL)
  }

  public companion object
}
