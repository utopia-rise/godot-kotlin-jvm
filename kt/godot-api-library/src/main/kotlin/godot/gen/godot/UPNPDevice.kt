// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_UPNPDEVICE_INDEX: Int = 610

/**
 * Universal Plug and Play (UPnP) device. See [UPNP] for UPnP discovery and utility functions.
 * Provides low-level access to UPNP control commands. Allows to manage port mappings (port forwarding)
 * and to query network information of the device (like local and external IP address and status). Note
 * that methods on this class are synchronous and block the calling thread.
 */
@GodotBaseType
public open class UPNPDevice : RefCounted() {
  /**
   * URL to the device description.
   */
  public final inline var descriptionUrl: String
    @JvmName("descriptionUrlProperty")
    get() = getDescriptionUrl()
    @JvmName("descriptionUrlProperty")
    set(`value`) {
      setDescriptionUrl(value)
    }

  /**
   * Service type.
   */
  public final inline var serviceType: String
    @JvmName("serviceTypeProperty")
    get() = getServiceType()
    @JvmName("serviceTypeProperty")
    set(`value`) {
      setServiceType(value)
    }

  /**
   * IDG control URL.
   */
  public final inline var igdControlUrl: String
    @JvmName("igdControlUrlProperty")
    get() = getIgdControlUrl()
    @JvmName("igdControlUrlProperty")
    set(`value`) {
      setIgdControlUrl(value)
    }

  /**
   * IGD service type.
   */
  public final inline var igdServiceType: String
    @JvmName("igdServiceTypeProperty")
    get() = getIgdServiceType()
    @JvmName("igdServiceTypeProperty")
    set(`value`) {
      setIgdServiceType(value)
    }

  /**
   * Address of the local machine in the network connecting it to this [UPNPDevice].
   */
  public final inline var igdOurAddr: String
    @JvmName("igdOurAddrProperty")
    get() = getIgdOurAddr()
    @JvmName("igdOurAddrProperty")
    set(`value`) {
      setIgdOurAddr(value)
    }

  /**
   * IGD status. See [IGDStatus].
   */
  public final inline var igdStatus: IGDStatus
    @JvmName("igdStatusProperty")
    get() = getIgdStatus()
    @JvmName("igdStatusProperty")
    set(`value`) {
      setIgdStatus(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_UPNPDEVICE_INDEX, scriptIndex)
  }

