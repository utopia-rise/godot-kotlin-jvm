@file:Suppress(
  "PackageDirectoryMismatch", "UNCHECKED_CAST",
  "unused",
  "NOTHING_TO_INLINE",
)

package godot.extension

import godot.api.Object
import godot.api.Object.ConnectFlags
import godot.core.LambdaContainer0
import godot.core.LambdaContainer1
import godot.core.LambdaContainer10
import godot.core.LambdaContainer11
import godot.core.LambdaContainer12
import godot.core.LambdaContainer13
import godot.core.LambdaContainer14
import godot.core.LambdaContainer15
import godot.core.LambdaContainer16
import godot.core.LambdaContainer2
import godot.core.LambdaContainer3
import godot.core.LambdaContainer4
import godot.core.LambdaContainer5
import godot.core.LambdaContainer6
import godot.core.LambdaContainer7
import godot.core.LambdaContainer8
import godot.core.LambdaContainer9
import godot.core.MethodCallable
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal10
import godot.core.Signal11
import godot.core.Signal12
import godot.core.Signal13
import godot.core.Signal14
import godot.core.Signal15
import godot.core.Signal16
import godot.core.Signal2
import godot.core.Signal3
import godot.core.Signal4
import godot.core.Signal5
import godot.core.Signal6
import godot.core.Signal7
import godot.core.Signal8
import godot.core.Signal9
import godot.core.VariantParser
import godot.core.asCallable
import godot.core.toGodotName
import godot.core.variantMapper
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmSynthetic
import kotlin.reflect.KCallable

public inline fun Signal0.connectLambda(flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
    noinline method: () -> Unit): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      method.asCallable()
  )
  connector.connect(flags)
  return connector
}

@JvmSynthetic
public fun <T : Object> Signal0.connectMethod(
  target: T,
  method: T.() -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      MethodCallable(target, (method as KCallable<*>).name.toGodotName())
  )
  connector.connect(flags)
  return connector
}

public inline fun Signal0.promise(noinline method: () -> Unit, noinline cancel: () -> Unit): Unit {
  LambdaContainer0<Unit>(VariantParser.NIL, arrayOf(), method).setAsCancellable(this, cancel)
}

public inline fun <reified P0> Signal1<P0>.connectLambda(flags: Object.ConnectFlags =
    Object.ConnectFlags.DEFAULT, noinline method: (p0: P0) -> Unit): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      method.asCallable()
  )
  connector.connect(flags)
  return connector
}

@JvmSynthetic
public fun <T : Object, P0> Signal1<P0>.connectMethod(
  target: T,
  method: T.(p0: P0) -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      MethodCallable(target, (method as KCallable<*>).name.toGodotName())
  )
  connector.connect(flags)
  return connector
}

public inline fun <reified P0> Signal1<P0>.promise(noinline method: (p0: P0) -> Unit, noinline
    cancel: () -> Unit): Unit {
  LambdaContainer1<Unit, P0>(VariantParser.NIL, arrayOf(variantMapper[P0::class]!!), method).setAsCancellable(this, cancel)
}

public inline fun <reified P0, reified P1> Signal2<P0, P1>.connectLambda(flags: Object.ConnectFlags
    = Object.ConnectFlags.DEFAULT, noinline method: (p0: P0, p1: P1) -> Unit): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      method.asCallable()
  )
  connector.connect(flags)
  return connector
}

@JvmSynthetic
public fun <T : Object, P0, P1> Signal2<P0, P1>.connectMethod(
  target: T,
  method: T.(p0: P0, p1: P1) -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      MethodCallable(target, (method as KCallable<*>).name.toGodotName())
  )
  connector.connect(flags)
  return connector
}

public inline fun <reified P0, reified P1> Signal2<P0, P1>.promise(noinline method: (p0: P0,
    p1: P1) -> Unit, noinline cancel: () -> Unit): Unit {
  LambdaContainer2<Unit, P0, P1>(VariantParser.NIL, arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!), method).setAsCancellable(this, cancel)
}

public inline fun <reified P0, reified P1, reified P2>
    Signal3<P0, P1, P2>.connectLambda(flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
    noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
) -> Unit): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      method.asCallable()
  )
  connector.connect(flags)
  return connector
}

