@file:JvmName("CallableUtils")
@file:Suppress("PackageDirectoryMismatch")

package godot.core

import godot.api.Object
import godot.common.interop.ObjectID
import godot.internal.memory.MemoryManager
import godot.internal.memory.TransferContext
import godot.common.interop.VoidPtr
import kotlin.reflect.KCallable

class NativeCallable : NativeCoreType, Callable {

    internal constructor() {
        ptr = Bridge.engine_call_constructor()
        MemoryManager.registerNativeCoreType(this, VariantParser.CALLABLE)
    }

    internal constructor(target: Object, methodName: StringName) {
        TransferContext.writeArguments(VariantParser.OBJECT to target, VariantParser.STRING_NAME to methodName)
        ptr = Bridge.engine_call_constructor_object_string_name()
        MemoryManager.registerNativeCoreType(this, VariantParser.CALLABLE)
    }

    internal constructor(callable: NativeCallable) {
        TransferContext.writeArguments(VariantParser.CALLABLE to callable)
        ptr = Bridge.engine_call_copy_constructor()
        MemoryManager.registerNativeCoreType(this, VariantParser.CALLABLE)
    }

    internal constructor(lambdaCallable: LambdaCallable<*>) {
        // We pass all params using jni as we're often in a context of sending parameters to cpp, so we should not rewind buffer.
        ptr = Bridge.engine_call_constructor_kt_custom_callable(lambdaCallable, lambdaCallable.variantConverter.id, lambdaCallable.hashCode())
        MemoryManager.registerNativeCoreType(this, VariantParser.CALLABLE)
    }

    internal constructor(_handle: VoidPtr){
        this.ptr = _handle
        MemoryManager.registerNativeCoreType(this, VariantParser.CALLABLE)
    }

    fun bind(vararg args: Any?): NativeCallable {
        TransferContext.writeArguments(*args.map { VariantCaster.ANY to it }.toTypedArray())
        Bridge.engine_call_bind(ptr)
        return TransferContext.readReturnValue(VariantParser.CALLABLE) as NativeCallable
    }

    fun bindv(args: VariantArray<Any?>): NativeCallable {
        TransferContext.writeArguments(VariantParser.ARRAY to args)
        Bridge.engine_call_bindv(ptr)
        return TransferContext.readReturnValue(VariantParser.CALLABLE) as NativeCallable
    }

    override fun call(vararg args: Any?): Any? {
        TransferContext.writeArguments(*args.map { VariantCaster.ANY to it }.toTypedArray())
        Bridge.engine_call_call(ptr)
        return TransferContext.readReturnValue(VariantCaster.ANY)
    }

    fun callDeferred(vararg args: Any?) {
        TransferContext.writeArguments(*args.map { VariantCaster.ANY to it }.toTypedArray())
        Bridge.engine_call_call_deferred(ptr)
    }

    fun callv(args: VariantArray<Any?>): Any? {
        TransferContext.writeArguments(VariantParser.ARRAY to args)
        Bridge.engine_call_callv(ptr)
        return TransferContext.readReturnValue(VariantCaster.ANY)
    }

    fun getBoundArguments(): VariantArray<Any?> {
        Bridge.engine_call_get_bound_arguments(ptr)
        @Suppress("UNCHECKED_CAST")
        return TransferContext.readReturnValue(VariantParser.ARRAY) as VariantArray<Any?>
    }

    fun getBoundArgumentCount(): Int {
        Bridge.engine_call_get_bound_arguments_count(ptr)
        return TransferContext.readReturnValue(VariantCaster.INT) as Int
    }

    fun getMethod(): StringName {
        Bridge.engine_call_get_method(ptr)
        return TransferContext.readReturnValue(VariantParser.STRING_NAME) as StringName
    }

    fun getObject(): Object {
        Bridge.engine_call_get_object(ptr)
        return TransferContext.readReturnValue(VariantParser.OBJECT) as Object
    }

    fun getObjectId(): ObjectID {
        Bridge.engine_call_get_object_id(ptr)
        return ObjectID(TransferContext.readReturnValue(VariantParser.LONG) as Long)
    }

    override fun hashCode(): Int {
        Bridge.engine_call_hash(ptr)
        return TransferContext.readReturnValue(VariantCaster.INT) as Int
    }

    fun isCustom(): Boolean {
        Bridge.engine_call_is_custom(ptr)
        return TransferContext.readReturnValue(VariantParser.BOOL) as Boolean
    }

    fun isNull(): Boolean {
        Bridge.engine_call_is_null(ptr)
        return TransferContext.readReturnValue(VariantParser.BOOL) as Boolean
    }

    fun isStandard(): Boolean {
        Bridge.engine_call_is_standard(ptr)
        return TransferContext.readReturnValue(VariantParser.BOOL) as Boolean
    }

    fun isValid(): Boolean {
        Bridge.engine_call_is_valid(ptr)
        return TransferContext.readReturnValue(VariantParser.BOOL) as Boolean
    }

