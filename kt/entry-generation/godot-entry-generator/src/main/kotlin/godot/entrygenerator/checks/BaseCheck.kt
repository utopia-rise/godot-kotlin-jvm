package godot.entrygenerator.checks

import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger

abstract class BaseCheck(
    protected val logger: Logger,
    protected val sourceFiles: List<SourceFile>
) {
    abstract fun execute()
}
