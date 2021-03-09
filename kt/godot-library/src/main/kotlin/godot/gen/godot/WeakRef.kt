// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import kotlin.Any
import kotlin.Suppress

@GodotBaseType
open class WeakRef : Reference() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_WEAKREF)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun getRef(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEAKREF_GET_REF, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }
}
