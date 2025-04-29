package godot.tests.coroutine


import godot.api.Object
import godot.api.PackedScene
import godot.api.ResourceLoader
import godot.api.Timer
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.core.Vector2
import godot.core.signal0
import godot.core.signal1
import godot.core.signal4
import godot.coroutines.await
import godot.coroutines.awaitLoadAs
import godot.coroutines.awaitMainThread
import godot.coroutines.awaitPhysicsFrame
import godot.coroutines.awaitProcessFrame
import godot.coroutines.godotCoroutine
import godot.global.GD
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.delay

@RegisterClass
class CoroutineTest : Object() {

    @RegisterSignal
    val signalWithoutParameter by signal0()

    @RegisterSignal("int")
    val signalWithOneParameter by signal1<Int>()

    @RegisterSignal("int", "float", "vector2", "string")
    val signalWithManyParameters by signal4<Int, Float, Vector2, String>()

    @RegisterProperty
    var step: Int = 0

    @RegisterProperty
    var wasChildCancelled = false

    @RegisterProperty
    var wasParentCancelled = true

    @RegisterFunction
    fun startCoroutineWithoutParameter() = godotCoroutine {
        step = 1
        signalWithoutParameter.await()
        step = 2
    }

    @RegisterFunction
    fun startCoroutineWithOneParameter() = godotCoroutine {
        step = 3
        step = signalWithOneParameter.await()
    }

    @RegisterFunction
    fun startCoroutineWithManyParameters() = godotCoroutine {
        step = 5
        val (int, _, _, _) = signalWithManyParameters.await()
        step = int
    }

    @RegisterFunction
    fun startCoroutineUndispatched() = godotCoroutine(start = CoroutineStart.UNDISPATCHED) {
        step = 7
        signalWithoutParameter.await()
        step = 8
    }

    @RegisterFunction
    fun startCoroutineWithPhysicsFrame() = godotCoroutine(start = CoroutineStart.UNDISPATCHED) {
        step = 9
        awaitPhysicsFrame {
            step = 10
        }
    }

    @RegisterFunction
    fun startCoroutineWithProcessFrame() = godotCoroutine(start = CoroutineStart.UNDISPATCHED) {
        step = 11
        awaitProcessFrame {
            step = 12
        }
    }

    @RegisterSignal("is_test_successful")
    val runOnMainThreadFromBackgroundThreadFinished by signal1<Boolean>()

    @RegisterFunction
    fun runOnMainThreadFromBackgroundThread() {
        val thread = Thread.currentThread().name

        godotCoroutine {
            val bgThread = Thread.currentThread().name

            var fgThread = ""
            awaitMainThread {
                fgThread = Thread.currentThread().name
            }

            val bg2Thread = Thread.currentThread().name

            GD.print("Thread names: ${listOf(thread, bgThread, fgThread, bg2Thread).joinToString()}")

            awaitMainThread {
                runOnMainThreadFromBackgroundThreadFinished.emit(
                    thread != bgThread
                        && thread != bg2Thread
                        && bgThread != fgThread
                        && thread == fgThread // check that the code is run on the main thread
                )
            }
        }
    }

    @RegisterSignal("is_test_successful")
    val asyncLoadResourceFinished by signal1<Boolean>()

    @RegisterFunction
    fun asyncLoadResource() {
        godotCoroutine {
            val resource = ResourceLoader.awaitLoadAs<PackedScene>("res://Spatial.tscn")

            GD.print("Resource: $resource")

            awaitMainThread {
                asyncLoadResourceFinished.emit(resource != null)
            }
        }
    }

    @RegisterFunction
    fun cancelCoroutine() = godotCoroutine {
        val timer = Timer()
        timer.autostart = true
        val job = async {
            timer.start(3.0)
            timer.timeout.await()
        }
        delay(1000)
        timer.queueFree()
        delay(1000)
        wasChildCancelled = job.isCancelled
        wasParentCancelled = false
    }
}
