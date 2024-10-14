package godot.internal.logging

object GodotPrint {
    fun getExceptionStackTrace(throwable: Throwable): String {
        return throwable.stackTraceToString()
    }

    // TODO: Use this method to get the JVM stacktrace when Godot will add the features to script https://github.com/godotengine/godot/pull/91006
    fun getCurrentStacktrace() = Thread.currentThread().stackTrace.joinToString("\n")

    external fun print(str: String)
    external fun printRich(str: String)
    external fun printVerbose(str: String)
    external fun printErr(str: String)
    external fun printRaw(str: String)
    external fun pushError(str: String)
    external fun pushWarning(str: String)
}
