// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 *
 */
@GodotBaseType
open class EditorResourceConversionPlugin : Reference() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_EDITORRESOURCECONVERSIONPLUGIN)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   *
   */
  open fun _convert(resource: Resource): Resource? {
    throw NotImplementedError("_convert is not implemented for EditorResourceConversionPlugin")
  }

  /**
   *
   */
  open fun _convertsTo(): String {
    throw NotImplementedError("_converts_to is not implemented for EditorResourceConversionPlugin")
  }
}
