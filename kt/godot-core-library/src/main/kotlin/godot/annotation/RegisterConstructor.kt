package godot.annotation

/**
 * Registeres a constructor in godot so it can be used from another language
 */
@Target(AnnotationTarget.CONSTRUCTOR)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterConstructor
