// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedStringArray
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

private const val ENGINE_CLASS_IP_INDEX: Int = 8

/**
 * IP contains support functions for the Internet Protocol (IP). TCP/IP support is in different
 * classes (see [StreamPeerTCP] and [TCPServer]). IP provides DNS hostname resolution support, both
 * blocking and threaded.
 */
@GodotBaseType
public object IP : Object() {
  /**
   * Maximum number of concurrent DNS resolver queries allowed, [RESOLVER_INVALID_ID] is returned if
   * exceeded.
   */
  public final const val RESOLVER_MAX_QUERIES: Long = 256

  /**
   * Invalid ID constant. Returned if [RESOLVER_MAX_QUERIES] is exceeded.
   */
  public final const val RESOLVER_INVALID_ID: Long = -1

  public override fun new(scriptIndex: Int): Unit {
    Internals.getSingleton(this, ENGINE_CLASS_IP_INDEX)
  }

  /**
   * Returns a given hostname's IPv4 or IPv6 address when resolved (blocking-type method). The
   * address type returned depends on the [Type] constant given as [ipType].
   */
  @JvmOverloads
  @JvmStatic
  public final fun resolveHostname(host: String, ipType: Type = IP.Type.TYPE_ANY): String {
    Internals.writeArguments(STRING to host, LONG to ipType.id)
    Internals.callMethod(rawPtr, MethodBindings.resolveHostnamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Resolves a given hostname in a blocking way. Addresses are returned as an [Array] of IPv4 or
   * IPv6 addresses depending on [ipType].
   */
  @JvmOverloads
  @JvmStatic
  public final fun resolveHostnameAddresses(host: String, ipType: Type = IP.Type.TYPE_ANY):
      PackedStringArray {
    Internals.writeArguments(STRING to host, LONG to ipType.id)
    Internals.callMethod(rawPtr, MethodBindings.resolveHostnameAddressesPtr, PACKED_STRING_ARRAY)
    return (Internals.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Creates a queue item to resolve a hostname to an IPv4 or IPv6 address depending on the [Type]
   * constant given as [ipType]. Returns the queue ID if successful, or [RESOLVER_INVALID_ID] on error.
   */
  @JvmOverloads
  @JvmStatic
  public final fun resolveHostnameQueueItem(host: String, ipType: Type = IP.Type.TYPE_ANY): Int {
    Internals.writeArguments(STRING to host, LONG to ipType.id)
    Internals.callMethod(rawPtr, MethodBindings.resolveHostnameQueueItemPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns a queued hostname's status as a [ResolverStatus] constant, given its queue [id].
   */
  @JvmStatic
  public final fun getResolveItemStatus(id: Int): ResolverStatus {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getResolveItemStatusPtr, LONG)
    return IP.ResolverStatus.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns a queued hostname's IP address, given its queue [id]. Returns an empty string on error
   * or if resolution hasn't happened yet (see [getResolveItemStatus]).
   */
  @JvmStatic
  public final fun getResolveItemAddress(id: Int): String {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getResolveItemAddressPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns resolved addresses, or an empty array if an error happened or resolution didn't happen
   * yet (see [getResolveItemStatus]).
   */
  @JvmStatic
  public final fun getResolveItemAddresses(id: Int): VariantArray<Any?> {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getResolveItemAddressesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Removes a given item [id] from the queue. This should be used to free a queue after it has
   * completed to enable more queries to happen.
   */
  @JvmStatic
  public final fun eraseResolveItem(id: Int): Unit {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.eraseResolveItemPtr, NIL)
  }

  /**
   * Returns all the user's current IPv4 and IPv6 addresses as an array.
   */
  @JvmStatic
  public final fun getLocalAddresses(): PackedStringArray {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLocalAddressesPtr, PACKED_STRING_ARRAY)
    return (Internals.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns all network adapters as an array.
   * Each adapter is a dictionary of the form:
   * [codeblock]
   * {
   *     "index": "1", # Interface index.
   *     "name": "eth0", # Interface name.
   *     "friendly": "Ethernet One", # A friendly name (might be empty).
   *     "addresses": ["192.168.1.101"], # An array of IP addresses associated to this interface.
   * }
   * [/codeblock]
   */
  @JvmStatic
  public final fun getLocalInterfaces(): VariantArray<Dictionary<Any?, Any?>> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLocalInterfacesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Removes all of a [hostname]'s cached references. If no [hostname] is given, all cached IP
   * addresses are removed.
   */
  @JvmOverloads
  @JvmStatic
  public final fun clearCache(hostname: String = ""): Unit {
    Internals.writeArguments(STRING to hostname)
    Internals.callMethod(rawPtr, MethodBindings.clearCachePtr, NIL)
  }

  public enum class ResolverStatus(
    id: Long,
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
    RESOLVER_STATUS_ERROR(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ResolverStatus = entries.single { it.id == `value` }
    }
  }

  public enum class Type(
    id: Long,
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
    TYPE_ANY(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Type = entries.single { it.id == `value` }
    }
  }

  public object MethodBindings {
    internal val resolveHostnamePtr: VoidPtr =
        Internals.getMethodBindPtr("IP", "resolve_hostname", 4283295457)

    internal val resolveHostnameAddressesPtr: VoidPtr =
        Internals.getMethodBindPtr("IP", "resolve_hostname_addresses", 773767525)

    internal val resolveHostnameQueueItemPtr: VoidPtr =
        Internals.getMethodBindPtr("IP", "resolve_hostname_queue_item", 1749894742)

    internal val getResolveItemStatusPtr: VoidPtr =
        Internals.getMethodBindPtr("IP", "get_resolve_item_status", 3812250196)

    internal val getResolveItemAddressPtr: VoidPtr =
        Internals.getMethodBindPtr("IP", "get_resolve_item_address", 844755477)

    internal val getResolveItemAddressesPtr: VoidPtr =
        Internals.getMethodBindPtr("IP", "get_resolve_item_addresses", 663333327)

    internal val eraseResolveItemPtr: VoidPtr =
        Internals.getMethodBindPtr("IP", "erase_resolve_item", 1286410249)

    internal val getLocalAddressesPtr: VoidPtr =
        Internals.getMethodBindPtr("IP", "get_local_addresses", 1139954409)

    internal val getLocalInterfacesPtr: VoidPtr =
        Internals.getMethodBindPtr("IP", "get_local_interfaces", 3995934104)

    internal val clearCachePtr: VoidPtr =
        Internals.getMethodBindPtr("IP", "clear_cache", 3005725572)
  }
}
