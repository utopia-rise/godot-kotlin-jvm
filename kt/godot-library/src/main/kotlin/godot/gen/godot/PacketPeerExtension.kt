// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 *
 */
@GodotBaseType
public open class PacketPeerExtension : PacketPeer() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PACKETPEEREXTENSION, scriptIndex)
    return true
  }

  /**
   *
   */
  public open fun _getAvailablePacketCount(): Int {
    throw NotImplementedError("_get_available_packet_count is not implemented for PacketPeerExtension")
  }

  /**
   *
   */
  public open fun _getMaxPacketSize(): Int {
    throw NotImplementedError("_get_max_packet_size is not implemented for PacketPeerExtension")
  }

  public companion object

  internal object MethodBindings {
    public val _getPacketPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerExtension", "_get_packet")

    public val _putPacketPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerExtension", "_put_packet")

    public val _getAvailablePacketCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerExtension", "_get_available_packet_count")

    public val _getMaxPacketSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerExtension", "_get_max_packet_size")
  }
}
