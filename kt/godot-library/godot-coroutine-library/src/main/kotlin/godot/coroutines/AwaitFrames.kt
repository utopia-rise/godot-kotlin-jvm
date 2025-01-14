package godot.coroutines

import kotlinx.coroutines.async

suspend inline fun <R> awaitProcessFrame(
    crossinline block: () -> R
): R {
    val job = GodotCoroutine.async(GodotDispatchers.ProcessFrame) {
        block()
    }
    return job.await()
}

suspend inline fun <R> awaitPhysicsFrame(
    crossinline block: () -> R
): R {
    val job = GodotCoroutine.async(GodotDispatchers.PhysicsFrame) {
        block()
    }

    return job.await()
}
