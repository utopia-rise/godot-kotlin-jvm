@file:Suppress(
  "PackageDirectoryMismatch", "UNCHECKED_CAST",
  "unused",
)

package godot.core

import godot.common.interop.VariantConverter
import kotlin.Array
import kotlin.PublishedApi
import kotlin.Suppress
import kotlin.Unit

public class LambdaContainer0<R> @PublishedApi internal constructor(
  returnConverter: VariantConverter,
  typeConverters: Array<VariantConverter>,
  function: () -> R,
) : LambdaContainer<R>(returnConverter, typeConverters) {
  private var function: (() -> R)? = function

  public fun unsafeInvoke(): R = function?.invoke()?: throw InvalidJvmLambdaException()

  public override fun unsafeInvokeFromBuffer(): R =
      function?.invoke()?: throw InvalidJvmLambdaException()

  public override fun invalidate(): Unit {
    function = null
  }
}

public class LambdaContainer1<R, P0> @PublishedApi internal constructor(
  returnConverter: VariantConverter,
  typeConverters: Array<VariantConverter>,
  function: (p0: P0) -> R,
) : LambdaContainer<R>(returnConverter, typeConverters) {
  private var function: ((p0: P0) -> R)? = function

  public fun unsafeInvoke(p0: P0): R = function?.invoke(p0)?: throw InvalidJvmLambdaException()

  public override fun unsafeInvokeFromBuffer(): R =
      function?.invoke(paramsArray[0] as P0)?: throw InvalidJvmLambdaException()

  public override fun invalidate(): Unit {
    function = null
  }
}

public class LambdaContainer2<R, P0, P1> @PublishedApi internal constructor(
  returnConverter: VariantConverter,
  typeConverters: Array<VariantConverter>,
  function: (p0: P0, p1: P1) -> R,
) : LambdaContainer<R>(returnConverter, typeConverters) {
  private var function: ((p0: P0, p1: P1) -> R)? = function

  public fun unsafeInvoke(p0: P0, p1: P1): R =
      function?.invoke(p0, p1)?: throw InvalidJvmLambdaException()

  public override fun unsafeInvokeFromBuffer(): R =
      function?.invoke(paramsArray[0] as P0, paramsArray[1] as P1)?: throw InvalidJvmLambdaException()

  public override fun invalidate(): Unit {
    function = null
  }
}

