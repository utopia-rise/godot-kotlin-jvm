// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.NodePath
import godot.core.PackedByteArray
import godot.core.PackedInt32Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * High-level multiplayer API.
 *
 * This class implements the high-level multiplayer API. See also [godot.MultiplayerPeer].
 *
 * By default, [godot.SceneTree] has a reference to this class that is used to provide multiplayer capabilities (i.e. RPCs) across the whole scene.
 *
 * It is possible to override the MultiplayerAPI instance used by specific tree branches by calling the [godot.SceneTree.setMultiplayer] method, effectively allowing to run both client and server in the same scene.
 *
 * **Note:** The high-level multiplayer API protocol is an implementation detail and isn't meant to be used by non-Godot servers. It may change without notice.
 *
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android export preset before exporting the project or using one-click deploy. Otherwise, network communication of any kind will be blocked by Android.
 */
@GodotBaseType
public open class MultiplayerAPI : RefCounted() {
  /**
   * Emitted when this MultiplayerAPI's [multiplayerPeer] successfully connected to a server. Only emitted on clients.
   */
  public val connectedToServer: Signal0 by signal()

  /**
   * Emitted when this MultiplayerAPI's [multiplayerPeer] receives a `packet` with custom data (see [sendBytes]). ID is the peer ID of the peer that sent the packet.
   */
  public val peerPacket: Signal2<Long, PackedByteArray> by signal("id", "packet")

  /**
   * Emitted when this MultiplayerAPI's [multiplayerPeer] fails to establish a connection to a server. Only emitted on clients.
   */
  public val connectionFailed: Signal0 by signal()

  /**
   * Emitted when this MultiplayerAPI's [multiplayerPeer] disconnects from a peer. Clients get notified when other clients disconnect from the same server.
   */
  public val peerDisconnected: Signal1<Long> by signal("id")

  /**
   * Emitted when this MultiplayerAPI's [multiplayerPeer] connects with a new peer. ID is the peer ID of the new peer. Clients get notified when other clients connect to the same server. Upon connecting to a server, a client also receives this signal for the server (with ID being 1).
   */
  public val peerConnected: Signal1<Long> by signal("id")

  /**
   * Emitted when this MultiplayerAPI's [multiplayerPeer] disconnects from server. Only emitted on clients.
   */
  public val serverDisconnected: Signal0 by signal()

  /**
   * If `true`, the MultiplayerAPI will allow encoding and decoding of object during RPCs.
   *
   * **Warning:** Deserialized objects can contain code which gets executed. Do not use this option if the serialized object comes from untrusted sources to avoid potential security threats such as remote code execution.
   */
  public var allowObjectDecoding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_IS_OBJECT_DECODING_ALLOWED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_SET_ALLOW_OBJECT_DECODING, NIL)
    }

  /**
   * If `true`, the MultiplayerAPI's [multiplayerPeer] refuses new incoming connections.
   */
  public var refuseNewConnections: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_IS_REFUSING_NEW_CONNECTIONS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_SET_REFUSE_NEW_CONNECTIONS, NIL)
    }

  /**
   * The peer object to handle the RPC system (effectively enabling networking when set). Depending on the peer itself, the MultiplayerAPI will become a network server (check with [isServer]) and will set root node's network mode to authority, or it will become a regular client peer. All child nodes are set to inherit the network mode by default. Handling of networking-related events (connection, disconnection, new clients) is done by connecting to MultiplayerAPI's signals.
   */
  public var multiplayerPeer: MultiplayerPeer?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_GET_MULTIPLAYER_PEER, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as MultiplayerPeer?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_SET_MULTIPLAYER_PEER, NIL)
    }

  /**
   * The root path to use for RPCs and replication. Instead of an absolute path, a relative path will be used to find the node upon which the RPC should be executed.
   *
   * This effectively allows to have different branches of the scene tree to be managed by different MultiplayerAPI, allowing for example to run both client and server in the same scene.
   */
  public var rootPath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_GET_ROOT_PATH,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_SET_ROOT_PATH, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_MULTIPLAYERAPI)
  }

  /**
   * Sends the given raw `bytes` to a specific peer identified by `id` (see [godot.MultiplayerPeer.setTargetPeer]). Default ID is `0`, i.e. broadcast to all peers.
   */
  public fun sendBytes(
    bytes: PackedByteArray,
    id: Long = 0,
    mode: TransferMode = TransferMode.TRANSFER_MODE_RELIABLE,
    channel: Long = 0
  ): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to bytes, LONG to id, LONG to mode.id, LONG to channel)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_SEND_BYTES, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns `true` if there is a [multiplayerPeer] set.
   */
  public fun hasMultiplayerPeer(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_HAS_MULTIPLAYER_PEER,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the unique peer ID of this MultiplayerAPI's [multiplayerPeer].
   */
  public fun getUniqueId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_GET_UNIQUE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if this MultiplayerAPI's [multiplayerPeer] is valid and in server mode (listening for connections).
   */
  public fun isServer(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_IS_SERVER, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the sender's peer ID for the RPC currently being executed.
   *
   * **Note:** If not inside an RPC this method will return 0.
   */
  public fun getRemoteSenderId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_GET_REMOTE_SENDER_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Method used for polling the MultiplayerAPI. You only need to worry about this if you set [godot.SceneTree.multiplayerPoll] to `false`. By default, [godot.SceneTree] will poll its MultiplayerAPI(s) for you.
   *
   * **Note:** This method results in RPCs being called, so they will be executed in the same context of this function (e.g. `_process`, `physics`, [godot.Thread]).
   */
  public fun poll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_POLL, NIL)
  }

  /**
   * Clears the current MultiplayerAPI network state (you shouldn't call this unless you know what you are doing).
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_CLEAR, NIL)
  }

  /**
   * Returns the peer IDs of all connected peers of this MultiplayerAPI's [multiplayerPeer].
   */
  public fun getPeers(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_GET_PEERS,
        PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  public companion object
}
