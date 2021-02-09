// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class PacketPeerUDP : PacketPeer() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_PACKETPEERUDP)

  open fun close() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_CLOSE, NIL)
  }

  open fun connectToHost(host: String, port: Long): GodotError {
    TransferContext.writeArguments(STRING to host, LONG to port)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_CONNECT_TO_HOST, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun getPacketIp(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_GET_PACKET_IP, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getPacketPort(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_GET_PACKET_PORT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun isConnectedToHost(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_IS_CONNECTED_TO_HOST,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isListening(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_IS_LISTENING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun joinMulticastGroup(multicastAddress: String, interfaceName: String): GodotError {
    TransferContext.writeArguments(STRING to multicastAddress, STRING to interfaceName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_JOIN_MULTICAST_GROUP,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun leaveMulticastGroup(multicastAddress: String, interfaceName: String): GodotError {
    TransferContext.writeArguments(STRING to multicastAddress, STRING to interfaceName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_LEAVE_MULTICAST_GROUP,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun listen(
    port: Long,
    bindAddress: String = "*",
    recvBufSize: Long = 65536
  ): GodotError {
    TransferContext.writeArguments(LONG to port, STRING to bindAddress, LONG to recvBufSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_LISTEN, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun setBroadcastEnabled(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_SET_BROADCAST_ENABLED,
        NIL)
  }

  open fun setDestAddress(host: String, port: Long): GodotError {
    TransferContext.writeArguments(STRING to host, LONG to port)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_SET_DEST_ADDRESS,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun wait(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_WAIT, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }
}
