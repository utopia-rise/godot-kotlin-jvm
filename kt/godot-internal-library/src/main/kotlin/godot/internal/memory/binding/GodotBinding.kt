package godot.internal.memory.binding

import godot.common.interop.Binding
import godot.common.interop.NativeWrapper
import godot.common.interop.ObjectID
import java.lang.ref.ReferenceQueue
import java.lang.ref.WeakReference

interface GodotBinding: Binding {
    override var instance: NativeWrapper?

    companion object {
        val queue = ReferenceQueue<ObjectBinding>()

        fun create(instance: NativeWrapper, objectID: ObjectID): GodotBinding {
            return if (objectID.isReference) {
                RefCountedBinding(instance, objectID, queue)
            } else {
                ObjectBinding(instance, objectID)
            }
        }
    }
}

class ObjectBinding(
    override var instance: NativeWrapper?,
    override val objectID: ObjectID
) : GodotBinding

class RefCountedBinding(
    instance: NativeWrapper,
    override val objectID: ObjectID,
    queue: ReferenceQueue<ObjectBinding>,
) : WeakReference<ObjectBinding>(ObjectBinding(instance, objectID), queue), GodotBinding {

    override var instance: NativeWrapper?
        get() = this.get()?.instance
        set(value) {
            this.get()?.instance = value
        }
}



