// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class SpinBox : Range() {
  open var align: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_GET_ALIGN, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_SET_ALIGN, NIL)
    }

  open var editable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_GET_EDITABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_SET_EDITABLE, NIL)
    }

  open var prefix: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_GET_PREFIX, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_SET_PREFIX, NIL)
    }

  open var suffix: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_GET_SUFFIX, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_SET_SUFFIX, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_SPINBOX)

  override fun _guiInput(event: InputEvent) {
  }

  open fun _lineEditFocusExit() {
  }

  open fun _lineEditInput(arg0: InputEvent) {
  }

  open fun _rangeClickTimeout() {
  }

  open fun _textEntered(arg0: String) {
  }

  open fun apply() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_APPLY, NIL)
  }

  open fun getLineEdit(): LineEdit? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_GET_LINE_EDIT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as LineEdit?
  }
}
