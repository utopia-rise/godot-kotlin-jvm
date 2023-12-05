package godot.tests.memory

import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.core.StringName
import godot.core.memory.MemoryManager

@RegisterClass
class MemoryManagerTest: Node() {

    @RegisterFunction
    fun getOrCreateStringName(key: String): StringName {
        return MemoryManager.getOrCreateStringName(key)
    }
}
