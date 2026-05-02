package godot.entrygenerator.model

open class Type(
    val fqName: String,
    val kind: TypeKind,
    val supertypes: List<Type>,
    val arguments: List<Type>,
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

class PropertyType(
    type: Type,
    val isNullable: Boolean,
) : Type(
    type.fqName,
    type.kind,
    type.supertypes,
    type.arguments,
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
