// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedInt32Array
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Base class for high-level multiplayer API implementations. See also [MultiplayerPeer].
 * By default, [SceneTree] has a reference to an implementation of this class and uses it to provide
 * multiplayer capabilities (i.e. RPCs) across the whole scene.
 * It is possible to override the MultiplayerAPI instance used by specific tree branches by calling
 * the [SceneTree.setMultiplayer] method, effectively allowing to run both client and server in the
 * same scene.
 * It is also possible to extend or replace the default implementation via scripting or native
 * extensions. See [MultiplayerAPIExtension] for details about extensions, [SceneMultiplayer] for the
 * details about the default implementation.
 */
@GodotBaseType
public open class MultiplayerAPI internal constructor() : RefCounted() {
  /**
   * Emitted when this MultiplayerAPI's [multiplayerPeer] connects with a new peer. ID is the peer
   * ID of the new peer. Clients get notified when other clients connect to the same server. Upon
   * connecting to a server, a client also receives this signal for the server (with ID being 1).
   */
  public val peerConnected: Signal1<Long> by signal("id")

  /**
   * Emitted when this MultiplayerAPI's [multiplayerPeer] disconnects from a peer. Clients get
   * notified when other clients disconnect from the same server.
   */
  public val peerDisconnected: Signal1<Long> by signal("id")

  /**
   * Emitted when this MultiplayerAPI's [multiplayerPeer] successfully connected to a server. Only
   * emitted on clients.
   */
  public val connectedToServer: Signal0 by signal()

  /**
   * Emitted when this MultiplayerAPI's [multiplayerPeer] fails to establish a connection to a
   * server. Only emitted on clients.
   */
  public val connectionFailed: Signal0 by signal()

  /**
   * Emitted when this MultiplayerAPI's [multiplayerPeer] disconnects from server. Only emitted on
   * clients.
   */
  public val serverDisconnected: Signal0 by signal()

