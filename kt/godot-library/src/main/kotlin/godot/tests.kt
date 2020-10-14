package godot

import godot.core.*
import godot.util.VoidPtr

open class Object : KtObject() {
    override fun __new(): VoidPtr {
        return TransferContext.invokeConstructor("Object")
    }

    override fun <T : KtObject> connect(name: String, target: T, method: String, binds: VariantArray, flags: Long) {
        TODO("Not yet implemented")
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
        return TransferContext.invokeConstructor("Node")
    }

    open fun getParent(): Node {
        val refresh = TransferContext.writeArguments()
        TransferContext.callMethod(rawPtr, "Node", "get_parent", KtVariant.Type.OBJECT, refresh)
        return TransferContext.readReturnValue().asObject()
    }
}

open class Spatial : Node() {
    override fun __new(): VoidPtr {
        return TransferContext.invokeConstructor("Spatial")
    }
}

fun registerEngineTypes() {
    TypeManager.registerEngineType("Object", ::Object)
    TypeManager.registerEngineType("Node", ::Node)
    TypeManager.registerEngineType("Spatial", ::Spatial)
}
