// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class ENetPacketPeer internal constructor() : PacketPeer() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ENETPACKETPEER, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun peerDisconnect(`data`: Int = 0): Unit {
    TransferContext.writeArguments(LONG to data.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_PEER_DISCONNECT, NIL)
  }

  @JvmOverloads
  public fun peerDisconnectLater(`data`: Int = 0): Unit {
    TransferContext.writeArguments(LONG to data.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_PEER_DISCONNECT_LATER, NIL)
  }

  @JvmOverloads
  public fun peerDisconnectNow(`data`: Int = 0): Unit {
    TransferContext.writeArguments(LONG to data.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_PEER_DISCONNECT_NOW,
        NIL)
  }

  public fun ping(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_PING, NIL)
  }

  public fun pingInterval(pingInterval: Int): Unit {
    TransferContext.writeArguments(LONG to pingInterval.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_PING_INTERVAL, NIL)
  }

  public fun reset(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_RESET, NIL)
  }

  public fun send(
    channel: Int,
    packet: PackedByteArray,
    flags: Int,
  ): GodotError {
    TransferContext.writeArguments(LONG to channel.toLong(), PACKED_BYTE_ARRAY to packet, LONG to flags.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_SEND, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun throttleConfigure(
    interval: Int,
    acceleration: Int,
    deceleration: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to interval.toLong(), LONG to acceleration.toLong(), LONG to deceleration.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_THROTTLE_CONFIGURE,
        NIL)
  }

  public fun setTimeout(
    timeout: Int,
    timeoutMin: Int,
    timeoutMax: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to timeout.toLong(), LONG to timeoutMin.toLong(), LONG to timeoutMax.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_SET_TIMEOUT, NIL)
  }

  public fun getRemoteAddress(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_GET_REMOTE_ADDRESS,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getRemotePort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_GET_REMOTE_PORT,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getStatistic(statistic: PeerStatistic): Double {
    TransferContext.writeArguments(LONG to statistic.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_GET_STATISTIC,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public fun getState(): PeerState {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_GET_STATE, LONG)
    return ENetPacketPeer.PeerState.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getChannels(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_GET_CHANNELS, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun isActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENETPACKETPEER_IS_ACTIVE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class PeerState(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class PeerStatistic(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
