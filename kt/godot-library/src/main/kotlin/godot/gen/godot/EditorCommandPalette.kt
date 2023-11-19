// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.TypeManager
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Godot editor's command palette.
 *
 * Object that holds all the available Commands and their shortcuts text. These Commands can be accessed through **Editor > Command Palette** menu.
 *
 * Command key names use slash delimiters to distinguish sections, for example: `"example/command1"` then `example` will be the section name.
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
 * Callable commandCallable = new Callable(this, MethodName.ExternalCommand);
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
public open class EditorCommandPalette internal constructor() : ConfirmationDialog() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORCOMMANDPALETTE, scriptIndex)
    return true
  }

  /**
   * Adds a custom command to EditorCommandPalette.
   *
   * - [commandName]: [godot.String] (Name of the **Command**. This is displayed to the user.)
   *
   * - [keyName]: [godot.String] (Name of the key for a particular **Command**. This is used to uniquely identify the **Command**.)
   *
   * - [bindedCallable]: [godot.Callable] (Callable of the **Command**. This will be executed when the **Command** is selected.)
   *
   * - [shortcutText]: [godot.String] (Shortcut text of the **Command** if available.)
   */
  @JvmOverloads
  public fun addCommand(
    commandName: String,
    keyName: String,
    bindedCallable: Callable,
    shortcutText: String = "None",
  ): Unit {
    TransferContext.writeArguments(STRING to commandName, STRING to keyName, CALLABLE to bindedCallable, STRING to shortcutText)
    TransferContext.callMethod(rawPtr, MethodBindings.addCommandPtr, NIL)
  }

  /**
   * Removes the custom command from EditorCommandPalette.
   *
   * - [keyName]: [godot.String] (Name of the key for a particular **Command**.)
   */
  public fun removeCommand(keyName: String): Unit {
    TransferContext.writeArguments(STRING to keyName)
    TransferContext.callMethod(rawPtr, MethodBindings.removeCommandPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val addCommandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorCommandPalette", "add_command")

    public val removeCommandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorCommandPalette", "remove_command")
  }
}
