package godot.annotation.processor.processing

import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.KSAnnotated
import godot.entrygenerator.exceptions.EntryGeneratorException

/**
 * Base class for processing round executors to extend
 */
internal abstract class BaseRound {
    protected abstract val blackboard: ProcessingRoundsBlackboard
    protected abstract val resolver: Resolver
    protected abstract val codeGenerator: CodeGenerator
    protected abstract val logger: KSPLogger

    fun execute(): List<KSAnnotated> {
        return if (blackboard.previousRoundHadErrors) {
            return emptyList()
        } else {
            try {
                executeInternal()
            } catch (e: EntryGeneratorException) {
                // we don't want any entry generation related tasks to execute if an exception in the entry gen is encountered
                blackboard.previousRoundHadErrors = true
                logger.error("Encountered some issues while trying to generate the entry files. Look into the log above to see what caused the failure")
                emptyList()
            }
        }
    }

    protected abstract fun executeInternal(): List<KSAnnotated>
}