  /**
   * Returns `true` if this is a valid IGD (InternetGatewayDevice) which potentially supports port
   * forwarding.
   */
  public final fun isValidGateway(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isValidGatewayPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the external IP address of this [UPNPDevice] or an empty string.
   */
  public final fun queryExternalAddress(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.queryExternalAddressPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Adds a port mapping to forward the given external port on this [UPNPDevice] for the given
   * protocol to the local machine. See [UPNP.addPortMapping].
   */
  @JvmOverloads
  public final fun addPortMapping(
    port: Int,
    portInternal: Int = 0,
    desc: String = "",
    proto: String = "UDP",
    duration: Int = 0,
  ): Int {
    Internals.writeArguments(LONG to port.toLong(), LONG to portInternal.toLong(), STRING to desc, STRING to proto, LONG to duration.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addPortMappingPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Deletes the port mapping identified by the given port and protocol combination on this device.
   * See [UPNP.deletePortMapping].
   */
  @JvmOverloads
  public final fun deletePortMapping(port: Int, proto: String = "UDP"): Int {
    Internals.writeArguments(LONG to port.toLong(), STRING to proto)
    Internals.callMethod(rawPtr, MethodBindings.deletePortMappingPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setDescriptionUrl(url: String): Unit {
    Internals.writeArguments(STRING to url)
    Internals.callMethod(rawPtr, MethodBindings.setDescriptionUrlPtr, NIL)
  }

  public final fun getDescriptionUrl(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDescriptionUrlPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setServiceType(type: String): Unit {
    Internals.writeArguments(STRING to type)
    Internals.callMethod(rawPtr, MethodBindings.setServiceTypePtr, NIL)
  }

  public final fun getServiceType(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getServiceTypePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setIgdControlUrl(url: String): Unit {
    Internals.writeArguments(STRING to url)
    Internals.callMethod(rawPtr, MethodBindings.setIgdControlUrlPtr, NIL)
  }

  public final fun getIgdControlUrl(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getIgdControlUrlPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setIgdServiceType(type: String): Unit {
    Internals.writeArguments(STRING to type)
    Internals.callMethod(rawPtr, MethodBindings.setIgdServiceTypePtr, NIL)
  }

  public final fun getIgdServiceType(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getIgdServiceTypePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setIgdOurAddr(addr: String): Unit {
    Internals.writeArguments(STRING to addr)
    Internals.callMethod(rawPtr, MethodBindings.setIgdOurAddrPtr, NIL)
  }

  public final fun getIgdOurAddr(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getIgdOurAddrPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setIgdStatus(status: IGDStatus): Unit {
    Internals.writeArguments(LONG to status.id)
    Internals.callMethod(rawPtr, MethodBindings.setIgdStatusPtr, NIL)
  }

  public final fun getIgdStatus(): IGDStatus {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getIgdStatusPtr, LONG)
    return UPNPDevice.IGDStatus.from(Internals.readReturnValue(LONG) as Long)
  }

  public enum class IGDStatus(
    id: Long,
  ) {
    /**
     * OK.
     */
    IGD_STATUS_OK(0),
    /**
     * HTTP error.
     */
    IGD_STATUS_HTTP_ERROR(1),
    /**
     * Empty HTTP response.
     */
    IGD_STATUS_HTTP_EMPTY(2),
    /**
     * Returned response contained no URLs.
     */
    IGD_STATUS_NO_URLS(3),
    /**
     * Not a valid IGD.
     */
    IGD_STATUS_NO_IGD(4),
    /**
     * Disconnected.
     */
    IGD_STATUS_DISCONNECTED(5),
    /**
     * Unknown device.
     */
    IGD_STATUS_UNKNOWN_DEVICE(6),
    /**
     * Invalid control.
     */
    IGD_STATUS_INVALID_CONTROL(7),
    /**
     * Memory allocation error.
     */
    IGD_STATUS_MALLOC_ERROR(8),
    /**
     * Unknown error.
     */
    IGD_STATUS_UNKNOWN_ERROR(9),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): IGDStatus = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val isValidGatewayPtr: VoidPtr =
        Internals.getMethodBindPtr("UPNPDevice", "is_valid_gateway", 36873697)

    public val queryExternalAddressPtr: VoidPtr =
        Internals.getMethodBindPtr("UPNPDevice", "query_external_address", 201670096)

    public val addPortMappingPtr: VoidPtr =
        Internals.getMethodBindPtr("UPNPDevice", "add_port_mapping", 818314583)

    public val deletePortMappingPtr: VoidPtr =
        Internals.getMethodBindPtr("UPNPDevice", "delete_port_mapping", 3444187325)

    public val setDescriptionUrlPtr: VoidPtr =
        Internals.getMethodBindPtr("UPNPDevice", "set_description_url", 83702148)

    public val getDescriptionUrlPtr: VoidPtr =
        Internals.getMethodBindPtr("UPNPDevice", "get_description_url", 201670096)

    public val setServiceTypePtr: VoidPtr =
        Internals.getMethodBindPtr("UPNPDevice", "set_service_type", 83702148)

    public val getServiceTypePtr: VoidPtr =
        Internals.getMethodBindPtr("UPNPDevice", "get_service_type", 201670096)

    public val setIgdControlUrlPtr: VoidPtr =
        Internals.getMethodBindPtr("UPNPDevice", "set_igd_control_url", 83702148)

    public val getIgdControlUrlPtr: VoidPtr =
        Internals.getMethodBindPtr("UPNPDevice", "get_igd_control_url", 201670096)

    public val setIgdServiceTypePtr: VoidPtr =
        Internals.getMethodBindPtr("UPNPDevice", "set_igd_service_type", 83702148)

    public val getIgdServiceTypePtr: VoidPtr =
        Internals.getMethodBindPtr("UPNPDevice", "get_igd_service_type", 201670096)

    public val setIgdOurAddrPtr: VoidPtr =
        Internals.getMethodBindPtr("UPNPDevice", "set_igd_our_addr", 83702148)

    public val getIgdOurAddrPtr: VoidPtr =
        Internals.getMethodBindPtr("UPNPDevice", "get_igd_our_addr", 201670096)

    public val setIgdStatusPtr: VoidPtr =
        Internals.getMethodBindPtr("UPNPDevice", "set_igd_status", 519504122)

    public val getIgdStatusPtr: VoidPtr =
        Internals.getMethodBindPtr("UPNPDevice", "get_igd_status", 180887011)
  }
}
