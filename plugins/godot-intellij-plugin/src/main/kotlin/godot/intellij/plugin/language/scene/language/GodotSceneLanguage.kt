package godot.intellij.plugin.language.scene.language

import com.intellij.lang.Language

class GodotSceneLanguage private constructor() : Language("godotScene") {
    override fun getDisplayName(): String = NAME
    override fun isCaseSensitive(): Boolean = true

    companion object {
        @JvmStatic
        val INSTANCE = GodotSceneLanguage()
        const val NAME = "Scene"
    }
}
