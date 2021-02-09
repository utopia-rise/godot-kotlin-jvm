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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class EditorSpinSlider : Range() {
  open var flat: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPINSLIDER_GET_FLAT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPINSLIDER_SET_FLAT, NIL)
    }

  open var label: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPINSLIDER_GET_LABEL,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPINSLIDER_SET_LABEL, NIL)
    }

  open var readOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPINSLIDER_GET_READ_ONLY,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPINSLIDER_SET_READ_ONLY,
          NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_EDITORSPINSLIDER)

  open fun _grabberGuiInput(arg0: InputEvent) {
  }

  open fun _grabberMouseEntered() {
  }

  open fun _grabberMouseExited() {
  }

  override fun _guiInput(event: InputEvent) {
  }

  open fun _valueFocusExited() {
  }

  open fun _valueInputClosed() {
  }

  open fun _valueInputEntered(arg0: String) {
  }
}
