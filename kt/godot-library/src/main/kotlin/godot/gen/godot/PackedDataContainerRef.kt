// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.LONG
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 * Reference version of [godot.PackedDataContainer].
 */
@GodotBaseType
open class PackedDataContainerRef : Reference() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_PACKEDDATACONTAINERREF)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun _isDictionary(): Boolean {
    throw NotImplementedError("_is_dictionary is not implemented for PackedDataContainerRef")
  }

  open fun _iterGet(arg0: Any?): Any? {
    throw NotImplementedError("_iter_get is not implemented for PackedDataContainerRef")
  }

  open fun _iterInit(arg0: VariantArray<Any?>): Any? {
    throw NotImplementedError("_iter_init is not implemented for PackedDataContainerRef")
  }

  open fun _iterNext(arg0: VariantArray<Any?>): Any? {
    throw NotImplementedError("_iter_next is not implemented for PackedDataContainerRef")
  }

  /**
   *
   */
  open fun size(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDDATACONTAINERREF_SIZE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }
}
