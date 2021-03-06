// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.IP
import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Internet protocol (IP) support functions such as DNS resolution.
 *
 * IP contains support functions for the Internet Protocol (IP). TCP/IP support is in different classes (see [godot.StreamPeerTCP] and [godot.TCP_Server]). IP provides DNS hostname resolution support, both blocking and threaded.
 */
@GodotBaseType
object IP : Object() {
  /**
   * Invalid ID constant. Returned if [RESOLVER_MAX_QUERIES] is exceeded.
   */
  final const val RESOLVER_INVALID_ID: Long = -1

  /**
   * Maximum number of concurrent DNS resolver queries allowed, [RESOLVER_INVALID_ID] is returned if exceeded.
   */
  final const val RESOLVER_MAX_QUERIES: Long = 32

  /**
   * DNS hostname resolver status: Done.
   */
  final const val RESOLVER_STATUS_DONE: Long = 2

  /**
   * DNS hostname resolver status: Error.
   */
  final const val RESOLVER_STATUS_ERROR: Long = 3

  /**
   * DNS hostname resolver status: No status.
   */
  final const val RESOLVER_STATUS_NONE: Long = 0

  /**
   * DNS hostname resolver status: Waiting.
   */
  final const val RESOLVER_STATUS_WAITING: Long = 1

  /**
   * Address type: Any.
   */
  final const val TYPE_ANY: Long = 3

  /**
   * Address type: Internet protocol version 4 (IPv4).
   */
  final const val TYPE_IPV4: Long = 1

  /**
   * Address type: Internet protocol version 6 (IPv6).
   */
  final const val TYPE_IPV6: Long = 2

  /**
   * Address type: None.
   */
  final const val TYPE_NONE: Long = 0

  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINESINGLETON_IP)

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Removes all of a `hostname`'s cached references. If no `hostname` is given, all cached IP addresses are removed.
   */
  fun clearCache(hostname: String = "") {
    TransferContext.writeArguments(STRING to hostname)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IP_CLEAR_CACHE, NIL)
  }

  /**
   * Removes a given item `id` from the queue. This should be used to free a queue after it has completed to enable more queries to happen.
   */
  fun eraseResolveItem(id: Long) {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IP_ERASE_RESOLVE_ITEM, NIL)
  }

  /**
   * Returns all of the user's current IPv4 and IPv6 addresses as an array.
   */
  fun getLocalAddresses(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IP_GET_LOCAL_ADDRESSES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns all network adapters as an array.
   *
   * Each adapter is a dictionary of the form:
   *
   * ```
   * 				{
   * 				    "index": "1", # Interface index.
   * 				    "name": "eth0", # Interface name.
   * 				    "friendly": "Ethernet One", # A friendly name (might be empty).
   * 				    "addresses": ["192.168.1.101"], # An array of IP addresses associated to this interface.
   * 				}
   * 				```
   */
  fun getLocalInterfaces(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IP_GET_LOCAL_INTERFACES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns a queued hostname's IP address, given its queue `id`. Returns an empty string on error or if resolution hasn't happened yet (see [getResolveItemStatus]).
   */
  fun getResolveItemAddress(id: Long): String {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IP_GET_RESOLVE_ITEM_ADDRESS, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns a queued hostname's status as a [enum ResolverStatus] constant, given its queue `id`.
   */
  fun getResolveItemStatus(id: Long): IP.ResolverStatus {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IP_GET_RESOLVE_ITEM_STATUS, LONG)
    return IP.ResolverStatus.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns a given hostname's IPv4 or IPv6 address when resolved (blocking-type method). The address type returned depends on the [enum Type] constant given as `ip_type`.
   */
  fun resolveHostname(host: String, ipType: Long = 3): String {
    TransferContext.writeArguments(STRING to host, LONG to ipType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IP_RESOLVE_HOSTNAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Creates a queue item to resolve a hostname to an IPv4 or IPv6 address depending on the [enum Type] constant given as `ip_type`. Returns the queue ID if successful, or [RESOLVER_INVALID_ID] on error.
   */
  fun resolveHostnameQueueItem(host: String, ipType: Long = 3): Long {
    TransferContext.writeArguments(STRING to host, LONG to ipType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IP_RESOLVE_HOSTNAME_QUEUE_ITEM,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  enum class ResolverStatus(
    id: Long
  ) {
    /**
     * DNS hostname resolver status: No status.
     */
    RESOLVER_STATUS_NONE(0),

    /**
     * DNS hostname resolver status: Waiting.
     */
    RESOLVER_STATUS_WAITING(1),

    /**
     * DNS hostname resolver status: Done.
     */
    RESOLVER_STATUS_DONE(2),

    /**
     * DNS hostname resolver status: Error.
     */
    RESOLVER_STATUS_ERROR(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Type(
    id: Long
  ) {
    /**
     * Address type: None.
     */
    TYPE_NONE(0),

    /**
     * Address type: Internet protocol version 4 (IPv4).
     */
    TYPE_IPV4(1),

    /**
     * Address type: Internet protocol version 6 (IPv6).
     */
    TYPE_IPV6(2),

    /**
     * Address type: Any.
     */
    TYPE_ANY(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }
}
