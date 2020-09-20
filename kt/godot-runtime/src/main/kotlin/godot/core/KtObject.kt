package godot.core

import godot.util.VoidPtr
import godot.util.nullptr

@Suppress("LeakingThis")
abstract class KtObject : AutoCloseable {
    var rawPtr: VoidPtr = nullptr
        set(value) {
            require(field == nullptr) {
                "rawPtr should be only set once!"
            }
            field = value
        }


    init {
        try {
            if (shouldInit.get()) {
                // user types shouldn't override this method
                rawPtr = __new()

                // inheritance in Godot is faked, a script is attached to an Object allow
                // the script to see all methods of the owning Object.
                // For user types, we need to make sure to attach this script to the Object
                // rawPtr is pointing to.
                val className = checkNotNull(this::class.qualifiedName) { "User classes can't be anonymous." }
                if (TypeManager.isUserType(className)) {
                    TransferContext.setScript(rawPtr, className, this, this::class.java.classLoader)
                    _onInit()
                }
            }
        } finally {
            shouldInit.set(true)
        }
    }

    abstract fun __new(): VoidPtr

    open fun _onInit() = Unit
    open fun _onDestroy() = Unit

    fun free() {
        TransferContext.freeObject(this)
    }

    final override fun close() {
        free()
    }

    companion object {
        private val shouldInit = ThreadLocal.withInitial { true }

        fun <T: KtObject> instantiateWith(rawPtr: VoidPtr, constructor: () -> T): T {
            shouldInit.set(false)
            return constructor().also {
                it.rawPtr = rawPtr
                it._onInit()
            }
        }
    }
}
