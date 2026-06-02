package godot.registrar.generator

enum class RegisteredNameMode {
    SIMPLE_NAME,
    FQ_NAME,
    PROJECT_PREFIX,
}

enum class RegistrationFileIndentation(val indentString: String) {
    SPACE("    "),
    TAB("\t")
}

enum class RegistrationFileLayoutMode {
    FLAT,
    HIERARCHICAL,
}

/** Configuration consumed by the registrar generator when turning the registration model into output. */
data class Settings(
    val registeredNameMode: RegisteredNameMode,
    val projectName: String,
    val registrationFileLayoutMode: RegistrationFileLayoutMode,
    val registrationFileIndentation: RegistrationFileIndentation,
)