@JvmSynthetic
public fun <T : Object, P0, P1, P2> Signal3<P0, P1, P2>.connectMethod(
  target: T,
  method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
  ) -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      MethodCallable(target, (method as KCallable<*>).name.toGodotName())
  )
  connector.connect(flags)
  return connector
}

public inline fun <reified P0, reified P1, reified P2> Signal3<P0, P1, P2>.promise(noinline
    method: (
  p0: P0,
  p1: P1,
  p2: P2,
) -> Unit, noinline cancel: () -> Unit): Unit {
  LambdaContainer3<Unit, P0, P1, P2>(VariantParser.NIL, arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!), method).setAsCancellable(this, cancel)
}

public inline fun <reified P0, reified P1, reified P2, reified P3>
    Signal4<P0, P1, P2, P3>.connectLambda(flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
    noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
) -> Unit): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      method.asCallable()
  )
  connector.connect(flags)
  return connector
}

@JvmSynthetic
public fun <T : Object, P0, P1, P2, P3> Signal4<P0, P1, P2, P3>.connectMethod(
  target: T,
  method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
  ) -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      MethodCallable(target, (method as KCallable<*>).name.toGodotName())
  )
  connector.connect(flags)
  return connector
}

public inline fun <reified P0, reified P1, reified P2, reified P3>
    Signal4<P0, P1, P2, P3>.promise(noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
) -> Unit, noinline cancel: () -> Unit): Unit {
  LambdaContainer4<Unit, P0, P1, P2, P3>(VariantParser.NIL, arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!), method).setAsCancellable(this, cancel)
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4>
    Signal5<P0, P1, P2, P3, P4>.connectLambda(flags: Object.ConnectFlags =
    Object.ConnectFlags.DEFAULT, noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
) -> Unit): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      method.asCallable()
  )
  connector.connect(flags)
  return connector
}

@JvmSynthetic
public fun <T : Object, P0, P1, P2, P3, P4> Signal5<P0, P1, P2, P3, P4>.connectMethod(
  target: T,
  method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ) -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      MethodCallable(target, (method as KCallable<*>).name.toGodotName())
  )
  connector.connect(flags)
  return connector
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4>
    Signal5<P0, P1, P2, P3, P4>.promise(noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
) -> Unit, noinline cancel: () -> Unit): Unit {
  LambdaContainer5<Unit, P0, P1, P2, P3, P4>(VariantParser.NIL, arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!), method).setAsCancellable(this, cancel)
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5>
    Signal6<P0, P1, P2, P3, P4, P5>.connectLambda(flags: Object.ConnectFlags =
    Object.ConnectFlags.DEFAULT, noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
) -> Unit): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      method.asCallable()
  )
  connector.connect(flags)
  return connector
}

@JvmSynthetic
public fun <T : Object, P0, P1, P2, P3, P4, P5> Signal6<P0, P1, P2, P3, P4, P5>.connectMethod(
  target: T,
  method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      MethodCallable(target, (method as KCallable<*>).name.toGodotName())
  )
  connector.connect(flags)
  return connector
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5>
    Signal6<P0, P1, P2, P3, P4, P5>.promise(noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
) -> Unit, noinline cancel: () -> Unit): Unit {
  LambdaContainer6<Unit, P0, P1, P2, P3, P4, P5>(VariantParser.NIL, arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!), method).setAsCancellable(this, cancel)
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6> Signal7<P0, P1, P2, P3, P4, P5, P6>.connectLambda(flags: Object.ConnectFlags =
    Object.ConnectFlags.DEFAULT, noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
) -> Unit): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      method.asCallable()
  )
  connector.connect(flags)
  return connector
}

@JvmSynthetic
public fun <T : Object, P0, P1, P2, P3, P4, P5, P6>
    Signal7<P0, P1, P2, P3, P4, P5, P6>.connectMethod(
  target: T,
  method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      MethodCallable(target, (method as KCallable<*>).name.toGodotName())
  )
  connector.connect(flags)
  return connector
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6> Signal7<P0, P1, P2, P3, P4, P5, P6>.promise(noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
) -> Unit, noinline cancel: () -> Unit): Unit {
  LambdaContainer7<Unit, P0, P1, P2, P3, P4, P5, P6>(VariantParser.NIL, arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!), method).setAsCancellable(this, cancel)
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7> Signal8<P0, P1, P2, P3, P4, P5, P6, P7>.connectLambda(flags: Object.ConnectFlags
    = Object.ConnectFlags.DEFAULT, noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
  p7: P7,
) -> Unit): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      method.asCallable()
  )
  connector.connect(flags)
  return connector
}

