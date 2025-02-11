package godot.entrygenerator.checks

import godot.entrygenerator.model.RegisterPropertyAnnotation
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.utils.Logger

class PropertyMutablilityCheck(logger: Logger, registeredClasses: List<RegisteredClass>): BaseCheck(logger, registeredClasses) {
    override fun execute(): Boolean {
        var hasIssue = false
        registeredClasses
            .flatMap { it.properties }
            .filter { registeredProperty -> registeredProperty.annotations.filterIsInstance<RegisterPropertyAnnotation>().isNotEmpty() }
            .forEach { registeredProperty ->
                if (!registeredProperty.isMutable) {
                    hasIssue = true
                    logger.error(registeredProperty, "Registered property is not mutable")
                }
            }
        return hasIssue
    }
}
