@file:Suppress("PackageDirectoryMismatch", "unused")

package godot.coroutines

import godot.Object
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
import godot.core.connect
import kotlin.Any
import kotlin.Pair
import kotlin.Suppress
import kotlin.Triple
import kotlin.Unit
import kotlin.collections.List
import kotlin.coroutines.resume
import kotlinx.coroutines.CancellableContinuation
import kotlinx.coroutines.suspendCancellableCoroutine

public suspend inline fun Signal0.await(): Unit = suspendCancellableCoroutine { cont:
    CancellableContinuation<Unit> ->
  connect(Object.ConnectFlags.CONNECT_ONE_SHOT.id.toInt()) {  ->
    cont.resume(Unit)
  }
}

public suspend inline fun <reified P0> Signal1<P0>.await(): P0 = suspendCancellableCoroutine { cont:
    CancellableContinuation<P0> ->
  connect(Object.ConnectFlags.CONNECT_ONE_SHOT.id.toInt()) { p0 ->
    cont.resume(p0)
  }
}

public suspend inline fun <reified P0, reified P1> Signal2<P0, P1>.await(): Pair<P0, P1> =
    suspendCancellableCoroutine { cont: CancellableContinuation<Pair<P0, P1>> ->
  connect(Object.ConnectFlags.CONNECT_ONE_SHOT.id.toInt()) { p0, p1 ->
    cont.resume(Pair(p0, p1))
  }
}

public suspend inline fun <reified P0, reified P1, reified P2> Signal3<P0, P1, P2>.await():
    Triple<P0, P1, P2> = suspendCancellableCoroutine { cont:
    CancellableContinuation<Triple<P0, P1, P2>> ->
  connect(Object.ConnectFlags.CONNECT_ONE_SHOT.id.toInt()) { p0, p1, p2 ->
    cont.resume(Triple(p0, p1, p2))
  }
}

public suspend inline fun <reified P0, reified P1, reified P2, reified P3>
    Signal4<P0, P1, P2, P3>.await(): List<Any?> = suspendCancellableCoroutine { cont:
    CancellableContinuation<List<Any?>> ->
  connect(Object.ConnectFlags.CONNECT_ONE_SHOT.id.toInt()) { p0, p1, p2, p3 ->
    cont.resume(listOf(p0, p1, p2, p3))
  }
}

public suspend inline fun <reified P0, reified P1, reified P2, reified P3, reified P4>
    Signal5<P0, P1, P2, P3, P4>.await(): List<Any?> = suspendCancellableCoroutine { cont:
    CancellableContinuation<List<Any?>> ->
  connect(Object.ConnectFlags.CONNECT_ONE_SHOT.id.toInt()) { p0, p1, p2, p3, p4 ->
    cont.resume(listOf(p0, p1, p2, p3, p4))
  }
}

public suspend inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5>
    Signal6<P0, P1, P2, P3, P4, P5>.await(): List<Any?> = suspendCancellableCoroutine { cont:
    CancellableContinuation<List<Any?>> ->
  connect(Object.ConnectFlags.CONNECT_ONE_SHOT.id.toInt()) { p0, p1, p2, p3, p4, p5 ->
    cont.resume(listOf(p0, p1, p2, p3, p4, p5))
  }
}

public suspend inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5,
    reified P6> Signal7<P0, P1, P2, P3, P4, P5, P6>.await(): List<Any?> =
    suspendCancellableCoroutine { cont: CancellableContinuation<List<Any?>> ->
  connect(Object.ConnectFlags.CONNECT_ONE_SHOT.id.toInt()) { p0, p1, p2, p3, p4, p5, p6 ->
    cont.resume(listOf(p0, p1, p2, p3, p4, p5, p6))
  }
}

