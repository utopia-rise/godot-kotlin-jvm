package godot.util

private const val ESCAPE = '\u001B'
private const val RESET = "$ESCAPE[0m"

/**
 * The amount of codes required in order to jump from a foreground code to a background code. Equal to 10. For example,
 * the foreground code for blue is "[33m", its respective background code is "[43m"
 */
private const val BG_JUMP = 10

private enum class Color(baseCode: Int) {
    RED(31),
    GREEN(32),
    YELLOW(33);

    /** ANSI modifier string to apply the color to the text itself */
    val foreground: String = "$ESCAPE[${baseCode}m"

    /** ANSI modifier string to apply the color the text's background */
    val background: String = "$ESCAPE[${baseCode + BG_JUMP}m"
}

internal object JVMLogging {
    fun info(message: String) = println("Godot-JVM: $message")
    fun warning(message: String) = println("${Color.YELLOW.foreground}$message$RESET")
    fun error(message: String) = System.err.println("Godot-JVM:  $message")
}

internal object GodotLogging {
    fun info(message: String) = GD.print("Godot-JVM: ", message)
    fun warning(message: String) = GD.pushWarning("Godot-JVM: ", message)
    fun error(message: String) = GD.printErr("Godot-JVM: ", message)
}
