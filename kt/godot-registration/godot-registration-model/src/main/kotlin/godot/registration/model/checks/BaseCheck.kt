package godot.registration.model.checks

import godot.registration.model.types.ScriptClass
import godot.registration.model.util.Logger

abstract class BaseCheck(
    protected val logger: Logger,
    protected val registeredClasses: List<ScriptClass>
) {
    abstract fun execute(): Boolean
}
