package godot.core.callable

import godot.core.KtObject
import godot.core.VariantType
import godot.core.memory.TransferContext
import godot.global.GD
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
        try {
            invokeKt(instance)
        } catch (t: Throwable) {
            GD.printErr("Error calling a JVM method from Godot:", t.stackTrace)
        }
        resetParamsArray()
    }

    fun invokeWithReturn(instance: T): Any? {
        TransferContext.readArguments(types, isNullables, paramsArray)

        var ret: Any? = Unit
        try {
            ret = invokeKt(instance)
            TransferContext.writeReturnValue(ret, variantType)
        } catch (t: Throwable) {
            GD.printErr("Error calling a JVM method from Godot:", t.stackTrace)
            TransferContext.writeReturnValue(null, VariantType.NIL)
        }
        resetParamsArray()
        return ret
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
