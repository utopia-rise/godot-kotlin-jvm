package godot.core

import godot.core.memory.GarbageCollector
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import godot.util.nullObjectID
import godot.util.nullptr

@Suppress("LeakingThis")
abstract class KtObject {

    /** Used to prevent the new method to be executed when called from instantiateWith
     * Instead we use the values set in that class  */
    private class InitConfiguration {
        var shouldOverride = false
        var ptr: VoidPtr = nullptr
        var id: ObjectID = ObjectID(-1)
        var needBind = false

        fun reset() {
            shouldOverride = false
            ptr = nullptr
            id = ObjectID(-1)
            needBind = false
        }
    }

    var rawPtr: VoidPtr = nullptr
        set(value) {
            require(field == nullptr) {
                "rawPtr should only be set once!"
            }
            field = value
        }

    var id: ObjectID = nullObjectID
        set(value) {
            require(field == nullObjectID) {
                "id should only be set once!"
            }
            field = value
        }

    init {
        val config = initConfig.get()

        if (config.shouldOverride) {
            //Native object already exists, so we know the id and ptr without going back to the other side.
            rawPtr = config.ptr
            id = config.id
            //Singletons are never initialized from here.
            if (config.needBind) {
                GarbageCollector.registerObjectAndBind(this)
            } else {
                GarbageCollector.registerObject(this)
            }
            config.reset()
        } else {
            //Native object doesn't exist yet, we have to create it.
            val scriptIndex = TypeManager.userTypeToId[this::class] ?: -1
            //If the class is a script, the ScriptInstance is going to be created at the same time as the native object.
            if (new(scriptIndex)) {
                //Singletons return false and shouldn't be registered
                GarbageCollector.registerObject(this)
            }
        }
    }

    protected abstract fun new(scriptIndex: Int): Boolean

    internal inline fun callConstructor(classIndex: Int, scriptIndex: Int): Unit {
        TransferContext.createNativeObject(classIndex, this, this::class.java.classLoader, scriptIndex)
        val buffer = TransferContext.buffer
        rawPtr = buffer.long
        id = ObjectID(buffer.long)
        buffer.rewind()
    }

    open fun _onDestroy() = Unit

    fun free() {
        TransferContext.freeObject(this)
    }

    companion object {
        private val initConfig = ThreadLocal.withInitial { InitConfiguration() }

        fun <T : KtObject> instantiateWith(rawPtr: VoidPtr, id: Long, needBind: Boolean, constructor: () -> T): T {
            val config = initConfig.get()
            config.ptr = rawPtr
            config.id = ObjectID(id)
            config.shouldOverride = true
            config.needBind = needBind
            return constructor()
        }
    }
}
