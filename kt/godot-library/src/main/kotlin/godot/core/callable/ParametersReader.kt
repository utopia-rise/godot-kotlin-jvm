package godot.core.callable

import godot.core.VariantType
import godot.core.memory.TransferContext
import godot.global.GD
import godot.tools.common.constants.Constraints
import godot.util.threadLocal

internal open class ParametersReader {
    val paramsArray by threadLocal {
        Array<Any?>(Constraints.MAX_FUNCTION_ARG_COUNT) {
            null
        }
    }

    private fun resetParamsArray() {
        paramsArray.fill(null)
    }

    internal inline fun withParameters(types: Array<VariantType>, isNullables: Array<Boolean>, code: () -> Unit) {
        TransferContext.readArguments(types, isNullables, paramsArray)
        try {
            code()
        } catch (t: Throwable) {
            GD.printErr("Error calling a JVM method from Godot:", t.stackTraceToString())
        }
        resetParamsArray()
    }

    internal inline fun <R> withParametersReturn(
        types: Array<VariantType>,
        isNullables: Array<Boolean>,
        variantType: VariantType,
        code: () -> R
    ): Any? {
        TransferContext.readArguments(types, isNullables, paramsArray)

        var ret: Any? = Unit
        try {
            ret = code()
            TransferContext.writeReturnValue(ret, variantType)
        } catch (t: Throwable) {
            GD.printErr("Error calling a JVM method from Godot:", t.stackTraceToString())
            TransferContext.writeReturnValue(null, VariantType.NIL)
        }

        resetParamsArray()
        return ret
    }
}