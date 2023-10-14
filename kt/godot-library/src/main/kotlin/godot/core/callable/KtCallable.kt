package godot.core.callable

import godot.core.KtObject
import godot.core.memory.TransferContext
import godot.core.VariantType
import godot.tools.common.constants.Constraints
import godot.util.threadLocal

abstract class KtCallable<T : KtObject, R : Any?>(
    private val name: String,
    val parameterCount: Int,
    val variantType: VariantType,
    vararg parameterTypes: Pair<VariantType, Boolean>
) {
    private val types: Array<VariantType> = parameterTypes.map { it.first }.toTypedArray()
    private val isNullables: Array<Boolean> = parameterTypes.map { it.second }.toTypedArray()

    fun invoke(instance: T) {
        TransferContext.readArguments(types, isNullables, paramsArray)
        val ret = invokeKt(instance)
        resetParamsArray()

        TransferContext.writeReturnValue(ret, variantType)
    }

    companion object {
        val paramsArray by threadLocal {
            Array<Any?>(Constraints.MAX_FUNCTION_ARG_COUNT) {
                null
            }
        }

        fun resetParamsArray() {
            paramsArray.fill(null)
        }
    }

    internal abstract fun invokeKt(instance: T): R
}
