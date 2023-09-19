package godot.entrygenerator.checks

import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger
import godot.tools.common.constants.Constraints

class ConstructorArgCountCheck(logger: Logger, sourceFiles: List<SourceFile>): BaseCheck(logger, sourceFiles) {
    override fun execute(): Boolean {
        var hasIssue = false
        sourceFiles
            .flatMap { it.registeredClasses }
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
