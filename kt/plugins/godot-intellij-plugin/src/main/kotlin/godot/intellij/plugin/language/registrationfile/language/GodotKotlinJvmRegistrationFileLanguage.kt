package godot.intellij.plugin.language.registrationfile.language

import com.intellij.lang.Language

class GodotKotlinJvmRegistrationFileLanguage private constructor() : Language("godotKotlinJvmRegistrationFile") {
    override fun getDisplayName(): String = NAME
    override fun isCaseSensitive(): Boolean = true

    companion object {
        @JvmStatic
        val INSTANCE = GodotKotlinJvmRegistrationFileLanguage()

        const val NAME = "RegistrationFile"
    }
}
