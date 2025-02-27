package godot.entrygenerator.checks

import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.utils.Logger

class DefaultConstructorCheck(logger: Logger, registeredClasses: List<RegisteredClass>): BaseCheck(logger, registeredClasses) {
    override fun execute(): Boolean {
        var hasIssue = false
        registeredClasses
            .filter { !it.isAbstract }
            .forEach { registeredClass ->
                if (registeredClass.constructors.none { it.parameters.isEmpty() }) {
                    hasIssue = true
                    logger.error("RegisteredClass does not have a public default constructor", registeredClass)
                }
            }
        return hasIssue
    }
}
