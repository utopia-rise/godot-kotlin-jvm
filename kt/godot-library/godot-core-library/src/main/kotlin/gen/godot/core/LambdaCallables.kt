@file:Suppress(
  "PackageDirectoryMismatch", "UNCHECKED_CAST",
  "unused",
)

package godot.core

import godot.core.VariantParser.NIL
import kotlin.PublishedApi
import kotlin.Suppress

public class LambdaCallable0<R> @PublishedApi internal constructor(
  container: LambdaContainer<R>,
) : LambdaCallable<R>(container) {
  public fun call(): R = container.invokeUnsafe()

  public fun callDeferred() = callDeferredUnsafe()

  public operator fun invoke(): R = call()
}

public inline fun <reified R> callable0(noinline function: () -> R) =
    LambdaCallable0<R>(LambdaContainer0<R>(variantMapper.getOrDefault(R::class, NIL), arrayOf(), function))

public inline fun <reified R> (() -> R).asCallable() = callable0(this)

public class LambdaCallable1<R, P0> @PublishedApi internal constructor(
  container: LambdaContainer<R>,
) : LambdaCallable<R>(container) {
  public fun call(p0: P0): R = container.invokeUnsafe(p0)

  public fun callDeferred(p0: P0) = callDeferredUnsafe(p0)

  public operator fun invoke(p0: P0): R = call(p0)

  public fun bind(p0: P0) = LambdaCallable0<R>(container).bindUnsafe(p0) as LambdaCallable0<R>
}

public inline fun <reified P0, reified R> callable1(noinline function: (p0: P0) -> R) =
    LambdaCallable1<R, P0>(LambdaContainer1<R, P0>(variantMapper.getOrDefault(R::class, NIL), arrayOf(variantMapper[P0::class]!!), function))

public inline fun <reified P0, reified R> ((p0: P0) -> R).asCallable() = callable1(this)

public class LambdaCallable2<R, P0, P1> @PublishedApi internal constructor(
  container: LambdaContainer<R>,
) : LambdaCallable<R>(container) {
  public fun call(p0: P0, p1: P1): R = container.invokeUnsafe(p0, p1)

  public fun callDeferred(p0: P0, p1: P1) = callDeferredUnsafe(p0, p1)

  public operator fun invoke(p0: P0, p1: P1): R = call(p0, p1)

  public fun bind(p0: P0, p1: P1) =
      LambdaCallable0<R>(container).bindUnsafe(p0, p1) as LambdaCallable0<R>

  public fun bind(p1: P1) =
      LambdaCallable1<R, P0>(container).bindUnsafe(p1) as LambdaCallable1<R, P0>
}

public inline fun <reified P0, reified P1, reified R> callable2(noinline function: (p0: P0,
    p1: P1) -> R) =
    LambdaCallable2<R, P0, P1>(LambdaContainer2<R, P0, P1>(variantMapper.getOrDefault(R::class, NIL), arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!), function))

public inline fun <reified P0, reified P1, reified R> ((p0: P0, p1: P1) -> R).asCallable() =
    callable2(this)

public class LambdaCallable3<R, P0, P1, P2> @PublishedApi internal constructor(
  container: LambdaContainer<R>,
) : LambdaCallable<R>(container) {
  public fun call(
    p0: P0,
    p1: P1,
    p2: P2,
  ): R = container.invokeUnsafe(p0, p1, p2)

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
  ) = LambdaCallable0<R>(container).bindUnsafe(p0, p1, p2) as LambdaCallable0<R>

  public fun bind(p1: P1, p2: P2) =
      LambdaCallable1<R, P0>(container).bindUnsafe(p1, p2) as LambdaCallable1<R, P0>

  public fun bind(p2: P2) =
      LambdaCallable2<R, P0, P1>(container).bindUnsafe(p2) as LambdaCallable2<R, P0, P1>
}

public inline fun <reified P0, reified P1, reified P2, reified R> callable3(noinline function: (
  p0: P0,
  p1: P1,
  p2: P2,
) -> R) =
    LambdaCallable3<R, P0, P1, P2>(LambdaContainer3<R, P0, P1, P2>(variantMapper.getOrDefault(R::class, NIL), arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!), function))

