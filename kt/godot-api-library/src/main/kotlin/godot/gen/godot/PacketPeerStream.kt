// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_PACKETPEERSTREAM_INDEX: Int = 443

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
  public final inline var inputBufferMaxSize: Int
    @JvmName("inputBufferMaxSizeProperty")
    get() = getInputBufferMaxSize()
    @JvmName("inputBufferMaxSizeProperty")
    set(`value`) {
      setInputBufferMaxSize(value)
    }

  public final inline var outputBufferMaxSize: Int
    @JvmName("outputBufferMaxSizeProperty")
    get() = getOutputBufferMaxSize()
    @JvmName("outputBufferMaxSizeProperty")
    set(`value`) {
      setOutputBufferMaxSize(value)
    }

  /**
   * The wrapped [StreamPeer] object.
   */
  public final inline var streamPeer: StreamPeer?
    @JvmName("streamPeerProperty")
    get() = getStreamPeer()
    @JvmName("streamPeerProperty")
    set(`value`) {
      setStreamPeer(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_PACKETPEERSTREAM_INDEX, scriptIndex)
  }

  public final fun setStreamPeer(peer: StreamPeer?): Unit {
    Internals.writeArguments(OBJECT to peer)
    Internals.callMethod(rawPtr, MethodBindings.setStreamPeerPtr, NIL)
  }

  public final fun getStreamPeer(): StreamPeer? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getStreamPeerPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as StreamPeer?)
  }

  public final fun setInputBufferMaxSize(maxSizeBytes: Int): Unit {
    Internals.writeArguments(LONG to maxSizeBytes.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setInputBufferMaxSizePtr, NIL)
  }

  public final fun setOutputBufferMaxSize(maxSizeBytes: Int): Unit {
    Internals.writeArguments(LONG to maxSizeBytes.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setOutputBufferMaxSizePtr, NIL)
  }

  public final fun getInputBufferMaxSize(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getInputBufferMaxSizePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun getOutputBufferMaxSize(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOutputBufferMaxSizePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val setStreamPeerPtr: VoidPtr =
        Internals.getMethodBindPtr("PacketPeerStream", "set_stream_peer", 3281897016)

    public val getStreamPeerPtr: VoidPtr =
        Internals.getMethodBindPtr("PacketPeerStream", "get_stream_peer", 2741655269)

    public val setInputBufferMaxSizePtr: VoidPtr =
        Internals.getMethodBindPtr("PacketPeerStream", "set_input_buffer_max_size", 1286410249)

    public val setOutputBufferMaxSizePtr: VoidPtr =
        Internals.getMethodBindPtr("PacketPeerStream", "set_output_buffer_max_size", 1286410249)

    public val getInputBufferMaxSizePtr: VoidPtr =
        Internals.getMethodBindPtr("PacketPeerStream", "get_input_buffer_max_size", 3905245786)

    public val getOutputBufferMaxSizePtr: VoidPtr =
        Internals.getMethodBindPtr("PacketPeerStream", "get_output_buffer_max_size", 3905245786)
  }
}
