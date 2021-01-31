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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class FuncRef : Reference() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_FUNCREF)

  open fun callFunc(vararg __var_args: Any?): Any? {
    TransferContext.writeArguments( *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FUNCREF_CALL_FUNC, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun callFuncv(argArray: VariantArray<Any?>): Any? {
    TransferContext.writeArguments(ARRAY to argArray)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FUNCREF_CALL_FUNCV, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun isValid(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FUNCREF_IS_VALID, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun setFunction(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FUNCREF_SET_FUNCTION, NIL)
  }

  open fun setInstance(instance: Object) {
    TransferContext.writeArguments(OBJECT to instance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FUNCREF_SET_INSTANCE, NIL)
  }

  companion object
}
