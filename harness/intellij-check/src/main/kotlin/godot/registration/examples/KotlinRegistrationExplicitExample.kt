package godot.registration.examples

import godot.annotation.*
import godot.annotation.IntRange
import godot.api.Node
import godot.core.signal1
import godot.global.GD

// Set the IDE registration mode to Explicit. The class and its five Godot-facing
// declarations should be highlighted in green.
@Script
class KotlinRegistrationExplicitExample : Node() {
    @Export
    @Visible
    @IntRange(min = 0, max = 100)
    var health = 100

    @Emit("amount")
    val damaged by signal1<Int>()

    @Register
    fun heal(amount: Int) {
        health = (health + amount).coerceAtMost(100)
    }

    @Register
    override fun _ready() {
        GD.print("Player is ready")
    }

    @Rpc(rpcMode = RpcMode.ANY)
    @Register
    fun synchronizeHealth(value: Int) {
        health = value
    }
}
