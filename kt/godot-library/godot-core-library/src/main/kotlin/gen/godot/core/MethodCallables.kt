@file:Suppress(
  "PackageDirectoryMismatch", "UNCHECKED_CAST",
  "unused",
  "RedundantVisibilityModifier",
)

package godot.core

import godot.api.Object
import kotlin.Any
import kotlin.Array
import kotlin.PublishedApi
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import kotlin.reflect.KCallable

public class MethodStringName0<T : Object, R> private constructor(
  public val methodName: StringName,
) {
  public constructor(methodName: String) : this(methodName.asStringName())

  internal fun toCallable(godotObject: T) = MethodCallable0<R>(godotObject, methodName)
}

public class MethodCallable0<R> @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs), Callable0<R> {
  public companion object {
    @JvmStatic
    public fun <R> createUnsafe(godotObject: Object, methodName: String): MethodCallable0<R> =
        MethodCallable0<R>(godotObject, methodName.toGodotName())

    @JvmStatic
    public fun <T : Object, R> create(godotObject: T, methodName: MethodStringName0<T, R>):
        MethodCallable0<R> = methodName.toCallable(godotObject)
  }
}

public fun <T : Object, R> callable0(target: T, callable: T.() -> R) =
    MethodCallable0<R>(target, (callable as KCallable<R>).name.toGodotName())

public class MethodStringName1<T : Object, R, P0> private constructor(
  public val methodName: StringName,
) {
  public constructor(methodName: String) : this(methodName.asStringName())

  internal fun toCallable(godotObject: T) = MethodCallable1<R, P0>(godotObject, methodName)
}

public class MethodCallable1<R, P0> @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs), Callable1<R, P0> {
  public override fun bind(p0: P0) = MethodCallable0<R>(target, methodName, arrayOf<Any?>(p0,
      *boundArgs))

  public companion object {
    @JvmStatic
    public fun <R, P0> createUnsafe(godotObject: Object, methodName: String): MethodCallable1<R, P0>
        = MethodCallable1<R, P0>(godotObject, methodName.toGodotName())

    @JvmStatic
    public fun <T : Object, R, P0> create(godotObject: T, methodName: MethodStringName1<T, R, P0>):
        MethodCallable1<R, P0> = methodName.toCallable(godotObject)
  }
}

public fun <T : Object, R, P0> callable1(target: T, callable: T.(p0: P0) -> R) =
    MethodCallable1<R, P0>(target, (callable as KCallable<R>).name.toGodotName())

public class MethodStringName2<T : Object, R, P0, P1> private constructor(
  public val methodName: StringName,
) {
  public constructor(methodName: String) : this(methodName.asStringName())

  internal fun toCallable(godotObject: T) = MethodCallable2<R, P0, P1>(godotObject, methodName)
}

public class MethodCallable2<R, P0, P1> @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs), Callable2<R, P0, P1> {
  public override fun bind(p1: P1) = MethodCallable1<R, P0>(target, methodName, arrayOf<Any?>(p1,
      *boundArgs))

  public override fun bind(p0: P0, p1: P1) = MethodCallable0<R>(target, methodName,
      arrayOf<Any?>(p0, p1, *boundArgs))

  public companion object {
    @JvmStatic
    public fun <R, P0, P1> createUnsafe(godotObject: Object, methodName: String):
        MethodCallable2<R, P0, P1> =
        MethodCallable2<R, P0, P1>(godotObject, methodName.toGodotName())

    @JvmStatic
    public fun <T : Object, R, P0, P1> create(godotObject: T,
        methodName: MethodStringName2<T, R, P0, P1>): MethodCallable2<R, P0, P1> =
        methodName.toCallable(godotObject)
  }
}

public fun <T : Object, R, P0, P1> callable2(target: T, callable: T.(p0: P0, p1: P1) -> R) =
    MethodCallable2<R, P0, P1>(target, (callable as KCallable<R>).name.toGodotName())

