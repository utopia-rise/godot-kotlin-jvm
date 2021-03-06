package godot.core

import godot.util.VoidPtr
import godot.util.info
import java.lang.ref.ReferenceQueue
import java.lang.ref.WeakReference
import java.time.Duration
import java.time.Instant
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

object GarbageCollector {

    //Handle the rate of the GC
    private const val MIN_DELAY = 100L
    private const val MAX_DELAY = 2000L
    private const val INC_DELAY = 100L
    private var current_delay = 0L

    //Contain the pointer of different Godot types
    private val wrappedMap = mutableMapOf<VoidPtr, KtObject>()

    private val refWrappedMap = mutableMapOf<VoidPtr, WeakReference<KtObject>>()
    private val nativeCoreTypeMap = mutableMapOf<VoidPtr, WeakReference<NativeCoreType>>()

    //Queues so we are notified when the GC runs on references
    private val refReferenceQueue = ReferenceQueue<KtObject>()
    private val nativeReferenceQueue = ReferenceQueue<NativeCoreType>()

    //A list to store the pointer to delete after we iterate the maps(to avoid concurrent modifications)
    private val suppressBuffer = mutableListOf<VoidPtr>()

    //Holds the instance to clean up when the JVM stops.
    private val staticInstances = mutableListOf<GodotStatic>()

    private val executor = Executors.newSingleThreadScheduledExecutor()

    private var forceJvmGarbageCollector = false
    var shouldDisplayLeakInstancesOnClose = true

    private var gcState = GCState.NONE

    val isClosed: Boolean
        get() = gcState == GCState.CLOSED

    fun registerInstance(instance: KtObject, hasRefCountBeenIncremented: Boolean) {
        val rawPtr = instance.rawPtr
        if (instance.____DO_NOT_TOUCH_THIS_isRef____()) {
            synchronized(refWrappedMap) {
                refWrappedMap[rawPtr] = WeakReference(instance, refReferenceQueue)
                if (!hasRefCountBeenIncremented) {
                    MemoryBridge.ref(rawPtr)
                }
            }
        } else {
            synchronized(wrappedMap) {
                wrappedMap[rawPtr] = instance
            }
        }
    }

    fun registerNativeCoreType(nativeCoreType: NativeCoreType) {
        val rawPtr = nativeCoreType._handle
        synchronized(nativeCoreTypeMap) {
            nativeCoreTypeMap[rawPtr] = WeakReference(nativeCoreType, nativeReferenceQueue)
        }
    }

    fun registerStatic(instance: GodotStatic) {
        staticInstances.add(instance)
    }

    fun getObjectInstance(ptr: VoidPtr) = synchronized(wrappedMap) {
        val ktObject = wrappedMap[ptr]
        if (ktObject != null) {
            if (MemoryBridge.checkInstance(ptr, ktObject.godotInstanceId)) ktObject else null
        } else null
    }

    fun getRefInstance(ptr: VoidPtr) = synchronized(refWrappedMap) {
        refWrappedMap[ptr]?.get()
    }

    fun getNativeCoreTypeInstance(ptr: VoidPtr) = synchronized(nativeCoreTypeMap) {
        nativeCoreTypeMap[ptr]?.get()
    }

    internal fun unrefRefInstance(ptr: VoidPtr) {
        MemoryBridge.unref(ptr)
    }

    fun isInstanceValid(ktObject: KtObject) = MemoryBridge.checkInstance(ktObject.rawPtr, ktObject.godotInstanceId)


    fun start(forceJvmGarbageCollector: Boolean, period: Long) {
        this.forceJvmGarbageCollector = forceJvmGarbageCollector
        gcState = GCState.STARTED
        current_delay = period
        executor.schedule(GarbageCollector::run, 0, TimeUnit.MILLISECONDS)
    }

    private fun run() {
        while(gcState != GCState.CLOSED){
            if (forceJvmGarbageCollector) {
                forceJvmGc()
            }
            val isActive = checkAndClean()

            if(isActive){
                current_delay -= INC_DELAY
                current_delay = current_delay.coerceAtLeast(MIN_DELAY)
            } else {
                current_delay += INC_DELAY
                current_delay = current_delay.coerceAtMost(MAX_DELAY)
            }
            Thread.sleep(current_delay)
        }
    }

