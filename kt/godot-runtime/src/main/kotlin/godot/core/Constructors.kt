@file:Suppress("UNCHECKED_CAST", "unused")

package godot.core

abstract class KtConstructor<T: KtObject?>(
    vararg argsTypes: Pair<VariantType, Boolean>
) {
    val parameterCount: Int = argsTypes.size
    val parameterTypes: Array<VariantType> = argsTypes.map { it.first }.toTypedArray()
    val parameterNullables: Array<Boolean> = argsTypes.map { it.second }.toTypedArray()

    abstract operator fun invoke(vararg args: Any?): T
}

class KtConstructor0<T: KtObject?>(
    private val constructor: () -> T
) : KtConstructor<T>() {
    override fun invoke(vararg args: Any?): T {
        return constructor()
    }
}

class KtConstructor1<T: KtObject?, P0: Any?>(
    private val constructor: (P0) -> T,
    p0Type: Pair<VariantType, Boolean>
) : KtConstructor<T>(p0Type) {
    override fun invoke(vararg args: Any?): T {
        return constructor(
            args[0] as P0
        )
    }
}

class KtConstructor2<T: KtObject?, P0: Any?, P1: Any?>(
    private val constructor: (P0, P1) -> T,
    p0Type: Pair<VariantType, Boolean>,
    p1Type: Pair<VariantType, Boolean>
) : KtConstructor<T>(p0Type, p1Type) {
    override fun invoke(vararg args: Any?): T {
        return constructor(
            args[0] as P0,
            args[1] as P1
        )
    }
}

class KtConstructor3<T: KtObject?, P0: Any?, P1: Any?, P2: Any?>(
    private val constructor: (P0, P1, P2) -> T,
    p0Type: Pair<VariantType, Boolean>,
    p1Type: Pair<VariantType, Boolean>,
    p2Type: Pair<VariantType, Boolean>
) : KtConstructor<T>(p0Type, p1Type, p2Type) {
    override fun invoke(vararg args: Any?): T {
        return constructor(
            args[0] as P0,
            args[1] as P1,
            args[2] as P2
        )
    }
}

class KtConstructor4<T: KtObject?, P0: Any?, P1: Any?, P2: Any?, P3: Any?>(
    private val constructor: (P0, P1, P2, P3) -> T,
    p0Type: Pair<VariantType, Boolean>,
    p1Type: Pair<VariantType, Boolean>,
    p2Type: Pair<VariantType, Boolean>,
    p3Type: Pair<VariantType, Boolean>
) : KtConstructor<T>(p0Type, p1Type, p2Type, p3Type) {
    override fun invoke(vararg args: Any?): T {
        return constructor(
            args[0] as P0,
            args[1] as P1,
            args[2] as P2,
            args[3] as P3
        )
    }
}

class KtConstructor5<T: KtObject?, P0: Any?, P1: Any?, P2: Any?, P3: Any?, P4: Any?>(
    private val constructor: (P0, P1, P2, P3, P4) -> T,
    p0Type: Pair<VariantType, Boolean>,
    p1Type: Pair<VariantType, Boolean>,
    p2Type: Pair<VariantType, Boolean>,
    p3Type: Pair<VariantType, Boolean>,
    p4Type: Pair<VariantType, Boolean>
) : KtConstructor<T>(p0Type, p1Type, p2Type, p3Type, p4Type) {
    override fun invoke(vararg args: Any?): T {
        return constructor(
            args[0] as P0,
            args[1] as P1,
            args[2] as P2,
            args[3] as P3,
            args[4] as P4
        )
    }
}