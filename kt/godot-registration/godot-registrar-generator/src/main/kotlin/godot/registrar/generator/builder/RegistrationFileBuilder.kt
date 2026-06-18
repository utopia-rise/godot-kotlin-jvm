package godot.registrar.generator.builder

import godot.common.extensions.convertToSnakeCase
import godot.registrar.generator.GeneratorContext
import godot.registrar.generator.Settings
import godot.registrar.generator.ext.baseGodotClassName
import godot.registrar.generator.ext.effectiveFunctions
import godot.registrar.generator.ext.effectiveProperties
import godot.registrar.generator.ext.effectiveSignals
import godot.registrar.generator.ext.getRegisteredName
import godot.registrar.generator.ext.provideRegistrationFileRelativePath
import godot.registrar.generator.ext.registeredSupertypes
import godot.registrar.generator.ext.shouldGenerateGdjFile
import godot.registration.model.types.ScriptClass
import java.io.File

class RegistrationFileBuilder(
    private val context: GeneratorContext,
    private val settings: Settings,
    private val outputDir: File,
) {
    fun generate(registeredClasses: List<ScriptClass>) {
        registeredClasses
            .filter { it.shouldGenerateGdjFile }
            .forEach { registeredClass ->
                val outputFile = outputDir.resolve(registeredClass.provideRegistrationFileRelativePath(settings))
                build(registeredClass, outputFile)
            }
    }

    private fun build(registeredClass: ScriptClass, outputFile: File) {
        val registeredClassName = registeredClass.getRegisteredName(settings)
        val listItemIndent = settings.registrationFileIndentation.indentString
        val multilineListSeparator = ",\n$listItemIndent"
        outputFile.parentFile?.mkdirs()
        outputFile.writeText(
            """
                    |// THIS FILE IS GENERATED! DO NOT EDIT OR DELETE IT. EDIT OR DELETE THE ASSOCIATED SOURCE CODE FILE INSTEAD
                    |// Note: You can however freely move this file inside your godot project if you want. Keep in mind however, that if you rename the originating source code file, this file will be deleted and regenerated as a new file instead of being updated! Other modifications to the source file however, will result in this file being updated.
                    |
                    |registeredName = $registeredClassName
                    |fqName = ${registeredClass.fqName}
                    |baseType = ${registeredClass.baseGodotClassName().simpleName()}
                    |supertypes = [
                    |$listItemIndent${
                registeredClass.registeredSupertypes().joinToString(multilineListSeparator) { supertype ->
                    supertype.getRegisteredName(settings)
                }
            }
                    |]
                    |signals = [
                    |$listItemIndent${
                registeredClass.effectiveSignals(context).joinToString(multilineListSeparator) {
                    it.name.trim().convertToSnakeCase()
                }
            }
                    |]
                    |properties = [
                    |$listItemIndent${
                registeredClass.effectiveProperties(context).joinToString(multilineListSeparator) {
                    it.fqName.substringAfterLast(
                        "."
                    ).trim().convertToSnakeCase()
                }
            }
                    |]
                    |functions = [
                    |$listItemIndent${
                registeredClass.effectiveFunctions(context).joinToString(multilineListSeparator) {
                    it.fqName.substringAfterLast(
                        "."
                    ).trim().convertToSnakeCase()
                }
            }
                    |]
                """.trimMargin()
        )
    }

    private fun String.simpleName(): String = substringAfterLast(".").trim()
}
