package godot.coroutines

import godot.Object
import godot.core.Signal0
import godot.core.connect

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

