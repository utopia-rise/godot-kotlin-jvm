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

@GodotBaseType
public open class UPNPDevice : RefCounted() {
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

  public fun isValidGateway(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isValidGatewayPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun queryExternalAddress(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.queryExternalAddressPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

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

  @JvmOverloads
  public fun deletePortMapping(port: Int, proto: String = "UDP"): Int {
    TransferContext.writeArguments(LONG to port.toLong(), STRING to proto)
    TransferContext.callMethod(rawPtr, MethodBindings.deletePortMappingPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public enum class IGDStatus(
    id: Long,
  ) {
    IGD_STATUS_OK(0),
    IGD_STATUS_HTTP_ERROR(1),
    IGD_STATUS_HTTP_EMPTY(2),
    IGD_STATUS_NO_URLS(3),
    IGD_STATUS_NO_IGD(4),
    IGD_STATUS_DISCONNECTED(5),
    IGD_STATUS_UNKNOWN_DEVICE(6),
    IGD_STATUS_INVALID_CONTROL(7),
    IGD_STATUS_MALLOC_ERROR(8),
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
