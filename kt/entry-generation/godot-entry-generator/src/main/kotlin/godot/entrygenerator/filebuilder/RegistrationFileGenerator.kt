package godot.entrygenerator.filebuilder

import godot.common.extensions.convertToSnakeCase
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.settings.Settings
import java.io.BufferedWriter

class RegistrationFileGenerator(
    private val registeredClass: RegisteredClass,
    private val settings: Settings,
    private val registrationFileAppendableProvider: (RegisteredClass) -> BufferedWriter,
) {
    fun build() {
        val registeredClassName = registeredClass.getRegisteredName(settings)
        val listItemIndent = settings.registrationFileIndentation.indentString
        val multilineListSeparator = ",\n$listItemIndent"
        registrationFileAppendableProvider(registeredClass).use { bufferedWriter ->
            bufferedWriter.write(
                """
                    |// THIS FILE IS GENERATED! DO NOT EDIT OR DELETE IT. EDIT OR DELETE THE ASSOCIATED SOURCE CODE FILE INSTEAD
                    |// Note: You can however freely move this file inside your godot project if you want. Keep in mind however, that if you rename the originating source code file, this file will be deleted and regenerated as a new file instead of being updated! Other modifications to the source file however, will result in this file being updated.
                    |
                    |registeredName = $registeredClassName
                    |fqName = ${registeredClass.fqName}
                    |baseType = ${registeredClass.godotBaseClass}
                    |supertypes = [
                    |$listItemIndent${registeredClass.supertypes.joinToString(multilineListSeparator) { it.fqName.trim() }}
                    |]
                    |signals = [
                    |$listItemIndent${registeredClass.signals.joinToString(multilineListSeparator) { it.fqName.substringAfterLast(".").trim().convertToSnakeCase() }}
                    |]
                    |properties = [
                    |$listItemIndent${registeredClass.properties.joinToString(multilineListSeparator) { it.fqName.substringAfterLast(".").trim().convertToSnakeCase() }}
                    |]
                    |functions = [
                    |$listItemIndent${registeredClass.functions.joinToString(multilineListSeparator) { it.fqName.substringAfterLast(".").trim().convertToSnakeCase() }}
                    |]
                """.trimMargin()
            )
        }
    }
}
