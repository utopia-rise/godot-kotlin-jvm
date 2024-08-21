@file:Suppress("PackageDirectoryMismatch", "UNCHECKED_CAST")

package godot.core.callable

import godot.core.VariantType
import godot.core.VariantType.NIL
import godot.core.variantMapper
import kotlin.Any
import kotlin.Boolean
import kotlin.Pair
import kotlin.Suppress

public class KtCallable0<R>(
  variantType: VariantType,
  private val function: () -> R,
) : KtCallable<R>(variantType) {
  public override fun invokeKt(): R = function()

  public operator fun invoke(): R = function()

  public override fun call(vararg args: Any?): Any? = function()
}

public inline fun <reified R> callable(noinline function: () -> R) =
    KtCallable0(variantMapper.getOrDefault(R::class, NIL), function)

public inline fun <reified R> (() -> R).asCallable() = callable(this)

public class KtCallable1<P0, R>(
  variantType: VariantType,
  p0Type: Pair<VariantType, Boolean>,
  private val function: (p0: P0) -> R,
) : KtCallable<R>(variantType, p0Type) {
  public override fun invokeKt(): R = function(paramsArray[0] as P0)

  public operator fun invoke(p0: P0): R = function(p0)

  public override fun call(vararg args: Any?): Any? = function(args[0] as P0)

  public fun bind(p0: P0) = KtCallable0(variantType) {  -> function(p0) }
}

public inline fun <reified P0, reified R> callable(noinline function: (p0: P0) -> R) =
    KtCallable1(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!! to true, function)

public inline fun <reified P0, reified R> ((p0: P0) -> R).asCallable() = callable(this)

public class KtCallable2<P0, P1, R>(
  variantType: VariantType,
  private val p0Type: Pair<VariantType, Boolean>,
  p1Type: Pair<VariantType, Boolean>,
  private val function: (p0: P0, p1: P1) -> R,
) : KtCallable<R>(variantType, p0Type, p1Type) {
  public override fun invokeKt(): R = function(paramsArray[0] as P0, paramsArray[1] as P1)

  public operator fun invoke(p0: P0, p1: P1): R = function(p0, p1)

  public override fun call(vararg args: Any?): Any? = function(args[0] as P0, args[1] as P1)

  public fun bind(p0: P0, p1: P1) = KtCallable0(variantType) {  -> function(p0, p1) }

  public fun bind(p1: P1) = KtCallable1(variantType, p0Type) { p0: P0 -> function(p0, p1) }
}

public inline fun <reified P0, reified P1, reified R> callable(noinline function: (p0: P0,
    p1: P1) -> R) =
    KtCallable2(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!! to true, variantMapper[P1::class]!! to true, function)

public inline fun <reified P0, reified P1, reified R> ((p0: P0, p1: P1) -> R).asCallable() =
    callable(this)

public class KtCallable3<P0, P1, P2, R>(
  variantType: VariantType,
  private val p0Type: Pair<VariantType, Boolean>,
  private val p1Type: Pair<VariantType, Boolean>,
  p2Type: Pair<VariantType, Boolean>,
  private val function: (
    p0: P0,
    p1: P1,
    p2: P2,
  ) -> R,
) : KtCallable<R>(variantType, p0Type, p1Type, p2Type) {
  public override fun invokeKt(): R =
      function(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2)

  public operator fun invoke(
    p0: P0,
    p1: P1,
    p2: P2,
  ): R = function(p0, p1, p2)

  public override fun call(vararg args: Any?): Any? =
      function(args[0] as P0, args[1] as P1, args[2] as P2)

  public fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
  ) = KtCallable0(variantType) {  -> function(p0, p1, p2) }

  public fun bind(p1: P1, p2: P2) =
      KtCallable1(variantType, p0Type) { p0: P0 -> function(p0, p1, p2) }

  public fun bind(p2: P2) =
      KtCallable2(variantType, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2) }
}

public inline fun <reified P0, reified P1, reified P2, reified R> callable(noinline function: (
  p0: P0,
  p1: P1,
  p2: P2,
) -> R) =
    KtCallable3(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!! to true, variantMapper[P1::class]!! to true, variantMapper[P2::class]!! to true, function)

public inline fun <reified P0, reified P1, reified P2, reified R> ((
  p0: P0,
  p1: P1,
  p2: P2,
) -> R).asCallable() = callable(this)

