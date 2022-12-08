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

internal object GarbageCollector {

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
    private val ObjectDB = Array<GodotWeakReference?>(OBJECTDB_SIZE) { _ -> null }

    /** Pointers to NativeCoreType.*/
    private val nativeCoreTypeMap = ConcurrentHashMap<VoidPtr, NativeCoreWeakReference>(CHECK_NUMBER)

    /** Queues so we are notified when the GC runs on References.*/
    private val refReferenceQueue = ReferenceQueue<KtObject>()

    /** Queues so we are notified when the GC runs on NativeCoreTypes.*/
    private val nativeReferenceQueue = ReferenceQueue<NativeCoreType>()

    /** List of element to remove from ObjectDB*/
    private val deleteQueue = ArrayList<GodotWeakReference>()

    /** Holds the instances to clean up when the JVM stops.*/
    private var staticInstances = mutableSetOf<GodotStatic>()

    private val executor = Executors.newSingleThreadScheduledExecutor()

    private var forceJvmGarbageCollector = false
    private var shouldDisplayLeakInstancesOnClose = true
    private var isCleanup = false

    private var gcState = GCState.NONE

    val isClosed: Boolean
        get() = gcState == GCState.CLOSED

    fun registerObject(instance: KtObject) {
        synchronized(ObjectDB) {
            val index = instance.__id.index
            ObjectDB[index] = GodotWeakReference(instance, refReferenceQueue, instance.__id)
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
        val objectID = ObjectID(id)
        val ktObject = ObjectDB[objectID.index]?.get()
        if (ktObject != null && objectID == ktObject.__id) {
            return ktObject
        }
        return null
    }

    fun getNativeCoreTypeInstance(ptr: VoidPtr): NativeCoreType? {
        return nativeCoreTypeMap[ptr]?.get()
    }

    fun isInstanceValid(ktObject: KtObject) = MemoryBridge.checkInstance(ktObject.rawPtr, ktObject.__id.id)

    fun start(forceJvmGarbageCollector: Boolean) {
        GarbageCollector.forceJvmGarbageCollector = forceJvmGarbageCollector
        gcState = GCState.STARTED
        info("Starting GC thread")
        executor.schedule(GarbageCollector::run, 0, TimeUnit.MILLISECONDS)
    }

    private fun run() {
        while (gcState == GCState.STARTED) {
            if (forceJvmGarbageCollector) {
                forceJvmGc()
            }
            val isActive = checkAndClean()

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
     * Remove the Object pointers that died since the last GC.
     * Decrease the counter of the References and NativeCoreType that are not reachable anymore.
     * @return True if something has been deleted.
     */
    private fun checkAndClean(): Boolean {
        var isActive = false

        var counter = 0
        // A native reference cannot die while a jvm instance exists (because counter > 0). When we don't need the
        // jvm instance anymore, we decrease the counter.
        while (counter < CHECK_NUMBER || isCleanup) {
            val ref = ((refReferenceQueue.poll() ?: break) as GodotWeakReference)
            deleteQueue.add(ref)
            isActive = true
            counter++
        }

        synchronized(ObjectDB) {
            //we remove the element from the array
            for (ref in deleteQueue) {
                val index = ref.id.index
                val otherRef = ObjectDB[index]
                //Check if the ref in the DB hasn't been replaced by a new object before the GC could remove it.
                if (otherRef == ref) {
                    ObjectDB[index] = null
                }
                if(ref.id.isReference) {
                    MemoryBridge.destroyRef(ref.id.id)
                }
            }
        }

        deleteQueue.clear()
        counter = 0
        // Same as before for NativeCoreTypes
        while (counter < CHECK_NUMBER || isCleanup) {
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

    fun cleanUp() {
        while (staticInstances.size > 0) {
            val iterator = staticInstances.iterator()
            staticInstances = mutableSetOf()
            for (instance in iterator) {
                instance.collect()
            }
        }

        isCleanup = true
        var begin = Instant.now()
        while (ObjectDB.any { it != null } || nativeCoreTypeMap.isNotEmpty()) {

            forceJvmGc()
            if (checkAndClean()) {
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
                                append("    ${entry.key}: ${entry.value}")
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
        external fun bindInstance(ptr: VoidPtr, obj: KtObject)
        external fun destroyRef(instanceId: Long)
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
