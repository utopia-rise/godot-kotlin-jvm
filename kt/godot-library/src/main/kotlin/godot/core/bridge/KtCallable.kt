@file:Suppress("UNCHECKED_CAST", "PackageDirectoryMismatch")

package godot.core

import godot.core.memory.TransferContext
import godot.util.GodotLogging
import godot.util.VoidPtr

abstract class KtCallable<R : Any?>(
    internal val variantConverter: VariantConverter,
    vararg parameterTypes: VariantConverter
) : Callable {
    private val types: Array<VariantConverter> = parameterTypes.toList().toTypedArray()

    val returnVariantType: Int
        get() = variantConverter.id

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
            TransferContext.writeReturnValue(ret, variantConverter)
        } catch (t: Throwable) {
            GodotLogging.error("Error calling a JVM custom Callable from Godot:\n" + t.stackTraceToString())
            TransferContext.writeReturnValue(null, VariantParser.NIL)
        }
        ret
    }

    internal abstract fun invokeKt(): R

    internal companion object : ParametersReader()

    internal fun wrapInCustomCallable(): VoidPtr = Bridge.wrap_in_custom_callable(this, variantConverter.id, hashCode())

    @Suppress("FunctionName")
    private object Bridge {
        external fun wrap_in_custom_callable(instance: KtCallable<*>, variantTypeOrdinal: Int, hashCode: Int): VoidPtr
    }
}

