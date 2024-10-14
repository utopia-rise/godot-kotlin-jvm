package godot.internal.memory.binding

import godot.common.interop.ValuePointer
import godot.common.interop.VariantConverter
import java.lang.ref.ReferenceQueue
import java.lang.ref.WeakReference

class NativeCoreBinding(
    ref: ValuePointer,
    val variantType: VariantConverter
) : WeakReference<ValuePointer>(ref, queue) {
    val ptr = ref.ptr

    companion object {
        /** Queue to be notified when the GC runs on NativeCoreTypes.*/
        val queue = ReferenceQueue<ValuePointer>()
    }
}
