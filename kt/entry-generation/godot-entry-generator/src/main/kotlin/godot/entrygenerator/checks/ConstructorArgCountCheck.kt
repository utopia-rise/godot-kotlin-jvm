package godot.entrygenerator.checks

import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger

class ConstructorArgCountCheck(logger: Logger, sourceFiles: List<SourceFile>): BaseCheck(logger, sourceFiles) {
    override fun execute() {
        sourceFiles
            .flatMap { it.registeredClasses }
            .flatMap { it.registeredConstructors }
            .forEach { registeredConstructor ->
                if (registeredConstructor.parameters.size > 5) {
                    logger.error("RegisteredConstructor ${registeredConstructor.fqName} has more than 5 arguments")
                }
            }
    }
}
