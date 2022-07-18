// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.TransferContext
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
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ENETCONNECTION)
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
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_CREATE_HOST_BOUND,
        LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun createHost(
    maxPeers: Long = 32,
    maxChannels: Long = 0,
    inBandwidth: Long = 0,
    outBandwidth: Long = 0
  ): GodotError {
    TransferContext.writeArguments(LONG to maxPeers, LONG to maxChannels, LONG to inBandwidth, LONG to outBandwidth)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_CREATE_HOST, LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun destroy(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_DESTROY, NIL.ordinal)
  }

  public fun connectToHost(
    address: String,
    port: Long,
    channels: Long = 0,
    `data`: Long = 0
  ): ENetPacketPeer? {
    TransferContext.writeArguments(STRING to address, LONG to port, LONG to channels, LONG to data)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_CONNECT_TO_HOST,
        OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as ENetPacketPeer?
  }

  public fun service(timeout: Long = 0): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to timeout)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_SERVICE, ARRAY.ordinal)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public fun flush(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_FLUSH, NIL.ordinal)
  }

  public fun bandwidthLimit(inBandwidth: Long = 0, outBandwidth: Long = 0): Unit {
    TransferContext.writeArguments(LONG to inBandwidth, LONG to outBandwidth)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_BANDWIDTH_LIMIT,
        NIL.ordinal)
  }

  public fun channelLimit(limit: Long): Unit {
    TransferContext.writeArguments(LONG to limit)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_CHANNEL_LIMIT,
        NIL.ordinal)
  }

  public fun broadcast(
    channel: Long,
    packet: PackedByteArray,
    flags: Long
  ): Unit {
    TransferContext.writeArguments(LONG to channel, PACKED_BYTE_ARRAY to packet, LONG to flags)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_BROADCAST, NIL.ordinal)
  }

  public fun compress(mode: ENetConnection.CompressionMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_COMPRESS, NIL.ordinal)
  }

  public fun dtlsServerSetup(key: CryptoKey, certificate: X509Certificate): GodotError {
    TransferContext.writeArguments(OBJECT to key, OBJECT to certificate)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_DTLS_SERVER_SETUP,
        LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun dtlsClientSetup(
    certificate: X509Certificate,
    hostname: String,
    verify: Boolean = true
  ): GodotError {
    TransferContext.writeArguments(OBJECT to certificate, STRING to hostname, BOOL to verify)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_DTLS_CLIENT_SETUP,
        LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun refuseNewConnections(refuse: Boolean): Unit {
    TransferContext.writeArguments(BOOL to refuse)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_REFUSE_NEW_CONNECTIONS,
        NIL.ordinal)
  }

  public fun popStatistic(statistic: ENetConnection.HostStatistic): Double {
    TransferContext.writeArguments(LONG to statistic.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_POP_STATISTIC,
        DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public fun getMaxChannels(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_GET_MAX_CHANNELS,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun getLocalPort(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_GET_LOCAL_PORT,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun getPeers(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETCONNECTION_GET_PEERS, ARRAY.ordinal)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
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

  public companion object
}
