package godot.core

class SignalHandle internal constructor(
    private val signal: Signal,
    private val callable: Callable,
) {
    fun connect(flags: Int = 0): Error = signal.connect(callable, flags)
    fun disconnect(): Unit = signal.disconnect(callable)
    fun isConnected(): Boolean = signal.isConnected(callable)
    fun isValid(): Boolean = signal.isValid()
}
