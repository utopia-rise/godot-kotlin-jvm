// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class ENetConnection : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ENETCONNECTION, scriptIndex)
    return true
  }

  public fun createHostBound(
    bindAddress: String,
    bindPort: Long,
    maxPeers: Long = 32,
    maxChannels: Long = 0,
    inBandwidth: Long = 0,
    outBandwidth: Long = 0
  ): GodotError {
    TransferContext.writeArguments(STRING to bindAddress, LONG to bindPort, LONG to maxPeers, LONG to maxChannels, LONG to inBandwidth, LONG to outBandwidth)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_CREATE_HOST_BOUND,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun createHost(
    maxPeers: Long = 32,
    maxChannels: Long = 0,
    inBandwidth: Long = 0,
    outBandwidth: Long = 0
  ): GodotError {
    TransferContext.writeArguments(LONG to maxPeers, LONG to maxChannels, LONG to inBandwidth, LONG to outBandwidth)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_CREATE_HOST, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun destroy(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_DESTROY, NIL)
  }

  public fun connectToHost(
    address: String,
    port: Long,
    channels: Long = 0,
    `data`: Long = 0
  ): ENetPacketPeer? {
    TransferContext.writeArguments(STRING to address, LONG to port, LONG to channels, LONG to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_CONNECT_TO_HOST,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ENetPacketPeer?
  }

  public fun service(timeout: Long = 0): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to timeout)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_SERVICE, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public fun flush(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_FLUSH, NIL)
  }

  public fun bandwidthLimit(inBandwidth: Long = 0, outBandwidth: Long = 0): Unit {
    TransferContext.writeArguments(LONG to inBandwidth, LONG to outBandwidth)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_BANDWIDTH_LIMIT, NIL)
  }

  public fun channelLimit(limit: Long): Unit {
    TransferContext.writeArguments(LONG to limit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_CHANNEL_LIMIT, NIL)
  }

  public fun broadcast(
    channel: Long,
    packet: PackedByteArray,
    flags: Long
  ): Unit {
    TransferContext.writeArguments(LONG to channel, PACKED_BYTE_ARRAY to packet, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_BROADCAST, NIL)
  }

  public fun compress(mode: CompressionMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_COMPRESS, NIL)
  }

  public fun dtlsServerSetup(serverOptions: TLSOptions): GodotError {
    TransferContext.writeArguments(OBJECT to serverOptions)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_DTLS_SERVER_SETUP,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun dtlsClientSetup(hostname: String, clientOptions: TLSOptions? = null): GodotError {
    TransferContext.writeArguments(STRING to hostname, OBJECT to clientOptions)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_DTLS_CLIENT_SETUP,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun refuseNewConnections(refuse: Boolean): Unit {
    TransferContext.writeArguments(BOOL to refuse)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_REFUSE_NEW_CONNECTIONS, NIL)
  }

  public fun popStatistic(statistic: HostStatistic): Double {
    TransferContext.writeArguments(LONG to statistic.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_POP_STATISTIC,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public fun getMaxChannels(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_GET_MAX_CHANNELS,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun getLocalPort(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_GET_LOCAL_PORT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun getPeers(): VariantArray<ENetPacketPeer> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_GET_PEERS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<ENetPacketPeer>
  }

  public enum class CompressionMode(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class EventType(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class HostStatistic(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
