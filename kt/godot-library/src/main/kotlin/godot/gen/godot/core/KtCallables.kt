@file:Suppress("PackageDirectoryMismatch", "UNCHECKED_CAST")

package godot.core

import godot.core.VariantParser.NIL
import java.lang.Class
import kotlin.Any
import kotlin.Suppress
import kotlin.jvm.JvmName
import kotlin.jvm.JvmStatic
import kotlin.jvm.`internal`.Reflection

public class KtCallable0<R>(
  variantConverter: VariantConverter,
  private val function: () -> R,
) : KtCallable<R>(variantConverter) {
  public override fun invokeKt(): R = function()

  public operator fun invoke(): R = function()

  public override fun call(vararg args: Any?): Any? = function()

  public companion object {
    @JvmStatic
    @JvmName("create")
    public fun <R> javaCreate(returnClass: Class<R>, function: () -> R) =
        KtCallable0(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), function)
  }
}

public inline fun <reified R> callable(noinline function: () -> R) =
    KtCallable0(variantMapper.getOrDefault(R::class, NIL), function)

public inline fun <reified R> (() -> R).asCallable() = callable(this)

public class KtCallable1<P0, R>(
  variantConverter: VariantConverter,
  p0Type: VariantConverter,
  private val function: (p0: P0) -> R,
) : KtCallable<R>(variantConverter, p0Type) {
  public override fun invokeKt(): R = function(paramsArray[0] as P0)

  public operator fun invoke(p0: P0): R = function(p0)

  public override fun call(vararg args: Any?): Any? = function(args[0] as P0)

  public fun bind(p0: P0) = KtCallable0(variantConverter) {  -> function(p0) }

  public companion object {
    @JvmStatic
    @JvmName("create")
    public fun <R, P0> javaCreate(
      returnClass: Class<R>,
      p0Class: Class<P0>,
      function: (p0: P0) -> R,
    ) =
        KtCallable1(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, function)
  }
}

public inline fun <reified P0, reified R> callable(noinline function: (p0: P0) -> R) =
    KtCallable1(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!!, function)

public inline fun <reified P0, reified R> ((p0: P0) -> R).asCallable() = callable(this)

public class KtCallable2<P0, P1, R>(
  variantConverter: VariantConverter,
  private val p0Type: VariantConverter,
  p1Type: VariantConverter,
  private val function: (p0: P0, p1: P1) -> R,
) : KtCallable<R>(variantConverter, p0Type, p1Type) {
  public override fun invokeKt(): R = function(paramsArray[0] as P0, paramsArray[1] as P1)

  public operator fun invoke(p0: P0, p1: P1): R = function(p0, p1)

  public override fun call(vararg args: Any?): Any? = function(args[0] as P0, args[1] as P1)

  public fun bind(p0: P0, p1: P1) = KtCallable0(variantConverter) {  -> function(p0, p1) }

  public fun bind(p1: P1) = KtCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1) }

  public companion object {
    @JvmStatic
    @JvmName("create")
    public fun <R, P0, P1> javaCreate(
      returnClass: Class<R>,
      p0Class: Class<P0>,
      p1Class: Class<P1>,
      function: (p0: P0, p1: P1) -> R,
    ) =
        KtCallable2(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, function)
  }
}

public inline fun <reified P0, reified P1, reified R> callable(noinline function: (p0: P0,
    p1: P1) -> R) =
    KtCallable2(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!!, variantMapper[P1::class]!!, function)

public inline fun <reified P0, reified P1, reified R> ((p0: P0, p1: P1) -> R).asCallable() =
    callable(this)

public class KtCallable3<P0, P1, P2, R>(
  variantConverter: VariantConverter,
  private val p0Type: VariantConverter,
  private val p1Type: VariantConverter,
  p2Type: VariantConverter,
  private val function: (
    p0: P0,
    p1: P1,
    p2: P2,
  ) -> R,
) : KtCallable<R>(variantConverter, p0Type, p1Type, p2Type) {
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
  ) = KtCallable0(variantConverter) {  -> function(p0, p1, p2) }

  public fun bind(p1: P1, p2: P2) =
      KtCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2) }

  public fun bind(p2: P2) =
      KtCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2) }

  public companion object {
    @JvmStatic
    @JvmName("create")
    public fun <R, P0, P1, P2> javaCreate(
      returnClass: Class<R>,
      p0Class: Class<P0>,
      p1Class: Class<P1>,
      p2Class: Class<P2>,
      function: (
        p0: P0,
        p1: P1,
        p2: P2,
      ) -> R,
    ) =
        KtCallable3(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, function)
  }
}