public class KtCallable4<P0, P1, P2, P3, R>(
  variantType: VariantType,
  private val p0Type: Pair<VariantType, Boolean>,
  private val p1Type: Pair<VariantType, Boolean>,
  private val p2Type: Pair<VariantType, Boolean>,
  p3Type: Pair<VariantType, Boolean>,
  private val function: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
  ) -> R,
) : KtCallable<R>(variantType, p0Type, p1Type, p2Type, p3Type) {
  public override fun invokeKt(): R =
      function(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3)

  public operator fun invoke(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
  ): R = function(p0, p1, p2, p3)

  public override fun call(vararg args: Any?): Any? =
      function(args[0] as P0, args[1] as P1, args[2] as P2, args[3] as P3)

  public fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
  ) = KtCallable0(variantType) {  -> function(p0, p1, p2, p3) }

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
  ) = KtCallable1(variantType, p0Type) { p0: P0 -> function(p0, p1, p2, p3) }

  public fun bind(p2: P2, p3: P3) =
      KtCallable2(variantType, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3) }

  public fun bind(p3: P3) =
      KtCallable3(variantType, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3) }
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified R> callable(noinline
    function: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
) -> R) =
    KtCallable4(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!! to true, variantMapper[P1::class]!! to true, variantMapper[P2::class]!! to true, variantMapper[P3::class]!! to true, function)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified R> ((
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
) -> R).asCallable() = callable(this)

public class KtCallable5<P0, P1, P2, P3, P4, R>(
  variantType: VariantType,
  private val p0Type: Pair<VariantType, Boolean>,
  private val p1Type: Pair<VariantType, Boolean>,
  private val p2Type: Pair<VariantType, Boolean>,
  private val p3Type: Pair<VariantType, Boolean>,
  p4Type: Pair<VariantType, Boolean>,
  private val function: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ) -> R,
) : KtCallable<R>(variantType, p0Type, p1Type, p2Type, p3Type, p4Type) {
  public override fun invokeKt(): R =
      function(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4)

  public operator fun invoke(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ): R = function(p0, p1, p2, p3, p4)

  public override fun call(vararg args: Any?): Any? =
      function(args[0] as P0, args[1] as P1, args[2] as P2, args[3] as P3, args[4] as P4)

  public fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ) = KtCallable0(variantType) {  -> function(p0, p1, p2, p3, p4) }

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ) = KtCallable1(variantType, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4) }

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
  ) = KtCallable2(variantType, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4) }

  public fun bind(p3: P3, p4: P4) =
      KtCallable3(variantType, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4) }

  public fun bind(p4: P4) =
      KtCallable4(variantType, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4) }
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified R>
    callable(noinline function: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
) -> R) =
    KtCallable5(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!! to true, variantMapper[P1::class]!! to true, variantMapper[P2::class]!! to true, variantMapper[P3::class]!! to true, variantMapper[P4::class]!! to true, function)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified R> ((
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
) -> R).asCallable() = callable(this)

public class KtCallable6<P0, P1, P2, P3, P4, P5, R>(
  variantType: VariantType,
  private val p0Type: Pair<VariantType, Boolean>,
  private val p1Type: Pair<VariantType, Boolean>,
  private val p2Type: Pair<VariantType, Boolean>,
  private val p3Type: Pair<VariantType, Boolean>,
  private val p4Type: Pair<VariantType, Boolean>,
  p5Type: Pair<VariantType, Boolean>,
  private val function: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) -> R,
) : KtCallable<R>(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) {
  public override fun invokeKt(): R =
      function(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4, paramsArray[5] as P5)

  public operator fun invoke(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ): R = function(p0, p1, p2, p3, p4, p5)

  public override fun call(vararg args: Any?): Any? =
      function(args[0] as P0, args[1] as P1, args[2] as P2, args[3] as P3, args[4] as P4, args[5] as P5)

  public fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) = KtCallable0(variantType) {  -> function(p0, p1, p2, p3, p4, p5) }

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) = KtCallable1(variantType, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5) }

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) =
      KtCallable2(variantType, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5) }

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
  ) =
      KtCallable3(variantType, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5) }

  public fun bind(p4: P4, p5: P5) =
      KtCallable4(variantType, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5) }

  public fun bind(p5: P5) =
      KtCallable5(variantType, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5) }
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    R> callable(noinline function: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
) -> R) =
    KtCallable6(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!! to true, variantMapper[P1::class]!! to true, variantMapper[P2::class]!! to true, variantMapper[P3::class]!! to true, variantMapper[P4::class]!! to true, variantMapper[P5::class]!! to true, function)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    R> ((
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
) -> R).asCallable() = callable(this)

