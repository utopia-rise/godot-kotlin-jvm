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
    private val types: List<VariantType> = parameterTypes.map { it.first }
    private val isNullables: List<Boolean> = parameterTypes.map { it.second }

    fun invoke(instance: T) {
        val argsSize = TransferContext.buffer.int
        require(argsSize == parameterCount) { "Expecting $parameterCount parameter(s) for function $name, but got $argsSize instead." }
        readArguments(argsSize)
        val ret = invokeKt(instance)
        resetParamsArray()

        TransferContext.writeReturnValue(ret, variantType)
    }

    private fun readArguments(argsSize: Int) {
        for (i in 0 until argsSize) {
            paramsArray[i] = TransferContext.readSingleArgument(types[i], isNullables[i])
        }
        TransferContext.buffer.rewind()
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
