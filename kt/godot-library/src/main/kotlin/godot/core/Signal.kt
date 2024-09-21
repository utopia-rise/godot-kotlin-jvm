package godot.core

import godot.Object
import godot.global.GD
import godot.util.camelToSnakeCase

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
