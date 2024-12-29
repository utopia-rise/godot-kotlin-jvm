@file:Suppress("PackageDirectoryMismatch", "UNCHECKED_CAST")

package godot.extension

import godot.common.interop.VariantConverter
import godot.core.LambdaCallable
import godot.core.VariantParser.NIL
import java.lang.Class
import kotlin.Any
import kotlin.PublishedApi
import kotlin.Suppress
import kotlin.jvm.JvmName
import kotlin.jvm.JvmStatic
import kotlin.jvm.`internal`.Reflection

public class LambdaCallable0<R> @PublishedApi internal constructor(
  variantConverter: VariantConverter,
  private val function: () -> R,
) : LambdaCallable<R>(variantConverter) {
  public override fun invokeKt(): R = function()

  public operator fun invoke(): R = function()

  public override fun call(vararg args: Any?): Any? = function()

  public companion object {
    @JvmStatic
    @JvmName("create")
    public fun <R> javaCreate(returnClass: Class<R>, function: () -> R) =
        LambdaCallable0(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), function)
  }
}

public inline fun <reified R> callable0(noinline function: () -> R) =
    LambdaCallable0(godot.core.variantMapper.getOrDefault(R::class, NIL), function)

public inline fun <reified R> (() -> R).asCallable() = callable0(this)

public class LambdaCallable1<P0, R> @PublishedApi internal constructor(
  variantConverter: VariantConverter,
  p0Type: VariantConverter,
  private val function: (p0: P0) -> R,
) : LambdaCallable<R>(variantConverter, p0Type) {
  public override fun invokeKt(): R = function(paramsArray[0] as P0)

  public operator fun invoke(p0: P0): R = function(p0)

  public override fun call(vararg args: Any?): Any? = function(args[0] as P0)

  public fun bind(p0: P0) = LambdaCallable0(variantConverter) {  -> function(p0) }

  public companion object {
    @JvmStatic
    @JvmName("create")
    public fun <R, P0> javaCreate(
      returnClass: Class<R>,
      p0Class: Class<P0>,
      function: (p0: P0) -> R,
    ) =
        LambdaCallable1(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, function)
  }
}

public inline fun <reified P0, reified R> callable1(noinline function: (p0: P0) -> R) =
    LambdaCallable1(godot.core.variantMapper.getOrDefault(R::class, NIL), godot.core.variantMapper[P0::class]!!, function)

public inline fun <reified P0, reified R> ((p0: P0) -> R).asCallable() = callable1(this)

public class LambdaCallable2<P0, P1, R> @PublishedApi internal constructor(
  variantConverter: VariantConverter,
  private val p0Type: VariantConverter,
  p1Type: VariantConverter,
  private val function: (p0: P0, p1: P1) -> R,
) : LambdaCallable<R>(variantConverter, p0Type, p1Type) {
  public override fun invokeKt(): R = function(paramsArray[0] as P0, paramsArray[1] as P1)

  public operator fun invoke(p0: P0, p1: P1): R = function(p0, p1)

  public override fun call(vararg args: Any?): Any? = function(args[0] as P0, args[1] as P1)

  public fun bind(p0: P0, p1: P1) = LambdaCallable0(variantConverter) {  -> function(p0, p1) }

  public fun bind(p1: P1) = LambdaCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1) }

  public companion object {
    @JvmStatic
    @JvmName("create")
    public fun <R, P0, P1> javaCreate(
      returnClass: Class<R>,
      p0Class: Class<P0>,
      p1Class: Class<P1>,
      function: (p0: P0, p1: P1) -> R,
    ) =
        LambdaCallable2(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, function)
  }
}

public inline fun <reified P0, reified P1, reified R> callable2(noinline function: (p0: P0,
    p1: P1) -> R) =
    LambdaCallable2(godot.core.variantMapper.getOrDefault(R::class, NIL), godot.core.variantMapper[P0::class]!!, godot.core.variantMapper[P1::class]!!, function)