public class MethodStringName3<T : Object, R, P0, P1, P2> private constructor(
  public val methodName: StringName,
) {
  public constructor(methodName: String) : this(methodName.asStringName())

  internal fun toCallable(godotObject: T) = MethodCallable3<R, P0, P1, P2>(godotObject, methodName)
}

public class MethodCallable3<R, P0, P1, P2> @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs), Callable3<R, P0, P1, P2> {
  public override fun bind(p2: P2) = MethodCallable2<R, P0, P1>(target, methodName,
      arrayOf<Any?>(p2, *boundArgs))

  public override fun bind(p1: P1, p2: P2) = MethodCallable1<R, P0>(target, methodName,
      arrayOf<Any?>(p1, p2, *boundArgs))

  public override fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
  ) = MethodCallable0<R>(target, methodName, arrayOf<Any?>(p0, p1, p2, *boundArgs))

  public companion object {
    @JvmStatic
    public fun <R, P0, P1, P2> createUnsafe(godotObject: Object, methodName: String):
        MethodCallable3<R, P0, P1, P2> =
        MethodCallable3<R, P0, P1, P2>(godotObject, methodName.toGodotName())

    @JvmStatic
    public fun <T : Object, R, P0, P1, P2> create(godotObject: T,
        methodName: MethodStringName3<T, R, P0, P1, P2>): MethodCallable3<R, P0, P1, P2> =
        methodName.toCallable(godotObject)
  }
}

public fun <T : Object, R, P0, P1, P2> callable3(target: T, callable: T.(
  p0: P0,
  p1: P1,
  p2: P2,
) -> R) = MethodCallable3<R, P0, P1, P2>(target, (callable as KCallable<R>).name.toGodotName())

public class MethodStringName4<T : Object, R, P0, P1, P2, P3> private constructor(
  public val methodName: StringName,
) {
  public constructor(methodName: String) : this(methodName.asStringName())

  internal fun toCallable(godotObject: T) = MethodCallable4<R, P0, P1, P2, P3>(godotObject,
      methodName)
}

public class MethodCallable4<R, P0, P1, P2, P3> @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs), Callable4<R, P0, P1, P2, P3> {
  public override fun bind(p3: P3) = MethodCallable3<R, P0, P1, P2>(target, methodName,
      arrayOf<Any?>(p3, *boundArgs))

  public override fun bind(p2: P2, p3: P3) = MethodCallable2<R, P0, P1>(target, methodName,
      arrayOf<Any?>(p2, p3, *boundArgs))

  public override fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
  ) = MethodCallable1<R, P0>(target, methodName, arrayOf<Any?>(p1, p2, p3, *boundArgs))

  public override fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
  ) = MethodCallable0<R>(target, methodName, arrayOf<Any?>(p0, p1, p2, p3, *boundArgs))

  public companion object {
    @JvmStatic
    public fun <R, P0, P1, P2, P3> createUnsafe(godotObject: Object, methodName: String):
        MethodCallable4<R, P0, P1, P2, P3> =
        MethodCallable4<R, P0, P1, P2, P3>(godotObject, methodName.toGodotName())

    @JvmStatic
    public fun <T : Object, R, P0, P1, P2, P3> create(godotObject: T,
        methodName: MethodStringName4<T, R, P0, P1, P2, P3>): MethodCallable4<R, P0, P1, P2, P3> =
        methodName.toCallable(godotObject)
  }
}

public fun <T : Object, R, P0, P1, P2, P3> callable4(target: T, callable: T.(
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
) -> R) = MethodCallable4<R, P0, P1, P2, P3>(target, (callable as KCallable<R>).name.toGodotName())

public class MethodStringName5<T : Object, R, P0, P1, P2, P3, P4> private constructor(
  public val methodName: StringName,
) {
  public constructor(methodName: String) : this(methodName.asStringName())

  internal fun toCallable(godotObject: T) = MethodCallable5<R, P0, P1, P2, P3, P4>(godotObject,
      methodName)
}

