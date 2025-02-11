package godot.entrygenerator.checks

import godot.common.constants.Constraints
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.utils.Logger

class FunctionArgCountCheck(logger: Logger, registeredClasses: List<RegisteredClass>): BaseCheck(logger, registeredClasses) {
    override fun execute(): Boolean {
        var hasIssues = false
        registeredClasses
            .flatMap { it.functions }
            .forEach { registeredFunction ->
                if (registeredFunction.parameters.size > Constraints.MAX_FUNCTION_ARG_COUNT) {
                    logger.error(registeredFunction, "RegisteredFunction ${registeredFunction.fqName} has more than ${Constraints.MAX_FUNCTION_ARG_COUNT} arguments. More than that is currently not supported. If you need more, either wrap them in a wrapper object or pass a VariantArray containing your values.")
                    hasIssues = true
                }
            }

        return hasIssues
    }
}