public inline fun <reified P0, reified P1, reified R> ((p0: P0, p1: P1) -> R).asCallable() =
    callable2(this)

public class LambdaCallable3<P0, P1, P2, R> @PublishedApi internal constructor(
  variantConverter: VariantConverter,
  private val p0Type: VariantConverter,
  private val p1Type: VariantConverter,
  p2Type: VariantConverter,
  private val function: (
    p0: P0,
    p1: P1,
    p2: P2,
  ) -> R,
) : LambdaCallable<R>(variantConverter, p0Type, p1Type, p2Type) {
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
  ) = LambdaCallable0(variantConverter) {  -> function(p0, p1, p2) }

  public fun bind(p1: P1, p2: P2) =
      LambdaCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2) }

  public fun bind(p2: P2) =
      LambdaCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2) }

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
        LambdaCallable3(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, function)
  }
}

public inline fun <reified P0, reified P1, reified P2, reified R> callable3(noinline function: (
  p0: P0,
  p1: P1,
  p2: P2,
) -> R) =
    LambdaCallable3(godot.core.variantMapper.getOrDefault(R::class, NIL), godot.core.variantMapper[P0::class]!!, godot.core.variantMapper[P1::class]!!, godot.core.variantMapper[P2::class]!!, function)

public inline fun <reified P0, reified P1, reified P2, reified R> ((
  p0: P0,
  p1: P1,
  p2: P2,
) -> R).asCallable() = callable3(this)

public class LambdaCallable4<P0, P1, P2, P3, R> @PublishedApi internal constructor(
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
) : LambdaCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type) {
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
  ) = LambdaCallable0(variantConverter) {  -> function(p0, p1, p2, p3) }

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
  ) = LambdaCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3) }

  public fun bind(p2: P2, p3: P3) =
      LambdaCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3) }

  public fun bind(p3: P3) =
      LambdaCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3) }

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
        LambdaCallable4(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, function)
  }
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified R> callable4(noinline
    function: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
) -> R) =
    LambdaCallable4(godot.core.variantMapper.getOrDefault(R::class, NIL), godot.core.variantMapper[P0::class]!!, godot.core.variantMapper[P1::class]!!, godot.core.variantMapper[P2::class]!!, godot.core.variantMapper[P3::class]!!, function)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified R> ((
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
) -> R).asCallable() = callable4(this)

public class LambdaCallable5<P0, P1, P2, P3, P4, R> @PublishedApi internal constructor(
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
) : LambdaCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) {
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
  ) = LambdaCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4) }

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ) = LambdaCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4) }

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
  ) =
      LambdaCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4) }

  public fun bind(p3: P3, p4: P4) =
      LambdaCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4) }

  public fun bind(p4: P4) =
      LambdaCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4) }

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
        LambdaCallable5(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, function)
  }
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified R>
    callable5(noinline function: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
) -> R) =
    LambdaCallable5(godot.core.variantMapper.getOrDefault(R::class, NIL), godot.core.variantMapper[P0::class]!!, godot.core.variantMapper[P1::class]!!, godot.core.variantMapper[P2::class]!!, godot.core.variantMapper[P3::class]!!, godot.core.variantMapper[P4::class]!!, function)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified R> ((
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
) -> R).asCallable() = callable5(this)

public class LambdaCallable6<P0, P1, P2, P3, P4, P5, R> @PublishedApi internal constructor(
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
) : LambdaCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) {
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
  ) = LambdaCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4, p5) }

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) = LambdaCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5) }

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) =
      LambdaCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5) }

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
  ) =
      LambdaCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5) }

  public fun bind(p4: P4, p5: P5) =
      LambdaCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5) }

  public fun bind(p5: P5) =
      LambdaCallable5(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5) }

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
        LambdaCallable6(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p5Class)]!!, function)
  }
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
    LambdaCallable6(godot.core.variantMapper.getOrDefault(R::class, NIL), godot.core.variantMapper[P0::class]!!, godot.core.variantMapper[P1::class]!!, godot.core.variantMapper[P2::class]!!, godot.core.variantMapper[P3::class]!!, godot.core.variantMapper[P4::class]!!, godot.core.variantMapper[P5::class]!!, function)

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    R> ((
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
) -> R).asCallable() = callable6(this)