public class KtCallable7<P0, P1, P2, P3, P4, P5, P6, R>(
  variantType: VariantType,
  private val p0Type: Pair<VariantType, Boolean>,
  private val p1Type: Pair<VariantType, Boolean>,
  private val p2Type: Pair<VariantType, Boolean>,
  private val p3Type: Pair<VariantType, Boolean>,
  private val p4Type: Pair<VariantType, Boolean>,
  private val p5Type: Pair<VariantType, Boolean>,
  p6Type: Pair<VariantType, Boolean>,
  private val function: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) -> R,
) : KtCallable<R>(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) {
  public override fun invokeKt(): R =
      function(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4, paramsArray[5] as P5, paramsArray[6] as P6)

  public operator fun invoke(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ): R = function(p0, p1, p2, p3, p4, p5, p6)

  public override fun call(vararg args: Any?): Any? =
      function(args[0] as P0, args[1] as P1, args[2] as P2, args[3] as P3, args[4] as P4, args[5] as P5, args[6] as P6)

  public fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) = KtCallable0(variantType) {  -> function(p0, p1, p2, p3, p4, p5, p6) }

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) = KtCallable1(variantType, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6) }

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) =
      KtCallable2(variantType, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6) }

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) =
      KtCallable3(variantType, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6) }

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
  ) =
      KtCallable4(variantType, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6) }

  public fun bind(p5: P5, p6: P6) =
      KtCallable5(variantType, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6) }

  public fun bind(p6: P6) =
      KtCallable6(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6) }
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified R> callable(noinline function: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
) -> R) =
    KtCallable7(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!! to true, variantMapper[P1::class]!! to true, variantMapper[P2::class]!! to true, variantMapper[P3::class]!! to true, variantMapper[P4::class]!! to true, variantMapper[P5::class]!! to true, variantMapper[P6::class]!! to true, function)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified R> ((
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
) -> R).asCallable() = callable(this)

public class KtCallable8<P0, P1, P2, P3, P4, P5, P6, P7, R>(
  variantType: VariantType,
  private val p0Type: Pair<VariantType, Boolean>,
  private val p1Type: Pair<VariantType, Boolean>,
  private val p2Type: Pair<VariantType, Boolean>,
  private val p3Type: Pair<VariantType, Boolean>,
  private val p4Type: Pair<VariantType, Boolean>,
  private val p5Type: Pair<VariantType, Boolean>,
  private val p6Type: Pair<VariantType, Boolean>,
  p7Type: Pair<VariantType, Boolean>,
  private val function: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) -> R,
) : KtCallable<R>(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) {
  public override fun invokeKt(): R =
      function(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4, paramsArray[5] as P5, paramsArray[6] as P6, paramsArray[7] as P7)

  public operator fun invoke(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ): R = function(p0, p1, p2, p3, p4, p5, p6, p7)

  public override fun call(vararg args: Any?): Any? =
      function(args[0] as P0, args[1] as P1, args[2] as P2, args[3] as P3, args[4] as P4, args[5] as P5, args[6] as P6, args[7] as P7)

  public fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) = KtCallable0(variantType) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7) }

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) = KtCallable1(variantType, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7) }

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) =
      KtCallable2(variantType, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7) }

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) =
      KtCallable3(variantType, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7) }

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) =
      KtCallable4(variantType, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7) }

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
  ) =
      KtCallable5(variantType, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7) }

  public fun bind(p6: P6, p7: P7) =
      KtCallable6(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7) }

  public fun bind(p7: P7) =
      KtCallable7(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7) }
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified R> callable(noinline function: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
  p7: P7,
) -> R) =
    KtCallable8(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!! to true, variantMapper[P1::class]!! to true, variantMapper[P2::class]!! to true, variantMapper[P3::class]!! to true, variantMapper[P4::class]!! to true, variantMapper[P5::class]!! to true, variantMapper[P6::class]!! to true, variantMapper[P7::class]!! to true, function)

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
) -> R).asCallable() = callable(this)

