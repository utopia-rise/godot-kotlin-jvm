package godot.annotation

/**
 * Only applicable to godot types generated in the api gen or CoreTypes
 *
 * Here for the entry generation to get the first godot based superclass of a registered class.
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
internal annotation class GodotBaseType
