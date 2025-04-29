package godot.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

object GodotCoroutine : CoroutineScope {
    override val coroutineContext = GodotDispatchers.ThreadPool + SupervisorJob()
}

fun godotCoroutine(
    context: CoroutineContext = EmptyCoroutineContext,
    start: CoroutineStart = CoroutineStart.DEFAULT,
    block: suspend CoroutineScope.() -> Unit
) {
    GodotCoroutine.launch(context, start, block)
}
