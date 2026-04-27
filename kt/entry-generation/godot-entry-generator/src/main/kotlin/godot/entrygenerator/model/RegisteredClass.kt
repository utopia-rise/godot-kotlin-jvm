package godot.entrygenerator.model

import godot.entrygenerator.ext.getAnnotation
import godot.entrygenerator.ext.hasAnnotation

data class RegisteredClass(
    val customName: String?,
    val sourceProjectName: String,
    override val fqName: String,
    override val supertypes: List<Clazz>,
    override val annotations: List<ClassAnnotation> = emptyList(),
    val functions: List<RegisteredFunction> = emptyList(),
    val signals: List<RegisteredSignal> = emptyList(),
    val properties: List<RegisteredProperty> = emptyList(),
    override val isAbstract: Boolean = false,
) : Clazz(fqName, supertypes, isAbstract = isAbstract) {

    internal val isTool: Boolean
        get() = annotations.getAnnotation<ToolAnnotation>() != null

    val godotBaseClass: String
        get() = if (isAbstract) {
            ""
        } else {
            supertypes
                .first { it.annotations.hasAnnotation<GodotBaseTypeAnnotation>() }
                .name
        }
}
