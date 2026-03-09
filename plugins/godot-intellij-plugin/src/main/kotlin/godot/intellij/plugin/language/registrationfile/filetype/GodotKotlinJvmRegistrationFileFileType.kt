package godot.intellij.plugin.language.registrationfile.filetype

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.IconLoader
import godot.intellij.plugin.language.registrationfile.language.GodotKotlinJvmRegistrationFileLanguage
import godot.tools.common.constants.FileExtensions
import javax.swing.Icon

class GodotKotlinJvmRegistrationFileFileType private constructor() : LanguageFileType(GodotKotlinJvmRegistrationFileLanguage.INSTANCE) {
    private val myIcon: Icon by lazy {
        IconLoader.getIcon("/fileIcons/icon_script.svg", this::class.java)
    }

    override fun getName(): String {
        return "GodotKotlinJvmRegistrationFile"
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
        val EXTENSION = FileExtensions.GodotKotlinJvm.registrationFile

        @JvmStatic
        val INSTANCE = GodotKotlinJvmRegistrationFileFileType()
    }
}
