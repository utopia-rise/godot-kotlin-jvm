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

class TargetedCall9<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, P5 : Any?, P6 : Any?, P7 : Any?, P8 : Any?, R : Any?>(
    private val function: T.(P0, P1, P2, P3, P4, P5, P6, P7, P8) -> R,
    variantType: VariantType,
    p0Type: Pair<VariantType, Boolean>,
    p1Type: Pair<VariantType, Boolean>,
    p2Type: Pair<VariantType, Boolean>,
    p3Type: Pair<VariantType, Boolean>,
    p4Type: Pair<VariantType, Boolean>,
    p5Type: Pair<VariantType, Boolean>,
    p6Type: Pair<VariantType, Boolean>,
    p7Type: Pair<VariantType, Boolean>,
    p8Type: Pair<VariantType, Boolean>
) : KtCallable<T, R>(this.toString(), 9, variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type) {
    override fun invokeKt(instance: T): R = instance.function(
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
        paramsArray[4] as P4,
        paramsArray[5] as P5,
        paramsArray[6] as P6,
        paramsArray[7] as P7,
        paramsArray[8] as P8
    )
}

class TargetedCall10<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, P5 : Any?, P6 : Any?, P7 : Any?, P8 : Any?, P9 : Any?, R : Any?>(
    private val function: T.(P0, P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R,
    variantType: VariantType,
    p0Type: Pair<VariantType, Boolean>,
    p1Type: Pair<VariantType, Boolean>,
    p2Type: Pair<VariantType, Boolean>,
    p3Type: Pair<VariantType, Boolean>,
    p4Type: Pair<VariantType, Boolean>,
    p5Type: Pair<VariantType, Boolean>,
    p6Type: Pair<VariantType, Boolean>,
    p7Type: Pair<VariantType, Boolean>,
    p8Type: Pair<VariantType, Boolean>,
    p9Type: Pair<VariantType, Boolean>
) : KtCallable<T, R>(this.toString(), 10, variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type) {
    override fun invokeKt(instance: T): R = instance.function(
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
        paramsArray[4] as P4,
        paramsArray[5] as P5,
        paramsArray[6] as P6,
        paramsArray[7] as P7,
        paramsArray[8] as P8,
        paramsArray[9] as P9
    )
}

class TargetedCall11<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, P5 : Any?, P6 : Any?, P7 : Any?, P8 : Any?, P9 : Any?, P10 : Any?, R : Any?>(
    private val function: T.(P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R,
    variantType: VariantType,
    p0Type: Pair<VariantType, Boolean>,
    p1Type: Pair<VariantType, Boolean>,
    p2Type: Pair<VariantType, Boolean>,
    p3Type: Pair<VariantType, Boolean>,
    p4Type: Pair<VariantType, Boolean>,
    p5Type: Pair<VariantType, Boolean>,
    p6Type: Pair<VariantType, Boolean>,
    p7Type: Pair<VariantType, Boolean>,
    p8Type: Pair<VariantType, Boolean>,
    p9Type: Pair<VariantType, Boolean>,
    p10Type: Pair<VariantType, Boolean>
) : KtCallable<T, R>(this.toString(), 11, variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type) {
    override fun invokeKt(instance: T): R = instance.function(
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
        paramsArray[4] as P4,
        paramsArray[5] as P5,
        paramsArray[6] as P6,
        paramsArray[7] as P7,
        paramsArray[8] as P8,
        paramsArray[9] as P9,
        paramsArray[10] as P10
    )
}

class TargetedCall12<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, P5 : Any?, P6 : Any?, P7 : Any?, P8 : Any?, P9 : Any?, P10 : Any?, P11 : Any?, R : Any?>(
    private val function: T.(P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R,
    variantType: VariantType,
    p0Type: Pair<VariantType, Boolean>,
    p1Type: Pair<VariantType, Boolean>,
    p2Type: Pair<VariantType, Boolean>,
    p3Type: Pair<VariantType, Boolean>,
    p4Type: Pair<VariantType, Boolean>,
    p5Type: Pair<VariantType, Boolean>,
    p6Type: Pair<VariantType, Boolean>,
    p7Type: Pair<VariantType, Boolean>,
    p8Type: Pair<VariantType, Boolean>,
    p9Type: Pair<VariantType, Boolean>,
    p10Type: Pair<VariantType, Boolean>,
    p11Type: Pair<VariantType, Boolean>
) : KtCallable<T, R>(this.toString(), 12, variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type) {
    override fun invokeKt(instance: T): R = instance.function(
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
        paramsArray[4] as P4,
        paramsArray[5] as P5,
        paramsArray[6] as P6,
        paramsArray[7] as P7,
        paramsArray[8] as P8,
        paramsArray[9] as P9,
        paramsArray[10] as P10,
        paramsArray[11] as P11
    )
}

class TargetedCall13<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, P5 : Any?, P6 : Any?, P7 : Any?, P8 : Any?, P9 : Any?, P10 : Any?, P11 : Any?, P12 : Any?, R : Any?>(
    private val function: T.(P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R,
    variantType: VariantType,
    p0Type: Pair<VariantType, Boolean>,
    p1Type: Pair<VariantType, Boolean>,
    p2Type: Pair<VariantType, Boolean>,
    p3Type: Pair<VariantType, Boolean>,
    p4Type: Pair<VariantType, Boolean>,
    p5Type: Pair<VariantType, Boolean>,
    p6Type: Pair<VariantType, Boolean>,
    p7Type: Pair<VariantType, Boolean>,
    p8Type: Pair<VariantType, Boolean>,
    p9Type: Pair<VariantType, Boolean>,
    p10Type: Pair<VariantType, Boolean>,
    p11Type: Pair<VariantType, Boolean>,
    p12Type: Pair<VariantType, Boolean>
) : KtCallable<T, R>(this.toString(), 13, variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type) {
    override fun invokeKt(instance: T): R = instance.function(
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
        paramsArray[4] as P4,
        paramsArray[5] as P5,
        paramsArray[6] as P6,
        paramsArray[7] as P7,
        paramsArray[8] as P8,
        paramsArray[9] as P9,
        paramsArray[10] as P10,
        paramsArray[11] as P11,
        paramsArray[12] as P12
    )
}

class TargetedCall14<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, P5 : Any?, P6 : Any?, P7 : Any?, P8 : Any?, P9 : Any?, P10 : Any?, P11 : Any?, P12 : Any?, P13 : Any?, R : Any?>(
    private val function: T.(P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R,
    variantType: VariantType,
    p0Type: Pair<VariantType, Boolean>,
    p1Type: Pair<VariantType, Boolean>,
    p2Type: Pair<VariantType, Boolean>,
    p3Type: Pair<VariantType, Boolean>,
    p4Type: Pair<VariantType, Boolean>,
    p5Type: Pair<VariantType, Boolean>,
    p6Type: Pair<VariantType, Boolean>,
    p7Type: Pair<VariantType, Boolean>,
    p8Type: Pair<VariantType, Boolean>,
    p9Type: Pair<VariantType, Boolean>,
    p10Type: Pair<VariantType, Boolean>,
    p11Type: Pair<VariantType, Boolean>,
    p12Type: Pair<VariantType, Boolean>,
    p13Type: Pair<VariantType, Boolean>
) : KtCallable<T, R>(this.toString(), 14, variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type, p13Type) {
    override fun invokeKt(instance: T): R = instance.function(
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
        paramsArray[4] as P4,
        paramsArray[5] as P5,
        paramsArray[6] as P6,
        paramsArray[7] as P7,
        paramsArray[8] as P8,
        paramsArray[9] as P9,
        paramsArray[10] as P10,
        paramsArray[11] as P11,
        paramsArray[12] as P12,
        paramsArray[13] as P13
    )
}

class TargetedCall15<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, P5 : Any?, P6 : Any?, P7 : Any?, P8 : Any?, P9 : Any?, P10 : Any?, P11 : Any?, P12 : Any?, P13 : Any?, P14 : Any?, R : Any?>(
    private val function: T.(P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R,
    variantType: VariantType,
    p0Type: Pair<VariantType, Boolean>,
    p1Type: Pair<VariantType, Boolean>,
    p2Type: Pair<VariantType, Boolean>,
    p3Type: Pair<VariantType, Boolean>,
    p4Type: Pair<VariantType, Boolean>,
    p5Type: Pair<VariantType, Boolean>,
    p6Type: Pair<VariantType, Boolean>,
    p7Type: Pair<VariantType, Boolean>,
    p8Type: Pair<VariantType, Boolean>,
    p9Type: Pair<VariantType, Boolean>,
    p10Type: Pair<VariantType, Boolean>,
    p11Type: Pair<VariantType, Boolean>,
    p12Type: Pair<VariantType, Boolean>,
    p13Type: Pair<VariantType, Boolean>,
    p14Type: Pair<VariantType, Boolean>
) : KtCallable<T, R>(this.toString(), 15, variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type, p13Type, p14Type) {
    override fun invokeKt(instance: T): R = instance.function(
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
        paramsArray[4] as P4,
        paramsArray[5] as P5,
        paramsArray[6] as P6,
        paramsArray[7] as P7,
        paramsArray[8] as P8,
        paramsArray[9] as P9,
        paramsArray[10] as P10,
        paramsArray[11] as P11,
        paramsArray[12] as P12,
        paramsArray[13] as P13,
        paramsArray[14] as P14
    )
}

class TargetedCall16<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, P5 : Any?, P6 : Any?, P7 : Any?, P8 : Any?, P9 : Any?, P10 : Any?, P11 : Any?, P12 : Any?, P13 : Any?, P14 : Any?, P15 : Any?, R : Any?>(
    private val function: T.(P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R,
    variantType: VariantType,
    p0Type: Pair<VariantType, Boolean>,
    p1Type: Pair<VariantType, Boolean>,
    p2Type: Pair<VariantType, Boolean>,
    p3Type: Pair<VariantType, Boolean>,
    p4Type: Pair<VariantType, Boolean>,
    p5Type: Pair<VariantType, Boolean>,
    p6Type: Pair<VariantType, Boolean>,
    p7Type: Pair<VariantType, Boolean>,
    p8Type: Pair<VariantType, Boolean>,
    p9Type: Pair<VariantType, Boolean>,
    p10Type: Pair<VariantType, Boolean>,
    p11Type: Pair<VariantType, Boolean>,
    p12Type: Pair<VariantType, Boolean>,
    p13Type: Pair<VariantType, Boolean>,
    p14Type: Pair<VariantType, Boolean>,
    p15Type: Pair<VariantType, Boolean>
) : KtCallable<T, R>(this.toString(), 16, variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type, p13Type, p14Type, p15Type) {
    override fun invokeKt(instance: T): R = instance.function(
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
        paramsArray[4] as P4,
        paramsArray[5] as P5,
        paramsArray[6] as P6,
        paramsArray[7] as P7,
        paramsArray[8] as P8,
        paramsArray[9] as P9,
        paramsArray[10] as P10,
        paramsArray[11] as P11,
        paramsArray[12] as P12,
        paramsArray[13] as P13,
        paramsArray[14] as P14,
        paramsArray[15] as P15
    )
}


