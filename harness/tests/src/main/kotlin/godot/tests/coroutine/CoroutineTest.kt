package godot.tests.coroutine


import godot.annotation.RegisterClass
import godot.core.Dictionary
import godot.core.VariantArray
import godot.Object
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.core.Vector2
import godot.core.signal
import godot.coroutines.GodotCoroutine
import godot.coroutines.await

@RegisterClass
class CoroutineTest : Object() {

    @RegisterSignal
    val signalWithoutParameter by signal()

    @RegisterSignal
    val signalWithParameters by signal<Int, String>("int", "string")

    @RegisterSignal
    val signalWithManyParameters by signal<Int, Float, Vector2, String>("int", "float", "vector2", "string")

    @RegisterProperty
    var step: Int = 0

    @RegisterFunction
    fun startCoroutineWithoutParameter() = GodotCoroutine {
        step = 1
        signalWithoutParameter.await()
        step = 2
    }

    @RegisterFunction
    fun startCoroutineWithParameters() = GodotCoroutine {
        step = 3
        val (int, string) = signalWithParameters.await()
        step = int
    }

    @RegisterFunction
    fun startCoroutineWithManyParameters() = GodotCoroutine {
        step = 5
        val list = signalWithManyParameters.await()
        step = list[0] as Int
    }
}
