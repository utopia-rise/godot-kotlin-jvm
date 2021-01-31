// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class AcceptDialog : WindowDialog() {
  val confirmed: Signal0 by signal()

  val customAction: Signal1<String> by signal("action")

  open var dialogAutowrap: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_GET_DIALOG_AUTOWRAP,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_SET_DIALOG_AUTOWRAP,
          NIL)
    }

  open var dialogHideOnOk: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_GET_DIALOG_HIDE_ON_OK, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_SET_DIALOG_HIDE_ON_OK, NIL)
    }

  open var dialogText: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_GET_DIALOG_TEXT,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_SET_DIALOG_TEXT, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_ACCEPTDIALOG)

  open fun _builtin_text_entered(arg0: String) {
  }

  open fun _custom_action(arg0: String) {
  }

  open fun _ok() {
  }

  open fun addButton(
    text: String,
    right: Boolean = false,
    action: String = ""
  ): Button? {
    TransferContext.writeArguments(STRING to text, BOOL to right, STRING to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_ADD_BUTTON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Button?
  }

  open fun addCancel(name: String): Button? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_ADD_CANCEL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Button?
  }

  open fun getLabel(): Label? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_GET_LABEL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Label?
  }

  open fun getOk(): Button? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_GET_OK, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Button?
  }

  open fun registerTextEnter(lineEdit: Node) {
    TransferContext.writeArguments(OBJECT to lineEdit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_REGISTER_TEXT_ENTER,
        NIL)
  }

  companion object
}