@JvmSynthetic
public fun <T : Object, P0, P1, P2, P3, P4, P5, P6, P7>
    Signal8<P0, P1, P2, P3, P4, P5, P6, P7>.connectMethod(
  target: T,
  method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      MethodCallable(target, (method as KCallable<*>).name.toGodotName())
  )
  connector.connect(flags)
  return connector
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7> Signal8<P0, P1, P2, P3, P4, P5, P6, P7>.promise(noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
  p7: P7,
) -> Unit, noinline cancel: () -> Unit): Unit {
  LambdaContainer8<Unit, P0, P1, P2, P3, P4, P5, P6, P7>(VariantParser.NIL, arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!), method).setAsCancellable(this, cancel)
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8>
    Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8>.connectLambda(flags: Object.ConnectFlags =
    Object.ConnectFlags.DEFAULT, noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
  p7: P7,
  p8: P8,
) -> Unit): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      method.asCallable()
  )
  connector.connect(flags)
  return connector
}

@JvmSynthetic
public fun <T : Object, P0, P1, P2, P3, P4, P5, P6, P7, P8>
    Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8>.connectMethod(
  target: T,
  method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      MethodCallable(target, (method as KCallable<*>).name.toGodotName())
  )
  connector.connect(flags)
  return connector
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8> Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8>.promise(noinline
    method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
  p7: P7,
  p8: P8,
) -> Unit, noinline cancel: () -> Unit): Unit {
  LambdaContainer9<Unit, P0, P1, P2, P3, P4, P5, P6, P7, P8>(VariantParser.NIL, arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!), method).setAsCancellable(this, cancel)
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9>
    Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>.connectLambda(flags: Object.ConnectFlags =
    Object.ConnectFlags.DEFAULT, noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
  p7: P7,
  p8: P8,
  p9: P9,
) -> Unit): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      method.asCallable()
  )
  connector.connect(flags)
  return connector
}

@JvmSynthetic
public fun <T : Object, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>
    Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>.connectMethod(
  target: T,
  method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      MethodCallable(target, (method as KCallable<*>).name.toGodotName())
  )
  connector.connect(flags)
  return connector
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9>
    Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>.promise(noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
  p7: P7,
  p8: P8,
  p9: P9,
) -> Unit, noinline cancel: () -> Unit): Unit {
  LambdaContainer10<Unit, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(VariantParser.NIL, arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!, variantMapper[P9::class]!!), method).setAsCancellable(this, cancel)
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10>
    Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>.connectLambda(flags: Object.ConnectFlags =
    Object.ConnectFlags.DEFAULT, noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
  p7: P7,
  p8: P8,
  p9: P9,
  p10: P10,
) -> Unit): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      method.asCallable()
  )
  connector.connect(flags)
  return connector
}

@JvmSynthetic
public fun <T : Object, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>
    Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>.connectMethod(
  target: T,
  method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      MethodCallable(target, (method as KCallable<*>).name.toGodotName())
  )
  connector.connect(flags)
  return connector
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10>
    Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>.promise(noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
  p7: P7,
  p8: P8,
  p9: P9,
  p10: P10,
) -> Unit, noinline cancel: () -> Unit): Unit {
  LambdaContainer11<Unit, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(VariantParser.NIL, arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!, variantMapper[P9::class]!!, variantMapper[P10::class]!!), method).setAsCancellable(this, cancel)
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11>
    Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>.connectLambda(flags: Object.ConnectFlags
    = Object.ConnectFlags.DEFAULT, noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
  p7: P7,
  p8: P8,
  p9: P9,
  p10: P10,
  p11: P11,
) -> Unit): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      method.asCallable()
  )
  connector.connect(flags)
  return connector
}

@JvmSynthetic
public fun <T : Object, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>
    Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>.connectMethod(
  target: T,
  method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
  ) -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      MethodCallable(target, (method as KCallable<*>).name.toGodotName())
  )
  connector.connect(flags)
  return connector
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11>
    Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>.promise(noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
  p7: P7,
  p8: P8,
  p9: P9,
  p10: P10,
  p11: P11,
) -> Unit, noinline cancel: () -> Unit): Unit {
  LambdaContainer12<Unit, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(VariantParser.NIL, arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!, variantMapper[P9::class]!!, variantMapper[P10::class]!!, variantMapper[P11::class]!!), method).setAsCancellable(this, cancel)
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12>
    Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>.connectLambda(flags: Object.ConnectFlags
    = Object.ConnectFlags.DEFAULT, noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
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
) -> Unit): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      method.asCallable()
  )
  connector.connect(flags)
  return connector
}

