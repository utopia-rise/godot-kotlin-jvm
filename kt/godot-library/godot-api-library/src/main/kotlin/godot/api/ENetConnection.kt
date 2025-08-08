// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Error
import godot.core.PackedByteArray
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

/**
 * ENet's purpose is to provide a relatively thin, simple and robust network communication layer on top of UDP (User Datagram Protocol).
 */
@GodotBaseType
public open class ENetConnection : RefCounted() {
  override fun new(scriptIndex: Int) {
    createNativeObject(199, scriptIndex)
  }

  /**
   * Creates an ENetHost bound to the given [bindAddress] and [bindPort] that allows up to [maxPeers] connected peers, each allocating up to [maxChannels] channels, optionally limiting bandwidth to [inBandwidth] and [outBandwidth] (if greater than zero).
   *
   * **Note:** It is necessary to create a host in both client and server in order to establish a connection.
   */
  @JvmOverloads
  public final fun createHostBound(
    bindAddress: String,
    bindPort: Int,
    maxPeers: Int = 32,
    maxChannels: Int = 0,
    inBandwidth: Int = 0,
    outBandwidth: Int = 0,
  ): Error {
    TransferContext.writeArguments(STRING to bindAddress, LONG to bindPort.toLong(), LONG to maxPeers.toLong(), LONG to maxChannels.toLong(), LONG to inBandwidth.toLong(), LONG to outBandwidth.toLong())
    TransferContext.callMethod(ptr, MethodBindings.createHostBoundPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Creates an ENetHost that allows up to [maxPeers] connected peers, each allocating up to [maxChannels] channels, optionally limiting bandwidth to [inBandwidth] and [outBandwidth] (if greater than zero).
   *
   * This method binds a random available dynamic UDP port on the host machine at the *unspecified* address. Use [createHostBound] to specify the address and port.
   *
   * **Note:** It is necessary to create a host in both client and server in order to establish a connection.
   */
  @JvmOverloads
  public final fun createHost(
    maxPeers: Int = 32,
    maxChannels: Int = 0,
    inBandwidth: Int = 0,
    outBandwidth: Int = 0,
  ): Error {
    TransferContext.writeArguments(LONG to maxPeers.toLong(), LONG to maxChannels.toLong(), LONG to inBandwidth.toLong(), LONG to outBandwidth.toLong())
    TransferContext.callMethod(ptr, MethodBindings.createHostPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Destroys the host and all resources associated with it.
   */
  public final fun destroy() {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.destroyPtr, NIL)
  }

  /**
   * Initiates a connection to a foreign [address] using the specified [port] and allocating the requested [channels]. Optional [data] can be passed during connection in the form of a 32 bit integer.
   *
   * **Note:** You must call either [createHost] or [createHostBound] on both ends before calling this method.
   */
  @JvmOverloads
  public final fun connectToHost(
    address: String,
    port: Int,
    channels: Int = 0,
    `data`: Int = 0,
  ): ENetPacketPeer? {
    TransferContext.writeArguments(STRING to address, LONG to port.toLong(), LONG to channels.toLong(), LONG to data.toLong())
    TransferContext.callMethod(ptr, MethodBindings.connectToHostPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as ENetPacketPeer?)
  }

  /**
   * Waits for events on this connection and shuttles packets between the host and its peers, with the given [timeout] (in milliseconds). The returned [Array] will have 4 elements. An [EventType], the [ENetPacketPeer] which generated the event, the event associated data (if any), the event associated channel (if any). If the generated event is [EVENT_RECEIVE], the received packet will be queued to the associated [ENetPacketPeer].
   *
   * Call this function regularly to handle connections, disconnections, and to receive new packets.
   *
   * **Note:** This method must be called on both ends involved in the event (sending and receiving hosts).
   */
  @JvmOverloads
  public final fun service(timeout: Int = 0): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to timeout.toLong())
    TransferContext.callMethod(ptr, MethodBindings.servicePtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Sends any queued packets on the host specified to its designated peers.
   */
  public final fun flush() {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.flushPtr, NIL)
  }

  /**
   * Adjusts the bandwidth limits of a host.
   */
  @JvmOverloads
  public final fun bandwidthLimit(inBandwidth: Int = 0, outBandwidth: Int = 0) {
    TransferContext.writeArguments(LONG to inBandwidth.toLong(), LONG to outBandwidth.toLong())
    TransferContext.callMethod(ptr, MethodBindings.bandwidthLimitPtr, NIL)
  }

  /**
   * Limits the maximum allowed channels of future incoming connections.
   */
  public final fun channelLimit(limit: Int) {
    TransferContext.writeArguments(LONG to limit.toLong())
    TransferContext.callMethod(ptr, MethodBindings.channelLimitPtr, NIL)
  }

  /**
   * Queues a [packet] to be sent to all peers associated with the host over the specified [channel]. See [ENetPacketPeer] `FLAG_*` constants for available packet flags.
   */
  public final fun broadcast(
    channel: Int,
    packet: PackedByteArray,
    flags: Int,
  ) {
    TransferContext.writeArguments(LONG to channel.toLong(), PACKED_BYTE_ARRAY to packet, LONG to flags.toLong())
    TransferContext.callMethod(ptr, MethodBindings.broadcastPtr, NIL)
  }

  /**
   * Sets the compression method used for network packets. These have different tradeoffs of compression speed versus bandwidth, you may need to test which one works best for your use case if you use compression at all.
   *
   * **Note:** Most games' network design involve sending many small packets frequently (smaller than 4 KB each). If in doubt, it is recommended to keep the default compression algorithm as it works best on these small packets.
   *
   * **Note:** The compression mode must be set to the same value on both the server and all its clients. Clients will fail to connect if the compression mode set on the client differs from the one set on the server.
   */
  public final fun compress(mode: CompressionMode) {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.compressPtr, NIL)
  }

  /**
   * Configure this ENetHost to use the custom Godot extension allowing DTLS encryption for ENet servers. Call this right after [createHostBound] to have ENet expect peers to connect using DTLS. See [TLSOptions.server].
   */
  public final fun dtlsServerSetup(serverOptions: TLSOptions?): Error {
    TransferContext.writeArguments(OBJECT to serverOptions)
    TransferContext.callMethod(ptr, MethodBindings.dtlsServerSetupPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Configure this ENetHost to use the custom Godot extension allowing DTLS encryption for ENet clients. Call this before [connectToHost] to have ENet connect using DTLS validating the server certificate against [hostname]. You can pass the optional [clientOptions] parameter to customize the trusted certification authorities, or disable the common name verification. See [TLSOptions.client] and [TLSOptions.clientUnsafe].
   */
  @JvmOverloads
  public final fun dtlsClientSetup(hostname: String, clientOptions: TLSOptions? = null): Error {
    TransferContext.writeArguments(STRING to hostname, OBJECT to clientOptions)
    TransferContext.callMethod(ptr, MethodBindings.dtlsClientSetupPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Configures the DTLS server to automatically drop new connections.
   *
   * **Note:** This method is only relevant after calling [dtlsServerSetup].
   */
  public final fun refuseNewConnections(refuse: Boolean) {
    TransferContext.writeArguments(BOOL to refuse)
    TransferContext.callMethod(ptr, MethodBindings.refuseNewConnectionsPtr, NIL)
  }

  /**
   * Returns and resets host statistics. See [HostStatistic] for more info.
   */
  public final fun popStatistic(statistic: HostStatistic): Double {
    TransferContext.writeArguments(LONG to statistic.id)
    TransferContext.callMethod(ptr, MethodBindings.popStatisticPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Returns the maximum number of channels allowed for connected peers.
   */
  public final fun getMaxChannels(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxChannelsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the local port to which this peer is bound.
   */
  public final fun getLocalPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLocalPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the list of peers associated with this host.
   *
   * **Note:** This list might include some peers that are not fully connected or are still being disconnected.
   */
  public final fun getPeers(): VariantArray<ENetPacketPeer> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPeersPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<ENetPacketPeer>)
  }

  /**
   * Sends a [packet] toward a destination from the address and port currently bound by this ENetConnection instance.
   *
   * This is useful as it serves to establish entries in NAT routing tables on all devices between this bound instance and the public facing internet, allowing a prospective client's connection packets to be routed backward through the NAT device(s) between the public internet and this host.
   *
   * This requires forward knowledge of a prospective client's address and communication port as seen by the public internet - after any NAT devices have handled their connection request. This information can be obtained by a [url=https://en.wikipedia.org/wiki/STUN]STUN[/url] service, and must be handed off to your host by an entity that is not the prospective client. This will never work for a client behind a Symmetric NAT due to the nature of the Symmetric NAT routing algorithm, as their IP and Port cannot be known beforehand.
   */
  public final fun socketSend(
    destinationAddress: String,
    destinationPort: Int,
    packet: PackedByteArray,
  ) {
    TransferContext.writeArguments(STRING to destinationAddress, LONG to destinationPort.toLong(), PACKED_BYTE_ARRAY to packet)
    TransferContext.callMethod(ptr, MethodBindings.socketSendPtr, NIL)
  }

  public enum class CompressionMode(
    id: Long,
  ) {
    /**
     * No compression. This uses the most bandwidth, but has the upside of requiring the fewest CPU resources. This option may also be used to make network debugging using tools like Wireshark easier.
     */
    NONE(0),
    /**
     * ENet's built-in range encoding. Works well on small packets, but is not the most efficient algorithm on packets larger than 4 KB.
     */
    RANGE_CODER(1),
    /**
     * [url=https://fastlz.org/]FastLZ[/url] compression. This option uses less CPU resources compared to [COMPRESS_ZLIB], at the expense of using more bandwidth.
     */
    FASTLZ(2),
    /**
     * [url=https://www.zlib.net/]Zlib[/url] compression. This option uses less bandwidth compared to [COMPRESS_FASTLZ], at the expense of using more CPU resources.
     */
    ZLIB(3),
    /**
     * [url=https://facebook.github.io/zstd/]Zstandard[/url] compression. Note that this algorithm is not very efficient on packets smaller than 4 KB. Therefore, it's recommended to use other compression algorithms in most cases.
     */
    ZSTD(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CompressionMode = entries.single { it.id == `value` }
    }
  }

  public enum class EventType(
    id: Long,
  ) {
    /**
     * An error occurred during [service]. You will likely need to [destroy] the host and recreate it.
     */
    ERROR(-1),
    /**
     * No event occurred within the specified time limit.
     */
    NONE(0),
    /**
     * A connection request initiated by enet_host_connect has completed. The array will contain the peer which successfully connected.
     */
    CONNECT(1),
    /**
     * A peer has disconnected. This event is generated on a successful completion of a disconnect initiated by [ENetPacketPeer.peerDisconnect], if a peer has timed out, or if a connection request initialized by [connectToHost] has timed out. The array will contain the peer which disconnected. The data field contains user supplied data describing the disconnection, or 0, if none is available.
     */
    DISCONNECT(2),
    /**
     * A packet has been received from a peer. The array will contain the peer which sent the packet and the channel number upon which the packet was received. The received packet will be queued to the associated [ENetPacketPeer].
     */
    RECEIVE(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EventType = entries.single { it.id == `value` }
    }
  }

  public enum class HostStatistic(
    id: Long,
  ) {
    /**
     * Total data sent.
     */
    TOTAL_SENT_DATA(0),
    /**
     * Total UDP packets sent.
     */
    TOTAL_SENT_PACKETS(1),
    /**
     * Total data received.
     */
    TOTAL_RECEIVED_DATA(2),
    /**
     * Total UDP packets received.
     */
    TOTAL_RECEIVED_PACKETS(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): HostStatistic = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val createHostBoundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "create_host_bound", 1_515_002_313)

    internal val createHostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "create_host", 117_198_950)

    internal val destroyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "destroy", 3_218_959_716)

    internal val connectToHostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "connect_to_host", 2_171_300_490)

    internal val servicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "service", 2_402_345_344)

    internal val flushPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "flush", 3_218_959_716)

    internal val bandwidthLimitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "bandwidth_limit", 2_302_169_788)

    internal val channelLimitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "channel_limit", 1_286_410_249)

    internal val broadcastPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "broadcast", 2_772_371_345)

    internal val compressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "compress", 2_660_215_187)

    internal val dtlsServerSetupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "dtls_server_setup", 1_262_296_096)

    internal val dtlsClientSetupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "dtls_client_setup", 1_966_198_364)

    internal val refuseNewConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "refuse_new_connections", 2_586_408_642)

    internal val popStatisticPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "pop_statistic", 2_166_904_170)

    internal val getMaxChannelsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "get_max_channels", 3_905_245_786)

    internal val getLocalPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "get_local_port", 3_905_245_786)

    internal val getPeersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "get_peers", 2_915_620_761)

    internal val socketSendPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetConnection", "socket_send", 1_100_646_812)
  }
}
