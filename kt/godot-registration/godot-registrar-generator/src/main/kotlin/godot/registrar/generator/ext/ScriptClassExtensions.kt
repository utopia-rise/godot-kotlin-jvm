package godot.registrar.generator.ext

import godot.registrar.generator.RegisteredNameMode
import godot.registrar.generator.RegistrationFileLayoutMode
import godot.registrar.generator.Settings
import godot.registration.model.types.ScriptClass
import godot.registration.model.types.ScriptFamily
import godot.tools.common.constants.FileExtensions

val ScriptClass.shouldGenerateGdjFile: Boolean
    get() = !isAbstract

/**
 * Naming policy lives with the generator (it depends on [Settings]); the model stays config-free.
 *
 * Computes the registered name of a class according to the configured [RegisteredNameMode].
 */
fun ScriptClass.getRegisteredName(settings: Settings): String {
    val baseRegisteredName = customName
        ?.takeIf { it.isNotBlank() }
        ?: fqName.substringAfterLast(".")

    val rawName = when (settings.registeredNameMode) {
        RegisteredNameMode.SIMPLE_NAME -> baseRegisteredName
        RegisteredNameMode.FQ_NAME -> fqName.substringBeforeLast(".", missingDelimiterValue = "").let { packageName ->
            if (packageName.isBlank()) {
                baseRegisteredName
            } else {
                "$packageName.$baseRegisteredName"
            }
        }

        RegisteredNameMode.PROJECT_PREFIX -> {
            if (sourceProjectName == settings.projectName) {
                baseRegisteredName
            } else {
                "${sourceProjectName}_$baseRegisteredName"
            }
        }
    }

    return rawName.replace('.', '_').replace('-', '_')
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

/**
 * All ancestors of this node — the parent class chain plus every interface — gathered transitively,
 * flattened and de-duplicated (insertion order), excluding `this`.
 */
fun ScriptFamily.flattenedHierarchy(): List<ScriptFamily> {
    val accumulator = LinkedHashSet<ScriptFamily>()

    fun visit(node: ScriptFamily) {
        node.interfaces.forEach { iface ->
            if (accumulator.add(iface)) {
                visit(iface)
            }
        }
        node.parentScriptFamily()?.let { parent ->
            if (accumulator.add(parent)) {
                visit(parent)
            }
        }
    }

    visit(this)
    return accumulator.toList()
}
