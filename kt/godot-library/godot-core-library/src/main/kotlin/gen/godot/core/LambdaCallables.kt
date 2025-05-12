@file:Suppress(
  "PackageDirectoryMismatch", "UNCHECKED_CAST",
  "unused",
)

package godot.core

import godot.core.VariantParser.NIL
import kotlin.Any
import kotlin.Array
import kotlin.PublishedApi
import kotlin.Suppress

public class LambdaCallable0<R> @PublishedApi internal constructor(
  container: LambdaContainer<R>,
  boundArgs: Array<Any?> = emptyArray(),
) : LambdaCallable<R>(container, boundArgs), Callable0<R>

public inline fun <reified R> callable0(noinline function: () -> R) =
    LambdaCallable0<R>(LambdaContainer0<R>(variantMapper.getOrDefault(R::class, NIL), arrayOf(), function))

public inline fun <reified R> (() -> R).asCallable() = callable0(this)

public class LambdaCallable1<R, P0> @PublishedApi internal constructor(
  container: LambdaContainer<R>,
  boundArgs: Array<Any?> = emptyArray(),
) : LambdaCallable<R>(container, boundArgs), Callable1<R, P0> {
  public override fun bind(p0: P0) = LambdaCallable0<R>(container, arrayOf<Any?>(p0, *boundArgs))
}

public inline fun <reified R, reified P0> callable1(noinline function: (p0: P0) -> R) =
    LambdaCallable1<R, P0>(LambdaContainer1<R, P0>(variantMapper.getOrDefault(R::class, NIL), arrayOf(variantMapper[P0::class]!!), function))

public inline fun <reified R, reified P0> ((p0: P0) -> R).asCallable() = callable1(this)

public class LambdaCallable2<R, P0, P1> @PublishedApi internal constructor(
  container: LambdaContainer<R>,
  boundArgs: Array<Any?> = emptyArray(),
) : LambdaCallable<R>(container, boundArgs), Callable2<R, P0, P1> {
  public override fun bind(p0: P0, p1: P1) = LambdaCallable0<R>(container, arrayOf<Any?>(p0, p1,
      *boundArgs))

  public override fun bind(p1: P1) = LambdaCallable1<R, P0>(container, arrayOf<Any?>(p1,
      *boundArgs))
}

public inline fun <reified R, reified P0, reified P1> callable2(noinline function: (p0: P0,
    p1: P1) -> R) =
    LambdaCallable2<R, P0, P1>(LambdaContainer2<R, P0, P1>(variantMapper.getOrDefault(R::class, NIL), arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!), function))

public inline fun <reified R, reified P0, reified P1> ((p0: P0, p1: P1) -> R).asCallable() =
    callable2(this)

public class LambdaCallable3<R, P0, P1, P2> @PublishedApi internal constructor(
  container: LambdaContainer<R>,
  boundArgs: Array<Any?> = emptyArray(),
) : LambdaCallable<R>(container, boundArgs), Callable3<R, P0, P1, P2> {
  public override fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
  ) = LambdaCallable0<R>(container, arrayOf<Any?>(p0, p1, p2, *boundArgs))

  public override fun bind(p1: P1, p2: P2) = LambdaCallable1<R, P0>(container, arrayOf<Any?>(p1, p2,
      *boundArgs))

  public override fun bind(p2: P2) = LambdaCallable2<R, P0, P1>(container, arrayOf<Any?>(p2,
      *boundArgs))
}

public inline fun <reified R, reified P0, reified P1, reified P2> callable3(noinline function: (
  p0: P0,
  p1: P1,
  p2: P2,
) -> R) =
    LambdaCallable3<R, P0, P1, P2>(LambdaContainer3<R, P0, P1, P2>(variantMapper.getOrDefault(R::class, NIL), arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!), function))

public inline fun <reified R, reified P0, reified P1, reified P2> ((
  p0: P0,
  p1: P1,
  p2: P2,
) -> R).asCallable() = callable3(this)

