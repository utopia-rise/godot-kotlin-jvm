// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Any
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class RDPipelineSpecializationConstant : RefCounted() {
  /**
   *
   */
  public var `value`: Any?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINESPECIALIZATIONCONSTANT_GET_VALUE, ANY.ordinal)
      return TransferContext.readReturnValue(ANY, true) as Any?
    }
    set(`value`) {
      TransferContext.writeArguments(ANY to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINESPECIALIZATIONCONSTANT_SET_VALUE, NIL.ordinal)
    }

  /**
   *
   */
  public var constantId: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINESPECIALIZATIONCONSTANT_GET_CONSTANT_ID, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINESPECIALIZATIONCONSTANT_SET_CONSTANT_ID, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RDPIPELINESPECIALIZATIONCONSTANT)
  }

  public companion object
}
