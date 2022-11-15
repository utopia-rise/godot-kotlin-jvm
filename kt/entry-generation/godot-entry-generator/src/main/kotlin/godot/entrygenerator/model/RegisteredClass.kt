package godot.entrygenerator.model

import godot.entrygenerator.ext.getAnnotation
import godot.entrygenerator.ext.hasAnnotation

data class RegisteredClass(
    override val fqName: String,
    override val supertypes: List<Clazz>,
    val resPath: String,
    override val annotations: List<ClassAnnotation>,
    override val constructors: List<Constructor>,
    override val functions: List<Function>,
    val signals: List<RegisteredSignal>,
    override val properties: List<Property>,
    override val isAbstract: Boolean,
    override val isInterface: Boolean,
    val registeredConstructors: List<RegisteredConstructor> = constructors.filterIsInstance<RegisteredConstructor>(),
    val registeredProperties: List<RegisteredProperty> = properties.filterIsInstance<RegisteredProperty>(),
    val registeredFunctions: List<RegisteredFunction> = functions.filterIsInstance<RegisteredFunction>(),
) : Clazz(fqName, supertypes, annotations, constructors, properties, functions, isAbstract, isInterface) {
    internal val registeredName: String
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
