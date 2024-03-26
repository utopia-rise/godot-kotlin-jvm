package godot.entrygenerator.model

data class Type(
    val fqName: String,
    val kind: TypeKind,
    val isNullable: Boolean,
    val supertypes: List<Type>,
    val arguments: () -> List<Type>,
    val registeredName: () -> String?,
) {
    val allSuperTypes: List<Type>
        get() = collectSupertypes()

    private fun collectSupertypes(): List<Type> {
        return listOf(
            *supertypes.toTypedArray(),
            *supertypes.flatMap { it.collectSupertypes() }.toTypedArray()
        )
    }
}

enum class TypeKind {
    INTERFACE,
    CLASS,
    ENUM_CLASS,
    ENUM_ENTRY,
    OBJECT,
    ANNOTATION_CLASS,
    UNKNOWN
}
