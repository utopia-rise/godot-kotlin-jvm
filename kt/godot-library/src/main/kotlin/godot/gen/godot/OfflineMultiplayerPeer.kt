// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * A [godot.MultiplayerPeer] which is always connected and acts as a server.
 *
 * This is the default [godot.MultiplayerAPI.multiplayerPeer] for the [godot.Node.multiplayer]. It mimics the behavior of a server with no peers connected.
 *
 * This means that the [godot.SceneTree] will act as the multiplayer authority by default. Calls to [godot.MultiplayerAPI.isServer] will return `true`, and calls to [godot.MultiplayerAPI.getUniqueId] will return [godot.MultiplayerPeer.TARGET_PEER_SERVER].
 */
@GodotBaseType
public open class OfflineMultiplayerPeer : MultiplayerPeer() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OFFLINEMULTIPLAYERPEER, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings
}
