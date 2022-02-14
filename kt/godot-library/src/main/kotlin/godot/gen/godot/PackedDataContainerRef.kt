// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Reference-counted version of [godot.PackedDataContainer].
 */
@GodotBaseType
public open class PackedDataContainerRef : RefCounted() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PACKEDDATACONTAINERREF)
  }

  /**
   *
   */
  public open fun size(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDDATACONTAINERREF_SIZE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public companion object
}
