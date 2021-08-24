package godot.core.memory

import godot.core.GarbageCollector

internal interface GodotStatic {

    fun registerAsSingleton() {
        GarbageCollector.registerStatic(this)
    }

    fun collect()
}
