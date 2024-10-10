// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * This class can be used to discover compatible [UPNPDevice]s on the local network and execute
 * commands on them, like managing port mappings (for port forwarding/NAT traversal) and querying the
 * local and remote network IP address. Note that methods on this class are synchronous and block the
 * calling thread.
 * To forward a specific port (here `7777`, note both [discover] and [addPortMapping] can return
 * errors that should be checked):
 * [codeblock]
 * var upnp = UPNP.new()
 * upnp.discover()
 * upnp.add_port_mapping(7777)
 * [/codeblock]
 * To close a specific port (e.g. after you have finished using it):
 * [codeblock]
 * upnp.delete_port_mapping(port)
 * [/codeblock]
 * **Note:** UPnP discovery blocks the current thread. To perform discovery without blocking the
 * main thread, use [Thread]s like this:
 * [codeblock]
 * # Emitted when UPnP port mapping setup is completed (regardless of success or failure).
 * signal upnp_completed(error)
 *
 * # Replace this with your own server port number between 1024 and 65535.
 * const SERVER_PORT = 3928
 * var thread = null
 *
 * func _upnp_setup(server_port):
 *     # UPNP queries take some time.
 *     var upnp = UPNP.new()
 *     var err = upnp.discover()
 *
 *     if err != OK:
 *         push_error(str(err))
 *         emit_signal("upnp_completed", err)
 *         return
 *
 *     if upnp.get_gateway() and upnp.get_gateway().is_valid_gateway():
 *         upnp.add_port_mapping(server_port, server_port,
 * ProjectSettings.get_setting("application/config/name"), "UDP")
 *         upnp.add_port_mapping(server_port, server_port,
 * ProjectSettings.get_setting("application/config/name"), "TCP")
 *         emit_signal("upnp_completed", OK)
 *
 * func _ready():
 *     thread = Thread.new()
 *     thread.start(_upnp_setup.bind(SERVER_PORT))
 *
 * func _exit_tree():
 *     # Wait for thread finish here to handle game exit while the thread is running.
 *     thread.wait_to_finish()
 * [/codeblock]
 * **Terminology:** In the context of UPnP networking, "gateway" (or "internet gateway device",
 * short IGD) refers to network devices that allow computers in the local network to access the
 * internet ("wide area network", WAN). These gateways are often also called "routers".
 * **Pitfalls:**
 * - As explained above, these calls are blocking and shouldn't be run on the main thread,
 * especially as they can block for multiple seconds at a time. Use threading!
 * - Networking is physical and messy. Packets get lost in transit or get filtered, addresses, free
 * ports and assigned mappings change, and devices may leave or join the network at any time. Be
 * mindful of this, be diligent when checking and handling errors, and handle these gracefully if you
 * can: add clear error UI, timeouts and re-try handling.
 * - Port mappings may change (and be removed) at any time, and the remote/external IP address of
 * the gateway can change likewise. You should consider re-querying the external IP and try to
 * update/refresh the port mapping periodically (for example, every 5 minutes and on networking
 * failures).
 * - Not all devices support UPnP, and some users disable UPnP support. You need to handle this
 * (e.g. documenting and requiring the user to manually forward ports, or adding alternative methods of
 * NAT traversal, like a relay/mirror server, or NAT hole punching, STUN/TURN, etc.).
 * - Consider what happens on mapping conflicts. Maybe multiple users on the same network would like
 * to play your game at the same time, or maybe another application uses the same port. Make the port
 * configurable, and optimally choose a port automatically (re-trying with a different port on
 * failure).
 * **Further reading:** If you want to know more about UPnP (and the Internet Gateway Device (IGD)
 * and Port Control Protocol (PCP) specifically),
 * [url=https://en.wikipedia.org/wiki/Universal_Plug_and_Play]Wikipedia[/url] is a good first stop, the
 * specification can be found at the
 * [url=https://openconnectivity.org/developer/specifications/upnp-resources/upnp/]Open Connectivity
 * Foundation[/url] and Godot's implementation is based on the
 * [url=https://github.com/miniupnp/miniupnp]MiniUPnP client[/url].
 */
@GodotBaseType
public open class UPNP : RefCounted() {
  /**
   * Multicast interface to use for discovery. Uses the default multicast interface if empty.
   */
  public final inline var discoverMulticastIf: String
    @JvmName("discoverMulticastIfProperty")
    get() = getDiscoverMulticastIf()
    @JvmName("discoverMulticastIfProperty")
    set(`value`) {
      setDiscoverMulticastIf(value)
    }

  /**
   * If `0`, the local port to use for discovery is chosen automatically by the system. If `1`,
   * discovery will be done from the source port 1900 (same as destination port). Otherwise, the value
   * will be used as the port.
   */
  public final inline var discoverLocalPort: Int
    @JvmName("discoverLocalPortProperty")
    get() = getDiscoverLocalPort()
    @JvmName("discoverLocalPortProperty")
    set(`value`) {
      setDiscoverLocalPort(value)
    }

  /**
   * If `true`, IPv6 is used for [UPNPDevice] discovery.
   */
  public final inline var discoverIpv6: Boolean
    @JvmName("discoverIpv6Property")
    get() = isDiscoverIpv6()
    @JvmName("discoverIpv6Property")
    set(`value`) {
      setDiscoverIpv6(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_UPNP, scriptIndex)
  }

  /**
   * Returns the number of discovered [UPNPDevice]s.
   */
  public final fun getDeviceCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDeviceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the [UPNPDevice] at the given [index].
   */
  public final fun getDevice(index: Int): UPNPDevice? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getDevicePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as UPNPDevice?)
  }

  /**
   * Adds the given [UPNPDevice] to the list of discovered devices.
   */
  public final fun addDevice(device: UPNPDevice?): Unit {
    TransferContext.writeArguments(OBJECT to device)
    TransferContext.callMethod(rawPtr, MethodBindings.addDevicePtr, NIL)
  }

  /**
   * Sets the device at [index] from the list of discovered devices to [device].
   */
  public final fun setDevice(index: Int, device: UPNPDevice?): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), OBJECT to device)
    TransferContext.callMethod(rawPtr, MethodBindings.setDevicePtr, NIL)
  }

  /**
   * Removes the device at [index] from the list of discovered devices.
   */
  public final fun removeDevice(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeDevicePtr, NIL)
  }

  /**
   * Clears the list of discovered devices.
   */
  public final fun clearDevices(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearDevicesPtr, NIL)
  }

  /**
   * Returns the default gateway. That is the first discovered [UPNPDevice] that is also a valid IGD
   * (InternetGatewayDevice).
   */
  public final fun getGateway(): UPNPDevice? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGatewayPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as UPNPDevice?)
  }

  /**
   * Discovers local [UPNPDevice]s. Clears the list of previously discovered devices.
   * Filters for IGD (InternetGatewayDevice) type devices by default, as those manage port
   * forwarding. [timeout] is the time to wait for responses in milliseconds. [ttl] is the
   * time-to-live; only touch this if you know what you're doing.
   * See [UPNPResult] for possible return values.
   */
  @JvmOverloads
  public final fun discover(
    timeout: Int = 2000,
    ttl: Int = 2,
    deviceFilter: String = "InternetGatewayDevice",
  ): Int {
    TransferContext.writeArguments(LONG to timeout.toLong(), LONG to ttl.toLong(), STRING to deviceFilter)
    TransferContext.callMethod(rawPtr, MethodBindings.discoverPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the external [IP] address of the default gateway (see [getGateway]) as string. Returns
   * an empty string on error.
   */
  public final fun queryExternalAddress(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.queryExternalAddressPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Adds a mapping to forward the external [port] (between 1 and 65535, although recommended to use
   * port 1024 or above) on the default gateway (see [getGateway]) to the [portInternal] on the local
   * machine for the given protocol [proto] (either `"TCP"` or `"UDP"`, with UDP being the default). If
   * a port mapping for the given port and protocol combination already exists on that gateway device,
   * this method tries to overwrite it. If that is not desired, you can retrieve the gateway manually
   * with [getGateway] and call [addPortMapping] on it, if any. Note that forwarding a well-known port
   * (below 1024) with UPnP may fail depending on the device.
   * Depending on the gateway device, if a mapping for that port already exists, it will either be
   * updated or it will refuse this command due to that conflict, especially if the existing mapping
   * for that port wasn't created via UPnP or points to a different network address (or device) than
   * this one.
   * If [portInternal] is `0` (the default), the same port number is used for both the external and
   * the internal port (the [port] value).
   * The description ([desc]) is shown in some routers management UIs and can be used to point out
   * which application added the mapping.
   * The mapping's lease [duration] can be limited by specifying a duration in seconds. The default
   * of `0` means no duration, i.e. a permanent lease and notably some devices only support these
   * permanent leases. Note that whether permanent or not, this is only a request and the gateway may
   * still decide at any point to remove the mapping (which usually happens on a reboot of the gateway,
   * when its external IP address changes, or on some models when it detects a port mapping has become
   * inactive, i.e. had no traffic for multiple minutes). If not `0` (permanent), the allowed range
   * according to spec is between `120` (2 minutes) and `86400` seconds (24 hours).
   * See [UPNPResult] for possible return values.
   */
  @JvmOverloads
  public final fun addPortMapping(
    port: Int,
    portInternal: Int = 0,
    desc: String = "",
    proto: String = "UDP",
    duration: Int = 0,
  ): Int {
    TransferContext.writeArguments(LONG to port.toLong(), LONG to portInternal.toLong(), STRING to desc, STRING to proto, LONG to duration.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addPortMappingPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Deletes the port mapping for the given port and protocol combination on the default gateway
   * (see [getGateway]) if one exists. [port] must be a valid port between 1 and 65535, [proto] can be
   * either `"TCP"` or `"UDP"`. May be refused for mappings pointing to addresses other than this one,
   * for well-known ports (below 1024), or for mappings not added via UPnP. See [UPNPResult] for
   * possible return values.
   */
  @JvmOverloads
  public final fun deletePortMapping(port: Int, proto: String = "UDP"): Int {
    TransferContext.writeArguments(LONG to port.toLong(), STRING to proto)
    TransferContext.callMethod(rawPtr, MethodBindings.deletePortMappingPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setDiscoverMulticastIf(mIf: String): Unit {
    TransferContext.writeArguments(STRING to mIf)
    TransferContext.callMethod(rawPtr, MethodBindings.setDiscoverMulticastIfPtr, NIL)
  }

  public final fun getDiscoverMulticastIf(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDiscoverMulticastIfPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setDiscoverLocalPort(port: Int): Unit {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setDiscoverLocalPortPtr, NIL)
  }

  public final fun getDiscoverLocalPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDiscoverLocalPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setDiscoverIpv6(ipv6: Boolean): Unit {
    TransferContext.writeArguments(BOOL to ipv6)
    TransferContext.callMethod(rawPtr, MethodBindings.setDiscoverIpv6Ptr, NIL)
  }

  public final fun isDiscoverIpv6(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDiscoverIpv6Ptr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public enum class UPNPResult(
    id: Long,
  ) {
    /**
     * UPNP command or discovery was successful.
     */
    UPNP_RESULT_SUCCESS(0),
    /**
     * Not authorized to use the command on the [UPNPDevice]. May be returned when the user disabled
     * UPNP on their router.
     */
    UPNP_RESULT_NOT_AUTHORIZED(1),
    /**
     * No port mapping was found for the given port, protocol combination on the given [UPNPDevice].
     */
    UPNP_RESULT_PORT_MAPPING_NOT_FOUND(2),
    /**
     * Inconsistent parameters.
     */
    UPNP_RESULT_INCONSISTENT_PARAMETERS(3),
    /**
     * No such entry in array. May be returned if a given port, protocol combination is not found on
     * an [UPNPDevice].
     */
    UPNP_RESULT_NO_SUCH_ENTRY_IN_ARRAY(4),
    /**
     * The action failed.
     */
    UPNP_RESULT_ACTION_FAILED(5),
    /**
     * The [UPNPDevice] does not allow wildcard values for the source IP address.
     */
    UPNP_RESULT_SRC_IP_WILDCARD_NOT_PERMITTED(6),
    /**
     * The [UPNPDevice] does not allow wildcard values for the external port.
     */
    UPNP_RESULT_EXT_PORT_WILDCARD_NOT_PERMITTED(7),
    /**
     * The [UPNPDevice] does not allow wildcard values for the internal port.
     */
    UPNP_RESULT_INT_PORT_WILDCARD_NOT_PERMITTED(8),
    /**
     * The remote host value must be a wildcard.
     */
    UPNP_RESULT_REMOTE_HOST_MUST_BE_WILDCARD(9),
    /**
     * The external port value must be a wildcard.
     */
    UPNP_RESULT_EXT_PORT_MUST_BE_WILDCARD(10),
    /**
     * No port maps are available. May also be returned if port mapping functionality is not
     * available.
     */
    UPNP_RESULT_NO_PORT_MAPS_AVAILABLE(11),
    /**
     * Conflict with other mechanism. May be returned instead of
     * [UPNP_RESULT_CONFLICT_WITH_OTHER_MAPPING] if a port mapping conflicts with an existing one.
     */
    UPNP_RESULT_CONFLICT_WITH_OTHER_MECHANISM(12),
    /**
     * Conflict with an existing port mapping.
     */
    UPNP_RESULT_CONFLICT_WITH_OTHER_MAPPING(13),
    /**
     * External and internal port values must be the same.
     */
    UPNP_RESULT_SAME_PORT_VALUES_REQUIRED(14),
    /**
     * Only permanent leases are supported. Do not use the `duration` parameter when adding port
     * mappings.
     */
    UPNP_RESULT_ONLY_PERMANENT_LEASE_SUPPORTED(15),
    /**
     * Invalid gateway.
     */
    UPNP_RESULT_INVALID_GATEWAY(16),
    /**
     * Invalid port.
     */
    UPNP_RESULT_INVALID_PORT(17),
    /**
     * Invalid protocol.
     */
    UPNP_RESULT_INVALID_PROTOCOL(18),
    /**
     * Invalid duration.
     */
    UPNP_RESULT_INVALID_DURATION(19),
    /**
     * Invalid arguments.
     */
    UPNP_RESULT_INVALID_ARGS(20),
    /**
     * Invalid response.
     */
    UPNP_RESULT_INVALID_RESPONSE(21),
    /**
     * Invalid parameter.
     */
    UPNP_RESULT_INVALID_PARAM(22),
    /**
     * HTTP error.
     */
    UPNP_RESULT_HTTP_ERROR(23),
    /**
     * Socket error.
     */
    UPNP_RESULT_SOCKET_ERROR(24),
    /**
     * Error allocating memory.
     */
    UPNP_RESULT_MEM_ALLOC_ERROR(25),
    /**
     * No gateway available. You may need to call [discover] first, or discovery didn't detect any
     * valid IGDs (InternetGatewayDevices).
     */
    UPNP_RESULT_NO_GATEWAY(26),
    /**
     * No devices available. You may need to call [discover] first, or discovery didn't detect any
     * valid [UPNPDevice]s.
     */
    UPNP_RESULT_NO_DEVICES(27),
    /**
     * Unknown error.
     */
    UPNP_RESULT_UNKNOWN_ERROR(28),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): UPNPResult = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getDeviceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNP", "get_device_count", 3905245786)

    public val getDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNP", "get_device", 2193290270)

    public val addDevicePtr: VoidPtr = TypeManager.getMethodBindPtr("UPNP", "add_device", 986715920)

    public val setDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNP", "set_device", 3015133723)

    public val removeDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNP", "remove_device", 1286410249)

    public val clearDevicesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNP", "clear_devices", 3218959716)

    public val getGatewayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNP", "get_gateway", 2276800779)

    public val discoverPtr: VoidPtr = TypeManager.getMethodBindPtr("UPNP", "discover", 1575334765)

    public val queryExternalAddressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNP", "query_external_address", 201670096)

    public val addPortMappingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNP", "add_port_mapping", 818314583)

    public val deletePortMappingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNP", "delete_port_mapping", 3444187325)

    public val setDiscoverMulticastIfPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNP", "set_discover_multicast_if", 83702148)

    public val getDiscoverMulticastIfPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNP", "get_discover_multicast_if", 201670096)

    public val setDiscoverLocalPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNP", "set_discover_local_port", 1286410249)

    public val getDiscoverLocalPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNP", "get_discover_local_port", 3905245786)

    public val setDiscoverIpv6Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNP", "set_discover_ipv6", 2586408642)

    public val isDiscoverIpv6Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNP", "is_discover_ipv6", 36873697)
  }
}
