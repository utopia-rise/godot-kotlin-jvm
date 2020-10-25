package godot.core

import godot.util.VoidPtr
import java.lang.ref.WeakReference

data class RefToPtr(
        val weakRef: WeakReference<KtReference>,
        val ptr: VoidPtr
)

object GarbageCollector : Thread() {
    val weakRefs = mutableListOf<RefToPtr>()
    val refs = mutableListOf<KtObject>()
    val wrapped = mutableMapOf<VoidPtr, KtObject>()

    fun registerInstance(instance: KtObject) {
        synchronized(this) {
            if (instance is KtReference) {
                weakRefs.add(RefToPtr(WeakReference(instance), instance.rawPtr))
            } else {
                refs.add(instance)
            }
            wrapped[instance.rawPtr] = instance
        }
    }

    override fun run() {
        while (true) {
            val weakRefsIt = weakRefs.iterator()
            while (weakRefsIt.hasNext()) {
                val weakRef = weakRefsIt.next()
                if (weakRef.weakRef.get() == null) {
                    weakRefsIt.remove()
                    MemoryBridge.unref(weakRef.ptr)
                }
            }

            val refsIt = refs.iterator()
            while (refsIt.hasNext()) {
                val ref = refsIt.next()
                if (!MemoryBridge.checkInstance(ref.rawPtr)) {
                    refsIt.remove()
                }
            }
            sleep(500)
        }
    }

    private object MemoryBridge {
        external fun checkInstance(ptr: VoidPtr): Boolean
        external fun unref(ptr: VoidPtr): Boolean
    }
}