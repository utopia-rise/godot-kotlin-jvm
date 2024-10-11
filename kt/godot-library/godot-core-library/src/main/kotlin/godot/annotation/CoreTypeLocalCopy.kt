package godot.annotation

/**
 * Only applicable to godot core types that are copies of the original one and shouldn't be mutated like a reference.
 *
 * Here for the IDE checks to protect users against code not properly mutating a core type inside another one.
 */
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class CoreTypeLocalCopy
