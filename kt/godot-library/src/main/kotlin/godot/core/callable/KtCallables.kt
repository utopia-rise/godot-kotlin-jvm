@file:Suppress("UNCHECKED_CAST")

package godot.core.callable

import godot.core.KtObject
import godot.core.VariantType

class TargetedCall<T : KtObject, R : Any?>(
    private val function: T.() -> R,
    variantType: VariantType
) : KtCallable<T, R>(this.toString(), 0, variantType) {
    override fun invokeKt(instance: T) = instance.function()
}

class TargetedCall1<T : KtObject, P0 : Any?, R : Any?>(
    private val function: T.(P0) -> R,
    variantType: VariantType,
    p0Type: Pair<VariantType, Boolean>
) : KtCallable<T, R>(this.toString(), 1, variantType, p0Type) {
    override fun invokeKt(instance: T): R = instance.function(paramsArray[0] as P0)
}

class TargetedCall2<T : KtObject, P0 : Any?, P1 : Any?, R : Any?>(
    private val function: T.(P0, P1) -> R,
    variantType: VariantType,
    p0Type: Pair<VariantType, Boolean>,
    p1Type: Pair<VariantType, Boolean>
) : KtCallable<T, R>(this.toString(), 1, variantType, p0Type, p1Type) {
    override fun invokeKt(instance: T): R = instance.function(
        paramsArray[0] as P0,
        paramsArray[1] as P1
    )
}

class TargetedCall3<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, R : Any?>(
    private val function: T.(P0, P1, P2) -> R,
    variantType: VariantType,
    p0Type: Pair<VariantType, Boolean>,
    p1Type: Pair<VariantType, Boolean>,
    p2Type: Pair<VariantType, Boolean>
) : KtCallable<T, R>(this.toString(), 1, variantType, p0Type, p1Type, p2Type) {
    override fun invokeKt(instance: T): R = instance.function(
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2
    )
}

class TargetedCall4<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, R : Any?>(
    private val function: T.(P0, P1, P2, P3) -> R,
    variantType: VariantType,
    p0Type: Pair<VariantType, Boolean>,
    p1Type: Pair<VariantType, Boolean>,
    p2Type: Pair<VariantType, Boolean>,
    p3Type: Pair<VariantType, Boolean>
) : KtCallable<T, R>(this.toString(), 1, variantType, p0Type, p1Type, p2Type, p3Type) {
    override fun invokeKt(instance: T): R = instance.function(
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3
    )
}

class TargetedCall5<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, R : Any?>(
    private val function: T.(P0, P1, P2, P3, P4) -> R,
    variantType: VariantType,
    p0Type: Pair<VariantType, Boolean>,
    p1Type: Pair<VariantType, Boolean>,
    p2Type: Pair<VariantType, Boolean>,
    p3Type: Pair<VariantType, Boolean>,
    p4Type: Pair<VariantType, Boolean>
) : KtCallable<T, R>(this.toString(), 1, variantType, p0Type, p1Type, p2Type, p3Type, p4Type) {
    override fun invokeKt(instance: T): R = instance.function(
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
        paramsArray[4] as P4
    )
}

class TargetedCall6<
    T : KtObject,
    P0 : Any?,
    P1 : Any?,
    P2 : Any?,
    P3 : Any?,
    P4 : Any?,
    P5 : Any?,
    R : Any?,
    >(
    private val function: T.(P0, P1, P2, P3, P4, P5) -> R,
    variantType: VariantType,
    p0Type: Pair<VariantType, Boolean>,
    p1Type: Pair<VariantType, Boolean>,
    p2Type: Pair<VariantType, Boolean>,
    p3Type: Pair<VariantType, Boolean>,
    p4Type: Pair<VariantType, Boolean>,
    p5Type: Pair<VariantType, Boolean>,
) : KtCallable<T, R>(this.toString(), 1, variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) {
    override fun invokeKt(instance: T): R = instance.function(
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
        paramsArray[4] as P4,
        paramsArray[5] as P5,
    )
}

class TargetedCall7<
    T : KtObject,
    P0 : Any?,
    P1 : Any?,
    P2 : Any?,
    P3 : Any?,
    P4 : Any?,
    P5 : Any?,
    P6 : Any?,
    R : Any?,
    >(
    private val function: T.(P0, P1, P2, P3, P4, P5, P6) -> R,
    variantType: VariantType,
    p0Type: Pair<VariantType, Boolean>,
    p1Type: Pair<VariantType, Boolean>,
    p2Type: Pair<VariantType, Boolean>,
    p3Type: Pair<VariantType, Boolean>,
    p4Type: Pair<VariantType, Boolean>,
    p5Type: Pair<VariantType, Boolean>,
    p6Type: Pair<VariantType, Boolean>,
) : KtCallable<T, R>(this.toString(), 1, variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) {
    override fun invokeKt(instance: T): R = instance.function(
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
        paramsArray[4] as P4,
        paramsArray[5] as P5,
        paramsArray[6] as P6,
    )
}

class TargetedCall8<
    T : KtObject,
    P0 : Any?,
    P1 : Any?,
    P2 : Any?,
    P3 : Any?,
    P4 : Any?,
    P5 : Any?,
    P6 : Any?,
    P7 : Any?,
    R : Any?,
    >(
    private val function: T.(P0, P1, P2, P3, P4, P5, P6, P7) -> R,
    variantType: VariantType,
    p0Type: Pair<VariantType, Boolean>,
    p1Type: Pair<VariantType, Boolean>,
    p2Type: Pair<VariantType, Boolean>,
    p3Type: Pair<VariantType, Boolean>,
    p4Type: Pair<VariantType, Boolean>,
    p5Type: Pair<VariantType, Boolean>,
    p6Type: Pair<VariantType, Boolean>,
    p7Type: Pair<VariantType, Boolean>,
) : KtCallable<T, R>(this.toString(), 1, variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) {
    override fun invokeKt(instance: T): R = instance.function(
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


