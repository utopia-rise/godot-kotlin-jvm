package godot.util

import kotlin.reflect.KProperty

internal class ThreadLocalDelegate<T>(val provider: () -> T) {
    private val threadLocal = ThreadLocal.withInitial { provider() }
    operator fun getValue(thisRef: Any?, property: KProperty<*>): T = threadLocal.get()
}

internal fun <T> threadLocal(provider: () -> T) = ThreadLocalDelegate(provider)
