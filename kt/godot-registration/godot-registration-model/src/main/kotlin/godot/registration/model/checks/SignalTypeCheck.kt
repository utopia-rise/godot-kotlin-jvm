package godot.registration.model.checks

import godot.core.Signal
import godot.registration.model.types.ScriptClass
import godot.registration.model.util.Logger

class SignalTypeCheck(logger: Logger, registeredClasses: List<ScriptClass>) : BaseCheck(logger, registeredClasses) {
    override fun execute(): Boolean {
        var hasIssue = false
        registeredClasses
            .flatMap { it.signals }
            .forEach { registeredSignal ->
                if (!registeredSignal.type.fqName.startsWith(Signal::class.qualifiedName!!)) {
                    hasIssue = true
                    logger.error(
                        "RegisteredSignal is not of type godot.signals.Signal! Resolved type: ${registeredSignal.type.fqName}",
                        registeredSignal
                    )
                } else {

                    val expectedTypeArgumentSize = registeredSignal
                        .type
                        .fqName
                        .substringAfterLast(".")
                        .removePrefix("Signal")
                        .toIntOrNull()

                    val actualTypeArguments = registeredSignal.type.genericArguments.size

                    val parameterNamesCount = registeredSignal.parameterNames

                    if (expectedTypeArgumentSize != null && expectedTypeArgumentSize != actualTypeArguments) {
                        logger.error(
                            "Signal type ${registeredSignal.type.fqName} expects $expectedTypeArgumentSize type arguments but $actualTypeArguments were provided.",
                            registeredSignal
                        )
                        hasIssue = true
                    }

                    if (parameterNamesCount.size != actualTypeArguments && registeredSignal.type.fqName == Signal::class.qualifiedName) {
                        logger.warn(
                            "You provided parameter names but specified type ${Signal::class.qualifiedName}. You should specify the signal type with the correct type parameter count explicitly otherwise each parameter type will be assumed to be of type Any (or Object in the case of Java). In this case you'll probably need ${Signal::class.qualifiedName}${parameterNamesCount.size}",
                            registeredSignal
                        )
                    }
                }
            }
        return hasIssue
    }
}
