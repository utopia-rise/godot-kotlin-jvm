// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class ScriptCreateDialog : ConfirmationDialog() {
  val scriptCreated: Signal1<Script> by signal("script")

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_SCRIPTCREATEDIALOG)

  open fun _browse_class_in_tree() {
  }

  open fun _browse_path(arg0: Boolean, arg1: Boolean) {
  }

  open fun _built_in_pressed() {
  }

  open fun _class_name_changed(arg0: String) {
  }

  open fun _create() {
  }

  open fun _file_selected(arg0: String) {
  }

  open fun _lang_changed(arg0: Long) {
  }

  open fun _parent_name_changed(arg0: String) {
  }

  open fun _path_changed(arg0: String) {
  }

  open fun _path_entered(arg0: String) {
  }

  open fun _path_hbox_sorted() {
  }

  open fun _template_changed(arg0: Long) {
  }

  open fun config(
    inherits: String,
    path: String,
    builtInEnabled: Boolean = true,
    loadEnabled: Boolean = true
  ) {
    TransferContext.writeArguments(STRING to inherits, STRING to path, BOOL to builtInEnabled, BOOL
        to loadEnabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTCREATEDIALOG_CONFIG, NIL)
  }
}
