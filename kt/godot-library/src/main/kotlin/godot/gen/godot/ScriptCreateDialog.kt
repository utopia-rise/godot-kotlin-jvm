// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Godot editor's popup dialog for creating new [godot.Script] files.
 *
 * The [godot.ScriptCreateDialog] creates script files according to a given template for a given scripting language. The standard use is to configure its fields prior to calling one of the [godot.Window.popup] methods.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * func _ready():
 *
 *     var dialog = ScriptCreateDialog.new();
 *
 *     dialog.config("Node", "res://new_node.gd") # For in-engine types.
 *
 *     dialog.config("\"res://base_node.gd\"", "res://derived_node.gd") # For script types.
 *
 *     dialog.popup_centered()
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * public override void _Ready()
 *
 * {
 *
 *     var dialog = new ScriptCreateDialog();
 *
 *     dialog.Config("Node", "res://NewNode.cs"); // For in-engine types.
 *
 *     dialog.Config("\"res://BaseNode.cs\"", "res://DerivedNode.cs"); // For script types.
 *
 *     dialog.PopupCentered();
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class ScriptCreateDialog internal constructor() : ConfirmationDialog() {
  /**
   * Emitted when the user clicks the OK button.
   */
  public val scriptCreated: Signal1<Script> by signal("script")

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SCRIPTCREATEDIALOG, scriptIndex)
    return true
  }

  /**
   * Prefills required fields to configure the ScriptCreateDialog for use.
   */
  @JvmOverloads
  public fun config(
    inherits: String,
    path: String,
    builtInEnabled: Boolean = true,
    loadEnabled: Boolean = true,
  ): Unit {
    TransferContext.writeArguments(STRING to inherits, STRING to path, BOOL to builtInEnabled, BOOL to loadEnabled)
    TransferContext.callMethod(rawPtr, MethodBindings.configPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val configPtr: VoidPtr = TypeManager.getMethodBindPtr("ScriptCreateDialog", "config")
  }
}
