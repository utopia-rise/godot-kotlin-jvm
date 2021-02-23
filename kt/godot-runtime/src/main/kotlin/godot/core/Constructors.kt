@file:Suppress("UNCHECKED_CAST", "unused")

package godot.core

import godot.util.VoidPtr
import godot.util.threadLocal

abstract class KtConstructor<T: KtObject>(
    vararg argsTypes: Pair<VariantType, Boolean>
) {
    val parameterCount: Int = argsTypes.size
    val parameterTypes: Array<VariantType> = argsTypes.map { it.first }.toTypedArray()
    val parameterNullables: Array<Boolean> = argsTypes.map { it.second }.toTypedArray()

    abstract operator fun invoke(): T

    fun construct(rawPtr: VoidPtr, instanceId: Long) = KtObject.instantiateWith(rawPtr, instanceId) {
        val argsSize = TransferContext.buffer.int
        require(argsSize == parameterCount) {
            "Expecting $parameterCount parameter(s) for constructor, but got $argsSize instead."
        }
        for (i in 0 until parameterCount) {
            paramsArray[i] = TransferContext.readSingleArgument(parameterTypes[i], parameterNullables[i])
        }
        TransferContext.buffer.rewind()
        val instance = invoke()
        resetParamsArray()
        instance
    }

    companion object {
        val paramsArray by threadLocal { arrayOf<Any?>(null, null, null, null, null) }

        fun resetParamsArray() {
            paramsArray.fill(null)
        }
    }
}

class KtConstructor0<T: KtObject>(
    private val constructor: () -> T
) : KtConstructor<T>() {
    override fun invoke(): T {
        return constructor()
    }
}

class KtConstructor1<T: KtObject, P0: Any?>(
    private val constructor: (P0) -> T,
    p0Type: Pair<VariantType, Boolean>
) : KtConstructor<T>(p0Type) {
    override fun invoke(): T {
        return constructor(
            paramsArray[0] as P0
        )
    }
}

class KtConstructor2<T: KtObject, P0: Any?, P1: Any?>(
    private val constructor: (P0, P1) -> T,
    p0Type: Pair<VariantType, Boolean>,
    p1Type: Pair<VariantType, Boolean>
) : KtConstructor<T>(p0Type, p1Type) {
    override fun invoke(): T {
        return constructor(
            paramsArray[0] as P0,
            paramsArray[1] as P1
        )
    }
}

class KtConstructor3<T: KtObject, P0: Any?, P1: Any?, P2: Any?>(
    private val constructor: (P0, P1, P2) -> T,
    p0Type: Pair<VariantType, Boolean>,
    p1Type: Pair<VariantType, Boolean>,
    p2Type: Pair<VariantType, Boolean>
) : KtConstructor<T>(p0Type, p1Type, p2Type) {
    override fun invoke(): T {
        return constructor(
            paramsArray[0] as P0,
            paramsArray[1] as P1,
            paramsArray[2] as P2
        )
    }
}

class KtConstructor4<T: KtObject, P0: Any?, P1: Any?, P2: Any?, P3: Any?>(
    private val constructor: (P0, P1, P2, P3) -> T,
    p0Type: Pair<VariantType, Boolean>,
    p1Type: Pair<VariantType, Boolean>,
    p2Type: Pair<VariantType, Boolean>,
    p3Type: Pair<VariantType, Boolean>
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

class KtConstructor5<T: KtObject, P0: Any?, P1: Any?, P2: Any?, P3: Any?, P4: Any?>(
    private val constructor: (P0, P1, P2, P3, P4) -> T,
    p0Type: Pair<VariantType, Boolean>,
    p1Type: Pair<VariantType, Boolean>,
    p2Type: Pair<VariantType, Boolean>,
    p3Type: Pair<VariantType, Boolean>,
    p4Type: Pair<VariantType, Boolean>
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
