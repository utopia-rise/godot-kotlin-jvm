package godot.tests.coroutine


import godot.Object
import godot.PackedScene
import godot.ResourceLoader
import godot.annotation.GodotMember
import godot.annotation.GodotScript
import godot.core.Vector2
import godot.core.signal0
import godot.core.signal1
import godot.core.signal4
import godot.coroutines.await
import godot.coroutines.awaitLoadAs
import godot.coroutines.awaitMainThread
import godot.coroutines.godotCoroutine
import godot.coroutines.awaitPhysicsFrame
import godot.coroutines.awaitProcessFrame
import godot.coroutines.godotCoroutine
import godot.global.GD
import kotlinx.coroutines.CoroutineStart

@GodotScript
class CoroutineTest : Object() {

    val signalWithoutParameter by signal0()

    val signalWithOneParameter by signal1<Int>("int")

    val signalWithManyParameters by signal4<Int, Float, Vector2, String>("int", "float", "vector2", "string")

    @GodotMember
    var step: Int = 0

    @GodotMember
    fun startCoroutineWithoutParameter() = godotCoroutine {
        step = 1
        signalWithoutParameter.await()
        step = 2
    }

    @GodotMember
    fun startCoroutineWithOneParameter() = godotCoroutine {
        step = 3
        step = signalWithOneParameter.await()
    }

    @GodotMember
    fun startCoroutineWithManyParameters() = godotCoroutine {
        step = 5
        val (int, _, _, _) = signalWithManyParameters.await()
        step = int
    }

    @GodotMember
    fun startCoroutineUndispatched() = godotCoroutine(start = CoroutineStart.UNDISPATCHED) {
        step = 7
        signalWithoutParameter.await()
        step = 8
    }

    @GodotMember
    fun startCoroutineWithPhysicsFrame() = godotCoroutine(start = CoroutineStart.UNDISPATCHED) {
        step = 9
        awaitPhysicsFrame {
            step = 10
        }
    }

    @GodotMember
    fun startCoroutineWithProcessFrame() = godotCoroutine(start = CoroutineStart.UNDISPATCHED) {
        step = 11
        awaitProcessFrame {
            step = 12
        }
    }

    @RegisterSignal
    val runOnMainThreadFromBackgroundThreadFinished by signal1<Boolean>("is_test_successful")

    @GodotMember
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

    val asyncLoadResourceFinished by signal1<Boolean>("is_test_successful")

    @GodotMember
    fun asyncLoadResource() {
        godotCoroutine {
            val resource = ResourceLoader.awaitLoadAs<PackedScene>("res://Spatial.tscn") { progress ->
                GD.print("Resource load progress: $progress")
            }

            GD.print("Resource: $resource")

            awaitMainThread {
                asyncLoadResourceFinished.emit(resource != null)
            }
        }
    }
}
