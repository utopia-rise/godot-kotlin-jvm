package godot.core.memory.binding

import godot.core.ObjectID
import java.lang.ref.ReferenceQueue
import java.lang.ref.WeakReference

internal interface GodotNativeEntry {
    val objectID: ObjectID
    val binding: GodotBinding?

    companion object {
        fun create(binding: GodotBinding, queue: ReferenceQueue<GodotBinding>): GodotNativeEntry {
            val id = binding.value!!.id
            if (id.isReference) {
                return GodotRefCountedEntry(binding, queue, id)
            } else {
                return GodotObjectEntry(binding, id)
            }
        }
    }
}

internal class GodotRefCountedEntry(
    binding: GodotBinding,
    queue: ReferenceQueue<GodotBinding>,
    override val objectID: ObjectID
) : WeakReference<GodotBinding>(binding, queue), GodotNativeEntry {

    override val binding
        get() = get()
}

internal class GodotObjectEntry(
    override val binding: GodotBinding,
    override val objectID: ObjectID
) : GodotNativeEntry

