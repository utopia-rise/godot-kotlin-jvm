package godot.tests.syntax

import godot.annotation.Export
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.api.Node

@RegisterClass
class KotlinTestClass : Node() {
    @Export
    @RegisterProperty
    var exportedInt = 1

    @RegisterProperty
    var enteredTree = false

    @RegisterProperty
    var notificationTriggered = false

    @RegisterFunction
    fun greeting() = "Hello from kotlin"

    @RegisterFunction
    override fun _enterTree() {
        enteredTree = true
    }

    @RegisterFunction
    override fun _notification() = godotNotification { _ ->
        notificationTriggered = true
    }
}