public class KtCallable9<P0, P1, P2, P3, P4, P5, P6, P7, P8, R>(
  variantType: VariantType,
  private val p0Type: Pair<VariantType, Boolean>,
  private val p1Type: Pair<VariantType, Boolean>,
  private val p2Type: Pair<VariantType, Boolean>,
  private val p3Type: Pair<VariantType, Boolean>,
  private val p4Type: Pair<VariantType, Boolean>,
  private val p5Type: Pair<VariantType, Boolean>,
  private val p6Type: Pair<VariantType, Boolean>,
  private val p7Type: Pair<VariantType, Boolean>,
  p8Type: Pair<VariantType, Boolean>,
  private val function: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) -> R,
) : KtCallable<R>(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type,
    p8Type) {
  public override fun invokeKt(): R =
      function(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4, paramsArray[5] as P5, paramsArray[6] as P6, paramsArray[7] as P7, paramsArray[8] as P8)

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
  ): R = function(p0, p1, p2, p3, p4, p5, p6, p7, p8)

  public override fun call(vararg args: Any?): Any? =
      function(args[0] as P0, args[1] as P1, args[2] as P2, args[3] as P3, args[4] as P4, args[5] as P5, args[6] as P6, args[7] as P7, args[8] as P8)

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
  ) = KtCallable0(variantType) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) = KtCallable1(variantType, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) =
      KtCallable2(variantType, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) =
      KtCallable3(variantType, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) =
      KtCallable4(variantType, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) =
      KtCallable5(variantType, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
  ) =
      KtCallable6(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

  public fun bind(p7: P7, p8: P8) =
      KtCallable7(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

  public fun bind(p8: P8) =
      KtCallable8(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified R> callable(noinline function: (
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
    KtCallable9(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!! to true, variantMapper[P1::class]!! to true, variantMapper[P2::class]!! to true, variantMapper[P3::class]!! to true, variantMapper[P4::class]!! to true, variantMapper[P5::class]!! to true, variantMapper[P6::class]!! to true, variantMapper[P7::class]!! to true, variantMapper[P8::class]!! to true, function)

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
) -> R).asCallable() = callable(this)

public class KtCallable10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, R>(
  variantType: VariantType,
  private val p0Type: Pair<VariantType, Boolean>,
  private val p1Type: Pair<VariantType, Boolean>,
  private val p2Type: Pair<VariantType, Boolean>,
  private val p3Type: Pair<VariantType, Boolean>,
  private val p4Type: Pair<VariantType, Boolean>,
  private val p5Type: Pair<VariantType, Boolean>,
  private val p6Type: Pair<VariantType, Boolean>,
  private val p7Type: Pair<VariantType, Boolean>,
  private val p8Type: Pair<VariantType, Boolean>,
  p9Type: Pair<VariantType, Boolean>,
  private val function: (
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
  ) -> R,
) : KtCallable<R>(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type,
    p8Type, p9Type) {
  public override fun invokeKt(): R =
      function(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4, paramsArray[5] as P5, paramsArray[6] as P6, paramsArray[7] as P7, paramsArray[8] as P8, paramsArray[9] as P9)

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
  ): R = function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)

  public override fun call(vararg args: Any?): Any? =
      function(args[0] as P0, args[1] as P1, args[2] as P2, args[3] as P3, args[4] as P4, args[5] as P5, args[6] as P6, args[7] as P7, args[8] as P8, args[9] as P9)

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
  ) = KtCallable0(variantType) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

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
      KtCallable1(variantType, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

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
      KtCallable2(variantType, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) =
      KtCallable3(variantType, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) =
      KtCallable4(variantType, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) =
      KtCallable5(variantType, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) =
      KtCallable6(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
  ) =
      KtCallable7(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

  public fun bind(p8: P8, p9: P9) =
      KtCallable8(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

  public fun bind(p9: P9) =
      KtCallable9(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified R> callable(noinline function: (
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
    KtCallable10(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!! to true, variantMapper[P1::class]!! to true, variantMapper[P2::class]!! to true, variantMapper[P3::class]!! to true, variantMapper[P4::class]!! to true, variantMapper[P5::class]!! to true, variantMapper[P6::class]!! to true, variantMapper[P7::class]!! to true, variantMapper[P8::class]!! to true, variantMapper[P9::class]!! to true, function)

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
) -> R).asCallable() = callable(this)

public class KtCallable11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R>(
  variantType: VariantType,
  private val p0Type: Pair<VariantType, Boolean>,
  private val p1Type: Pair<VariantType, Boolean>,
  private val p2Type: Pair<VariantType, Boolean>,
  private val p3Type: Pair<VariantType, Boolean>,
  private val p4Type: Pair<VariantType, Boolean>,
  private val p5Type: Pair<VariantType, Boolean>,
  private val p6Type: Pair<VariantType, Boolean>,
  private val p7Type: Pair<VariantType, Boolean>,
  private val p8Type: Pair<VariantType, Boolean>,
  private val p9Type: Pair<VariantType, Boolean>,
  p10Type: Pair<VariantType, Boolean>,
  private val function: (
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
  ) -> R,
) : KtCallable<R>(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type,
    p8Type, p9Type, p10Type) {
  public override fun invokeKt(): R =
      function(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4, paramsArray[5] as P5, paramsArray[6] as P6, paramsArray[7] as P7, paramsArray[8] as P8, paramsArray[9] as P9, paramsArray[10] as P10)

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
  ): R = function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)

  public override fun call(vararg args: Any?): Any? =
      function(args[0] as P0, args[1] as P1, args[2] as P2, args[3] as P3, args[4] as P4, args[5] as P5, args[6] as P6, args[7] as P7, args[8] as P8, args[9] as P9, args[10] as P10)

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
  ) = KtCallable0(variantType) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

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
      KtCallable1(variantType, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

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
      KtCallable2(variantType, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

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
      KtCallable3(variantType, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) =
      KtCallable4(variantType, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) =
      KtCallable5(variantType, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) =
      KtCallable6(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) =
      KtCallable7(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
  ) =
      KtCallable8(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

  public fun bind(p9: P9, p10: P10) =
      KtCallable9(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

  public fun bind(p10: P10) =
      KtCallable10(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified R> callable(noinline function: (
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
    KtCallable11(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!! to true, variantMapper[P1::class]!! to true, variantMapper[P2::class]!! to true, variantMapper[P3::class]!! to true, variantMapper[P4::class]!! to true, variantMapper[P5::class]!! to true, variantMapper[P6::class]!! to true, variantMapper[P7::class]!! to true, variantMapper[P8::class]!! to true, variantMapper[P9::class]!! to true, variantMapper[P10::class]!! to true, function)

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
) -> R).asCallable() = callable(this)

public class KtCallable12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>(
  variantType: VariantType,
  private val p0Type: Pair<VariantType, Boolean>,
  private val p1Type: Pair<VariantType, Boolean>,
  private val p2Type: Pair<VariantType, Boolean>,
  private val p3Type: Pair<VariantType, Boolean>,
  private val p4Type: Pair<VariantType, Boolean>,
  private val p5Type: Pair<VariantType, Boolean>,
  private val p6Type: Pair<VariantType, Boolean>,
  private val p7Type: Pair<VariantType, Boolean>,
  private val p8Type: Pair<VariantType, Boolean>,
  private val p9Type: Pair<VariantType, Boolean>,
  private val p10Type: Pair<VariantType, Boolean>,
  p11Type: Pair<VariantType, Boolean>,
  private val function: (
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
  ) -> R,
) : KtCallable<R>(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type,
    p8Type, p9Type, p10Type, p11Type) {
  public override fun invokeKt(): R =
      function(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4, paramsArray[5] as P5, paramsArray[6] as P6, paramsArray[7] as P7, paramsArray[8] as P8, paramsArray[9] as P9, paramsArray[10] as P10, paramsArray[11] as P11)

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
  ): R = function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)

  public override fun call(vararg args: Any?): Any? =
      function(args[0] as P0, args[1] as P1, args[2] as P2, args[3] as P3, args[4] as P4, args[5] as P5, args[6] as P6, args[7] as P7, args[8] as P8, args[9] as P9, args[10] as P10, args[11] as P11)

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
  ) = KtCallable0(variantType) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

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
      KtCallable1(variantType, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

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
      KtCallable2(variantType, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

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
      KtCallable3(variantType, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

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
      KtCallable4(variantType, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) =
      KtCallable5(variantType, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) =
      KtCallable6(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) =
      KtCallable7(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) =
      KtCallable8(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
  ) =
      KtCallable9(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

  public fun bind(p10: P10, p11: P11) =
      KtCallable10(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

  public fun bind(p11: P11) =
      KtCallable11(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified R> callable(noinline
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
    KtCallable12(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!! to true, variantMapper[P1::class]!! to true, variantMapper[P2::class]!! to true, variantMapper[P3::class]!! to true, variantMapper[P4::class]!! to true, variantMapper[P5::class]!! to true, variantMapper[P6::class]!! to true, variantMapper[P7::class]!! to true, variantMapper[P8::class]!! to true, variantMapper[P9::class]!! to true, variantMapper[P10::class]!! to true, variantMapper[P11::class]!! to true, function)

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
) -> R).asCallable() = callable(this)

public class KtCallable13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>(
  variantType: VariantType,
  private val p0Type: Pair<VariantType, Boolean>,
  private val p1Type: Pair<VariantType, Boolean>,
  private val p2Type: Pair<VariantType, Boolean>,
  private val p3Type: Pair<VariantType, Boolean>,
  private val p4Type: Pair<VariantType, Boolean>,
  private val p5Type: Pair<VariantType, Boolean>,
  private val p6Type: Pair<VariantType, Boolean>,
  private val p7Type: Pair<VariantType, Boolean>,
  private val p8Type: Pair<VariantType, Boolean>,
  private val p9Type: Pair<VariantType, Boolean>,
  private val p10Type: Pair<VariantType, Boolean>,
  private val p11Type: Pair<VariantType, Boolean>,
  p12Type: Pair<VariantType, Boolean>,
  private val function: (
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
  ) -> R,
) : KtCallable<R>(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type,
    p8Type, p9Type, p10Type, p11Type, p12Type) {
  public override fun invokeKt(): R =
      function(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4, paramsArray[5] as P5, paramsArray[6] as P6, paramsArray[7] as P7, paramsArray[8] as P8, paramsArray[9] as P9, paramsArray[10] as P10, paramsArray[11] as P11, paramsArray[12] as P12)

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
  ): R = function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)

  public override fun call(vararg args: Any?): Any? =
      function(args[0] as P0, args[1] as P1, args[2] as P2, args[3] as P3, args[4] as P4, args[5] as P5, args[6] as P6, args[7] as P7, args[8] as P8, args[9] as P9, args[10] as P10, args[11] as P11, args[12] as P12)

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
      KtCallable0(variantType) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

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
      KtCallable1(variantType, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

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
      KtCallable2(variantType, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

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
      KtCallable3(variantType, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

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
      KtCallable4(variantType, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

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
      KtCallable5(variantType, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) =
      KtCallable6(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) =
      KtCallable7(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) =
      KtCallable8(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) =
      KtCallable9(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

  public fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
  ) =
      KtCallable10(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

  public fun bind(p11: P11, p12: P12) =
      KtCallable11(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

  public fun bind(p12: P12) =
      KtCallable12(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified R>
    callable(noinline function: (
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
    KtCallable13(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!! to true, variantMapper[P1::class]!! to true, variantMapper[P2::class]!! to true, variantMapper[P3::class]!! to true, variantMapper[P4::class]!! to true, variantMapper[P5::class]!! to true, variantMapper[P6::class]!! to true, variantMapper[P7::class]!! to true, variantMapper[P8::class]!! to true, variantMapper[P9::class]!! to true, variantMapper[P10::class]!! to true, variantMapper[P11::class]!! to true, variantMapper[P12::class]!! to true, function)

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
) -> R).asCallable() = callable(this)

public class KtCallable14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>(
  variantType: VariantType,
  private val p0Type: Pair<VariantType, Boolean>,
  private val p1Type: Pair<VariantType, Boolean>,
  private val p2Type: Pair<VariantType, Boolean>,
  private val p3Type: Pair<VariantType, Boolean>,
  private val p4Type: Pair<VariantType, Boolean>,
  private val p5Type: Pair<VariantType, Boolean>,
  private val p6Type: Pair<VariantType, Boolean>,
  private val p7Type: Pair<VariantType, Boolean>,
  private val p8Type: Pair<VariantType, Boolean>,
  private val p9Type: Pair<VariantType, Boolean>,
  private val p10Type: Pair<VariantType, Boolean>,
  private val p11Type: Pair<VariantType, Boolean>,
  private val p12Type: Pair<VariantType, Boolean>,
  p13Type: Pair<VariantType, Boolean>,
  private val function: (
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
  ) -> R,
) : KtCallable<R>(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type,
    p8Type, p9Type, p10Type, p11Type, p12Type, p13Type) {
  public override fun invokeKt(): R =
      function(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4, paramsArray[5] as P5, paramsArray[6] as P6, paramsArray[7] as P7, paramsArray[8] as P8, paramsArray[9] as P9, paramsArray[10] as P10, paramsArray[11] as P11, paramsArray[12] as P12, paramsArray[13] as P13)

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
  ): R = function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)

  public override fun call(vararg args: Any?): Any? =
      function(args[0] as P0, args[1] as P1, args[2] as P2, args[3] as P3, args[4] as P4, args[5] as P5, args[6] as P6, args[7] as P7, args[8] as P8, args[9] as P9, args[10] as P10, args[11] as P11, args[12] as P12, args[13] as P13)

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
      KtCallable0(variantType) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

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
      KtCallable1(variantType, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

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
      KtCallable2(variantType, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

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
      KtCallable3(variantType, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

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
      KtCallable4(variantType, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

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
      KtCallable5(variantType, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

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
      KtCallable6(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) =
      KtCallable7(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) =
      KtCallable8(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) =
      KtCallable9(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

  public fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) =
      KtCallable10(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

  public fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
  ) =
      KtCallable11(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

  public fun bind(p12: P12, p13: P13) =
      KtCallable12(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

  public fun bind(p13: P13) =
      KtCallable13(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13,
    reified R> callable(noinline function: (
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
    KtCallable14(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!! to true, variantMapper[P1::class]!! to true, variantMapper[P2::class]!! to true, variantMapper[P3::class]!! to true, variantMapper[P4::class]!! to true, variantMapper[P5::class]!! to true, variantMapper[P6::class]!! to true, variantMapper[P7::class]!! to true, variantMapper[P8::class]!! to true, variantMapper[P9::class]!! to true, variantMapper[P10::class]!! to true, variantMapper[P11::class]!! to true, variantMapper[P12::class]!! to true, variantMapper[P13::class]!! to true, function)

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
) -> R).asCallable() = callable(this)

public class KtCallable15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>(
  variantType: VariantType,
  private val p0Type: Pair<VariantType, Boolean>,
  private val p1Type: Pair<VariantType, Boolean>,
  private val p2Type: Pair<VariantType, Boolean>,
  private val p3Type: Pair<VariantType, Boolean>,
  private val p4Type: Pair<VariantType, Boolean>,
  private val p5Type: Pair<VariantType, Boolean>,
  private val p6Type: Pair<VariantType, Boolean>,
  private val p7Type: Pair<VariantType, Boolean>,
  private val p8Type: Pair<VariantType, Boolean>,
  private val p9Type: Pair<VariantType, Boolean>,
  private val p10Type: Pair<VariantType, Boolean>,
  private val p11Type: Pair<VariantType, Boolean>,
  private val p12Type: Pair<VariantType, Boolean>,
  private val p13Type: Pair<VariantType, Boolean>,
  p14Type: Pair<VariantType, Boolean>,
  private val function: (
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
  ) -> R,
) : KtCallable<R>(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type,
    p8Type, p9Type, p10Type, p11Type, p12Type, p13Type, p14Type) {
  public override fun invokeKt(): R =
      function(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4, paramsArray[5] as P5, paramsArray[6] as P6, paramsArray[7] as P7, paramsArray[8] as P8, paramsArray[9] as P9, paramsArray[10] as P10, paramsArray[11] as P11, paramsArray[12] as P12, paramsArray[13] as P13, paramsArray[14] as P14)

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
  ): R = function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14)

  public override fun call(vararg args: Any?): Any? =
      function(args[0] as P0, args[1] as P1, args[2] as P2, args[3] as P3, args[4] as P4, args[5] as P5, args[6] as P6, args[7] as P7, args[8] as P8, args[9] as P9, args[10] as P10, args[11] as P11, args[12] as P12, args[13] as P13, args[14] as P14)

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
      KtCallable0(variantType) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

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
      KtCallable1(variantType, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

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
      KtCallable2(variantType, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

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
      KtCallable3(variantType, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

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
      KtCallable4(variantType, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

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
      KtCallable5(variantType, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

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
      KtCallable6(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

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
      KtCallable7(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) =
      KtCallable8(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) =
      KtCallable9(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

  public fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) =
      KtCallable10(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

  public fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) =
      KtCallable11(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

  public fun bind(
    p12: P12,
    p13: P13,
    p14: P14,
  ) =
      KtCallable12(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

  public fun bind(p13: P13, p14: P14) =
      KtCallable13(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

  public fun bind(p14: P14) =
      KtCallable14(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type, p13Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13,
    reified P14, reified R> callable(noinline function: (
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
    KtCallable15(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!! to true, variantMapper[P1::class]!! to true, variantMapper[P2::class]!! to true, variantMapper[P3::class]!! to true, variantMapper[P4::class]!! to true, variantMapper[P5::class]!! to true, variantMapper[P6::class]!! to true, variantMapper[P7::class]!! to true, variantMapper[P8::class]!! to true, variantMapper[P9::class]!! to true, variantMapper[P10::class]!! to true, variantMapper[P11::class]!! to true, variantMapper[P12::class]!! to true, variantMapper[P13::class]!! to true, variantMapper[P14::class]!! to true, function)

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
) -> R).asCallable() = callable(this)

public class KtCallable16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>(
  variantType: VariantType,
  private val p0Type: Pair<VariantType, Boolean>,
  private val p1Type: Pair<VariantType, Boolean>,
  private val p2Type: Pair<VariantType, Boolean>,
  private val p3Type: Pair<VariantType, Boolean>,
  private val p4Type: Pair<VariantType, Boolean>,
  private val p5Type: Pair<VariantType, Boolean>,
  private val p6Type: Pair<VariantType, Boolean>,
  private val p7Type: Pair<VariantType, Boolean>,
  private val p8Type: Pair<VariantType, Boolean>,
  private val p9Type: Pair<VariantType, Boolean>,
  private val p10Type: Pair<VariantType, Boolean>,
  private val p11Type: Pair<VariantType, Boolean>,
  private val p12Type: Pair<VariantType, Boolean>,
  private val p13Type: Pair<VariantType, Boolean>,
  private val p14Type: Pair<VariantType, Boolean>,
  p15Type: Pair<VariantType, Boolean>,
  private val function: (
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
  ) -> R,
) : KtCallable<R>(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type,
    p8Type, p9Type, p10Type, p11Type, p12Type, p13Type, p14Type, p15Type) {
  public override fun invokeKt(): R =
      function(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4, paramsArray[5] as P5, paramsArray[6] as P6, paramsArray[7] as P7, paramsArray[8] as P8, paramsArray[9] as P9, paramsArray[10] as P10, paramsArray[11] as P11, paramsArray[12] as P12, paramsArray[13] as P13, paramsArray[14] as P14, paramsArray[15] as P15)

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
  ): R = function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)

  public override fun call(vararg args: Any?): Any? =
      function(args[0] as P0, args[1] as P1, args[2] as P2, args[3] as P3, args[4] as P4, args[5] as P5, args[6] as P6, args[7] as P7, args[8] as P8, args[9] as P9, args[10] as P10, args[11] as P11, args[12] as P12, args[13] as P13, args[14] as P14, args[15] as P15)

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
      KtCallable0(variantType) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      KtCallable1(variantType, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      KtCallable2(variantType, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      KtCallable3(variantType, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      KtCallable4(variantType, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      KtCallable5(variantType, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      KtCallable6(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      KtCallable7(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      KtCallable8(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) =
      KtCallable9(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

  public fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) =
      KtCallable10(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

  public fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) =
      KtCallable11(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

  public fun bind(
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) =
      KtCallable12(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

  public fun bind(
    p13: P13,
    p14: P14,
    p15: P15,
  ) =
      KtCallable13(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

  public fun bind(p14: P14, p15: P15) =
      KtCallable14(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type, p13Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

  public fun bind(p15: P15) =
      KtCallable15(variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type, p13Type, p14Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13,
    reified P14, reified P15, reified R> callable(noinline function: (
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
    KtCallable16(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!! to true, variantMapper[P1::class]!! to true, variantMapper[P2::class]!! to true, variantMapper[P3::class]!! to true, variantMapper[P4::class]!! to true, variantMapper[P5::class]!! to true, variantMapper[P6::class]!! to true, variantMapper[P7::class]!! to true, variantMapper[P8::class]!! to true, variantMapper[P9::class]!! to true, variantMapper[P10::class]!! to true, variantMapper[P11::class]!! to true, variantMapper[P12::class]!! to true, variantMapper[P13::class]!! to true, variantMapper[P14::class]!! to true, variantMapper[P15::class]!! to true, function)

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
) -> R).asCallable() = callable(this)
