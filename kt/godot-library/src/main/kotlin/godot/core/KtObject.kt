package godot.core

import godot.core.memory.GarbageCollector
import godot.util.VoidPtr
import godot.util.nullptr

@Suppress("LeakingThis")
abstract class KtObject {

    /** Used to prevent the __new method to be executed when called from instantiateWith
     * Instead we use the values set in that class  */
    private class InitConfiguration {
        var shouldOverride = false
        var ptr: VoidPtr = nullptr
        var id: ObjectID = ObjectID(-1)

        fun reset() {
            shouldOverride = false
            ptr = nullptr
            id = ObjectID(-1)
        }
    }

    var rawPtr: VoidPtr = nullptr
        set(value) {
            require(field == nullptr || field == value) {
                "rawPtr should be only set once!"
            }
            field = value
        }

    var __id: ObjectID = ObjectID(-1)

    init {
        val config = initConfig.get()

        if (config.shouldOverride) {
            rawPtr = config.ptr
            __id = config.id
            config.reset()
        } else {
            // user types shouldn't override this method
            // inheritance in Godot is faked, a script is attached to an Object allow
            // the script to see all methods of the owning Object.
            // For user types, we need to make sure to attach this script to the Object
            // rawPtr is pointing to.
            val scriptIndex = TypeManager.userTypeToId[this::class]?: -1
            __new(scriptIndex)
        }

        if (!____DO_NOT_TOUCH_THIS_isSingleton____()) {
            GarbageCollector.registerObject(this)
        }
    }

    @Suppress("FunctionName")
    open fun ____DO_NOT_TOUCH_THIS_isSingleton____() = false

    abstract fun __new(scriptIndex: Int)

    internal inline fun callConstructor(classIndex: Int, scriptIndex: Int): Unit {
        TransferContext.createNativeObject(classIndex, this, this::class.java.classLoader, scriptIndex)
        val buffer = TransferContext.buffer
        rawPtr = buffer.long
        __id = ObjectID(buffer.long)
        buffer.rewind()
    }

    open fun _onDestroy() = Unit

    fun free() {
        TransferContext.freeObject(this)
    }

    companion object {
        private val initConfig = ThreadLocal.withInitial { InitConfiguration() }

        fun <T : KtObject> instantiateWith(rawPtr: VoidPtr, id: Long, constructor: () -> T): T {
            val config = initConfig.get()
            config.ptr = rawPtr
            config.id = ObjectID(id)
            config.shouldOverride = true
            return constructor()
        }
    }
}
