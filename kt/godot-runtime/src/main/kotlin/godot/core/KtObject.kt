package godot.core

import godot.util.VoidPtr
import godot.util.info
import godot.util.nullptr

@Suppress("LeakingThis")
abstract class KtObject {
    var rawPtr: VoidPtr = nullptr
        set(value) {
            require(field == nullptr || field == value) {
                "rawPtr should be only set once!"
            }
            field = value
        }

    /** Godot ID in the case of an Object.
     *  Index in the case of a Reference.
     */
    var __id: Long = -1

    init {
        val value = current.get()
        val new_curent = value + 1
        val limit = limit.get()

        if (new_curent > limit) {
            current.set(new_curent)
            // user types shouldn't override this method
            __new()
            if (!____DO_NOT_TOUCH_THIS_isSingleton____()) {
                if (____DO_NOT_TOUCH_THIS_isRef____()) {
                    GarbageCollector.registerReference(this)
                } else {
                    GarbageCollector.registerObject(this)
                }
            }

            // inheritance in Godot is faked, a script is attached to an Object allow
            // the script to see all methods of the owning Object.
            // For user types, we need to make sure to attach this script to the Object
            // rawPtr is pointing to.
            val classIndex = TypeManager.userTypeToId[this::class]
            // If user type
            if (classIndex != null) {
                TransferContext.setScript(rawPtr, classIndex, this, this::class.java.classLoader)
            }

            try {
                _onInit()
            } finally {
                current.set(value)
            }
        }
    }

    @Suppress("FunctionName")
    open fun ____DO_NOT_TOUCH_THIS_isRef____() = false

    @Suppress("FunctionName")
    open fun ____DO_NOT_TOUCH_THIS_isSingleton____() = false

    abstract fun __new()
    abstract fun getInstanceId(): Long

    open fun _onInit() = Unit
    open fun _onDestroy() = Unit

    fun free() {
        TransferContext.freeObject(this)
    }

    companion object {
        private val current = ThreadLocal.withInitial { 0 }
        private val limit = ThreadLocal.withInitial { 0 }

        fun <T : KtObject> instantiateWith(rawPtr: VoidPtr, Id: Long, constructor: () -> T): T {
            val value = current.get()
            val old_limit = limit.get()
            limit.set(value + 1)
            val obj = try {
                constructor()
            } finally {
                limit.set(old_limit)
            }

            return obj.also {
                it.rawPtr = rawPtr
                it.__id = Id
                if (!it.____DO_NOT_TOUCH_THIS_isSingleton____()) {
                    if (it.____DO_NOT_TOUCH_THIS_isRef____()) {
                        GarbageCollector.registerReference(it)
                    } else {
                        GarbageCollector.registerObject(it)
                    }
                }
                it._onInit()
            }
        }
    }
}
