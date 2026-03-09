package godot.annotation

/**
 * Mark a registered property as exported and thus visible in the inspector.
 *
 * Only core types and references can be exported.
 *
 * The property needs to have the @[RegisterProperty] annotation added as well
 */
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class Export