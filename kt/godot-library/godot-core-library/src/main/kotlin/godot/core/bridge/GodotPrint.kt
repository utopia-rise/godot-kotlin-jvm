package godot.core.bridge

import godot.core.VariantParser
import godot.core.memory.TransferContext

object GodotPrint {

    fun print(str: String) {
        TransferContext.writeArguments(VariantParser.STRING to str)
        print()
    }

    fun printRich(str: String) {
        TransferContext.writeArguments(VariantParser.STRING to str)
        printRich()
    }

    fun printVerbose(str: String) {
        TransferContext.writeArguments(VariantParser.STRING to str)
        printVerbose()
    }

    fun printErr(str: String) {
        TransferContext.writeArguments(VariantParser.STRING to str)
        printErr()
    }

    fun printRaw(str: String) {
        TransferContext.writeArguments(VariantParser.STRING to str)
        printRaw()
    }

    fun pushError(str: String) {
        TransferContext.writeArguments(VariantParser.STRING to str)
        pushError()
    }

    fun pushWarning(str: String) {
        TransferContext.writeArguments(VariantParser.STRING to str)
        pushWarning()
    }

    internal external fun print()
    internal external fun printRich()
    internal external fun printVerbose()
    internal external fun printErr()
    internal external fun printRaw()
    internal external fun pushError()
    internal external fun pushWarning()
}
