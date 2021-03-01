package godot.core

object GDPrintGlue {
    external fun print(message: String)
    @Suppress("NOTHING_TO_INLINE")
    inline fun printStack() = print(Thread.currentThread().stackTrace.joinToString("\n"))
    external fun printErr(message: String)
    external fun printRaw(message: String)
    fun printS(vararg elements: Any?) = print(elements.joinToString(" "))
    fun printT(vararg elements: Any?) = print(elements.joinToString("\t"))
}
