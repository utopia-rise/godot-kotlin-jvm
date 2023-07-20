package godot.core.memory

internal interface GodotStatic {

    fun registerAsSingleton() {
        MemoryManager.registerStatic(this)
    }

    fun collect()
}
