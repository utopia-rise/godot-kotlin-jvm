package godot.registration.model.checks

import godot.registration.model.logging.Logger
import godot.registration.model.types.ScriptClass

class PropertyHintCountCheck(
    logger: Logger,
    registeredClasses: List<ScriptClass>,
) : BaseCheck(logger, registeredClasses) {
    override fun execute(): Boolean {
        var hasIssue = false

        registeredClasses
            .flatMap { scriptClass -> scriptClass.properties }
            .forEach { property ->
                if (property.hints.size > 1) {
                    hasIssue = true
                    logger.error(
                        "RegisteredProperty ${property.fqName} has more than one hint: ${property.hints.joinToString()}",
                        property,
                    )
                }
            }

        return hasIssue
    }
}
