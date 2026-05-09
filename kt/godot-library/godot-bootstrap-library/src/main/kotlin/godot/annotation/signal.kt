package godot.annotation

/**
 * Provides custom names for signal arguments.
 *
 * Signals are registered automatically when they are declared directly on the class.
 * If no names are supplied, placeholder names such as `p0`, `p1`, ... are used.
 */
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class ArgumentName(vararg val value: String = [])
