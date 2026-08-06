package godot.registration.model.checks

import godot.registration.model.logging.Logger
import godot.registration.model.types.ScriptClass

class SourceFileNameCheck(
    logger: Logger,
    registeredClasses: List<ScriptClass>,
) : BaseCheck(logger, registeredClasses) {
    override fun execute(): Boolean {
        var hasIssue = false

        registeredClasses
            .filter { scriptClass -> scriptClass.isRegistered && scriptClass.sourceFileName.isNotEmpty() }
            .forEach { scriptClass ->
                val sourceClassName = scriptClass.sourceFileName.substringBeforeLast(".")
                val className = scriptClass.fqName.substringAfterLast(".")
                if (sourceClassName != className) {
                    hasIssue = true
                    logger.error(
                        "Registered project class ${scriptClass.fqName} must be declared in $className" +
                            scriptClass.sourceFileName.substringAfterLast(".", missingDelimiterValue = "")
                                .takeIf(String::isNotEmpty)
                                ?.let { extension -> ".$extension" }
                                .orEmpty() +
                            " so Godot can associate the source file with the compiled class. " +
                            "Found ${scriptClass.sourceFileName}.",
                        scriptClass,
                    )
                }
            }

        return hasIssue
    }
}
