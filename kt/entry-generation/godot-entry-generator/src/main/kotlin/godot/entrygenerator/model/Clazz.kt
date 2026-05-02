package godot.entrygenerator.model

import godot.api.RefCounted
import godot.entrygenerator.ext.hasAnnotation

open class Clazz(
    open val fqName: String,
    open val supertypes: List<Clazz> = emptyList(),
    open val annotations: List<ClassAnnotation> = emptyList(),
    open val isAbstract: Boolean = false,
) {
    val name: String
        get() = fqName.substringAfterLast(".")
    val containingPackage: String
        get() = if (fqName.contains(".")) {
            fqName.substringBeforeLast(".")
        } else ""

    internal val directlyInheritsGodotBaseClass: Boolean
        get() = supertypes
            .firstOrNull()
            ?.annotations
            ?.hasAnnotation<GodotBaseTypeAnnotation>() == true

    internal val inheritsRefCounted: Boolean
        get() = supertypes.any { it.fqName == RefCounted::class.qualifiedName!! }
}
