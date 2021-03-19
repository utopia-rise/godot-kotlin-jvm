// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 *
 */
@GodotBaseType
open class EditorResourceConversionPlugin : Reference() {
  override fun __new() {
    callConstructor(ENGINECLASS_EDITORRESOURCECONVERSIONPLUGIN)
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