public inline fun <reified P0, reified P1, reified P2, reified R> ((
  p0: P0,
  p1: P1,
  p2: P2,
) -> R).asCallable() = callable3(this)

public class LambdaCallable4<R, P0, P1, P2, P3> @PublishedApi internal constructor(
  container: LambdaContainer<R>,
) : LambdaCallable<R>(container) {
  public fun call(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
  ): R = container.invokeUnsafe(p0, p1, p2, p3)

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
  ) = LambdaCallable0<R>(container).bindUnsafe(p0, p1, p2, p3) as LambdaCallable0<R>

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
  ) = LambdaCallable1<R, P0>(container).bindUnsafe(p1, p2, p3) as LambdaCallable1<R, P0>

  public fun bind(p2: P2, p3: P3) =
      LambdaCallable2<R, P0, P1>(container).bindUnsafe(p2, p3) as LambdaCallable2<R, P0, P1>

  public fun bind(p3: P3) =
      LambdaCallable3<R, P0, P1, P2>(container).bindUnsafe(p3) as LambdaCallable3<R, P0, P1, P2>
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified R> callable4(noinline
    function: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
) -> R) =
    LambdaCallable4<R, P0, P1, P2, P3>(LambdaContainer4<R, P0, P1, P2, P3>(variantMapper.getOrDefault(R::class, NIL), arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!), function))

public inline fun <reified P0, reified P1, reified P2, reified P3, reified R> ((
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
) -> R).asCallable() = callable4(this)

public class LambdaCallable5<R, P0, P1, P2, P3, P4> @PublishedApi internal constructor(
  container: LambdaContainer<R>,
) : LambdaCallable<R>(container) {
  public fun call(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ): R = container.invokeUnsafe(p0, p1, p2, p3, p4)

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
  ) = LambdaCallable0<R>(container).bindUnsafe(p0, p1, p2, p3, p4) as LambdaCallable0<R>

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ) = LambdaCallable1<R, P0>(container).bindUnsafe(p1, p2, p3, p4) as LambdaCallable1<R, P0>

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
  ) = LambdaCallable2<R, P0, P1>(container).bindUnsafe(p2, p3, p4) as LambdaCallable2<R, P0, P1>

  public fun bind(p3: P3, p4: P4) =
      LambdaCallable3<R, P0, P1, P2>(container).bindUnsafe(p3, p4) as LambdaCallable3<R, P0, P1, P2>

  public fun bind(p4: P4) =
      LambdaCallable4<R, P0, P1, P2, P3>(container).bindUnsafe(p4) as LambdaCallable4<R, P0, P1, P2, P3>
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified R>
    callable5(noinline function: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
) -> R) =
    LambdaCallable5<R, P0, P1, P2, P3, P4>(LambdaContainer5<R, P0, P1, P2, P3, P4>(variantMapper.getOrDefault(R::class, NIL), arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!), function))

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified R> ((
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
) -> R).asCallable() = callable5(this)

public class LambdaCallable6<R, P0, P1, P2, P3, P4, P5> @PublishedApi internal constructor(
  container: LambdaContainer<R>,
) : LambdaCallable<R>(container) {
  public fun call(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ): R = container.invokeUnsafe(p0, p1, p2, p3, p4, p5)

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
  ) = LambdaCallable0<R>(container).bindUnsafe(p0, p1, p2, p3, p4, p5) as LambdaCallable0<R>

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) = LambdaCallable1<R, P0>(container).bindUnsafe(p1, p2, p3, p4, p5) as LambdaCallable1<R, P0>

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) = LambdaCallable2<R, P0, P1>(container).bindUnsafe(p2, p3, p4, p5) as LambdaCallable2<R, P0, P1>

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
  ) =
      LambdaCallable3<R, P0, P1, P2>(container).bindUnsafe(p3, p4, p5) as LambdaCallable3<R, P0, P1, P2>

  public fun bind(p4: P4, p5: P5) =
      LambdaCallable4<R, P0, P1, P2, P3>(container).bindUnsafe(p4, p5) as LambdaCallable4<R, P0, P1, P2, P3>

  public fun bind(p5: P5) =
      LambdaCallable5<R, P0, P1, P2, P3, P4>(container).bindUnsafe(p5) as LambdaCallable5<R, P0, P1, P2, P3, P4>
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    R> callable6(noinline function: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
) -> R) =
    LambdaCallable6<R, P0, P1, P2, P3, P4, P5>(LambdaContainer6<R, P0, P1, P2, P3, P4, P5>(variantMapper.getOrDefault(R::class, NIL), arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!), function))

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    R> ((
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
) -> R).asCallable() = callable6(this)

