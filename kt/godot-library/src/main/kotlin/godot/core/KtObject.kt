package godot.core

import godot.common.interop.IdentityPointer
import godot.common.interop.ObjectID
import godot.common.interop.VoidPtr
import godot.common.interop.nullObjectID
import godot.common.interop.nullptr
import godot.core.memory.MemoryManager
import godot.core.memory.TransferContext
import kotlincompile.definitions.GodotJvmBuildConfig

class GodotNotification internal constructor(val block: Any.(Int) -> Unit)

@Suppress("LeakingThis")
abstract class KtObject: IdentityPointer {

    /** Used to prevent the new method to be executed when called from instantiateWith
     * Instead we use the values set in that class  */
    internal class InitConfiguration {
        var ptr: VoidPtr = nullptr
        var objectID: ObjectID = ObjectID(-1)

        fun reset() {
            ptr = nullptr
            objectID = ObjectID(-1)
        }
    }

    override var ptr: VoidPtr = nullptr
        set(value) {
            if (GodotJvmBuildConfig.DEBUG) {
                require(field == nullptr) {
                    "rawPtr should only be set once!"
                }
            }
            field = value
        }

    override var objectID: ObjectID = nullObjectID
        set(value) {
            if (GodotJvmBuildConfig.DEBUG) {
                require(field == nullObjectID) {
                    "id should only be set once!"
                }
            }
            field = value
        }

    internal var twin: KtObject? = null

    init {
        val config = initConfig.get()

        if (config.ptr != nullptr) {
            // Native object already exists, so we know the id and ptr without going back to the other side.
            ptr = config.ptr
            objectID = config.objectID
            config.reset()
            // We don't need to register the instance to the MemoryManager, it is the responsibility of the caller.
        } else {
            // Branch used when created directly from user code. The native object is going to be created here.
            // If the class is a script, the ScriptInstance is going to be created at the same time.
            new(TypeManager.userTypeToId[this::class] ?: -1)
            MemoryManager.registerNewInstance(this)
        }
    }

    protected abstract fun new(scriptIndex: Int)

    @Suppress("NOTHING_TO_INLINE")
    internal inline fun callConstructor(classIndex: Int, scriptIndex: Int): Unit {
        MemoryManager.createNativeObject(classIndex, this, scriptIndex)
        TransferContext.initializeKtObject(this)
    }

    @Suppress("NOTHING_TO_INLINE")
    internal inline fun getSingleton(classIndex: Int) {
        MemoryManager.getSingleton(classIndex)
        TransferContext.initializeKtObject(this)
    }

    @Suppress("FunctionName")
    open fun _notification(): GodotNotification = godotNotification {}

    @Suppress("UNCHECKED_CAST")
    @JvmName("kotlinNotification")
    protected fun <T : KtObject> T.godotNotification(block: T.(Int) -> Unit): GodotNotification = GodotNotification(block as Any.(Int) -> Unit)

    @JvmName("godotNotification")
    protected fun <T : KtObject> javaGodotNotification(obj: T, block: T.(Int) -> Unit) = obj.godotNotification(block)

    @Suppress("FunctionName")
    /**
     * Called automatically when the Object is destroyed. Note that this method is not available for RefCounted or any of its child class.
     * By the time a RefCounted counter reaches 0, its JVM instance has already being GCed and can't be used anymore.
     */
    open fun _onDestroy() = Unit

    fun free() {
        MemoryManager.freeObject(ptr)
    }

    internal companion object {
        private val initConfig = ThreadLocal.withInitial { InitConfiguration() }

        /** When using this constructor, the newly created instances doesn't register itself to the MemoryManager, the caller must do it.*/
        inline operator fun <T : KtObject> invoke(rawPtr: VoidPtr, id: Long, constructor: () -> T) = initConfig.get().run {
            ptr = rawPtr
            objectID = ObjectID(id)
            constructor()
        }

    }
}
