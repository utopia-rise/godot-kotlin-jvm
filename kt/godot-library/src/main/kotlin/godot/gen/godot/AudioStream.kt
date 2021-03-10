// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import kotlin.Double
import kotlin.Suppress

@GodotBaseType
open class AudioStream : Resource() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_AUDIOSTREAM)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun getLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAM_GET_LENGTH, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }
}
