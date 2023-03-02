package godot.entrygenerator.model

import godot.entrygenerator.ext.getAnnotation
import godot.entrygenerator.ext.hasAnnotation

data class RegisteredClass(
    override val fqName: String,
    override val supertypes: List<Clazz>,
    val resPathProvider: RegisteredClass.() -> String,
    override val annotations: List<ClassAnnotation> = emptyList(),
    val constructors: List<RegisteredConstructor> = emptyList(),
    val functions: List<RegisteredFunction> = emptyList(),
    val signals: List<RegisteredSignal> = emptyList(),
    val properties: List<RegisteredProperty> = emptyList(),
    override val isAbstract: Boolean = false
) : Clazz(fqName, supertypes, isAbstract = isAbstract) {
    val registeredName: String
        get() {
            val customName = annotations
                .getAnnotation<RegisterClassAnnotation>()
                ?.customName
            return if (customName.isNullOrEmpty()) fqName.replace(".", "_") else customName
        }

    internal val isTool: Boolean
        get() = annotations.getAnnotation<ToolAnnotation>() != null

    internal val godotBaseClass: String
        get() = supertypes
            .first { it.annotations.hasAnnotation<GodotBaseTypeAnnotation>() }
            .name
}
