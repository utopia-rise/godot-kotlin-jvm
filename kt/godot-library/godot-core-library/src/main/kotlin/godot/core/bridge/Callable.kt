@file:JvmName("Callables")
@file:Suppress("PackageDirectoryMismatch")
package godot.core

import godot.api.Object
import godot.common.interop.ObjectID
import godot.common.interop.VoidPtr

interface Callable {
    fun bind(vararg args: Any?): NativeCallable
    fun bindV(args: VariantArray<Any?>): NativeCallable
    fun call(vararg args: Any?): Any?
    fun callDeferred(vararg args: Any?)
    fun callV(args: VariantArray<Any?>): Any?
    fun getBoundArguments(): VariantArray<Any?>
    fun getBoundArgumentCount(): Int
    fun getMethod(): StringName
    fun getObject(): Object
    fun getObjectId(): ObjectID
    fun isCustom(): Boolean
    fun isNull(): Boolean
    fun isStandard(): Boolean
    fun isValid(): Boolean
    fun rpc(vararg args: Any?)
    fun rpcId(peerId: Long, vararg args: Any?)
    fun unbind(argCount: Int): NativeCallable

    companion object {
        @JvmStatic
        @JvmName("create")
        operator fun invoke() = NativeCallable()

        @JvmStatic
        @JvmName("create")
        operator fun invoke(target: Object, methodName: StringName) = NativeCallable(target, methodName)

        @JvmStatic
        @JvmName("create")
        operator fun invoke(nativeCallable: NativeCallable) = NativeCallable(nativeCallable)
    }

    @Suppress("FunctionName")
    object Bridge {
        external fun engine_call_constructor(): VoidPtr
        external fun engine_call_constructor_object_string_name(): VoidPtr
        external fun engine_call_constructor_kt_custom_callable(callable: LambdaCallable<*>, variantTypeOrdinal: Int, hashCode: Int, hasOnCancel: Boolean): VoidPtr
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
}
