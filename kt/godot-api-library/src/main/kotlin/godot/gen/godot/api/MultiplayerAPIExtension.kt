// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.StringName
import godot.core.VariantArray
import kotlin.Any
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * This class can be used to augment or replace the default [MultiplayerAPI] implementation via
 * script or extensions.
 * The following example augment the default implementation ([SceneMultiplayer]) by logging every
 * RPC being made, and every object being configured for replication.
 *
 * gdscript:
 * ```gdscript
 * extends MultiplayerAPIExtension
 * class_name LogMultiplayer
 *
 * # We want to augment the default SceneMultiplayer.
 * var base_multiplayer = SceneMultiplayer.new()
 *
 * func _init():
 *     # Just passthrough base signals (copied to var to avoid cyclic reference)
 *     var cts = connected_to_server
 *     var cf = connection_failed
 *     var pc = peer_connected
 *     var pd = peer_disconnected
 *     base_multiplayer.connected_to_server.connect(func(): cts.emit())
 *     base_multiplayer.connection_failed.connect(func(): cf.emit())
 *     base_multiplayer.peer_connected.connect(func(id): pc.emit(id))
 *     base_multiplayer.peer_disconnected.connect(func(id): pd.emit(id))
 *
 * func _poll():
 *     return base_multiplayer.poll()
 *
 * # Log RPC being made and forward it to the default multiplayer.
 * func _rpc(peer: int, object: Object, method: StringName, args: Array) -> Error:
 *     print("Got RPC for &#37;d: &#37;s::&#37;s(&#37;s)" &#37; [peer, object, method, args])
 *     return base_multiplayer.rpc(peer, object, method, args)
 *
 * # Log configuration add. E.g. root path (nullptr, NodePath), replication (Node,
 * Spawner|Synchronizer), custom.
 * func _object_configuration_add(object, config: Variant) -> Error:
 *     if config is MultiplayerSynchronizer:
 *         print("Adding synchronization configuration for &#37;s. Synchronizer: &#37;s" &#37;
 * [object, config])
 *     elif config is MultiplayerSpawner:
 *         print("Adding node &#37;s to the spawn list. Spawner: &#37;s" &#37; [object, config])
 *     return base_multiplayer.object_configuration_add(object, config)
 *
 * # Log configuration remove. E.g. root path (nullptr, NodePath), replication (Node,
 * Spawner|Synchronizer), custom.
 * func _object_configuration_remove(object, config: Variant) -> Error:
 *     if config is MultiplayerSynchronizer:
 *         print("Removing synchronization configuration for &#37;s. Synchronizer: &#37;s" &#37;
 * [object, config])
 *     elif config is MultiplayerSpawner:
 *         print("Removing node &#37;s from the spawn list. Spawner: &#37;s" &#37; [object, config])
 *     return base_multiplayer.object_configuration_remove(object, config)
 *
 * # These can be optional, but in our case we want to augment SceneMultiplayer, so forward
 * everything.
 * func _set_multiplayer_peer(p_peer: MultiplayerPeer):
 *     base_multiplayer.multiplayer_peer = p_peer
 *
 * func _get_multiplayer_peer() -> MultiplayerPeer:
 *     return base_multiplayer.multiplayer_peer
 *
 * func _get_unique_id() -> int:
 *     return base_multiplayer.get_unique_id()
 *
 * func _get_peer_ids() -> PackedInt32Array:
 *     return base_multiplayer.get_peers()
 * ```
 *
 * Then in your main scene or in an autoload call [SceneTree.setMultiplayer] to start using your
 * custom [MultiplayerAPI]:
 *
 * gdscript:
 * ```gdscript
 * # autoload.gd
 * func _enter_tree():
 *     # Sets our custom multiplayer as the main one in SceneTree.
 * get_tree().set_multiplayer(LogMultiplayer.new())
 * ```
 *
 * Native extensions can alternatively use the [MultiplayerAPI.setDefaultInterface] method during
 * initialization to configure themselves as the default implementation.
 */
@GodotBaseType
public open class MultiplayerAPIExtension : MultiplayerAPI() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_MULTIPLAYERAPIEXTENSION, scriptIndex)
  }

  /**
   * Callback for [MultiplayerAPI.poll].
   */
  public open fun _poll(): Error {
    throw NotImplementedError("_poll is not implemented for MultiplayerAPIExtension")
  }

  /**
   * Called when the [MultiplayerAPI.multiplayerPeer] is set.
   */
  public open fun _setMultiplayerPeer(multiplayerPeer: MultiplayerPeer?): Unit {
  }

  /**
   * Called when the [MultiplayerAPI.multiplayerPeer] is retrieved.
   */
  public open fun _getMultiplayerPeer(): MultiplayerPeer? {
    throw NotImplementedError("_get_multiplayer_peer is not implemented for MultiplayerAPIExtension")
  }

  /**
   * Callback for [MultiplayerAPI.getUniqueId].
   */
  public open fun _getUniqueId(): Int {
    throw NotImplementedError("_get_unique_id is not implemented for MultiplayerAPIExtension")
  }

  /**
   * Callback for [MultiplayerAPI.getPeers].
   */
  public open fun _getPeerIds(): PackedInt32Array {
    throw NotImplementedError("_get_peer_ids is not implemented for MultiplayerAPIExtension")
  }

  /**
   * Callback for [MultiplayerAPI.rpc].
   */
  public open fun _rpc(
    peer: Int,
    `object`: Object?,
    method: StringName,
    args: VariantArray<Any?>,
  ): Error {
    throw NotImplementedError("_rpc is not implemented for MultiplayerAPIExtension")
  }

  /**
   * Callback for [MultiplayerAPI.getRemoteSenderId].
   */
  public open fun _getRemoteSenderId(): Int {
    throw NotImplementedError("_get_remote_sender_id is not implemented for MultiplayerAPIExtension")
  }

  /**
   * Callback for [MultiplayerAPI.objectConfigurationAdd].
   */
  public open fun _objectConfigurationAdd(`object`: Object?, configuration: Any?): Error {
    throw NotImplementedError("_object_configuration_add is not implemented for MultiplayerAPIExtension")
  }

  /**
   * Callback for [MultiplayerAPI.objectConfigurationRemove].
   */
  public open fun _objectConfigurationRemove(`object`: Object?, configuration: Any?): Error {
    throw NotImplementedError("_object_configuration_remove is not implemented for MultiplayerAPIExtension")
  }

  public companion object

  internal object MethodBindings
}
