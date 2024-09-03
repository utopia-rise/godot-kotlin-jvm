@file:Suppress("UNCHECKED_CAST")

package godot.core.callable

import godot.core.Callable
import godot.core.VariantType
import godot.util.VoidPtr

abstract class KtCallable<R : Any?>(
    internal val variantType: VariantType,
    vararg parameterTypes: VariantType
) : Callable {
    private val types: Array<VariantType> = parameterTypes.toList().toTypedArray()

    val returnVariantType: Int
        get() = variantType.ordinal

    fun invokeNoReturn(): Unit = withParameters(types) {
        invokeKt()
    }

    fun invokeWithReturn(): Any? = withParametersReturn(types, variantType) {
        invokeKt()
    }

    internal abstract fun invokeKt(): R

    internal companion object : ParametersReader()

    internal fun wrapInCustomCallable(): VoidPtr = Bridge.wrap_in_custom_callable(this, variantType.ordinal, hashCode())

    @Suppress("FunctionName")
    private object Bridge {
        external fun wrap_in_custom_callable(instance: KtCallable<*>,variantTypeOrdinal: Int, hashCode: Int): VoidPtr
    }
}
