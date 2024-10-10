package godot.api

import godot.core.bridge.GodotPrint

internal interface GDPrint {

    /** Converts one or more arguments to strings in the best way possible and prints them to the console.**/
    fun print(vararg args: Any?) {
        GodotPrint.print(args.joinToString(""))
    }

    /**
     * Converts one or more arguments of any type to string in the best way possible and prints them to the console.
     *
     * The following BBCode tags are supported: b, i, u, s, indent, code, url, center, right, color, bgcolor, fgcolor.
     *
     * Color tags only support the following named colors: black, red, green, yellow, blue, magenta, pink, purple, cyan, white, orange, gray. Hexadecimal color codes are not supported.
     *
     * URL tags only support URLs wrapped by a URL tag, not URLs with a different title.
     *
     * When printing to standard output, the supported subset of BBCode is converted to ANSI escape codes for the terminal emulator to display. Support for ANSI escape codes varies across terminal emulators, especially for italic and strikethrough. In standard output, code is represented with faint text but without any font change. Unsupported tags are left as-is in standard output.
     *
     * `printRich("[color=green][b]Hello world![/b][/color]")`
     *
     * Note: Consider using [pushError] and [pushWarning] to print error and warning messages instead of print or print_rich. This distinguishes them from print messages used for debugging purposes, while also displaying a stack trace when an error or warning is printed.
     *
     * Note: On Windows, only Windows 10 and later correctly displays ANSI escape codes in standard output.
     *
     * Note: Output displayed in the editor supports clickable [url=address]text[/url] tags. The [url] tag's address value is handled by OS.shell_open when clicked.
     * **/
    fun printRich(vararg args: Any?) {
        GodotPrint.printRich(args.joinToString(""))
    }

    /** If verbose mode is enabled (OS.is_stdout_verbose returning true), converts one or more arguments of any type to string in the best way possible and prints them to the console.**/
    fun printVerbose(vararg args: Any?) {
        GodotPrint.printVerbose(args.joinToString(""))
    }

    /** Converts one or more arguments to strings in the best way possible and prints them as error to the console.**/
    fun printErr(vararg args: Any?) {
        GodotPrint.printErr(args.joinToString(""))
    }

    /** Prints the args without any modifications to the console.**/
    fun printRaw(vararg args: Any?) {
        GodotPrint.printRaw(args.joinToString(""))
    }

    /** Prints one or more arguments to the console with a space between each argument.**/
    fun prints(vararg args: Any?) = print(args.joinToString(" "))

    /** Converts one or more arguments to strings in the best way possible and prints them to the console.**/
    fun printt(vararg args: Any?) = print(args.joinToString("\t"))

    /** Pushes an error message to Godot's built-in debugger and to the OS terminal.**/
    fun pushError(vararg args: Any?) {
        GodotPrint.pushError(args.joinToString(""))
    }

    /** Pushes a warning message to Godot's built-in debugger and to the OS terminal.**/
    fun pushWarning(vararg args: Any?) {
        GodotPrint.pushWarning(args.joinToString(""))
    }

    fun printStacktrace() = print(Thread.currentThread().stackTrace.joinToString("\n"))
}
