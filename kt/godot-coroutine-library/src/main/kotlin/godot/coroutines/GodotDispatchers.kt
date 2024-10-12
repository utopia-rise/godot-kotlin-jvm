package godot.coroutines

import godot.WorkerThreadPool
import godot.core.Callable
import godot.core.asCallable
import kotlinx.coroutines.CoroutineDispatcher
import kotlin.coroutines.CoroutineContext

object GodotDispatchers {

    val MainThread: CoroutineDispatcher = GodotMainThreadCoroutineDispatcher
    val ThreadPool: CoroutineDispatcher = GodotThreadPoolCoroutineDispatcher

    private object GodotMainThreadCoroutineDispatcher : CoroutineDispatcher() {
        override fun dispatch(context: CoroutineContext, block: Runnable) {
            Callable({ block.run() }.asCallable()).callDeferred()
        }
    }

    private object GodotThreadPoolCoroutineDispatcher : CoroutineDispatcher() {
        override fun dispatch(context: CoroutineContext, block: Runnable) {
            WorkerThreadPool.addTask({ block.run() }.asCallable())
        }
    }
}
