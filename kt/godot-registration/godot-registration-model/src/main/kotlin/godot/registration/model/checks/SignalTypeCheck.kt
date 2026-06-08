package godot.registration.model.checks

import godot.core.Signal
import godot.registration.model.logging.Logger
import godot.registration.model.types.ScriptClass

class SignalTypeCheck(logger: Logger, registeredClasses: List<ScriptClass>) : BaseCheck(logger, registeredClasses) {
    override fun execute(): Boolean {
        var hasIssue = false
        registeredClasses
            .flatMap { scriptClass -> scriptClass.signals }
            .forEach { registeredSignal ->
                if (!registeredSignal.type.fqName.startsWith(Signal::class.qualifiedName!!)) {
                    hasIssue = true
                    logger.error(
                        "RegisteredSignal is not of type godot.signals.Signal! Resolved type: ${registeredSignal.type.fqName}",
                        registeredSignal
                    )
                }
            }
        return hasIssue
    }
}
