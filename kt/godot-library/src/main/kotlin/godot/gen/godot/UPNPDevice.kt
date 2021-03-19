// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class UPNPDevice : Reference() {
  open var descriptionUrl: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_GET_DESCRIPTION_URL,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_SET_DESCRIPTION_URL,
          NIL)
    }

  open var igdControlUrl: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_GET_IGD_CONTROL_URL,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_SET_IGD_CONTROL_URL,
          NIL)
    }

  open var igdOurAddr: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_GET_IGD_OUR_ADDR,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_SET_IGD_OUR_ADDR, NIL)
    }

  open var igdServiceType: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_GET_IGD_SERVICE_TYPE,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_SET_IGD_SERVICE_TYPE,
          NIL)
    }

  open var igdStatus: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_GET_IGD_STATUS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_SET_IGD_STATUS, NIL)
    }

  open var serviceType: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_GET_SERVICE_TYPE,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_SET_SERVICE_TYPE, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_UPNPDEVICE)
  }

  open fun addPortMapping(
    port: Long,
    portInternal: Long = 0,
    desc: String = "",
    proto: String = "UDP",
    duration: Long = 0
  ): Long {
    TransferContext.writeArguments(LONG to port, LONG to portInternal, STRING to desc, STRING to
        proto, LONG to duration)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_ADD_PORT_MAPPING, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun deletePortMapping(port: Long, proto: String = "UDP"): Long {
    TransferContext.writeArguments(LONG to port, STRING to proto)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_DELETE_PORT_MAPPING,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun isValidGateway(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_IS_VALID_GATEWAY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun queryExternalAddress(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNPDEVICE_QUERY_EXTERNAL_ADDRESS,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  enum class IGDStatus(
    id: Long
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

    IGD_STATUS_UNKNOWN_ERROR(9);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val IGD_STATUS_DISCONNECTED: Long = 5

    final const val IGD_STATUS_HTTP_EMPTY: Long = 2

    final const val IGD_STATUS_HTTP_ERROR: Long = 1

    final const val IGD_STATUS_INVALID_CONTROL: Long = 7

    final const val IGD_STATUS_MALLOC_ERROR: Long = 8

    final const val IGD_STATUS_NO_IGD: Long = 4

    final const val IGD_STATUS_NO_URLS: Long = 3

    final const val IGD_STATUS_OK: Long = 0

    final const val IGD_STATUS_UNKNOWN_DEVICE: Long = 6

    final const val IGD_STATUS_UNKNOWN_ERROR: Long = 9
  }
}
