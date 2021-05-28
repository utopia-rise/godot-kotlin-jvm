package godot.entrygenerator.model

data class Type(
    val fqName: String,
    val isNullable: Boolean,
    val supertypes: List<Type>
)
