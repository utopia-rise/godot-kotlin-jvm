// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * PacketStreamPeer provides a wrapper for working using packets over a stream. This allows for
 * using packet based code with StreamPeers. PacketPeerStream implements a custom protocol over the
 * StreamPeer, so the user should not read or write to the wrapped StreamPeer directly.
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android
 * export preset before exporting the project or using one-click deploy. Otherwise, network
 * communication of any kind will be blocked by Android.
 */
@GodotBaseType
public open class PacketPeerStream : PacketPeer() {
  public var inputBufferMaxSize: Int
    @JvmName("inputBufferMaxSizeProperty")
    get() = getInputBufferMaxSize()
    @JvmName("inputBufferMaxSizeProperty")
    set(`value`) {
      setInputBufferMaxSize(value)
    }

  public var outputBufferMaxSize: Int
    @JvmName("outputBufferMaxSizeProperty")
    get() = getOutputBufferMaxSize()
    @JvmName("outputBufferMaxSizeProperty")
    set(`value`) {
      setOutputBufferMaxSize(value)
    }

  /**
   * The wrapped [StreamPeer] object.
   */
  public var streamPeer: StreamPeer?
    @JvmName("streamPeerProperty")
    get() = getStreamPeer()
    @JvmName("streamPeerProperty")
    set(`value`) {
      setStreamPeer(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PACKETPEERSTREAM, scriptIndex)
  }

  public fun setStreamPeer(peer: StreamPeer?): Unit {
    TransferContext.writeArguments(OBJECT to peer)
    TransferContext.callMethod(rawPtr, MethodBindings.setStreamPeerPtr, NIL)
  }

  public fun getStreamPeer(): StreamPeer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStreamPeerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as StreamPeer?)
  }

  public fun setInputBufferMaxSize(maxSizeBytes: Int): Unit {
    TransferContext.writeArguments(LONG to maxSizeBytes.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setInputBufferMaxSizePtr, NIL)
  }

  public fun setOutputBufferMaxSize(maxSizeBytes: Int): Unit {
    TransferContext.writeArguments(LONG to maxSizeBytes.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setOutputBufferMaxSizePtr, NIL)
  }

  public fun getInputBufferMaxSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInputBufferMaxSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getOutputBufferMaxSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOutputBufferMaxSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val setStreamPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerStream", "set_stream_peer", 3281897016)

    public val getStreamPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerStream", "get_stream_peer", 2741655269)

    public val setInputBufferMaxSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerStream", "set_input_buffer_max_size", 1286410249)

    public val setOutputBufferMaxSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerStream", "set_output_buffer_max_size", 1286410249)

    public val getInputBufferMaxSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerStream", "get_input_buffer_max_size", 3905245786)

    public val getOutputBufferMaxSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerStream", "get_output_buffer_max_size", 3905245786)
  }
}
