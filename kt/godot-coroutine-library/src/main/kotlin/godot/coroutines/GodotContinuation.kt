package godot.coroutines

import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext

class GodotContinuation(override val context: CoroutineContext): Continuation<Unit> {

    override fun resumeWith(result: Result<Unit>) {
        TODO("Not yet implemented")
    }


    private object Bridge {
        external fun engine_call_constructor(): VoidPtr
    }
}
