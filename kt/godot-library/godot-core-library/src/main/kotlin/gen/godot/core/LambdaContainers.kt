@file:Suppress(
  "PackageDirectoryMismatch", "UNCHECKED_CAST",
  "unused",
)

package godot.core

import godot.common.interop.VariantConverter
import kotlin.Any
import kotlin.Array
import kotlin.PublishedApi
import kotlin.Suppress

public class LambdaContainer0<R> @PublishedApi internal constructor(
  returnConverter: VariantConverter,
  typeConverters: Array<VariantConverter>,
  function: () -> R,
) : LambdaContainer<R>(returnConverter, typeConverters, function) {
  public override fun unsafeInvoke(vararg args: Any?): R =
      (function as? () -> R)?.invoke()?: throw InvalidJvmLambdaException()
}

public class LambdaContainer1<R, P0> @PublishedApi internal constructor(
  returnConverter: VariantConverter,
  typeConverters: Array<VariantConverter>,
  function: (p0: P0) -> R,
) : LambdaContainer<R>(returnConverter, typeConverters, function) {
  public override fun unsafeInvoke(vararg args: Any?): R =
      (function as? (p0: Any?) -> R)?.invoke(args[0])?: throw InvalidJvmLambdaException()
}

public class LambdaContainer2<R, P0, P1> @PublishedApi internal constructor(
  returnConverter: VariantConverter,
  typeConverters: Array<VariantConverter>,
  function: (p0: P0, p1: P1) -> R,
) : LambdaContainer<R>(returnConverter, typeConverters, function) {
  public override fun unsafeInvoke(vararg args: Any?): R = (function as? (p0: Any?,
      p1: Any?) -> R)?.invoke(args[0], args[1])?: throw InvalidJvmLambdaException()
}

public class LambdaContainer3<R, P0, P1, P2> @PublishedApi internal constructor(
  returnConverter: VariantConverter,
  typeConverters: Array<VariantConverter>,
  function: (
    p0: P0,
    p1: P1,
    p2: P2,
  ) -> R,
) : LambdaContainer<R>(returnConverter, typeConverters, function) {
  public override fun unsafeInvoke(vararg args: Any?): R = (function as? (
    p0: Any?,
    p1: Any?,
    p2: Any?,
  ) -> R)?.invoke(args[0], args[1], args[2])?: throw InvalidJvmLambdaException()
}

public class LambdaContainer4<R, P0, P1, P2, P3> @PublishedApi internal constructor(
  returnConverter: VariantConverter,
  typeConverters: Array<VariantConverter>,
  function: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
  ) -> R,
) : LambdaContainer<R>(returnConverter, typeConverters, function) {
  public override fun unsafeInvoke(vararg args: Any?): R = (function as? (
    p0: Any?,
    p1: Any?,
    p2: Any?,
    p3: Any?,
  ) -> R)?.invoke(args[0], args[1], args[2], args[3])?: throw InvalidJvmLambdaException()
}

public class LambdaContainer5<R, P0, P1, P2, P3, P4> @PublishedApi internal constructor(
  returnConverter: VariantConverter,
  typeConverters: Array<VariantConverter>,
  function: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ) -> R,
) : LambdaContainer<R>(returnConverter, typeConverters, function) {
  public override fun unsafeInvoke(vararg args: Any?): R = (function as? (
    p0: Any?,
    p1: Any?,
    p2: Any?,
    p3: Any?,
    p4: Any?,
  ) -> R)?.invoke(args[0], args[1], args[2], args[3], args[4])?: throw InvalidJvmLambdaException()
}

public class LambdaContainer6<R, P0, P1, P2, P3, P4, P5> @PublishedApi internal constructor(
  returnConverter: VariantConverter,
  typeConverters: Array<VariantConverter>,
  function: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) -> R,
) : LambdaContainer<R>(returnConverter, typeConverters, function) {
  public override fun unsafeInvoke(vararg args: Any?): R = (function as? (
    p0: Any?,
    p1: Any?,
    p2: Any?,
    p3: Any?,
    p4: Any?,
    p5: Any?,
  ) -> R)?.invoke(args[0], args[1], args[2], args[3], args[4], args[5])?: throw InvalidJvmLambdaException()
}

public class LambdaContainer7<R, P0, P1, P2, P3, P4, P5, P6> @PublishedApi internal constructor(
  returnConverter: VariantConverter,
  typeConverters: Array<VariantConverter>,
  function: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) -> R,
) : LambdaContainer<R>(returnConverter, typeConverters, function) {
  public override fun unsafeInvoke(vararg args: Any?): R = (function as? (
    p0: Any?,
    p1: Any?,
    p2: Any?,
    p3: Any?,
    p4: Any?,
    p5: Any?,
    p6: Any?,
  ) -> R)?.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6])?: throw InvalidJvmLambdaException()
}

public class LambdaContainer8<R, P0, P1, P2, P3, P4, P5, P6, P7> @PublishedApi internal constructor(
  returnConverter: VariantConverter,
  typeConverters: Array<VariantConverter>,
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
) : LambdaContainer<R>(returnConverter, typeConverters, function) {
  public override fun unsafeInvoke(vararg args: Any?): R = (function as? (
    p0: Any?,
    p1: Any?,
    p2: Any?,
    p3: Any?,
    p4: Any?,
    p5: Any?,
    p6: Any?,
    p7: Any?,
  ) -> R)?.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7])?: throw InvalidJvmLambdaException()
}

