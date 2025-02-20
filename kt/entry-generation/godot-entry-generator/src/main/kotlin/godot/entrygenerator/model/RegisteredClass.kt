package godot.entrygenerator.model

import godot.entrygenerator.ext.getAnnotation
import godot.entrygenerator.ext.hasAnnotation

data class RegisteredClass(
    val registeredName: String,
    override val fqName: String,
    override val relativeSourcePath: String,
    override val supertypes: List<Clazz>,
    override val annotations: List<ClassAnnotation> = emptyList(),
    val constructors: List<RegisteredConstructor> = emptyList(),
    val functions: List<RegisteredFunction> = emptyList(),
    val signals: List<RegisteredSignal> = emptyList(),
    val properties: List<RegisteredProperty> = emptyList(),
    override val isAbstract: Boolean = false,
    private val isFqNameRegistrationEnabled: Boolean = false,
    private val classNamePrefix: String? = null,
    override val symbolProcessorSource: Any
) : Clazz(fqName, relativeSourcePath, supertypes, isAbstract = isAbstract, symbolProcessorSource = symbolProcessorSource) {

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
