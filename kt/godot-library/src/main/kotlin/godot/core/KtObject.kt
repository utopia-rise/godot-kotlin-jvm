package godot.core

import godot.core.memory.binding.GodotBinding
import godot.core.memory.MemoryManager
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import godot.util.nullObjectID
import godot.util.nullptr
import kotlincompile.definitions.GodotJvmBuildConfig

@JvmInline
value class GodotNotification internal constructor(val block: Any.(Int) -> Unit)

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
            if (GodotJvmBuildConfig.DEBUG) {
                require(field == nullptr) {
                    "rawPtr should only be set once!"
                }
            }
            field = value
        }

    var id: ObjectID = nullObjectID
        set(value) {
            if (GodotJvmBuildConfig.DEBUG) {
                require(field == nullObjectID) {
                    "id should only be set once!"
                }
            }
            field = value
        }

    private var binding: GodotBinding

    init {
        val config = initConfig.get()

        val scriptIndex = TypeManager.userTypeToId[this::class] ?: -1

        if (config.shouldOverride) {
            //Native object already exists, so we know the id and ptr without going back to the other side.
            rawPtr = config.ptr
            id = config.id
            //Singletons are never initialized here as we force their initialization on JVM side at engine start
            config.reset()
        } else {
            //Native object doesn't exist yet, we have to create it.
            //If the class is a script, the ScriptInstance is going to be created at the same time as the native object.
            new(scriptIndex)
        }

        binding = if (scriptIndex != -1) {
            MemoryManager.registerScriptInstance(this)
        } else {
            MemoryManager.registerWrapper(this)
        }
    }

    protected abstract fun new(scriptIndex: Int)

    @Suppress("NOTHING_TO_INLINE")
    internal inline fun callConstructor(classIndex: Int, scriptIndex: Int): Unit {
        TransferContext.createNativeObject(classIndex, this, scriptIndex)
        TransferContext.initializeKtObject(this)
    }

    @Suppress("NOTHING_TO_INLINE")
    internal inline fun getSingleton(classIndex: Int) {
        TransferContext.getSingleton(classIndex)
        TransferContext.initializeKtObject(this)
    }

    @Suppress("FunctionName")
    open fun _notification(): GodotNotification = godotNotification {}

    @Suppress("UNCHECKED_CAST")
    protected fun <T : KtObject> T.godotNotification(block: T.(Int) -> Unit): GodotNotification = GodotNotification(block as Any.(Int) -> Unit)

    @Suppress("FunctionName")
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
