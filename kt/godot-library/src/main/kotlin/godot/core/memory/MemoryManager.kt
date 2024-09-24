@file:Suppress("unused")

package godot.core.memory

import godot.core.KtObject
import godot.core.NativeCoreType
import godot.core.NodePath
import godot.core.ObjectID
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantParser
import godot.tools.common.extensions.convertToSnakeCase
import godot.util.LRUCache
import godot.util.VoidPtr
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.locks.ReentrantReadWriteLock
import kotlin.concurrent.read
import kotlin.concurrent.write
import kotlin.math.max
import kotlin.math.roundToInt

internal object MemoryManager {

    /** With those constants, the manager can handle up to 30_000 items at once in the allowed time.
     *  You can compute the number of iterations it takes to process everything with the following formula:
     * ```
     * -(MAX_ITERATION / DECAY_FACTOR) × (
     *     ln(
     *         (MAX_GC_NUMBER × MAX_ITERATION) / (size × DECAY_FACTOR)
     *     ) - 1
     * )
     * ```
     * */
    private object Configuration {
        /** Number of references to decrement each loop on a light load (Doesn't have priority over the ratio).*/
        private const val MAX_GC_NUMBER = 64f

        /** The maximum amount of iteration it should take for a binding to be processed by the Manager in case of heavy load.*/
        private const val MAX_ITERATION = 60f

        /** The processing of queues follows an exponential decay. This number is the result of `ln(0.01)`.
         * It means that 99% of the queue will be processed by the time the max number of iterations is reached.
         */
        private const val DECAY_FACTOR = 4.6051702f

        /**
         * The only variable available is the current size of the queue. We want to make sure everything is processed in time.
         * We can't simply process `1f/MAX_ITERATION` items when under load. Because of the exponential decay, it would take much longer than `MAX_ITERATION`.
         * We increase the ratio enough that 99% of the queue can be processed in the allowed time.
         * In practice when the number of items in the queue becomes small enough, `MAX_GC_NUMBER` will take over and handle the remaining 1% in time.
         * This is a finite approximation of the function ```f(x) = size * exp(-x * DECAY_FACTOR / MAX_ITERATION)```
         */
        fun getNumberOfItemsToProcess(size: Int) = max(MAX_GC_NUMBER, size * (DECAY_FACTOR / MAX_ITERATION))
            .roundToInt()
            .coerceAtMost(size)
    }

    /** Base capacity for caches.*/
    private const val CACHE_INITIAL_CAPACITY = 512

    /** Base capacity for several binding containers.*/
    private const val BINDING_INITIAL_CAPACITY = 4096

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

    /**
     * Take a CamelCase String and return a snakeCase version of it as a StringName, used internally for methods and property names
     */
    fun getOrCreateGodotName(key: String): StringName {
        return synchronized(stringNameCache) {
            stringNameCache.getOrPut(key) {
                // Cache miss, so create and return new instance.
                StringName(key.convertToSnakeCase())
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

    /**
     * Directly remove the object from the ObjectDB, the caller has now the responsibility of deleting the object itself.
     */
    fun deleteObject(id: Long): Unit = lock.write {
        ObjectDB.remove(ObjectID(id))
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

    fun registerNativeCoreType(nativeCoreType: NativeCoreType, variantType: VariantParser) {
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

        val numberToDecrement = Configuration.getNumberOfItemsToProcess(deadReferences.size)
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
                - If the binding is not in the objectDB, it means it has been queued or deleted already, we don't need to queue it again.
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

        val numberToDecrement = Configuration.getNumberOfItemsToProcess(deadNativeCores.size)
        val pointerArray = LongArray(numberToDecrement)
        val variantTypeArray = IntArray(numberToDecrement)

        deadNativeCores
            .subList(0, numberToDecrement)
            .onEachIndexed { index, binding ->
                pointerArray[index] = binding.ptr
                variantTypeArray[index] = binding.variantType.id
                nativeCoreTypeMap.remove(binding.ptr)
            }.clear()

        unrefNativeCoreTypes(pointerArray, variantTypeArray)
    }

    fun cleanUp() {
        for (callback in cleanupCallbacks) {
            callback.invoke()
        }

        // Get through all remaining [Objects] instances and remove their bindings
        for (objectID in ObjectDB.keys) {
            releaseBinding(objectID.id)
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
                    variantTypeArray[index] = binding.variantType.id
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