public class LambdaContainer3<R, P0, P1, P2> @PublishedApi internal constructor(
  returnConverter: VariantConverter,
  typeConverters: Array<VariantConverter>,
  function: (
    p0: P0,
    p1: P1,
    p2: P2,
  ) -> R,
) : LambdaContainer<R>(returnConverter, typeConverters) {
  private var function: ((
    p0: P0,
    p1: P1,
    p2: P2,
  ) -> R)? = function

  public fun unsafeInvoke(
    p0: P0,
    p1: P1,
    p2: P2,
  ): R = function?.invoke(p0, p1, p2)?: throw InvalidJvmLambdaException()

  public override fun unsafeInvokeFromBuffer(): R =
      function?.invoke(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2)?: throw InvalidJvmLambdaException()

  public override fun invalidate(): Unit {
    function = null
  }
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
) : LambdaContainer<R>(returnConverter, typeConverters) {
  private var function: ((
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
  ) -> R)? = function

  public fun unsafeInvoke(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
  ): R = function?.invoke(p0, p1, p2, p3)?: throw InvalidJvmLambdaException()

  public override fun unsafeInvokeFromBuffer(): R =
      function?.invoke(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3)?: throw InvalidJvmLambdaException()

  public override fun invalidate(): Unit {
    function = null
  }
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
) : LambdaContainer<R>(returnConverter, typeConverters) {
  private var function: ((
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ) -> R)? = function

  public fun unsafeInvoke(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ): R = function?.invoke(p0, p1, p2, p3, p4)?: throw InvalidJvmLambdaException()

  public override fun unsafeInvokeFromBuffer(): R =
      function?.invoke(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4)?: throw InvalidJvmLambdaException()

  public override fun invalidate(): Unit {
    function = null
  }
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
) : LambdaContainer<R>(returnConverter, typeConverters) {
  private var function: ((
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) -> R)? = function

  public fun unsafeInvoke(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ): R = function?.invoke(p0, p1, p2, p3, p4, p5)?: throw InvalidJvmLambdaException()

  public override fun unsafeInvokeFromBuffer(): R =
      function?.invoke(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4, paramsArray[5] as P5)?: throw InvalidJvmLambdaException()

  public override fun invalidate(): Unit {
    function = null
  }
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
) : LambdaContainer<R>(returnConverter, typeConverters) {
  private var function: ((
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) -> R)? = function

  public fun unsafeInvoke(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ): R = function?.invoke(p0, p1, p2, p3, p4, p5, p6)?: throw InvalidJvmLambdaException()

  public override fun unsafeInvokeFromBuffer(): R =
      function?.invoke(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4, paramsArray[5] as P5, paramsArray[6] as P6)?: throw InvalidJvmLambdaException()

  public override fun invalidate(): Unit {
    function = null
  }
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
) : LambdaContainer<R>(returnConverter, typeConverters) {
  private var function: ((
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) -> R)? = function

  public fun unsafeInvoke(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ): R = function?.invoke(p0, p1, p2, p3, p4, p5, p6, p7)?: throw InvalidJvmLambdaException()

  public override fun unsafeInvokeFromBuffer(): R =
      function?.invoke(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4, paramsArray[5] as P5, paramsArray[6] as P6, paramsArray[7] as P7)?: throw InvalidJvmLambdaException()

  public override fun invalidate(): Unit {
    function = null
  }
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
) : LambdaContainer<R>(returnConverter, typeConverters) {
  private var function: ((
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) -> R)? = function

  public fun unsafeInvoke(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ): R = function?.invoke(p0, p1, p2, p3, p4, p5, p6, p7, p8)?: throw InvalidJvmLambdaException()

  public override fun unsafeInvokeFromBuffer(): R =
      function?.invoke(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4, paramsArray[5] as P5, paramsArray[6] as P6, paramsArray[7] as P7, paramsArray[8] as P8)?: throw InvalidJvmLambdaException()

  public override fun invalidate(): Unit {
    function = null
  }
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
) : LambdaContainer<R>(returnConverter, typeConverters) {
  private var function: ((
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) -> R)? = function

  public fun unsafeInvoke(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ): R =
      function?.invoke(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)?: throw InvalidJvmLambdaException()

  public override fun unsafeInvokeFromBuffer(): R =
      function?.invoke(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4, paramsArray[5] as P5, paramsArray[6] as P6, paramsArray[7] as P7, paramsArray[8] as P8, paramsArray[9] as P9)?: throw InvalidJvmLambdaException()

  public override fun invalidate(): Unit {
    function = null
  }
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
) : LambdaContainer<R>(returnConverter, typeConverters) {
  private var function: ((
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) -> R)? = function

  public fun unsafeInvoke(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ): R =
      function?.invoke(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)?: throw InvalidJvmLambdaException()

  public override fun unsafeInvokeFromBuffer(): R =
      function?.invoke(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4, paramsArray[5] as P5, paramsArray[6] as P6, paramsArray[7] as P7, paramsArray[8] as P8, paramsArray[9] as P9, paramsArray[10] as P10)?: throw InvalidJvmLambdaException()

  public override fun invalidate(): Unit {
    function = null
  }
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
) : LambdaContainer<R>(returnConverter, typeConverters) {
  private var function: ((
    p0: P0,
    p1: P1,
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
  ) -> R)? = function

  public fun unsafeInvoke(
    p0: P0,
    p1: P1,
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
  ): R =
      function?.invoke(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)?: throw InvalidJvmLambdaException()

  public override fun unsafeInvokeFromBuffer(): R =
      function?.invoke(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4, paramsArray[5] as P5, paramsArray[6] as P6, paramsArray[7] as P7, paramsArray[8] as P8, paramsArray[9] as P9, paramsArray[10] as P10, paramsArray[11] as P11)?: throw InvalidJvmLambdaException()

  public override fun invalidate(): Unit {
    function = null
  }
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
) : LambdaContainer<R>(returnConverter, typeConverters) {
  private var function: ((
    p0: P0,
    p1: P1,
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
  ) -> R)? = function

  public fun unsafeInvoke(
    p0: P0,
    p1: P1,
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
  ): R =
      function?.invoke(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)?: throw InvalidJvmLambdaException()

  public override fun unsafeInvokeFromBuffer(): R =
      function?.invoke(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4, paramsArray[5] as P5, paramsArray[6] as P6, paramsArray[7] as P7, paramsArray[8] as P8, paramsArray[9] as P9, paramsArray[10] as P10, paramsArray[11] as P11, paramsArray[12] as P12)?: throw InvalidJvmLambdaException()

  public override fun invalidate(): Unit {
    function = null
  }
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
) : LambdaContainer<R>(returnConverter, typeConverters) {
  private var function: ((
    p0: P0,
    p1: P1,
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
  ) -> R)? = function

  public fun unsafeInvoke(
    p0: P0,
    p1: P1,
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
  ): R =
      function?.invoke(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)?: throw InvalidJvmLambdaException()

  public override fun unsafeInvokeFromBuffer(): R =
      function?.invoke(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4, paramsArray[5] as P5, paramsArray[6] as P6, paramsArray[7] as P7, paramsArray[8] as P8, paramsArray[9] as P9, paramsArray[10] as P10, paramsArray[11] as P11, paramsArray[12] as P12, paramsArray[13] as P13)?: throw InvalidJvmLambdaException()

  public override fun invalidate(): Unit {
    function = null
  }
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
) : LambdaContainer<R>(returnConverter, typeConverters) {
  private var function: ((
    p0: P0,
    p1: P1,
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
  ) -> R)? = function

  public fun unsafeInvoke(
    p0: P0,
    p1: P1,
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
  ): R =
      function?.invoke(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14)?: throw InvalidJvmLambdaException()

  public override fun unsafeInvokeFromBuffer(): R =
      function?.invoke(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4, paramsArray[5] as P5, paramsArray[6] as P6, paramsArray[7] as P7, paramsArray[8] as P8, paramsArray[9] as P9, paramsArray[10] as P10, paramsArray[11] as P11, paramsArray[12] as P12, paramsArray[13] as P13, paramsArray[14] as P14)?: throw InvalidJvmLambdaException()

  public override fun invalidate(): Unit {
    function = null
  }
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
) : LambdaContainer<R>(returnConverter, typeConverters) {
  private var function: ((
    p0: P0,
    p1: P1,
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
  ) -> R)? = function

  public fun unsafeInvoke(
    p0: P0,
    p1: P1,
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
      function?.invoke(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)?: throw InvalidJvmLambdaException()

  public override fun unsafeInvokeFromBuffer(): R =
      function?.invoke(paramsArray[0] as P0, paramsArray[1] as P1, paramsArray[2] as P2, paramsArray[3] as P3, paramsArray[4] as P4, paramsArray[5] as P5, paramsArray[6] as P6, paramsArray[7] as P7, paramsArray[8] as P8, paramsArray[9] as P9, paramsArray[10] as P10, paramsArray[11] as P11, paramsArray[12] as P12, paramsArray[13] as P13, paramsArray[14] as P14, paramsArray[15] as P15)?: throw InvalidJvmLambdaException()

  public override fun invalidate(): Unit {
    function = null
  }
}
