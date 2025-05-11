@file:Suppress(
  "PackageDirectoryMismatch", "UNCHECKED_CAST",
  "unused",
)

package godot.core

import godot.api.Object
import kotlin.Any
import kotlin.Array
import kotlin.PublishedApi
import kotlin.Suppress
import kotlin.reflect.KCallable

public class MethodCallable0<R> @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs), Callable0<R>

public fun <T : Object, R> T.callable0(callable: T.() -> R) =
    MethodCallable0<R>(this, (callable as KCallable<R>).name.toGodotName())

public class MethodCallable1<R, P0> @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs), Callable1<R, P0> {
  public override fun bind(p0: P0) = MethodCallable0<R>(target, methodName, arrayOf<Any?>(p0,
      *boundArgs))
}

public fun <T : Object, R, P0> T.callable1(callable: T.(p0: P0) -> R) =
    MethodCallable1<R, P0>(this, (callable as KCallable<R>).name.toGodotName())

public class MethodCallable2<R, P0, P1> @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs), Callable2<R, P0, P1> {
  public override fun bind(p0: P0, p1: P1) = MethodCallable0<R>(target, methodName,
      arrayOf<Any?>(p0, p1, *boundArgs))

  public override fun bind(p1: P1) = MethodCallable1<R, P0>(target, methodName, arrayOf<Any?>(p1,
      *boundArgs))
}

public fun <T : Object, R, P0, P1> T.callable2(callable: T.(p0: P0, p1: P1) -> R) =
    MethodCallable2<R, P0, P1>(this, (callable as KCallable<R>).name.toGodotName())

public class MethodCallable3<R, P0, P1, P2> @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs), Callable3<R, P0, P1, P2> {
  public override fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
  ) = MethodCallable0<R>(target, methodName, arrayOf<Any?>(p0, p1, p2, *boundArgs))

  public override fun bind(p1: P1, p2: P2) = MethodCallable1<R, P0>(target, methodName,
      arrayOf<Any?>(p1, p2, *boundArgs))

  public override fun bind(p2: P2) = MethodCallable2<R, P0, P1>(target, methodName,
      arrayOf<Any?>(p2, *boundArgs))
}

public fun <T : Object, R, P0, P1, P2> T.callable3(callable: T.(
  p0: P0,
  p1: P1,
  p2: P2,
) -> R) = MethodCallable3<R, P0, P1, P2>(this, (callable as KCallable<R>).name.toGodotName())

public class MethodCallable4<R, P0, P1, P2, P3> @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs), Callable4<R, P0, P1, P2, P3> {
  public override fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
  ) = MethodCallable0<R>(target, methodName, arrayOf<Any?>(p0, p1, p2, p3, *boundArgs))

  public override fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
  ) = MethodCallable1<R, P0>(target, methodName, arrayOf<Any?>(p1, p2, p3, *boundArgs))

  public override fun bind(p2: P2, p3: P3) = MethodCallable2<R, P0, P1>(target, methodName,
      arrayOf<Any?>(p2, p3, *boundArgs))

  public override fun bind(p3: P3) = MethodCallable3<R, P0, P1, P2>(target, methodName,
      arrayOf<Any?>(p3, *boundArgs))
}

public fun <T : Object, R, P0, P1, P2, P3> T.callable4(callable: T.(
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
) -> R) = MethodCallable4<R, P0, P1, P2, P3>(this, (callable as KCallable<R>).name.toGodotName())

public class MethodCallable5<R, P0, P1, P2, P3, P4> @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs), Callable5<R, P0, P1, P2, P3, P4> {
  public override fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ) = MethodCallable0<R>(target, methodName, arrayOf<Any?>(p0, p1, p2, p3, p4, *boundArgs))

  public override fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ) = MethodCallable1<R, P0>(target, methodName, arrayOf<Any?>(p1, p2, p3, p4, *boundArgs))

  public override fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
  ) = MethodCallable2<R, P0, P1>(target, methodName, arrayOf<Any?>(p2, p3, p4, *boundArgs))

  public override fun bind(p3: P3, p4: P4) = MethodCallable3<R, P0, P1, P2>(target, methodName,
      arrayOf<Any?>(p3, p4, *boundArgs))

  public override fun bind(p4: P4) = MethodCallable4<R, P0, P1, P2, P3>(target, methodName,
      arrayOf<Any?>(p4, *boundArgs))
}