    /**
     * Remove the Object pointers that died since the last GC.
     * Decrease the counter of the References and NativeCoreType that are not reachable anymore.
     * Return true if something has been deleted.
     */
    private fun checkAndClean(): Boolean {
        var isActive = false

        // Check validity of cpp pointer for classic godot Object, if not valid, then remove jvm instance.
        // This binds jvm instance lifecycle to native object's one.
        val wrapIterable = synchronized(wrappedMap) {
            //We only create a single List in this block so we don't block the whole map for the duration of the checking
            wrappedMap.toList()
        }
        for (entry in wrapIterable) {
            if (!MemoryBridge.checkInstance(entry.first, entry.second.godotInstanceId)) {
                suppressBuffer.add(entry.first)
                isActive = true
            }
        }
        synchronized(wrappedMap){
            for (ptr in suppressBuffer) {
                wrappedMap.remove(ptr)
            }
        }
        suppressBuffer.clear()

        // A native reference cannot die while a jvm instance exists (because counter > 0). When we don't need the
        // jvm instance anymore, we decrease the counter.
        while(true){
            val ref = refReferenceQueue.poll() ?: break
            val value = ref.get()?.rawPtr
            if (value != null) {
                if (MemoryBridge.unref(value)) {
                    suppressBuffer.add(value)
                    isActive = true
                }
            }
        }
        synchronized(refWrappedMap) {
            for (ptr in suppressBuffer) {
                refWrappedMap.remove(ptr)
            }
        }
        suppressBuffer.clear()

        // Same as before for NativeCoreTypes
        while(true){
            val ref = nativeReferenceQueue.poll() ?: break
            val value = ref.get()
            if (value != null) {
                if (MemoryBridge.unrefNativeCoreType(value._handle, value.coreVariantType.baseOrdinal)) {
                    suppressBuffer.add(value._handle)
                    isActive = true
                }
            }
        }
        synchronized(nativeCoreTypeMap) {
            for (ptr in suppressBuffer) {
                nativeCoreTypeMap.remove(ptr)
            }
        }
        suppressBuffer.clear()

        return isActive
    }

    fun close() {
        executor.shutdown()
        gcState = GCState.CLOSED
        info("Closing GC thread")
    }

    fun cleanUp() {
        for(instance in staticInstances){
            instance.collect()
        }

        val begin = Instant.now()
        while (refWrappedMap.isNotEmpty() || wrappedMap.isNotEmpty() || nativeCoreTypeMap.isNotEmpty()) {
            forceJvmGc()
            checkAndClean()
            val finish = Instant.now()
            if (Duration.between(begin, finish).toMillis() > 5000) {
                throw GCEndException(
                    buildString {
                        append("Some JVM godot instances are leaked.")
                        append(System.lineSeparator())
                        if (shouldDisplayLeakInstancesOnClose) {
                            append("Leaked references:")
                            append(System.lineSeparator())
                            for (entry in refWrappedMap) {
                                append("    ${entry.key}: ${entry.value}")
                                append(System.lineSeparator())
                            }
                            append("Leaked objects:")
                            append(System.lineSeparator())
                            for (entry in wrappedMap) {
                                append("    ${entry.key}: ${entry.value}")
                                append(System.lineSeparator())
                            }
                            append("Leaked native core types:")
                            append(System.lineSeparator())
                            for (entry in nativeCoreTypeMap) {
                                append("    ${entry.key}: ${entry.value}")
                                append(System.lineSeparator())
                            }
                        }
                    }
                )
            }
        }

    }

    /**
     * Force JVM garbage collector to run
     */
    private fun forceJvmGc() {
        var any: Any? = Any()
        val wkRef = WeakReference(any)
        any = null
        while (wkRef.get() != null) {
            System.gc()
        }
    }

    private object MemoryBridge {
        external fun checkInstance(ptr: VoidPtr, instanceId: Long): Boolean
        external fun unref(ptr: VoidPtr): Boolean
        external fun ref(ptr: VoidPtr): Boolean
        external fun unrefNativeCoreType(ptr: VoidPtr, variantType: Int): Boolean
    }

    private enum class GCState {
        NONE,
        STARTED,
        CLOSED
    }

    private class GCEndException(message: String) : Exception(message)
}

interface GodotStatic{

    fun registerAsSingleton(){
        GarbageCollector.registerStatic(this)
    }

    fun collect();
}
