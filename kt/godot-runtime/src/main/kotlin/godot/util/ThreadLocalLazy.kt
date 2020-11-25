package godot.util


class ThreadLocalLazy<T>(private val provider: () -> T) : Lazy<T> {
    private val threadLocal = ThreadLocal.withInitial { lazy(LazyThreadSafetyMode.NONE, provider) }
    override val value get() = threadLocal.get().value
    override fun isInitialized(): Boolean = threadLocal.get().isInitialized()
}

fun <T> threadLocalLazy(provider: () -> T) = ThreadLocalLazy(provider)