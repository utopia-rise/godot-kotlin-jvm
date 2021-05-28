package godot.entrygenerator.model

import godot.entrygenerator.ext.hasAnnotation

open class Clazz(
    open val fqName: String,
    open val supertypes: List<Clazz> = emptyList(),
    open val annotations: List<ClassAnnotation> = emptyList()
) : GodotJvmSourceElement {
    val name: String
        get() = fqName.substringAfterLast(".")
    val containingPackage: String
        get() = fqName.substringBeforeLast(".")

    internal val directlyInheritsGodotBaseClass: Boolean
        get() = supertypes
            .firstOrNull()
            ?.annotations
            ?.hasAnnotation<GodotBaseTypeAnnotation>() == true
}
