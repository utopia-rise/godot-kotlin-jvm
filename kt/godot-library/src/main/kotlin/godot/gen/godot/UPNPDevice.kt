// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
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
  public var descriptionUrl: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDescriptionUrlPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDescriptionUrlPtr, NIL)
    }

  /**
   * Service type.
   */
  public var serviceType: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getServiceTypePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setServiceTypePtr, NIL)
    }

  /**
   * IDG control URL.
   */
  public var igdControlUrl: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIgdControlUrlPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIgdControlUrlPtr, NIL)
    }

  /**
   * IGD service type.
   */
  public var igdServiceType: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIgdServiceTypePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIgdServiceTypePtr, NIL)
    }

  /**
   * Address of the local machine in the network connecting it to this [UPNPDevice].
   */
  public var igdOurAddr: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIgdOurAddrPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIgdOurAddrPtr, NIL)
    }

  /**
   * IGD status. See [IGDStatus].
   */
  public var igdStatus: IGDStatus
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIgdStatusPtr, LONG)
      return UPNPDevice.IGDStatus.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setIgdStatusPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_UPNPDEVICE, scriptIndex)
    return true
  }

  /**
   * Returns `true` if this is a valid IGD (InternetGatewayDevice) which potentially supports port
   * forwarding.
   */
  public fun isValidGateway(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isValidGatewayPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the external IP address of this [UPNPDevice] or an empty string.
   */
  public fun queryExternalAddress(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.queryExternalAddressPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Adds a port mapping to forward the given external port on this [UPNPDevice] for the given
   * protocol to the local machine. See [UPNP.addPortMapping].
   */
  @JvmOverloads
  public fun addPortMapping(
    port: Int,
    portInternal: Int = 0,
    desc: String = "",
    proto: String = "UDP",
    duration: Int = 0,
  ): Int {
    TransferContext.writeArguments(LONG to port.toLong(), LONG to portInternal.toLong(), STRING to desc, STRING to proto, LONG to duration.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addPortMappingPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Deletes the port mapping identified by the given port and protocol combination on this device.
   * See [UPNP.deletePortMapping].
   */
  @JvmOverloads
  public fun deletePortMapping(port: Int, proto: String = "UDP"): Int {
    TransferContext.writeArguments(LONG to port.toLong(), STRING to proto)
    TransferContext.callMethod(rawPtr, MethodBindings.deletePortMappingPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val isValidGatewayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "is_valid_gateway")

    public val queryExternalAddressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "query_external_address")

    public val addPortMappingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "add_port_mapping")

    public val deletePortMappingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "delete_port_mapping")

    public val setDescriptionUrlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "set_description_url")

    public val getDescriptionUrlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "get_description_url")

    public val setServiceTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "set_service_type")

    public val getServiceTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "get_service_type")

    public val setIgdControlUrlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "set_igd_control_url")

    public val getIgdControlUrlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "get_igd_control_url")

    public val setIgdServiceTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "set_igd_service_type")

    public val getIgdServiceTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "get_igd_service_type")

    public val setIgdOurAddrPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "set_igd_our_addr")

    public val getIgdOurAddrPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "get_igd_our_addr")

    public val setIgdStatusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "set_igd_status")

    public val getIgdStatusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNPDevice", "get_igd_status")
  }
}