public fun <T : Object, R, P0, P1, P2, P3, P4> T.callable5(callable: T.(
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
) -> R) =
    MethodCallable5<R, P0, P1, P2, P3, P4>(this, (callable as KCallable<R>).name.toGodotName())

public class MethodCallable6<R, P0, P1, P2, P3, P4, P5> @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs), Callable6<R, P0, P1, P2, P3, P4, P5> {
  public override fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) = MethodCallable0<R>(target, methodName, arrayOf<Any?>(p0, p1, p2, p3, p4, p5, *boundArgs))

  public override fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) = MethodCallable1<R, P0>(target, methodName, arrayOf<Any?>(p1, p2, p3, p4, p5, *boundArgs))

  public override fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) = MethodCallable2<R, P0, P1>(target, methodName, arrayOf<Any?>(p2, p3, p4, p5, *boundArgs))

  public override fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
  ) = MethodCallable3<R, P0, P1, P2>(target, methodName, arrayOf<Any?>(p3, p4, p5, *boundArgs))

  public override fun bind(p4: P4, p5: P5) = MethodCallable4<R, P0, P1, P2, P3>(target, methodName,
      arrayOf<Any?>(p4, p5, *boundArgs))

  public override fun bind(p5: P5) = MethodCallable5<R, P0, P1, P2, P3, P4>(target, methodName,
      arrayOf<Any?>(p5, *boundArgs))
}

public fun <T : Object, R, P0, P1, P2, P3, P4, P5> T.callable6(callable: T.(
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
) -> R) =
    MethodCallable6<R, P0, P1, P2, P3, P4, P5>(this, (callable as KCallable<R>).name.toGodotName())

public class MethodCallable7<R, P0, P1, P2, P3, P4, P5, P6> @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs), Callable7<R, P0, P1, P2, P3, P4, P5, P6> {
  public override fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) = MethodCallable0<R>(target, methodName, arrayOf<Any?>(p0, p1, p2, p3, p4, p5, p6, *boundArgs))

  public override fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) = MethodCallable1<R, P0>(target, methodName, arrayOf<Any?>(p1, p2, p3, p4, p5, p6, *boundArgs))

  public override fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) = MethodCallable2<R, P0, P1>(target, methodName, arrayOf<Any?>(p2, p3, p4, p5, p6, *boundArgs))

  public override fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) = MethodCallable3<R, P0, P1, P2>(target, methodName, arrayOf<Any?>(p3, p4, p5, p6, *boundArgs))

  public override fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
  ) = MethodCallable4<R, P0, P1, P2, P3>(target, methodName, arrayOf<Any?>(p4, p5, p6, *boundArgs))

  public override fun bind(p5: P5, p6: P6) = MethodCallable5<R, P0, P1, P2, P3, P4>(target,
      methodName, arrayOf<Any?>(p5, p6, *boundArgs))

  public override fun bind(p6: P6) = MethodCallable6<R, P0, P1, P2, P3, P4, P5>(target, methodName,
      arrayOf<Any?>(p6, *boundArgs))
}

public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6> T.callable7(callable: T.(
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
) -> R) =
    MethodCallable7<R, P0, P1, P2, P3, P4, P5, P6>(this, (callable as KCallable<R>).name.toGodotName())

