// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
open class PackedDataContainer : Resource() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_PACKEDDATACONTAINER)

  open fun _get_data(): PoolByteArray {
    throw NotImplementedError("_get_data is not implemented for PackedDataContainer")
  }

  open fun _iter_get(arg0: Any): Any? {
    throw NotImplementedError("_iter_get is not implemented for PackedDataContainer")
  }

  open fun _iter_init(arg0: VariantArray<Any?>): Any? {
    throw NotImplementedError("_iter_init is not implemented for PackedDataContainer")
  }

  open fun _iter_next(arg0: VariantArray<Any?>): Any? {
    throw NotImplementedError("_iter_next is not implemented for PackedDataContainer")
  }

  open fun _set_data(arg0: PoolByteArray) {
  }

  open fun pack(value: Any): GodotError {
    TransferContext.writeArguments(ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDDATACONTAINER_PACK, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun size(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDDATACONTAINER_SIZE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }
}
