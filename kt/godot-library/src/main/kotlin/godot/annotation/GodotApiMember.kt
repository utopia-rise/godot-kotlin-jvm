package godot.annotation

/**
 * Only applicable to godot type members generated in the api gen
 *
 * Here for the entry generation as marker to determine whether to register a signal or function.
 */
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
internal annotation class GodotApiMember
