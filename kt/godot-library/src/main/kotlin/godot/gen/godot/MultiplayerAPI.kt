// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.PoolIntArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.POOL_INT_ARRAY
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * High-level multiplayer API.
 *
 * This class implements most of the logic behind the high-level multiplayer API.
 *
 * By default, [godot.SceneTree] has a reference to this class that is used to provide multiplayer capabilities (i.e. RPC/RSET) across the whole scene.
 *
 * It is possible to override the MultiplayerAPI instance used by specific Nodes by setting the [godot.Node.customMultiplayer] property, effectively allowing to run both client and server in the same scene.
 */
@GodotBaseType
open class MultiplayerAPI : Reference() {
  /**
   * Emitted when this MultiplayerAPI's [networkPeer] successfully connected to a server. Only emitted on clients.
   */
  val connectedToServer: Signal0 by signal()

  /**
   * Emitted when this MultiplayerAPI's [networkPeer] fails to establish a connection to a server. Only emitted on clients.
   */
  val connectionFailed: Signal0 by signal()

  /**
   * Emitted when this MultiplayerAPI's [networkPeer] connects with a new peer. ID is the peer ID of the new peer. Clients get notified when other clients connect to the same server. Upon connecting to a server, a client also receives this signal for the server (with ID being 1).
   */
  val networkPeerConnected: Signal1<Long> by signal("id")

  /**
   * Emitted when this MultiplayerAPI's [networkPeer] disconnects from a peer. Clients get notified when other clients disconnect from the same server.
   */
  val networkPeerDisconnected: Signal1<Long> by signal("id")

  /**
   * Emitted when this MultiplayerAPI's [networkPeer] receive a `packet` with custom data (see [sendBytes]). ID is the peer ID of the peer that sent the packet.
   */
  val networkPeerPacket: Signal2<Long, PoolByteArray> by signal("id", "packet")

  /**
   * Emitted when this MultiplayerAPI's [networkPeer] disconnects from server. Only emitted on clients.
   */
  val serverDisconnected: Signal0 by signal()

