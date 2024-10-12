package godot.core.memory

import godot.core.NativeCoreType
import godot.core.VariantParser
import java.lang.ref.ReferenceQueue
import java.lang.ref.WeakReference

internal class NativeCoreBinding(
    ref: NativeCoreType,
    val variantType: VariantParser
) : WeakReference<NativeCoreType>(ref, queue) {
    val ptr = ref._handle

    companion object {
        /** Queue to be notified when the GC runs on NativeCoreTypes.*/
        val queue = ReferenceQueue<NativeCoreType>()
    }
}
