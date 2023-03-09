package godot.entrygenerator.model

import godot.entrygenerator.ext.getAnnotation
import godot.entrygenerator.ext.hasAnnotation

data class RegisteredClass(
    override val fqName: String,
    override val supertypes: List<Clazz>,
    val localResourcePathProvider: RegisteredClass.() -> String,
    override val annotations: List<ClassAnnotation> = emptyList(),
    val constructors: List<RegisteredConstructor> = emptyList(),
    val functions: List<RegisteredFunction> = emptyList(),
    val signals: List<RegisteredSignal> = emptyList(),
    val properties: List<RegisteredProperty> = emptyList(),
    override val isAbstract: Boolean = false,
    private val isFqNameRegistrationEnabled: Boolean = false,
    private val classNamePrefix: String? = null,
    override val source: Any
) : Clazz(fqName, supertypes, isAbstract = isAbstract, source = source) {
    val registeredName: String
        get() {
            val customName = annotations
                .getAnnotation<RegisterClassAnnotation>()
                ?.customName

            val registeredName = if (customName.isNullOrEmpty()) {
                if (isFqNameRegistrationEnabled) {
                    fqName.replace(".", "_")
                } else {
                    if (fqName.contains(".")) {
                        fqName.substringAfterLast(".")
                    } else {
                        fqName
                    }
                }
            } else {
                customName
            }

            return if (classNamePrefix != null) {
                if (registeredName.contains("_")) {
                    val packageName = registeredName.substringBeforeLast("_")
                    val classNameWithPrefix = registeredName
                        .substringAfterLast("_")
                        .let { className -> "${classNamePrefix.uppercase()}$className" }

                    "${packageName}_$classNameWithPrefix"
                } else {
                    "${classNamePrefix.uppercase()}$registeredName"
                }
            } else {
                registeredName
            }
        }

    internal val isTool: Boolean
        get() = annotations.getAnnotation<ToolAnnotation>() != null

    internal val godotBaseClass: String
        get() = supertypes
            .first { it.annotations.hasAnnotation<GodotBaseTypeAnnotation>() }
            .name
}
