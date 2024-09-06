@file:Suppress("UNCHECKED_CAST", "unused")

package godot.core

import godot.core.memory.MemoryManager
import godot.core.memory.TransferContext
import godot.tools.common.constants.Constraints
import godot.util.VoidPtr
import godot.util.threadLocal

abstract class KtConstructor<T : KtObject>(
    vararg argsTypes: VariantType
) {
    val parameterCount: Int = argsTypes.size
    val parameterTypes: Array<VariantConverter> = argsTypes.toList().toTypedArray()
    abstract operator fun invoke(): T

    fun construct(rawPtr: VoidPtr, instanceId: Long) = MemoryManager.createScript(rawPtr, instanceId) {
        TransferContext.readArguments(parameterTypes, paramsArray)
        val instance = invoke()
        resetParamsArray()
        instance
    }

    companion object {
        val paramsArray by threadLocal { arrayOfNulls<Any>(Constraints.MAX_CONSTRUCTOR_ARG_COUNT) }

        fun resetParamsArray() {
            paramsArray.fill(null)
        }
    }
}

class KtConstructor0<T : KtObject>(
    private val constructor: () -> T
) : KtConstructor<T>() {
    override fun invoke(): T {
        return constructor()
    }
}

class KtConstructor1<T : KtObject, P0 : Any?>(
    private val constructor: (P0) -> T,
    p0Type: VariantType
) : KtConstructor<T>(p0Type) {
    override fun invoke(): T {
        return constructor(
            paramsArray[0] as P0
        )
    }
}

class KtConstructor2<T : KtObject, P0 : Any?, P1 : Any?>(
    private val constructor: (P0, P1) -> T,
    p0Type: VariantType,
    p1Type: VariantType
) : KtConstructor<T>(p0Type, p1Type) {
    override fun invoke(): T {
        return constructor(
            paramsArray[0] as P0,
            paramsArray[1] as P1
        )
    }
}

class KtConstructor3<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?>(
    private val constructor: (P0, P1, P2) -> T,
    p0Type: VariantType,
    p1Type: VariantType,
    p2Type: VariantType
) : KtConstructor<T>(p0Type, p1Type, p2Type) {
    override fun invoke(): T {
        return constructor(
            paramsArray[0] as P0,
            paramsArray[1] as P1,
            paramsArray[2] as P2
        )
    }
}

class KtConstructor4<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?>(
    private val constructor: (P0, P1, P2, P3) -> T,
    p0Type: VariantType,
    p1Type: VariantType,
    p2Type: VariantType,
    p3Type: VariantType
) : KtConstructor<T>(p0Type, p1Type, p2Type, p3Type) {
    override fun invoke(): T {
        return constructor(
            paramsArray[0] as P0,
            paramsArray[1] as P1,
            paramsArray[2] as P2,
            paramsArray[3] as P3
        )
    }
}

class KtConstructor5<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?>(
    private val constructor: (P0, P1, P2, P3, P4) -> T,
    p0Type: VariantType,
    p1Type: VariantType,
    p2Type: VariantType,
    p3Type: VariantType,
    p4Type: VariantType
) : KtConstructor<T>(p0Type, p1Type, p2Type, p3Type, p4Type) {
    override fun invoke(): T {
        return constructor(
            paramsArray[0] as P0,
            paramsArray[1] as P1,
            paramsArray[2] as P2,
            paramsArray[3] as P3,
            paramsArray[4] as P4
        )
    }
}

class KtConstructor6<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, P5 : Any?>(
    private val constructor: (P0, P1, P2, P3, P4, P5) -> T,
    p0Type: VariantType,
    p1Type: VariantType,
    p2Type: VariantType,
    p3Type: VariantType,
    p4Type: VariantType,
    p5Type: VariantType,
) : KtConstructor<T>(p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) {
    override fun invoke(): T {
        return constructor(
            paramsArray[0] as P0,
            paramsArray[1] as P1,
            paramsArray[2] as P2,
            paramsArray[3] as P3,
            paramsArray[4] as P4,
            paramsArray[5] as P5,
        )
    }
}

class KtConstructor7<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, P5 : Any?, P6 : Any?>(
    private val constructor: (P0, P1, P2, P3, P4, P5, P6) -> T,
    p0Type: VariantType,
    p1Type: VariantType,
    p2Type: VariantType,
    p3Type: VariantType,
    p4Type: VariantType,
    p5Type: VariantType,
    p6Type: VariantType,
) : KtConstructor<T>(p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) {
    override fun invoke(): T {
        return constructor(
            paramsArray[0] as P0,
            paramsArray[1] as P1,
            paramsArray[2] as P2,
            paramsArray[3] as P3,
            paramsArray[4] as P4,
            paramsArray[5] as P5,
            paramsArray[6] as P6,
        )
    }
}

class KtConstructor8<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, P5 : Any?, P6 : Any?, P7 : Any?>(
    private val constructor: (P0, P1, P2, P3, P4, P5, P6, P7) -> T,
    p0Type: VariantType,
    p1Type: VariantType,
    p2Type: VariantType,
    p3Type: VariantType,
    p4Type: VariantType,
    p5Type: VariantType,
    p6Type: VariantType,
    p7Type: VariantType,
) : KtConstructor<T>(p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) {
    override fun invoke(): T {
        return constructor(
            paramsArray[0] as P0,
            paramsArray[1] as P1,
            paramsArray[2] as P2,
            paramsArray[3] as P3,
            paramsArray[4] as P4,
            paramsArray[5] as P5,
            paramsArray[6] as P6,
            paramsArray[7] as P7,
        )
    }
}
