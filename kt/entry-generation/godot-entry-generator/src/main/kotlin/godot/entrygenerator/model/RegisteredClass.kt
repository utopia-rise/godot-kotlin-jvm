package godot.entrygenerator.model

import godot.entrygenerator.ext.getAnnotation
import godot.entrygenerator.ext.hasAnnotation

data class RegisteredClass(
    override val fqName: String,
    override val supertypes: List<Clazz>,
    val resPath: String,
    override val annotations: List<ClassAnnotation> = emptyList(),
    val constructors: List<RegisteredConstructor> = emptyList(),
    val functions: List<RegisteredFunction> = emptyList(),
    val properties: List<RegisteredProperty> = emptyList()
) : Clazz(fqName, supertypes) {
    internal val registeredName: String
        get() = annotations
            .getAnnotation<RegisterClassAnnotation>()
            ?.customName
            ?: name

    internal val isTool: Boolean
        get() = annotations.getAnnotation<ToolAnnotation>() != null

    internal val godotBaseClass: String
        get() = supertypes
            .first { it.annotations.hasAnnotation<GodotBaseTypeAnnotation>() }
            .name
}