public class LambdaCallable7<P0, P1, P2, P3, P4, P5, P6, R> @PublishedApi internal constructor(
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
) : LambdaCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) {
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
  ) = LambdaCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4, p5, p6) }

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) = LambdaCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6) }

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) =
      LambdaCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6) }

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) =
      LambdaCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6) }

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
  ) =
      LambdaCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6) }

  public fun bind(p5: P5, p6: P6) =
      LambdaCallable5(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6) }

  public fun bind(p6: P6) =
      LambdaCallable6(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6) }

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
        LambdaCallable7(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p5Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p6Class)]!!, function)
  }
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
    LambdaCallable7(godot.core.variantMapper.getOrDefault(R::class, NIL), godot.core.variantMapper[P0::class]!!, godot.core.variantMapper[P1::class]!!, godot.core.variantMapper[P2::class]!!, godot.core.variantMapper[P3::class]!!, godot.core.variantMapper[P4::class]!!, godot.core.variantMapper[P5::class]!!, godot.core.variantMapper[P6::class]!!, function)

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

public class LambdaCallable8<P0, P1, P2, P3, P4, P5, P6, P7, R> @PublishedApi internal constructor(
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
) : LambdaCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type,
    p7Type) {
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
  ) = LambdaCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7) }

  public fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) =
      LambdaCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7) }

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) =
      LambdaCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7) }

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) =
      LambdaCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7) }

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) =
      LambdaCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7) }

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
  ) =
      LambdaCallable5(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7) }

  public fun bind(p6: P6, p7: P7) =
      LambdaCallable6(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7) }

  public fun bind(p7: P7) =
      LambdaCallable7(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7) }

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
        LambdaCallable8(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p5Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p6Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p7Class)]!!, function)
  }
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
    LambdaCallable8(godot.core.variantMapper.getOrDefault(R::class, NIL), godot.core.variantMapper[P0::class]!!, godot.core.variantMapper[P1::class]!!, godot.core.variantMapper[P2::class]!!, godot.core.variantMapper[P3::class]!!, godot.core.variantMapper[P4::class]!!, godot.core.variantMapper[P5::class]!!, godot.core.variantMapper[P6::class]!!, godot.core.variantMapper[P7::class]!!, function)

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

public class LambdaCallable9<P0, P1, P2, P3, P4, P5, P6, P7, P8, R> @PublishedApi internal
    constructor(
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
) : LambdaCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type,
    p7Type, p8Type) {
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
  ) = LambdaCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

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
      LambdaCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

  public fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) =
      LambdaCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) =
      LambdaCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) =
      LambdaCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) =
      LambdaCallable5(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
  ) =
      LambdaCallable6(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

  public fun bind(p7: P7, p8: P8) =
      LambdaCallable7(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

  public fun bind(p8: P8) =
      LambdaCallable8(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8) }

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
        LambdaCallable9(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p5Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p6Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p7Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p8Class)]!!, function)
  }
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
    LambdaCallable9(godot.core.variantMapper.getOrDefault(R::class, NIL), godot.core.variantMapper[P0::class]!!, godot.core.variantMapper[P1::class]!!, godot.core.variantMapper[P2::class]!!, godot.core.variantMapper[P3::class]!!, godot.core.variantMapper[P4::class]!!, godot.core.variantMapper[P5::class]!!, godot.core.variantMapper[P6::class]!!, godot.core.variantMapper[P7::class]!!, godot.core.variantMapper[P8::class]!!, function)

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

