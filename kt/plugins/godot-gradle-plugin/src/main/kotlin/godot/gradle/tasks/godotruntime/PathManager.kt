package godot.gradle.tasks.godotruntime

import godot.gradle.GodotExtension
import org.gradle.api.Project
import java.util.*

/**
 * Singleton to make it easy to calculate the different paths used by the runtime.Could be a collection of functions, but being an object wraps these up nicely.
 * The tasks use different paths for each platform to make it possible to download binaries from other platforms.
 * No file paths or urls should be created anywhere else, to remain consistent!
 * */
object PathManager {

    fun getDownloadPathForOS(os: OS, project:Project): String {
        return project.buildDir.absolutePath+"/godot/tmp/godot_editor_${os.name.lowercase(Locale.getDefault())}.zip"
    }

    fun getTargetOS(project: Project): OS {
        val godotExtension = project.extensions.getByName("godot") as GodotExtension
        return godotExtension.os.get()
    }

    fun getEditorFilePath(project:Project): String {
        return getEditorFilePath(project, getTargetOS(project))
    }

    fun getEditorFilePath(project:Project,os: OS): String {
        return project.buildDir.absolutePath+"/godot/${os.name.lowercase()}/godot_editor/"
    }

    fun getEditorExecutablePath(project:Project): String {
        val os = getTargetOS(project)
        return getEditorFilePath(project, getTargetOS(project))+os.editorBinaryName
    }

    fun getVersionUrl(godotExtension:GodotExtension): String {
        return godotExtension.godotKotlinJVMDownloadBaseURL.get() + "/" + godotExtension.godotKotlinJVMVersion.get() + "/"
    }

    fun getEditorURL(godotExtension:GodotExtension): String {
        val os = godotExtension.os
        return getVersionUrl(godotExtension)+"/"+os.get().editorDownloadName
    }
}
