package godot.annotation

/**
 * Only applicable to godot core type helper functions generated in the api gen
 *
 * Here for the IDE checks to differentiate mutation function calls (these helper functions) from regular function calls
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class CoreTypeHelper
