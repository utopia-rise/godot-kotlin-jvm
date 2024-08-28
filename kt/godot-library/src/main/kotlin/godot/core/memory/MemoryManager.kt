@file:Suppress("unused")

package godot.core.memory

import godot.core.KtObject
import godot.core.NativeCoreType
import godot.core.NodePath
import godot.core.ObjectID
import godot.core.StringName
import godot.core.VariantType
import godot.core.memory.binding.GodotBinding
import godot.core.memory.binding.GodotNativeEntry
import godot.core.memory.binding.GodotRefCountedEntry
import godot.util.VoidPtr
import java.lang.ref.ReferenceQueue
import java.lang.ref.WeakReference
import java.util.concurrent.ConcurrentHashMap
import kotlin.math.max

internal object MemoryManager {
    /** Base capacity for several containers within the manager.*/
    private const val INITIAL_CAPACITY = 256

    /** Number of references to decrement each loop at most (Doesn't have priority over the ratio).*/
    private const val MAX_GC_NUMBER = 64

    /** The fraction of references to check each loop at least (chosen so everything is freed after 1 second at most, assuming a 60 fps game).*/
    private const val MIN_GC_RATIO = 1f / 60f

    /** Maximum size of the objectDB, Godot shouldn't provide index higher than this.*/
    private const val OBJECTDB_SIZE = 1 shl ObjectID.OBJECTDB_SLOT_MAX_COUNT_BITS

    /** Pointers to Godot objects.*/
    private val ObjectDB = Array<GodotNativeEntry?>(OBJECTDB_SIZE) { null }

    /** Queues so we are notified when the GC runs on References.*/
    private val refReferenceQueue = ReferenceQueue<GodotBinding>()

    /** List of references to decrement.*/
    private var deadReferences = mutableListOf<VoidPtr>()

    /** Pointers to NativeCoreType.*/
    private val nativeCoreTypeMap = ConcurrentHashMap<VoidPtr, NativeCoreWeakReference>(INITIAL_CAPACITY)

    /** Queues so we are notified when the GC runs on NativeCoreTypes.*/
    private val nativeReferenceQueue = ReferenceQueue<NativeCoreType>()

    /** List of references to decrement.*/
    private var deadNativeCores = mutableListOf<NativeCoreWeakReference>()

    /** List of cleanup callbacks. When the game closes, they will be called.*/
    private var cleanupCallbacks = mutableListOf<() -> Unit>()

    // A basic LRU cache.
    private class LRUCache<K, V>(private val capacity: Int) : LinkedHashMap<K, V>(capacity, 0.75f, true) {
        override fun removeEldestEntry(eldest: MutableMap.MutableEntry<K, V>?): Boolean {
            return size > capacity
        }
    }

    // Create an LRU cache for StringName and NodePath objects based on a String key.
    // TODO: Set the initial capacity from the command line.
    private val stringNameCache = LRUCache<String, StringName>(INITIAL_CAPACITY)
    private val nodePathCache = LRUCache<String, NodePath>(INITIAL_CAPACITY)

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

    fun registerWrapper(instance: KtObject): GodotBinding {
        synchronized(ObjectDB) {
            val id = instance.id
            val binding = getBinding(id.id)
            return if (binding == null) {
                GodotBinding().also {
                    it.wrapper = instance
                    ObjectDB[id.index] = GodotNativeEntry.create(it, refReferenceQueue)
                }
            } else {
                binding.wrapper = instance
                binding
            }
        }
    }

    fun registerScriptInstance(instance: KtObject): GodotBinding {
        synchronized(ObjectDB) {
            val id = instance.id
            val binding = getBinding(id.id)
            return if (binding == null) {
                GodotBinding().also {
                    it.scriptInstance = instance
                    ObjectDB[id.index] = GodotNativeEntry.create(it, refReferenceQueue)
                }
            } else {
                binding.scriptInstance = instance
                binding
            }
        }
    }

    fun unregisterScriptInstance(id: Long) {
        synchronized(ObjectDB) {
            getBinding(id)?.scriptInstance = null
        }
    }

    fun registerNativeCoreType(nativeCoreType: NativeCoreType, variantType: VariantType) {
        val rawPtr = nativeCoreType._handle
        nativeCoreTypeMap[rawPtr] = NativeCoreWeakReference(nativeCoreType, nativeReferenceQueue, variantType)
    }


    fun getInstance(id: Long): KtObject? {
        synchronized(ObjectDB) {
            return getBinding(id)?.value
        }
    }

    private fun getBinding(id: Long): GodotBinding? {
        val objectID = ObjectID(id)
        val ref = ObjectDB[objectID.index]
        if (ref != null && ref.objectID.id == objectID.id) {
            return ref.binding
        }
        return null
    }

