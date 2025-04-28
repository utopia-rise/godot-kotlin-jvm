@file:Suppress("PackageDirectoryMismatch")

package godot.core

import godot.api.Object.ConnectFlags
import godot.core.Callable
import godot.core.Error

class SignalConnector (
    private val signal: Signal,
    private val callable: Callable,
) {
    fun connect(flags: ConnectFlags = ConnectFlags.PERSIST): Error = signal.connectUnsafe(callable, flags)
    fun disconnect(): Unit = signal.disconnectUnsafe(callable)
    fun isConnected(): Boolean = signal.isConnected(callable)
    fun isValid(): Boolean = signal.isValid()
}
