@file:Suppress("UNCHECKED_CAST")

package godot.core.callable

import godot.core.Callable
import godot.core.VariantConverter
import godot.util.VoidPtr

abstract class KtCallable<R : Any?>(
    internal val variantConverter: VariantConverter,
    vararg parameterTypes: VariantConverter
) : Callable {
    private val types: Array<VariantConverter> = parameterTypes.toList().toTypedArray()

    val returnVariantType: Int
        get() = variantConverter.id

    fun invokeNoReturn(): Unit = withParameters(types) {
        invokeKt()
    }

    fun invokeWithReturn(): Any? = withParametersReturn(types, variantConverter) {
        invokeKt()
    }

    internal abstract fun invokeKt(): R

    internal companion object : ParametersReader()

    internal fun wrapInCustomCallable(): VoidPtr = Bridge.wrap_in_custom_callable(this, variantConverter.id, hashCode())

    @Suppress("FunctionName")
    private object Bridge {
        external fun wrap_in_custom_callable(instance: KtCallable<*>,variantTypeOrdinal: Int, hashCode: Int): VoidPtr
    }
}
