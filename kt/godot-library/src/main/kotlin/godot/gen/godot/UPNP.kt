// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class UPNP : Reference() {
  open var discoverIpv6: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_GET_DISCOVER_IPV6, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_SET_DISCOVER_IPV6, NIL)
    }

  open var discoverLocalPort: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_GET_DISCOVER_LOCAL_PORT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_SET_DISCOVER_LOCAL_PORT, NIL)
    }

  open var discoverMulticastIf: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_GET_DISCOVER_MULTICAST_IF,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_SET_DISCOVER_MULTICAST_IF,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_UPNP)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun addDevice(device: UPNPDevice) {
    TransferContext.writeArguments(OBJECT to device)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_ADD_DEVICE, NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_ADD_PORT_MAPPING, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun clearDevices() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_CLEAR_DEVICES, NIL)
  }

  open fun deletePortMapping(port: Long, proto: String = "UDP"): Long {
    TransferContext.writeArguments(LONG to port, STRING to proto)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_DELETE_PORT_MAPPING, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun discover(
    timeout: Long = 2000,
    ttl: Long = 2,
    deviceFilter: String = "InternetGatewayDevice"
  ): Long {
    TransferContext.writeArguments(LONG to timeout, LONG to ttl, STRING to deviceFilter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_DISCOVER, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getDevice(index: Long): UPNPDevice? {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_GET_DEVICE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as UPNPDevice?
  }

  open fun getDeviceCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_GET_DEVICE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getGateway(): UPNPDevice? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_GET_GATEWAY, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as UPNPDevice?
  }

  open fun queryExternalAddress(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_QUERY_EXTERNAL_ADDRESS, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun removeDevice(index: Long) {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_REMOVE_DEVICE, NIL)
  }

  open fun setDevice(index: Long, device: UPNPDevice) {
    TransferContext.writeArguments(LONG to index, OBJECT to device)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_SET_DEVICE, NIL)
  }

  enum class UPNPResult(
    id: Long
  ) {
    UPNP_RESULT_SUCCESS(0),

    UPNP_RESULT_NOT_AUTHORIZED(1),

    UPNP_RESULT_PORT_MAPPING_NOT_FOUND(2),

    UPNP_RESULT_INCONSISTENT_PARAMETERS(3),

    UPNP_RESULT_NO_SUCH_ENTRY_IN_ARRAY(4),

    UPNP_RESULT_ACTION_FAILED(5),

    UPNP_RESULT_SRC_IP_WILDCARD_NOT_PERMITTED(6),

    UPNP_RESULT_EXT_PORT_WILDCARD_NOT_PERMITTED(7),

    UPNP_RESULT_INT_PORT_WILDCARD_NOT_PERMITTED(8),

    UPNP_RESULT_REMOTE_HOST_MUST_BE_WILDCARD(9),

    UPNP_RESULT_EXT_PORT_MUST_BE_WILDCARD(10),

    UPNP_RESULT_NO_PORT_MAPS_AVAILABLE(11),

    UPNP_RESULT_CONFLICT_WITH_OTHER_MECHANISM(12),

    UPNP_RESULT_CONFLICT_WITH_OTHER_MAPPING(13),

    UPNP_RESULT_SAME_PORT_VALUES_REQUIRED(14),

    UPNP_RESULT_ONLY_PERMANENT_LEASE_SUPPORTED(15),

    UPNP_RESULT_INVALID_GATEWAY(16),

    UPNP_RESULT_INVALID_PORT(17),

    UPNP_RESULT_INVALID_PROTOCOL(18),

    UPNP_RESULT_INVALID_DURATION(19),

    UPNP_RESULT_INVALID_ARGS(20),

    UPNP_RESULT_INVALID_RESPONSE(21),

    UPNP_RESULT_INVALID_PARAM(22),

    UPNP_RESULT_HTTP_ERROR(23),

    UPNP_RESULT_SOCKET_ERROR(24),

    UPNP_RESULT_MEM_ALLOC_ERROR(25),

    UPNP_RESULT_NO_GATEWAY(26),

    UPNP_RESULT_NO_DEVICES(27),

    UPNP_RESULT_UNKNOWN_ERROR(28);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val UPNP_RESULT_ACTION_FAILED: Long = 5

    final const val UPNP_RESULT_CONFLICT_WITH_OTHER_MAPPING: Long = 13

    final const val UPNP_RESULT_CONFLICT_WITH_OTHER_MECHANISM: Long = 12

    final const val UPNP_RESULT_EXT_PORT_MUST_BE_WILDCARD: Long = 10

    final const val UPNP_RESULT_EXT_PORT_WILDCARD_NOT_PERMITTED: Long = 7

    final const val UPNP_RESULT_HTTP_ERROR: Long = 23

    final const val UPNP_RESULT_INCONSISTENT_PARAMETERS: Long = 3

    final const val UPNP_RESULT_INT_PORT_WILDCARD_NOT_PERMITTED: Long = 8

    final const val UPNP_RESULT_INVALID_ARGS: Long = 20

    final const val UPNP_RESULT_INVALID_DURATION: Long = 19

    final const val UPNP_RESULT_INVALID_GATEWAY: Long = 16

    final const val UPNP_RESULT_INVALID_PARAM: Long = 22

    final const val UPNP_RESULT_INVALID_PORT: Long = 17

    final const val UPNP_RESULT_INVALID_PROTOCOL: Long = 18

    final const val UPNP_RESULT_INVALID_RESPONSE: Long = 21

    final const val UPNP_RESULT_MEM_ALLOC_ERROR: Long = 25

    final const val UPNP_RESULT_NOT_AUTHORIZED: Long = 1

    final const val UPNP_RESULT_NO_DEVICES: Long = 27

    final const val UPNP_RESULT_NO_GATEWAY: Long = 26

    final const val UPNP_RESULT_NO_PORT_MAPS_AVAILABLE: Long = 11

    final const val UPNP_RESULT_NO_SUCH_ENTRY_IN_ARRAY: Long = 4

    final const val UPNP_RESULT_ONLY_PERMANENT_LEASE_SUPPORTED: Long = 15

    final const val UPNP_RESULT_PORT_MAPPING_NOT_FOUND: Long = 2

    final const val UPNP_RESULT_REMOTE_HOST_MUST_BE_WILDCARD: Long = 9

    final const val UPNP_RESULT_SAME_PORT_VALUES_REQUIRED: Long = 14

    final const val UPNP_RESULT_SOCKET_ERROR: Long = 24

    final const val UPNP_RESULT_SRC_IP_WILDCARD_NOT_PERMITTED: Long = 6

    final const val UPNP_RESULT_SUCCESS: Long = 0

    final const val UPNP_RESULT_UNKNOWN_ERROR: Long = 28
  }
}