public class LambdaCallable4<R, P0, P1, P2, P3> @PublishedApi internal constructor(
  container: LambdaContainer<R>,
  boundArgs: Array<Any?> = emptyArray(),
) : LambdaCallable<R>(container, boundArgs), Callable4<R, P0, P1, P2, P3> {
  public override fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
  ) = LambdaCallable0<R>(container, arrayOf<Any?>(p0, p1, p2, p3, *boundArgs))

  public override fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
  ) = LambdaCallable1<R, P0>(container, arrayOf<Any?>(p1, p2, p3, *boundArgs))

  public override fun bind(p2: P2, p3: P3) = LambdaCallable2<R, P0, P1>(container,
      arrayOf<Any?>(p2, p3, *boundArgs))

  public override fun bind(p3: P3) = LambdaCallable3<R, P0, P1, P2>(container, arrayOf<Any?>(p3,
      *boundArgs))
}

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3> callable4(noinline
    function: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
) -> R) =
    LambdaCallable4<R, P0, P1, P2, P3>(LambdaContainer4<R, P0, P1, P2, P3>(variantMapper.getOrDefault(R::class, NIL), arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!), function))

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3> ((
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
) -> R).asCallable() = callable4(this)

public class LambdaCallable5<R, P0, P1, P2, P3, P4> @PublishedApi internal constructor(
  container: LambdaContainer<R>,
  boundArgs: Array<Any?> = emptyArray(),
) : LambdaCallable<R>(container, boundArgs), Callable5<R, P0, P1, P2, P3, P4> {
  public override fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ) = LambdaCallable0<R>(container, arrayOf<Any?>(p0, p1, p2, p3, p4, *boundArgs))

  public override fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ) = LambdaCallable1<R, P0>(container, arrayOf<Any?>(p1, p2, p3, p4, *boundArgs))

  public override fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
  ) = LambdaCallable2<R, P0, P1>(container, arrayOf<Any?>(p2, p3, p4, *boundArgs))

  public override fun bind(p3: P3, p4: P4) = LambdaCallable3<R, P0, P1, P2>(container,
      arrayOf<Any?>(p3, p4, *boundArgs))

  public override fun bind(p4: P4) = LambdaCallable4<R, P0, P1, P2, P3>(container, arrayOf<Any?>(p4,
      *boundArgs))
}

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4>
    callable5(noinline function: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
) -> R) =
    LambdaCallable5<R, P0, P1, P2, P3, P4>(LambdaContainer5<R, P0, P1, P2, P3, P4>(variantMapper.getOrDefault(R::class, NIL), arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!), function))

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4> ((
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
) -> R).asCallable() = callable5(this)

public class LambdaCallable6<R, P0, P1, P2, P3, P4, P5> @PublishedApi internal constructor(
  container: LambdaContainer<R>,
  boundArgs: Array<Any?> = emptyArray(),
) : LambdaCallable<R>(container, boundArgs), Callable6<R, P0, P1, P2, P3, P4, P5> {
  public override fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) = LambdaCallable0<R>(container, arrayOf<Any?>(p0, p1, p2, p3, p4, p5, *boundArgs))

  public override fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) = LambdaCallable1<R, P0>(container, arrayOf<Any?>(p1, p2, p3, p4, p5, *boundArgs))

  public override fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) = LambdaCallable2<R, P0, P1>(container, arrayOf<Any?>(p2, p3, p4, p5, *boundArgs))

  public override fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
  ) = LambdaCallable3<R, P0, P1, P2>(container, arrayOf<Any?>(p3, p4, p5, *boundArgs))

  public override fun bind(p4: P4, p5: P5) = LambdaCallable4<R, P0, P1, P2, P3>(container,
      arrayOf<Any?>(p4, p5, *boundArgs))

  public override fun bind(p5: P5) = LambdaCallable5<R, P0, P1, P2, P3, P4>(container,
      arrayOf<Any?>(p5, *boundArgs))
}

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4, reified
    P5> callable6(noinline function: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
) -> R) =
    LambdaCallable6<R, P0, P1, P2, P3, P4, P5>(LambdaContainer6<R, P0, P1, P2, P3, P4, P5>(variantMapper.getOrDefault(R::class, NIL), arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!), function))

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4, reified
    P5> ((
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
) -> R).asCallable() = callable6(this)

