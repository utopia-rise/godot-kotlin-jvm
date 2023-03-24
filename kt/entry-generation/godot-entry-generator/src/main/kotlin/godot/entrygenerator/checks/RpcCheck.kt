package godot.entrygenerator.checks

import godot.entrygenerator.ext.getAnnotationUnsafe
import godot.entrygenerator.model.RpcAnnotation
import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.model.TransferMode
import godot.entrygenerator.utils.Logger

class RpcCheck(logger: Logger, sourceFiles: List<SourceFile>): BaseCheck(logger, sourceFiles) {
    override fun execute(): Boolean {
        sourceFiles
            .flatMap { it.registeredClasses }
            .flatMap { it.functions }
            .filter { it.annotations.any { annotation -> annotation is RpcAnnotation } }
            .forEach { registeredFunction ->
                val rpcAnnotation = registeredFunction.annotations.getAnnotationUnsafe<RpcAnnotation>()

                if (rpcAnnotation.transferMode != TransferMode.UNRELIABLE_ORDERED && rpcAnnotation.transferChannel != 0) {
                    logger.warn("You set \"transferChannel\" to something else than 0 (you set: ${rpcAnnotation.transferChannel}) while the \"transferMode\" is not set to ${TransferMode.UNRELIABLE_ORDERED.name}. \"transferChannel\" only has an effect with \"transferMode\" ${TransferMode.UNRELIABLE_ORDERED.name}! Found in function: ${registeredFunction.fqName}")
                }
            }

        return false // just provides warnings
    }
}
