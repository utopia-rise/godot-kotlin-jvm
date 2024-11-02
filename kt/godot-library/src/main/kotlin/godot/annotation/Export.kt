package godot.annotation


/**
 * Mark a registered property as exported and thus visible in the inspector.
 *
 * Only core types and references can be exported.
 *
 * The property needs to have the @[RegisterProperty] annotation added as well
 */
@Target(
    AnnotationTarget.PROPERTY,
    AnnotationTarget.FIELD,
    AnnotationTarget.ANNOTATION_CLASS,
)
@Retention(AnnotationRetention.RUNTIME)
@Member
annotation class Export
