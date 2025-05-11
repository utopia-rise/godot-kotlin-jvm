@file:Suppress(
  "PackageDirectoryMismatch", "UNCHECKED_CAST",
  "unused",
)

package godot.core

import kotlin.Suppress

public interface Callable0<R> : Callable {
  public fun call(): R = callUnsafe() as R

  public fun callDeferred() = callDeferredUnsafe()

  public operator fun invoke(): R = call()
}

public interface Callable1<R, P0> : Callable {
  public fun call(p0: P0): R = callUnsafe(p0) as R

  public fun callDeferred(p0: P0) = callDeferredUnsafe(p0)

  public operator fun invoke(p0: P0): R = call(p0)

  public fun bind(p0: P0): Callable0<R>
}

public interface Callable2<R, P0, P1> : Callable {
  public fun call(p0: P0, p1: P1): R = callUnsafe(p0, p1) as R

  public fun callDeferred(p0: P0, p1: P1) = callDeferredUnsafe(p0, p1)

  public operator fun invoke(p0: P0, p1: P1): R = call(p0, p1)

  public fun bind(p0: P0, p1: P1): Callable0<R>

  public fun bind(p1: P1): Callable1<R, P0>
}

public interface Callable3<R, P0, P1, P2> : Callable {
  public fun call(
    p0: P0,
    p1: P1,
    p2: P2,
  ): R = callUnsafe(p0, p1, p2) as R

  public fun callDeferred(
    p0: P0,
    p1: P1,
    p2: P2,
  ) = callDeferredUnsafe(p0, p1, p2)

  public operator fun invoke(
    p0: P0,
    p1: P1,
    p2: P2,
  ): R = call(p0, p1, p2)

  public fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
  ): Callable0<R>

  public fun bind(p1: P1, p2: P2): Callable1<R, P0>

  public fun bind(p2: P2): Callable2<R, P0, P1>
}

public interface Callable4<R, P0, P1, P2, P3> : Callable {
  public fun call(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
  ): R = callUnsafe(p0, p1, p2, p3) as R

  public fun callDeferred(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
  ) = callDeferredUnsafe(p0, p1, p2, p3)

  public operator fun invoke(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
  ): R = call(p0, p1, p2, p3)

  public fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
  ): Callable0<R>

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
  ): Callable1<R, P0>

  public fun bind(p2: P2, p3: P3): Callable2<R, P0, P1>

  public fun bind(p3: P3): Callable3<R, P0, P1, P2>
}

public interface Callable5<R, P0, P1, P2, P3, P4> : Callable {
  public fun call(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ): R = callUnsafe(p0, p1, p2, p3, p4) as R

  public fun callDeferred(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ) = callDeferredUnsafe(p0, p1, p2, p3, p4)

  public operator fun invoke(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ): R = call(p0, p1, p2, p3, p4)

  public fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ): Callable0<R>

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ): Callable1<R, P0>

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
  ): Callable2<R, P0, P1>

  public fun bind(p3: P3, p4: P4): Callable3<R, P0, P1, P2>

  public fun bind(p4: P4): Callable4<R, P0, P1, P2, P3>
}

public interface Callable6<R, P0, P1, P2, P3, P4, P5> : Callable {
  public fun call(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ): R = callUnsafe(p0, p1, p2, p3, p4, p5) as R

  public fun callDeferred(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) = callDeferredUnsafe(p0, p1, p2, p3, p4, p5)

  public operator fun invoke(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ): R = call(p0, p1, p2, p3, p4, p5)

  public fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ): Callable0<R>

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ): Callable1<R, P0>

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ): Callable2<R, P0, P1>

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
  ): Callable3<R, P0, P1, P2>

  public fun bind(p4: P4, p5: P5): Callable4<R, P0, P1, P2, P3>

  public fun bind(p5: P5): Callable5<R, P0, P1, P2, P3, P4>
}

public interface Callable7<R, P0, P1, P2, P3, P4, P5, P6> : Callable {
  public fun call(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ): R = callUnsafe(p0, p1, p2, p3, p4, p5, p6) as R

  public fun callDeferred(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) = callDeferredUnsafe(p0, p1, p2, p3, p4, p5, p6)

  public operator fun invoke(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ): R = call(p0, p1, p2, p3, p4, p5, p6)

  public fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ): Callable0<R>

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ): Callable1<R, P0>

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ): Callable2<R, P0, P1>

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ): Callable3<R, P0, P1, P2>

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
  ): Callable4<R, P0, P1, P2, P3>

  public fun bind(p5: P5, p6: P6): Callable5<R, P0, P1, P2, P3, P4>

  public fun bind(p6: P6): Callable6<R, P0, P1, P2, P3, P4, P5>
}

