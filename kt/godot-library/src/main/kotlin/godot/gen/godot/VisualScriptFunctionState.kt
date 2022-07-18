// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class VisualScriptFunctionState : RefCounted() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSCRIPTFUNCTIONSTATE)
  }

  public fun connectToSignal(
    obj: Object,
    signals: String,
    args: VariantArray<Any?>
  ): Unit {
    TransferContext.writeArguments(OBJECT to obj, STRING to signals, ARRAY to args)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONSTATE_CONNECT_TO_SIGNAL, NIL.ordinal)
  }

  public fun resume(args: VariantArray<Any?> = godot.core.variantArrayOf()): Any? {
    TransferContext.writeArguments(ARRAY to args)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONSTATE_RESUME,
        ANY.ordinal)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  public fun isValid(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONSTATE_IS_VALID,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public companion object
}
