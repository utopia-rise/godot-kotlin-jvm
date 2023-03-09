package godot.entrygenerator.checks

import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger
import godot.signals.Signal
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.signalPackage

class SignalTypeCheck(logger: Logger, sourceFiles: List<SourceFile>): BaseCheck(logger, sourceFiles) {
    override fun execute(): Boolean {
        var hasIssue = false
        sourceFiles
            .flatMap { it.registeredClasses }
            .flatMap { it.signals }
            .forEach { registeredSignal ->
                if (!registeredSignal.type.fqName.startsWith("$signalPackage.${GodotKotlinJvmTypes.signal}")) {
                    hasIssue = true
                    logger.error("RegisteredSignal is not of type godot.signals.Signal! Resolved type: ${registeredSignal.type.fqName}")
                } else {

                    val expectedTypeArgumentSize = registeredSignal
                        .type
                        .fqName
                        .substringAfterLast(".")
                        .removePrefix("Signal")
                        .toIntOrNull()

                    val actualTypeArguments = registeredSignal.type.arguments().size

                    val parameterNamesCount = registeredSignal.parameterNames

                    if (expectedTypeArgumentSize != null && expectedTypeArgumentSize != actualTypeArguments) {
                        logger.error("Signal type ${registeredSignal.type.fqName} expects $expectedTypeArgumentSize type arguments but $actualTypeArguments were provided. Fix the type argument count for signal ${registeredSignal.fqName}")
                        hasIssue = true
                    }

                    if (parameterNamesCount.size != actualTypeArguments && registeredSignal.type.fqName == Signal::class.qualifiedName) {
                        logger.warn("You provided parameter names but specified type ${Signal::class.qualifiedName} for signal ${registeredSignal.fqName}. You should specify the signal type with the correct type parameter count explicitly otherwise each parameter type will be assumed to be of type Any (or Object in the case of Java). In this case you'll probably need ${Signal::class.qualifiedName}${parameterNamesCount.size}")
                    }
                }
            }
        return hasIssue
    }
}
