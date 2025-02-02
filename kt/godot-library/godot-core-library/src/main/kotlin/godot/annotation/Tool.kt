package godot.annotation


/**
 * Mark a class as tool class.
 *
 * The class needs to have the @[RegisterClass] annotation added as well
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class Tool
