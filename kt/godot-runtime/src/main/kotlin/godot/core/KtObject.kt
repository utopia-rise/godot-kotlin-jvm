package godot.core

import godot.util.VoidPtr
import godot.util.nullptr

abstract class KtObject {
    var rawPtr: VoidPtr = nullptr
        set(value) {
            require(field == nullptr) {
                "rawPtr should be only set once!"
            }
            field = value
            // TODO: track instance
        }

    init {
        if (shouldInit.get()) {
            @Suppress("LeakingThis")
            // user types shouldn't override this method
            rawPtr = __new()
            val className = checkNotNull(this::class.simpleName) { "User classes can't be anonymous." }
            if (Godot.isUserType(className)) {
                Godot.setScript(rawPtr, className)
            }
        } else {
            shouldInit.set(true)
        }
    }

    abstract fun __new(): VoidPtr

    open fun _onInit() = Unit
    open fun _onDestroy() = Unit

    companion object {
        private val shouldInit = ThreadLocal.withInitial { true }

        fun <T: KtObject> instantiateWith(rawPtr: VoidPtr, constructor: () -> T): T {
            shouldInit.set(false)
            return constructor().also {
                it.rawPtr = rawPtr
            }
        }
    }
}