  /**
   * If `true` (or if the [networkPeer] has [godot.PacketPeer.allowObjectDecoding] set to `true`), the MultiplayerAPI will allow encoding and decoding of object during RPCs/RSETs.
   *
   * **Warning:** Deserialized objects can contain code which gets executed. Do not use this option if the serialized object comes from untrusted sources to avoid potential security threats such as remote code execution.
   */
  open var allowObjectDecoding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_GET_ALLOW_OBJECT_DECODING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_SET_ALLOW_OBJECT_DECODING, NIL)
    }

  /**
   * The peer object to handle the RPC system (effectively enabling networking when set). Depending on the peer itself, the MultiplayerAPI will become a network server (check with [isNetworkServer]) and will set root node's network mode to master, or it will become a regular peer with root node set to puppet. All child nodes are set to inherit the network mode by default. Handling of networking-related events (connection, disconnection, new clients) is done by connecting to MultiplayerAPI's signals.
   */
  open var networkPeer: NetworkedMultiplayerPeer?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_GET_NETWORK_PEER,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as NetworkedMultiplayerPeer?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_SET_NETWORK_PEER,
          NIL)
    }

  /**
   * If `true`, the MultiplayerAPI's [networkPeer] refuses new incoming connections.
   */
  open var refuseNewNetworkConnections: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_GET_REFUSE_NEW_NETWORK_CONNECTIONS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_SET_REFUSE_NEW_NETWORK_CONNECTIONS, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_MULTIPLAYERAPI)

  open fun _addPeer(id: Long) {
  }

  open fun _connectedToServer() {
  }

  open fun _connectionFailed() {
  }

  open fun _delPeer(id: Long) {
  }

  open fun _serverDisconnected() {
  }

  /**
   * Clears the current MultiplayerAPI network state (you shouldn't call this unless you know what you are doing).
   */
  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_CLEAR, NIL)
  }

  /**
   * Returns the peer IDs of all connected peers of this MultiplayerAPI's [networkPeer].
   */
  open fun getNetworkConnectedPeers(): PoolIntArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_GET_NETWORK_CONNECTED_PEERS, POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  /**
   * Returns the unique peer ID of this MultiplayerAPI's [networkPeer].
   */
  open fun getNetworkUniqueId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_GET_NETWORK_UNIQUE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the sender's peer ID for the RPC currently being executed.
   *
   * **Note:** If not inside an RPC this method will return 0.
   */
  open fun getRpcSenderId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_GET_RPC_SENDER_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if there is a [networkPeer] set.
   */
  open fun hasNetworkPeer(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_HAS_NETWORK_PEER,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if this MultiplayerAPI's [networkPeer] is in server mode (listening for connections).
   */
  open fun isNetworkServer(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_IS_NETWORK_SERVER,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Method used for polling the MultiplayerAPI. You only need to worry about this if you are using [godot.Node.customMultiplayer] override or you set [godot.SceneTree.multiplayerPoll] to `false`. By default, [godot.SceneTree] will poll its MultiplayerAPI for you.
   *
   * **Note:** This method results in RPCs and RSETs being called, so they will be executed in the same context of this function (e.g. `_process`, `physics`, [godot.Thread]).
   */
  open fun poll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_POLL, NIL)
  }

  /**
   * Sends the given raw `bytes` to a specific peer identified by `id` (see [godot.NetworkedMultiplayerPeer.setTargetPeer]). Default ID is `0`, i.e. broadcast to all peers.
   */
  open fun sendBytes(
    bytes: PoolByteArray,
    id: Long = 0,
    mode: Long = 2
  ): GodotError {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to bytes, LONG to id, LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_SEND_BYTES, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets the base root node to use for RPCs. Instead of an absolute path, a relative path will be used to find the node upon which the RPC should be executed.
   *
   * This effectively allows to have different branches of the scene tree to be managed by different MultiplayerAPI, allowing for example to run both client and server in the same scene.
   */
  open fun setRootNode(node: Node) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_SET_ROOT_NODE, NIL)
  }

  enum class RPCMode(
    id: Long
  ) {
    /**
     * Used with [godot.Node.rpcConfig] or [godot.Node.rsetConfig] to disable a method or property for all RPC calls, making it unavailable. Default for all methods.
     */
    DISABLED(0),

    /**
     * Used with [godot.Node.rpcConfig] or [godot.Node.rsetConfig] to set a method to be called or a property to be changed only on the remote end, not locally. Analogous to the `remote` keyword. Calls and property changes are accepted from all remote peers, no matter if they are node's master or puppets.
     */
    REMOTE(1),

    /**
     * Used with [godot.Node.rpcConfig] or [godot.Node.rsetConfig] to set a method to be called or a property to be changed only on the network master for this node. Analogous to the `master` keyword. Only accepts calls or property changes from the node's network puppets, see [godot.Node.setNetworkMaster].
     */
    MASTER(2),

    /**
     * Used with [godot.Node.rpcConfig] or [godot.Node.rsetConfig] to set a method to be called or a property to be changed only on puppets for this node. Analogous to the `puppet` keyword. Only accepts calls or property changes from the node's network master, see [godot.Node.setNetworkMaster].
     */
    PUPPET(3),

    /**
     * *Deprecated.* Use [RPC_MODE_PUPPET] instead. Analogous to the `slave` keyword.
     */
    SLAVE(3),

    /**
     * Behave like [RPC_MODE_REMOTE] but also make the call or property change locally. Analogous to the `remotesync` keyword.
     */
    REMOTESYNC(4),

    /**
     * *Deprecated.* Use [RPC_MODE_REMOTESYNC] instead. Analogous to the `sync` keyword.
     */
    SYNC(4),

    /**
     * Behave like [RPC_MODE_MASTER] but also make the call or property change locally. Analogous to the `mastersync` keyword.
     */
    MASTERSYNC(5),

    /**
     * Behave like [RPC_MODE_PUPPET] but also make the call or property change locally. Analogous to the `puppetsync` keyword.
     */
    PUPPETSYNC(6);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Used with [godot.Node.rpcConfig] or [godot.Node.rsetConfig] to disable a method or property for all RPC calls, making it unavailable. Default for all methods.
     */
    final const val RPC_MODE_DISABLED: Long = 0

    /**
     * Used with [godot.Node.rpcConfig] or [godot.Node.rsetConfig] to set a method to be called or a property to be changed only on the network master for this node. Analogous to the `master` keyword. Only accepts calls or property changes from the node's network puppets, see [godot.Node.setNetworkMaster].
     */
    final const val RPC_MODE_MASTER: Long = 2

    /**
     * Behave like [RPC_MODE_MASTER] but also make the call or property change locally. Analogous to the `mastersync` keyword.
     */
    final const val RPC_MODE_MASTERSYNC: Long = 5

    /**
     * Used with [godot.Node.rpcConfig] or [godot.Node.rsetConfig] to set a method to be called or a property to be changed only on puppets for this node. Analogous to the `puppet` keyword. Only accepts calls or property changes from the node's network master, see [godot.Node.setNetworkMaster].
     */
    final const val RPC_MODE_PUPPET: Long = 3

    /**
     * Behave like [RPC_MODE_PUPPET] but also make the call or property change locally. Analogous to the `puppetsync` keyword.
     */
    final const val RPC_MODE_PUPPETSYNC: Long = 6

    /**
     * Used with [godot.Node.rpcConfig] or [godot.Node.rsetConfig] to set a method to be called or a property to be changed only on the remote end, not locally. Analogous to the `remote` keyword. Calls and property changes are accepted from all remote peers, no matter if they are node's master or puppets.
     */
    final const val RPC_MODE_REMOTE: Long = 1

    /**
     * Behave like [RPC_MODE_REMOTE] but also make the call or property change locally. Analogous to the `remotesync` keyword.
     */
    final const val RPC_MODE_REMOTESYNC: Long = 4

    /**
     * *Deprecated.* Use [RPC_MODE_PUPPET] instead. Analogous to the `slave` keyword.
     */
    final const val RPC_MODE_SLAVE: Long = 3

    /**
     * *Deprecated.* Use [RPC_MODE_REMOTESYNC] instead. Analogous to the `sync` keyword.
     */
    final const val RPC_MODE_SYNC: Long = 4
  }
}
