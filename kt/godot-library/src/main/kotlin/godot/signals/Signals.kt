package godot.signals

import godot.Object
import godot.core.Callable
import godot.core.StringName
import godot.core.VariantArray
import godot.core.asStringName
import godot.util.camelToSnakeCase

open class Signal(
    private val instance: Object,
    jvmName: String
) {
    val name = jvmName.removePrefix("signal").camelToSnakeCase().removePrefix("_").asStringName()

    protected fun emitSignal(instance: Object, vararg args: Any?) {
        instance.emitSignal(name, *args)
    }

    @PublishedApi
    internal fun connect(
        callable: Callable,
        binds: VariantArray<Any?>?,
        flags: Long
    ) = instance.connect(name, callable, binds ?: VariantArray(), flags)
}

class Signal0(instance: Object, name: String) : Signal(instance, name) {
    @PublishedApi
    internal fun emit(instance: Object) {
        emitSignal(instance)
    }
}

class Signal1<P0>(instance: Object, name: String) : Signal(instance, name) {
    @PublishedApi
    internal fun emit(instance: Object, p0: P0) {
        emitSignal(
            instance,
            p0
        )
    }
}

class Signal2<P0, P1>(instance: Object, name: String) : Signal(instance, name) {
    @PublishedApi
    internal fun emit(instance: Object, p0: P0, p1: P1) {
        emitSignal(
            instance,
            p0,
            p1
        )
    }
}

class Signal3<P0, P1, P2>(instance: Object, name: String) : Signal(instance, name) {
    @PublishedApi
    internal fun emit(instance: Object, p0: P0, p1: P1, p2: P2) {
        emitSignal(
            instance,
            p0,
            p1,
            p2
        )
    }
}

class Signal4<P0, P1, P2, P3>(instance: Object, name: String) : Signal(instance, name) {
    @PublishedApi
    internal fun emit(instance: Object, p0: P0, p1: P1, p2: P2, p3: P3) {
        emitSignal(
            instance,
            p0,
            p1,
            p2,
            p3
        )
    }
}

class Signal5<P0, P1, P2, P3, P4>(instance: Object, name: String) : Signal(instance, name) {
    @PublishedApi
    internal fun emit(instance: Object, p0: P0, p1: P1, p2: P2, p3: P3, p4: P4) {
        emitSignal(
            instance,
            p0,
            p1,
            p2,
            p3,
            p4
        )
    }
}

class Signal6<P0, P1, P2, P3, P4, P5>(instance: Object, name: String) : Signal(instance, name) {
    @PublishedApi
    internal fun emit(instance: Object, p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5) {
        emitSignal(
            instance,
            p0,
            p1,
            p2,
            p3,
            p4,
            p5
        )
    }
}

class Signal7<P0, P1, P2, P3, P4, P5, P6>(instance: Object, name: String) : Signal(instance, name) {
    @PublishedApi
    internal fun emit(instance: Object, p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6) {
        emitSignal(
            instance,
            p0,
            p1,
            p2,
            p3,
            p4,
            p5,
            p6
        )
    }
}

class Signal8<P0, P1, P2, P3, P4, P5, P6, P7>(instance: Object, name: String) : Signal(instance, name) {
    @PublishedApi
    internal fun emit(instance: Object, p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7) {
        emitSignal(
            instance,
            p0,
            p1,
            p2,
            p3,
            p4,
            p5,
            p6,
            p7
        )
    }
}

class Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8>(instance: Object, name: String) : Signal(instance, name) {
    @PublishedApi
    internal fun emit(instance: Object, p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8) {
        emitSignal(
            instance,
            p0,
            p1,
            p2,
            p3,
            p4,
            p5,
            p6,
            p7,
            p8
        )
    }
}

class Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(instance: Object, name: String) : Signal(instance, name) {
    @PublishedApi
    internal fun emit(
        instance: Object,
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9
    ) {
        emitSignal(
            instance,
            p0,
            p1,
            p2,
            p3,
            p4,
            p5,
            p6,
            p7,
            p8,
            p9
        )
    }
}
