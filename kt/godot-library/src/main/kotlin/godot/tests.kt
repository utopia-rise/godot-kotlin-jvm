package godot

import godot.core.*
import godot.signals.*
import godot.util.VoidPtr
import godot.util.camelToSnakeCase
import kotlin.reflect.KCallable

open class Object(isRef: Boolean = false) : KtObject(isRef) {

    constructor() : this(false)

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

    override fun getInstanceId(): Long {
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

    fun <A0, A1> Signal2<A0, A1>.emit(a0: A0, a1: A1) {
        emit(this@Object, a0, a1)
    }

    fun <A0, A1, K : (A0, A1) -> Unit> Signal2<A0, A1>.connect(
            target: Object,
            method: K,
            binds: VariantArray? = null,
            flags: Long = 0
    ) {
        val methodName = (method as KCallable<Unit>).name.camelToSnakeCase()
        connect(this@Object, target, methodName, binds, flags)
    }

    fun <A0, A1, A2> Signal3<A0, A1, A2>.emit(
            a0: A0,
            a1: A1,
            a2: A2
    ) {
        emit(this@Object, a0, a1, a2)
    }

    fun <A0, A1, A2, K : (
            A0,
            A1,
            A2
    ) -> Unit> Signal3<A0, A1, A2>.connect(
            target: Object,
            method: K,
            binds: VariantArray? = null,
            flags: Long = 0
    ) {
        val methodName = (method as KCallable<Unit>).name.camelToSnakeCase()
        connect(this@Object, target, methodName, binds, flags)
    }

    fun <A0, A1, A2, A3> Signal4<A0, A1, A2, A3>.emit(
            a0: A0,
            a1: A1,
            a2: A2,
            a3: A3
    ) {
        emit(this@Object, a0, a1, a2, a3)
    }

    fun <A0, A1, A2, A3, K : (
            A0,
            A1,
            A2,
            A3
    ) -> Unit> Signal4<A0, A1, A2, A3>.connect(
            target: Object,
            method: K,
            binds: VariantArray? = null,
            flags: Long = 0
    ) {
        val methodName = (method as KCallable<Unit>).name.camelToSnakeCase()
        connect(this@Object, target, methodName, binds, flags)
    }

    fun <A0, A1, A2, A3, A4> Signal5<A0, A1, A2, A3, A4>.emit(
            a0: A0,
            a1: A1,
            a2: A2,
            a3: A3,
            a4: A4
    ) {
        emit(this@Object, a0, a1, a2, a3, a4)
    }

    fun <A0, A1, A2, A3, A4, K : (
            A0,
            A1,
            A2,
            A3,
            A4
    ) -> Unit> Signal5<A0, A1, A2, A3, A4>.connect(
            target: Object,
            method: K,
            binds: VariantArray? = null,
            flags: Long = 0
    ) {
        val methodName = (method as KCallable<Unit>).name.camelToSnakeCase()
        connect(this@Object, target, methodName, binds, flags)
    }

    fun <A0, A1, A2, A3, A4, A5> Signal6<A0, A1, A2, A3, A4, A5>.emit(
            a0: A0,
            a1: A1,
            a2: A2,
            a3: A3,
            a4: A4,
            a5: A5
    ) {
        emit(this@Object, a0, a1, a2, a3, a4, a5)
    }

    fun <A0, A1, A2, A3, A4, A5, K : (
            A0,
            A1,
            A2,
            A3,
            A4,
            A5
    ) -> Unit> Signal6<A0, A1, A2, A3, A4, A5>.connect(
            target: Object,
            method: K,
            binds: VariantArray? = null,
            flags: Long = 0
    ) {
        val methodName = (method as KCallable<Unit>).name.camelToSnakeCase()
        connect(this@Object, target, methodName, binds, flags)
    }

    fun <A0, A1, A2, A3, A4, A5, A6> Signal7<A0, A1, A2, A3, A4, A5, A6>.emit(
            a0: A0,
            a1: A1,
            a2: A2,
            a3: A3,
            a4: A4,
            a5: A5,
            a6: A6
    ) {
        emit(this@Object, a0, a1, a2, a3, a4, a5, a6)
    }

    fun <A0, A1, A2, A3, A4, A5, A6, K : (
            A0,
            A1,
            A2,
            A3,
            A4,
            A5,
            A6
    ) -> Unit> Signal7<A0, A1, A2, A3, A4, A5, A6>.connect(
            target: Object,
            method: K,
            binds: VariantArray? = null,
            flags: Long = 0
    ) {
        val methodName = (method as KCallable<Unit>).name.camelToSnakeCase()
        connect(this@Object, target, methodName, binds, flags)
    }

    fun <A0, A1, A2, A3, A4, A5, A6, A7> Signal8<A0, A1, A2, A3, A4, A5, A6, A7>.emit(
            a0: A0,
            a1: A1,
            a2: A2,
            a3: A3,
            a4: A4,
            a5: A5,
            a6: A6,
            a7: A7
    ) {
        emit(this@Object, a0, a1, a2, a3, a4, a5, a6, a7)
    }

    fun <A0, A1, A2, A3, A4, A5, A6, A7, K : (
            A0,
            A1,
            A2,
            A3,
            A4,
            A5,
            A6,
            A7
    ) -> Unit> Signal8<A0, A1, A2, A3, A4, A5, A6, A7>.connect(
            target: Object,
            method: K,
            binds: VariantArray? = null,
            flags: Long = 0
    ) {
        val methodName = (method as KCallable<Unit>).name.camelToSnakeCase()
        connect(this@Object, target, methodName, binds, flags)
    }

    fun <A0, A1, A2, A3, A4, A5, A6, A7, A8> Signal9<A0, A1, A2, A3, A4, A5, A6, A7, A8>.emit(
            a0: A0,
            a1: A1,
            a2: A2,
            a3: A3,
            a4: A4,
            a5: A5,
            a6: A6,
            a7: A7,
            a8: A8
    ) {
        emit(this@Object, a0, a1, a2, a3, a4, a5, a6, a7, a8)
    }

    fun <A0, A1, A2, A3, A4, A5, A6, A7, A8, K : (
            A0,
            A1,
            A2,
            A3,
            A4,
            A5,
            A6,
            A7,
            A8
    ) -> Unit> Signal9<A0, A1, A2, A3, A4, A5, A6, A7, A8>.connect(
            target: Object,
            method: K,
            binds: VariantArray? = null,
            flags: Long = 0
    ) {
        val methodName = (method as KCallable<Unit>).name.camelToSnakeCase()
        connect(this@Object, target, methodName, binds, flags)
    }

    fun <A0, A1, A2, A3, A4, A5, A6, A7, A8, A9> Signal10<A0, A1, A2, A3, A4, A5, A6, A7, A8,
            A9>.emit(
            a0: A0,
            a1: A1,
            a2: A2,
            a3: A3,
            a4: A4,
            a5: A5,
            a6: A6,
            a7: A7,
            a8: A8,
            a9: A9
    ) {
        emit(this@Object, a0, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }

    fun <A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, K : (
            A0,
            A1,
            A2,
            A3,
            A4,
            A5,
            A6,
            A7,
            A8,
            A9
    ) -> Unit> Signal10<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9>.connect(
            target: Object,
            method: K,
            binds: VariantArray? = null,
            flags: Long = 0
    ) {
        val methodName = (method as KCallable<Unit>).name.camelToSnakeCase()
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

open class Reference : Object(true) {

    override fun __new(): VoidPtr {
        return TransferContext.invokeConstructor("Reference")
    }
}

open class Resource : Reference() {
    override fun __new(): VoidPtr {
        return TransferContext.invokeConstructor("Resource")
    }
}

open class NavigationMesh : Resource() {
    override fun __new(): VoidPtr {
        return TransferContext.invokeConstructor("NavigationMesh")
    }
}

fun registerEngineTypes() {
    TypeManager.registerEngineType("Object", ::Object)
    TypeManager.registerEngineType("Node", ::Node)
    TypeManager.registerEngineType("Spatial", ::Spatial)
    TypeManager.registerEngineType("Reference", ::Reference)
    TypeManager.registerEngineType("Resource", ::Resource)
    TypeManager.registerEngineType("NavigationMesh", ::NavigationMesh)
}
