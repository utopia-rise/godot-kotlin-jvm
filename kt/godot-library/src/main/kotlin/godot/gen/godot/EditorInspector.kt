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

  open fun _editRequestChange(arg0: Object, arg1: String) {
  }

  open fun _featureProfileChanged() {
  }

  open fun _filterChanged(arg0: String) {
  }

  open fun _multiplePropertiesChanged(arg0: PoolStringArray, arg1: VariantArray<Any?>) {
  }

  open fun _nodeRemoved(arg0: Node) {
  }

  open fun _objectIdSelected(arg0: String, arg1: Long) {
  }

  open fun _propertyChanged(
    arg0: String,
    arg1: Any?,
    arg2: String = "",
    arg3: Boolean = false
  ) {
  }

  open fun _propertyChangedUpdateAll(
    arg0: String,
    arg1: Any?,
    arg2: String,
    arg3: Boolean
  ) {
  }

  open fun _propertyChecked(arg0: String, arg1: Boolean) {
  }

  open fun _propertyKeyed(arg0: String, arg1: Boolean) {
  }

  open fun _propertyKeyedWithValue(
    arg0: String,
    arg1: Any?,
    arg2: Boolean
  ) {
  }

  open fun _propertySelected(arg0: String, arg1: Long) {
  }

  open fun _resourceSelected(arg0: String, arg1: Resource) {
  }

  open fun _vscrollChanged(arg0: Double) {
  }

  open fun refresh() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINSPECTOR_REFRESH, NIL)
  }
}
