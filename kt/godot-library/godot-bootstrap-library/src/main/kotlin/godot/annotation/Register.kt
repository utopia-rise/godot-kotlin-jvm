package godot.annotation

/**
 * Registers a function in Godot so it can be used from another language or from Godot.
 *
 * **Note:** Engine functions like `_ready` also need to be annotated with this annotation in order to work.
 *
 * Also you can only register functions that receive and return either primitives, Objects derived from Godot classes or Objects wrapped in `Variant`.
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class Register
