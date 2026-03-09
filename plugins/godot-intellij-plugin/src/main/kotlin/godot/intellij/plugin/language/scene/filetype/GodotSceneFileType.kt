package godot.intellij.plugin.language.scene.filetype

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.IconLoader
import godot.intellij.plugin.language.scene.language.GodotSceneLanguage
import godot.tools.common.constants.FileExtensions
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

    @Suppress("CompanionObjectInExtension")
    companion object {
        val EXTENSION = FileExtensions.Godot.sceneFile

        @JvmStatic
        val INSTANCE = GodotSceneFileType()
    }
}
