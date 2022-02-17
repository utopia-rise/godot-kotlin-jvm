// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Godot editor's command palette.
 *
 * Object that holds all the available Commands and their shortcuts text. These Commands can be accessed through **Editor > Command Palette** menu.
 *
 * Command key names use slash delimiters to distinguish sections Example: `"example/command1"` then `example` will be the section name.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var command_palette = get_editor_interface().get_command_palette()
 *
 * # external_command is a function that will be called with the command is executed.
 *
 * var command_callable = Callable(self, "external_command").bind(arguments)
 *
 * command_palette.add_command("command", "test/command",command_callable)
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * EditorCommandPalette commandPalette = GetEditorInterface().GetCommandPalette();
 *
 * // ExternalCommand is a function that will be called with the command is executed.
 *
 * Callable commandCallable = new Callable(this, nameof(ExternalCommand));
 *
 * commandPalette.AddCommand("command", "test/command", commandCallable)
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * **Note:** This class shouldn't be instantiated directly. Instead, access the singleton using [godot.EditorInterface.getCommandPalette].
 */
@GodotBaseType
public open abstract class EditorCommandPalette : ConfirmationDialog() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORCOMMANDPALETTE)
  }

  /**
   * Adds a custom command to EditorCommandPalette.
   *
   * - `command_name`: [godot.String] (Name of the **Command**. This is displayed to the user.)
   *
   * - `key_name`: [godot.String] (Name of the key for a particular **Command**. This is used to uniquely identify the **Command**.)
   *
   * - `binded_callable`: [godot.Callable] (Callable of the **Command**. This will be executed when the **Command** is selected.)
   *
   * - `shortcut_text`: [godot.String] (Shortcut text of the **Command** if available.)
   */
  public open fun addCommand(
    commandName: String,
    keyName: String,
    bindedCallable: Callable,
    shortcutText: String = "None"
  ): Unit {
    TransferContext.writeArguments(STRING to commandName, STRING to keyName, OBJECT to
        bindedCallable, STRING to shortcutText)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORCOMMANDPALETTE_ADD_COMMAND,
        NIL)
  }

  /**
   * Removes the custom command from EditorCommandPalette.
   *
   * - `key_name`: [godot.String] (Name of the key for a particular **Command**.)
   */
  public open fun removeCommand(keyName: String): Unit {
    TransferContext.writeArguments(STRING to keyName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORCOMMANDPALETTE_REMOVE_COMMAND,
        NIL)
  }

  public companion object
}