public class LambdaCallable10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, R> @PublishedApi internal
    constructor(
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
) : LambdaCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type,
    p7Type, p8Type, p9Type) {
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
  ) = LambdaCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

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
      LambdaCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

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
      LambdaCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

  public fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) =
      LambdaCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) =
      LambdaCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) =
      LambdaCallable5(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) =
      LambdaCallable6(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
  ) =
      LambdaCallable7(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

  public fun bind(p8: P8, p9: P9) =
      LambdaCallable8(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

  public fun bind(p9: P9) =
      LambdaCallable9(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) }

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
        LambdaCallable10(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p5Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p6Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p7Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p8Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p9Class)]!!, function)
  }
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
    LambdaCallable10(godot.core.variantMapper.getOrDefault(R::class, NIL), godot.core.variantMapper[P0::class]!!, godot.core.variantMapper[P1::class]!!, godot.core.variantMapper[P2::class]!!, godot.core.variantMapper[P3::class]!!, godot.core.variantMapper[P4::class]!!, godot.core.variantMapper[P5::class]!!, godot.core.variantMapper[P6::class]!!, godot.core.variantMapper[P7::class]!!, godot.core.variantMapper[P8::class]!!, godot.core.variantMapper[P9::class]!!, function)

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

public class LambdaCallable11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> @PublishedApi internal
    constructor(
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
) : LambdaCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type,
    p7Type, p8Type, p9Type, p10Type) {
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
  ) =
      LambdaCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

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
      LambdaCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

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
      LambdaCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

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
      LambdaCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

  public fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) =
      LambdaCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) =
      LambdaCallable5(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) =
      LambdaCallable6(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) =
      LambdaCallable7(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
  ) =
      LambdaCallable8(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

  public fun bind(p9: P9, p10: P10) =
      LambdaCallable9(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

  public fun bind(p10: P10) =
      LambdaCallable10(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

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
        LambdaCallable11(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p5Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p6Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p7Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p8Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p9Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p10Class)]!!, function)
  }
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
    LambdaCallable11(godot.core.variantMapper.getOrDefault(R::class, NIL), godot.core.variantMapper[P0::class]!!, godot.core.variantMapper[P1::class]!!, godot.core.variantMapper[P2::class]!!, godot.core.variantMapper[P3::class]!!, godot.core.variantMapper[P4::class]!!, godot.core.variantMapper[P5::class]!!, godot.core.variantMapper[P6::class]!!, godot.core.variantMapper[P7::class]!!, godot.core.variantMapper[P8::class]!!, godot.core.variantMapper[P9::class]!!, godot.core.variantMapper[P10::class]!!, function)

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

public class LambdaCallable12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> @PublishedApi
    internal constructor(
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
) : LambdaCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type,
    p7Type, p8Type, p9Type, p10Type, p11Type) {
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
      LambdaCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

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
      LambdaCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

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
      LambdaCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

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
      LambdaCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

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
      LambdaCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

  public fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) =
      LambdaCallable5(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) =
      LambdaCallable6(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) =
      LambdaCallable7(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) =
      LambdaCallable8(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
  ) =
      LambdaCallable9(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

  public fun bind(p10: P10, p11: P11) =
      LambdaCallable10(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

  public fun bind(p11: P11) =
      LambdaCallable11(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

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
        LambdaCallable12(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p5Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p6Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p7Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p8Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p9Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p10Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p11Class)]!!, function)
  }
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
    LambdaCallable12(godot.core.variantMapper.getOrDefault(R::class, NIL), godot.core.variantMapper[P0::class]!!, godot.core.variantMapper[P1::class]!!, godot.core.variantMapper[P2::class]!!, godot.core.variantMapper[P3::class]!!, godot.core.variantMapper[P4::class]!!, godot.core.variantMapper[P5::class]!!, godot.core.variantMapper[P6::class]!!, godot.core.variantMapper[P7::class]!!, godot.core.variantMapper[P8::class]!!, godot.core.variantMapper[P9::class]!!, godot.core.variantMapper[P10::class]!!, godot.core.variantMapper[P11::class]!!, function)

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

