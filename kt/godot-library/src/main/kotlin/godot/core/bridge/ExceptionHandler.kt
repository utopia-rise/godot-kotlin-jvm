@file:Suppress("PackageDirectoryMismatch")

package godot.core

object JvmStackTrace {
    fun getExceptionStackTrace(throwable: Throwable): String {
        return throwable.stackTraceToString()
    }

    // TODO: Use this method to get the JVM stacktrace when Godot will add the features to script https://github.com/godotengine/godot/pull/91006
    fun getCurrentStacktrace() = Thread.currentThread().stackTrace.joinToString("\n")
}
