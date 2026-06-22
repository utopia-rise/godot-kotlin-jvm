package godot.registration.model.types

/**
 * Fallback model node for a class-shaped type that is not Godot-compatible.
 *
 * It intentionally carries no ancestry or registerable members. It is only used so the model can
 * explicitly remember that a scanned type was a class, while later checks can reject it from
 * Godot-visible signatures.
 */
open class SourceClass(
    override val fqName: String,
    protected val sourceKind: TypeKind = TypeKind.OTHER,
) : Type(fqName, sourceKind, isNullable = false)
