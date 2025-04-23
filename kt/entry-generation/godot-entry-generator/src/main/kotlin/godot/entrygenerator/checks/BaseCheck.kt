package godot.entrygenerator.checks

import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.utils.Logger

abstract class BaseCheck(
    protected val logger: Logger,
    protected val registeredClasses: List<RegisteredClass>
) {
    abstract fun execute(): Boolean
}
