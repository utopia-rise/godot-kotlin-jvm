@file:Suppress("ClassName")

package godot.extensions

import godot.Reference
import godot.Object
import godot.core.GarbageCollector
import godot.core.memory.BaseGodotStatic
import godot.global.GD
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


internal object UNINITIALIZED_VALUE

class GodotStaticDelegate<T : Object?>(val factory: () -> T) : BaseGodotStatic(), ReadWriteProperty<Any, T> {

    private var _value: Any? = UNINITIALIZED_VALUE

    override fun getValue(thisRef: Any, property: KProperty<*>): T {
        return synchronized(this) {
            if (_value === UNINITIALIZED_VALUE) {
                _value = factory()
            }
            @Suppress("UNCHECKED_CAST")
            _value as T
        }
    }

    override fun collect() {
        val v1 = _value

        if (v1 != UNINITIALIZED_VALUE && v1 != null) {
            require(v1 is Object)
            if (v1 !is Reference && GarbageCollector.isInstanceValid(v1)) {
                v1.free()
            }
        }

        _value = UNINITIALIZED_VALUE;
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: T) {
        synchronized(this) {
            collect()
            _value = value
        }
    }
}

fun <T : Object?> godotStatic(factory: () -> T): GodotStaticDelegate<T> {
    return GodotStaticDelegate(factory)
}
