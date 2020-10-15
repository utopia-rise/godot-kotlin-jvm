package godot.signals

import godot.core.KtObject
import godot.core.VariantArray
import godot.Object

open class Signal(
        val name: String
) {
    protected fun emitSignal(instance: Object, vararg args: Any?) {
        instance.emitSignal(name, *args)
    }

    internal fun connect(
            instance: Object,
            target: Object,
            method: String,
            binds: VariantArray?,
            flags: Long
    ) {
        instance.connect(name, target, method, binds ?: VariantArray(), flags)
    }
}

class Signal0(name: String) : Signal(name) {
    @PublishedApi
    internal fun emit(instance: Object) {
        emitSignal(instance)
    }
}

class Signal1<P0>(name: String) : Signal(name) {
    @PublishedApi
    internal fun emit(instance: Object, p0: P0) {
        emitSignal(
                instance,
                p0
        )
    }
}