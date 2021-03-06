// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class ResourceFormatLoader : Reference() {
  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_RESOURCEFORMATLOADER)

  open fun _getDependencies(path: String, addTypes: String) {
  }

  open fun _getRecognizedExtensions(): PoolStringArray {
    throw
        NotImplementedError("get_recognized_extensions is not implemented for ResourceFormatLoader")
  }

  open fun _getResourceType(path: String): String {
    throw NotImplementedError("get_resource_type is not implemented for ResourceFormatLoader")
  }

  open fun _handlesType(typename: String): Boolean {
    throw NotImplementedError("handles_type is not implemented for ResourceFormatLoader")
  }

  open fun _load(path: String, originalPath: String): Any? {
    throw NotImplementedError("load is not implemented for ResourceFormatLoader")
  }

  open fun _renameDependencies(path: String, renames: String): Long {
    throw NotImplementedError("rename_dependencies is not implemented for ResourceFormatLoader")
  }
}
