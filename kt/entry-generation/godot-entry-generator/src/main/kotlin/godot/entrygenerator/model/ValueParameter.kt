package godot.entrygenerator.model

data class ValueParameter(
    val name: String,
    val type: Type,
    val typeArguments: List<Type>
)
