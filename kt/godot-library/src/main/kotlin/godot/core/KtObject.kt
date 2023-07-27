package godot.core

import godot.core.memory.GodotBinding
import godot.core.memory.MemoryManager
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

        fun reset() {
            shouldOverride = false
            ptr = nullptr
            id = ObjectID(-1)
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

    private var binding: GodotBinding

    init {
        val config = initConfig.get()

        val scriptIndex = TypeManager.userTypeToId[this::class] ?: -1

        binding = if (config.shouldOverride) {
            //Native object already exists, so we know the id and ptr without going back to the other side.
            rawPtr = config.ptr
            id = config.id
            //Singletons are never initialized here as we force their initialization on JVM side at engine start
            config.reset()
            if(scriptIndex != - 1){
                MemoryManager.registerScriptInstance(this)
            } else {
                MemoryManager.registerObject(this)
            }
        } else {

            //Native object doesn't exist yet, we have to create it.
            //If the class is a script, the ScriptInstance is going to be created at the same time as the native object.
            val isSingleton = !new(scriptIndex)
            if (isSingleton) {
                MemoryManager.registerSingleton(this)
            } else {
                if(scriptIndex != - 1){
                    MemoryManager.registerScriptInstance(this)
                } else {
                    MemoryManager.registerObject(this)
                }
            }
        }
    }

    protected abstract fun new(scriptIndex: Int): Boolean

    internal inline fun callConstructor(classIndex: Int, scriptIndex: Int): Unit {
        TransferContext.createNativeObject(classIndex, this, scriptIndex)
        readPtrAndIdFromBuffer()
    }

    internal inline fun getSingleton(classIndex: Int) {
        TransferContext.getSingleton(classIndex)
        readPtrAndIdFromBuffer()
    }

    private inline fun readPtrAndIdFromBuffer() {
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

        fun <T : KtObject> instantiateWith(rawPtr: VoidPtr, id: Long, constructor: () -> T): T {
            val config = initConfig.get()
            config.ptr = rawPtr
            config.id = ObjectID(id)
            config.shouldOverride = true
            return constructor()
        }
    }
}
