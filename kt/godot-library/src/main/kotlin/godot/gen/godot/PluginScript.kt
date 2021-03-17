// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import kotlin.Any
import kotlin.Suppress

@GodotBaseType
open class PluginScript : Script() {
  override fun __new() {
    callConstructor(ENGINECLASS_PLUGINSCRIPT)
  }

  open fun new(vararg __var_args: Any?): Any? {
    TransferContext.writeArguments( *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PLUGINSCRIPT_NEW, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }
}
