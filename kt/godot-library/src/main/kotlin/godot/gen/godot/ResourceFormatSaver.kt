// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class ResourceFormatSaver : Reference() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_RESOURCEFORMATSAVER)

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