public class LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6> @PublishedApi internal constructor(
  container: LambdaContainer<R>,
) : LambdaCallable<R>(container) {
  public fun call(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ): R = container.invokeUnsafe(p0, p1, p2, p3, p4, p5, p6)

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
  ) = LambdaCallable0<R>(container).bindUnsafe(p0, p1, p2, p3, p4, p5, p6) as LambdaCallable0<R>

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) = LambdaCallable1<R, P0>(container).bindUnsafe(p1, p2, p3, p4, p5, p6) as LambdaCallable1<R, P0>

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) =
      LambdaCallable2<R, P0, P1>(container).bindUnsafe(p2, p3, p4, p5, p6) as LambdaCallable2<R, P0, P1>

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) =
      LambdaCallable3<R, P0, P1, P2>(container).bindUnsafe(p3, p4, p5, p6) as LambdaCallable3<R, P0, P1, P2>

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
  ) =
      LambdaCallable4<R, P0, P1, P2, P3>(container).bindUnsafe(p4, p5, p6) as LambdaCallable4<R, P0, P1, P2, P3>

  public fun bind(p5: P5, p6: P6) =
      LambdaCallable5<R, P0, P1, P2, P3, P4>(container).bindUnsafe(p5, p6) as LambdaCallable5<R, P0, P1, P2, P3, P4>

  public fun bind(p6: P6) =
      LambdaCallable6<R, P0, P1, P2, P3, P4, P5>(container).bindUnsafe(p6) as LambdaCallable6<R, P0, P1, P2, P3, P4, P5>
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified R> callable7(noinline function: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
) -> R) =
    LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>(LambdaContainer7<R, P0, P1, P2, P3, P4, P5, P6>(variantMapper.getOrDefault(R::class, NIL), arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!), function))

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified R> ((
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
) : LambdaCallable<R>(container) {
  public fun call(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ): R = container.invokeUnsafe(p0, p1, p2, p3, p4, p5, p6, p7)

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
  ) = LambdaCallable0<R>(container).bindUnsafe(p0, p1, p2, p3, p4, p5, p6, p7) as LambdaCallable0<R>

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) =
      LambdaCallable1<R, P0>(container).bindUnsafe(p1, p2, p3, p4, p5, p6, p7) as LambdaCallable1<R, P0>

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) =
      LambdaCallable2<R, P0, P1>(container).bindUnsafe(p2, p3, p4, p5, p6, p7) as LambdaCallable2<R, P0, P1>

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) =
      LambdaCallable3<R, P0, P1, P2>(container).bindUnsafe(p3, p4, p5, p6, p7) as LambdaCallable3<R, P0, P1, P2>

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) =
      LambdaCallable4<R, P0, P1, P2, P3>(container).bindUnsafe(p4, p5, p6, p7) as LambdaCallable4<R, P0, P1, P2, P3>

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
  ) =
      LambdaCallable5<R, P0, P1, P2, P3, P4>(container).bindUnsafe(p5, p6, p7) as LambdaCallable5<R, P0, P1, P2, P3, P4>

  public fun bind(p6: P6, p7: P7) =
      LambdaCallable6<R, P0, P1, P2, P3, P4, P5>(container).bindUnsafe(p6, p7) as LambdaCallable6<R, P0, P1, P2, P3, P4, P5>

  public fun bind(p7: P7) =
      LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>(container).bindUnsafe(p7) as LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified R> callable8(noinline function: (
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

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified R> ((
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
) : LambdaCallable<R>(container) {
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
  ): R = container.invokeUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8)

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
  ) =
      LambdaCallable0<R>(container).bindUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8) as LambdaCallable0<R>

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) =
      LambdaCallable1<R, P0>(container).bindUnsafe(p1, p2, p3, p4, p5, p6, p7, p8) as LambdaCallable1<R, P0>

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) =
      LambdaCallable2<R, P0, P1>(container).bindUnsafe(p2, p3, p4, p5, p6, p7, p8) as LambdaCallable2<R, P0, P1>

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) =
      LambdaCallable3<R, P0, P1, P2>(container).bindUnsafe(p3, p4, p5, p6, p7, p8) as LambdaCallable3<R, P0, P1, P2>

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) =
      LambdaCallable4<R, P0, P1, P2, P3>(container).bindUnsafe(p4, p5, p6, p7, p8) as LambdaCallable4<R, P0, P1, P2, P3>

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) =
      LambdaCallable5<R, P0, P1, P2, P3, P4>(container).bindUnsafe(p5, p6, p7, p8) as LambdaCallable5<R, P0, P1, P2, P3, P4>

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
  ) =
      LambdaCallable6<R, P0, P1, P2, P3, P4, P5>(container).bindUnsafe(p6, p7, p8) as LambdaCallable6<R, P0, P1, P2, P3, P4, P5>

  public fun bind(p7: P7, p8: P8) =
      LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>(container).bindUnsafe(p7, p8) as LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>

  public fun bind(p8: P8) =
      LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(container).bindUnsafe(p8) as LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified R> callable9(noinline function: (
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

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified R> ((
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
) : LambdaCallable<R>(container) {
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
  ): R = container.invokeUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)

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
  ) =
      LambdaCallable0<R>(container).bindUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) as LambdaCallable0<R>

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
  ) =
      LambdaCallable1<R, P0>(container).bindUnsafe(p1, p2, p3, p4, p5, p6, p7, p8, p9) as LambdaCallable1<R, P0>

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) =
      LambdaCallable2<R, P0, P1>(container).bindUnsafe(p2, p3, p4, p5, p6, p7, p8, p9) as LambdaCallable2<R, P0, P1>

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) =
      LambdaCallable3<R, P0, P1, P2>(container).bindUnsafe(p3, p4, p5, p6, p7, p8, p9) as LambdaCallable3<R, P0, P1, P2>

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) =
      LambdaCallable4<R, P0, P1, P2, P3>(container).bindUnsafe(p4, p5, p6, p7, p8, p9) as LambdaCallable4<R, P0, P1, P2, P3>

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) =
      LambdaCallable5<R, P0, P1, P2, P3, P4>(container).bindUnsafe(p5, p6, p7, p8, p9) as LambdaCallable5<R, P0, P1, P2, P3, P4>

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) =
      LambdaCallable6<R, P0, P1, P2, P3, P4, P5>(container).bindUnsafe(p6, p7, p8, p9) as LambdaCallable6<R, P0, P1, P2, P3, P4, P5>

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
  ) =
      LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>(container).bindUnsafe(p7, p8, p9) as LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>

  public fun bind(p8: P8, p9: P9) =
      LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(container).bindUnsafe(p8, p9) as LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>

  public fun bind(p9: P9) =
      LambdaCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(container).bindUnsafe(p9) as LambdaCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified R> callable10(noinline function: (
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

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified R> ((
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
) : LambdaCallable<R>(container) {
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
  ): R = container.invokeUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)

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
  ) =
      LambdaCallable0<R>(container).bindUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) as LambdaCallable0<R>

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
  ) =
      LambdaCallable1<R, P0>(container).bindUnsafe(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) as LambdaCallable1<R, P0>

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
  ) =
      LambdaCallable2<R, P0, P1>(container).bindUnsafe(p2, p3, p4, p5, p6, p7, p8, p9, p10) as LambdaCallable2<R, P0, P1>

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) =
      LambdaCallable3<R, P0, P1, P2>(container).bindUnsafe(p3, p4, p5, p6, p7, p8, p9, p10) as LambdaCallable3<R, P0, P1, P2>

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) =
      LambdaCallable4<R, P0, P1, P2, P3>(container).bindUnsafe(p4, p5, p6, p7, p8, p9, p10) as LambdaCallable4<R, P0, P1, P2, P3>

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) =
      LambdaCallable5<R, P0, P1, P2, P3, P4>(container).bindUnsafe(p5, p6, p7, p8, p9, p10) as LambdaCallable5<R, P0, P1, P2, P3, P4>

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) =
      LambdaCallable6<R, P0, P1, P2, P3, P4, P5>(container).bindUnsafe(p6, p7, p8, p9, p10) as LambdaCallable6<R, P0, P1, P2, P3, P4, P5>

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) =
      LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>(container).bindUnsafe(p7, p8, p9, p10) as LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
  ) =
      LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(container).bindUnsafe(p8, p9, p10) as LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>

  public fun bind(p9: P9, p10: P10) =
      LambdaCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(container).bindUnsafe(p9, p10) as LambdaCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>

  public fun bind(p10: P10) =
      LambdaCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(container).bindUnsafe(p10) as LambdaCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified R> callable11(noinline function: (
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

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified R> ((
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
) : LambdaCallable<R>(container) {
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
  ): R = container.invokeUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)

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
  ) =
      LambdaCallable0<R>(container).bindUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) as LambdaCallable0<R>

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
  ) =
      LambdaCallable1<R, P0>(container).bindUnsafe(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) as LambdaCallable1<R, P0>

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
  ) =
      LambdaCallable2<R, P0, P1>(container).bindUnsafe(p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) as LambdaCallable2<R, P0, P1>

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
  ) =
      LambdaCallable3<R, P0, P1, P2>(container).bindUnsafe(p3, p4, p5, p6, p7, p8, p9, p10, p11) as LambdaCallable3<R, P0, P1, P2>

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) =
      LambdaCallable4<R, P0, P1, P2, P3>(container).bindUnsafe(p4, p5, p6, p7, p8, p9, p10, p11) as LambdaCallable4<R, P0, P1, P2, P3>

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) =
      LambdaCallable5<R, P0, P1, P2, P3, P4>(container).bindUnsafe(p5, p6, p7, p8, p9, p10, p11) as LambdaCallable5<R, P0, P1, P2, P3, P4>

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) =
      LambdaCallable6<R, P0, P1, P2, P3, P4, P5>(container).bindUnsafe(p6, p7, p8, p9, p10, p11) as LambdaCallable6<R, P0, P1, P2, P3, P4, P5>

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) =
      LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>(container).bindUnsafe(p7, p8, p9, p10, p11) as LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) =
      LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(container).bindUnsafe(p8, p9, p10, p11) as LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
  ) =
      LambdaCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(container).bindUnsafe(p9, p10, p11) as LambdaCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>

  public fun bind(p10: P10, p11: P11) =
      LambdaCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(container).bindUnsafe(p10, p11) as LambdaCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>

  public fun bind(p11: P11) =
      LambdaCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(container).bindUnsafe(p11) as LambdaCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified R> callable12(noinline
    function: (
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

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified R> ((
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
) : LambdaCallable<R>(container) {
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
  ): R = container.invokeUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)

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
  ) =
      LambdaCallable0<R>(container).bindUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) as LambdaCallable0<R>

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
  ) =
      LambdaCallable1<R, P0>(container).bindUnsafe(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) as LambdaCallable1<R, P0>

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
  ) =
      LambdaCallable2<R, P0, P1>(container).bindUnsafe(p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) as LambdaCallable2<R, P0, P1>

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
  ) =
      LambdaCallable3<R, P0, P1, P2>(container).bindUnsafe(p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) as LambdaCallable3<R, P0, P1, P2>

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
  ) =
      LambdaCallable4<R, P0, P1, P2, P3>(container).bindUnsafe(p4, p5, p6, p7, p8, p9, p10, p11, p12) as LambdaCallable4<R, P0, P1, P2, P3>

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) =
      LambdaCallable5<R, P0, P1, P2, P3, P4>(container).bindUnsafe(p5, p6, p7, p8, p9, p10, p11, p12) as LambdaCallable5<R, P0, P1, P2, P3, P4>

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) =
      LambdaCallable6<R, P0, P1, P2, P3, P4, P5>(container).bindUnsafe(p6, p7, p8, p9, p10, p11, p12) as LambdaCallable6<R, P0, P1, P2, P3, P4, P5>

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) =
      LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>(container).bindUnsafe(p7, p8, p9, p10, p11, p12) as LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) =
      LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(container).bindUnsafe(p8, p9, p10, p11, p12) as LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) =
      LambdaCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(container).bindUnsafe(p9, p10, p11, p12) as LambdaCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>

  public fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
  ) =
      LambdaCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(container).bindUnsafe(p10, p11, p12) as LambdaCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>

  public fun bind(p11: P11, p12: P12) =
      LambdaCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(container).bindUnsafe(p11, p12) as LambdaCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>

  public fun bind(p12: P12) =
      LambdaCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(container).bindUnsafe(p12) as LambdaCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified R>
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

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified R> ((
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
) : LambdaCallable<R>(container) {
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
  ): R = container.invokeUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)

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
  ) =
      LambdaCallable0<R>(container).bindUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) as LambdaCallable0<R>

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
  ) =
      LambdaCallable1<R, P0>(container).bindUnsafe(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) as LambdaCallable1<R, P0>

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
  ) =
      LambdaCallable2<R, P0, P1>(container).bindUnsafe(p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) as LambdaCallable2<R, P0, P1>

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
  ) =
      LambdaCallable3<R, P0, P1, P2>(container).bindUnsafe(p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) as LambdaCallable3<R, P0, P1, P2>

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
  ) =
      LambdaCallable4<R, P0, P1, P2, P3>(container).bindUnsafe(p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) as LambdaCallable4<R, P0, P1, P2, P3>

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
  ) =
      LambdaCallable5<R, P0, P1, P2, P3, P4>(container).bindUnsafe(p5, p6, p7, p8, p9, p10, p11, p12, p13) as LambdaCallable5<R, P0, P1, P2, P3, P4>

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) =
      LambdaCallable6<R, P0, P1, P2, P3, P4, P5>(container).bindUnsafe(p6, p7, p8, p9, p10, p11, p12, p13) as LambdaCallable6<R, P0, P1, P2, P3, P4, P5>

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) =
      LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>(container).bindUnsafe(p7, p8, p9, p10, p11, p12, p13) as LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) =
      LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(container).bindUnsafe(p8, p9, p10, p11, p12, p13) as LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) =
      LambdaCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(container).bindUnsafe(p9, p10, p11, p12, p13) as LambdaCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>

  public fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) =
      LambdaCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(container).bindUnsafe(p10, p11, p12, p13) as LambdaCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>

  public fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
  ) =
      LambdaCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(container).bindUnsafe(p11, p12, p13) as LambdaCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>

  public fun bind(p12: P12, p13: P13) =
      LambdaCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(container).bindUnsafe(p12, p13) as LambdaCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>

  public fun bind(p13: P13) =
      LambdaCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>(container).bindUnsafe(p13) as LambdaCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13,
    reified R> callable14(noinline function: (
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

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13,
    reified R> ((
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
) : LambdaCallable<R>(container) {
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
  ): R = container.invokeUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14)

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
  ) =
      LambdaCallable0<R>(container).bindUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) as LambdaCallable0<R>

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
  ) =
      LambdaCallable1<R, P0>(container).bindUnsafe(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) as LambdaCallable1<R, P0>

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
  ) =
      LambdaCallable2<R, P0, P1>(container).bindUnsafe(p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) as LambdaCallable2<R, P0, P1>

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
  ) =
      LambdaCallable3<R, P0, P1, P2>(container).bindUnsafe(p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) as LambdaCallable3<R, P0, P1, P2>

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
  ) =
      LambdaCallable4<R, P0, P1, P2, P3>(container).bindUnsafe(p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) as LambdaCallable4<R, P0, P1, P2, P3>

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
  ) =
      LambdaCallable5<R, P0, P1, P2, P3, P4>(container).bindUnsafe(p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) as LambdaCallable5<R, P0, P1, P2, P3, P4>

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
  ) =
      LambdaCallable6<R, P0, P1, P2, P3, P4, P5>(container).bindUnsafe(p6, p7, p8, p9, p10, p11, p12, p13, p14) as LambdaCallable6<R, P0, P1, P2, P3, P4, P5>

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) =
      LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>(container).bindUnsafe(p7, p8, p9, p10, p11, p12, p13, p14) as LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) =
      LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(container).bindUnsafe(p8, p9, p10, p11, p12, p13, p14) as LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) =
      LambdaCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(container).bindUnsafe(p9, p10, p11, p12, p13, p14) as LambdaCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>

  public fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) =
      LambdaCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(container).bindUnsafe(p10, p11, p12, p13, p14) as LambdaCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>

  public fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) =
      LambdaCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(container).bindUnsafe(p11, p12, p13, p14) as LambdaCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>

  public fun bind(
    p12: P12,
    p13: P13,
    p14: P14,
  ) =
      LambdaCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(container).bindUnsafe(p12, p13, p14) as LambdaCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>

  public fun bind(p13: P13, p14: P14) =
      LambdaCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>(container).bindUnsafe(p13, p14) as LambdaCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>

  public fun bind(p14: P14) =
      LambdaCallable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>(container).bindUnsafe(p14) as LambdaCallable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13,
    reified P14, reified R> callable15(noinline function: (
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

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13,
    reified P14, reified R> ((
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
) : LambdaCallable<R>(container) {
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
  ): R =
      container.invokeUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)

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
  ) =
      LambdaCallable0<R>(container).bindUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) as LambdaCallable0<R>

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
  ) =
      LambdaCallable1<R, P0>(container).bindUnsafe(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) as LambdaCallable1<R, P0>

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
  ) =
      LambdaCallable2<R, P0, P1>(container).bindUnsafe(p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) as LambdaCallable2<R, P0, P1>

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
  ) =
      LambdaCallable3<R, P0, P1, P2>(container).bindUnsafe(p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) as LambdaCallable3<R, P0, P1, P2>

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
  ) =
      LambdaCallable4<R, P0, P1, P2, P3>(container).bindUnsafe(p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) as LambdaCallable4<R, P0, P1, P2, P3>

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
  ) =
      LambdaCallable5<R, P0, P1, P2, P3, P4>(container).bindUnsafe(p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) as LambdaCallable5<R, P0, P1, P2, P3, P4>

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
  ) =
      LambdaCallable6<R, P0, P1, P2, P3, P4, P5>(container).bindUnsafe(p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) as LambdaCallable6<R, P0, P1, P2, P3, P4, P5>

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
  ) =
      LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>(container).bindUnsafe(p7, p8, p9, p10, p11, p12, p13, p14, p15) as LambdaCallable7<R, P0, P1, P2, P3, P4, P5, P6>

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) =
      LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(container).bindUnsafe(p8, p9, p10, p11, p12, p13, p14, p15) as LambdaCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) =
      LambdaCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(container).bindUnsafe(p9, p10, p11, p12, p13, p14, p15) as LambdaCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>

  public fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) =
      LambdaCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(container).bindUnsafe(p10, p11, p12, p13, p14, p15) as LambdaCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>

  public fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) =
      LambdaCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(container).bindUnsafe(p11, p12, p13, p14, p15) as LambdaCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>

  public fun bind(
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) =
      LambdaCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(container).bindUnsafe(p12, p13, p14, p15) as LambdaCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>

  public fun bind(
    p13: P13,
    p14: P14,
    p15: P15,
  ) =
      LambdaCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>(container).bindUnsafe(p13, p14, p15) as LambdaCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>

  public fun bind(p14: P14, p15: P15) =
      LambdaCallable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>(container).bindUnsafe(p14, p15) as LambdaCallable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>

  public fun bind(p15: P15) =
      LambdaCallable15<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>(container).bindUnsafe(p15) as LambdaCallable15<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13,
    reified P14, reified P15, reified R> callable16(noinline function: (
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

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13,
    reified P14, reified P15, reified R> ((
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
