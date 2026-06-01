package godot.registration.model.types

enum class TypeKind {
    PRIMITIVE,
    CORE_TYPE,
    INTERFACE,
    CLASS,
    ENUM,
    OTHER,
}

open class Type(
    open val fqName: String,
    open val kind: TypeKind,
    // Whether the type reference is nullable at this usage. Always false for the class-family nodes
    // (ScriptClass / GodotBaseClass / ScriptInterface); only property/parameter type references set it.
    open val isNullable: Boolean,
    open val genericArguments: List<Type> = emptyList(),
) {
    val name: String
        get() = fqName.substringAfterLast(".")

    val containingPackage: String
        get() = if (fqName.contains(".")) {
            fqName.substringBeforeLast(".")
        } else ""
}
