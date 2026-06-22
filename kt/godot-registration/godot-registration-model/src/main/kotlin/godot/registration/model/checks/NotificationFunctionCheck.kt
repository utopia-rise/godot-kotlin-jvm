package godot.registration.model.checks

import godot.registration.model.logging.Logger
import godot.registration.model.types.ScriptClass
import godot.registration.model.types.Type

class NotificationFunctionCheck(logger: Logger, registeredClasses: List<ScriptClass>) :
    BaseCheck(logger, registeredClasses) {
    override fun execute(): Boolean {
        var hasIssues = false

        registeredClasses
            .flatMap { scriptClass -> scriptClass.functions }
            .filter { function -> function.notification != null }
            .forEach { function ->
                if (function.parameters.isNotEmpty()) {
                    logger.error(
                        "Notification function ${function.fqName} must not declare parameters.",
                        function
                    )
                    hasIssues = true
                }

                if (function.returnType != Type.nilType) {
                    logger.error(
                        "Notification function ${function.fqName} must return Unit.",
                        function
                    )
                    hasIssues = true
                }

                if (function.rpcConfig != null) {
                    logger.error(
                        "Notification function ${function.fqName} cannot be an RPC function.",
                        function
                    )
                    hasIssues = true
                }
            }

        return hasIssues
    }
}