public class MethodCallable5<R, P0, P1, P2, P3, P4> @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs), Callable5<R, P0, P1, P2, P3, P4> {
  public override fun bind(p4: P4) = MethodCallable4<R, P0, P1, P2, P3>(target, methodName,
      arrayOf<Any?>(p4, *boundArgs))

  public override fun bind(p3: P3, p4: P4) = MethodCallable3<R, P0, P1, P2>(target, methodName,
      arrayOf<Any?>(p3, p4, *boundArgs))

  public override fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
  ) = MethodCallable2<R, P0, P1>(target, methodName, arrayOf<Any?>(p2, p3, p4, *boundArgs))

  public override fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ) = MethodCallable1<R, P0>(target, methodName, arrayOf<Any?>(p1, p2, p3, p4, *boundArgs))

  public override fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ) = MethodCallable0<R>(target, methodName, arrayOf<Any?>(p0, p1, p2, p3, p4, *boundArgs))

  public companion object {
    @JvmStatic
    public fun <R, P0, P1, P2, P3, P4> createUnsafe(godotObject: Object, methodName: String):
        MethodCallable5<R, P0, P1, P2, P3, P4> =
        MethodCallable5<R, P0, P1, P2, P3, P4>(godotObject, methodName.toGodotName())

    @JvmStatic
    public fun <T : Object, R, P0, P1, P2, P3, P4> create(godotObject: T,
        methodName: MethodStringName5<T, R, P0, P1, P2, P3, P4>):
        MethodCallable5<R, P0, P1, P2, P3, P4> = methodName.toCallable(godotObject)
  }
}

public fun <T : Object, R, P0, P1, P2, P3, P4> callable5(target: T, callable: T.(
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
) -> R) =
    MethodCallable5<R, P0, P1, P2, P3, P4>(target, (callable as KCallable<R>).name.toGodotName())

public class MethodStringName6<T : Object, R, P0, P1, P2, P3, P4, P5> private constructor(
  public val methodName: StringName,
) {
  public constructor(methodName: String) : this(methodName.asStringName())

  internal fun toCallable(godotObject: T) = MethodCallable6<R, P0, P1, P2, P3, P4, P5>(godotObject,
      methodName)
}

public class MethodCallable6<R, P0, P1, P2, P3, P4, P5> @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs), Callable6<R, P0, P1, P2, P3, P4, P5> {
  public override fun bind(p5: P5) = MethodCallable5<R, P0, P1, P2, P3, P4>(target, methodName,
      arrayOf<Any?>(p5, *boundArgs))

  public override fun bind(p4: P4, p5: P5) = MethodCallable4<R, P0, P1, P2, P3>(target, methodName,
      arrayOf<Any?>(p4, p5, *boundArgs))

  public override fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
  ) = MethodCallable3<R, P0, P1, P2>(target, methodName, arrayOf<Any?>(p3, p4, p5, *boundArgs))

  public override fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) = MethodCallable2<R, P0, P1>(target, methodName, arrayOf<Any?>(p2, p3, p4, p5, *boundArgs))

  public override fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) = MethodCallable1<R, P0>(target, methodName, arrayOf<Any?>(p1, p2, p3, p4, p5, *boundArgs))

  public override fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) = MethodCallable0<R>(target, methodName, arrayOf<Any?>(p0, p1, p2, p3, p4, p5, *boundArgs))

  public companion object {
    @JvmStatic
    public fun <R, P0, P1, P2, P3, P4, P5> createUnsafe(godotObject: Object, methodName: String):
        MethodCallable6<R, P0, P1, P2, P3, P4, P5> =
        MethodCallable6<R, P0, P1, P2, P3, P4, P5>(godotObject, methodName.toGodotName())

    @JvmStatic
    public fun <T : Object, R, P0, P1, P2, P3, P4, P5> create(godotObject: T,
        methodName: MethodStringName6<T, R, P0, P1, P2, P3, P4, P5>):
        MethodCallable6<R, P0, P1, P2, P3, P4, P5> = methodName.toCallable(godotObject)
  }
}

