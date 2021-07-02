// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolByteArray
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_BYTE_ARRAY
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class StreamPeerBuffer : StreamPeer() {
  /**
   *
   */
  public open var dataArray: PoolByteArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERBUFFER_GET_DATA_ARRAY,
          POOL_BYTE_ARRAY)
      return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_BYTE_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERBUFFER_SET_DATA_ARRAY,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_STREAMPEERBUFFER)
  }

  /**
   *
   */
  public open fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERBUFFER_CLEAR, NIL)
  }

  /**
   *
   */
  public open fun duplicate(): StreamPeerBuffer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERBUFFER_DUPLICATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as StreamPeerBuffer?
  }

  /**
   *
   */
  public open fun getPosition(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERBUFFER_GET_POSITION, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public open fun getSize(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERBUFFER_GET_SIZE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public open fun resize(size: Long): Unit {
    TransferContext.writeArguments(LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERBUFFER_RESIZE, NIL)
  }

  /**
   *
   */
  public open fun seek(position: Long): Unit {
    TransferContext.writeArguments(LONG to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERBUFFER_SEEK, NIL)
  }
}