public interface Callable8<R, P0, P1, P2, P3, P4, P5, P6, P7> : Callable {
  public fun call(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ): R = callUnsafe(p0, p1, p2, p3, p4, p5, p6, p7) as R

  public fun callDeferred(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) = callDeferredUnsafe(p0, p1, p2, p3, p4, p5, p6, p7)

  public operator fun invoke(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ): R = call(p0, p1, p2, p3, p4, p5, p6, p7)

  public fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ): Callable0<R>

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ): Callable1<R, P0>

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ): Callable2<R, P0, P1>

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ): Callable3<R, P0, P1, P2>

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ): Callable4<R, P0, P1, P2, P3>

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
  ): Callable5<R, P0, P1, P2, P3, P4>

  public fun bind(p6: P6, p7: P7): Callable6<R, P0, P1, P2, P3, P4, P5>

  public fun bind(p7: P7): Callable7<R, P0, P1, P2, P3, P4, P5, P6>
}

public interface Callable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8> : Callable {
  public fun call(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ): R = callUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8) as R

  public fun callDeferred(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) = callDeferredUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8)

  public operator fun invoke(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ): R = call(p0, p1, p2, p3, p4, p5, p6, p7, p8)

  public fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ): Callable0<R>

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ): Callable1<R, P0>

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ): Callable2<R, P0, P1>

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ): Callable3<R, P0, P1, P2>

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ): Callable4<R, P0, P1, P2, P3>

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ): Callable5<R, P0, P1, P2, P3, P4>

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
  ): Callable6<R, P0, P1, P2, P3, P4, P5>

  public fun bind(p7: P7, p8: P8): Callable7<R, P0, P1, P2, P3, P4, P5, P6>

  public fun bind(p8: P8): Callable8<R, P0, P1, P2, P3, P4, P5, P6, P7>
}

public interface Callable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> : Callable {
  public fun call(
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
  ): R = callUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) as R

  public fun callDeferred(
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
  ) = callDeferredUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)

  public operator fun invoke(
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
  ): R = call(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)

  public fun bind(
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
  ): Callable0<R>

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ): Callable1<R, P0>

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ): Callable2<R, P0, P1>

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ): Callable3<R, P0, P1, P2>

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ): Callable4<R, P0, P1, P2, P3>

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ): Callable5<R, P0, P1, P2, P3, P4>

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ): Callable6<R, P0, P1, P2, P3, P4, P5>

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
  ): Callable7<R, P0, P1, P2, P3, P4, P5, P6>

  public fun bind(p8: P8, p9: P9): Callable8<R, P0, P1, P2, P3, P4, P5, P6, P7>

  public fun bind(p9: P9): Callable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>
}

public interface Callable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> : Callable {
  public fun call(
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
  ): R = callUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) as R

  public fun callDeferred(
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
  ) = callDeferredUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)

  public operator fun invoke(
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
  ): R = call(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)

  public fun bind(
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
  ): Callable0<R>

  public fun bind(
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
  ): Callable1<R, P0>

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ): Callable2<R, P0, P1>

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ): Callable3<R, P0, P1, P2>

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ): Callable4<R, P0, P1, P2, P3>

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ): Callable5<R, P0, P1, P2, P3, P4>

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ): Callable6<R, P0, P1, P2, P3, P4, P5>

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ): Callable7<R, P0, P1, P2, P3, P4, P5, P6>

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
  ): Callable8<R, P0, P1, P2, P3, P4, P5, P6, P7>

  public fun bind(p9: P9, p10: P10): Callable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>

  public fun bind(p10: P10): Callable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>
}

public interface Callable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> : Callable {
  public fun call(
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
  ): R = callUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) as R

  public fun callDeferred(
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
  ) = callDeferredUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)

  public operator fun invoke(
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
  ): R = call(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)

  public fun bind(
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
  ): Callable0<R>

  public fun bind(
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
  ): Callable1<R, P0>

  public fun bind(
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
  ): Callable2<R, P0, P1>

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ): Callable3<R, P0, P1, P2>

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ): Callable4<R, P0, P1, P2, P3>

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ): Callable5<R, P0, P1, P2, P3, P4>

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ): Callable6<R, P0, P1, P2, P3, P4, P5>

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ): Callable7<R, P0, P1, P2, P3, P4, P5, P6>

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ): Callable8<R, P0, P1, P2, P3, P4, P5, P6, P7>

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
  ): Callable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>

  public fun bind(p10: P10, p11: P11): Callable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>

  public fun bind(p11: P11): Callable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>
}

