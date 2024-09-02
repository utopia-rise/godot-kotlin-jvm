@file:Suppress("unused")

package godot.core.memory

import godot.core.KtObject
import godot.core.NativeCoreType
import godot.core.NodePath
import godot.core.ObjectID
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType
import godot.util.LRUCache
import godot.util.VoidPtr
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.locks.ReentrantReadWriteLock
import kotlin.concurrent.read
import kotlin.concurrent.write
import kotlin.math.max
import kotlin.math.min

internal object MemoryManager {
    /** Base capacity for caches.*/
    private const val CACHE_INITIAL_CAPACITY = 256

    /** Base capacity for several binding containers.*/
    private const val BINDING_INITIAL_CAPACITY = 4096

    /** Number of references to decrement each loop at most (Doesn't have priority over the ratio).*/
    private const val MAX_GC_NUMBER = 64

    /** The fraction of references to check each loop at least (chosen so everything is freed after 1 second at most, assuming a 60 fps game).*/
    private const val MIN_GC_RATIO = 1f / 60f

    private val lock = ReentrantReadWriteLock()

    /** Pointers to Godot objects.*/
    private val ObjectDB = HashMap<ObjectID, GodotBinding>(BINDING_INITIAL_CAPACITY)

    /** List of references to decrement.*/
    private val deadReferences = mutableListOf<RefCountedBinding>()

    /** Pointers to NativeCoreType.*/
    private val nativeCoreTypeMap = ConcurrentHashMap<VoidPtr, NativeCoreBinding>(BINDING_INITIAL_CAPACITY)

    /** List of references to decrement.*/
    private val deadNativeCores = mutableListOf<NativeCoreBinding>()

    /** List of cleanup callbacks. When the game closes, they will be called.*/
    private var cleanupCallbacks = mutableListOf<() -> Unit>()

    // Create an LRU cache for StringName and NodePath objects based on a String key.
    // TODO: Set the initial capacity from the command line.
    private val stringNameCache = LRUCache<String, StringName>(CACHE_INITIAL_CAPACITY)
    private val nodePathCache = LRUCache<String, NodePath>(CACHE_INITIAL_CAPACITY)

    fun getOrCreateStringName(key: String): StringName {
        return synchronized(stringNameCache) {
            stringNameCache.getOrPut(key) {
                // Cache miss, so create and return new instance.
                StringName(key)
            }
        }
    }

    fun getOrCreateNodePath(key: String): NodePath {
        return synchronized(nodePathCache) {
            nodePathCache.getOrPut(key) {
                // Cache miss, so create and return new instance.
                NodePath(key)
            }
        }
    }

    fun getOrCreateNodePath(key: StringName): NodePath {
        return getOrCreateNodePath(key.toString())
    }

    fun registerCallback(callback: () -> Unit) {
        cleanupCallbacks.add(callback)
    }

    /**
     * The godot object has just been created. We can directly add it to ObjectDB because we know the slot is free.
     */
    fun registerNewInstance(instance: KtObject) = lock.write {
        ObjectDB[instance.objectID] = GodotBinding.create(instance)
    }

    /**
     * Create a script on top of an existing native object. We need additional checks to find if a twin wrapper exists.
     */
    inline fun <T : KtObject> createScript(ptr: VoidPtr, id: Long, constructor: () -> T): T {
        val instance = KtObject(ptr, id, constructor)

        val objectId = ObjectID(id)

        return lock.write {
            val binding = ObjectDB.put(objectId, GodotBinding.create(instance))

            if (binding != null) {
                val wrapper = binding.instance
                wrapper?.twin = instance
                instance.twin = wrapper
            }
            instance
        }
    }

    /**
     * Remove the existing Script instance from the ObjectDB and replace it from the matching wrapper.
     */
    fun removeScript(id: Long, constructorIndex: Int) = lock.write {
        val objectID = ObjectID(id)
        val scriptInstance = ObjectDB[objectID]!!.instance!!

        val twin = scriptInstance.twin
        if (twin != null) {
            ObjectDB[objectID] = GodotBinding.create(twin)
            return //The script had previously a wrapper, we can reuse it.
        }

        // We create a wrapper to replace the script instance, if it doesn't exist already.
        val wrapper = KtObject(
            scriptInstance.rawPtr,
            id,
            TypeManager.engineTypesConstructors[constructorIndex],
        )

        ObjectDB[objectID] = GodotBinding.create(wrapper)

        // Still set the twin as a security if users keep a reference of the scriptInstance somewhere (even if they shouldn't, but it's valid from a JVM point of view).
        // It will prevent segfault in such case.
        wrapper.twin = scriptInstance
        scriptInstance.twin = scriptInstance
    }

    fun getInstanceOrCreate(ptr: VoidPtr, id: Long, constructorIndex: Int): KtObject {
        val objectID = ObjectID(id)

        val instance = lock.read {
            ObjectDB[objectID]?.instance
        }

        if (instance != null) {
            return instance
        }

        // We didn't find a matching instance, we create it then.
        return lock.write {
            // We check a second time in a write lock in case it got created after the read lock by another thread
            val newInstance = ObjectDB[objectID]?.instance
            if (newInstance != null) {
                newInstance
            } else {
                val constructor = TypeManager.engineTypesConstructors[constructorIndex]
                KtObject(ptr, id, constructor).also {
                    ObjectDB[objectID] = GodotBinding.create(it)
                }
            }
        }
    }

