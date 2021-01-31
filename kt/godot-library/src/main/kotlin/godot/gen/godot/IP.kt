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

@GodotBaseType
object IP : Object() {
  final const val RESOLVER_INVALID_ID: Long = -1

  final const val RESOLVER_MAX_QUERIES: Long = 32

  final const val RESOLVER_STATUS_DONE: Long = 2

  final const val RESOLVER_STATUS_ERROR: Long = 3

  final const val RESOLVER_STATUS_NONE: Long = 0

  final const val RESOLVER_STATUS_WAITING: Long = 1

  final const val TYPE_ANY: Long = 3

  final const val TYPE_IPV4: Long = 1

  final const val TYPE_IPV6: Long = 2

  final const val TYPE_NONE: Long = 0

  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINECLASS_IP)

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  fun clearCache(hostname: String = "") {
    TransferContext.writeArguments(STRING to hostname)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IP_CLEAR_CACHE, NIL)
  }

  fun eraseResolveItem(id: Long) {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IP_ERASE_RESOLVE_ITEM, NIL)
  }

  fun getLocalAddresses(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IP_GET_LOCAL_ADDRESSES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun getLocalInterfaces(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IP_GET_LOCAL_INTERFACES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun getResolveItemAddress(id: Long): String {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IP_GET_RESOLVE_ITEM_ADDRESS, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun getResolveItemStatus(id: Long): IP.ResolverStatus {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IP_GET_RESOLVE_ITEM_STATUS, LONG)
    return IP.ResolverStatus.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun resolveHostname(host: String, ipType: Long = 3): String {
    TransferContext.writeArguments(STRING to host, LONG to ipType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IP_RESOLVE_HOSTNAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun resolveHostnameQueueItem(host: String, ipType: Long = 3): Long {
    TransferContext.writeArguments(STRING to host, LONG to ipType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IP_RESOLVE_HOSTNAME_QUEUE_ITEM,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  enum class ResolverStatus(
    id: Long
  ) {
    RESOLVER_STATUS_NONE(0),

    RESOLVER_STATUS_WAITING(1),

    RESOLVER_STATUS_DONE(2),

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
    TYPE_NONE(0),

    TYPE_IPV4(1),

    TYPE_IPV6(2),

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