  /**
   * The peer object to handle the RPC system (effectively enabling networking when set). Depending
   * on the peer itself, the MultiplayerAPI will become a network server (check with [isServer]) and
   * will set root node's network mode to authority, or it will become a regular client peer. All child
   * nodes are set to inherit the network mode by default. Handling of networking-related events
   * (connection, disconnection, new clients) is done by connecting to MultiplayerAPI's signals.
   */
  public var multiplayerPeer: MultiplayerPeer?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMultiplayerPeerPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as MultiplayerPeer?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMultiplayerPeerPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_MULTIPLAYERAPI, scriptIndex)
  }

  /**
   * Returns `true` if there is a [multiplayerPeer] set.
   */
  public fun hasMultiplayerPeer(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasMultiplayerPeerPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the unique peer ID of this MultiplayerAPI's [multiplayerPeer].
   */
  public fun getUniqueId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUniqueIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns `true` if this MultiplayerAPI's [multiplayerPeer] is valid and in server mode
   * (listening for connections).
   */
  public fun isServer(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isServerPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the sender's peer ID for the RPC currently being executed.
   * **Note:** This method returns `0` when called outside of an RPC. As such, the original peer ID
   * may be lost when code execution is delayed (such as with GDScript's `await` keyword).
   */
  public fun getRemoteSenderId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRemoteSenderIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Method used for polling the MultiplayerAPI. You only need to worry about this if you set
   * [SceneTree.multiplayerPoll] to `false`. By default, [SceneTree] will poll its MultiplayerAPI(s)
   * for you.
   * **Note:** This method results in RPCs being called, so they will be executed in the same
   * context of this function (e.g. `_process`, `physics`, [Thread]).
   */
  public fun poll(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pollPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sends an RPC to the target [peer]. The given [method] will be called on the remote [object]
   * with the provided [arguments]. The RPC may also be called locally depending on the implementation
   * and RPC configuration. See [Node.rpc] and [Node.rpcConfig].
   * **Note:** Prefer using [Node.rpc], [Node.rpcId], or `my_method.rpc(peer, arg1, arg2, ...)` (in
   * GDScript), since they are faster. This method is mostly useful in conjunction with
   * [MultiplayerAPIExtension] when augmenting or replacing the multiplayer capabilities.
   */
  @JvmOverloads
  public fun rpc(
    peer: Int,
    _object: Object,
    method: StringName,
    arguments: VariantArray<Any?> = godot.core.variantArrayOf(),
  ): GodotError {
    TransferContext.writeArguments(LONG to peer.toLong(), OBJECT to _object, STRING_NAME to method, ARRAY to arguments)
    TransferContext.callMethod(rawPtr, MethodBindings.rpcPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Notifies the MultiplayerAPI of a new [configuration] for the given [object]. This method is
   * used internally by [SceneTree] to configure the root path for this MultiplayerAPI (passing `null`
   * and a valid [NodePath] as [configuration]). This method can be further used by MultiplayerAPI
   * implementations to provide additional features, refer to specific implementation (e.g.
   * [SceneMultiplayer]) for details on how they use it.
   * **Note:** This method is mostly relevant when extending or overriding the MultiplayerAPI
   * behavior via [MultiplayerAPIExtension].
   */
  public fun objectConfigurationAdd(_object: Object, configuration: Any?): GodotError {
    TransferContext.writeArguments(OBJECT to _object, ANY to configuration)
    TransferContext.callMethod(rawPtr, MethodBindings.objectConfigurationAddPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Notifies the MultiplayerAPI to remove a [configuration] for the given [object]. This method is
   * used internally by [SceneTree] to configure the root path for this MultiplayerAPI (passing `null`
   * and an empty [NodePath] as [configuration]). This method can be further used by MultiplayerAPI
   * implementations to provide additional features, refer to specific implementation (e.g.
   * [SceneMultiplayer]) for details on how they use it.
   * **Note:** This method is mostly relevant when extending or overriding the MultiplayerAPI
   * behavior via [MultiplayerAPIExtension].
   */
  public fun objectConfigurationRemove(_object: Object, configuration: Any?): GodotError {
    TransferContext.writeArguments(OBJECT to _object, ANY to configuration)
    TransferContext.callMethod(rawPtr, MethodBindings.objectConfigurationRemovePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the peer IDs of all connected peers of this MultiplayerAPI's [multiplayerPeer].
   */
  public fun getPeers(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPeersPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public enum class RPCMode(
    id: Long,
  ) {
    /**
     * Used with [Node.rpcConfig] to disable a method or property for all RPC calls, making it
     * unavailable. Default for all methods.
     */
    RPC_MODE_DISABLED(0),
    /**
     * Used with [Node.rpcConfig] to set a method to be callable remotely by any peer. Analogous to
     * the `@rpc("any_peer")` annotation. Calls are accepted from all remote peers, no matter if they
     * are node's authority or not.
     */
    RPC_MODE_ANY_PEER(1),
    /**
     * Used with [Node.rpcConfig] to set a method to be callable remotely only by the current
     * multiplayer authority (which is the server by default). Analogous to the `@rpc("authority")`
     * annotation. See [Node.setMultiplayerAuthority].
     */
    RPC_MODE_AUTHORITY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): RPCMode = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Sets the default MultiplayerAPI implementation class. This method can be used by modules and
     * extensions to configure which implementation will be used by [SceneTree] when the engine starts.
     */
    public fun setDefaultInterface(interfaceName: StringName): Unit {
      TransferContext.writeArguments(STRING_NAME to interfaceName)
      TransferContext.callMethod(0, MethodBindings.setDefaultInterfacePtr, NIL)
    }

    /**
     * Returns the default MultiplayerAPI implementation class name. This is usually
     * `"SceneMultiplayer"` when [SceneMultiplayer] is available. See [setDefaultInterface].
     */
    public fun getDefaultInterface(): StringName {
      TransferContext.writeArguments()
      TransferContext.callMethod(0, MethodBindings.getDefaultInterfacePtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }

    /**
     * Returns a new instance of the default MultiplayerAPI.
     */
    public fun createDefaultInterface(): MultiplayerAPI? {
      TransferContext.writeArguments()
      TransferContext.callMethod(0, MethodBindings.createDefaultInterfacePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as MultiplayerAPI?)
    }
  }

  internal object MethodBindings {
    public val hasMultiplayerPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPI", "has_multiplayer_peer", 2240911060)

    public val getMultiplayerPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPI", "get_multiplayer_peer", 3223692825)

    public val setMultiplayerPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPI", "set_multiplayer_peer", 3694835298)

    public val getUniqueIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPI", "get_unique_id", 2455072627)

    public val isServerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPI", "is_server", 2240911060)

    public val getRemoteSenderIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPI", "get_remote_sender_id", 2455072627)

    public val pollPtr: VoidPtr = TypeManager.getMethodBindPtr("MultiplayerAPI", "poll", 166280745)

    public val rpcPtr: VoidPtr = TypeManager.getMethodBindPtr("MultiplayerAPI", "rpc", 2077486355)

    public val objectConfigurationAddPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPI", "object_configuration_add", 1171879464)

    public val objectConfigurationRemovePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPI", "object_configuration_remove", 1171879464)

    public val getPeersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPI", "get_peers", 969006518)

    public val setDefaultInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPI", "set_default_interface", 3304788590)

    public val getDefaultInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPI", "get_default_interface", 2737447660)

    public val createDefaultInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerAPI", "create_default_interface", 3294156723)
  }
}
