// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.GodotError
import godot.core.NodePath
import godot.core.PackedByteArray
import godot.core.PackedInt32Array
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class SceneMultiplayer : MultiplayerAPI() {
  public val peerAuthenticating: Signal1<Long> by signal("id")

  public val peerAuthenticationFailed: Signal1<Long> by signal("id")

  public val peerPacket: Signal2<Long, PackedByteArray> by signal("id", "packet")

  public var rootPath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENEMULTIPLAYER_GET_ROOT_PATH,
          NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENEMULTIPLAYER_SET_ROOT_PATH,
          NIL)
    }

  public var authCallback: Callable
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENEMULTIPLAYER_GET_AUTH_CALLBACK, CALLABLE)
      return (TransferContext.readReturnValue(CALLABLE, false) as Callable)
    }
    set(`value`) {
      TransferContext.writeArguments(CALLABLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENEMULTIPLAYER_SET_AUTH_CALLBACK, NIL)
    }

  public var authTimeout: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENEMULTIPLAYER_GET_AUTH_TIMEOUT,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENEMULTIPLAYER_SET_AUTH_TIMEOUT,
          NIL)
    }

  public var allowObjectDecoding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENEMULTIPLAYER_IS_OBJECT_DECODING_ALLOWED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENEMULTIPLAYER_SET_ALLOW_OBJECT_DECODING, NIL)
    }

  public var refuseNewConnections: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENEMULTIPLAYER_IS_REFUSING_NEW_CONNECTIONS, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENEMULTIPLAYER_SET_REFUSE_NEW_CONNECTIONS, NIL)
    }

  public var serverRelay: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENEMULTIPLAYER_IS_SERVER_RELAY_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENEMULTIPLAYER_SET_SERVER_RELAY_ENABLED, NIL)
    }

  public var maxSyncPacketSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENEMULTIPLAYER_GET_MAX_SYNC_PACKET_SIZE, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENEMULTIPLAYER_SET_MAX_SYNC_PACKET_SIZE, NIL)
    }

  public var maxDeltaPacketSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENEMULTIPLAYER_GET_MAX_DELTA_PACKET_SIZE, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENEMULTIPLAYER_SET_MAX_DELTA_PACKET_SIZE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SCENEMULTIPLAYER, scriptIndex)
    return true
  }

  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENEMULTIPLAYER_CLEAR, NIL)
  }

  public fun disconnectPeer(id: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENEMULTIPLAYER_DISCONNECT_PEER,
        NIL)
  }

  public fun getAuthenticatingPeers(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCENEMULTIPLAYER_GET_AUTHENTICATING_PEERS, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun sendAuth(id: Int, `data`: PackedByteArray): GodotError {
    TransferContext.writeArguments(LONG to id.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENEMULTIPLAYER_SEND_AUTH, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  public fun completeAuth(id: Int): GodotError {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENEMULTIPLAYER_COMPLETE_AUTH,
        LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  @JvmOverloads
  public fun sendBytes(
    bytes: PackedByteArray,
    id: Int = 0,
    mode: MultiplayerPeer.TransferMode = MultiplayerPeer.TransferMode.TRANSFER_MODE_RELIABLE,
    channel: Int = 0,
  ): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to bytes, LONG to id.toLong(), LONG to mode.id, LONG to channel.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENEMULTIPLAYER_SEND_BYTES, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  public companion object
}
