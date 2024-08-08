@file:Suppress("PackageDirectoryMismatch")

package godot.signals

import godot.Object
import godot.core.Callable
import godot.core.GodotError
import godot.core.asStringName
import godot.core.callable.asCallable
import godot.util.camelToSnakeCase
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic
import kotlin.reflect.KCallable

public class Signal0(
  instance: Object,
  name: String,
) : Signal(instance, name) {
  public fun emit(): Unit {
    emitSignal()
  }

  public fun <T : Object> connect(
    target: T,
    method: T.() -> Unit,
    flags: Int = 0,
  ): GodotError =
      connect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()), flags)

  public fun <T : Object> disconnect(target: T, method: T.() -> Unit): Unit =
      disconnect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()))
}

public fun Signal0.connect(flags: Int = 0, method: () -> Unit): GodotError =
    connect(method.asCallable(), flags)

public fun signal(): SignalDelegateProvider<Signal0> = SignalDelegateProvider(::Signal0)

public class Signal1<P0>(
  instance: Object,
  name: String,
) : Signal(instance, name) {
  public fun emit(p0: P0): Unit {
    emitSignal(p0)
  }

  public fun <T : Object> connect(
    target: T,
    method: T.(p0: P0) -> Unit,
    flags: Int = 0,
  ): GodotError =
      connect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()), flags)

  public fun <T : Object> disconnect(target: T, method: T.(p0: P0) -> Unit): Unit =
      disconnect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()))
}

public inline fun <reified P0> Signal1<P0>.connect(flags: Int = 0, noinline
    method: (p0: P0) -> Unit): GodotError = connect(method.asCallable(), flags)

@Suppress("UNUSED_PARAMETER")
public fun <P0> signal(p0: String): SignalDelegateProvider<Signal1<P0>> =
    SignalDelegateProvider(::Signal1)

public class Signal2<P0, P1>(
  instance: Object,
  name: String,
) : Signal(instance, name) {
  public fun emit(p0: P0, p1: P1): Unit {
    emitSignal(p0, p1)
  }

  public fun <T : Object> connect(
    target: T,
    method: T.(p0: P0, p1: P1) -> Unit,
    flags: Int = 0,
  ): GodotError =
      connect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()), flags)

  public fun <T : Object> disconnect(target: T, method: T.(p0: P0, p1: P1) -> Unit): Unit =
      disconnect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()))
}

public inline fun <reified P0, reified P1> Signal2<P0, P1>.connect(flags: Int = 0, noinline
    method: (p0: P0, p1: P1) -> Unit): GodotError = connect(method.asCallable(), flags)

@Suppress("UNUSED_PARAMETER")
public fun <P0, P1> signal(p0: String, p1: String): SignalDelegateProvider<Signal2<P0, P1>> =
    SignalDelegateProvider(::Signal2)

public class Signal3<P0, P1, P2>(
  instance: Object,
  name: String,
) : Signal(instance, name) {
  public fun emit(
    p0: P0,
    p1: P1,
    p2: P2,
  ): Unit {
    emitSignal(p0, p1, p2)
  }

  public fun <T : Object> connect(
    target: T,
    method: T.(
      p0: P0,
      p1: P1,
      p2: P2,
    ) -> Unit,
    flags: Int = 0,
  ): GodotError =
      connect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()), flags)

  public fun <T : Object> disconnect(target: T, method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
  ) -> Unit): Unit =
      disconnect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()))
}

public inline fun <reified P0, reified P1, reified P2> Signal3<P0, P1, P2>.connect(flags: Int = 0,
    noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
) -> Unit): GodotError = connect(method.asCallable(), flags)

@Suppress("UNUSED_PARAMETER")
public fun <P0, P1, P2> signal(
  p0: String,
  p1: String,
  p2: String,
): SignalDelegateProvider<Signal3<P0, P1, P2>> = SignalDelegateProvider(::Signal3)

public class Signal4<P0, P1, P2, P3>(
  instance: Object,
  name: String,
) : Signal(instance, name) {
  public fun emit(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
  ): Unit {
    emitSignal(p0, p1, p2, p3)
  }

  public fun <T : Object> connect(
    target: T,
    method: T.(
      p0: P0,
      p1: P1,
      p2: P2,
      p3: P3,
    ) -> Unit,
    flags: Int = 0,
  ): GodotError =
      connect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()), flags)

  public fun <T : Object> disconnect(target: T, method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
  ) -> Unit): Unit =
      disconnect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()))
}