public class LambdaContainer9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8> @PublishedApi internal
    constructor(
  returnConverter: VariantConverter,
  typeConverters: Array<VariantConverter>,
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
) : LambdaContainer<R>(returnConverter, typeConverters, function) {
  public override fun unsafeInvoke(vararg args: Any?): R = (function as? (
    p0: Any?,
    p1: Any?,
    p2: Any?,
    p3: Any?,
    p4: Any?,
    p5: Any?,
    p6: Any?,
    p7: Any?,
    p8: Any?,
  ) -> R)?.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8])?: throw InvalidJvmLambdaException()
}

public class LambdaContainer10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> @PublishedApi internal
    constructor(
  returnConverter: VariantConverter,
  typeConverters: Array<VariantConverter>,
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
) : LambdaContainer<R>(returnConverter, typeConverters, function) {
  public override fun unsafeInvoke(vararg args: Any?): R = (function as? (
    p0: Any?,
    p1: Any?,
    p2: Any?,
    p3: Any?,
    p4: Any?,
    p5: Any?,
    p6: Any?,
    p7: Any?,
    p8: Any?,
    p9: Any?,
  ) -> R)?.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9])?: throw InvalidJvmLambdaException()
}

public class LambdaContainer11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> @PublishedApi
    internal constructor(
  returnConverter: VariantConverter,
  typeConverters: Array<VariantConverter>,
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
) : LambdaContainer<R>(returnConverter, typeConverters, function) {
  public override fun unsafeInvoke(vararg args: Any?): R = (function as? (
    p0: Any?,
    p1: Any?,
    p2: Any?,
    p3: Any?,
    p4: Any?,
    p5: Any?,
    p6: Any?,
    p7: Any?,
    p8: Any?,
    p9: Any?,
    p10: Any?,
  ) -> R)?.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10])?: throw InvalidJvmLambdaException()
}

public class LambdaContainer12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> @PublishedApi
    internal constructor(
  returnConverter: VariantConverter,
  typeConverters: Array<VariantConverter>,
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
) : LambdaContainer<R>(returnConverter, typeConverters, function) {
  public override fun unsafeInvoke(vararg args: Any?): R = (function as? (
    p0: Any?,
    p1: Any?,
    p2: Any?,
    p3: Any?,
    p4: Any?,
    p5: Any?,
    p6: Any?,
    p7: Any?,
    p8: Any?,
    p9: Any?,
    p10: Any?,
    p11: Any?,
  ) -> R)?.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11])?: throw InvalidJvmLambdaException()
}

public class LambdaContainer13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>
    @PublishedApi internal constructor(
  returnConverter: VariantConverter,
  typeConverters: Array<VariantConverter>,
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
) : LambdaContainer<R>(returnConverter, typeConverters, function) {
  public override fun unsafeInvoke(vararg args: Any?): R = (function as? (
    p0: Any?,
    p1: Any?,
    p2: Any?,
    p3: Any?,
    p4: Any?,
    p5: Any?,
    p6: Any?,
    p7: Any?,
    p8: Any?,
    p9: Any?,
    p10: Any?,
    p11: Any?,
    p12: Any?,
  ) -> R)?.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12])?: throw InvalidJvmLambdaException()
}

public class LambdaContainer14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>
    @PublishedApi internal constructor(
  returnConverter: VariantConverter,
  typeConverters: Array<VariantConverter>,
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
) : LambdaContainer<R>(returnConverter, typeConverters, function) {
  public override fun unsafeInvoke(vararg args: Any?): R = (function as? (
    p0: Any?,
    p1: Any?,
    p2: Any?,
    p3: Any?,
    p4: Any?,
    p5: Any?,
    p6: Any?,
    p7: Any?,
    p8: Any?,
    p9: Any?,
    p10: Any?,
    p11: Any?,
    p12: Any?,
    p13: Any?,
  ) -> R)?.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13])?: throw InvalidJvmLambdaException()
}

public class LambdaContainer15<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>
    @PublishedApi internal constructor(
  returnConverter: VariantConverter,
  typeConverters: Array<VariantConverter>,
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
) : LambdaContainer<R>(returnConverter, typeConverters, function) {
  public override fun unsafeInvoke(vararg args: Any?): R = (function as? (
    p0: Any?,
    p1: Any?,
    p2: Any?,
    p3: Any?,
    p4: Any?,
    p5: Any?,
    p6: Any?,
    p7: Any?,
    p8: Any?,
    p9: Any?,
    p10: Any?,
    p11: Any?,
    p12: Any?,
    p13: Any?,
    p14: Any?,
  ) -> R)?.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14])?: throw InvalidJvmLambdaException()
}

public class LambdaContainer16<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14,
    P15> @PublishedApi internal constructor(
  returnConverter: VariantConverter,
  typeConverters: Array<VariantConverter>,
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
) : LambdaContainer<R>(returnConverter, typeConverters, function) {
  public override fun unsafeInvoke(vararg args: Any?): R = (function as? (
    p0: Any?,
    p1: Any?,
    p2: Any?,
    p3: Any?,
    p4: Any?,
    p5: Any?,
    p6: Any?,
    p7: Any?,
    p8: Any?,
    p9: Any?,
    p10: Any?,
    p11: Any?,
    p12: Any?,
    p13: Any?,
    p14: Any?,
    p15: Any?,
  ) -> R)?.invoke(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15])?: throw InvalidJvmLambdaException()
}
