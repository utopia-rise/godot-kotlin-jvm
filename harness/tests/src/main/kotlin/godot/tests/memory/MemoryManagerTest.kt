package godot.tests.memory

import godot.Node
import godot.core.memory.MemoryManager
import godot.annotation.RegisterFunction

@RegisterClass
class MemoryManagerTest: Node() {

    @RegisterFunction
    fun getOrCreateStringName(key: String): StringName {
        return MemoryManager.getOrCreateStringName(key)
    }
}
