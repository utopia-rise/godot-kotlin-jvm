package godot.annotation


/**
 * Mark a class as tool class.
 *
 * The class needs to have the @[GodotScript] annotation added as well
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@GodotScript
annotation class Tool
