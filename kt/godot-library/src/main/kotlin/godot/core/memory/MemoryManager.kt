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
import godot.util.warning
import java.lang.ref.ReferenceQueue
import java.time.Duration
import java.time.Instant
import java.util.concurrent.ConcurrentHashMap

internal object MemoryManager {
    /** Number of references to check each loop.*/
    private const val CHECK_NUMBER = 256

    /** Maximum size of the objectDB, Godot shouldn't provide index higher than this.*/
    private const val OBJECTDB_SIZE = 1 shl ObjectID.OBJECTDB_SLOT_MAX_COUNT_BITS

    /** Pointers to Godot objects.*/
    private val ObjectDB = Array<GodotNativeEntry?>(OBJECTDB_SIZE) { null }

    /** Pointers to NativeCoreType.*/
    private val nativeCoreTypeMap = ConcurrentHashMap<VoidPtr, NativeCoreWeakReference>(CHECK_NUMBER)

    /** Queues so we are notified when the GC runs on References.*/
    private val refReferenceQueue = ReferenceQueue<GodotBinding>()

    /** Queues so we are notified when the GC runs on NativeCoreTypes.*/
    private val nativeReferenceQueue = ReferenceQueue<NativeCoreType>()

    /** List of element to remove from ObjectDB*/
    private val deleteList = ArrayList<GodotNativeEntry>(CHECK_NUMBER)


    // Not private because accessed by engine.
    @Suppress("MemberVisibilityCanBePrivate")
    var shouldDisplayLeakInstancesOnClose = true

    // A basic LRU cache.
    private class LRUCache<K, V>(private val capacity: Int) : LinkedHashMap<K, V>(capacity, 0.75f, true) {
        override fun removeEldestEntry(eldest: MutableMap.MutableEntry<K, V>?): Boolean {
            return size > capacity
        }
    }

    // Create an LRU cache for StringName and NodePath objects based on a String key.
    // TODO: Set the initial capacity from the command line.
    private val stringNameCache = LRUCache<String, StringName>(256)
    private val nodePathCache = LRUCache<String, NodePath>(256)

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

    fun registerObject(instance: KtObject): GodotBinding {
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

    private fun syncMemory(freedObjects: LongArray) {
        synchronized(ObjectDB) {
            for(id in freedObjects) {
                val objectID = ObjectID(id)
                val index = objectID.index
                val ref = ObjectDB[objectID.index]
                if (ref != null && ref.objectID.id == objectID.id) {
                    ObjectDB[index] = null
                }
            }
        }

        removeNativeCoreTypes()
    }

    /**
     * Remove the [KtObject] references that have died.
     * Decrement counter of [RefCounted] in the process.
     * @return True if something has been removed.
     */
    private fun removeObjectsAndDecrementCounter(): Boolean {
        var isActive = false
        var counter = 0

        //We poll the reference that have been clear by the GC and then call c++ code to destroy the native object.
        synchronized(ObjectDB) {
            while (counter < CHECK_NUMBER) {
                val ref = ((refReferenceQueue.poll() ?: break) as GodotRefCountedEntry)
                val index = ref.objectID.index
                val otherRef = ObjectDB[index]
                //Check if the ref in the DB hasn't been replaced by a new object before the GC could remove it.
                if (otherRef === ref) {
                    ObjectDB[index] = null
                }
                deleteList.add(ref)
                isActive = true
                counter++
            }
        }

        // We let cpp destroy the references in `deleteList`
        for (ref in deleteList) {
            if (ref.objectID.isReference) {
                decrementRefCounter(ref.objectID.id)
            }
        }

        deleteList.clear()
        return isActive
    }

    /**
     * Remove dead [NativeCoreType] from memory
     * @return True if something has been removed.
     */
    private fun removeNativeCoreTypes(): Boolean {
        var isActive = false
        var counter = 0

        // Same as before for NativeCoreTypes
        while (counter < CHECK_NUMBER) {
            val ref = (nativeReferenceQueue.poll() ?: break) as NativeCoreWeakReference
            if (unrefNativeCoreType(ref.ptr, ref.variantType.baseOrdinal)) {
                nativeCoreTypeMap.remove(ref.ptr)
                isActive = true
            }
            counter++
        }
        return isActive
    }

    @Suppress("unused")
    fun cleanUp() {

        // Get through all remaining [RefCounted] instance and decrement their pointers.
        for (ref in ObjectDB.filterNotNull()) {
            if(ref.objectID.isReference) {
                decrementRefCounter(ref.objectID.id)
            }
        }
        ObjectDB.fill(null)
        stringNameCache.clear()
        nodePathCache.clear()

        var begin = Instant.now()
        while (nativeCoreTypeMap.isNotEmpty()) {

            System.gc()
            if (removeObjectsAndDecrementCounter() || removeNativeCoreTypes()) {
                begin = Instant.now()
            }

            val finish = Instant.now()
            if (Duration.between(begin, finish).toMillis() > 5000) {
                warning(
                    buildString {
                        appendLine("Some JVM godot instances are leaked.")
                        if (shouldDisplayLeakInstancesOnClose) {
                            appendLine("${nativeCoreTypeMap.size} Leaked native core types:")
                            for (entry in nativeCoreTypeMap) {
                                append("    ${entry.key}: ${entry.value.get()}")
                                append(System.lineSeparator())
                            }
                        }
                    }
                )
                break
            }
        }
    }

    private external fun checkInstance(ptr: VoidPtr, instanceId: Long): Boolean
    private external fun decrementRefCounter(instanceId: Long)
    private external fun unrefNativeCoreType(ptr: VoidPtr, variantType: Int): Boolean
}