public suspend inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5,
    reified P6, reified P7> Signal8<P0, P1, P2, P3, P4, P5, P6, P7>.await(): List<Any?> =
    suspendCancellableCoroutine { cont: CancellableContinuation<List<Any?>> ->
  connect(Object.ConnectFlags.CONNECT_ONE_SHOT.id.toInt()) { p0, p1, p2, p3, p4, p5, p6, p7 ->
    cont.resume(listOf(p0, p1, p2, p3, p4, p5, p6, p7))
  }
}

public suspend inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5,
    reified P6, reified P7, reified P8> Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8>.await():
    List<Any?> = suspendCancellableCoroutine { cont: CancellableContinuation<List<Any?>> ->
  connect(Object.ConnectFlags.CONNECT_ONE_SHOT.id.toInt()) { p0, p1, p2, p3, p4, p5, p6, p7, p8 ->
    cont.resume(listOf(p0, p1, p2, p3, p4, p5, p6, p7, p8))
  }
}

public suspend inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5,
    reified P6, reified P7, reified P8, reified P9>
    Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>.await(): List<Any?> =
    suspendCancellableCoroutine { cont: CancellableContinuation<List<Any?>> ->
  connect(Object.ConnectFlags.CONNECT_ONE_SHOT.id.toInt()) { p0, p1, p2, p3, p4, p5, p6, p7, p8,
      p9 ->
    cont.resume(listOf(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9))
  }
}

public suspend inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5,
    reified P6, reified P7, reified P8, reified P9, reified P10>
    Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>.await(): List<Any?> =
    suspendCancellableCoroutine { cont: CancellableContinuation<List<Any?>> ->
  connect(Object.ConnectFlags.CONNECT_ONE_SHOT.id.toInt()) { p0, p1, p2, p3, p4, p5, p6, p7, p8, p9,
      p10 ->
    cont.resume(listOf(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10))
  }
}

public suspend inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5,
    reified P6, reified P7, reified P8, reified P9, reified P10, reified P11>
    Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>.await(): List<Any?> =
    suspendCancellableCoroutine { cont: CancellableContinuation<List<Any?>> ->
  connect(Object.ConnectFlags.CONNECT_ONE_SHOT.id.toInt()) { p0, p1, p2, p3, p4, p5, p6, p7, p8, p9,
      p10, p11 ->
    cont.resume(listOf(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11))
  }
}

public suspend inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5,
    reified P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12>
    Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>.await(): List<Any?> =
    suspendCancellableCoroutine { cont: CancellableContinuation<List<Any?>> ->
  connect(Object.ConnectFlags.CONNECT_ONE_SHOT.id.toInt()) { p0, p1, p2, p3, p4, p5, p6, p7, p8, p9,
      p10, p11, p12 ->
    cont.resume(listOf(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12))
  }
}

public suspend inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5,
    reified P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified
    P13> Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>.await(): List<Any?> =
    suspendCancellableCoroutine { cont: CancellableContinuation<List<Any?>> ->
  connect(Object.ConnectFlags.CONNECT_ONE_SHOT.id.toInt()) { p0, p1, p2, p3, p4, p5, p6, p7, p8, p9,
      p10, p11, p12, p13 ->
    cont.resume(listOf(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13))
  }
}

public suspend inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5,
    reified P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified
    P13, reified P14>
    Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>.await(): List<Any?> =
    suspendCancellableCoroutine { cont: CancellableContinuation<List<Any?>> ->
  connect(Object.ConnectFlags.CONNECT_ONE_SHOT.id.toInt()) { p0, p1, p2, p3, p4, p5, p6, p7, p8, p9,
      p10, p11, p12, p13, p14 ->
    cont.resume(listOf(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14))
  }
}

public suspend inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5,
    reified P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified
    P13, reified P14, reified P15>
    Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>.await():
    List<Any?> = suspendCancellableCoroutine { cont: CancellableContinuation<List<Any?>> ->
  connect(Object.ConnectFlags.CONNECT_ONE_SHOT.id.toInt()) { p0, p1, p2, p3, p4, p5, p6, p7, p8, p9,
      p10, p11, p12, p13, p14, p15 ->
    cont.resume(listOf(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15))
  }
}
