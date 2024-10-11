// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.util.Internals
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_PACKETPEEREXTENSION_INDEX: Int = 442

@GodotBaseType
public open class PacketPeerExtension : PacketPeer() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_PACKETPEEREXTENSION_INDEX, scriptIndex)
  }

  public open fun _getAvailablePacketCount(): Int {
    throw NotImplementedError("_get_available_packet_count is not implemented for PacketPeerExtension")
  }

  public open fun _getMaxPacketSize(): Int {
    throw NotImplementedError("_get_max_packet_size is not implemented for PacketPeerExtension")
  }

  public companion object

  public object MethodBindings
}
