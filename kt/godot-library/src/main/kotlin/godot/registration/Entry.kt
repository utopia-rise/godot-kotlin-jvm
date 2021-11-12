package godot.registration

abstract class Entry {
    class Context(val registry: ClassRegistry)
    abstract fun Context.init()
    abstract fun Context.initEngineTypes()
    abstract fun Context.registerUserTypeVariantMappings()
}
