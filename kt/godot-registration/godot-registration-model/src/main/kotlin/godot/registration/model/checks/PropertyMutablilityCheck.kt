package godot.registration.model.checks

import godot.registration.model.types.ScriptClass
import godot.registration.model.logging.Logger

class PropertyMutablilityCheck(logger: Logger, registeredClasses: List<ScriptClass>) :
    BaseCheck(logger, registeredClasses) {
    override fun execute(): Boolean {
        var hasIssue = false
        registeredClasses
            .flatMap { it.properties }
            .forEach { registeredProperty ->
                if (!registeredProperty.isMutable) {
                    hasIssue = true
                    logger.error("Registered property is not mutable", registeredProperty)
                }
            }
        return hasIssue
    }
}
