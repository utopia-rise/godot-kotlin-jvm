package godot.core.memory

import godot.core.NativeCoreType
import godot.core.VariantType
import java.lang.ref.ReferenceQueue
import java.lang.ref.WeakReference

internal class NativeCoreWeakReference(
    ref: NativeCoreType,
    queue: ReferenceQueue<NativeCoreType>,
    val variantType: VariantType) :
    WeakReference<NativeCoreType>(ref, queue) {
    val ptr = ref._handle
}