    fun isInstanceValid(ktObject: KtObject) = checkInstance(ktObject.rawPtr, ktObject.objectID.id)

    fun registerNativeCoreType(nativeCoreType: NativeCoreType, variantType: VariantType) {
        val rawPtr = nativeCoreType._handle
        nativeCoreTypeMap[rawPtr] = NativeCoreBinding(nativeCoreType, variantType)
    }

    private fun syncMemory(freedObjects: LongArray): LongArray {
        removeNativeCoreTypes()
        removeDeadObjects(freedObjects)
        return getDeadReferences()
    }

    /**
     * Remove the now dead native Object from the JVM ObjectDB.
     */
    private fun removeDeadObjects(freedObjects: LongArray) = lock.write {
        for (id in freedObjects) {
            val objectID = ObjectID(id)
            ObjectDB.remove(objectID)
        }
    }

    /**
     * Get a LongArray containing a collection of dead references that have to be decremented on the native side.
     * The GC happening in waves, not everything is processed at once, we process the dead references over several frames when necessary.
     */
    private fun getDeadReferences(): LongArray {
        // Pool all dead references first, so we can know the amount of work to do.
        while (true) {
            val ref = ((GodotBinding.queue.poll() ?: break) as RefCountedBinding)
            deadReferences.add(ref)
        }

        val size = deadReferences.size
        val numberToDecrement = max(
            min(MAX_GC_NUMBER, size),
            (MIN_GC_RATIO * size).toInt()
        )

        val sublist = deadReferences.subList(0, numberToDecrement)

        val deadArray = lock.write {
            sublist.filter {
                val objectID = it.objectID
                val otherRef = ObjectDB[objectID]

                /** This part requires caution. We have to make sure it's safe to decrement the counter of this instance.
                 * Everything is under the assumption that all objects during the execution of the engine have a unique ObjectID, which is an assumption Godot uses as well.

                Note that the state of the binding in the ObjectDB at this point in time can be several things:
                - Present with its weak reference still valid.
                - Present but its weak reference got GCed.
                - Not present

                Here the different interpretations we can have:
                - If the dead binding is the same (===) as the one in the ObjectDB, it means it hasn't been replaced yet and is safe to decrement.
                - If the binding is not in the objectDB, it means it has been queued already, we don't need to queue it again.
                it can happen if 2 or more wrappers for the same RefCounted are created and GCed between 2 memory syncs.
                - If the binding in the objectDB is a different one, it means the wrapper has been replaced (the previous one died, but Godot sent to the JVM again), we don't queue it.

                Only the identity test is necessary because that the only case that allows for decrement, all others possibilities don't pass.
                 **/
                val decrement = it === otherRef
                if (decrement) {
                    ObjectDB.remove(objectID)
                }
                decrement
            }
        }
            .map { it.objectID.id }
            .toLongArray()

        sublist.clear()
        return deadArray
    }

    /**
     * Remove dead [NativeCoreType] from native memory.
     * The GC happening in waves, not everything is processed at once, we process the dead native cores over several frames when necessary.
     */
    private fun removeNativeCoreTypes() {
        // Pool all dead native cores first, so we can know the amount of work to do.
        while (true) {
            val ref = ((NativeCoreBinding.queue.poll() ?: break) as NativeCoreBinding)
            deadNativeCores.add(ref)
        }

        val size = deadNativeCores.size
        val numberToDecrement = max(
            min(MAX_GC_NUMBER, size),
            (MIN_GC_RATIO * size).toInt()
        )

        val pointerArray = LongArray(numberToDecrement)
        val variantTypeArray = IntArray(numberToDecrement)

        deadNativeCores
            .subList(0, numberToDecrement)
            .onEachIndexed { index, binding ->
                pointerArray[index] = binding.ptr
                variantTypeArray[index] = binding.variantType.baseOrdinal
                nativeCoreTypeMap.remove(binding.ptr)
            }.clear()

        unrefNativeCoreTypes(pointerArray, variantTypeArray)
    }

    fun cleanUp() {
        for (callback in cleanupCallbacks) {
            callback.invoke()
        }

        // Get through all remaining [Objects] instances and remove their bindings
        for (obj in ObjectDB.values) {
            releaseBinding(obj.objectID.id)
        }
        ObjectDB.clear()

        val size = nativeCoreTypeMap.size
        if (size > 0) {
            val pointerArray = LongArray(size)
            val variantTypeArray = IntArray(size)

            nativeCoreTypeMap
                .values
                .onEachIndexed { index, binding ->
                    pointerArray[index] = binding.ptr
                    variantTypeArray[index] = binding.variantType.baseOrdinal
                }.clear()

            unrefNativeCoreTypes(pointerArray, variantTypeArray)
        }

        stringNameCache.values.clear()
        nodePathCache.values.clear()
        nativeCoreTypeMap.clear()
    }

    external fun getSingleton(classIndex: Int)
    external fun createNativeObject(classIndex: Int, instance: KtObject, scriptIndex: Int)
    external fun checkInstance(ptr: VoidPtr, instanceId: Long): Boolean
    external fun releaseBinding(instanceId: Long)
    external fun freeObject(rawPtr: VoidPtr)
    external fun unrefNativeCoreTypes(pointerArray: LongArray, variantTypeArray: IntArray)
    external fun querySync()
}
