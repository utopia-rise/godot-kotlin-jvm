package godot.coroutines

import kotlinx.coroutines.withContext

suspend inline fun <R> awaitProcessFrame(
    crossinline block: () -> R
): R = withContext(GodotDispatchers.ProcessFrame) {
    block()
}

suspend inline fun <R> awaitPhysicsFrame(
    crossinline block: () -> R
): R = withContext(GodotDispatchers.PhysicsFrame) {
    block()
}
