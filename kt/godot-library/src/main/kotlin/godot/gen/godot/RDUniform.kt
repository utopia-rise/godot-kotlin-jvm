// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType._RID
import kotlin.Any
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class RDUniform : RefCounted() {
  /**
   *
   */
  public var uniformType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RDUNIFORM_GET_UNIFORM_TYPE,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RDUNIFORM_SET_UNIFORM_TYPE,
          NIL.ordinal)
    }

  /**
   *
   */
  public var binding: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RDUNIFORM_GET_BINDING, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RDUNIFORM_SET_BINDING, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RDUNIFORM)
  }

  /**
   *
   */
  public fun addId(id: RID): Unit {
    TransferContext.writeArguments(_RID to id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RDUNIFORM_ADD_ID, NIL.ordinal)
  }

  /**
   *
   */
  public fun clearIds(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RDUNIFORM_CLEAR_IDS, NIL.ordinal)
  }

  /**
   *
   */
  public fun getIds(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RDUNIFORM_GET_IDS, ARRAY.ordinal)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public companion object
}
