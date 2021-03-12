package godot.core.memory

import godot.core.KtObject
import godot.core.NativeCoreType
import java.lang.ref.ReferenceQueue
import java.lang.ref.WeakReference

internal class ReferenceWeakReference(
    ref: KtObject,
    queue: ReferenceQueue<KtObject>) :
    WeakReference<KtObject>(ref, queue) {
    val ptr = ref.rawPtr
}
