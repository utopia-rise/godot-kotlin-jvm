package godot.registration.model

import godot.registration.model.checks.*
import godot.registration.model.types.ScriptClass
import godot.registration.model.logging.Logger

/**
 * Runs every sanity check against the registration model.
 *
 * All checks are executed (so every issue is logged, not just the first), then the result is collapsed:
 * returns `true` when the model is sane and `false` when at least one check failed.
 */
object ModelCheck {
    fun check(
        registeredClasses: List<ScriptClass>,
        logger: Logger,
        registeredNameProvider: ((ScriptClass) -> String)? = null,
    ): Boolean {
        val hasIssue = listOf(
            ConstructorCheck(logger, registeredClasses).execute(),

            FunctionArgCountCheck(logger, registeredClasses).execute(),
            registeredNameProvider?.let { provider ->
                RegisteredNameUniquenessCheck(logger, registeredClasses, provider).execute()
            } ?: false,

            SignalTypeCheck(logger, registeredClasses).execute(),
            SourceClassCheck(logger, registeredClasses).execute(),

            PropertyTypeCheck(logger, registeredClasses).execute(),
            PropertyHintCheck(logger, registeredClasses).execute(),
            BitFieldEntryCountCheck(logger, registeredClasses).execute(),
            LateinitPropertyCheck(logger, registeredClasses).execute(),
            NullablePropertyCheck(logger, registeredClasses).execute(),

            RpcCheck(logger, registeredClasses).execute(),
        ).any { issueFound -> issueFound }

        return !hasIssue
    }
}
