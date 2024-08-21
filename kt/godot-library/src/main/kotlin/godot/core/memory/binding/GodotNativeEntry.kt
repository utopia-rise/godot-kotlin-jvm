package godot.core.memory.binding

import godot.core.ObjectID
import java.lang.ref.ReferenceQueue
import java.lang.ref.WeakReference

internal interface GodotNativeEntry {
    val objectID: ObjectID
    val binding: GodotBinding?

    fun demote() {}
    fun promote() {}

    companion object {
        fun create(binding: GodotBinding, queue: ReferenceQueue<GodotBinding>) : GodotNativeEntry {
            val id = binding.value!!.id
            if(id.isReference){
                return GodotRefCountedEntry(binding, queue, id)
            } else {
                return GodotObjectEntry(binding)
            }
        }
    }
}

internal class GodotRefCountedEntry(
    binding: GodotBinding,
    queue: ReferenceQueue<GodotBinding>,
    override val objectID: ObjectID
) : WeakReference<GodotBinding>(binding, queue), GodotNativeEntry  {

    override val binding
        get() = get()

    private var strongReference: GodotBinding? = null

    override fun demote() {
        strongReference = null
    }

    override fun promote() {
        strongReference = get()
    }
}

internal class GodotObjectEntry(
    override val binding: GodotBinding
) : GodotNativeEntry {

    override val objectID: ObjectID
        get() = binding.value!!.id
}


