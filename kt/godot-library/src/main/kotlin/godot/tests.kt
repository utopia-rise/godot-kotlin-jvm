package godot

import godot.core.*
import godot.signals.Signal0
import godot.signals.Signal1
import godot.util.VoidPtr
import godot.util.camelToSnakeCase
import kotlin.reflect.KCallable

open class Object : KtObject() {
    override fun __new(): VoidPtr {
        return TransferContext.invokeConstructor("Object")
    }

    fun connect(name: String, target: Object, method: String, binds: VariantArray, flags: Long): GodotError {
        val refreshBuffer = TransferContext.writeArguments(KtVariant(name), KtVariant(target), KtVariant(method), KtVariant(binds), KtVariant(flags))
        TransferContext.callMethod(rawPtr, "Object", "connect", KtVariant.Type.LONG, refreshBuffer)
        return GodotError.values()[TransferContext.readReturnValue().asInt()]
    }

    fun emitSignal(signal: String, vararg args: Any?) {
        val refreshBuffer = TransferContext.writeArguments(KtVariant(signal), *args.map { wrap(it) }.toTypedArray())
        TransferContext.callMethod(rawPtr, "Object", "emit_signal", KtVariant.Type.NIL, refreshBuffer)
        TransferContext.readReturnValue()
    }

    fun getInstanceId(): Long {
        val refreshBuffer =TransferContext.writeArguments()
        TransferContext.callMethod(rawPtr, "Object", "get_instance_id", KtVariant.Type.LONG, refreshBuffer)
        return TransferContext.readReturnValue().asLong()
    }

    fun Signal0.emit() {
        emit(this@Object)
    }

    fun <K: () -> Unit> Signal0.connect(
            target: Object,
            method: K,
            binds: VariantArray? = null,
            flags: Long = 0
    ) {
        val methodName = (method as KCallable<*>).name.camelToSnakeCase()
        connect(this@Object, target, methodName, binds, flags)
    }

    fun <A0> Signal1<A0>.emit(a0: A0) {
        emit(this@Object, a0)
    }

    fun <A0, K : (A0) -> Unit> Signal1<A0>.connect(
            target: Object,
            method: K,
            binds: VariantArray? = null,
            flags: Long = 0
    ) {
        val methodName = (method as KCallable<*>).name.camelToSnakeCase()
        connect(this@Object, target, methodName, binds, flags)
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
