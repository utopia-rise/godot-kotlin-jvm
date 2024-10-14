package godot.internal.memory.binding

import godot.common.interop.IdentityPointer
import godot.common.interop.ObjectID
import java.lang.ref.ReferenceQueue
import java.lang.ref.WeakReference

interface GodotBinding {
    val objectID: ObjectID
    val instance: IdentityPointer?

    companion object {
        /** Queue to be notified when the GC runs on References.*/
        val queue = ReferenceQueue<IdentityPointer>()

        fun create(instance: IdentityPointer): GodotBinding {
            val id = instance.objectID
            return if (id.isReference) {
                RefCountedBinding(instance, queue, id)
            } else {
                ObjectBinding(instance, id)
            }
        }
    }
}

class RefCountedBinding(
    instance: IdentityPointer,
    queue: ReferenceQueue<IdentityPointer>,
    override val objectID: ObjectID
) : WeakReference<IdentityPointer>(instance, queue), GodotBinding {

    override val instance: IdentityPointer?
        get() = this.get()
}

class ObjectBinding(
    override val instance: IdentityPointer,
    override val objectID: ObjectID
) : GodotBinding