public class LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6> @PublishedApi internal constructor(
  container: LambdaContainer<R>,
  boundArgs: Array<Any?> = emptyArray(),
) : LambdaCallable<R>(container, boundArgs), Callable7<R, P0, P1, P2, P3, P4, P5, P6> {
  public override fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) = LambdaCallable0<R>(container, arrayOf<Any?>(p0, p1, p2, p3, p4, p5, p6, *boundArgs))

  public override fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) = LambdaCallable1<R, P0>(container, arrayOf<Any?>(p1, p2, p3, p4, p5, p6, *boundArgs))

  public override fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) = LambdaCallable2<R, P0, P1>(container, arrayOf<Any?>(p2, p3, p4, p5, p6, *boundArgs))

  public override fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) = LambdaCallable3<R, P0, P1, P2>(container, arrayOf<Any?>(p3, p4, p5, p6, *boundArgs))

  public override fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
  ) = LambdaCallable4<R, P0, P1, P2, P3>(container, arrayOf<Any?>(p4, p5, p6, *boundArgs))

  public override fun bind(p5: P5, p6: P6) = LambdaCallable5<R, P0, P1, P2, P3, P4>(container,
      arrayOf<Any?>(p5, p6, *boundArgs))

  public override fun bind(p6: P6) = LambdaCallable6<R, P0, P1, P2, P3, P4, P5>(container,
      arrayOf<Any?>(p6, *boundArgs))
}

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4, reified
    P5, reified P6> callable7(noinline function: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
) -> R) =
    LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>(LambdaContainer7<R, P0, P1, P2, P3, P4, P5, P6>(variantMapper.getOrDefault(R::class, NIL), arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!), function))

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4, reified
    P5, reified P6> ((
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
) -> R).asCallable() = callable7(this)

public class LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7> @PublishedApi internal constructor(
  container: LambdaContainer<R>,
  boundArgs: Array<Any?> = emptyArray(),
) : LambdaCallable<R>(container, boundArgs), Callable8<R, P0, P1, P2, P3, P4, P5, P6, P7> {
  public override fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) = LambdaCallable0<R>(container, arrayOf<Any?>(p0, p1, p2, p3, p4, p5, p6, p7, *boundArgs))

  public override fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) = LambdaCallable1<R, P0>(container, arrayOf<Any?>(p1, p2, p3, p4, p5, p6, p7, *boundArgs))

  public override fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) = LambdaCallable2<R, P0, P1>(container, arrayOf<Any?>(p2, p3, p4, p5, p6, p7, *boundArgs))

  public override fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) = LambdaCallable3<R, P0, P1, P2>(container, arrayOf<Any?>(p3, p4, p5, p6, p7, *boundArgs))

  public override fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) = LambdaCallable4<R, P0, P1, P2, P3>(container, arrayOf<Any?>(p4, p5, p6, p7, *boundArgs))

  public override fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
  ) = LambdaCallable5<R, P0, P1, P2, P3, P4>(container, arrayOf<Any?>(p5, p6, p7, *boundArgs))

  public override fun bind(p6: P6, p7: P7) = LambdaCallable6<R, P0, P1, P2, P3, P4, P5>(container,
      arrayOf<Any?>(p6, p7, *boundArgs))

  public override fun bind(p7: P7) = LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>(container,
      arrayOf<Any?>(p7, *boundArgs))
}

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4, reified
    P5, reified P6, reified P7> callable8(noinline function: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
  p7: P7,
) -> R) =
    LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(LambdaContainer8<R, P0, P1, P2, P3, P4, P5, P6, P7>(variantMapper.getOrDefault(R::class, NIL), arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!), function))

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4, reified
    P5, reified P6, reified P7> ((
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
  p7: P7,
) -> R).asCallable() = callable8(this)

