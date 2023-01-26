// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class UPNPDevice : RefCounted() {
  public var descriptionUrl: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_GET_DESCRIPTION_URL,
          STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_SET_DESCRIPTION_URL,
          NIL)
    }

  public var serviceType: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_GET_SERVICE_TYPE,
          STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_SET_SERVICE_TYPE, NIL)
    }

  public var igdControlUrl: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_GET_IGD_CONTROL_URL,
          STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_SET_IGD_CONTROL_URL,
          NIL)
    }

  public var igdServiceType: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_GET_IGD_SERVICE_TYPE,
          STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_SET_IGD_SERVICE_TYPE,
          NIL)
    }

  public var igdOurAddr: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_GET_IGD_OUR_ADDR,
          STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_SET_IGD_OUR_ADDR, NIL)
    }

  public var igdStatus: IGDStatus
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_GET_IGD_STATUS, LONG)
      return UPNPDevice.IGDStatus.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_SET_IGD_STATUS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_UPNPDEVICE, scriptIndex)
    return true
  }

  public fun isValidGateway(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_IS_VALID_GATEWAY, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun queryExternalAddress(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_QUERY_EXTERNAL_ADDRESS,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun addPortMapping(
    port: Int,
    portInternal: Int = 0,
    desc: String = "",
    proto: String = "UDP",
    duration: Int = 0,
  ): Int {
    TransferContext.writeArguments(LONG to port.toLong(), LONG to portInternal.toLong(), STRING to desc, STRING to proto, LONG to duration.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_ADD_PORT_MAPPING, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun deletePortMapping(port: Int, proto: String = "UDP"): Int {
    TransferContext.writeArguments(LONG to port.toLong(), STRING to proto)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_DELETE_PORT_MAPPING,
        LONG)
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