public class LambdaCallable13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
    @PublishedApi internal constructor(
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
) : LambdaCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type,
    p7Type, p8Type, p9Type, p10Type, p11Type, p12Type) {
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
      LambdaCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

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
      LambdaCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

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
      LambdaCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

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
      LambdaCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

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
      LambdaCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

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
      LambdaCallable5(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

  public fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) =
      LambdaCallable6(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) =
      LambdaCallable7(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) =
      LambdaCallable8(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) =
      LambdaCallable9(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

  public fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
  ) =
      LambdaCallable10(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

  public fun bind(p11: P11, p12: P12) =
      LambdaCallable11(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

  public fun bind(p12: P12) =
      LambdaCallable12(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

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
        LambdaCallable13(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p5Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p6Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p7Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p8Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p9Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p10Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p11Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p12Class)]!!, function)
  }
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
    LambdaCallable13(godot.core.variantMapper.getOrDefault(R::class, NIL), godot.core.variantMapper[P0::class]!!, godot.core.variantMapper[P1::class]!!, godot.core.variantMapper[P2::class]!!, godot.core.variantMapper[P3::class]!!, godot.core.variantMapper[P4::class]!!, godot.core.variantMapper[P5::class]!!, godot.core.variantMapper[P6::class]!!, godot.core.variantMapper[P7::class]!!, godot.core.variantMapper[P8::class]!!, godot.core.variantMapper[P9::class]!!, godot.core.variantMapper[P10::class]!!, godot.core.variantMapper[P11::class]!!, godot.core.variantMapper[P12::class]!!, function)

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

public class LambdaCallable14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
    @PublishedApi internal constructor(
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
) : LambdaCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type,
    p7Type, p8Type, p9Type, p10Type, p11Type, p12Type, p13Type) {
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
      LambdaCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

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
      LambdaCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

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
      LambdaCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

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
      LambdaCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

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
      LambdaCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

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
      LambdaCallable5(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

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
      LambdaCallable6(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

  public fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) =
      LambdaCallable7(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) =
      LambdaCallable8(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) =
      LambdaCallable9(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

  public fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) =
      LambdaCallable10(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

  public fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
  ) =
      LambdaCallable11(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

  public fun bind(p12: P12, p13: P13) =
      LambdaCallable12(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

  public fun bind(p13: P13) =
      LambdaCallable13(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

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
        LambdaCallable14(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p5Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p6Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p7Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p8Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p9Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p10Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p11Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p12Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p13Class)]!!, function)
  }
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
    LambdaCallable14(godot.core.variantMapper.getOrDefault(R::class, NIL), godot.core.variantMapper[P0::class]!!, godot.core.variantMapper[P1::class]!!, godot.core.variantMapper[P2::class]!!, godot.core.variantMapper[P3::class]!!, godot.core.variantMapper[P4::class]!!, godot.core.variantMapper[P5::class]!!, godot.core.variantMapper[P6::class]!!, godot.core.variantMapper[P7::class]!!, godot.core.variantMapper[P8::class]!!, godot.core.variantMapper[P9::class]!!, godot.core.variantMapper[P10::class]!!, godot.core.variantMapper[P11::class]!!, godot.core.variantMapper[P12::class]!!, godot.core.variantMapper[P13::class]!!, function)

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

public class LambdaCallable15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
    @PublishedApi internal constructor(
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
) : LambdaCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type,
    p7Type, p8Type, p9Type, p10Type, p11Type, p12Type, p13Type, p14Type) {
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
      LambdaCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

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
      LambdaCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

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
      LambdaCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

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
      LambdaCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

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
      LambdaCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

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
      LambdaCallable5(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

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
      LambdaCallable6(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

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
      LambdaCallable7(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

  public fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) =
      LambdaCallable8(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) =
      LambdaCallable9(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

  public fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) =
      LambdaCallable10(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

  public fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) =
      LambdaCallable11(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

  public fun bind(
    p12: P12,
    p13: P13,
    p14: P14,
  ) =
      LambdaCallable12(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

  public fun bind(p13: P13, p14: P14) =
      LambdaCallable13(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

  public fun bind(p14: P14) =
      LambdaCallable14(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type, p13Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

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
        LambdaCallable15(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p5Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p6Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p7Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p8Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p9Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p10Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p11Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p12Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p13Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p14Class)]!!, function)
  }
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
    LambdaCallable15(godot.core.variantMapper.getOrDefault(R::class, NIL), godot.core.variantMapper[P0::class]!!, godot.core.variantMapper[P1::class]!!, godot.core.variantMapper[P2::class]!!, godot.core.variantMapper[P3::class]!!, godot.core.variantMapper[P4::class]!!, godot.core.variantMapper[P5::class]!!, godot.core.variantMapper[P6::class]!!, godot.core.variantMapper[P7::class]!!, godot.core.variantMapper[P8::class]!!, godot.core.variantMapper[P9::class]!!, godot.core.variantMapper[P10::class]!!, godot.core.variantMapper[P11::class]!!, godot.core.variantMapper[P12::class]!!, godot.core.variantMapper[P13::class]!!, godot.core.variantMapper[P14::class]!!, function)

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

public class LambdaCallable16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15,
    R> @PublishedApi internal constructor(
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
) : LambdaCallable<R>(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type,
    p7Type, p8Type, p9Type, p10Type, p11Type, p12Type, p13Type, p14Type, p15Type) {
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
      LambdaCallable0(variantConverter) {  -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      LambdaCallable1(variantConverter, p0Type) { p0: P0 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      LambdaCallable2(variantConverter, p0Type, p1Type) { p0: P0, p1: P1 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      LambdaCallable3(variantConverter, p0Type, p1Type, p2Type) { p0: P0, p1: P1, p2: P2 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      LambdaCallable4(variantConverter, p0Type, p1Type, p2Type, p3Type) { p0: P0, p1: P1, p2: P2, p3: P3 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      LambdaCallable5(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      LambdaCallable6(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      LambdaCallable7(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
      LambdaCallable8(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

  public fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) =
      LambdaCallable9(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

  public fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) =
      LambdaCallable10(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

  public fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) =
      LambdaCallable11(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

  public fun bind(
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) =
      LambdaCallable12(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

  public fun bind(
    p13: P13,
    p14: P14,
    p15: P15,
  ) =
      LambdaCallable13(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

  public fun bind(p14: P14, p15: P15) =
      LambdaCallable14(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type, p13Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

  public fun bind(p15: P15) =
      LambdaCallable15(variantConverter, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type, p13Type, p14Type) { p0: P0, p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14 -> function(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

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
        LambdaCallable16(variantMapper.getOrDefault(Reflection.getOrCreateKotlinClass(returnClass), NIL), variantMapper[Reflection.getOrCreateKotlinClass(p0Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p1Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p2Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p3Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p4Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p5Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p6Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p7Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p8Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p9Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p10Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p11Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p12Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p13Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p14Class)]!!, variantMapper[Reflection.getOrCreateKotlinClass(p15Class)]!!, function)
  }
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
    LambdaCallable16(godot.core.variantMapper.getOrDefault(R::class, NIL), godot.core.variantMapper[P0::class]!!, godot.core.variantMapper[P1::class]!!, godot.core.variantMapper[P2::class]!!, godot.core.variantMapper[P3::class]!!, godot.core.variantMapper[P4::class]!!, godot.core.variantMapper[P5::class]!!, godot.core.variantMapper[P6::class]!!, godot.core.variantMapper[P7::class]!!, godot.core.variantMapper[P8::class]!!, godot.core.variantMapper[P9::class]!!, godot.core.variantMapper[P10::class]!!, godot.core.variantMapper[P11::class]!!, godot.core.variantMapper[P12::class]!!, godot.core.variantMapper[P13::class]!!, godot.core.variantMapper[P14::class]!!, godot.core.variantMapper[P15::class]!!, function)

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
