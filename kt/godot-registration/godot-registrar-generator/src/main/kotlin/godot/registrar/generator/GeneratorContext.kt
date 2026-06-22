package godot.registrar.generator

import godot.registration.model.logging.Logger
import godot.registration.model.types.ScriptClass

data class GeneratorContext(
    val settings: Settings,
    val logger: Logger,
    val registeredClassesByFqName: Map<String, ScriptClass>,
) {
    constructor(
        settings: Settings,
        logger: Logger,
        scriptClasses: List<ScriptClass>,
    ) : this(
        settings = settings,
        logger = logger,
        registeredClassesByFqName = scriptClasses
            .filter { scriptClass -> scriptClass.isRegistered }
            .associateBy { scriptClass -> scriptClass.fqName },
    )
}
