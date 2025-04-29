@file:Suppress("UNCHECKED_CAST", "PackageDirectoryMismatch", "unused")

package godot.core

import godot.common.interop.ObjectID
import godot.common.interop.VariantConverter
import godot.core.Callable.Bridge
import godot.internal.logging.GodotLogging
import godot.internal.memory.TransferContext
import kotlin.collections.addAll

abstract class LambdaCallable<R>(
    protected val container: LambdaContainer<R>
) : Callable {
    protected val boundArgs = mutableListOf<Any?>()

    override fun getBoundArguments() = boundArgs
    override fun getBoundArgumentCount() = boundArgs.size
    override fun getMethod() = StringName()
    override fun getObject() = null
    override fun getObjectId() = ObjectID(0)
    override fun isCustom() = true
    override fun isNull() = false
    override fun isStandard() = false
    override fun isValid() = true
    override fun rpc(vararg args: Any?) = throw UnsupportedOperationException("Can't make a RPC call from a LambdaCallable")
    override fun rpcId(peerId: Long, vararg args: Any?) = throw UnsupportedOperationException("Can't make a RPC call from a LambdaCallable")
    override fun unbind(argCount: Int) = toVariantCallable().unbind(argCount)
    override fun unsafeBind(vararg args: Any?) = apply { boundArgs.addAll(args) }
    override fun unsafeCall(vararg args: Any?) = container.unsafeInvoke(args.toList() + boundArgs)
    override fun unsafeCallDeferred(vararg args: Any?) {
        val ptr = Bridge.engine_call_constructor_lambda_callable(container, container.returnConverter.id, hashCode())
        // We could use the [toVariantCallable] function, but we want to avoid 1 additional JNI calls in case we have bound arguments.
        VariantCallable(ptr).unsafeCallDeferred(args.toList() + boundArgs)
    }

    /**
     * Get rid of the lambda contained in this Callable, this instance won't be usable anymore after calling it.
     * Custom Callable can create reference cycles between Godot and the JVM which can make part of your objects unable to be freed by the Garbage Collector.
     * This method is a last resort that can allow you to break a cycle caused by the Callable keeping its captured instance alive when itself is kept alive by the C++ side.
     */
    fun invalidate() = container.invalidate()
    fun toVariantCallable(): VariantCallable {
        // We pass all params using jni as we're often in a context of sending parameters to cpp, so we should not rewind buffer.
        val ptr = Bridge.engine_call_constructor_lambda_callable(container, container.returnConverter.id, hashCode())
        return VariantCallable(ptr).also {
            if (boundArgs.isNotEmpty()) {
                it.unsafeBind(boundArgs)
            }
        }
    }
}

abstract class LambdaContainer<R>(
    val returnConverter: VariantConverter,
    val typeConverters: Array<VariantConverter>,
    var function: Function<R>?
) {
    var cancelFunction: (() -> Unit)? = null
    fun cancel() = cancelFunction?.invoke()

    fun setAsCancellable(signal: Signal, block: () -> Unit) {
        cancelFunction = block
        Bridge.engine_call_constructor_lambda_callable(this, this.returnConverter.id, hashCode())
    }

    abstract fun unsafeInvoke(vararg args: Any?): R

    fun invoke() = withParameters(typeConverters) {
        try {
            unsafeInvoke(paramsArray)
        } catch (t: Throwable) {
            GodotLogging.error("Error calling a JVM custom Callable from Godot:\n" + t.stackTraceToString())
        }
    }

    fun invokeWithReturn(): Any? = withParametersReturn(typeConverters) {
        val ret: Any? = null
        try {
            val ret = unsafeInvoke(paramsArray)
            TransferContext.writeReturnValue(ret, returnConverter)
        } catch (t: Throwable) {
            GodotLogging.error("Error calling a JVM custom Callable from Godot:\n" + t.stackTraceToString())
            TransferContext.writeReturnValue(null, VariantParser.NIL)
        }
        ret
    }

    fun invalidate(): Unit {
        function = null
    }

    internal companion object : ParametersReader()
}

class InvalidJvmLambdaException : Exception("This LambdaCallable has been invalidated, it shouldn't be called. Make sure to disconnect it from any signals")
