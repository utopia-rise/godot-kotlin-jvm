package godot.coroutines

import godot.core.Callable
import godot.core.asCallable
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume


/**
 * Suspends the current coroutine until the given block is executed.
 *
 * The block will be executed at the end of the frame on the main thread.
 *
 * Use it to call not thread safe code from godot and wait for the execution of it.
 *
 * @param block the code block to execute at the end of the frame
 */
public suspend inline fun <R> awaitDeferred(
    crossinline block: () -> R
): R = suspendCancellableCoroutine { continuation ->
    Callable(
        {
            if (continuation.isActive) {
                continuation.resume(block())
            }
        }.asCallable()
    ).callDeferred()
}
