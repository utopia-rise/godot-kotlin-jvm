@file:Suppress("ClassName")

package godot.extensions

import godot.Object
import godot.RefCounted
import godot.core.memory.MemoryManager
import godot.core.memory.GodotStatic
import godot.core.variantMapper
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


internal object UNINITIALIZED_VALUE

class GodotStaticDelegate<T : Any?>(val factory: () -> T) : GodotStatic, ReadWriteProperty<Any, T> {

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
            if (v1 !is RefCounted && MemoryManager.isInstanceValid(v1)) {
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

inline fun <reified T : Any?> godotStatic(noinline factory: () -> T): GodotStaticDelegate<T> {

    val variantType = variantMapper[T::class]
    checkNotNull(variantType) {
        "Can't create a GodotStatic with generic ${T::class}."
    }

    return GodotStaticDelegate(factory).also{
        it.registerAsSingleton()
    }
}
