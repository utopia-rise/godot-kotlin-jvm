package godot.core

import godot.core.memory.GodotStatic
import godot.core.memory.IGodotStatic
import godot.core.memory.NativeCoreWeakReference
import godot.core.memory.ReferenceWeakReference
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

object GarbageCollector {

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

    /** Percentage of objects to check each loop.*/
    private const val CHECK_PER_CENT = 0.2f

    /** Index of the last Object checked.*/
    private var current_index = 0

    /** Pointers to Objects.*/
    private val wrappedMap = ConcurrentHashMap<VoidPtr, KtObject>(CHECK_NUMBER)

    /** Pointers to References.*/
    private val refWrappedList = ArrayList<ReferenceWeakReference?>(CHECK_NUMBER)

    /** CurrentSize of the List, so we can grow it a lot chunk instead of one by one */
    private var current_size = CHECK_NUMBER

    /** Pointers to NativeCoreType.*/
    private val nativeCoreTypeMap = ConcurrentHashMap<VoidPtr, NativeCoreWeakReference>(CHECK_NUMBER)

    /** Queues so we are notified when the GC runs on References.*/
    private val refReferenceQueue = ReferenceQueue<KtObject>()

    /** Queues so we are notified when the GC runs on NativeCoreTypes.*/
    private val nativeReferenceQueue = ReferenceQueue<NativeCoreType>()

    /** List of element to remove from RefWrapperList*/
    private val deleteQueue = ArrayList<ReferenceWeakReference>()

    /** List mirroring the content of the Object HashMap.*/
    private var wrapperList: List<Pair<VoidPtr, KtObject>>? = null

    /** Holds the instances to clean up when the JVM stops.*/
    private val staticInstances = mutableSetOf<IGodotStatic>()

    private val executor = Executors.newSingleThreadScheduledExecutor()

    private var forceJvmGarbageCollector = false
    private var shouldDisplayLeakInstancesOnClose = true
    private var isCleanup = false

    private var gcState = GCState.NONE

    val isClosed: Boolean
        get() = gcState == GCState.CLOSED

    fun registerObject(instance: KtObject) {
        val rawPtr = instance.rawPtr
        wrappedMap[rawPtr] = instance
    }

    fun registerReference(instance: KtObject) {
        val index = instance.__id.toInt()
        synchronized(refWrappedList) {
            //It will throw an Exception if the size is too small so we have to grow the list.
            if (refWrappedList.size == index) {
                if (refWrappedList.size == current_size) {
                    current_size *= 2
                    refWrappedList.ensureCapacity(current_size)
                }
                //index is size of the list, this means we can add it at the end of it.
                refWrappedList.add(ReferenceWeakReference(instance, refReferenceQueue, index))
            } else {
                refWrappedList[index] = ReferenceWeakReference(instance, refReferenceQueue, index)
            }
        }
    }

    fun registerNativeCoreType(nativeCoreType: NativeCoreType, variantType: VariantType) {
        val rawPtr = nativeCoreType._handle
        nativeCoreTypeMap[rawPtr] = NativeCoreWeakReference(nativeCoreType, nativeReferenceQueue, variantType)
    }

    fun registerStatic(instance: IGodotStatic) {
        staticInstances.add(instance)
    }

    fun getObjectInstance(ptr: VoidPtr, id: Long): KtObject? {
        val ktObject = wrappedMap[ptr]
        if (ktObject != null) {
            if (id == ktObject.__id) {
                return ktObject
            }
        }
        return null
    }

    fun getRefInstance(index: Int): KtObject? {
        synchronized(refWrappedList) {
            if (refWrappedList.size <= index) {
                //If the list is too small, it means the ref we want is not there yet.
                return null
            }
            val ref = refWrappedList[index]
            val instance = ref?.get()
            if(instance != null){
                ref.counter++
                return instance
            }
            return null
        }
    }

    fun getNativeCoreTypeInstance(ptr: VoidPtr): NativeCoreType? {
        return nativeCoreTypeMap[ptr]?.get()
    }

    fun isInstanceValid(ktObject: KtObject) = MemoryBridge.checkInstance(ktObject.rawPtr, ktObject.__id)

    fun start(forceJvmGarbageCollector: Boolean) {
        this.forceJvmGarbageCollector = forceJvmGarbageCollector
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

        // Check validity of cpp pointer for classic godot Object, if not valid, then remove jvm instance.
        // This binds jvm instance lifecycle to native object's one.
        if (wrapperList == null) {
            //We only create a single List in this block so we don't block the whole map for the duration of the checking
            wrapperList = wrappedMap.toList()
        }

        val size = wrapperList!!.size

        //Number of check is a % of the total list of object, which at least the regular number of check per iteration.
        val limit = (CHECK_PER_CENT * size)
            .toInt()
            .coerceAtLeast(CHECK_NUMBER)
            .coerceAtMost(size - current_index)

        while (counter < limit) {
            val entry = wrapperList!![current_index++]
            if (!MemoryBridge.checkInstance(entry.first, entry.second.__id)) {
                wrappedMap.remove(entry.first)
                isActive = true
            }
            counter++
        }
        if (current_index == size) {
            wrapperList = null
            current_index = 0
        }
        counter = 0

        // A native reference cannot die while a jvm instance exists (because counter > 0). When we don't need the
        // jvm instance anymore, we decrease the counter.
        while (counter < CHECK_NUMBER || isCleanup) {
            val ref = (refReferenceQueue.poll() ?: break) as ReferenceWeakReference
            //We first add the ref to the deleteQueue
            deleteQueue.add(ref)
            isActive = true
            counter++
        }
        synchronized(refWrappedList) {
            //we remove the element from the map
            for (ref in deleteQueue) {
                val otherRef = refWrappedList[ref.index]
                //Check if the ref in the hashmap hasn't been modified by another thread
                if(otherRef == ref){
                    refWrappedList[ref.index] = null
                }
            }
        }

        //Lastly, we call unref after removing elements from the map.
        // We don't want an index to be reused when there is cleaning to do.
        for (ref in deleteQueue) {
            MemoryBridge.unref(ref.ptr, ref.counter)
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
        for (instance in staticInstances) {
            instance.collect()
        }

        isCleanup = true
        var begin = Instant.now()
        while (refWrappedList.any { it != null } || wrappedMap.isNotEmpty() || nativeCoreTypeMap.isNotEmpty()) {

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
                            appendLine("Leaked references:")
                            for (entry in refWrappedList) {
                                if (entry != null) {
                                    append("    ${entry.get()}")
                                    append(System.lineSeparator())
                                }
                            }
                            appendLine("Leaked objects:")
                            for (entry in wrappedMap) {
                                append("    ${entry.key}: ${entry.value}")
                                append(System.lineSeparator())
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
        external fun unref(ptr: VoidPtr, counter: Int): Boolean
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
