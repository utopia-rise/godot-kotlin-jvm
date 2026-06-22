@file:Suppress("UNCHECKED_CAST", "unused")

package godot.registration

import godot.common.interop.ObjectID
import godot.common.interop.VoidPtr
import godot.core.KtObject

class KtConstructor<T : KtObject>(
    private val constructor: () -> T
) {
    fun construct(rawPtr: VoidPtr, instanceId: Long) = KtObject.createScriptInstance(rawPtr, ObjectID(instanceId)) {
        constructor()
    }
}
