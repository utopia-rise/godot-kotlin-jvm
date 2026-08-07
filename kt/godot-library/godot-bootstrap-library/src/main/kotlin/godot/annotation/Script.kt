package godot.annotation

/**
 * Registers a class in Godot so it can be used from another language or script.
 *
 * @param className Registers the class under this name instead of its default simple class name.
 * The registered name must be unique.
 */
@Target(AnnotationTarget.CLASS, AnnotationTarget.ANNOTATION_CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class Script(val className: String = "")
