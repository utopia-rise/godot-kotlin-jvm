// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class ENetConnection : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ENETCONNECTION, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun createHostBound(
    bindAddress: String,
    bindPort: Int,
    maxPeers: Int = 32,
    maxChannels: Int = 0,
    inBandwidth: Int = 0,
    outBandwidth: Int = 0,
  ): GodotError {
    TransferContext.writeArguments(STRING to bindAddress, LONG to bindPort.toLong(), LONG to maxPeers.toLong(), LONG to maxChannels.toLong(), LONG to inBandwidth.toLong(), LONG to outBandwidth.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.createHostBoundPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun createHost(
    maxPeers: Int = 32,
    maxChannels: Int = 0,
    inBandwidth: Int = 0,
    outBandwidth: Int = 0,
  ): GodotError {
    TransferContext.writeArguments(LONG to maxPeers.toLong(), LONG to maxChannels.toLong(), LONG to inBandwidth.toLong(), LONG to outBandwidth.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.createHostPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun destroy(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.destroyPtr, NIL)
  }

  @JvmOverloads
  public fun connectToHost(
    address: String,
    port: Int,
    channels: Int = 0,
    `data`: Int = 0,
  ): ENetPacketPeer? {
    TransferContext.writeArguments(STRING to address, LONG to port.toLong(), LONG to channels.toLong(), LONG to data.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.connectToHostPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ENetPacketPeer?)
  }

  @JvmOverloads
  public fun service(timeout: Int = 0): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to timeout.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.servicePtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public fun flush(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.flushPtr, NIL)
  }

  @JvmOverloads
  public fun bandwidthLimit(inBandwidth: Int = 0, outBandwidth: Int = 0): Unit {
    TransferContext.writeArguments(LONG to inBandwidth.toLong(), LONG to outBandwidth.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.bandwidthLimitPtr, NIL)
  }

  public fun channelLimit(limit: Int): Unit {
    TransferContext.writeArguments(LONG to limit.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.channelLimitPtr, NIL)
  }

  public fun broadcast(
    channel: Int,
    packet: PackedByteArray,
    flags: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to channel.toLong(), PACKED_BYTE_ARRAY to packet, LONG to flags.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.broadcastPtr, NIL)
  }

  public fun compress(mode: CompressionMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.compressPtr, NIL)
  }

  public fun dtlsServerSetup(serverOptions: TLSOptions): GodotError {
    TransferContext.writeArguments(OBJECT to serverOptions)
    TransferContext.callMethod(rawPtr, MethodBindings.dtlsServerSetupPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun dtlsClientSetup(hostname: String, clientOptions: TLSOptions? = null): GodotError {
    TransferContext.writeArguments(STRING to hostname, OBJECT to clientOptions)
    TransferContext.callMethod(rawPtr, MethodBindings.dtlsClientSetupPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun refuseNewConnections(refuse: Boolean): Unit {
    TransferContext.writeArguments(BOOL to refuse)
    TransferContext.callMethod(rawPtr, MethodBindings.refuseNewConnectionsPtr, NIL)
  }

  public fun popStatistic(statistic: HostStatistic): Double {
    TransferContext.writeArguments(LONG to statistic.id)
    TransferContext.callMethod(rawPtr, MethodBindings.popStatisticPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public fun getMaxChannels(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMaxChannelsPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getLocalPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocalPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getPeers(): VariantArray<ENetPacketPeer> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPeersPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<ENetPacketPeer>)
  }

  public fun socketSend(
    destinationAddress: String,
    destinationPort: Int,
    packet: PackedByteArray,
  ): Unit {
    TransferContext.writeArguments(STRING to destinationAddress, LONG to destinationPort.toLong(), PACKED_BYTE_ARRAY to packet)
    TransferContext.callMethod(rawPtr, MethodBindings.socketSendPtr, NIL)
  }

  public enum class CompressionMode(
    id: Long,
  ) {
    COMPRESS_NONE(0),
    COMPRESS_RANGE_CODER(1),
    COMPRESS_FASTLZ(2),
    COMPRESS_ZLIB(3),
    COMPRESS_ZSTD(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class EventType(
    id: Long,
  ) {
    EVENT_ERROR(-1),
    EVENT_NONE(0),
    EVENT_CONNECT(1),
    EVENT_DISCONNECT(2),
    EVENT_RECEIVE(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class HostStatistic(
    id: Long,
  ) {
    HOST_TOTAL_SENT_DATA(0),
    HOST_TOTAL_SENT_PACKETS(1),
    HOST_TOTAL_RECEIVED_DATA(2),
    HOST_TOTAL_RECEIVED_PACKETS(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val createHostBoundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "create_host_bound")

    public val createHostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "create_host")

    public val destroyPtr: VoidPtr = TypeManager.getMethodBindPtr("ENetConnection", "destroy")

    public val connectToHostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "connect_to_host")

    public val servicePtr: VoidPtr = TypeManager.getMethodBindPtr("ENetConnection", "service")

    public val flushPtr: VoidPtr = TypeManager.getMethodBindPtr("ENetConnection", "flush")

    public val bandwidthLimitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "bandwidth_limit")

    public val channelLimitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "channel_limit")

    public val broadcastPtr: VoidPtr = TypeManager.getMethodBindPtr("ENetConnection", "broadcast")

    public val compressPtr: VoidPtr = TypeManager.getMethodBindPtr("ENetConnection", "compress")

    public val dtlsServerSetupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "dtls_server_setup")

    public val dtlsClientSetupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "dtls_client_setup")

    public val refuseNewConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "refuse_new_connections")

    public val popStatisticPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "pop_statistic")

    public val getMaxChannelsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "get_max_channels")

    public val getLocalPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "get_local_port")

    public val getPeersPtr: VoidPtr = TypeManager.getMethodBindPtr("ENetConnection", "get_peers")

    public val socketSendPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "socket_send")
  }
}
