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

  open fun _browseClassInTree() {
  }

  open fun _browsePath(arg0: Boolean, arg1: Boolean) {
  }

  open fun _builtInPressed() {
  }

  open fun _classNameChanged(arg0: String) {
  }

  open fun _create() {
  }

  open fun _fileSelected(arg0: String) {
  }

  open fun _langChanged(arg0: Long) {
  }

  open fun _parentNameChanged(arg0: String) {
  }

  open fun _pathChanged(arg0: String) {
  }

  open fun _pathEntered(arg0: String) {
  }

  open fun _pathHboxSorted() {
  }

  open fun _templateChanged(arg0: Long) {
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
