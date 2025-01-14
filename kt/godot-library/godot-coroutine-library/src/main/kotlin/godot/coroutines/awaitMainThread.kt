package godot.coroutines

import kotlinx.coroutines.async


/**
 * Suspends the current coroutine until the given block is executed.
 *
 * The block will be executed at the end of the frame on the main thread.
 *
 * Use it to call not thread safe code from godot and wait for the execution of it.
 *
 * @param block the code block to execute at the end of the frame
 */
suspend inline fun <R> awaitMainThread(
    crossinline block: () -> R
): R {
    val job = GodotCoroutine.async(GodotDispatchers.MainThread) {
        block()
    }
    return job.await()
}
