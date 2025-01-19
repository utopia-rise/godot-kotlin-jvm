// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

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
    createNativeObject(683, scriptIndex)
  }

  /**
   * Returns `true` if this is a valid IGD (InternetGatewayDevice) which potentially supports port
   * forwarding.
   */
  public final fun isValidGateway(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isValidGatewayPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the external IP address of this [UPNPDevice] or an empty string.
   */
  public final fun queryExternalAddress(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.queryExternalAddressPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
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
    TransferContext.writeArguments(LONG to port.toLong(), LONG to portInternal.toLong(), STRING to desc, STRING to proto, LONG to duration.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addPortMappingPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Deletes the port mapping identified by the given port and protocol combination on this device.
   * See [UPNP.deletePortMapping].
   */
  @JvmOverloads
  public final fun deletePortMapping(port: Int, proto: String = "UDP"): Int {
    TransferContext.writeArguments(LONG to port.toLong(), STRING to proto)
    TransferContext.callMethod(ptr, MethodBindings.deletePortMappingPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setDescriptionUrl(url: String): Unit {
    TransferContext.writeArguments(STRING to url)
    TransferContext.callMethod(ptr, MethodBindings.setDescriptionUrlPtr, NIL)
  }

  public final fun getDescriptionUrl(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDescriptionUrlPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setServiceType(type: String): Unit {
    TransferContext.writeArguments(STRING to type)
    TransferContext.callMethod(ptr, MethodBindings.setServiceTypePtr, NIL)
  }

  public final fun getServiceType(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getServiceTypePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setIgdControlUrl(url: String): Unit {
    TransferContext.writeArguments(STRING to url)
    TransferContext.callMethod(ptr, MethodBindings.setIgdControlUrlPtr, NIL)
  }

  public final fun getIgdControlUrl(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getIgdControlUrlPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setIgdServiceType(type: String): Unit {
    TransferContext.writeArguments(STRING to type)
    TransferContext.callMethod(ptr, MethodBindings.setIgdServiceTypePtr, NIL)
  }

  public final fun getIgdServiceType(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getIgdServiceTypePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setIgdOurAddr(addr: String): Unit {
    TransferContext.writeArguments(STRING to addr)
    TransferContext.callMethod(ptr, MethodBindings.setIgdOurAddrPtr, NIL)
  }

  public final fun getIgdOurAddr(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getIgdOurAddrPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setIgdStatus(status: IGDStatus): Unit {
    TransferContext.writeArguments(LONG to status.id)
    TransferContext.callMethod(ptr, MethodBindings.setIgdStatusPtr, NIL)
  }

  public final fun getIgdStatus(): IGDStatus {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getIgdStatusPtr, LONG)
    return UPNPDevice.IGDStatus.from(TransferContext.readReturnValue(LONG) as Long)
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

  public object MethodBindings {
    internal val isValidGatewayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "is_valid_gateway", 36873697)

    internal val queryExternalAddressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "query_external_address", 201670096)

    internal val addPortMappingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "add_port_mapping", 818314583)

    internal val deletePortMappingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "delete_port_mapping", 3444187325)

    internal val setDescriptionUrlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "set_description_url", 83702148)

    internal val getDescriptionUrlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "get_description_url", 201670096)

    internal val setServiceTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "set_service_type", 83702148)

    internal val getServiceTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "get_service_type", 201670096)

    internal val setIgdControlUrlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "set_igd_control_url", 83702148)

    internal val getIgdControlUrlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "get_igd_control_url", 201670096)

    internal val setIgdServiceTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "set_igd_service_type", 83702148)

    internal val getIgdServiceTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "get_igd_service_type", 201670096)

    internal val setIgdOurAddrPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "set_igd_our_addr", 83702148)

    internal val getIgdOurAddrPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "get_igd_our_addr", 201670096)

    internal val setIgdStatusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "set_igd_status", 519504122)

    internal val getIgdStatusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "get_igd_status", 180887011)
  }
}
