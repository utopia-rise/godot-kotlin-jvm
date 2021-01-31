// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.LONG
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
open class PackedDataContainerRef : Reference() {
  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_PACKEDDATACONTAINERREF)

  open fun _is_dictionary(): Boolean {
    throw NotImplementedError("_is_dictionary is not implemented for PackedDataContainerRef")
  }

  open fun _iter_get(arg0: Any): Any? {
    throw NotImplementedError("_iter_get is not implemented for PackedDataContainerRef")
  }

  open fun _iter_init(arg0: VariantArray<Any?>): Any? {
    throw NotImplementedError("_iter_init is not implemented for PackedDataContainerRef")
  }

  open fun _iter_next(arg0: VariantArray<Any?>): Any? {
    throw NotImplementedError("_iter_next is not implemented for PackedDataContainerRef")
  }

  open fun size(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDDATACONTAINERREF_SIZE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }
}
