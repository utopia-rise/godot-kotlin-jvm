package godot.internal.logging

object GodotPrint {
    fun getExceptionStackTrace(throwable: Throwable): String {
        return throwable.stackTraceToString()
    }

    fun getCurrentStacktrace() = Thread.currentThread().stackTrace.joinToString("\n")

    external fun print(str: String)
    external fun printRich(str: String)
    external fun printVerbose(str: String)
    external fun printErr(str: String)
    external fun printRaw(str: String)
    external fun pushError(str: String)
    external fun pushWarning(str: String)
}
