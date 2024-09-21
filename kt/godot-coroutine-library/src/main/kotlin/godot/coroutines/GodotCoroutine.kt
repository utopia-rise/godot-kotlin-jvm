package godot.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

object GodotCoroutine {
    private val scope = CoroutineScope(Dispatchers.Default + SupervisorJob())

    operator fun invoke(context: CoroutineContext = Dispatchers.Default, start: CoroutineStart = CoroutineStart.DEFAULT, block: suspend CoroutineScope.() -> Unit) {
        scope.launch(context, start, block)
    }
}
