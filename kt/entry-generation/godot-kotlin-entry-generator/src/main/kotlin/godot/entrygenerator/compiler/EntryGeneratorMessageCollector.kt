package godot.entrygenerator.compiler

import godot.entrygenerator.EntryGenerator
import org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity
import org.jetbrains.kotlin.cli.common.messages.CompilerMessageSourceLocation
import org.jetbrains.kotlin.cli.common.messages.MessageCollector
import java.util.logging.Logger

internal class EntryGeneratorMessageCollector : MessageCollector {
    private val logger = Logger.getLogger(EntryGenerator::class.java.name)
    private var hasErrors = false

    override fun clear() {
        hasErrors = false
    }

    override fun hasErrors(): Boolean {
        return hasErrors
    }

    override fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageSourceLocation?) {
        val text = if (location != null) {
            "${location.path}: (${location.line}, ${location.column}) $message"
        } else {
            message
        }

        when {
            CompilerMessageSeverity.VERBOSE.contains(severity) -> {
                logger.finest(text)
            }
            severity == CompilerMessageSeverity.ERROR -> {
                logger.severe(text)
                hasErrors = true
            }
            severity == CompilerMessageSeverity.INFO -> {
                logger.info(text)
            }
            else -> {
                logger.warning(text)
            }
        }
    }
}
