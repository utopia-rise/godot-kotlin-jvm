@file:Suppress(
  "PackageDirectoryMismatch", "UNCHECKED_CAST",
  "unused",
  "NOTHING_TO_INLINE",
)

package godot.core

import godot.api.Object
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable

public inline fun Signal0.connect(flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT, noinline
    method: () -> Unit): Error = connectUnsafe(method.asCallable(), flags)

public fun <T : Object> Signal0.connect(
  target: T,
  method: T.() -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): Error = connectUnsafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0> Signal1<P0>.connect(flags: Object.ConnectFlags =
    Object.ConnectFlags.DEFAULT, noinline method: (p0: P0) -> Unit): Error =
    connectUnsafe(method.asCallable(), flags)

public fun <T : Object, P0> Signal1<P0>.connect(
  target: T,
  method: T.(p0: P0) -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): Error = connectUnsafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1> Signal2<P0, P1>.connect(flags: Object.ConnectFlags =
    Object.ConnectFlags.DEFAULT, noinline method: (p0: P0, p1: P1) -> Unit): Error =
    connectUnsafe(method.asCallable(), flags)

public fun <T : Object, P0, P1> Signal2<P0, P1>.connect(
  target: T,
  method: T.(p0: P0, p1: P1) -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): Error = connectUnsafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2>
    Signal3<P0, P1, P2>.connect(flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT, noinline
    method: (
  p0: P0,
  p1: P1,
  p2: P2,
) -> Unit): Error = connectUnsafe(method.asCallable(), flags)

public fun <T : Object, P0, P1, P2> Signal3<P0, P1, P2>.connect(
  target: T,
  method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
  ) -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): Error = connectUnsafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3>
    Signal4<P0, P1, P2, P3>.connect(flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
    noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
) -> Unit): Error = connectUnsafe(method.asCallable(), flags)

public fun <T : Object, P0, P1, P2, P3> Signal4<P0, P1, P2, P3>.connect(
  target: T,
  method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
  ) -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): Error = connectUnsafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4>
    Signal5<P0, P1, P2, P3, P4>.connect(flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
    noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
) -> Unit): Error = connectUnsafe(method.asCallable(), flags)

public fun <T : Object, P0, P1, P2, P3, P4> Signal5<P0, P1, P2, P3, P4>.connect(
  target: T,
  method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ) -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): Error = connectUnsafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5>
    Signal6<P0, P1, P2, P3, P4, P5>.connect(flags: Object.ConnectFlags =
    Object.ConnectFlags.DEFAULT, noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
) -> Unit): Error = connectUnsafe(method.asCallable(), flags)

public fun <T : Object, P0, P1, P2, P3, P4, P5> Signal6<P0, P1, P2, P3, P4, P5>.connect(
  target: T,
  method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): Error = connectUnsafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6> Signal7<P0, P1, P2, P3, P4, P5, P6>.connect(flags: Object.ConnectFlags =
    Object.ConnectFlags.DEFAULT, noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
) -> Unit): Error = connectUnsafe(method.asCallable(), flags)

public fun <T : Object, P0, P1, P2, P3, P4, P5, P6> Signal7<P0, P1, P2, P3, P4, P5, P6>.connect(
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
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): Error = connectUnsafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7> Signal8<P0, P1, P2, P3, P4, P5, P6, P7>.connect(flags: Object.ConnectFlags =
    Object.ConnectFlags.DEFAULT, noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
  p7: P7,
) -> Unit): Error = connectUnsafe(method.asCallable(), flags)

public fun <T : Object, P0, P1, P2, P3, P4, P5, P6, P7>
    Signal8<P0, P1, P2, P3, P4, P5, P6, P7>.connect(
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
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): Error = connectUnsafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8>
    Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8>.connect(flags: Object.ConnectFlags =
    Object.ConnectFlags.DEFAULT, noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
  p7: P7,
  p8: P8,
) -> Unit): Error = connectUnsafe(method.asCallable(), flags)

public fun <T : Object, P0, P1, P2, P3, P4, P5, P6, P7, P8>
    Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8>.connect(
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
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): Error = connectUnsafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9>
    Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>.connect(flags: Object.ConnectFlags =
    Object.ConnectFlags.DEFAULT, noinline method: (
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
) -> Unit): Error = connectUnsafe(method.asCallable(), flags)

public fun <T : Object, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>
    Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>.connect(
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
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): Error = connectUnsafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10>
    Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>.connect(flags: Object.ConnectFlags =
    Object.ConnectFlags.DEFAULT, noinline method: (
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
) -> Unit): Error = connectUnsafe(method.asCallable(), flags)

public fun <T : Object, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>
    Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>.connect(
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
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): Error = connectUnsafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11>
    Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>.connect(flags: Object.ConnectFlags =
    Object.ConnectFlags.DEFAULT, noinline method: (
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
) -> Unit): Error = connectUnsafe(method.asCallable(), flags)

public fun <T : Object, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>
    Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>.connect(
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
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): Error = connectUnsafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12>
    Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>.connect(flags: Object.ConnectFlags
    = Object.ConnectFlags.DEFAULT, noinline method: (
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
) -> Unit): Error = connectUnsafe(method.asCallable(), flags)

public fun <T : Object, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>
    Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>.connect(
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
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): Error = connectUnsafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13>
    Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>.connect(flags: Object.ConnectFlags
    = Object.ConnectFlags.DEFAULT, noinline method: (
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
) -> Unit): Error = connectUnsafe(method.asCallable(), flags)

public fun <T : Object, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>
    Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>.connect(
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
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): Error = connectUnsafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13,
    reified P14>
    Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>.connect(flags: Object.ConnectFlags
    = Object.ConnectFlags.DEFAULT, noinline method: (
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
) -> Unit): Error = connectUnsafe(method.asCallable(), flags)

public fun <T : Object, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>
    Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>.connect(
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
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): Error = connectUnsafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13,
    reified P14, reified P15>
    Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>.connect(flags: Object.ConnectFlags
    = Object.ConnectFlags.DEFAULT, noinline method: (
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
) -> Unit): Error = connectUnsafe(method.asCallable(), flags)

public fun <T : Object, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>
    Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>.connect(
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
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): Error = connectUnsafe(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)
