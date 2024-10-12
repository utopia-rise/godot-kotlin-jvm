package godot.annotation

/**
 * Registeres a member in godot so it can be called through another language or from godot
 *
 * You can only register functions that receive and return either primitives, Objects derived from Godot classes or Objects wrapped
 * in `Variant` and properties with those types.
 */
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY,
    AnnotationTarget.FIELD,
    AnnotationTarget.CONSTRUCTOR,
    AnnotationTarget.ANNOTATION_CLASS
)
@Retention(AnnotationRetention.RUNTIME)
annotation class GodotMember
