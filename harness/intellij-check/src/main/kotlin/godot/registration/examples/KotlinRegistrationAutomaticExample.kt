package godot.registration.examples

import godot.annotation.IntRange
import godot.annotation.Rpc
import godot.annotation.RpcMode
import godot.api.Node
import godot.core.signal1
import godot.global.GD

// Set the IDE registration mode to Automatic. The class and its six Godot-facing
// declarations should be highlighted in green.
class KotlinRegistrationAutomaticExample : Node() {
    var displayName = "Player"

    @IntRange(min = 0, max = 100)
    var health = 100

    val damaged by signal1<Int>()

    fun heal(amount: Int) {
        health = (health + amount).coerceAtMost(100)
    }

    override fun _ready() {
        GD.print("Player is ready")
    }

    @Rpc(rpcMode = RpcMode.ANY)
    fun synchronizeHealth(value: Int) {
        health = value
    }
}
