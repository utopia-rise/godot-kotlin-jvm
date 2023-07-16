package godot.entrygenerator.checks

import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger

class FunctionArgCountCheck(logger: Logger, sourceFiles: List<SourceFile>): BaseCheck(logger, sourceFiles) {
    override fun execute(): Boolean {
        var hasIssues = false
        sourceFiles
            .flatMap { it.registeredClasses }
            .flatMap { it.functions }
            .forEach { registeredFunction ->
                if (registeredFunction.parameters.size > 5) {
                    logger.error(registeredFunction, "RegisteredFunction ${registeredFunction.fqName} has more than 5 arguments. More than that is currently not supported. If you need more, either wrap them in a wrapper object or pass a VariantArray containing your values.")
                    hasIssues = true
                }
            }

        return hasIssues
    }
}
