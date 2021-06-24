package godot.entrygenerator.model

data class Type(
    val fqName: String,
    val kind: TypeKind,
    val isNullable: Boolean,
    val supertypes: List<Type>,
    val arguments: () -> List<Type>
)

enum class TypeKind {
    INTERFACE,
    CLASS,
    ENUM_CLASS,
    ENUM_ENTRY,
    OBJECT,
    ANNOTATION_CLASS,
    UNKNOWN
}