@JvmSynthetic
public fun <T : Object, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>
    Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>.connectMethod(
  target: T,
  method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
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
  ) -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      MethodCallable(target, (method as KCallable<*>).name.toGodotName())
  )
  connector.connect(flags)
  return connector
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12>
    Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>.promise(noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
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
) -> Unit, noinline cancel: () -> Unit): Unit {
  LambdaContainer13<Unit, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>(VariantParser.NIL, arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!, variantMapper[P9::class]!!, variantMapper[P10::class]!!, variantMapper[P11::class]!!, variantMapper[P12::class]!!), method).setAsCancellable(this, cancel)
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13>
    Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>.connectLambda(flags: Object.ConnectFlags
    = Object.ConnectFlags.DEFAULT, noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
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
) -> Unit): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      method.asCallable()
  )
  connector.connect(flags)
  return connector
}

@JvmSynthetic
public fun <T : Object, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>
    Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>.connectMethod(
  target: T,
  method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
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
  ) -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      MethodCallable(target, (method as KCallable<*>).name.toGodotName())
  )
  connector.connect(flags)
  return connector
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13>
    Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>.promise(noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
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
) -> Unit, noinline cancel: () -> Unit): Unit {
  LambdaContainer14<Unit, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>(VariantParser.NIL, arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!, variantMapper[P9::class]!!, variantMapper[P10::class]!!, variantMapper[P11::class]!!, variantMapper[P12::class]!!, variantMapper[P13::class]!!), method).setAsCancellable(this, cancel)
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13,
    reified P14>
    Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>.connectLambda(flags: Object.ConnectFlags
    = Object.ConnectFlags.DEFAULT, noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
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
) -> Unit): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      method.asCallable()
  )
  connector.connect(flags)
  return connector
}

@JvmSynthetic
public fun <T : Object, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>
    Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>.connectMethod(
  target: T,
  method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
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
  ) -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      MethodCallable(target, (method as KCallable<*>).name.toGodotName())
  )
  connector.connect(flags)
  return connector
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13,
    reified P14>
    Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>.promise(noinline
    method: (
  p0: P0,
  p1: P1,
  p2: P2,
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
) -> Unit, noinline cancel: () -> Unit): Unit {
  LambdaContainer15<Unit, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>(VariantParser.NIL, arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!, variantMapper[P9::class]!!, variantMapper[P10::class]!!, variantMapper[P11::class]!!, variantMapper[P12::class]!!, variantMapper[P13::class]!!, variantMapper[P14::class]!!), method).setAsCancellable(this, cancel)
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13,
    reified P14, reified P15>
    Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>.connectLambda(flags: Object.ConnectFlags
    = Object.ConnectFlags.DEFAULT, noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
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
) -> Unit): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      method.asCallable()
  )
  connector.connect(flags)
  return connector
}

@JvmSynthetic
public fun <T : Object, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>
    Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>.connectMethod(
  target: T,
  method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
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
  ) -> Unit,
  flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT,
): SignalConnector {
  val connector = SignalConnector.createUnsafe(
      this, 
      MethodCallable(target, (method as KCallable<*>).name.toGodotName())
  )
  connector.connect(flags)
  return connector
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13,
    reified P14, reified P15>
    Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>.promise(noinline
    method: (
  p0: P0,
  p1: P1,
  p2: P2,
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
) -> Unit, noinline cancel: () -> Unit): Unit {
  LambdaContainer16<Unit, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>(VariantParser.NIL, arrayOf(variantMapper[P0::class]!!, variantMapper[P1::class]!!, variantMapper[P2::class]!!, variantMapper[P3::class]!!, variantMapper[P4::class]!!, variantMapper[P5::class]!!, variantMapper[P6::class]!!, variantMapper[P7::class]!!, variantMapper[P8::class]!!, variantMapper[P9::class]!!, variantMapper[P10::class]!!, variantMapper[P11::class]!!, variantMapper[P12::class]!!, variantMapper[P13::class]!!, variantMapper[P14::class]!!, variantMapper[P15::class]!!), method).setAsCancellable(this, cancel)
}
