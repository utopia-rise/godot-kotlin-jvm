package godot.intellij.plugin.refactor

import com.intellij.openapi.project.Project
import java.io.File

object SceneAction {

    /**
     * Replaces old script paths in scene files with new script paths where possible
     */
    fun scriptMoved(project: Project, oldPath: String, newPath: String, fqNames: List<String>) {
        val resPath = project.basePath ?: return
        val oldPathResBased = oldPath.removePrefix(resPath).removePrefix(File.separator).replace(File.separator, "/")
        val newPathResBased = newPath.removePrefix(resPath).removePrefix(File.separator).replace(File.separator, "/")

        File(resPath)
            .walkTopDown()
            .filter { it.isFile && it.exists() && it.extension == "tscn" }
            .forEach { sceneFile ->
                // if this should become a memory problem on large scene files,
                // replace it with a buffered read/write line by line to a new file
                // and replace the old file with the new one when done writing
                val sceneContent = sceneFile.readText()
                var newSceneContent = sceneContent
                fqNames.forEach { fqName ->
                    val className = fqName.substringAfterLast(".")
                    val oldResPath = "res://$oldPathResBased/$className.kt"
                    val newResPath = "res://$newPathResBased/$className.kt"

                    if (sceneContent.contains(oldResPath)) {
                        newSceneContent = sceneContent.replace(oldResPath, newResPath)
                    }
                }
                if (newSceneContent != sceneContent) {
                    sceneFile.writeText(newSceneContent)
                }
            }
    }
}