public inline fun <reified P0, reified P1, reified P2, reified R> callable(noinline function: (
  p0: P0,
  p1: P1,
  p2: P2,
) -> R) =
    KtCallable3(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, function)

public inline fun <reified P0, reified P1, reified P2, reified R> ((
  p0: P0,
  p1: P1,
  p2: P2,
) -> R).asCallable() = callable(this)

public class KtCallable4<P0, P1, P2, P3, R>(
  variantConverter: VariantConverter,
  private val p0Type: VariantConverter,
  private val p1Type: VariantConverter,
  private val p2Type: VariantConverter,
  p3Type: VariantConverter,
  private val function: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
  ) -> R,
) : KtCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type) {
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
  ) = KtCallable0(variantConverter) {  -> function(p0, p1, p2, p3) }

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
  ) = KtCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3) }

  public fun bind(p2: P2, p3: P3) =
      KtCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3) }

  public fun bind(p3: P3) =
      KtCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3) }

  public companion object {
    @JvmStatic
    @JvmName("create")
    public fun <R, P0, P1, P2, P3> javaCreate(
      returnClass: Class<R>,
      p0Class: Class<P0>,
      p1Class: Class<P1>,
      p2Class: Class<P2>,
      p3Class: Class<P3>,
      function: (
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
      ) -> R,
    ) =
        KtCallable4(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, function)
  }
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified R> callable(noinline
    function: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
) -> R) =
    KtCallable4(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, function)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified R> ((
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
) -> R).asCallable() = callable(this)

public class KtCallable5<P0, P1, P2, P3, P4, R>(
  variantConverter: VariantConverter,
  private val p0Type: VariantConverter,
  private val p1Type: VariantConverter,
  private val p2Type: VariantConverter,
  private val p3Type: VariantConverter,
  p4Type: VariantConverter,
  private val function: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ) -> R,
) : KtCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) {
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
  ) = KtCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4) }

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ) = KtCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4) }

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
  ) =
      KtCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4) }

  public fun bind(p3: P3, p4: P4) =
      KtCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4) }

  public fun bind(p4: P4) =
      KtCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4) }

  public companion object {
    @JvmStatic
    @JvmName("create")
    public fun <R, P0, P1, P2, P3, P4> javaCreate(
      returnClass: Class<R>,
      p0Class: Class<P0>,
      p1Class: Class<P1>,
      p2Class: Class<P2>,
      p3Class: Class<P3>,
      p4Class: Class<P4>,
      function: (
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
      ) -> R,
    ) =
        KtCallable5(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, function)
  }
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified R>
    callable(noinline function: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
) -> R) =
    KtCallable5(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, function)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified R> ((
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
) -> R).asCallable() = callable(this)

