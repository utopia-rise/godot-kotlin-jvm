package godot.coroutines

import godot.api.Engine
import godot.api.Object
import godot.api.SceneTree
import godot.api.WorkerThreadPool
import godot.core.asCallable
import godot.internal.memory.MemoryManager
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Runnable
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock
import kotlin.coroutines.CoroutineContext

object GodotDispatchers {

    val MainThread: CoroutineDispatcher = GodotMainThreadCoroutineDispatcher
    val ThreadPool: CoroutineDispatcher = GodotThreadPoolCoroutineDispatcher
    val ProcessFrame: CoroutineDispatcher = GodotProcessFrameCoroutineDispatcher
    val PhysicsFrame: CoroutineDispatcher = GodotPhysicsFrameCoroutineDispatcher

    private object GodotMainThreadCoroutineDispatcher : CoroutineDispatcher() {
        override fun dispatch(context: CoroutineContext, block: Runnable) {
            { block.run() }.asCallable().callDeferred()
        }
    }

    private object GodotThreadPoolCoroutineDispatcher : CoroutineDispatcher() {
        private const val MIN_SIZE = 64

        val lock = ReentrantLock()
        val currentTasks = HashMap<Runnable, Long>(MIN_SIZE)
        val terminatedTasks = ArrayList<Long>(MIN_SIZE)

        init {
            // Schedule to clear remaining tasks when Godot terminates..
            MemoryManager.registerCallback(true, ::clearCompletedTasks)
        }

        override fun dispatch(context: CoroutineContext, block: Runnable) {
            val callable = {
                try {
                    block.run()
                } finally {
                    lock.withLock {
                        val id = currentTasks.remove(block)!!
                        terminatedTasks.add(id)
                    }
                }
            }.asCallable()

            val taskID = WorkerThreadPool.addTask(callable)

            val tasksToClear = lock.withLock {
                currentTasks[block] = taskID
                terminatedTasks.toTypedArray().also {
                    terminatedTasks.clear()
                }
            }

            tasksToClear.forEach {
                /**
                 *  It's mandatory in Godot to call this method at some point after adding a task to clean up memory.
                 *  We cannot wait immediately after adding the task because it would block the thread doing the dispatching, but we can do it after the task has been confirmed completed.
                 *  It would also be wasteful to allocate a separate thread to poll and check task completions so instead we do process the list of complete tasks right after a regular dispatch.
                 */
                WorkerThreadPool.waitForTaskCompletion(it)
            }
        }


        private fun clearCompletedTasks() {
            // Warning, this method is only supposed to be called when Godot terminates!
            terminatedTasks.forEach {
                WorkerThreadPool.waitForTaskCompletion(it)
            }
            terminatedTasks.clear()
        }
    }

    private object GodotProcessFrameCoroutineDispatcher : CoroutineDispatcher() {
        override fun dispatch(context: CoroutineContext, block: Runnable) {
            sceneTree.processFrame.connectUnsafe(
                { block.run() }.asCallable(),
                Object.ConnectFlags.ONE_SHOT
            )
        }
    }

    private object GodotPhysicsFrameCoroutineDispatcher : CoroutineDispatcher() {
        override fun dispatch(context: CoroutineContext, block: Runnable) {
            sceneTree.physicsFrame.connectUnsafe(
                { block.run() }.asCallable(),
                Object.ConnectFlags.ONE_SHOT
            )
        }
    }

    private val sceneTree by lazy {
        val tree = Engine.getMainLoop()

        require(tree is SceneTree) {
            "Your main loop should be a scene tree to use ${GodotProcessFrameCoroutineDispatcher::class}."
        }

        return@lazy tree
    }
}
