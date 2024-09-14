package godot.tests.coroutine


import godot.annotation.RegisterClass
import godot.core.Dictionary
import godot.core.VariantArray
import godot.Object
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.core.signal
import godot.coroutines.GodotCoroutine
import godot.coroutines.await

@RegisterClass
class CoroutineTest: Object() {

    @RegisterSignal
    val signalWithoutParameter by signal()

    @RegisterSignal
    val signalWithParameters by signal<Int, String>("int", "string")

    @RegisterProperty
    var int: Int = 0

    @RegisterFunction
    fun startCoroutineWithoutParameter() = GodotCoroutine{
        signalWithoutParameter.await()
        int = 1
    }

    @RegisterFunction
    fun startCoroutineWithParameters() = GodotCoroutine{
        signalWithParameters.await()
        int = 2
    }
}
