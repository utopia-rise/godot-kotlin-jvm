package godot.core.memory

import godot.core.KtObject
import godot.core.ObjectID
import java.lang.ref.ReferenceQueue
import java.lang.ref.WeakReference

internal class GodotWeakReference(
    binding: GodotBinding,
    queue: ReferenceQueue<GodotBinding>,
    val id: ObjectID
) : WeakReference<GodotBinding>(binding, queue)


internal class GodotBinding {
    internal var wrapper: KtObject? = null
    internal var scriptInstance: KtObject? = null

    val value: KtObject?
        get() = scriptInstance?: wrapper
}
