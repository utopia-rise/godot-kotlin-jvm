package godot.registrar.generator.ext

import godot.registrar.generator.settings.RegistrationFileLayoutMode
import godot.registrar.generator.settings.Settings
import godot.registration.model.types.GodotClass
import godot.registration.model.types.ScriptClass
import godot.registration.model.types.ScriptFamily
import godot.tools.common.constants.FileExtensions

val ScriptClass.shouldGenerateGdjFile: Boolean
    get() = !isAbstract

/**
 * All ancestors of this node — the parent class chain plus every interface — gathered transitively,
 * flattened and de-duplicated (insertion order), excluding `this`.
 */
fun ScriptFamily.flattenedHierarchy(): List<ScriptFamily> {
    val accumulator = LinkedHashSet<ScriptFamily>()
    fun visit(node: ScriptFamily) {
        node.interfaces.forEach { iface -> if (accumulator.add(iface)) visit(iface) }
        if (node is GodotClass) {
            (node.parent as? ScriptFamily)?.let { parent -> if (accumulator.add(parent)) visit(parent) }
        }
    }
    visit(this)
    return accumulator.toList()
}

fun ScriptClass.provideRegistrationFileRelativePath(settings: Settings): String {
    val relativeDir = buildString {
        if (sourceProjectName != settings.projectName) {
            append(sourceProjectName)
        }

        if (settings.registrationFileLayoutMode == RegistrationFileLayoutMode.HIERARCHICAL && fqName.contains(".")) {
            val packagePath = fqName.substringBeforeLast(".").replace(".", "/")
            if (isNotEmpty()) {
                append("/")
            }
            append(packagePath)
        }
    }

    return buildString {
        if (relativeDir.isNotEmpty()) {
            append(relativeDir)
            append("/")
        }
        append(getRegisteredName(settings))
        append(".")
        append(FileExtensions.GodotKotlinJvm.registrationFile)
    }
}
