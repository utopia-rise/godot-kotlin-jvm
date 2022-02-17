// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.ENetPacketPeer
import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open abstract class ENetPacketPeer : PacketPeer() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ENETPACKETPEER)
  }

  public open fun peerDisconnect(`data`: Long = 0): Unit {
    TransferContext.writeArguments(LONG to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_PEER_DISCONNECT, NIL)
  }

  public open fun peerDisconnectLater(`data`: Long = 0): Unit {
    TransferContext.writeArguments(LONG to data)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_PEER_DISCONNECT_LATER, NIL)
  }

  public open fun peerDisconnectNow(`data`: Long = 0): Unit {
    TransferContext.writeArguments(LONG to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_PEER_DISCONNECT_NOW,
        NIL)
  }

  public open fun ping(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_PING, NIL)
  }

  public open fun pingInterval(pingInterval: Long): Unit {
    TransferContext.writeArguments(LONG to pingInterval)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_PING_INTERVAL, NIL)
  }

  public open fun reset(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_RESET, NIL)
  }

  public open fun send(
    channel: Long,
    packet: PackedByteArray,
    flags: Long
  ): GodotError {
    TransferContext.writeArguments(LONG to channel, PACKED_BYTE_ARRAY to packet, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_SEND, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public open fun throttleConfigure(
    interval: Long,
    acceleration: Long,
    deceleration: Long
  ): Unit {
    TransferContext.writeArguments(LONG to interval, LONG to acceleration, LONG to deceleration)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_THROTTLE_CONFIGURE,
        NIL)
  }

  public open fun setTimeout(
    timeout: Long,
    timeoutMin: Long,
    timeoutMax: Long
  ): Unit {
    TransferContext.writeArguments(LONG to timeout, LONG to timeoutMin, LONG to timeoutMax)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_SET_TIMEOUT, NIL)
  }

  public open fun getStatistic(statistic: ENetPacketPeer.PeerStatistic): Double {
    TransferContext.writeArguments(LONG to statistic.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_GET_STATISTIC,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public open fun getState(): ENetPacketPeer.PeerState {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_GET_STATE, LONG)
    return ENetPacketPeer.PeerState.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public open fun getChannels(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_GET_CHANNELS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public open fun isActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_IS_ACTIVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public enum class PeerStatistic(
    id: Long
  ) {
    PEER_PACKET_LOSS(0),
    PEER_PACKET_LOSS_VARIANCE(1),
    PEER_PACKET_LOSS_EPOCH(2),
    PEER_ROUND_TRIP_TIME(3),
    PEER_ROUND_TRIP_TIME_VARIANCE(4),
    PEER_LAST_ROUND_TRIP_TIME(5),
    PEER_LAST_ROUND_TRIP_TIME_VARIANCE(6),
    PEER_PACKET_THROTTLE(7),
    PEER_PACKET_THROTTLE_LIMIT(8),
    PEER_PACKET_THROTTLE_COUNTER(9),
    PEER_PACKET_THROTTLE_EPOCH(10),
    PEER_PACKET_THROTTLE_ACCELERATION(11),
    PEER_PACKET_THROTTLE_DECELERATION(12),
    PEER_PACKET_THROTTLE_INTERVAL(13),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class PeerState(
    id: Long
  ) {
    STATE_DISCONNECTED(0),
    STATE_CONNECTING(1),
    STATE_ACKNOWLEDGING_CONNECT(2),
    STATE_CONNECTION_PENDING(3),
    STATE_CONNECTION_SUCCEEDED(4),
    STATE_CONNECTED(5),
    STATE_DISCONNECT_LATER(6),
    STATE_DISCONNECTING(7),
    STATE_ACKNOWLEDGING_DISCONNECT(8),
    STATE_ZOMBIE(9),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    public final const val PACKET_LOSS_SCALE: Long = 65536

    public final const val PACKET_THROTTLE_SCALE: Long = 32

    public final const val FLAG_RELIABLE: Long = 1

    public final const val FLAG_UNSEQUENCED: Long = 2

    public final const val FLAG_UNRELIABLE_FRAGMENT: Long = 8
  }
}
