@file:Suppress("UNCHECKED_CAST")

package godot.core.callable

import godot.core.VariantType
import godot.core.Callable
import godot.util.VoidPtr

abstract class KtCallable<R : Any?>(
    internal val variantType: VariantType,
    vararg parameterTypes: Pair<VariantType, Boolean>
) : Callable {
    private val types: Array<VariantType> = parameterTypes.map { it.first }.toTypedArray()
    private val isNullables: Array<Boolean> = parameterTypes.map { it.second }.toTypedArray()

    val returnVariantType: Int
        get() = variantType.ordinal

    fun invokeNoReturn(): Unit = withParameters(types, isNullables) {
        invokeKt()
    }

    fun invokeWithReturn(): Any? = withParametersReturn(types, isNullables, variantType) {
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
