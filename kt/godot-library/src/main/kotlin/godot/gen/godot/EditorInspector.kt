// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.NIL
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class EditorInspector : ScrollContainer() {
  val objectIdSelected: Signal1<Long> by signal("id")

  val propertyEdited: Signal1<String> by signal("property")

  val propertyKeyed: Signal1<String> by signal("property")

  val propertySelected: Signal1<String> by signal("property")

  val propertyToggled: Signal2<String, Boolean> by signal("property", "checked")

  val resourceSelected: Signal2<Object, String> by signal("res", "prop")

  val restartRequested: Signal0 by signal()

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_EDITORINSPECTOR)

  open fun _edit_request_change(arg0: Object, arg1: String) {
  }

  open fun _feature_profile_changed() {
  }

  open fun _filter_changed(arg0: String) {
  }

  open fun _multiple_properties_changed(arg0: PoolStringArray, arg1: VariantArray<Any?>) {
  }

  open fun _node_removed(arg0: Node) {
  }

  open fun _object_id_selected(arg0: String, arg1: Long) {
  }

  open fun _property_changed(
    arg0: String,
    arg1: Any,
    arg2: String = "",
    arg3: Boolean = false
  ) {
  }

  open fun _property_changed_update_all(
    arg0: String,
    arg1: Any,
    arg2: String,
    arg3: Boolean
  ) {
  }

  open fun _property_checked(arg0: String, arg1: Boolean) {
  }

  open fun _property_keyed(arg0: String, arg1: Boolean) {
  }

  open fun _property_keyed_with_value(
    arg0: String,
    arg1: Any,
    arg2: Boolean
  ) {
  }

  open fun _property_selected(arg0: String, arg1: Long) {
  }

  open fun _resource_selected(arg0: String, arg1: Resource) {
  }

  open fun _vscroll_changed(arg0: Double) {
  }

  open fun refresh() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINSPECTOR_REFRESH, NIL)
  }

  companion object
}