    fun rpc(vararg args: Any?) {
        TransferContext.writeArguments(*args.map { VariantCaster.ANY to it }.toTypedArray())
        Bridge.engine_call_rpc(ptr)
    }

    fun rpcId(peerId: Long, vararg args: Any?) {
        TransferContext.writeArguments(VariantParser.LONG to peerId, *args.map { VariantCaster.ANY to it }.toTypedArray())
        Bridge.engine_call_rpc_id(ptr)
    }

    fun unbind(argCount: Int): NativeCallable {
        TransferContext.writeArguments(VariantCaster.INT to argCount)
        Bridge.engine_call_unbind(ptr)
        return TransferContext.readReturnValue(VariantParser.CALLABLE) as NativeCallable
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NativeCallable) return false
        if(getObject() != other.getObject() || getMethod() != other.getMethod()) return false
        return true
    }

    @Suppress("FunctionName")
    object Bridge {
        external fun engine_call_constructor(): VoidPtr
        external fun engine_call_constructor_object_string_name(): VoidPtr
        external fun engine_call_constructor_kt_custom_callable(callable: LambdaCallable<*>, variantTypeOrdinal: Int, hashCode: Int): VoidPtr
        external fun engine_call_copy_constructor(): VoidPtr

        external fun engine_call_bind(_handle: VoidPtr)
        external fun engine_call_bindv(_handle: VoidPtr)
        external fun engine_call_call(handle: VoidPtr)
        external fun engine_call_call_deferred(handle: VoidPtr)
        external fun engine_call_callv(_handle: VoidPtr)
        external fun engine_call_get_bound_arguments(_handle: VoidPtr)
        external fun engine_call_get_bound_arguments_count(_handle: VoidPtr)
        external fun engine_call_get_method(_handle: VoidPtr)
        external fun engine_call_get_object(_handle: VoidPtr)
        external fun engine_call_get_object_id(_handle: VoidPtr)
        external fun engine_call_hash(_handle: VoidPtr)
        external fun engine_call_is_custom(_handle: VoidPtr)
        external fun engine_call_is_null(_handle: VoidPtr)
        external fun engine_call_is_standard(_handle: VoidPtr)
        external fun engine_call_is_valid(_handle: VoidPtr)
        external fun engine_call_rpc(_handle: VoidPtr)
        external fun engine_call_rpc_id(_handle: VoidPtr)
        external fun engine_call_unbind(_handle: VoidPtr)
    }

    companion object {
        operator fun <T : Object> invoke(
            target: T,
            callable: T.() -> Unit
        ) = NativeCallable(target, (callable as KCallable<*>).name.toGodotName())

        operator fun <T : Object, P> invoke(
            target: T,
            callable: T.(P) -> Unit
        ) = NativeCallable(target, (callable as KCallable<*>).name.toGodotName())

        operator fun <T : Object, P1, P2> invoke(
            target: T,
            callable: T.(P1, P2) -> Unit
        ) = NativeCallable(target, (callable as KCallable<*>).name.toGodotName())

        operator fun <T : Object, P1, P2, P3> invoke(
            target: T,
            callable: T.(P1, P2, P3) -> Unit
        ) = NativeCallable(target, (callable as KCallable<*>).name.toGodotName())

        operator fun <T : Object, P1, P2, P3, P4> invoke(
            target: T,
            callable: T.(P1, P2, P3, P4) -> Unit
        ) = NativeCallable(target, (callable as KCallable<*>).name.toGodotName())

        operator fun <T : Object, P1, P2, P3, P4, P5> invoke(
            target: T,
            callable: T.(P1, P2, P3, P4, P5) -> Unit
        ) = NativeCallable(target, (callable as KCallable<*>).name.toGodotName())

        operator fun <T : Object, P1, P2, P3, P4, P5, P6> invoke(
            target: T,
            callable: T.(P1, P2, P3, P4, P5, P6) -> Unit
        ) = NativeCallable(target, (callable as KCallable<*>).name.toGodotName())

        operator fun <T : Object, P1, P2, P3, P4, P5, P6, P7> invoke(
            target: T,
            callable: T.(P1, P2, P3, P4, P5, P6, P7) -> Unit
        ) = NativeCallable(target, (callable as KCallable<*>).name.toGodotName())

        operator fun <T : Object, P1, P2, P3, P4, P5, P6, P7, P8> invoke(
            target: T,
            callable: T.(P1, P2, P3, P4, P5, P6, P7, P8) -> Unit
        ) = NativeCallable(target, (callable as KCallable<*>).name.toGodotName())

        operator fun <T : Object, P1, P2, P3, P4, P5, P6, P7, P8, P9> invoke(
            target: T,
            callable: T.(P1, P2, P3, P4, P5, P6, P7, P8, P9) -> Unit
        ) = NativeCallable(target, (callable as KCallable<*>).name.toGodotName())

        operator fun <T : Object, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> invoke(
            target: T,
            callable: T.(P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> Unit
        ) = NativeCallable(target, (callable as KCallable<*>).name.toGodotName())
    }
}
