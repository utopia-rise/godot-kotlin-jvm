package godot.entrygenerator.checks

import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger

class ConstructorOverloadingCheck(logger: Logger, sourceFiles: List<SourceFile>) : BaseCheck(logger, sourceFiles) {
    override fun execute() {
        sourceFiles
            .flatMap { it.registeredClasses }
            .forEach { registeredClass ->
                registeredClass
                    .constructors
                    .groupBy { it.parameters.size }
                    .filter { it.value.size > 1 }
                    .forEach { (argCount, overloadingConstructors) ->
                        logger.error("Constructor overloading is not yet supported! Overloading constructors in class ${registeredClass.fqName}: ${overloadingConstructors.joinToString { it.fqName }} with arg count: $argCount")
                    }
            }
    }
}
