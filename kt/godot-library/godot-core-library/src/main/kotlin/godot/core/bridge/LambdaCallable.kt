@file:Suppress("UNCHECKED_CAST", "PackageDirectoryMismatch", "unused")

package godot.core

import godot.common.interop.ObjectID
import godot.common.interop.VariantConverter
import godot.core.Callable.Bridge
import godot.internal.logging.GodotLogging
import godot.internal.memory.TransferContext

abstract class LambdaCallable<R> : Callable {
    protected abstract val container: LambdaContainer<R>

    override fun getBoundArguments() = VariantArray<Any?>()
    override fun getBoundArgumentCount() = 0
    override fun getMethod() = StringName()
    override fun getObject() = null
    override fun getObjectId() = ObjectID(0)
    override fun isCustom() = true
    override fun isNull() = false
    override fun isStandard() = false
    override fun isValid() = true
    override fun rpc(vararg args: Any?) = throw UnsupportedOperationException("Can't make a RPC call from a LambdaCallable")
    override fun rpcId(peerId: Long, vararg args: Any?) = throw UnsupportedOperationException("Can't make a RPC call from a LambdaCallable")
    override fun unbind(argCount: Int): NativeCallable = throw UnsupportedOperationException("Can't unbind a LambdaCallable")

    fun toNativeCallable(): NativeCallable {
        // We pass all params using jni as we're often in a context of sending parameters to cpp, so we should not rewind buffer.
        val ptr = Bridge.engine_call_constructor_kt_custom_callable(container, container.returnConverter.id, hashCode(), container.canBeCancelled())
        return NativeCallable(ptr)
    }

    /**
     * Get rid of the lambda contained in this Callable, this instance won't be usable anymore after calling it.
     * Custom Callable can create reference cycles between Godot and the JVM which can make part of your objects unable to be freed by the Garbage Collector.
     * This method is a last resort that can allow you to break a cycle caused by the Callable keeping its captured instance alive when itself is kept alive by the C++ side.
     */
    fun invalidate() = container.invalidate()

    /**
     * Code to run if the Callable is destroyed without ever being called once.
     * Used internal in the context of coroutines.
     */
    fun setAsCancellable(block: () -> Unit):  LambdaCallable<R>{
        container.onCancelCall = block
        return this
    }

    /*
    * Implement those Callable methods so they fallback to a NativeCallable created on the fly.
    * Inefficient but implemented for the sake of having all Callable's methods usable. The typed version of call() and callDeferred() are supposed to be used.
    */
    protected fun <R> asCallable(block: NativeCallable.() -> R) = toNativeCallable().block()
    override fun unsafeBind(vararg args: Any?) = asCallable { unsafeBind(*args) }
    override fun unsafeBindV(args: VariantArray<Any?>) = asCallable { unsafeBindV(args) }
    override fun unsafeCall(vararg args: Any?) = asCallable { unsafeCall(*args) as R }
    override fun unsafeCallDeferred(vararg args: Any?) = asCallable { unsafeCallDeferred(*args) }
    override fun unsafeCallV(args: VariantArray<Any?>) = asCallable { unsafeCallV(args) }
}

abstract class LambdaContainer<R>(
    val returnConverter: VariantConverter,
    val typeConverters: Array<VariantConverter>,
) {
    var onCancelCall: (() -> Unit)? = null

    fun canBeCancelled() = onCancelCall != null
    fun onCancel() = onCancelCall!!.invoke()

    abstract fun invalidate()
    abstract fun unsafeInvokeFromBuffer(): R

    fun invoke() = withParameters(typeConverters) {
        try {
            unsafeInvokeFromBuffer()
        } catch (t: Throwable) {
            GodotLogging.error("Error calling a JVM custom Callable from Godot:\n" + t.stackTraceToString())
        }
    }

    fun invokeWithReturn(): Any? = withParametersReturn(typeConverters) {
        val ret: Any? = null
        try {
            val ret = unsafeInvokeFromBuffer()
            TransferContext.writeReturnValue(ret, returnConverter)
        } catch (t: Throwable) {
            GodotLogging.error("Error calling a JVM custom Callable from Godot:\n" + t.stackTraceToString())
            TransferContext.writeReturnValue(null, VariantParser.NIL)
        }
        ret
    }

    internal companion object : ParametersReader()
}

class InvalidJvmLambdaException : Exception("This LambdaCallable has been invalidated, it shouldn't be called. Make sure to disconnect it from any signals")
