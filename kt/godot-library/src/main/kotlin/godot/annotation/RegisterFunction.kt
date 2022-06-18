package godot.annotation

/**
 * Registeres a function in godot so it can be called through another language or from godot
 *
 * **Note:** Engine functions like `_ready` also need to be annotated with this annotation in order to work
 *
 * Also you can only register functions that receive and return either primitives, Objects derived from Godot classes or Objects wrapped in `Variant`
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterFunction
