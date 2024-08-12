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
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

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
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInputBufferMaxSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setInputBufferMaxSizePtr, NIL)
    }

  public var outputBufferMaxSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOutputBufferMaxSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setOutputBufferMaxSizePtr, NIL)
    }

  /**
   * The wrapped [StreamPeer] object.
   */
  public var streamPeer: StreamPeer?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStreamPeerPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as StreamPeer?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStreamPeerPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PACKETPEERSTREAM, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setStreamPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerStream", "set_stream_peer")

    public val getStreamPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerStream", "get_stream_peer")

    public val setInputBufferMaxSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerStream", "set_input_buffer_max_size")

    public val setOutputBufferMaxSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerStream", "set_output_buffer_max_size")

    public val getInputBufferMaxSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerStream", "get_input_buffer_max_size")

    public val getOutputBufferMaxSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerStream", "get_output_buffer_max_size")
  }
}
