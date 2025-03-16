package godot.codegen.models

import java.security.InvalidParameterException

enum class ApiType {
    CORE,
    EDITOR;

    companion object {
        fun from(string: String) = when (string) {
            "core" -> CORE
            "editor" -> EDITOR
            else -> throw InvalidParameterException("Cannot match $string to ApiType")
        }
    }
}