public class MethodCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7> @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs), Callable8<R, P0, P1, P2, P3, P4, P5, P6, P7> {
  public override fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) = MethodCallable0<R>(target, methodName, arrayOf<Any?>(p0, p1, p2, p3, p4, p5, p6, p7,
      *boundArgs))

  public override fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) = MethodCallable1<R, P0>(target, methodName, arrayOf<Any?>(p1, p2, p3, p4, p5, p6, p7,
      *boundArgs))

  public override fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) = MethodCallable2<R, P0, P1>(target, methodName, arrayOf<Any?>(p2, p3, p4, p5, p6, p7,
      *boundArgs))

  public override fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) = MethodCallable3<R, P0, P1, P2>(target, methodName, arrayOf<Any?>(p3, p4, p5, p6, p7,
      *boundArgs))

  public override fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) = MethodCallable4<R, P0, P1, P2, P3>(target, methodName, arrayOf<Any?>(p4, p5, p6, p7,
      *boundArgs))

  public override fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
  ) = MethodCallable5<R, P0, P1, P2, P3, P4>(target, methodName, arrayOf<Any?>(p5, p6, p7,
      *boundArgs))

  public override fun bind(p6: P6, p7: P7) = MethodCallable6<R, P0, P1, P2, P3, P4, P5>(target,
      methodName, arrayOf<Any?>(p6, p7, *boundArgs))

  public override fun bind(p7: P7) = MethodCallable7<R, P0, P1, P2, P3, P4, P5, P6>(target,
      methodName, arrayOf<Any?>(p7, *boundArgs))
}

public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7> T.callable8(callable: T.(
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
  p7: P7,
) -> R) =
    MethodCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(this, (callable as KCallable<R>).name.toGodotName())

public class MethodCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8> @PublishedApi internal
    constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs), Callable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>
    {
  public override fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) = MethodCallable0<R>(target, methodName, arrayOf<Any?>(p0, p1, p2, p3, p4, p5, p6, p7, p8,
      *boundArgs))

  public override fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) = MethodCallable1<R, P0>(target, methodName, arrayOf<Any?>(p1, p2, p3, p4, p5, p6, p7, p8,
      *boundArgs))

  public override fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) = MethodCallable2<R, P0, P1>(target, methodName, arrayOf<Any?>(p2, p3, p4, p5, p6, p7, p8,
      *boundArgs))

  public override fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) = MethodCallable3<R, P0, P1, P2>(target, methodName, arrayOf<Any?>(p3, p4, p5, p6, p7, p8,
      *boundArgs))

  public override fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) = MethodCallable4<R, P0, P1, P2, P3>(target, methodName, arrayOf<Any?>(p4, p5, p6, p7, p8,
      *boundArgs))

  public override fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) = MethodCallable5<R, P0, P1, P2, P3, P4>(target, methodName, arrayOf<Any?>(p5, p6, p7, p8,
      *boundArgs))

  public override fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
  ) = MethodCallable6<R, P0, P1, P2, P3, P4, P5>(target, methodName, arrayOf<Any?>(p6, p7, p8,
      *boundArgs))

  public override fun bind(p7: P7, p8: P8) = MethodCallable7<R, P0, P1, P2, P3, P4, P5, P6>(target,
      methodName, arrayOf<Any?>(p7, p8, *boundArgs))

  public override fun bind(p8: P8) = MethodCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(target,
      methodName, arrayOf<Any?>(p8, *boundArgs))
}

public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8> T.callable9(callable: T.(
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
  p7: P7,
  p8: P8,
) -> R) =
    MethodCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(this, (callable as KCallable<R>).name.toGodotName())

