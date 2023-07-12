package godot.core.memory

import godot.core.KtObject
import godot.core.NativeCoreType
import godot.core.ObjectID
import godot.core.VariantType
import godot.util.VoidPtr
import godot.util.info
import godot.util.warning
import java.lang.ref.ReferenceQueue
import java.lang.ref.WeakReference
import java.time.Duration
import java.time.Instant
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import kotlin.math.min

internal object MemoryManager {

    /** Minimum time before 2 iterations of the thread.*/
    private const val MIN_DELAY = 0L

    /** Maximum time before 2 iterations of the thread.*/
    private const val MAX_DELAY = 2000L

    /** The delay between iterations can be increased or decreased by this value.*/
    private const val INC_DELAY = 100L

    /** Current time between 2 iterations of the thread. */
    private var current_delay = (MIN_DELAY + MAX_DELAY) / 2L

    /** Number of references to check each loop.*/
    private const val CHECK_NUMBER = 256

    /** Maximum size of the objectDB, Godot shouldn't provide index higher than this.*/
    private const val OBJECTDB_SIZE = 1 shl ObjectID.OBJECTDB_SLOT_MAX_COUNT_BITS

    /** Pointers to Godot objects.*/
    private val ObjectDB = Array<GodotWeakRef?>(OBJECTDB_SIZE) { null }

    /** Indexes of singletons in [ObjectDB] */
    private val singletonIndexes = mutableListOf<Int>()

    /** Pointers to NativeCoreType.*/
    private val nativeCoreTypeMap = ConcurrentHashMap<VoidPtr, NativeCoreWeakReference>(CHECK_NUMBER)

    /** Queue of objects that need to be bound to native objects*/
    private val bindingQueue = ArrayDeque<GodotBinding>()

    /**
     * Queue of objects which will to be bound to native objects in a given iteration.
     *
     * At the start of a garbage collection iteration. The objects from the [bindingQueue] are copied into this list in order to spend as little time as possible in a `synchonized` block. Later we loop through this list to actually bind the objects.
     */
    private val bindingList = ArrayList<GodotBinding>(CHECK_NUMBER)

    /** Queues so we are notified when the GC runs on References.*/
    private val refReferenceQueue = ReferenceQueue<GodotBinding>()

    /** List of element to remove from ObjectDB*/
    private val deleteList = ArrayList<GodotWeakRef>(CHECK_NUMBER)

    /** Queues so we are notified when the GC runs on NativeCoreTypes.*/
    private val nativeReferenceQueue = ReferenceQueue<NativeCoreType>()

    /** Holds the instances to clean up when the JVM stops.*/
    private var staticInstances = mutableSetOf<GodotStatic>()

    private val executor = Executors.newSingleThreadScheduledExecutor()

    private var forceJvmGarbageCollector = false

    // Not private because accessed by engine.
    @Suppress("MemberVisibilityCanBePrivate")
    var shouldDisplayLeakInstancesOnClose = true

    private var gcState = GCState.NONE

    @Suppress("unused")
    val isClosed: Boolean
        get() = gcState == GCState.CLOSED

    fun registerObject(instance: KtObject): GodotBinding {
        synchronized(ObjectDB) {
            val id = instance.id
            val binding = getBinding(id.id)
            return if (binding == null) {
                GodotBinding().also {
                    it.wrapper = instance
                    ObjectDB[id.index] = GodotWeakRef(it, refReferenceQueue, instance.id)
                    bindingQueue.addLast(it)
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
                    ObjectDB[id.index] = GodotWeakRef(it, refReferenceQueue, instance.id)
                    bindingQueue.addLast(it)
                }
            } else {
                binding.scriptInstance = instance
                binding
            }
        }
    }

    fun unregisterScriptInstance(id: Long) {
        synchronized(ObjectDB) {
            val index = ObjectID(id).index
            ObjectDB[index]?.get()?.scriptInstance == null
        }
    }

    fun registerSingleton(instance: KtObject): GodotBinding {
        synchronized(ObjectDB) {
            val index = instance.id.index
            return GodotBinding().also {
                it.wrapper = instance
                ObjectDB[index] = GodotWeakRef(it, refReferenceQueue, instance.id)
                singletonIndexes.add(index)
                bindingQueue.addLast(it)
            }
        }
    }

    fun registerNativeCoreType(nativeCoreType: NativeCoreType, variantType: VariantType) {
        val rawPtr = nativeCoreType._handle
        nativeCoreTypeMap[rawPtr] = NativeCoreWeakReference(nativeCoreType, nativeReferenceQueue, variantType)
    }

    fun registerStatic(instance: GodotStatic) {
        staticInstances.add(instance)
    }

    fun getInstance(id: Long): KtObject? {
        return getBinding(id)?.value
    }

    private fun getBinding(id: Long): GodotBinding? {
        val objectID = ObjectID(id)
        val ref = ObjectDB[objectID.index]
        if (ref != null && ref.id.id == objectID.id) {
            return ref.get()
        }
        return null
    }

    fun getNativeCoreTypeInstance(ptr: VoidPtr): NativeCoreType? {
        return nativeCoreTypeMap[ptr]?.get()
    }

