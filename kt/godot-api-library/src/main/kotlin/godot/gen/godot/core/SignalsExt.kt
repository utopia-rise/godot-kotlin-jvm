@file:Suppress(
    "PackageDirectoryMismatch",
    "NOTHING_TO_INLINE",
    "UNUSED_PARAMETER",
)
@file:JvmName("SignalsExt")

package godot.core

import godot.Object
import godot.extensions.connectThreadSafeVararg
import kotlin.Any
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.reflect.KCallable

public fun <T : Object> Signal0.connectThreadSafeVararg(
    target: T,
    method: T.() -> Unit,
    flags: Int = 0,
): Any? =
        connectThreadSafeVararg(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun Signal0.connectThreadSafeVararg(flags: Int = 0, noinline method: () -> Unit): Any?
        = connectThreadSafeVararg(method.asCallable(), flags)

public fun <P0, T : Object> Signal1<P0>.connectThreadSafeVararg(
    target: T,
    method: T.(p0: P0) -> Unit,
    flags: Int = 0,
): Any? =
        connectThreadSafeVararg(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0> Signal1<P0>.connectThreadSafeVararg(flags: Int = 0, noinline
        method: (p0: P0) -> Unit): Any? = connectThreadSafeVararg(method.asCallable(), flags)

public fun <P0, P1, T : Object> Signal2<P0, P1>.connectThreadSafeVararg(
    target: T,
    method: T.(p0: P0, p1: P1) -> Unit,
    flags: Int = 0,
): Any? =
        connectThreadSafeVararg(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1> Signal2<P0, P1>.connectThreadSafeVararg(flags: Int = 0,
        noinline method: (p0: P0, p1: P1) -> Unit): Any? =
        connectThreadSafeVararg(method.asCallable(), flags)

public fun <P0, P1, P2, T : Object> Signal3<P0, P1, P2>.connectThreadSafeVararg(
    target: T,
    method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
    ) -> Unit,
    flags: Int = 0,
): Any? =
        connectThreadSafeVararg(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2>
        Signal3<P0, P1, P2>.connectThreadSafeVararg(flags: Int = 0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
) -> Unit): Any? = connectThreadSafeVararg(method.asCallable(), flags)

public fun <P0, P1, P2, P3, T : Object> Signal4<P0, P1, P2, P3>.connectThreadSafeVararg(
    target: T,
    method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
    ) -> Unit,
    flags: Int = 0,
): Any? =
        connectThreadSafeVararg(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3>
        Signal4<P0, P1, P2, P3>.connectThreadSafeVararg(flags: Int = 0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
) -> Unit): Any? = connectThreadSafeVararg(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, T : Object> Signal5<P0, P1, P2, P3, P4>.connectThreadSafeVararg(
    target: T,
    method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
    ) -> Unit,
    flags: Int = 0,
): Any? =
        connectThreadSafeVararg(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4>
        Signal5<P0, P1, P2, P3, P4>.connectThreadSafeVararg(flags: Int = 0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
) -> Unit): Any? = connectThreadSafeVararg(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, P5, T : Object>
        Signal6<P0, P1, P2, P3, P4, P5>.connectThreadSafeVararg(
    target: T,
    method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
    ) -> Unit,
    flags: Int = 0,
): Any? =
        connectThreadSafeVararg(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5>
        Signal6<P0, P1, P2, P3, P4, P5>.connectThreadSafeVararg(flags: Int = 0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
) -> Unit): Any? = connectThreadSafeVararg(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, P5, P6, T : Object>
        Signal7<P0, P1, P2, P3, P4, P5, P6>.connectThreadSafeVararg(
    target: T,
    method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
    ) -> Unit,
    flags: Int = 0,
): Any? =
        connectThreadSafeVararg(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6> Signal7<P0, P1, P2, P3, P4, P5, P6>.connectThreadSafeVararg(flags: Int = 0, noinline
        method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
) -> Unit): Any? = connectThreadSafeVararg(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, P5, P6, P7, T : Object>
        Signal8<P0, P1, P2, P3, P4, P5, P6, P7>.connectThreadSafeVararg(
    target: T,
    method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
    ) -> Unit,
    flags: Int = 0,
): Any? =
        connectThreadSafeVararg(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7> Signal8<P0, P1, P2, P3, P4, P5, P6, P7>.connectThreadSafeVararg(flags: Int =
        0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
) -> Unit): Any? = connectThreadSafeVararg(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, T : Object>
        Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8>.connectThreadSafeVararg(
    target: T,
    method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
    ) -> Unit,
    flags: Int = 0,
): Any? =
        connectThreadSafeVararg(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8>
        Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8>.connectThreadSafeVararg(flags: Int = 0, noinline
        method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
) -> Unit): Any? = connectThreadSafeVararg(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, T : Object>
        Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>.connectThreadSafeVararg(
    target: T,
    method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
    ) -> Unit,
    flags: Int = 0,
): Any? =
        connectThreadSafeVararg(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8, reified P9>
        Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>.connectThreadSafeVararg(flags: Int = 0,
        noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
) -> Unit): Any? = connectThreadSafeVararg(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, T : Object>
        Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>.connectThreadSafeVararg(
    target: T,
    method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
    ) -> Unit,
    flags: Int = 0,
): Any? =
        connectThreadSafeVararg(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8, reified P9, reified P10>
        Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>.connectThreadSafeVararg(flags: Int =
        0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
) -> Unit): Any? = connectThreadSafeVararg(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, T : Object>
        Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>.connectThreadSafeVararg(
    target: T,
    method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
    ) -> Unit,
    flags: Int = 0,
): Any? =
        connectThreadSafeVararg(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8, reified P9, reified P10, reified P11>
        Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>.connectThreadSafeVararg(flags: Int
        = 0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
) -> Unit): Any? = connectThreadSafeVararg(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, T : Object>
        Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>.connectThreadSafeVararg(
    target: T,
    method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
    ) -> Unit,
    flags: Int = 0,
): Any? =
        connectThreadSafeVararg(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12>
        Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>.connectThreadSafeVararg(flags: Int
        = 0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
) -> Unit): Any? = connectThreadSafeVararg(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, T : Object>
        Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>.connectThreadSafeVararg(
    target: T,
    method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
    ) -> Unit,
    flags: Int = 0,
): Any? =
        connectThreadSafeVararg(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13>
        Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>.connectThreadSafeVararg(flags: Int
        = 0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
) -> Unit): Any? = connectThreadSafeVararg(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, T : Object>
        Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>.connectThreadSafeVararg(
    target: T,
    method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
    ) -> Unit,
    flags: Int = 0,
): Any? =
        connectThreadSafeVararg(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13,
        reified P14>
        Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>.connectThreadSafeVararg(flags: Int
        = 0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
) -> Unit): Any? = connectThreadSafeVararg(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, T : Object>
        Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>.connectThreadSafeVararg(
    target: T,
    method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
    ) -> Unit,
    flags: Int = 0,
): Any? =
        connectThreadSafeVararg(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13,
        reified P14, reified P15>
        Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>.connectThreadSafeVararg(flags: Int
        = 0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
) -> Unit): Any? = connectThreadSafeVararg(method.asCallable(), flags)
