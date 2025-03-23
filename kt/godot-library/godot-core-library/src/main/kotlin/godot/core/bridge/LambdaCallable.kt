@file:Suppress("UNCHECKED_CAST", "PackageDirectoryMismatch")

package godot.core

import godot.api.Object
import godot.common.interop.ObjectID
import godot.common.interop.VariantConverter
import godot.core.Callable.Bridge
import godot.internal.logging.GodotLogging
import godot.internal.memory.MemoryManager
import godot.internal.memory.TransferContext
import java.lang.NoSuchMethodException

abstract class LambdaCallable<R : Any?>(
    internal val variantConverter: VariantConverter,
    internal val onCancelCall: (() -> Unit)?,
    vararg parameterTypes: VariantConverter
) : Callable {
    private val types: Array<VariantConverter> = parameterTypes.toList().toTypedArray()

    fun invokeNoReturn(): Unit = withParameters(types) {
        try {
            invokeKt()
        } catch (t: Throwable) {
            GodotLogging.error("Error calling a JVM custom Callable from Godot:\n" + t.stackTraceToString())
        }
    }

    fun invokeWithReturn(): Any? = withParametersReturn(types) {
        var ret: Any? = Unit
        try {
            ret = invokeKt()
            TransferContext.writeReturnValue(ret, VariantCaster.ANY)
        } catch (t: Throwable) {
            GodotLogging.error("Error calling a JVM custom Callable from Godot:\n" + t.stackTraceToString())
            TransferContext.writeReturnValue(null, VariantParser.NIL)
        }
        ret
    }

    fun onCancel() = onCancelCall!!()

    protected abstract fun invokeKt(): Any?

    override fun getBoundArguments() = VariantArray<Any?>()
    override fun getBoundArgumentCount() = 0
    override fun getMethod() = throw NoSuchMethodException("Can't get method on LambdaCallable")
    override fun getObject() = throw NoSuchMethodException("Can't get Object on LambdaCallable")
    override fun getObjectId() = throw NoSuchMethodException("Can't get ObjectID on LambdaCallable")
    override fun isCustom() = true
    override fun isNull() = false
    override fun isStandard() = false
    override fun isValid() = true
    override fun rpc(vararg args: Any?) = throw NoSuchMethodException("Can't make a RPC call from a LambdaCallable")
    override fun rpcId(peerId: Long, vararg args: Any?) = throw NoSuchMethodException("Can't make a RPC call from a LambdaCallable")
    override fun unbind(argCount: Int): NativeCallable = throw NoSuchMethodException("Can't unbind a LambdaCallable")

    fun toNativeCallable(): NativeCallable {
        // We pass all params using jni as we're often in a context of sending parameters to cpp, so we should not rewind buffer.
        val ptr = Bridge.engine_call_constructor_kt_custom_callable(this, variantConverter.id, hashCode(), onCancelCall != null)
        return NativeCallable(ptr)
    }

    internal companion object : ParametersReader()
}
