// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class EditorInspectorPlugin : Reference() {
  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_EDITORINSPECTORPLUGIN)

  open fun addCustomControl(control: Control) {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINSPECTORPLUGIN_ADD_CUSTOM_CONTROL, NIL)
  }

  open fun addPropertyEditor(property: String, editor: Control) {
    TransferContext.writeArguments(STRING to property, OBJECT to editor)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINSPECTORPLUGIN_ADD_PROPERTY_EDITOR, NIL)
  }

  open fun addPropertyEditorForMultipleProperties(
    label: String,
    properties: PoolStringArray,
    editor: Control
  ) {
    TransferContext.writeArguments(STRING to label, POOL_STRING_ARRAY to properties, OBJECT to
        editor)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINSPECTORPLUGIN_ADD_PROPERTY_EDITOR_FOR_MULTIPLE_PROPERTIES,
        NIL)
  }

  open fun can_handle(_object: Object): Boolean {
    throw NotImplementedError("can_handle is not implemented for EditorInspectorPlugin")
  }

  open fun parse_begin(_object: Object) {
  }

  open fun parse_category(_object: Object, category: String) {
  }

  open fun parse_end() {
  }

  open fun parse_property(
    _object: Object,
    type: Long,
    path: String,
    hint: Long,
    hintText: String,
    usage: Long
  ): Boolean {
    throw NotImplementedError("parse_property is not implemented for EditorInspectorPlugin")
  }
}
