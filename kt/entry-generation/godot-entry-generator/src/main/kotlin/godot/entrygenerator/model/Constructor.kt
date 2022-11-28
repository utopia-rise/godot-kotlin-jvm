package godot.entrygenerator.model

open class Constructor(
    open val fqName: String,
    open val parameters: List<ValueParameter> = emptyList(),
    open val annotations: List<ConstructorAnnotation> = emptyList()
) : GodotJvmSourceElement

data class RegisteredConstructor(
    override val fqName: String,
    override val parameters: List<ValueParameter> = emptyList(),
    override val annotations: List<ConstructorAnnotation> = emptyList()
) : Constructor(fqName, parameters, annotations)
