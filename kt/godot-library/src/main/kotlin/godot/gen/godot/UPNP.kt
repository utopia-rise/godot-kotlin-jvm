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
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class UPNP : RefCounted() {
  public var discoverMulticastIf: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_GET_DISCOVER_MULTICAST_IF,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_SET_DISCOVER_MULTICAST_IF,
          NIL)
    }

  public var discoverLocalPort: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_GET_DISCOVER_LOCAL_PORT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_SET_DISCOVER_LOCAL_PORT, NIL)
    }

  public var discoverIpv6: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_IS_DISCOVER_IPV6, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_SET_DISCOVER_IPV6, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_UPNP, scriptIndex)
    return true
  }

  public fun getDeviceCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_GET_DEVICE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun getDevice(index: Long): UPNPDevice? {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_GET_DEVICE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as UPNPDevice?
  }

  public fun addDevice(device: UPNPDevice): Unit {
    TransferContext.writeArguments(OBJECT to device)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_ADD_DEVICE, NIL)
  }

  public fun setDevice(index: Long, device: UPNPDevice): Unit {
    TransferContext.writeArguments(LONG to index, OBJECT to device)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_SET_DEVICE, NIL)
  }

  public fun removeDevice(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_REMOVE_DEVICE, NIL)
  }

  public fun clearDevices(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_CLEAR_DEVICES, NIL)
  }

  public fun getGateway(): UPNPDevice? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_GET_GATEWAY, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as UPNPDevice?
  }

  public fun discover(
    timeout: Long = 2000,
    ttl: Long = 2,
    deviceFilter: String = "InternetGatewayDevice"
  ): Long {
    TransferContext.writeArguments(LONG to timeout, LONG to ttl, STRING to deviceFilter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_DISCOVER, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun queryExternalAddress(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_QUERY_EXTERNAL_ADDRESS, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public fun addPortMapping(
    port: Long,
    portInternal: Long = 0,
    desc: String = "",
    proto: String = "UDP",
    duration: Long = 0
  ): Long {
    TransferContext.writeArguments(LONG to port, LONG to portInternal, STRING to desc, STRING to proto, LONG to duration)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_ADD_PORT_MAPPING, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun deletePortMapping(port: Long, proto: String = "UDP"): Long {
    TransferContext.writeArguments(LONG to port, STRING to proto)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UPNP_DELETE_PORT_MAPPING, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public enum class UPNPResult(
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
    UPNP_RESULT_UNKNOWN_ERROR(28),
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
