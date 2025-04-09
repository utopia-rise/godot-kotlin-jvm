package godot.coroutines

import godot.api.Engine
import godot.api.Object
import godot.api.SceneTree
import godot.api.WorkerThreadPool
import godot.core.asCallable
import godot.core.callable0
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Runnable
import kotlinx.coroutines.cancel
import kotlin.coroutines.CoroutineContext

object GodotDispatchers {

    val MainThread: CoroutineDispatcher = GodotMainThreadCoroutineDispatcher
    val ThreadPool: CoroutineDispatcher = GodotThreadPoolCoroutineDispatcher
    val ProcessFrame: CoroutineDispatcher = GodotProcessFrameCoroutineDispatcher
    val PhysicsFrame: CoroutineDispatcher = GodotPhysicsFrameCoroutineDispatcher

    private object GodotMainThreadCoroutineDispatcher : CoroutineDispatcher() {
        override fun dispatch(context: CoroutineContext, block: Runnable) {
            { block.run() }.asCallable().setAsCancellable { context.cancel() }.unsafeCallDeferred()
        }
    }

    private object GodotThreadPoolCoroutineDispatcher : CoroutineDispatcher() {
        override fun dispatch(context: CoroutineContext, block: Runnable) {
            WorkerThreadPool.addTask({ block.run() }.asCallable())
        }
    }

    private object GodotProcessFrameCoroutineDispatcher : CoroutineDispatcher() {
        override fun dispatch(context: CoroutineContext, block: Runnable) {
            sceneTree.processFrame.connect(
                { block.run() }.asCallable(),
                Object.ConnectFlags.ONE_SHOT.id.toInt()
            )
        }
    }

    private object GodotPhysicsFrameCoroutineDispatcher : CoroutineDispatcher() {
        override fun dispatch(context: CoroutineContext, block: Runnable) {
            sceneTree.physicsFrame.connect(
                { block.run() }.asCallable(),
                Object.ConnectFlags.ONE_SHOT.id.toInt()
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
