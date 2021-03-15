// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class VisualScriptFunctionState : Reference() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VISUALSCRIPTFUNCTIONSTATE,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _signalCallback(vararg __var_args: Any?): Any? {
    throw NotImplementedError("_signal_callback is not implemented for VisualScriptFunctionState")
  }

  open fun connectToSignal(
    obj: Object,
    signals: String,
    args: VariantArray<Any?>
  ) {
    TransferContext.writeArguments(OBJECT to obj, STRING to signals, ARRAY to args)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONSTATE_CONNECT_TO_SIGNAL, NIL)
  }

  open fun isValid(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONSTATE_IS_VALID,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun resume(args: VariantArray<Any?>? = null): Any? {
    TransferContext.writeArguments(ARRAY to args)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONSTATE_RESUME,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }
}
