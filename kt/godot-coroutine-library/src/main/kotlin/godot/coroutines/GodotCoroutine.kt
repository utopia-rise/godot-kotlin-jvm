package godot.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

object GodotCoroutine {
    private val scope = CoroutineScope(Dispatchers.Default)

    operator fun invoke(block: suspend CoroutineScope.() -> Unit) {
        scope.launch(start = CoroutineStart.UNDISPATCHED, block = block)
    }
}
