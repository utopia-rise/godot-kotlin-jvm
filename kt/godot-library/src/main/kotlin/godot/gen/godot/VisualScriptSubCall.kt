// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Any
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class VisualScriptSubCall : VisualScriptNode() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSCRIPTSUBCALL)
  }

  public open fun _subcall(arguments: Any?): Any? {
    throw NotImplementedError("_subcall is not implemented for VisualScriptSubCall")
  }
}
