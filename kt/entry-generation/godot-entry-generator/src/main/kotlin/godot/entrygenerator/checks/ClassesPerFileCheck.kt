package godot.entrygenerator.checks

import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger

class ClassesPerFileCheck(logger: Logger, sourceFiles: List<SourceFile>) : BaseCheck(logger, sourceFiles) {
    override fun execute() {
        sourceFiles.forEach { sourceFile ->
            if (sourceFile.registeredClasses.size > 1) {
                logger.error(
                    "SourceFile ${sourceFile.absolutePath} contains more than 1 registered class: ${sourceFile.registeredClasses.joinToString { it.fqName }}"
                )
            }
        }
    }
}
