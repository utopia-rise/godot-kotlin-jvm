package godot.annotation

/**
 * Registeres a class in godot so it can be used from another language or from godot
 *
 * @param isTool Same as the `tool` keyword for GDScript. Makes the class usable in the editor
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterClass(val isTool: Boolean = false)