public inline fun <reified P0, reified P1, reified P2, reified P3>
    Signal4<P0, P1, P2, P3>.connect(flags: Int = 0, noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
) -> Unit): GodotError = connect(method.asCallable(), flags)

@Suppress("UNUSED_PARAMETER")
public fun <P0, P1, P2, P3> signal(
  p0: String,
  p1: String,
  p2: String,
  p3: String,
): SignalDelegateProvider<Signal4<P0, P1, P2, P3>> = SignalDelegateProvider(::Signal4)

public class Signal5<P0, P1, P2, P3, P4>(
  instance: Object,
  name: String,
) : Signal(instance, name) {
  public fun emit(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ): Unit {
    emitSignal(p0, p1, p2, p3, p4)
  }

  public fun <T : Object> connect(
    target: T,
    method: T.(
      p0: P0,
      p1: P1,
      p2: P2,
      p3: P3,
      p4: P4,
    ) -> Unit,
    flags: Int = 0,
  ): GodotError =
      connect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()), flags)

  public fun <T : Object> disconnect(target: T, method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
  ) -> Unit): Unit =
      disconnect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()))
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4>
    Signal5<P0, P1, P2, P3, P4>.connect(flags: Int = 0, noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
) -> Unit): GodotError = connect(method.asCallable(), flags)

@Suppress("UNUSED_PARAMETER")
public fun <P0, P1, P2, P3, P4> signal(
  p0: String,
  p1: String,
  p2: String,
  p3: String,
  p4: String,
): SignalDelegateProvider<Signal5<P0, P1, P2, P3, P4>> = SignalDelegateProvider(::Signal5)

public class Signal6<P0, P1, P2, P3, P4, P5>(
  instance: Object,
  name: String,
) : Signal(instance, name) {
  public fun emit(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ): Unit {
    emitSignal(p0, p1, p2, p3, p4, p5)
  }

  public fun <T : Object> connect(
    target: T,
    method: T.(
      p0: P0,
      p1: P1,
      p2: P2,
      p3: P3,
      p4: P4,
      p5: P5,
    ) -> Unit,
    flags: Int = 0,
  ): GodotError =
      connect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()), flags)

  public fun <T : Object> disconnect(target: T, method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
  ) -> Unit): Unit =
      disconnect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()))
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5>
    Signal6<P0, P1, P2, P3, P4, P5>.connect(flags: Int = 0, noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
) -> Unit): GodotError = connect(method.asCallable(), flags)

@Suppress("UNUSED_PARAMETER")
public fun <P0, P1, P2, P3, P4, P5> signal(
  p0: String,
  p1: String,
  p2: String,
  p3: String,
  p4: String,
  p5: String,
): SignalDelegateProvider<Signal6<P0, P1, P2, P3, P4, P5>> = SignalDelegateProvider(::Signal6)

public class Signal7<P0, P1, P2, P3, P4, P5, P6>(
  instance: Object,
  name: String,
) : Signal(instance, name) {
  public fun emit(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ): Unit {
    emitSignal(p0, p1, p2, p3, p4, p5, p6)
  }

  public fun <T : Object> connect(
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
    flags: Int = 0,
  ): GodotError =
      connect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()), flags)

  public fun <T : Object> disconnect(target: T, method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
  ) -> Unit): Unit =
      disconnect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()))
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6> Signal7<P0, P1, P2, P3, P4, P5, P6>.connect(flags: Int = 0, noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
) -> Unit): GodotError = connect(method.asCallable(), flags)

@Suppress("UNUSED_PARAMETER")
public fun <P0, P1, P2, P3, P4, P5, P6> signal(
  p0: String,
  p1: String,
  p2: String,
  p3: String,
  p4: String,
  p5: String,
  p6: String,
): SignalDelegateProvider<Signal7<P0, P1, P2, P3, P4, P5, P6>> = SignalDelegateProvider(::Signal7)

public class Signal8<P0, P1, P2, P3, P4, P5, P6, P7>(
  instance: Object,
  name: String,
) : Signal(instance, name) {
  public fun emit(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ): Unit {
    emitSignal(p0, p1, p2, p3, p4, p5, p6, p7)
  }

  public fun <T : Object> connect(
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
    flags: Int = 0,
  ): GodotError =
      connect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()), flags)

  public fun <T : Object> disconnect(target: T, method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
  ) -> Unit): Unit =
      disconnect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()))
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7> Signal8<P0, P1, P2, P3, P4, P5, P6, P7>.connect(flags: Int = 0, noinline
    method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
  p7: P7,
) -> Unit): GodotError = connect(method.asCallable(), flags)

