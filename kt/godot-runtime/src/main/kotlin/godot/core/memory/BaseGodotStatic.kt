package godot.core.memory

import godot.core.GarbageCollector

interface GodotStatic {

    fun registerAsSingleton() {
        GarbageCollector.registerStatic(this)
    }

    fun collect()
}
