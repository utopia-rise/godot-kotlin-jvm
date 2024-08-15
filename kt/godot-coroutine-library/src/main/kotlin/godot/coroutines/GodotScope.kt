package godot.coroutines

import godot.signals.Signal
import kotlinx.coroutines.delay

suspend fun Signal.await() {
    delay(1000)
}

