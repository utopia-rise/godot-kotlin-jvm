package godot.entrygenerator.model

import godot.entrygenerator.ext.hasAnnotation

open class Clazz(
    open val fqName: String,
    open val supertypes: List<Clazz>,
    open val annotations: List<ClassAnnotation>,
    open val constructors: List<Constructor>,
    open val properties: List<Property>,
    open val functions: List<Function>,
    open val isAbstract: Boolean,
    open val isInterface: Boolean
) : GodotJvmSourceElement {
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
}
