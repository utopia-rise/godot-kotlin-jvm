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
import godot.core.VariantArray
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class used for extending the [godot.MultiplayerAPI].
 *
 * This class can be used to augment or replace the default [godot.MultiplayerAPI] implementation via script or extensions.
 *
 * The following example augment the default implementation ([godot.SceneMultiplayer]) by logging every RPC being made, and every object being configured for replication.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * extends MultiplayerAPIExtension
 *
 * class_name LogMultiplayer
 *
 *
 *
 * # We want to augment the default SceneMultiplayer.
 *
 * var base_multiplayer = SceneMultiplayer.new()
 *
 *
 *
 * func _init():
 *
 *     # Just passthourgh base signals (copied to var to avoid cyclic reference)
 *
 *     var cts = connected_to_server
 *
 *     var cf = connection_failed
 *
 *     var pc = peer_connected
 *
 *     var pd = peer_disconnected
 *
 *     base_multiplayer.connected_to_server.connect(func(): cts.emit())
 *
 *     base_multiplayer.connection_failed.connect(func(): cf.emit())
 *
 *     base_multiplayer.peer_connected.connect(func(id): pc.emit(id))
 *
 *     base_multiplayer.peer_disconnected.connect(func(id): pd.emit(id))
 *
 *
 *
 * # Log RPC being made and forward it to the default multiplayer.
 *
 * func _rpc(peer: int, object: Object, method: StringName, args: Array) -> int: # Error
 *
 *     print("Got RPC for %d: %s::%s(%s)" % [peer, object, method, args])
 *
 *     return base_multiplayer.rpc(peer, object, method, args)
 *
 *
 *
 * # Log configuration add. E.g. root path (nullptr, NodePath), replication (Node, Spawner|Synchronizer), custom.
 *
 * func _object_configuration_add(object, config: Variant) -> int: # Error
 *
 *     if config is MultiplayerSynchronizer:
 *
 *         print("Adding synchronization configuration for %s. Synchronizer: %s" % [object, config])
 *
 *     elif config is MultiplayerSpawner:
 *
 *         print("Adding node %s to the spawn list. Spawner: %s" % [object, config])
 *
 *     return base_multiplayer.object_configuration_add(object, config)
 *
 *
 *
 * # Log configuration remove. E.g. root path (nullptr, NodePath), replication (Node, Spawner|Synchronizer), custom.
 *
 * func _object_configuration_remove(object, config: Variant) -> int: # Error
 *
 *     if config is MultiplayerSynchronizer:
 *
 *         print("Removing synchronization configuration for %s. Synchronizer: %s" % [object, config])
 *
 *     elif config is MultiplayerSpawner:
 *
 *         print("Removing node %s from the spawn list. Spawner: %s" % [object, config])
 *
 *     return base_multiplayer.object_configuration_remove(object, config)
 *
 *
 *
 * # These can be optional, but in our case we want to augment SceneMultiplayer, so forward everything.
 *
 * func _set_multiplayer_peer(p_peer: MultiplayerPeer):
 *
 *     base_multiplayer.multiplayer_peer = p_peer
 *
 *
 *
 * func _get_multiplayer_peer() -> MultiplayerPeer:
 *
 *     return base_multiplayer.multiplayer_peer
 *
 *
 *
 * func _get_unique_id() -> int:
 *
 *     return base_multiplayer.get_unique_id()
 *
 *
 *
 * func _get_peer_ids() -> PackedInt32Array:
 *
 *     return base_multiplayer.get_peers()
 *
 * [/gdscript]
 *
 * [/codeblocks]
 *
 * Then in your main scene or in an autoload call [godot.SceneTree.setMultiplayer] to start using your custom [godot.MultiplayerAPI]:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * # autoload.gd
 *
 * func _enter_tree():
 *
 *     # Sets our custom multiplayer as the main one in SceneTree.
 *
 * get_tree().set_multiplayer(LogMultiplayer.new())
 *
 * [/gdscript]
 *
 * [/codeblocks]
 *
 * Native extensions can alternatively use the [godot.MultiplayerAPI.setDefaultInterface] method during initialization to configure themselves as the default implementation.
 */
@GodotBaseType
public open class MultiplayerAPIExtension : MultiplayerAPI() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MULTIPLAYERAPIEXTENSION, scriptIndex)
    return true
  }

  /**
   * Callback for [godot.MultiplayerAPI.poll].
   */
  public open fun _poll(): GodotError {
    throw NotImplementedError("_poll is not implemented for MultiplayerAPIExtension")
  }

  /**
   * Called when the [godot.MultiplayerAPI.multiplayerPeer] is set.
   */
  public open fun _setMultiplayerPeer(multiplayerPeer: MultiplayerPeer): Unit {
  }

  /**
   * Called when the [godot.MultiplayerAPI.multiplayerPeer] is retrieved.
   */
  public open fun _getMultiplayerPeer(): MultiplayerPeer? {
    throw NotImplementedError("_get_multiplayer_peer is not implemented for MultiplayerAPIExtension")
  }

  /**
   * Callback for [godot.MultiplayerAPI.getUniqueId].
   */
  public open fun _getUniqueId(): Long {
    throw NotImplementedError("_get_unique_id is not implemented for MultiplayerAPIExtension")
  }

  /**
   * Callback for [godot.MultiplayerAPI.getPeers].
   */
  public open fun _getPeerIds(): PackedInt32Array {
    throw NotImplementedError("_get_peer_ids is not implemented for MultiplayerAPIExtension")
  }

  /**
   * Callback for [godot.MultiplayerAPI.rpc].
   */
  public open fun _rpc(
    peer: Long,
    _object: Object,
    method: StringName,
    args: VariantArray<Any?>,
  ): GodotError {
    throw NotImplementedError("_rpc is not implemented for MultiplayerAPIExtension")
  }

  /**
   * Callback for [godot.MultiplayerAPI.getRemoteSenderId].
   */
  public open fun _getRemoteSenderId(): Long {
    throw NotImplementedError("_get_remote_sender_id is not implemented for MultiplayerAPIExtension")
  }

  /**
   * Callback for [godot.MultiplayerAPI.objectConfigurationAdd].
   */
  public open fun _objectConfigurationAdd(_object: Object, configuration: Any): GodotError {
    throw NotImplementedError("_object_configuration_add is not implemented for MultiplayerAPIExtension")
  }

  /**
   * Callback for [godot.MultiplayerAPI.objectConfigurationRemove].
   */
  public open fun _objectConfigurationRemove(_object: Object, configuration: Any): GodotError {
    throw NotImplementedError("_object_configuration_remove is not implemented for MultiplayerAPIExtension")
  }

  public companion object
}
