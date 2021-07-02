// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Wrapper to use a PacketPeer over a StreamPeer.
 *
 * PacketStreamPeer provides a wrapper for working using packets over a stream. This allows for using packet based code with StreamPeers. PacketPeerStream implements a custom protocol over the StreamPeer, so the user should not read or write to the wrapped StreamPeer directly.
 */
@GodotBaseType
public open class PacketPeerStream : PacketPeer() {
  /**
   *
   */
  public open var inputBufferMaxSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PACKETPEERSTREAM_GET_INPUT_BUFFER_MAX_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PACKETPEERSTREAM_SET_INPUT_BUFFER_MAX_SIZE, NIL)
    }

  /**
   *
   */
  public open var outputBufferMaxSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PACKETPEERSTREAM_GET_OUTPUT_BUFFER_MAX_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PACKETPEERSTREAM_SET_OUTPUT_BUFFER_MAX_SIZE, NIL)
    }

  /**
   * The wrapped [godot.StreamPeer] object.
   */
  public open var streamPeer: StreamPeer?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERSTREAM_GET_STREAM_PEER,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as StreamPeer?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERSTREAM_SET_STREAM_PEER,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PACKETPEERSTREAM)
  }
}
