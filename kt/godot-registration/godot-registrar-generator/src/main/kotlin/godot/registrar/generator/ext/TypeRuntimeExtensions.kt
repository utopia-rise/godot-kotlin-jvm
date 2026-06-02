package godot.registrar.generator.ext

import godot.api.Resource
import godot.core.Dictionary
import godot.core.VariantArray
import godot.registration.model.types.GodotClass
import godot.registration.model.types.ScriptFamily
import godot.registration.model.types.Type
import godot.registration.model.types.TypeKind
import godot.tools.common.constants.godotApiPackage
import godot.tools.common.constants.isFromPackage

private fun Type.isSubtypeOf(target: Class<*>): Boolean = runCatching {
    target.isAssignableFrom(Class.forName(fqName))
}.getOrDefault(false)

fun Type.baseGodotType(): Type? {
    if (fqName.isFromPackage(godotApiPackage)) return this

    val loadedClass = runCatching { Class.forName(fqName) }.getOrNull() ?: return null
    var currentClass: Class<*>? = loadedClass.superclass
    while (currentClass != null) {
        if (currentClass.name.isFromPackage(godotApiPackage)) {
            return Type(fqName = currentClass.name, kind = TypeKind.CLASS, isNullable = false)
        }
        currentClass = currentClass.superclass
    }

    return null
}

fun Type.isCompatibleList(): Boolean = isSubtypeOf(VariantArray::class.java)

fun Type.isDictionary(): Boolean = isSubtypeOf(Dictionary::class.java)

fun Type.isResource(): Boolean =
    fqName == requireNotNull(Resource::class.qualifiedName) || baseGodotType()?.fqName == Resource::class.qualifiedName

internal fun ScriptFamily.parentScriptFamily(): ScriptFamily? =
    (this as? GodotClass)?.parent as? ScriptFamily