@Suppress("UNUSED_PARAMETER")
public fun <P0, P1, P2, P3, P4, P5, P6, P7> signal(
  p0: String,
  p1: String,
  p2: String,
  p3: String,
  p4: String,
  p5: String,
  p6: String,
  p7: String,
): SignalDelegateProvider<Signal8<P0, P1, P2, P3, P4, P5, P6, P7>> =
    SignalDelegateProvider(::Signal8)

public class Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8>(
  instance: Object,
  name: String,
) : Signal(instance, name) {
  public fun emit(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ): Unit {
    emitSignal(p0, p1, p2, p3, p4, p5, p6, p7, p8)
  }

  public fun <T : Object> connect(
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
    flags: Int = 0,
  ): GodotError =
      connect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()), flags)

  public fun <T : Object> disconnect(target: T, method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
  ) -> Unit): Unit =
      disconnect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()))
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8> Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8>.connect(flags: Int = 0,
    noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
  p7: P7,
  p8: P8,
) -> Unit): GodotError = connect(method.asCallable(), flags)

@Suppress("UNUSED_PARAMETER")
public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8> signal(
  p0: String,
  p1: String,
  p2: String,
  p3: String,
  p4: String,
  p5: String,
  p6: String,
  p7: String,
  p8: String,
): SignalDelegateProvider<Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8>> =
    SignalDelegateProvider(::Signal9)

public class Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(
  instance: Object,
  name: String,
) : Signal(instance, name) {
  public fun emit(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ): Unit {
    emitSignal(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)
  }

  public fun <T : Object> connect(
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
    flags: Int = 0,
  ): GodotError =
      connect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()), flags)

  public fun <T : Object> disconnect(target: T, method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
  ) -> Unit): Unit =
      disconnect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()))
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9>
    Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>.connect(flags: Int = 0, noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
  p7: P7,
  p8: P8,
  p9: P9,
) -> Unit): GodotError = connect(method.asCallable(), flags)

@Suppress("UNUSED_PARAMETER")
public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> signal(
  p0: String,
  p1: String,
  p2: String,
  p3: String,
  p4: String,
  p5: String,
  p6: String,
  p7: String,
  p8: String,
  p9: String,
): SignalDelegateProvider<Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>> =
    SignalDelegateProvider(::Signal10)

public class Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(
  instance: Object,
  name: String,
) : Signal(instance, name) {
  public fun emit(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ): Unit {
    emitSignal(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)
  }

  public fun <T : Object> connect(
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
    flags: Int = 0,
  ): GodotError =
      connect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()), flags)

  public fun <T : Object> disconnect(target: T, method: T.(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
  ) -> Unit): Unit =
      disconnect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()))
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10>
    Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>.connect(flags: Int = 0, noinline method: (
  p0: P0,
  p1: P1,
  p2: P2,
  p3: P3,
  p4: P4,
  p5: P5,
  p6: P6,
  p7: P7,
  p8: P8,
  p9: P9,
  p10: P10,
) -> Unit): GodotError = connect(method.asCallable(), flags)

@Suppress("UNUSED_PARAMETER")
public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> signal(
  p0: String,
  p1: String,
  p2: String,
  p3: String,
  p4: String,
  p5: String,
  p6: String,
  p7: String,
  p8: String,
  p9: String,
  p10: String,
): SignalDelegateProvider<Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>> =
    SignalDelegateProvider(::Signal11)

public class Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(
  instance: Object,
  name: String,
) : Signal(instance, name) {
  public fun emit(
    p0: P0,
    p1: P1,
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
  ): Unit {
    emitSignal(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)
  }

  public fun <T : Object> connect(
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
    flags: Int = 0,
  ): GodotError =
      connect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()), flags)

  public fun <T : Object> disconnect(target: T, method: T.(
    p0: P0,
    p1: P1,
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
  ) -> Unit): Unit =
      disconnect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()))
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11>
    Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>.connect(flags: Int = 0, noinline
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
) -> Unit): GodotError = connect(method.asCallable(), flags)

@Suppress("UNUSED_PARAMETER")
public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> signal(
  p0: String,
  p1: String,
  p2: String,
  p3: String,
  p4: String,
  p5: String,
  p6: String,
  p7: String,
  p8: String,
  p9: String,
  p10: String,
  p11: String,
): SignalDelegateProvider<Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>> =
    SignalDelegateProvider(::Signal12)

