// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import kotlin.Any
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open abstract class GDScriptNativeClass : RefCounted() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GDSCRIPTNATIVECLASS)
  }

  public open fun new(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDSCRIPTNATIVECLASS_NEW, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  public companion object
}
