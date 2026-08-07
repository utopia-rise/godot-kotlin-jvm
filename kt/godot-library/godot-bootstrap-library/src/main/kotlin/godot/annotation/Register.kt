package godot.annotation

/**
 * Registers an ordinary function in Godot so it can be called from another language or script.
 *
 * In inferred registration mode, compatible overrides of Godot functions such as `_ready`
 * are registered from their base-class declaration and do not need this annotation.
 *
 * Functions must use parameters and a return type that can be converted to a `Variant`.
 */
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.ANNOTATION_CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class Register

