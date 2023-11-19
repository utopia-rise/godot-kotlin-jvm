// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
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
    TransferContext.callMethod(rawPtr, MethodBindings.peerDisconnectPtr, NIL)
  }

  @JvmOverloads
  public fun peerDisconnectLater(`data`: Int = 0): Unit {
    TransferContext.writeArguments(LONG to data.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.peerDisconnectLaterPtr, NIL)
  }

  @JvmOverloads
  public fun peerDisconnectNow(`data`: Int = 0): Unit {
    TransferContext.writeArguments(LONG to data.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.peerDisconnectNowPtr, NIL)
  }

  public fun ping(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pingPtr, NIL)
  }

  public fun pingInterval(pingInterval: Int): Unit {
    TransferContext.writeArguments(LONG to pingInterval.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.pingIntervalPtr, NIL)
  }

  public fun reset(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.resetPtr, NIL)
  }

  public fun send(
    channel: Int,
    packet: PackedByteArray,
    flags: Int,
  ): GodotError {
    TransferContext.writeArguments(LONG to channel.toLong(), PACKED_BYTE_ARRAY to packet, LONG to flags.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.sendPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun throttleConfigure(
    interval: Int,
    acceleration: Int,
    deceleration: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to interval.toLong(), LONG to acceleration.toLong(), LONG to deceleration.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.throttleConfigurePtr, NIL)
  }

  public fun setTimeout(
    timeout: Int,
    timeoutMin: Int,
    timeoutMax: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to timeout.toLong(), LONG to timeoutMin.toLong(), LONG to timeoutMax.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setTimeoutPtr, NIL)
  }

  public fun getRemoteAddress(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRemoteAddressPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getRemotePort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRemotePortPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getStatistic(statistic: PeerStatistic): Double {
    TransferContext.writeArguments(LONG to statistic.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getStatisticPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public fun getState(): PeerState {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStatePtr, LONG)
    return ENetPacketPeer.PeerState.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getChannels(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getChannelsPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun isActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isActivePtr, BOOL)
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

  internal object MethodBindings {
    public val peerDisconnectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetPacketPeer", "peer_disconnect")

    public val peerDisconnectLaterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetPacketPeer", "peer_disconnect_later")

    public val peerDisconnectNowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetPacketPeer", "peer_disconnect_now")

    public val pingPtr: VoidPtr = TypeManager.getMethodBindPtr("ENetPacketPeer", "ping")

    public val pingIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetPacketPeer", "ping_interval")

    public val resetPtr: VoidPtr = TypeManager.getMethodBindPtr("ENetPacketPeer", "reset")

    public val sendPtr: VoidPtr = TypeManager.getMethodBindPtr("ENetPacketPeer", "send")

    public val throttleConfigurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetPacketPeer", "throttle_configure")

    public val setTimeoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetPacketPeer", "set_timeout")

    public val getRemoteAddressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetPacketPeer", "get_remote_address")

    public val getRemotePortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetPacketPeer", "get_remote_port")

    public val getStatisticPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetPacketPeer", "get_statistic")

    public val getStatePtr: VoidPtr = TypeManager.getMethodBindPtr("ENetPacketPeer", "get_state")

    public val getChannelsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ENetPacketPeer", "get_channels")

    public val isActivePtr: VoidPtr = TypeManager.getMethodBindPtr("ENetPacketPeer", "is_active")
  }
}
