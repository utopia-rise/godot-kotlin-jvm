// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.PacketPeerDTLS
import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class PacketPeerDTLS : PacketPeer() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_PACKETPEERDTLS)

  open fun connectToPeer(
    packetPeer: PacketPeerUDP,
    validateCerts: Boolean = true,
    forHostname: String = "",
    validCertificate: X509Certificate? = null
  ): GodotError {
    TransferContext.writeArguments(OBJECT to packetPeer, BOOL to validateCerts, STRING to
        forHostname, OBJECT to validCertificate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERDTLS_CONNECT_TO_PEER,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun disconnectFromPeer() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERDTLS_DISCONNECT_FROM_PEER,
        NIL)
  }

  open fun getStatus(): PacketPeerDTLS.Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERDTLS_GET_STATUS, LONG)
    return PacketPeerDTLS.Status.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun poll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERDTLS_POLL, NIL)
  }

  enum class Status(
    id: Long
  ) {
    STATUS_DISCONNECTED(0),

    STATUS_HANDSHAKING(1),

    STATUS_CONNECTED(2),

    STATUS_ERROR(3),

    STATUS_ERROR_HOSTNAME_MISMATCH(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val STATUS_CONNECTED: Long = 2

    final const val STATUS_DISCONNECTED: Long = 0

    final const val STATUS_ERROR: Long = 3

    final const val STATUS_ERROR_HOSTNAME_MISMATCH: Long = 4

    final const val STATUS_HANDSHAKING: Long = 1
  }
}
