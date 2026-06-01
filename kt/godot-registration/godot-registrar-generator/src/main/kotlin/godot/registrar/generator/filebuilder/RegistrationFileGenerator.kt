package godot.registrar.generator.filebuilder

import godot.common.extensions.convertToSnakeCase
import godot.registrar.generator.ext.flattenedHierarchy
import godot.registrar.generator.ext.getRegisteredName
import godot.registrar.generator.settings.Settings
import godot.registration.model.types.ScriptClass
import java.io.File

class RegistrationFileGenerator(
    private val registeredClass: ScriptClass,
    private val settings: Settings,
    private val outputFile: File,
) {
    fun build() {
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
                    |baseType = ${registeredClass.baseGodotClass}
                    |supertypes = [
                    |$listItemIndent${
                registeredClass.flattenedHierarchy().joinToString(multilineListSeparator) { it.fqName.trim() }
            }
                    |]
                    |signals = [
                    |$listItemIndent${
                registeredClass.signals.joinToString(multilineListSeparator) {
                    it.fqName.substringAfterLast(
                        "."
                    ).trim().convertToSnakeCase()
                }
            }
                    |]
                    |properties = [
                    |$listItemIndent${
                registeredClass.properties.joinToString(multilineListSeparator) {
                    it.fqName.substringAfterLast(
                        "."
                    ).trim().convertToSnakeCase()
                }
            }
                    |]
                    |functions = [
                    |$listItemIndent${
                registeredClass.functions.joinToString(multilineListSeparator) {
                    it.fqName.substringAfterLast(
                        "."
                    ).trim().convertToSnakeCase()
                }
            }
                    |]
                """.trimMargin()
        )
    }
}
