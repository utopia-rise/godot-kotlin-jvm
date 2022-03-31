// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class PacketPeerExtension : PacketPeer() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PACKETPEEREXTENSION)
  }

  /**
   *
   */
  public open fun _getAvailablePacketCount(): Long {
    throw
        NotImplementedError("_get_available_packet_count is not implemented for PacketPeerExtension")
  }

  /**
   *
   */
  public open fun _getMaxPacketSize(): Long {
    throw NotImplementedError("_get_max_packet_size is not implemented for PacketPeerExtension")
  }

  public companion object
}
