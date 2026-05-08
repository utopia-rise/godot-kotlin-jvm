package godot.annotation

/**
 * Registers a class in Godot so it can be used from another language or from Godot.
 *
 * @param className Register the class name with this string rather than with `fully_qualified_ClassName`. **Note:** If this class name is already registered, a compilation error will be thrown, so make sure your custom class name is unique.
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class GodotScript(val className: String = "")
