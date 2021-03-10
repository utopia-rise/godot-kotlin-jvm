// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class ResourceFormatSaver : Reference() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_RESOURCEFORMATSAVER)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun _getRecognizedExtensions(resource: Resource): PoolStringArray {
    throw
        NotImplementedError("get_recognized_extensions is not implemented for ResourceFormatSaver")
  }

  open fun _recognize(resource: Resource): Boolean {
    throw NotImplementedError("recognize is not implemented for ResourceFormatSaver")
  }

  open fun _save(
    path: String,
    resource: Resource,
    flags: Long
  ): Long {
    throw NotImplementedError("save is not implemented for ResourceFormatSaver")
  }
}
