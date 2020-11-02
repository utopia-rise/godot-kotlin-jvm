package godot.core

import godot.util.VoidPtr
import java.lang.ref.WeakReference
import java.time.Duration
import java.time.Instant
import java.util.concurrent.Executors
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.ThreadFactory
import java.util.concurrent.TimeUnit

object GarbageCollector {
    private val refWrappedMap = mutableMapOf<VoidPtr, WeakReference<KtObject>>()
    private val wrappedMap = mutableMapOf<VoidPtr, KtObject>()
    private val refWrappedSuppressBuffer = mutableListOf<VoidPtr>()
    private val wrappedSuppressBuffer = mutableListOf<VoidPtr>()

    private val executor = Executors.newSingleThreadScheduledExecutor()

    private var forceJvmGarbageCollector = false

    private var gcState = GCState.NONE
    val isClosed: Boolean
        get() = gcState == GCState.CLOSED

    fun registerInstance(instance: KtObject) {
        val rawPtr = instance.rawPtr
        if (instance.isRef) {
            synchronized(refWrappedMap) {
                refWrappedMap[rawPtr] = WeakReference(instance)
                MemoryBridge.ref(rawPtr)
            }
        } else {
            synchronized(wrappedMap) {
                wrappedMap[rawPtr] = instance
            }
        }
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

    fun start(forceJvmGarbageCollector: Boolean, period: Long) {
        this.forceJvmGarbageCollector = forceJvmGarbageCollector
        gcState = GCState.STARTED
        executor.scheduleAtFixedRate(GarbageCollector::run, 0, period, TimeUnit.MILLISECONDS)
    }

    fun close() {
        executor.shutdown()
        gcState = GCState.CLOSED
        println("Closing GC thread ...")
    }

    fun cleanUp() {
        val begin = Instant.now()
        while (refWrappedMap.isNotEmpty() || wrappedMap.isNotEmpty()) {
            forceJvmGc()
            checkAndClean()
            val finish = Instant.now()
            if (Duration.between(begin, finish).toMillis() > 5000) {
                throw GCEndException(
                        buildString {
                            append("Some JVM godot instances are leaked.")
                            append(System.lineSeparator())
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
                        }
                )
            }
        }

    }

    private fun run() {
        if (forceJvmGarbageCollector) {
            forceJvmGc()
        }
        checkAndClean()
    }

    private fun checkAndClean() {
        // A native reference cannot die while a jvm instance exists (because counter > 0). When we don't need the
        // jvm instance anymore, we decrease the counter.
        synchronized(refWrappedMap) {
            for (entry in refWrappedMap) {
                if (entry.value.get() == null) {
                    if (MemoryBridge.unref(entry.key)) {
                        refWrappedSuppressBuffer.add(entry.key)
                    }
                }
            }
            for (ptr in refWrappedSuppressBuffer) {
                refWrappedMap.remove(ptr)
            }
        }
        refWrappedSuppressBuffer.clear()

        // Check validity of cpp pointer for classic godot Object, if not valid, then remove jvm instance.
        // This binds jvm instance lifecycle to native object's one.
        synchronized(wrappedMap) {
            for (entry in wrappedMap) {
                if (!MemoryBridge.checkInstance(entry.key, entry.value.godotInstanceId)) {
                    wrappedSuppressBuffer.add(entry.key)
                }
            }
            for (ptr in wrappedSuppressBuffer) {
                wrappedMap.remove(ptr)
            }
        }
        wrappedSuppressBuffer.clear()
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
    }

    private enum class GCState {
        NONE,
        STARTED,
        CLOSED
    }

    private class GCEndException(message: String) : Exception(message)
}