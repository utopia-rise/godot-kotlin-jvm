package godot.util

import kotlin.reflect.KProperty


internal class ThreadLocalLazyDelegate<T>(private val provider: () -> T) : Lazy<T> {
    private val threadLocal = ThreadLocal.withInitial { lazy(LazyThreadSafetyMode.NONE, provider) }
    override val value get() = threadLocal.get().value
    override fun isInitialized(): Boolean = threadLocal.get().isInitialized()
}

internal class ThreadLocalDelegate<T>(val provider: () -> T) {
    private val threadLocal = ThreadLocal.withInitial { provider() }
    operator fun getValue(thisRef: Any?, property: KProperty<*>): T = threadLocal.get()
}

internal fun <T> threadLocalLazy(provider: () -> T) = ThreadLocalLazyDelegate(provider)
internal fun <T> threadLocal(provider: () -> T) = ThreadLocalDelegate(provider)
