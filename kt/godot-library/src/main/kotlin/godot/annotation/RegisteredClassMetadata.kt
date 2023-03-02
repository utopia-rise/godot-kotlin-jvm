package godot.annotation

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisteredClassMetadata(
    val registeredName: String,
    val baseType: String,
    val fqName: String,
    val resPath: String,
    val superTypes: String,
    val signals: String,
    val properties: String,
    val functions: String,
)
