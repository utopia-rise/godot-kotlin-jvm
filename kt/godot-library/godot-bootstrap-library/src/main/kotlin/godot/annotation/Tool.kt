package godot.annotation

/**
 * Mark a class as tool class.
 *
 * The class needs to have the @[Script] annotation added as well
 */
@Script
@Target(AnnotationTarget.CLASS, AnnotationTarget.ANNOTATION_CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class Tool

