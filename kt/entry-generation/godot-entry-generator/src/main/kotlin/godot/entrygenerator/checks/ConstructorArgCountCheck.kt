package godot.entrygenerator.checks

import godot.common.constants.Constraints
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.utils.Logger

class ConstructorArgCountCheck(logger: Logger, registeredClasses: List<RegisteredClass>): BaseCheck(logger, registeredClasses) {
    override fun execute(): Boolean {
        var hasIssue = false
        registeredClasses
            .flatMap { it.constructors }
            .forEach { registeredConstructor ->
                // keep in sync with VARIANT_ARG_MAX in transfer_context.cpp!
                if (registeredConstructor.parameters.size > Constraints.MAX_CONSTRUCTOR_ARG_COUNT) {
                    hasIssue = true
                    logger.error(registeredConstructor, "RegisteredConstructor has more than ${Constraints.MAX_CONSTRUCTOR_ARG_COUNT} arguments")
                }
            }
        return hasIssue
    }
}
