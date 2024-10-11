package godot.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

object GodotCoroutine : CoroutineScope {
    override val coroutineContext  = Dispatchers.Default + SupervisorJob()
}

fun godotCoroutine(context: CoroutineContext = Dispatchers.Default, start: CoroutineStart = CoroutineStart.DEFAULT, block: suspend CoroutineScope.() -> Unit) {
    GodotCoroutine.launch(context, start, block)
}