public class MethodCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> @PublishedApi internal
    constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs),
    Callable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> {
  public override fun bind(
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
  ) = MethodCallable0<R>(target, methodName, arrayOf<Any?>(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9,
      *boundArgs))

  public override fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) = MethodCallable1<R, P0>(target, methodName, arrayOf<Any?>(p1, p2, p3, p4, p5, p6, p7, p8, p9,
      *boundArgs))

  public override fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) = MethodCallable2<R, P0, P1>(target, methodName, arrayOf<Any?>(p2, p3, p4, p5, p6, p7, p8, p9,
      *boundArgs))

  public override fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) = MethodCallable3<R, P0, P1, P2>(target, methodName, arrayOf<Any?>(p3, p4, p5, p6, p7, p8, p9,
      *boundArgs))

  public override fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) = MethodCallable4<R, P0, P1, P2, P3>(target, methodName, arrayOf<Any?>(p4, p5, p6, p7, p8, p9,
      *boundArgs))

  public override fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) = MethodCallable5<R, P0, P1, P2, P3, P4>(target, methodName, arrayOf<Any?>(p5, p6, p7, p8, p9,
      *boundArgs))

  public override fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) = MethodCallable6<R, P0, P1, P2, P3, P4, P5>(target, methodName, arrayOf<Any?>(p6, p7, p8, p9,
      *boundArgs))

  public override fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
  ) = MethodCallable7<R, P0, P1, P2, P3, P4, P5, P6>(target, methodName, arrayOf<Any?>(p7, p8, p9,
      *boundArgs))

  public override fun bind(p8: P8, p9: P9) =
      MethodCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(target, methodName, arrayOf<Any?>(p8, p9,
      *boundArgs))

  public override fun bind(p9: P9) = MethodCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(target,
      methodName, arrayOf<Any?>(p9, *boundArgs))
}

public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> T.callable10(callable: T.(
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
) -> R) =
    MethodCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(this, (callable as KCallable<R>).name.toGodotName())

public class MethodCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> @PublishedApi internal
    constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs),
    Callable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> {
  public override fun bind(
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
  ) = MethodCallable0<R>(target, methodName,
      arrayOf<Any?>(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, *boundArgs))

  public override fun bind(
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
  ) = MethodCallable1<R, P0>(target, methodName,
      arrayOf<Any?>(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, *boundArgs))

  public override fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) = MethodCallable2<R, P0, P1>(target, methodName,
      arrayOf<Any?>(p2, p3, p4, p5, p6, p7, p8, p9, p10, *boundArgs))

  public override fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) = MethodCallable3<R, P0, P1, P2>(target, methodName,
      arrayOf<Any?>(p3, p4, p5, p6, p7, p8, p9, p10, *boundArgs))

  public override fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) = MethodCallable4<R, P0, P1, P2, P3>(target, methodName,
      arrayOf<Any?>(p4, p5, p6, p7, p8, p9, p10, *boundArgs))

  public override fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) = MethodCallable5<R, P0, P1, P2, P3, P4>(target, methodName,
      arrayOf<Any?>(p5, p6, p7, p8, p9, p10, *boundArgs))

  public override fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) = MethodCallable6<R, P0, P1, P2, P3, P4, P5>(target, methodName,
      arrayOf<Any?>(p6, p7, p8, p9, p10, *boundArgs))

  public override fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) = MethodCallable7<R, P0, P1, P2, P3, P4, P5, P6>(target, methodName,
      arrayOf<Any?>(p7, p8, p9, p10, *boundArgs))

  public override fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
  ) = MethodCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(target, methodName,
      arrayOf<Any?>(p8, p9, p10, *boundArgs))

  public override fun bind(p9: P9, p10: P10) =
      MethodCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(target, methodName,
      arrayOf<Any?>(p9, p10, *boundArgs))

  public override fun bind(p10: P10) =
      MethodCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(target, methodName,
      arrayOf<Any?>(p10, *boundArgs))
}

public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> T.callable11(callable: T.(
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
) -> R) =
    MethodCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(this, (callable as KCallable<R>).name.toGodotName())

