package godot.global


internal interface GDPrint {

    //TODO: implement once https://github.com/utopia-rise/godot-jvm/issues/65 is done
//    /** Converts one or more arguments to strings in the best way possible and prints them to the console.**/
//    fun print(vararg args: Any?) {
//        val s =  buildString{
//            for (arg in args) {
//                append(arg.toString())
//            }
//        }
//        Godot.print(s.trimEnd().toString())
//    }
//
//    /** Prints one or more arguments to the console with a space between each argument.**/
//    fun prints(vararg args: Any?) {
//        val s =  buildString{
//            for (arg in args) {
//                append(arg.toString())
//                append(" ")
//            }
//        }
//        Godot.print(s.trimEnd().toString())
//    }
//
//    /** Converts one or more arguments to strings in the best way possible and prints them to the console.**/
//    fun printt(vararg args: Any?) {
//        val s =  buildString{
//            for (arg in args) {
//                append(arg.toString())
//                append("    ")
//            }
//        }
//        Godot.print(s.trimEnd().toString())
//    }
//
//    /** Pushes an error message to Godot's built-in debugger and to the OS terminal. */
//    fun pushError(description: String, function: String, file: String, line: Int) {
//        Godot.printError(description, function, file, line)
//    }
//
//    /** Pushes a warming message to Godot's built-in debugger and to the OS terminal. */
//    fun pushWarning(description: String, function: String, file: String, line: Int) {
//        Godot.printWarning(description, function, file, line)
//    }
}
