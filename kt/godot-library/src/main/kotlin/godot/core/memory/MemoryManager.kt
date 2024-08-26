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
import sun.swing.MenuItemLayoutHelper.max
import java.lang.ref.ReferenceQueue
import java.util.concurrent.ConcurrentHashMap

internal object MemoryManager {
    /** Number of references to decrement each loop at most (Doesn't have priority of the ratio)*/
    private const val MAX_GC_NUMBER = 64

    /** The fraction of references to check each loop at least (chosen so everything is freed after 1 second at most, assuming a 60 fps game)*/
    private const val MIN_GC_RATIO = 1f / 60f

    /** Maximum size of the objectDB, Godot shouldn't provide index higher than this.*/
    private const val OBJECTDB_SIZE = 1 shl ObjectID.OBJECTDB_SLOT_MAX_COUNT_BITS

    /** Pointers to Godot objects.*/
    private val ObjectDB = Array<GodotNativeEntry?>(OBJECTDB_SIZE) { null }

    /** Pointers to NativeCoreType.*/
    private val nativeCoreTypeMap = ConcurrentHashMap<VoidPtr, NativeCoreWeakReference>(256)

    /** Queues so we are notified when the GC runs on References.*/
    private val refReferenceQueue = ReferenceQueue<GodotBinding>()

    /** Queues so we are notified when the GC runs on NativeCoreTypes.*/
    private val nativeReferenceQueue = ReferenceQueue<NativeCoreType>()

    /** List of references to decrement*/
    private var decrementList = mutableListOf<VoidPtr>(256)

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

        synchronized(ObjectDB) {
            for (id in freedObjects) {
                val objectID = ObjectID(id)
                val index = objectID.index
                val ref = ObjectDB[objectID.index]
                if (ref != null && ref.objectID.id == objectID.id) {
                    ObjectDB[index] = null
                }
            }
        }

        // Pool all dead references first so we can know the amount of work to do.
        while (true) {
            val ref = ((refReferenceQueue.poll() ?: break) as GodotRefCountedEntry)
            decrementList.add(ref.objectID.id)
        }
        val numberToDecrement = max(MAX_GC_NUMBER, (MIN_GC_RATIO * decrementList.size).toInt())

        return synchronized(ObjectDB) {
            decrementList
                .take(numberToDecrement)
                .filter {
                    val index = ObjectID(it).index
                    val otherRef = ObjectDB[index]!!
                    //Check if the RefCounted instance has been sent back to the JVM. We don't decrement in this case.
                    otherRef.binding == null || it != otherRef.objectID.id
                }
                .onEach { ObjectDB[ObjectID(it).index] = null }
        }
            .toLongArray()
            .also {
                decrementList = decrementList.drop(it.size).toMutableList()
            }
    }


    private fun removeNativeCoreTypes(): Boolean {
        var isActive = false
        var counter = 0

        // Same as before for NativeCoreTypes
        while (counter < MAX_GC_NUMBER) {
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
            if (ref.objectID.isReference) {
                decrementRefCounter(ref.objectID.id)
            }
        }
        ObjectDB.fill(null)
        stringNameCache.clear()
        nodePathCache.clear()
    }

    private external fun checkInstance(ptr: VoidPtr, instanceId: Long): Boolean
    private external fun decrementRefCounter(instanceId: Long)
    private external fun unrefNativeCoreType(ptr: VoidPtr, variantType: Int): Boolean
}
