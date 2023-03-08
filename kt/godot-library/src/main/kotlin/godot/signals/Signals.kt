package godot.signals

import godot.Object
import godot.core.Callable
import godot.core.CoreType
import godot.core.StringName
import godot.core.KtFunction
import godot.core.asStringName
import godot.global.GD
import godot.util.camelToSnakeCase

open class Signal(
    val godotObject: Object,
    val name: StringName
) : CoreType {
    constructor(instance: Object, jvmName: String) : this(
        instance,
        jvmName.camelToSnakeCase().removePrefix("_").asStringName()
    )

    val objectId by lazy { godotObject.id }

    protected fun emitSignal(instance: Object, vararg args: Any?) {
        instance.emitSignal(name, *args)
    }

    fun connect(
        callable: Callable,
        flags: Int
    ) = godotObject.connect(name, callable, flags)

    fun disconnect(callable: Callable) = godotObject.disconnect(name, callable)

    fun getConnections() = godotObject.getSignalConnectionList(name)

    fun isConnected(callable: Callable) = godotObject.isConnected(name, callable)

    fun isNull() = !(GD.isInstanceValid(godotObject) && godotObject.hasSignal(name))

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Signal

        if (godotObject != other.godotObject) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        var result = godotObject.hashCode()
        result = 31 * result + name.hashCode()
        return result
    }
}

class Signal0(instance: Object, name: String) : Signal(instance, name) {
    fun emit(instance: Object) {
        emitSignal(instance)
    }
}

class Signal1<P0>(instance: Object, name: String) : Signal(instance, name) {
    fun emit(instance: Object, p0: P0) {
        emitSignal(
            instance,
            p0
        )
    }
}

class Signal2<P0, P1>(instance: Object, name: String) : Signal(instance, name) {
    fun emit(instance: Object, p0: P0, p1: P1) {
        emitSignal(
            instance,
            p0,
            p1
        )
    }
}

class Signal3<P0, P1, P2>(instance: Object, name: String) : Signal(instance, name) {
    fun emit(instance: Object, p0: P0, p1: P1, p2: P2) {
        emitSignal(
            instance,
            p0,
            p1,
            p2
        )
    }
}

class Signal4<P0, P1, P2, P3>(instance: Object, name: String) : Signal(instance, name) {
    fun emit(instance: Object, p0: P0, p1: P1, p2: P2, p3: P3) {
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
    fun emit(instance: Object, p0: P0, p1: P1, p2: P2, p3: P3, p4: P4) {
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
    fun emit(instance: Object, p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5) {
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
    fun emit(instance: Object, p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6) {
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
    fun emit(instance: Object, p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7) {
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
    fun emit(instance: Object, p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8) {
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
    fun emit(
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
