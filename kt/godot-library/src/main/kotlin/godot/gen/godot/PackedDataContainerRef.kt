// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.LONG
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Reference version of [godot.PackedDataContainer].
 */
@GodotBaseType
public open class PackedDataContainerRef : Reference() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PACKEDDATACONTAINERREF)
  }

  public open fun _isDictionary(): Boolean {
    throw NotImplementedError("_is_dictionary is not implemented for PackedDataContainerRef")
  }

  public open fun _iterGet(arg0: Any?): Any? {
    throw NotImplementedError("_iter_get is not implemented for PackedDataContainerRef")
  }

  public open fun _iterInit(arg0: VariantArray<Any?>): Any? {
    throw NotImplementedError("_iter_init is not implemented for PackedDataContainerRef")
  }

  public open fun _iterNext(arg0: VariantArray<Any?>): Any? {
    throw NotImplementedError("_iter_next is not implemented for PackedDataContainerRef")
  }

  /**
   *
   */
  public open fun size(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDDATACONTAINERREF_SIZE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }
}
