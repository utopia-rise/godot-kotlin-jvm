package godot.core.memory

import godot.core.GarbageCollector

interface IGodotStatic {

    fun registerAsSingleton() {
        GarbageCollector.registerStatic(this)
    }

    fun collect()
}

abstract class GodotStatic: IGodotStatic {

    init {
        @Suppress("LeakingThis")
        registerAsSingleton()
    }
}
