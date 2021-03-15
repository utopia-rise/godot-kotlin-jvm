package godot.core.memory

import godot.core.KtObject
import java.lang.ref.ReferenceQueue
import java.lang.ref.WeakReference

internal class ReferenceWeakReference(
    ref: KtObject,
    queue: ReferenceQueue<KtObject>,
    val index: Int) :
    WeakReference<KtObject>(ref, queue) {
    val ptr = ref.rawPtr
}
