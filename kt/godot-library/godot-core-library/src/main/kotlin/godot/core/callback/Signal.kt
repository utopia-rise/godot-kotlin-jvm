@file:Suppress("PackageDirectoryMismatch")

package godot.core

import godot.api.Object
import godot.api.Object.ConnectFlags
import godot.internal.memory.MemoryManager
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

open class Signal internal constructor(
    val godotObject: Object,
    val name: StringName
) : CoreType {

    fun emitUnsafe(vararg args: Any?) {
        godotObject.emitSignal(name, *args)
    }

    fun connectUnsafe(
        callable: Callable,
        flags: ConnectFlags = ConnectFlags.DEFAULT
    ) = godotObject.connect(name, callable, flags)

    fun disconnectUnsafe(callable: Callable) = godotObject.disconnect(name, callable)

    fun getConnections() = godotObject.getSignalConnectionList(name)

    fun hasConnections() = godotObject.hasConnections(name)

    fun isConnected(callable: Callable) = godotObject.isConnected(name, callable)

    fun isValid() = MemoryManager.isInstanceValid(godotObject) && godotObject.hasSignal(name)

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

    companion object {
        internal val delegate: ReadOnlyProperty<Object, Signal> =
            ReadOnlyProperty { thisRef, property -> Signal(thisRef, property.toGodotName()) }

        @JvmStatic
        fun createUnsafe(godotObject: Object, name: String) = Signal(godotObject, name.toGodotName())
    }
}

fun Object.unsafeSignal() = Signal.delegate
