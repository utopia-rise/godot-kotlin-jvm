package godot.signals

import godot.Object
import godot.core.Callable
import godot.core.CoreType
import godot.core.GodotError
import godot.core.StringName
import godot.core.asStringName
import godot.global.GD
import godot.util.camelToSnakeCase
import kotlin.reflect.KCallable

open class Signal internal constructor(
    val godotObject: Object,
    val name: StringName
) : CoreType {

    constructor(instance: Object, jvmName: String) : this(
        instance,
        jvmName.camelToSnakeCase().removePrefix("_").asStringName()
    )

    fun emitSignal(vararg args: Any?) {
        godotObject.emitSignal(name, *args)
    }

    fun connect(
        callable: Callable,
        flags: Int = 0
    ) = godotObject.connect(name, callable, flags.toLong())

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
    fun emit() {
        emitSignal()
    }

    fun <T : Object> connect(
        target: T,
        method: T.() -> Unit,
        flags: Int = 0,
    ): GodotError {
        val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
        return connect(Callable(target, methodName), flags)
    }
}

class Signal1<P0>(instance: Object, name: String) : Signal(instance, name) {
    fun emit(p0: P0) {
        emitSignal(
            p0
        )
    }

    fun <T : Object> connect(
        target: T,
        method: T.(P0) -> Unit,
        flags: Int = 0,
    ): GodotError {
        val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
        return connect(Callable(target, methodName), flags)
    }
}

class Signal2<P0, P1>(instance: Object, name: String) : Signal(instance, name) {
    fun emit(p0: P0, p1: P1) {
        emitSignal(
            p0,
            p1
        )
    }

    fun <T : Object> connect(
        target: T,
        method: T.(P0, P1) -> Unit,
        flags: Int = 0,
    ): GodotError {
        val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
        return connect(Callable(target, methodName), flags)
    }
}

class Signal3<P0, P1, P2>(instance: Object, name: String) : Signal(instance, name) {
    fun emit(p0: P0, p1: P1, p2: P2) {
        emitSignal(
            p0,
            p1,
            p2
        )
    }

    fun <T : Object> connect(
        target: T,
        method: T.(P0, P1, P2) -> Unit,
        flags: Int = 0,
    ): GodotError {
        val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
        return connect(Callable(target, methodName), flags)
    }
}

class Signal4<P0, P1, P2, P3>(instance: Object, name: String) : Signal(instance, name) {
    fun emit(p0: P0, p1: P1, p2: P2, p3: P3) {
        emitSignal(
            p0,
            p1,
            p2,
            p3
        )
    }

    fun <T : Object> connect(
        target: T,
        method: T.(P0, P1, P2, P3) -> Unit,
        flags: Int = 0,
    ): GodotError {
        val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
        return connect(Callable(target, methodName), flags)
    }
}

class Signal5<P0, P1, P2, P3, P4>(instance: Object, name: String) : Signal(instance, name) {
    fun emit(p0: P0, p1: P1, p2: P2, p3: P3, p4: P4) {
        emitSignal(
            p0,
            p1,
            p2,
            p3,
            p4
        )
    }

    fun <T : Object> connect(
        target: T,
        method: T.(P0, P1, P2, P3, P4) -> Unit,
        flags: Int = 0,
    ): GodotError {
        val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
        return connect(Callable(target, methodName), flags)
    }
}

class Signal6<P0, P1, P2, P3, P4, P5>(instance: Object, name: String) : Signal(instance, name) {
    fun emit(p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5) {
        emitSignal(
            p0,
            p1,
            p2,
            p3,
            p4,
            p5
        )
    }

    fun <T : Object> connect(
        target: T,
        method: T.(P0, P1, P2, P3, P4, P5) -> Unit,
        flags: Int = 0,
    ): GodotError {
        val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
        return connect(Callable(target, methodName), flags)
    }
}

class Signal7<P0, P1, P2, P3, P4, P5, P6>(instance: Object, name: String) : Signal(instance, name) {
    fun emit(p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6) {
        emitSignal(
            p0,
            p1,
            p2,
            p3,
            p4,
            p5,
            p6
        )
    }

    fun <T : Object> connect(
        target: T,
        method: T.(P0, P1, P2, P3, P4, P5, P6) -> Unit,
        flags: Int = 0,
    ): GodotError {
        val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
        return connect(Callable(target, methodName), flags)
    }
}

class Signal8<P0, P1, P2, P3, P4, P5, P6, P7>(instance: Object, name: String) : Signal(instance, name) {
    fun emit(p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7) {
        emitSignal(
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

    fun <T : Object> connect(
        target: T,
        method: T.(P0, P1, P2, P3, P4, P5, P6, P7) -> Unit,
        flags: Int = 0,
    ): GodotError {
        val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
        return connect(Callable(target, methodName), flags)
    }
}
