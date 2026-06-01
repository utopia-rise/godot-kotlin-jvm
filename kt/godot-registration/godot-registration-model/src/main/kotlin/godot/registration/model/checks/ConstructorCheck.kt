package godot.registration.model.checks

import godot.registration.model.types.ScriptClass
import godot.registration.model.logging.Logger

/**
 * Warns when a registered, instantiable class has no public no-argument constructor, since Godot needs one
 * to create instances. The model only carries public constructors, so an empty-parameter constructor in the
 * list is necessarily the public no-arg one.
 *
 * Applies to registered, non-abstract classes (abstract registered classes are never instantiated directly).
 * Warning only — it never fails the build.
 */
class ConstructorCheck(logger: Logger, registeredClasses: List<ScriptClass>) : BaseCheck(logger, registeredClasses) {
    override fun execute(): Boolean {
        registeredClasses
            .filter { it.isRegistered && !it.isAbstract }
            .forEach { scriptClass ->
                if (scriptClass.constructors.none { it.parameterTypes.isEmpty() }) {
                    logger.warn(
                        "Registered class ${scriptClass.fqName} has no public no-argument constructor; Godot may be unable to instantiate it.",
                        scriptClass
                    )
                }
            }
        return false // warning only
    }
}