public fun <T : Object, R, P0, P1, P2, P3, P4, P5> callable6(target: T, callable: T.(
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
) -> R) =
    MethodCallable6<R, P0, P1, P2, P3, P4, P5>(target, (callable as KCallable<R>).name.toGodotName())

public class MethodStringName7<T : Object, R, P0, P1, P2, P3, P4, P5, P6> private constructor(
  public val methodName: StringName,
) {
  public constructor(methodName: String) : this(methodName.asStringName())

  internal fun toCallable(godotObject: T) =
      MethodCallable7<R, P0, P1, P2, P3, P4, P5, P6>(godotObject, methodName)
}

public class MethodCallable7<R, P0, P1, P2, P3, P4, P5, P6> @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs), Callable7<R, P0, P1, P2, P3, P4, P5, P6> {
  public override fun bind(p6: P6) = MethodCallable6<R, P0, P1, P2, P3, P4, P5>(target, methodName,
      arrayOf<Any?>(p6, *boundArgs))

  public override fun bind(p5: P5, p6: P6) = MethodCallable5<R, P0, P1, P2, P3, P4>(target,
      methodName, arrayOf<Any?>(p5, p6, *boundArgs))

  public override fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
  ) = MethodCallable4<R, P0, P1, P2, P3>(target, methodName, arrayOf<Any?>(p4, p5, p6, *boundArgs))

  public override fun bind(
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) = MethodCallable3<R, P0, P1, P2>(target, methodName, arrayOf<Any?>(p3, p4, p5, p6, *boundArgs))

  public override fun bind(
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) = MethodCallable2<R, P0, P1>(target, methodName, arrayOf<Any?>(p2, p3, p4, p5, p6, *boundArgs))

  public override fun bind(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) = MethodCallable1<R, P0>(target, methodName, arrayOf<Any?>(p1, p2, p3, p4, p5, p6, *boundArgs))

  public override fun bind(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) = MethodCallable0<R>(target, methodName, arrayOf<Any?>(p0, p1, p2, p3, p4, p5, p6, *boundArgs))

  public companion object {
    @JvmStatic
    public fun <R, P0, P1, P2, P3, P4, P5, P6> createUnsafe(godotObject: Object,
        methodName: String): MethodCallable7<R, P0, P1, P2, P3, P4, P5, P6> =
        MethodCallable7<R, P0, P1, P2, P3, P4, P5, P6>(godotObject, methodName.toGodotName())

    @JvmStatic
    public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6> create(godotObject: T,
        methodName: MethodStringName7<T, R, P0, P1, P2, P3, P4, P5, P6>):
        MethodCallable7<R, P0, P1, P2, P3, P4, P5, P6> = methodName.toCallable(godotObject)
  }
}

public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6> callable7(target: T, callable: T.(
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
) -> R) =
    MethodCallable7<R, P0, P1, P2, P3, P4, P5, P6>(target, (callable as KCallable<R>).name.toGodotName())

public class MethodStringName8<T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7> private constructor(
  public val methodName: StringName,
) {
  public constructor(methodName: String) : this(methodName.asStringName())

  internal fun toCallable(godotObject: T) =
      MethodCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(godotObject, methodName)
}

public class MethodCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7> @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs), Callable8<R, P0, P1, P2, P3, P4, P5, P6, P7> {
  public override fun bind(p7: P7) = MethodCallable7<R, P0, P1, P2, P3, P4, P5, P6>(target,
      methodName, arrayOf<Any?>(p7, *boundArgs))

  public override fun bind(p6: P6, p7: P7) = MethodCallable6<R, P0, P1, P2, P3, P4, P5>(target,
      methodName, arrayOf<Any?>(p6, p7, *boundArgs))

