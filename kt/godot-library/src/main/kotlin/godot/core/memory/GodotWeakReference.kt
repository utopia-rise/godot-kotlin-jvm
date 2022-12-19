package godot.core.memory

import godot.core.KtObject
import godot.core.ObjectID
import java.lang.ref.ReferenceQueue
import java.lang.ref.WeakReference

internal class GodotWeakReference(
    ref: KtObject,
    queue: ReferenceQueue<KtObject>,
    val id: ObjectID
) : WeakReference<KtObject>(ref, queue)
