// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.PACKED_BYTE_ARRAY
import kotlin.Any
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class GDScript : Script() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GDSCRIPT)
  }

  public fun new(vararg __var_args: Any?): Any? {
    TransferContext.writeArguments( *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GDSCRIPT_NEW, ANY.ordinal)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  public fun getAsByteCode(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GDSCRIPT_GET_AS_BYTE_CODE,
        PACKED_BYTE_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  public companion object
}
