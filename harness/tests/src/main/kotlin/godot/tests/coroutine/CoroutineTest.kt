package godot.tests.coroutine


import godot.Object
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.core.Vector2
import godot.core.signal0
import godot.core.signal1
import godot.core.signal4
import godot.coroutines.GodotCoroutine
import godot.coroutines.await
import godot.coroutines.awaitDeferred
import godot.global.GD
import kotlinx.coroutines.CoroutineStart

@RegisterClass
class CoroutineTest : Object() {

    @RegisterSignal
    val signalWithoutParameter by signal0()

    @RegisterSignal
    val signalWithOneParameter by signal1<Int>("int")

    @RegisterSignal
    val signalWithManyParameters by signal4<Int, Float, Vector2, String>("int", "float", "vector2", "string")

    @RegisterProperty
    var step: Int = 0

    @RegisterFunction
    fun startCoroutineWithoutParameter() = GodotCoroutine {
        step = 1
        signalWithoutParameter.await()
        step = 2
    }

    @RegisterFunction
    fun startCoroutineWithOneParameter() = GodotCoroutine {
        step = 3
        step = signalWithOneParameter.await()
    }

    @RegisterFunction
    fun startCoroutineWithManyParameters() = GodotCoroutine {
        step = 5
        val (int, _, _, _) = signalWithManyParameters.await()
        step = int
    }

    @RegisterFunction
    fun startCoroutineUndispatched() = GodotCoroutine(start = CoroutineStart.UNDISPATCHED) {
        step = 7
        signalWithoutParameter.await()
        step = 8
    }

    @RegisterSignal
    val runOnMainThreadFromBackgroundThreadFinished by signal1<Boolean>("threadNames")

    @RegisterFunction
    fun runOnMainThreadFromBackgroundThread() {
        val thread = Thread.currentThread().name

        GodotCoroutine {
            val bgThread = Thread.currentThread().name

            var fgThread = ""
            awaitDeferred {
                fgThread = Thread.currentThread().name
            }

            val bg2Thread = Thread.currentThread().name

            GD.print("Thread names: ${listOf(thread, bgThread, fgThread, bg2Thread).joinToString()}")

            runOnMainThreadFromBackgroundThreadFinished.emit(
                thread != bgThread
                    && thread != bg2Thread
                    && bgThread != fgThread
                    && thread == fgThread // check that the code is run on the main thread
            )
        }
    }
}
