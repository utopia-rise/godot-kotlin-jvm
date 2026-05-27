package godot.coroutines

import kotlinx.coroutines.withContext


/**
 * Suspends the current coroutine until the given block is executed on Godot's main thread.
 *
 * If the caller is already on the main thread, the block runs synchronously on the current stack.
 * Otherwise the block is posted to the main thread via `callDeferred` and runs at the end of the
 * current frame.
 *
 * Use it to call not-thread-safe Godot code and wait for its result.
 *
 * @param block the code block to execute on the main thread
 */
suspend inline fun <R> awaitMainThread(
    crossinline block: () -> R
): R = withContext(GodotDispatchers.MainThread) {
    block()
}