public interface Callable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> : Callable {
  public fun call(
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
  ): R = callUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) as R

  public fun callDeferred(
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
  ) = callDeferredUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)

  public operator fun invoke(
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
  ): R = call(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)

  public fun bind(
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
  ): Callable0<R>

  public fun bind(
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
  ): Callable1<R, P0>

  public fun bind(
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
  ): Callable2<R, P0, P1>

  public fun bind(
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
  ): Callable3<R, P0, P1, P2>

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ): Callable4<R, P0, P1, P2, P3>

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ): Callable5<R, P0, P1, P2, P3, P4>

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ): Callable6<R, P0, P1, P2, P3, P4, P5>

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ): Callable7<R, P0, P1, P2, P3, P4, P5, P6>

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ): Callable8<R, P0, P1, P2, P3, P4, P5, P6, P7>

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ): Callable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>

  public fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
  ): Callable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>

  public fun bind(p11: P11, p12: P12): Callable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>

  public fun bind(p12: P12): Callable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>
}

public interface Callable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> :
    Callable {
  public fun call(
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
  ): R = callUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) as R

  public fun callDeferred(
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
  ) = callDeferredUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)

  public operator fun invoke(
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
  ): R = call(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)

  public fun bind(
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
  ): Callable0<R>

  public fun bind(
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
  ): Callable1<R, P0>

  public fun bind(
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
  ): Callable2<R, P0, P1>

  public fun bind(
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
  ): Callable3<R, P0, P1, P2>

  public fun bind(
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
  ): Callable4<R, P0, P1, P2, P3>

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ): Callable5<R, P0, P1, P2, P3, P4>

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ): Callable6<R, P0, P1, P2, P3, P4, P5>

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ): Callable7<R, P0, P1, P2, P3, P4, P5, P6>

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ): Callable8<R, P0, P1, P2, P3, P4, P5, P6, P7>

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ): Callable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>

  public fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ): Callable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>

  public fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
  ): Callable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>

  public fun bind(p12: P12, p13: P13):
      Callable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>

  public fun bind(p13: P13): Callable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>
}

public interface Callable15<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> :
    Callable {
  public fun call(
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
  ): R = callUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) as R

  public fun callDeferred(
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
  ) = callDeferredUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14)

  public operator fun invoke(
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
  ): R = call(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14)

  public fun bind(
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
  ): Callable0<R>

  public fun bind(
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
  ): Callable1<R, P0>

  public fun bind(
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
  ): Callable2<R, P0, P1>

  public fun bind(
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
  ): Callable3<R, P0, P1, P2>

  public fun bind(
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
  ): Callable4<R, P0, P1, P2, P3>

  public fun bind(
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
  ): Callable5<R, P0, P1, P2, P3, P4>

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ): Callable6<R, P0, P1, P2, P3, P4, P5>

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ): Callable7<R, P0, P1, P2, P3, P4, P5, P6>

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ): Callable8<R, P0, P1, P2, P3, P4, P5, P6, P7>

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ): Callable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>

  public fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ): Callable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>

  public fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ): Callable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>

  public fun bind(
    p12: P12,
    p13: P13,
    p14: P14,
  ): Callable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>

  public fun bind(p13: P13, p14: P14):
      Callable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>

  public fun bind(p14: P14):
      Callable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>
}

public interface Callable16<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>
    : Callable {
  public fun call(
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
  ): R = callUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) as R

  public fun callDeferred(
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
  ) = callDeferredUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)

  public operator fun invoke(
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
  ): R = call(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)

  public fun bind(
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
  ): Callable0<R>

  public fun bind(
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
  ): Callable1<R, P0>

  public fun bind(
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
  ): Callable2<R, P0, P1>

  public fun bind(
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
  ): Callable3<R, P0, P1, P2>

  public fun bind(
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
  ): Callable4<R, P0, P1, P2, P3>

  public fun bind(
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
  ): Callable5<R, P0, P1, P2, P3, P4>

  public fun bind(
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
  ): Callable6<R, P0, P1, P2, P3, P4, P5>

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ): Callable7<R, P0, P1, P2, P3, P4, P5, P6>

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ): Callable8<R, P0, P1, P2, P3, P4, P5, P6, P7>

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ): Callable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>

  public fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ): Callable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>

  public fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ): Callable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>

  public fun bind(
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ): Callable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>

  public fun bind(
    p13: P13,
    p14: P14,
    p15: P15,
  ): Callable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>

  public fun bind(p14: P14, p15: P15):
      Callable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>

  public fun bind(p15: P15):
      Callable15<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>
}
