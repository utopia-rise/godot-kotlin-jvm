package godot.core.memory

@PublishedApi
internal interface GodotStatic {
    fun registerAsSingleton() {
        MemoryManager.registerStatic(this)
    }

    fun collect()
}
