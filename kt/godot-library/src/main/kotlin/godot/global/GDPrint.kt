package godot.global

import godot.core.TransferContext
import godot.core.VariantType


internal interface GDPrint {

    /** Converts one or more arguments to strings in the best way possible and prints them to the console.**/
    fun print(vararg args: Any?) {
        TransferContext.writeArguments(VariantType.STRING to args.joinToString(""))
        Bridge.print()
    }

    /** Converts one or more arguments to strings in the best way possible and prints them as error to the console.**/
    fun printErr(vararg args: Any?) {
        TransferContext.writeArguments(VariantType.STRING to args.joinToString(""))
        Bridge.printErr()
    }

    /** Prints the args without any modifications to the console.**/
    fun printRaw(vararg args: Any?) {
        TransferContext.writeArguments(VariantType.STRING to args.joinToString(""))
        Bridge.printRaw()
    }

    /** Prints one or more arguments to the console with a space between each argument.**/
    fun prints(vararg args: Any?) = print(args.joinToString(" "))

    /** Converts one or more arguments to strings in the best way possible and prints them to the console.**/
    fun printt(vararg args: Any?) = print(args.joinToString("\t"))

    fun printStack() = print(Thread.currentThread().stackTrace.joinToString("\n"))

    private object Bridge {
        external fun print()
        external fun printErr()
        external fun printRaw()
    }
}