public class Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>(
  instance: Object,
  name: String,
) : Signal(instance, name) {
  public fun emit(
    p0: P0,
    p1: P1,
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
  ): Unit {
    emitSignal(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)
  }

  public fun <T : Object> connect(
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
    flags: Int = 0,
  ): GodotError =
      connect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()), flags)

  public fun <T : Object> disconnect(target: T, method: T.(
    p0: P0,
    p1: P1,
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
  ) -> Unit): Unit =
      disconnect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()))
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12>
    Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>.connect(flags: Int = 0, noinline
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
) -> Unit): GodotError = connect(method.asCallable(), flags)

@Suppress("UNUSED_PARAMETER")
public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> signal(
  p0: String,
  p1: String,
  p2: String,
  p3: String,
  p4: String,
  p5: String,
  p6: String,
  p7: String,
  p8: String,
  p9: String,
  p10: String,
  p11: String,
  p12: String,
): SignalDelegateProvider<Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>> =
    SignalDelegateProvider(::Signal13)

public class Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>(
  instance: Object,
  name: String,
) : Signal(instance, name) {
  public fun emit(
    p0: P0,
    p1: P1,
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
  ): Unit {
    emitSignal(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)
  }

  public fun <T : Object> connect(
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
    flags: Int = 0,
  ): GodotError =
      connect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()), flags)

  public fun <T : Object> disconnect(target: T, method: T.(
    p0: P0,
    p1: P1,
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
  ) -> Unit): Unit =
      disconnect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()))
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13>
    Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>.connect(flags: Int = 0,
    noinline method: (
  p0: P0,
  p1: P1,
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
) -> Unit): GodotError = connect(method.asCallable(), flags)

@Suppress("UNUSED_PARAMETER")
public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> signal(
  p0: String,
  p1: String,
  p2: String,
  p3: String,
  p4: String,
  p5: String,
  p6: String,
  p7: String,
  p8: String,
  p9: String,
  p10: String,
  p11: String,
  p12: String,
  p13: String,
): SignalDelegateProvider<Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>> =
    SignalDelegateProvider(::Signal14)

public class Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>(
  instance: Object,
  name: String,
) : Signal(instance, name) {
  public fun emit(
    p0: P0,
    p1: P1,
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
  ): Unit {
    emitSignal(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14)
  }

  public fun <T : Object> connect(
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
    flags: Int = 0,
  ): GodotError =
      connect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()), flags)

  public fun <T : Object> disconnect(target: T, method: T.(
    p0: P0,
    p1: P1,
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
  ) -> Unit): Unit =
      disconnect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()))
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13,
    reified P14>
    Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>.connect(flags: Int =
    0, noinline method: (
  p0: P0,
  p1: P1,
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
) -> Unit): GodotError = connect(method.asCallable(), flags)

@Suppress("UNUSED_PARAMETER")
public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> signal(
  p0: String,
  p1: String,
  p2: String,
  p3: String,
  p4: String,
  p5: String,
  p6: String,
  p7: String,
  p8: String,
  p9: String,
  p10: String,
  p11: String,
  p12: String,
  p13: String,
  p14: String,
): SignalDelegateProvider<Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>>
    = SignalDelegateProvider(::Signal15)

public class Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>(
  instance: Object,
  name: String,
) : Signal(instance, name) {
  public fun emit(
    p0: P0,
    p1: P1,
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
  ): Unit {
    emitSignal(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)
  }

  public fun <T : Object> connect(
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
    flags: Int = 0,
  ): GodotError =
      connect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()), flags)

  public fun <T : Object> disconnect(target: T, method: T.(
    p0: P0,
    p1: P1,
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
  ) -> Unit): Unit =
      disconnect(Callable(target, (method as KCallable<*>).name.camelToSnakeCase().asStringName()))
}

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
    P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13,
    reified P14, reified P15>
    Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>.connect(flags: Int
    = 0, noinline method: (
  p0: P0,
  p1: P1,
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
) -> Unit): GodotError = connect(method.asCallable(), flags)

@Suppress("UNUSED_PARAMETER")
public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15> signal(
  p0: String,
  p1: String,
  p2: String,
  p3: String,
  p4: String,
  p5: String,
  p6: String,
  p7: String,
  p8: String,
  p9: String,
  p10: String,
  p11: String,
  p12: String,
  p13: String,
  p14: String,
  p15: String,
):
    SignalDelegateProvider<Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>>
    = SignalDelegateProvider(::Signal16)

public object SignalProvider {
  @JvmStatic
  public fun signal(thisRef: Object, name: String): Signal0 = Signal0(thisRef, name)

