package godot.common.util

import kotlin.reflect.KProperty

class ThreadLocalDelegate<T>(val provider: () -> T) {
    private val threadLocal = ThreadLocal.withInitial { provider() }
    operator fun getValue(thisRef: Any?, property: KProperty<*>): T = threadLocal.get()
}

fun <T> threadLocal(provider: () -> T) = ThreadLocalDelegate(provider)
