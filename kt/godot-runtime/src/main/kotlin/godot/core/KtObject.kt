package godot.core

import godot.util.VoidPtr
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

    var godotInstanceId: Long = -1

    init {
        try {
            if (shouldInit.get()) {
                // user types shouldn't override this method
                rawPtr = __new()
                godotInstanceId = getInstanceId()

                if (!____DO_NOT_TOUCH_THIS_isSingleton____()) {
                    GarbageCollector.registerInstance(this, false)
                }

                // inheritance in Godot is faked, a script is attached to an Object allow
                // the script to see all methods of the owning Object.
                // For user types, we need to make sure to attach this script to the Object
                // rawPtr is pointing to.
                val classIndex = TypeManager.userTypeToId[this::class]
                // If user type
                if (classIndex != null) {
                    TransferContext.setScript(rawPtr, classIndex, this, this::class.java.classLoader)
                    _onInit()
                }
            }
        } finally {
            shouldInit.set(true)
        }
    }

    @Suppress("FunctionName")
    open fun ____DO_NOT_TOUCH_THIS_isRef____() = false

    @Suppress("FunctionName")
    open fun ____DO_NOT_TOUCH_THIS_isSingleton____() = false

    abstract fun __new(): VoidPtr
    abstract fun getInstanceId(): Long

    open fun _onInit() = Unit
    open fun _onDestroy() = Unit

    fun free() {
        TransferContext.freeObject(this)
    }

    companion object {
        private val shouldInit = ThreadLocal.withInitial { true }

        fun <T: KtObject> instantiateWith(rawPtr: VoidPtr, instanceId: Long, hasRefCountBeenIncremented: Boolean = false, constructor: () -> T): T {
            shouldInit.set(false)
            return constructor().also {
                it.rawPtr = rawPtr
                it.godotInstanceId = instanceId
                if (!it.____DO_NOT_TOUCH_THIS_isSingleton____()) {
                    GarbageCollector.registerInstance(it, hasRefCountBeenIncremented)
                }
                it._onInit()
            }
        }
    }
}
