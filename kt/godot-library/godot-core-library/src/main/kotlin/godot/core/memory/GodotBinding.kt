package godot.core.memory

import godot.core.KtObject
import godot.core.ObjectID
import java.lang.ref.ReferenceQueue
import java.lang.ref.WeakReference

internal interface GodotBinding {
    val objectID: ObjectID
    val instance: KtObject?

    companion object {
        /** Queue to be notified when the GC runs on References.*/
        val queue = ReferenceQueue<KtObject>()

        fun create(instance: KtObject): GodotBinding {
            val id = instance.objectID
            return if (id.isReference) {
                RefCountedBinding(instance, queue, id)
            } else {
                ObjectBinding(instance, id)
            }
        }
    }
}

internal class RefCountedBinding(
    instance: KtObject,
    queue: ReferenceQueue<KtObject>,
    override val objectID: ObjectID
) : WeakReference<KtObject>(instance, queue), GodotBinding {

    override val instance: KtObject?
        get() = this.get()
}

internal class ObjectBinding(
    override val instance: KtObject,
    override val objectID: ObjectID
) : GodotBinding