public class MethodCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> @PublishedApi
    internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs),
    Callable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> {
  public override fun bind(
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
  ) = MethodCallable0<R>(target, methodName,
      arrayOf<Any?>(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, *boundArgs))

  public override fun bind(
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
  ) = MethodCallable1<R, P0>(target, methodName,
      arrayOf<Any?>(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, *boundArgs))

  public override fun bind(
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
  ) = MethodCallable2<R, P0, P1>(target, methodName,
      arrayOf<Any?>(p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, *boundArgs))

  public override fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) = MethodCallable3<R, P0, P1, P2>(target, methodName,
      arrayOf<Any?>(p3, p4, p5, p6, p7, p8, p9, p10, p11, *boundArgs))

  public override fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) = MethodCallable4<R, P0, P1, P2, P3>(target, methodName,
      arrayOf<Any?>(p4, p5, p6, p7, p8, p9, p10, p11, *boundArgs))

  public override fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) = MethodCallable5<R, P0, P1, P2, P3, P4>(target, methodName,
      arrayOf<Any?>(p5, p6, p7, p8, p9, p10, p11, *boundArgs))

  public override fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) = MethodCallable6<R, P0, P1, P2, P3, P4, P5>(target, methodName,
      arrayOf<Any?>(p6, p7, p8, p9, p10, p11, *boundArgs))

  public override fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) = MethodCallable7<R, P0, P1, P2, P3, P4, P5, P6>(target, methodName,
      arrayOf<Any?>(p7, p8, p9, p10, p11, *boundArgs))

  public override fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) = MethodCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(target, methodName,
      arrayOf<Any?>(p8, p9, p10, p11, *boundArgs))

  public override fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
  ) = MethodCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(target, methodName,
      arrayOf<Any?>(p9, p10, p11, *boundArgs))

  public override fun bind(p10: P10, p11: P11) =
      MethodCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(target, methodName,
      arrayOf<Any?>(p10, p11, *boundArgs))

  public override fun bind(p11: P11) =
      MethodCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(target, methodName,
      arrayOf<Any?>(p11, *boundArgs))
}

public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>
    T.callable12(callable: T.(
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
) -> R) =
    MethodCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(this, (callable as KCallable<R>).name.toGodotName())

public class MethodCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>
    @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs),
    Callable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> {
  public override fun bind(
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
  ) = MethodCallable0<R>(target, methodName,
      arrayOf<Any?>(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, *boundArgs))

  public override fun bind(
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
  ) = MethodCallable1<R, P0>(target, methodName,
      arrayOf<Any?>(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, *boundArgs))

  public override fun bind(
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
  ) = MethodCallable2<R, P0, P1>(target, methodName,
      arrayOf<Any?>(p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, *boundArgs))

  public override fun bind(
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
  ) = MethodCallable3<R, P0, P1, P2>(target, methodName,
      arrayOf<Any?>(p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, *boundArgs))

  public override fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) = MethodCallable4<R, P0, P1, P2, P3>(target, methodName,
      arrayOf<Any?>(p4, p5, p6, p7, p8, p9, p10, p11, p12, *boundArgs))

  public override fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) = MethodCallable5<R, P0, P1, P2, P3, P4>(target, methodName,
      arrayOf<Any?>(p5, p6, p7, p8, p9, p10, p11, p12, *boundArgs))

  public override fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) = MethodCallable6<R, P0, P1, P2, P3, P4, P5>(target, methodName,
      arrayOf<Any?>(p6, p7, p8, p9, p10, p11, p12, *boundArgs))

  public override fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) = MethodCallable7<R, P0, P1, P2, P3, P4, P5, P6>(target, methodName,
      arrayOf<Any?>(p7, p8, p9, p10, p11, p12, *boundArgs))

  public override fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) = MethodCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(target, methodName,
      arrayOf<Any?>(p8, p9, p10, p11, p12, *boundArgs))

  public override fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) = MethodCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(target, methodName,
      arrayOf<Any?>(p9, p10, p11, p12, *boundArgs))

  public override fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
  ) = MethodCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(target, methodName,
      arrayOf<Any?>(p10, p11, p12, *boundArgs))

  public override fun bind(p11: P11, p12: P12) =
      MethodCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(target, methodName,
      arrayOf<Any?>(p11, p12, *boundArgs))

  public override fun bind(p12: P12) =
      MethodCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(target, methodName,
      arrayOf<Any?>(p12, *boundArgs))
}

public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>
    T.callable13(callable: T.(
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
) -> R) =
    MethodCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>(this, (callable as KCallable<R>).name.toGodotName())

