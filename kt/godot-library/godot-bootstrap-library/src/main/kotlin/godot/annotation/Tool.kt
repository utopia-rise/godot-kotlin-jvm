package godot.annotation

/**
 * Marks a class as a tool class.
 *
 * In inferred registration mode, this also selects the class through its
 * [Script] meta-annotation. Explicit mode requires a direct [Script] annotation.
 */
@Script
@Target(AnnotationTarget.CLASS, AnnotationTarget.ANNOTATION_CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class Tool

