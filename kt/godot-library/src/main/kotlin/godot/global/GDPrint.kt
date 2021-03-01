package godot.global

import godot.core.GDPrintGlue


internal interface GDPrint {

    /** Converts one or more arguments to strings in the best way possible and prints them to the console.**/
    fun print(vararg args: Any?) = GDPrintGlue.print(args.joinToString(""))

    /** Converts one or more arguments to strings in the best way possible and prints them as error to the console.**/
    fun printErr(vararg args: Any?) = GDPrintGlue.printErr(args.joinToString(""))

    /** Prints the args without any modifications to the console.**/
    fun printRaw(vararg args: Any?) = GDPrintGlue.printRaw(args.joinToString(""))

    /** Prints one or more arguments to the console with a space between each argument.**/
    fun prints(vararg args: Any?) = GDPrintGlue.printS(*args)

    /** Converts one or more arguments to strings in the best way possible and prints them to the console.**/
    fun printt(vararg args: Any?) = GDPrintGlue.printT(*args)

    fun printStack() = GDPrintGlue.printStack()
}
