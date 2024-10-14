package godot.annotation

/**
 * Registeres a class in godot so it can be used from another language or from godot
 *
 * @param className Register the class name with this string rather than with `fully_qualified_ClassName`. **Note:** If this class name is already registered, a compilation error will be thrown! So make sure your custom class name is unique!
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterClass(val className: String = "")
