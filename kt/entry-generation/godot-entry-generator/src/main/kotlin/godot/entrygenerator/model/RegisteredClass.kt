package godot.entrygenerator.model

import godot.entrygenerator.ext.getAnnotation
import godot.entrygenerator.ext.hasAnnotation
import godot.entrygenerator.settings.RegisteredNameMode
import godot.entrygenerator.settings.Settings

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

    fun getRegisteredName(settings: Settings): String {
        customName?.takeIf { it.isNotBlank() }?.let { return it }

        val defaultRegisteredName = when (settings.registeredNameMode) {
            RegisteredNameMode.SIMPLE_NAME,
            RegisteredNameMode.PROJECT_PREFIX -> fqName.substringAfterLast(".")

            RegisteredNameMode.FQ_NAME -> fqName
        }

        return when (settings.registeredNameMode) {
            RegisteredNameMode.SIMPLE_NAME,
            RegisteredNameMode.FQ_NAME -> defaultRegisteredName

            RegisteredNameMode.PROJECT_PREFIX -> {
                if (sourceProjectName == settings.projectName) {
                    defaultRegisteredName
                } else {
                    "${sourceProjectName}_$defaultRegisteredName"
                }
            }
        }
    }
}
