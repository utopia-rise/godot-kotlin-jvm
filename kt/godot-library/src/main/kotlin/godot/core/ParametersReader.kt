package godot.core

import godot.core.memory.TransferContext
import godot.common.constants.Constraints
import godot.common.util.threadLocal

internal open class ParametersReader {
    val paramsArray by threadLocal {
        Array<Any?>(Constraints.MAX_FUNCTION_ARG_COUNT) {
            null
        }
    }

    private fun resetParamsArray() {
        paramsArray.fill(null)
    }

    internal inline fun withParameters(types: Array<VariantConverter>, code: () -> Unit) {
        TransferContext.readArguments(types, paramsArray)
        code()
        resetParamsArray()
    }

    internal inline fun <R> withParametersReturn(
        types: Array<VariantConverter>,
        code: () -> R
    ): Any? {
        TransferContext.readArguments(types, paramsArray)
        val ret = code()
        resetParamsArray()
        return ret
    }
}

