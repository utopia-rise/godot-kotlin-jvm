package godot.annotation.processor.processing

import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.KSAnnotated

/**
 * Base class for processing round executors to extend
 */
internal abstract class BaseRound {
    protected abstract val blackboard: ProcessingRoundsBlackboard
    protected abstract val resolver: Resolver
    protected abstract val codeGenerator: CodeGenerator
    protected abstract val logger: KSPLogger
    abstract fun execute(): List<KSAnnotated>
}
