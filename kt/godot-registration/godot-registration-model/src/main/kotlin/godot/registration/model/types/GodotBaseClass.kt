package godot.registration.model.types

class GodotBaseClass(
    override val fqName: String,
    override var parent: GodotClass? = null,
) : SourceClass(fqName, TypeKind.GODOT_CLASS), GodotClass {
}
