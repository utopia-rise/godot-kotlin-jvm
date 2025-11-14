package godot.registration

import kotlin.reflect.KClass

abstract class Entry {
    abstract fun ClassRegistry.init()
    abstract fun ClassRegistry.getRegisteredClasses(): List<KClass<*>>

    abstract val classRegistrarCount: Int
    abstract val projectName: String
}
