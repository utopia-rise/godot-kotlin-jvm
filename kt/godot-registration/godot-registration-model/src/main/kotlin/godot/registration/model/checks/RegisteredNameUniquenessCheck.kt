package godot.registration.model.checks

import godot.registration.model.types.ScriptClass
import godot.registration.model.util.Logger

class RegisteredNameUniquenessCheck(
    logger: Logger,
    registeredClasses: List<ScriptClass>,
    private val registeredNameProvider: (ScriptClass) -> String,
) : BaseCheck(logger, registeredClasses) {
    override fun execute(): Boolean {
        val duplicatesByName = registeredClasses
            .groupBy(registeredNameProvider)
            .filterValues { classes -> classes.size > 1 }

        duplicatesByName.forEach { (registeredName, classes) ->
            logger.error(
                "Multiple registered classes resolve to registered name '$registeredName': " +
                    classes.joinToString { registeredClass -> registeredClass.fqName },
            )
        }

        return duplicatesByName.isNotEmpty()
    }
}
