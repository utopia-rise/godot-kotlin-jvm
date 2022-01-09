package godot.intellij.plugin.language.scene.filetype

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.IconLoader
import godot.intellij.plugin.language.scene.language.GodotSceneLanguage
import javax.swing.Icon

class GodotSceneFileType private constructor() : LanguageFileType(GodotSceneLanguage.INSTANCE) {
    private val myIcon: Icon by lazy {
        IconLoader.getIcon("/fileIcons/icon_packed_scene.svg", this::class.java)
    }

    override fun getName(): String {
        return "GodotSceneFile"
    }

    override fun getDescription(): String = name

    override fun getDefaultExtension(): String {
        return EXTENSION
    }

    override fun getIcon(): Icon {
        return myIcon
    }

    companion object {
        const val EXTENSION = "tscn"
        @JvmStatic
        val INSTANCE = GodotSceneFileType()
    }
}
