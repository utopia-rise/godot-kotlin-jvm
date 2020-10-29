package godot.core

import godot.util.VoidPtr
import java.lang.ref.WeakReference
import java.time.Duration
import java.time.Instant

object GarbageCollector : Thread() {
    val refWrappedMap = mutableMapOf<VoidPtr, WeakReference<KtObject>>()
    val wrappedMap = mutableMapOf<VoidPtr, KtObject>()
    val refWrappedSuppressBuffer = mutableListOf<VoidPtr>()
    val wrappedSuppressBuffer = mutableListOf<VoidPtr>()
    var isActive = false
    var hasClosed = false

    fun registerInstance(instance: KtObject) {
        synchronized(this) {
            val rawPtr = instance.rawPtr
            if (instance.isRef) {
                refWrappedMap[rawPtr] = WeakReference(instance)
                MemoryBridge.ref(rawPtr)
            } else {
                wrappedMap[rawPtr] = instance
            }
            println("registered ptr: $rawPtr with class ${instance::class.java}")
        }
    }

    override fun start() {
        super.start()
        isActive = true
    }

    fun close() {
        isActive = false
        println("Closing GC thread ...")
    }

    fun cleanUp() {
        val begin = Instant.now()
        while (refWrappedMap.isNotEmpty() || wrappedMap.isNotEmpty()) {
            checkAndClean()
            val finish = Instant.now()
            if (Duration.between(begin, finish).toMillis() > 5000) {
                //TODO : memdelete leaked instances
                throw GCEndException("Some JVM godot instances are leaked.")
            }
        }

    }

    override fun run() {
        while (isActive) {
            checkAndClean()
            sleep(500)
        }
        hasClosed = true
    }

    private fun checkAndClean() {
        forceJvmGc()

        // A native reference cannot die while a jvm instance exists (because counter > 0). When we don't need the
        // jvm instance anymore, we decrease the counter.
        for (entry in refWrappedMap) {
            if (entry.value.get() == null) {
                println("weak ref to ${entry.key} is dead.")
                if (MemoryBridge.unref(entry.key)) {
                    refWrappedSuppressBuffer.add(entry.key)
                    println("ptr ${entry.key} was removed, class ${entry.value::class.java}")
                }
            }
        }
        for (ptr in refWrappedSuppressBuffer) {
            refWrappedMap.remove(ptr)
        }
        refWrappedSuppressBuffer.clear()

        // Check validity of cpp pointer for classic godot Object, if not valid, then remove jvm instance.
        // This binds jvm instance lifecycle to native object's one.
        for (entry in wrappedMap) {
            if (!MemoryBridge.checkInstance(entry.key)) {
                wrappedSuppressBuffer.add(entry.key)
                println("ptr ${entry.key} was removed, class ${entry.value::class.java}")
            }
        }
        for (ptr in wrappedSuppressBuffer) {
            wrappedMap.remove(ptr)
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
        external fun checkInstance(ptr: VoidPtr): Boolean
        external fun unref(ptr: VoidPtr): Boolean
        external fun ref(ptr: VoidPtr): Boolean
    }

    private class GCEndException(message: String): Exception(message)
}