    fun isInstanceValid(ktObject: KtObject) = MemoryBridge.checkInstance(ktObject.rawPtr, ktObject.id.id)

    fun start(forceJvmGarbageCollector: Boolean) {
        MemoryManager.forceJvmGarbageCollector = forceJvmGarbageCollector
        gcState = GCState.STARTED
        info("Starting GC thread")
        executor.schedule(MemoryManager::run, 0, TimeUnit.MILLISECONDS)
    }

    private fun run() {
        while (gcState == GCState.STARTED) {
            if (forceJvmGarbageCollector) {
                forceJvmGc()
            }
            val isActive = bindNewObjects() || removeObjectsAndDecrementCounter() || removeNativeCoreTypes()

            if (isActive) {
                current_delay -= INC_DELAY
                current_delay = current_delay.coerceAtLeast(MIN_DELAY)
            } else {
                current_delay += INC_DELAY
                current_delay = current_delay.coerceAtMost(MAX_DELAY)
            }

            if (current_delay > 0L) {
                Thread.sleep(current_delay)
            }
        }
        gcState = GCState.CLOSED
    }

    /**
     * Binding a newly created KtObject by setting itself in the c++ binding.
     * @return True if a binding has been set.
     */
    private fun bindNewObjects(): Boolean {
        var isActive = false
        var counter = 0

        //Objects in that list don't have a binding yet so we call c++ code to set it
        synchronized(ObjectDB) {
            //In a synchronized block to copy the content into another list so we spend as little time time as possible blocking access to `ObjectDB`.
            val size = min(bindingQueue.size, CHECK_NUMBER)
            while (counter < size) {
                bindingList.add(bindingQueue.removeFirst())
                counter++
            }
        }

        for (ref in bindingList) {
            MemoryBridge.bindInstance(ref.value.id.id, ref, ref::class.java.classLoader)
            isActive = true
        }
        bindingList.clear()
        return isActive
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
                val ref = ((refReferenceQueue.poll() ?: break) as GodotWeakRef)
                val index = ref.id.index
                val otherRef = ObjectDB[index]
                //Check if the ref in the DB hasn't been replaced by a new object before the GC could remove it.
                if (otherRef == ref) {
                    ObjectDB[index] = null
                }
                deleteList.add(ref)
                isActive = true
                counter++
            }
        }

        // We let cpp destroy the references in `deleteList`
        for (ref in deleteList) {
            if (ref.id.isReference) {
                MemoryBridge.decrementRefCounter(ref.id.id)
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
            if (MemoryBridge.unrefNativeCoreType(ref.ptr, ref.variantType.baseOrdinal)) {
                nativeCoreTypeMap.remove(ref.ptr)
                isActive = true
            }
            counter++
        }
        return isActive
    }

    fun close() {
        info("Closing GC thread")
        gcState = GCState.CLOSING
        executor.shutdown()
        executor.awaitTermination(5000, TimeUnit.MILLISECONDS)
    }

    @Suppress("unused")
    fun cleanUp() {
        for (singletonIndex in singletonIndexes) {
            ObjectDB[singletonIndex] = null
        }

        while (staticInstances.size > 0) {
            val iterator = staticInstances.iterator()
            staticInstances = mutableSetOf()
            for (instance in iterator) {
                instance.collect()
            }
        }

        var begin = Instant.now()
        while (ObjectDB.any { it != null } || nativeCoreTypeMap.isNotEmpty()) {

            forceJvmGc()
            if (bindNewObjects() || removeObjectsAndDecrementCounter() || removeNativeCoreTypes()) {
                begin = Instant.now()
            }

            val finish = Instant.now()
            if (Duration.between(begin, finish).toMillis() > 5000) {
                warning(
                    buildString {
                        appendLine("Some JVM godot instances are leaked.")
                        if (shouldDisplayLeakInstancesOnClose) {
                            appendLine("Leaked Objects:")
                            for (entry in ObjectDB) {
                                if (entry != null) {
                                    append("    ${entry.get()}")
                                    append(System.lineSeparator())
                                }
                            }
                            appendLine("Leaked native core types:")
                            for (entry in nativeCoreTypeMap) {
                                append("    ${entry.key}: ${entry.value.get()}")
                                append(System.lineSeparator())
                            }
                        }
                    }
                )
                MemoryBridge.notifyLeak()
                break
            }
        }
    }

    /**
     * Force JVM garbage collector to run
     */
    private fun forceJvmGc() {
        var any: Any? = Any()
        val wkRef = WeakReference(any)
        @Suppress("UNUSED_VALUE")
        any = null
        while (wkRef.get() != null) {
            System.gc()
        }
    }

    private object MemoryBridge {
        external fun checkInstance(ptr: VoidPtr, instanceId: Long): Boolean
        external fun bindInstance(instanceId: Long, obj: GodotBinding, classLoader: ClassLoader)
        external fun decrementRefCounter(instanceId: Long)
        external fun unrefNativeCoreType(ptr: VoidPtr, variantType: Int): Boolean
        external fun notifyLeak()
    }

    private enum class GCState {
        NONE,
        STARTED,
        CLOSING,
        CLOSED
    }

}
