// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Any
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
open class VisualScriptNode : Resource() {
  val portsChanged: Signal0 by signal()

  override fun __new() {
    callConstructor(ENGINECLASS_VISUALSCRIPTNODE)
  }

  open fun _getDefaultInputValues(): VariantArray<Any?> {
    throw NotImplementedError("_get_default_input_values is not implemented for VisualScriptNode")
  }

  open fun _setDefaultInputValues(values: VariantArray<Any?>) {
  }

  open fun getDefaultInputValue(portIdx: Long): Any? {
    TransferContext.writeArguments(LONG to portIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTNODE_GET_DEFAULT_INPUT_VALUE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun getVisualScript(): VisualScript? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTNODE_GET_VISUAL_SCRIPT,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as VisualScript?
  }

  open fun portsChangedNotify() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTNODE_PORTS_CHANGED_NOTIFY, NIL)
  }

  open fun setDefaultInputValue(portIdx: Long, value: Any?) {
    TransferContext.writeArguments(LONG to portIdx, ANY to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTNODE_SET_DEFAULT_INPUT_VALUE, NIL)
  }
}
