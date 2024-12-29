@file:Suppress(
    "PackageDirectoryMismatch",
    "NOTHING_TO_INLINE",
    "UNUSED_PARAMETER",
)
@file:JvmName("SignalsExt")

package godot.extension

import godot.api.Object
import godot.core.Callable
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal10
import godot.core.Signal11
import godot.core.Signal12
import godot.core.Signal13
import godot.core.Signal14
import godot.core.Signal15
import godot.core.Signal16
import godot.core.Signal2
import godot.core.Signal3
import godot.core.Signal4
import godot.core.Signal5
import godot.core.Signal6
import godot.core.Signal7
import godot.core.Signal8
import godot.core.Signal9
import godot.core.asCallable
import godot.core.toGodotName
import godot.extension.connectThreadSafe
import kotlin.Any
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.reflect.KCallable

public fun <T : Object> Signal0.connectThreadSafe(
    target: T,
    method: T.() -> Unit,
    flags: Int = 0,
): Any? = connectThreadSafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun Signal0.connectThreadSafe(flags: Int = 0, noinline method: () -> Unit): Any? =
        connectThreadSafe(method.asCallable(), flags)

public fun <P0, T : Object> Signal1<P0>.connectThreadSafe(
    target: T,
    method: T.(p0: P0) -> Unit,
    flags: Int = 0,
): Any? = connectThreadSafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0> Signal1<P0>.connectThreadSafe(flags: Int = 0, noinline
        method: (p0: P0) -> Unit): Any? = connectThreadSafe(method.asCallable(), flags)

public fun <P0, P1, T : Object> Signal2<P0, P1>.connectThreadSafe(
    target: T,
    method: T.(p0: P0, p1: P1) -> Unit,
    flags: Int = 0,
): Any? = connectThreadSafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1> Signal2<P0, P1>.connectThreadSafe(flags: Int = 0,
        noinline method: (p0: P0, p1: P1) -> Unit): Any? =
        connectThreadSafe(method.asCallable(), flags)

public fun <P0, P1, P2, T : Object> Signal3<P0, P1, P2>.connectThreadSafe(
    target: T,
    method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
    ) -> Unit,
    flags: Int = 0,
): Any? = connectThreadSafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2>
        Signal3<P0, P1, P2>.connectThreadSafe(flags: Int = 0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
) -> Unit): Any? = connectThreadSafe(method.asCallable(), flags)

public fun <P0, P1, P2, P3, T : Object> Signal4<P0, P1, P2, P3>.connectThreadSafe(
    target: T,
    method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
    ) -> Unit,
    flags: Int = 0,
): Any? = connectThreadSafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3>
        Signal4<P0, P1, P2, P3>.connectThreadSafe(flags: Int = 0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
) -> Unit): Any? = connectThreadSafe(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, T : Object> Signal5<P0, P1, P2, P3, P4>.connectThreadSafe(
    target: T,
    method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
    ) -> Unit,
    flags: Int = 0,
): Any? = connectThreadSafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4>
        Signal5<P0, P1, P2, P3, P4>.connectThreadSafe(flags: Int = 0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
) -> Unit): Any? = connectThreadSafe(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, P5, T : Object> Signal6<P0, P1, P2, P3, P4, P5>.connectThreadSafe(
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
): Any? = connectThreadSafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5>
        Signal6<P0, P1, P2, P3, P4, P5>.connectThreadSafe(flags: Int = 0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
) -> Unit): Any? = connectThreadSafe(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, P5, P6, T : Object>
        Signal7<P0, P1, P2, P3, P4, P5, P6>.connectThreadSafe(
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
): Any? = connectThreadSafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6> Signal7<P0, P1, P2, P3, P4, P5, P6>.connectThreadSafe(flags: Int = 0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
) -> Unit): Any? = connectThreadSafe(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, P5, P6, P7, T : Object>
        Signal8<P0, P1, P2, P3, P4, P5, P6, P7>.connectThreadSafe(
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
): Any? = connectThreadSafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7> Signal8<P0, P1, P2, P3, P4, P5, P6, P7>.connectThreadSafe(flags: Int = 0,
        noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
) -> Unit): Any? = connectThreadSafe(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, T : Object>
        Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8>.connectThreadSafe(
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
): Any? = connectThreadSafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8>
        Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8>.connectThreadSafe(flags: Int = 0, noinline
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
) -> Unit): Any? = connectThreadSafe(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, T : Object>
        Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>.connectThreadSafe(
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
): Any? = connectThreadSafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8, reified P9>
        Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>.connectThreadSafe(flags: Int = 0, noinline
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
    p9: P9,
) -> Unit): Any? = connectThreadSafe(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, T : Object>
        Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>.connectThreadSafe(
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
): Any? = connectThreadSafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8, reified P9, reified P10>
        Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>.connectThreadSafe(flags: Int = 0,
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
    p10: P10,
) -> Unit): Any? = connectThreadSafe(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, T : Object>
        Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>.connectThreadSafe(
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
): Any? = connectThreadSafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8, reified P9, reified P10, reified P11>
        Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>.connectThreadSafe(flags: Int = 0,
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
    p10: P10,
    p11: P11,
) -> Unit): Any? = connectThreadSafe(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, T : Object>
        Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>.connectThreadSafe(
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
): Any? = connectThreadSafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12>
        Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>.connectThreadSafe(flags: Int
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
) -> Unit): Any? = connectThreadSafe(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, T : Object>
        Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>.connectThreadSafe(
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
): Any? = connectThreadSafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13>
        Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>.connectThreadSafe(flags: Int
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
) -> Unit): Any? = connectThreadSafe(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, T : Object>
        Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>.connectThreadSafe(
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
): Any? = connectThreadSafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13,
        reified P14>
        Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>.connectThreadSafe(flags: Int
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
) -> Unit): Any? = connectThreadSafe(method.asCallable(), flags)

public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, T : Object>
        Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>.connectThreadSafe(
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
): Any? = connectThreadSafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13,
        reified P14, reified P15>
        Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>.connectThreadSafe(flags: Int
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
) -> Unit): Any? = connectThreadSafe(method.asCallable(), flags)