public class KtCallable6<P0, P1, P2, P3, P4, P5, R>(
  variantConverter: VariantConverter,
  private val p0Type: VariantConverter,
  private val p1Type: VariantConverter,
  private val p2Type: VariantConverter,
  private val p3Type: VariantConverter,
  private val p4Type: VariantConverter,
  p5Type: VariantConverter,
  private val function: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) -> R,
) : KtCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) {
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
  ) = KtCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4, p5) }

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) = KtCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5) }

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) =
      KtCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5) }

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
  ) =
      KtCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5) }

  public fun bind(p4: P4, p5: P5) =
      KtCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5) }

  public fun bind(p5: P5) =
      KtCallable5(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5) }

  public companion object {
    @JvmStatic
    @JvmName("create")
    public fun <R, P0, P1, P2, P3, P4, P5> javaCreate(
      returnClass: Class<R>,
      p0Class: Class<P0>,
      p1Class: Class<P1>,
      p2Class: Class<P2>,
      p3Class: Class<P3>,
      p4Class: Class<P4>,
      p5Class: Class<P5>,
      function: (
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
      ) -> R,
    ) =
        KtCallable6(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p5Class)]!!, function)
  }
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
    KtCallable6(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, function)

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
  variantConverter: VariantConverter,
  private val p0Type: VariantConverter,
  private val p1Type: VariantConverter,
  private val p2Type: VariantConverter,
  private val p3Type: VariantConverter,
  private val p4Type: VariantConverter,
  private val p5Type: VariantConverter,
  p6Type: VariantConverter,
  private val function: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) -> R,
) : KtCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) {
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
  ) = KtCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4, p5, p6) }

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) = KtCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6) }

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) =
      KtCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6) }

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) =
      KtCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6) }

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
  ) =
      KtCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6) }

  public fun bind(p5: P5, p6: P6) =
      KtCallable5(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6) }

  public fun bind(p6: P6) =
      KtCallable6(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6) }

  public companion object {
    @JvmStatic
    @JvmName("create")
    public fun <R, P0, P1, P2, P3, P4, P5, P6> javaCreate(
      returnClass: Class<R>,
      p0Class: Class<P0>,
      p1Class: Class<P1>,
      p2Class: Class<P2>,
      p3Class: Class<P3>,
      p4Class: Class<P4>,
      p5Class: Class<P5>,
      p6Class: Class<P6>,
      function: (
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
      ) -> R,
    ) =
        KtCallable7(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p5Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p6Class)]!!, function)
  }
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
    KtCallable7(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, function)

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
  variantConverter: VariantConverter,
  private val p0Type: VariantConverter,
  private val p1Type: VariantConverter,
  private val p2Type: VariantConverter,
  private val p3Type: VariantConverter,
  private val p4Type: VariantConverter,
  private val p5Type: VariantConverter,
  private val p6Type: VariantConverter,
  p7Type: VariantConverter,
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
) : KtCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type)
    {
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
  ) = KtCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7) }

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) = KtCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7) }

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) =
      KtCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7) }

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) =
      KtCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7) }

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) =
      KtCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7) }

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
  ) =
      KtCallable5(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7) }

  public fun bind(p6: P6, p7: P7) =
      KtCallable6(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7) }

  public fun bind(p7: P7) =
      KtCallable7(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7) }

  public companion object {
    @JvmStatic
    @JvmName("create")
    public fun <R, P0, P1, P2, P3, P4, P5, P6, P7> javaCreate(
      returnClass: Class<R>,
      p0Class: Class<P0>,
      p1Class: Class<P1>,
      p2Class: Class<P2>,
      p3Class: Class<P3>,
      p4Class: Class<P4>,
      p5Class: Class<P5>,
      p6Class: Class<P6>,
      p7Class: Class<P7>,
      function: (
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
      ) -> R,
    ) =
        KtCallable8(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p5Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p6Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p7Class)]!!, function)
  }
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
    KtCallable8(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, function)

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
  variantConverter: VariantConverter,
  private val p0Type: VariantConverter,
  private val p1Type: VariantConverter,
  private val p2Type: VariantConverter,
  private val p3Type: VariantConverter,
  private val p4Type: VariantConverter,
  private val p5Type: VariantConverter,
  private val p6Type: VariantConverter,
  private val p7Type: VariantConverter,
  p8Type: VariantConverter,
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
) : KtCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type,
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
  ) = KtCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

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
      KtCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) =
      KtCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) =
      KtCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) =
      KtCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) =
      KtCallable5(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
  ) =
      KtCallable6(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

  public fun bind(p7: P7, p8: P8) =
      KtCallable7(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

  public fun bind(p8: P8) =
      KtCallable8(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

  public companion object {
    @JvmStatic
    @JvmName("create")
    public fun <R, P0, P1, P2, P3, P4, P5, P6, P7, P8> javaCreate(
      returnClass: Class<R>,
      p0Class: Class<P0>,
      p1Class: Class<P1>,
      p2Class: Class<P2>,
      p3Class: Class<P3>,
      p4Class: Class<P4>,
      p5Class: Class<P5>,
      p6Class: Class<P6>,
      p7Class: Class<P7>,
      p8Class: Class<P8>,
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
      ) -> R,
    ) =
        KtCallable9(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p5Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p6Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p7Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p8Class)]!!, function)
  }
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
    KtCallable9(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!, function)

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
  variantConverter: VariantConverter,
  private val p0Type: VariantConverter,
  private val p1Type: VariantConverter,
  private val p2Type: VariantConverter,
  private val p3Type: VariantConverter,
  private val p4Type: VariantConverter,
  private val p5Type: VariantConverter,
  private val p6Type: VariantConverter,
  private val p7Type: VariantConverter,
  private val p8Type: VariantConverter,
  p9Type: VariantConverter,
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
) : KtCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type,
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
  ) = KtCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

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
      KtCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

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
      KtCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) =
      KtCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) =
      KtCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) =
      KtCallable5(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) =
      KtCallable6(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
  ) =
      KtCallable7(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

  public fun bind(p8: P8, p9: P9) =
      KtCallable8(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

  public fun bind(p9: P9) =
      KtCallable9(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

  public companion object {
    @JvmStatic
    @JvmName("create")
    public fun <R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> javaCreate(
      returnClass: Class<R>,
      p0Class: Class<P0>,
      p1Class: Class<P1>,
      p2Class: Class<P2>,
      p3Class: Class<P3>,
      p4Class: Class<P4>,
      p5Class: Class<P5>,
      p6Class: Class<P6>,
      p7Class: Class<P7>,
      p8Class: Class<P8>,
      p9Class: Class<P9>,
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
      ) -> R,
    ) =
        KtCallable10(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p5Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p6Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p7Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p8Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p9Class)]!!, function)
  }
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
    KtCallable10(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!, variantMapper[P9::class]!!, function)

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
  variantConverter: VariantConverter,
  private val p0Type: VariantConverter,
  private val p1Type: VariantConverter,
  private val p2Type: VariantConverter,
  private val p3Type: VariantConverter,
  private val p4Type: VariantConverter,
  private val p5Type: VariantConverter,
  private val p6Type: VariantConverter,
  private val p7Type: VariantConverter,
  private val p8Type: VariantConverter,
  private val p9Type: VariantConverter,
  p10Type: VariantConverter,
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
) : KtCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type,
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
  ) = KtCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

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
      KtCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

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
      KtCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

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
      KtCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) =
      KtCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) =
      KtCallable5(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) =
      KtCallable6(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) =
      KtCallable7(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
  ) =
      KtCallable8(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

  public fun bind(p9: P9, p10: P10) =
      KtCallable9(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

  public fun bind(p10: P10) =
      KtCallable10(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

  public companion object {
    @JvmStatic
    @JvmName("create")
    public fun <R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> javaCreate(
      returnClass: Class<R>,
      p0Class: Class<P0>,
      p1Class: Class<P1>,
      p2Class: Class<P2>,
      p3Class: Class<P3>,
      p4Class: Class<P4>,
      p5Class: Class<P5>,
      p6Class: Class<P6>,
      p7Class: Class<P7>,
      p8Class: Class<P8>,
      p9Class: Class<P9>,
      p10Class: Class<P10>,
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
      ) -> R,
    ) =
        KtCallable11(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p5Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p6Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p7Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p8Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p9Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p10Class)]!!, function)
  }
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
    KtCallable11(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!, variantMapper[P9::class]!!, variantMapper[P10::class]!!, function)

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
  variantConverter: VariantConverter,
  private val p0Type: VariantConverter,
  private val p1Type: VariantConverter,
  private val p2Type: VariantConverter,
  private val p3Type: VariantConverter,
  private val p4Type: VariantConverter,
  private val p5Type: VariantConverter,
  private val p6Type: VariantConverter,
  private val p7Type: VariantConverter,
  private val p8Type: VariantConverter,
  private val p9Type: VariantConverter,
  private val p10Type: VariantConverter,
  p11Type: VariantConverter,
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
) : KtCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type,
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
  ) =
      KtCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

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
      KtCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

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
      KtCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

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
      KtCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

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
      KtCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) =
      KtCallable5(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) =
      KtCallable6(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) =
      KtCallable7(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) =
      KtCallable8(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
  ) =
      KtCallable9(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

  public fun bind(p10: P10, p11: P11) =
      KtCallable10(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

  public fun bind(p11: P11) =
      KtCallable11(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

  public companion object {
    @JvmStatic
    @JvmName("create")
    public fun <R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> javaCreate(
      returnClass: Class<R>,
      p0Class: Class<P0>,
      p1Class: Class<P1>,
      p2Class: Class<P2>,
      p3Class: Class<P3>,
      p4Class: Class<P4>,
      p5Class: Class<P5>,
      p6Class: Class<P6>,
      p7Class: Class<P7>,
      p8Class: Class<P8>,
      p9Class: Class<P9>,
      p10Class: Class<P10>,
      p11Class: Class<P11>,
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
      ) -> R,
    ) =
        KtCallable12(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p5Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p6Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p7Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p8Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p9Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p10Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p11Class)]!!, function)
  }
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
    KtCallable12(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!, variantMapper[P9::class]!!, variantMapper[P10::class]!!, variantMapper[P11::class]!!, function)

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
  variantConverter: VariantConverter,
  private val p0Type: VariantConverter,
  private val p1Type: VariantConverter,
  private val p2Type: VariantConverter,
  private val p3Type: VariantConverter,
  private val p4Type: VariantConverter,
  private val p5Type: VariantConverter,
  private val p6Type: VariantConverter,
  private val p7Type: VariantConverter,
  private val p8Type: VariantConverter,
  private val p9Type: VariantConverter,
  private val p10Type: VariantConverter,
  private val p11Type: VariantConverter,
  p12Type: VariantConverter,
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
) : KtCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type,
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
      KtCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

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
      KtCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

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
      KtCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

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
      KtCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

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
      KtCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

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
      KtCallable5(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) =
      KtCallable6(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) =
      KtCallable7(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) =
      KtCallable8(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) =
      KtCallable9(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

  public fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
  ) =
      KtCallable10(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

  public fun bind(p11: P11, p12: P12) =
      KtCallable11(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

  public fun bind(p12: P12) =
      KtCallable12(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

  public companion object {
    @JvmStatic
    @JvmName("create")
    public fun <R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> javaCreate(
      returnClass: Class<R>,
      p0Class: Class<P0>,
      p1Class: Class<P1>,
      p2Class: Class<P2>,
      p3Class: Class<P3>,
      p4Class: Class<P4>,
      p5Class: Class<P5>,
      p6Class: Class<P6>,
      p7Class: Class<P7>,
      p8Class: Class<P8>,
      p9Class: Class<P9>,
      p10Class: Class<P10>,
      p11Class: Class<P11>,
      p12Class: Class<P12>,
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
        p12: P12,
      ) -> R,
    ) =
        KtCallable13(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p5Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p6Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p7Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p8Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p9Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p10Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p11Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p12Class)]!!, function)
  }
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
    KtCallable13(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!, variantMapper[P9::class]!!, variantMapper[P10::class]!!, variantMapper[P11::class]!!, variantMapper[P12::class]!!, function)

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
  variantConverter: VariantConverter,
  private val p0Type: VariantConverter,
  private val p1Type: VariantConverter,
  private val p2Type: VariantConverter,
  private val p3Type: VariantConverter,
  private val p4Type: VariantConverter,
  private val p5Type: VariantConverter,
  private val p6Type: VariantConverter,
  private val p7Type: VariantConverter,
  private val p8Type: VariantConverter,
  private val p9Type: VariantConverter,
  private val p10Type: VariantConverter,
  private val p11Type: VariantConverter,
  private val p12Type: VariantConverter,
  p13Type: VariantConverter,
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
) : KtCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type,
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
      KtCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

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
      KtCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

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
      KtCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

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
      KtCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

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
      KtCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

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
      KtCallable5(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

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
      KtCallable6(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) =
      KtCallable7(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) =
      KtCallable8(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) =
      KtCallable9(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

  public fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) =
      KtCallable10(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

  public fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
  ) =
      KtCallable11(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

  public fun bind(p12: P12, p13: P13) =
      KtCallable12(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

  public fun bind(p13: P13) =
      KtCallable13(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

  public companion object {
    @JvmStatic
    @JvmName("create")
    public fun <R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> javaCreate(
      returnClass: Class<R>,
      p0Class: Class<P0>,
      p1Class: Class<P1>,
      p2Class: Class<P2>,
      p3Class: Class<P3>,
      p4Class: Class<P4>,
      p5Class: Class<P5>,
      p6Class: Class<P6>,
      p7Class: Class<P7>,
      p8Class: Class<P8>,
      p9Class: Class<P9>,
      p10Class: Class<P10>,
      p11Class: Class<P11>,
      p12Class: Class<P12>,
      p13Class: Class<P13>,
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
        p12: P12,
        p13: P13,
      ) -> R,
    ) =
        KtCallable14(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p5Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p6Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p7Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p8Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p9Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p10Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p11Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p12Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p13Class)]!!, function)
  }
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
    KtCallable14(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!, variantMapper[P9::class]!!, variantMapper[P10::class]!!, variantMapper[P11::class]!!, variantMapper[P12::class]!!, variantMapper[P13::class]!!, function)

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
  variantConverter: VariantConverter,
  private val p0Type: VariantConverter,
  private val p1Type: VariantConverter,
  private val p2Type: VariantConverter,
  private val p3Type: VariantConverter,
  private val p4Type: VariantConverter,
  private val p5Type: VariantConverter,
  private val p6Type: VariantConverter,
  private val p7Type: VariantConverter,
  private val p8Type: VariantConverter,
  private val p9Type: VariantConverter,
  private val p10Type: VariantConverter,
  private val p11Type: VariantConverter,
  private val p12Type: VariantConverter,
  private val p13Type: VariantConverter,
  p14Type: VariantConverter,
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
) : KtCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type,
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
      KtCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

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
      KtCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

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
      KtCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

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
      KtCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

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
      KtCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

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
      KtCallable5(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

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
      KtCallable6(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

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
      KtCallable7(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) =
      KtCallable8(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) =
      KtCallable9(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

  public fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) =
      KtCallable10(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

  public fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) =
      KtCallable11(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

  public fun bind(
    p12: P12,
    p13: P13,
    p14: P14,
  ) =
      KtCallable12(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

  public fun bind(p13: P13, p14: P14) =
      KtCallable13(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

  public fun bind(p14: P14) =
      KtCallable14(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type, p13Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

  public companion object {
    @JvmStatic
    @JvmName("create")
    public fun <R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> javaCreate(
      returnClass: Class<R>,
      p0Class: Class<P0>,
      p1Class: Class<P1>,
      p2Class: Class<P2>,
      p3Class: Class<P3>,
      p4Class: Class<P4>,
      p5Class: Class<P5>,
      p6Class: Class<P6>,
      p7Class: Class<P7>,
      p8Class: Class<P8>,
      p9Class: Class<P9>,
      p10Class: Class<P10>,
      p11Class: Class<P11>,
      p12Class: Class<P12>,
      p13Class: Class<P13>,
      p14Class: Class<P14>,
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
        p12: P12,
        p13: P13,
        p14: P14,
      ) -> R,
    ) =
        KtCallable15(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p5Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p6Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p7Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p8Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p9Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p10Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p11Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p12Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p13Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p14Class)]!!, function)
  }
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
    KtCallable15(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!, variantMapper[P9::class]!!, variantMapper[P10::class]!!, variantMapper[P11::class]!!, variantMapper[P12::class]!!, variantMapper[P13::class]!!, variantMapper[P14::class]!!, function)

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
  variantConverter: VariantConverter,
  private val p0Type: VariantConverter,
  private val p1Type: VariantConverter,
  private val p2Type: VariantConverter,
  private val p3Type: VariantConverter,
  private val p4Type: VariantConverter,
  private val p5Type: VariantConverter,
  private val p6Type: VariantConverter,
  private val p7Type: VariantConverter,
  private val p8Type: VariantConverter,
  private val p9Type: VariantConverter,
  private val p10Type: VariantConverter,
  private val p11Type: VariantConverter,
  private val p12Type: VariantConverter,
  private val p13Type: VariantConverter,
  private val p14Type: VariantConverter,
  p15Type: VariantConverter,
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
) : KtCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type,
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
      KtCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      KtCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      KtCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      KtCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      KtCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      KtCallable5(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      KtCallable6(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      KtCallable7(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      KtCallable8(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) =
      KtCallable9(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

  public fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) =
      KtCallable10(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

  public fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) =
      KtCallable11(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

  public fun bind(
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) =
      KtCallable12(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

  public fun bind(
    p13: P13,
    p14: P14,
    p15: P15,
  ) =
      KtCallable13(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

  public fun bind(p14: P14, p15: P15) =
      KtCallable14(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type, p13Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

  public fun bind(p15: P15) =
      KtCallable15(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type, p13Type, p14Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

  public companion object {
    @JvmStatic
    @JvmName("create")
    public fun <R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15> javaCreate(
      returnClass: Class<R>,
      p0Class: Class<P0>,
      p1Class: Class<P1>,
      p2Class: Class<P2>,
      p3Class: Class<P3>,
      p4Class: Class<P4>,
      p5Class: Class<P5>,
      p6Class: Class<P6>,
      p7Class: Class<P7>,
      p8Class: Class<P8>,
      p9Class: Class<P9>,
      p10Class: Class<P10>,
      p11Class: Class<P11>,
      p12Class: Class<P12>,
      p13Class: Class<P13>,
      p14Class: Class<P14>,
      p15Class: Class<P15>,
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
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
      ) -> R,
    ) =
        KtCallable16(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p5Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p6Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p7Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p8Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p9Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p10Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p11Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p12Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p13Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p14Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p15Class)]!!, function)
  }
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
    KtCallable16(variantMapper.getOrDefault(R::class, NIL), variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!, variantMapper[P9::class]!!, variantMapper[P10::class]!!, variantMapper[P11::class]!!, variantMapper[P12::class]!!, variantMapper[P13::class]!!, variantMapper[P14::class]!!, variantMapper[P15::class]!!, function)

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
