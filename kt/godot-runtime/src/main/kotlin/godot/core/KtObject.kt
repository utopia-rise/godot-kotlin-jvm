package godot.core

import godot.util.VoidPtr
import godot.util.nullptr
import kotlin.reflect.KClass

@Suppress("LeakingThis")
abstract class KtObject(val isRef: Boolean) : AutoCloseable {
    var rawPtr: VoidPtr = nullptr
        set(value) {
            require(field == nullptr) {
                "rawPtr should be only set once!"
            }
            field = value
        }

    var godotInstanceId: Long = -1

    init {
        try {
            if (shouldInit.get()) {
                // user types shouldn't override this method
                rawPtr = __new()
                godotInstanceId = getInstanceId()
                GarbageCollector.registerInstance(this)

                // inheritance in Godot is faked, a script is attached to an Object allow
                // the script to see all methods of the owning Object.
                // For user types, we need to make sure to attach this script to the Object
                // rawPtr is pointing to.
                val clazz = checkNotNull(this::class.qualifiedName) { "User classes can't be anonymous." }
                if (TypeManager.isUserType(clazz)) {
                    TransferContext.setScript(rawPtr, clazz, this, this::class.java.classLoader)
                    __onInit()
                }
            }
        } finally {
            shouldInit.set(true)
        }
    }

    abstract fun __new(): VoidPtr
    abstract fun getInstanceId(): Long

    private fun __onInit() {
        onInitListener[this::class]?.forEach { it.invoke(this) }
        _onInit()
    }

    open fun _onInit() = Unit

    fun __onDestroy() { //not private, but final -> needs to be called through jni
        onDestroyListener[this::class]?.forEach { it.invoke(this) }
        _onDestroy()
    }

    open fun _onDestroy() = Unit

    fun free() {
        TransferContext.freeObject(this)
    }

    final override fun close() {
        free()
    }

    companion object {
        private val shouldInit = ThreadLocal.withInitial { true }

        @PublishedApi
        internal val onInitListener: MutableMap<KClass<out KtObject>, MutableList<(KtObject) -> Unit>> = mutableMapOf()

        @PublishedApi
        internal val onDestroyListener: MutableMap<KClass<out KtObject>, MutableList<(KtObject) -> Unit>> = mutableMapOf()

        fun <T : KtObject> instantiateWith(rawPtr: VoidPtr, instanceId: Long, isRef: Boolean = false, constructor: () -> T): T {
            shouldInit.set(false)
            return constructor().also {
                it.rawPtr = rawPtr
                it.godotInstanceId = instanceId
                GarbageCollector.registerInstance(it)
                it.__onInit()
            }
        }

        inline fun <reified T : KtObject> subscribeToOnInit(noinline listener: (T: KtObject) -> Unit) {
            onInitListener[T::class]?.add(listener) ?: run { onInitListener[T::class] = mutableListOf(listener) }
        }

        inline fun <reified T : KtObject> unSubscribeFromOnInit(noinline listener: (KtObject) -> Unit) {
            onInitListener[T::class]?.remove(listener)
            if (onInitListener[T::class]?.size ?: 0 == 0) {
                onInitListener.remove(T::class)
            }
        }

        inline fun <reified T : KtObject> subscribeToOnDestroy(noinline listener: (T: KtObject) -> Unit) {
            onDestroyListener[T::class]?.add(listener) ?: run { onDestroyListener[T::class] = mutableListOf(listener) }
        }

        inline fun <reified T : KtObject> unSubscribeFromOnDestroy(noinline listener: (KtObject) -> Unit) {
            onDestroyListener[T::class]?.remove(listener)
            if (onDestroyListener[T::class]?.size ?: 0 == 0) {
                onDestroyListener.remove(T::class)
            }
        }
    }
}
