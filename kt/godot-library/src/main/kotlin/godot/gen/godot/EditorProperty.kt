// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class EditorProperty : Container() {
  val multiplePropertiesChanged: Signal2<PoolStringArray, VariantArray<Any?>> by
      signal("properties", "value")

  val objectIdSelected: Signal2<String, Long> by signal("property", "id")

  val propertyChanged: Signal2<String, Any> by signal("property", "value")

  val propertyChecked: Signal2<String, String> by signal("property", "bool")

  val propertyKeyed: Signal1<String> by signal("property")

  val propertyKeyedWithValue: Signal2<String, Any> by signal("property", "value")

  val resourceSelected: Signal2<String, Resource> by signal("path", "resource")

  val selected: Signal2<String, Long> by signal("path", "focusable_idx")

  open var checkable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_CHECKABLE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_SET_CHECKABLE, NIL)
    }

  open var checked: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_CHECKED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_SET_CHECKED, NIL)
    }

  open var drawRed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_DRAW_RED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_SET_DRAW_RED, NIL)
    }

  open var keying: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_KEYING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_SET_KEYING, NIL)
    }

  open var label: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_LABEL, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_SET_LABEL, NIL)
    }

  open var readOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_READ_ONLY,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_SET_READ_ONLY, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_EDITORPROPERTY)

  open fun _focusable_focused(arg0: Long) {
  }

  override fun _gui_input(event: InputEvent) {
  }

  open fun addFocusable(control: Control) {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_ADD_FOCUSABLE, NIL)
  }

  open fun emitChanged(
    property: String,
    value: Any,
    field: String = "",
    changing: Boolean = false
  ) {
    TransferContext.writeArguments(STRING to property, ANY to value, STRING to field, BOOL to
        changing)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_EMIT_CHANGED, NIL)
  }

  open fun getEditedObject(): Object? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_EDITED_OBJECT,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  open fun getEditedProperty(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_EDITED_PROPERTY,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getTooltipText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_TOOLTIP_TEXT,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun setBottomEditor(editor: Control) {
    TransferContext.writeArguments(OBJECT to editor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_SET_BOTTOM_EDITOR,
        NIL)
  }

  open fun update_property() {
  }

  companion object
}
