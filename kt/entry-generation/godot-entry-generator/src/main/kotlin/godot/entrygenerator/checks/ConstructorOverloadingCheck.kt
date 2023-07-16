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
                    .forEach { (_, overloadingConstructors) ->
                        hasIssue = true
                        overloadingConstructors.forEach { registeredConstructor ->
                            logger.error(registeredConstructor, "Constructor overloading on registered constructors is not yet supported!")
                        }
                    }
            }

        return hasIssue
    }
}
