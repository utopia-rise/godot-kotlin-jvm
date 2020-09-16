package godot

import godot.core.KtObject
import godot.core.Godot
import godot.core.KtVariant
import godot.core.TransferContext
import godot.util.VoidPtr

open class Object : KtObject() {
    override fun __new(): VoidPtr {
        return Godot.invokeConstructor("Object")
    }

    fun getInstanceId(): Long {
        TransferContext.writeArguments()
        TransferContext.callMethod(rawPtr, "Object", "get_instance_id", KtVariant.Type.LONG, false)
        return TransferContext.readReturnValue().asLong()
    }
}

open class Node : Object() {
    open var name: String
        get() {
            TransferContext.writeArguments()
            TransferContext.callMethod(rawPtr, "Node", "get_name", KtVariant.Type.STRING, false)
            return TransferContext.readReturnValue().asString()
        }
        set(value) {
            val refresh = TransferContext.writeArguments(KtVariant(value))
            TransferContext.callMethod(rawPtr, "Node", "set_name", KtVariant.Type.NIL, refresh)
            TransferContext.readReturnValue()
        }

    override fun __new(): VoidPtr {
        return Godot.invokeConstructor("Node")
    }
}

open class Spatial : Node() {
    override fun __new(): VoidPtr {
        return Godot.invokeConstructor("Spatial")
    }
}