package godot.core.memory

internal interface GodotStatic {

    fun registerAsSingleton() {
        GarbageCollector.registerStatic(this)
    }

    fun collect()
}
