package godot.entrygenerator.checks

import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger

class ConstructorOverloadingCheck(logger: Logger, sourceFiles: List<SourceFile>) : BaseCheck(logger, sourceFiles) {
    override fun execute(): Boolean {
        var hasIssue = false
        sourceFiles
            .flatMap { it.registeredClasses }
            .forEach { registeredClass ->
                registeredClass
                    .constructors
                    .groupBy { it.parameters.size }
                    .filter { it.value.size > 1 }
                    .forEach { (argCount, overloadingConstructors) ->
                        hasIssue = true
                        logger.error("Constructor overloading on registered constructors is not yet supported! Overloading constructors in class ${registeredClass.fqName}: ${overloadingConstructors.joinToString { it.fqName }} with arg count: $argCount")
                    }
            }

        return hasIssue
    }
}
