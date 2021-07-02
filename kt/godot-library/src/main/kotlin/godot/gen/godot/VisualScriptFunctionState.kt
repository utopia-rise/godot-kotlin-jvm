// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
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
import kotlin.Unit

@GodotBaseType
public open class VisualScriptFunctionState : Reference() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSCRIPTFUNCTIONSTATE)
  }

  public open fun _signalCallback(vararg __var_args: Any?): Any? {
    throw NotImplementedError("_signal_callback is not implemented for VisualScriptFunctionState")
  }

  public open fun connectToSignal(
    obj: Object,
    signals: String,
    args: VariantArray<Any?>
  ): Unit {
    TransferContext.writeArguments(OBJECT to obj, STRING to signals, ARRAY to args)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONSTATE_CONNECT_TO_SIGNAL, NIL)
  }

  public open fun isValid(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONSTATE_IS_VALID,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public open fun resume(args: VariantArray<Any?>? = null): Any? {
    TransferContext.writeArguments(ARRAY to args)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONSTATE_RESUME,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }
}
