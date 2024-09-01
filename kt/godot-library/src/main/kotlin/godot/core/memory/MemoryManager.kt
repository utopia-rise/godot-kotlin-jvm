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
import java.util.concurrent.ConcurrentHashMap
import kotlin.math.max
import kotlin.math.min

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
    private val ObjectDB = arrayOfNulls<GodotNativeEntry?>(OBJECTDB_SIZE)

    /** Queues so we are notified when the GC runs on References.*/
    private val refReferenceQueue = ReferenceQueue<GodotBinding>()

    /** List of references to decrement.*/
    private val deadReferences = mutableListOf<GodotRefCountedEntry>()

    /** Pointers to NativeCoreType.*/
    private val nativeCoreTypeMap = ConcurrentHashMap<VoidPtr, NativeCoreWeakReference>(INITIAL_CAPACITY)

    /** Queues so we are notified when the GC runs on NativeCoreTypes.*/
    private val nativeReferenceQueue = ReferenceQueue<NativeCoreType>()

    /** List of references to decrement.*/
    private val deadNativeCores = mutableListOf<NativeCoreWeakReference>()

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

    fun removeScriptInstance(id: Long) {
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
     * The GC happening in waves, not everything is processed at once, we process the dead references over several frames when necessary.
     */
    private fun getDeadReferences(): LongArray {
        // Pool all dead references first, so we can know the amount of work to do.
        while (true) {
            val ref = ((refReferenceQueue.poll() ?: break) as GodotRefCountedEntry)
            deadReferences.add(ref)
        }

        val size = deadReferences.size
        val numberToDecrement = max(
            min(MAX_GC_NUMBER, size),
            (MIN_GC_RATIO * size).toInt()
        )

        val sublist = deadReferences.subList(0, numberToDecrement)

        return synchronized(ObjectDB) {
            deadReferences.filter {
                val objectID = it.objectID
                val index = objectID.index
                val otherRef = ObjectDB[index]

                /** This part requires caution. We have to make sure it's safe to decrement the counter of this instance.

                Note that the state of the entry in the ObjectDB at this point in time can be several things:
                - Not null with its weak reference still valid.
                - Not null but its weak reference got GCed.
                - Null

                In the first 2 cases, the not null reference can belong to a different native object.

                Here the different interpretations we can have:
                - If the dead entry is the same (===) as the one in the ObjectDB, it means it hasn't been replaced yet and is safe to decrement.
                - If the entry in the objectDB is null, it means it has been queued already, we don't need to queue it again.
                it can happen if 2 or more wrappers for the same RefCounted are created and GCed between 2 memory syncs.
                - If the entry in the objectDB is a different one but has the same object ID, it means the wrapper has been replaced (the previous one died, but Godot sent to the JVM again), we don't queue it.
                - If the entry in the objectDB is a different one but hasn't the same object ID, it means the original objects has already been deleted, and we shouldn't queue it.
                It can happen if several wrappers have been created but GCed out of order in different phases (in the context of a script removal for example).

                Only the identity test is necessary because that the only case that allows for decrement, all others 3 possibilities don't pass.
                 **/
                val decrement = it === otherRef
                if (decrement) {
                    ObjectDB[index] = null
                }
                decrement
            }
        }
            .map { it.objectID.id }
            .toLongArray()
            .also {
                sublist.clear()
            }
    }

    /**
     * Remove dead [NativeCoreType] from native memory.
     * The GC happening in waves, not everything is processed at once, we process the dead native cores over several frames when necessary.
     */
    private fun removeNativeCoreTypes() {
        // Pool all dead native cores first, so we can know the amount of work to do.
        while (true) {
            val ref = ((nativeReferenceQueue.poll() ?: break) as NativeCoreWeakReference)
            deadNativeCores.add(ref)
        }

        val size = deadNativeCores.size
        val numberToDecrement = max(
            min(MAX_GC_NUMBER, size),
            (MIN_GC_RATIO * size).toInt()
        )

        deadNativeCores.subList(0, numberToDecrement).onEach {
            if (unrefNativeCoreType(it.ptr, it.variantType.baseOrdinal)) {
                nativeCoreTypeMap.remove(it.ptr)
            }
        }.clear()
    }

    fun cleanUp() {
        for (callback in cleanupCallbacks) {
            callback.invoke()
        }

        // Get through all remaining [Objects] instances and remove their bindings
        for (ref in ObjectDB.filterNotNull()) {
            releaseBinding(ref.objectID.id)
        }
        ObjectDB.fill(null)

        nativeCoreTypeMap.values.forEach {
            unrefNativeCoreType(it.ptr, it.variantType.baseOrdinal)
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
    external fun unrefNativeCoreType(ptr: VoidPtr, variantType: Int): Boolean
    external fun querySync()
}
