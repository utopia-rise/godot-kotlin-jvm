package godot.entrygenerator.checks

import godot.core.Signal
import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.godotCorePackage

class SignalTypeCheck(logger: Logger, sourceFiles: List<SourceFile>): BaseCheck(logger, sourceFiles) {
    override fun execute(): Boolean {
        var hasIssue = false
        sourceFiles
            .flatMap { it.registeredClasses }
            .flatMap { it.signals }
            .forEach { registeredSignal ->
                if (!registeredSignal.type.fqName.startsWith("$godotCorePackage.${GodotKotlinJvmTypes.signal}")) {
                    hasIssue = true
                    logger.error(registeredSignal, "RegisteredSignal is not of type godot.signals.Signal! Resolved type: ${registeredSignal.type.fqName}")
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
                        logger.error(registeredSignal, "Signal type ${registeredSignal.type.fqName} expects $expectedTypeArgumentSize type arguments but $actualTypeArguments were provided.")
                        hasIssue = true
                    }

                    if (parameterNamesCount.size != actualTypeArguments && registeredSignal.type.fqName == Signal::class.qualifiedName) {
                        logger.warn(registeredSignal, "You provided parameter names but specified type ${Signal::class.qualifiedName}. You should specify the signal type with the correct type parameter count explicitly otherwise each parameter type will be assumed to be of type Any (or Object in the case of Java). In this case you'll probably need ${Signal::class.qualifiedName}${parameterNamesCount.size}")
                    }
                }
            }
        return hasIssue
    }
}