public class MethodCallable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>
    @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs),
    Callable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> {
  public override fun bind(
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
  ) = MethodCallable0<R>(target, methodName,
      arrayOf<Any?>(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, *boundArgs))

  public override fun bind(
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
  ) = MethodCallable1<R, P0>(target, methodName,
      arrayOf<Any?>(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, *boundArgs))

  public override fun bind(
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
  ) = MethodCallable2<R, P0, P1>(target, methodName,
      arrayOf<Any?>(p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, *boundArgs))

  public override fun bind(
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
  ) = MethodCallable3<R, P0, P1, P2>(target, methodName,
      arrayOf<Any?>(p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, *boundArgs))

  public override fun bind(
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
  ) = MethodCallable4<R, P0, P1, P2, P3>(target, methodName,
      arrayOf<Any?>(p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, *boundArgs))

  public override fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) = MethodCallable5<R, P0, P1, P2, P3, P4>(target, methodName,
      arrayOf<Any?>(p5, p6, p7, p8, p9, p10, p11, p12, p13, *boundArgs))

  public override fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) = MethodCallable6<R, P0, P1, P2, P3, P4, P5>(target, methodName,
      arrayOf<Any?>(p6, p7, p8, p9, p10, p11, p12, p13, *boundArgs))

  public override fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) = MethodCallable7<R, P0, P1, P2, P3, P4, P5, P6>(target, methodName,
      arrayOf<Any?>(p7, p8, p9, p10, p11, p12, p13, *boundArgs))

  public override fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) = MethodCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(target, methodName,
      arrayOf<Any?>(p8, p9, p10, p11, p12, p13, *boundArgs))

  public override fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) = MethodCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(target, methodName,
      arrayOf<Any?>(p9, p10, p11, p12, p13, *boundArgs))

  public override fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) = MethodCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(target, methodName,
      arrayOf<Any?>(p10, p11, p12, p13, *boundArgs))

  public override fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
  ) = MethodCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(target, methodName,
      arrayOf<Any?>(p11, p12, p13, *boundArgs))

  public override fun bind(p12: P12, p13: P13) =
      MethodCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(target, methodName,
      arrayOf<Any?>(p12, p13, *boundArgs))

  public override fun bind(p13: P13) =
      MethodCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>(target, methodName,
      arrayOf<Any?>(p13, *boundArgs))
}

public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>
    T.callable14(callable: T.(
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
) -> R) =
    MethodCallable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>(this, (callable as KCallable<R>).name.toGodotName())

public class MethodCallable15<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>
    @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs),
    Callable15<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> {
  public override fun bind(
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
  ) = MethodCallable0<R>(target, methodName,
      arrayOf<Any?>(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, *boundArgs))

  public override fun bind(
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
  ) = MethodCallable1<R, P0>(target, methodName,
      arrayOf<Any?>(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, *boundArgs))

  public override fun bind(
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
  ) = MethodCallable2<R, P0, P1>(target, methodName,
      arrayOf<Any?>(p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, *boundArgs))

  public override fun bind(
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
  ) = MethodCallable3<R, P0, P1, P2>(target, methodName,
      arrayOf<Any?>(p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, *boundArgs))

  public override fun bind(
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
  ) = MethodCallable4<R, P0, P1, P2, P3>(target, methodName,
      arrayOf<Any?>(p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, *boundArgs))

  public override fun bind(
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
  ) = MethodCallable5<R, P0, P1, P2, P3, P4>(target, methodName,
      arrayOf<Any?>(p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, *boundArgs))

  public override fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) = MethodCallable6<R, P0, P1, P2, P3, P4, P5>(target, methodName,
      arrayOf<Any?>(p6, p7, p8, p9, p10, p11, p12, p13, p14, *boundArgs))

  public override fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) = MethodCallable7<R, P0, P1, P2, P3, P4, P5, P6>(target, methodName,
      arrayOf<Any?>(p7, p8, p9, p10, p11, p12, p13, p14, *boundArgs))

  public override fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) = MethodCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(target, methodName,
      arrayOf<Any?>(p8, p9, p10, p11, p12, p13, p14, *boundArgs))

  public override fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) = MethodCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(target, methodName,
      arrayOf<Any?>(p9, p10, p11, p12, p13, p14, *boundArgs))

  public override fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) = MethodCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(target, methodName,
      arrayOf<Any?>(p10, p11, p12, p13, p14, *boundArgs))

  public override fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) = MethodCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(target, methodName,
      arrayOf<Any?>(p11, p12, p13, p14, *boundArgs))

  public override fun bind(
    p12: P12,
    p13: P13,
    p14: P14,
  ) = MethodCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(target, methodName,
      arrayOf<Any?>(p12, p13, p14, *boundArgs))

  public override fun bind(p13: P13, p14: P14) =
      MethodCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>(target, methodName,
      arrayOf<Any?>(p13, p14, *boundArgs))

  public override fun bind(p14: P14) =
      MethodCallable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>(target,
      methodName, arrayOf<Any?>(p14, *boundArgs))
}