    fun isInstanceValid(ktObject: KtObject) = checkInstance(ktObject.rawPtr, ktObject.id.id)


    private fun syncMemory(freedObjects: LongArray): LongArray {
        removeNativeCoreTypes()
        removeDeadObjects(freedObjects)
        return getDeadReferences()
    }

    /**
     * Remove the now dead native Object from the JVM ObjectDB.
     */
    private fun removeDeadObjects(freedObjects: LongArray) = synchronized(ObjectDB) {
        for (id in freedObjects) {
            val objectID = ObjectID(id)
            val index = objectID.index
            val ref = ObjectDB[objectID.index]
            if (ref != null && ref.objectID.id == objectID.id) {
                // The index could have been taken by a newly created object, we check before it was are about to remove the correct one.
                ObjectDB[index] = null
            }
        }
    }

    /**
     * Get a LongArray containing a collection of dead references that have to be decremented on the native side.
     * The GC happening in waves, not everything is obtained at once, we process the dead references over several frames when necessary.
     */
    private fun getDeadReferences(): LongArray {
        // Pool all dead references first, so we can know the amount of work to do.
        while (true) {
            val ref = ((refReferenceQueue.poll() ?: break) as GodotRefCountedEntry)
            deadReferences.add(ref.objectID.id)
        }
        val numberToDecrement = max(MAX_GC_NUMBER, (MIN_GC_RATIO * deadReferences.size).toInt())

        return synchronized(ObjectDB) {
            deadReferences
                .take(numberToDecrement)
                .filter {
                    val index = ObjectID(it).index
                    val otherRef = ObjectDB[index]!!
                    //Check if the RefCounted instance has been sent back to the JVM. We don't decrement in this case.
                    //We don't need to check if it's the same ObjectID, we didn't decrement yet, so it's impossible for it to have been replaced by a new object.
                    otherRef.binding == null
                }.onEach {
                    ObjectDB[ObjectID(it).index] = null
                }
        }
            .toLongArray()
            .also {
                deadReferences = deadReferences.drop(it.size).toMutableList()
            }
    }

    /**
     * Remove dead [NativeCoreType] from native memory.
     * The GC happening in waves, not everything is obtained at once, we process the dead native cores over several frames when necessary.
     */
    private fun removeNativeCoreTypes() {
        // Pool all dead native cores first, so we can know the amount of work to do.
        while (true) {
            val ref = ((nativeReferenceQueue.poll() ?: break) as NativeCoreWeakReference)
            deadNativeCores.add(ref)
        }
        val numberToDecrement = max(MAX_GC_NUMBER, (MIN_GC_RATIO * deadReferences.size).toInt())

        deadNativeCores
            .take(numberToDecrement)
            .onEach {
                if (unrefNativeCoreType(it.ptr, it.variantType.baseOrdinal)) {
                    nativeCoreTypeMap.remove(it.ptr)
                }
            }
        deadNativeCores = deadNativeCores.drop(numberToDecrement).toMutableList()
    }

    fun preCleanup() {
        for (callback in cleanupCallbacks) {
            callback.invoke()
        }

        // Get through all remaining [Object] and remove them from the ObjectDB. It will remove all singletons.
        for (ref in ObjectDB.filterNotNull().filter { !it.objectID.isReference }) {
            ObjectDB[ref.objectID.index] = null
        }
    }

    fun checkCleanup(): Boolean {
        if (ObjectDB.any { it != null } && nativeCoreTypeMap.isNotEmpty()) {
            // Still work to do so we force the gc
            var any: Any? = Any()
            val wkRef = WeakReference(any)
            @Suppress("UNUSED_VALUE")
            any = null
            while (wkRef.get() != null) {
                System.gc()
            }
            return false
        }

        return true
    }

    fun postCleanup() {
        // Get through all remaining [RefCounted] instances and decrement their pointers.
        for (ref in ObjectDB.filterNotNull().filter { it.objectID.isReference }) {
            decrementRefCounter(ref.objectID.id)
        }
        ObjectDB.fill(null)

        stringNameCache.values.onEach {
            unrefNativeCoreType(it._handle, VariantType.STRING_NAME.baseOrdinal)
        }.clear()

        nodePathCache.values.onEach {
            unrefNativeCoreType(it._handle, VariantType.NODE_PATH.baseOrdinal)
        }.clear()

        nativeCoreTypeMap.clear()
    }

    external fun checkInstance(ptr: VoidPtr, instanceId: Long): Boolean
    external fun decrementRefCounter(instanceId: Long)
    external fun unrefNativeCoreType(ptr: VoidPtr, variantType: Int): Boolean
    external fun manageMemory()
}
