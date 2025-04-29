package godot.coroutines

import godot.api.Engine
import godot.api.Object
import godot.api.SceneTree
import godot.api.WorkerThreadPool
import godot.core.asCallable
import godot.core.callable0
import godot.core.connect
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
            { block.run() }.asCallable().callDeferred()
        }
    }

    private object GodotThreadPoolCoroutineDispatcher : CoroutineDispatcher() {
        override fun dispatch(context: CoroutineContext, block: Runnable) {
            WorkerThreadPool.addTask({ block.run() }.asCallable())
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
