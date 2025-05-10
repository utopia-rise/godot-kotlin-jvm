package godot.core

import godot.internal.memory.TransferContext
import godot.common.constants.Constraints
import godot.common.interop.VariantConverter
import godot.common.util.threadLocal

internal open class ParametersReader {
    val paramsArray by threadLocal {
        Array<Any?>(Constraints.MAX_FUNCTION_ARG_COUNT) {
            null
        }
    }

    internal inline fun withParameters(types: Array<VariantConverter>, code: () -> Unit) {
        TransferContext.readArguments(types, paramsArray)
        code()
        paramsArray.fill(null, 0, types.size)
    }

    internal inline fun <R> withParametersReturn(
        types: Array<VariantConverter>,
        code: () -> R
    ): Any? {
        TransferContext.readArguments(types, paramsArray)
        val ret = code()
        paramsArray.fill(null, 0, types.size)
        return ret
    }
}

