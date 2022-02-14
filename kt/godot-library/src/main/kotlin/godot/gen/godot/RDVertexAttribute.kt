// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class RDVertexAttribute : RefCounted() {
  /**
   *
   */
  public open var location: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDVERTEXATTRIBUTE_GET_LOCATION,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDVERTEXATTRIBUTE_SET_LOCATION,
          NIL)
    }

  /**
   *
   */
  public open var offset: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDVERTEXATTRIBUTE_GET_OFFSET,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDVERTEXATTRIBUTE_SET_OFFSET, NIL)
    }

  /**
   *
   */
  public open var format: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDVERTEXATTRIBUTE_GET_FORMAT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDVERTEXATTRIBUTE_SET_FORMAT, NIL)
    }

  /**
   *
   */
  public open var stride: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDVERTEXATTRIBUTE_GET_STRIDE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDVERTEXATTRIBUTE_SET_STRIDE, NIL)
    }

  /**
   *
   */
  public open var frequency: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDVERTEXATTRIBUTE_GET_FREQUENCY,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDVERTEXATTRIBUTE_SET_FREQUENCY,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RDVERTEXATTRIBUTE)
  }

  public companion object
}