  public override fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
  ) = MethodCallable5<R, P0, P1, P2, P3, P4>(target, methodName, arrayOf<Any?>(p5, p6, p7,
      *boundArgs))

  public override fun bind(
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) = MethodCallable4<R, P0, P1, P2, P3>(target, methodName, arrayOf<Any?>(p4, p5, p6, p7,
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
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) = MethodCallable2<R, P0, P1>(target, methodName, arrayOf<Any?>(p2, p3, p4, p5, p6, p7,
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

  public companion object {
    @JvmStatic
    public fun <R, P0, P1, P2, P3, P4, P5, P6, P7> createUnsafe(godotObject: Object,
        methodName: String): MethodCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7> =
        MethodCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(godotObject, methodName.toGodotName())

    @JvmStatic
    public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7> create(godotObject: T,
        methodName: MethodStringName8<T, R, P0, P1, P2, P3, P4, P5, P6, P7>):
        MethodCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7> = methodName.toCallable(godotObject)
  }
}

public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7> callable8(target: T, callable: T.(
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
  p7: P7,
) -> R) =
    MethodCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(target, (callable as KCallable<R>).name.toGodotName())

public class MethodStringName9<T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8> private
    constructor(
  public val methodName: StringName,
) {
  public constructor(methodName: String) : this(methodName.asStringName())

  internal fun toCallable(godotObject: T) =
      MethodCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(godotObject, methodName)
}

public class MethodCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8> @PublishedApi internal
    constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs), Callable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>
    {
  public override fun bind(p8: P8) = MethodCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(target,
      methodName, arrayOf<Any?>(p8, *boundArgs))

  public override fun bind(p7: P7, p8: P8) = MethodCallable7<R, P0, P1, P2, P3, P4, P5, P6>(target,
      methodName, arrayOf<Any?>(p7, p8, *boundArgs))

  public override fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
  ) = MethodCallable6<R, P0, P1, P2, P3, P4, P5>(target, methodName, arrayOf<Any?>(p6, p7, p8,
      *boundArgs))

  public override fun bind(
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) = MethodCallable5<R, P0, P1, P2, P3, P4>(target, methodName, arrayOf<Any?>(p5, p6, p7, p8,
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
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) = MethodCallable3<R, P0, P1, P2>(target, methodName, arrayOf<Any?>(p3, p4, p5, p6, p7, p8,
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

  public companion object {
    @JvmStatic
    public fun <R, P0, P1, P2, P3, P4, P5, P6, P7, P8> createUnsafe(godotObject: Object,
        methodName: String): MethodCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8> =
        MethodCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(godotObject, methodName.toGodotName())

    @JvmStatic
    public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8> create(godotObject: T,
        methodName: MethodStringName9<T, R, P0, P1, P2, P3, P4, P5, P6, P7, P8>):
        MethodCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8> = methodName.toCallable(godotObject)
  }
}

public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8> callable9(target: T, callable: T.(
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
    MethodCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(target, (callable as KCallable<R>).name.toGodotName())

public class MethodStringName10<T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> private
    constructor(
  public val methodName: StringName,
) {
  public constructor(methodName: String) : this(methodName.asStringName())

  internal fun toCallable(godotObject: T) =
      MethodCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(godotObject, methodName)
}

public class MethodCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> @PublishedApi internal
    constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs),
    Callable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> {
  public override fun bind(p9: P9) = MethodCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(target,
      methodName, arrayOf<Any?>(p9, *boundArgs))

  public override fun bind(p8: P8, p9: P9) =
      MethodCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(target, methodName, arrayOf<Any?>(p8, p9,
      *boundArgs))

  public override fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
  ) = MethodCallable7<R, P0, P1, P2, P3, P4, P5, P6>(target, methodName, arrayOf<Any?>(p7, p8, p9,
      *boundArgs))

  public override fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) = MethodCallable6<R, P0, P1, P2, P3, P4, P5>(target, methodName, arrayOf<Any?>(p6, p7, p8, p9,
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
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) = MethodCallable4<R, P0, P1, P2, P3>(target, methodName, arrayOf<Any?>(p4, p5, p6, p7, p8, p9,
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
    p0: P0,
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

  public companion object {
    @JvmStatic
    public fun <R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> createUnsafe(godotObject: Object,
        methodName: String): MethodCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> =
        MethodCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(godotObject, methodName.toGodotName())

    @JvmStatic
    public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> create(godotObject: T,
        methodName: MethodStringName10<T, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>):
        MethodCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> =
        methodName.toCallable(godotObject)
  }
}

public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> callable10(target: T,
    callable: T.(
  p0: P0,
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
    MethodCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(target, (callable as KCallable<R>).name.toGodotName())

public class MethodStringName11<T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> private
    constructor(
  public val methodName: StringName,
) {
  public constructor(methodName: String) : this(methodName.asStringName())

  internal fun toCallable(godotObject: T) =
      MethodCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(godotObject, methodName)
}

public class MethodCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> @PublishedApi internal
    constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs),
    Callable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> {
  public override fun bind(p10: P10) =
      MethodCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(target, methodName,
      arrayOf<Any?>(p10, *boundArgs))

  public override fun bind(p9: P9, p10: P10) =
      MethodCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(target, methodName,
      arrayOf<Any?>(p9, p10, *boundArgs))

  public override fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
  ) = MethodCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(target, methodName,
      arrayOf<Any?>(p8, p9, p10, *boundArgs))

  public override fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) = MethodCallable7<R, P0, P1, P2, P3, P4, P5, P6>(target, methodName,
      arrayOf<Any?>(p7, p8, p9, p10, *boundArgs))

  public override fun bind(
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) = MethodCallable6<R, P0, P1, P2, P3, P4, P5>(target, methodName,
      arrayOf<Any?>(p6, p7, p8, p9, p10, *boundArgs))

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
    p1: P1,
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
    p0: P0,
    p1: P1,
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

  public companion object {
    @JvmStatic
    public fun <R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> createUnsafe(godotObject: Object,
        methodName: String): MethodCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> =
        MethodCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(godotObject, methodName.toGodotName())

    @JvmStatic
    public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> create(godotObject: T,
        methodName: MethodStringName11<T, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>):
        MethodCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> =
        methodName.toCallable(godotObject)
  }
}

public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> callable11(target: T,
    callable: T.(
  p0: P0,
  p1: P1,
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
    MethodCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(target, (callable as KCallable<R>).name.toGodotName())

public class MethodStringName12<T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>
    private constructor(
  public val methodName: StringName,
) {
  public constructor(methodName: String) : this(methodName.asStringName())

  internal fun toCallable(godotObject: T) =
      MethodCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(godotObject, methodName)
}

public class MethodCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> @PublishedApi
    internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs),
    Callable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> {
  public override fun bind(p11: P11) =
      MethodCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(target, methodName,
      arrayOf<Any?>(p11, *boundArgs))

  public override fun bind(p10: P10, p11: P11) =
      MethodCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(target, methodName,
      arrayOf<Any?>(p10, p11, *boundArgs))

  public override fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
  ) = MethodCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(target, methodName,
      arrayOf<Any?>(p9, p10, p11, *boundArgs))

  public override fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) = MethodCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(target, methodName,
      arrayOf<Any?>(p8, p9, p10, p11, *boundArgs))

  public override fun bind(
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) = MethodCallable7<R, P0, P1, P2, P3, P4, P5, P6>(target, methodName,
      arrayOf<Any?>(p7, p8, p9, p10, p11, *boundArgs))

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
    p2: P2,
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
    p1: P1,
    p2: P2,
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
    p0: P0,
    p1: P1,
    p2: P2,
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

  public companion object {
    @JvmStatic
    public fun <R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>
        createUnsafe(godotObject: Object, methodName: String):
        MethodCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> =
        MethodCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(godotObject, methodName.toGodotName())

    @JvmStatic
    public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>
        create(godotObject: T,
        methodName: MethodStringName12<T, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>):
        MethodCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> =
        methodName.toCallable(godotObject)
  }
}

public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> callable12(target: T,
    callable: T.(
  p0: P0,
  p1: P1,
  p2: P2,
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
    MethodCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(target, (callable as KCallable<R>).name.toGodotName())

public class MethodStringName13<T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11,
    P12> private constructor(
  public val methodName: StringName,
) {
  public constructor(methodName: String) : this(methodName.asStringName())

  internal fun toCallable(godotObject: T) =
      MethodCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>(godotObject,
      methodName)
}

public class MethodCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>
    @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs),
    Callable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> {
  public override fun bind(p12: P12) =
      MethodCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(target, methodName,
      arrayOf<Any?>(p12, *boundArgs))

  public override fun bind(p11: P11, p12: P12) =
      MethodCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(target, methodName,
      arrayOf<Any?>(p11, p12, *boundArgs))

  public override fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
  ) = MethodCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(target, methodName,
      arrayOf<Any?>(p10, p11, p12, *boundArgs))

  public override fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) = MethodCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(target, methodName,
      arrayOf<Any?>(p9, p10, p11, p12, *boundArgs))

  public override fun bind(
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
  ) = MethodCallable8<R, P0, P1, P2, P3, P4, P5, P6, P7>(target, methodName,
      arrayOf<Any?>(p8, p9, p10, p11, p12, *boundArgs))

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
    p2: P2,
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
    p1: P1,
    p2: P2,
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
    p0: P0,
    p1: P1,
    p2: P2,
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

  public companion object {
    @JvmStatic
    public fun <R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>
        createUnsafe(godotObject: Object, methodName: String):
        MethodCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> =
        MethodCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>(godotObject, methodName.toGodotName())

    @JvmStatic
    public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>
        create(godotObject: T,
        methodName: MethodStringName13<T, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>):
        MethodCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> =
        methodName.toCallable(godotObject)
  }
}

public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>
    callable13(target: T, callable: T.(
  p0: P0,
  p1: P1,
  p2: P2,
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
    MethodCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>(target, (callable as KCallable<R>).name.toGodotName())

public class MethodStringName14<T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11,
    P12, P13> private constructor(
  public val methodName: StringName,
) {
  public constructor(methodName: String) : this(methodName.asStringName())

  internal fun toCallable(godotObject: T) =
      MethodCallable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>(godotObject,
      methodName)
}

public class MethodCallable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>
    @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs),
    Callable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> {
  public override fun bind(p13: P13) =
      MethodCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>(target, methodName,
      arrayOf<Any?>(p13, *boundArgs))

  public override fun bind(p12: P12, p13: P13) =
      MethodCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(target, methodName,
      arrayOf<Any?>(p12, p13, *boundArgs))

  public override fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
  ) = MethodCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(target, methodName,
      arrayOf<Any?>(p11, p12, p13, *boundArgs))

  public override fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) = MethodCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(target, methodName,
      arrayOf<Any?>(p10, p11, p12, p13, *boundArgs))

  public override fun bind(
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
  ) = MethodCallable9<R, P0, P1, P2, P3, P4, P5, P6, P7, P8>(target, methodName,
      arrayOf<Any?>(p9, p10, p11, p12, p13, *boundArgs))

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
    p2: P2,
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
    p1: P1,
    p2: P2,
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
    p0: P0,
    p1: P1,
    p2: P2,
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

  public companion object {
    @JvmStatic
    public fun <R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>
        createUnsafe(godotObject: Object, methodName: String):
        MethodCallable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> =
        MethodCallable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>(godotObject, methodName.toGodotName())

    @JvmStatic
    public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>
        create(godotObject: T,
        methodName: MethodStringName14<T, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>):
        MethodCallable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> =
        methodName.toCallable(godotObject)
  }
}

public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>
    callable14(target: T, callable: T.(
  p0: P0,
  p1: P1,
  p2: P2,
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
    MethodCallable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>(target, (callable as KCallable<R>).name.toGodotName())

public class MethodStringName15<T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11,
    P12, P13, P14> private constructor(
  public val methodName: StringName,
) {
  public constructor(methodName: String) : this(methodName.asStringName())

  internal fun toCallable(godotObject: T) =
      MethodCallable15<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>(godotObject,
      methodName)
}

public class MethodCallable15<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>
    @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs),
    Callable15<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> {
  public override fun bind(p14: P14) =
      MethodCallable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>(target,
      methodName, arrayOf<Any?>(p14, *boundArgs))

  public override fun bind(p13: P13, p14: P14) =
      MethodCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>(target, methodName,
      arrayOf<Any?>(p13, p14, *boundArgs))

  public override fun bind(
    p12: P12,
    p13: P13,
    p14: P14,
  ) = MethodCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(target, methodName,
      arrayOf<Any?>(p12, p13, p14, *boundArgs))

  public override fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) = MethodCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(target, methodName,
      arrayOf<Any?>(p11, p12, p13, p14, *boundArgs))

  public override fun bind(
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
  ) = MethodCallable10<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(target, methodName,
      arrayOf<Any?>(p10, p11, p12, p13, p14, *boundArgs))

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
    p2: P2,
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
    p1: P1,
    p2: P2,
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
    p0: P0,
    p1: P1,
    p2: P2,
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

  public companion object {
    @JvmStatic
    public fun <R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>
        createUnsafe(godotObject: Object, methodName: String):
        MethodCallable15<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> =
        MethodCallable15<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>(godotObject, methodName.toGodotName())

    @JvmStatic
    public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>
        create(godotObject: T,
        methodName: MethodStringName15<T, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>):
        MethodCallable15<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> =
        methodName.toCallable(godotObject)
  }
}

public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>
    callable15(target: T, callable: T.(
  p0: P0,
  p1: P1,
  p2: P2,
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
    MethodCallable15<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>(target, (callable as KCallable<R>).name.toGodotName())

public class MethodStringName16<T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11,
    P12, P13, P14, P15> private constructor(
  public val methodName: StringName,
) {
  public constructor(methodName: String) : this(methodName.asStringName())

  internal fun toCallable(godotObject: T) =
      MethodCallable16<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>(godotObject,
      methodName)
}

public class MethodCallable16<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14,
    P15> @PublishedApi internal constructor(
  target: Object,
  methodName: StringName,
  boundArgs: Array<Any?> = emptyArray(),
) : MethodCallable(target, methodName, boundArgs),
    Callable16<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15> {
  public override fun bind(p15: P15) =
      MethodCallable15<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>(target,
      methodName, arrayOf<Any?>(p15, *boundArgs))

  public override fun bind(p14: P14, p15: P15) =
      MethodCallable14<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>(target,
      methodName, arrayOf<Any?>(p14, p15, *boundArgs))

  public override fun bind(
    p13: P13,
    p14: P14,
    p15: P15,
  ) = MethodCallable13<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>(target, methodName,
      arrayOf<Any?>(p13, p14, p15, *boundArgs))

  public override fun bind(
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) = MethodCallable12<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(target, methodName,
      arrayOf<Any?>(p12, p13, p14, p15, *boundArgs))

  public override fun bind(
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
  ) = MethodCallable11<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(target, methodName,
      arrayOf<Any?>(p11, p12, p13, p14, p15, *boundArgs))

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
    p2: P2,
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
    p1: P1,
    p2: P2,
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
    p0: P0,
    p1: P1,
    p2: P2,
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

  public companion object {
    @JvmStatic
    public fun <R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>
        createUnsafe(godotObject: Object, methodName: String):
        MethodCallable16<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15> =
        MethodCallable16<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>(godotObject, methodName.toGodotName())

    @JvmStatic
    public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>
        create(godotObject: T,
        methodName: MethodStringName16<T, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>):
        MethodCallable16<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15> =
        methodName.toCallable(godotObject)
  }
}

public fun <T : Object, R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>
    callable16(target: T, callable: T.(
  p0: P0,
  p1: P1,
  p2: P2,
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
    MethodCallable16<R, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>(target, (callable as KCallable<R>).name.toGodotName())
