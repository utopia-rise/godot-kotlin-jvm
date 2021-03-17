// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import kotlin.Any
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
open class VisualScriptSubCall : VisualScriptNode() {
  override fun __new() {
    callConstructor(ENGINECLASS_VISUALSCRIPTSUBCALL)
  }

  open fun _subcall(arguments: Any?): Any? {
    throw NotImplementedError("_subcall is not implemented for VisualScriptSubCall")
  }
}
