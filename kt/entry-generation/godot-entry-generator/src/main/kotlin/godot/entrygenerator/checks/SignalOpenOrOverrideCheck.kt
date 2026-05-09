package godot.entrygenerator.checks

import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.utils.Logger

class SignalOpenOrOverrideCheck(logger: Logger, registeredClasses: List<RegisteredClass>) : BaseCheck(logger, registeredClasses) {
    override fun execute(): Boolean {
        var hasIssue = false
        registeredClasses.forEach { registeredClass ->
            registeredClass.signals
                .filter { it.fqName.startsWith(registeredClass.fqName + ".") }
                .forEach { signal ->
                    if (signal.isOpenOrAbstract) {
                        hasIssue = true
                        logger.error("Signals cannot be open or abstract", signal)
                    }
                    if (signal.isOverridee) {
                        hasIssue = true
                        logger.error("Signals cannot be overridden", signal)
                    }
                }
        }
        return hasIssue
    }
}
