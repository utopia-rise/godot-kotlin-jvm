package godot.registration

import kotlin.reflect.KClass

abstract class Entry {
    class Context(val registry: ClassRegistry)
    abstract fun Context.init()
    abstract fun Context.initEngineTypes()
    abstract fun Context.getRegisteredClasses(): List<KClass<*>>

    abstract val classRegistrarCount: Int
    abstract val projectName: String
}
