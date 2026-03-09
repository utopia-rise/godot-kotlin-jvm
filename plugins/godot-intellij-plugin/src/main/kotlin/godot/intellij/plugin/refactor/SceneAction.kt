package godot.intellij.plugin.refactor

import com.intellij.openapi.module.Module
import com.intellij.openapi.vfs.readText
import com.intellij.openapi.vfs.writeText
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import godot.intellij.plugin.data.model.ResPath
import godot.intellij.plugin.language.scene.filetype.GodotSceneFileType

object SceneAction {

    /**
     * Replaces old script paths in scene files with new script paths where possible and moves the registration files accordingly
     */
    fun scriptMoved(module: Module, oldResPath: ResPath, newResPath: ResPath) {
        val oldResPathFile = oldResPath.asFile(module) ?: return
        val newResPathFile = oldResPath.asFile(module) ?: return

        if (oldResPathFile.exists()) {
            oldResPathFile.copyTo(newResPathFile, overwrite = true)
            oldResPathFile.delete()
        }

        FileTypeIndex
            .getFiles(GodotSceneFileType.INSTANCE, GlobalSearchScope.projectScope(module.project))
            .forEach { sceneFile ->
                // if this should become a memory problem on large scene files,
                // replace it with a buffered read/write line by line to a new file
                // and replace the old file with the new one when done writing
                val sceneContent = sceneFile.readText()

                if (sceneContent.contains(oldResPath.godotPath)) {
                    sceneFile.writeText(
                        sceneContent
                            .replace(oldResPath.godotPath, newResPath.godotPath)
                    )
                }
            }
    }
}
