package godot.entrygenerator.checks

import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger

class DefaultConstructorCheck(logger: Logger, sourceFiles: List<SourceFile>): BaseCheck(logger, sourceFiles) {
    override fun execute(): Boolean {
        var hasIssue = false
        sourceFiles
            .flatMap { it.registeredClasses }
            .forEach { registeredClass ->
                if (registeredClass.constructors.none { it.parameters.isEmpty() }) {
                    hasIssue = true
                    logger.error("RegisteredClass ${registeredClass.fqName} does not have a public default constructor")
                }
            }
        return hasIssue
    }
}