public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>
    T.callable15(callable: T.(
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
) -> R) =
    MethodCallable15<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>(this, (callable as KCallable<R>).name.toGodotName())

public class MethodCallable16<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14,
    P15> @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs),
    Callable16<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15> {
  public override fun bind(
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
  ) = MethodCallable0<R>(target, methodName,
      arrayOf<Any?>(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15,
      *boundArgs))

  public override fun bind(
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
  ) = MethodCallable1<R, P0>(target, methodName,
      arrayOf<Any?>(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, *boundArgs))

  public override fun bind(
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
  ) = MethodCallable2<R, P0, P1>(target, methodName,
      arrayOf<Any?>(p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, *boundArgs))

  public override fun bind(
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
  ) = MethodCallable3<R, P0, P1, P2>(target, methodName,
      arrayOf<Any?>(p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, *boundArgs))

  public override fun bind(
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
  ) = MethodCallable4<R, P0, P1, P2, P3>(target, methodName,
      arrayOf<Any?>(p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, *boundArgs))

  public override fun bind(
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
  ) = MethodCallable5<R, P0, P1, P2, P3, P4>(target, methodName,
      arrayOf<Any?>(p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, *boundArgs))

  public override fun bind(
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
  ) = MethodCallable6<R, P0, P1, P2, P3, P4, P5>(target, methodName,
      arrayOf<Any?>(p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, *boundArgs))

  public override fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) = MethodCallable7<R, P0, P1, P2, P3, P4, P5, P6>(target, methodName,
      arrayOf<Any?>(p7, p8, p9, p10, p11, p12, p13, p14, p15, *boundArgs))

  public override fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) = MethodCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(target, methodName,
      arrayOf<Any?>(p8, p9, p10, p11, p12, p13, p14, p15, *boundArgs))

  public override fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) = MethodCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(target, methodName,
      arrayOf<Any?>(p9, p10, p11, p12, p13, p14, p15, *boundArgs))

  public override fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) = MethodCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(target, methodName,
      arrayOf<Any?>(p10, p11, p12, p13, p14, p15, *boundArgs))

  public override fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) = MethodCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(target, methodName,
      arrayOf<Any?>(p11, p12, p13, p14, p15, *boundArgs))

  public override fun bind(
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) = MethodCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(target, methodName,
      arrayOf<Any?>(p12, p13, p14, p15, *boundArgs))

  public override fun bind(
    p13: P13,
    p14: P14,
    p15: P15,
  ) = MethodCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>(target, methodName,
      arrayOf<Any?>(p13, p14, p15, *boundArgs))

  public override fun bind(p14: P14, p15: P15) =
      MethodCallable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>(target,
      methodName, arrayOf<Any?>(p14, p15, *boundArgs))

  public override fun bind(p15: P15) =
      MethodCallable15<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>(target,
      methodName, arrayOf<Any?>(p15, *boundArgs))
}

public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>
    T.callable16(callable: T.(
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
) -> R) =
    MethodCallable16<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>(this, (callable as KCallable<R>).name.toGodotName())
