// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolByteArray
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.POOL_BYTE_ARRAY
import kotlin.Any
import kotlin.Suppress

@GodotBaseType
open class GDScript : Script() {
  override fun __new() {
    callConstructor(ENGINECLASS_GDSCRIPT)
  }

  open fun getAsByteCode(): PoolByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDSCRIPT_GET_AS_BYTE_CODE,
        POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  open fun new(vararg __var_args: Any?): Any? {
    TransferContext.writeArguments( *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDSCRIPT_NEW, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }
}