public class LambdaCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8> @PublishedApi internal
    constructor(
  container: LambdaContainer<R>,
  boundArgs: Array<Any?> = emptyArray(),
) : LambdaCallable<R>(container, boundArgs), Callable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8> {
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
  ) = LambdaCallable0<R>(container, arrayOf<Any?>(p0, p1, p2, p3, p4, p5, p6, p7, p8, *boundArgs))

  public override fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) = LambdaCallable1<R, P0>(container, arrayOf<Any?>(p1, p2, p3, p4, p5, p6, p7, p8, *boundArgs))

  public override fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) = LambdaCallable2<R, P0, P1>(container, arrayOf<Any?>(p2, p3, p4, p5, p6, p7, p8, *boundArgs))

  public override fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) = LambdaCallable3<R, P0, P1, P2>(container, arrayOf<Any?>(p3, p4, p5, p6, p7, p8, *boundArgs))

  public override fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) = LambdaCallable4<R, P0, P1, P2, P3>(container, arrayOf<Any?>(p4, p5, p6, p7, p8, *boundArgs))

  public override fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) = LambdaCallable5<R, P0, P1, P2, P3, P4>(container, arrayOf<Any?>(p5, p6, p7, p8, *boundArgs))

  public override fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
  ) = LambdaCallable6<R, P0, P1, P2, P3, P4, P5>(container, arrayOf<Any?>(p6, p7, p8, *boundArgs))

  public override fun bind(p7: P7, p8: P8) =
      LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>(container, arrayOf<Any?>(p7, p8, *boundArgs))

  public override fun bind(p8: P8) = LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(container,
      arrayOf<Any?>(p8, *boundArgs))
}

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4, reified
    P5, reified P6, reified P7, reified P8> callable9(noinline function: (
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
    LambdaCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(LambdaContainer9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(variantMapper.getOrDefault(R::class, NIL), arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!), function))

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4, reified
    P5, reified P6, reified P7, reified P8> ((
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
  p7: P7,
  p8: P8,
) -> R).asCallable() = callable9(this)

public class LambdaCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> @PublishedApi internal
    constructor(
  container: LambdaContainer<R>,
  boundArgs: Array<Any?> = emptyArray(),
) : LambdaCallable<R>(container, boundArgs), Callable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> {
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
  ) = LambdaCallable0<R>(container, arrayOf<Any?>(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9,
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
  ) = LambdaCallable1<R, P0>(container, arrayOf<Any?>(p1, p2, p3, p4, p5, p6, p7, p8, p9,
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
  ) = LambdaCallable2<R, P0, P1>(container, arrayOf<Any?>(p2, p3, p4, p5, p6, p7, p8, p9,
      *boundArgs))

  public override fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) = LambdaCallable3<R, P0, P1, P2>(container, arrayOf<Any?>(p3, p4, p5, p6, p7, p8, p9,
      *boundArgs))

  public override fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) = LambdaCallable4<R, P0, P1, P2, P3>(container, arrayOf<Any?>(p4, p5, p6, p7, p8, p9,
      *boundArgs))

  public override fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) = LambdaCallable5<R, P0, P1, P2, P3, P4>(container, arrayOf<Any?>(p5, p6, p7, p8, p9,
      *boundArgs))

  public override fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) = LambdaCallable6<R, P0, P1, P2, P3, P4, P5>(container, arrayOf<Any?>(p6, p7, p8, p9,
      *boundArgs))

  public override fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
  ) = LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>(container, arrayOf<Any?>(p7, p8, p9,
      *boundArgs))

  public override fun bind(p8: P8, p9: P9) =
      LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(container, arrayOf<Any?>(p8, p9,
      *boundArgs))

  public override fun bind(p9: P9) =
      LambdaCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(container, arrayOf<Any?>(p9,
      *boundArgs))
}

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4, reified
    P5, reified P6, reified P7, reified P8, reified P9> callable10(noinline function: (
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
    LambdaCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(LambdaContainer10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(variantMapper.getOrDefault(R::class, NIL), arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!, variantMapper[P9::class]!!), function))

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4, reified
    P5, reified P6, reified P7, reified P8, reified P9> ((
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
) -> R).asCallable() = callable10(this)

public class LambdaCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> @PublishedApi internal
    constructor(
  container: LambdaContainer<R>,
  boundArgs: Array<Any?> = emptyArray(),
) : LambdaCallable<R>(container, boundArgs),
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
  ) = LambdaCallable0<R>(container, arrayOf<Any?>(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10,
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
  ) = LambdaCallable1<R, P0>(container, arrayOf<Any?>(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10,
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
    p10: P10,
  ) = LambdaCallable2<R, P0, P1>(container, arrayOf<Any?>(p2, p3, p4, p5, p6, p7, p8, p9, p10,
      *boundArgs))

  public override fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) = LambdaCallable3<R, P0, P1, P2>(container, arrayOf<Any?>(p3, p4, p5, p6, p7, p8, p9, p10,
      *boundArgs))

  public override fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) = LambdaCallable4<R, P0, P1, P2, P3>(container, arrayOf<Any?>(p4, p5, p6, p7, p8, p9, p10,
      *boundArgs))

  public override fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) = LambdaCallable5<R, P0, P1, P2, P3, P4>(container, arrayOf<Any?>(p5, p6, p7, p8, p9, p10,
      *boundArgs))

  public override fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) = LambdaCallable6<R, P0, P1, P2, P3, P4, P5>(container, arrayOf<Any?>(p6, p7, p8, p9, p10,
      *boundArgs))

  public override fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) = LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>(container, arrayOf<Any?>(p7, p8, p9, p10,
      *boundArgs))

  public override fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
  ) = LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(container, arrayOf<Any?>(p8, p9, p10,
      *boundArgs))

  public override fun bind(p9: P9, p10: P10) =
      LambdaCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(container, arrayOf<Any?>(p9, p10,
      *boundArgs))

  public override fun bind(p10: P10) =
      LambdaCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(container, arrayOf<Any?>(p10,
      *boundArgs))
}

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4, reified
    P5, reified P6, reified P7, reified P8, reified P9, reified P10> callable11(noinline function: (
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
    LambdaCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(LambdaContainer11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(variantMapper.getOrDefault(R::class, NIL), arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!, variantMapper[P9::class]!!, variantMapper[P10::class]!!), function))

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4, reified
    P5, reified P6, reified P7, reified P8, reified P9, reified P10> ((
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
) -> R).asCallable() = callable11(this)

public class LambdaCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> @PublishedApi
    internal constructor(
  container: LambdaContainer<R>,
  boundArgs: Array<Any?> = emptyArray(),
) : LambdaCallable<R>(container, boundArgs),
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
  ) = LambdaCallable0<R>(container, arrayOf<Any?>(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11,
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
  ) = LambdaCallable1<R, P0>(container, arrayOf<Any?>(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11,
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
    p10: P10,
    p11: P11,
  ) = LambdaCallable2<R, P0, P1>(container, arrayOf<Any?>(p2, p3, p4, p5, p6, p7, p8, p9, p10, p11,
      *boundArgs))

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
  ) = LambdaCallable3<R, P0, P1, P2>(container, arrayOf<Any?>(p3, p4, p5, p6, p7, p8, p9, p10, p11,
      *boundArgs))

  public override fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) = LambdaCallable4<R, P0, P1, P2, P3>(container, arrayOf<Any?>(p4, p5, p6, p7, p8, p9, p10, p11,
      *boundArgs))

  public override fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) = LambdaCallable5<R, P0, P1, P2, P3, P4>(container, arrayOf<Any?>(p5, p6, p7, p8, p9, p10, p11,
      *boundArgs))

  public override fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) = LambdaCallable6<R, P0, P1, P2, P3, P4, P5>(container, arrayOf<Any?>(p6, p7, p8, p9, p10, p11,
      *boundArgs))

  public override fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) = LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>(container, arrayOf<Any?>(p7, p8, p9, p10, p11,
      *boundArgs))

  public override fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) = LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(container, arrayOf<Any?>(p8, p9, p10, p11,
      *boundArgs))

  public override fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
  ) = LambdaCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(container, arrayOf<Any?>(p9, p10, p11,
      *boundArgs))

  public override fun bind(p10: P10, p11: P11) =
      LambdaCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(container, arrayOf<Any?>(p10, p11,
      *boundArgs))

  public override fun bind(p11: P11) =
      LambdaCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(container, arrayOf<Any?>(p11,
      *boundArgs))
}

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4, reified
    P5, reified P6, reified P7, reified P8, reified P9, reified P10, reified P11>
    callable12(noinline function: (
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
    LambdaCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(LambdaContainer12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(variantMapper.getOrDefault(R::class, NIL), arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!, variantMapper[P9::class]!!, variantMapper[P10::class]!!, variantMapper[P11::class]!!), function))

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4, reified
    P5, reified P6, reified P7, reified P8, reified P9, reified P10, reified P11> ((
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
) -> R).asCallable() = callable12(this)

public class LambdaCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>
    @PublishedApi internal constructor(
  container: LambdaContainer<R>,
  boundArgs: Array<Any?> = emptyArray(),
) : LambdaCallable<R>(container, boundArgs),
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
  ) = LambdaCallable0<R>(container,
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
  ) = LambdaCallable1<R, P0>(container,
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
  ) = LambdaCallable2<R, P0, P1>(container,
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
  ) = LambdaCallable3<R, P0, P1, P2>(container,
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
  ) = LambdaCallable4<R, P0, P1, P2, P3>(container,
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
  ) = LambdaCallable5<R, P0, P1, P2, P3, P4>(container,
      arrayOf<Any?>(p5, p6, p7, p8, p9, p10, p11, p12, *boundArgs))

  public override fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) = LambdaCallable6<R, P0, P1, P2, P3, P4, P5>(container,
      arrayOf<Any?>(p6, p7, p8, p9, p10, p11, p12, *boundArgs))

  public override fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) = LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>(container,
      arrayOf<Any?>(p7, p8, p9, p10, p11, p12, *boundArgs))

  public override fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) = LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(container,
      arrayOf<Any?>(p8, p9, p10, p11, p12, *boundArgs))

  public override fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) = LambdaCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(container,
      arrayOf<Any?>(p9, p10, p11, p12, *boundArgs))

  public override fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
  ) = LambdaCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(container,
      arrayOf<Any?>(p10, p11, p12, *boundArgs))

  public override fun bind(p11: P11, p12: P12) =
      LambdaCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(container,
      arrayOf<Any?>(p11, p12, *boundArgs))

  public override fun bind(p12: P12) =
      LambdaCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(container,
      arrayOf<Any?>(p12, *boundArgs))
}

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4, reified
    P5, reified P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12>
    callable13(noinline function: (
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
    LambdaCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>(LambdaContainer13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>(variantMapper.getOrDefault(R::class, NIL), arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!, variantMapper[P9::class]!!, variantMapper[P10::class]!!, variantMapper[P11::class]!!, variantMapper[P12::class]!!), function))

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4, reified
    P5, reified P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12> ((
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
) -> R).asCallable() = callable13(this)

public class LambdaCallable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>
    @PublishedApi internal constructor(
  container: LambdaContainer<R>,
  boundArgs: Array<Any?> = emptyArray(),
) : LambdaCallable<R>(container, boundArgs),
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
  ) = LambdaCallable0<R>(container,
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
  ) = LambdaCallable1<R, P0>(container,
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
  ) = LambdaCallable2<R, P0, P1>(container,
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
  ) = LambdaCallable3<R, P0, P1, P2>(container,
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
  ) = LambdaCallable4<R, P0, P1, P2, P3>(container,
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
  ) = LambdaCallable5<R, P0, P1, P2, P3, P4>(container,
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
  ) = LambdaCallable6<R, P0, P1, P2, P3, P4, P5>(container,
      arrayOf<Any?>(p6, p7, p8, p9, p10, p11, p12, p13, *boundArgs))

  public override fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) = LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>(container,
      arrayOf<Any?>(p7, p8, p9, p10, p11, p12, p13, *boundArgs))

  public override fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) = LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(container,
      arrayOf<Any?>(p8, p9, p10, p11, p12, p13, *boundArgs))

  public override fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) = LambdaCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(container,
      arrayOf<Any?>(p9, p10, p11, p12, p13, *boundArgs))

  public override fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) = LambdaCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(container,
      arrayOf<Any?>(p10, p11, p12, p13, *boundArgs))

  public override fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
  ) = LambdaCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(container,
      arrayOf<Any?>(p11, p12, p13, *boundArgs))

  public override fun bind(p12: P12, p13: P13) =
      LambdaCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(container,
      arrayOf<Any?>(p12, p13, *boundArgs))

  public override fun bind(p13: P13) =
      LambdaCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>(container,
      arrayOf<Any?>(p13, *boundArgs))
}

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4, reified
    P5, reified P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12,
    reified P13> callable14(noinline function: (
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
    LambdaCallable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>(LambdaContainer14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>(variantMapper.getOrDefault(R::class, NIL), arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!, variantMapper[P9::class]!!, variantMapper[P10::class]!!, variantMapper[P11::class]!!, variantMapper[P12::class]!!, variantMapper[P13::class]!!), function))

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4, reified
    P5, reified P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12,
    reified P13> ((
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
) -> R).asCallable() = callable14(this)

public class LambdaCallable15<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>
    @PublishedApi internal constructor(
  container: LambdaContainer<R>,
  boundArgs: Array<Any?> = emptyArray(),
) : LambdaCallable<R>(container, boundArgs),
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
  ) = LambdaCallable0<R>(container,
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
  ) = LambdaCallable1<R, P0>(container,
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
  ) = LambdaCallable2<R, P0, P1>(container,
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
  ) = LambdaCallable3<R, P0, P1, P2>(container,
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
  ) = LambdaCallable4<R, P0, P1, P2, P3>(container,
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
  ) = LambdaCallable5<R, P0, P1, P2, P3, P4>(container,
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
  ) = LambdaCallable6<R, P0, P1, P2, P3, P4, P5>(container,
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
  ) = LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>(container,
      arrayOf<Any?>(p7, p8, p9, p10, p11, p12, p13, p14, *boundArgs))

  public override fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) = LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(container,
      arrayOf<Any?>(p8, p9, p10, p11, p12, p13, p14, *boundArgs))

  public override fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) = LambdaCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(container,
      arrayOf<Any?>(p9, p10, p11, p12, p13, p14, *boundArgs))

  public override fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) = LambdaCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(container,
      arrayOf<Any?>(p10, p11, p12, p13, p14, *boundArgs))

  public override fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) = LambdaCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(container,
      arrayOf<Any?>(p11, p12, p13, p14, *boundArgs))

  public override fun bind(
    p12: P12,
    p13: P13,
    p14: P14,
  ) = LambdaCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(container,
      arrayOf<Any?>(p12, p13, p14, *boundArgs))

  public override fun bind(p13: P13, p14: P14) =
      LambdaCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>(container,
      arrayOf<Any?>(p13, p14, *boundArgs))

  public override fun bind(p14: P14) =
      LambdaCallable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>(container,
      arrayOf<Any?>(p14, *boundArgs))
}

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4, reified
    P5, reified P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12,
    reified P13, reified P14> callable15(noinline function: (
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
    LambdaCallable15<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>(LambdaContainer15<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>(variantMapper.getOrDefault(R::class, NIL), arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!, variantMapper[P9::class]!!, variantMapper[P10::class]!!, variantMapper[P11::class]!!, variantMapper[P12::class]!!, variantMapper[P13::class]!!, variantMapper[P14::class]!!), function))

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4, reified
    P5, reified P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12,
    reified P13, reified P14> ((
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
) -> R).asCallable() = callable15(this)

public class LambdaCallable16<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14,
    P15> @PublishedApi internal constructor(
  container: LambdaContainer<R>,
  boundArgs: Array<Any?> = emptyArray(),
) : LambdaCallable<R>(container, boundArgs),
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
  ) = LambdaCallable0<R>(container,
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
  ) = LambdaCallable1<R, P0>(container,
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
  ) = LambdaCallable2<R, P0, P1>(container,
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
  ) = LambdaCallable3<R, P0, P1, P2>(container,
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
  ) = LambdaCallable4<R, P0, P1, P2, P3>(container,
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
  ) = LambdaCallable5<R, P0, P1, P2, P3, P4>(container,
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
  ) = LambdaCallable6<R, P0, P1, P2, P3, P4, P5>(container,
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
  ) = LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>(container,
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
  ) = LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(container,
      arrayOf<Any?>(p8, p9, p10, p11, p12, p13, p14, p15, *boundArgs))

  public override fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) = LambdaCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(container,
      arrayOf<Any?>(p9, p10, p11, p12, p13, p14, p15, *boundArgs))

  public override fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) = LambdaCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(container,
      arrayOf<Any?>(p10, p11, p12, p13, p14, p15, *boundArgs))

  public override fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) = LambdaCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(container,
      arrayOf<Any?>(p11, p12, p13, p14, p15, *boundArgs))

  public override fun bind(
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) = LambdaCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(container,
      arrayOf<Any?>(p12, p13, p14, p15, *boundArgs))

  public override fun bind(
    p13: P13,
    p14: P14,
    p15: P15,
  ) = LambdaCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>(container,
      arrayOf<Any?>(p13, p14, p15, *boundArgs))

  public override fun bind(p14: P14, p15: P15) =
      LambdaCallable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>(container,
      arrayOf<Any?>(p14, p15, *boundArgs))

  public override fun bind(p15: P15) =
      LambdaCallable15<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>(container,
      arrayOf<Any?>(p15, *boundArgs))
}

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4, reified
    P5, reified P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12,
    reified P13, reified P14, reified P15> callable16(noinline function: (
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
    LambdaCallable16<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>(LambdaContainer16<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>(variantMapper.getOrDefault(R::class, NIL), arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!, variantMapper[P9::class]!!, variantMapper[P10::class]!!, variantMapper[P11::class]!!, variantMapper[P12::class]!!, variantMapper[P13::class]!!, variantMapper[P14::class]!!, variantMapper[P15::class]!!), function))

public inline fun <reified R, reified P0, reified P1, reified P2, reified P3, reified P4, reified
    P5, reified P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12,
    reified P13, reified P14, reified P15> ((
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
) -> R).asCallable() = callable16(this)
