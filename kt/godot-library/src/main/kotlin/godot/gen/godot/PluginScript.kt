// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import kotlin.Any
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class PluginScript : Script() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PLUGINSCRIPT)
  }

  public open fun new(vararg __var_args: Any?): Any? {
    TransferContext.writeArguments( *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PLUGINSCRIPT_NEW, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  public companion object
}
