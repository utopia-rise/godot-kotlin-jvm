package godot.coroutines

import godot.Object
import godot.signals.Signal0
import godot.signals.connect

import kotlinx.coroutines.CancellableContinuation
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume


suspend fun Signal0.await() {
    return suspendCancellableCoroutine { cont: CancellableContinuation<Unit> ->
            connect(Object.ConnectFlags.CONNECT_ONE_SHOT.id.toInt()){
                cont.resume(Unit)
            }
    }
}

