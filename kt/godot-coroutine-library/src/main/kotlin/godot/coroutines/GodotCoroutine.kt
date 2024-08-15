package godot.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.coroutines.EmptyCoroutineContext

object GodotCoroutine {
    private val scope = CoroutineScope(EmptyCoroutineContext)

    operator fun invoke( block: suspend CoroutineScope.() -> Unit) {
        scope.launch(Dispatchers.Unconfined, CoroutineStart.DEFAULT, block)
    }
}