  @Suppress("UNUSED_PARAMETER")
  @JvmStatic
  public fun <P0> signal(
    thisRef: Object,
    name: String,
    p0: String,
  ): Signal1<P0> = Signal1<P0>(thisRef, name)

  @Suppress("UNUSED_PARAMETER")
  @JvmStatic
  public fun <P0, P1> signal(
    thisRef: Object,
    name: String,
    p0: String,
    p1: String,
  ): Signal2<P0, P1> = Signal2<P0, P1>(thisRef, name)

  @Suppress("UNUSED_PARAMETER")
  @JvmStatic
  public fun <P0, P1, P2> signal(
    thisRef: Object,
    name: String,
    p0: String,
    p1: String,
    p2: String,
  ): Signal3<P0, P1, P2> = Signal3<P0, P1, P2>(thisRef, name)

  @Suppress("UNUSED_PARAMETER")
  @JvmStatic
  public fun <P0, P1, P2, P3> signal(
    thisRef: Object,
    name: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
  ): Signal4<P0, P1, P2, P3> = Signal4<P0, P1, P2, P3>(thisRef, name)

  @Suppress("UNUSED_PARAMETER")
  @JvmStatic
  public fun <P0, P1, P2, P3, P4> signal(
    thisRef: Object,
    name: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
  ): Signal5<P0, P1, P2, P3, P4> = Signal5<P0, P1, P2, P3, P4>(thisRef, name)

  @Suppress("UNUSED_PARAMETER")
  @JvmStatic
  public fun <P0, P1, P2, P3, P4, P5> signal(
    thisRef: Object,
    name: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
  ): Signal6<P0, P1, P2, P3, P4, P5> = Signal6<P0, P1, P2, P3, P4, P5>(thisRef, name)

  @Suppress("UNUSED_PARAMETER")
  @JvmStatic
  public fun <P0, P1, P2, P3, P4, P5, P6> signal(
    thisRef: Object,
    name: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
  ): Signal7<P0, P1, P2, P3, P4, P5, P6> = Signal7<P0, P1, P2, P3, P4, P5, P6>(thisRef, name)

  @Suppress("UNUSED_PARAMETER")
  @JvmStatic
  public fun <P0, P1, P2, P3, P4, P5, P6, P7> signal(
    thisRef: Object,
    name: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
  ): Signal8<P0, P1, P2, P3, P4, P5, P6, P7> =
      Signal8<P0, P1, P2, P3, P4, P5, P6, P7>(thisRef, name)

  @Suppress("UNUSED_PARAMETER")
  @JvmStatic
  public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8> signal(
    thisRef: Object,
    name: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
  ): Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8> =
      Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8>(thisRef, name)

  @Suppress("UNUSED_PARAMETER")
  @JvmStatic
  public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> signal(
    thisRef: Object,
    name: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
    p9: String,
  ): Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> =
      Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(thisRef, name)

  @Suppress("UNUSED_PARAMETER")
  @JvmStatic
  public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> signal(
    thisRef: Object,
    name: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
    p9: String,
    p10: String,
  ): Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> =
      Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(thisRef, name)

  @Suppress("UNUSED_PARAMETER")
  @JvmStatic
  public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> signal(
    thisRef: Object,
    name: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
    p9: String,
    p10: String,
    p11: String,
  ): Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> =
      Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(thisRef, name)

  @Suppress("UNUSED_PARAMETER")
  @JvmStatic
  public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> signal(
    thisRef: Object,
    name: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
    p9: String,
    p10: String,
    p11: String,
    p12: String,
  ): Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> =
      Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>(thisRef, name)

  @Suppress("UNUSED_PARAMETER")
  @JvmStatic
  public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> signal(
    thisRef: Object,
    name: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
    p9: String,
    p10: String,
    p11: String,
    p12: String,
    p13: String,
  ): Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> =
      Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>(thisRef, name)

  @Suppress("UNUSED_PARAMETER")
  @JvmStatic
  public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> signal(
    thisRef: Object,
    name: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
    p9: String,
    p10: String,
    p11: String,
    p12: String,
    p13: String,
    p14: String,
  ): Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> =
      Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>(thisRef, name)

  @Suppress("UNUSED_PARAMETER")
  @JvmStatic
  public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15> signal(
    thisRef: Object,
    name: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
    p9: String,
    p10: String,
    p11: String,
    p12: String,
    p13: String,
    p14: String,
    p15: String,
  ): Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15> =
      Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>(thisRef, name)
}
