package godot.core

import godot.util.VoidPtr
import java.lang.ref.WeakReference

object GarbageCollector : Thread() {
    val refWrappedMap = mutableMapOf<VoidPtr, WeakReference<KtObject>>()
    val wrappedMap = mutableMapOf<VoidPtr, KtObject>()
    var isActive = false

    fun registerInstance(instance: KtObject) {
        synchronized(this) {
            if (instance.isRef) {
                refWrappedMap[instance.rawPtr] = WeakReference(instance)
            } else {
                wrappedMap[instance.rawPtr] = instance
            }
            println("registered ptr: ${instance.rawPtr} with class ${instance::class.java}")
        }
    }

    override fun start() {
        super.start()
        isActive = true
    }

    fun close() {
        isActive = false

//        println("Before checkAndClean :")
//        println("refWrappedMap : ")
//        refWrappedMap.forEach { println("${it.key} : ${it.value}, class ${it.value::class.java}") }
//        println("wrappedMap : ")
//        wrappedMap.forEach { println("${it.key} : ${it.value}, class ${it.value::class.java}") }

        var any: Any? = Any()
        val wkRef = WeakReference(any)
        any = null
        while (wkRef.get() != null) {
            System.gc()
        }
        checkAndClean()

//        println("After checkAndClean :")
//        println("refWrappedMap : ")
//        refWrappedMap.forEach { println("${it.key} : ${it.value}, class ${it.value::class.java}") }
//        println("wrappedMap : ")
//        wrappedMap.forEach { println("${it.key} : ${it.value}, class ${it.value::class.java}") }
    }

    override fun run() {
        while (isActive) {
            checkAndClean()
            sleep(500)
        }
    }

    private fun checkAndClean() {
        // A native reference cannot die while a jvm instance exists (because counter > 0). When we don't need the
        // jvm instance anymore, we decrease the counter.
        val weakRefsIt = refWrappedMap.iterator()
        while (weakRefsIt.hasNext()) {
            val weakRef = weakRefsIt.next()
            if (weakRef.value.get() == null) {
                weakRefsIt.remove()
                MemoryBridge.unref(weakRef.key)
                println("ptr ${weakRef.key} was removed, class ${weakRef.value::class.java}")
            }
        }

        // Check validity of cpp pointer for classic godot Object, if not valid, then remove jvm instance.
        // This binds jvm instance lifecycle to native object's one.
        val refsIt = wrappedMap.iterator()
        while (refsIt.hasNext()) {
            val ref = refsIt.next()
            if (!MemoryBridge.checkInstance(ref.key)) {
                refsIt.remove()
                println("ptr ${ref.key} was removed, class ${ref.value::class.java}")
            }
        }
    }

    private object MemoryBridge {
        external fun checkInstance(ptr: VoidPtr): Boolean
        external fun unref(ptr: VoidPtr): Boolean
    }
}