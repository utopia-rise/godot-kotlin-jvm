package godot.annotation


/**
 * Mark a class as tool class.
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@GodotScript
annotation class Tool
