package godot.registrar.generator.settings

/** Configuration consumed by the registrar generator when turning the registration model into output. */
data class Settings(
    val registeredNameMode: RegisteredNameMode,
    val projectName: String,
    val registrationFileLayoutMode: RegistrationFileLayoutMode,
    val registrationFileIndentation: RegistrationFileIndentation,
)
