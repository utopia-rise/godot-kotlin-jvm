package godot.annotation

/**
 * Registers a property in Godot so it can be used from another language or from Godot.
 *
 * **Note:** Only compile time constant assignments can be used. If this is not possible you have to use lateinit and set the value either in the constructor or in `_ready`.
 */
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class Visible
